package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.model.Cta;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.TuplesKt;
import okhttp3.internal.Tags;

@Serializable
/* loaded from: classes8.dex */
public final class BalanceRefresh implements StripeModel, Parcelable {
    public final int lastAttemptedAt;
    public final BalanceRefreshStatus status;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<BalanceRefresh> CREATOR = new Cta.Creator(1);
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Body$$ExternalSyntheticLambda0(19)), null};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus", "", "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode$financial_connections_core_release", "()Ljava/lang/String;", "Companion", "FAILED", "PENDING", "SUCCEEDED", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable
    public final class BalanceRefreshStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BalanceRefreshStatus[] $VALUES;
        private static final Lazy<KSerializer> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @SerialName("failed")
        public static final BalanceRefreshStatus FAILED = new BalanceRefreshStatus("FAILED", 0, "failed");

        @SerialName("pending")
        public static final BalanceRefreshStatus PENDING = new BalanceRefreshStatus("PENDING", 1, "pending");

        @SerialName("succeeded")
        public static final BalanceRefreshStatus SUCCEEDED = new BalanceRefreshStatus("SUCCEEDED", 2, "succeeded");
        public static final BalanceRefreshStatus UNKNOWN = new BalanceRefreshStatus("UNKNOWN", 3, "unknown");
        private final String code;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/BalanceRefresh$BalanceRefreshStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return (KSerializer) BalanceRefreshStatus.$cachedSerializer$delegate.getValue();
            }
        }

        private static final /* synthetic */ BalanceRefreshStatus[] $values() {
            return new BalanceRefreshStatus[]{FAILED, PENDING, SUCCEEDED, UNKNOWN};
        }

        static {
            BalanceRefreshStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Body$$ExternalSyntheticLambda0(20));
        }

        private BalanceRefreshStatus(String str, int i, String str2) {
            this.code = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.financialconnections.model.BalanceRefresh.BalanceRefreshStatus", values(), new String[]{"failed", "pending", "succeeded", null}, new Annotation[][]{null, null, null, null});
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static BalanceRefreshStatus valueOf(String str) {
            return (BalanceRefreshStatus) Enum.valueOf(BalanceRefreshStatus.class, str);
        }

        public static BalanceRefreshStatus[] values() {
            return (BalanceRefreshStatus[]) $VALUES.clone();
        }

        /* renamed from: getCode$financial_connections_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/BalanceRefresh$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/BalanceRefresh;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return BalanceRefresh$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BalanceRefresh(int i, BalanceRefreshStatus balanceRefreshStatus, int i2) {
        if (2 != (i & 2)) {
            TuplesKt.throwMissingFieldException(i, 2, BalanceRefresh$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.status = BalanceRefreshStatus.UNKNOWN;
        } else {
            this.status = balanceRefreshStatus;
        }
        this.lastAttemptedAt = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceRefresh)) {
            return false;
        }
        BalanceRefresh balanceRefresh = (BalanceRefresh) obj;
        return this.status == balanceRefresh.status && this.lastAttemptedAt == balanceRefresh.lastAttemptedAt;
    }

    public final int hashCode() {
        BalanceRefreshStatus balanceRefreshStatus = this.status;
        return Integer.hashCode(this.lastAttemptedAt) + ((balanceRefreshStatus == null ? 0 : balanceRefreshStatus.hashCode()) * 31);
    }

    public final String toString() {
        return "BalanceRefresh(status=" + this.status + ", lastAttemptedAt=" + this.lastAttemptedAt + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        BalanceRefreshStatus balanceRefreshStatus = this.status;
        if (balanceRefreshStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(balanceRefreshStatus.name());
        }
        parcel.writeInt(this.lastAttemptedAt);
    }

    public BalanceRefresh(BalanceRefreshStatus balanceRefreshStatus, int i) {
        this.status = balanceRefreshStatus;
        this.lastAttemptedAt = i;
    }
}
