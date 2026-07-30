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

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02cd  */
    /* renamed from: BasicSecureTextField-Jb9bMDk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m969BasicSecureTextFieldJb9bMDk(final TextFieldState textFieldState, Modifier modifier, boolean z, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i, char c, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Modifier.Companion companion;
        KeyboardActionHandler keyboardActionHandler2;
        boolean z2;
        SolidColor solidColor;
        int m1130getRevealLastTypedvTwcZD0;
        Object rememberedValue;
        final SecureTextFieldController secureTextFieldController;
        boolean changedInstance;
        BasicSecureTextFieldKt$BasicSecureTextField$1$1 rememberedValue2;
        final boolean m1125equalsimpl0;
        boolean changed;
        BasicSecureTextFieldKt$BasicSecureTextField$2$1 basicSecureTextFieldKt$BasicSecureTextField$2$1;
        boolean z3;
        Object rememberedValue3;
        CodepointTransformation codepointTransformation;
        Modifier.Companion companion2;
        final char c2;
        final int i19;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        final MutableInteractionSource mutableInteractionSource2;
        final Brush brush2;
        final TextFieldDecorator textFieldDecorator2;
        final InputTransformation inputTransformation2;
        final TextStyle textStyle2;
        final KeyboardOptions keyboardOptions2;
        final boolean z4;
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
        int i20 = i4 & 2;
        if (i20 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 |= startRestartGroup.changed(z) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(inputTransformation) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i5 |= startRestartGroup.changed(textStyle) ? 16384 : 8192;
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changed(keyboardOptions) ? 131072 : 65536;
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(keyboardActionHandler) ? 1048576 : 524288;
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i5 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i5 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i5 |= startRestartGroup.changed(brush) ? 536870912 : 268435456;
                        }
                        i14 = i4 & 1024;
                        if (i14 != 0) {
                            i15 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i15 = i3 | ((i3 & 8) == 0 ? startRestartGroup.changed(textFieldDecorator) : startRestartGroup.changedInstance(textFieldDecorator) ? 4 : 2);
                        } else {
                            i15 = i3;
                        }
                        i16 = i4 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                        } else if ((i3 & 48) == 0) {
                            i15 |= startRestartGroup.changed(i) ? 32 : 16;
                        }
                        i17 = i15;
                        i18 = i4 & 4096;
                        if (i18 != 0) {
                            i17 |= 384;
                        } else if ((i3 & 384) == 0) {
                            i17 |= startRestartGroup.changed(c) ? 256 : 128;
                            if ((i5 & 306783379) == 306783378 || (i17 & 147) != 146 || !startRestartGroup.getSkipping()) {
                                companion = i20 == 0 ? Modifier.INSTANCE : modifier;
                                boolean z5 = i6 == 0 ? true : z;
                                InputTransformation inputTransformation3 = i7 == 0 ? null : inputTransformation;
                                TextStyle textStyle3 = i8 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                                KeyboardOptions secureTextField$foundation_release = i9 == 0 ? KeyboardOptions.INSTANCE.getSecureTextField$foundation_release() : keyboardOptions;
                                keyboardActionHandler2 = i10 == 0 ? null : keyboardActionHandler;
                                Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23 = i11 == 0 ? null : function2;
                                MutableInteractionSource mutableInteractionSource3 = i12 == 0 ? null : mutableInteractionSource;
                                if (i13 == 0) {
                                    z2 = z5;
                                    solidColor = new SolidColor(Color.INSTANCE.m3866getBlack0d7_KjU(), null);
                                } else {
                                    z2 = z5;
                                    solidColor = brush;
                                }
                                TextFieldDecorator textFieldDecorator3 = i14 == 0 ? null : textFieldDecorator;
                                m1130getRevealLastTypedvTwcZD0 = i16 == 0 ? TextObfuscationMode.INSTANCE.m1130getRevealLastTypedvTwcZD0() : i;
                                char c3 = i18 == 0 ? (char) 8226 : c;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1399310985, i5, i17, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:130)");
                                }
                                final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c3), startRestartGroup, (i17 >> 6) & 14);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new SecureTextFieldController(rememberUpdatedState);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                secureTextFieldController = (SecureTextFieldController) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                changedInstance = startRestartGroup.changedInstance(secureTextFieldController);
                                char c4 = c3;
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                EffectsKt.LaunchedEffect(secureTextFieldController, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
                                m1125equalsimpl0 = TextObfuscationMode.m1125equalsimpl0(m1130getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1130getRevealLastTypedvTwcZD0());
                                Boolean valueOf = Boolean.valueOf(m1125equalsimpl0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                changed = startRestartGroup.changed(m1125equalsimpl0) | startRestartGroup.changedInstance(secureTextFieldController);
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    basicSecureTextFieldKt$BasicSecureTextField$2$1 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(m1125equalsimpl0, secureTextFieldController, null);
                                    startRestartGroup.updateRememberedValue(basicSecureTextFieldKt$BasicSecureTextField$2$1);
                                } else {
                                    basicSecureTextFieldKt$BasicSecureTextField$2$1 = rememberedValue4;
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) basicSecureTextFieldKt$BasicSecureTextField$2$1, startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                z3 = (i17 & 112) == 32;
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    if (!TextObfuscationMode.m1125equalsimpl0(m1130getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1130getRevealLastTypedvTwcZD0())) {
                                        codepointTransformation = secureTextFieldController.getCodepointTransformation();
                                    } else {
                                        codepointTransformation = TextObfuscationMode.m1125equalsimpl0(m1130getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1129getHiddenvTwcZD0()) ? new CodepointTransformation() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$$ExternalSyntheticLambda0
                                            @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
                                            public final int transform(int i21, int i22) {
                                                int BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3;
                                                BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3 = BasicSecureTextFieldKt.BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3(State.this, i21, i22);
                                                return BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3;
                                            }
                                        } : null;
                                    }
                                    startRestartGroup.updateRememberedValue(codepointTransformation);
                                    rememberedValue3 = codepointTransformation;
                                }
                                final CodepointTransformation codepointTransformation2 = (CodepointTransformation) rememberedValue3;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Modifier semantics = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
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
                                if (!m1125equalsimpl0) {
                                    companion2 = secureTextFieldController.getFocusChangeModifier();
                                } else {
                                    companion2 = Modifier.INSTANCE;
                                }
                                final Modifier then = semantics.then(companion2);
                                final boolean z6 = z2;
                                final InputTransformation inputTransformation4 = inputTransformation3;
                                final TextStyle textStyle4 = textStyle3;
                                final KeyboardOptions keyboardOptions3 = secureTextField$foundation_release;
                                final KeyboardActionHandler keyboardActionHandler3 = keyboardActionHandler2;
                                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24 = function23;
                                final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                final Brush brush3 = solidColor;
                                final TextFieldDecorator textFieldDecorator4 = textFieldDecorator3;
                                DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
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

                                    public final void invoke(Composer composer2, int i21) {
                                        InputTransformation inputTransformation5;
                                        ComposerKt.sourceInformation(composer2, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                                        if ((i21 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2023988909, i21, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                                            }
                                            TextFieldState textFieldState2 = TextFieldState.this;
                                            Modifier modifier2 = then;
                                            boolean z7 = z6;
                                            if (m1125equalsimpl0) {
                                                inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation4, secureTextFieldController.getPasswordInputTransformation());
                                            } else {
                                                inputTransformation5 = inputTransformation4;
                                            }
                                            BasicTextFieldKt.BasicTextField(textFieldState2, modifier2, z7, false, inputTransformation5, textStyle4, keyboardOptions3, keyboardActionHandler3, TextFieldLineLimits.SingleLine.INSTANCE, function24, mutableInteractionSource4, brush3, codepointTransformation2, null, textFieldDecorator4, null, true, composer2, 100666368, 1572864, 40960);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54), startRestartGroup, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                c2 = c4;
                                i19 = m1130getRevealLastTypedvTwcZD0;
                                function22 = function23;
                                mutableInteractionSource2 = mutableInteractionSource3;
                                brush2 = solidColor;
                                textFieldDecorator2 = textFieldDecorator3;
                                inputTransformation2 = inputTransformation3;
                                textStyle2 = textStyle3;
                                keyboardOptions2 = secureTextField$foundation_release;
                                z4 = z2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                companion = modifier;
                                z4 = z;
                                inputTransformation2 = inputTransformation;
                                textStyle2 = textStyle;
                                keyboardOptions2 = keyboardOptions;
                                keyboardActionHandler2 = keyboardActionHandler;
                                function22 = function2;
                                mutableInteractionSource2 = mutableInteractionSource;
                                brush2 = brush;
                                textFieldDecorator2 = textFieldDecorator;
                                i19 = i;
                                c2 = c;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Modifier modifier2 = companion;
                                final KeyboardActionHandler keyboardActionHandler4 = keyboardActionHandler2;
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$4
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

                                    public final void invoke(Composer composer2, int i21) {
                                        BasicSecureTextFieldKt.m969BasicSecureTextFieldJb9bMDk(TextFieldState.this, modifier2, z4, inputTransformation2, textStyle2, keyboardOptions2, keyboardActionHandler4, function22, mutableInteractionSource2, brush2, textFieldDecorator2, i19, c2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        if (i20 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c3), startRestartGroup, (i17 >> 6) & 14);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        secureTextFieldController = (SecureTextFieldController) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
                        changedInstance = startRestartGroup.changedInstance(secureTextFieldController);
                        char c42 = c3;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue2 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.LaunchedEffect(secureTextFieldController, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
                        m1125equalsimpl0 = TextObfuscationMode.m1125equalsimpl0(m1130getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1130getRevealLastTypedvTwcZD0());
                        Boolean valueOf2 = Boolean.valueOf(m1125equalsimpl0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
                        changed = startRestartGroup.changed(m1125equalsimpl0) | startRestartGroup.changedInstance(secureTextFieldController);
                        Object rememberedValue42 = startRestartGroup.rememberedValue();
                        if (changed) {
                        }
                        basicSecureTextFieldKt$BasicSecureTextField$2$1 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(m1125equalsimpl0, secureTextFieldController, null);
                        startRestartGroup.updateRememberedValue(basicSecureTextFieldKt$BasicSecureTextField$2$1);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) basicSecureTextFieldKt$BasicSecureTextField$2$1, startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                        if ((i17 & 112) == 32) {
                        }
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!z3) {
                        }
                        if (!TextObfuscationMode.m1125equalsimpl0(m1130getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1130getRevealLastTypedvTwcZD0())) {
                        }
                        startRestartGroup.updateRememberedValue(codepointTransformation);
                        rememberedValue3 = codepointTransformation;
                        final CodepointTransformation codepointTransformation22 = (CodepointTransformation) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier semantics2 = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
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
                        if (!m1125equalsimpl0) {
                        }
                        final Modifier then2 = semantics2.then(companion2);
                        final boolean z62 = z2;
                        final InputTransformation inputTransformation42 = inputTransformation3;
                        final TextStyle textStyle42 = textStyle3;
                        final KeyboardOptions keyboardOptions32 = secureTextField$foundation_release;
                        final KeyboardActionHandler keyboardActionHandler32 = keyboardActionHandler2;
                        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function242 = function23;
                        final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource3;
                        final Brush brush32 = solidColor;
                        final TextFieldDecorator textFieldDecorator42 = textFieldDecorator3;
                        DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
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

                            public final void invoke(Composer composer2, int i21) {
                                InputTransformation inputTransformation5;
                                ComposerKt.sourceInformation(composer2, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                                if ((i21 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2023988909, i21, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                                    }
                                    TextFieldState textFieldState2 = TextFieldState.this;
                                    Modifier modifier22 = then2;
                                    boolean z7 = z62;
                                    if (m1125equalsimpl0) {
                                        inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation42, secureTextFieldController.getPasswordInputTransformation());
                                    } else {
                                        inputTransformation5 = inputTransformation42;
                                    }
                                    BasicTextFieldKt.BasicTextField(textFieldState2, modifier22, z7, false, inputTransformation5, textStyle42, keyboardOptions32, keyboardActionHandler32, TextFieldLineLimits.SingleLine.INSTANCE, function242, mutableInteractionSource42, brush32, codepointTransformation22, null, textFieldDecorator42, null, true, composer2, 100666368, 1572864, 40960);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), startRestartGroup, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        c2 = c42;
                        i19 = m1130getRevealLastTypedvTwcZD0;
                        function22 = function23;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        brush2 = solidColor;
                        textFieldDecorator2 = textFieldDecorator3;
                        inputTransformation2 = inputTransformation3;
                        textStyle2 = textStyle3;
                        keyboardOptions2 = secureTextField$foundation_release;
                        z4 = z2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i4 & 1024;
                    if (i14 != 0) {
                    }
                    i16 = i4 & 2048;
                    if (i16 != 0) {
                    }
                    i17 = i15;
                    i18 = i4 & 4096;
                    if (i18 != 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    if (i20 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final State rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c3), startRestartGroup, (i17 >> 6) & 14);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    secureTextFieldController = (SecureTextFieldController) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
                    changedInstance = startRestartGroup.changedInstance(secureTextFieldController);
                    char c422 = c3;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue2 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.LaunchedEffect(secureTextFieldController, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
                    m1125equalsimpl0 = TextObfuscationMode.m1125equalsimpl0(m1130getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1130getRevealLastTypedvTwcZD0());
                    Boolean valueOf22 = Boolean.valueOf(m1125equalsimpl0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
                    changed = startRestartGroup.changed(m1125equalsimpl0) | startRestartGroup.changedInstance(secureTextFieldController);
                    Object rememberedValue422 = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    basicSecureTextFieldKt$BasicSecureTextField$2$1 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(m1125equalsimpl0, secureTextFieldController, null);
                    startRestartGroup.updateRememberedValue(basicSecureTextFieldKt$BasicSecureTextField$2$1);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) basicSecureTextFieldKt$BasicSecureTextField$2$1, startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                    if ((i17 & 112) == 32) {
                    }
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!z3) {
                    }
                    if (!TextObfuscationMode.m1125equalsimpl0(m1130getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1130getRevealLastTypedvTwcZD0())) {
                    }
                    startRestartGroup.updateRememberedValue(codepointTransformation);
                    rememberedValue3 = codepointTransformation;
                    final CodepointTransformation codepointTransformation222 = (CodepointTransformation) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier semantics22 = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
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
                    if (!m1125equalsimpl0) {
                    }
                    final Modifier then22 = semantics22.then(companion2);
                    final boolean z622 = z2;
                    final InputTransformation inputTransformation422 = inputTransformation3;
                    final TextStyle textStyle422 = textStyle3;
                    final KeyboardOptions keyboardOptions322 = secureTextField$foundation_release;
                    final KeyboardActionHandler keyboardActionHandler322 = keyboardActionHandler2;
                    final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2422 = function23;
                    final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource3;
                    final Brush brush322 = solidColor;
                    final TextFieldDecorator textFieldDecorator422 = textFieldDecorator3;
                    DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
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

                        public final void invoke(Composer composer2, int i21) {
                            InputTransformation inputTransformation5;
                            ComposerKt.sourceInformation(composer2, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                            if ((i21 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2023988909, i21, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                                }
                                TextFieldState textFieldState2 = TextFieldState.this;
                                Modifier modifier22 = then22;
                                boolean z7 = z622;
                                if (m1125equalsimpl0) {
                                    inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation422, secureTextFieldController.getPasswordInputTransformation());
                                } else {
                                    inputTransformation5 = inputTransformation422;
                                }
                                BasicTextFieldKt.BasicTextField(textFieldState2, modifier22, z7, false, inputTransformation5, textStyle422, keyboardOptions322, keyboardActionHandler322, TextFieldLineLimits.SingleLine.INSTANCE, function2422, mutableInteractionSource422, brush322, codepointTransformation222, null, textFieldDecorator422, null, true, composer2, 100666368, 1572864, 40960);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), startRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    c2 = c422;
                    i19 = m1130getRevealLastTypedvTwcZD0;
                    function22 = function23;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    brush2 = solidColor;
                    textFieldDecorator2 = textFieldDecorator3;
                    inputTransformation2 = inputTransformation3;
                    textStyle2 = textStyle3;
                    keyboardOptions2 = secureTextField$foundation_release;
                    z4 = z2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i14 = i4 & 1024;
                if (i14 != 0) {
                }
                i16 = i4 & 2048;
                if (i16 != 0) {
                }
                i17 = i15;
                i18 = i4 & 4096;
                if (i18 != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                if (i20 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i13 == 0) {
                }
                if (i14 == 0) {
                }
                if (i16 == 0) {
                }
                if (i18 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final State rememberUpdatedState222 = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c3), startRestartGroup, (i17 >> 6) & 14);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                secureTextFieldController = (SecureTextFieldController) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
                changedInstance = startRestartGroup.changedInstance(secureTextFieldController);
                char c4222 = c3;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue2 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.LaunchedEffect(secureTextFieldController, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
                m1125equalsimpl0 = TextObfuscationMode.m1125equalsimpl0(m1130getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1130getRevealLastTypedvTwcZD0());
                Boolean valueOf222 = Boolean.valueOf(m1125equalsimpl0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
                changed = startRestartGroup.changed(m1125equalsimpl0) | startRestartGroup.changedInstance(secureTextFieldController);
                Object rememberedValue4222 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                basicSecureTextFieldKt$BasicSecureTextField$2$1 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(m1125equalsimpl0, secureTextFieldController, null);
                startRestartGroup.updateRememberedValue(basicSecureTextFieldKt$BasicSecureTextField$2$1);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.LaunchedEffect(valueOf222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) basicSecureTextFieldKt$BasicSecureTextField$2$1, startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                if ((i17 & 112) == 32) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                if (!TextObfuscationMode.m1125equalsimpl0(m1130getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1130getRevealLastTypedvTwcZD0())) {
                }
                startRestartGroup.updateRememberedValue(codepointTransformation);
                rememberedValue3 = codepointTransformation;
                final CodepointTransformation codepointTransformation2222 = (CodepointTransformation) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier semantics222 = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
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
                if (!m1125equalsimpl0) {
                }
                final Modifier then222 = semantics222.then(companion2);
                final boolean z6222 = z2;
                final InputTransformation inputTransformation4222 = inputTransformation3;
                final TextStyle textStyle4222 = textStyle3;
                final KeyboardOptions keyboardOptions3222 = secureTextField$foundation_release;
                final KeyboardActionHandler keyboardActionHandler3222 = keyboardActionHandler2;
                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24222 = function23;
                final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource3;
                final Brush brush3222 = solidColor;
                final TextFieldDecorator textFieldDecorator4222 = textFieldDecorator3;
                DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
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

                    public final void invoke(Composer composer2, int i21) {
                        InputTransformation inputTransformation5;
                        ComposerKt.sourceInformation(composer2, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                        if ((i21 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2023988909, i21, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                            }
                            TextFieldState textFieldState2 = TextFieldState.this;
                            Modifier modifier22 = then222;
                            boolean z7 = z6222;
                            if (m1125equalsimpl0) {
                                inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation4222, secureTextFieldController.getPasswordInputTransformation());
                            } else {
                                inputTransformation5 = inputTransformation4222;
                            }
                            BasicTextFieldKt.BasicTextField(textFieldState2, modifier22, z7, false, inputTransformation5, textStyle4222, keyboardOptions3222, keyboardActionHandler3222, TextFieldLineLimits.SingleLine.INSTANCE, function24222, mutableInteractionSource4222, brush3222, codepointTransformation2222, null, textFieldDecorator4222, null, true, composer2, 100666368, 1572864, 40960);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                c2 = c4222;
                i19 = m1130getRevealLastTypedvTwcZD0;
                function22 = function23;
                mutableInteractionSource2 = mutableInteractionSource3;
                brush2 = solidColor;
                textFieldDecorator2 = textFieldDecorator3;
                inputTransformation2 = inputTransformation3;
                textStyle2 = textStyle3;
                keyboardOptions2 = secureTextField$foundation_release;
                z4 = z2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i14 = i4 & 1024;
            if (i14 != 0) {
            }
            i16 = i4 & 2048;
            if (i16 != 0) {
            }
            i17 = i15;
            i18 = i4 & 4096;
            if (i18 != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            if (i20 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i13 == 0) {
            }
            if (i14 == 0) {
            }
            if (i16 == 0) {
            }
            if (i18 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final State rememberUpdatedState2222 = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c3), startRestartGroup, (i17 >> 6) & 14);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            secureTextFieldController = (SecureTextFieldController) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
            changedInstance = startRestartGroup.changedInstance(secureTextFieldController);
            char c42222 = c3;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(secureTextFieldController, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
            m1125equalsimpl0 = TextObfuscationMode.m1125equalsimpl0(m1130getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1130getRevealLastTypedvTwcZD0());
            Boolean valueOf2222 = Boolean.valueOf(m1125equalsimpl0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
            changed = startRestartGroup.changed(m1125equalsimpl0) | startRestartGroup.changedInstance(secureTextFieldController);
            Object rememberedValue42222 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            basicSecureTextFieldKt$BasicSecureTextField$2$1 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(m1125equalsimpl0, secureTextFieldController, null);
            startRestartGroup.updateRememberedValue(basicSecureTextFieldKt$BasicSecureTextField$2$1);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(valueOf2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) basicSecureTextFieldKt$BasicSecureTextField$2$1, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
            if ((i17 & 112) == 32) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            if (!TextObfuscationMode.m1125equalsimpl0(m1130getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1130getRevealLastTypedvTwcZD0())) {
            }
            startRestartGroup.updateRememberedValue(codepointTransformation);
            rememberedValue3 = codepointTransformation;
            final CodepointTransformation codepointTransformation22222 = (CodepointTransformation) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics2222 = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
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
            if (!m1125equalsimpl0) {
            }
            final Modifier then2222 = semantics2222.then(companion2);
            final boolean z62222 = z2;
            final InputTransformation inputTransformation42222 = inputTransformation3;
            final TextStyle textStyle42222 = textStyle3;
            final KeyboardOptions keyboardOptions32222 = secureTextField$foundation_release;
            final KeyboardActionHandler keyboardActionHandler32222 = keyboardActionHandler2;
            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function242222 = function23;
            final MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource3;
            final Brush brush32222 = solidColor;
            final TextFieldDecorator textFieldDecorator42222 = textFieldDecorator3;
            DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
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

                public final void invoke(Composer composer2, int i21) {
                    InputTransformation inputTransformation5;
                    ComposerKt.sourceInformation(composer2, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                    if ((i21 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2023988909, i21, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                        }
                        TextFieldState textFieldState2 = TextFieldState.this;
                        Modifier modifier22 = then2222;
                        boolean z7 = z62222;
                        if (m1125equalsimpl0) {
                            inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation42222, secureTextFieldController.getPasswordInputTransformation());
                        } else {
                            inputTransformation5 = inputTransformation42222;
                        }
                        BasicTextFieldKt.BasicTextField(textFieldState2, modifier22, z7, false, inputTransformation5, textStyle42222, keyboardOptions32222, keyboardActionHandler32222, TextFieldLineLimits.SingleLine.INSTANCE, function242222, mutableInteractionSource42222, brush32222, codepointTransformation22222, null, textFieldDecorator42222, null, true, composer2, 100666368, 1572864, 40960);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            c2 = c42222;
            i19 = m1130getRevealLastTypedvTwcZD0;
            function22 = function23;
            mutableInteractionSource2 = mutableInteractionSource3;
            brush2 = solidColor;
            textFieldDecorator2 = textFieldDecorator3;
            inputTransformation2 = inputTransformation3;
            textStyle2 = textStyle3;
            keyboardOptions2 = secureTextField$foundation_release;
            z4 = z2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i14 = i4 & 1024;
        if (i14 != 0) {
        }
        i16 = i4 & 2048;
        if (i16 != 0) {
        }
        i17 = i15;
        i18 = i4 & 4096;
        if (i18 != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        if (i20 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        if (i14 == 0) {
        }
        if (i16 == 0) {
        }
        if (i18 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        final State rememberUpdatedState22222 = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c3), startRestartGroup, (i17 >> 6) & 14);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        secureTextFieldController = (SecureTextFieldController) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
        changedInstance = startRestartGroup.changedInstance(secureTextFieldController);
        char c422222 = c3;
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.LaunchedEffect(secureTextFieldController, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
        m1125equalsimpl0 = TextObfuscationMode.m1125equalsimpl0(m1130getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1130getRevealLastTypedvTwcZD0());
        Boolean valueOf22222 = Boolean.valueOf(m1125equalsimpl0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
        changed = startRestartGroup.changed(m1125equalsimpl0) | startRestartGroup.changedInstance(secureTextFieldController);
        Object rememberedValue422222 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        basicSecureTextFieldKt$BasicSecureTextField$2$1 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(m1125equalsimpl0, secureTextFieldController, null);
        startRestartGroup.updateRememberedValue(basicSecureTextFieldKt$BasicSecureTextField$2$1);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.LaunchedEffect(valueOf22222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) basicSecureTextFieldKt$BasicSecureTextField$2$1, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
        if ((i17 & 112) == 32) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        if (!TextObfuscationMode.m1125equalsimpl0(m1130getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1130getRevealLastTypedvTwcZD0())) {
        }
        startRestartGroup.updateRememberedValue(codepointTransformation);
        rememberedValue3 = codepointTransformation;
        final CodepointTransformation codepointTransformation222222 = (CodepointTransformation) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier semantics22222 = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
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
        if (!m1125equalsimpl0) {
        }
        final Modifier then22222 = semantics22222.then(companion2);
        final boolean z622222 = z2;
        final InputTransformation inputTransformation422222 = inputTransformation3;
        final TextStyle textStyle422222 = textStyle3;
        final KeyboardOptions keyboardOptions322222 = secureTextField$foundation_release;
        final KeyboardActionHandler keyboardActionHandler322222 = keyboardActionHandler2;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2422222 = function23;
        final MutableInteractionSource mutableInteractionSource422222 = mutableInteractionSource3;
        final Brush brush322222 = solidColor;
        final TextFieldDecorator textFieldDecorator422222 = textFieldDecorator3;
        DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
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

            public final void invoke(Composer composer2, int i21) {
                InputTransformation inputTransformation5;
                ComposerKt.sourceInformation(composer2, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                if ((i21 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2023988909, i21, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                    }
                    TextFieldState textFieldState2 = TextFieldState.this;
                    Modifier modifier22 = then22222;
                    boolean z7 = z622222;
                    if (m1125equalsimpl0) {
                        inputTransformation5 = BasicSecureTextFieldKt.then(inputTransformation422222, secureTextFieldController.getPasswordInputTransformation());
                    } else {
                        inputTransformation5 = inputTransformation422222;
                    }
                    BasicTextFieldKt.BasicTextField(textFieldState2, modifier22, z7, false, inputTransformation5, textStyle422222, keyboardOptions322222, keyboardActionHandler322222, TextFieldLineLimits.SingleLine.INSTANCE, function2422222, mutableInteractionSource422222, brush322222, codepointTransformation222222, null, textFieldDecorator422222, null, true, composer2, 100666368, 1572864, 40960);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        c2 = c422222;
        i19 = m1130getRevealLastTypedvTwcZD0;
        function22 = function23;
        mutableInteractionSource2 = mutableInteractionSource3;
        brush2 = solidColor;
        textFieldDecorator2 = textFieldDecorator3;
        inputTransformation2 = inputTransformation3;
        textStyle2 = textStyle3;
        keyboardOptions2 = secureTextField$foundation_release;
        z4 = z2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3(State state, int i, int i2) {
        return ((Character) state.getValue()).charValue();
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
                                return m970invokeZmokQxo(keyEvent.m4893unboximpl());
                            }

                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m970invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                KeyCommand mo997mapZmokQxo = KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo997mapZmokQxo(keyEvent);
                                return Boolean.valueOf(mo997mapZmokQxo == KeyCommand.COPY || mo997mapZmokQxo == KeyCommand.CUT);
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
                        Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
                        Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
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
