package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class QRCodeComponent implements UiComponent, HideableComponent {
    public static final Parcelable.Creator<QRCodeComponent> CREATOR = new SelectedFile.Creator(3);
    public final ArrayList associatedViews;
    public final JsonLogicBoolean hidden;
    public final String name;
    public final int width;

    public QRCodeComponent(String str, JsonLogicBoolean jsonLogicBoolean, int i) {
        str.getClass();
        this.name = str;
        this.hidden = jsonLogicBoolean;
        this.width = i;
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
        if (!(obj instanceof QRCodeComponent)) {
            return false;
        }
        QRCodeComponent qRCodeComponent = (QRCodeComponent) obj;
        return Intrinsics.areEqual(this.name, qRCodeComponent.name) && Intrinsics.areEqual(this.hidden, qRCodeComponent.hidden) && this.width == qRCodeComponent.width;
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
        return Integer.hashCode(this.width) + ((hashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QRCodeComponent(name=");
        sb.append(this.name);
        sb.append(", hidden=");
        sb.append(this.hidden);
        sb.append(", width=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.width, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeParcelable(this.hidden, i);
        parcel.writeInt(this.width);
    }
}
