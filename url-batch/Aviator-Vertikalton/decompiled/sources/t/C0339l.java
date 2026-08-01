package t;

import java.util.ArrayList;

/* renamed from: t.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0342o f4181a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4182b;

    public static long a(C0333f c0333f, long j2) {
        AbstractC0342o abstractC0342o = c0333f.f4171d;
        if (abstractC0342o instanceof C0337j) {
            return j2;
        }
        ArrayList arrayList = c0333f.f4176k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0331d interfaceC0331d = (InterfaceC0331d) arrayList.get(i);
            if (interfaceC0331d instanceof C0333f) {
                C0333f c0333f2 = (C0333f) interfaceC0331d;
                if (c0333f2.f4171d != abstractC0342o) {
                    j3 = Math.min(j3, a(c0333f2, c0333f2.f4173f + j2));
                }
            }
        }
        if (c0333f != abstractC0342o.i) {
            return j3;
        }
        long j4 = abstractC0342o.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(abstractC0342o.h, j5)), j5 - r9.f4173f);
    }

    public static long b(C0333f c0333f, long j2) {
        AbstractC0342o abstractC0342o = c0333f.f4171d;
        if (abstractC0342o instanceof C0337j) {
            return j2;
        }
        ArrayList arrayList = c0333f.f4176k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0331d interfaceC0331d = (InterfaceC0331d) arrayList.get(i);
            if (interfaceC0331d instanceof C0333f) {
                C0333f c0333f2 = (C0333f) interfaceC0331d;
                if (c0333f2.f4171d != abstractC0342o) {
                    j3 = Math.max(j3, b(c0333f2, c0333f2.f4173f + j2));
                }
            }
        }
        if (c0333f != abstractC0342o.h) {
            return j3;
        }
        long j4 = abstractC0342o.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(abstractC0342o.i, j5)), j5 - r9.f4173f);
    }
}
