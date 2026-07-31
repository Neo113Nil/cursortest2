package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class e9 implements ak {
    public final String a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9) && Intrinsics.areEqual(this.a, ((e9) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "HtmlResource(html=" + this.a + ")";
    }

    public e9(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}
