package w1;

import ge.x;
import kotlin.collections.i0;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public h f10009a;

    /* renamed from: b, reason: collision with root package name */
    public h f10010b;

    /* renamed from: c, reason: collision with root package name */
    public p f10011c;

    /* renamed from: d, reason: collision with root package name */
    public x f10012d;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if (r14 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        if (r14 == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j3, nd.c cVar) {
        a aVar;
        int i3;
        long j10;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i10 = aVar.f10005i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f10005i = i10 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.f10003d;
                md.a aVar3 = md.a.f6622d;
                i3 = aVar2.f10005i;
                if (i3 != 0) {
                    cf.c.M(obj);
                    h hVar = this.f10009a;
                    j10 = 0;
                    if ((hVar != null ? hVar.J() : null) == null) {
                        h hVar2 = this.f10010b;
                        if (hVar2 != null) {
                            aVar2.f10005i = 1;
                            obj = hVar2.K(j, j3, aVar2);
                        }
                    } else {
                        h hVar3 = this.f10009a;
                        h J = hVar3 != null ? hVar3.J() : null;
                        if (J != null) {
                            aVar2.f10005i = 2;
                            obj = J.K(j, j3, aVar2);
                        } else {
                            j10 = 0;
                        }
                    }
                } else if (i3 == 1) {
                    cf.c.M(obj);
                    j10 = ((x2.p) obj).f10338a;
                } else {
                    if (i3 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                    j10 = ((x2.p) obj).f10338a;
                }
                return new x2.p(j10);
            }
        }
        aVar = new a(this, cVar);
        a aVar22 = aVar;
        Object obj2 = aVar22.f10003d;
        md.a aVar32 = md.a.f6622d;
        i3 = aVar22.f10005i;
        if (i3 != 0) {
        }
        return new x2.p(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, nd.c cVar) {
        b bVar;
        int i3;
        long j3;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f10008i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f10008i = i10 - Integer.MIN_VALUE;
                Object obj = bVar.f10006d;
                md.a aVar = md.a.f6622d;
                i3 = bVar.f10008i;
                if (i3 != 0) {
                    cf.c.M(obj);
                    h hVar = this.f10009a;
                    h J = hVar != null ? hVar.J() : null;
                    if (J == null) {
                        j3 = 0;
                        return new x2.p(j3);
                    }
                    bVar.f10008i = 1;
                    obj = J.M(j, bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                j3 = ((x2.p) obj).f10338a;
                return new x2.p(j3);
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f10006d;
        md.a aVar2 = md.a.f6622d;
        i3 = bVar.f10008i;
        if (i3 != 0) {
        }
        j3 = ((x2.p) obj2).f10338a;
        return new x2.p(j3);
    }
}
