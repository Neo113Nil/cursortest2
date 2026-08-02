package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.model.Cta;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes8.dex */
public final class CashBalance implements StripeModel, Parcelable {
    public final Map available;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<CashBalance> CREATOR = new Cta.Creator(5);
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Body$$ExternalSyntheticLambda0(21))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/CashBalance$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/CashBalance;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return CashBalance$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CashBalance(int i, Map map) {
        if ((i & 1) == 0) {
            this.available = null;
        } else {
            this.available = map;
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
        return (obj instanceof CashBalance) && Intrinsics.areEqual(this.available, ((CashBalance) obj).available);
    }

    public final int hashCode() {
        Map map = this.available;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("CashBalance(available=", ")", this.available);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Map map = this.available;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator m = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map);
        while (m.hasNext()) {
            Map.Entry entry = (Map.Entry) m.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeInt(((Number) entry.getValue()).intValue());
        }
    }

    public CashBalance(LinkedHashMap linkedHashMap) {
        this.available = linkedHashMap;
    }
}
