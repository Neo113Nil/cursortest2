package U0;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f2573a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f2575c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2576d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f2577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f2578f;

    public q(com.google.android.gms.common.internal.a aVar, int i7, Bundle bundle) {
        this.f2578f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f2575c = aVar;
        this.f2573a = bool;
        this.f2574b = false;
        this.f2576d = i7;
        this.f2577e = bundle;
    }

    public abstract void a(R0.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f2573a = null;
        }
        synchronized (this.f2575c.f3881p) {
            this.f2575c.f3881p.remove(this);
        }
    }
}
