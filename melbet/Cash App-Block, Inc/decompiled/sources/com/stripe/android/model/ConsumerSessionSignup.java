package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class ConsumerSessionSignup implements StripeModel {
    public final ConsumerSession consumerSession;
    public final String publishableKey;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ConsumerSessionSignup> CREATOR = new PaymentIntent.Creator(2);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/ConsumerSessionSignup$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsumerSessionSignup;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ConsumerSessionSignup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConsumerSessionSignup(int i, ConsumerSession consumerSession, String str) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, ConsumerSessionSignup$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.consumerSession = consumerSession;
        if ((i & 2) == 0) {
            this.publishableKey = null;
        } else {
            this.publishableKey = str;
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
        if (!(obj instanceof ConsumerSessionSignup)) {
            return false;
        }
        ConsumerSessionSignup consumerSessionSignup = (ConsumerSessionSignup) obj;
        return Intrinsics.areEqual(this.consumerSession, consumerSessionSignup.consumerSession) && Intrinsics.areEqual(this.publishableKey, consumerSessionSignup.publishableKey);
    }

    public final int hashCode() {
        int hashCode = this.consumerSession.hashCode() * 31;
        String str = this.publishableKey;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ConsumerSessionSignup(consumerSession=" + this.consumerSession + ", publishableKey=" + this.publishableKey + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.consumerSession.writeToParcel(parcel, i);
        parcel.writeString(this.publishableKey);
    }

    public ConsumerSessionSignup(ConsumerSession consumerSession, String str) {
        consumerSession.getClass();
        this.consumerSession = consumerSession;
        this.publishableKey = str;
    }
}
