package y0;

import L1.z;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f8817a;

    /* renamed from: b, reason: collision with root package name */
    public final e f8818b;

    /* renamed from: c, reason: collision with root package name */
    public float f8819c;

    public j(int i3, e eVar) {
        this.f8817a = i3;
        this.f8818b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(float f3, R1.c cVar) {
        i iVar;
        int i3;
        j jVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i4 = iVar.f8816g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iVar.f8816g = i4 - Integer.MIN_VALUE;
                Object obj = iVar.f8814e;
                Q1.a aVar = Q1.a.f3113d;
                i3 = iVar.f8816g;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    Float f4 = new Float(f3);
                    iVar.f8813d = this;
                    iVar.f8816g = 1;
                    obj = this.f8818b.g(f4, iVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    jVar = this;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = iVar.f8813d;
                    I2.l.Q(obj);
                }
                jVar.f8819c += ((Number) obj).floatValue();
                return z.f2729a;
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.f8814e;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = iVar.f8816g;
        if (i3 != 0) {
        }
        jVar.f8819c += ((Number) obj2).floatValue();
        return z.f2729a;
    }
}
