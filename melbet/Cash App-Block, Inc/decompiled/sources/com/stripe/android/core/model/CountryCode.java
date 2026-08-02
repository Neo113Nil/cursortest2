package com.stripe.android.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.Country;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class CountryCode implements Parcelable {
    public final String value;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<CountryCode> CREATOR = new Country.Creator(4);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/core/model/CountryCode$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/core/model/CountryCode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public static CountryCode create(String str) {
            str.getClass();
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return new CountryCode(upperCase);
        }

        public final KSerializer serializer() {
            return CountryCode$$serializer.INSTANCE;
        }
    }

    static {
        new CountryCode("US");
        new CountryCode("CA");
        new CountryCode("GB");
    }

    public /* synthetic */ CountryCode(int i, String str) {
        if (1 == (i & 1)) {
            this.value = str;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, CountryCode$$serializer.INSTANCE.getDescriptor());
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
        return (obj instanceof CountryCode) && Intrinsics.areEqual(this.value, ((CountryCode) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CountryCode(value=", this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.value);
    }

    public CountryCode(String str) {
        str.getClass();
        this.value = str;
    }
}
