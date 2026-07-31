package gbcorp.c312.merkmarker.info.ui.composable.screen.home;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.AddShoppingCartKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import gbcorp.c312.merkmarker.info.R;
import gbcorp.c312.merkmarker.info.ui.composable.shared.MRKMREmptyViewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MRKMRHomeScreen.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$MRKMRHomeScreenKt {
    public static final ComposableSingletons$MRKMRHomeScreenKt INSTANCE = new ComposableSingletons$MRKMRHomeScreenKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1891497550 = ComposableLambdaKt.composableLambdaInstance(1891497550, false, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.ComposableSingletons$MRKMRHomeScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Unit lambda_1891497550$lambda$0;
            lambda_1891497550$lambda$0 = ComposableSingletons$MRKMRHomeScreenKt.lambda_1891497550$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return lambda_1891497550$lambda$0;
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1721878608 = ComposableLambdaKt.composableLambdaInstance(1721878608, false, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.ComposableSingletons$MRKMRHomeScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Unit lambda_1721878608$lambda$0;
            lambda_1721878608$lambda$0 = ComposableSingletons$MRKMRHomeScreenKt.lambda_1721878608$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return lambda_1721878608$lambda$0;
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$712416003 = ComposableLambdaKt.composableLambdaInstance(712416003, false, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.ComposableSingletons$MRKMRHomeScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda_712416003$lambda$0;
            lambda_712416003$lambda$0 = ComposableSingletons$MRKMRHomeScreenKt.lambda_712416003$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda_712416003$lambda$0;
        }
    });

    /* renamed from: lambda$-987619326, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f135lambda$987619326 = ComposableLambdaKt.composableLambdaInstance(-987619326, false, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.ComposableSingletons$MRKMRHomeScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda__987619326$lambda$0;
            lambda__987619326$lambda$0 = ComposableSingletons$MRKMRHomeScreenKt.lambda__987619326$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda__987619326$lambda$0;
        }
    });

    /* renamed from: lambda$-2045724831, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f134lambda$2045724831 = ComposableLambdaKt.composableLambdaInstance(-2045724831, false, new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.home.ComposableSingletons$MRKMRHomeScreenKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit lambda__2045724831$lambda$0;
            lambda__2045724831$lambda$0 = ComposableSingletons$MRKMRHomeScreenKt.lambda__2045724831$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            return lambda__2045724831$lambda$0;
        }
    });

    /* renamed from: getLambda$-2045724831$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m9547getLambda$2045724831$app_release() {
        return f134lambda$2045724831;
    }

    /* renamed from: getLambda$-987619326$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m9548getLambda$987619326$app_release() {
        return f135lambda$987619326;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1721878608$app_release() {
        return lambda$1721878608;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1891497550$app_release() {
        return lambda$1891497550;
    }

    public final Function2<Composer, Integer, Unit> getLambda$712416003$app_release() {
        return lambda$712416003;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1891497550$lambda$0(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C116@5034L11,113@4875L1121:MRKMRHomeScreen.kt#70wte1");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1891497550, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.ComposableSingletons$MRKMRHomeScreenKt.lambda$1891497550.<anonymous> (MRKMRHomeScreen.kt:113)");
            }
            Modifier m930paddingVpY3zN4 = PaddingKt.m930paddingVpY3zN4(BackgroundKt.m300backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer(), null, 2, null), Dp.m8227constructorimpl(20), Dp.m8227constructorimpl(14));
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m930paddingVpY3zN4);
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
            Updater.m4651setimpl(m4643constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1707969709, "C119@5200L770:MRKMRHomeScreen.kt#70wte1");
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m4643constructorimpl2 = Updater.m4643constructorimpl(composer);
            Updater.m4651setimpl(m4643constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl2, Integer.valueOf(hashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -24841250, "C122@5373L10,124@5525L11,120@5241L349,128@5775L10,129@5855L11,126@5623L317:MRKMRHomeScreen.kt#70wte1");
            TextKt.m3259TextNvy7gAk("Rare & Seasonal Finds", null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer(), null, 0L, null, FontWeight.INSTANCE.getExtraBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, 1572870, 0, 131002);
            TextKt.m3259TextNvy7gAk("Curated from specialist growers each week", null, Color.m5392copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimaryContainer(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 131066);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
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
    public static final Unit lambda_1721878608$lambda$0(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C150@6656L41:MRKMRHomeScreen.kt#70wte1");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1721878608, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.ComposableSingletons$MRKMRHomeScreenKt.lambda$1721878608.<anonymous> (MRKMRHomeScreen.kt:150)");
            }
            SpacerKt.Spacer(SizeKt.m963height3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(16)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_712416003$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C156@6826L58,155@6776L182:MRKMRHomeScreen.kt#70wte1");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(712416003, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.ComposableSingletons$MRKMRHomeScreenKt.lambda$712416003.<anonymous> (MRKMRHomeScreen.kt:155)");
            }
            MRKMREmptyViewKt.MRKMREmptyView(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), StringResources_androidKt.stringResource(R.string.products_state_empty_primary_text, composer, 0), null, null, null, composer, 6, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__987619326$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C261@10424L45,260@10387L163:MRKMRHomeScreen.kt#70wte1");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-987619326, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.ComposableSingletons$MRKMRHomeScreenKt.lambda$-987619326.<anonymous> (MRKMRHomeScreen.kt:260)");
            }
            TextKt.m3259TextNvy7gAk(StringResources_androidKt.stringResource(R.string.all_categories_label, composer, 0), null, 0L, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 1572864, 0, 262078);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__2045724831$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C422@16862L231:MRKMRHomeScreen.kt#70wte1");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2045724831, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.home.ComposableSingletons$MRKMRHomeScreenKt.lambda$-2045724831.<anonymous> (MRKMRHomeScreen.kt:422)");
            }
            IconKt.m2553Iconww6aTOc(AddShoppingCartKt.getAddShoppingCart(Icons.Rounded.INSTANCE), "Add to basket", SizeKt.m977size3ABfNKs(Modifier.INSTANCE, Dp.m8227constructorimpl(18)), 0L, composer, 432, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
