package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.moshi.Json;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004R(\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SingleBooleanValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "Lcom/squareup/workflow1/ui/TextControllerImpl;", "twoStateViewController", "Lcom/squareup/workflow1/ui/TextControllerImpl;", "getTwoStateViewController", "()Lcom/squareup/workflow1/ui/TextControllerImpl;", "setTwoStateViewController", "(Lcom/squareup/workflow1/ui/TextControllerImpl;)V", "getTwoStateViewController$annotations", "()V", "ui-step-renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InputCheckboxComponent implements UiComponent, SingleBooleanValueComponent, DisableableComponent, HideableComponent {
    public static final Parcelable.Creator<InputCheckboxComponent> CREATOR = new Option.Creator(12);
    public final ArrayList associatedViews;
    public final JsonLogicBoolean disabled;
    public final JsonLogicBoolean hidden;
    public final String name;
    public TextControllerImpl twoStateViewController;
    public final boolean value;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputCheckboxComponent(InputCheckbox inputCheckbox, boolean z) {
        this(r0, z, r1, r4 != null ? r4.getDisabled() : null);
        inputCheckbox.getClass();
        String name = inputCheckbox.getName();
        InputCheckbox.Attributes attributes = inputCheckbox.getAttributes();
        JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
        InputCheckbox.Attributes attributes2 = inputCheckbox.getAttributes();
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTwoStateViewController$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputCheckboxComponent)) {
            return false;
        }
        InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) obj;
        return Intrinsics.areEqual(this.name, inputCheckboxComponent.name) && this.value == inputCheckboxComponent.value && Intrinsics.areEqual(this.hidden, inputCheckboxComponent.hidden) && Intrinsics.areEqual(this.disabled, inputCheckboxComponent.disabled);
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

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.value);
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode = (m + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        return hashCode + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("InputCheckboxComponent(name=", this.name, ", value=", ", hidden=", this.value);
        m1540m.append(this.hidden);
        m1540m.append(", disabled=");
        m1540m.append(this.disabled);
        m1540m.append(")");
        return m1540m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeInt(this.value ? 1 : 0);
        parcel.writeParcelable(this.hidden, i);
        parcel.writeParcelable(this.disabled, i);
    }

    public InputCheckboxComponent(String str, boolean z, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        str.getClass();
        this.name = str;
        this.value = z;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.associatedViews = new ArrayList();
        this.twoStateViewController = new TextControllerImpl(z);
    }
}
