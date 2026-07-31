package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class ti1 {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f12226a;

    /* renamed from: b, reason: collision with root package name */
    private final cy2 f12227b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12228c;

    public ti1(rr2 rr2Var, cy2 cy2Var) {
        this.f12226a = rr2Var.f11394q;
        this.f12227b = cy2Var;
    }

    public final void a() {
        if (this.f12228c) {
            return;
        }
        this.f12227b.c(this.f12226a);
        this.f12228c = true;
    }
}
