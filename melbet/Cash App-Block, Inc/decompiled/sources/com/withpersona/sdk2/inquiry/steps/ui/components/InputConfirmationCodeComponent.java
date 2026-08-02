package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.misnap.iad.Payload;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004R(\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SingleTextValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "Lcom/squareup/workflow1/ui/TextControllerImpl;", "textController", "Lcom/squareup/workflow1/ui/TextControllerImpl;", "getTextController", "()Lcom/squareup/workflow1/ui/TextControllerImpl;", "setTextController", "(Lcom/squareup/workflow1/ui/TextControllerImpl;)V", "getTextController$annotations", "()V", "ui-step-renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InputConfirmationCodeComponent implements UiComponent, SingleTextValueComponent, DisableableComponent, HideableComponent {
    public static final Parcelable.Creator<InputConfirmationCodeComponent> CREATOR = new Option.Creator(14);
    public final ArrayList associatedViews;
    public final JsonLogicBoolean disabled;
    public final JsonLogicBoolean hidden;
    public final String name;
    public final Payload submitCodeHelper;
    public TextControllerImpl textController;
    public final String value;

    public InputConfirmationCodeComponent(String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.value = str2;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.associatedViews = new ArrayList();
        this.textController = new TextControllerImpl(str2);
        Payload payload = new Payload(13);
        payload.a = new ShimmerThemeKt$$ExternalSyntheticLambda0(28);
        this.submitCodeHelper = payload;
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTextController$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputConfirmationCodeComponent)) {
            return false;
        }
        InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) obj;
        return Intrinsics.areEqual(this.name, inputConfirmationCodeComponent.name) && Intrinsics.areEqual(this.value, inputConfirmationCodeComponent.value) && Intrinsics.areEqual(this.hidden, inputConfirmationCodeComponent.hidden) && Intrinsics.areEqual(this.disabled, inputConfirmationCodeComponent.disabled);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent
    public final ArrayList getAssociatedViews() {
        return this.associatedViews;
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

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.SingleTextValueComponent
    public final TextControllerImpl getTextController() {
        return this.textController;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.value);
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode = (m + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        return hashCode + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InputConfirmationCodeComponent(name=", this.name, ", value=", this.value, ", hidden=");
        m.append(this.hidden);
        m.append(", disabled=");
        m.append(this.disabled);
        m.append(")");
        return m.toString();
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.SingleTextValueComponent
    public final UiComponent update(String str) {
        str.getClass();
        String str2 = this.name;
        str2.getClass();
        InputConfirmationCodeComponent inputConfirmationCodeComponent = new InputConfirmationCodeComponent(str2, str, this.hidden, this.disabled);
        TextControllerImpl textControllerImpl = this.textController;
        textControllerImpl.getClass();
        inputConfirmationCodeComponent.textController = textControllerImpl;
        return inputConfirmationCodeComponent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeString(this.value);
        parcel.writeParcelable(this.hidden, i);
        parcel.writeParcelable(this.disabled, i);
    }
}
