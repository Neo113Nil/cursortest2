package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.AddressAutocompleteMethod;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.steps.ui.mdoc.MdocRequestMetadata$GoogleWalletRequestMetadata;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class Option implements Parcelable {
    public static final Parcelable.Creator<Option> CREATOR = new Creator(0);
    public final String text;
    public final String value;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i;
            JsonLogicBoolean jsonLogicBoolean;
            boolean z;
            ArrayList arrayList2;
            int i2 = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new Option(parcel.readString(), parcel.readString());
                case 1:
                    parcel.getClass();
                    return new ActionButtonComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(ActionButtonComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(ActionButtonComponent.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                case 2:
                    parcel.getClass();
                    return new BrandingComponent(parcel.readString(), parcel.readInt() != 0);
                case 3:
                    parcel.getClass();
                    return new CancelButtonComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(CancelButtonComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(CancelButtonComponent.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                case 4:
                    parcel.getClass();
                    return new CombinedStepButtonComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(CombinedStepButtonComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(CombinedStepButtonComponent.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                case 5:
                    parcel.getClass();
                    return new CompleteButtonComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(CompleteButtonComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(CompleteButtonComponent.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                case 6:
                    parcel.getClass();
                    return new ESignatureComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(ESignatureComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(ESignatureComponent.class.getClassLoader()));
                case 7:
                    int i3 = 0;
                    parcel.getClass();
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt);
                    while (i3 != readInt) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(FooterComponent.class, parcel, arrayList3, i3, 1);
                    }
                    return new FooterComponent(readString, arrayList3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                case 8:
                    parcel.getClass();
                    return new GovernmentIdNfcScanComponent(parcel.readString(), (GovernmentIdNfcScan) parcel.readParcelable(GovernmentIdNfcScanComponent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(GovernmentIdNfcScanComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(GovernmentIdNfcScanComponent.class.getClassLoader()), parcel.readInt() == 0 ? null : GovernmentIdNfcData.CREATOR.createFromParcel(parcel));
                case 9:
                    int i4 = 0;
                    parcel.getClass();
                    String readString2 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt2);
                    while (i4 != readInt2) {
                        i4 = CameraState$Type$EnumUnboxingLocalUtility.m(HorizontalStackComponent.class, parcel, arrayList4, i4, 1);
                    }
                    return new HorizontalStackComponent(readString2, arrayList4, (JsonLogicBoolean) parcel.readParcelable(HorizontalStackComponent.class.getClassLoader()));
                case 10:
                    parcel.getClass();
                    return new ImagePreviewComponent(parcel.readString());
                case 11:
                    parcel.getClass();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    JsonLogicBoolean jsonLogicBoolean2 = (JsonLogicBoolean) parcel.readParcelable(InputAddressComponent.class.getClassLoader());
                    JsonLogicBoolean jsonLogicBoolean3 = (JsonLogicBoolean) parcel.readParcelable(InputAddressComponent.class.getClassLoader());
                    AddressAutocompleteMethod valueOf = AddressAutocompleteMethod.valueOf(parcel.readString());
                    String readString9 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int readInt3 = parcel.readInt();
                        ArrayList arrayList5 = new ArrayList(readInt3);
                        int i5 = 0;
                        while (i5 != readInt3) {
                            i5 = CameraState$Type$EnumUnboxingLocalUtility.m(Suggestion.CREATOR, parcel, arrayList5, i5, 1);
                        }
                        arrayList = arrayList5;
                    }
                    return new InputAddressComponent(readString3, readString4, readString5, readString6, readString7, readString8, jsonLogicBoolean2, jsonLogicBoolean3, valueOf, readString9, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
                case 12:
                    parcel.getClass();
                    return new InputCheckboxComponent(parcel.readString(), parcel.readInt() != 0, (JsonLogicBoolean) parcel.readParcelable(InputCheckboxComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputCheckboxComponent.class.getClassLoader()));
                case 13:
                    parcel.getClass();
                    String readString10 = parcel.readString();
                    int readInt4 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt4);
                    for (int i6 = 0; i6 != readInt4; i6++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new InputCheckboxGroupComponent(readString10, linkedHashSet, (JsonLogicBoolean) parcel.readParcelable(InputCheckboxGroupComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputCheckboxGroupComponent.class.getClassLoader()));
                case 14:
                    parcel.getClass();
                    return new InputConfirmationCodeComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputConfirmationCodeComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputConfirmationCodeComponent.class.getClassLoader()));
                case 15:
                    parcel.getClass();
                    return new InputCurrencyComponent(parcel.readString(), (Number) parcel.readSerializable(), (JsonLogicBoolean) parcel.readParcelable(InputCurrencyComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputCurrencyComponent.class.getClassLoader()), (TextBasedComponentStyle) parcel.readParcelable(InputCurrencyComponent.class.getClassLoader()));
                case 16:
                    parcel.getClass();
                    return new InputDateComponent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), (JsonLogicBoolean) parcel.readParcelable(InputDateComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputDateComponent.class.getClassLoader()));
                case 17:
                    parcel.getClass();
                    String readString11 = parcel.readString();
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt5);
                    int i7 = 0;
                    while (i7 != readInt5) {
                        i7 = CameraState$Type$EnumUnboxingLocalUtility.m(SelectedFile.CREATOR, parcel, arrayList6, i7, 1);
                    }
                    return new InputFileUploadComponent(readString11, arrayList6, parcel.readInt() != 0, (JsonLogicBoolean) parcel.readParcelable(InputFileUploadComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputFileUploadComponent.class.getClassLoader()));
                case 18:
                    parcel.getClass();
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    JsonLogicBoolean jsonLogicBoolean4 = (JsonLogicBoolean) parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader());
                    JsonLogicBoolean jsonLogicBoolean5 = (JsonLogicBoolean) parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader());
                    boolean z2 = parcel.readInt() != 0;
                    if (parcel.readInt() != 0) {
                        i = 0;
                        jsonLogicBoolean = jsonLogicBoolean4;
                        z = true;
                    } else {
                        i = 0;
                        jsonLogicBoolean = jsonLogicBoolean4;
                        z = false;
                    }
                    Boolean valueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0 ? 1 : i);
                    Boolean valueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0 ? 1 : i);
                    if (parcel.readInt() == 0) {
                        arrayList2 = null;
                    } else {
                        int readInt6 = parcel.readInt();
                        ArrayList arrayList7 = new ArrayList(readInt6);
                        while (i != readInt6) {
                            i = CameraState$Type$EnumUnboxingLocalUtility.m(InputInternationalDbComponent.class, parcel, arrayList7, i, 1);
                        }
                        arrayList2 = arrayList7;
                    }
                    return new InputInternationalDbComponent(readString12, readString13, readString14, readString15, jsonLogicBoolean, jsonLogicBoolean5, z2, z, valueOf2, valueOf3, arrayList2, (InputSelectComponentStyle) parcel.readParcelable(InputInternationalDbComponent.class.getClassLoader()));
                case 19:
                    parcel.getClass();
                    return new InputMaskedTextComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputMaskedTextComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputMaskedTextComponent.class.getClassLoader()), (InputTextBasedComponentStyle) parcel.readParcelable(InputMaskedTextComponent.class.getClassLoader()));
                case 20:
                    parcel.getClass();
                    String readString16 = parcel.readString();
                    InputSelectComponentStyle inputSelectComponentStyle = (InputSelectComponentStyle) parcel.readParcelable(InputMultiSelectComponent.class.getClassLoader());
                    int readInt7 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(readInt7);
                    int i8 = 0;
                    while (i8 != readInt7) {
                        i8 = CameraState$Type$EnumUnboxingLocalUtility.m(Option.CREATOR, parcel, arrayList8, i8, 1);
                    }
                    JsonLogicBoolean jsonLogicBoolean6 = (JsonLogicBoolean) parcel.readParcelable(InputMultiSelectComponent.class.getClassLoader());
                    JsonLogicBoolean jsonLogicBoolean7 = (JsonLogicBoolean) parcel.readParcelable(InputMultiSelectComponent.class.getClassLoader());
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    int readInt8 = parcel.readInt();
                    ArrayList arrayList9 = new ArrayList(readInt8);
                    while (i2 != readInt8) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(Option.CREATOR, parcel, arrayList9, i2, 1);
                    }
                    return new InputMultiSelectComponent(readString16, inputSelectComponentStyle, arrayList8, jsonLogicBoolean6, jsonLogicBoolean7, readString17, readString18, arrayList9);
                case 21:
                    parcel.getClass();
                    return new InputNumberComponent(parcel.readString(), (Number) parcel.readSerializable(), (JsonLogicBoolean) parcel.readParcelable(InputNumberComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputNumberComponent.class.getClassLoader()));
                case 22:
                    parcel.getClass();
                    return new InputPhoneNumberComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputPhoneNumberComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputPhoneNumberComponent.class.getClassLoader()), (TextBasedComponentStyle) parcel.readParcelable(InputPhoneNumberComponent.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
                case 23:
                    parcel.getClass();
                    return new InputRadioGroupComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputRadioGroupComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputRadioGroupComponent.class.getClassLoader()));
                case 24:
                    parcel.getClass();
                    String readString19 = parcel.readString();
                    InputSelectComponentStyle inputSelectComponentStyle2 = (InputSelectComponentStyle) parcel.readParcelable(InputSelectComponent.class.getClassLoader());
                    int readInt9 = parcel.readInt();
                    ArrayList arrayList10 = new ArrayList(readInt9);
                    int i9 = 0;
                    while (i9 != readInt9) {
                        i9 = CameraState$Type$EnumUnboxingLocalUtility.m(Option.CREATOR, parcel, arrayList10, i9, 1);
                    }
                    JsonLogicBoolean jsonLogicBoolean8 = (JsonLogicBoolean) parcel.readParcelable(InputSelectComponent.class.getClassLoader());
                    JsonLogicBoolean jsonLogicBoolean9 = (JsonLogicBoolean) parcel.readParcelable(InputSelectComponent.class.getClassLoader());
                    String readString20 = parcel.readString();
                    String readString21 = parcel.readString();
                    int readInt10 = parcel.readInt();
                    ArrayList arrayList11 = new ArrayList(readInt10);
                    while (i2 != readInt10) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(Option.CREATOR, parcel, arrayList11, i2, 1);
                    }
                    return new InputSelectComponent(readString19, inputSelectComponentStyle2, arrayList10, jsonLogicBoolean8, jsonLogicBoolean9, readString20, readString21, arrayList11);
                case 25:
                    parcel.getClass();
                    return new InputTextAreaComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputTextAreaComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputTextAreaComponent.class.getClassLoader()), (TextBasedComponentStyle) parcel.readParcelable(InputTextAreaComponent.class.getClassLoader()));
                case 26:
                    parcel.getClass();
                    return new InputTextComponent(parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(InputTextComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(InputTextComponent.class.getClassLoader()), (TextBasedComponentStyle) parcel.readParcelable(InputTextComponent.class.getClassLoader()));
                case 27:
                    parcel.getClass();
                    String readString22 = parcel.readString();
                    JsonLogicBoolean jsonLogicBoolean10 = (JsonLogicBoolean) parcel.readParcelable(LinkButtonComponent.class.getClassLoader());
                    JsonLogicBoolean jsonLogicBoolean11 = (JsonLogicBoolean) parcel.readParcelable(LinkButtonComponent.class.getClassLoader());
                    return new LinkButtonComponent(readString22, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, jsonLogicBoolean10, jsonLogicBoolean11);
                case 28:
                    parcel.getClass();
                    return new LocalImageComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(LocalImageComponent.class.getClassLoader()));
                default:
                    parcel.getClass();
                    return new MdocComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(MdocComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(MdocComponent.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (MdocRequestMetadata$GoogleWalletRequestMetadata) parcel.readParcelable(MdocComponent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new Option[i];
                case 1:
                    return new ActionButtonComponent[i];
                case 2:
                    return new BrandingComponent[i];
                case 3:
                    return new CancelButtonComponent[i];
                case 4:
                    return new CombinedStepButtonComponent[i];
                case 5:
                    return new CompleteButtonComponent[i];
                case 6:
                    return new ESignatureComponent[i];
                case 7:
                    return new FooterComponent[i];
                case 8:
                    return new GovernmentIdNfcScanComponent[i];
                case 9:
                    return new HorizontalStackComponent[i];
                case 10:
                    return new ImagePreviewComponent[i];
                case 11:
                    return new InputAddressComponent[i];
                case 12:
                    return new InputCheckboxComponent[i];
                case 13:
                    return new InputCheckboxGroupComponent[i];
                case 14:
                    return new InputConfirmationCodeComponent[i];
                case 15:
                    return new InputCurrencyComponent[i];
                case 16:
                    return new InputDateComponent[i];
                case 17:
                    return new InputFileUploadComponent[i];
                case 18:
                    return new InputInternationalDbComponent[i];
                case 19:
                    return new InputMaskedTextComponent[i];
                case 20:
                    return new InputMultiSelectComponent[i];
                case 21:
                    return new InputNumberComponent[i];
                case 22:
                    return new InputPhoneNumberComponent[i];
                case 23:
                    return new InputRadioGroupComponent[i];
                case 24:
                    return new InputSelectComponent[i];
                case 25:
                    return new InputTextAreaComponent[i];
                case 26:
                    return new InputTextComponent[i];
                case 27:
                    return new LinkButtonComponent[i];
                case 28:
                    return new LocalImageComponent[i];
                default:
                    return new MdocComponent[i];
            }
        }
    }

    public Option(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.text = str;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Option)) {
            return false;
        }
        Option option = (Option) obj;
        return Intrinsics.areEqual(this.text, option.text) && Intrinsics.areEqual(this.value, option.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Option(text=", this.text, ", value=", this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.text);
        parcel.writeString(this.value);
    }
}
