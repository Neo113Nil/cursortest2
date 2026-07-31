package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class dj {
    public final String a;

    public dj(String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        this.a = actionName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dj) && Intrinsics.areEqual(this.a, ((dj) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "UrlActionResult(actionName=" + this.a + ")";
    }

    public final String a() {
        return this.a;
    }
}
