package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class VerifyPersonaButtonComponent implements ButtonComponent {
    public static final Parcelable.Creator<VerifyPersonaButtonComponent> CREATOR = new SelectedFile.Creator(9);
    public final ArrayList associatedViews;
    public final String autoSubmitCountdownText;
    public final Integer autoSubmitIntervalSeconds;
    public final JsonLogicBoolean disabled;
    public final JsonLogicBoolean hidden;
    public final String name;
    public final String url;
    public boolean wasTapped;

    public VerifyPersonaButtonComponent(String str, String str2, String str3, Integer num, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        str.getClass();
        this.name = str;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.autoSubmitCountdownText = str2;
        this.autoSubmitIntervalSeconds = num;
        this.url = str3;
        this.associatedViews = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent, com.withpersona.sdk2.inquiry.steps.ui.components.LoadingIndicatorComponent
    public final void setWasTapped(boolean z) {
        this.wasTapped = z;
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
        parcel.writeString(this.url);
    }
}
