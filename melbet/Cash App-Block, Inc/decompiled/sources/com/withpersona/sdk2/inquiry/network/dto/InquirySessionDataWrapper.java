package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "Landroid/os/Parcelable;", "accessToken", "", "inquirySessionData", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;)V", "getAccessToken", "()Ljava/lang/String;", "getInquirySessionData", "()Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InquirySessionDataWrapper implements Parcelable {
    public static final Parcelable.Creator<InquirySessionDataWrapper> CREATOR = new Creator();
    private final String accessToken;
    private final InquirySessionData inquirySessionData;

    public InquirySessionDataWrapper(String str, InquirySessionData inquirySessionData) {
        str.getClass();
        inquirySessionData.getClass();
        this.accessToken = str;
        this.inquirySessionData = inquirySessionData;
    }

    public static /* synthetic */ InquirySessionDataWrapper copy$default(InquirySessionDataWrapper inquirySessionDataWrapper, String str, InquirySessionData inquirySessionData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inquirySessionDataWrapper.accessToken;
        }
        if ((i & 2) != 0) {
            inquirySessionData = inquirySessionDataWrapper.inquirySessionData;
        }
        return inquirySessionDataWrapper.copy(str, inquirySessionData);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final InquirySessionData getInquirySessionData() {
        return this.inquirySessionData;
    }

    public final InquirySessionDataWrapper copy(String accessToken, InquirySessionData inquirySessionData) {
        accessToken.getClass();
        inquirySessionData.getClass();
        return new InquirySessionDataWrapper(accessToken, inquirySessionData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InquirySessionDataWrapper)) {
            return false;
        }
        InquirySessionDataWrapper inquirySessionDataWrapper = (InquirySessionDataWrapper) other;
        return Intrinsics.areEqual(this.accessToken, inquirySessionDataWrapper.accessToken) && Intrinsics.areEqual(this.inquirySessionData, inquirySessionDataWrapper.inquirySessionData);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final InquirySessionData getInquirySessionData() {
        return this.inquirySessionData;
    }

    public int hashCode() {
        return this.inquirySessionData.hashCode() + (this.accessToken.hashCode() * 31);
    }

    public String toString() {
        return "InquirySessionDataWrapper(accessToken=" + this.accessToken + ", inquirySessionData=" + this.inquirySessionData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.accessToken);
        this.inquirySessionData.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InquirySessionDataWrapper> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InquirySessionDataWrapper createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new InquirySessionDataWrapper(parcel.readString(), InquirySessionData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InquirySessionDataWrapper[] newArray(int i) {
            return new InquirySessionDataWrapper[i];
        }
    }
}
