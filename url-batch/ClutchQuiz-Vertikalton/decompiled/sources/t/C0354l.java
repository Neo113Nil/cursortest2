package t;

import java.util.ArrayList;

/* renamed from: t.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0358p f3702a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3703b;

    public static long a(C0348f c0348f, long j2) {
        AbstractC0358p abstractC0358p = c0348f.d;
        if (abstractC0358p instanceof C0352j) {
            return j2;
        }
        ArrayList arrayList = c0348f.f3697k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0346d interfaceC0346d = (InterfaceC0346d) arrayList.get(i);
            if (interfaceC0346d instanceof C0348f) {
                C0348f c0348f2 = (C0348f) interfaceC0346d;
                if (c0348f2.d != abstractC0358p) {
                    j3 = Math.min(j3, a(c0348f2, c0348f2.f3694f + j2));
                }
            }
        }
        if (c0348f != abstractC0358p.i) {
            return j3;
        }
        long j4 = abstractC0358p.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(abstractC0358p.h, j5)), j5 - r9.f3694f);
    }

    public static long b(C0348f c0348f, long j2) {
        AbstractC0358p abstractC0358p = c0348f.d;
        if (abstractC0358p instanceof C0352j) {
            return j2;
        }
        ArrayList arrayList = c0348f.f3697k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0346d interfaceC0346d = (InterfaceC0346d) arrayList.get(i);
            if (interfaceC0346d instanceof C0348f) {
                C0348f c0348f2 = (C0348f) interfaceC0346d;
                if (c0348f2.d != abstractC0358p) {
                    j3 = Math.max(j3, b(c0348f2, c0348f2.f3694f + j2));
                }
            }
        }
        if (c0348f != abstractC0358p.h) {
            return j3;
        }
        long j4 = abstractC0358p.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(abstractC0358p.i, j5)), j5 - r9.f3694f);
    }
}
