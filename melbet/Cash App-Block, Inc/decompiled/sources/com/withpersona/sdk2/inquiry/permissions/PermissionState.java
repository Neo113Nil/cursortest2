package com.withpersona.sdk2.inquiry.permissions;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.selfie.PoseConfig;

/* loaded from: classes9.dex */
public final class PermissionState implements Parcelable {
    public static final Parcelable.Creator<PermissionState> CREATOR = new PoseConfig.Creator(16);
    public final Permission permission;
    public final PermissionResult result;

    public PermissionState(Permission permission, PermissionResult permissionResult) {
        permission.getClass();
        permissionResult.getClass();
        this.permission = permission;
        this.result = permissionResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionState)) {
            return false;
        }
        PermissionState permissionState = (PermissionState) obj;
        return this.permission == permissionState.permission && this.result == permissionState.result;
    }

    public final int hashCode() {
        return this.result.hashCode() + (this.permission.hashCode() * 31);
    }

    public final String toString() {
        return "PermissionState(permission=" + this.permission + ", result=" + this.result + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.permission.name());
        parcel.writeString(this.result.name());
    }
}
