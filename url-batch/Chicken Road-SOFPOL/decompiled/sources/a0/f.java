package a0;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f implements y0.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f72a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f73b = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(i6.c cVar) {
        e eVar;
        int i;
        q6.s sVar;
        Throwable th;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i8 = eVar.f53j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f53j = i8 - Integer.MIN_VALUE;
                Object obj = eVar.f52h;
                i = eVar.f53j;
                ArrayList arrayList = this.f73b;
                if (i != 0) {
                    s6.a.K(obj);
                    if (!this.f72a) {
                        q6.s sVar2 = new q6.s();
                        try {
                            eVar.f51g = sVar2;
                            eVar.f53j = 1;
                            a7.h hVar = new a7.h(1, m.a.G(eVar));
                            hVar.t();
                            sVar2.f6205d = hVar;
                            arrayList.add(hVar);
                            Object s5 = hVar.s();
                            h6.a aVar = h6.a.f3204d;
                            if (s5 == aVar) {
                                return aVar;
                            }
                            sVar = sVar2;
                        } catch (Throwable th2) {
                            sVar = sVar2;
                            th = th2;
                            Object obj2 = sVar.f6205d;
                            q6.v.a(arrayList);
                            arrayList.remove(obj2);
                            throw th;
                        }
                    }
                    return c6.m.f1757a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = eVar.f51g;
                try {
                    s6.a.K(obj);
                } catch (Throwable th3) {
                    th = th3;
                    Object obj22 = sVar.f6205d;
                    q6.v.a(arrayList);
                    arrayList.remove(obj22);
                    throw th;
                }
                Object obj3 = sVar.f6205d;
                q6.v.a(arrayList);
                arrayList.remove(obj3);
                return c6.m.f1757a;
            }
        }
        eVar = new e(this, cVar);
        Object obj4 = eVar.f52h;
        i = eVar.f53j;
        ArrayList arrayList2 = this.f73b;
        if (i != 0) {
        }
        Object obj32 = sVar.f6205d;
        q6.v.a(arrayList2);
        arrayList2.remove(obj32);
        return c6.m.f1757a;
    }
}
