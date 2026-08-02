package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.camera.AutoCaptureRuleSet;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.network.DocumentStepData;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class Frame implements Parcelable {
    public static final Parcelable.Creator<Frame> CREATOR = new Creator(0);
    public final String absoluteFilePath;
    public final String mimeType;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String str;
            OverridableText overridableText;
            ArrayList arrayList;
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new Frame(parcel.readString(), parcel.readString());
                case 1:
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(DocumentWorkflow.State.UploadDocument.class, parcel, arrayList2, i2, 1);
                    }
                    return new DocumentWorkflow.State.UploadDocument(arrayList2, parcel.readString(), (DocumentWorkflow.State.UploadState) parcel.readParcelable(DocumentWorkflow.State.UploadDocument.class.getClassLoader()), parcel.readString());
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return DocumentWorkflow.State.UploadState.CreateDocument.INSTANCE;
                case 3:
                    parcel.getClass();
                    return new DocumentWorkflow.State.UploadState.DeleteFiles(parcel.readString());
                case 4:
                    parcel.getClass();
                    return new DocumentWorkflow.State.UploadState.ReadyToSubmit(parcel.readString());
                case 5:
                    parcel.getClass();
                    return new DocumentWorkflow.State.UploadState.UploadFiles(parcel.readString());
                case 6:
                    parcel.getClass();
                    String readString = parcel.readString();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    int i3 = 0;
                    while (i3 != readInt2) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(DocumentStepData.class, parcel, arrayList3, i3, 1);
                    }
                    return new DocumentStepData(readString, arrayList3);
                case 7:
                    parcel.getClass();
                    return new DocumentStepFragment.DocumentStepFragmentArgs(DocumentWorkflow.Input.CREATOR.createFromParcel(parcel));
                case 8:
                    parcel.getClass();
                    return new CaptureConfig.AutoClassifyConfig(AutoClassificationConfig.CREATOR.createFromParcel(parcel));
                case 9:
                    parcel.getClass();
                    return new CaptureConfig.IdCaptureConfig(IdConfig.CREATOR.createFromParcel(parcel));
                case 10:
                    parcel.getClass();
                    return new EnabledIdClass(IdIcon.valueOf(parcel.readString()), IdConfig.CREATOR.createFromParcel(parcel), parcel.readString());
                case 11:
                    parcel.getClass();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt3);
                    int i4 = 0;
                    while (i4 != readInt3) {
                        i4 = CameraState$Type$EnumUnboxingLocalUtility.m(Frame.CREATOR, parcel, arrayList4, i4, 1);
                    }
                    return new GovernmentId.GovernmentIdImage(arrayList4, GovernmentId.Side.valueOf(parcel.readString()), parcel.readString(), GovernmentId.CaptureMethod.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RawExtraction.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdDetails.CREATOR.createFromParcel(parcel));
                case 12:
                    parcel.getClass();
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt4);
                    int i5 = 0;
                    while (i5 != readInt4) {
                        i5 = CameraState$Type$EnumUnboxingLocalUtility.m(Frame.CREATOR, parcel, arrayList5, i5, 1);
                    }
                    return new GovernmentId.GovernmentIdVideo(arrayList5, GovernmentId.Side.valueOf(parcel.readString()), parcel.readString(), GovernmentId.CaptureMethod.valueOf(parcel.readString()));
                case 13:
                    parcel.getClass();
                    return new GovernmentIdDetails((Date) parcel.readSerializable(), (Date) parcel.readSerializable());
                case 14:
                    parcel.getClass();
                    IdPart$SideIdPart createFromParcel = IdPart$SideIdPart.CREATOR.createFromParcel(parcel);
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt5);
                    int i6 = 0;
                    while (i6 != readInt5) {
                        i6 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.AutoClassificationError.class, parcel, arrayList6, i6, 1);
                    }
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList7 = new ArrayList(readInt6);
                    int i7 = 0;
                    while (i7 != readInt6) {
                        i7 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.AutoClassificationError.class, parcel, arrayList7, i7, 1);
                    }
                    int readInt7 = parcel.readInt();
                    GovernmentIdState governmentIdState = (GovernmentIdState) parcel.readParcelable(GovernmentIdState.AutoClassificationError.class.getClassLoader());
                    String readString2 = parcel.readString();
                    int readInt8 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(readInt8);
                    int i8 = 0;
                    while (i8 != readInt8) {
                        i8 = CameraState$Type$EnumUnboxingLocalUtility.m(Frame.CREATOR, parcel, arrayList8, i8, 1);
                    }
                    CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(GovernmentIdState.AutoClassificationError.class.getClassLoader());
                    int readInt9 = parcel.readInt();
                    ArrayList arrayList9 = new ArrayList(readInt9);
                    int i9 = 0;
                    while (i9 != readInt9) {
                        i9 = CameraState$Type$EnumUnboxingLocalUtility.m(IdConfigForCountry.CREATOR, parcel, arrayList9, i9, 1);
                    }
                    return new GovernmentIdState.AutoClassificationError(createFromParcel, arrayList6, arrayList7, readInt7, governmentIdState, readString2, arrayList8, cameraProperties, arrayList9, parcel.readString(), parcel.readString(), AutoClassificationErrorType.valueOf(parcel.readString()));
                case 15:
                    parcel.getClass();
                    IdPart$SideIdPart createFromParcel2 = IdPart$SideIdPart.CREATOR.createFromParcel(parcel);
                    int readInt10 = parcel.readInt();
                    ArrayList arrayList10 = new ArrayList(readInt10);
                    int i10 = 0;
                    while (i10 != readInt10) {
                        i10 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.AutoClassificationManualSelect.class, parcel, arrayList10, i10, 1);
                    }
                    int readInt11 = parcel.readInt();
                    ArrayList arrayList11 = new ArrayList(readInt11);
                    int i11 = 0;
                    while (i11 != readInt11) {
                        i11 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.AutoClassificationManualSelect.class, parcel, arrayList11, i11, 1);
                    }
                    int readInt12 = parcel.readInt();
                    GovernmentIdState governmentIdState2 = (GovernmentIdState) parcel.readParcelable(GovernmentIdState.AutoClassificationManualSelect.class.getClassLoader());
                    String readString3 = parcel.readString();
                    int readInt13 = parcel.readInt();
                    ArrayList arrayList12 = new ArrayList(readInt13);
                    int i12 = 0;
                    while (i12 != readInt13) {
                        i12 = CameraState$Type$EnumUnboxingLocalUtility.m(Frame.CREATOR, parcel, arrayList12, i12, 1);
                    }
                    CameraProperties cameraProperties2 = (CameraProperties) parcel.readParcelable(GovernmentIdState.AutoClassificationManualSelect.class.getClassLoader());
                    int readInt14 = parcel.readInt();
                    ArrayList arrayList13 = new ArrayList(readInt14);
                    int i13 = 0;
                    while (i13 != readInt14) {
                        i13 = CameraState$Type$EnumUnboxingLocalUtility.m(IdConfigForCountry.CREATOR, parcel, arrayList13, i13, 1);
                    }
                    return new GovernmentIdState.AutoClassificationManualSelect(createFromParcel2, arrayList10, arrayList11, readInt12, governmentIdState2, readString3, arrayList12, cameraProperties2, arrayList13, parcel.readString(), parcel.readString());
                case 16:
                    parcel.getClass();
                    IdPart$SideIdPart createFromParcel3 = IdPart$SideIdPart.CREATOR.createFromParcel(parcel);
                    int readInt15 = parcel.readInt();
                    ArrayList arrayList14 = new ArrayList(readInt15);
                    int i14 = 0;
                    while (i14 != readInt15) {
                        i14 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.ChooseCaptureMethod.class, parcel, arrayList14, i14, 1);
                    }
                    int readInt16 = parcel.readInt();
                    ArrayList arrayList15 = new ArrayList(readInt16);
                    int i15 = 0;
                    while (i15 != readInt16) {
                        i15 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.ChooseCaptureMethod.class, parcel, arrayList15, i15, 1);
                    }
                    return new GovernmentIdState.ChooseCaptureMethod(createFromParcel3, arrayList14, arrayList15, parcel.readInt(), parcel.readString(), (CaptureConfig) parcel.readParcelable(GovernmentIdState.ChooseCaptureMethod.class.getClassLoader()), parcel.readInt() != 0, (GovernmentIdState) parcel.readParcelable(GovernmentIdState.ChooseCaptureMethod.class.getClassLoader()), parcel.readString());
                case 17:
                    parcel.getClass();
                    IdPart$SideIdPart createFromParcel4 = IdPart$SideIdPart.CREATOR.createFromParcel(parcel);
                    int readInt17 = parcel.readInt();
                    ArrayList arrayList16 = new ArrayList(readInt17);
                    int i16 = 0;
                    while (i16 != readInt17) {
                        i16 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.CountdownToCapture.class, parcel, arrayList16, i16, 1);
                    }
                    CaptureConfig captureConfig = (CaptureConfig) parcel.readParcelable(GovernmentIdState.CountdownToCapture.class.getClassLoader());
                    GovernmentId.GovernmentIdImage createFromParcel5 = GovernmentId.GovernmentIdImage.CREATOR.createFromParcel(parcel);
                    int readInt18 = parcel.readInt();
                    ArrayList arrayList17 = new ArrayList(readInt18);
                    int i17 = 0;
                    while (i17 != readInt18) {
                        i17 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.CountdownToCapture.class, parcel, arrayList17, i17, 1);
                    }
                    return new GovernmentIdState.CountdownToCapture(createFromParcel4, arrayList16, captureConfig, createFromParcel5, arrayList17, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(GovernmentIdState.CountdownToCapture.class.getClassLoader()), parcel.readString(), (Hint) parcel.readParcelable(GovernmentIdState.CountdownToCapture.class.getClassLoader()));
                case 18:
                    parcel.getClass();
                    IdConfig createFromParcel6 = IdConfig.CREATOR.createFromParcel(parcel);
                    int readInt19 = parcel.readInt();
                    ArrayList arrayList18 = new ArrayList(readInt19);
                    int i18 = 0;
                    while (i18 != readInt19) {
                        i18 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.FinalizeLocalVideoCapture.class, parcel, arrayList18, i18, 1);
                    }
                    IdPart$SideIdPart idPart$SideIdPart = (IdPart$SideIdPart) parcel.readParcelable(GovernmentIdState.FinalizeLocalVideoCapture.class.getClassLoader());
                    int readInt20 = parcel.readInt();
                    ArrayList arrayList19 = new ArrayList(readInt20);
                    int i19 = 0;
                    while (i19 != readInt20) {
                        i19 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.FinalizeLocalVideoCapture.class, parcel, arrayList19, i19, 1);
                    }
                    return new GovernmentIdState.FinalizeLocalVideoCapture(createFromParcel6, arrayList18, idPart$SideIdPart, arrayList19, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(GovernmentIdState.FinalizeLocalVideoCapture.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GovernmentIdRequestArguments.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0);
                case 19:
                    IdPart$SideIdPart idPart$SideIdPart2 = (IdPart$SideIdPart) NavAction$$ExternalSyntheticOutline0.m(parcel, GovernmentIdState.FinalizeWebRtc.class);
                    int readInt21 = parcel.readInt();
                    ArrayList arrayList20 = new ArrayList(readInt21);
                    int i20 = 0;
                    while (i20 != readInt21) {
                        i20 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.FinalizeWebRtc.class, parcel, arrayList20, i20, 1);
                    }
                    int readInt22 = parcel.readInt();
                    ArrayList arrayList21 = new ArrayList(readInt22);
                    int i21 = 0;
                    while (i21 != readInt22) {
                        i21 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.FinalizeWebRtc.class, parcel, arrayList21, i21, 1);
                    }
                    return new GovernmentIdState.FinalizeWebRtc(idPart$SideIdPart2, arrayList20, arrayList21, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(GovernmentIdState.FinalizeWebRtc.class.getClassLoader()), parcel.readString(), IdConfig.CREATOR.createFromParcel(parcel), (CameraProperties) parcel.readParcelable(GovernmentIdState.FinalizeWebRtc.class.getClassLoader()));
                case 20:
                    parcel.getClass();
                    IdPart$SideIdPart createFromParcel7 = IdPart$SideIdPart.CREATOR.createFromParcel(parcel);
                    int readInt23 = parcel.readInt();
                    ArrayList arrayList22 = new ArrayList(readInt23);
                    int i22 = 0;
                    while (i22 != readInt23) {
                        i22 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.HolographicTorchDelay.class, parcel, arrayList22, i22, 1);
                    }
                    int readInt24 = parcel.readInt();
                    ArrayList arrayList23 = new ArrayList(readInt24);
                    int i23 = 0;
                    while (i23 != readInt24) {
                        i23 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.HolographicTorchDelay.class, parcel, arrayList23, i23, 1);
                    }
                    return new GovernmentIdState.HolographicTorchDelay(createFromParcel7, arrayList22, arrayList23, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(GovernmentIdState.HolographicTorchDelay.class.getClassLoader()), parcel.readString(), IdConfig.CREATOR.createFromParcel(parcel), (GovernmentId) parcel.readParcelable(GovernmentIdState.HolographicTorchDelay.class.getClassLoader()), (CameraProperties) parcel.readParcelable(GovernmentIdState.HolographicTorchDelay.class.getClassLoader()), parcel.readInt());
                case 21:
                    parcel.getClass();
                    IdPart$SideIdPart createFromParcel8 = IdPart$SideIdPart.CREATOR.createFromParcel(parcel);
                    int readInt25 = parcel.readInt();
                    ArrayList arrayList24 = new ArrayList(readInt25);
                    int i24 = 0;
                    while (i24 != readInt25) {
                        i24 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.ReviewCapturedImage.class, parcel, arrayList24, i24, 1);
                    }
                    CaptureConfig captureConfig2 = (CaptureConfig) parcel.readParcelable(GovernmentIdState.ReviewCapturedImage.class.getClassLoader());
                    GovernmentId governmentId = (GovernmentId) parcel.readParcelable(GovernmentIdState.ReviewCapturedImage.class.getClassLoader());
                    int readInt26 = parcel.readInt();
                    ArrayList arrayList25 = new ArrayList(readInt26);
                    int i25 = 0;
                    while (i25 != readInt26) {
                        i25 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.ReviewCapturedImage.class, parcel, arrayList25, i25, 1);
                    }
                    return new GovernmentIdState.ReviewCapturedImage(createFromParcel8, arrayList24, captureConfig2, governmentId, arrayList25, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(GovernmentIdState.ReviewCapturedImage.class.getClassLoader()), (CameraProperties) parcel.readParcelable(GovernmentIdState.ReviewCapturedImage.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
                case 22:
                    parcel.getClass();
                    IdPart$SideIdPart createFromParcel9 = IdPart$SideIdPart.CREATOR.createFromParcel(parcel);
                    int readInt27 = parcel.readInt();
                    ArrayList arrayList26 = new ArrayList(readInt27);
                    int i26 = 0;
                    while (i26 != readInt27) {
                        i26 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.ReviewSelectedImage.class, parcel, arrayList26, i26, 1);
                    }
                    CaptureConfig captureConfig3 = (CaptureConfig) parcel.readParcelable(GovernmentIdState.ReviewSelectedImage.class.getClassLoader());
                    GovernmentId governmentId2 = (GovernmentId) parcel.readParcelable(GovernmentIdState.ReviewSelectedImage.class.getClassLoader());
                    String readString4 = parcel.readString();
                    int readInt28 = parcel.readInt();
                    ArrayList arrayList27 = new ArrayList(readInt28);
                    int i27 = 0;
                    while (i27 != readInt28) {
                        i27 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.ReviewSelectedImage.class, parcel, arrayList27, i27, 1);
                    }
                    return new GovernmentIdState.ReviewSelectedImage(createFromParcel9, arrayList26, captureConfig3, governmentId2, readString4, arrayList27, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(GovernmentIdState.ReviewSelectedImage.class.getClassLoader()), (CameraProperties) parcel.readParcelable(GovernmentIdState.ReviewSelectedImage.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
                case 23:
                    IdPart$SideIdPart idPart$SideIdPart3 = (IdPart$SideIdPart) NavAction$$ExternalSyntheticOutline0.m(parcel, GovernmentIdState.ShowInstructions.class);
                    int readInt29 = parcel.readInt();
                    ArrayList arrayList28 = new ArrayList(readInt29);
                    int i28 = 0;
                    while (i28 != readInt29) {
                        i28 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.ShowInstructions.class, parcel, arrayList28, i28, 1);
                    }
                    int readInt30 = parcel.readInt();
                    ArrayList arrayList29 = new ArrayList(readInt30);
                    int i29 = 0;
                    while (i29 != readInt30) {
                        i29 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.ShowInstructions.class, parcel, arrayList29, i29, 1);
                    }
                    return new GovernmentIdState.ShowInstructions(idPart$SideIdPart3, arrayList28, arrayList29, (GovernmentIdState) parcel.readParcelable(GovernmentIdState.ShowInstructions.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : IdConfig.CREATOR.createFromParcel(parcel), parcel.readString());
                case 24:
                    parcel.getClass();
                    IdConfig createFromParcel10 = IdConfig.CREATOR.createFromParcel(parcel);
                    int readInt31 = parcel.readInt();
                    ArrayList arrayList30 = new ArrayList(readInt31);
                    int i30 = 0;
                    while (i30 != readInt31) {
                        i30 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.Submit.class, parcel, arrayList30, i30, 1);
                    }
                    IdPart$SideIdPart idPart$SideIdPart4 = (IdPart$SideIdPart) parcel.readParcelable(GovernmentIdState.Submit.class.getClassLoader());
                    int readInt32 = parcel.readInt();
                    ArrayList arrayList31 = new ArrayList(readInt32);
                    int i31 = 0;
                    while (i31 != readInt32) {
                        i31 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.Submit.class, parcel, arrayList31, i31, 1);
                    }
                    return new GovernmentIdState.Submit(createFromParcel10, arrayList30, idPart$SideIdPart4, arrayList31, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(GovernmentIdState.Submit.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GovernmentIdRequestArguments.CREATOR.createFromParcel(parcel), parcel.readString(), (CameraProperties) parcel.readParcelable(GovernmentIdState.Submit.class.getClassLoader()), parcel.readInt() != 0);
                case 25:
                    parcel.getClass();
                    IdPart$SideIdPart createFromParcel11 = IdPart$SideIdPart.CREATOR.createFromParcel(parcel);
                    int readInt33 = parcel.readInt();
                    ArrayList arrayList32 = new ArrayList(readInt33);
                    int i32 = 0;
                    while (i32 != readInt33) {
                        i32 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.WaitForAutocapture.class, parcel, arrayList32, i32, 1);
                    }
                    CaptureConfig captureConfig4 = (CaptureConfig) parcel.readParcelable(GovernmentIdState.WaitForAutocapture.class.getClassLoader());
                    Screen.CameraScreen.ManualCapture valueOf = Screen.CameraScreen.ManualCapture.valueOf(parcel.readString());
                    int readInt34 = parcel.readInt();
                    ArrayList arrayList33 = new ArrayList(readInt34);
                    int i33 = 0;
                    while (i33 != readInt34) {
                        i33 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdState.WaitForAutocapture.class, parcel, arrayList33, i33, 1);
                    }
                    return new GovernmentIdState.WaitForAutocapture(createFromParcel11, arrayList32, captureConfig4, valueOf, arrayList33, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(GovernmentIdState.WaitForAutocapture.class.getClassLoader()), parcel.readInt() == 0 ? null : WebRtcState.valueOf(parcel.readString()), parcel.readString(), (Throwable) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (Hint) parcel.readParcelable(GovernmentIdState.WaitForAutocapture.class.getClassLoader()), null, 16384);
                case 26:
                    parcel.getClass();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    Parcelable.Creator<OverridableText> creator = OverridableText.CREATOR;
                    OverridableText createFromParcel12 = creator.createFromParcel(parcel);
                    OverridableText createFromParcel13 = creator.createFromParcel(parcel);
                    String readString9 = parcel.readString();
                    OverridableText createFromParcel14 = creator.createFromParcel(parcel);
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    OverridableText createFromParcel15 = creator.createFromParcel(parcel);
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    int readInt35 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(readInt35);
                    int i34 = 0;
                    while (i34 != readInt35) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                        i34++;
                        readInt35 = readInt35;
                        readString5 = readString5;
                    }
                    String str2 = readString5;
                    Parcelable.Creator<OverridableText> creator2 = OverridableText.CREATOR;
                    OverridableText createFromParcel16 = creator2.createFromParcel(parcel);
                    OverridableText createFromParcel17 = creator2.createFromParcel(parcel);
                    String readString15 = parcel.readString();
                    String str3 = str2;
                    String readString16 = parcel.readString();
                    int readInt36 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt36);
                    int i35 = 0;
                    while (i35 != readInt36) {
                        linkedHashMap2.put(IdConfig.Side.valueOf(parcel.readString()), parcel.readString());
                        i35++;
                        str3 = str3;
                    }
                    String str4 = str3;
                    int readInt37 = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt37);
                    int i36 = 0;
                    while (i36 != readInt37) {
                        linkedHashMap3.put(IdConfig.Side.valueOf(parcel.readString()), parcel.readString());
                        i36++;
                        readInt37 = readInt37;
                        linkedHashMap2 = linkedHashMap2;
                    }
                    LinkedHashMap linkedHashMap4 = linkedHashMap2;
                    String readString17 = parcel.readString();
                    String str5 = str4;
                    String readString18 = parcel.readString();
                    String readString19 = parcel.readString();
                    String readString20 = parcel.readString();
                    String readString21 = parcel.readString();
                    String readString22 = parcel.readString();
                    String readString23 = parcel.readString();
                    String readString24 = parcel.readString();
                    String readString25 = parcel.readString();
                    String readString26 = parcel.readString();
                    String readString27 = parcel.readString();
                    String readString28 = parcel.readString();
                    String readString29 = parcel.readString();
                    String readString30 = parcel.readString();
                    String readString31 = parcel.readString();
                    String readString32 = parcel.readString();
                    String readString33 = parcel.readString();
                    String readString34 = parcel.readString();
                    String readString35 = parcel.readString();
                    String readString36 = parcel.readString();
                    String readString37 = parcel.readString();
                    String readString38 = parcel.readString();
                    String readString39 = parcel.readString();
                    String readString40 = parcel.readString();
                    String readString41 = parcel.readString();
                    String readString42 = parcel.readString();
                    String readString43 = parcel.readString();
                    String readString44 = parcel.readString();
                    String readString45 = parcel.readString();
                    String readString46 = parcel.readString();
                    String readString47 = parcel.readString();
                    String readString48 = parcel.readString();
                    String readString49 = parcel.readString();
                    String readString50 = parcel.readString();
                    String readString51 = parcel.readString();
                    String readString52 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        str = readString17;
                        overridableText = createFromParcel17;
                        arrayList = null;
                    } else {
                        int readInt38 = parcel.readInt();
                        str = readString17;
                        ArrayList arrayList34 = new ArrayList(readInt38);
                        overridableText = createFromParcel17;
                        int i37 = 0;
                        while (i37 != readInt38) {
                            i37 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdWorkflow.Input.Strings.class, parcel, arrayList34, i37, 1);
                            str5 = str5;
                            readInt38 = readInt38;
                        }
                        arrayList = arrayList34;
                    }
                    return new GovernmentIdWorkflow.Input.Strings(str5, readString6, readString7, readString8, createFromParcel12, createFromParcel13, readString9, createFromParcel14, readString10, readString11, readString12, createFromParcel15, readString13, readString14, linkedHashMap, createFromParcel16, overridableText, readString15, readString16, linkedHashMap4, linkedHashMap3, str, readString18, readString19, readString20, readString21, readString22, readString23, readString24, readString25, readString26, readString27, readString28, readString29, readString30, readString31, readString32, readString33, readString34, readString35, readString36, readString37, readString38, readString39, readString40, readString41, readString42, readString43, readString44, readString45, readString46, readString47, readString48, readString49, readString50, readString51, readString52, arrayList);
                case 27:
                    parcel.getClass();
                    return new IdConfig.AutoCaptureConfig((AutoCaptureRuleSet) parcel.readParcelable(IdConfig.AutoCaptureConfig.class.getClassLoader()));
                case 28:
                    parcel.getClass();
                    String readString53 = parcel.readString();
                    IdIcon valueOf2 = IdIcon.valueOf(parcel.readString());
                    int readInt39 = parcel.readInt();
                    ArrayList arrayList35 = new ArrayList(readInt39);
                    int i38 = 0;
                    while (i38 != readInt39) {
                        i38 = CameraState$Type$EnumUnboxingLocalUtility.m(IdConfig.IdSideConfig.CREATOR, parcel, arrayList35, i38, 1);
                    }
                    int readInt40 = parcel.readInt();
                    ArrayList arrayList36 = new ArrayList(readInt40);
                    while (i != readInt40) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(IdConfig.class, parcel, arrayList36, i, 1);
                    }
                    return new IdConfig(readString53, valueOf2, arrayList35, arrayList36, IdClass.valueOf(parcel.readString()));
                default:
                    parcel.getClass();
                    return new IdConfig.IdSideConfig(parcel.readString(), IdConfig.Side.valueOf(parcel.readString()), (Screen.Overlay) parcel.readParcelable(IdConfig.IdSideConfig.class.getClassLoader()), IdConfig.AutoCaptureConfig.CREATOR.createFromParcel(parcel), IdConfig.ManualCaptureConfig.CREATOR.createFromParcel(parcel));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Frame[i];
                case 1:
                    return new DocumentWorkflow.State.UploadDocument[i];
                case 2:
                    return new DocumentWorkflow.State.UploadState.CreateDocument[i];
                case 3:
                    return new DocumentWorkflow.State.UploadState.DeleteFiles[i];
                case 4:
                    return new DocumentWorkflow.State.UploadState.ReadyToSubmit[i];
                case 5:
                    return new DocumentWorkflow.State.UploadState.UploadFiles[i];
                case 6:
                    return new DocumentStepData[i];
                case 7:
                    return new DocumentStepFragment.DocumentStepFragmentArgs[i];
                case 8:
                    return new CaptureConfig.AutoClassifyConfig[i];
                case 9:
                    return new CaptureConfig.IdCaptureConfig[i];
                case 10:
                    return new EnabledIdClass[i];
                case 11:
                    return new GovernmentId.GovernmentIdImage[i];
                case 12:
                    return new GovernmentId.GovernmentIdVideo[i];
                case 13:
                    return new GovernmentIdDetails[i];
                case 14:
                    return new GovernmentIdState.AutoClassificationError[i];
                case 15:
                    return new GovernmentIdState.AutoClassificationManualSelect[i];
                case 16:
                    return new GovernmentIdState.ChooseCaptureMethod[i];
                case 17:
                    return new GovernmentIdState.CountdownToCapture[i];
                case 18:
                    return new GovernmentIdState.FinalizeLocalVideoCapture[i];
                case 19:
                    return new GovernmentIdState.FinalizeWebRtc[i];
                case 20:
                    return new GovernmentIdState.HolographicTorchDelay[i];
                case 21:
                    return new GovernmentIdState.ReviewCapturedImage[i];
                case 22:
                    return new GovernmentIdState.ReviewSelectedImage[i];
                case 23:
                    return new GovernmentIdState.ShowInstructions[i];
                case 24:
                    return new GovernmentIdState.Submit[i];
                case 25:
                    return new GovernmentIdState.WaitForAutocapture[i];
                case 26:
                    return new GovernmentIdWorkflow.Input.Strings[i];
                case 27:
                    return new IdConfig.AutoCaptureConfig[i];
                case 28:
                    return new IdConfig[i];
                default:
                    return new IdConfig.IdSideConfig[i];
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Frame(String str) {
        this(str, (r0 == null || (r0 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(r0)) == null) ? "image/*" : r0);
        String mimeTypeFromExtension;
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) obj;
        return Intrinsics.areEqual(this.absoluteFilePath, frame.absoluteFilePath) && Intrinsics.areEqual(this.mimeType, frame.mimeType);
    }

    public final int hashCode() {
        return this.mimeType.hashCode() + (this.absoluteFilePath.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Frame(absoluteFilePath=", this.absoluteFilePath, ", mimeType=", this.mimeType, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.absoluteFilePath);
        parcel.writeString(this.mimeType);
    }

    public Frame(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.absoluteFilePath = str;
        this.mimeType = str2;
    }
}
