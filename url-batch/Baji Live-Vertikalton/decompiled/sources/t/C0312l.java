package t;

import java.util.ArrayList;

/* renamed from: t.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0315o f3763a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3764b;

    public static long a(C0306f c0306f, long j2) {
        AbstractC0315o abstractC0315o = c0306f.d;
        if (abstractC0315o instanceof C0310j) {
            return j2;
        }
        ArrayList arrayList = c0306f.f3758k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0304d interfaceC0304d = (InterfaceC0304d) arrayList.get(i);
            if (interfaceC0304d instanceof C0306f) {
                C0306f c0306f2 = (C0306f) interfaceC0304d;
                if (c0306f2.d != abstractC0315o) {
                    j3 = Math.min(j3, a(c0306f2, c0306f2.f3755f + j2));
                }
            }
        }
        if (c0306f != abstractC0315o.i) {
            return j3;
        }
        long j4 = abstractC0315o.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(abstractC0315o.h, j5)), j5 - r9.f3755f);
    }

    public static long b(C0306f c0306f, long j2) {
        AbstractC0315o abstractC0315o = c0306f.d;
        if (abstractC0315o instanceof C0310j) {
            return j2;
        }
        ArrayList arrayList = c0306f.f3758k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0304d interfaceC0304d = (InterfaceC0304d) arrayList.get(i);
            if (interfaceC0304d instanceof C0306f) {
                C0306f c0306f2 = (C0306f) interfaceC0304d;
                if (c0306f2.d != abstractC0315o) {
                    j3 = Math.max(j3, b(c0306f2, c0306f2.f3755f + j2));
                }
            }
        }
        if (c0306f != abstractC0315o.h) {
            return j3;
        }
        long j4 = abstractC0315o.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(abstractC0315o.i, j5)), j5 - r9.f3755f);
    }
}
