package com.withpersona.sdk2.inquiry.inline_inquiry;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public interface InquiryEvent extends Parcelable {

    public final class PageChange implements InquiryEvent {
        public static final Parcelable.Creator<PageChange> CREATOR = new RawExtraction.Creator(25);
        public final String name;
        public final String path;

        public PageChange(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.name = str;
            this.path = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageChange)) {
                return false;
            }
            PageChange pageChange = (PageChange) obj;
            return Intrinsics.areEqual(this.name, pageChange.name) && Intrinsics.areEqual(this.path, pageChange.path);
        }

        public final int hashCode() {
            return this.path.hashCode() + (this.name.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("PageChange(name=", this.name, ", path=", this.path, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.name);
            parcel.writeString(this.path);
        }
    }

    public final class StartEvent implements InquiryEvent {
        public static final Parcelable.Creator<StartEvent> CREATOR = new RawExtraction.Creator(26);
        public final String inquiryId;
        public final String sessionToken;

        public StartEvent(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.inquiryId = str;
            this.sessionToken = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartEvent)) {
                return false;
            }
            StartEvent startEvent = (StartEvent) obj;
            return Intrinsics.areEqual(this.inquiryId, startEvent.inquiryId) && Intrinsics.areEqual(this.sessionToken, startEvent.sessionToken);
        }

        public final int hashCode() {
            return this.sessionToken.hashCode() + (this.inquiryId.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("StartEvent(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
        }
    }
}
