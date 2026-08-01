package v;

import java.util.ArrayList;

/* renamed from: v.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0406o f4427a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4428b;

    public static long a(C0397f c0397f, long j) {
        AbstractC0406o abstractC0406o = c0397f.f4418d;
        if (abstractC0406o instanceof C0401j) {
            return j;
        }
        ArrayList arrayList = c0397f.f4422k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0395d interfaceC0395d = (InterfaceC0395d) arrayList.get(i);
            if (interfaceC0395d instanceof C0397f) {
                C0397f c0397f2 = (C0397f) interfaceC0395d;
                if (c0397f2.f4418d != abstractC0406o) {
                    j2 = Math.min(j2, a(c0397f2, c0397f2.f4419f + j));
                }
            }
        }
        if (c0397f != abstractC0406o.i) {
            return j2;
        }
        long j3 = abstractC0406o.j();
        long j4 = j - j3;
        return Math.min(Math.min(j2, a(abstractC0406o.f4442h, j4)), j4 - r9.f4419f);
    }

    public static long b(C0397f c0397f, long j) {
        AbstractC0406o abstractC0406o = c0397f.f4418d;
        if (abstractC0406o instanceof C0401j) {
            return j;
        }
        ArrayList arrayList = c0397f.f4422k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0395d interfaceC0395d = (InterfaceC0395d) arrayList.get(i);
            if (interfaceC0395d instanceof C0397f) {
                C0397f c0397f2 = (C0397f) interfaceC0395d;
                if (c0397f2.f4418d != abstractC0406o) {
                    j2 = Math.max(j2, b(c0397f2, c0397f2.f4419f + j));
                }
            }
        }
        if (c0397f != abstractC0406o.f4442h) {
            return j2;
        }
        long j3 = abstractC0406o.j();
        long j4 = j + j3;
        return Math.max(Math.max(j2, b(abstractC0406o.i, j4)), j4 - r9.f4419f);
    }
}
