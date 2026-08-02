package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.StripeModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
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
import okhttp3.internal.Tags;

@Serializable
/* loaded from: classes8.dex */
public final class AccountHolder implements StripeModel, Parcelable {
    public final String account;
    public final String customer;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1431type;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<AccountHolder> CREATOR = new Country.Creator(26);
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Body$$ExternalSyntheticLambda0(14)), null, null};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/AccountHolder$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/AccountHolder;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return AccountHolder$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/stripe/android/financialconnections/model/AccountHolder$Type", "", "Lcom/stripe/android/financialconnections/model/AccountHolder$Type;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "ACCOUNT", "CUSTOMER", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable
    public final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final Lazy<KSerializer> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("account")
        public static final Type ACCOUNT = new Type("ACCOUNT", 0, "account");

        @SerialName("customer")
        public static final Type CUSTOMER = new Type("CUSTOMER", 1, "customer");
        public static final Type UNKNOWN = new Type("UNKNOWN", 2, "unknown");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/AccountHolder$Type$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/AccountHolder$Type;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return (KSerializer) Type.$cachedSerializer$delegate.getValue();
            }
        }

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{ACCOUNT, CUSTOMER, UNKNOWN};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Body$$ExternalSyntheticLambda0(15));
        }

        private Type(String str, int i, String str2) {
            this.value = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.financialconnections.model.AccountHolder.Type", values(), new String[]{"account", "customer", null}, new Annotation[][]{null, null, null});
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

    public /* synthetic */ AccountHolder(int i, Type type2, String str, String str2) {
        this.f1431type = (i & 1) == 0 ? Type.UNKNOWN : type2;
        if ((i & 2) == 0) {
            this.account = null;
        } else {
            this.account = str;
        }
        if ((i & 4) == 0) {
            this.customer = null;
        } else {
            this.customer = str2;
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
        if (!(obj instanceof AccountHolder)) {
            return false;
        }
        AccountHolder accountHolder = (AccountHolder) obj;
        return this.f1431type == accountHolder.f1431type && Intrinsics.areEqual(this.account, accountHolder.account) && Intrinsics.areEqual(this.customer, accountHolder.customer);
    }

    public final int hashCode() {
        int hashCode = this.f1431type.hashCode() * 31;
        String str = this.account;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customer;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountHolder(type=");
        sb.append(this.f1431type);
        sb.append(", account=");
        sb.append(this.account);
        sb.append(", customer=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.customer, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f1431type.name());
        parcel.writeString(this.account);
        parcel.writeString(this.customer);
    }

    public AccountHolder(Type type2, String str, String str2) {
        type2.getClass();
        this.f1431type = type2;
        this.account = str;
        this.customer = str2;
    }
}
