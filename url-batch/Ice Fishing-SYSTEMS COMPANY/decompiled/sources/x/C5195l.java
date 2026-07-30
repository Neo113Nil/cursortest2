package x;

import java.util.ArrayList;

/* renamed from: x.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5195l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5199p f41747a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f41748b;

    public static long a(C5189f c5189f, long j9) {
        AbstractC5199p abstractC5199p = c5189f.f41736d;
        if (abstractC5199p instanceof C5193j) {
            return j9;
        }
        ArrayList arrayList = c5189f.f41742k;
        int size = arrayList.size();
        long j10 = j9;
        for (int i = 0; i < size; i++) {
            InterfaceC5187d interfaceC5187d = (InterfaceC5187d) arrayList.get(i);
            if (interfaceC5187d instanceof C5189f) {
                C5189f c5189f2 = (C5189f) interfaceC5187d;
                if (c5189f2.f41736d != abstractC5199p) {
                    j10 = Math.min(j10, a(c5189f2, c5189f2.f41738f + j9));
                }
            }
        }
        if (c5189f != abstractC5199p.i) {
            return j10;
        }
        long j11 = abstractC5199p.j();
        long j12 = j9 - j11;
        return Math.min(Math.min(j10, a(abstractC5199p.f41764h, j12)), j12 - r9.f41738f);
    }

    public static long b(C5189f c5189f, long j9) {
        AbstractC5199p abstractC5199p = c5189f.f41736d;
        if (abstractC5199p instanceof C5193j) {
            return j9;
        }
        ArrayList arrayList = c5189f.f41742k;
        int size = arrayList.size();
        long j10 = j9;
        for (int i = 0; i < size; i++) {
            InterfaceC5187d interfaceC5187d = (InterfaceC5187d) arrayList.get(i);
            if (interfaceC5187d instanceof C5189f) {
                C5189f c5189f2 = (C5189f) interfaceC5187d;
                if (c5189f2.f41736d != abstractC5199p) {
                    j10 = Math.max(j10, b(c5189f2, c5189f2.f41738f + j9));
                }
            }
        }
        if (c5189f != abstractC5199p.f41764h) {
            return j10;
        }
        long j11 = abstractC5199p.j();
        long j12 = j9 + j11;
        return Math.max(Math.max(j10, b(abstractC5199p.i, j12)), j12 - r9.f41738f);
    }
}
