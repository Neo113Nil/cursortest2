package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jz1 {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f7306a;

    /* renamed from: b, reason: collision with root package name */
    private final dc3 f7307b;

    /* renamed from: c, reason: collision with root package name */
    private final s02 f7308c;

    /* renamed from: d, reason: collision with root package name */
    private final ev3<m22> f7309d;

    public jz1(dc3 dc3Var, dc3 dc3Var2, s02 s02Var, ev3<m22> ev3Var) {
        this.f7306a = dc3Var;
        this.f7307b = dc3Var2;
        this.f7308c = s02Var;
        this.f7309d = ev3Var;
    }

    final /* synthetic */ cc3 a(vi0 vi0Var, int i7, k12 k12Var) {
        return this.f7309d.a().t6(vi0Var, i7);
    }

    public final cc3<InputStream> b(final vi0 vi0Var) {
        String str = vi0Var.f13404i;
        y2.t.q();
        cc3 h7 = a3.g2.g(str) ? rb3.h(new k12(1)) : rb3.g(this.f7306a.E(new Callable() { // from class: com.google.android.gms.internal.ads.iz1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return jz1.this.c(vi0Var);
            }
        }), ExecutionException.class, new xa3() { // from class: com.google.android.gms.internal.ads.hz1
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return rb3.h(((ExecutionException) obj).getCause());
            }
        }, this.f7307b);
        final int callingUid = Binder.getCallingUid();
        return rb3.g(h7, k12.class, new xa3() { // from class: com.google.android.gms.internal.ads.gz1
            @Override // com.google.android.gms.internal.ads.xa3
            public final cc3 c(Object obj) {
                return jz1.this.a(vi0Var, callingUid, (k12) obj);
            }
        }, this.f7307b);
    }

    final /* synthetic */ InputStream c(vi0 vi0Var) {
        bp0<InputStream> bp0Var;
        final s02 s02Var = this.f7308c;
        synchronized (s02Var.f12534b) {
            if (s02Var.f12535c) {
                bp0Var = s02Var.f12533a;
            } else {
                s02Var.f12535c = true;
                s02Var.f12537e = vi0Var;
                s02Var.f12538f.q();
                s02Var.f12533a.b(new Runnable() { // from class: com.google.android.gms.internal.ads.r02
                    @Override // java.lang.Runnable
                    public final void run() {
                        s02.this.a();
                    }
                }, wo0.f13899f);
                bp0Var = s02Var.f12533a;
            }
        }
        return bp0Var.get(((Integer) sw.c().b(m10.W3)).intValue(), TimeUnit.SECONDS);
    }
}
