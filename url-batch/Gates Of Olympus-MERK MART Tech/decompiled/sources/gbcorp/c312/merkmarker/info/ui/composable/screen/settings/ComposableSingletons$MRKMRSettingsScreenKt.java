package gbcorp.c312.merkmarker.info.ui.composable.screen.settings;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import gbcorp.c312.merkmarker.info.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MRKMRSettingsScreen.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$MRKMRSettingsScreenKt {
    public static final ComposableSingletons$MRKMRSettingsScreenKt INSTANCE = new ComposableSingletons$MRKMRSettingsScreenKt();

    /* renamed from: lambda$-1062269955, reason: not valid java name */
    private static Function3<ColumnScope, Composer, Integer, Unit> f139lambda$1062269955 = ComposableLambdaKt.composableLambdaInstance(-1062269955, false, new Function3() { // from class: gbcorp.c312.merkmarker.info.ui.composable.screen.settings.ComposableSingletons$MRKMRSettingsScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Unit lambda__1062269955$lambda$0;
            lambda__1062269955$lambda$0 = ComposableSingletons$MRKMRSettingsScreenKt.lambda__1062269955$lambda$0((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return lambda__1062269955$lambda$0;
        }
    });

    /* renamed from: getLambda$-1062269955$app_release, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m9570getLambda$1062269955$app_release() {
        return f139lambda$1062269955;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1062269955$lambda$0(ColumnScope OutlinedCard, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(OutlinedCard, "$this$OutlinedCard");
        ComposerKt.sourceInformation(composer, "C47@1758L594:MRKMRSettingsScreen.kt#tidmvh");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062269955, i, -1, "gbcorp.c312.merkmarker.info.ui.composable.screen.settings.ComposableSingletons$MRKMRSettingsScreenKt.lambda$-1062269955.<anonymous> (MRKMRSettingsScreen.kt:47)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 1878366161, "C49@1824L50,50@1904L33,48@1783L173,53@2034L11,52@1973L168,57@2199L54,58@2283L36,56@2158L180:MRKMRSettingsScreen.kt#tidmvh");
            MRKMRSettingsScreenKt.SettingsRow(StringResources_androidKt.stringResource(R.string.settings_screen_app_label, composer, 0), StringResources_androidKt.stringResource(R.string.app_name, composer, 0), composer, 0);
            DividerKt.m2406HorizontalDivider9IZ8Weo(PaddingKt.m931paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8227constructorimpl(16), 0.0f, 2, null), 0.0f, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutline(), composer, 6, 2);
            MRKMRSettingsScreenKt.SettingsRow(StringResources_androidKt.stringResource(R.string.settings_screen_version_label, composer, 0), StringResources_androidKt.stringResource(R.string.app_version, composer, 0), composer, 0);
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
}
