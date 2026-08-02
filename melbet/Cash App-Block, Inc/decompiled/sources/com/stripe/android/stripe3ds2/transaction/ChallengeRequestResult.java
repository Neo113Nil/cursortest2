package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.stripe.android.stripe3ds2.init.AppInfo;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.hcaptcha.HCaptchaStateListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class ChallengeRequestResult implements Parcelable {

    public abstract class Failure extends ChallengeRequestResult {
    }

    public final class ProtocolError extends Failure {
        public static final Parcelable.Creator<ProtocolError> CREATOR = new AppInfo.Creator(27);
        public final ErrorData data;

        public ProtocolError(ErrorData errorData) {
            errorData.getClass();
            this.data = errorData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProtocolError) && Intrinsics.areEqual(this.data, ((ProtocolError) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final String toString() {
            return "ProtocolError(data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.data.writeToParcel(parcel, i);
        }
    }

    public final class RuntimeError extends Failure {
        public static final Parcelable.Creator<RuntimeError> CREATOR = new AppInfo.Creator(28);
        public final Throwable throwable;

        public RuntimeError(Throwable th) {
            th.getClass();
            this.throwable = th;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RuntimeError) && Intrinsics.areEqual(this.throwable, ((RuntimeError) obj).throwable);
        }

        public final int hashCode() {
            return this.throwable.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("RuntimeError(throwable=", ")", this.throwable);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.throwable);
        }
    }

    public final class Success extends ChallengeRequestResult {
        public static final Parcelable.Creator<Success> CREATOR = new AppInfo.Creator(29);
        public final ChallengeRequestData creqData;
        public final ChallengeRequestExecutor$Config creqExecutorConfig;
        public final ChallengeResponseData cresData;

        public Success(ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData, ChallengeRequestExecutor$Config challengeRequestExecutor$Config) {
            challengeRequestData.getClass();
            challengeResponseData.getClass();
            challengeRequestExecutor$Config.getClass();
            this.creqData = challengeRequestData;
            this.cresData = challengeResponseData;
            this.creqExecutorConfig = challengeRequestExecutor$Config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.creqData, success.creqData) && Intrinsics.areEqual(this.cresData, success.cresData) && Intrinsics.areEqual(this.creqExecutorConfig, success.creqExecutorConfig);
        }

        public final int hashCode() {
            return this.creqExecutorConfig.hashCode() + ((this.cresData.hashCode() + (this.creqData.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Success(creqData=" + this.creqData + ", cresData=" + this.cresData + ", creqExecutorConfig=" + this.creqExecutorConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.creqData.writeToParcel(parcel, i);
            this.cresData.writeToParcel(parcel, i);
            this.creqExecutorConfig.writeToParcel(parcel, i);
        }
    }

    public final class Timeout extends Failure {
        public static final Parcelable.Creator<Timeout> CREATOR = new HCaptchaStateListener.Creator(1);
        public final ErrorData data;

        public Timeout(ErrorData errorData) {
            errorData.getClass();
            this.data = errorData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Timeout) && Intrinsics.areEqual(this.data, ((Timeout) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final String toString() {
            return "Timeout(data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.data.writeToParcel(parcel, i);
        }
    }
}
