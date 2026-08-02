package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class SpacerComponent implements UiComponent, HideableComponent {
    public static final Parcelable.Creator<SpacerComponent> CREATOR = new SelectedFile.Creator(5);
    public final ArrayList associatedViews;
    public final int height;
    public final JsonLogicBoolean hidden;
    public final String name;
    public final int width;

    public SpacerComponent(String str, JsonLogicBoolean jsonLogicBoolean, int i, int i2) {
        str.getClass();
        this.name = str;
        this.hidden = jsonLogicBoolean;
        this.height = i;
        this.width = i2;
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
        if (!(obj instanceof SpacerComponent)) {
            return false;
        }
        SpacerComponent spacerComponent = (SpacerComponent) obj;
        return Intrinsics.areEqual(this.name, spacerComponent.name) && Intrinsics.areEqual(this.hidden, spacerComponent.hidden) && this.height == spacerComponent.height && this.width == spacerComponent.width;
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
        return Integer.hashCode(this.width) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.height, (hashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacerComponent(name=");
        sb.append(this.name);
        sb.append(", hidden=");
        sb.append(this.hidden);
        sb.append(", height=");
        return Recorder$$ExternalSyntheticOutline1.m(this.height, this.width, ", width=", ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeParcelable(this.hidden, i);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }
}
