package d2;

import a2.C0162b;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f8291a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8293c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8294d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f8295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8296f;

    public p(com.google.android.gms.common.internal.a aVar, int i4, Bundle bundle) {
        this.f8296f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f8293c = aVar;
        this.f8291a = bool;
        this.f8292b = false;
        this.f8294d = i4;
        this.f8295e = bundle;
    }

    public abstract void a(C0162b c0162b);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f8291a = null;
        }
        synchronized (this.f8293c.f5788k) {
            this.f8293c.f5788k.remove(this);
        }
    }
}
