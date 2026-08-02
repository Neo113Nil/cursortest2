package com.squareup.cash.support.chat.backend.api;

import androidx.glance.layout.SpacerKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$OpenLink extends SpacerKt {
    public final String url;

    public Action$OpenLink(String str) {
        str.getClass();
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$OpenLink) && Intrinsics.areEqual(this.url, ((Action$OpenLink) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenLink(url=", this.url, ")");
    }
}
