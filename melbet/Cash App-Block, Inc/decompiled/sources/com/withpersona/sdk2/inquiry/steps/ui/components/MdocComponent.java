package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.mdoc.MdocRequestMetadata$GoogleWalletRequestMetadata;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class MdocComponent implements UiComponent, ButtonComponent {
    public static final Parcelable.Creator<MdocComponent> CREATOR = new Option.Creator(29);
    public final ArrayList associatedViews;
    public final String autoSubmitCountdownText;
    public final Integer autoSubmitIntervalSeconds;
    public final JsonLogicBoolean disabled;
    public final String errorRetrievingMdocText;
    public final String errorText;
    public TextControllerImpl errorTextController;
    public final JsonLogicBoolean hidden;
    public final String mdocData;
    public TextControllerImpl mdocDataController;
    public final MdocRequestMetadata$GoogleWalletRequestMetadata mdocRequestMetadata;
    public final String name;
    public final String noMdocAvailableText;
    public final String successfulMdocRetrievalTransitionComponentName;
    public boolean wasTapped;

    public MdocComponent(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, Integer num, MdocRequestMetadata$GoogleWalletRequestMetadata mdocRequestMetadata$GoogleWalletRequestMetadata, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        mdocRequestMetadata$GoogleWalletRequestMetadata.getClass();
        str3.getClass();
        str4.getClass();
        str6.getClass();
        str7.getClass();
        this.name = str;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.autoSubmitCountdownText = str2;
        this.autoSubmitIntervalSeconds = num;
        this.mdocRequestMetadata = mdocRequestMetadata$GoogleWalletRequestMetadata;
        this.errorRetrievingMdocText = str3;
        this.noMdocAvailableText = str4;
        this.successfulMdocRetrievalTransitionComponentName = str5;
        this.mdocData = str6;
        this.errorText = str7;
        this.mdocDataController = new TextControllerImpl(str6);
        this.errorTextController = new TextControllerImpl(str7);
        this.associatedViews = new ArrayList();
    }

    public static MdocComponent copy$default(MdocComponent mdocComponent, String str, String str2, int i) {
        String str3 = mdocComponent.name;
        JsonLogicBoolean jsonLogicBoolean = mdocComponent.hidden;
        JsonLogicBoolean jsonLogicBoolean2 = mdocComponent.disabled;
        String str4 = mdocComponent.autoSubmitCountdownText;
        Integer num = mdocComponent.autoSubmitIntervalSeconds;
        MdocRequestMetadata$GoogleWalletRequestMetadata mdocRequestMetadata$GoogleWalletRequestMetadata = mdocComponent.mdocRequestMetadata;
        String str5 = mdocComponent.errorRetrievingMdocText;
        String str6 = mdocComponent.noMdocAvailableText;
        String str7 = mdocComponent.successfulMdocRetrievalTransitionComponentName;
        if ((i & 512) != 0) {
            str = mdocComponent.mdocData;
        }
        String str8 = str;
        if ((i & 1024) != 0) {
            str2 = mdocComponent.errorText;
        }
        String str9 = str2;
        str3.getClass();
        mdocRequestMetadata$GoogleWalletRequestMetadata.getClass();
        str5.getClass();
        str6.getClass();
        str8.getClass();
        str9.getClass();
        return new MdocComponent(str3, jsonLogicBoolean, jsonLogicBoolean2, str4, num, mdocRequestMetadata$GoogleWalletRequestMetadata, str5, str6, str7, str8, str9);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdocComponent)) {
            return false;
        }
        MdocComponent mdocComponent = (MdocComponent) obj;
        return Intrinsics.areEqual(this.name, mdocComponent.name) && Intrinsics.areEqual(this.hidden, mdocComponent.hidden) && Intrinsics.areEqual(this.disabled, mdocComponent.disabled) && Intrinsics.areEqual(this.autoSubmitCountdownText, mdocComponent.autoSubmitCountdownText) && Intrinsics.areEqual(this.autoSubmitIntervalSeconds, mdocComponent.autoSubmitIntervalSeconds) && Intrinsics.areEqual(this.mdocRequestMetadata, mdocComponent.mdocRequestMetadata) && Intrinsics.areEqual(this.errorRetrievingMdocText, mdocComponent.errorRetrievingMdocText) && Intrinsics.areEqual(this.noMdocAvailableText, mdocComponent.noMdocAvailableText) && Intrinsics.areEqual(this.successfulMdocRetrievalTransitionComponentName, mdocComponent.successfulMdocRetrievalTransitionComponentName) && Intrinsics.areEqual(this.mdocData, mdocComponent.mdocData) && Intrinsics.areEqual(this.errorText, mdocComponent.errorText);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent
    public final ArrayList getAssociatedViews() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent, com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent
    public final String getAutoSubmitCountdownText() {
        return this.autoSubmitCountdownText;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent
    public final Integer getAutoSubmitIntervalSeconds() {
        return this.autoSubmitIntervalSeconds;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.DisableableComponent
    public final JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent
    public final JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    public final String getName() {
        return this.name;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent
    public final boolean getWasTapped() {
        return this.wasTapped;
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode2 = (hashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int hashCode3 = (hashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        String str = this.autoSubmitCountdownText;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.autoSubmitIntervalSeconds;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.mdocRequestMetadata.hashCode() + ((hashCode4 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.errorRetrievingMdocText), 31, this.noMdocAvailableText);
        String str2 = this.successfulMdocRetrievalTransitionComponentName;
        return this.errorText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.mdocData);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent, com.withpersona.sdk2.inquiry.steps.ui.components.LoadingIndicatorComponent
    public final void setWasTapped(boolean z) {
        this.wasTapped = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MdocComponent(name=");
        sb.append(this.name);
        sb.append(", hidden=");
        sb.append(this.hidden);
        sb.append(", disabled=");
        sb.append(this.disabled);
        sb.append(", autoSubmitCountdownText=");
        sb.append(this.autoSubmitCountdownText);
        sb.append(", autoSubmitIntervalSeconds=");
        sb.append(this.autoSubmitIntervalSeconds);
        sb.append(", mdocRequestMetadata=");
        sb.append(this.mdocRequestMetadata);
        sb.append(", errorRetrievingMdocText=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.errorRetrievingMdocText, ", noMdocAvailableText=", this.noMdocAvailableText, ", successfulMdocRetrievalTransitionComponentName=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.successfulMdocRetrievalTransitionComponentName, ", mdocData=", this.mdocData, ", errorText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.errorText, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeParcelable(this.hidden, i);
        parcel.writeParcelable(this.disabled, i);
        parcel.writeString(this.autoSubmitCountdownText);
        Integer num = this.autoSubmitIntervalSeconds;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        parcel.writeParcelable(this.mdocRequestMetadata, i);
        parcel.writeString(this.errorRetrievingMdocText);
        parcel.writeString(this.noMdocAvailableText);
        parcel.writeString(this.successfulMdocRetrievalTransitionComponentName);
        parcel.writeString(this.mdocData);
        parcel.writeString(this.errorText);
    }
}
