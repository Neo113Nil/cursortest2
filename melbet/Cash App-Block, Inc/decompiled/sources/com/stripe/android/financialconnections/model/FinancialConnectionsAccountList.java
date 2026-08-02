package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.model.Cta;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
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
public final class FinancialConnectionsAccountList implements StripeModel, Parcelable {
    public final Integer count;
    public final List data;
    public final boolean hasMore;
    public final Integer totalCount;
    public final String url;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<FinancialConnectionsAccountList> CREATOR = new Cta.Creator(16);
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Body$$ExternalSyntheticLambda0(27)), null, null, null, null};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccountList$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return FinancialConnectionsAccountList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinancialConnectionsAccountList(int i, List list, boolean z, String str, Integer num, Integer num2) {
        if (7 != (i & 7)) {
            TuplesKt.throwMissingFieldException(i, 7, FinancialConnectionsAccountList$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.data = list;
        this.hasMore = z;
        this.url = str;
        if ((i & 8) == 0) {
            this.count = null;
        } else {
            this.count = num;
        }
        if ((i & 16) == 0) {
            this.totalCount = null;
        } else {
            this.totalCount = num2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsAccountList)) {
            return false;
        }
        FinancialConnectionsAccountList financialConnectionsAccountList = (FinancialConnectionsAccountList) obj;
        return Intrinsics.areEqual(this.data, financialConnectionsAccountList.data) && this.hasMore == financialConnectionsAccountList.hasMore && Intrinsics.areEqual(this.url, financialConnectionsAccountList.url) && Intrinsics.areEqual(this.count, financialConnectionsAccountList.count) && Intrinsics.areEqual(this.totalCount, financialConnectionsAccountList.totalCount);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.data.hashCode() * 31, 31, this.hasMore), 31, this.url);
        Integer num = this.count;
        int hashCode = (m + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCount;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinancialConnectionsAccountList(data=");
        sb.append(this.data);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", url=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.url, ", count=", this.count, ", totalCount=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.totalCount, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.data, parcel);
        while (m.hasNext()) {
            ((FinancialConnectionsAccount) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.hasMore ? 1 : 0);
        parcel.writeString(this.url);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        Integer num2 = this.totalCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
        }
    }

    public FinancialConnectionsAccountList(List list, boolean z, String str, Integer num, Integer num2) {
        str.getClass();
        this.data = list;
        this.hasMore = z;
        this.url = str;
        this.count = num;
        this.totalCount = num2;
    }
}
