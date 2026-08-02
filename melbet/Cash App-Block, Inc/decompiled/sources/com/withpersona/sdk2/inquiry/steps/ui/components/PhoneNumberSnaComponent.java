package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PhoneNumberSna;
import com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class PhoneNumberSnaComponent implements UiComponent, AutoSubmitableComponent {
    public static final Parcelable.Creator<PhoneNumberSnaComponent> CREATOR = new SelectedFile.Creator(1);
    public final String autoSubmitCountdownText;
    public final Integer autoSubmitIntervalSeconds;
    public final String code;
    public final PhoneNumberSna config;
    public final String errorMessage;
    public final String errorName;
    public final String name;

    public PhoneNumberSnaComponent(String str, PhoneNumberSna phoneNumberSna, String str2, String str3, String str4, String str5, Integer num) {
        str.getClass();
        phoneNumberSna.getClass();
        this.name = str;
        this.config = phoneNumberSna;
        this.code = str2;
        this.errorName = str3;
        this.errorMessage = str4;
        this.autoSubmitCountdownText = str5;
        this.autoSubmitIntervalSeconds = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneNumberSnaComponent)) {
            return false;
        }
        PhoneNumberSnaComponent phoneNumberSnaComponent = (PhoneNumberSnaComponent) obj;
        return Intrinsics.areEqual(this.name, phoneNumberSnaComponent.name) && Intrinsics.areEqual(this.config, phoneNumberSnaComponent.config) && Intrinsics.areEqual(this.code, phoneNumberSnaComponent.code) && Intrinsics.areEqual(this.errorName, phoneNumberSnaComponent.errorName) && Intrinsics.areEqual(this.errorMessage, phoneNumberSnaComponent.errorMessage) && Intrinsics.areEqual(this.autoSubmitCountdownText, phoneNumberSnaComponent.autoSubmitCountdownText) && Intrinsics.areEqual(this.autoSubmitIntervalSeconds, phoneNumberSnaComponent.autoSubmitIntervalSeconds);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent
    public final String getAutoSubmitCountdownText() {
        return this.autoSubmitCountdownText;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int hashCode = (this.config.hashCode() + (this.name.hashCode() * 31)) * 31;
        String str = this.code;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.autoSubmitCountdownText;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.autoSubmitIntervalSeconds;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneNumberSnaComponent(name=");
        sb.append(this.name);
        sb.append(", config=");
        sb.append(this.config);
        sb.append(", code=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.code, ", errorName=", this.errorName, ", errorMessage=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.errorMessage, ", autoSubmitCountdownText=", this.autoSubmitCountdownText, ", autoSubmitIntervalSeconds=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.autoSubmitIntervalSeconds, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeParcelable(this.config, i);
        parcel.writeString(this.code);
        parcel.writeString(this.errorName);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.autoSubmitCountdownText);
        Integer num = this.autoSubmitIntervalSeconds;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
    }
}
