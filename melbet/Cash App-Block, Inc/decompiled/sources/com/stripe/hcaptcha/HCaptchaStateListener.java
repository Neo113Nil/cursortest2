package com.stripe.hcaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.transaction.ChallengeParameters;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor$Config;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;
import com.stripe.android.stripe3ds2.transaction.InitChallengeResult;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$Factory;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.stripe.android.stripe3ds2.transactions.UiType;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.document.CaptureMethod;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.document.DocumentStartPage;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.UploadOptionsDialog;
import java.io.Serializable;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class HCaptchaStateListener implements Parcelable {
    public static final Parcelable.Creator<HCaptchaStateListener> CREATOR = new Creator(0);
    public final Function1 onFailure;
    public final Function0 onOpen;
    public final Function1 onSuccess;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new HCaptchaStateListener((Function0) parcel.readSerializable(), (Function1) parcel.readSerializable(), (Function1) parcel.readSerializable());
                case 1:
                    parcel.getClass();
                    return new ChallengeRequestResult.Timeout(ErrorData.CREATOR.createFromParcel(parcel));
                case 2:
                    parcel.getClass();
                    return new ChallengeResult.Canceled(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
                case 3:
                    parcel.getClass();
                    return new ChallengeResult.Failed(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
                case 4:
                    parcel.getClass();
                    return new ChallengeResult.ProtocolError(ErrorData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
                case 5:
                    parcel.getClass();
                    return new ChallengeResult.RuntimeError((Throwable) parcel.readSerializable(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
                case 6:
                    parcel.getClass();
                    return new ChallengeResult.Succeeded(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
                case 7:
                    parcel.getClass();
                    return new ChallengeResult.Timeout(parcel.readString(), parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString()), IntentData.CREATOR.createFromParcel(parcel));
                case 8:
                    parcel.getClass();
                    return new InitChallengeArgs(parcel.readString(), (KeyPair) parcel.readSerializable(), ChallengeParameters.CREATOR.createFromParcel(parcel), parcel.readInt(), IntentData.CREATOR.createFromParcel(parcel));
                case 9:
                    parcel.getClass();
                    return new InitChallengeResult.End((ChallengeResult) parcel.readParcelable(InitChallengeResult.End.class.getClassLoader()));
                case 10:
                    parcel.getClass();
                    return new InitChallengeResult.Start(ChallengeViewArgs.CREATOR.createFromParcel(parcel));
                case 11:
                    parcel.getClass();
                    return new IntentData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 12:
                    parcel.getClass();
                    return new SdkTransactionId(parcel.readString());
                case 13:
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    SdkTransactionId createFromParcel = SdkTransactionId.CREATOR.createFromParcel(parcel);
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    ChallengeRequestData.CancelReason valueOf = parcel.readInt() == 0 ? null : ChallengeRequestData.CancelReason.valueOf(parcel.readString());
                    String readString6 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int readInt = parcel.readInt();
                        ArrayList arrayList4 = new ArrayList(readInt);
                        int i = 0;
                        while (i != readInt) {
                            i = CameraState$Type$EnumUnboxingLocalUtility.m(MessageExtension.CREATOR, parcel, arrayList4, i, 1);
                        }
                        arrayList = arrayList4;
                    }
                    return new ChallengeRequestData(readString, readString2, readString3, createFromParcel, readString4, readString5, valueOf, readString6, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
                case 14:
                    parcel.getClass();
                    return new ChallengeResponseData.ChallengeSelectOption(parcel.readString(), parcel.readString());
                case 15:
                    parcel.getClass();
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    UiType valueOf2 = parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString());
                    boolean z = parcel.readInt() != 0;
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    boolean z2 = parcel.readInt() != 0;
                    if (parcel.readInt() == 0) {
                        arrayList2 = null;
                    } else {
                        int readInt2 = parcel.readInt();
                        arrayList2 = new ArrayList(readInt2);
                        int i2 = 0;
                        while (i2 != readInt2) {
                            i2 = CameraState$Type$EnumUnboxingLocalUtility.m(ChallengeResponseData.ChallengeSelectOption.CREATOR, parcel, arrayList2, i2, 1);
                            readInt2 = readInt2;
                        }
                    }
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    ChallengeResponseData.Image createFromParcel2 = parcel.readInt() == 0 ? null : ChallengeResponseData.Image.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        arrayList3 = null;
                    } else {
                        int readInt3 = parcel.readInt();
                        ArrayList arrayList5 = new ArrayList(readInt3);
                        int i3 = 0;
                        while (i3 != readInt3) {
                            i3 = CameraState$Type$EnumUnboxingLocalUtility.m(MessageExtension.CREATOR, parcel, arrayList5, i3, 1);
                            readInt3 = readInt3;
                            arrayList2 = arrayList2;
                        }
                        arrayList3 = arrayList5;
                    }
                    return new ChallengeResponseData(readString7, readString8, readString9, readString10, valueOf2, z, readString11, readString12, readString13, readString14, z2, arrayList2, readString15, readString16, createFromParcel2, arrayList3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ChallengeResponseData.Image.CREATOR.createFromParcel(parcel), parcel.readString(), SdkTransactionId.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 16:
                    parcel.getClass();
                    return new ChallengeResponseData.Image(parcel.readString(), parcel.readString(), parcel.readString());
                case 17:
                    parcel.getClass();
                    return new ErrorData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ErrorData.ErrorComponent.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SdkTransactionId.CREATOR.createFromParcel(parcel));
                case 18:
                    parcel.getClass();
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    boolean z3 = parcel.readInt() != 0;
                    int readInt4 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(readInt4);
                    for (int i4 = 0; i4 != readInt4; i4++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                    return new MessageExtension(readString17, readString18, z3, linkedHashMap);
                case 19:
                    parcel.getClass();
                    return new ChallengeViewArgs(ChallengeResponseData.CREATOR.createFromParcel(parcel), ChallengeRequestData.CREATOR.createFromParcel(parcel), (StripeUiCustomization) parcel.readParcelable(ChallengeViewArgs.class.getClassLoader()), ChallengeRequestExecutor$Config.CREATOR.createFromParcel(parcel), (StripeChallengeRequestExecutor$Factory) parcel.readSerializable(), parcel.readInt(), IntentData.CREATOR.createFromParcel(parcel));
                case 20:
                    parcel.getClass();
                    int readInt5 = parcel.readInt();
                    Float[] fArr = new Float[readInt5];
                    for (int i5 = 0; i5 != readInt5; i5++) {
                        fArr[i5] = Float.valueOf(parcel.readFloat());
                    }
                    return new SelfieBrightnessInfo(fArr);
                case 21:
                    parcel.getClass();
                    return CaptureMethod.valueOf(parcel.readString());
                case 22:
                    parcel.getClass();
                    return new DocumentFile.Local(parcel.readString(), CaptureMethod.CREATOR.createFromParcel(parcel), parcel.readInt());
                case 23:
                    parcel.getClass();
                    return new DocumentFile.Remote(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 24:
                    parcel.getClass();
                    return new DocumentPages(DocumentStartPage.CREATOR.createFromParcel(parcel), UploadOptionsDialog.CREATOR.createFromParcel(parcel));
                case 25:
                    parcel.getClass();
                    parcel.readInt();
                    return DocumentWorkflow.StartPage.Prompt.INSTANCE;
                case 26:
                    parcel.getClass();
                    return new DocumentWorkflow.StartPage.Review(parcel.readString());
                case 27:
                    parcel.getClass();
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt6);
                    int i6 = 0;
                    while (i6 != readInt6) {
                        i6 = CameraState$Type$EnumUnboxingLocalUtility.m(DocumentWorkflow.State.ReviewCaptures.class, parcel, arrayList6, i6, 1);
                    }
                    return new DocumentWorkflow.State.ReviewCaptures(arrayList6, parcel.readString(), DocumentWorkflow.State.CaptureState.valueOf(parcel.readString()), (DocumentWorkflow.State.UploadState) parcel.readParcelable(DocumentWorkflow.State.ReviewCaptures.class.getClassLoader()), (DocumentFile) parcel.readParcelable(DocumentWorkflow.State.ReviewCaptures.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
                case 28:
                    parcel.getClass();
                    int readInt7 = parcel.readInt();
                    ArrayList arrayList7 = new ArrayList(readInt7);
                    int i7 = 0;
                    while (i7 != readInt7) {
                        i7 = CameraState$Type$EnumUnboxingLocalUtility.m(DocumentWorkflow.State.ReviewCapturesWithoutDocumentId.class, parcel, arrayList7, i7, 1);
                    }
                    return new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(arrayList7, parcel.readString(), DocumentWorkflow.State.CaptureState.valueOf(parcel.readString()), (DocumentWorkflow.State.UploadState) parcel.readParcelable(DocumentWorkflow.State.ReviewCapturesWithoutDocumentId.class.getClassLoader()), (DocumentFile) parcel.readParcelable(DocumentWorkflow.State.ReviewCapturesWithoutDocumentId.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
                default:
                    parcel.getClass();
                    return new DocumentWorkflow.State.Start(DocumentWorkflow.State.CaptureState.valueOf(parcel.readString()), (DocumentWorkflow.State.UploadState) parcel.readParcelable(DocumentWorkflow.State.Start.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new HCaptchaStateListener[i];
                case 1:
                    return new ChallengeRequestResult.Timeout[i];
                case 2:
                    return new ChallengeResult.Canceled[i];
                case 3:
                    return new ChallengeResult.Failed[i];
                case 4:
                    return new ChallengeResult.ProtocolError[i];
                case 5:
                    return new ChallengeResult.RuntimeError[i];
                case 6:
                    return new ChallengeResult.Succeeded[i];
                case 7:
                    return new ChallengeResult.Timeout[i];
                case 8:
                    return new InitChallengeArgs[i];
                case 9:
                    return new InitChallengeResult.End[i];
                case 10:
                    return new InitChallengeResult.Start[i];
                case 11:
                    return new IntentData[i];
                case 12:
                    return new SdkTransactionId[i];
                case 13:
                    return new ChallengeRequestData[i];
                case 14:
                    return new ChallengeResponseData.ChallengeSelectOption[i];
                case 15:
                    return new ChallengeResponseData[i];
                case 16:
                    return new ChallengeResponseData.Image[i];
                case 17:
                    return new ErrorData[i];
                case 18:
                    return new MessageExtension[i];
                case 19:
                    return new ChallengeViewArgs[i];
                case 20:
                    return new SelfieBrightnessInfo[i];
                case 21:
                    return new CaptureMethod[i];
                case 22:
                    return new DocumentFile.Local[i];
                case 23:
                    return new DocumentFile.Remote[i];
                case 24:
                    return new DocumentPages[i];
                case 25:
                    return new DocumentWorkflow.StartPage.Prompt[i];
                case 26:
                    return new DocumentWorkflow.StartPage.Review[i];
                case 27:
                    return new DocumentWorkflow.State.ReviewCaptures[i];
                case 28:
                    return new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId[i];
                default:
                    return new DocumentWorkflow.State.Start[i];
            }
        }
    }

    public HCaptchaStateListener(Function0 function0, Function1 function1, Function1 function12) {
        function0.getClass();
        function1.getClass();
        function12.getClass();
        this.onOpen = function0;
        this.onSuccess = function1;
        this.onFailure = function12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HCaptchaStateListener)) {
            return false;
        }
        HCaptchaStateListener hCaptchaStateListener = (HCaptchaStateListener) obj;
        return Intrinsics.areEqual(this.onOpen, hCaptchaStateListener.onOpen) && Intrinsics.areEqual(this.onSuccess, hCaptchaStateListener.onSuccess) && Intrinsics.areEqual(this.onFailure, hCaptchaStateListener.onFailure);
    }

    public final int hashCode() {
        return this.onFailure.hashCode() + Recorder$$ExternalSyntheticOutline1.m(this.onOpen.hashCode() * 31, 31, this.onSuccess);
    }

    public final String toString() {
        return "HCaptchaStateListener(onOpen=" + this.onOpen + ", onSuccess=" + this.onSuccess + ", onFailure=" + this.onFailure + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable((Serializable) this.onOpen);
        parcel.writeSerializable((Serializable) this.onSuccess);
        parcel.writeSerializable((Serializable) this.onFailure);
    }
}
