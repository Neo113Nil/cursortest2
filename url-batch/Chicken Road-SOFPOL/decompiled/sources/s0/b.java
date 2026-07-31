package s0;

import d6.i;
import java.util.Iterator;
import o.h0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends i implements p0.b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f6686g;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6687d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6688e;

    /* renamed from: f, reason: collision with root package name */
    public final r0.b f6689f;

    static {
        t0.b bVar = t0.b.f6894a;
        f6686g = new b(bVar, bVar, r0.b.f6473f);
    }

    public b(Object obj, Object obj2, r0.b bVar) {
        this.f6687d = obj;
        this.f6688e = obj2;
        this.f6689f = bVar;
    }

    @Override // d6.a
    public final int a() {
        r0.b bVar = this.f6689f;
        bVar.getClass();
        return bVar.f6475e;
    }

    @Override // d6.a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f6689f.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h0(this.f6687d, this.f6689f);
    }
}
