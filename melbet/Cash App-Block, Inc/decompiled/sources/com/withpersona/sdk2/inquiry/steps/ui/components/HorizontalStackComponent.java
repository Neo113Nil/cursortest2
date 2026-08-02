package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class HorizontalStackComponent implements UiComponent, UiComponentGroup, HideableComponent {
    public static final Parcelable.Creator<HorizontalStackComponent> CREATOR = new Option.Creator(9);
    public final ArrayList associatedViews;
    public final List children;
    public final JsonLogicBoolean hidden;
    public final String name;

    public HorizontalStackComponent(String str, List list, JsonLogicBoolean jsonLogicBoolean) {
        str.getClass();
        list.getClass();
        this.name = str;
        this.children = list;
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
        if (!(obj instanceof HorizontalStackComponent)) {
            return false;
        }
        HorizontalStackComponent horizontalStackComponent = (HorizontalStackComponent) obj;
        return Intrinsics.areEqual(this.name, horizontalStackComponent.name) && Intrinsics.areEqual(this.children, horizontalStackComponent.children) && Intrinsics.areEqual(this.hidden, horizontalStackComponent.hidden);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent
    public final ArrayList getAssociatedViews() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup
    public final List getChildren() {
        return this.children;
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
        int m = Recorder$$ExternalSyntheticOutline2.m(this.name.hashCode() * 31, 31, this.children);
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        return m + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode());
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("HorizontalStackComponent(name=", this.name, ", children=", ", hidden=", this.children);
        m.append(this.hidden);
        m.append(")");
        return m.toString();
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup
    public final UiComponentGroup updateChildren(List list) {
        list.getClass();
        String str = this.name;
        str.getClass();
        list.getClass();
        return new HorizontalStackComponent(str, list, this.hidden);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.children, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeParcelable(this.hidden, i);
    }
}
