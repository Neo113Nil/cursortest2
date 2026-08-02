package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u00032\u00020\u0004R(\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DateValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "Lio/noties/markwon/MarkwonConfiguration;", "dateController", "Lio/noties/markwon/MarkwonConfiguration;", "getDateController", "()Lio/noties/markwon/MarkwonConfiguration;", "setDateController", "(Lio/noties/markwon/MarkwonConfiguration;)V", "getDateController$annotations", "()V", "ui-step-renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InputDateComponent implements UiComponent, DateValueComponent, DisableableComponent, HideableComponent {
    public static final Parcelable.Creator<InputDateComponent> CREATOR = new Option.Creator(16);
    public final ArrayList associatedViews;
    public MarkwonConfiguration dateController;
    public final JsonLogicBoolean disabled;
    public final JsonLogicBoolean hidden;
    public final List monthList;
    public final String monthPlaceholder;
    public final String name;
    public final String value;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputDateComponent(InputDate inputDate) {
        this(r1, r0, r3, (r8 == null || (r8 = r8.getTextMonths()) == null) ? EmptyList.INSTANCE : r8, r5, r6);
        List<String> textMonths;
        inputDate.getClass();
        String name = inputDate.getName();
        InputDate.Attributes attributes = inputDate.getAttributes();
        String prefill = attributes != null ? attributes.getPrefill() : null;
        InputDate.Attributes attributes2 = inputDate.getAttributes();
        JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
        InputDate.Attributes attributes3 = inputDate.getAttributes();
        JsonLogicBoolean disabled = attributes3 != null ? attributes3.getDisabled() : null;
        InputDate.Attributes attributes4 = inputDate.getAttributes();
        String placeholderMonth = attributes4 != null ? attributes4.getPlaceholderMonth() : null;
        InputDate.Attributes attributes5 = inputDate.getAttributes();
    }

    @Json(ignore = true)
    public static /* synthetic */ void getDateController$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputDateComponent)) {
            return false;
        }
        InputDateComponent inputDateComponent = (InputDateComponent) obj;
        return Intrinsics.areEqual(this.name, inputDateComponent.name) && Intrinsics.areEqual(this.value, inputDateComponent.value) && Intrinsics.areEqual(this.hidden, inputDateComponent.hidden) && Intrinsics.areEqual(this.disabled, inputDateComponent.disabled) && Intrinsics.areEqual(this.monthPlaceholder, inputDateComponent.monthPlaceholder) && Intrinsics.areEqual(this.monthList, inputDateComponent.monthList);
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
        int hashCode = this.name.hashCode() * 31;
        String str = this.value;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode3 = (hashCode2 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int hashCode4 = (hashCode3 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        String str2 = this.monthPlaceholder;
        return this.monthList.hashCode() + ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InputDateComponent(name=", this.name, ", value=", this.value, ", hidden=");
        m.append(this.hidden);
        m.append(", disabled=");
        m.append(this.disabled);
        m.append(", monthPlaceholder=");
        m.append(this.monthPlaceholder);
        m.append(", monthList=");
        m.append(this.monthList);
        m.append(")");
        return m.toString();
    }

    public final UiComponent update(String str) {
        String str2 = this.name;
        str2.getClass();
        List list = this.monthList;
        list.getClass();
        InputDateComponent inputDateComponent = new InputDateComponent(str2, str, this.monthPlaceholder, list, this.hidden, this.disabled);
        MarkwonConfiguration markwonConfiguration = this.dateController;
        markwonConfiguration.getClass();
        inputDateComponent.dateController = markwonConfiguration;
        return inputDateComponent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeString(this.value);
        parcel.writeParcelable(this.hidden, i);
        parcel.writeParcelable(this.disabled, i);
        parcel.writeString(this.monthPlaceholder);
        parcel.writeStringList(this.monthList);
    }

    public InputDateComponent(String str, String str2, String str3, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        str.getClass();
        list.getClass();
        this.name = str;
        this.value = str2;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.monthPlaceholder = str3;
        this.monthList = list;
        this.associatedViews = new ArrayList();
        this.dateController = new MarkwonConfiguration(str2, str3, list);
    }
}
