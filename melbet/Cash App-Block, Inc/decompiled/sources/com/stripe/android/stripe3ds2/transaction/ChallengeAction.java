package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.stripe.android.stripe3ds2.init.AppInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class ChallengeAction implements Parcelable {

    public final class Cancel extends ChallengeAction {
        public static final Cancel INSTANCE = new Cancel();
        public static final Parcelable.Creator<Cancel> CREATOR = new AppInfo.Creator(19);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class HtmlForm extends ChallengeAction {
        public static final Parcelable.Creator<HtmlForm> CREATOR = new AppInfo.Creator(20);
        public final String userEntry;

        public HtmlForm(String str) {
            str.getClass();
            this.userEntry = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HtmlForm) && Intrinsics.areEqual(this.userEntry, ((HtmlForm) obj).userEntry);
        }

        public final int hashCode() {
            return this.userEntry.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HtmlForm(userEntry=", this.userEntry, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.userEntry);
        }
    }

    public final class NativeForm extends ChallengeAction {
        public static final Parcelable.Creator<NativeForm> CREATOR = new AppInfo.Creator(21);
        public final String userEntry;
        public final Boolean whitelistingValue;

        public NativeForm(String str, Boolean bool) {
            str.getClass();
            this.userEntry = str;
            this.whitelistingValue = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NativeForm)) {
                return false;
            }
            NativeForm nativeForm = (NativeForm) obj;
            return Intrinsics.areEqual(this.userEntry, nativeForm.userEntry) && Intrinsics.areEqual(this.whitelistingValue, nativeForm.whitelistingValue);
        }

        public final int hashCode() {
            int hashCode = this.userEntry.hashCode() * 31;
            Boolean bool = this.whitelistingValue;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return "NativeForm(userEntry=" + this.userEntry + ", whitelistingValue=" + this.whitelistingValue + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.userEntry);
            Boolean bool = this.whitelistingValue;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
            }
        }
    }

    public final class Oob extends ChallengeAction {
        public static final Parcelable.Creator<Oob> CREATOR = new AppInfo.Creator(22);
        public final Boolean whitelistingValue;

        public Oob(Boolean bool) {
            this.whitelistingValue = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Oob) && Intrinsics.areEqual(this.whitelistingValue, ((Oob) obj).whitelistingValue);
        }

        public final int hashCode() {
            Boolean bool = this.whitelistingValue;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m(this.whitelistingValue, "Oob(whitelistingValue=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Boolean bool = this.whitelistingValue;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
            }
        }
    }

    public final class Resend extends ChallengeAction {
        public static final Resend INSTANCE = new Resend();
        public static final Parcelable.Creator<Resend> CREATOR = new AppInfo.Creator(23);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
