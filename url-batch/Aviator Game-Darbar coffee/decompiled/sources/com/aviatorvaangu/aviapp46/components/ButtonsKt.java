package com.aviatorvaangu.aviapp46.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Buttons.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"PrimaryButton", "", "text", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "app"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class ButtonsKt {
    static final Unit PrimaryButton$lambda$1(String str, Function0 function0, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        PrimaryButton(str, function0, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrimaryButton(final String text, final Function0<Unit> onClick, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(595093119);
        ComposerKt.sourceInformation(startRestartGroup, "C(PrimaryButton)N(text,onClick,modifier,enabled)22@888L210,29@1165L75,17@708L532:Buttons.kt#xqf9wq");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                } else {
                    Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    boolean z4 = i4 != 0 ? true : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(595093119, i3, -1, "com.aviatorvaangu.aviapp46.components.PrimaryButton (Buttons.kt:16)");
                    }
                    Modifier m852height3ABfNKs = SizeKt.m852height3ABfNKs(companion, Dp.m7522constructorimpl(52.0f));
                    RoundedCornerShape m1128RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1128RoundedCornerShape0680j_4(Dp.m7522constructorimpl(16.0f));
                    Modifier modifier4 = companion;
                    ButtonColors m1765buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1765buttonColorsro_MJ88(AppColorsKt.getSkyBlue(), Color.INSTANCE.m4776getWhite0d7_KjU(), ColorKt.Color(4284096544L), ColorKt.Color(4290751146L), startRestartGroup, (ButtonDefaults.$stable << 12) | 3510, 0);
                    startRestartGroup = startRestartGroup;
                    int i6 = i3 >> 3;
                    z3 = z4;
                    ButtonKt.Button(onClick, m852height3ABfNKs, z3, m1128RoundedCornerShape0680j_4, m1765buttonColorsro_MJ88, null, null, PaddingKt.m815PaddingValuesYgX7TsA$default(Dp.m7522constructorimpl(20.0f), 0.0f, 2, null), null, ComposableLambdaKt.rememberComposableLambda(910142607, true, new Function3() { // from class: com.aviatorvaangu.aviapp46.components.ButtonsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return ButtonsKt.PrimaryButton$lambda$0(text, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i6 & 14) | 817889280 | (i6 & 896), 352);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.aviatorvaangu.aviapp46.components.ButtonsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ButtonsKt.PrimaryButton$lambda$1(text, onClick, modifier3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    static final Unit PrimaryButton$lambda$0(String str, RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C30@1175L59:Buttons.kt#xqf9wq");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(910142607, i, -1, "com.aviatorvaangu.aviapp46.components.PrimaryButton.<anonymous> (Buttons.kt:30)");
            }
            TextKt.m2714TextNvy7gAk(str, null, 0L, null, TextUnitKt.getSp(14), null, FontWeight.INSTANCE.getBlack(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597440, 0, 262062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
