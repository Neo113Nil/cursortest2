package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class LocalImageComponent implements UiComponent, HideableComponent {
    public static final Parcelable.Creator<LocalImageComponent> CREATOR = new Option.Creator(28);
    public final ArrayList associatedViews;
    public final JsonLogicBoolean hidden;
    public final String name;

    public LocalImageComponent(String str, JsonLogicBoolean jsonLogicBoolean) {
        str.getClass();
        this.name = str;
        this.hidden = jsonLogicBoolean;
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
        if (!(obj instanceof LocalImageComponent)) {
            return false;
        }
        LocalImageComponent localImageComponent = (LocalImageComponent) obj;
        return Intrinsics.areEqual(this.name, localImageComponent.name) && Intrinsics.areEqual(this.hidden, localImageComponent.hidden);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent
    public final ArrayList getAssociatedViews() {
        return this.associatedViews;
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
        return hashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode());
    }

    public final String toString() {
        return "LocalImageComponent(name=" + this.name + ", hidden=" + this.hidden + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeParcelable(this.hidden, i);
    }
}
