package t;

import android.content.Context;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6797a;

    /* renamed from: b, reason: collision with root package name */
    public final r2.c f6798b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6799c;

    /* renamed from: d, reason: collision with root package name */
    public final x.f0 f6800d;

    public k(Context context, r2.c cVar, long j7, x.f0 f0Var) {
        this.f6797a = context;
        this.f6798b = cVar;
        this.f6799c = j7;
        this.f6800d = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        q6.i.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        k kVar = (k) obj;
        return q6.i.a(this.f6797a, kVar.f6797a) && q6.i.a(this.f6798b, kVar.f6798b) && f1.s.c(this.f6799c, kVar.f6799c) && q6.i.a(this.f6800d, kVar.f6800d);
    }

    public final int hashCode() {
        int hashCode = (this.f6798b.hashCode() + (this.f6797a.hashCode() * 31)) * 31;
        int i = f1.s.i;
        return this.f6800d.hashCode() + a0.q.c(hashCode, 31, this.f6799c);
    }
}
