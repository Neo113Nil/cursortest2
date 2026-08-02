package com.squareup.cash.work.presenters.shift.geofence;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class ClockedOutGeofenceUiState {
    public final boolean isAllowed;
    public final boolean isLoading;
    public final String reasonText;
    public final String settingsLinkText;

    public ClockedOutGeofenceUiState(String str, String str2, boolean z, boolean z2) {
        this.reasonText = str;
        this.settingsLinkText = str2;
        this.isLoading = z;
        this.isAllowed = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockedOutGeofenceUiState)) {
            return false;
        }
        ClockedOutGeofenceUiState clockedOutGeofenceUiState = (ClockedOutGeofenceUiState) obj;
        return Intrinsics.areEqual(this.reasonText, clockedOutGeofenceUiState.reasonText) && Intrinsics.areEqual(this.settingsLinkText, clockedOutGeofenceUiState.settingsLinkText) && this.isLoading == clockedOutGeofenceUiState.isLoading && this.isAllowed == clockedOutGeofenceUiState.isAllowed;
    }

    public final int hashCode() {
        String str = this.reasonText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.settingsLinkText;
        return Boolean.hashCode(this.isAllowed) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isLoading);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClockedOutGeofenceUiState(reasonText=", this.reasonText, ", settingsLinkText=", this.settingsLinkText, ", isLoading="), this.isLoading, ", isAllowed=", this.isAllowed, ")");
    }
}
