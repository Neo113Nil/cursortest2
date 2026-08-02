package com.squareup.cash.tax.applet.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class TaxesAppletTile$$ExternalSyntheticLambda10 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComposableLambdaImpl f$0;

    public /* synthetic */ TaxesAppletTile$$ExternalSyntheticLambda10(ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        ComposableLambdaImpl composableLambdaImpl = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer, (Object) 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    composableLambdaImpl.invoke(adaptiveStackScope, gapComposer2, Integer.valueOf(intValue2 & 14));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) companion, (Object) gapComposer3, (Object) 6);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer4, true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ColumnScope columnScope = (ColumnScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                columnScope.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(columnScope) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    composableLambdaImpl.invoke(columnScope, gapComposer5, Integer.valueOf(intValue5 & 14));
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((BoxWithConstraintsScopeImpl) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer6, (Object) 6);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Modifier testTag = TestTagKt.testTag(companion, "BottomSheetContentTestTag");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer7, testTag);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer7, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer7, true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
