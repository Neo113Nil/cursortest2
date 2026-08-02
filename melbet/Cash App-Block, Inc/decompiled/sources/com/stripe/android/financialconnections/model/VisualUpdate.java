package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.financialconnections.model.ServerLink;
import com.stripe.android.model.ConsumerSession$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class VisualUpdate implements Parcelable {
    public static final Lazy[] $childSerializers;
    public static final Parcelable.Creator<VisualUpdate> CREATOR;
    public static final Companion Companion = new Companion();
    public final List merchantLogos;
    public final boolean reducedBranding;
    public final boolean reducedManualEntryProminenceInErrors;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/VisualUpdate$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/VisualUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return VisualUpdate$$serializer.INSTANCE;
        }
    }

    static {
        int i = 15;
        CREATOR = new ServerLink.Creator(i);
        $childSerializers = new Lazy[]{null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(i))};
    }

    public /* synthetic */ VisualUpdate(int i, List list, boolean z, boolean z2) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, VisualUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.reducedBranding = z;
        this.reducedManualEntryProminenceInErrors = z2;
        this.merchantLogos = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualUpdate)) {
            return false;
        }
        VisualUpdate visualUpdate = (VisualUpdate) obj;
        return this.reducedBranding == visualUpdate.reducedBranding && this.reducedManualEntryProminenceInErrors == visualUpdate.reducedManualEntryProminenceInErrors && Intrinsics.areEqual(this.merchantLogos, visualUpdate.merchantLogos);
    }

    public final int hashCode() {
        return this.merchantLogos.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.reducedBranding) * 31, 31, this.reducedManualEntryProminenceInErrors);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(NavAction$$ExternalSyntheticOutline0.m("VisualUpdate(reducedBranding=", ", reducedManualEntryProminenceInErrors=", ", merchantLogos=", this.reducedBranding, this.reducedManualEntryProminenceInErrors), this.merchantLogos, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.reducedBranding ? 1 : 0);
        parcel.writeInt(this.reducedManualEntryProminenceInErrors ? 1 : 0);
        parcel.writeStringList(this.merchantLogos);
    }

    public VisualUpdate(ArrayList arrayList, boolean z, boolean z2) {
        arrayList.getClass();
        this.reducedBranding = z;
        this.reducedManualEntryProminenceInErrors = z2;
        this.merchantLogos = arrayList;
    }
}
