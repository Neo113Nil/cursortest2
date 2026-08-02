package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class TransitionStatus implements Parcelable {

    public final class Transitioning extends TransitionStatus {
        public static final Parcelable.Creator<Transitioning> CREATOR = new MrzKey.Creator(18);
        public final TransitionWorker$TransitionData transitionData;

        public Transitioning(TransitionWorker$TransitionData transitionWorker$TransitionData) {
            transitionWorker$TransitionData.getClass();
            this.transitionData = transitionWorker$TransitionData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Transitioning) && Intrinsics.areEqual(this.transitionData, ((Transitioning) obj).transitionData);
        }

        public final int hashCode() {
            return this.transitionData.hashCode();
        }

        public final String toString() {
            return "Transitioning(transitionData=" + this.transitionData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.transitionData.writeToParcel(parcel, i);
        }
    }

    public final class TransitioningBack extends TransitionStatus {
        public static final TransitioningBack INSTANCE = new TransitioningBack();
        public static final Parcelable.Creator<TransitioningBack> CREATOR = new MrzKey.Creator(19);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TransitioningBack);
        }

        public final int hashCode() {
            return -593165066;
        }

        public final String toString() {
            return "TransitioningBack";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class UpdateInquirySession extends TransitionStatus {
        public static final Parcelable.Creator<UpdateInquirySession> CREATOR = new MrzKey.Creator(20);
        public final boolean canReuseWorkflow;
        public final InquiryState nextStep;

        public UpdateInquirySession(InquiryState inquiryState, boolean z) {
            this.nextStep = inquiryState;
            this.canReuseWorkflow = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateInquirySession)) {
                return false;
            }
            UpdateInquirySession updateInquirySession = (UpdateInquirySession) obj;
            return Intrinsics.areEqual(this.nextStep, updateInquirySession.nextStep) && this.canReuseWorkflow == updateInquirySession.canReuseWorkflow;
        }

        public final int hashCode() {
            InquiryState inquiryState = this.nextStep;
            return Boolean.hashCode(this.canReuseWorkflow) + ((inquiryState == null ? 0 : inquiryState.hashCode()) * 31);
        }

        public final String toString() {
            return "UpdateInquirySession(nextStep=" + this.nextStep + ", canReuseWorkflow=" + this.canReuseWorkflow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.nextStep, i);
            parcel.writeInt(this.canReuseWorkflow ? 1 : 0);
        }
    }

    public final class CheckingForNextState extends TransitionStatus {
        public static final Parcelable.Creator<CheckingForNextState> CREATOR = new MrzKey.Creator(17);
        public final boolean canReuseWorkflow;
        public final PollingMode pollingMode;

        public CheckingForNextState(PollingMode pollingMode, boolean z) {
            pollingMode.getClass();
            this.pollingMode = pollingMode;
            this.canReuseWorkflow = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckingForNextState)) {
                return false;
            }
            CheckingForNextState checkingForNextState = (CheckingForNextState) obj;
            return this.pollingMode == checkingForNextState.pollingMode && this.canReuseWorkflow == checkingForNextState.canReuseWorkflow;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.canReuseWorkflow) + (this.pollingMode.hashCode() * 31);
        }

        public final String toString() {
            return "CheckingForNextState(pollingMode=" + this.pollingMode + ", canReuseWorkflow=" + this.canReuseWorkflow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.pollingMode.name());
            parcel.writeInt(this.canReuseWorkflow ? 1 : 0);
        }

        public /* synthetic */ CheckingForNextState(boolean z, int i) {
            this(PollingMode.Blocking, (i & 2) != 0 ? false : z);
        }
    }
}
