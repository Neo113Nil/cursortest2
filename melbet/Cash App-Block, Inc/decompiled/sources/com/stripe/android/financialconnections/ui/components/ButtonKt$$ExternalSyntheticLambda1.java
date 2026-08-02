package com.stripe.android.financialconnections.ui.components;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes7.dex */
public final /* synthetic */ class ButtonKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Density f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda1(Density density, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = density;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        Density density = this.f$0;
        switch (i) {
            case 0:
                mutableState.setValue(new Dp(density.mo233toDpu2uoSUM((int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax))));
                break;
            case 1:
                break;
            case 2:
                mutableState.setValue(new IntSize((density.mo230roundToPx0680j_4(DpSize.m1043getHeightD9Ej5fM(r8.packedValue)) & BodyPartID.bodyIdMax) | (density.mo230roundToPx0680j_4(DpSize.m1044getWidthD9Ej5fM(((DpSize) obj).packedValue)) << 32)));
                break;
            case 3:
                break;
            case 4:
                mutableState.setValue(new IntSize((density.mo230roundToPx0680j_4(DpSize.m1043getHeightD9Ej5fM(r8.packedValue)) & BodyPartID.bodyIdMax) | (density.mo230roundToPx0680j_4(DpSize.m1044getWidthD9Ej5fM(((DpSize) obj).packedValue)) << 32)));
                break;
            default:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                mutableState.setValue(new Dp(density.mo233toDpu2uoSUM((int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax))));
                break;
        }
        return Unit.INSTANCE;
    }
}
