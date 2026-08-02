package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.BitmapController;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004R(\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SingleNumberValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/BitmapController;", "numberController", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/BitmapController;", "getNumberController", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/BitmapController;", "setNumberController", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/BitmapController;)V", "getNumberController$annotations", "()V", "ui-step-renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InputCurrencyComponent implements UiComponent, SingleNumberValueComponent, DisableableComponent, HideableComponent {
    public static final Parcelable.Creator<InputCurrencyComponent> CREATOR = new Option.Creator(15);
    public final ArrayList associatedViews;
    public final JsonLogicBoolean disabled;
    public final TextBasedComponentStyle errorTextStyle;
    public final JsonLogicBoolean hidden;
    public final String name;
    public BitmapController numberController;
    public final Number value;

    public InputCurrencyComponent(String str, Number number, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle) {
        str.getClass();
        this.name = str;
        this.value = number;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.errorTextStyle = textBasedComponentStyle;
        this.associatedViews = new ArrayList();
        this.numberController = new BitmapController(number);
    }

    @Json(ignore = true)
    public static /* synthetic */ void getNumberController$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputCurrencyComponent)) {
            return false;
        }
        InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) obj;
        return Intrinsics.areEqual(this.name, inputCurrencyComponent.name) && Intrinsics.areEqual(this.value, inputCurrencyComponent.value) && Intrinsics.areEqual(this.hidden, inputCurrencyComponent.hidden) && Intrinsics.areEqual(this.disabled, inputCurrencyComponent.disabled) && Intrinsics.areEqual(this.errorTextStyle, inputCurrencyComponent.errorTextStyle);
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

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.SingleNumberValueComponent
    public final BitmapController getNumberController() {
        return this.numberController;
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Number number = this.value;
        int hashCode2 = (hashCode + (number == null ? 0 : number.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode3 = (hashCode2 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int hashCode4 = (hashCode3 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        TextBasedComponentStyle textBasedComponentStyle = this.errorTextStyle;
        return hashCode4 + (textBasedComponentStyle != null ? textBasedComponentStyle.hashCode() : 0);
    }

    public final String toString() {
        return "InputCurrencyComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", errorTextStyle=" + this.errorTextStyle + ")";
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.SingleNumberValueComponent
    public final UiComponent update(Number number) {
        String str = this.name;
        str.getClass();
        InputCurrencyComponent inputCurrencyComponent = new InputCurrencyComponent(str, number, this.hidden, this.disabled, this.errorTextStyle);
        BitmapController bitmapController = this.numberController;
        bitmapController.getClass();
        inputCurrencyComponent.numberController = bitmapController;
        return inputCurrencyComponent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeSerializable(this.value);
        parcel.writeParcelable(this.hidden, i);
        parcel.writeParcelable(this.disabled, i);
        parcel.writeParcelable(this.errorTextStyle, i);
    }
}
