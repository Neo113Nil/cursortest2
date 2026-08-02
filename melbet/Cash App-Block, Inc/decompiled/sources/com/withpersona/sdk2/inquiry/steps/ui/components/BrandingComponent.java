package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class BrandingComponent implements UiComponent {
    public static final Parcelable.Creator<BrandingComponent> CREATOR = new Option.Creator(2);
    public final String name;
    public final boolean showBranding;

    public BrandingComponent(String str, boolean z) {
        str.getClass();
        this.name = str;
        this.showBranding = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandingComponent)) {
            return false;
        }
        BrandingComponent brandingComponent = (BrandingComponent) obj;
        return Intrinsics.areEqual(this.name, brandingComponent.name) && this.showBranding == brandingComponent.showBranding;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showBranding) + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("BrandingComponent(name=", this.name, ", showBranding=", ")", this.showBranding);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeInt(this.showBranding ? 1 : 0);
    }
}
