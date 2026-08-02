package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.datepicker.DateStrings;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.workflows.SimpleWorkflowState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public abstract class SelfieState extends SimpleWorkflowState {

    public final class CaptureTransition extends SelfieState {
        public static final Parcelable.Creator<CaptureTransition> CREATOR = new PoseConfigs.Creator(4);
        public final SelfieState backState;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final Selfie.Pose completedPose;
        public final boolean isFlashOn;
        public final SelfieState nextState;

        public CaptureTransition(SelfieState selfieState, Selfie.Pose pose, SelfieState selfieState2, CameraProperties.FacingMode facingMode, boolean z) {
            selfieState.getClass();
            pose.getClass();
            facingMode.getClass();
            this.nextState = selfieState;
            this.completedPose = pose;
            this.backState = selfieState2;
            this.cameraFacingMode = facingMode;
            this.isFlashOn = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.nextState.getSelfies$selfie_release();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.nextState, i);
            parcel.writeString(this.completedPose.name());
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.cameraFacingMode.name());
            parcel.writeInt(this.isFlashOn ? 1 : 0);
        }
    }

    public final class FinalizeWebRtc extends SelfieState {
        public static final Parcelable.Creator<FinalizeWebRtc> CREATOR = new PoseConfigs.Creator(8);
        public final SelfieState backState;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final CameraProperties cameraProperties;
        public final ArrayList selfies;
        public final long startSelfieTimestamp;

        public FinalizeWebRtc(ArrayList arrayList, CameraProperties cameraProperties, long j, SelfieState selfieState, CameraProperties.FacingMode facingMode) {
            cameraProperties.getClass();
            facingMode.getClass();
            this.selfies = arrayList;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
            this.cameraFacingMode = facingMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.selfies, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.cameraFacingMode.name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FlashState {
        public static final /* synthetic */ FlashState[] $VALUES;
        public static final FlashState Disabled;
        public static final FlashState Enabled;
        public static final FlashState FlashOn;
        public static final FlashState ReadyToCapture;

        static {
            FlashState flashState = new FlashState("Disabled", 0);
            Disabled = flashState;
            FlashState flashState2 = new FlashState("Enabled", 1);
            Enabled = flashState2;
            FlashState flashState3 = new FlashState("FlashOn", 2);
            FlashOn = flashState3;
            FlashState flashState4 = new FlashState("ReadyToCapture", 3);
            ReadyToCapture = flashState4;
            $VALUES = new FlashState[]{flashState, flashState2, flashState3, flashState4};
        }

        public static FlashState valueOf(String str) {
            return (FlashState) Enum.valueOf(FlashState.class, str);
        }

        public static FlashState[] values() {
            return (FlashState[]) $VALUES.clone();
        }
    }

    public final class RestartCamera extends SelfieState {
        public static final Parcelable.Creator<RestartCamera> CREATOR = new PoseConfigs.Creator(9);
        public final SelfieState backState;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final boolean hasRequestedAudioPermissions;
        public final boolean hasRequestedCameraPermissions;
        public final EmptyList selfies;

        public RestartCamera(boolean z, boolean z2, SelfieState selfieState, CameraProperties.FacingMode facingMode) {
            facingMode.getClass();
            this.hasRequestedCameraPermissions = z;
            this.hasRequestedAudioPermissions = z2;
            this.backState = selfieState;
            this.cameraFacingMode = facingMode;
            this.selfies = EmptyList.INSTANCE;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RestartCamera)) {
                return false;
            }
            RestartCamera restartCamera = (RestartCamera) obj;
            return this.hasRequestedCameraPermissions == restartCamera.hasRequestedCameraPermissions && this.hasRequestedAudioPermissions == restartCamera.hasRequestedAudioPermissions && Intrinsics.areEqual(this.backState, restartCamera.backState) && this.cameraFacingMode == restartCamera.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.hasRequestedCameraPermissions) * 31, 31, this.hasRequestedAudioPermissions);
            SelfieState selfieState = this.backState;
            return this.cameraFacingMode.hashCode() + ((m + (selfieState == null ? 0 : selfieState.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("RestartCamera(hasRequestedCameraPermissions=", ", hasRequestedAudioPermissions=", ", backState=", this.hasRequestedCameraPermissions, this.hasRequestedAudioPermissions);
            m.append(this.backState);
            m.append(", cameraFacingMode=");
            m.append(this.cameraFacingMode);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.hasRequestedCameraPermissions ? 1 : 0);
            parcel.writeInt(this.hasRequestedAudioPermissions ? 1 : 0);
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.cameraFacingMode.name());
        }
    }

    public final class ReviewCaptures extends SelfieState {
        public static final Parcelable.Creator<ReviewCaptures> CREATOR = new PoseConfigs.Creator(10);
        public final SelfieState backState;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final CameraProperties cameraProperties;
        public final List selfies;
        public final ArrayList selfiesToReview;
        public final long startSelfieTimestamp;
        public final String webRtcObjectId;

        public ReviewCaptures(List list, ArrayList arrayList, String str, CameraProperties cameraProperties, long j, SelfieState selfieState, CameraProperties.FacingMode facingMode) {
            list.getClass();
            cameraProperties.getClass();
            facingMode.getClass();
            this.selfies = list;
            this.selfiesToReview = arrayList;
            this.webRtcObjectId = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
            this.cameraFacingMode = facingMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.selfies, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            Iterator m2 = NavAction$$ExternalSyntheticOutline0.m(this.selfiesToReview, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeString(this.webRtcObjectId);
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.cameraFacingMode.name());
        }
    }

    public final class ShowPoseHint extends SelfieState implements CameraState {
        public static final Parcelable.Creator<ShowPoseHint> CREATOR = new PoseConfigs.Creator(12);
        public final boolean autoCaptureSupported;
        public final SelfieState backState;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final CameraProperties cameraProperties;
        public final boolean isFlashEnabled;
        public final PoseConfigs poseConfigs;
        public final List posesNeeded;
        public final List selfies;
        public final long startSelfieTimestamp;

        public ShowPoseHint(List list, List list2, boolean z, CameraProperties cameraProperties, long j, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode facingMode, boolean z2) {
            list.getClass();
            list2.getClass();
            cameraProperties.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            this.selfies = list;
            this.posesNeeded = list2;
            this.autoCaptureSupported = z;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = facingMode;
            this.isFlashEnabled = z2;
        }

        public static ShowPoseHint copy$default(ShowPoseHint showPoseHint, boolean z) {
            List list = showPoseHint.selfies;
            List list2 = showPoseHint.posesNeeded;
            boolean z2 = showPoseHint.autoCaptureSupported;
            CameraProperties cameraProperties = showPoseHint.cameraProperties;
            long j = showPoseHint.startSelfieTimestamp;
            SelfieState selfieState = showPoseHint.backState;
            PoseConfigs poseConfigs = showPoseHint.poseConfigs;
            CameraProperties.FacingMode facingMode = showPoseHint.cameraFacingMode;
            showPoseHint.getClass();
            list.getClass();
            list2.getClass();
            cameraProperties.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            return new ShowPoseHint(list, list2, z2, cameraProperties, j, selfieState, poseConfigs, facingMode, z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowPoseHint)) {
                return false;
            }
            ShowPoseHint showPoseHint = (ShowPoseHint) obj;
            return Intrinsics.areEqual(this.selfies, showPoseHint.selfies) && Intrinsics.areEqual(this.posesNeeded, showPoseHint.posesNeeded) && this.autoCaptureSupported == showPoseHint.autoCaptureSupported && Intrinsics.areEqual(this.cameraProperties, showPoseHint.cameraProperties) && this.startSelfieTimestamp == showPoseHint.startSelfieTimestamp && Intrinsics.areEqual(this.backState, showPoseHint.backState) && Intrinsics.areEqual(this.poseConfigs, showPoseHint.poseConfigs) && this.cameraFacingMode == showPoseHint.cameraFacingMode && this.isFlashEnabled == showPoseHint.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPose() {
            return (Selfie.Pose) CollectionsKt.first(getPosesNeeded());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPoseOrNull() {
            return (Selfie.Pose) CollectionsKt.firstOrNull(getPosesNeeded());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final List getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m((this.cameraProperties.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.selfies.hashCode() * 31, 31, this.posesNeeded), 31, this.autoCaptureSupported)) * 31, 31, this.startSelfieTimestamp);
            SelfieState selfieState = this.backState;
            return Boolean.hashCode(this.isFlashEnabled) + ((this.cameraFacingMode.hashCode() + ((this.poseConfigs.poseConfigs.hashCode() + ((m + (selfieState == null ? 0 : selfieState.hashCode())) * 31)) * 31)) * 31);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean isFlashEnabled() {
            return this.isFlashEnabled;
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("ShowPoseHint(selfies=", ", posesNeeded=", ", autoCaptureSupported=", this.selfies, this.posesNeeded);
            m.append(this.autoCaptureSupported);
            m.append(", cameraProperties=");
            m.append(this.cameraProperties);
            m.append(", startSelfieTimestamp=");
            m.append(this.startSelfieTimestamp);
            m.append(", backState=");
            m.append(this.backState);
            m.append(", poseConfigs=");
            m.append(this.poseConfigs);
            m.append(", cameraFacingMode=");
            m.append(this.cameraFacingMode);
            m.append(", isFlashEnabled=");
            m.append(this.isFlashEnabled);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.selfies, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.posesNeeded, parcel);
            while (m2.hasNext()) {
                parcel.writeString(((Selfie.Pose) m2.next()).name());
            }
            parcel.writeInt(this.autoCaptureSupported ? 1 : 0);
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, i);
            this.poseConfigs.writeToParcel(parcel, i);
            parcel.writeString(this.cameraFacingMode.name());
            parcel.writeInt(this.isFlashEnabled ? 1 : 0);
        }
    }

    public final class StartCaptureFaceDetected extends SelfieState implements CameraState {
        public static final Parcelable.Creator<StartCaptureFaceDetected> CREATOR = new PoseConfigs.Creator(14);
        public final boolean autoCaptureSupported;
        public final SelfieState backState;
        public final SelfieBrightnessInfo brightnessInfo;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final CameraProperties cameraProperties;
        public final boolean isFlashEnabled;
        public final PoseConfigs poseConfigs;
        public final float poseScore;
        public final List posesNeeded;
        public final List selfies;
        public final long startCaptureTimestamp;
        public final long startSelfieTimestamp;

        public StartCaptureFaceDetected(long j, CameraProperties cameraProperties, long j2, float f, SelfieBrightnessInfo selfieBrightnessInfo, List list, List list2, SelfieState selfieState, PoseConfigs poseConfigs, boolean z, CameraProperties.FacingMode facingMode, boolean z2) {
            cameraProperties.getClass();
            list.getClass();
            list2.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            this.startCaptureTimestamp = j;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j2;
            this.poseScore = f;
            this.brightnessInfo = selfieBrightnessInfo;
            this.posesNeeded = list;
            this.selfies = list2;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z;
            this.cameraFacingMode = facingMode;
            this.isFlashEnabled = z2;
        }

        public static StartCaptureFaceDetected copy$default(StartCaptureFaceDetected startCaptureFaceDetected, boolean z) {
            long j = startCaptureFaceDetected.startCaptureTimestamp;
            CameraProperties cameraProperties = startCaptureFaceDetected.cameraProperties;
            long j2 = startCaptureFaceDetected.startSelfieTimestamp;
            float f = startCaptureFaceDetected.poseScore;
            SelfieBrightnessInfo selfieBrightnessInfo = startCaptureFaceDetected.brightnessInfo;
            List list = startCaptureFaceDetected.posesNeeded;
            List list2 = startCaptureFaceDetected.selfies;
            SelfieState selfieState = startCaptureFaceDetected.backState;
            PoseConfigs poseConfigs = startCaptureFaceDetected.poseConfigs;
            boolean z2 = startCaptureFaceDetected.autoCaptureSupported;
            CameraProperties.FacingMode facingMode = startCaptureFaceDetected.cameraFacingMode;
            startCaptureFaceDetected.getClass();
            cameraProperties.getClass();
            list.getClass();
            list2.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            return new StartCaptureFaceDetected(j, cameraProperties, j2, f, selfieBrightnessInfo, list, list2, selfieState, poseConfigs, z2, facingMode, z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartCaptureFaceDetected)) {
                return false;
            }
            StartCaptureFaceDetected startCaptureFaceDetected = (StartCaptureFaceDetected) obj;
            return this.startCaptureTimestamp == startCaptureFaceDetected.startCaptureTimestamp && Intrinsics.areEqual(this.cameraProperties, startCaptureFaceDetected.cameraProperties) && this.startSelfieTimestamp == startCaptureFaceDetected.startSelfieTimestamp && Float.compare(this.poseScore, startCaptureFaceDetected.poseScore) == 0 && Intrinsics.areEqual(this.brightnessInfo, startCaptureFaceDetected.brightnessInfo) && Intrinsics.areEqual(this.posesNeeded, startCaptureFaceDetected.posesNeeded) && Intrinsics.areEqual(this.selfies, startCaptureFaceDetected.selfies) && Intrinsics.areEqual(this.backState, startCaptureFaceDetected.backState) && Intrinsics.areEqual(this.poseConfigs, startCaptureFaceDetected.poseConfigs) && this.autoCaptureSupported == startCaptureFaceDetected.autoCaptureSupported && this.cameraFacingMode == startCaptureFaceDetected.cameraFacingMode && this.isFlashEnabled == startCaptureFaceDetected.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPose() {
            return (Selfie.Pose) CollectionsKt.first(getPosesNeeded());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final PoseConfig getCurrentPoseConfig() {
            throw null;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPoseOrNull() {
            return (Selfie.Pose) CollectionsKt.firstOrNull(getPosesNeeded());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final List getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.poseScore, Recorder$$ExternalSyntheticOutline2.m((this.cameraProperties.hashCode() + (Long.hashCode(this.startCaptureTimestamp) * 31)) * 31, 31, this.startSelfieTimestamp), 31);
            SelfieBrightnessInfo selfieBrightnessInfo = this.brightnessInfo;
            int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m + (selfieBrightnessInfo == null ? 0 : selfieBrightnessInfo.hashCode())) * 31, 31, this.posesNeeded), 31, this.selfies);
            SelfieState selfieState = this.backState;
            return Boolean.hashCode(this.isFlashEnabled) + ((this.cameraFacingMode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.poseConfigs.poseConfigs.hashCode() + ((m2 + (selfieState != null ? selfieState.hashCode() : 0)) * 31)) * 31, 31, this.autoCaptureSupported)) * 31);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean isFlashEnabled() {
            return this.isFlashEnabled;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StartCaptureFaceDetected(startCaptureTimestamp=");
            sb.append(this.startCaptureTimestamp);
            sb.append(", cameraProperties=");
            sb.append(this.cameraProperties);
            Boxes$$ExternalSyntheticOutline1.m1151m(this.startSelfieTimestamp, ", startSelfieTimestamp=", ", poseScore=", sb);
            sb.append(this.poseScore);
            sb.append(", brightnessInfo=");
            sb.append(this.brightnessInfo);
            sb.append(", posesNeeded=");
            Request$Priority$EnumUnboxingLocalUtility.m(sb, this.posesNeeded, ", selfies=", this.selfies, ", backState=");
            sb.append(this.backState);
            sb.append(", poseConfigs=");
            sb.append(this.poseConfigs);
            sb.append(", autoCaptureSupported=");
            sb.append(this.autoCaptureSupported);
            sb.append(", cameraFacingMode=");
            sb.append(this.cameraFacingMode);
            sb.append(", isFlashEnabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isFlashEnabled, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeLong(this.startCaptureTimestamp);
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeFloat(this.poseScore);
            parcel.writeParcelable(this.brightnessInfo, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.posesNeeded, parcel);
            while (m.hasNext()) {
                parcel.writeString(((Selfie.Pose) m.next()).name());
            }
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.selfies, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeParcelable(this.backState, i);
            this.poseConfigs.writeToParcel(parcel, i);
            parcel.writeInt(this.autoCaptureSupported ? 1 : 0);
            parcel.writeString(this.cameraFacingMode.name());
            parcel.writeInt(this.isFlashEnabled ? 1 : 0);
        }
    }

    public final class Submit extends SelfieState {
        public static final Parcelable.Creator<Submit> CREATOR = new PoseConfigs.Creator(15);
        public final SelfieState backState;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final CameraProperties cameraProperties;
        public final List selfies;
        public final long startSelfieTimestamp;
        public final String webRtcObjectId;

        public Submit(List list, String str, CameraProperties cameraProperties, long j, SelfieState selfieState, CameraProperties.FacingMode facingMode) {
            list.getClass();
            cameraProperties.getClass();
            facingMode.getClass();
            this.selfies = list;
            this.webRtcObjectId = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
            this.cameraFacingMode = facingMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.selfies, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeString(this.webRtcObjectId);
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.cameraFacingMode.name());
        }
    }

    public final class WaitForWebRtcSetup extends SelfieState implements CameraState {
        public static final Parcelable.Creator<WaitForWebRtcSetup> CREATOR = new PoseConfigs.Creator(17);
        public final boolean autoCaptureSupported;
        public final SelfieState backState;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final CameraProperties cameraProperties;
        public final boolean isFlashEnabled;
        public final PoseConfigs poseConfigs;
        public final List posesNeeded;
        public final EmptyList selfies;
        public final long startSelfieTimestamp;
        public final String webRtcJwt;

        public WaitForWebRtcSetup(String str, CameraProperties cameraProperties, long j, SelfieState selfieState, List list, PoseConfigs poseConfigs, boolean z, CameraProperties.FacingMode facingMode, boolean z2) {
            cameraProperties.getClass();
            list.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            this.webRtcJwt = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
            this.posesNeeded = list;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z;
            this.cameraFacingMode = facingMode;
            this.isFlashEnabled = z2;
            this.selfies = EmptyList.INSTANCE;
        }

        public static WaitForWebRtcSetup copy$default(WaitForWebRtcSetup waitForWebRtcSetup, boolean z) {
            String str = waitForWebRtcSetup.webRtcJwt;
            CameraProperties cameraProperties = waitForWebRtcSetup.cameraProperties;
            long j = waitForWebRtcSetup.startSelfieTimestamp;
            SelfieState selfieState = waitForWebRtcSetup.backState;
            List list = waitForWebRtcSetup.posesNeeded;
            PoseConfigs poseConfigs = waitForWebRtcSetup.poseConfigs;
            boolean z2 = waitForWebRtcSetup.autoCaptureSupported;
            CameraProperties.FacingMode facingMode = waitForWebRtcSetup.cameraFacingMode;
            waitForWebRtcSetup.getClass();
            cameraProperties.getClass();
            list.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            return new WaitForWebRtcSetup(str, cameraProperties, j, selfieState, list, poseConfigs, z2, facingMode, z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WaitForWebRtcSetup)) {
                return false;
            }
            WaitForWebRtcSetup waitForWebRtcSetup = (WaitForWebRtcSetup) obj;
            return Intrinsics.areEqual(this.webRtcJwt, waitForWebRtcSetup.webRtcJwt) && Intrinsics.areEqual(this.cameraProperties, waitForWebRtcSetup.cameraProperties) && this.startSelfieTimestamp == waitForWebRtcSetup.startSelfieTimestamp && Intrinsics.areEqual(this.backState, waitForWebRtcSetup.backState) && Intrinsics.areEqual(this.posesNeeded, waitForWebRtcSetup.posesNeeded) && Intrinsics.areEqual(this.poseConfigs, waitForWebRtcSetup.poseConfigs) && this.autoCaptureSupported == waitForWebRtcSetup.autoCaptureSupported && this.cameraFacingMode == waitForWebRtcSetup.cameraFacingMode && this.isFlashEnabled == waitForWebRtcSetup.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPose() {
            return (Selfie.Pose) CollectionsKt.first(getPosesNeeded());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPoseOrNull() {
            return (Selfie.Pose) CollectionsKt.firstOrNull(getPosesNeeded());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final List getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        public final int hashCode() {
            String str = this.webRtcJwt;
            int m = Recorder$$ExternalSyntheticOutline2.m((this.cameraProperties.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.startSelfieTimestamp);
            SelfieState selfieState = this.backState;
            return Boolean.hashCode(this.isFlashEnabled) + ((this.cameraFacingMode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.poseConfigs.poseConfigs.hashCode() + Recorder$$ExternalSyntheticOutline2.m((m + (selfieState != null ? selfieState.hashCode() : 0)) * 31, 31, this.posesNeeded)) * 31, 31, this.autoCaptureSupported)) * 31);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean isFlashEnabled() {
            return this.isFlashEnabled;
        }

        public final String toString() {
            return "WaitForWebRtcSetup(webRtcJwt=" + this.webRtcJwt + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", posesNeeded=" + this.posesNeeded + ", poseConfigs=" + this.poseConfigs + ", autoCaptureSupported=" + this.autoCaptureSupported + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.webRtcJwt);
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.posesNeeded, parcel);
            while (m.hasNext()) {
                parcel.writeString(((Selfie.Pose) m.next()).name());
            }
            this.poseConfigs.writeToParcel(parcel, i);
            parcel.writeInt(this.autoCaptureSupported ? 1 : 0);
            parcel.writeString(this.cameraFacingMode.name());
            parcel.writeInt(this.isFlashEnabled ? 1 : 0);
        }
    }

    public final class WebRtcFinished extends SelfieState {
        public static final Parcelable.Creator<WebRtcFinished> CREATOR = new PoseConfigs.Creator(18);
        public final SelfieState backState;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final CameraProperties cameraProperties;
        public final ArrayList selfies;
        public final long startSelfieTimestamp;
        public final String webRtcObjectId;

        public WebRtcFinished(ArrayList arrayList, String str, CameraProperties cameraProperties, long j, SelfieState selfieState, CameraProperties.FacingMode facingMode) {
            str.getClass();
            cameraProperties.getClass();
            facingMode.getClass();
            this.selfies = arrayList;
            this.webRtcObjectId = str;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j;
            this.backState = selfieState;
            this.cameraFacingMode = facingMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.selfies, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeString(this.webRtcObjectId);
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.cameraFacingMode.name());
        }
    }

    public abstract SelfieState getBackState$selfie_release();

    public abstract CameraProperties.FacingMode getCameraFacingMode$selfie_release();

    public abstract List getSelfies$selfie_release();

    public final class ShowInstructions extends SelfieState {
        public static final Parcelable.Creator<ShowInstructions> CREATOR = new PoseConfigs.Creator(11);
        public final SelfieState backState;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final EmptyList selfies;

        public ShowInstructions(SelfieState selfieState, CameraProperties.FacingMode facingMode) {
            facingMode.getClass();
            this.backState = selfieState;
            this.cameraFacingMode = facingMode;
            this.selfies = EmptyList.INSTANCE;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.cameraFacingMode.name());
        }

        public /* synthetic */ ShowInstructions() {
            this(null, CameraProperties.FacingMode.User);
        }
    }

    public final class FinalizeLocalVideoCapture extends SelfieState {
        public static final Parcelable.Creator<FinalizeLocalVideoCapture> CREATOR = new PoseConfigs.Creator(7);
        public final SelfieState backState;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final CameraProperties cameraProperties;
        public final boolean isDelayComplete;
        public final boolean isFinalizeComplete;
        public final long minDurationMs;
        public final List selfies;
        public final long startSelfieTimestamp;

        public FinalizeLocalVideoCapture(List list, long j, boolean z, boolean z2, CameraProperties cameraProperties, long j2, SelfieState selfieState, CameraProperties.FacingMode facingMode) {
            cameraProperties.getClass();
            facingMode.getClass();
            this.selfies = list;
            this.minDurationMs = j;
            this.isDelayComplete = z;
            this.isFinalizeComplete = z2;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j2;
            this.backState = selfieState;
            this.cameraFacingMode = facingMode;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
        public static FinalizeLocalVideoCapture copy$default(FinalizeLocalVideoCapture finalizeLocalVideoCapture, ArrayList arrayList, int i) {
            ArrayList arrayList2 = arrayList;
            if ((i & 1) != 0) {
                arrayList2 = finalizeLocalVideoCapture.selfies;
            }
            ArrayList arrayList3 = arrayList2;
            long j = finalizeLocalVideoCapture.minDurationMs;
            boolean z = (i & 4) != 0 ? finalizeLocalVideoCapture.isDelayComplete : true;
            boolean z2 = (i & 8) != 0 ? finalizeLocalVideoCapture.isFinalizeComplete : true;
            CameraProperties cameraProperties = finalizeLocalVideoCapture.cameraProperties;
            long j2 = finalizeLocalVideoCapture.startSelfieTimestamp;
            SelfieState selfieState = finalizeLocalVideoCapture.backState;
            CameraProperties.FacingMode facingMode = finalizeLocalVideoCapture.cameraFacingMode;
            arrayList3.getClass();
            cameraProperties.getClass();
            facingMode.getClass();
            return new FinalizeLocalVideoCapture(arrayList3, j, z, z2, cameraProperties, j2, selfieState, facingMode);
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
            return Intrinsics.areEqual(this.selfies, finalizeLocalVideoCapture.selfies) && this.minDurationMs == finalizeLocalVideoCapture.minDurationMs && this.isDelayComplete == finalizeLocalVideoCapture.isDelayComplete && this.isFinalizeComplete == finalizeLocalVideoCapture.isFinalizeComplete && Intrinsics.areEqual(this.cameraProperties, finalizeLocalVideoCapture.cameraProperties) && this.startSelfieTimestamp == finalizeLocalVideoCapture.startSelfieTimestamp && Intrinsics.areEqual(this.backState, finalizeLocalVideoCapture.backState) && this.cameraFacingMode == finalizeLocalVideoCapture.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m((this.cameraProperties.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.selfies.hashCode() * 31, 31, this.minDurationMs), 31, this.isDelayComplete), 31, this.isFinalizeComplete)) * 31, 31, this.startSelfieTimestamp);
            SelfieState selfieState = this.backState;
            return this.cameraFacingMode.hashCode() + ((m + (selfieState == null ? 0 : selfieState.hashCode())) * 31);
        }

        public final String toString() {
            return "FinalizeLocalVideoCapture(selfies=" + this.selfies + ", minDurationMs=" + this.minDurationMs + ", isDelayComplete=" + this.isDelayComplete + ", isFinalizeComplete=" + this.isFinalizeComplete + ", cameraProperties=" + this.cameraProperties + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", backState=" + this.backState + ", cameraFacingMode=" + this.cameraFacingMode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.selfies, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            parcel.writeLong(this.minDurationMs);
            parcel.writeInt(this.isDelayComplete ? 1 : 0);
            parcel.writeInt(this.isFinalizeComplete ? 1 : 0);
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, i);
            parcel.writeString(this.cameraFacingMode.name());
        }

        public /* synthetic */ FinalizeLocalVideoCapture(ArrayList arrayList, CameraProperties cameraProperties, long j, SelfieState selfieState, CameraProperties.FacingMode facingMode) {
            this(arrayList, 3000L, false, false, cameraProperties, j, selfieState, facingMode);
        }
    }

    public final class WaitForCameraFeed extends SelfieState implements CameraState {
        public static final Parcelable.Creator<WaitForCameraFeed> CREATOR = new PoseConfigs.Creator(16);
        public final boolean autoCaptureSupported;
        public final SelfieState backState;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final boolean hasRequestedAudioPermissions;
        public final boolean hasRequestedCameraPermissions;
        public final boolean isFlashEnabled;
        public final PoseConfigs poseConfigs;
        public final List posesNeeded;
        public final EmptyList selfies;

        public WaitForCameraFeed(boolean z, boolean z2, SelfieState selfieState, List list, PoseConfigs poseConfigs, boolean z3, CameraProperties.FacingMode facingMode, boolean z4) {
            list.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            this.hasRequestedCameraPermissions = z;
            this.hasRequestedAudioPermissions = z2;
            this.backState = selfieState;
            this.posesNeeded = list;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z3;
            this.cameraFacingMode = facingMode;
            this.isFlashEnabled = z4;
            this.selfies = EmptyList.INSTANCE;
        }

        public static WaitForCameraFeed copy$default(WaitForCameraFeed waitForCameraFeed, boolean z, boolean z2, boolean z3, int i) {
            if ((i & 1) != 0) {
                z = waitForCameraFeed.hasRequestedCameraPermissions;
            }
            boolean z4 = z;
            if ((i & 2) != 0) {
                z2 = waitForCameraFeed.hasRequestedAudioPermissions;
            }
            boolean z5 = z2;
            SelfieState selfieState = waitForCameraFeed.backState;
            List list = waitForCameraFeed.posesNeeded;
            PoseConfigs poseConfigs = waitForCameraFeed.poseConfigs;
            boolean z6 = waitForCameraFeed.autoCaptureSupported;
            CameraProperties.FacingMode facingMode = waitForCameraFeed.cameraFacingMode;
            if ((i & 128) != 0) {
                z3 = waitForCameraFeed.isFlashEnabled;
            }
            waitForCameraFeed.getClass();
            list.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            return new WaitForCameraFeed(z4, z5, selfieState, list, poseConfigs, z6, facingMode, z3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WaitForCameraFeed)) {
                return false;
            }
            WaitForCameraFeed waitForCameraFeed = (WaitForCameraFeed) obj;
            return this.hasRequestedCameraPermissions == waitForCameraFeed.hasRequestedCameraPermissions && this.hasRequestedAudioPermissions == waitForCameraFeed.hasRequestedAudioPermissions && Intrinsics.areEqual(this.backState, waitForCameraFeed.backState) && Intrinsics.areEqual(this.posesNeeded, waitForCameraFeed.posesNeeded) && Intrinsics.areEqual(this.poseConfigs, waitForCameraFeed.poseConfigs) && this.autoCaptureSupported == waitForCameraFeed.autoCaptureSupported && this.cameraFacingMode == waitForCameraFeed.cameraFacingMode && this.isFlashEnabled == waitForCameraFeed.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPose() {
            return (Selfie.Pose) CollectionsKt.first(getPosesNeeded());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPoseOrNull() {
            return (Selfie.Pose) CollectionsKt.firstOrNull(getPosesNeeded());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final List getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.hasRequestedCameraPermissions) * 31, 31, this.hasRequestedAudioPermissions);
            SelfieState selfieState = this.backState;
            return Boolean.hashCode(this.isFlashEnabled) + ((this.cameraFacingMode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.poseConfigs.poseConfigs.hashCode() + Recorder$$ExternalSyntheticOutline2.m((m + (selfieState == null ? 0 : selfieState.hashCode())) * 31, 31, this.posesNeeded)) * 31, 31, this.autoCaptureSupported)) * 31);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean isFlashEnabled() {
            return this.isFlashEnabled;
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("WaitForCameraFeed(hasRequestedCameraPermissions=", ", hasRequestedAudioPermissions=", ", backState=", this.hasRequestedCameraPermissions, this.hasRequestedAudioPermissions);
            m.append(this.backState);
            m.append(", posesNeeded=");
            m.append(this.posesNeeded);
            m.append(", poseConfigs=");
            m.append(this.poseConfigs);
            m.append(", autoCaptureSupported=");
            m.append(this.autoCaptureSupported);
            m.append(", cameraFacingMode=");
            m.append(this.cameraFacingMode);
            m.append(", isFlashEnabled=");
            m.append(this.isFlashEnabled);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.hasRequestedCameraPermissions ? 1 : 0);
            parcel.writeInt(this.hasRequestedAudioPermissions ? 1 : 0);
            parcel.writeParcelable(this.backState, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.posesNeeded, parcel);
            while (m.hasNext()) {
                parcel.writeString(((Selfie.Pose) m.next()).name());
            }
            this.poseConfigs.writeToParcel(parcel, i);
            parcel.writeInt(this.autoCaptureSupported ? 1 : 0);
            parcel.writeString(this.cameraFacingMode.name());
            parcel.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        public /* synthetic */ WaitForCameraFeed(SelfieState selfieState, List list, PoseConfigs poseConfigs, CameraProperties.FacingMode facingMode) {
            this(false, false, selfieState, list, poseConfigs, true, facingMode, false);
        }
    }

    public final class CountdownToManualCapture extends SelfieState implements CaptureState {
        public static final Parcelable.Creator<CountdownToManualCapture> CREATOR = new PoseConfigs.Creator(6);
        public final boolean autoCaptureSupported;
        public final SelfieState backState;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final CameraProperties cameraProperties;
        public final int countDown;
        public final boolean isFlashEnabled;
        public final PoseConfigs poseConfigs;
        public final List posesNeeded;
        public final SelfieError selfieError;
        public final EmptyList selfies;
        public final long startCaptureTimestamp;
        public final long startSelfieTimestamp;

        public CountdownToManualCapture(int i, SelfieError selfieError, CameraProperties cameraProperties, List list, long j, boolean z, long j2, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode facingMode, boolean z2) {
            cameraProperties.getClass();
            list.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            this.countDown = i;
            this.selfieError = selfieError;
            this.cameraProperties = cameraProperties;
            this.posesNeeded = list;
            this.startCaptureTimestamp = j;
            this.autoCaptureSupported = z;
            this.startSelfieTimestamp = j2;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = facingMode;
            this.isFlashEnabled = z2;
            this.selfies = EmptyList.INSTANCE;
        }

        public static CountdownToManualCapture copy$default(CountdownToManualCapture countdownToManualCapture, int i, SelfieError selfieError, boolean z, int i2) {
            int i3 = (i2 & 1) != 0 ? countdownToManualCapture.countDown : i;
            SelfieError selfieError2 = (i2 & 2) != 0 ? countdownToManualCapture.selfieError : selfieError;
            CameraProperties cameraProperties = countdownToManualCapture.cameraProperties;
            List list = countdownToManualCapture.posesNeeded;
            long j = countdownToManualCapture.startCaptureTimestamp;
            boolean z2 = countdownToManualCapture.autoCaptureSupported;
            long j2 = countdownToManualCapture.startSelfieTimestamp;
            SelfieState selfieState = countdownToManualCapture.backState;
            PoseConfigs poseConfigs = countdownToManualCapture.poseConfigs;
            CameraProperties.FacingMode facingMode = countdownToManualCapture.cameraFacingMode;
            boolean z3 = (i2 & 1024) != 0 ? countdownToManualCapture.isFlashEnabled : z;
            countdownToManualCapture.getClass();
            cameraProperties.getClass();
            list.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            return new CountdownToManualCapture(i3, selfieError2, cameraProperties, list, j, z2, j2, selfieState, poseConfigs, facingMode, z3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CountdownToManualCapture)) {
                return false;
            }
            CountdownToManualCapture countdownToManualCapture = (CountdownToManualCapture) obj;
            return this.countDown == countdownToManualCapture.countDown && this.selfieError == countdownToManualCapture.selfieError && Intrinsics.areEqual(this.cameraProperties, countdownToManualCapture.cameraProperties) && Intrinsics.areEqual(this.posesNeeded, countdownToManualCapture.posesNeeded) && this.startCaptureTimestamp == countdownToManualCapture.startCaptureTimestamp && this.autoCaptureSupported == countdownToManualCapture.autoCaptureSupported && this.startSelfieTimestamp == countdownToManualCapture.startSelfieTimestamp && Intrinsics.areEqual(this.backState, countdownToManualCapture.backState) && Intrinsics.areEqual(this.poseConfigs, countdownToManualCapture.poseConfigs) && this.cameraFacingMode == countdownToManualCapture.cameraFacingMode && this.isFlashEnabled == countdownToManualCapture.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CaptureState
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPose() {
            return MaterialColors.getCurrentPose(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final PoseConfig getCurrentPoseConfig() {
            return MaterialColors.getCurrentPoseConfig(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPoseOrNull() {
            return (Selfie.Pose) CollectionsKt.firstOrNull(getPosesNeeded());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CaptureState
        public final boolean getManualCaptureEnabled() {
            return DateStrings.getManualCaptureEnabled(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final List getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CaptureState
        public final long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CaptureState
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.countDown) * 31;
            SelfieError selfieError = this.selfieError;
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((this.cameraProperties.hashCode() + ((hashCode + (selfieError == null ? 0 : selfieError.hashCode())) * 31)) * 31, 31, this.posesNeeded), 31, this.startCaptureTimestamp), 31, this.autoCaptureSupported), 31, this.startSelfieTimestamp);
            SelfieState selfieState = this.backState;
            return Boolean.hashCode(this.isFlashEnabled) + ((this.cameraFacingMode.hashCode() + ((this.poseConfigs.poseConfigs.hashCode() + ((m + (selfieState != null ? selfieState.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean isFlashEnabled() {
            return this.isFlashEnabled;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CountdownToManualCapture(countDown=");
            sb.append(this.countDown);
            sb.append(", selfieError=");
            sb.append(this.selfieError);
            sb.append(", cameraProperties=");
            sb.append(this.cameraProperties);
            sb.append(", posesNeeded=");
            sb.append(this.posesNeeded);
            sb.append(", startCaptureTimestamp=");
            sb.append(this.startCaptureTimestamp);
            sb.append(", autoCaptureSupported=");
            sb.append(this.autoCaptureSupported);
            Boxes$$ExternalSyntheticOutline1.m1151m(this.startSelfieTimestamp, ", startSelfieTimestamp=", ", backState=", sb);
            sb.append(this.backState);
            sb.append(", poseConfigs=");
            sb.append(this.poseConfigs);
            sb.append(", cameraFacingMode=");
            sb.append(this.cameraFacingMode);
            sb.append(", isFlashEnabled=");
            sb.append(this.isFlashEnabled);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.countDown);
            SelfieError selfieError = this.selfieError;
            if (selfieError == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(selfieError.name());
            }
            parcel.writeParcelable(this.cameraProperties, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.posesNeeded, parcel);
            while (m.hasNext()) {
                parcel.writeString(((Selfie.Pose) m.next()).name());
            }
            parcel.writeLong(this.startCaptureTimestamp);
            parcel.writeInt(this.autoCaptureSupported ? 1 : 0);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.backState, i);
            this.poseConfigs.writeToParcel(parcel, i);
            parcel.writeString(this.cameraFacingMode.name());
            parcel.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        public /* synthetic */ CountdownToManualCapture(CameraProperties cameraProperties, List list, long j, boolean z, long j2, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode facingMode, boolean z2) {
            this(3, null, cameraProperties, list, j, z, j2, selfieState, poseConfigs, facingMode, z2);
        }
    }

    public final class CountdownToCapture extends SelfieState implements CameraState {
        public static final Parcelable.Creator<CountdownToCapture> CREATOR = new PoseConfigs.Creator(5);
        public final boolean autoCaptureSupported;
        public final SelfieState backState;
        public final SelfieBrightnessInfo brightnessInfo;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final CameraProperties cameraProperties;
        public final int countDown;
        public final boolean isFlashEnabled;
        public final PoseConfigs poseConfigs;
        public final float poseScore;
        public final List posesNeeded;
        public final SelfieError selfieError;
        public final List selfies;
        public final long startCaptureTimestamp;
        public final long startSelfieTimestamp;

        public CountdownToCapture(float f, int i, long j, long j2, CameraProperties.FacingMode facingMode, CameraProperties cameraProperties, SelfieBrightnessInfo selfieBrightnessInfo, SelfieError selfieError, PoseConfigs poseConfigs, SelfieState selfieState, List list, List list2, boolean z, boolean z2) {
            cameraProperties.getClass();
            list.getClass();
            list2.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            this.countDown = i;
            this.selfieError = selfieError;
            this.startCaptureTimestamp = j;
            this.cameraProperties = cameraProperties;
            this.startSelfieTimestamp = j2;
            this.poseScore = f;
            this.brightnessInfo = selfieBrightnessInfo;
            this.posesNeeded = list;
            this.selfies = list2;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.autoCaptureSupported = z;
            this.cameraFacingMode = facingMode;
            this.isFlashEnabled = z2;
        }

        public static CountdownToCapture copy$default(CountdownToCapture countdownToCapture, int i, SelfieError selfieError, boolean z, int i2) {
            int i3 = (i2 & 1) != 0 ? countdownToCapture.countDown : i;
            SelfieError selfieError2 = (i2 & 2) != 0 ? countdownToCapture.selfieError : selfieError;
            long j = countdownToCapture.startCaptureTimestamp;
            CameraProperties cameraProperties = countdownToCapture.cameraProperties;
            long j2 = countdownToCapture.startSelfieTimestamp;
            float f = countdownToCapture.poseScore;
            SelfieBrightnessInfo selfieBrightnessInfo = countdownToCapture.brightnessInfo;
            List list = countdownToCapture.posesNeeded;
            List list2 = countdownToCapture.selfies;
            SelfieState selfieState = countdownToCapture.backState;
            PoseConfigs poseConfigs = countdownToCapture.poseConfigs;
            boolean z2 = countdownToCapture.autoCaptureSupported;
            CameraProperties.FacingMode facingMode = countdownToCapture.cameraFacingMode;
            boolean z3 = (i2 & PKIFailureInfo.certRevoked) != 0 ? countdownToCapture.isFlashEnabled : z;
            countdownToCapture.getClass();
            cameraProperties.getClass();
            list.getClass();
            list2.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            return new CountdownToCapture(f, i3, j, j2, facingMode, cameraProperties, selfieBrightnessInfo, selfieError2, poseConfigs, selfieState, list, list2, z2, z3);
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
            return this.countDown == countdownToCapture.countDown && this.selfieError == countdownToCapture.selfieError && this.startCaptureTimestamp == countdownToCapture.startCaptureTimestamp && Intrinsics.areEqual(this.cameraProperties, countdownToCapture.cameraProperties) && this.startSelfieTimestamp == countdownToCapture.startSelfieTimestamp && Float.compare(this.poseScore, countdownToCapture.poseScore) == 0 && Intrinsics.areEqual(this.brightnessInfo, countdownToCapture.brightnessInfo) && Intrinsics.areEqual(this.posesNeeded, countdownToCapture.posesNeeded) && Intrinsics.areEqual(this.selfies, countdownToCapture.selfies) && Intrinsics.areEqual(this.backState, countdownToCapture.backState) && Intrinsics.areEqual(this.poseConfigs, countdownToCapture.poseConfigs) && this.autoCaptureSupported == countdownToCapture.autoCaptureSupported && this.cameraFacingMode == countdownToCapture.cameraFacingMode && this.isFlashEnabled == countdownToCapture.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPose() {
            return (Selfie.Pose) CollectionsKt.first(getPosesNeeded());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final PoseConfig getCurrentPoseConfig() {
            throw null;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPoseOrNull() {
            return (Selfie.Pose) CollectionsKt.firstOrNull(getPosesNeeded());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final List getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.countDown) * 31;
            SelfieError selfieError = this.selfieError;
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.poseScore, Recorder$$ExternalSyntheticOutline2.m((this.cameraProperties.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (selfieError == null ? 0 : selfieError.hashCode())) * 31, 31, this.startCaptureTimestamp)) * 31, 31, this.startSelfieTimestamp), 31);
            SelfieBrightnessInfo selfieBrightnessInfo = this.brightnessInfo;
            int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m + (selfieBrightnessInfo == null ? 0 : selfieBrightnessInfo.hashCode())) * 31, 31, this.posesNeeded), 31, this.selfies);
            SelfieState selfieState = this.backState;
            return Boolean.hashCode(this.isFlashEnabled) + ((this.cameraFacingMode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.poseConfigs.poseConfigs.hashCode() + ((m2 + (selfieState != null ? selfieState.hashCode() : 0)) * 31)) * 31, 31, this.autoCaptureSupported)) * 31);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean isFlashEnabled() {
            return this.isFlashEnabled;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CountdownToCapture(countDown=");
            sb.append(this.countDown);
            sb.append(", selfieError=");
            sb.append(this.selfieError);
            sb.append(", startCaptureTimestamp=");
            sb.append(this.startCaptureTimestamp);
            sb.append(", cameraProperties=");
            sb.append(this.cameraProperties);
            Boxes$$ExternalSyntheticOutline1.m1151m(this.startSelfieTimestamp, ", startSelfieTimestamp=", ", poseScore=", sb);
            sb.append(this.poseScore);
            sb.append(", brightnessInfo=");
            sb.append(this.brightnessInfo);
            sb.append(", posesNeeded=");
            Request$Priority$EnumUnboxingLocalUtility.m(sb, this.posesNeeded, ", selfies=", this.selfies, ", backState=");
            sb.append(this.backState);
            sb.append(", poseConfigs=");
            sb.append(this.poseConfigs);
            sb.append(", autoCaptureSupported=");
            sb.append(this.autoCaptureSupported);
            sb.append(", cameraFacingMode=");
            sb.append(this.cameraFacingMode);
            sb.append(", isFlashEnabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isFlashEnabled, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.countDown);
            SelfieError selfieError = this.selfieError;
            if (selfieError == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(selfieError.name());
            }
            parcel.writeLong(this.startCaptureTimestamp);
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeFloat(this.poseScore);
            parcel.writeParcelable(this.brightnessInfo, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.posesNeeded, parcel);
            while (m.hasNext()) {
                parcel.writeString(((Selfie.Pose) m.next()).name());
            }
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.selfies, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeParcelable(this.backState, i);
            this.poseConfigs.writeToParcel(parcel, i);
            parcel.writeInt(this.autoCaptureSupported ? 1 : 0);
            parcel.writeString(this.cameraFacingMode.name());
            parcel.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        public CountdownToCapture(long j, CameraProperties cameraProperties, long j2, float f, SelfieBrightnessInfo selfieBrightnessInfo, List list, List list2, SelfieState selfieState, PoseConfigs poseConfigs, boolean z, CameraProperties.FacingMode facingMode, boolean z2) {
            this(f, 3, j, j2, facingMode, cameraProperties, selfieBrightnessInfo, null, poseConfigs, selfieState, list, list2, z, z2);
        }
    }

    public final class StartCapture extends SelfieState implements CaptureState {
        public static final Parcelable.Creator<StartCapture> CREATOR = new PoseConfigs.Creator(13);
        public final boolean autoCaptureSupported;
        public final SelfieState backState;
        public final SelfieBrightnessInfo brightnessInfo;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final CameraProperties cameraProperties;
        public final boolean centered;
        public final boolean isFlashEnabled;
        public final PoseConfigs poseConfigs;
        public final float poseScore;
        public final List posesNeeded;
        public final SelfieError selfieError;
        public final List selfies;
        public final long startCaptureTimestamp;
        public final long startSelfieTimestamp;

        public StartCapture(boolean z, SelfieError selfieError, float f, SelfieBrightnessInfo selfieBrightnessInfo, List list, List list2, long j, boolean z2, long j2, CameraProperties cameraProperties, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode facingMode, boolean z3) {
            list.getClass();
            list2.getClass();
            cameraProperties.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            this.centered = z;
            this.selfieError = selfieError;
            this.poseScore = f;
            this.brightnessInfo = selfieBrightnessInfo;
            this.posesNeeded = list;
            this.selfies = list2;
            this.startCaptureTimestamp = j;
            this.autoCaptureSupported = z2;
            this.startSelfieTimestamp = j2;
            this.cameraProperties = cameraProperties;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = facingMode;
            this.isFlashEnabled = z3;
        }

        public static StartCapture copy$default(StartCapture startCapture, SelfieError selfieError, float f, SelfieBrightnessInfo selfieBrightnessInfo, boolean z, int i) {
            boolean z2 = (i & 1) != 0 ? startCapture.centered : false;
            SelfieError selfieError2 = (i & 2) != 0 ? startCapture.selfieError : selfieError;
            float f2 = (i & 4) != 0 ? startCapture.poseScore : f;
            SelfieBrightnessInfo selfieBrightnessInfo2 = (i & 8) != 0 ? startCapture.brightnessInfo : selfieBrightnessInfo;
            List list = startCapture.posesNeeded;
            List list2 = startCapture.selfies;
            long j = startCapture.startCaptureTimestamp;
            boolean z3 = (i & 128) != 0 ? startCapture.autoCaptureSupported : false;
            long j2 = startCapture.startSelfieTimestamp;
            CameraProperties cameraProperties = startCapture.cameraProperties;
            SelfieState selfieState = startCapture.backState;
            PoseConfigs poseConfigs = startCapture.poseConfigs;
            CameraProperties.FacingMode facingMode = startCapture.cameraFacingMode;
            boolean z4 = (i & PKIFailureInfo.certRevoked) != 0 ? startCapture.isFlashEnabled : z;
            startCapture.getClass();
            list.getClass();
            list2.getClass();
            cameraProperties.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            return new StartCapture(z2, selfieError2, f2, selfieBrightnessInfo2, list, list2, j, z3, j2, cameraProperties, selfieState, poseConfigs, facingMode, z4);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartCapture)) {
                return false;
            }
            StartCapture startCapture = (StartCapture) obj;
            return this.centered == startCapture.centered && this.selfieError == startCapture.selfieError && Float.compare(this.poseScore, startCapture.poseScore) == 0 && Intrinsics.areEqual(this.brightnessInfo, startCapture.brightnessInfo) && Intrinsics.areEqual(this.posesNeeded, startCapture.posesNeeded) && Intrinsics.areEqual(this.selfies, startCapture.selfies) && this.startCaptureTimestamp == startCapture.startCaptureTimestamp && this.autoCaptureSupported == startCapture.autoCaptureSupported && this.startSelfieTimestamp == startCapture.startSelfieTimestamp && Intrinsics.areEqual(this.cameraProperties, startCapture.cameraProperties) && Intrinsics.areEqual(this.backState, startCapture.backState) && Intrinsics.areEqual(this.poseConfigs, startCapture.poseConfigs) && this.cameraFacingMode == startCapture.cameraFacingMode && this.isFlashEnabled == startCapture.isFlashEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CaptureState
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPose() {
            return MaterialColors.getCurrentPose(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final PoseConfig getCurrentPoseConfig() {
            return MaterialColors.getCurrentPoseConfig(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPoseOrNull() {
            return (Selfie.Pose) CollectionsKt.firstOrNull(getPosesNeeded());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CaptureState
        public final boolean getManualCaptureEnabled() {
            return DateStrings.getManualCaptureEnabled(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final List getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CaptureState
        public final long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CaptureState
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.centered) * 31;
            SelfieError selfieError = this.selfieError;
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.poseScore, (hashCode + (selfieError == null ? 0 : selfieError.hashCode())) * 31, 31);
            SelfieBrightnessInfo selfieBrightnessInfo = this.brightnessInfo;
            int hashCode2 = (this.cameraProperties.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m + (selfieBrightnessInfo == null ? 0 : selfieBrightnessInfo.hashCode())) * 31, 31, this.posesNeeded), 31, this.selfies), 31, this.startCaptureTimestamp), 31, this.autoCaptureSupported), 31, this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return Boolean.hashCode(this.isFlashEnabled) + ((this.cameraFacingMode.hashCode() + ((this.poseConfigs.poseConfigs.hashCode() + ((hashCode2 + (selfieState != null ? selfieState.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean isFlashEnabled() {
            return this.isFlashEnabled;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StartCapture(centered=");
            sb.append(this.centered);
            sb.append(", selfieError=");
            sb.append(this.selfieError);
            sb.append(", poseScore=");
            sb.append(this.poseScore);
            sb.append(", brightnessInfo=");
            sb.append(this.brightnessInfo);
            sb.append(", posesNeeded=");
            Request$Priority$EnumUnboxingLocalUtility.m(sb, this.posesNeeded, ", selfies=", this.selfies, ", startCaptureTimestamp=");
            sb.append(this.startCaptureTimestamp);
            sb.append(", autoCaptureSupported=");
            sb.append(this.autoCaptureSupported);
            Boxes$$ExternalSyntheticOutline1.m1151m(this.startSelfieTimestamp, ", startSelfieTimestamp=", ", cameraProperties=", sb);
            sb.append(this.cameraProperties);
            sb.append(", backState=");
            sb.append(this.backState);
            sb.append(", poseConfigs=");
            sb.append(this.poseConfigs);
            sb.append(", cameraFacingMode=");
            sb.append(this.cameraFacingMode);
            sb.append(", isFlashEnabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isFlashEnabled, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.centered ? 1 : 0);
            SelfieError selfieError = this.selfieError;
            if (selfieError == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(selfieError.name());
            }
            parcel.writeFloat(this.poseScore);
            parcel.writeParcelable(this.brightnessInfo, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.posesNeeded, parcel);
            while (m.hasNext()) {
                parcel.writeString(((Selfie.Pose) m.next()).name());
            }
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.selfies, parcel);
            while (m2.hasNext()) {
                parcel.writeParcelable((Parcelable) m2.next(), i);
            }
            parcel.writeLong(this.startCaptureTimestamp);
            parcel.writeInt(this.autoCaptureSupported ? 1 : 0);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeParcelable(this.backState, i);
            this.poseConfigs.writeToParcel(parcel, i);
            parcel.writeString(this.cameraFacingMode.name());
            parcel.writeInt(this.isFlashEnabled ? 1 : 0);
        }

        public StartCapture(SelfieError selfieError, float f, SelfieBrightnessInfo selfieBrightnessInfo, List list, List list2, long j, long j2, CameraProperties cameraProperties, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode facingMode, boolean z, int i) {
            this(false, (i & 2) != 0 ? SelfieError.FaceNotCentered : selfieError, f, selfieBrightnessInfo, list, (i & 32) != 0 ? EmptyList.INSTANCE : list2, j, true, j2, cameraProperties, selfieState, poseConfigs, facingMode, z);
        }
    }

    public final class Capture extends SelfieState implements CaptureState {
        public static final Parcelable.Creator<Capture> CREATOR = new PoseConfigs.Creator(3);
        public final boolean autoCaptureSupported;
        public final SelfieState backState;
        public final SelfieBrightnessInfo brightnessInfo;
        public final CameraProperties.FacingMode cameraFacingMode;
        public final CameraProperties cameraProperties;
        public final FlashState flashState;
        public final boolean isFlashEnabled;
        public final PoseConfigs poseConfigs;
        public final float poseScore;
        public final List posesNeeded;
        public final SelfieError selfieError;
        public final List selfies;
        public final long startCaptureTimestamp;
        public final long startSelfieTimestamp;

        public Capture(float f, int i, long j, long j2, CameraProperties.FacingMode facingMode, CameraProperties cameraProperties, SelfieBrightnessInfo selfieBrightnessInfo, SelfieError selfieError, PoseConfigs poseConfigs, SelfieState selfieState, List list, List list2, boolean z, boolean z2) {
            this((i & 1) != 0 ? null : selfieError, f, selfieBrightnessInfo, (i & 8) != 0 ? EmptyList.INSTANCE : list, list2, j, (i & 64) != 0 ? true : z, j2, cameraProperties, selfieState, poseConfigs, facingMode, z2, FlashState.Disabled);
        }

        public static Capture copy$default(Capture capture, SelfieError selfieError, float f, SelfieBrightnessInfo selfieBrightnessInfo, boolean z, FlashState flashState, int i) {
            SelfieError selfieError2 = (i & 1) != 0 ? capture.selfieError : selfieError;
            float f2 = (i & 2) != 0 ? capture.poseScore : f;
            SelfieBrightnessInfo selfieBrightnessInfo2 = (i & 4) != 0 ? capture.brightnessInfo : selfieBrightnessInfo;
            List list = capture.selfies;
            List list2 = capture.posesNeeded;
            long j = capture.startCaptureTimestamp;
            boolean z2 = (i & 64) != 0 ? capture.autoCaptureSupported : false;
            long j2 = capture.startSelfieTimestamp;
            CameraProperties cameraProperties = capture.cameraProperties;
            SelfieState selfieState = capture.backState;
            PoseConfigs poseConfigs = capture.poseConfigs;
            CameraProperties.FacingMode facingMode = capture.cameraFacingMode;
            boolean z3 = (i & 4096) != 0 ? capture.isFlashEnabled : z;
            FlashState flashState2 = (i & PKIFailureInfo.certRevoked) != 0 ? capture.flashState : flashState;
            capture.getClass();
            list.getClass();
            list2.getClass();
            cameraProperties.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            flashState2.getClass();
            return new Capture(selfieError2, f2, selfieBrightnessInfo2, list, list2, j, z2, j2, cameraProperties, selfieState, poseConfigs, facingMode, z3, flashState2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Capture)) {
                return false;
            }
            Capture capture = (Capture) obj;
            return this.selfieError == capture.selfieError && Float.compare(this.poseScore, capture.poseScore) == 0 && Intrinsics.areEqual(this.brightnessInfo, capture.brightnessInfo) && Intrinsics.areEqual(this.selfies, capture.selfies) && Intrinsics.areEqual(this.posesNeeded, capture.posesNeeded) && this.startCaptureTimestamp == capture.startCaptureTimestamp && this.autoCaptureSupported == capture.autoCaptureSupported && this.startSelfieTimestamp == capture.startSelfieTimestamp && Intrinsics.areEqual(this.cameraProperties, capture.cameraProperties) && Intrinsics.areEqual(this.backState, capture.backState) && Intrinsics.areEqual(this.poseConfigs, capture.poseConfigs) && this.cameraFacingMode == capture.cameraFacingMode && this.isFlashEnabled == capture.isFlashEnabled && this.flashState == capture.flashState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean getAutoCaptureSupported() {
            return this.autoCaptureSupported;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final SelfieState getBackState$selfie_release() {
            return this.backState;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final CameraProperties.FacingMode getCameraFacingMode$selfie_release() {
            return this.cameraFacingMode;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CaptureState
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPose() {
            return MaterialColors.getCurrentPose(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final PoseConfig getCurrentPoseConfig() {
            return MaterialColors.getCurrentPoseConfig(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final Selfie.Pose getCurrentPoseOrNull() {
            return (Selfie.Pose) CollectionsKt.firstOrNull(getPosesNeeded());
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CaptureState
        public final boolean getManualCaptureEnabled() {
            return DateStrings.getManualCaptureEnabled(this);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final List getPosesNeeded() {
            return this.posesNeeded;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.SelfieState
        public final List getSelfies$selfie_release() {
            return this.selfies;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CaptureState
        public final long getStartCaptureTimestamp() {
            return this.startCaptureTimestamp;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CaptureState
        public final long getStartSelfieTimestamp() {
            return this.startSelfieTimestamp;
        }

        public final int hashCode() {
            SelfieError selfieError = this.selfieError;
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.poseScore, (selfieError == null ? 0 : selfieError.hashCode()) * 31, 31);
            SelfieBrightnessInfo selfieBrightnessInfo = this.brightnessInfo;
            int hashCode = (this.cameraProperties.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m + (selfieBrightnessInfo == null ? 0 : selfieBrightnessInfo.hashCode())) * 31, 31, this.selfies), 31, this.posesNeeded), 31, this.startCaptureTimestamp), 31, this.autoCaptureSupported), 31, this.startSelfieTimestamp)) * 31;
            SelfieState selfieState = this.backState;
            return this.flashState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.cameraFacingMode.hashCode() + ((this.poseConfigs.poseConfigs.hashCode() + ((hashCode + (selfieState != null ? selfieState.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.isFlashEnabled);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.CameraState
        public final boolean isFlashEnabled() {
            return this.isFlashEnabled;
        }

        public final String toString() {
            return "Capture(selfieError=" + this.selfieError + ", poseScore=" + this.poseScore + ", brightnessInfo=" + this.brightnessInfo + ", selfies=" + this.selfies + ", posesNeeded=" + this.posesNeeded + ", startCaptureTimestamp=" + this.startCaptureTimestamp + ", autoCaptureSupported=" + this.autoCaptureSupported + ", startSelfieTimestamp=" + this.startSelfieTimestamp + ", cameraProperties=" + this.cameraProperties + ", backState=" + this.backState + ", poseConfigs=" + this.poseConfigs + ", cameraFacingMode=" + this.cameraFacingMode + ", isFlashEnabled=" + this.isFlashEnabled + ", flashState=" + this.flashState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            SelfieError selfieError = this.selfieError;
            if (selfieError == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(selfieError.name());
            }
            parcel.writeFloat(this.poseScore);
            parcel.writeParcelable(this.brightnessInfo, i);
            Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.selfies, parcel);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
            Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.posesNeeded, parcel);
            while (m2.hasNext()) {
                parcel.writeString(((Selfie.Pose) m2.next()).name());
            }
            parcel.writeLong(this.startCaptureTimestamp);
            parcel.writeInt(this.autoCaptureSupported ? 1 : 0);
            parcel.writeLong(this.startSelfieTimestamp);
            parcel.writeParcelable(this.cameraProperties, i);
            parcel.writeParcelable(this.backState, i);
            this.poseConfigs.writeToParcel(parcel, i);
            parcel.writeString(this.cameraFacingMode.name());
            parcel.writeInt(this.isFlashEnabled ? 1 : 0);
            parcel.writeString(this.flashState.name());
        }

        public Capture(SelfieError selfieError, float f, SelfieBrightnessInfo selfieBrightnessInfo, List list, List list2, long j, boolean z, long j2, CameraProperties cameraProperties, SelfieState selfieState, PoseConfigs poseConfigs, CameraProperties.FacingMode facingMode, boolean z2, FlashState flashState) {
            list.getClass();
            list2.getClass();
            cameraProperties.getClass();
            poseConfigs.getClass();
            facingMode.getClass();
            flashState.getClass();
            this.selfieError = selfieError;
            this.poseScore = f;
            this.brightnessInfo = selfieBrightnessInfo;
            this.selfies = list;
            this.posesNeeded = list2;
            this.startCaptureTimestamp = j;
            this.autoCaptureSupported = z;
            this.startSelfieTimestamp = j2;
            this.cameraProperties = cameraProperties;
            this.backState = selfieState;
            this.poseConfigs = poseConfigs;
            this.cameraFacingMode = facingMode;
            this.isFlashEnabled = z2;
            this.flashState = flashState;
        }
    }
}
