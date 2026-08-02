package com.withpersona.sdk2.inquiry.nfc;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class PassportNfcReaderOutput implements Parcelable {

    public final class Cancel extends PassportNfcReaderOutput {
        public static final Cancel INSTANCE = new Cancel();
        public static final Parcelable.Creator<Cancel> CREATOR = new MrzKey.Creator(24);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -869674698;
        }

        public final String toString() {
            return "Cancel";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Error extends PassportNfcReaderOutput {
        public static final Parcelable.Creator<Error> CREATOR = new MrzKey.Creator(25);
        public final ErrorType cause;
        public final String debugMessage;

        public Error(String str, ErrorType errorType) {
            errorType.getClass();
            this.debugMessage = str;
            this.cause = errorType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.debugMessage);
            parcel.writeString(this.cause.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ErrorType {
        public static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType Unknown;

        /* JADX INFO: Fake field, exist only in values array */
        ErrorType EF0;

        static {
            ErrorType errorType = new ErrorType("AuthenticationError", 0);
            ErrorType errorType2 = new ErrorType("Unknown", 1);
            Unknown = errorType2;
            $VALUES = new ErrorType[]{errorType, errorType2};
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    public final class ReenterDetails extends PassportNfcReaderOutput {
        public static final Parcelable.Creator<ReenterDetails> CREATOR = new MrzKey.Creator(26);
        public final String buttonComponentName;

        public ReenterDetails(String str) {
            str.getClass();
            this.buttonComponentName = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReenterDetails) && Intrinsics.areEqual(this.buttonComponentName, ((ReenterDetails) obj).buttonComponentName);
        }

        public final int hashCode() {
            return this.buttonComponentName.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ReenterDetails(buttonComponentName=", this.buttonComponentName, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.buttonComponentName);
        }
    }

    public final class ShowTroubleshootingTips extends PassportNfcReaderOutput {
        public static final ShowTroubleshootingTips INSTANCE = new ShowTroubleshootingTips();
        public static final Parcelable.Creator<ShowTroubleshootingTips> CREATOR = new MrzKey.Creator(27);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowTroubleshootingTips);
        }

        public final int hashCode() {
            return 1816015673;
        }

        public final String toString() {
            return "ShowTroubleshootingTips";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Success extends PassportNfcReaderOutput {
        public static final Parcelable.Creator<Success> CREATOR = new MrzKey.Creator(28);
        public final ChipAuthenticationStatus chipAuthenticationStatus;
        public final Uri dg1Uri;
        public final Uri dg2Uri;
        public final Uri sodUri;
        public final String submitButtonComponentName;

        public Success(Uri uri, Uri uri2, Uri uri3, ChipAuthenticationStatus chipAuthenticationStatus, String str) {
            chipAuthenticationStatus.getClass();
            str.getClass();
            this.dg1Uri = uri;
            this.dg2Uri = uri2;
            this.sodUri = uri3;
            this.chipAuthenticationStatus = chipAuthenticationStatus;
            this.submitButtonComponentName = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.dg1Uri, i);
            parcel.writeParcelable(this.dg2Uri, i);
            parcel.writeParcelable(this.sodUri, i);
            parcel.writeString(this.chipAuthenticationStatus.name());
            parcel.writeString(this.submitButtonComponentName);
        }
    }
}
