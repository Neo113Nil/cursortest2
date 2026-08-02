package com.stripe.android.uicore.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.android.uicore.elements.ParameterDestination;
import com.stripe.hcaptcha.HCaptchaHtmlKt$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class IdentifierSpec implements Parcelable {
    public final ParameterDestination destination;
    public final boolean ignoreField;
    public final String v1;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<IdentifierSpec> CREATOR = new Creator(0);
    public static final Lazy[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(21))};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/uicore/elements/IdentifierSpec$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stripe-ui-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return IdentifierSpec$$serializer.INSTANCE;
        }
    }

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new IdentifierSpec(parcel.readString(), parcel.readInt() != 0, (ParameterDestination) parcel.readParcelable(IdentifierSpec.class.getClassLoader()));
                case 1:
                    parcel.getClass();
                    return ParameterDestination.Api.valueOf(parcel.readString());
                default:
                    parcel.getClass();
                    return ParameterDestination.Local.valueOf(parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new IdentifierSpec[i];
                case 1:
                    return new ParameterDestination.Api[i];
                default:
                    return new ParameterDestination.Local[i];
            }
        }
    }

    static {
        ParameterDestination parameterDestination = null;
        int i = 2;
        int i2 = 6;
        new IdentifierSpec("billing_details[name]", parameterDestination, i2);
        new IdentifierSpec("card[brand]", parameterDestination, i2);
        new IdentifierSpec("card[networks][preferred]", parameterDestination, i2);
        new IdentifierSpec("card[number]", parameterDestination, i2);
        new IdentifierSpec("card[cvc]", parameterDestination, i2);
        new IdentifierSpec("card[exp_month]", parameterDestination, i2);
        new IdentifierSpec("card[exp_year]", parameterDestination, i2);
        new IdentifierSpec("billing_details[address]", parameterDestination, i2);
        new IdentifierSpec("billing_details[email]", parameterDestination, i2);
        new IdentifierSpec("billing_details[phone]", parameterDestination, i2);
        new IdentifierSpec("billing_details[address][line1]", parameterDestination, i2);
        new IdentifierSpec("billing_details[address][line2]", parameterDestination, i2);
        new IdentifierSpec("billing_details[address][city]", parameterDestination, i2);
        String str = "";
        new IdentifierSpec(str, parameterDestination, i2);
        new IdentifierSpec("billing_details[address][postal_code]", parameterDestination, i2);
        new IdentifierSpec(str, parameterDestination, i2);
        new IdentifierSpec("billing_details[address][state]", parameterDestination, i2);
        new IdentifierSpec("billing_details[address][country]", parameterDestination, i2);
        new IdentifierSpec("save_for_future_use", parameterDestination, i2);
        new IdentifierSpec("address", parameterDestination, i2);
        new IdentifierSpec("same_as_shipping", parameterDestination, 4);
        ParameterDestination.Local local = ParameterDestination.Local.Extras;
        new IdentifierSpec("set_as_default_payment_method", local, i);
        ParameterDestination.Api api = ParameterDestination.Api.Options;
        new IdentifierSpec("blik", api, i);
        new IdentifierSpec("blik[code]", api, i);
        new IdentifierSpec("konbini[confirmation_number]", api, i);
        new IdentifierSpec("bacs_debit[confirmed]", local, i);
        new IdentifierSpec("phone_number_country", local, i);
    }

    public /* synthetic */ IdentifierSpec(int i, String str, boolean z, ParameterDestination parameterDestination) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, IdentifierSpec$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.v1 = str;
        if ((i & 2) == 0) {
            this.ignoreField = false;
        } else {
            this.ignoreField = z;
        }
        if ((i & 4) == 0) {
            this.destination = ParameterDestination.Api.Params;
        } else {
            this.destination = parameterDestination;
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
        if (!(obj instanceof IdentifierSpec)) {
            return false;
        }
        IdentifierSpec identifierSpec = (IdentifierSpec) obj;
        return Intrinsics.areEqual(this.v1, identifierSpec.v1) && this.ignoreField == identifierSpec.ignoreField && Intrinsics.areEqual(this.destination, identifierSpec.destination);
    }

    public final int hashCode() {
        return this.destination.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.v1.hashCode() * 31, 31, this.ignoreField);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("IdentifierSpec(v1=", this.v1, ", ignoreField=", ", destination=", this.ignoreField);
        m1540m.append(this.destination);
        m1540m.append(")");
        return m1540m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.v1);
        parcel.writeInt(this.ignoreField ? 1 : 0);
        parcel.writeParcelable(this.destination, i);
    }

    public IdentifierSpec(String str, boolean z, ParameterDestination parameterDestination) {
        str.getClass();
        parameterDestination.getClass();
        this.v1 = str;
        this.ignoreField = z;
        this.destination = parameterDestination;
    }

    public /* synthetic */ IdentifierSpec(String str, ParameterDestination parameterDestination, int i) {
        this(str, (i & 2) == 0, (i & 4) != 0 ? ParameterDestination.Api.Params : parameterDestination);
    }
}
