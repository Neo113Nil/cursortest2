package o;

import java.util.HashMap;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280a extends f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f3394e = new HashMap();

    @Override // o.f
    public final c a(Object obj) {
        return (c) this.f3394e.get(obj);
    }

    @Override // o.f
    public final Object b(Object obj) {
        Object b2 = super.b(obj);
        this.f3394e.remove(obj);
        return b2;
    }
}
