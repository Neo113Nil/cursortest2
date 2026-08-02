package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.workflows.SimpleWorkflowState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public abstract class GovernmentIdState extends SimpleWorkflowState implements Parcelable {
    public boolean didGoBack;

    public final class AutoClassificationManualSelect extends GovernmentIdState {
        public static final Parcelable.Creator<AutoClassificationManualSelect> CREATOR = new Frame.Creator(15);
        public final GovernmentIdState backState;
        public final CameraProperties cameraProperties;
        public final List captureFrames;
        public final String countryCode;
        public final IdPart$SideIdPart currentPart;
        public final List idConfigsForCountry;
        public final int partIndex;
        public final List parts;
        public final String selectedCountryCode;
        public final String selectedIdClass;
        public final List uploadingIds;

        public AutoClassificationManualSelect(IdPart$SideIdPart idPart$SideIdPart, List list, List list2, int i, GovernmentIdState governmentIdState, String str, List list3, CameraProperties cameraProperties, List list4, String str2, String str3) {
            idPart$SideIdPart.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            cameraProperties.getClass();
            list4.getClass();
            this.currentPart = idPart$SideIdPart;
            this.uploadingIds = list;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.captureFrames = list3;
            this.cameraProperties = cameraProperties;
            this.idConfigsForCountry = list4;
            this.selectedCountryCode = str2;
            this.selectedIdClass = str3;
        }

        public static AutoClassificationManualSelect copy$default(AutoClassificationManualSelect autoClassificationManualSelect, String str, String str2, int i) {
            IdPart$SideIdPart idPart$SideIdPart = autoClassificationManualSelect.currentPart;
            List list = autoClassificationManualSelect.uploadingIds;
            List list2 = autoClassificationManualSelect.parts;
            int i2 = autoClassificationManualSelect.partIndex;
            GovernmentIdState governmentIdState = autoClassificationManualSelect.backState;
            String str3 = autoClassificationManualSelect.countryCode;
            List list3 = autoClassificationManualSelect.captureFrames;
            CameraProperties cameraProperties = autoClassificationManualSelect.cameraProperties;
            List list4 = autoClassificationManualSelect.idConfigsForCountry;
            if ((i & 512) != 0) {
                str = autoClassificationManualSelect.selectedCountryCode;
            }
            String str4 = str;
            if ((i & 1024) != 0) {
                str2 = autoClassificationManualSelect.selectedIdClass;
            }
            idPart$SideIdPart.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            cameraProperties.getClass();
            list4.getClass();
            return new AutoClassificationManualSelect(idPart$SideIdPart, list, list2, i2, governmentIdState, str3, list3, cameraProperties, list4, str4, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoClassificationManualSelect)) {
                return false;
            }
            AutoClassificationManualSelect autoClassificationManualSelect = (AutoClassificationManualSelect) obj;
            return Intrinsics.areEqual(this.currentPart, autoClassificationManualSelect.currentPart) && Intrinsics.areEqual(this.uploadingIds, autoClassificationManualSelect.uploadingIds) && Intrinsics.areEqual(this.parts, autoClassificationManualSelect.parts) && this.partIndex == autoClassificationManualSelect.partIndex && Intrinsics.areEqual(this.backState, autoClassificationManualSelect.backState) && Intrinsics.areEqual(this.countryCode, autoClassificationManualSelect.countryCode) && Intrinsics.areEqual(this.captureFrames, autoClassificationManualSelect.captureFrames) && Intrinsics.areEqual(this.cameraProperties, autoClassificationManualSelect.cameraProperties) && Intrinsics.areEqual(this.idConfigsForCountry, autoClassificationManualSelect.idConfigsForCountry) && Intrinsics.areEqual(this.selectedCountryCode, autoClassificationManualSelect.selectedCountryCode) && Intrinsics.areEqual(this.selectedIdClass, autoClassificationManualSelect.selectedIdClass);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final GovernmentIdState getBackState$government_id_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final String getCountryCode$government_id_release() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final IdPart$SideIdPart getCurrentPart$government_id_release() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final int getPartIndex$government_id_release() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.partIndex, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.currentPart.side.hashCode() * 31, 31, this.uploadingIds), 31, this.parts), 31);
            GovernmentIdState governmentIdState = this.backState;
            int hashCode = (m + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int m2 = Recorder$$ExternalSyntheticOutline2.m((this.cameraProperties.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.captureFrames)) * 31, 31, this.idConfigsForCountry);
            String str2 = this.selectedCountryCode;
            int hashCode2 = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.selectedIdClass;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AutoClassificationManualSelect(currentPart=");
            sb.append(this.currentPart);
            sb.append(", uploadingIds=");
            sb.append(this.uploadingIds);
            sb.append(", parts=");
            sb.append(this.parts);
            sb.append(", partIndex=");
            sb.append(this.partIndex);
            sb.append(", backState=");
            sb.append(this.backState);
            sb.append(", countryCode=");
            sb.append(this.countryCode);
            sb.append(", captureFrames=");
            sb.append(this.captureFrames);
            sb.append(", cameraProperties=");
            sb.append(this.cameraProperties);
            sb.append(", idConfigsForCountry=");
            Recorder$$ExternalSyntheticOutline2.m(", selectedCountryCode=", this.selectedCountryCode, ", selectedIdClass=", sb, this.idConfigsForCountry);
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.selectedIdClass, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.currentPart.writeToParcel(parcel, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.uploadingIds, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.parts, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.countryCode);
            Iterator m3 = CameraState$Type$EnumUnboxingLocalUtility.m(this.captureFrames, parcel);
            while (m3.hasNext()) {
                ((Frame) m3.next()).writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.cameraProperties, i);
            Iterator m4 = CameraState$Type$EnumUnboxingLocalUtility.m(this.idConfigsForCountry, parcel);
            while (m4.hasNext()) {
                ((IdConfigForCountry) m4.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.selectedCountryCode);
            parcel.writeString(this.selectedIdClass);
        }
    }

    public final class CountdownToCapture extends GovernmentIdState {
        public static final Parcelable.Creator<CountdownToCapture> CREATOR = new Frame.Creator(17);
        public final GovernmentIdState backState;
        public final CaptureConfig captureConfig;
        public final String countryCode;
        public final IdPart$SideIdPart currentPart;
        public final Hint hint;
        public final GovernmentId.GovernmentIdImage idForReview;
        public final int partIndex;
        public final List parts;
        public final List uploadingIds;

        public CountdownToCapture(IdPart$SideIdPart idPart$SideIdPart, List list, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage, List list2, int i, GovernmentIdState governmentIdState, String str, Hint hint) {
            idPart$SideIdPart.getClass();
            list.getClass();
            captureConfig.getClass();
            governmentIdImage.getClass();
            list2.getClass();
            this.currentPart = idPart$SideIdPart;
            this.uploadingIds = list;
            this.captureConfig = captureConfig;
            this.idForReview = governmentIdImage;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.hint = hint;
        }

        public static CountdownToCapture copy$default(CountdownToCapture countdownToCapture, Hint hint) {
            IdPart$SideIdPart idPart$SideIdPart = countdownToCapture.currentPart;
            List list = countdownToCapture.uploadingIds;
            CaptureConfig captureConfig = countdownToCapture.captureConfig;
            GovernmentId.GovernmentIdImage governmentIdImage = countdownToCapture.idForReview;
            List list2 = countdownToCapture.parts;
            int i = countdownToCapture.partIndex;
            GovernmentIdState governmentIdState = countdownToCapture.backState;
            String str = countdownToCapture.countryCode;
            idPart$SideIdPart.getClass();
            list.getClass();
            captureConfig.getClass();
            governmentIdImage.getClass();
            list2.getClass();
            return new CountdownToCapture(idPart$SideIdPart, list, captureConfig, governmentIdImage, list2, i, governmentIdState, str, hint);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final void deleteAllIds() {
            super.deleteAllIds();
            Iterator it = this.idForReview.frames.iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).absoluteFilePath).delete();
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CountdownToCapture)) {
                return false;
            }
            CountdownToCapture countdownToCapture = (CountdownToCapture) obj;
            return Intrinsics.areEqual(this.currentPart, countdownToCapture.currentPart) && Intrinsics.areEqual(this.uploadingIds, countdownToCapture.uploadingIds) && Intrinsics.areEqual(this.captureConfig, countdownToCapture.captureConfig) && Intrinsics.areEqual(this.idForReview, countdownToCapture.idForReview) && Intrinsics.areEqual(this.parts, countdownToCapture.parts) && this.partIndex == countdownToCapture.partIndex && Intrinsics.areEqual(this.backState, countdownToCapture.backState) && Intrinsics.areEqual(this.countryCode, countdownToCapture.countryCode) && Intrinsics.areEqual(this.hint, countdownToCapture.hint);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final GovernmentIdState getBackState$government_id_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final String getCountryCode$government_id_release() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final IdPart$SideIdPart getCurrentPart$government_id_release() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final int getPartIndex$government_id_release() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.partIndex, Recorder$$ExternalSyntheticOutline2.m((this.idForReview.hashCode() + ((this.captureConfig.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.currentPart.side.hashCode() * 31, 31, this.uploadingIds)) * 31)) * 31, 31, this.parts), 31);
            GovernmentIdState governmentIdState = this.backState;
            int hashCode = (m + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Hint hint = this.hint;
            return hashCode2 + (hint != null ? hint.hashCode() : 0);
        }

        public final String toString() {
            return "CountdownToCapture(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", hint=" + this.hint + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.currentPart.writeToParcel(parcel, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.uploadingIds, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeParcelable(this.captureConfig, i);
            this.idForReview.writeToParcel(parcel, i);
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.parts, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.countryCode);
            parcel.writeParcelable(this.hint, i);
        }
    }

    public final class FinalizeLocalVideoCapture extends GovernmentIdState {
        public static final Parcelable.Creator<FinalizeLocalVideoCapture> CREATOR = new Frame.Creator(18);
        public final GovernmentIdState backState;
        public final String countryCode;
        public final IdPart$SideIdPart currentPart;
        public final GovernmentIdRequestArguments governmentIdRequestArguments;
        public final IdConfig id;
        public final boolean isDelayComplete;
        public final long minDurationMs;
        public final int partIndex;
        public final List parts;
        public final List uploadingIds;

        public FinalizeLocalVideoCapture(IdConfig idConfig, List list, IdPart$SideIdPart idPart$SideIdPart, List list2, int i, GovernmentIdState governmentIdState, String str, GovernmentIdRequestArguments governmentIdRequestArguments, long j, boolean z) {
            idConfig.getClass();
            idPart$SideIdPart.getClass();
            this.id = idConfig;
            this.uploadingIds = list;
            this.currentPart = idPart$SideIdPart;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.governmentIdRequestArguments = governmentIdRequestArguments;
            this.minDurationMs = j;
            this.isDelayComplete = z;
        }

        public static FinalizeLocalVideoCapture copy$default(FinalizeLocalVideoCapture finalizeLocalVideoCapture) {
            IdConfig idConfig = finalizeLocalVideoCapture.id;
            List list = finalizeLocalVideoCapture.uploadingIds;
            IdPart$SideIdPart idPart$SideIdPart = finalizeLocalVideoCapture.currentPart;
            List list2 = finalizeLocalVideoCapture.parts;
            int i = finalizeLocalVideoCapture.partIndex;
            GovernmentIdState governmentIdState = finalizeLocalVideoCapture.backState;
            String str = finalizeLocalVideoCapture.countryCode;
            GovernmentIdRequestArguments governmentIdRequestArguments = finalizeLocalVideoCapture.governmentIdRequestArguments;
            long j = finalizeLocalVideoCapture.minDurationMs;
            idConfig.getClass();
            list.getClass();
            idPart$SideIdPart.getClass();
            list2.getClass();
            return new FinalizeLocalVideoCapture(idConfig, list, idPart$SideIdPart, list2, i, governmentIdState, str, governmentIdRequestArguments, j, true);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FinalizeLocalVideoCapture)) {
                return false;
            }
            FinalizeLocalVideoCapture finalizeLocalVideoCapture = (FinalizeLocalVideoCapture) obj;
            return Intrinsics.areEqual(this.id, finalizeLocalVideoCapture.id) && Intrinsics.areEqual(this.uploadingIds, finalizeLocalVideoCapture.uploadingIds) && Intrinsics.areEqual(this.currentPart, finalizeLocalVideoCapture.currentPart) && Intrinsics.areEqual(this.parts, finalizeLocalVideoCapture.parts) && this.partIndex == finalizeLocalVideoCapture.partIndex && Intrinsics.areEqual(this.backState, finalizeLocalVideoCapture.backState) && Intrinsics.areEqual(this.countryCode, finalizeLocalVideoCapture.countryCode) && Intrinsics.areEqual(this.governmentIdRequestArguments, finalizeLocalVideoCapture.governmentIdRequestArguments) && this.minDurationMs == finalizeLocalVideoCapture.minDurationMs && this.isDelayComplete == finalizeLocalVideoCapture.isDelayComplete;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final GovernmentIdState getBackState$government_id_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final String getCountryCode$government_id_release() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final IdPart$SideIdPart getCurrentPart$government_id_release() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final int getPartIndex$government_id_release() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.partIndex, Recorder$$ExternalSyntheticOutline2.m((this.currentPart.side.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.id.hashCode() * 31, 31, this.uploadingIds)) * 31, 31, this.parts), 31);
            GovernmentIdState governmentIdState = this.backState;
            int hashCode = (m + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            return Boolean.hashCode(this.isDelayComplete) + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (governmentIdRequestArguments != null ? governmentIdRequestArguments.hashCode() : 0)) * 31, 31, this.minDurationMs);
        }

        public final String toString() {
            return "FinalizeLocalVideoCapture(id=" + this.id + ", uploadingIds=" + this.uploadingIds + ", currentPart=" + this.currentPart + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", governmentIdRequestArguments=" + this.governmentIdRequestArguments + ", minDurationMs=" + this.minDurationMs + ", isDelayComplete=" + this.isDelayComplete + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.id.writeToParcel(parcel, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.uploadingIds, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeParcelable(this.currentPart, i);
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.parts, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.countryCode);
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            if (governmentIdRequestArguments == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdRequestArguments.writeToParcel(parcel, i);
            }
            parcel.writeLong(this.minDurationMs);
            parcel.writeInt(this.isDelayComplete ? 1 : 0);
        }
    }

    public final class FinalizeWebRtc extends GovernmentIdState {
        public static final Parcelable.Creator<FinalizeWebRtc> CREATOR = new Frame.Creator(19);
        public final GovernmentIdState backState;
        public final CameraProperties cameraProperties;
        public final String countryCode;
        public final IdPart$SideIdPart currentPart;
        public final IdConfig id;
        public final int partIndex;
        public final List parts;
        public final List uploadingIds;

        public FinalizeWebRtc(IdPart$SideIdPart idPart$SideIdPart, List list, List list2, int i, GovernmentIdState governmentIdState, String str, IdConfig idConfig, CameraProperties cameraProperties) {
            idPart$SideIdPart.getClass();
            list.getClass();
            idConfig.getClass();
            cameraProperties.getClass();
            this.currentPart = idPart$SideIdPart;
            this.uploadingIds = list;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.id = idConfig;
            this.cameraProperties = cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final GovernmentIdState getBackState$government_id_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final String getCountryCode$government_id_release() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final IdPart$SideIdPart getCurrentPart$government_id_release() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final int getPartIndex$government_id_release() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.currentPart, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.uploadingIds, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.parts, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.countryCode);
            this.id.writeToParcel(parcel, i);
            parcel.writeParcelable(this.cameraProperties, i);
        }
    }

    public final class HolographicTorchDelay extends GovernmentIdState {
        public static final Parcelable.Creator<HolographicTorchDelay> CREATOR = new Frame.Creator(20);
        public final GovernmentId acceptedId;
        public final GovernmentIdState backState;
        public final CameraProperties cameraProperties;
        public final String countryCode;
        public final IdPart$SideIdPart currentPart;
        public final IdConfig id;
        public final int partIndex;
        public final List parts;
        public final int torchDurationMs;
        public final List uploadingIds;

        public HolographicTorchDelay(IdPart$SideIdPart idPart$SideIdPart, List list, List list2, int i, GovernmentIdState governmentIdState, String str, IdConfig idConfig, GovernmentId governmentId, CameraProperties cameraProperties, int i2) {
            idPart$SideIdPart.getClass();
            list.getClass();
            list2.getClass();
            idConfig.getClass();
            governmentId.getClass();
            cameraProperties.getClass();
            this.currentPart = idPart$SideIdPart;
            this.uploadingIds = list;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.id = idConfig;
            this.acceptedId = governmentId;
            this.cameraProperties = cameraProperties;
            this.torchDurationMs = i2;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final void deleteAllIds() {
            super.deleteAllIds();
            Iterator it = this.acceptedId.getFrames().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).absoluteFilePath).delete();
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HolographicTorchDelay)) {
                return false;
            }
            HolographicTorchDelay holographicTorchDelay = (HolographicTorchDelay) obj;
            return Intrinsics.areEqual(this.currentPart, holographicTorchDelay.currentPart) && Intrinsics.areEqual(this.uploadingIds, holographicTorchDelay.uploadingIds) && Intrinsics.areEqual(this.parts, holographicTorchDelay.parts) && this.partIndex == holographicTorchDelay.partIndex && Intrinsics.areEqual(this.backState, holographicTorchDelay.backState) && Intrinsics.areEqual(this.countryCode, holographicTorchDelay.countryCode) && Intrinsics.areEqual(this.id, holographicTorchDelay.id) && Intrinsics.areEqual(this.acceptedId, holographicTorchDelay.acceptedId) && Intrinsics.areEqual(this.cameraProperties, holographicTorchDelay.cameraProperties) && this.torchDurationMs == holographicTorchDelay.torchDurationMs;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final GovernmentIdState getBackState$government_id_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final String getCountryCode$government_id_release() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final IdPart$SideIdPart getCurrentPart$government_id_release() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final int getPartIndex$government_id_release() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.partIndex, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.currentPart.side.hashCode() * 31, 31, this.uploadingIds), 31, this.parts), 31);
            GovernmentIdState governmentIdState = this.backState;
            int hashCode = (m + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            return Integer.hashCode(this.torchDurationMs) + ((this.cameraProperties.hashCode() + ((this.acceptedId.hashCode() + ((this.id.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "HolographicTorchDelay(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", id=" + this.id + ", acceptedId=" + this.acceptedId + ", cameraProperties=" + this.cameraProperties + ", torchDurationMs=" + this.torchDurationMs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.currentPart.writeToParcel(parcel, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.uploadingIds, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.parts, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.countryCode);
            this.id.writeToParcel(parcel, i);
            parcel.writeParcelable(this.acceptedId, i);
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeInt(this.torchDurationMs);
        }
    }

    public final class ReviewCapturedImage extends ReviewImageState {
        public static final Parcelable.Creator<ReviewCapturedImage> CREATOR = new Frame.Creator(21);
        public final GovernmentIdState backState;
        public final CameraProperties cameraProperties;
        public final CaptureConfig captureConfig;
        public final String countryCode;
        public final IdPart$SideIdPart currentPart;
        public final String error;
        public final GovernmentId idForReview;
        public final int partIndex;
        public final List parts;
        public final boolean submittingForAutoClassification;
        public final List uploadingIds;

        public ReviewCapturedImage(IdPart$SideIdPart idPart$SideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, List list2, int i, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str, boolean z, String str2) {
            idPart$SideIdPart.getClass();
            list.getClass();
            captureConfig.getClass();
            governmentId.getClass();
            list2.getClass();
            cameraProperties.getClass();
            this.currentPart = idPart$SideIdPart;
            this.uploadingIds = list;
            this.captureConfig = captureConfig;
            this.idForReview = governmentId;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.cameraProperties = cameraProperties;
            this.error = str;
            this.submittingForAutoClassification = z;
            this.countryCode = str2;
        }

        public static ReviewCapturedImage copy$default(ReviewCapturedImage reviewCapturedImage, String str, boolean z, int i) {
            IdPart$SideIdPart idPart$SideIdPart = reviewCapturedImage.currentPart;
            List list = reviewCapturedImage.uploadingIds;
            CaptureConfig captureConfig = reviewCapturedImage.captureConfig;
            GovernmentId governmentId = reviewCapturedImage.idForReview;
            List list2 = reviewCapturedImage.parts;
            int i2 = reviewCapturedImage.partIndex;
            GovernmentIdState governmentIdState = reviewCapturedImage.backState;
            CameraProperties cameraProperties = reviewCapturedImage.cameraProperties;
            if ((i & 256) != 0) {
                str = reviewCapturedImage.error;
            }
            String str2 = str;
            if ((i & 512) != 0) {
                z = reviewCapturedImage.submittingForAutoClassification;
            }
            String str3 = reviewCapturedImage.countryCode;
            reviewCapturedImage.getClass();
            idPart$SideIdPart.getClass();
            list.getClass();
            captureConfig.getClass();
            governmentId.getClass();
            list2.getClass();
            cameraProperties.getClass();
            return new ReviewCapturedImage(idPart$SideIdPart, list, captureConfig, governmentId, list2, i2, governmentIdState, cameraProperties, str2, z, str3);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final void deleteAllIds() {
            super.deleteAllIds();
            Iterator it = this.idForReview.getFrames().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).absoluteFilePath).delete();
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewCapturedImage)) {
                return false;
            }
            ReviewCapturedImage reviewCapturedImage = (ReviewCapturedImage) obj;
            return Intrinsics.areEqual(this.currentPart, reviewCapturedImage.currentPart) && Intrinsics.areEqual(this.uploadingIds, reviewCapturedImage.uploadingIds) && Intrinsics.areEqual(this.captureConfig, reviewCapturedImage.captureConfig) && Intrinsics.areEqual(this.idForReview, reviewCapturedImage.idForReview) && Intrinsics.areEqual(this.parts, reviewCapturedImage.parts) && this.partIndex == reviewCapturedImage.partIndex && Intrinsics.areEqual(this.backState, reviewCapturedImage.backState) && Intrinsics.areEqual(this.cameraProperties, reviewCapturedImage.cameraProperties) && Intrinsics.areEqual(this.error, reviewCapturedImage.error) && this.submittingForAutoClassification == reviewCapturedImage.submittingForAutoClassification && Intrinsics.areEqual(this.countryCode, reviewCapturedImage.countryCode);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final GovernmentIdState getBackState$government_id_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public final CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final String getCountryCode$government_id_release() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final IdPart$SideIdPart getCurrentPart$government_id_release() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public final IdPart$SideIdPart getCurrentPart$government_id_release$1() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public final GovernmentId getIdForReview() {
            return this.idForReview;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final int getPartIndex$government_id_release() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.partIndex, Recorder$$ExternalSyntheticOutline2.m((this.idForReview.hashCode() + ((this.captureConfig.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.currentPart.side.hashCode() * 31, 31, this.uploadingIds)) * 31)) * 31, 31, this.parts), 31);
            GovernmentIdState governmentIdState = this.backState;
            int hashCode = (this.cameraProperties.hashCode() + ((m + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31)) * 31;
            String str = this.error;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.submittingForAutoClassification);
            String str2 = this.countryCode;
            return m2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReviewCapturedImage(currentPart=");
            sb.append(this.currentPart);
            sb.append(", uploadingIds=");
            sb.append(this.uploadingIds);
            sb.append(", captureConfig=");
            sb.append(this.captureConfig);
            sb.append(", idForReview=");
            sb.append(this.idForReview);
            sb.append(", parts=");
            sb.append(this.parts);
            sb.append(", partIndex=");
            sb.append(this.partIndex);
            sb.append(", backState=");
            sb.append(this.backState);
            sb.append(", cameraProperties=");
            sb.append(this.cameraProperties);
            sb.append(", error=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.error, ", submittingForAutoClassification=", this.submittingForAutoClassification, ", countryCode=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.countryCode, ")");
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public final ReviewImageState updateSubmittingForAutoClassification(boolean z) {
            return copy$default(this, null, z, 1535);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.currentPart.writeToParcel(parcel, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.uploadingIds, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeParcelable(this.captureConfig, i);
            parcel.writeParcelable(this.idForReview, i);
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.parts, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, i);
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeString(this.error);
            parcel.writeInt(this.submittingForAutoClassification ? 1 : 0);
            parcel.writeString(this.countryCode);
        }
    }

    public abstract class ReviewImageState extends GovernmentIdState {
        public abstract CameraProperties getCameraProperties();

        public abstract CaptureConfig getCaptureConfig();

        public abstract IdPart$SideIdPart getCurrentPart$government_id_release$1();

        public abstract GovernmentId getIdForReview();

        public abstract ReviewImageState updateSubmittingForAutoClassification(boolean z);
    }

    public final GovernmentIdState copyWithErrorMessage$government_id_release(String str) {
        str.getClass();
        return this instanceof ReviewCapturedImage ? ReviewCapturedImage.copy$default((ReviewCapturedImage) this, str, false, 1791) : this instanceof ReviewSelectedImage ? ReviewSelectedImage.copy$default((ReviewSelectedImage) this, str, false, 3583) : this instanceof ChooseCaptureMethod ? ChooseCaptureMethod.copy$default((ChooseCaptureMethod) this, false, str, 255) : this instanceof ShowInstructions ? ShowInstructions.copy$default((ShowInstructions) this, str) : this;
    }

    public void deleteAllIds() {
        Iterator it = getUploadingIds$government_id_release().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((GovernmentId) it.next()).getFrames().iterator();
            while (it2.hasNext()) {
                new File(((Frame) it2.next()).absoluteFilePath).delete();
            }
        }
    }

    public abstract GovernmentIdState getBackState$government_id_release();

    public abstract String getCountryCode$government_id_release();

    public abstract IdPart$SideIdPart getCurrentPart$government_id_release();

    public abstract int getPartIndex$government_id_release();

    public abstract List getParts$government_id_release();

    public abstract List getUploadingIds$government_id_release();

    public final class ShowInstructions extends GovernmentIdState {
        public static final Parcelable.Creator<ShowInstructions> CREATOR = new Frame.Creator(23);
        public final GovernmentIdState backState;
        public final String countryCode;
        public final IdPart$SideIdPart currentPart;
        public final String error;
        public final int partIndex;
        public final List parts;
        public final IdConfig selectedId;
        public final List uploadingIds;

        public ShowInstructions(IdPart$SideIdPart idPart$SideIdPart, List list, List list2, GovernmentIdState governmentIdState, int i, String str, IdConfig idConfig, String str2) {
            idPart$SideIdPart.getClass();
            list.getClass();
            list2.getClass();
            this.currentPart = idPart$SideIdPart;
            this.uploadingIds = list;
            this.parts = list2;
            this.backState = governmentIdState;
            this.partIndex = i;
            this.countryCode = str;
            this.selectedId = idConfig;
            this.error = str2;
        }

        public static ShowInstructions copy$default(ShowInstructions showInstructions, String str) {
            IdPart$SideIdPart idPart$SideIdPart = showInstructions.currentPart;
            List list = showInstructions.uploadingIds;
            List list2 = showInstructions.parts;
            GovernmentIdState governmentIdState = showInstructions.backState;
            int i = showInstructions.partIndex;
            String str2 = showInstructions.countryCode;
            IdConfig idConfig = showInstructions.selectedId;
            showInstructions.getClass();
            idPart$SideIdPart.getClass();
            list.getClass();
            list2.getClass();
            return new ShowInstructions(idPart$SideIdPart, list, list2, governmentIdState, i, str2, idConfig, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowInstructions)) {
                return false;
            }
            ShowInstructions showInstructions = (ShowInstructions) obj;
            return Intrinsics.areEqual(this.currentPart, showInstructions.currentPart) && Intrinsics.areEqual(this.uploadingIds, showInstructions.uploadingIds) && Intrinsics.areEqual(this.parts, showInstructions.parts) && Intrinsics.areEqual(this.backState, showInstructions.backState) && this.partIndex == showInstructions.partIndex && Intrinsics.areEqual(this.countryCode, showInstructions.countryCode) && Intrinsics.areEqual(this.selectedId, showInstructions.selectedId) && Intrinsics.areEqual(this.error, showInstructions.error);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final GovernmentIdState getBackState$government_id_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final String getCountryCode$government_id_release() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final IdPart$SideIdPart getCurrentPart$government_id_release() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final int getPartIndex$government_id_release() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.currentPart.side.hashCode() * 31, 31, this.uploadingIds), 31, this.parts);
            GovernmentIdState governmentIdState = this.backState;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.partIndex, (m + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31, 31);
            String str = this.countryCode;
            int hashCode = (m2 + (str == null ? 0 : str.hashCode())) * 31;
            IdConfig idConfig = this.selectedId;
            int hashCode2 = (hashCode + (idConfig == null ? 0 : idConfig.hashCode())) * 31;
            String str2 = this.error;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return "ShowInstructions(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", backState=" + this.backState + ", partIndex=" + this.partIndex + ", countryCode=" + this.countryCode + ", selectedId=" + this.selectedId + ", error=" + this.error + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.currentPart, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.uploadingIds, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.parts, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeParcelable(this.backState, i);
            parcel.writeInt(this.partIndex);
            parcel.writeString(this.countryCode);
            IdConfig idConfig = this.selectedId;
            if (idConfig == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                idConfig.writeToParcel(parcel, i);
            }
            parcel.writeString(this.error);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ShowInstructions(String str) {
            this(r1, r2, r2, null, -1, str, null, null);
            IdPart$SideIdPart idPart$SideIdPart = new IdPart$SideIdPart(IdConfig.Side.Front);
            EmptyList emptyList = EmptyList.INSTANCE;
        }
    }

    public final class ChooseCaptureMethod extends GovernmentIdState {
        public static final Parcelable.Creator<ChooseCaptureMethod> CREATOR = new Frame.Creator(16);
        public final GovernmentIdState backState;
        public final CaptureConfig captureConfig;
        public final boolean choosingDocumentToUpload;
        public final String countryCode;
        public final IdPart$SideIdPart currentPart;
        public final String error;
        public final int partIndex;
        public final List parts;
        public final List uploadingIds;

        public ChooseCaptureMethod(IdPart$SideIdPart idPart$SideIdPart, List list, List list2, int i, String str, CaptureConfig captureConfig, boolean z, GovernmentIdState governmentIdState, String str2) {
            idPart$SideIdPart.getClass();
            list.getClass();
            list2.getClass();
            captureConfig.getClass();
            this.currentPart = idPart$SideIdPart;
            this.uploadingIds = list;
            this.parts = list2;
            this.partIndex = i;
            this.countryCode = str;
            this.captureConfig = captureConfig;
            this.choosingDocumentToUpload = z;
            this.backState = governmentIdState;
            this.error = str2;
        }

        public static ChooseCaptureMethod copy$default(ChooseCaptureMethod chooseCaptureMethod, boolean z, String str, int i) {
            IdPart$SideIdPart idPart$SideIdPart = chooseCaptureMethod.currentPart;
            List list = chooseCaptureMethod.uploadingIds;
            List list2 = chooseCaptureMethod.parts;
            int i2 = chooseCaptureMethod.partIndex;
            String str2 = chooseCaptureMethod.countryCode;
            CaptureConfig captureConfig = chooseCaptureMethod.captureConfig;
            if ((i & 64) != 0) {
                z = chooseCaptureMethod.choosingDocumentToUpload;
            }
            boolean z2 = z;
            GovernmentIdState governmentIdState = chooseCaptureMethod.backState;
            if ((i & 256) != 0) {
                str = chooseCaptureMethod.error;
            }
            chooseCaptureMethod.getClass();
            idPart$SideIdPart.getClass();
            list.getClass();
            list2.getClass();
            captureConfig.getClass();
            return new ChooseCaptureMethod(idPart$SideIdPart, list, list2, i2, str2, captureConfig, z2, governmentIdState, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChooseCaptureMethod)) {
                return false;
            }
            ChooseCaptureMethod chooseCaptureMethod = (ChooseCaptureMethod) obj;
            return Intrinsics.areEqual(this.currentPart, chooseCaptureMethod.currentPart) && Intrinsics.areEqual(this.uploadingIds, chooseCaptureMethod.uploadingIds) && Intrinsics.areEqual(this.parts, chooseCaptureMethod.parts) && this.partIndex == chooseCaptureMethod.partIndex && Intrinsics.areEqual(this.countryCode, chooseCaptureMethod.countryCode) && Intrinsics.areEqual(this.captureConfig, chooseCaptureMethod.captureConfig) && this.choosingDocumentToUpload == chooseCaptureMethod.choosingDocumentToUpload && Intrinsics.areEqual(this.backState, chooseCaptureMethod.backState) && Intrinsics.areEqual(this.error, chooseCaptureMethod.error);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final GovernmentIdState getBackState$government_id_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final String getCountryCode$government_id_release() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final IdPart$SideIdPart getCurrentPart$government_id_release() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final int getPartIndex$government_id_release() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.partIndex, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.currentPart.side.hashCode() * 31, 31, this.uploadingIds), 31, this.parts), 31);
            String str = this.countryCode;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.captureConfig.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.choosingDocumentToUpload);
            GovernmentIdState governmentIdState = this.backState;
            int hashCode = (m2 + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str2 = this.error;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChooseCaptureMethod(currentPart=");
            sb.append(this.currentPart);
            sb.append(", uploadingIds=");
            sb.append(this.uploadingIds);
            sb.append(", parts=");
            sb.append(this.parts);
            sb.append(", partIndex=");
            sb.append(this.partIndex);
            sb.append(", countryCode=");
            sb.append(this.countryCode);
            sb.append(", captureConfig=");
            sb.append(this.captureConfig);
            sb.append(", choosingDocumentToUpload=");
            sb.append(this.choosingDocumentToUpload);
            sb.append(", backState=");
            sb.append(this.backState);
            sb.append(", error=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.error, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.currentPart.writeToParcel(parcel, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.uploadingIds, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.parts, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeString(this.countryCode);
            parcel.writeParcelable(this.captureConfig, i);
            parcel.writeInt(this.choosingDocumentToUpload ? 1 : 0);
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.error);
        }

        public ChooseCaptureMethod(IdPart$SideIdPart idPart$SideIdPart, List list, List list2, int i, String str, CaptureConfig captureConfig, GovernmentIdState governmentIdState) {
            this(idPart$SideIdPart, list, list2, i, str, captureConfig, false, governmentIdState, null);
        }
    }

    public final class Submit extends GovernmentIdState {
        public static final Parcelable.Creator<Submit> CREATOR = new Frame.Creator(24);
        public final GovernmentIdState backState;
        public final CameraProperties cameraProperties;
        public final String countryCode;
        public final IdPart$SideIdPart currentPart;
        public final GovernmentIdRequestArguments governmentIdRequestArguments;
        public final boolean hasSubmitted;
        public final IdConfig id;
        public final int partIndex;
        public final List parts;
        public final List uploadingIds;
        public final String webRtcObjectId;

        public Submit(IdConfig idConfig, List list, IdPart$SideIdPart idPart$SideIdPart, List list2, int i, GovernmentIdState governmentIdState, String str, GovernmentIdRequestArguments governmentIdRequestArguments, String str2, CameraProperties cameraProperties, boolean z) {
            idConfig.getClass();
            idPart$SideIdPart.getClass();
            cameraProperties.getClass();
            this.id = idConfig;
            this.uploadingIds = list;
            this.currentPart = idPart$SideIdPart;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.governmentIdRequestArguments = governmentIdRequestArguments;
            this.webRtcObjectId = str2;
            this.cameraProperties = cameraProperties;
            this.hasSubmitted = z;
        }

        public static Submit copy$default(Submit submit) {
            IdConfig idConfig = submit.id;
            List list = submit.uploadingIds;
            IdPart$SideIdPart idPart$SideIdPart = submit.currentPart;
            List list2 = submit.parts;
            int i = submit.partIndex;
            GovernmentIdState governmentIdState = submit.backState;
            String str = submit.countryCode;
            GovernmentIdRequestArguments governmentIdRequestArguments = submit.governmentIdRequestArguments;
            String str2 = submit.webRtcObjectId;
            CameraProperties cameraProperties = submit.cameraProperties;
            submit.getClass();
            idConfig.getClass();
            list.getClass();
            idPart$SideIdPart.getClass();
            list2.getClass();
            cameraProperties.getClass();
            return new Submit(idConfig, list, idPart$SideIdPart, list2, i, governmentIdState, str, governmentIdRequestArguments, str2, cameraProperties, true);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Submit)) {
                return false;
            }
            Submit submit = (Submit) obj;
            return Intrinsics.areEqual(this.id, submit.id) && Intrinsics.areEqual(this.uploadingIds, submit.uploadingIds) && Intrinsics.areEqual(this.currentPart, submit.currentPart) && Intrinsics.areEqual(this.parts, submit.parts) && this.partIndex == submit.partIndex && Intrinsics.areEqual(this.backState, submit.backState) && Intrinsics.areEqual(this.countryCode, submit.countryCode) && Intrinsics.areEqual(this.governmentIdRequestArguments, submit.governmentIdRequestArguments) && Intrinsics.areEqual(this.webRtcObjectId, submit.webRtcObjectId) && Intrinsics.areEqual(this.cameraProperties, submit.cameraProperties) && this.hasSubmitted == submit.hasSubmitted;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final GovernmentIdState getBackState$government_id_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final String getCountryCode$government_id_release() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final IdPart$SideIdPart getCurrentPart$government_id_release() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final int getPartIndex$government_id_release() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.partIndex, Recorder$$ExternalSyntheticOutline2.m((this.currentPart.side.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.id.hashCode() * 31, 31, this.uploadingIds)) * 31, 31, this.parts), 31);
            GovernmentIdState governmentIdState = this.backState;
            int hashCode = (m + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            int hashCode3 = (hashCode2 + (governmentIdRequestArguments == null ? 0 : governmentIdRequestArguments.hashCode())) * 31;
            String str2 = this.webRtcObjectId;
            return Boolean.hashCode(this.hasSubmitted) + ((this.cameraProperties.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Submit(id=");
            sb.append(this.id);
            sb.append(", uploadingIds=");
            sb.append(this.uploadingIds);
            sb.append(", currentPart=");
            sb.append(this.currentPart);
            sb.append(", parts=");
            sb.append(this.parts);
            sb.append(", partIndex=");
            sb.append(this.partIndex);
            sb.append(", backState=");
            sb.append(this.backState);
            sb.append(", countryCode=");
            sb.append(this.countryCode);
            sb.append(", governmentIdRequestArguments=");
            sb.append(this.governmentIdRequestArguments);
            sb.append(", webRtcObjectId=");
            sb.append(this.webRtcObjectId);
            sb.append(", cameraProperties=");
            sb.append(this.cameraProperties);
            sb.append(", hasSubmitted=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hasSubmitted, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.id.writeToParcel(parcel, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.uploadingIds, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeParcelable(this.currentPart, i);
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.parts, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.countryCode);
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            if (governmentIdRequestArguments == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                governmentIdRequestArguments.writeToParcel(parcel, i);
            }
            parcel.writeString(this.webRtcObjectId);
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeInt(this.hasSubmitted ? 1 : 0);
        }

        public /* synthetic */ Submit(IdConfig idConfig, List list, List list2, int i, GovernmentIdState governmentIdState, String str, GovernmentIdRequestArguments governmentIdRequestArguments, String str2, CameraProperties cameraProperties) {
            this(idConfig, list, new IdPart$SideIdPart(IdConfig.Side.Front), list2, i, governmentIdState, str, governmentIdRequestArguments, str2, cameraProperties, false);
        }
    }

    public final class AutoClassificationError extends GovernmentIdState {
        public static final Parcelable.Creator<AutoClassificationError> CREATOR = new Frame.Creator(14);
        public final GovernmentIdState backState;
        public final CameraProperties cameraProperties;
        public final List captureFrames;
        public final String countryCode;
        public final IdPart$SideIdPart currentPart;
        public final AutoClassificationErrorType errorType;
        public final ArrayList idConfigsForCountry;
        public final int partIndex;
        public final List parts;
        public final String selectedCountryCode;
        public final String selectedIdClass;
        public final List uploadingIds;

        public AutoClassificationError(IdPart$SideIdPart idPart$SideIdPart, List list, List list2, int i, GovernmentIdState governmentIdState, String str, List list3, CameraProperties cameraProperties, ArrayList arrayList, String str2, String str3, AutoClassificationErrorType autoClassificationErrorType) {
            idPart$SideIdPart.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            cameraProperties.getClass();
            autoClassificationErrorType.getClass();
            this.currentPart = idPart$SideIdPart;
            this.uploadingIds = list;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.captureFrames = list3;
            this.cameraProperties = cameraProperties;
            this.idConfigsForCountry = arrayList;
            this.selectedCountryCode = str2;
            this.selectedIdClass = str3;
            this.errorType = autoClassificationErrorType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoClassificationError)) {
                return false;
            }
            AutoClassificationError autoClassificationError = (AutoClassificationError) obj;
            return Intrinsics.areEqual(this.currentPart, autoClassificationError.currentPart) && Intrinsics.areEqual(this.uploadingIds, autoClassificationError.uploadingIds) && Intrinsics.areEqual(this.parts, autoClassificationError.parts) && this.partIndex == autoClassificationError.partIndex && Intrinsics.areEqual(this.backState, autoClassificationError.backState) && Intrinsics.areEqual(this.countryCode, autoClassificationError.countryCode) && Intrinsics.areEqual(this.captureFrames, autoClassificationError.captureFrames) && Intrinsics.areEqual(this.cameraProperties, autoClassificationError.cameraProperties) && Intrinsics.areEqual(this.idConfigsForCountry, autoClassificationError.idConfigsForCountry) && Intrinsics.areEqual(this.selectedCountryCode, autoClassificationError.selectedCountryCode) && Intrinsics.areEqual(this.selectedIdClass, autoClassificationError.selectedIdClass) && this.errorType == autoClassificationError.errorType;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final GovernmentIdState getBackState$government_id_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final String getCountryCode$government_id_release() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final IdPart$SideIdPart getCurrentPart$government_id_release() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final int getPartIndex$government_id_release() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.partIndex, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.currentPart.side.hashCode() * 31, 31, this.uploadingIds), 31, this.parts), 31);
            GovernmentIdState governmentIdState = this.backState;
            int hashCode = (m + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.idConfigsForCountry, (this.cameraProperties.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.captureFrames)) * 31, 31);
            String str2 = this.selectedCountryCode;
            int hashCode2 = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.selectedIdClass;
            return this.errorType.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "AutoClassificationError(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", captureFrames=" + this.captureFrames + ", cameraProperties=" + this.cameraProperties + ", idConfigsForCountry=" + this.idConfigsForCountry + ", selectedCountryCode=" + this.selectedCountryCode + ", selectedIdClass=" + this.selectedIdClass + ", errorType=" + this.errorType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.currentPart.writeToParcel(parcel, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.uploadingIds, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.parts, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.countryCode);
            Iterator m3 = CameraState$Type$EnumUnboxingLocalUtility.m(this.captureFrames, parcel);
            while (m3.hasNext()) {
                ((Frame) m3.next()).writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.cameraProperties, i);
            Iterator m4 = NavAction$$ExternalSyntheticOutline0.m(this.idConfigsForCountry, parcel);
            while (m4.hasNext()) {
                ((IdConfigForCountry) m4.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.selectedCountryCode);
            parcel.writeString(this.selectedIdClass);
            parcel.writeString(this.errorType.name());
        }

        public AutoClassificationError(IdPart$SideIdPart idPart$SideIdPart, List list, List list2, int i, GovernmentIdState governmentIdState, String str, List list3, CameraProperties cameraProperties, ArrayList arrayList, AutoClassificationErrorType autoClassificationErrorType) {
            this(idPart$SideIdPart, list, list2, i, governmentIdState, str, list3, cameraProperties, arrayList, null, null, autoClassificationErrorType);
        }
    }

    public final class ReviewSelectedImage extends ReviewImageState {
        public static final Parcelable.Creator<ReviewSelectedImage> CREATOR = new Frame.Creator(22);
        public final GovernmentIdState backState;
        public final CameraProperties cameraProperties;
        public final CaptureConfig captureConfig;
        public final String countryCode;
        public final IdPart$SideIdPart currentPart;
        public final String error;
        public final String fileName;
        public final GovernmentId idForReview;
        public final int partIndex;
        public final List parts;
        public final boolean submittingForAutoClassification;
        public final List uploadingIds;

        public ReviewSelectedImage(IdPart$SideIdPart idPart$SideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, String str, List list2, int i, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str2, boolean z, String str3) {
            idPart$SideIdPart.getClass();
            list.getClass();
            captureConfig.getClass();
            governmentId.getClass();
            list2.getClass();
            cameraProperties.getClass();
            this.currentPart = idPart$SideIdPart;
            this.uploadingIds = list;
            this.captureConfig = captureConfig;
            this.idForReview = governmentId;
            this.fileName = str;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.cameraProperties = cameraProperties;
            this.error = str2;
            this.submittingForAutoClassification = z;
            this.countryCode = str3;
        }

        public static ReviewSelectedImage copy$default(ReviewSelectedImage reviewSelectedImage, String str, boolean z, int i) {
            IdPart$SideIdPart idPart$SideIdPart = reviewSelectedImage.currentPart;
            List list = reviewSelectedImage.uploadingIds;
            CaptureConfig captureConfig = reviewSelectedImage.captureConfig;
            GovernmentId governmentId = reviewSelectedImage.idForReview;
            String str2 = reviewSelectedImage.fileName;
            List list2 = reviewSelectedImage.parts;
            int i2 = reviewSelectedImage.partIndex;
            GovernmentIdState governmentIdState = reviewSelectedImage.backState;
            CameraProperties cameraProperties = reviewSelectedImage.cameraProperties;
            if ((i & 512) != 0) {
                str = reviewSelectedImage.error;
            }
            String str3 = str;
            boolean z2 = (i & 1024) != 0 ? reviewSelectedImage.submittingForAutoClassification : z;
            String str4 = reviewSelectedImage.countryCode;
            reviewSelectedImage.getClass();
            idPart$SideIdPart.getClass();
            list.getClass();
            captureConfig.getClass();
            governmentId.getClass();
            list2.getClass();
            cameraProperties.getClass();
            return new ReviewSelectedImage(idPart$SideIdPart, list, captureConfig, governmentId, str2, list2, i2, governmentIdState, cameraProperties, str3, z2, str4);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final void deleteAllIds() {
            super.deleteAllIds();
            Iterator it = this.idForReview.getFrames().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).absoluteFilePath).delete();
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewSelectedImage)) {
                return false;
            }
            ReviewSelectedImage reviewSelectedImage = (ReviewSelectedImage) obj;
            return Intrinsics.areEqual(this.currentPart, reviewSelectedImage.currentPart) && Intrinsics.areEqual(this.uploadingIds, reviewSelectedImage.uploadingIds) && Intrinsics.areEqual(this.captureConfig, reviewSelectedImage.captureConfig) && Intrinsics.areEqual(this.idForReview, reviewSelectedImage.idForReview) && Intrinsics.areEqual(this.fileName, reviewSelectedImage.fileName) && Intrinsics.areEqual(this.parts, reviewSelectedImage.parts) && this.partIndex == reviewSelectedImage.partIndex && Intrinsics.areEqual(this.backState, reviewSelectedImage.backState) && Intrinsics.areEqual(this.cameraProperties, reviewSelectedImage.cameraProperties) && Intrinsics.areEqual(this.error, reviewSelectedImage.error) && this.submittingForAutoClassification == reviewSelectedImage.submittingForAutoClassification && Intrinsics.areEqual(this.countryCode, reviewSelectedImage.countryCode);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final GovernmentIdState getBackState$government_id_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public final CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final String getCountryCode$government_id_release() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final IdPart$SideIdPart getCurrentPart$government_id_release() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public final IdPart$SideIdPart getCurrentPart$government_id_release$1() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public final GovernmentId getIdForReview() {
            return this.idForReview;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final int getPartIndex$government_id_release() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        public final int hashCode() {
            int hashCode = (this.idForReview.hashCode() + ((this.captureConfig.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.currentPart.side.hashCode() * 31, 31, this.uploadingIds)) * 31)) * 31;
            String str = this.fileName;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.partIndex, Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.parts), 31);
            GovernmentIdState governmentIdState = this.backState;
            int hashCode2 = (this.cameraProperties.hashCode() + ((m + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31)) * 31;
            String str2 = this.error;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.submittingForAutoClassification);
            String str3 = this.countryCode;
            return m2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReviewSelectedImage(currentPart=");
            sb.append(this.currentPart);
            sb.append(", uploadingIds=");
            sb.append(this.uploadingIds);
            sb.append(", captureConfig=");
            sb.append(this.captureConfig);
            sb.append(", idForReview=");
            sb.append(this.idForReview);
            sb.append(", fileName=");
            NavAction$$ExternalSyntheticOutline0.m(this.fileName, ", parts=", ", partIndex=", sb, this.parts);
            sb.append(this.partIndex);
            sb.append(", backState=");
            sb.append(this.backState);
            sb.append(", cameraProperties=");
            sb.append(this.cameraProperties);
            sb.append(", error=");
            sb.append(this.error);
            sb.append(", submittingForAutoClassification=");
            sb.append(this.submittingForAutoClassification);
            sb.append(", countryCode=");
            sb.append(this.countryCode);
            sb.append(")");
            return sb.toString();
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        public final ReviewImageState updateSubmittingForAutoClassification(boolean z) {
            return copy$default(this, null, z, 3071);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.currentPart.writeToParcel(parcel, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.uploadingIds, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeParcelable(this.captureConfig, i);
            parcel.writeParcelable(this.idForReview, i);
            parcel.writeString(this.fileName);
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.parts, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, i);
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeString(this.error);
            parcel.writeInt(this.submittingForAutoClassification ? 1 : 0);
            parcel.writeString(this.countryCode);
        }

        public /* synthetic */ ReviewSelectedImage(IdPart$SideIdPart idPart$SideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, String str, List list2, int i, GovernmentIdState governmentIdState, String str2) {
            this(idPart$SideIdPart, list, captureConfig, governmentId, str, list2, i, governmentIdState, new CameraProperties(null, null, null, 0, 31, 0), null, false, str2);
        }
    }

    public final class WaitForAutocapture extends GovernmentIdState {
        public static final Parcelable.Creator<WaitForAutocapture> CREATOR = new Frame.Creator(25);
        public final GovernmentIdState backState;
        public final CaptureConfig captureConfig;
        public final boolean checkAudioPermissions;
        public final boolean checkCameraPermissions;
        public final String countryCode;
        public final IdPart$SideIdPart currentPart;
        public final Throwable error;
        public final Hint hint;
        public final Screen.CameraScreen.ManualCapture manualCapture;
        public final int partIndex;
        public final List parts;
        public final List uploadingIds;
        public final Function0 webRtcConnectionEstablished;
        public final String webRtcJwt;
        public final WebRtcState webRtcState;

        public /* synthetic */ WaitForAutocapture(IdPart$SideIdPart idPart$SideIdPart, List list, CaptureConfig captureConfig, Screen.CameraScreen.ManualCapture manualCapture, List list2, int i, GovernmentIdState governmentIdState, WebRtcState webRtcState, String str, Throwable th, boolean z, boolean z2, String str2, Hint hint, Function0 function0, int i2) {
            this(idPart$SideIdPart, list, captureConfig, manualCapture, list2, i, governmentIdState, webRtcState, str, (i2 & 512) != 0 ? null : th, (i2 & 1024) != 0 ? true : z, (i2 & 2048) != 0 ? true : z2, str2, (i2 & PKIFailureInfo.certRevoked) != 0 ? null : hint, (i2 & 16384) != 0 ? new ShimmerThemeKt$$ExternalSyntheticLambda0(14) : function0);
        }

        public static WaitForAutocapture copy$default(WaitForAutocapture waitForAutocapture, Screen.CameraScreen.ManualCapture manualCapture, WebRtcState webRtcState, Throwable th, boolean z, boolean z2, Hint hint, int i) {
            IdPart$SideIdPart idPart$SideIdPart = waitForAutocapture.currentPart;
            List list = waitForAutocapture.uploadingIds;
            CaptureConfig captureConfig = waitForAutocapture.captureConfig;
            Screen.CameraScreen.ManualCapture manualCapture2 = (i & 8) != 0 ? waitForAutocapture.manualCapture : manualCapture;
            List list2 = waitForAutocapture.parts;
            Screen.CameraScreen.ManualCapture manualCapture3 = manualCapture2;
            int i2 = waitForAutocapture.partIndex;
            GovernmentIdState governmentIdState = waitForAutocapture.backState;
            WebRtcState webRtcState2 = (i & 128) != 0 ? waitForAutocapture.webRtcState : webRtcState;
            String str = waitForAutocapture.webRtcJwt;
            Throwable th2 = (i & 512) != 0 ? waitForAutocapture.error : th;
            boolean z3 = (i & 1024) != 0 ? waitForAutocapture.checkCameraPermissions : z;
            boolean z4 = (i & 2048) != 0 ? waitForAutocapture.checkAudioPermissions : z2;
            String str2 = waitForAutocapture.countryCode;
            Hint hint2 = (i & PKIFailureInfo.certRevoked) != 0 ? waitForAutocapture.hint : hint;
            Function0 function0 = waitForAutocapture.webRtcConnectionEstablished;
            waitForAutocapture.getClass();
            idPart$SideIdPart.getClass();
            list.getClass();
            captureConfig.getClass();
            manualCapture3.getClass();
            list2.getClass();
            function0.getClass();
            return new WaitForAutocapture(idPart$SideIdPart, list, captureConfig, manualCapture3, list2, i2, governmentIdState, webRtcState2, str, th2, z3, z4, str2, hint2, function0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WaitForAutocapture)) {
                return false;
            }
            WaitForAutocapture waitForAutocapture = (WaitForAutocapture) obj;
            return Intrinsics.areEqual(this.currentPart, waitForAutocapture.currentPart) && Intrinsics.areEqual(this.uploadingIds, waitForAutocapture.uploadingIds) && Intrinsics.areEqual(this.captureConfig, waitForAutocapture.captureConfig) && this.manualCapture == waitForAutocapture.manualCapture && Intrinsics.areEqual(this.parts, waitForAutocapture.parts) && this.partIndex == waitForAutocapture.partIndex && Intrinsics.areEqual(this.backState, waitForAutocapture.backState) && this.webRtcState == waitForAutocapture.webRtcState && Intrinsics.areEqual(this.webRtcJwt, waitForAutocapture.webRtcJwt) && Intrinsics.areEqual(this.error, waitForAutocapture.error) && this.checkCameraPermissions == waitForAutocapture.checkCameraPermissions && this.checkAudioPermissions == waitForAutocapture.checkAudioPermissions && Intrinsics.areEqual(this.countryCode, waitForAutocapture.countryCode) && Intrinsics.areEqual(this.hint, waitForAutocapture.hint) && Intrinsics.areEqual(this.webRtcConnectionEstablished, waitForAutocapture.webRtcConnectionEstablished);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final GovernmentIdState getBackState$government_id_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final String getCountryCode$government_id_release() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final IdPart$SideIdPart getCurrentPart$government_id_release() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final int getPartIndex$government_id_release() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getParts$government_id_release() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public final List getUploadingIds$government_id_release() {
            return this.uploadingIds;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.partIndex, Recorder$$ExternalSyntheticOutline2.m((this.manualCapture.hashCode() + ((this.captureConfig.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.currentPart.side.hashCode() * 31, 31, this.uploadingIds)) * 31)) * 31, 31, this.parts), 31);
            GovernmentIdState governmentIdState = this.backState;
            int hashCode = (m + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            WebRtcState webRtcState = this.webRtcState;
            int hashCode2 = (hashCode + (webRtcState == null ? 0 : webRtcState.hashCode())) * 31;
            String str = this.webRtcJwt;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th = this.error;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (th == null ? 0 : th.hashCode())) * 31, 31, this.checkCameraPermissions), 31, this.checkAudioPermissions);
            String str2 = this.countryCode;
            int hashCode4 = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Hint hint = this.hint;
            return this.webRtcConnectionEstablished.hashCode() + ((hashCode4 + (hint != null ? hint.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WaitForAutocapture(currentPart=");
            sb.append(this.currentPart);
            sb.append(", uploadingIds=");
            sb.append(this.uploadingIds);
            sb.append(", captureConfig=");
            sb.append(this.captureConfig);
            sb.append(", manualCapture=");
            sb.append(this.manualCapture);
            sb.append(", parts=");
            sb.append(this.parts);
            sb.append(", partIndex=");
            sb.append(this.partIndex);
            sb.append(", backState=");
            sb.append(this.backState);
            sb.append(", webRtcState=");
            sb.append(this.webRtcState);
            sb.append(", webRtcJwt=");
            sb.append(this.webRtcJwt);
            sb.append(", error=");
            sb.append(this.error);
            sb.append(", checkCameraPermissions=");
            re$$ExternalSyntheticOutline0.m(sb, this.checkCameraPermissions, ", checkAudioPermissions=", this.checkAudioPermissions, ", countryCode=");
            sb.append(this.countryCode);
            sb.append(", hint=");
            sb.append(this.hint);
            sb.append(", webRtcConnectionEstablished=");
            sb.append(this.webRtcConnectionEstablished);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.currentPart.writeToParcel(parcel, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.uploadingIds, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeParcelable(this.captureConfig, i);
            parcel.writeString(this.manualCapture.name());
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.parts, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeInt(this.partIndex);
            parcel.writeParcelable(this.backState, i);
            WebRtcState webRtcState = this.webRtcState;
            if (webRtcState == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(webRtcState.name());
            }
            parcel.writeString(this.webRtcJwt);
            parcel.writeSerializable(this.error);
            parcel.writeInt(this.checkCameraPermissions ? 1 : 0);
            parcel.writeInt(this.checkAudioPermissions ? 1 : 0);
            parcel.writeString(this.countryCode);
            parcel.writeParcelable(this.hint, i);
        }

        public WaitForAutocapture(IdPart$SideIdPart idPart$SideIdPart, List list, CaptureConfig captureConfig, Screen.CameraScreen.ManualCapture manualCapture, List list2, int i, GovernmentIdState governmentIdState, WebRtcState webRtcState, String str, Throwable th, boolean z, boolean z2, String str2, Hint hint, Function0 function0) {
            idPart$SideIdPart.getClass();
            list.getClass();
            captureConfig.getClass();
            manualCapture.getClass();
            list2.getClass();
            function0.getClass();
            this.currentPart = idPart$SideIdPart;
            this.uploadingIds = list;
            this.captureConfig = captureConfig;
            this.manualCapture = manualCapture;
            this.parts = list2;
            this.partIndex = i;
            this.backState = governmentIdState;
            this.webRtcState = webRtcState;
            this.webRtcJwt = str;
            this.error = th;
            this.checkCameraPermissions = z;
            this.checkAudioPermissions = z2;
            this.countryCode = str2;
            this.hint = hint;
            this.webRtcConnectionEstablished = function0;
        }
    }
}
