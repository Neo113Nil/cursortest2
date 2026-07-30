package com.baidu.ar;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class ca implements q6 {

    /* renamed from: a, reason: collision with root package name */
    public q6 f1903a;

    public ca() {
        Constructor<?> a8 = ab.a("com.baidu.ar.statistic.performance.PerformanceStatisticApi", (Class<?>[]) new Class[0]);
        if (a8 != null) {
            this.f1903a = (q6) ab.a(a8, new Object[0]);
        }
    }

    @Override // com.baidu.ar.q6
    public void onFrameIn() {
        q6 q6Var = this.f1903a;
        if (q6Var != null) {
            q6Var.onFrameIn();
        }
    }

    @Override // com.baidu.ar.q6
    public void onFrameOut() {
        q6 q6Var = this.f1903a;
        if (q6Var != null) {
            q6Var.onFrameOut();
        }
    }
}
