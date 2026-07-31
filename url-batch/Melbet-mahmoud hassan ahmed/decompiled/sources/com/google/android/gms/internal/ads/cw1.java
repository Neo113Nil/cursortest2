package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes.dex */
public final class cw1 extends ew1 {

    /* renamed from: g, reason: collision with root package name */
    private final gx2 f3967g;

    public cw1(Executor executor, oo0 oo0Var, gx2 gx2Var, ix2 ix2Var) {
        super(executor, oo0Var, ix2Var);
        this.f3967g = gx2Var;
        gx2Var.a(this.f4785b);
    }

    public final Map<String, String> c() {
        return new HashMap(this.f4785b);
    }
}
