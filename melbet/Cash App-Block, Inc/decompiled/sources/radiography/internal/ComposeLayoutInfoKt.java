package radiography.internal;

import android.view.View;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.core.AutoValue_CameraState_StateError;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.InsetsPaddingValues;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import androidx.compose.ui.tooling.data.CallGroup;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.data.NodeGroup;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.datastore.core.SimpleActor;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import coil3.network.NetworkFetcher$doFetch$2;
import com.google.mlkit.vision.text.internal.zzr;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.common.composeui.AddedPaddingValues;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ShowUninstalledTaxesFirst;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.money.applets.sections.AppletTileItem;
import com.squareup.cash.money.applets.sections.AppletTilePresentation;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.core.ids.UninstalledAppletSortOrder;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.EmptySequence;
import kotlin.sequences.FlatteningSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TakeWhileSequence$iterator$1;
import kotlin.sequences.TransformingSequence;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.internal.ZipFilesKt$$ExternalSyntheticLambda4;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import radiography.ScannableView;
import radiography.internal.ComposeLayoutInfo;
import radiography.internal.ComposeLayoutInfoKt;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes5.dex */
public abstract class ComposeLayoutInfoKt {
    public static final void ReceiptScaffold(Modifier modifier, ScrollState scrollState, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Function2 function2, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl3;
        GapComposer gapComposer;
        ScrollState scrollState2;
        PaddingValues paddingValues2;
        int i2;
        ScrollState rememberScrollState;
        PaddingValues m295PaddingValuesYgX7TsA$default;
        ScrollState scrollState3;
        Object swipeToDismissKt$$ExternalSyntheticLambda3;
        PaddingValues paddingValues3;
        boolean z;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(884950420);
        Applier applier = gapComposer2.applier;
        int i3 = i | (gapComposer2.changed(modifier) ? 4 : 2) | 400 | (gapComposer2.changedInstance(function2) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                i2 = i3 & (-113);
                rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
                m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 3);
            } else {
                gapComposer2.skipToGroupEnd();
                m295PaddingValuesYgX7TsA$default = paddingValues;
                i2 = i3 & (-113);
                rememberScrollState = scrollState;
            }
            gapComposer2.endDefaults();
            Boolean bool = Boolean.TRUE;
            boolean changed = gapComposer2.changed(rememberScrollState);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Continuation continuation = null;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new NetworkFetcher$doFetch$2(rememberScrollState, continuation, 26);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState produceState = Updater.produceState(gapComposer2, bool, (Function2) rememberedValue);
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) produceState.getValue()).booleanValue() ? 1.0f : 0.0f, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, null, 6), null, null, gapComposer2, 48, 28);
            State animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState((((Boolean) produceState.getValue()).booleanValue() && rememberScrollState.getCanScrollForward()) ? 1.0f : RecyclerView.DECELERATION_RATE, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, null, 6), null, null, gapComposer2, 48, 28);
            gapComposer = gapComposer2;
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            composableLambdaImpl3 = composableLambdaImpl;
            composableLambdaImpl3.invoke((Object) ColumnScopeInstance.INSTANCE, (Object) gapComposer, (Object) 54);
            if (function2 == null) {
                gapComposer.startReplaceGroup(-1806193010);
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), rememberScrollState, false, 14);
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                InsetsPaddingValues asPaddingValues = SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer).navigationBars, gapComposer);
                m295PaddingValuesYgX7TsA$default.getClass();
                Modifier padding = SpacerKt.padding(verticalScroll$default, new AddedPaddingValues(m295PaddingValuesYgX7TsA$default, asPaddingValues));
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, padding);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                composableLambdaImpl2.invoke((Object) gapComposer, (Object) 6);
                gapComposer.end(true);
                gapComposer.end(false);
                scrollState3 = rememberScrollState;
                paddingValues3 = m295PaddingValuesYgX7TsA$default;
                z = true;
            } else {
                gapComposer.startReplaceGroup(-1805621773);
                boolean changed2 = gapComposer.changed(animateFloatAsState2) | ((i2 & 57344) == 16384) | gapComposer.changed(rememberScrollState) | gapComposer.changed(animateFloatAsState);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    scrollState3 = rememberScrollState;
                    paddingValues3 = m295PaddingValuesYgX7TsA$default;
                    swipeToDismissKt$$ExternalSyntheticLambda3 = new SwipeToDismissKt$$ExternalSyntheticLambda3(function2, animateFloatAsState2, scrollState3, paddingValues3, composableLambdaImpl2, animateFloatAsState, 5);
                    gapComposer.updateRememberedValue(swipeToDismissKt$$ExternalSyntheticLambda3);
                } else {
                    scrollState3 = rememberScrollState;
                    swipeToDismissKt$$ExternalSyntheticLambda3 = rememberedValue2;
                    paddingValues3 = m295PaddingValuesYgX7TsA$default;
                }
                z = true;
                RulerKt.SubcomposeLayout((Modifier) null, (Function2) swipeToDismissKt$$ExternalSyntheticLambda3, gapComposer, 0, 1);
                gapComposer.end(false);
            }
            gapComposer.end(z);
            scrollState2 = scrollState3;
            paddingValues2 = paddingValues3;
        } else {
            composableLambdaImpl3 = composableLambdaImpl;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            scrollState2 = scrollState;
            paddingValues2 = paddingValues;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissKt$$ExternalSyntheticLambda3(modifier, scrollState2, paddingValues2, composableLambdaImpl3, function2, composableLambdaImpl2, i);
        }
    }

    public static final int access$clientUninstalledSectionSortValue(AppletTileItem appletTileItem, zzr zzrVar) {
        AppletId appletId = appletTileItem.appletId;
        appletId.getClass();
        switch (appletId.ordinal()) {
            case 0:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr = UninstalledAppletSortOrder.$VALUES;
                return 3;
            case 1:
                return -2;
            case 2:
                return -4;
            case 3:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr2 = UninstalledAppletSortOrder.$VALUES;
                return 7;
            case 4:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr3 = UninstalledAppletSortOrder.$VALUES;
                return 10;
            case 5:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr4 = UninstalledAppletSortOrder.$VALUES;
                return 4;
            case 6:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr5 = UninstalledAppletSortOrder.$VALUES;
                return 1;
            case 7:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr6 = UninstalledAppletSortOrder.$VALUES;
                return 2;
            case 8:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr7 = UninstalledAppletSortOrder.$VALUES;
                return 5;
            case 9:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr8 = UninstalledAppletSortOrder.$VALUES;
                return 6;
            case 10:
                if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) zzrVar.zza)).peekCurrentValue(LaunchDarklyFeatureFlags$ShowUninstalledTaxesFirst.INSTANCE)).enabled()) {
                    return -6;
                }
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr9 = UninstalledAppletSortOrder.$VALUES;
                return 11;
            case 11:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr10 = UninstalledAppletSortOrder.$VALUES;
                return 8;
            case 12:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr11 = UninstalledAppletSortOrder.$VALUES;
                return 9;
            case 13:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr12 = UninstalledAppletSortOrder.$VALUES;
                return 0;
            case 14:
            case 15:
            case 16:
            case 17:
                return -3;
            case 18:
                return -5;
            case 19:
                return 101;
            case 20:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr13 = UninstalledAppletSortOrder.$VALUES;
                return 12;
            case 21:
                return 103;
            case 22:
                return EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE;
            case 23:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr14 = UninstalledAppletSortOrder.$VALUES;
                return 13;
            case 24:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr15 = UninstalledAppletSortOrder.$VALUES;
                return 14;
            case 25:
                return 104;
            case 26:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr16 = UninstalledAppletSortOrder.$VALUES;
                return 15;
            case 27:
                return 105;
            case 28:
                return 106;
            case 29:
                return 107;
            case 30:
                UninstalledAppletSortOrder[] uninstalledAppletSortOrderArr17 = UninstalledAppletSortOrder.$VALUES;
                return 16;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025f A[LOOP:2: B:76:0x0259->B:78:0x025f, LOOP_END] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Sequence computeLayoutInfos(Group group, List list, final SimpleActor simpleActor) {
        LinesSequence linesSequence;
        LinesSequence linesSequence2;
        ?? r3;
        String str;
        Iterator it;
        group.getClass();
        list.getClass();
        String str2 = group.name;
        Collection collection = group.children;
        Collection collection2 = group.data;
        if (str2 != null) {
            list = CollectionsKt.plus((Collection) list, (Object) new ScannableView.CallGroupInfo(str2, group.location));
        }
        final List list2 = list;
        CompositionContextsKt$REFLECTION_CONSTANTS$2$1 compositionContextsKt$REFLECTION_CONSTANTS$2$1 = (CompositionContextsKt$REFLECTION_CONSTANTS$2$1) CompositionContextsKt.REFLECTION_CONSTANTS$delegate.getValue();
        final int i = 0;
        TransformingSequence map = SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.flatMap(compositionContextsKt$REFLECTION_CONSTANTS$2$1 != null ? SequencesKt___SequencesKt.mapNotNull(SequencesKt___SequencesKt.filter(CollectionsKt.asSequence(collection2), new ForwardingFileSystem$$ExternalSyntheticLambda0(compositionContextsKt$REFLECTION_CONSTANTS$2$1, 26)), new ZipFilesKt$$ExternalSyntheticLambda4(5)) : EmptySequence.INSTANCE, new ZipFilesKt$$ExternalSyntheticLambda4(4)), new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(i, list2, group, simpleActor));
        ArrayList arrayList = new ArrayList();
        Iterator it2 = collection2.iterator();
        while (true) {
            r7 = null;
            ComposeLayoutInfo.AndroidViewInfo androidViewInfo = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            LayoutNode layoutNode = next instanceof LayoutNode ? (LayoutNode) next : null;
            if (layoutNode != null) {
                ViewFactoryHolder viewFactoryHolder = layoutNode.interopViewFactoryHolder;
                View view = viewFactoryHolder != null ? viewFactoryHolder.view : null;
                if (view != null) {
                    androidViewInfo = new ComposeLayoutInfo.AndroidViewInfo(view);
                }
            }
            if (androidViewInfo != null) {
                arrayList.add(androidViewInfo);
            }
        }
        FlatteningSequence plus = SequencesKt___SequencesKt.plus(map, arrayList);
        final int i2 = 1;
        if (Intrinsics.areEqual(str2, "SubcomposeLayout")) {
            FlatteningSequence plus2 = SequencesKt___SequencesKt.plus(SequencesKt___SequencesKt.flatMap(CollectionsKt.asSequence(collection), new Function1() { // from class: radiography.internal.ComposeLayoutInfoKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = i2;
                    SimpleActor simpleActor2 = simpleActor;
                    List list3 = list2;
                    Group group2 = (Group) obj;
                    switch (i3) {
                        case 0:
                            group2.getClass();
                            break;
                        case 1:
                            group2.getClass();
                            break;
                        default:
                            group2.getClass();
                            break;
                    }
                    return ComposeLayoutInfoKt.computeLayoutInfos(group2, list3, simpleActor2);
                }
            }), plus);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            TakeWhileSequence$iterator$1 takeWhileSequence$iterator$1 = new TakeWhileSequence$iterator$1(plus2);
            while (takeWhileSequence$iterator$1.hasNext()) {
                Object next2 = takeWhileSequence$iterator$1.next();
                if (((ComposeLayoutInfo) next2) instanceof ComposeLayoutInfo.SubcompositionInfo) {
                    arrayList2.add(next2);
                } else {
                    arrayList3.add(next2);
                }
            }
            if (!arrayList2.isEmpty() && arrayList3.size() == 1) {
                ComposeLayoutInfo composeLayoutInfo = (ComposeLayoutInfo) CollectionsKt.single((List) arrayList3);
                if (composeLayoutInfo instanceof ComposeLayoutInfo.LayoutNodeInfo) {
                    ComposeLayoutInfo.LayoutNodeInfo layoutNodeInfo = (ComposeLayoutInfo.LayoutNodeInfo) composeLayoutInfo;
                    if (!layoutNodeInfo.children.iterator().hasNext()) {
                        linesSequence = new LinesSequence(ComposeLayoutInfo.LayoutNodeInfo.copy$default(layoutNodeInfo, SequencesKt___SequencesKt.map(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(arrayList2, 1), new StateBindingsKt$$ExternalSyntheticLambda0(CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("<subcomposition of "), layoutNodeInfo.name, '>'), 20))), 6);
                        if (linesSequence == null) {
                            return linesSequence;
                        }
                        if (Intrinsics.areEqual(str2, "AndroidView") && (group instanceof CallGroup)) {
                            final int i3 = 2;
                            FlatteningSequence plus3 = SequencesKt___SequencesKt.plus(SequencesKt___SequencesKt.flatMap(CollectionsKt.asSequence(group.children), new Function1() { // from class: radiography.internal.ComposeLayoutInfoKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i32 = i3;
                                    SimpleActor simpleActor2 = simpleActor;
                                    List list3 = list2;
                                    Group group2 = (Group) obj;
                                    switch (i32) {
                                        case 0:
                                            group2.getClass();
                                            break;
                                        case 1:
                                            group2.getClass();
                                            break;
                                        default:
                                            group2.getClass();
                                            break;
                                    }
                                    return ComposeLayoutInfoKt.computeLayoutInfos(group2, list3, simpleActor2);
                                }
                            }), plus);
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            TakeWhileSequence$iterator$1 takeWhileSequence$iterator$12 = new TakeWhileSequence$iterator$1(plus3);
                            while (takeWhileSequence$iterator$12.hasNext()) {
                                Object next3 = takeWhileSequence$iterator$12.next();
                                if (((ComposeLayoutInfo) next3) instanceof ComposeLayoutInfo.AndroidViewInfo) {
                                    arrayList4.add(next3);
                                } else {
                                    arrayList5.add(next3);
                                }
                            }
                            if (!arrayList4.isEmpty() && arrayList5.size() == 1) {
                                ComposeLayoutInfo composeLayoutInfo2 = (ComposeLayoutInfo) CollectionsKt.single((List) arrayList5);
                                if (composeLayoutInfo2 instanceof ComposeLayoutInfo.LayoutNodeInfo) {
                                    ComposeLayoutInfo.LayoutNodeInfo layoutNodeInfo2 = (ComposeLayoutInfo.LayoutNodeInfo) composeLayoutInfo2;
                                    linesSequence2 = new LinesSequence(ComposeLayoutInfo.LayoutNodeInfo.copy$default(layoutNodeInfo2, SequencesKt___SequencesKt.plus(layoutNodeInfo2.children, arrayList4)), 6);
                                    if (linesSequence2 == null) {
                                        return linesSequence2;
                                    }
                                    if (!(group instanceof NodeGroup)) {
                                        return SequencesKt___SequencesKt.plus(SequencesKt___SequencesKt.flatMap(CollectionsKt.asSequence(collection), new Function1() { // from class: radiography.internal.ComposeLayoutInfoKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                int i32 = i;
                                                SimpleActor simpleActor2 = simpleActor;
                                                List list3 = list2;
                                                Group group2 = (Group) obj;
                                                switch (i32) {
                                                    case 0:
                                                        group2.getClass();
                                                        break;
                                                    case 1:
                                                        group2.getClass();
                                                        break;
                                                    default:
                                                        group2.getClass();
                                                        break;
                                                }
                                                return ComposeLayoutInfoKt.computeLayoutInfos(group2, list3, simpleActor2);
                                            }
                                        }), plus);
                                    }
                                    FlatteningSequence flatMap = SequencesKt___SequencesKt.flatMap(CollectionsKt.asSequence(collection), new ForwardingFileSystem$$ExternalSyntheticLambda0(simpleActor, 25));
                                    NodeGroup nodeGroup = (NodeGroup) group;
                                    Object obj = nodeGroup.node;
                                    LayoutNode layoutNode2 = obj instanceof LayoutNode ? (LayoutNode) obj : null;
                                    Integer valueOf = layoutNode2 != null ? Integer.valueOf(layoutNode2.semanticsId) : null;
                                    if (simpleActor != null) {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        SemanticsNode unmergedRootSemanticsNode = simpleActor.getUnmergedRootSemanticsNode();
                                        if (!unmergedRootSemanticsNode.layoutNode.isDeactivated) {
                                            SemanticsOwnerKt.getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(linkedHashMap, unmergedRootSemanticsNode);
                                        }
                                        List list3 = CollectionsKt.toList(linkedHashMap.values());
                                        if (list3 != null) {
                                            r3 = new ArrayList();
                                            for (Object obj2 : list3) {
                                                int i4 = ((SemanticsNode) obj2).id;
                                                if (valueOf != null && i4 == valueOf.intValue()) {
                                                    r3.add(obj2);
                                                }
                                            }
                                            List list4 = r3;
                                            ScannableView.CallGroupInfo callGroupInfo = (ScannableView.CallGroupInfo) CollectionsKt.firstOrNull(list2);
                                            str = callGroupInfo != null ? callGroupInfo.name : null;
                                            if (str == null) {
                                                str = "";
                                            }
                                            String str3 = str;
                                            IntRect intRect = group.box;
                                            List list5 = nodeGroup.modifierInfo;
                                            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                            it = list5.iterator();
                                            while (it.hasNext()) {
                                                arrayList6.add(((ModifierInfo) it.next()).modifier);
                                            }
                                            return new LinesSequence(new ComposeLayoutInfo.LayoutNodeInfo(str3, list2, intRect, arrayList6, SequencesKt___SequencesKt.plus(flatMap, plus), list4), 6);
                                        }
                                    }
                                    r3 = EmptyList.INSTANCE;
                                    List list42 = r3;
                                    ScannableView.CallGroupInfo callGroupInfo2 = (ScannableView.CallGroupInfo) CollectionsKt.firstOrNull(list2);
                                    if (callGroupInfo2 != null) {
                                    }
                                    if (str == null) {
                                    }
                                    String str32 = str;
                                    IntRect intRect2 = group.box;
                                    List list52 = nodeGroup.modifierInfo;
                                    ArrayList arrayList62 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list52, 10));
                                    it = list52.iterator();
                                    while (it.hasNext()) {
                                    }
                                    return new LinesSequence(new ComposeLayoutInfo.LayoutNodeInfo(str32, list2, intRect2, arrayList62, SequencesKt___SequencesKt.plus(flatMap, plus), list42), 6);
                                }
                            }
                        }
                        linesSequence2 = null;
                        if (linesSequence2 == null) {
                        }
                    }
                }
            }
        }
        linesSequence = null;
        if (linesSequence == null) {
        }
    }

    /* renamed from: isRecoverableError-90vkdD0$camera_camera2, reason: not valid java name */
    public static boolean m4375isRecoverableError90vkdD0$camera_camera2(int i) {
        return i == 6 || i == 1 || i == 2 || i == 4;
    }

    public static final List sortedBy(ArrayList arrayList, final zzr zzrVar, Map map) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            AppletId appletId = ((AppletTileItem) ((Pair) obj).second).appletId;
            appletId.getClass();
            switch (appletId.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                case 10:
                case 11:
                case 13:
                case 18:
                case 19:
                case 20:
                case 26:
                    break;
                case 7:
                case 9:
                case 12:
                case 14:
                case 15:
                case 16:
                case 17:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 27:
                case 28:
                case 29:
                case 30:
                    if (appletId != AppletId.BALANCE && appletId != AppletId.PROMOTED_BANKING_BENEFITS && appletId != AppletId.PROMOTED_CARD && appletId != AppletId.LITE_UNINSTALLED_CARD) {
                        arrayList2.add(obj);
                        break;
                    }
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            AppletId appletId2 = ((AppletTileItem) ((Pair) obj2).second).appletId;
            appletId2.getClass();
            switch (appletId2.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                case 10:
                case 11:
                case 13:
                case 18:
                case 19:
                case 20:
                case 26:
                    arrayList3.add(obj2);
                case 7:
                case 9:
                case 12:
                case 14:
                case 15:
                case 16:
                case 17:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 27:
                case 28:
                case 29:
                case 30:
                    if (appletId2 != AppletId.BALANCE && appletId2 != AppletId.PROMOTED_BANKING_BENEFITS && appletId2 != AppletId.PROMOTED_CARD && appletId2 != AppletId.LITE_UNINSTALLED_CARD) {
                    }
                    arrayList3.add(obj2);
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
            }
            return null;
        }
        Set keySet = map.keySet();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            AppletTileItem appletTileItem = (AppletTileItem) ((Pair) it.next()).second;
            AppletId appletId3 = appletTileItem.appletId;
            if (usesSyntheticClientPlacement(appletTileItem)) {
                appletId3 = null;
            }
            if (appletId3 != null) {
                arrayList4.add(appletId3);
            }
        }
        if (!keySet.containsAll(arrayList4)) {
            final int i = 0;
            return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.squareup.cash.money.applets.sections.AppletTileSectionProviderKt$sortedBy$$inlined$sortedBy$2
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    int i2 = i;
                    zzr zzrVar2 = zzrVar;
                    switch (i2) {
                    }
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(ComposeLayoutInfoKt.access$clientUninstalledSectionSortValue((AppletTileItem) ((Pair) obj3).second, zzrVar2)), Integer.valueOf(ComposeLayoutInfoKt.access$clientUninstalledSectionSortValue((AppletTileItem) ((Pair) obj4).second, zzrVar2)));
                }
            });
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!usesSyntheticClientPlacement((AppletTileItem) ((Pair) next).second)) {
                arrayList5.add(next);
            }
        }
        Iterator it3 = CollectionsKt.sortedWith(arrayList5, new SemanticsSortKt$special$$inlined$thenBy$1(map, 12)).iterator();
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        final int i2 = 1;
        for (Pair pair : CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.squareup.cash.money.applets.sections.AppletTileSectionProviderKt$sortedBy$$inlined$sortedBy$2
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                int i22 = i2;
                zzr zzrVar2 = zzrVar;
                switch (i22) {
                }
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(ComposeLayoutInfoKt.access$clientUninstalledSectionSortValue((AppletTileItem) ((Pair) obj3).second, zzrVar2)), Integer.valueOf(ComposeLayoutInfoKt.access$clientUninstalledSectionSortValue((AppletTileItem) ((Pair) obj4).second, zzrVar2)));
            }
        })) {
            if (usesSyntheticClientPlacement((AppletTileItem) pair.second)) {
                createListBuilder.add(pair);
            } else {
                createListBuilder.add(it3.next());
            }
        }
        final int i3 = 2;
        createListBuilder.addAll(CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.squareup.cash.money.applets.sections.AppletTileSectionProviderKt$sortedBy$$inlined$sortedBy$2
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                int i22 = i3;
                zzr zzrVar2 = zzrVar;
                switch (i22) {
                }
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(ComposeLayoutInfoKt.access$clientUninstalledSectionSortValue((AppletTileItem) ((Pair) obj3).second, zzrVar2)), Integer.valueOf(ComposeLayoutInfoKt.access$clientUninstalledSectionSortValue((AppletTileItem) ((Pair) obj4).second, zzrVar2)));
            }
        }));
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    /* renamed from: toCameraStateError-90vkdD0$camera_camera2, reason: not valid java name */
    public static AutoValue_CameraState_StateError m4376toCameraStateError90vkdD0$camera_camera2(int i) {
        int i2 = 6;
        if (i != 0) {
            int i3 = 1;
            if (i != 1) {
                if (i != 2) {
                    i3 = 5;
                    if (i != 3) {
                        if (i == 4) {
                            i2 = 3;
                        } else if (i != 5) {
                            if (i != 6) {
                                i3 = 7;
                                if (i != 7 && i != 8) {
                                    if (i == 9) {
                                        i2 = 4;
                                    } else if (i != 10) {
                                        if (i != 11 && i != 12 && i != 13) {
                                            Path$$ExternalSyntheticBUOutline0.m(CameraError.m43toStringimpl(i), "Unexpected CameraError: ");
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i3;
            }
            i2 = 2;
        }
        return new AutoValue_CameraState_StateError(i2);
    }

    public static final boolean usesSyntheticClientPlacement(AppletTileItem appletTileItem) {
        AppletId appletId = appletTileItem.appletId;
        return appletId == AppletId.BALANCE || appletId == AppletId.PROMOTED_BANKING_BENEFITS || appletId == AppletId.PROMOTED_CARD || appletId == AppletId.LITE_UNINSTALLED_CARD || appletTileItem.presentation == AppletTilePresentation.UninstalledRow;
    }
}
