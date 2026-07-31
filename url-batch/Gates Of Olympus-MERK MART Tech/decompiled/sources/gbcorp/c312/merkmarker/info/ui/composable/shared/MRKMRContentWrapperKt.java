package gbcorp.c312.merkmarker.info.ui.composable.shared;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.exifinterface.media.ExifInterface;
import gbcorp.c312.merkmarker.info.ui.state.MRKMRDataUiState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MRKMRContentWrapper.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001af\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\t2\u0013\b\u0002\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"MRKMRContentWrapper", "", ExifInterface.GPS_DIRECTION_TRUE, "modifier", "Landroidx/compose/ui/Modifier;", "dataState", "Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;", "dataPopulated", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "dataEmpty", "dataInitial", "(Landroidx/compose/ui/Modifier;Lgbcorp/c312/merkmarker/info/ui/state/MRKMRDataUiState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMRContentWrapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MRKMRContentWrapper$lambda$1(Modifier modifier, MRKMRDataUiState mRKMRDataUiState, Function2 function2, Function2 function22, Function2 function23, int i, int i2, Composer composer, int i3) {
        MRKMRContentWrapper(modifier, mRKMRDataUiState, function2, function22, function23, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <T> void MRKMRContentWrapper(Modifier modifier, final MRKMRDataUiState<? extends T> dataState, final Function2<? super Composer, ? super Integer, Unit> dataPopulated, final Function2<? super Composer, ? super Integer, Unit> dataEmpty, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Intrinsics.checkNotNullParameter(dataPopulated, "dataPopulated");
        Intrinsics.checkNotNullParameter(dataEmpty, "dataEmpty");
        Composer startRestartGroup = composer.startRestartGroup(-1145809795);
        ComposerKt.sourceInformation(startRestartGroup, "C(MRKMRContentWrapper)N(modifier,dataState,dataPopulated,dataEmpty,dataInitial)15@499L332:MRKMRContentWrapper.kt#m5r16l");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(dataState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(dataPopulated) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(dataEmpty) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                function2 = ComposableSingletons$MRKMRContentWrapperKt.INSTANCE.getLambda$2108232491$app_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1145809795, i3, -1, "gbcorp.c312.merkmarker.info.ui.composable.shared.MRKMRContentWrapper (MRKMRContentWrapper.kt:14)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4643constructorimpl = Updater.m4643constructorimpl(startRestartGroup);
            Updater.m4651setimpl(m4643constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4647initimpl(m4643constructorimpl, Integer.valueOf(hashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4649reconcileimpl(m4643constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4651setimpl(m4643constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1493658909, "C:MRKMRContentWrapper.kt#m5r16l");
            if (dataState instanceof MRKMRDataUiState.Populated) {
                startRestartGroup.startReplaceGroup(1493714832);
                ComposerKt.sourceInformation(startRestartGroup, "18@616L15");
                dataPopulated.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                startRestartGroup.endReplaceGroup();
            } else if (Intrinsics.areEqual(dataState, MRKMRDataUiState.Empty.INSTANCE)) {
                startRestartGroup.startReplaceGroup(1493801012);
                ComposerKt.sourceInformation(startRestartGroup, "22@703L11");
                dataEmpty.invoke(startRestartGroup, Integer.valueOf((i3 >> 9) & 14));
                startRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.areEqual(dataState, MRKMRDataUiState.Initial.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(740919206);
                    startRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(1493885394);
                ComposerKt.sourceInformation(startRestartGroup, "26@788L13");
                function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                startRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: gbcorp.c312.merkmarker.info.ui.composable.shared.MRKMRContentWrapperKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MRKMRContentWrapper$lambda$1;
                    MRKMRContentWrapper$lambda$1 = MRKMRContentWrapperKt.MRKMRContentWrapper$lambda$1(Modifier.this, dataState, dataPopulated, dataEmpty, function22, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return MRKMRContentWrapper$lambda$1;
                }
            });
        }
    }
}
