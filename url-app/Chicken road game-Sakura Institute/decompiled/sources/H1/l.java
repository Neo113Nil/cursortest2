package H1;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f3277a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3278b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f3279c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3280d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f3281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f3282f;

    public l(com.google.android.gms.common.internal.a aVar, int i2, Bundle bundle) {
        this.f3282f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f3279c = aVar;
        this.f3277a = bool;
        this.f3278b = false;
        this.f3280d = i2;
        this.f3281e = bundle;
    }

    public abstract void a(E1.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f3277a = null;
        }
        synchronized (this.f3279c.f6044k) {
            this.f3279c.f6044k.remove(this);
        }
    }
}
