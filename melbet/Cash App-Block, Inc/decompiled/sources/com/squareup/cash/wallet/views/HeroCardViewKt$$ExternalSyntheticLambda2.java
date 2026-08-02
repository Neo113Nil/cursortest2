package com.squareup.cash.wallet.views;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.primitives.Actions;
import app.cash.local.primitives.Location;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.instancing.CardScreenBounds;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.wallet.views.CardRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class HeroCardViewKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda2(MutableState mutableState, State state, int i) {
        this.$r8$classId = i;
        this.f$1 = mutableState;
        this.f$0 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Actions actions;
        int intValue;
        int i = this.$r8$classId;
        List list = null;
        MutableState mutableState = this.f$1;
        State state = this.f$0;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Boolean) state.getValue()).booleanValue() || ((Boolean) mutableState.getValue()).booleanValue());
            case 1:
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    return EmptyList.INSTANCE;
                }
                Location.LocationDetail locationDetail = (Location.LocationDetail) state.getValue();
                if (locationDetail != null && (actions = locationDetail.actions) != null) {
                    list = actions.reorderablePastSelections;
                }
                return list == null ? EmptyList.INSTANCE : list;
            case 2:
                if (((ZoomLevel) mutableState.getValue()) == ZoomLevel.NEAR && ((List) state.getValue()).size() == 1) {
                    return (CardScreenBounds) CollectionsKt.first((List) state.getValue());
                }
                return null;
            case 3:
                ArrayList arrayList = ((DistributionWheelViewModel) mutableState.getValue()).allocations;
                boolean isEmpty = arrayList.isEmpty();
                float f = RecyclerView.DECELERATION_RATE;
                if (!isEmpty) {
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (listIterator.hasPrevious()) {
                        int previousIndex = listIterator.previousIndex();
                        DistributionWheelViewModel.Allocation allocation = (DistributionWheelViewModel.Allocation) listIterator.previous();
                        intValue = ((Number) state.getValue()).intValue();
                        if (previousIndex < intValue) {
                            f = allocation.getPercentage() + f;
                        }
                    }
                }
                return Float.valueOf(f);
            default:
                if (!CoreInteractiveCardKt.InteractiveCardEffect$lambda$20(state) && ((CardRegistry.SharedCardTransitionState) mutableState.getValue()) == null) {
                    r2 = true;
                }
                return Boolean.valueOf(r2);
        }
    }

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda2(State state, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
        this.f$1 = mutableState;
    }
}
