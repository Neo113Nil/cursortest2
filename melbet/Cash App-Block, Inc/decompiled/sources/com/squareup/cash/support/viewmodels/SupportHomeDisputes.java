package com.squareup.cash.support.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes7.dex */
public final class SupportHomeDisputes {
    public final int activeClaims;
    public final int totalClaims;

    public SupportHomeDisputes(int i, int i2) {
        this.totalClaims = i;
        this.activeClaims = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportHomeDisputes)) {
            return false;
        }
        SupportHomeDisputes supportHomeDisputes = (SupportHomeDisputes) obj;
        return this.totalClaims == supportHomeDisputes.totalClaims && this.activeClaims == supportHomeDisputes.activeClaims;
    }

    public final int hashCode() {
        return Integer.hashCode(this.activeClaims) + (Integer.hashCode(this.totalClaims) * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(this.totalClaims, this.activeClaims, "SupportHomeDisputes(totalClaims=", ", activeClaims=", ")");
    }
}
