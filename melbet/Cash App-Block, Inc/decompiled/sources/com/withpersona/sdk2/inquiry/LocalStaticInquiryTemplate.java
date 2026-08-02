package com.withpersona.sdk2.inquiry;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@ExperimentalInquiryTemplate
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/LocalStaticInquiryTemplate;", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "resourceId", "", "<init>", "(I)V", "getResourceId", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LocalStaticInquiryTemplate implements StaticInquiryTemplate {
    public static final Parcelable.Creator<LocalStaticInquiryTemplate> CREATOR = new Creator();
    private final int resourceId;

    public LocalStaticInquiryTemplate(int i) {
        this.resourceId = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.resourceId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalStaticInquiryTemplate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalStaticInquiryTemplate createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LocalStaticInquiryTemplate(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalStaticInquiryTemplate[] newArray(int i) {
            return new LocalStaticInquiryTemplate[i];
        }
    }
}
