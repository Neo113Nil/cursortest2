package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import com.google.android.exoplayer2.C;
import io.bidmachine.protobuf.EventTypeExtended;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicTextField.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aÕ\u0001\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192$\b\u0002\u0010\u001d\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001c\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aÕ\u0001\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020 2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192$\b\u0002\u0010\u001d\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b\u001c\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001cH\u0007¢\u0006\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "decorationBox", "BasicTextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final String value, final Function1 onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1 function1, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, final int i2, final int i3, final int i4) {
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
        boolean z4;
        boolean z5;
        KeyboardActions keyboardActions2;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        boolean z6;
        int i18;
        Brush brush2;
        Modifier modifier3;
        boolean z7;
        Function3 function32;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        int i19;
        Function1 function12;
        VisualTransformation visualTransformation2;
        int i20;
        Object rememberedValue;
        Composer.Companion companion;
        boolean changed;
        Object rememberedValue2;
        boolean changed2;
        Object rememberedValue3;
        final boolean z8;
        TextStyle textStyle3;
        VisualTransformation visualTransformation3;
        Function1 function13;
        Brush brush3;
        KeyboardOptions keyboardOptions3;
        final boolean z9;
        final Modifier modifier4;
        MutableInteractionSource mutableInteractionSource3;
        int i21;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-454732590);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i22 = i4 & 4;
        if (i22 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            int i23 = 1024;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else if ((i2 & 458752) == 0) {
                    i5 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(z3) ? 67108864 : 33554432;
                }
                i12 = i4 & 512;
                if (i12 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                }
                i13 = i4 & 1024;
                if (i13 != 0) {
                    i14 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i14 = i3 | (startRestartGroup.changed(visualTransformation) ? 4 : 2);
                } else {
                    i14 = i3;
                }
                i15 = i4 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i3 & 112) == 0) {
                    i14 |= startRestartGroup.changed(function1) ? 32 : 16;
                }
                int i24 = i14;
                i16 = i4 & 4096;
                if (i16 != 0) {
                    i24 |= 384;
                } else if ((i3 & 896) == 0) {
                    i24 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                    if ((i3 & 7168) == 0) {
                        if ((i4 & 8192) == 0 && startRestartGroup.changed(brush)) {
                            i23 = 2048;
                        }
                        i24 |= i23;
                    }
                    i17 = i4 & 16384;
                    if (i17 == 0) {
                        i24 |= 24576;
                    } else if ((i3 & 57344) == 0) {
                        i24 |= startRestartGroup.changed(function3) ? 16384 : 8192;
                    }
                    int i25 = i5;
                    if ((i5 & 1533916891) == 306783378 || (46811 & i24) != 9362 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i22 == 0 ? Modifier.INSTANCE : modifier;
                            z4 = i6 == 0 ? true : z;
                            z5 = i7 == 0 ? false : z2;
                            TextStyle textStyle4 = i8 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                            KeyboardOptions keyboardOptions4 = i9 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                            keyboardActions2 = i10 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                            boolean z10 = i11 == 0 ? false : z3;
                            int i26 = i12 == 0 ? Integer.MAX_VALUE : i;
                            VisualTransformation none = i13 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                            Function1 function14 = i15 == 0 ? new Function1() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                public final void invoke(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((TextLayoutResult) obj);
                                    return Unit.INSTANCE;
                                }
                            } : function1;
                            if (i16 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue4;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i4 & 8192) == 0) {
                                modifier2 = modifier5;
                                z6 = z10;
                                i18 = i26;
                                brush2 = new SolidColor(Color.INSTANCE.m1456getBlack0d7_KjU(), null);
                                i24 &= -7169;
                            } else {
                                modifier2 = modifier5;
                                z6 = z10;
                                i18 = i26;
                                brush2 = brush;
                            }
                            if (i17 == 0) {
                                z7 = z6;
                                function32 = ComposableSingletons$BasicTextFieldKt.INSTANCE.m523getLambda1$foundation_release();
                                textStyle2 = textStyle4;
                                keyboardOptions2 = keyboardOptions4;
                                modifier3 = modifier2;
                            } else {
                                modifier3 = modifier2;
                                z7 = z6;
                                function32 = function3;
                                textStyle2 = textStyle4;
                                keyboardOptions2 = keyboardOptions4;
                            }
                            i19 = i24;
                            function12 = function14;
                            visualTransformation2 = none;
                            i20 = i18;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 8192) != 0) {
                                i24 &= -7169;
                            }
                            modifier3 = modifier;
                            z4 = z;
                            z5 = z2;
                            textStyle2 = textStyle;
                            keyboardOptions2 = keyboardOptions;
                            keyboardActions2 = keyboardActions;
                            z7 = z3;
                            i20 = i;
                            visualTransformation2 = visualTransformation;
                            mutableInteractionSource2 = mutableInteractionSource;
                            brush2 = brush;
                            function32 = function3;
                            i19 = i24;
                            function12 = function1;
                        }
                        startRestartGroup.endDefaults();
                        int i27 = i20;
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue = startRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (rememberedValue == companion.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(value, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceableGroup();
                        final MutableState mutableState = (MutableState) rememberedValue;
                        TextFieldValue m2381copy3r_uNRQ$default = TextFieldValue.m2381copy3r_uNRQ$default(m512BasicTextField$lambda2(mutableState), value, 0L, (TextRange) null, 6, (Object) null);
                        startRestartGroup.startReplaceableGroup(1157296644);
                        changed = startRestartGroup.changed(value);
                        boolean z11 = z5;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue2 == companion.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceableGroup();
                        final MutableState mutableState2 = (MutableState) rememberedValue2;
                        ImeOptions imeOptions$foundation_release = keyboardOptions2.toImeOptions$foundation_release(z7);
                        boolean z12 = !z7;
                        int i28 = !z7 ? 1 : i27;
                        startRestartGroup.startReplaceableGroup(1618982084);
                        KeyboardOptions keyboardOptions5 = keyboardOptions2;
                        changed2 = startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2) | startRestartGroup.changed(onValueChange);
                        boolean z13 = z7;
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed2 || rememberedValue3 == companion.getEmpty()) {
                            rememberedValue3 = new Function1() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((TextFieldValue) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull TextFieldValue newTextFieldValueState) {
                                    String m514BasicTextField$lambda5;
                                    Intrinsics.checkNotNullParameter(newTextFieldValueState, "newTextFieldValueState");
                                    mutableState.setValue(newTextFieldValueState);
                                    m514BasicTextField$lambda5 = BasicTextFieldKt.m514BasicTextField$lambda5(mutableState2);
                                    boolean areEqual = Intrinsics.areEqual(m514BasicTextField$lambda5, newTextFieldValueState.getText());
                                    mutableState2.setValue(newTextFieldValueState.getText());
                                    if (areEqual) {
                                        return;
                                    }
                                    Function1.this.invoke(newTextFieldValueState.getText());
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceableGroup();
                        int i29 = i19 << 12;
                        int i30 = i25 >> 3;
                        CoreTextFieldKt.CoreTextField(m2381copy3r_uNRQ$default, (Function1) rememberedValue3, modifier3, textStyle2, visualTransformation2, function12, mutableInteractionSource2, brush2, z12, i28, imeOptions$foundation_release, keyboardActions2, z4, z11, function32, startRestartGroup, (i25 & 896) | ((i25 >> 6) & 7168) | (i29 & 57344) | (i29 & 458752) | (3670016 & i29) | (i29 & 29360128), (i30 & 7168) | ((i25 >> 18) & 112) | (i30 & 896) | (i19 & 57344), 0);
                        z8 = z11;
                        textStyle3 = textStyle2;
                        visualTransformation3 = visualTransformation2;
                        function13 = function12;
                        brush3 = brush2;
                        keyboardOptions3 = keyboardOptions5;
                        z9 = z13;
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        i21 = i27;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        z4 = z;
                        z8 = z2;
                        textStyle3 = textStyle;
                        keyboardOptions3 = keyboardOptions;
                        keyboardActions2 = keyboardActions;
                        z9 = z3;
                        i21 = i;
                        visualTransformation3 = visualTransformation;
                        function13 = function1;
                        mutableInteractionSource3 = mutableInteractionSource;
                        brush3 = brush;
                        function32 = function3;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    final boolean z14 = z4;
                    final TextStyle textStyle5 = textStyle3;
                    final KeyboardOptions keyboardOptions6 = keyboardOptions3;
                    final KeyboardActions keyboardActions3 = keyboardActions2;
                    final int i31 = i21;
                    final VisualTransformation visualTransformation4 = visualTransformation3;
                    final Function1 function15 = function13;
                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                    final Brush brush4 = brush3;
                    final Function3 function33 = function32;
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i32) {
                            BasicTextFieldKt.BasicTextField(value, onValueChange, modifier4, z14, z8, textStyle5, keyboardOptions6, keyboardActions3, z9, i31, visualTransformation4, function15, mutableInteractionSource4, brush4, function33, composer2, i2 | 1, i3, i4);
                        }
                    });
                    return;
                }
                if ((i3 & 7168) == 0) {
                }
                i17 = i4 & 16384;
                if (i17 == 0) {
                }
                int i252 = i5;
                if ((i5 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i22 == 0) {
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
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if ((i4 & 8192) == 0) {
                }
                if (i17 == 0) {
                }
                i19 = i24;
                function12 = function14;
                visualTransformation2 = none;
                i20 = i18;
                startRestartGroup.endDefaults();
                int i272 = i20;
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState<TextFieldValue> mutableState3 = (MutableState) rememberedValue;
                TextFieldValue m2381copy3r_uNRQ$default2 = TextFieldValue.m2381copy3r_uNRQ$default(m512BasicTextField$lambda2(mutableState3), value, 0L, (TextRange) null, 6, (Object) null);
                startRestartGroup.startReplaceableGroup(1157296644);
                changed = startRestartGroup.changed(value);
                boolean z112 = z5;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                final MutableState<String> mutableState22 = (MutableState) rememberedValue2;
                ImeOptions imeOptions$foundation_release2 = keyboardOptions2.toImeOptions$foundation_release(z7);
                boolean z122 = !z7;
                if (!z7) {
                }
                startRestartGroup.startReplaceableGroup(1618982084);
                KeyboardOptions keyboardOptions52 = keyboardOptions2;
                changed2 = startRestartGroup.changed(mutableState3) | startRestartGroup.changed(mutableState22) | startRestartGroup.changed(onValueChange);
                boolean z132 = z7;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue3 = new Function1() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TextFieldValue) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TextFieldValue newTextFieldValueState) {
                        String m514BasicTextField$lambda5;
                        Intrinsics.checkNotNullParameter(newTextFieldValueState, "newTextFieldValueState");
                        mutableState3.setValue(newTextFieldValueState);
                        m514BasicTextField$lambda5 = BasicTextFieldKt.m514BasicTextField$lambda5(mutableState22);
                        boolean areEqual = Intrinsics.areEqual(m514BasicTextField$lambda5, newTextFieldValueState.getText());
                        mutableState22.setValue(newTextFieldValueState.getText());
                        if (areEqual) {
                            return;
                        }
                        Function1.this.invoke(newTextFieldValueState.getText());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                int i292 = i19 << 12;
                int i302 = i252 >> 3;
                CoreTextFieldKt.CoreTextField(m2381copy3r_uNRQ$default2, (Function1) rememberedValue3, modifier3, textStyle2, visualTransformation2, function12, mutableInteractionSource2, brush2, z122, i28, imeOptions$foundation_release2, keyboardActions2, z4, z112, function32, startRestartGroup, (i252 & 896) | ((i252 >> 6) & 7168) | (i292 & 57344) | (i292 & 458752) | (3670016 & i292) | (i292 & 29360128), (i302 & 7168) | ((i252 >> 18) & 112) | (i302 & 896) | (i19 & 57344), 0);
                z8 = z112;
                textStyle3 = textStyle2;
                visualTransformation3 = visualTransformation2;
                function13 = function12;
                brush3 = brush2;
                keyboardOptions3 = keyboardOptions52;
                z9 = z132;
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                i21 = i272;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i10 = i4 & 128;
            if (i10 != 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i4 & 512;
            if (i12 != 0) {
            }
            i13 = i4 & 1024;
            if (i13 != 0) {
            }
            i15 = i4 & 2048;
            if (i15 != 0) {
            }
            int i242 = i14;
            i16 = i4 & 4096;
            if (i16 != 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            i17 = i4 & 16384;
            if (i17 == 0) {
            }
            int i2522 = i5;
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i22 == 0) {
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
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if ((i4 & 8192) == 0) {
            }
            if (i17 == 0) {
            }
            i19 = i242;
            function12 = function14;
            visualTransformation2 = none;
            i20 = i18;
            startRestartGroup.endDefaults();
            int i2722 = i20;
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState<TextFieldValue> mutableState32 = (MutableState) rememberedValue;
            TextFieldValue m2381copy3r_uNRQ$default22 = TextFieldValue.m2381copy3r_uNRQ$default(m512BasicTextField$lambda2(mutableState32), value, 0L, (TextRange) null, 6, (Object) null);
            startRestartGroup.startReplaceableGroup(1157296644);
            changed = startRestartGroup.changed(value);
            boolean z1122 = z5;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            final MutableState<String> mutableState222 = (MutableState) rememberedValue2;
            ImeOptions imeOptions$foundation_release22 = keyboardOptions2.toImeOptions$foundation_release(z7);
            boolean z1222 = !z7;
            if (!z7) {
            }
            startRestartGroup.startReplaceableGroup(1618982084);
            KeyboardOptions keyboardOptions522 = keyboardOptions2;
            changed2 = startRestartGroup.changed(mutableState32) | startRestartGroup.changed(mutableState222) | startRestartGroup.changed(onValueChange);
            boolean z1322 = z7;
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = new Function1() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((TextFieldValue) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull TextFieldValue newTextFieldValueState) {
                    String m514BasicTextField$lambda5;
                    Intrinsics.checkNotNullParameter(newTextFieldValueState, "newTextFieldValueState");
                    mutableState32.setValue(newTextFieldValueState);
                    m514BasicTextField$lambda5 = BasicTextFieldKt.m514BasicTextField$lambda5(mutableState222);
                    boolean areEqual = Intrinsics.areEqual(m514BasicTextField$lambda5, newTextFieldValueState.getText());
                    mutableState222.setValue(newTextFieldValueState.getText());
                    if (areEqual) {
                        return;
                    }
                    Function1.this.invoke(newTextFieldValueState.getText());
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            int i2922 = i19 << 12;
            int i3022 = i2522 >> 3;
            CoreTextFieldKt.CoreTextField(m2381copy3r_uNRQ$default22, (Function1) rememberedValue3, modifier3, textStyle2, visualTransformation2, function12, mutableInteractionSource2, brush2, z1222, i28, imeOptions$foundation_release22, keyboardActions2, z4, z1122, function32, startRestartGroup, (i2522 & 896) | ((i2522 >> 6) & 7168) | (i2922 & 57344) | (i2922 & 458752) | (3670016 & i2922) | (i2922 & 29360128), (i3022 & 7168) | ((i2522 >> 18) & 112) | (i3022 & 896) | (i19 & 57344), 0);
            z8 = z1122;
            textStyle3 = textStyle2;
            visualTransformation3 = visualTransformation2;
            function13 = function12;
            brush3 = brush2;
            keyboardOptions3 = keyboardOptions522;
            z9 = z1322;
            modifier4 = modifier3;
            mutableInteractionSource3 = mutableInteractionSource2;
            i21 = i2722;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 8;
        int i232 = 1024;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i10 = i4 & 128;
        if (i10 != 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i4 & 512;
        if (i12 != 0) {
        }
        i13 = i4 & 1024;
        if (i13 != 0) {
        }
        i15 = i4 & 2048;
        if (i15 != 0) {
        }
        int i2422 = i14;
        i16 = i4 & 4096;
        if (i16 != 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        i17 = i4 & 16384;
        if (i17 == 0) {
        }
        int i25222 = i5;
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i22 == 0) {
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
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if ((i4 & 8192) == 0) {
        }
        if (i17 == 0) {
        }
        i19 = i2422;
        function12 = function14;
        visualTransformation2 = none;
        i20 = i18;
        startRestartGroup.endDefaults();
        int i27222 = i20;
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState<TextFieldValue> mutableState322 = (MutableState) rememberedValue;
        TextFieldValue m2381copy3r_uNRQ$default222 = TextFieldValue.m2381copy3r_uNRQ$default(m512BasicTextField$lambda2(mutableState322), value, 0L, (TextRange) null, 6, (Object) null);
        startRestartGroup.startReplaceableGroup(1157296644);
        changed = startRestartGroup.changed(value);
        boolean z11222 = z5;
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        final MutableState<String> mutableState2222 = (MutableState) rememberedValue2;
        ImeOptions imeOptions$foundation_release222 = keyboardOptions2.toImeOptions$foundation_release(z7);
        boolean z12222 = !z7;
        if (!z7) {
        }
        startRestartGroup.startReplaceableGroup(1618982084);
        KeyboardOptions keyboardOptions5222 = keyboardOptions2;
        changed2 = startRestartGroup.changed(mutableState322) | startRestartGroup.changed(mutableState2222) | startRestartGroup.changed(onValueChange);
        boolean z13222 = z7;
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = new Function1() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull TextFieldValue newTextFieldValueState) {
                String m514BasicTextField$lambda5;
                Intrinsics.checkNotNullParameter(newTextFieldValueState, "newTextFieldValueState");
                mutableState322.setValue(newTextFieldValueState);
                m514BasicTextField$lambda5 = BasicTextFieldKt.m514BasicTextField$lambda5(mutableState2222);
                boolean areEqual = Intrinsics.areEqual(m514BasicTextField$lambda5, newTextFieldValueState.getText());
                mutableState2222.setValue(newTextFieldValueState.getText());
                if (areEqual) {
                    return;
                }
                Function1.this.invoke(newTextFieldValueState.getText());
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        int i29222 = i19 << 12;
        int i30222 = i25222 >> 3;
        CoreTextFieldKt.CoreTextField(m2381copy3r_uNRQ$default222, (Function1) rememberedValue3, modifier3, textStyle2, visualTransformation2, function12, mutableInteractionSource2, brush2, z12222, i28, imeOptions$foundation_release222, keyboardActions2, z4, z11222, function32, startRestartGroup, (i25222 & 896) | ((i25222 >> 6) & 7168) | (i29222 & 57344) | (i29222 & 458752) | (3670016 & i29222) | (i29222 & 29360128), (i30222 & 7168) | ((i25222 >> 18) & 112) | (i30222 & 896) | (i19 & 57344), 0);
        z8 = z11222;
        textStyle3 = textStyle2;
        visualTransformation3 = visualTransformation2;
        function13 = function12;
        brush3 = brush2;
        keyboardOptions3 = keyboardOptions5222;
        z9 = z13222;
        modifier4 = modifier3;
        mutableInteractionSource3 = mutableInteractionSource2;
        i21 = i27222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldValue value, final Function1 onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1 function1, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, final int i2, final int i3, final int i4) {
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
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        boolean z4;
        int i18;
        Brush brush2;
        Modifier modifier3;
        int i19;
        Function3 function32;
        boolean z5;
        VisualTransformation visualTransformation2;
        Function1 function12;
        KeyboardActions keyboardActions2;
        MutableInteractionSource mutableInteractionSource3;
        boolean z6;
        Brush brush3;
        TextStyle textStyle2;
        KeyboardOptions keyboardOptions2;
        boolean z7;
        boolean changed;
        Object rememberedValue;
        Composer composer2;
        final boolean z8;
        final Modifier modifier4;
        final boolean z9;
        final boolean z10;
        final KeyboardOptions keyboardOptions3;
        final TextStyle textStyle3;
        final KeyboardActions keyboardActions3;
        final int i20;
        final VisualTransformation visualTransformation3;
        final Function1 function13;
        final MutableInteractionSource mutableInteractionSource4;
        final Brush brush4;
        final Function3 function33;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-560482651);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i21 = i4 & 4;
        if (i21 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            int i22 = 1024;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else if ((i2 & 458752) == 0) {
                    i5 |= startRestartGroup.changed(textStyle) ? 131072 : 65536;
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= startRestartGroup.changed(keyboardActions) ? 8388608 : 4194304;
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= startRestartGroup.changed(z3) ? 67108864 : 33554432;
                }
                i12 = i4 & 512;
                if (i12 != 0) {
                    i5 |= C.ENCODING_PCM_32BIT;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= startRestartGroup.changed(i) ? 536870912 : 268435456;
                }
                i13 = i4 & 1024;
                if (i13 != 0) {
                    i14 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i14 = i3 | (startRestartGroup.changed(visualTransformation) ? 4 : 2);
                } else {
                    i14 = i3;
                }
                i15 = i4 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i3 & 112) == 0) {
                    i14 |= startRestartGroup.changed(function1) ? 32 : 16;
                }
                int i23 = i14;
                i16 = i4 & 4096;
                if (i16 != 0) {
                    i23 |= 384;
                } else if ((i3 & 896) == 0) {
                    i23 |= startRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                    if ((i3 & 7168) == 0) {
                        if ((i4 & 8192) == 0 && startRestartGroup.changed(brush)) {
                            i22 = 2048;
                        }
                        i23 |= i22;
                    }
                    i17 = i4 & 16384;
                    if (i17 == 0) {
                        i23 |= 24576;
                    } else if ((i3 & 57344) == 0) {
                        i23 |= startRestartGroup.changed(function3) ? 16384 : 8192;
                    }
                    int i24 = i5;
                    if ((i5 & 1533916891) == 306783378 || (46811 & i23) != 9362 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i21 == 0 ? Modifier.INSTANCE : modifier;
                            boolean z11 = i6 == 0 ? true : z;
                            boolean z12 = i7 == 0 ? false : z2;
                            TextStyle textStyle4 = i8 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle;
                            KeyboardOptions keyboardOptions4 = i9 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                            KeyboardActions keyboardActions4 = i10 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                            boolean z13 = i11 == 0 ? false : z3;
                            int i25 = i12 == 0 ? Integer.MAX_VALUE : i;
                            VisualTransformation none = i13 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                            Function1 function14 = i15 == 0 ? new Function1() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
                                public final void invoke(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((TextLayoutResult) obj);
                                    return Unit.INSTANCE;
                                }
                            } : function1;
                            if (i16 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i4 & 8192) == 0) {
                                modifier2 = modifier5;
                                z4 = z13;
                                i18 = i25;
                                brush2 = new SolidColor(Color.INSTANCE.m1456getBlack0d7_KjU(), null);
                                i23 &= -7169;
                            } else {
                                modifier2 = modifier5;
                                z4 = z13;
                                i18 = i25;
                                brush2 = brush;
                            }
                            if (i17 == 0) {
                                modifier3 = modifier2;
                                i19 = i18;
                                function32 = ComposableSingletons$BasicTextFieldKt.INSTANCE.m524getLambda2$foundation_release();
                            } else {
                                modifier3 = modifier2;
                                i19 = i18;
                                function32 = function3;
                            }
                            z5 = z11;
                            visualTransformation2 = none;
                            function12 = function14;
                            keyboardActions2 = keyboardActions4;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z6 = z12;
                            brush3 = brush2;
                            textStyle2 = textStyle4;
                            keyboardOptions2 = keyboardOptions4;
                            z7 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 8192) != 0) {
                                i23 &= -7169;
                            }
                            modifier3 = modifier;
                            z5 = z;
                            z6 = z2;
                            textStyle2 = textStyle;
                            keyboardOptions2 = keyboardOptions;
                            keyboardActions2 = keyboardActions;
                            z7 = z3;
                            i19 = i;
                            visualTransformation2 = visualTransformation;
                            function12 = function1;
                            mutableInteractionSource3 = mutableInteractionSource;
                            brush3 = brush;
                            function32 = function3;
                        }
                        startRestartGroup.endDefaults();
                        ImeOptions imeOptions$foundation_release = keyboardOptions2.toImeOptions$foundation_release(z7);
                        boolean z14 = !z7;
                        int i26 = !z7 ? 1 : i19;
                        startRestartGroup.startReplaceableGroup(511388516);
                        changed = startRestartGroup.changed(value) | startRestartGroup.changed(onValueChange);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function1() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((TextFieldValue) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull TextFieldValue it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    if (Intrinsics.areEqual(TextFieldValue.this, it)) {
                                        return;
                                    }
                                    onValueChange.invoke(it);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceableGroup();
                        int i27 = i23 << 12;
                        int i28 = i24 >> 3;
                        composer2 = startRestartGroup;
                        CoreTextFieldKt.CoreTextField(value, (Function1) rememberedValue, modifier3, textStyle2, visualTransformation2, function12, mutableInteractionSource3, brush3, z14, i26, imeOptions$foundation_release, keyboardActions2, z5, z6, function32, composer2, (i24 & EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_PAID_VALUE) | ((i24 >> 6) & 7168) | (i27 & 57344) | (i27 & 458752) | (i27 & 3670016) | (i27 & 29360128), (i28 & 7168) | ((i24 >> 18) & 112) | (i28 & 896) | (i23 & 57344), 0);
                        z8 = z7;
                        modifier4 = modifier3;
                        z9 = z5;
                        z10 = z6;
                        keyboardOptions3 = keyboardOptions2;
                        textStyle3 = textStyle2;
                        keyboardActions3 = keyboardActions2;
                        i20 = i19;
                        visualTransformation3 = visualTransformation2;
                        function13 = function12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        brush4 = brush3;
                        function33 = function32;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        z9 = z;
                        z10 = z2;
                        textStyle3 = textStyle;
                        keyboardOptions3 = keyboardOptions;
                        keyboardActions3 = keyboardActions;
                        z8 = z3;
                        visualTransformation3 = visualTransformation;
                        function13 = function1;
                        mutableInteractionSource4 = mutableInteractionSource;
                        brush4 = brush;
                        function33 = function3;
                        composer2 = startRestartGroup;
                        i20 = i;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i29) {
                            BasicTextFieldKt.BasicTextField(TextFieldValue.this, onValueChange, modifier4, z9, z10, textStyle3, keyboardOptions3, keyboardActions3, z8, i20, visualTransformation3, function13, mutableInteractionSource4, brush4, function33, composer3, i2 | 1, i3, i4);
                        }
                    });
                    return;
                }
                if ((i3 & 7168) == 0) {
                }
                i17 = i4 & 16384;
                if (i17 == 0) {
                }
                int i242 = i5;
                if ((i5 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i21 == 0) {
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
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if ((i4 & 8192) == 0) {
                }
                if (i17 == 0) {
                }
                z5 = z11;
                visualTransformation2 = none;
                function12 = function14;
                keyboardActions2 = keyboardActions4;
                mutableInteractionSource3 = mutableInteractionSource2;
                z6 = z12;
                brush3 = brush2;
                textStyle2 = textStyle4;
                keyboardOptions2 = keyboardOptions4;
                z7 = z4;
                startRestartGroup.endDefaults();
                ImeOptions imeOptions$foundation_release2 = keyboardOptions2.toImeOptions$foundation_release(z7);
                boolean z142 = !z7;
                if (!z7) {
                }
                startRestartGroup.startReplaceableGroup(511388516);
                changed = startRestartGroup.changed(value) | startRestartGroup.changed(onValueChange);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new Function1() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TextFieldValue) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TextFieldValue it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (Intrinsics.areEqual(TextFieldValue.this, it)) {
                            return;
                        }
                        onValueChange.invoke(it);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                int i272 = i23 << 12;
                int i282 = i242 >> 3;
                composer2 = startRestartGroup;
                CoreTextFieldKt.CoreTextField(value, (Function1) rememberedValue, modifier3, textStyle2, visualTransformation2, function12, mutableInteractionSource3, brush3, z142, i26, imeOptions$foundation_release2, keyboardActions2, z5, z6, function32, composer2, (i242 & EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_PAID_VALUE) | ((i242 >> 6) & 7168) | (i272 & 57344) | (i272 & 458752) | (i272 & 3670016) | (i272 & 29360128), (i282 & 7168) | ((i242 >> 18) & 112) | (i282 & 896) | (i23 & 57344), 0);
                z8 = z7;
                modifier4 = modifier3;
                z9 = z5;
                z10 = z6;
                keyboardOptions3 = keyboardOptions2;
                textStyle3 = textStyle2;
                keyboardActions3 = keyboardActions2;
                i20 = i19;
                visualTransformation3 = visualTransformation2;
                function13 = function12;
                mutableInteractionSource4 = mutableInteractionSource3;
                brush4 = brush3;
                function33 = function32;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i10 = i4 & 128;
            if (i10 != 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i4 & 512;
            if (i12 != 0) {
            }
            i13 = i4 & 1024;
            if (i13 != 0) {
            }
            i15 = i4 & 2048;
            if (i15 != 0) {
            }
            int i232 = i14;
            i16 = i4 & 4096;
            if (i16 != 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            i17 = i4 & 16384;
            if (i17 == 0) {
            }
            int i2422 = i5;
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i21 == 0) {
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
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if ((i4 & 8192) == 0) {
            }
            if (i17 == 0) {
            }
            z5 = z11;
            visualTransformation2 = none;
            function12 = function14;
            keyboardActions2 = keyboardActions4;
            mutableInteractionSource3 = mutableInteractionSource2;
            z6 = z12;
            brush3 = brush2;
            textStyle2 = textStyle4;
            keyboardOptions2 = keyboardOptions4;
            z7 = z4;
            startRestartGroup.endDefaults();
            ImeOptions imeOptions$foundation_release22 = keyboardOptions2.toImeOptions$foundation_release(z7);
            boolean z1422 = !z7;
            if (!z7) {
            }
            startRestartGroup.startReplaceableGroup(511388516);
            changed = startRestartGroup.changed(value) | startRestartGroup.changed(onValueChange);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new Function1() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((TextFieldValue) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull TextFieldValue it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (Intrinsics.areEqual(TextFieldValue.this, it)) {
                        return;
                    }
                    onValueChange.invoke(it);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            int i2722 = i232 << 12;
            int i2822 = i2422 >> 3;
            composer2 = startRestartGroup;
            CoreTextFieldKt.CoreTextField(value, (Function1) rememberedValue, modifier3, textStyle2, visualTransformation2, function12, mutableInteractionSource3, brush3, z1422, i26, imeOptions$foundation_release22, keyboardActions2, z5, z6, function32, composer2, (i2422 & EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_PAID_VALUE) | ((i2422 >> 6) & 7168) | (i2722 & 57344) | (i2722 & 458752) | (i2722 & 3670016) | (i2722 & 29360128), (i2822 & 7168) | ((i2422 >> 18) & 112) | (i2822 & 896) | (i232 & 57344), 0);
            z8 = z7;
            modifier4 = modifier3;
            z9 = z5;
            z10 = z6;
            keyboardOptions3 = keyboardOptions2;
            textStyle3 = textStyle2;
            keyboardActions3 = keyboardActions2;
            i20 = i19;
            visualTransformation3 = visualTransformation2;
            function13 = function12;
            mutableInteractionSource4 = mutableInteractionSource3;
            brush4 = brush3;
            function33 = function32;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 8;
        int i222 = 1024;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i10 = i4 & 128;
        if (i10 != 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i4 & 512;
        if (i12 != 0) {
        }
        i13 = i4 & 1024;
        if (i13 != 0) {
        }
        i15 = i4 & 2048;
        if (i15 != 0) {
        }
        int i2322 = i14;
        i16 = i4 & 4096;
        if (i16 != 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        i17 = i4 & 16384;
        if (i17 == 0) {
        }
        int i24222 = i5;
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i21 == 0) {
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
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if ((i4 & 8192) == 0) {
        }
        if (i17 == 0) {
        }
        z5 = z11;
        visualTransformation2 = none;
        function12 = function14;
        keyboardActions2 = keyboardActions4;
        mutableInteractionSource3 = mutableInteractionSource2;
        z6 = z12;
        brush3 = brush2;
        textStyle2 = textStyle4;
        keyboardOptions2 = keyboardOptions4;
        z7 = z4;
        startRestartGroup.endDefaults();
        ImeOptions imeOptions$foundation_release222 = keyboardOptions2.toImeOptions$foundation_release(z7);
        boolean z14222 = !z7;
        if (!z7) {
        }
        startRestartGroup.startReplaceableGroup(511388516);
        changed = startRestartGroup.changed(value) | startRestartGroup.changed(onValueChange);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new Function1() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull TextFieldValue it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (Intrinsics.areEqual(TextFieldValue.this, it)) {
                    return;
                }
                onValueChange.invoke(it);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        int i27222 = i2322 << 12;
        int i28222 = i24222 >> 3;
        composer2 = startRestartGroup;
        CoreTextFieldKt.CoreTextField(value, (Function1) rememberedValue, modifier3, textStyle2, visualTransformation2, function12, mutableInteractionSource3, brush3, z14222, i26, imeOptions$foundation_release222, keyboardActions2, z5, z6, function32, composer2, (i24222 & EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_PAID_VALUE) | ((i24222 >> 6) & 7168) | (i27222 & 57344) | (i27222 & 458752) | (i27222 & 3670016) | (i27222 & 29360128), (i28222 & 7168) | ((i24222 >> 18) & 112) | (i28222 & 896) | (i2322 & 57344), 0);
        z8 = z7;
        modifier4 = modifier3;
        z9 = z5;
        z10 = z6;
        keyboardOptions3 = keyboardOptions2;
        textStyle3 = textStyle2;
        keyboardActions3 = keyboardActions2;
        i20 = i19;
        visualTransformation3 = visualTransformation2;
        function13 = function12;
        mutableInteractionSource4 = mutableInteractionSource3;
        brush4 = brush3;
        function33 = function32;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: BasicTextField$lambda-2, reason: not valid java name */
    private static final TextFieldValue m512BasicTextField$lambda2(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BasicTextField$lambda-5, reason: not valid java name */
    public static final String m514BasicTextField$lambda5(MutableState mutableState) {
        return (String) mutableState.getValue();
    }
}
