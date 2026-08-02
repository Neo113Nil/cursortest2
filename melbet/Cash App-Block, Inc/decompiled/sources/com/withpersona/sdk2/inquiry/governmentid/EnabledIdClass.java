package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class EnabledIdClass implements Parcelable {
    public static final Parcelable.Creator<EnabledIdClass> CREATOR = new Frame.Creator(10);
    public final IdIcon icon;
    public final IdConfig idConfig;
    public final String name;

    public EnabledIdClass(IdIcon idIcon, IdConfig idConfig, String str) {
        idIcon.getClass();
        idConfig.getClass();
        str.getClass();
        this.icon = idIcon;
        this.idConfig = idConfig;
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
        if (!(obj instanceof EnabledIdClass)) {
            return false;
        }
        EnabledIdClass enabledIdClass = (EnabledIdClass) obj;
        return this.icon == enabledIdClass.icon && Intrinsics.areEqual(this.idConfig, enabledIdClass.idConfig) && Intrinsics.areEqual(this.name, enabledIdClass.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + ((this.idConfig.hashCode() + (this.icon.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnabledIdClass(icon=");
        sb.append(this.icon);
        sb.append(", idConfig=");
        sb.append(this.idConfig);
        sb.append(", name=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.name, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.icon.name());
        this.idConfig.writeToParcel(parcel, i);
        parcel.writeString(this.name);
    }
}
