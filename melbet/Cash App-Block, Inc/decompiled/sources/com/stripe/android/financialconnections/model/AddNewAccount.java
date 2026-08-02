package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.Country;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class AddNewAccount implements Parcelable {
    public final String body;
    public final Image icon;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<AddNewAccount> CREATOR = new Country.Creator(28);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/AddNewAccount$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/AddNewAccount;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return AddNewAccount$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddNewAccount(int i, Image image, String str) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, AddNewAccount$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.body = str;
        if ((i & 2) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
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
        if (!(obj instanceof AddNewAccount)) {
            return false;
        }
        AddNewAccount addNewAccount = (AddNewAccount) obj;
        return Intrinsics.areEqual(this.body, addNewAccount.body) && Intrinsics.areEqual(this.icon, addNewAccount.icon);
    }

    public final int hashCode() {
        int hashCode = this.body.hashCode() * 31;
        Image image = this.icon;
        return hashCode + (image == null ? 0 : image.hashCode());
    }

    public final String toString() {
        return "AddNewAccount(body=" + this.body + ", icon=" + this.icon + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.body);
        Image image = this.icon;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(image.f809default);
        }
    }

    public AddNewAccount(Image image, String str) {
        str.getClass();
        this.body = str;
        this.icon = image;
    }
}
