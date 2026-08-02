package com.squareup.cash.wallet.views;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class HeroCardViewKt$$ExternalSyntheticLambda33 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableFloatState f$0;

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda33(MutableFloatState mutableFloatState, int i) {
        this.$r8$classId = i;
        this.f$0 = mutableFloatState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableFloatState mutableFloatState = this.f$0;
        switch (i) {
            case 0:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setAlpha(RangesKt___RangesKt.coerceIn(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue() - 0.25f, RecyclerView.DECELERATION_RATE, 0.25f) * 4.0f);
                break;
            case 1:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                long positionInParent = ValueInsets.positionInParent(layoutCoordinates);
                float mo838getSizeYbymL2g = (int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax);
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(1.0f - RangesKt___RangesKt.coerceIn(Math.abs(RangesKt___RangesKt.coerceIn(Float.intBitsToFloat((int) (positionInParent & BodyPartID.bodyIdMax)), -mo838getSizeYbymL2g, mo838getSizeYbymL2g)) / mo838getSizeYbymL2g, RecyclerView.DECELERATION_RATE, 1.0f));
                break;
            case 2:
                ((LayoutCoordinates) obj).getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue((int) (r11.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax));
                break;
            case 3:
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                layoutCoordinates2.getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(Float.intBitsToFloat((int) (layoutCoordinates2.mo841localToRootMKHz9U(0L) & BodyPartID.bodyIdMax)));
                break;
            case 4:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.setAlpha(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue());
                break;
            case 5:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope3 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope3.getClass();
                reusableGraphicsLayerScope3.setAlpha(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue());
                break;
            case 6:
                LayoutCoordinates layoutCoordinates3 = (LayoutCoordinates) obj;
                layoutCoordinates3.getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(ValueInsets.boundsInParent(layoutCoordinates3).top);
                break;
            case 7:
                LayoutCoordinates layoutCoordinates4 = (LayoutCoordinates) obj;
                layoutCoordinates4.getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(ValueInsets.boundsInParent(layoutCoordinates4).top);
                break;
            case 8:
                LayoutCoordinates layoutCoordinates5 = (LayoutCoordinates) obj;
                layoutCoordinates5.getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(ValueInsets.boundsInParent(layoutCoordinates5).top);
                break;
            case 9:
                LayoutCoordinates layoutCoordinates6 = (LayoutCoordinates) obj;
                layoutCoordinates6.getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(ValueInsets.boundsInParent(layoutCoordinates6).top);
                break;
            case 10:
                LayoutCoordinates layoutCoordinates7 = (LayoutCoordinates) obj;
                layoutCoordinates7.getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(ValueInsets.boundsInParent(layoutCoordinates7).top);
                break;
            case 11:
                LayoutCoordinates layoutCoordinates8 = (LayoutCoordinates) obj;
                layoutCoordinates8.getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(ValueInsets.boundsInParent(layoutCoordinates8).top);
                break;
            case 12:
                LayoutCoordinates layoutCoordinates9 = (LayoutCoordinates) obj;
                layoutCoordinates9.getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(ValueInsets.boundsInParent(layoutCoordinates9).top);
                break;
            case 13:
                LayoutCoordinates layoutCoordinates10 = (LayoutCoordinates) obj;
                layoutCoordinates10.getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(ValueInsets.boundsInParent(layoutCoordinates10).top);
                break;
            case 14:
                LayoutCoordinates layoutCoordinates11 = (LayoutCoordinates) obj;
                layoutCoordinates11.getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(ValueInsets.boundsInParent(layoutCoordinates11).top);
                break;
            case 15:
                LayoutCoordinates layoutCoordinates12 = (LayoutCoordinates) obj;
                layoutCoordinates12.getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(Float.intBitsToFloat((int) (Countries.m3991toSizeozmzZPI(layoutCoordinates12.mo838getSizeYbymL2g()) >> 32)));
                break;
            case 16:
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState;
                parcelableSnapshotMutableFloatState.setFloatValue(parcelableSnapshotMutableFloatState.getFloatValue() + ((Float) obj).floatValue());
                break;
            case 17:
                LayoutCoordinates layoutCoordinates13 = (LayoutCoordinates) obj;
                layoutCoordinates13.getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(Float.intBitsToFloat((int) (Countries.m3991toSizeozmzZPI(layoutCoordinates13.mo838getSizeYbymL2g()) >> 32)));
                break;
            case 18:
                ((Long) obj).longValue();
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = (ParcelableSnapshotMutableFloatState) mutableFloatState;
                if (parcelableSnapshotMutableFloatState2.getFloatValue() > 0.5d) {
                    parcelableSnapshotMutableFloatState2.setFloatValue(parcelableSnapshotMutableFloatState2.getFloatValue() - 0.25f);
                }
                break;
            case 19:
                LayoutCoordinates layoutCoordinates14 = (LayoutCoordinates) obj;
                layoutCoordinates14.getClass();
                IntRect m1053IntRectVbeCjmY = IntRectKt.m1053IntRectVbeCjmY(0L, layoutCoordinates14.mo838getSizeYbymL2g());
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(Math.max(Math.abs(m1053IntRectVbeCjmY.getWidth()), Math.abs(m1053IntRectVbeCjmY.getHeight())));
                break;
            case 20:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope4 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope4.getClass();
                reusableGraphicsLayerScope4.setAlpha(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue());
                break;
            case 21:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope5 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope5.getClass();
                reusableGraphicsLayerScope5.setAlpha(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue());
                break;
            case 22:
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue((int) (((IntSize) obj).packedValue >> 32));
                break;
            default:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope6 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope6.getClass();
                reusableGraphicsLayerScope6.setAlpha(1.0f - (RangesKt___RangesKt.coerceIn(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue() - 0.5f, RecyclerView.DECELERATION_RATE, 0.25f) * 4.0f));
                break;
        }
        return Unit.INSTANCE;
    }
}
