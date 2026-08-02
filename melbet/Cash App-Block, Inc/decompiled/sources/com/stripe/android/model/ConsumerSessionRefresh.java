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
public final class ConsumerSessionRefresh implements StripeModel {
    public final ConsumerSession consumerSession;
    public final LinkAuthIntent linkAuthIntent;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ConsumerSessionRefresh> CREATOR = new PaymentIntent.Creator(1);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/ConsumerSessionRefresh$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsumerSessionRefresh;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ConsumerSessionRefresh$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConsumerSessionRefresh(int i, ConsumerSession consumerSession, LinkAuthIntent linkAuthIntent) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, ConsumerSessionRefresh$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.consumerSession = consumerSession;
        this.linkAuthIntent = linkAuthIntent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumerSessionRefresh)) {
            return false;
        }
        ConsumerSessionRefresh consumerSessionRefresh = (ConsumerSessionRefresh) obj;
        return Intrinsics.areEqual(this.consumerSession, consumerSessionRefresh.consumerSession) && Intrinsics.areEqual(this.linkAuthIntent, consumerSessionRefresh.linkAuthIntent);
    }

    public final int hashCode() {
        int hashCode = this.consumerSession.hashCode() * 31;
        LinkAuthIntent linkAuthIntent = this.linkAuthIntent;
        return hashCode + (linkAuthIntent == null ? 0 : linkAuthIntent.status.hashCode());
    }

    public final String toString() {
        return "ConsumerSessionRefresh(consumerSession=" + this.consumerSession + ", linkAuthIntent=" + this.linkAuthIntent + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.consumerSession.writeToParcel(parcel, i);
        LinkAuthIntent linkAuthIntent = this.linkAuthIntent;
        if (linkAuthIntent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkAuthIntent.writeToParcel(parcel, i);
        }
    }

    public ConsumerSessionRefresh(ConsumerSession consumerSession, LinkAuthIntent linkAuthIntent) {
        consumerSession.getClass();
        this.consumerSession = consumerSession;
        this.linkAuthIntent = linkAuthIntent;
    }
}
