package h;

import java.util.HashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f4572j = new HashMap();

    @Override // h.f
    public final c a(Object obj) {
        return (c) this.f4572j.get(obj);
    }

    @Override // h.f
    public final Object g(Object obj) {
        Object g9 = super.g(obj);
        this.f4572j.remove(obj);
        return g9;
    }
}
