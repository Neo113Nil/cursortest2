package com.squareup.cash.wallet.views;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.text.HorizontalScrollLayoutModifier;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.money.views.CardNestedScrollExpander;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2;
import com.squareup.cash.offers.views.OffersCollapsibleHeaderScaffoldState;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.work.views.ScheduleCalendarKt$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class Hero3DCardViewKt$$ExternalSyntheticLambda13 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ Hero3DCardViewKt$$ExternalSyntheticLambda13(int i, Constraints constraints, MeasureScope measureScope, Placeable placeable) {
        this.$r8$classId = 0;
        this.f$1 = i;
        this.f$2 = constraints;
        this.f$3 = measureScope;
        this.f$4 = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        float f = 1.0f;
        int i2 = this.f$1;
        Object obj2 = this.f$4;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        switch (i) {
            case 0:
                Placeable placeable = (Placeable) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                placementScope.placeRelative(placeable, Math.round((1.0f + (((MeasureScope) obj3).getLayoutDirection() == LayoutDirection.Ltr ? 0.0f : (-1.0f) * RecyclerView.DECELERATION_RATE)) * ((Constraints.m1025getMaxWidthimpl(((Constraints) obj4).value) - i2) / 2.0f)), 0, RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 1:
                HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj4;
                MeasureScope measureScope = (MeasureScope) obj3;
                Placeable placeable2 = (Placeable) obj2;
                Placeable.PlacementScope placementScope2 = (Placeable.PlacementScope) obj;
                int i3 = horizontalScrollLayoutModifier.cursorOffset;
                TextFieldScrollerPosition textFieldScrollerPosition = horizontalScrollLayoutModifier.scrollerPosition;
                TransformedText transformedText = horizontalScrollLayoutModifier.transformedText;
                TextLayoutResultProxy textLayoutResultProxy = (TextLayoutResultProxy) horizontalScrollLayoutModifier.textLayoutResultProvider.invoke();
                textFieldScrollerPosition.update(Orientation.Horizontal, KeyMappingKt.access$getCursorRectInScroller(placementScope2, i3, transformedText, textLayoutResultProxy != null ? textLayoutResultProxy.value : null, measureScope.getLayoutDirection() == LayoutDirection.Rtl, placeable2.width), i2, placeable2.width);
                placementScope2.placeRelative(placeable2, Math.round(-textFieldScrollerPosition.offset$delegate.getFloatValue()), 0, RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 2:
                TextFieldCoreModifierNode textFieldCoreModifierNode = (TextFieldCoreModifierNode) obj4;
                Placeable placeable3 = (Placeable) obj2;
                Placeable.PlacementScope placementScope3 = (Placeable.PlacementScope) obj;
                textFieldCoreModifierNode.m406updateScrollStatetIlFzwE(placementScope3, this.f$1, placeable3.height, textFieldCoreModifierNode.textFieldState.getVisualText().selection, ((MeasureScope) obj3).getLayoutDirection());
                placementScope3.placeRelative(placeable3, 0, -textFieldCoreModifierNode.scrollState.value$delegate.getIntValue(), RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 3:
                final State state = (State) obj3;
                final State state2 = (State) obj2;
                final ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                final float floatValue = ((CardNestedScrollExpander) obj4).cardRevealDistance$delegate.getFloatValue();
                if (floatValue <= RecyclerView.DECELERATION_RATE && ((Number) state.getValue()).floatValue() <= RecyclerView.DECELERATION_RATE) {
                    f = 0.0f;
                }
                reusableGraphicsLayerScope.setAlpha(f);
                final int i4 = this.f$1;
                reusableGraphicsLayerScope.setShape(new GenericShape(new Function3() { // from class: com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        AndroidPath androidPath = (AndroidPath) obj5;
                        Size size = (Size) obj6;
                        androidPath.getClass();
                        ((LayoutDirection) obj7).getClass();
                        float f2 = floatValue;
                        if (f2 < RecyclerView.DECELERATION_RATE) {
                            f2 = 0.0f;
                        }
                        float max = Math.max(((Number) state2.getValue()).floatValue(), ((Number) state.getValue()).floatValue()) * i4;
                        ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = reusableGraphicsLayerScope;
                        float density = reusableGraphicsLayerScope2.graphicsDensity.getDensity() * 13.0f;
                        long j = size.packedValue;
                        int i5 = (int) (j >> 32);
                        AndroidPath.addRect$default(androidPath, new Rect((-Float.intBitsToFloat(i5)) * 2.0f, (-Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))) * 2.0f, Float.intBitsToFloat(i5) * 2.0f, f2 + max + density));
                        reusableGraphicsLayerScope2.setClip(true);
                        return Unit.INSTANCE;
                    }
                }));
                return Unit.INSTANCE;
            case 4:
                Placeable placeable4 = (Placeable) obj2;
                Placeable placeable5 = (Placeable) obj4;
                OffersCollapsibleHeaderScaffoldState offersCollapsibleHeaderScaffoldState = (OffersCollapsibleHeaderScaffoldState) obj3;
                Placeable.PlacementScope placementScope4 = (Placeable.PlacementScope) obj;
                placementScope4.getClass();
                int roundToInt = placeable4.height + placeable5.height > i2 ? MathKt__MathJVMKt.roundToInt(offersCollapsibleHeaderScaffoldState.headerYOffsetInPx$delegate.getFloatValue()) : 0;
                placementScope4.place(placeable5, 0, placeable4.height + roundToInt, RecyclerView.DECELERATION_RATE);
                placementScope4.place(placeable4, 0, roundToInt, RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 5:
                List list = (List) obj4;
                LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) obj;
                lazyGridIntervalContent.getClass();
                LazyGridIntervalContent.items$default(lazyGridIntervalContent, list.size(), null, null, new ComposableLambdaImpl(new ScheduleCalendarKt$$ExternalSyntheticLambda0(list, (Function1) obj3, (OffersHomeViewModelV2.Loaded.OffersSection) obj2, this.f$1, 1), true, -1701799592), 14);
                return Unit.INSTANCE;
            default:
                Function2 function2 = (Function2) obj2;
                float coerceIn = RangesKt___RangesKt.coerceIn(((Float) obj).floatValue(), RecyclerView.DECELERATION_RATE, ((DistributionWheelViewModel.Allocation.Treatment.InteractableSelected) obj4).maxAllocation);
                ((Function2) obj3).invoke(Integer.valueOf(i2), Float.valueOf(coerceIn));
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(i2), Float.valueOf(coerceIn));
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ Hero3DCardViewKt$$ExternalSyntheticLambda13(TextFieldCoreModifierNode textFieldCoreModifierNode, int i, Placeable placeable, MeasureScope measureScope) {
        this.$r8$classId = 2;
        this.f$2 = textFieldCoreModifierNode;
        this.f$1 = i;
        this.f$4 = placeable;
        this.f$3 = measureScope;
    }

    public /* synthetic */ Hero3DCardViewKt$$ExternalSyntheticLambda13(Placeable placeable, Placeable placeable2, int i, OffersCollapsibleHeaderScaffoldState offersCollapsibleHeaderScaffoldState) {
        this.$r8$classId = 4;
        this.f$4 = placeable;
        this.f$2 = placeable2;
        this.f$1 = i;
        this.f$3 = offersCollapsibleHeaderScaffoldState;
    }

    public /* synthetic */ Hero3DCardViewKt$$ExternalSyntheticLambda13(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$2 = obj;
        this.f$3 = obj2;
        this.f$1 = i;
        this.f$4 = obj3;
    }

    public /* synthetic */ Hero3DCardViewKt$$ExternalSyntheticLambda13(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = obj;
        this.f$3 = obj2;
        this.f$4 = obj3;
        this.f$1 = i;
    }
}
