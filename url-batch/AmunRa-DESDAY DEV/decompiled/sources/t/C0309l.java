package t;

import java.util.ArrayList;

/* renamed from: t.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0312o f3854a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3855b;

    public static long a(C0303f c0303f, long j2) {
        AbstractC0312o abstractC0312o = c0303f.d;
        if (abstractC0312o instanceof C0307j) {
            return j2;
        }
        ArrayList arrayList = c0303f.f3849k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0301d interfaceC0301d = (InterfaceC0301d) arrayList.get(i);
            if (interfaceC0301d instanceof C0303f) {
                C0303f c0303f2 = (C0303f) interfaceC0301d;
                if (c0303f2.d != abstractC0312o) {
                    j3 = Math.min(j3, a(c0303f2, c0303f2.f3846f + j2));
                }
            }
        }
        if (c0303f != abstractC0312o.i) {
            return j3;
        }
        long j4 = abstractC0312o.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(abstractC0312o.h, j5)), j5 - r9.f3846f);
    }

    public static long b(C0303f c0303f, long j2) {
        AbstractC0312o abstractC0312o = c0303f.d;
        if (abstractC0312o instanceof C0307j) {
            return j2;
        }
        ArrayList arrayList = c0303f.f3849k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0301d interfaceC0301d = (InterfaceC0301d) arrayList.get(i);
            if (interfaceC0301d instanceof C0303f) {
                C0303f c0303f2 = (C0303f) interfaceC0301d;
                if (c0303f2.d != abstractC0312o) {
                    j3 = Math.max(j3, b(c0303f2, c0303f2.f3846f + j2));
                }
            }
        }
        if (c0303f != abstractC0312o.h) {
            return j3;
        }
        long j4 = abstractC0312o.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(abstractC0312o.i, j5)), j5 - r9.f3846f);
    }
}
