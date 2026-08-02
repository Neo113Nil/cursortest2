package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class RemoteImageComponent implements UiComponent, HideableComponent {
    public static final Parcelable.Creator<RemoteImageComponent> CREATOR = new SelectedFile.Creator(4);
    public final ArrayList associatedViews;
    public final JsonLogicBoolean hidden;
    public final String name;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RemoteImageComponent(RemoteImage remoteImage) {
        this(r0, r2 != null ? r2.getHidden() : null);
        remoteImage.getClass();
        String name = remoteImage.getName();
        RemoteImage.Attributes attributes = remoteImage.getAttributes();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteImageComponent)) {
            return false;
        }
        RemoteImageComponent remoteImageComponent = (RemoteImageComponent) obj;
        return Intrinsics.areEqual(this.name, remoteImageComponent.name) && Intrinsics.areEqual(this.hidden, remoteImageComponent.hidden);
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
        return "RemoteImageComponent(name=" + this.name + ", hidden=" + this.hidden + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeParcelable(this.hidden, i);
    }

    public RemoteImageComponent(String str, JsonLogicBoolean jsonLogicBoolean) {
        str.getClass();
        this.name = str;
        this.hidden = jsonLogicBoolean;
        this.associatedViews = new ArrayList();
    }
}
