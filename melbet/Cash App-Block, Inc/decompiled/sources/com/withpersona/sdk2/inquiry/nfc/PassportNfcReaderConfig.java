package com.withpersona.sdk2.inquiry.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class PassportNfcReaderConfig implements Parcelable {
    public static final Parcelable.Creator<PassportNfcReaderConfig> CREATOR = new Creator();
    public final String cardAccessNumber;
    public final GovernmentIdNfcScan.GovernmentIdNfcScanStyles componentStyles;
    public final boolean enableRedesign;
    public final List enabledDataGroups;
    public final MrzKey mrzKey;
    public final PassportNfcStrings passportNfcStrings;
    public final StepStyles.UiStepStyle stepStyles;
    public final Integer theme;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            MrzKey createFromParcel = MrzKey.CREATOR.createFromParcel(parcel);
            PassportNfcStrings createFromParcel2 = PassportNfcStrings.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(NfcDataGroupType.valueOf(parcel.readString()));
            }
            return new PassportNfcReaderConfig(readString, createFromParcel, createFromParcel2, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (StepStyles.UiStepStyle) parcel.readParcelable(PassportNfcReaderConfig.class.getClassLoader()), (GovernmentIdNfcScan.GovernmentIdNfcScanStyles) parcel.readParcelable(PassportNfcReaderConfig.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PassportNfcReaderConfig[i];
        }
    }

    public PassportNfcReaderConfig(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List list, Integer num, StepStyles.UiStepStyle uiStepStyle, GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles, boolean z) {
        str.getClass();
        mrzKey.getClass();
        passportNfcStrings.getClass();
        list.getClass();
        this.cardAccessNumber = str;
        this.mrzKey = mrzKey;
        this.passportNfcStrings = passportNfcStrings;
        this.enabledDataGroups = list;
        this.theme = num;
        this.stepStyles = uiStepStyle;
        this.componentStyles = governmentIdNfcScanStyles;
        this.enableRedesign = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassportNfcReaderConfig)) {
            return false;
        }
        PassportNfcReaderConfig passportNfcReaderConfig = (PassportNfcReaderConfig) obj;
        return Intrinsics.areEqual(this.cardAccessNumber, passportNfcReaderConfig.cardAccessNumber) && Intrinsics.areEqual(this.mrzKey, passportNfcReaderConfig.mrzKey) && Intrinsics.areEqual(this.passportNfcStrings, passportNfcReaderConfig.passportNfcStrings) && Intrinsics.areEqual(this.enabledDataGroups, passportNfcReaderConfig.enabledDataGroups) && Intrinsics.areEqual(this.theme, passportNfcReaderConfig.theme) && Intrinsics.areEqual(this.stepStyles, passportNfcReaderConfig.stepStyles) && Intrinsics.areEqual(this.componentStyles, passportNfcReaderConfig.componentStyles) && this.enableRedesign == passportNfcReaderConfig.enableRedesign;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m((this.passportNfcStrings.hashCode() + ((this.mrzKey.hashCode() + (this.cardAccessNumber.hashCode() * 31)) * 31)) * 31, 31, this.enabledDataGroups);
        Integer num = this.theme;
        int hashCode = (m + (num == null ? 0 : num.hashCode())) * 31;
        StepStyles.UiStepStyle uiStepStyle = this.stepStyles;
        int hashCode2 = (hashCode + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles = this.componentStyles;
        return Boolean.hashCode(this.enableRedesign) + ((hashCode2 + (governmentIdNfcScanStyles != null ? governmentIdNfcScanStyles.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PassportNfcReaderConfig(cardAccessNumber=" + this.cardAccessNumber + ", mrzKey=" + this.mrzKey + ", passportNfcStrings=" + this.passportNfcStrings + ", enabledDataGroups=" + this.enabledDataGroups + ", theme=" + this.theme + ", stepStyles=" + this.stepStyles + ", componentStyles=" + this.componentStyles + ", enableRedesign=" + this.enableRedesign + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.cardAccessNumber);
        this.mrzKey.writeToParcel(parcel, i);
        this.passportNfcStrings.writeToParcel(parcel, i);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.enabledDataGroups, parcel);
        while (m.hasNext()) {
            parcel.writeString(((NfcDataGroupType) m.next()).name());
        }
        Integer num = this.theme;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        parcel.writeParcelable(this.stepStyles, i);
        parcel.writeParcelable(this.componentStyles, i);
        parcel.writeInt(this.enableRedesign ? 1 : 0);
    }
}
