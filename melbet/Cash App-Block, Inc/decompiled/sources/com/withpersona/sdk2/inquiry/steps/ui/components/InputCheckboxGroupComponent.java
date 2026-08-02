package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.BitmapController;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004R(\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/StringSetValueComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/BitmapController;", "stringSetController", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/BitmapController;", "getStringSetController", "()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/BitmapController;", "setStringSetController", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/BitmapController;)V", "getStringSetController$annotations", "()V", "ui-step-renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InputCheckboxGroupComponent implements UiComponent, DisableableComponent, HideableComponent, StringSetValueComponent {
    public static final Parcelable.Creator<InputCheckboxGroupComponent> CREATOR = new Option.Creator(13);
    public final ArrayList associatedViews;
    public final JsonLogicBoolean disabled;
    public final JsonLogicBoolean hidden;
    public final String name;
    public BitmapController stringSetController;
    public final Set value;

    public InputCheckboxGroupComponent(String str, Set set, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        str.getClass();
        set.getClass();
        this.name = str;
        this.value = set;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.associatedViews = new ArrayList();
        this.stringSetController = new BitmapController(set);
    }

    @Json(ignore = true)
    public static /* synthetic */ void getStringSetController$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputCheckboxGroupComponent)) {
            return false;
        }
        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) obj;
        return Intrinsics.areEqual(this.name, inputCheckboxGroupComponent.name) && Intrinsics.areEqual(this.value, inputCheckboxGroupComponent.value) && Intrinsics.areEqual(this.hidden, inputCheckboxGroupComponent.hidden) && Intrinsics.areEqual(this.disabled, inputCheckboxGroupComponent.disabled);
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
        return "InputCheckboxGroupComponent(name=" + this.name + ", value=" + this.value + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        Set set = this.value;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
        parcel.writeParcelable(this.hidden, i);
        parcel.writeParcelable(this.disabled, i);
    }
}
