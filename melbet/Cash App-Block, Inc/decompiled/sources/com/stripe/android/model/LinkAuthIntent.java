package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentIntent;
import com.stripe.hcaptcha.HCaptchaHtmlKt$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class LinkAuthIntent implements StripeModel {
    public final Status status;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<LinkAuthIntent> CREATOR = new PaymentIntent.Creator(5);
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(3))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/LinkAuthIntent$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/LinkAuthIntent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return LinkAuthIntent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Status {
        public static final /* synthetic */ Status[] $VALUES = {new Status("Created", 0), new Status("Authenticated", 1), new Status("Consented", 2), new Status("Rejected", 3), new Status("Expired", 4)};

        /* JADX INFO: Fake field, exist only in values array */
        Status EF5;

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public /* synthetic */ LinkAuthIntent(int i, Status status) {
        if (1 == (i & 1)) {
            this.status = status;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, LinkAuthIntent$$serializer.INSTANCE.getDescriptor());
            throw null;
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
        return (obj instanceof LinkAuthIntent) && this.status == ((LinkAuthIntent) obj).status;
    }

    public final int hashCode() {
        return this.status.hashCode();
    }

    public final String toString() {
        return "LinkAuthIntent(status=" + this.status + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.status.name());
    }

    public LinkAuthIntent(Status status) {
        status.getClass();
        this.status = status;
    }
}
