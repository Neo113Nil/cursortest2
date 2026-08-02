package com.withpersona.sdk2.inquiry.nfc;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.internal.Environment;
import com.withpersona.sdk2.inquiry.internal.InquiryFieldsMap;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.PollingMode;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$TransitionData;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class MrzKey implements Parcelable {
    public static final Parcelable.Creator<MrzKey> CREATOR = new Creator(0);
    public final Date dateOfBirth;
    public final Date expirationDate;
    public final String passportNumber;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2 = null;
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new MrzKey(parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
                case 1:
                    parcel.getClass();
                    return new IntegrationStepFragment.IntegrationStepFragmentArgs(IntegrationWorkflow.Input.CREATOR.createFromParcel(parcel));
                case 2:
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt);
                    while (i != readInt) {
                        linkedHashMap3.put(parcel.readString(), parcel.readParcelable(InquiryFieldsMap.class.getClassLoader()));
                        i++;
                    }
                    return new InquiryFieldsMap(linkedHashMap3);
                case 3:
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    TransitionStatus transitionStatus = (TransitionStatus) parcel.readParcelable(InquiryState.Complete.class.getClassLoader());
                    String readString3 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt2);
                    while (i != readInt2) {
                        linkedHashMap4.put(parcel.readString(), parcel.readParcelable(InquiryState.Complete.class.getClassLoader()));
                        i++;
                    }
                    return new InquiryState.Complete(readString, readString2, transitionStatus, readString3, linkedHashMap4, (InquirySessionConfig) parcel.readParcelable(InquiryState.Complete.class.getClassLoader()), parcel.readString());
                case 4:
                    parcel.getClass();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        int readInt3 = parcel.readInt();
                        linkedHashMap2 = new LinkedHashMap(readInt3);
                        while (i != readInt3) {
                            linkedHashMap2.put(parcel.readString(), parcel.readParcelable(InquiryState.CreateInquiryFromTemplate.class.getClassLoader()));
                            i++;
                        }
                    }
                    return new InquiryState.CreateInquiryFromTemplate(readString4, readString5, readString6, readString7, readString8, linkedHashMap2, parcel.readString(), (StaticInquiryTemplate) parcel.readParcelable(InquiryState.CreateInquiryFromTemplate.class.getClassLoader()), (InquirySessionConfig) parcel.readParcelable(InquiryState.CreateInquiryFromTemplate.class.getClassLoader()), parcel.readString());
                case 5:
                    parcel.getClass();
                    return new InquiryState.CreateInquirySession(parcel.readString(), (InquirySessionConfig) parcel.readParcelable(InquiryState.CreateInquirySession.class.getClassLoader()), (InquirySessionDataWrapper) parcel.readParcelable(InquiryState.CreateInquirySession.class.getClassLoader()));
                case 6:
                    parcel.getClass();
                    return new InquiryState.ExchangeOneTimeCode(parcel.readString(), (InquirySessionConfig) parcel.readParcelable(InquiryState.ExchangeOneTimeCode.class.getClassLoader()));
                case 7:
                    parcel.getClass();
                    return new InquiryState.LoadFeatureFlagSession(parcel.readString(), parcel.readString(), (InquirySessionConfig) parcel.readParcelable(InquiryState.LoadFeatureFlagSession.class.getClassLoader()));
                case 8:
                    parcel.getClass();
                    return new InquiryState.ResumeFallbackInquiry(parcel.readString(), parcel.readString(), (InquirySessionConfig) parcel.readParcelable(InquiryState.ResumeFallbackInquiry.class.getClassLoader()));
                case 9:
                    parcel.getClass();
                    return new InquiryState.ShowLoadingSpinner(parcel.readString(), (TransitionStatus) parcel.readParcelable(InquiryState.ShowLoadingSpinner.class.getClassLoader()), parcel.readString(), (StepStyle) parcel.readParcelable(InquiryState.ShowLoadingSpinner.class.getClassLoader()), parcel.readInt() != 0, (InquirySessionConfig) parcel.readParcelable(InquiryState.ShowLoadingSpinner.class.getClassLoader()));
                case 10:
                    parcel.getClass();
                    return new InquiryWorkflow$Output.Cancel(parcel.readString(), parcel.readString(), (StepStyle) parcel.readParcelable(InquiryWorkflow$Output.Cancel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                case 11:
                    parcel.getClass();
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    int readInt4 = parcel.readInt();
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(readInt4);
                    while (i != readInt4) {
                        linkedHashMap5.put(parcel.readString(), parcel.readParcelable(InquiryWorkflow$Output.Complete.class.getClassLoader()));
                        i++;
                    }
                    return new InquiryWorkflow$Output.Complete(readString9, readString10, parcel.readString(), parcel.readString(), linkedHashMap5);
                case 12:
                    parcel.getClass();
                    return new InquiryWorkflow$Output.Error(parcel.readString(), (ErrorCode) parcel.readParcelable(InquiryWorkflow$Output.Error.class.getClassLoader()), (InternalErrorInfo) parcel.readParcelable(InquiryWorkflow$Output.Error.class.getClassLoader()), parcel.readString());
                case 13:
                    parcel.getClass();
                    return new InquiryWorkflow$Output.ReinitializeWithFallbackMode(parcel.readString(), parcel.readString());
                case 14:
                    parcel.getClass();
                    return new InquiryWorkflow$Props.InquiryProps(parcel.readString(), parcel.readString(), parcel.readString(), Environment.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readString());
                case 15:
                    parcel.getClass();
                    return new InquiryWorkflow$Props.OneTimeCodeProps(parcel.readString(), Environment.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readString());
                case 16:
                    parcel.getClass();
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt5 = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(readInt5);
                        for (int i2 = 0; i2 != readInt5; i2++) {
                            linkedHashMap.put(parcel.readString(), parcel.readParcelable(InquiryWorkflow$Props.TemplateProps.class.getClassLoader()));
                        }
                    }
                    return new InquiryWorkflow$Props.TemplateProps(readString11, readString12, readString13, readString14, readString15, linkedHashMap, parcel.readString(), (StaticInquiryTemplate) parcel.readParcelable(InquiryWorkflow$Props.TemplateProps.class.getClassLoader()), Environment.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readString(), parcel.readString());
                case 17:
                    parcel.getClass();
                    return new TransitionStatus.CheckingForNextState(PollingMode.valueOf(parcel.readString()), parcel.readInt() != 0);
                case 18:
                    parcel.getClass();
                    return new TransitionStatus.Transitioning(TransitionWorker$TransitionData.CREATOR.createFromParcel(parcel));
                case 19:
                    parcel.getClass();
                    parcel.readInt();
                    return TransitionStatus.TransitioningBack.INSTANCE;
                case 20:
                    parcel.getClass();
                    return new TransitionStatus.UpdateInquirySession((InquiryState) parcel.readParcelable(TransitionStatus.UpdateInquirySession.class.getClassLoader()), parcel.readInt() != 0);
                case 21:
                    UiComponent uiComponent = (UiComponent) NavAction$$ExternalSyntheticOutline0.m(parcel, TransitionWorker$TransitionData.class);
                    int readInt6 = parcel.readInt();
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(readInt6);
                    while (i != readInt6) {
                        linkedHashMap6.put(parcel.readString(), parcel.readParcelable(TransitionWorker$TransitionData.class.getClassLoader()));
                        i++;
                    }
                    return new TransitionWorker$TransitionData(uiComponent, linkedHashMap6, parcel.readString());
                case 22:
                    parcel.getClass();
                    String readString16 = parcel.readString();
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    int readInt7 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt7);
                    while (i != readInt7) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(UiStepSavedStateHelper.UiStepUiComponentConfig.class, parcel, arrayList, i, 1);
                    }
                    return new UiStepSavedStateHelper.UiStepUiComponentConfig(readString16, readString17, readString18, arrayList);
                case 23:
                    parcel.getClass();
                    return new InquiryWorkflowFragment.WorkflowFragmentArgs(parcel.readString(), parcel.readString(), (InquiryWorkflow$Props) parcel.readParcelable(InquiryWorkflowFragment.WorkflowFragmentArgs.class.getClassLoader()));
                case 24:
                    parcel.getClass();
                    parcel.readInt();
                    return PassportNfcReaderOutput.Cancel.INSTANCE;
                case 25:
                    parcel.getClass();
                    return new PassportNfcReaderOutput.Error(parcel.readString(), PassportNfcReaderOutput.ErrorType.valueOf(parcel.readString()));
                case 26:
                    parcel.getClass();
                    return new PassportNfcReaderOutput.ReenterDetails(parcel.readString());
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return PassportNfcReaderOutput.ShowTroubleshootingTips.INSTANCE;
                case 28:
                    parcel.getClass();
                    return new PassportNfcReaderOutput.Success((Uri) parcel.readParcelable(PassportNfcReaderOutput.Success.class.getClassLoader()), (Uri) parcel.readParcelable(PassportNfcReaderOutput.Success.class.getClassLoader()), (Uri) parcel.readParcelable(PassportNfcReaderOutput.Success.class.getClassLoader()), ChipAuthenticationStatus.valueOf(parcel.readString()), parcel.readString());
                default:
                    parcel.getClass();
                    return new PassportNfcStrings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new MrzKey[i];
                case 1:
                    return new IntegrationStepFragment.IntegrationStepFragmentArgs[i];
                case 2:
                    return new InquiryFieldsMap[i];
                case 3:
                    return new InquiryState.Complete[i];
                case 4:
                    return new InquiryState.CreateInquiryFromTemplate[i];
                case 5:
                    return new InquiryState.CreateInquirySession[i];
                case 6:
                    return new InquiryState.ExchangeOneTimeCode[i];
                case 7:
                    return new InquiryState.LoadFeatureFlagSession[i];
                case 8:
                    return new InquiryState.ResumeFallbackInquiry[i];
                case 9:
                    return new InquiryState.ShowLoadingSpinner[i];
                case 10:
                    return new InquiryWorkflow$Output.Cancel[i];
                case 11:
                    return new InquiryWorkflow$Output.Complete[i];
                case 12:
                    return new InquiryWorkflow$Output.Error[i];
                case 13:
                    return new InquiryWorkflow$Output.ReinitializeWithFallbackMode[i];
                case 14:
                    return new InquiryWorkflow$Props.InquiryProps[i];
                case 15:
                    return new InquiryWorkflow$Props.OneTimeCodeProps[i];
                case 16:
                    return new InquiryWorkflow$Props.TemplateProps[i];
                case 17:
                    return new TransitionStatus.CheckingForNextState[i];
                case 18:
                    return new TransitionStatus.Transitioning[i];
                case 19:
                    return new TransitionStatus.TransitioningBack[i];
                case 20:
                    return new TransitionStatus.UpdateInquirySession[i];
                case 21:
                    return new TransitionWorker$TransitionData[i];
                case 22:
                    return new UiStepSavedStateHelper.UiStepUiComponentConfig[i];
                case 23:
                    return new InquiryWorkflowFragment.WorkflowFragmentArgs[i];
                case 24:
                    return new PassportNfcReaderOutput.Cancel[i];
                case 25:
                    return new PassportNfcReaderOutput.Error[i];
                case 26:
                    return new PassportNfcReaderOutput.ReenterDetails[i];
                case 27:
                    return new PassportNfcReaderOutput.ShowTroubleshootingTips[i];
                case 28:
                    return new PassportNfcReaderOutput.Success[i];
                default:
                    return new PassportNfcStrings[i];
            }
        }
    }

    public MrzKey(String str, Date date, Date date2) {
        str.getClass();
        date.getClass();
        date2.getClass();
        this.passportNumber = str;
        this.expirationDate = date;
        this.dateOfBirth = date2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MrzKey)) {
            return false;
        }
        MrzKey mrzKey = (MrzKey) obj;
        return Intrinsics.areEqual(this.passportNumber, mrzKey.passportNumber) && Intrinsics.areEqual(this.expirationDate, mrzKey.expirationDate) && Intrinsics.areEqual(this.dateOfBirth, mrzKey.dateOfBirth);
    }

    public final int hashCode() {
        return this.dateOfBirth.hashCode() + ((this.expirationDate.hashCode() + (this.passportNumber.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MrzKey(passportNumber=" + this.passportNumber + ", expirationDate=" + this.expirationDate + ", dateOfBirth=" + this.dateOfBirth + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.passportNumber);
        parcel.writeSerializable(this.expirationDate);
        parcel.writeSerializable(this.dateOfBirth);
    }
}
