package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.model.ServerLink;
import com.stripe.android.model.ConsumerSession$$ExternalSyntheticLambda0;
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
public final class OwnershipRefresh implements Parcelable, StripeModel {
    public final int lastAttemptedAt;
    public final Status status;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<OwnershipRefresh> CREATOR = new ServerLink.Creator(6);
    public static final Lazy[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(10))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/OwnershipRefresh$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return OwnershipRefresh$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/stripe/android/financialconnections/model/OwnershipRefresh$Status", "", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "FAILED", "PENDING", "SUCCEEDED", "UNKNOWN", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable
    public final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private static final Lazy<KSerializer> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @SerialName("failed")
        public static final Status FAILED = new Status("FAILED", 0, "failed");

        @SerialName("pending")
        public static final Status PENDING = new Status("PENDING", 1, "pending");

        @SerialName("succeeded")
        public static final Status SUCCEEDED = new Status("SUCCEEDED", 2, "succeeded");
        public static final Status UNKNOWN = new Status("UNKNOWN", 3, "unknown");
        private final String value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return (KSerializer) Status.$cachedSerializer$delegate.getValue();
            }
        }

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{FAILED, PENDING, SUCCEEDED, UNKNOWN};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(11));
        }

        private Status(String str, int i, String str2) {
            this.value = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.financialconnections.model.OwnershipRefresh.Status", values(), new String[]{"failed", "pending", "succeeded", null}, new Annotation[][]{null, null, null, null});
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    public /* synthetic */ OwnershipRefresh(int i, int i2, Status status) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, OwnershipRefresh$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.lastAttemptedAt = i2;
        if ((i & 2) == 0) {
            this.status = Status.UNKNOWN;
        } else {
            this.status = status;
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
        if (!(obj instanceof OwnershipRefresh)) {
            return false;
        }
        OwnershipRefresh ownershipRefresh = (OwnershipRefresh) obj;
        return this.lastAttemptedAt == ownershipRefresh.lastAttemptedAt && this.status == ownershipRefresh.status;
    }

    public final int hashCode() {
        return this.status.hashCode() + (Integer.hashCode(this.lastAttemptedAt) * 31);
    }

    public final String toString() {
        return "OwnershipRefresh(lastAttemptedAt=" + this.lastAttemptedAt + ", status=" + this.status + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.lastAttemptedAt);
        parcel.writeString(this.status.name());
    }

    public OwnershipRefresh(int i, Status status) {
        status.getClass();
        this.lastAttemptedAt = i;
        this.status = status;
    }
}
