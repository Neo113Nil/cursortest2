package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class LinkButtonComponent implements ButtonComponent {
    public static final Parcelable.Creator<LinkButtonComponent> CREATOR = new Option.Creator(27);
    public final ArrayList associatedViews;
    public final String autoSubmitCountdownText;
    public final Integer autoSubmitIntervalSeconds;
    public final JsonLogicBoolean disabled;
    public final JsonLogicBoolean hidden;
    public final String link;
    public final String name;
    public boolean wasTapped;

    public LinkButtonComponent(String str, String str2, String str3, Integer num, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        str.getClass();
        str3.getClass();
        this.name = str;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.autoSubmitCountdownText = str2;
        this.autoSubmitIntervalSeconds = num;
        this.link = str3;
        this.associatedViews = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkButtonComponent)) {
            return false;
        }
        LinkButtonComponent linkButtonComponent = (LinkButtonComponent) obj;
        return Intrinsics.areEqual(this.name, linkButtonComponent.name) && Intrinsics.areEqual(this.hidden, linkButtonComponent.hidden) && Intrinsics.areEqual(this.disabled, linkButtonComponent.disabled) && Intrinsics.areEqual(this.autoSubmitCountdownText, linkButtonComponent.autoSubmitCountdownText) && Intrinsics.areEqual(this.autoSubmitIntervalSeconds, linkButtonComponent.autoSubmitIntervalSeconds) && Intrinsics.areEqual(this.link, linkButtonComponent.link);
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

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent, com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
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
        return this.link.hashCode() + ((hashCode4 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent, com.withpersona.sdk2.inquiry.steps.ui.components.LoadingIndicatorComponent
    public final void setWasTapped(boolean z) {
        this.wasTapped = z;
    }

    public final String toString() {
        return "LinkButtonComponent(name=" + this.name + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", autoSubmitCountdownText=" + this.autoSubmitCountdownText + ", autoSubmitIntervalSeconds=" + this.autoSubmitIntervalSeconds + ", link=" + this.link + ")";
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
        parcel.writeString(this.link);
    }
}
