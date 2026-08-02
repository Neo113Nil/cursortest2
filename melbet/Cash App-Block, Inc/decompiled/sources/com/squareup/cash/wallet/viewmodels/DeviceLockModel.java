package com.squareup.cash.wallet.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DeviceLockModel {
    public final String errorText;
    public final String id;
    public final boolean isDisabled;
    public final boolean isLoading;
    public final boolean isLocked;
    public final boolean isSponsorLocked;
    public final String name;
    public final String statusText;

    public DeviceLockModel(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, String str4) {
        str2.getClass();
        str3.getClass();
        this.id = str;
        this.name = str2;
        this.isLocked = z;
        this.isLoading = z2;
        this.isSponsorLocked = z3;
        this.isDisabled = z4;
        this.statusText = str3;
        this.errorText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceLockModel)) {
            return false;
        }
        DeviceLockModel deviceLockModel = (DeviceLockModel) obj;
        return this.id.equals(deviceLockModel.id) && Intrinsics.areEqual(this.name, deviceLockModel.name) && this.isLocked == deviceLockModel.isLocked && this.isLoading == deviceLockModel.isLoading && this.isSponsorLocked == deviceLockModel.isSponsorLocked && this.isDisabled == deviceLockModel.isDisabled && Intrinsics.areEqual(this.statusText, deviceLockModel.statusText) && Intrinsics.areEqual(this.errorText, deviceLockModel.errorText);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.name), 31, this.isLocked), 31, this.isLoading), 31, this.isSponsorLocked), 31, this.isDisabled), 31, this.statusText);
        String str = this.errorText;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeviceLockModel(id=", this.id, ", name=", this.name, ", isLocked=");
        re$$ExternalSyntheticOutline0.m(m, this.isLocked, ", isLoading=", this.isLoading, ", isSponsorLocked=");
        re$$ExternalSyntheticOutline0.m(m, this.isSponsorLocked, ", isDisabled=", this.isDisabled, ", statusText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.statusText, ", errorText=", this.errorText, ")");
    }
}
