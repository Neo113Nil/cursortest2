package gbcorp.c312.merkmarker.info.ui.composable.screen.checkout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import gbcorp.c312.merkmarker.info.R;
import gbcorp.c312.merkmarker.info.data.entity.MRKMROrderEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckoutDialog.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"CheckoutDialog", "", "order", "Lgbcorp/c312/merkmarker/info/data/entity/MRKMROrderEntity;", "onConfirm", "Lkotlin/Function0;", "(Lgbcorp/c312/merkmarker/info/data/entity/MRKMROrderEntity;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckoutDialog$lambda$3(MRKMROrderEntity mRKMROrderEntity, Function0 function0, int i, Composer composer, int i2) {
        CheckoutDialog(mRKMROrderEntity, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CheckoutDialog(final MRKMROrderEntity order, final Function0<Unit> onConfirm, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Composer startRestartGroup = composer.startRestartGroup(1701033304);
        ComposerKt.sourceInformation(startRestartGroup, "C(CheckoutDialog)N(order,onConfirm)26@1016L11,25@953L22,53@2114L523,36@1383L705,24@913L1731:CheckoutDialog.kt#v79pgw");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(order) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onConfirm) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1701033304, i2, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.CheckoutDialog (CheckoutDialog.kt:23)");
            }
            long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurfaceVariant();
            RoundedCornerShape m1284RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(24));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1689530642, "CC(remember):CheckoutDialog.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.CheckoutDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1976AlertDialogOix01E0((Function0) rememberedValue, ComposableLambdaKt.rememberComposableLambda(102901776, true, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.CheckoutDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CheckoutDialog$lambda$1;
                    CheckoutDialog$lambda$1 = CheckoutDialogKt.CheckoutDialog$lambda$1(Function0.this, (Composer) obj, ((Integer) obj2).intValue());
                    return CheckoutDialog$lambda$1;
                }
            }, startRestartGroup, 54), null, null, null, ComposableSingletons$CheckoutDialogKt.INSTANCE.m9540getLambda$1119636340$app_release(), ComposableLambdaKt.rememberComposableLambda(-1425270869, true, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.CheckoutDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CheckoutDialog$lambda$2;
                    CheckoutDialog$lambda$2 = CheckoutDialogKt.CheckoutDialog$lambda$2(MRKMROrderEntity.this, (Composer) obj, ((Integer) obj2).intValue());
                    return CheckoutDialog$lambda$2;
                }
            }, startRestartGroup, 54), m1284RoundedCornerShape0680j_4, surfaceVariant, 0L, 0L, 0L, 0.0f, null, composer2, 1769526, 0, 15900);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.CheckoutDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CheckoutDialog$lambda$3;
                    CheckoutDialog$lambda$3 = CheckoutDialogKt.CheckoutDialog$lambda$3(MRKMROrderEntity.this, onConfirm, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CheckoutDialog$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckoutDialog$lambda$2(MRKMROrderEntity mRKMROrderEntity, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C37@1397L681:CheckoutDialog.kt#v79pgw");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1425270869, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.CheckoutDialog.<anonymous> (CheckoutDialog.kt:37)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m4643constructorimpl = Updater.m4643constructorimpl(composer);
            Updater.m4651setimpl(m4643constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1596473068, "C39@1455L72,40@1571L11,38@1422L275,44@1714L60,46@1824L59,47@1927L11,45@1791L273:CheckoutDialog.kt#v79pgw");
            TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(R.string.checkout_dialog_order_number, new Object[]{mRKMROrderEntity.getOrderNumber()}, composer, 0), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), null, TextUnitKt.getSp(15), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597440, 0, 262058);
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(8)), composer, 6);
            TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(R.string.checkout_dialog_processing_message, composer, 0), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, TextUnitKt.getSp(14), null, FontWeight.INSTANCE.getNormal(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1597440, 0, 262058);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckoutDialog$lambda$1(Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C58@2351L11,59@2421L11,57@2275L186,54@2128L499:CheckoutDialog.kt#v79pgw");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(102901776, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.checkout.CheckoutDialog.<anonymous> (CheckoutDialog.kt:54)");
            }
            ButtonKt.FilledTonalButton(function0, null, false, RoundedCornerShapeKt.m1284RoundedCornerShape0680j_4(Dp.m8227constructorimpl(12)), ButtonDefaults.INSTANCE.m2068filledTonalButtonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary(), 0L, 0L, composer, ButtonDefaults.$stable << 12, 12), null, null, null, null, ComposableSingletons$CheckoutDialogKt.INSTANCE.getLambda$840716158$app_release(), composer, 805306368, 486);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
