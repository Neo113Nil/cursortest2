package com.stripe.android.financialconnections.domain;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.core.model.Country;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CachedPartnerAccount implements Parcelable {
    public static final Parcelable.Creator<CachedPartnerAccount> CREATOR = new Country.Creator(7);
    public final String id;
    public final String linkedAccountId;

    public CachedPartnerAccount(String str, String str2) {
        str.getClass();
        this.id = str;
        this.linkedAccountId = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedPartnerAccount)) {
            return false;
        }
        CachedPartnerAccount cachedPartnerAccount = (CachedPartnerAccount) obj;
        return Intrinsics.areEqual(this.id, cachedPartnerAccount.id) && Intrinsics.areEqual(this.linkedAccountId, cachedPartnerAccount.linkedAccountId);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.linkedAccountId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CachedPartnerAccount(id=", this.id, ", linkedAccountId=", this.linkedAccountId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.linkedAccountId);
    }
}
