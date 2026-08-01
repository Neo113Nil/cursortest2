package n;

import java.util.HashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f2739j = new HashMap();

    @Override // n.f
    public final c a(Object obj) {
        return (c) this.f2739j.get(obj);
    }

    @Override // n.f
    public final Object b(Object obj) {
        Object b2 = super.b(obj);
        this.f2739j.remove(obj);
        return b2;
    }
}
