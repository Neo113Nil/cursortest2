package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kt0;

/* loaded from: classes3.dex */
public final class v52 {

    /* renamed from: a, reason: collision with root package name */
    public final int f33511a;

    /* renamed from: b, reason: collision with root package name */
    public final uo1[] f33512b;

    /* renamed from: c, reason: collision with root package name */
    public final x60[] f33513c;

    /* renamed from: d, reason: collision with root package name */
    public final q62 f33514d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f33515e;

    public v52(uo1[] uo1VarArr, x60[] x60VarArr, q62 q62Var, kt0.a aVar) {
        this.f33512b = uo1VarArr;
        this.f33513c = (x60[]) x60VarArr.clone();
        this.f33514d = q62Var;
        this.f33515e = aVar;
        this.f33511a = uo1VarArr.length;
    }

    public final boolean a(int i4) {
        return this.f33512b[i4] != null;
    }
}
