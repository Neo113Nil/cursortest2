package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e02 {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f4411a;

    /* renamed from: b, reason: collision with root package name */
    private final dc3 f4412b;

    /* renamed from: c, reason: collision with root package name */
    private final w02 f4413c;

    /* renamed from: d, reason: collision with root package name */
    private final ev3<m22> f4414d;

    public e02(ScheduledExecutorService scheduledExecutorService, dc3 dc3Var, w02 w02Var, ev3<m22> ev3Var) {
        this.f4411a = scheduledExecutorService;
        this.f4412b = dc3Var;
        this.f4413c = w02Var;
        this.f4414d = ev3Var;
    }

    final /* synthetic */ cc3 a(vi0 vi0Var, int i7, Throwable th) {
        return this.f4414d.a().u6(vi0Var, i7);
    }

    public final cc3<InputStream> b(final vi0 vi0Var) {
        cc3 cc3Var;
        String str = vi0Var.f13404i;
        y2.t.q();
        if (a3.g2.g(str)) {
            cc3Var = rb3.h(new k12(1));
        } else {
            final w02 w02Var = this.f4413c;
            synchronized (w02Var.f12534b) {
                if (w02Var.f12535c) {
                    cc3Var = w02Var.f12533a;
                } else {
                    w02Var.f12535c = true;
                    w02Var.f12537e = vi0Var;
                    w02Var.f12538f.q();
                    w02Var.f12533a.b(new Runnable() { // from class: com.google.android.gms.internal.ads.v02
                        @Override // java.lang.Runnable
                        public final void run() {
                            w02.this.a();
                        }
                    }, wo0.f13899f);
                    cc3Var = w02Var.f12533a;
                }
            }
        }
        final int callingUid = Binder.getCallingUid();
        return rb3.g((ib3) rb3.o(ib3.E(cc3Var), ((Integer) sw.c().b(m10.W3)).intValue(), TimeUnit.SECONDS, this.f4411a), Throwable.class, new xa3() { // from class: com.google.android.gms.internal.ads.d02
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return e02.this.a(vi0Var, callingUid, (Throwable) obj);
            }
        }, this.f4412b);
    }
}
