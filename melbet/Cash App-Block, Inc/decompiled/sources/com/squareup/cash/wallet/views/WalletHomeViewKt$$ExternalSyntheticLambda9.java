package com.squareup.cash.wallet.views;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class WalletHomeViewKt$$ExternalSyntheticLambda9 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ParcelableSnapshotMutableIntState f$0;

    public /* synthetic */ WalletHomeViewKt$$ExternalSyntheticLambda9(int i, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.$r8$classId = i;
        this.f$0 = parcelableSnapshotMutableIntState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.f$0;
        MeasureScope measureScope = (MeasureScope) obj;
        Measurable measurable = (Measurable) obj2;
        Constraints constraints = (Constraints) obj3;
        switch (i) {
            case 0:
                measureScope.getClass();
                measurable.getClass();
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(constraints.value);
                parcelableSnapshotMutableIntState.setIntValue(mo833measureBRTryo0.height);
                return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 21));
            case 1:
                measureScope.getClass();
                measurable.getClass();
                Placeable mo833measureBRTryo02 = measurable.mo833measureBRTryo0(constraints.value);
                int i2 = mo833measureBRTryo02.get(AlignmentLinesKt.FirstLineCenter);
                if (i2 == Integer.MIN_VALUE) {
                    i2 = mo833measureBRTryo02.height / 2;
                }
                parcelableSnapshotMutableIntState.setIntValue(i2);
                return MeasureScope.layout$default(measureScope, mo833measureBRTryo02.width, mo833measureBRTryo02.height, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo02, 13));
            default:
                measureScope.getClass();
                measurable.getClass();
                long j = constraints.value;
                Placeable mo833measureBRTryo03 = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, Constraints.m1024getMaxHeightimpl(j) - parcelableSnapshotMutableIntState.getIntValue(), 7));
                return MeasureScope.layout$default(measureScope, mo833measureBRTryo03.width, mo833measureBRTryo03.height, new HeroCardViewKt$$ExternalSyntheticLambda0(5, mo833measureBRTryo03, parcelableSnapshotMutableIntState));
        }
    }
}
