package G2;

import F2.g;
import F2.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final i f842a;

    public b(i iVar) {
        this.f842a = iVar;
    }

    public static b a(F2.b bVar) {
        i iVar = (i) bVar;
        if (g.NATIVE != ((g) iVar.f782b.f14270b)) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
        if (iVar.f786f) {
            throw new IllegalStateException("AdSession is started");
        }
        V3.b.e(iVar);
        M2.a aVar = iVar.f785e;
        if (aVar.f1752d != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
        b bVar2 = new b(iVar);
        aVar.f1752d = bVar2;
        return bVar2;
    }
}
