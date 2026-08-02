package com.stripe.android.financialconnections.repository;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.google.mlkit.vision.text.Text;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.model.ServerLink;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AttachedPaymentAccountRepository extends Text.TextBase {
    public final Logger$Companion$NOOP_LOGGER$1 logger;

    public final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new ServerLink.Creator(22);
        public final PaymentAccountParams attachedPaymentAccount;

        public State(PaymentAccountParams paymentAccountParams) {
            this.attachedPaymentAccount = paymentAccountParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof State) && Intrinsics.areEqual(this.attachedPaymentAccount, ((State) obj).attachedPaymentAccount);
        }

        public final int hashCode() {
            PaymentAccountParams paymentAccountParams = this.attachedPaymentAccount;
            if (paymentAccountParams == null) {
                return 0;
            }
            return paymentAccountParams.hashCode();
        }

        public final String toString() {
            return "State(attachedPaymentAccount=" + this.attachedPaymentAccount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.attachedPaymentAccount, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachedPaymentAccountRepository(SavedStateHandle savedStateHandle, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        super(savedStateHandle);
        savedStateHandle.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.logger = logger$Companion$NOOP_LOGGER$1;
    }
}
