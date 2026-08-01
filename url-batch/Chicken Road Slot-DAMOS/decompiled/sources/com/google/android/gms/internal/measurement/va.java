package com.google.android.gms.internal.measurement;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class va implements a8.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a8.m f2883e;

    public /* synthetic */ va(a8.m mVar, int i3) {
        this.f2882d = i3;
        this.f2883e = mVar;
    }

    @Override // a8.m
    public final Object get() {
        int i3 = this.f2882d;
        a8.m mVar = this.f2883e;
        switch (i3) {
            case 0:
                Object obj = sa.j;
                return (jd) ((a8.g) mVar.get()).c();
            default:
                f8.u0 u0Var = (f8.u0) mVar.get();
                u0Var.getClass();
                f8.z0 z0Var = new f8.z0(y6.f3009i);
                return new f8.s0(z0Var, u0Var.f4186e.schedule(z0Var, 10000L, TimeUnit.MILLISECONDS));
        }
    }
}
