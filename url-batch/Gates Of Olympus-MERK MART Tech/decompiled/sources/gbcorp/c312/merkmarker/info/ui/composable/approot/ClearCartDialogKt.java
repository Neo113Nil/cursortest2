package gbcorp.c312.merkmarker.info.ui.composable.approot;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClearCartDialog.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"ClearCartDialog", "", "modifier", "Landroidx/compose/ui/Modifier;", "onConfirm", "Lkotlin/Function0;", "onDismiss", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClearCartDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClearCartDialog$lambda$2(Modifier modifier, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        ClearCartDialog(modifier, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ClearCartDialog(Modifier modifier, final Function0<Unit> onConfirm, final Function0<Unit> onDismiss, Composer composer, final int i, final int i2) {
        int i3;
        Composer composer2;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(1499885212);
        ComposerKt.sourceInformation(startRestartGroup, "C(ClearCartDialog)N(modifier,onConfirm,onDismiss)24@864L11,39@1408L563,54@1997L267,22@774L1497:ClearCartDialog.kt#l2omj");
        if ((i & 48) == 0) {
            i3 = (startRestartGroup.changedInstance(onConfirm) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 145) != 144, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1499885212, i3, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.ClearCartDialog (ClearCartDialog.kt:21)");
            }
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1976AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(150666580, true, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.ClearCartDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ClearCartDialog$lambda$0;
                    ClearCartDialog$lambda$0 = ClearCartDialogKt.ClearCartDialog$lambda$0(Function0.this, (Composer) obj, ((Integer) obj2).intValue());
                    return ClearCartDialog$lambda$0;
                }
            }, startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-772500846, true, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.ClearCartDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ClearCartDialog$lambda$1;
                    ClearCartDialog$lambda$1 = ClearCartDialogKt.ClearCartDialog$lambda$1(Function0.this, (Composer) obj, ((Integer) obj2).intValue());
                    return ClearCartDialog$lambda$1;
                }
            }, startRestartGroup, 54), null, ComposableSingletons$ClearCartDialogKt.INSTANCE.m9513getLambda$1695668272$app_release(), ComposableSingletons$ClearCartDialogKt.INSTANCE.m9514getLambda$9768337$app_release(), RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurfaceVariant(), 0L, 0L, 0L, 0.0f, null, composer2, ((i3 >> 6) & 14) | 1772592, 0, 15892);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.approot.ClearCartDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ClearCartDialog$lambda$2;
                    ClearCartDialog$lambda$2 = ClearCartDialogKt.ClearCartDialog$lambda$2(Modifier.this, onConfirm, onDismiss, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ClearCartDialog$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClearCartDialog$lambda$1(Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C55@2011L243:ClearCartDialog.kt#l2omj");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-772500846, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.ClearCartDialog.<anonymous> (ClearCartDialog.kt:55)");
            }
            ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$ClearCartDialogKt.INSTANCE.getLambda$1905577781$app_release(), composer, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClearCartDialog$lambda$0(Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C44@1645L11,45@1715L11,43@1569L186,40@1422L539:ClearCartDialog.kt#l2omj");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(150666580, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.approot.ClearCartDialog.<anonymous> (ClearCartDialog.kt:40)");
            }
            ButtonKt.FilledTonalButton(function0, null, false, RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(12)), ButtonDefaults.INSTANCE.m2068filledTonalButtonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 12), null, null, null, null, ComposableSingletons$ClearCartDialogKt.INSTANCE.getLambda$857607106$app_release(), composer, 805306368, 486);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
