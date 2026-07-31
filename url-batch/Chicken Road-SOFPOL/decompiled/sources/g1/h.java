package g1;

import o.x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final x f2852a;

    static {
        q qVar = d.f2825e;
        int i = qVar.f2820c;
        e eVar = new e(qVar, qVar, 1);
        int i8 = qVar.f2820c;
        l lVar = d.f2843x;
        int i9 = (lVar.f2820c << 6) | i8;
        g gVar = new g(qVar, lVar, 0);
        int i10 = (i8 << 6) | lVar.f2820c;
        g gVar2 = new g(lVar, qVar, 0);
        x xVar = o.m.f5510a;
        x xVar2 = new x();
        xVar2.g(i | (i << 6), eVar);
        xVar2.g(i9, gVar);
        xVar2.g(i10, gVar2);
        f2852a = xVar2;
    }
}
