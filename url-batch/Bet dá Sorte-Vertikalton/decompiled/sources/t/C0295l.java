package t;

import java.util.ArrayList;

/* renamed from: t.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0298o f3806a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3807b;

    public static long a(C0289f c0289f, long j2) {
        AbstractC0298o abstractC0298o = c0289f.d;
        if (abstractC0298o instanceof C0293j) {
            return j2;
        }
        ArrayList arrayList = c0289f.f3801k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0287d interfaceC0287d = (InterfaceC0287d) arrayList.get(i);
            if (interfaceC0287d instanceof C0289f) {
                C0289f c0289f2 = (C0289f) interfaceC0287d;
                if (c0289f2.d != abstractC0298o) {
                    j3 = Math.min(j3, a(c0289f2, c0289f2.f3798f + j2));
                }
            }
        }
        if (c0289f != abstractC0298o.i) {
            return j3;
        }
        long j4 = abstractC0298o.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(abstractC0298o.h, j5)), j5 - r9.f3798f);
    }

    public static long b(C0289f c0289f, long j2) {
        AbstractC0298o abstractC0298o = c0289f.d;
        if (abstractC0298o instanceof C0293j) {
            return j2;
        }
        ArrayList arrayList = c0289f.f3801k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0287d interfaceC0287d = (InterfaceC0287d) arrayList.get(i);
            if (interfaceC0287d instanceof C0289f) {
                C0289f c0289f2 = (C0289f) interfaceC0287d;
                if (c0289f2.d != abstractC0298o) {
                    j3 = Math.max(j3, b(c0289f2, c0289f2.f3798f + j2));
                }
            }
        }
        if (c0289f != abstractC0298o.h) {
            return j3;
        }
        long j4 = abstractC0298o.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(abstractC0298o.i, j5)), j5 - r9.f3798f);
    }
}
