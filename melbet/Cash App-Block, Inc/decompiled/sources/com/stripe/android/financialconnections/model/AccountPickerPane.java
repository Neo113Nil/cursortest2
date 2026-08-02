package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.Country;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class AccountPickerPane implements Parcelable {
    public final String dataAccessNotice;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<AccountPickerPane> CREATOR = new Country.Creator(27);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/AccountPickerPane$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/AccountPickerPane;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return AccountPickerPane$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountPickerPane(int i, String str) {
        if (1 == (i & 1)) {
            this.dataAccessNotice = str;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, AccountPickerPane$$serializer.INSTANCE.getDescriptor());
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
        return (obj instanceof AccountPickerPane) && Intrinsics.areEqual(this.dataAccessNotice, ((AccountPickerPane) obj).dataAccessNotice);
    }

    public final int hashCode() {
        return this.dataAccessNotice.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountPickerPane(dataAccessNotice=", this.dataAccessNotice, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.dataAccessNotice);
    }

    public AccountPickerPane(String str) {
        str.getClass();
        this.dataAccessNotice = str;
    }
}
