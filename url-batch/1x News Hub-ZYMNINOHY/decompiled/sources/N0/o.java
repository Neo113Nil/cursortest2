package N0;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f1049a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1051c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1052d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f1053e;
    public final /* synthetic */ com.google.android.gms.common.internal.a f;

    public o(com.google.android.gms.common.internal.a aVar, int i3, Bundle bundle) {
        this.f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f1051c = aVar;
        this.f1049a = bool;
        this.f1050b = false;
        this.f1052d = i3;
        this.f1053e = bundle;
    }

    public abstract void a(K0.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f1049a = null;
        }
        synchronized (this.f1051c.f2691k) {
            this.f1051c.f2691k.remove(this);
        }
    }
}
