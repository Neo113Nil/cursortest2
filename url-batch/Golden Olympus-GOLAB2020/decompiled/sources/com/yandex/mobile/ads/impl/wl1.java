package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C1933fm;
import com.yandex.mobile.ads.impl.mv;
import com.yandex.mobile.ads.impl.n30;
import com.yandex.mobile.ads.impl.q30;
import com.yandex.mobile.ads.impl.qm;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class wl1 implements q30 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f34113a;

    /* renamed from: b, reason: collision with root package name */
    private final mv f34114b;

    /* renamed from: c, reason: collision with root package name */
    private final C1933fm f34115c;

    /* renamed from: d, reason: collision with root package name */
    private final qm f34116d;

    /* renamed from: e, reason: collision with root package name */
    private q30.a f34117e;

    /* renamed from: f, reason: collision with root package name */
    private volatile us1<Void, IOException> f34118f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f34119g;

    final class a extends us1<Void, IOException> {
        a() {
        }

        @Override // com.yandex.mobile.ads.impl.us1
        protected final void b() {
            wl1.this.f34116d.b();
        }

        @Override // com.yandex.mobile.ads.impl.us1
        protected final void c() {
            wl1.this.f34116d.a();
        }
    }

    public wl1(rv0 rv0Var, C1933fm.a aVar, Executor executor) {
        this.f34113a = (Executor) C2253tf.a(executor);
        C2253tf.a(rv0Var.f31379c);
        mv a4 = new mv.a().a(rv0Var.f31379c.f31427a).a(rv0Var.f31379c.f31431e).a(4).a();
        this.f34114b = a4;
        C1933fm b4 = aVar.b();
        this.f34115c = b4;
        this.f34116d = new qm(b4, a4, new qm.a() { // from class: com.yandex.mobile.ads.impl.Kk
            @Override // com.yandex.mobile.ads.impl.qm.a
            public final void a(long j4, long j5, long j6) {
                wl1.this.a(j4, j5, j6);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.q30
    public final void cancel() {
        this.f34119g = true;
        us1<Void, IOException> us1Var = this.f34118f;
        if (us1Var != null) {
            us1Var.cancel(true);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q30
    public final void remove() {
        this.f34115c.f().a(this.f34115c.g().a(this.f34114b));
    }

    @Override // com.yandex.mobile.ads.impl.q30
    public final void a(q30.a aVar) {
        this.f34117e = aVar;
        this.f34118f = new a();
        boolean z4 = false;
        while (!z4) {
            try {
                if (this.f34119g) {
                    break;
                }
                this.f34113a.execute(this.f34118f);
                try {
                    this.f34118f.get();
                    z4 = true;
                } catch (ExecutionException e4) {
                    Throwable cause = e4.getCause();
                    cause.getClass();
                    if (!(cause instanceof xk1)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i4 = u82.f32873a;
                        throw cause;
                    }
                }
            } finally {
                this.f34118f.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j4, long j5, long j6) {
        q30.a aVar = this.f34117e;
        if (aVar == null) {
            return;
        }
        ((n30.d) aVar).a(j4, j5, (j4 == -1 || j4 == 0) ? -1.0f : (j5 * 100.0f) / j4);
    }
}
