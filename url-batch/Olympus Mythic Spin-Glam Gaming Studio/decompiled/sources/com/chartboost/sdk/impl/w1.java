package com.chartboost.sdk.impl;

/* loaded from: classes6.dex */
public class w1 implements Runnable {
    public final v1 b;
    public final boolean c;

    public w1(v1 v1Var, boolean z, int i) {
        this.b = v1Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.a(this.c);
    }
}
