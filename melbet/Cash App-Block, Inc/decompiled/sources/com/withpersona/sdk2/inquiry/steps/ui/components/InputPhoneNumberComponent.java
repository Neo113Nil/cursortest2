package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.moshi.Json;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.CountryCodeUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004R(\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SingleTextValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "Lcom/squareup/workflow1/ui/TextControllerImpl;", "textController", "Lcom/squareup/workflow1/ui/TextControllerImpl;", "getTextController", "()Lcom/squareup/workflow1/ui/TextControllerImpl;", "setTextController", "(Lcom/squareup/workflow1/ui/TextControllerImpl;)V", "getTextController$annotations", "()V", "ui-step-renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InputPhoneNumberComponent implements UiComponent, SingleTextValueComponent, DisableableComponent, HideableComponent {
    public static final Parcelable.Creator<InputPhoneNumberComponent> CREATOR = new Option.Creator(22);
    public final Integer activeOptionBackgroundColor;
    public final ArrayList associatedViews;
    public final List countryCodeOptions;
    public TextControllerImpl countryCodeOptionsController;
    public final AnonymousClass1 countryCodeSelectComponent;
    public final JsonLogicBoolean disabled;
    public final TextBasedComponentStyle errorTextStyle;
    public final JsonLogicBoolean hidden;
    public final String name;
    public final String selectedCountryCode;
    public TextControllerImpl textController;
    public final String value;

    /* JADX WARN: Type inference failed for: r1v5, types: [com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent$1] */
    public InputPhoneNumberComponent(String str, String str2, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, TextBasedComponentStyle textBasedComponentStyle, Integer num, String str3) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.value = str2;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.errorTextStyle = textBasedComponentStyle;
        this.activeOptionBackgroundColor = num;
        this.selectedCountryCode = str3;
        this.associatedViews = new ArrayList();
        this.countryCodeOptions = (List) CountryCodeUtils.countryOptions$delegate.getValue();
        this.countryCodeSelectComponent = new InputSelectBoxComponent() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent.1
            @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
            public final boolean getCanSelectMultipleValues() {
                return false;
            }

            @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
            public final String getLabel() {
                return null;
            }

            @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
            public final List getOptions() {
                return InputPhoneNumberComponent.this.countryCodeOptions;
            }

            @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
            public final List getSelectedOptions() {
                Lazy lazy = CountryCodeUtils.countryOptions$delegate;
                return CollectionsKt__CollectionsJVMKt.listOf(CountryCodeUtils.getInitialSelectedOption(InputPhoneNumberComponent.this.selectedCountryCode));
            }

            @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
            public final InputSelectBoxComponentStyle getStyles() {
                return null;
            }
        };
        this.countryCodeOptionsController = new TextControllerImpl(CountryCodeUtils.getInitialSelectedOption(str3));
        this.textController = new TextControllerImpl(str2);
    }

    public static InputPhoneNumberComponent copy$default(InputPhoneNumberComponent inputPhoneNumberComponent, String str, String str2, int i) {
        String str3 = inputPhoneNumberComponent.name;
        if ((i & 2) != 0) {
            str = inputPhoneNumberComponent.value;
        }
        String str4 = str;
        JsonLogicBoolean jsonLogicBoolean = inputPhoneNumberComponent.hidden;
        JsonLogicBoolean jsonLogicBoolean2 = inputPhoneNumberComponent.disabled;
        TextBasedComponentStyle textBasedComponentStyle = inputPhoneNumberComponent.errorTextStyle;
        Integer num = inputPhoneNumberComponent.activeOptionBackgroundColor;
        if ((i & 64) != 0) {
            str2 = inputPhoneNumberComponent.selectedCountryCode;
        }
        str3.getClass();
        str4.getClass();
        return new InputPhoneNumberComponent(str3, str4, jsonLogicBoolean, jsonLogicBoolean2, textBasedComponentStyle, num, str2);
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
        if (!(obj instanceof InputPhoneNumberComponent)) {
            return false;
        }
        InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) obj;
        return Intrinsics.areEqual(this.name, inputPhoneNumberComponent.name) && Intrinsics.areEqual(this.value, inputPhoneNumberComponent.value) && Intrinsics.areEqual(this.hidden, inputPhoneNumberComponent.hidden) && Intrinsics.areEqual(this.disabled, inputPhoneNumberComponent.disabled) && Intrinsics.areEqual(this.errorTextStyle, inputPhoneNumberComponent.errorTextStyle) && Intrinsics.areEqual(this.activeOptionBackgroundColor, inputPhoneNumberComponent.activeOptionBackgroundColor) && Intrinsics.areEqual(this.selectedCountryCode, inputPhoneNumberComponent.selectedCountryCode);
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
        int hashCode2 = (hashCode + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        TextBasedComponentStyle textBasedComponentStyle = this.errorTextStyle;
        int hashCode3 = (hashCode2 + (textBasedComponentStyle == null ? 0 : textBasedComponentStyle.hashCode())) * 31;
        Integer num = this.activeOptionBackgroundColor;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.selectedCountryCode;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InputPhoneNumberComponent(name=", this.name, ", value=", this.value, ", hidden=");
        m.append(this.hidden);
        m.append(", disabled=");
        m.append(this.disabled);
        m.append(", errorTextStyle=");
        m.append(this.errorTextStyle);
        m.append(", activeOptionBackgroundColor=");
        m.append(this.activeOptionBackgroundColor);
        m.append(", selectedCountryCode=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.selectedCountryCode, ")");
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.SingleTextValueComponent
    public final UiComponent update(String str) {
        str.getClass();
        InputPhoneNumberComponent copy$default = copy$default(this, str, null, 125);
        TextControllerImpl textControllerImpl = this.textController;
        textControllerImpl.getClass();
        copy$default.textController = textControllerImpl;
        copy$default.countryCodeOptionsController = this.countryCodeOptionsController;
        return copy$default;
    }

    public final InputPhoneNumberComponent updateSelectedCountry(Option option) {
        String str;
        List split$default;
        if (option != null) {
            Lazy lazy = CountryCodeUtils.countryOptions$delegate;
            split$default = StringsKt__StringsKt.split$default(StringsKt.trim(option.value).toString(), new String[]{" "}, false, 0, 6, null);
            str = StringsKt.trim((String) CollectionsKt.first(split$default)).toString().toUpperCase(Locale.ROOT);
            str.getClass();
        } else {
            str = null;
        }
        InputPhoneNumberComponent copy$default = copy$default(this, null, str, 63);
        TextControllerImpl textControllerImpl = this.textController;
        textControllerImpl.getClass();
        copy$default.textController = textControllerImpl;
        copy$default.countryCodeOptionsController = this.countryCodeOptionsController;
        return copy$default;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeString(this.value);
        parcel.writeParcelable(this.hidden, i);
        parcel.writeParcelable(this.disabled, i);
        parcel.writeParcelable(this.errorTextStyle, i);
        Integer num = this.activeOptionBackgroundColor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        parcel.writeString(this.selectedCountryCode);
    }
}
