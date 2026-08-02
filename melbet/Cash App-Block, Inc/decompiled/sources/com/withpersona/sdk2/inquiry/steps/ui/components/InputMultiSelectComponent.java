package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class InputMultiSelectComponent implements UiComponent, MultiTextValueComponent, InputSelectBoxComponent, DisableableComponent, HideableComponent {
    public static final Parcelable.Creator<InputMultiSelectComponent> CREATOR = new Option.Creator(20);
    public final ArrayList associatedViews;
    public final boolean canSelectMultipleValues;
    public final JsonLogicBoolean disabled;
    public final JsonLogicBoolean hidden;
    public final String label;
    public final String name;
    public final List options;
    public final String placeholder;
    public final List selectedOptions;
    public TextControllerImpl selectedOptionsController;
    public final InputSelectComponentStyle styles;

    public InputMultiSelectComponent(String str, InputSelectComponentStyle inputSelectComponentStyle, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, String str3, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.name = str;
        this.styles = inputSelectComponentStyle;
        this.selectedOptions = list;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.label = str2;
        this.placeholder = str3;
        this.options = list2;
        this.associatedViews = new ArrayList();
        this.canSelectMultipleValues = true;
        this.selectedOptionsController = new TextControllerImpl(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputMultiSelectComponent)) {
            return false;
        }
        InputMultiSelectComponent inputMultiSelectComponent = (InputMultiSelectComponent) obj;
        return Intrinsics.areEqual(this.name, inputMultiSelectComponent.name) && Intrinsics.areEqual(this.styles, inputMultiSelectComponent.styles) && Intrinsics.areEqual(this.selectedOptions, inputMultiSelectComponent.selectedOptions) && Intrinsics.areEqual(this.hidden, inputMultiSelectComponent.hidden) && Intrinsics.areEqual(this.disabled, inputMultiSelectComponent.disabled) && Intrinsics.areEqual(this.label, inputMultiSelectComponent.label) && Intrinsics.areEqual(this.placeholder, inputMultiSelectComponent.placeholder) && Intrinsics.areEqual(this.options, inputMultiSelectComponent.options);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent
    public final ArrayList getAssociatedViews() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
    public final boolean getCanSelectMultipleValues() {
        return this.canSelectMultipleValues;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.DisableableComponent
    public final JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent
    public final JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
    public final String getLabel() {
        return this.label;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    public final String getName() {
        return this.name;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
    public final List getOptions() {
        return this.options;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
    public final List getSelectedOptions() {
        return this.selectedOptions;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.MultiTextValueComponent
    public final TextControllerImpl getSelectedOptionsController() {
        return this.selectedOptionsController;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
    public final InputSelectBoxComponentStyle getStyles() {
        return this.styles;
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        InputSelectComponentStyle inputSelectComponentStyle = this.styles;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (inputSelectComponentStyle == null ? 0 : inputSelectComponentStyle.hashCode())) * 31, 31, this.selectedOptions);
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode2 = (m + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int hashCode3 = (hashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        String str = this.label;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholder;
        return this.options.hashCode() + ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "InputMultiSelectComponent(name=" + this.name + ", styles=" + this.styles + ", selectedOptions=" + this.selectedOptions + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", label=" + this.label + ", placeholder=" + this.placeholder + ", options=" + this.options + ")";
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.MultiTextValueComponent
    public final UiComponent update(List list) {
        list.getClass();
        String str = this.name;
        str.getClass();
        List list2 = this.options;
        list2.getClass();
        InputMultiSelectComponent inputMultiSelectComponent = new InputMultiSelectComponent(str, this.styles, list, this.hidden, this.disabled, this.label, this.placeholder, list2);
        TextControllerImpl textControllerImpl = this.selectedOptionsController;
        textControllerImpl.getClass();
        inputMultiSelectComponent.selectedOptionsController = textControllerImpl;
        return inputMultiSelectComponent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeParcelable(this.styles, i);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.selectedOptions, parcel);
        while (m.hasNext()) {
            ((Option) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.hidden, i);
        parcel.writeParcelable(this.disabled, i);
        parcel.writeString(this.label);
        parcel.writeString(this.placeholder);
        Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.options, parcel);
        while (m2.hasNext()) {
            ((Option) m2.next()).writeToParcel(parcel, i);
        }
    }
}
