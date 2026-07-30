package androidx.compose.foundation.text;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.InputTransformationKt;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BasicSecureTextField.kt */
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÊ\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u001328\b\u0002\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\u0016\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015¢\u0006\u0002\b\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a \u0010(\u001a\u00020\u00052\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b*H\u0003¢\u0006\u0002\u0010+\u001a\u001a\u0010,\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\r2\b\u0010-\u001a\u0004\u0018\u00010\rH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"DefaultObfuscationCharacter", "", "LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS", "", "BasicSecureTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "decorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "textObfuscationMode", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", "textObfuscationCharacter", "BasicSecureTextField-Jb9bMDk", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/TextFieldDecorator;ICLandroidx/compose/runtime/Composer;III)V", "DisableCutCopy", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "then", "next", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicSecureTextFieldKt {
    private static final char DefaultObfuscationCharacter = 8226;
    private static final long LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS = 1500;

    /* JADX WARN: Code restructure failed: missing block: B:94:0x02a7, code lost:
    
        if (r0 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L198;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e6  */
    /* renamed from: BasicSecureTextField-Jb9bMDk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m960BasicSecureTextFieldJb9bMDk(final TextFieldState textFieldState, Modifier modifier, boolean z, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i, char c, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        boolean z2;
        int i7;
        InputTransformation inputTransformation2;
        int i8;
        TextStyle textStyle2;
        int i9;
        KeyboardOptions keyboardOptions2;
        int i10;
        KeyboardActionHandler keyboardActionHandler2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Composer composer2;
        final Brush brush2;
        int m1121getRevealLastTypedvTwcZD0;
        Object rememberedValue;
        int i23;
        boolean changedInstance;
        char c2;
        final boolean m1116equalsimpl0;
        boolean changed;
        final boolean z3;
        boolean z4;
        Object rememberedValue2;
        CodepointTransformation codepointTransformation;
        Modifier.Companion companion;
        final int i24;
        Composer composer3;
        final boolean z5;
        final InputTransformation inputTransformation3;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActionHandler keyboardActionHandler3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        final MutableInteractionSource mutableInteractionSource2;
        final Brush brush3;
        final TextFieldDecorator textFieldDecorator2;
        final char c3;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1399310985);
        ComposerKt.sourceInformation(startRestartGroup, "C(BasicSecureTextField)P(9,6,2,3,12,5,7,8,4!2,11:c#foundation.text.input.TextObfuscationMode)131@7694L46,132@7777L60,133@7884L130,133@7842L172,144@8392L129,144@8353L168,150@8557L384,176@9335L825,176@9320L840:BasicSecureTextField.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i25 = i4 & 2;
        if (i25 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                z2 = z;
                i5 |= startRestartGroup.changed(z2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    inputTransformation2 = inputTransformation;
                    i5 |= startRestartGroup.changed(inputTransformation2) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        textStyle2 = textStyle;
                        i5 |= startRestartGroup.changed(textStyle2) ? 16384 : 8192;
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i5 |= startRestartGroup.changed(keyboardOptions2) ? 131072 : 65536;
                            }
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                            keyboardActionHandler2 = keyboardActionHandler;
                        } else {
                            keyboardActionHandler2 = keyboardActionHandler;
                            if ((i2 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(keyboardActionHandler2) ? 1048576 : 524288;
                            }
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i12 = i11;
                            i5 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                            i13 = i4 & 256;
                            if (i13 == 0) {
                                i5 |= 100663296;
                            } else if ((i2 & 100663296) == 0) {
                                i14 = i13;
                                i5 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                i15 = i4 & 512;
                                if (i15 != 0) {
                                    i5 |= 805306368;
                                } else if ((i2 & 805306368) == 0) {
                                    i16 = i15;
                                    i5 |= startRestartGroup.changed(brush) ? 536870912 : 268435456;
                                    i17 = i4 & 1024;
                                    if (i17 == 0) {
                                        i18 = i3 | 6;
                                    } else if ((i3 & 6) == 0) {
                                        i18 = i3 | ((i3 & 8) == 0 ? startRestartGroup.changed(textFieldDecorator) : startRestartGroup.changedInstance(textFieldDecorator) ? 4 : 2);
                                    } else {
                                        i18 = i3;
                                    }
                                    i19 = i4 & 2048;
                                    if (i19 == 0) {
                                        i18 |= 48;
                                        i20 = i19;
                                    } else if ((i3 & 48) == 0) {
                                        i20 = i19;
                                        i18 |= startRestartGroup.changed(i) ? 32 : 16;
                                    } else {
                                        i20 = i19;
                                    }
                                    int i26 = i18;
                                    i21 = i4 & 4096;
                                    if (i21 == 0) {
                                        i22 = i26 | 384;
                                    } else if ((i3 & 384) == 0) {
                                        i22 = i26 | (startRestartGroup.changed(c) ? 256 : 128);
                                    } else {
                                        i22 = i26;
                                    }
                                    if ((i5 & 306783379) == 306783378 || (i22 & 147) != 146 || !startRestartGroup.getSkipping()) {
                                        Modifier.Companion companion2 = i25 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (i6 != 0) {
                                            z2 = true;
                                        }
                                        if (i7 != 0) {
                                            inputTransformation2 = null;
                                        }
                                        if (i8 != 0) {
                                            textStyle2 = TextStyle.INSTANCE.getDefault();
                                        }
                                        KeyboardOptions secureTextField$foundation_release = i9 == 0 ? KeyboardOptions.INSTANCE.getSecureTextField$foundation_release() : keyboardOptions2;
                                        if (i10 != 0) {
                                            keyboardActionHandler2 = null;
                                        }
                                        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23 = i12 == 0 ? null : function2;
                                        final MutableInteractionSource mutableInteractionSource3 = i14 == 0 ? null : mutableInteractionSource;
                                        if (i16 == 0) {
                                            composer2 = startRestartGroup;
                                            brush2 = new SolidColor(Color.INSTANCE.m3849getBlack0d7_KjU(), null);
                                        } else {
                                            composer2 = startRestartGroup;
                                            brush2 = brush;
                                        }
                                        final TextFieldDecorator textFieldDecorator3 = i17 == 0 ? null : textFieldDecorator;
                                        m1121getRevealLastTypedvTwcZD0 = i20 == 0 ? TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0() : i;
                                        char c4 = i21 == 0 ? (char) 8226 : c;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1399310985, i5, i22, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:130)");
                                        }
                                        Composer composer4 = composer2;
                                        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c4), composer4, (i22 >> 6) & 14);
                                        ComposerKt.sourceInformationMarkerStart(composer4, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                        rememberedValue = composer4.rememberedValue();
                                        i23 = i22;
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = new SecureTextFieldController(rememberUpdatedState);
                                            composer4.updateRememberedValue(rememberedValue);
                                        }
                                        final SecureTextFieldController secureTextFieldController = (SecureTextFieldController) rememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerStart(composer4, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                        changedInstance = composer4.changedInstance(secureTextFieldController);
                                        BasicSecureTextFieldKt$BasicSecureTextField$1$1 rememberedValue3 = composer4.rememberedValue();
                                        if (changedInstance) {
                                            c2 = c4;
                                        } else {
                                            c2 = c4;
                                        }
                                        rememberedValue3 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController, null);
                                        composer4.updateRememberedValue(rememberedValue3);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        EffectsKt.LaunchedEffect(secureTextFieldController, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, composer4, 0);
                                        m1116equalsimpl0 = TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0());
                                        Boolean valueOf = Boolean.valueOf(m1116equalsimpl0);
                                        ComposerKt.sourceInformationMarkerStart(composer4, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                        changed = composer4.changed(m1116equalsimpl0) | composer4.changedInstance(secureTextFieldController);
                                        BasicSecureTextFieldKt$BasicSecureTextField$2$1 rememberedValue4 = composer4.rememberedValue();
                                        if (changed) {
                                            z3 = z2;
                                            if (rememberedValue4 != Composer.INSTANCE.getEmpty()) {
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer4, 0);
                                                ComposerKt.sourceInformationMarkerStart(composer4, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                                z4 = (i23 & 112) == 32;
                                                rememberedValue2 = composer4.rememberedValue();
                                                if (!z4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    if (TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0())) {
                                                        codepointTransformation = secureTextFieldController.getCodepointTransformation();
                                                    } else {
                                                        codepointTransformation = TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1120getHiddenvTwcZD0()) ? new CodepointTransformation() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$$ExternalSyntheticLambda0
                                                            @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
                                                            public final int transform(int i27, int i28) {
                                                                int charValue;
                                                                charValue = ((Character) State.this.getValue()).charValue();
                                                                return charValue;
                                                            }
                                                        } : null;
                                                    }
                                                    composer4.updateRememberedValue(codepointTransformation);
                                                    rememberedValue2 = codepointTransformation;
                                                }
                                                final CodepointTransformation codepointTransformation2 = (CodepointTransformation) rememberedValue2;
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                Modifier semantics = SemanticsModifierKt.semantics(companion2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        invoke2(semanticsPropertyReceiver);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                return false;
                                                            }
                                                        }, 1, null);
                                                        SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                return false;
                                                            }
                                                        }, 1, null);
                                                    }
                                                });
                                                if (m1116equalsimpl0) {
                                                    companion = secureTextFieldController.getFocusChangeModifier();
                                                } else {
                                                    companion = Modifier.INSTANCE;
                                                }
                                                final Modifier then = semantics.then(companion);
                                                final InputTransformation inputTransformation4 = inputTransformation2;
                                                final TextStyle textStyle4 = textStyle2;
                                                final KeyboardActionHandler keyboardActionHandler4 = keyboardActionHandler2;
                                                final KeyboardOptions keyboardOptions4 = secureTextField$foundation_release;
                                                DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i27) {
                                                        ComposerKt.sourceInformation(composer5, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                                                        if ((i27 & 3) != 2 || !composer5.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(2023988909, i27, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                                                            }
                                                            TextFieldState textFieldState2 = TextFieldState.this;
                                                            Modifier modifier4 = then;
                                                            boolean z6 = z3;
                                                            boolean z7 = m1116equalsimpl0;
                                                            InputTransformation inputTransformation5 = inputTransformation4;
                                                            if (z7) {
                                                                inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation5, secureTextFieldController.getPasswordInputTransformation());
                                                            }
                                                            BasicTextFieldKt.BasicTextField(textFieldState2, modifier4, z6, false, inputTransformation5, textStyle4, keyboardOptions4, keyboardActionHandler4, TextFieldLineLimits.SingleLine.INSTANCE, function23, mutableInteractionSource3, brush2, codepointTransformation2, null, textFieldDecorator3, null, true, composer5, 100666368, 1572864, 40960);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer5.skipToGroupEnd();
                                                    }
                                                }, composer4, 54), composer4, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                i24 = m1121getRevealLastTypedvTwcZD0;
                                                composer3 = composer4;
                                                z5 = z3;
                                                inputTransformation3 = inputTransformation4;
                                                textStyle3 = textStyle4;
                                                keyboardOptions3 = keyboardOptions4;
                                                keyboardActionHandler3 = keyboardActionHandler4;
                                                function22 = function23;
                                                mutableInteractionSource2 = mutableInteractionSource3;
                                                brush3 = brush2;
                                                textFieldDecorator2 = textFieldDecorator3;
                                                c3 = c2;
                                                modifier3 = companion2;
                                            }
                                        } else {
                                            z3 = z2;
                                        }
                                        rememberedValue4 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(m1116equalsimpl0, secureTextFieldController, null);
                                        composer4.updateRememberedValue(rememberedValue4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer4, 0);
                                        ComposerKt.sourceInformationMarkerStart(composer4, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                        if ((i23 & 112) == 32) {
                                        }
                                        rememberedValue2 = composer4.rememberedValue();
                                        if (!z4) {
                                        }
                                        if (TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0())) {
                                        }
                                        composer4.updateRememberedValue(codepointTransformation);
                                        rememberedValue2 = codepointTransformation;
                                        final CodepointTransformation codepointTransformation22 = (CodepointTransformation) rememberedValue2;
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        Modifier semantics2 = SemanticsModifierKt.semantics(companion2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                                SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        return false;
                                                    }
                                                }, 1, null);
                                                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Boolean invoke() {
                                                        return false;
                                                    }
                                                }, 1, null);
                                            }
                                        });
                                        if (m1116equalsimpl0) {
                                        }
                                        final Modifier then2 = semantics2.then(companion);
                                        final InputTransformation inputTransformation42 = inputTransformation2;
                                        final TextStyle textStyle42 = textStyle2;
                                        final KeyboardActionHandler keyboardActionHandler42 = keyboardActionHandler2;
                                        final KeyboardOptions keyboardOptions42 = secureTextField$foundation_release;
                                        DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i27) {
                                                ComposerKt.sourceInformation(composer5, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                                                if ((i27 & 3) != 2 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(2023988909, i27, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                                                    }
                                                    TextFieldState textFieldState2 = TextFieldState.this;
                                                    Modifier modifier4 = then2;
                                                    boolean z6 = z3;
                                                    boolean z7 = m1116equalsimpl0;
                                                    InputTransformation inputTransformation5 = inputTransformation42;
                                                    if (z7) {
                                                        inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation5, secureTextFieldController.getPasswordInputTransformation());
                                                    }
                                                    BasicTextFieldKt.BasicTextField(textFieldState2, modifier4, z6, false, inputTransformation5, textStyle42, keyboardOptions42, keyboardActionHandler42, TextFieldLineLimits.SingleLine.INSTANCE, function23, mutableInteractionSource3, brush2, codepointTransformation22, null, textFieldDecorator3, null, true, composer5, 100666368, 1572864, 40960);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }, composer4, 54), composer4, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        i24 = m1121getRevealLastTypedvTwcZD0;
                                        composer3 = composer4;
                                        z5 = z3;
                                        inputTransformation3 = inputTransformation42;
                                        textStyle3 = textStyle42;
                                        keyboardOptions3 = keyboardOptions42;
                                        keyboardActionHandler3 = keyboardActionHandler42;
                                        function22 = function23;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        brush3 = brush2;
                                        textFieldDecorator2 = textFieldDecorator3;
                                        c3 = c2;
                                        modifier3 = companion2;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        function22 = function2;
                                        i24 = i;
                                        composer3 = startRestartGroup;
                                        z5 = z2;
                                        inputTransformation3 = inputTransformation2;
                                        textStyle3 = textStyle2;
                                        keyboardActionHandler3 = keyboardActionHandler2;
                                        modifier3 = modifier2;
                                        keyboardOptions3 = keyboardOptions2;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        brush3 = brush;
                                        textFieldDecorator2 = textFieldDecorator;
                                        c3 = c;
                                    }
                                    endRestartGroup = composer3.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i27) {
                                                BasicSecureTextFieldKt.m960BasicSecureTextFieldJb9bMDk(TextFieldState.this, modifier3, z5, inputTransformation3, textStyle3, keyboardOptions3, keyboardActionHandler3, function22, mutableInteractionSource2, brush3, textFieldDecorator2, i24, c3, composer5, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i16 = i15;
                                i17 = i4 & 1024;
                                if (i17 == 0) {
                                }
                                i19 = i4 & 2048;
                                if (i19 == 0) {
                                }
                                int i262 = i18;
                                i21 = i4 & 4096;
                                if (i21 == 0) {
                                }
                                if ((i5 & 306783379) == 306783378) {
                                }
                                if (i25 == 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 != 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if (i21 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Composer composer42 = composer2;
                                final State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c4), composer42, (i22 >> 6) & 14);
                                ComposerKt.sourceInformationMarkerStart(composer42, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                rememberedValue = composer42.rememberedValue();
                                i23 = i22;
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                final SecureTextFieldController secureTextFieldController2 = (SecureTextFieldController) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(composer42);
                                ComposerKt.sourceInformationMarkerStart(composer42, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                changedInstance = composer42.changedInstance(secureTextFieldController2);
                                BasicSecureTextFieldKt$BasicSecureTextField$1$1 rememberedValue32 = composer42.rememberedValue();
                                if (changedInstance) {
                                }
                                rememberedValue32 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController2, null);
                                composer42.updateRememberedValue(rememberedValue32);
                                ComposerKt.sourceInformationMarkerEnd(composer42);
                                EffectsKt.LaunchedEffect(secureTextFieldController2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue32, composer42, 0);
                                m1116equalsimpl0 = TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0());
                                Boolean valueOf2 = Boolean.valueOf(m1116equalsimpl0);
                                ComposerKt.sourceInformationMarkerStart(composer42, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                changed = composer42.changed(m1116equalsimpl0) | composer42.changedInstance(secureTextFieldController2);
                                BasicSecureTextFieldKt$BasicSecureTextField$2$1 rememberedValue42 = composer42.rememberedValue();
                                if (changed) {
                                }
                                rememberedValue42 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(m1116equalsimpl0, secureTextFieldController2, null);
                                composer42.updateRememberedValue(rememberedValue42);
                                ComposerKt.sourceInformationMarkerEnd(composer42);
                                EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue42, composer42, 0);
                                ComposerKt.sourceInformationMarkerStart(composer42, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                if ((i23 & 112) == 32) {
                                }
                                rememberedValue2 = composer42.rememberedValue();
                                if (!z4) {
                                }
                                if (TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0())) {
                                }
                                composer42.updateRememberedValue(codepointTransformation);
                                rememberedValue2 = codepointTransformation;
                                final CodepointTransformation codepointTransformation222 = (CodepointTransformation) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(composer42);
                                Modifier semantics22 = SemanticsModifierKt.semantics(companion2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                return false;
                                            }
                                        }, 1, null);
                                        SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                return false;
                                            }
                                        }, 1, null);
                                    }
                                });
                                if (m1116equalsimpl0) {
                                }
                                final Modifier then22 = semantics22.then(companion);
                                final InputTransformation inputTransformation422 = inputTransformation2;
                                final TextStyle textStyle422 = textStyle2;
                                final KeyboardActionHandler keyboardActionHandler422 = keyboardActionHandler2;
                                final KeyboardOptions keyboardOptions422 = secureTextField$foundation_release;
                                DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i27) {
                                        ComposerKt.sourceInformation(composer5, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                                        if ((i27 & 3) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2023988909, i27, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                                            }
                                            TextFieldState textFieldState2 = TextFieldState.this;
                                            Modifier modifier4 = then22;
                                            boolean z6 = z3;
                                            boolean z7 = m1116equalsimpl0;
                                            InputTransformation inputTransformation5 = inputTransformation422;
                                            if (z7) {
                                                inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation5, secureTextFieldController2.getPasswordInputTransformation());
                                            }
                                            BasicTextFieldKt.BasicTextField(textFieldState2, modifier4, z6, false, inputTransformation5, textStyle422, keyboardOptions422, keyboardActionHandler422, TextFieldLineLimits.SingleLine.INSTANCE, function23, mutableInteractionSource3, brush2, codepointTransformation222, null, textFieldDecorator3, null, true, composer5, 100666368, 1572864, 40960);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }, composer42, 54), composer42, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                i24 = m1121getRevealLastTypedvTwcZD0;
                                composer3 = composer42;
                                z5 = z3;
                                inputTransformation3 = inputTransformation422;
                                textStyle3 = textStyle422;
                                keyboardOptions3 = keyboardOptions422;
                                keyboardActionHandler3 = keyboardActionHandler422;
                                function22 = function23;
                                mutableInteractionSource2 = mutableInteractionSource3;
                                brush3 = brush2;
                                textFieldDecorator2 = textFieldDecorator3;
                                c3 = c2;
                                modifier3 = companion2;
                                endRestartGroup = composer3.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i14 = i13;
                            i15 = i4 & 512;
                            if (i15 != 0) {
                            }
                            i16 = i15;
                            i17 = i4 & 1024;
                            if (i17 == 0) {
                            }
                            i19 = i4 & 2048;
                            if (i19 == 0) {
                            }
                            int i2622 = i18;
                            i21 = i4 & 4096;
                            if (i21 == 0) {
                            }
                            if ((i5 & 306783379) == 306783378) {
                            }
                            if (i25 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Composer composer422 = composer2;
                            final State rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c4), composer422, (i22 >> 6) & 14);
                            ComposerKt.sourceInformationMarkerStart(composer422, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
                            rememberedValue = composer422.rememberedValue();
                            i23 = i22;
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            final SecureTextFieldController secureTextFieldController22 = (SecureTextFieldController) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composer422);
                            ComposerKt.sourceInformationMarkerStart(composer422, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
                            changedInstance = composer422.changedInstance(secureTextFieldController22);
                            BasicSecureTextFieldKt$BasicSecureTextField$1$1 rememberedValue322 = composer422.rememberedValue();
                            if (changedInstance) {
                            }
                            rememberedValue322 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController22, null);
                            composer422.updateRememberedValue(rememberedValue322);
                            ComposerKt.sourceInformationMarkerEnd(composer422);
                            EffectsKt.LaunchedEffect(secureTextFieldController22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue322, composer422, 0);
                            m1116equalsimpl0 = TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0());
                            Boolean valueOf22 = Boolean.valueOf(m1116equalsimpl0);
                            ComposerKt.sourceInformationMarkerStart(composer422, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
                            changed = composer422.changed(m1116equalsimpl0) | composer422.changedInstance(secureTextFieldController22);
                            BasicSecureTextFieldKt$BasicSecureTextField$2$1 rememberedValue422 = composer422.rememberedValue();
                            if (changed) {
                            }
                            rememberedValue422 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(m1116equalsimpl0, secureTextFieldController22, null);
                            composer422.updateRememberedValue(rememberedValue422);
                            ComposerKt.sourceInformationMarkerEnd(composer422);
                            EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue422, composer422, 0);
                            ComposerKt.sourceInformationMarkerStart(composer422, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                            if ((i23 & 112) == 32) {
                            }
                            rememberedValue2 = composer422.rememberedValue();
                            if (!z4) {
                            }
                            if (TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0())) {
                            }
                            composer422.updateRememberedValue(codepointTransformation);
                            rememberedValue2 = codepointTransformation;
                            final CodepointTransformation codepointTransformation2222 = (CodepointTransformation) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(composer422);
                            Modifier semantics222 = SemanticsModifierKt.semantics(companion2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                    SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            return false;
                                        }
                                    }, 1, null);
                                    SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            return false;
                                        }
                                    }, 1, null);
                                }
                            });
                            if (m1116equalsimpl0) {
                            }
                            final Modifier then222 = semantics222.then(companion);
                            final InputTransformation inputTransformation4222 = inputTransformation2;
                            final TextStyle textStyle4222 = textStyle2;
                            final KeyboardActionHandler keyboardActionHandler4222 = keyboardActionHandler2;
                            final KeyboardOptions keyboardOptions4222 = secureTextField$foundation_release;
                            DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i27) {
                                    ComposerKt.sourceInformation(composer5, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                                    if ((i27 & 3) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2023988909, i27, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                                        }
                                        TextFieldState textFieldState2 = TextFieldState.this;
                                        Modifier modifier4 = then222;
                                        boolean z6 = z3;
                                        boolean z7 = m1116equalsimpl0;
                                        InputTransformation inputTransformation5 = inputTransformation4222;
                                        if (z7) {
                                            inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation5, secureTextFieldController22.getPasswordInputTransformation());
                                        }
                                        BasicTextFieldKt.BasicTextField(textFieldState2, modifier4, z6, false, inputTransformation5, textStyle4222, keyboardOptions4222, keyboardActionHandler4222, TextFieldLineLimits.SingleLine.INSTANCE, function23, mutableInteractionSource3, brush2, codepointTransformation2222, null, textFieldDecorator3, null, true, composer5, 100666368, 1572864, 40960);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }, composer422, 54), composer422, 6);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i24 = m1121getRevealLastTypedvTwcZD0;
                            composer3 = composer422;
                            z5 = z3;
                            inputTransformation3 = inputTransformation4222;
                            textStyle3 = textStyle4222;
                            keyboardOptions3 = keyboardOptions4222;
                            keyboardActionHandler3 = keyboardActionHandler4222;
                            function22 = function23;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            brush3 = brush2;
                            textFieldDecorator2 = textFieldDecorator3;
                            c3 = c2;
                            modifier3 = companion2;
                            endRestartGroup = composer3.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i12 = i11;
                        i13 = i4 & 256;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i4 & 512;
                        if (i15 != 0) {
                        }
                        i16 = i15;
                        i17 = i4 & 1024;
                        if (i17 == 0) {
                        }
                        i19 = i4 & 2048;
                        if (i19 == 0) {
                        }
                        int i26222 = i18;
                        i21 = i4 & 4096;
                        if (i21 == 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        if (i25 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Composer composer4222 = composer2;
                        final State rememberUpdatedState222 = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c4), composer4222, (i22 >> 6) & 14);
                        ComposerKt.sourceInformationMarkerStart(composer4222, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
                        rememberedValue = composer4222.rememberedValue();
                        i23 = i22;
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        final SecureTextFieldController secureTextFieldController222 = (SecureTextFieldController) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer4222);
                        ComposerKt.sourceInformationMarkerStart(composer4222, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
                        changedInstance = composer4222.changedInstance(secureTextFieldController222);
                        BasicSecureTextFieldKt$BasicSecureTextField$1$1 rememberedValue3222 = composer4222.rememberedValue();
                        if (changedInstance) {
                        }
                        rememberedValue3222 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController222, null);
                        composer4222.updateRememberedValue(rememberedValue3222);
                        ComposerKt.sourceInformationMarkerEnd(composer4222);
                        EffectsKt.LaunchedEffect(secureTextFieldController222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3222, composer4222, 0);
                        m1116equalsimpl0 = TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0());
                        Boolean valueOf222 = Boolean.valueOf(m1116equalsimpl0);
                        ComposerKt.sourceInformationMarkerStart(composer4222, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
                        changed = composer4222.changed(m1116equalsimpl0) | composer4222.changedInstance(secureTextFieldController222);
                        BasicSecureTextFieldKt$BasicSecureTextField$2$1 rememberedValue4222 = composer4222.rememberedValue();
                        if (changed) {
                        }
                        rememberedValue4222 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(m1116equalsimpl0, secureTextFieldController222, null);
                        composer4222.updateRememberedValue(rememberedValue4222);
                        ComposerKt.sourceInformationMarkerEnd(composer4222);
                        EffectsKt.LaunchedEffect(valueOf222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4222, composer4222, 0);
                        ComposerKt.sourceInformationMarkerStart(composer4222, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                        if ((i23 & 112) == 32) {
                        }
                        rememberedValue2 = composer4222.rememberedValue();
                        if (!z4) {
                        }
                        if (TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0())) {
                        }
                        composer4222.updateRememberedValue(codepointTransformation);
                        rememberedValue2 = codepointTransformation;
                        final CodepointTransformation codepointTransformation22222 = (CodepointTransformation) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer4222);
                        Modifier semantics2222 = SemanticsModifierKt.semantics(companion2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        return false;
                                    }
                                }, 1, null);
                                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        return false;
                                    }
                                }, 1, null);
                            }
                        });
                        if (m1116equalsimpl0) {
                        }
                        final Modifier then2222 = semantics2222.then(companion);
                        final InputTransformation inputTransformation42222 = inputTransformation2;
                        final TextStyle textStyle42222 = textStyle2;
                        final KeyboardActionHandler keyboardActionHandler42222 = keyboardActionHandler2;
                        final KeyboardOptions keyboardOptions42222 = secureTextField$foundation_release;
                        DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i27) {
                                ComposerKt.sourceInformation(composer5, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                                if ((i27 & 3) != 2 || !composer5.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2023988909, i27, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                                    }
                                    TextFieldState textFieldState2 = TextFieldState.this;
                                    Modifier modifier4 = then2222;
                                    boolean z6 = z3;
                                    boolean z7 = m1116equalsimpl0;
                                    InputTransformation inputTransformation5 = inputTransformation42222;
                                    if (z7) {
                                        inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation5, secureTextFieldController222.getPasswordInputTransformation());
                                    }
                                    BasicTextFieldKt.BasicTextField(textFieldState2, modifier4, z6, false, inputTransformation5, textStyle42222, keyboardOptions42222, keyboardActionHandler42222, TextFieldLineLimits.SingleLine.INSTANCE, function23, mutableInteractionSource3, brush2, codepointTransformation22222, null, textFieldDecorator3, null, true, composer5, 100666368, 1572864, 40960);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer5.skipToGroupEnd();
                            }
                        }, composer4222, 54), composer4222, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i24 = m1121getRevealLastTypedvTwcZD0;
                        composer3 = composer4222;
                        z5 = z3;
                        inputTransformation3 = inputTransformation42222;
                        textStyle3 = textStyle42222;
                        keyboardOptions3 = keyboardOptions42222;
                        keyboardActionHandler3 = keyboardActionHandler42222;
                        function22 = function23;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        brush3 = brush2;
                        textFieldDecorator2 = textFieldDecorator3;
                        c3 = c2;
                        modifier3 = companion2;
                        endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    textStyle2 = textStyle;
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i4 & 256;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i4 & 512;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    i17 = i4 & 1024;
                    if (i17 == 0) {
                    }
                    i19 = i4 & 2048;
                    if (i19 == 0) {
                    }
                    int i262222 = i18;
                    i21 = i4 & 4096;
                    if (i21 == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    if (i25 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Composer composer42222 = composer2;
                    final State rememberUpdatedState2222 = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c4), composer42222, (i22 >> 6) & 14);
                    ComposerKt.sourceInformationMarkerStart(composer42222, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
                    rememberedValue = composer42222.rememberedValue();
                    i23 = i22;
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final SecureTextFieldController secureTextFieldController2222 = (SecureTextFieldController) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer42222);
                    ComposerKt.sourceInformationMarkerStart(composer42222, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
                    changedInstance = composer42222.changedInstance(secureTextFieldController2222);
                    BasicSecureTextFieldKt$BasicSecureTextField$1$1 rememberedValue32222 = composer42222.rememberedValue();
                    if (changedInstance) {
                    }
                    rememberedValue32222 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController2222, null);
                    composer42222.updateRememberedValue(rememberedValue32222);
                    ComposerKt.sourceInformationMarkerEnd(composer42222);
                    EffectsKt.LaunchedEffect(secureTextFieldController2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue32222, composer42222, 0);
                    m1116equalsimpl0 = TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0());
                    Boolean valueOf2222 = Boolean.valueOf(m1116equalsimpl0);
                    ComposerKt.sourceInformationMarkerStart(composer42222, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
                    changed = composer42222.changed(m1116equalsimpl0) | composer42222.changedInstance(secureTextFieldController2222);
                    BasicSecureTextFieldKt$BasicSecureTextField$2$1 rememberedValue42222 = composer42222.rememberedValue();
                    if (changed) {
                    }
                    rememberedValue42222 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(m1116equalsimpl0, secureTextFieldController2222, null);
                    composer42222.updateRememberedValue(rememberedValue42222);
                    ComposerKt.sourceInformationMarkerEnd(composer42222);
                    EffectsKt.LaunchedEffect(valueOf2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue42222, composer42222, 0);
                    ComposerKt.sourceInformationMarkerStart(composer42222, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                    if ((i23 & 112) == 32) {
                    }
                    rememberedValue2 = composer42222.rememberedValue();
                    if (!z4) {
                    }
                    if (TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0())) {
                    }
                    composer42222.updateRememberedValue(codepointTransformation);
                    rememberedValue2 = codepointTransformation;
                    final CodepointTransformation codepointTransformation222222 = (CodepointTransformation) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composer42222);
                    Modifier semantics22222 = SemanticsModifierKt.semantics(companion2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    return false;
                                }
                            }, 1, null);
                            SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    return false;
                                }
                            }, 1, null);
                        }
                    });
                    if (m1116equalsimpl0) {
                    }
                    final Modifier then22222 = semantics22222.then(companion);
                    final InputTransformation inputTransformation422222 = inputTransformation2;
                    final TextStyle textStyle422222 = textStyle2;
                    final KeyboardActionHandler keyboardActionHandler422222 = keyboardActionHandler2;
                    final KeyboardOptions keyboardOptions422222 = secureTextField$foundation_release;
                    DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i27) {
                            ComposerKt.sourceInformation(composer5, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                            if ((i27 & 3) != 2 || !composer5.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2023988909, i27, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                                }
                                TextFieldState textFieldState2 = TextFieldState.this;
                                Modifier modifier4 = then22222;
                                boolean z6 = z3;
                                boolean z7 = m1116equalsimpl0;
                                InputTransformation inputTransformation5 = inputTransformation422222;
                                if (z7) {
                                    inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation5, secureTextFieldController2222.getPasswordInputTransformation());
                                }
                                BasicTextFieldKt.BasicTextField(textFieldState2, modifier4, z6, false, inputTransformation5, textStyle422222, keyboardOptions422222, keyboardActionHandler422222, TextFieldLineLimits.SingleLine.INSTANCE, function23, mutableInteractionSource3, brush2, codepointTransformation222222, null, textFieldDecorator3, null, true, composer5, 100666368, 1572864, 40960);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer5.skipToGroupEnd();
                        }
                    }, composer42222, 54), composer42222, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i24 = m1121getRevealLastTypedvTwcZD0;
                    composer3 = composer42222;
                    z5 = z3;
                    inputTransformation3 = inputTransformation422222;
                    textStyle3 = textStyle422222;
                    keyboardOptions3 = keyboardOptions422222;
                    keyboardActionHandler3 = keyboardActionHandler422222;
                    function22 = function23;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    brush3 = brush2;
                    textFieldDecorator2 = textFieldDecorator3;
                    c3 = c2;
                    modifier3 = companion2;
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                inputTransformation2 = inputTransformation;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                textStyle2 = textStyle;
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i4 & 256;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i4 & 512;
                if (i15 != 0) {
                }
                i16 = i15;
                i17 = i4 & 1024;
                if (i17 == 0) {
                }
                i19 = i4 & 2048;
                if (i19 == 0) {
                }
                int i2622222 = i18;
                i21 = i4 & 4096;
                if (i21 == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                if (i25 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 == 0) {
                }
                if (i10 != 0) {
                }
                if (i12 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i20 == 0) {
                }
                if (i21 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer422222 = composer2;
                final State rememberUpdatedState22222 = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c4), composer422222, (i22 >> 6) & 14);
                ComposerKt.sourceInformationMarkerStart(composer422222, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
                rememberedValue = composer422222.rememberedValue();
                i23 = i22;
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final SecureTextFieldController secureTextFieldController22222 = (SecureTextFieldController) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer422222);
                ComposerKt.sourceInformationMarkerStart(composer422222, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
                changedInstance = composer422222.changedInstance(secureTextFieldController22222);
                BasicSecureTextFieldKt$BasicSecureTextField$1$1 rememberedValue322222 = composer422222.rememberedValue();
                if (changedInstance) {
                }
                rememberedValue322222 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController22222, null);
                composer422222.updateRememberedValue(rememberedValue322222);
                ComposerKt.sourceInformationMarkerEnd(composer422222);
                EffectsKt.LaunchedEffect(secureTextFieldController22222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue322222, composer422222, 0);
                m1116equalsimpl0 = TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0());
                Boolean valueOf22222 = Boolean.valueOf(m1116equalsimpl0);
                ComposerKt.sourceInformationMarkerStart(composer422222, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
                changed = composer422222.changed(m1116equalsimpl0) | composer422222.changedInstance(secureTextFieldController22222);
                BasicSecureTextFieldKt$BasicSecureTextField$2$1 rememberedValue422222 = composer422222.rememberedValue();
                if (changed) {
                }
                rememberedValue422222 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(m1116equalsimpl0, secureTextFieldController22222, null);
                composer422222.updateRememberedValue(rememberedValue422222);
                ComposerKt.sourceInformationMarkerEnd(composer422222);
                EffectsKt.LaunchedEffect(valueOf22222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue422222, composer422222, 0);
                ComposerKt.sourceInformationMarkerStart(composer422222, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                if ((i23 & 112) == 32) {
                }
                rememberedValue2 = composer422222.rememberedValue();
                if (!z4) {
                }
                if (TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0())) {
                }
                composer422222.updateRememberedValue(codepointTransformation);
                rememberedValue2 = codepointTransformation;
                final CodepointTransformation codepointTransformation2222222 = (CodepointTransformation) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composer422222);
                Modifier semantics222222 = SemanticsModifierKt.semantics(companion2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return false;
                            }
                        }, 1, null);
                        SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return false;
                            }
                        }, 1, null);
                    }
                });
                if (m1116equalsimpl0) {
                }
                final Modifier then222222 = semantics222222.then(companion);
                final InputTransformation inputTransformation4222222 = inputTransformation2;
                final TextStyle textStyle4222222 = textStyle2;
                final KeyboardActionHandler keyboardActionHandler4222222 = keyboardActionHandler2;
                final KeyboardOptions keyboardOptions4222222 = secureTextField$foundation_release;
                DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i27) {
                        ComposerKt.sourceInformation(composer5, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                        if ((i27 & 3) != 2 || !composer5.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2023988909, i27, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                            }
                            TextFieldState textFieldState2 = TextFieldState.this;
                            Modifier modifier4 = then222222;
                            boolean z6 = z3;
                            boolean z7 = m1116equalsimpl0;
                            InputTransformation inputTransformation5 = inputTransformation4222222;
                            if (z7) {
                                inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation5, secureTextFieldController22222.getPasswordInputTransformation());
                            }
                            BasicTextFieldKt.BasicTextField(textFieldState2, modifier4, z6, false, inputTransformation5, textStyle4222222, keyboardOptions4222222, keyboardActionHandler4222222, TextFieldLineLimits.SingleLine.INSTANCE, function23, mutableInteractionSource3, brush2, codepointTransformation2222222, null, textFieldDecorator3, null, true, composer5, 100666368, 1572864, 40960);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer5.skipToGroupEnd();
                    }
                }, composer422222, 54), composer422222, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                i24 = m1121getRevealLastTypedvTwcZD0;
                composer3 = composer422222;
                z5 = z3;
                inputTransformation3 = inputTransformation4222222;
                textStyle3 = textStyle4222222;
                keyboardOptions3 = keyboardOptions4222222;
                keyboardActionHandler3 = keyboardActionHandler4222222;
                function22 = function23;
                mutableInteractionSource2 = mutableInteractionSource3;
                brush3 = brush2;
                textFieldDecorator2 = textFieldDecorator3;
                c3 = c2;
                modifier3 = companion2;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            inputTransformation2 = inputTransformation;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            textStyle2 = textStyle;
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i4 & 256;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i4 & 512;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i4 & 1024;
            if (i17 == 0) {
            }
            i19 = i4 & 2048;
            if (i19 == 0) {
            }
            int i26222222 = i18;
            i21 = i4 & 4096;
            if (i21 == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            if (i25 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 == 0) {
            }
            if (i10 != 0) {
            }
            if (i12 == 0) {
            }
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i20 == 0) {
            }
            if (i21 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Composer composer4222222 = composer2;
            final State rememberUpdatedState222222 = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c4), composer4222222, (i22 >> 6) & 14);
            ComposerKt.sourceInformationMarkerStart(composer4222222, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
            rememberedValue = composer4222222.rememberedValue();
            i23 = i22;
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final SecureTextFieldController secureTextFieldController222222 = (SecureTextFieldController) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer4222222);
            ComposerKt.sourceInformationMarkerStart(composer4222222, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
            changedInstance = composer4222222.changedInstance(secureTextFieldController222222);
            BasicSecureTextFieldKt$BasicSecureTextField$1$1 rememberedValue3222222 = composer4222222.rememberedValue();
            if (changedInstance) {
            }
            rememberedValue3222222 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController222222, null);
            composer4222222.updateRememberedValue(rememberedValue3222222);
            ComposerKt.sourceInformationMarkerEnd(composer4222222);
            EffectsKt.LaunchedEffect(secureTextFieldController222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3222222, composer4222222, 0);
            m1116equalsimpl0 = TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0());
            Boolean valueOf222222 = Boolean.valueOf(m1116equalsimpl0);
            ComposerKt.sourceInformationMarkerStart(composer4222222, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
            changed = composer4222222.changed(m1116equalsimpl0) | composer4222222.changedInstance(secureTextFieldController222222);
            BasicSecureTextFieldKt$BasicSecureTextField$2$1 rememberedValue4222222 = composer4222222.rememberedValue();
            if (changed) {
            }
            rememberedValue4222222 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(m1116equalsimpl0, secureTextFieldController222222, null);
            composer4222222.updateRememberedValue(rememberedValue4222222);
            ComposerKt.sourceInformationMarkerEnd(composer4222222);
            EffectsKt.LaunchedEffect(valueOf222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4222222, composer4222222, 0);
            ComposerKt.sourceInformationMarkerStart(composer4222222, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
            if ((i23 & 112) == 32) {
            }
            rememberedValue2 = composer4222222.rememberedValue();
            if (!z4) {
            }
            if (TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0())) {
            }
            composer4222222.updateRememberedValue(codepointTransformation);
            rememberedValue2 = codepointTransformation;
            final CodepointTransformation codepointTransformation22222222 = (CodepointTransformation) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer4222222);
            Modifier semantics2222222 = SemanticsModifierKt.semantics(companion2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                    SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return false;
                        }
                    }, 1, null);
                    SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return false;
                        }
                    }, 1, null);
                }
            });
            if (m1116equalsimpl0) {
            }
            final Modifier then2222222 = semantics2222222.then(companion);
            final InputTransformation inputTransformation42222222 = inputTransformation2;
            final TextStyle textStyle42222222 = textStyle2;
            final KeyboardActionHandler keyboardActionHandler42222222 = keyboardActionHandler2;
            final KeyboardOptions keyboardOptions42222222 = secureTextField$foundation_release;
            DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i27) {
                    ComposerKt.sourceInformation(composer5, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                    if ((i27 & 3) != 2 || !composer5.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2023988909, i27, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                        }
                        TextFieldState textFieldState2 = TextFieldState.this;
                        Modifier modifier4 = then2222222;
                        boolean z6 = z3;
                        boolean z7 = m1116equalsimpl0;
                        InputTransformation inputTransformation5 = inputTransformation42222222;
                        if (z7) {
                            inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation5, secureTextFieldController222222.getPasswordInputTransformation());
                        }
                        BasicTextFieldKt.BasicTextField(textFieldState2, modifier4, z6, false, inputTransformation5, textStyle42222222, keyboardOptions42222222, keyboardActionHandler42222222, TextFieldLineLimits.SingleLine.INSTANCE, function23, mutableInteractionSource3, brush2, codepointTransformation22222222, null, textFieldDecorator3, null, true, composer5, 100666368, 1572864, 40960);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer5.skipToGroupEnd();
                }
            }, composer4222222, 54), composer4222222, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            i24 = m1121getRevealLastTypedvTwcZD0;
            composer3 = composer4222222;
            z5 = z3;
            inputTransformation3 = inputTransformation42222222;
            textStyle3 = textStyle42222222;
            keyboardOptions3 = keyboardOptions42222222;
            keyboardActionHandler3 = keyboardActionHandler42222222;
            function22 = function23;
            mutableInteractionSource2 = mutableInteractionSource3;
            brush3 = brush2;
            textFieldDecorator2 = textFieldDecorator3;
            c3 = c2;
            modifier3 = companion2;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        inputTransformation2 = inputTransformation;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        textStyle2 = textStyle;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i4 & 256;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i4 & 512;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i4 & 1024;
        if (i17 == 0) {
        }
        i19 = i4 & 2048;
        if (i19 == 0) {
        }
        int i262222222 = i18;
        i21 = i4 & 4096;
        if (i21 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        if (i25 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 == 0) {
        }
        if (i10 != 0) {
        }
        if (i12 == 0) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i20 == 0) {
        }
        if (i21 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Composer composer42222222 = composer2;
        final State rememberUpdatedState2222222 = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c4), composer42222222, (i22 >> 6) & 14);
        ComposerKt.sourceInformationMarkerStart(composer42222222, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
        rememberedValue = composer42222222.rememberedValue();
        i23 = i22;
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final SecureTextFieldController secureTextFieldController2222222 = (SecureTextFieldController) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer42222222);
        ComposerKt.sourceInformationMarkerStart(composer42222222, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
        changedInstance = composer42222222.changedInstance(secureTextFieldController2222222);
        BasicSecureTextFieldKt$BasicSecureTextField$1$1 rememberedValue32222222 = composer42222222.rememberedValue();
        if (changedInstance) {
        }
        rememberedValue32222222 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController2222222, null);
        composer42222222.updateRememberedValue(rememberedValue32222222);
        ComposerKt.sourceInformationMarkerEnd(composer42222222);
        EffectsKt.LaunchedEffect(secureTextFieldController2222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue32222222, composer42222222, 0);
        m1116equalsimpl0 = TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0());
        Boolean valueOf2222222 = Boolean.valueOf(m1116equalsimpl0);
        ComposerKt.sourceInformationMarkerStart(composer42222222, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
        changed = composer42222222.changed(m1116equalsimpl0) | composer42222222.changedInstance(secureTextFieldController2222222);
        BasicSecureTextFieldKt$BasicSecureTextField$2$1 rememberedValue42222222 = composer42222222.rememberedValue();
        if (changed) {
        }
        rememberedValue42222222 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(m1116equalsimpl0, secureTextFieldController2222222, null);
        composer42222222.updateRememberedValue(rememberedValue42222222);
        ComposerKt.sourceInformationMarkerEnd(composer42222222);
        EffectsKt.LaunchedEffect(valueOf2222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue42222222, composer42222222, 0);
        ComposerKt.sourceInformationMarkerStart(composer42222222, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
        if ((i23 & 112) == 32) {
        }
        rememberedValue2 = composer42222222.rememberedValue();
        if (!z4) {
        }
        if (TextObfuscationMode.m1116equalsimpl0(m1121getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1121getRevealLastTypedvTwcZD0())) {
        }
        composer42222222.updateRememberedValue(codepointTransformation);
        rememberedValue2 = codepointTransformation;
        final CodepointTransformation codepointTransformation222222222 = (CodepointTransformation) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer42222222);
        Modifier semantics22222222 = SemanticsModifierKt.semantics(companion2, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return false;
                    }
                }, 1, null);
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return false;
                    }
                }, 1, null);
            }
        });
        if (m1116equalsimpl0) {
        }
        final Modifier then22222222 = semantics22222222.then(companion);
        final InputTransformation inputTransformation422222222 = inputTransformation2;
        final TextStyle textStyle422222222 = textStyle2;
        final KeyboardActionHandler keyboardActionHandler422222222 = keyboardActionHandler2;
        final KeyboardOptions keyboardOptions422222222 = secureTextField$foundation_release;
        DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                invoke(composer5, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer5, int i27) {
                ComposerKt.sourceInformation(composer5, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                if ((i27 & 3) != 2 || !composer5.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2023988909, i27, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                    }
                    TextFieldState textFieldState2 = TextFieldState.this;
                    Modifier modifier4 = then22222222;
                    boolean z6 = z3;
                    boolean z7 = m1116equalsimpl0;
                    InputTransformation inputTransformation5 = inputTransformation422222222;
                    if (z7) {
                        inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation5, secureTextFieldController2222222.getPasswordInputTransformation());
                    }
                    BasicTextFieldKt.BasicTextField(textFieldState2, modifier4, z6, false, inputTransformation5, textStyle422222222, keyboardOptions422222222, keyboardActionHandler422222222, TextFieldLineLimits.SingleLine.INSTANCE, function23, mutableInteractionSource3, brush2, codepointTransformation222222222, null, textFieldDecorator3, null, true, composer5, 100666368, 1572864, 40960);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer5.skipToGroupEnd();
            }
        }, composer42222222, 54), composer42222222, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        i24 = m1121getRevealLastTypedvTwcZD0;
        composer3 = composer42222222;
        z5 = z3;
        inputTransformation3 = inputTransformation422222222;
        textStyle3 = textStyle422222222;
        keyboardOptions3 = keyboardOptions422222222;
        keyboardActionHandler3 = keyboardActionHandler422222222;
        function22 = function23;
        mutableInteractionSource2 = mutableInteractionSource3;
        brush3 = brush2;
        textFieldDecorator2 = textFieldDecorator3;
        c3 = c2;
        modifier3 = companion2;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputTransformation then(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        return inputTransformation == null ? inputTransformation2 : inputTransformation2 == null ? inputTransformation : InputTransformationKt.then(inputTransformation, inputTransformation2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisableCutCopy(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1085555050);
        ComposerKt.sourceInformation(startRestartGroup, "C(DisableCutCopy)311@13911L7,312@13949L680,331@14706L361,331@14634L433:BasicSecureTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1085555050, i2, -1, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:310)");
            }
            ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localTextToolbar);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final TextToolbar textToolbar = (TextToolbar) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1202776994, "CC(remember):BasicSecureTextField.kt#9igjgp");
            boolean changed = startRestartGroup.changed(textToolbar);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new TextToolbar() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1
                    private final /* synthetic */ TextToolbar $$delegate_0;

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public TextToolbarStatus getStatus() {
                        return this.$$delegate_0.getStatus();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void hide() {
                        this.$$delegate_0.hide();
                    }

                    {
                        this.$$delegate_0 = TextToolbar.this;
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void showMenu(Rect rect, Function0<Unit> onCopyRequested, Function0<Unit> onPasteRequested, Function0<Unit> onCutRequested, Function0<Unit> onSelectAllRequested) {
                        TextToolbar.this.showMenu(rect, null, onPasteRequested, null, onSelectAllRequested);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalTextToolbar().provides((BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) rememberedValue), ComposableLambdaKt.rememberComposableLambda(-1448819882, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposerKt.sourceInformation(composer2, "C332@14716L345:BasicSecureTextField.kt#423gt5");
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1448819882, i3, -1, "androidx.compose.foundation.text.DisableCutCopy.<anonymous> (BasicSecureTextField.kt:332)");
                        }
                        Modifier onPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(Modifier.INSTANCE, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$1.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return m961invokeZmokQxo(keyEvent.m4870unboximpl());
                            }

                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m961invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                KeyCommand mo988mapZmokQxo = KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo988mapZmokQxo(keyEvent);
                                return Boolean.valueOf(mo988mapZmokQxo == KeyCommand.COPY || mo988mapZmokQxo == KeyCommand.CUT);
                            }
                        });
                        Function2<Composer, Integer, Unit> function22 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, onPreviewKeyEvent);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3316constructorimpl = Updater.m3316constructorimpl(composer2);
                        Updater.m3323setimpl(m3316constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1177942586, "C338@15042L9:BasicSecureTextField.kt#423gt5");
                        function22.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    BasicSecureTextFieldKt.DisableCutCopy(function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
