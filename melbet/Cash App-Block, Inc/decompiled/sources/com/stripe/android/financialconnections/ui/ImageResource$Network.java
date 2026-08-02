package com.stripe.android.financialconnections.ui;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ImageResource$Network {
    public final String url;

    public ImageResource$Network(String str) {
        str.getClass();
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageResource$Network) && Intrinsics.areEqual(this.url, ((ImageResource$Network) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Network(url=", this.url, ")");
    }
}
