package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class hf {
    public final jf a;
    public final Function0 b;

    public hf(jf target, Function0 onReached) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onReached, "onReached");
        this.a = target;
        this.b = onReached;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf)) {
            return false;
        }
        hf hfVar = (hf) obj;
        return Intrinsics.areEqual(this.a, hfVar.a) && Intrinsics.areEqual(this.b, hfVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "ProgressEvent(target=" + this.a + ", onReached=" + this.b + ")";
    }

    public final jf b() {
        return this.a;
    }

    public final Function0 a() {
        return this.b;
    }
}
