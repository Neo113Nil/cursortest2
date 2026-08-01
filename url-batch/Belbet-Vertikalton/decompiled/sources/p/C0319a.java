package p;

import java.util.HashMap;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319a extends f {
    public final HashMap e = new HashMap();

    @Override // p.f
    public final c a(Object obj) {
        return (c) this.e.get(obj);
    }

    @Override // p.f
    public final Object b(Object obj) {
        Object b2 = super.b(obj);
        this.e.remove(obj);
        return b2;
    }
}
