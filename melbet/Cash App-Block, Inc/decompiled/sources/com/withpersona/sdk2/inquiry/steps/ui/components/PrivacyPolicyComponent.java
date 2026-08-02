package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class PrivacyPolicyComponent implements UiComponent {
    public static final Parcelable.Creator<PrivacyPolicyComponent> CREATOR = new SelectedFile.Creator(2);
    public final String name;

    public PrivacyPolicyComponent(String str) {
        str.getClass();
        this.name = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrivacyPolicyComponent) && Intrinsics.areEqual(this.name, ((PrivacyPolicyComponent) obj).name);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PrivacyPolicyComponent(name=", this.name, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
    }
}
