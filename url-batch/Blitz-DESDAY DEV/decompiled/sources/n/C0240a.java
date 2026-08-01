package n;

import java.util.HashMap;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240a extends C0245f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f3213e = new HashMap();

    @Override // n.C0245f
    public final C0242c a(Object obj) {
        return (C0242c) this.f3213e.get(obj);
    }

    @Override // n.C0245f
    public final Object b(Object obj) {
        Object b2 = super.b(obj);
        this.f3213e.remove(obj);
        return b2;
    }
}
