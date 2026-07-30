package t;

import d6.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final i0.d f8715a = new i0.d(new d[16]);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (r8 < r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y0.d dVar, j6.c cVar) {
        b bVar;
        int i7;
        int i8;
        y0.d dVar2;
        int i9;
        Object[] objArr;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f8714l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f8714l = i10 - Integer.MIN_VALUE;
                Object obj = bVar.f8712j;
                i7 = bVar.f8714l;
                if (i7 != 0) {
                    d6.a.e(obj);
                    i0.d dVar3 = this.f8715a;
                    i8 = dVar3.f4842h;
                    if (i8 > 0) {
                        Object[] objArr2 = dVar3.f4840f;
                        dVar2 = dVar;
                        i9 = 0;
                        objArr = objArr2;
                        d dVar4 = (d) objArr[i9];
                        bVar.f8708f = dVar2;
                        bVar.f8709g = objArr;
                        bVar.f8710h = i8;
                        bVar.f8711i = i9;
                        bVar.f8714l = 1;
                        Object G = a.a.G(dVar4, dVar2, bVar);
                        i6.a aVar = i6.a.f4956f;
                        if (G == aVar) {
                            return aVar;
                        }
                        i9++;
                    }
                    return z.f2639a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i9 = bVar.f8711i;
                i8 = bVar.f8710h;
                objArr = bVar.f8709g;
                y0.d dVar5 = bVar.f8708f;
                d6.a.e(obj);
                dVar2 = dVar5;
                i9++;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f8712j;
        i7 = bVar.f8714l;
        if (i7 != 0) {
        }
    }
}
