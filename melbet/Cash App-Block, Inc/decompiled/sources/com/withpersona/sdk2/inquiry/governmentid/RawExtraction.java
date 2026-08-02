package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdConfig;
import com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdRequest;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.HoldStillHint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.LowLightHint;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse;
import com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureState;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdStepData;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.integration.IntegrationView;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$PendingAction$OpenBrowser;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$State$Starting;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "Landroid/os/Parcelable;", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RawExtraction implements Parcelable {
    public static final Parcelable.Creator<RawExtraction> CREATOR = new Creator(0);

    /* renamed from: type, reason: collision with root package name */
    public final String f1454type;
    public final String value;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new RawExtraction(parcel.readString(), parcel.readString());
                case 1:
                    parcel.getClass();
                    return new IdConfig.ManualCaptureConfig(parcel.readInt() != 0, parcel.readLong());
                case 2:
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i8 != readInt) {
                        i8 = CameraState$Type$EnumUnboxingLocalUtility.m(IdConfig.CREATOR, parcel, arrayList, i8, 1);
                    }
                    return new IdConfigForCountry(readString, readString2, arrayList);
                case 3:
                    parcel.getClass();
                    return new IdPart$SideIdPart(IdConfig.Side.valueOf(parcel.readString()));
                case 4:
                    parcel.getClass();
                    int readInt2 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
                    for (int i9 = 0; i9 != readInt2; i9++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                    return new OverridableText(linkedHashMap);
                case 5:
                    parcel.getClass();
                    parcel.readInt();
                    return Screen.Overlay.Barcode.INSTANCE;
                case 6:
                    parcel.getClass();
                    parcel.readInt();
                    return Screen.Overlay.CornersOnly.INSTANCE;
                case 7:
                    parcel.getClass();
                    return new Screen.Overlay.Custom((RemoteImageComponent) parcel.readParcelable(Screen.Overlay.Custom.class.getClassLoader()), (RemoteImage) parcel.readParcelable(Screen.Overlay.Custom.class.getClassLoader()));
                case 8:
                    parcel.getClass();
                    parcel.readInt();
                    return Screen.Overlay.GenericFront.INSTANCE;
                case 9:
                    parcel.getClass();
                    parcel.readInt();
                    return Screen.Overlay.Passport.INSTANCE;
                case 10:
                    parcel.getClass();
                    parcel.readInt();
                    return Screen.Overlay.Rectangle.INSTANCE;
                case 11:
                    parcel.getClass();
                    return new AutoClassificationConfig(parcel.readInt() != 0, parcel.readInt() != 0, IdConfig.IdSideConfig.CREATOR.createFromParcel(parcel));
                case 12:
                    parcel.getClass();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt3);
                    while (i7 != readInt3) {
                        i7 = CameraState$Type$EnumUnboxingLocalUtility.m(DigitalIdRequest.CREATOR, parcel, arrayList2, i7, 1);
                    }
                    return new DigitalIdConfig(readString3, readString4, readString5, arrayList2);
                case 13:
                    parcel.getClass();
                    IdClass valueOf = IdClass.valueOf(parcel.readString());
                    String readString6 = parcel.readString();
                    int readInt4 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt4);
                    for (int i10 = 0; i10 != readInt4; i10++) {
                        linkedHashMap2.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                    }
                    return new DigitalIdRequest(valueOf, readString6, linkedHashMap2);
                case 14:
                    parcel.getClass();
                    parcel.readInt();
                    return HoldStillHint.INSTANCE;
                case 15:
                    parcel.getClass();
                    parcel.readInt();
                    return LowLightHint.INSTANCE;
                case 16:
                    parcel.getClass();
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt5);
                    while (i6 != readInt5) {
                        i6 = CameraState$Type$EnumUnboxingLocalUtility.m(AutoClassifyResponse.IdClassesForCountry.CREATOR, parcel, arrayList3, i6, 1);
                    }
                    return new AutoClassifyResponse.ClassificationFailedResponse(arrayList3);
                case 17:
                    parcel.getClass();
                    return new AutoClassifyResponse.IdAcceptedResponse(parcel.readString(), parcel.readString(), (Id) parcel.readParcelable(AutoClassifyResponse.IdAcceptedResponse.class.getClassLoader()));
                case 18:
                    parcel.getClass();
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    int readInt6 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt6);
                    while (i5 != readInt6) {
                        i5 = CameraState$Type$EnumUnboxingLocalUtility.m(AutoClassifyResponse.IdClassesForCountry.class, parcel, arrayList4, i5, 1);
                    }
                    return new AutoClassifyResponse.IdClassesForCountry(readString7, readString8, arrayList4);
                case 19:
                    parcel.getClass();
                    int readInt7 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt7);
                    while (i4 != readInt7) {
                        i4 = CameraState$Type$EnumUnboxingLocalUtility.m(AutoClassifyResponse.IdClassesForCountry.CREATOR, parcel, arrayList5, i4, 1);
                    }
                    return new AutoClassifyResponse.IdRejectedResponse(arrayList5);
                case 20:
                    parcel.getClass();
                    parcel.readInt();
                    return AutoClassifyResponse.Unknown.INSTANCE;
                case 21:
                    parcel.getClass();
                    int readInt8 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt8);
                    while (i3 != readInt8) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(AutocaptureState.class, parcel, arrayList6, i3, 1);
                    }
                    return new AutocaptureState(arrayList6);
                case 22:
                    parcel.getClass();
                    int readInt9 = parcel.readInt();
                    ArrayList arrayList7 = new ArrayList(readInt9);
                    while (i2 != readInt9) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdRequestArguments.class, parcel, arrayList7, i2, 1);
                    }
                    return new GovernmentIdRequestArguments(arrayList7, parcel.readString(), parcel.readString());
                case 23:
                    parcel.getClass();
                    String readString9 = parcel.readString();
                    int readInt10 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(readInt10);
                    while (i != readInt10) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(GovernmentIdStepData.class, parcel, arrayList8, i, 1);
                    }
                    return new GovernmentIdStepData(readString9, arrayList8);
                case 24:
                    parcel.getClass();
                    return new GovernmentIdStepFragment.GovernmentIdStepFragmentArgs(GovernmentIdWorkflow.Input.CREATOR.createFromParcel(parcel));
                case 25:
                    parcel.getClass();
                    return new InquiryEvent.PageChange(parcel.readString(), parcel.readString());
                case 26:
                    parcel.getClass();
                    return new InquiryEvent.StartEvent(parcel.readString(), parcel.readString());
                case 27:
                    UiComponentScreen uiComponentScreen = (UiComponentScreen) NavAction$$ExternalSyntheticOutline0.m(parcel, IntegrationView.class);
                    NavigationState navigationState = (NavigationState) parcel.readParcelable(IntegrationView.class.getClassLoader());
                    Function0 function0 = (Function0) parcel.readSerializable();
                    Function0 function02 = (Function0) parcel.readSerializable();
                    int readInt11 = parcel.readInt();
                    ArrayList arrayList9 = new ArrayList(readInt11);
                    for (int i11 = 0; i11 != readInt11; i11++) {
                        arrayList9.add(parcel.readSerializable());
                    }
                    return new IntegrationView(uiComponentScreen, navigationState, function0, function02, arrayList9, parcel.readInt() != 0);
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return IntegrationWorkflow$PendingAction$OpenBrowser.INSTANCE;
                default:
                    parcel.getClass();
                    return new IntegrationWorkflow$State$Starting((IntegrationWorkflow$PendingAction$OpenBrowser) parcel.readParcelable(IntegrationWorkflow$State$Starting.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new RawExtraction[i];
                case 1:
                    return new IdConfig.ManualCaptureConfig[i];
                case 2:
                    return new IdConfigForCountry[i];
                case 3:
                    return new IdPart$SideIdPart[i];
                case 4:
                    return new OverridableText[i];
                case 5:
                    return new Screen.Overlay.Barcode[i];
                case 6:
                    return new Screen.Overlay.CornersOnly[i];
                case 7:
                    return new Screen.Overlay.Custom[i];
                case 8:
                    return new Screen.Overlay.GenericFront[i];
                case 9:
                    return new Screen.Overlay.Passport[i];
                case 10:
                    return new Screen.Overlay.Rectangle[i];
                case 11:
                    return new AutoClassificationConfig[i];
                case 12:
                    return new DigitalIdConfig[i];
                case 13:
                    return new DigitalIdRequest[i];
                case 14:
                    return new HoldStillHint[i];
                case 15:
                    return new LowLightHint[i];
                case 16:
                    return new AutoClassifyResponse.ClassificationFailedResponse[i];
                case 17:
                    return new AutoClassifyResponse.IdAcceptedResponse[i];
                case 18:
                    return new AutoClassifyResponse.IdClassesForCountry[i];
                case 19:
                    return new AutoClassifyResponse.IdRejectedResponse[i];
                case 20:
                    return new AutoClassifyResponse.Unknown[i];
                case 21:
                    return new AutocaptureState[i];
                case 22:
                    return new GovernmentIdRequestArguments[i];
                case 23:
                    return new GovernmentIdStepData[i];
                case 24:
                    return new GovernmentIdStepFragment.GovernmentIdStepFragmentArgs[i];
                case 25:
                    return new InquiryEvent.PageChange[i];
                case 26:
                    return new InquiryEvent.StartEvent[i];
                case 27:
                    return new IntegrationView[i];
                case 28:
                    return new IntegrationWorkflow$PendingAction$OpenBrowser[i];
                default:
                    return new IntegrationWorkflow$State$Starting[i];
            }
        }
    }

    public RawExtraction(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f1454type = str;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f1454type);
        parcel.writeString(this.value);
    }
}
