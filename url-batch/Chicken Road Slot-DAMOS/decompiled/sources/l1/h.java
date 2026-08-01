package l1;

import s.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final w f5787a;

    static {
        q qVar = d.f5762e;
        int i3 = qVar.f5757c;
        e eVar = new e(qVar, qVar, 1);
        int i10 = qVar.f5757c;
        l lVar = d.f5779x;
        int i11 = (lVar.f5757c << 6) | i10;
        g gVar = new g(qVar, lVar, 0);
        int i12 = (i10 << 6) | lVar.f5757c;
        g gVar2 = new g(lVar, qVar, 0);
        w wVar = s.l.f8343a;
        w wVar2 = new w();
        wVar2.h(i3 | (i3 << 6), eVar);
        wVar2.h(i11, gVar);
        wVar2.h(i12, gVar2);
        f5787a = wVar2;
    }
}
