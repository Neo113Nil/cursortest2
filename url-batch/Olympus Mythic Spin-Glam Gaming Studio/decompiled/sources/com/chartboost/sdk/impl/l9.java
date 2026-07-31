package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class l9 implements ak {
    public final String a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l9) && Intrinsics.areEqual(this.a, ((l9) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "IFrameResource(url=" + this.a + ")";
    }

    public l9(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}
