package t;

import kotlin.Unit;
import m3.u;
import y2.AbstractC1343r;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1199c {

    /* renamed from: a, reason: collision with root package name */
    public final I.d f10616a = new I.d(new C1200d[16]);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Y.d dVar, E2.c cVar) {
        C1198b c1198b;
        int i2;
        int i4;
        Y.d dVar2;
        int i5;
        Object[] objArr;
        if (cVar instanceof C1198b) {
            c1198b = (C1198b) cVar;
            int i6 = c1198b.f10615p;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c1198b.f10615p = i6 - Integer.MIN_VALUE;
                Object obj = c1198b.f10613n;
                D2.a aVar = D2.a.f2163d;
                i2 = c1198b.f10615p;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    I.d dVar3 = this.f10616a;
                    i4 = dVar3.f3332i;
                    if (i4 > 0) {
                        Object[] objArr2 = dVar3.f3330d;
                        dVar2 = dVar;
                        i5 = 0;
                        objArr = objArr2;
                        C1200d c1200d = (C1200d) objArr[i5];
                        c1198b.f10609j = dVar2;
                        c1198b.f10610k = objArr;
                        c1198b.f10611l = i4;
                        c1198b.f10612m = i5;
                        c1198b.f10615p = 1;
                        if (u.i(c1200d, dVar2, c1198b) == aVar) {
                            return aVar;
                        }
                        i5++;
                    }
                    return Unit.f7487a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = c1198b.f10612m;
                i4 = c1198b.f10611l;
                objArr = c1198b.f10610k;
                Y.d dVar4 = c1198b.f10609j;
                AbstractC1343r.b(obj);
                dVar2 = dVar4;
                i5++;
            }
        }
        c1198b = new C1198b(this, cVar);
        Object obj2 = c1198b.f10613n;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c1198b.f10615p;
        if (i2 != 0) {
        }
    }
}
