package m4;

import android.os.Bundle;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f6379a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f6381c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6382d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f6383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f6384f;

    public l(com.google.android.gms.common.internal.a aVar, int i7, Bundle bundle) {
        this.f6384f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f6381c = aVar;
        this.f6379a = bool;
        this.f6380b = false;
        this.f6382d = i7;
        this.f6383e = bundle;
    }

    public abstract void a(j4.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f6379a = null;
        }
        synchronized (this.f6381c.f1789k) {
            this.f6381c.f1789k.remove(this);
        }
    }
}
