package r;

import t0.j0;

/* renamed from: r.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0793E extends U.k implements j0 {

    /* renamed from: q, reason: collision with root package name */
    public float f6997q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6998r;

    @Override // t0.j0
    public final Object T(Object obj) {
        C0800L c0800l = obj instanceof C0800L ? (C0800L) obj : null;
        if (c0800l == null) {
            c0800l = new C0800L();
            c0800l.f7011a = 0.0f;
            c0800l.f7012b = true;
        }
        c0800l.f7011a = this.f6997q;
        c0800l.f7012b = this.f6998r;
        return c0800l;
    }
}
