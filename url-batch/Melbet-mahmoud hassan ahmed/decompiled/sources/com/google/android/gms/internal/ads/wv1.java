package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes.dex */
public final class wv1 {

    /* renamed from: a, reason: collision with root package name */
    private final cw1 f13950a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f13951b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f13952c;

    public wv1(cw1 cw1Var, Executor executor) {
        this.f13950a = cw1Var;
        this.f13952c = cw1Var.c();
        this.f13951b = executor;
    }

    public final vv1 a() {
        vv1 vv1Var = new vv1(this);
        vv1.a(vv1Var);
        return vv1Var;
    }
}
