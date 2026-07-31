package n;

import java.util.HashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f5230h = new HashMap();

    @Override // n.f
    public final c a(Object obj) {
        return (c) this.f5230h.get(obj);
    }

    @Override // n.f
    public final Object b(Object obj) {
        Object b8 = super.b(obj);
        this.f5230h.remove(obj);
        return b8;
    }
}
