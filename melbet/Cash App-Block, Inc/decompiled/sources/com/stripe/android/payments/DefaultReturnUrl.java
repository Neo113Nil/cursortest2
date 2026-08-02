package com.stripe.android.payments;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class DefaultReturnUrl {
    public final String packageName;

    public DefaultReturnUrl(String str) {
        str.getClass();
        this.packageName = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultReturnUrl) && Intrinsics.areEqual(this.packageName, ((DefaultReturnUrl) obj).packageName);
    }

    public final String getValue() {
        return Recorder$$ExternalSyntheticOutline2.m("stripesdk://payment_return_url/", this.packageName);
    }

    public final int hashCode() {
        return this.packageName.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DefaultReturnUrl(packageName=", this.packageName, ")");
    }
}
