package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class CombinedStepButtonComponent implements ButtonComponent {
    public static final Parcelable.Creator<CombinedStepButtonComponent> CREATOR = new Option.Creator(4);
    public final ArrayList associatedViews;
    public final String autoSubmitCountdownText;
    public final Integer autoSubmitIntervalSeconds;
    public final JsonLogicBoolean disabled;
    public final JsonLogicBoolean hidden;
    public final String name;
    public boolean wasTapped;

    public CombinedStepButtonComponent(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, Integer num) {
        str.getClass();
        this.name = str;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.autoSubmitCountdownText = str2;
        this.autoSubmitIntervalSeconds = num;
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
        if (!(obj instanceof CombinedStepButtonComponent)) {
            return false;
        }
        CombinedStepButtonComponent combinedStepButtonComponent = (CombinedStepButtonComponent) obj;
        return Intrinsics.areEqual(this.name, combinedStepButtonComponent.name) && Intrinsics.areEqual(this.hidden, combinedStepButtonComponent.hidden) && Intrinsics.areEqual(this.disabled, combinedStepButtonComponent.disabled) && Intrinsics.areEqual(this.autoSubmitCountdownText, combinedStepButtonComponent.autoSubmitCountdownText) && Intrinsics.areEqual(this.autoSubmitIntervalSeconds, combinedStepButtonComponent.autoSubmitIntervalSeconds);
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
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent, com.withpersona.sdk2.inquiry.steps.ui.components.LoadingIndicatorComponent
    public final void setWasTapped(boolean z) {
        this.wasTapped = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CombinedStepButtonComponent(name=");
        sb.append(this.name);
        sb.append(", hidden=");
        sb.append(this.hidden);
        sb.append(", disabled=");
        sb.append(this.disabled);
        sb.append(", autoSubmitCountdownText=");
        sb.append(this.autoSubmitCountdownText);
        sb.append(", autoSubmitIntervalSeconds=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.autoSubmitIntervalSeconds, ")");
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
    }
}
