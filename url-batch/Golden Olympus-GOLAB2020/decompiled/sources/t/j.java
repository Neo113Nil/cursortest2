package t;

import s.C3404d;
import t.C3423e;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f46196a = new boolean[3];

    static void a(f fVar, C3404d c3404d, C3423e c3423e) {
        c3423e.f46128j = -1;
        c3423e.f46130k = -1;
        C3423e.b bVar = fVar.f46096M[0];
        C3423e.b bVar2 = C3423e.b.WRAP_CONTENT;
        if (bVar != bVar2 && c3423e.f46096M[0] == C3423e.b.MATCH_PARENT) {
            int i4 = c3423e.f46085B.f46069e;
            int N3 = fVar.N() - c3423e.f46087D.f46069e;
            C3422d c3422d = c3423e.f46085B;
            c3422d.f46071g = c3404d.q(c3422d);
            C3422d c3422d2 = c3423e.f46087D;
            c3422d2.f46071g = c3404d.q(c3422d2);
            c3404d.f(c3423e.f46085B.f46071g, i4);
            c3404d.f(c3423e.f46087D.f46071g, N3);
            c3423e.f46128j = 2;
            c3423e.h0(i4, N3);
        }
        if (fVar.f46096M[1] == bVar2 || c3423e.f46096M[1] != C3423e.b.MATCH_PARENT) {
            return;
        }
        int i5 = c3423e.f46086C.f46069e;
        int t4 = fVar.t() - c3423e.f46088E.f46069e;
        C3422d c3422d3 = c3423e.f46086C;
        c3422d3.f46071g = c3404d.q(c3422d3);
        C3422d c3422d4 = c3423e.f46088E;
        c3422d4.f46071g = c3404d.q(c3422d4);
        c3404d.f(c3423e.f46086C.f46071g, i5);
        c3404d.f(c3423e.f46088E.f46071g, t4);
        if (c3423e.f46108Y > 0 || c3423e.M() == 8) {
            C3422d c3422d5 = c3423e.f46089F;
            c3422d5.f46071g = c3404d.q(c3422d5);
            c3404d.f(c3423e.f46089F.f46071g, c3423e.f46108Y + i5);
        }
        c3423e.f46130k = 2;
        c3423e.v0(i5, t4);
    }

    public static final boolean b(int i4, int i5) {
        return (i4 & i5) == i5;
    }
}
