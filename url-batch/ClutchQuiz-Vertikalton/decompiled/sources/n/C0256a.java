package n;

import java.util.HashMap;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256a extends f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f3102e = new HashMap();

    @Override // n.f
    public final c a(Object obj) {
        return (c) this.f3102e.get(obj);
    }

    @Override // n.f
    public final Object b(Object obj) {
        Object b2 = super.b(obj);
        this.f3102e.remove(obj);
        return b2;
    }
}
