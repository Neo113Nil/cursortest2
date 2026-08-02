package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.selfie.SelfieError;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.network.SelfieStepData;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class PoseConfigs implements Parcelable {
    public static final Parcelable.Creator<PoseConfigs> CREATOR = new Creator(0);
    public final LinkedHashMap poseConfigs;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            SelfieState selfieState;
            boolean z;
            SelfieState selfieState2;
            Selfie.Pose pose;
            CameraProperties.FacingMode facingMode;
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                    while (i != readInt) {
                        linkedHashMap.put(Selfie.Pose.valueOf(parcel.readString()), PoseConfig.CREATOR.createFromParcel(parcel));
                        i++;
                    }
                    return new PoseConfigs(linkedHashMap);
                case 1:
                    parcel.getClass();
                    return new Selfie.SelfieImage(parcel.readString(), Selfie.CaptureMethod.valueOf(parcel.readString()), Selfie.Pose.valueOf(parcel.readString()), parcel.readLong());
                case 2:
                    parcel.getClass();
                    return new Selfie.SelfieVideo(parcel.readString(), Selfie.CaptureMethod.valueOf(parcel.readString()));
                case 3:
                    parcel.getClass();
                    SelfieError valueOf = parcel.readInt() != 0 ? SelfieError.valueOf(parcel.readString()) : null;
                    float readFloat = parcel.readFloat();
                    SelfieBrightnessInfo selfieBrightnessInfo = (SelfieBrightnessInfo) parcel.readParcelable(SelfieState.Capture.class.getClassLoader());
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(SelfieState.Capture.class, parcel, arrayList, i2, 1);
                    }
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt3);
                    for (int i3 = 0; i3 != readInt3; i3++) {
                        arrayList2.add(Selfie.Pose.valueOf(parcel.readString()));
                    }
                    return new SelfieState.Capture(valueOf, readFloat, selfieBrightnessInfo, arrayList, arrayList2, parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (CameraProperties) parcel.readParcelable(SelfieState.Capture.class.getClassLoader()), (SelfieState) parcel.readParcelable(SelfieState.Capture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0, SelfieState.FlashState.valueOf(parcel.readString()));
                case 4:
                    parcel.getClass();
                    SelfieState selfieState3 = (SelfieState) parcel.readParcelable(SelfieState.CaptureTransition.class.getClassLoader());
                    Selfie.Pose valueOf2 = Selfie.Pose.valueOf(parcel.readString());
                    SelfieState selfieState4 = (SelfieState) parcel.readParcelable(SelfieState.CaptureTransition.class.getClassLoader());
                    CameraProperties.FacingMode valueOf3 = CameraProperties.FacingMode.valueOf(parcel.readString());
                    if (parcel.readInt() != 0) {
                        selfieState = selfieState3;
                        z = true;
                        facingMode = valueOf3;
                        selfieState2 = selfieState4;
                        pose = valueOf2;
                    } else {
                        selfieState = selfieState3;
                        z = false;
                        selfieState2 = selfieState4;
                        pose = valueOf2;
                        facingMode = valueOf3;
                    }
                    return new SelfieState.CaptureTransition(selfieState, pose, selfieState2, facingMode, z);
                case 5:
                    parcel.getClass();
                    int readInt4 = parcel.readInt();
                    SelfieError valueOf4 = parcel.readInt() != 0 ? SelfieError.valueOf(parcel.readString()) : null;
                    long readLong = parcel.readLong();
                    CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(SelfieState.CountdownToCapture.class.getClassLoader());
                    long readLong2 = parcel.readLong();
                    float readFloat2 = parcel.readFloat();
                    SelfieBrightnessInfo selfieBrightnessInfo2 = (SelfieBrightnessInfo) parcel.readParcelable(SelfieState.CountdownToCapture.class.getClassLoader());
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt5);
                    for (int i4 = 0; i4 != readInt5; i4++) {
                        arrayList3.add(Selfie.Pose.valueOf(parcel.readString()));
                    }
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt6);
                    int i5 = 0;
                    while (i5 != readInt6) {
                        i5 = CameraState$Type$EnumUnboxingLocalUtility.m(SelfieState.CountdownToCapture.class, parcel, arrayList4, i5, 1);
                    }
                    return new SelfieState.CountdownToCapture(readFloat2, readInt4, readLong, readLong2, CameraProperties.FacingMode.valueOf(parcel.readString()), cameraProperties, selfieBrightnessInfo2, valueOf4, PoseConfigs.CREATOR.createFromParcel(parcel), (SelfieState) parcel.readParcelable(SelfieState.CountdownToCapture.class.getClassLoader()), arrayList3, arrayList4, parcel.readInt() != 0, parcel.readInt() != 0);
                case 6:
                    parcel.getClass();
                    int readInt7 = parcel.readInt();
                    SelfieError valueOf5 = parcel.readInt() != 0 ? SelfieError.valueOf(parcel.readString()) : null;
                    CameraProperties cameraProperties2 = (CameraProperties) parcel.readParcelable(SelfieState.CountdownToManualCapture.class.getClassLoader());
                    int readInt8 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt8);
                    for (int i6 = 0; i6 != readInt8; i6++) {
                        arrayList5.add(Selfie.Pose.valueOf(parcel.readString()));
                    }
                    return new SelfieState.CountdownToManualCapture(readInt7, valueOf5, cameraProperties2, arrayList5, parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (SelfieState) parcel.readParcelable(SelfieState.CountdownToManualCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0);
                case 7:
                    parcel.getClass();
                    int readInt9 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt9);
                    int i7 = 0;
                    while (i7 != readInt9) {
                        i7 = CameraState$Type$EnumUnboxingLocalUtility.m(SelfieState.FinalizeLocalVideoCapture.class, parcel, arrayList6, i7, 1);
                    }
                    return new SelfieState.FinalizeLocalVideoCapture(arrayList6, parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0, (CameraProperties) parcel.readParcelable(SelfieState.FinalizeLocalVideoCapture.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(SelfieState.FinalizeLocalVideoCapture.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()));
                case 8:
                    parcel.getClass();
                    int readInt10 = parcel.readInt();
                    ArrayList arrayList7 = new ArrayList(readInt10);
                    while (i != readInt10) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(SelfieState.FinalizeWebRtc.class, parcel, arrayList7, i, 1);
                    }
                    return new SelfieState.FinalizeWebRtc(arrayList7, (CameraProperties) parcel.readParcelable(SelfieState.FinalizeWebRtc.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(SelfieState.FinalizeWebRtc.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()));
                case 9:
                    parcel.getClass();
                    return new SelfieState.RestartCamera(parcel.readInt() != 0, parcel.readInt() != 0, (SelfieState) parcel.readParcelable(SelfieState.RestartCamera.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()));
                case 10:
                    parcel.getClass();
                    int readInt11 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(readInt11);
                    int i8 = 0;
                    while (i8 != readInt11) {
                        i8 = CameraState$Type$EnumUnboxingLocalUtility.m(SelfieState.ReviewCaptures.class, parcel, arrayList8, i8, 1);
                    }
                    int readInt12 = parcel.readInt();
                    ArrayList arrayList9 = new ArrayList(readInt12);
                    while (i != readInt12) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(SelfieState.ReviewCaptures.class, parcel, arrayList9, i, 1);
                    }
                    return new SelfieState.ReviewCaptures(arrayList8, arrayList9, parcel.readString(), (CameraProperties) parcel.readParcelable(SelfieState.ReviewCaptures.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(SelfieState.ReviewCaptures.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()));
                case 11:
                    parcel.getClass();
                    return new SelfieState.ShowInstructions((SelfieState) parcel.readParcelable(SelfieState.ShowInstructions.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()));
                case 12:
                    parcel.getClass();
                    int readInt13 = parcel.readInt();
                    ArrayList arrayList10 = new ArrayList(readInt13);
                    int i9 = 0;
                    while (i9 != readInt13) {
                        i9 = CameraState$Type$EnumUnboxingLocalUtility.m(SelfieState.ShowPoseHint.class, parcel, arrayList10, i9, 1);
                    }
                    int readInt14 = parcel.readInt();
                    ArrayList arrayList11 = new ArrayList(readInt14);
                    for (int i10 = 0; i10 != readInt14; i10++) {
                        arrayList11.add(Selfie.Pose.valueOf(parcel.readString()));
                    }
                    return new SelfieState.ShowPoseHint(arrayList10, arrayList11, parcel.readInt() != 0, (CameraProperties) parcel.readParcelable(SelfieState.ShowPoseHint.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(SelfieState.ShowPoseHint.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0);
                case 13:
                    parcel.getClass();
                    boolean z2 = parcel.readInt() != 0;
                    SelfieError valueOf6 = parcel.readInt() != 0 ? SelfieError.valueOf(parcel.readString()) : null;
                    float readFloat3 = parcel.readFloat();
                    SelfieBrightnessInfo selfieBrightnessInfo3 = (SelfieBrightnessInfo) parcel.readParcelable(SelfieState.StartCapture.class.getClassLoader());
                    int readInt15 = parcel.readInt();
                    ArrayList arrayList12 = new ArrayList(readInt15);
                    for (int i11 = 0; i11 != readInt15; i11++) {
                        arrayList12.add(Selfie.Pose.valueOf(parcel.readString()));
                    }
                    int readInt16 = parcel.readInt();
                    ArrayList arrayList13 = new ArrayList(readInt16);
                    int i12 = 0;
                    while (i12 != readInt16) {
                        i12 = CameraState$Type$EnumUnboxingLocalUtility.m(SelfieState.StartCapture.class, parcel, arrayList13, i12, 1);
                    }
                    return new SelfieState.StartCapture(z2, valueOf6, readFloat3, selfieBrightnessInfo3, arrayList12, arrayList13, parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), (CameraProperties) parcel.readParcelable(SelfieState.StartCapture.class.getClassLoader()), (SelfieState) parcel.readParcelable(SelfieState.StartCapture.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0);
                case 14:
                    parcel.getClass();
                    long readLong3 = parcel.readLong();
                    CameraProperties cameraProperties3 = (CameraProperties) parcel.readParcelable(SelfieState.StartCaptureFaceDetected.class.getClassLoader());
                    long readLong4 = parcel.readLong();
                    float readFloat4 = parcel.readFloat();
                    SelfieBrightnessInfo selfieBrightnessInfo4 = (SelfieBrightnessInfo) parcel.readParcelable(SelfieState.StartCaptureFaceDetected.class.getClassLoader());
                    int readInt17 = parcel.readInt();
                    ArrayList arrayList14 = new ArrayList(readInt17);
                    for (int i13 = 0; i13 != readInt17; i13++) {
                        arrayList14.add(Selfie.Pose.valueOf(parcel.readString()));
                    }
                    int readInt18 = parcel.readInt();
                    ArrayList arrayList15 = new ArrayList(readInt18);
                    int i14 = 0;
                    while (i14 != readInt18) {
                        i14 = CameraState$Type$EnumUnboxingLocalUtility.m(SelfieState.StartCaptureFaceDetected.class, parcel, arrayList15, i14, 1);
                    }
                    return new SelfieState.StartCaptureFaceDetected(readLong3, cameraProperties3, readLong4, readFloat4, selfieBrightnessInfo4, arrayList14, arrayList15, (SelfieState) parcel.readParcelable(SelfieState.StartCaptureFaceDetected.class.getClassLoader()), PoseConfigs.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0);
                case 15:
                    parcel.getClass();
                    int readInt19 = parcel.readInt();
                    ArrayList arrayList16 = new ArrayList(readInt19);
                    while (i != readInt19) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(SelfieState.Submit.class, parcel, arrayList16, i, 1);
                    }
                    return new SelfieState.Submit(arrayList16, parcel.readString(), (CameraProperties) parcel.readParcelable(SelfieState.Submit.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(SelfieState.Submit.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()));
                case 16:
                    parcel.getClass();
                    boolean z3 = parcel.readInt() != 0;
                    boolean z4 = parcel.readInt() != 0;
                    SelfieState selfieState5 = (SelfieState) parcel.readParcelable(SelfieState.WaitForCameraFeed.class.getClassLoader());
                    int readInt20 = parcel.readInt();
                    ArrayList arrayList17 = new ArrayList(readInt20);
                    for (int i15 = 0; i15 != readInt20; i15++) {
                        arrayList17.add(Selfie.Pose.valueOf(parcel.readString()));
                    }
                    return new SelfieState.WaitForCameraFeed(z3, z4, selfieState5, arrayList17, PoseConfigs.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0);
                case 17:
                    parcel.getClass();
                    String readString = parcel.readString();
                    CameraProperties cameraProperties4 = (CameraProperties) parcel.readParcelable(SelfieState.WaitForWebRtcSetup.class.getClassLoader());
                    long readLong5 = parcel.readLong();
                    SelfieState selfieState6 = (SelfieState) parcel.readParcelable(SelfieState.WaitForWebRtcSetup.class.getClassLoader());
                    int readInt21 = parcel.readInt();
                    ArrayList arrayList18 = new ArrayList(readInt21);
                    for (int i16 = 0; i16 != readInt21; i16++) {
                        arrayList18.add(Selfie.Pose.valueOf(parcel.readString()));
                    }
                    return new SelfieState.WaitForWebRtcSetup(readString, cameraProperties4, readLong5, selfieState6, arrayList18, PoseConfigs.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readInt() != 0);
                case 18:
                    parcel.getClass();
                    int readInt22 = parcel.readInt();
                    ArrayList arrayList19 = new ArrayList(readInt22);
                    while (i != readInt22) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(SelfieState.WebRtcFinished.class, parcel, arrayList19, i, 1);
                    }
                    return new SelfieState.WebRtcFinished(arrayList19, parcel.readString(), (CameraProperties) parcel.readParcelable(SelfieState.WebRtcFinished.class.getClassLoader()), parcel.readLong(), (SelfieState) parcel.readParcelable(SelfieState.WebRtcFinished.class.getClassLoader()), CameraProperties.FacingMode.valueOf(parcel.readString()));
                case 19:
                    parcel.getClass();
                    parcel.readInt();
                    return SelfieType.CenterOnly.INSTANCE;
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return SelfieType.ConfigurablePoses.INSTANCE;
                case 21:
                    parcel.getClass();
                    parcel.readInt();
                    return SelfieType.ThreePhotos.INSTANCE;
                case 22:
                    parcel.getClass();
                    return new SelfieWorkflow.Input.Strings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 23:
                    parcel.getClass();
                    return new SelfieStepData(parcel.readString(), (Selfie) parcel.readParcelable(SelfieStepData.class.getClassLoader()), (Selfie) parcel.readParcelable(SelfieStepData.class.getClassLoader()), (Selfie) parcel.readParcelable(SelfieStepData.class.getClassLoader()));
                case 24:
                    parcel.getClass();
                    return new SelfieStepFragment.SelfieStepFragmentArgs(SelfieWorkflow.Input.CREATOR.createFromParcel(parcel));
                case 25:
                    parcel.getClass();
                    return new InquiryTheme(InquiryTheme.IconStyle.valueOf(parcel.readString()));
                case 26:
                    parcel.getClass();
                    return GpsCollectionRequirement.valueOf(parcel.readString());
                case 27:
                    parcel.getClass();
                    return GpsPrecisionRequirement.valueOf(parcel.readString());
                case 28:
                    parcel.getClass();
                    return new InquirySessionConfig(GpsCollectionRequirement.CREATOR.createFromParcel(parcel), GpsPrecisionRequirement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                default:
                    parcel.getClass();
                    return new NavigationState(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new PoseConfigs[i];
                case 1:
                    return new Selfie.SelfieImage[i];
                case 2:
                    return new Selfie.SelfieVideo[i];
                case 3:
                    return new SelfieState.Capture[i];
                case 4:
                    return new SelfieState.CaptureTransition[i];
                case 5:
                    return new SelfieState.CountdownToCapture[i];
                case 6:
                    return new SelfieState.CountdownToManualCapture[i];
                case 7:
                    return new SelfieState.FinalizeLocalVideoCapture[i];
                case 8:
                    return new SelfieState.FinalizeWebRtc[i];
                case 9:
                    return new SelfieState.RestartCamera[i];
                case 10:
                    return new SelfieState.ReviewCaptures[i];
                case 11:
                    return new SelfieState.ShowInstructions[i];
                case 12:
                    return new SelfieState.ShowPoseHint[i];
                case 13:
                    return new SelfieState.StartCapture[i];
                case 14:
                    return new SelfieState.StartCaptureFaceDetected[i];
                case 15:
                    return new SelfieState.Submit[i];
                case 16:
                    return new SelfieState.WaitForCameraFeed[i];
                case 17:
                    return new SelfieState.WaitForWebRtcSetup[i];
                case 18:
                    return new SelfieState.WebRtcFinished[i];
                case 19:
                    return new SelfieType.CenterOnly[i];
                case 20:
                    return new SelfieType.ConfigurablePoses[i];
                case 21:
                    return new SelfieType.ThreePhotos[i];
                case 22:
                    return new SelfieWorkflow.Input.Strings[i];
                case 23:
                    return new SelfieStepData[i];
                case 24:
                    return new SelfieStepFragment.SelfieStepFragmentArgs[i];
                case 25:
                    return new InquiryTheme[i];
                case 26:
                    return new GpsCollectionRequirement[i];
                case 27:
                    return new GpsPrecisionRequirement[i];
                case 28:
                    return new InquirySessionConfig[i];
                default:
                    return new NavigationState[i];
            }
        }
    }

    public PoseConfigs(LinkedHashMap linkedHashMap) {
        this.poseConfigs = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoseConfigs) && this.poseConfigs.equals(((PoseConfigs) obj).poseConfigs);
    }

    public final int hashCode() {
        return this.poseConfigs.hashCode();
    }

    public final String toString() {
        return "PoseConfigs(poseConfigs=" + this.poseConfigs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        LinkedHashMap linkedHashMap = this.poseConfigs;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString(((Selfie.Pose) entry.getKey()).name());
            ((PoseConfig) entry.getValue()).writeToParcel(parcel, i);
        }
    }
}
