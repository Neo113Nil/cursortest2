package c2;

import c6.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f1602a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1603b;

    /* renamed from: c, reason: collision with root package name */
    public float f1604c;

    public i(int i, d dVar) {
        this.f1602a = i;
        this.f1603b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(float f6, i6.c cVar) {
        h hVar;
        int i;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i8 = hVar.i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                hVar.i = i8 - Integer.MIN_VALUE;
                Object obj = hVar.f1600g;
                i = hVar.i;
                if (i != 0) {
                    s6.a.K(obj);
                    Float f8 = new Float(f6);
                    hVar.i = 1;
                    obj = this.f1603b.g(f8, hVar);
                    h6.a aVar = h6.a.f3204d;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                this.f1604c += ((Number) obj).floatValue();
                return m.f1757a;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f1600g;
        i = hVar.i;
        if (i != 0) {
        }
        this.f1604c += ((Number) obj2).floatValue();
        return m.f1757a;
    }
}
