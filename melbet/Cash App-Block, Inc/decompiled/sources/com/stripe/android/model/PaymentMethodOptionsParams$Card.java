package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Source;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.face.iad.capture.internal.y0;

/* loaded from: classes8.dex */
public final class PaymentMethodOptionsParams$Card implements Parcelable {
    public static final Parcelable.Creator<PaymentMethodOptionsParams$Card> CREATOR = new Source.Creator(23);
    public final String cvc;
    public final Boolean moto;
    public final String network;
    public final ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage;

    public PaymentMethodOptionsParams$Card(String str, String str2, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, Boolean bool) {
        y0 y0Var = PaymentMethod.Type.Companion;
        this.cvc = str;
        this.network = str2;
        this.setupFutureUsage = setupFutureUsage;
        this.moto = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodOptionsParams$Card)) {
            return false;
        }
        PaymentMethodOptionsParams$Card paymentMethodOptionsParams$Card = (PaymentMethodOptionsParams$Card) obj;
        return Intrinsics.areEqual(this.cvc, paymentMethodOptionsParams$Card.cvc) && Intrinsics.areEqual(this.network, paymentMethodOptionsParams$Card.network) && this.setupFutureUsage == paymentMethodOptionsParams$Card.setupFutureUsage && Intrinsics.areEqual(this.moto, paymentMethodOptionsParams$Card.moto);
    }

    public final int hashCode() {
        String str = this.cvc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.network;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
        int hashCode3 = (hashCode2 + (setupFutureUsage == null ? 0 : setupFutureUsage.hashCode())) * 31;
        Boolean bool = this.moto;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Card(cvc=", this.cvc, ", network=", this.network, ", setupFutureUsage=");
        m.append(this.setupFutureUsage);
        m.append(", moto=");
        m.append(this.moto);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.cvc);
        parcel.writeString(this.network);
        ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
        if (setupFutureUsage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(setupFutureUsage.name());
        }
        Boolean bool = this.moto;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
        }
    }

    public /* synthetic */ PaymentMethodOptionsParams$Card(ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
        this(null, null, setupFutureUsage, Boolean.TRUE);
    }
}
