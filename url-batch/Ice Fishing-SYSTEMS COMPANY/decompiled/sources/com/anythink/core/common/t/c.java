package com.anythink.core.common.t;

import android.os.SystemClock;
import com.anythink.core.common.d.t;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    long f16591a;

    /* renamed from: b, reason: collision with root package name */
    long f16592b;

    /* renamed from: c, reason: collision with root package name */
    Runnable f16593c;

    /* renamed from: d, reason: collision with root package name */
    boolean f16594d;

    /* renamed from: e, reason: collision with root package name */
    boolean f16595e;

    /* renamed from: f, reason: collision with root package name */
    b f16596f;

    /* renamed from: g, reason: collision with root package name */
    private final a f16597g;

    public c(long j9, Runnable runnable) {
        this.f16594d = false;
        this.f16595e = true;
        this.f16597g = d.a();
        this.f16596f = new b() { // from class: com.anythink.core.common.t.c.1
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                cVar.f16594d = false;
                cVar.f16592b = -1L;
                if (cVar.f16595e) {
                    t.b().b(c.this.f16593c);
                } else {
                    t.b();
                    t.c(c.this.f16593c);
                }
            }
        };
        this.f16592b = j9;
        this.f16593c = runnable;
    }

    public final synchronized void a() {
        if (this.f16592b >= 0 && !this.f16594d) {
            this.f16594d = true;
            this.f16591a = SystemClock.elapsedRealtime();
            this.f16597g.a(this.f16596f, this.f16592b, false);
        }
    }

    public final synchronized void b() {
        if (this.f16594d) {
            this.f16594d = false;
            this.f16592b -= SystemClock.elapsedRealtime() - this.f16591a;
            this.f16597g.b(this.f16596f);
        }
    }

    public final synchronized void c() {
        this.f16594d = false;
        this.f16597g.b(this.f16596f);
        this.f16592b = -1L;
    }

    public c(long j9, Runnable runnable, boolean z8) {
        this(j9, runnable);
        this.f16595e = z8;
    }
}
