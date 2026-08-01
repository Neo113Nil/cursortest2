package t;

import java.util.ArrayList;

/* renamed from: t.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0310o f3709a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3710b;

    public static long a(C0301f c0301f, long j2) {
        AbstractC0310o abstractC0310o = c0301f.d;
        if (abstractC0310o instanceof C0305j) {
            return j2;
        }
        ArrayList arrayList = c0301f.f3704k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0299d interfaceC0299d = (InterfaceC0299d) arrayList.get(i);
            if (interfaceC0299d instanceof C0301f) {
                C0301f c0301f2 = (C0301f) interfaceC0299d;
                if (c0301f2.d != abstractC0310o) {
                    j3 = Math.min(j3, a(c0301f2, c0301f2.f3701f + j2));
                }
            }
        }
        if (c0301f != abstractC0310o.i) {
            return j3;
        }
        long j4 = abstractC0310o.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(abstractC0310o.h, j5)), j5 - r9.f3701f);
    }

    public static long b(C0301f c0301f, long j2) {
        AbstractC0310o abstractC0310o = c0301f.d;
        if (abstractC0310o instanceof C0305j) {
            return j2;
        }
        ArrayList arrayList = c0301f.f3704k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0299d interfaceC0299d = (InterfaceC0299d) arrayList.get(i);
            if (interfaceC0299d instanceof C0301f) {
                C0301f c0301f2 = (C0301f) interfaceC0299d;
                if (c0301f2.d != abstractC0310o) {
                    j3 = Math.max(j3, b(c0301f2, c0301f2.f3701f + j2));
                }
            }
        }
        if (c0301f != abstractC0310o.h) {
            return j3;
        }
        long j4 = abstractC0310o.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(abstractC0310o.i, j5)), j5 - r9.f3701f);
    }
}
