package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class TitleComponent implements UiComponent, DisableableComponent, HideableComponent {
    public static final Parcelable.Creator<TitleComponent> CREATOR = new SelectedFile.Creator(8);
    public final ArrayList associatedViews;
    public final JsonLogicBoolean disabled;
    public final JsonLogicBoolean hidden;
    public final String name;

    public TitleComponent(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
        str.getClass();
        this.name = str;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
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
        if (!(obj instanceof TitleComponent)) {
            return false;
        }
        TitleComponent titleComponent = (TitleComponent) obj;
        return Intrinsics.areEqual(this.name, titleComponent.name) && Intrinsics.areEqual(this.hidden, titleComponent.hidden) && Intrinsics.areEqual(this.disabled, titleComponent.disabled);
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
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode2 = (hashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        return hashCode2 + (jsonLogicBoolean2 != null ? jsonLogicBoolean2.hashCode() : 0);
    }

    public final String toString() {
        return "TitleComponent(name=" + this.name + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeParcelable(this.hidden, i);
        parcel.writeParcelable(this.disabled, i);
    }
}
