package com.tapjoy.internal;

import com.tapjoy.internal.gg;

/* loaded from: classes2.dex */
public final class fx {

    /* renamed from: a, reason: collision with root package name */
    public fr f8134a;

    /* renamed from: b, reason: collision with root package name */
    public volatile gg.a f8135b;

    /* renamed from: c, reason: collision with root package name */
    public int f8136c;

    /* renamed from: d, reason: collision with root package name */
    public volatile gg.a f8137d;
    public volatile gg.a e;

    public final void a() {
        a(16);
        gg.a aVar = this.f8137d;
        if (aVar != null) {
            this.f8137d = null;
            aVar.b().c();
        }
    }

    public final synchronized void a(int i) {
        gg.a aVar = this.f8135b;
        if (aVar != null && this.f8136c < i) {
            this.f8136c = i | this.f8136c;
            aVar.a("state", Integer.valueOf(this.f8136c)).b().c();
        }
    }
}
