package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.StripeModel;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.TuplesKt;
import okhttp3.internal.Tags;

@Serializable
/* loaded from: classes8.dex */
public final class Balance implements StripeModel, Parcelable {
    public static final Lazy[] $childSerializers;
    public final int asOf;
    public final CashBalance cash;
    public final CreditBalance credit;
    public final Map current;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1432type;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<Balance> CREATOR = new Country.Creator(29);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/Balance$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/Balance;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return Balance$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/stripe/android/financialconnections/model/Balance$Type", "", "Lcom/stripe/android/financialconnections/model/Balance$Type;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "CASH", "CREDIT", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable
    public final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final Lazy<KSerializer> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("cash")
        public static final Type CASH = new Type("CASH", 0, "cash");

        @SerialName("credit")
        public static final Type CREDIT = new Type("CREDIT", 1, "credit");
        public static final Type UNKNOWN = new Type("UNKNOWN", 2, "unknown");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/Balance$Type$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/Balance$Type;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return (KSerializer) Type.$cachedSerializer$delegate.getValue();
            }
        }

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{CASH, CREDIT, UNKNOWN};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Body$$ExternalSyntheticLambda0(18));
        }

        private Type(String str, int i, String str2) {
            this.value = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.financialconnections.model.Balance.Type", values(), new String[]{"cash", "credit", null}, new Annotation[][]{null, null, null});
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Body$$ExternalSyntheticLambda0(16)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Body$$ExternalSyntheticLambda0(17)), null, null};
    }

    public /* synthetic */ Balance(int i, int i2, Map map, Type type2, CashBalance cashBalance, CreditBalance creditBalance) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, Balance$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.asOf = i2;
        this.current = map;
        if ((i & 4) == 0) {
            this.f1432type = Type.UNKNOWN;
        } else {
            this.f1432type = type2;
        }
        if ((i & 8) == 0) {
            this.cash = null;
        } else {
            this.cash = cashBalance;
        }
        if ((i & 16) == 0) {
            this.credit = null;
        } else {
            this.credit = creditBalance;
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
        if (!(obj instanceof Balance)) {
            return false;
        }
        Balance balance = (Balance) obj;
        return this.asOf == balance.asOf && Intrinsics.areEqual(this.current, balance.current) && this.f1432type == balance.f1432type && Intrinsics.areEqual(this.cash, balance.cash) && Intrinsics.areEqual(this.credit, balance.credit);
    }

    public final int hashCode() {
        int hashCode = (this.f1432type.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(Integer.hashCode(this.asOf) * 31, this.current, 31)) * 31;
        CashBalance cashBalance = this.cash;
        int hashCode2 = (hashCode + (cashBalance == null ? 0 : cashBalance.hashCode())) * 31;
        CreditBalance creditBalance = this.credit;
        return hashCode2 + (creditBalance != null ? creditBalance.hashCode() : 0);
    }

    public final String toString() {
        return "Balance(asOf=" + this.asOf + ", current=" + this.current + ", type=" + this.f1432type + ", cash=" + this.cash + ", credit=" + this.credit + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.asOf);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.current, parcel);
        while (m.hasNext()) {
            Map.Entry entry = (Map.Entry) m.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeInt(((Number) entry.getValue()).intValue());
        }
        parcel.writeString(this.f1432type.name());
        CashBalance cashBalance = this.cash;
        if (cashBalance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cashBalance.writeToParcel(parcel, i);
        }
        CreditBalance creditBalance = this.credit;
        if (creditBalance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            creditBalance.writeToParcel(parcel, i);
        }
    }

    public Balance(int i, LinkedHashMap linkedHashMap, Type type2, CashBalance cashBalance, CreditBalance creditBalance) {
        type2.getClass();
        this.asOf = i;
        this.current = linkedHashMap;
        this.f1432type = type2;
        this.cash = cashBalance;
        this.credit = creditBalance;
    }
}
