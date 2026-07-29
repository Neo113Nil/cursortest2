package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class hb implements gp {

    /* renamed from: a, reason: collision with root package name */
    private static final hb f8240a = new hb() { // from class: com.tapjoy.internal.hb.1
        @Override // com.tapjoy.internal.hb, com.tapjoy.internal.gp
        public final void a(String str) {
        }

        @Override // com.tapjoy.internal.hb, com.tapjoy.internal.gp
        public final void a(String str, gm gmVar) {
        }

        @Override // com.tapjoy.internal.hb, com.tapjoy.internal.gp
        public final void a(String str, String str2, gm gmVar) {
        }

        @Override // com.tapjoy.internal.hb, com.tapjoy.internal.gp
        public final void b(String str) {
        }

        @Override // com.tapjoy.internal.hb, com.tapjoy.internal.gp
        public final void c(String str) {
        }

        @Override // com.tapjoy.internal.hb, com.tapjoy.internal.gp
        public final void d(String str) {
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final gp f8241b;

    /* renamed from: c, reason: collision with root package name */
    private final ba f8242c;

    /* synthetic */ hb(byte b2) {
        this();
    }

    public static hb a(gp gpVar) {
        if (!(!(gpVar instanceof hb))) {
            throw new IllegalArgumentException();
        }
        if (gpVar != null) {
            return new hb(gpVar);
        }
        return f8240a;
    }

    private hb() {
        this.f8241b = null;
        this.f8242c = null;
    }

    private hb(gp gpVar) {
        Handler handler;
        this.f8241b = gpVar;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            jq.a(myLooper);
            handler = myLooper == Looper.getMainLooper() ? u.a() : new Handler(myLooper);
        } else {
            handler = null;
        }
        if (handler != null) {
            this.f8242c = u.a(handler);
            new Object[1][0] = handler.getLooper();
        } else if (Thread.currentThread() == gs.b()) {
            this.f8242c = gs.f8211a;
        } else {
            this.f8242c = u.a(u.a());
        }
    }

    @Override // com.tapjoy.internal.gp
    public void a(final String str) {
        this.f8242c.a(new Runnable() { // from class: com.tapjoy.internal.hb.2
            @Override // java.lang.Runnable
            public final void run() {
                hb.this.f8241b.a(str);
            }
        });
    }

    @Override // com.tapjoy.internal.gp
    public void b(final String str) {
        this.f8242c.a(new Runnable() { // from class: com.tapjoy.internal.hb.3
            @Override // java.lang.Runnable
            public final void run() {
                hb.this.f8241b.b(str);
            }
        });
    }

    @Override // com.tapjoy.internal.gp
    public void c(final String str) {
        this.f8242c.a(new Runnable() { // from class: com.tapjoy.internal.hb.4
            @Override // java.lang.Runnable
            public final void run() {
                hb.this.f8241b.c(str);
            }
        });
    }

    @Override // com.tapjoy.internal.gp
    public void d(final String str) {
        this.f8242c.a(new Runnable() { // from class: com.tapjoy.internal.hb.5
            @Override // java.lang.Runnable
            public final void run() {
                hb.this.f8241b.d(str);
            }
        });
    }

    @Override // com.tapjoy.internal.gp
    public void a(final String str, final gm gmVar) {
        this.f8242c.a(new Runnable() { // from class: com.tapjoy.internal.hb.6
            @Override // java.lang.Runnable
            public final void run() {
                hb.this.f8241b.a(str, gmVar);
            }
        });
    }

    @Override // com.tapjoy.internal.gp
    public void a(final String str, final String str2, final gm gmVar) {
        this.f8242c.a(new Runnable() { // from class: com.tapjoy.internal.hb.7
            @Override // java.lang.Runnable
            public final void run() {
                hb.this.f8241b.a(str, str2, gmVar);
            }
        });
    }
}
