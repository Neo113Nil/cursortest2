package v;

import java.util.ArrayList;

/* renamed from: v.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0292o f3826a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3827b;

    public static long a(C0283f c0283f, long j2) {
        AbstractC0292o abstractC0292o = c0283f.d;
        if (abstractC0292o instanceof C0287j) {
            return j2;
        }
        ArrayList arrayList = c0283f.f3821k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0281d interfaceC0281d = (InterfaceC0281d) arrayList.get(i);
            if (interfaceC0281d instanceof C0283f) {
                C0283f c0283f2 = (C0283f) interfaceC0281d;
                if (c0283f2.d != abstractC0292o) {
                    j3 = Math.min(j3, a(c0283f2, c0283f2.f3818f + j2));
                }
            }
        }
        if (c0283f != abstractC0292o.i) {
            return j3;
        }
        long j4 = abstractC0292o.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(abstractC0292o.h, j5)), j5 - r9.f3818f);
    }

    public static long b(C0283f c0283f, long j2) {
        AbstractC0292o abstractC0292o = c0283f.d;
        if (abstractC0292o instanceof C0287j) {
            return j2;
        }
        ArrayList arrayList = c0283f.f3821k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0281d interfaceC0281d = (InterfaceC0281d) arrayList.get(i);
            if (interfaceC0281d instanceof C0283f) {
                C0283f c0283f2 = (C0283f) interfaceC0281d;
                if (c0283f2.d != abstractC0292o) {
                    j3 = Math.max(j3, b(c0283f2, c0283f2.f3818f + j2));
                }
            }
        }
        if (c0283f != abstractC0292o.h) {
            return j3;
        }
        long j4 = abstractC0292o.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(abstractC0292o.i, j5)), j5 - r9.f3818f);
    }
}
