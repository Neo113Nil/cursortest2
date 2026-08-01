package t;

import java.util.ArrayList;

/* renamed from: t.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0344o f4185a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4186b;

    public static long a(C0335f c0335f, long j2) {
        AbstractC0344o abstractC0344o = c0335f.f4175d;
        if (abstractC0344o instanceof C0339j) {
            return j2;
        }
        ArrayList arrayList = c0335f.f4180k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0333d interfaceC0333d = (InterfaceC0333d) arrayList.get(i);
            if (interfaceC0333d instanceof C0335f) {
                C0335f c0335f2 = (C0335f) interfaceC0333d;
                if (c0335f2.f4175d != abstractC0344o) {
                    j3 = Math.min(j3, a(c0335f2, c0335f2.f4177f + j2));
                }
            }
        }
        if (c0335f != abstractC0344o.i) {
            return j3;
        }
        long j4 = abstractC0344o.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(abstractC0344o.h, j5)), j5 - r9.f4177f);
    }

    public static long b(C0335f c0335f, long j2) {
        AbstractC0344o abstractC0344o = c0335f.f4175d;
        if (abstractC0344o instanceof C0339j) {
            return j2;
        }
        ArrayList arrayList = c0335f.f4180k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0333d interfaceC0333d = (InterfaceC0333d) arrayList.get(i);
            if (interfaceC0333d instanceof C0335f) {
                C0335f c0335f2 = (C0335f) interfaceC0333d;
                if (c0335f2.f4175d != abstractC0344o) {
                    j3 = Math.max(j3, b(c0335f2, c0335f2.f4177f + j2));
                }
            }
        }
        if (c0335f != abstractC0344o.h) {
            return j3;
        }
        long j4 = abstractC0344o.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(abstractC0344o.i, j5)), j5 - r9.f4177f);
    }
}
