package com.squareup.cash.support.chat.views.transcript.message;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.support.chat.viewmodels.ChatRowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SuggestedRepliesView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SuggestedRepliesView f$0;

    public /* synthetic */ SuggestedRepliesView$$ExternalSyntheticLambda0(SuggestedRepliesView suggestedRepliesView) {
        this.f$0 = suggestedRepliesView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        SuggestedRepliesView suggestedRepliesView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = SuggestedRepliesView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ChatRowViewModel.SuggestedRepliesRowViewModel suggestedRepliesRowViewModel = (ChatRowViewModel.SuggestedRepliesRowViewModel) suggestedRepliesView.state$delegate.getValue();
                    if (suggestedRepliesRowViewModel == null) {
                        gapComposer.startReplaceGroup(892363391);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(892363392);
                        Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(Modifier.Companion.$$INSTANCE, suggestedRepliesRowViewModel.model.chatUiUpliftEnabled ? RecyclerView.DECELERATION_RATE : 16.0f, 16.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        ActionBodyViewKt.SuggestedRepliesButtons(suggestedRepliesRowViewModel, gapComposer, 0);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                int i3 = SuggestedRepliesView.$r8$clinit;
                suggestedRepliesView.Content(composer, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SuggestedRepliesView$$ExternalSyntheticLambda0(SuggestedRepliesView suggestedRepliesView, int i) {
        this.f$0 = suggestedRepliesView;
    }
}
