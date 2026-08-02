package com.withpersona.sdk2.inquiry.steps.ui.mdoc;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import net.oneformapp.schema.Element;

/* loaded from: classes9.dex */
public final class MdocRequestMetadata$GoogleWalletRequestMetadata implements Parcelable {
    public static final Parcelable.Creator<MdocRequestMetadata$GoogleWalletRequestMetadata> CREATOR = new Element.AnonymousClass1(2);
    public final MdocRequestMetadata$IdType idType;
    public final String nonce;
    public final String requestJson;

    public MdocRequestMetadata$GoogleWalletRequestMetadata(String str, MdocRequestMetadata$IdType mdocRequestMetadata$IdType, String str2) {
        str.getClass();
        mdocRequestMetadata$IdType.getClass();
        str2.getClass();
        this.nonce = str;
        this.idType = mdocRequestMetadata$IdType;
        this.requestJson = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdocRequestMetadata$GoogleWalletRequestMetadata)) {
            return false;
        }
        MdocRequestMetadata$GoogleWalletRequestMetadata mdocRequestMetadata$GoogleWalletRequestMetadata = (MdocRequestMetadata$GoogleWalletRequestMetadata) obj;
        return Intrinsics.areEqual(this.nonce, mdocRequestMetadata$GoogleWalletRequestMetadata.nonce) && this.idType == mdocRequestMetadata$GoogleWalletRequestMetadata.idType && Intrinsics.areEqual(this.requestJson, mdocRequestMetadata$GoogleWalletRequestMetadata.requestJson);
    }

    public final int hashCode() {
        return this.requestJson.hashCode() + ((this.idType.hashCode() + (this.nonce.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoogleWalletRequestMetadata(nonce=");
        sb.append(this.nonce);
        sb.append(", idType=");
        sb.append(this.idType);
        sb.append(", requestJson=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.requestJson, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.nonce);
        parcel.writeString(this.idType.name());
        parcel.writeString(this.requestJson);
    }
}
