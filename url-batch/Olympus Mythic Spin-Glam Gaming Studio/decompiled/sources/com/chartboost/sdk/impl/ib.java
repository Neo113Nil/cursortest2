package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class ib {
    public final int a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ib) && this.a == ((ib) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return "InterruptionConfig(audioFocusType=" + this.a + ")";
    }

    public ib(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public /* synthetic */ ib(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i);
    }
}
