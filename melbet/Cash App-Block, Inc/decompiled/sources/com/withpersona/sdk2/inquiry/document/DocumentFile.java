package com.withpersona.sdk2.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.hcaptcha.HCaptchaStateListener;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class DocumentFile implements Parcelable {

    public final class Local extends DocumentFile {
        public static final Parcelable.Creator<Local> CREATOR = new HCaptchaStateListener.Creator(22);
        public final String absoluteFilePath;
        public final CaptureMethod captureMethod;
        public final int uploadProgress;

        public Local(String str, CaptureMethod captureMethod, int i) {
            str.getClass();
            captureMethod.getClass();
            this.absoluteFilePath = str;
            this.captureMethod = captureMethod;
            this.uploadProgress = i;
        }

        public static Local copy$default(Local local, int i) {
            String str = local.absoluteFilePath;
            CaptureMethod captureMethod = local.captureMethod;
            str.getClass();
            captureMethod.getClass();
            return new Local(str, captureMethod, i);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Local.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            return Intrinsics.areEqual(this.absoluteFilePath, ((Local) obj).absoluteFilePath);
        }

        public final int hashCode() {
            return this.absoluteFilePath.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Local(absoluteFilePath=");
            sb.append(this.absoluteFilePath);
            sb.append(", captureMethod=");
            sb.append(this.captureMethod);
            sb.append(", uploadProgress=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.uploadProgress, ")", sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.absoluteFilePath);
            this.captureMethod.writeToParcel(parcel, i);
            parcel.writeInt(this.uploadProgress);
        }
    }

    public final class Remote extends DocumentFile {
        public static final Parcelable.Creator<Remote> CREATOR = new HCaptchaStateListener.Creator(23);
        public final String absoluteFilePath;
        public final String documentFileId;
        public final String filename;
        public final String remoteUrl;

        public Remote(String str, String str2, String str3, String str4) {
            str3.getClass();
            str4.getClass();
            this.absoluteFilePath = str;
            this.filename = str2;
            this.remoteUrl = str3;
            this.documentFileId = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) obj;
            return Intrinsics.areEqual(this.absoluteFilePath, remote.absoluteFilePath) && Intrinsics.areEqual(this.filename, remote.filename) && Intrinsics.areEqual(this.remoteUrl, remote.remoteUrl) && Intrinsics.areEqual(this.documentFileId, remote.documentFileId);
        }

        public final int hashCode() {
            String str = this.absoluteFilePath;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.filename;
            return this.documentFileId.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.remoteUrl);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Remote(absoluteFilePath=", this.absoluteFilePath, ", filename=", this.filename, ", remoteUrl="), this.remoteUrl, ", documentFileId=", this.documentFileId, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.absoluteFilePath);
            parcel.writeString(this.filename);
            parcel.writeString(this.remoteUrl);
            parcel.writeString(this.documentFileId);
        }
    }
}
