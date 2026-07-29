package com.ironsource.b.d;

import com.ironsource.b.d.c;

/* compiled from: PublisherLogger.java */
/* loaded from: classes2.dex */
public class f extends c {

    /* renamed from: b, reason: collision with root package name */
    private e f6770b;

    private f() {
        super("publisher");
    }

    public f(e eVar, int i) {
        super("publisher", i);
        this.f6770b = eVar;
    }

    @Override // com.ironsource.b.d.c
    public synchronized void a(c.a aVar, String str, int i) {
        if (this.f6770b != null && str != null) {
            this.f6770b.b(aVar, str, i);
        }
    }

    @Override // com.ironsource.b.d.c
    public void a(c.a aVar, String str, Throwable th) {
        if (th != null) {
            a(aVar, th.getMessage(), 3);
        }
    }
}
