package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import com.stripe.hcaptcha.HCaptchaStateListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class ChallengeResult implements Parcelable {

    /* loaded from: classes8.dex */
    public final class Canceled extends ChallengeResult {
        public static final Parcelable.Creator<Canceled> CREATOR = new HCaptchaStateListener.Creator(2);
        public final UiType initialUiType;
        public final IntentData intentData;
        public final String uiTypeCode;

        public Canceled(String str, UiType uiType, IntentData intentData) {
            intentData.getClass();
            this.uiTypeCode = str;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Canceled)) {
                return false;
            }
            Canceled canceled = (Canceled) obj;
            return Intrinsics.areEqual(this.uiTypeCode, canceled.uiTypeCode) && this.initialUiType == canceled.initialUiType && Intrinsics.areEqual(this.intentData, canceled.intentData);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public final UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public final IntentData getIntentData() {
            return this.intentData;
        }

        public final int hashCode() {
            String str = this.uiTypeCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            UiType uiType = this.initialUiType;
            return this.intentData.hashCode() + ((hashCode + (uiType != null ? uiType.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Canceled(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(uiType.name());
            }
            this.intentData.writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes8.dex */
    public final class Failed extends ChallengeResult {
        public static final Parcelable.Creator<Failed> CREATOR = new HCaptchaStateListener.Creator(3);
        public final UiType initialUiType;
        public final IntentData intentData;
        public final String uiTypeCode;

        public Failed(String str, UiType uiType, IntentData intentData) {
            str.getClass();
            intentData.getClass();
            this.uiTypeCode = str;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) obj;
            return Intrinsics.areEqual(this.uiTypeCode, failed.uiTypeCode) && this.initialUiType == failed.initialUiType && Intrinsics.areEqual(this.intentData, failed.intentData);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public final UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public final IntentData getIntentData() {
            return this.intentData;
        }

        public final int hashCode() {
            int hashCode = this.uiTypeCode.hashCode() * 31;
            UiType uiType = this.initialUiType;
            return this.intentData.hashCode() + ((hashCode + (uiType == null ? 0 : uiType.hashCode())) * 31);
        }

        public final String toString() {
            return "Failed(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(uiType.name());
            }
            this.intentData.writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes8.dex */
    public final class ProtocolError extends ChallengeResult {
        public static final Parcelable.Creator<ProtocolError> CREATOR = new HCaptchaStateListener.Creator(4);
        public final ErrorData data;
        public final UiType initialUiType;
        public final IntentData intentData;

        public ProtocolError(ErrorData errorData, UiType uiType, IntentData intentData) {
            errorData.getClass();
            intentData.getClass();
            this.data = errorData;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProtocolError)) {
                return false;
            }
            ProtocolError protocolError = (ProtocolError) obj;
            return Intrinsics.areEqual(this.data, protocolError.data) && this.initialUiType == protocolError.initialUiType && Intrinsics.areEqual(this.intentData, protocolError.intentData);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public final UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public final IntentData getIntentData() {
            return this.intentData;
        }

        public final int hashCode() {
            int hashCode = this.data.hashCode() * 31;
            UiType uiType = this.initialUiType;
            return this.intentData.hashCode() + ((hashCode + (uiType == null ? 0 : uiType.hashCode())) * 31);
        }

        public final String toString() {
            return "ProtocolError(data=" + this.data + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.data.writeToParcel(parcel, i);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(uiType.name());
            }
            this.intentData.writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes8.dex */
    public final class RuntimeError extends ChallengeResult {
        public static final Parcelable.Creator<RuntimeError> CREATOR = new HCaptchaStateListener.Creator(5);
        public final UiType initialUiType;
        public final IntentData intentData;
        public final Throwable throwable;

        public RuntimeError(Throwable th, UiType uiType, IntentData intentData) {
            th.getClass();
            intentData.getClass();
            this.throwable = th;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RuntimeError)) {
                return false;
            }
            RuntimeError runtimeError = (RuntimeError) obj;
            return Intrinsics.areEqual(this.throwable, runtimeError.throwable) && this.initialUiType == runtimeError.initialUiType && Intrinsics.areEqual(this.intentData, runtimeError.intentData);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public final UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public final IntentData getIntentData() {
            return this.intentData;
        }

        public final int hashCode() {
            int hashCode = this.throwable.hashCode() * 31;
            UiType uiType = this.initialUiType;
            return this.intentData.hashCode() + ((hashCode + (uiType == null ? 0 : uiType.hashCode())) * 31);
        }

        public final String toString() {
            return "RuntimeError(throwable=" + this.throwable + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.throwable);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(uiType.name());
            }
            this.intentData.writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes8.dex */
    public final class Succeeded extends ChallengeResult {
        public static final Parcelable.Creator<Succeeded> CREATOR = new HCaptchaStateListener.Creator(6);
        public final UiType initialUiType;
        public final IntentData intentData;
        public final String uiTypeCode;

        public Succeeded(String str, UiType uiType, IntentData intentData) {
            str.getClass();
            intentData.getClass();
            this.uiTypeCode = str;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Succeeded)) {
                return false;
            }
            Succeeded succeeded = (Succeeded) obj;
            return Intrinsics.areEqual(this.uiTypeCode, succeeded.uiTypeCode) && this.initialUiType == succeeded.initialUiType && Intrinsics.areEqual(this.intentData, succeeded.intentData);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public final UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public final IntentData getIntentData() {
            return this.intentData;
        }

        public final int hashCode() {
            int hashCode = this.uiTypeCode.hashCode() * 31;
            UiType uiType = this.initialUiType;
            return this.intentData.hashCode() + ((hashCode + (uiType == null ? 0 : uiType.hashCode())) * 31);
        }

        public final String toString() {
            return "Succeeded(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(uiType.name());
            }
            this.intentData.writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes8.dex */
    public final class Timeout extends ChallengeResult {
        public static final Parcelable.Creator<Timeout> CREATOR = new HCaptchaStateListener.Creator(7);
        public final UiType initialUiType;
        public final IntentData intentData;
        public final String uiTypeCode;

        public Timeout(String str, UiType uiType, IntentData intentData) {
            intentData.getClass();
            this.uiTypeCode = str;
            this.initialUiType = uiType;
            this.intentData = intentData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Timeout)) {
                return false;
            }
            Timeout timeout = (Timeout) obj;
            return Intrinsics.areEqual(this.uiTypeCode, timeout.uiTypeCode) && this.initialUiType == timeout.initialUiType && Intrinsics.areEqual(this.intentData, timeout.intentData);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public final UiType getInitialUiType() {
            return this.initialUiType;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResult
        public final IntentData getIntentData() {
            return this.intentData;
        }

        public final int hashCode() {
            String str = this.uiTypeCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            UiType uiType = this.initialUiType;
            return this.intentData.hashCode() + ((hashCode + (uiType != null ? uiType.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Timeout(uiTypeCode=" + this.uiTypeCode + ", initialUiType=" + this.initialUiType + ", intentData=" + this.intentData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.uiTypeCode);
            UiType uiType = this.initialUiType;
            if (uiType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(uiType.name());
            }
            this.intentData.writeToParcel(parcel, i);
        }
    }

    public abstract UiType getInitialUiType();

    public abstract IntentData getIntentData();
}
