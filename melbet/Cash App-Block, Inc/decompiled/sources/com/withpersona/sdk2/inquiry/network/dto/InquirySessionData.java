package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "Lcom/withpersona/sdk2/inquiry/network/dto/Included;", "Landroid/os/Parcelable;", "id", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;", "relationships", "Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;)V", "getId", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;", "getRelationships", "()Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InquirySessionData implements Included, Parcelable {
    public static final Parcelable.Creator<InquirySessionData> CREATOR = new Creator();
    private final Attributes attributes;
    private final String id;
    private final Relationships relationships;

    public InquirySessionData(String str, Attributes attributes, Relationships relationships) {
        str.getClass();
        attributes.getClass();
        this.id = str;
        this.attributes = attributes;
        this.relationships = relationships;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    public final String getId() {
        return this.id;
    }

    public final Relationships getRelationships() {
        return this.relationships;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        this.attributes.writeToParcel(dest, flags);
        Relationships relationships = this.relationships;
        if (relationships == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            relationships.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InquirySessionData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InquirySessionData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new InquirySessionData(parcel.readString(), Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Relationships.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InquirySessionData[] newArray(int i) {
            return new InquirySessionData[i];
        }
    }
}
