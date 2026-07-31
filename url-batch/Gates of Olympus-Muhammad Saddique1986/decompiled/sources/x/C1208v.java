package x;

import C0.C0031g;
import I0.C0188a;
import e2.InterfaceC0424c;

/* renamed from: x.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1208v extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10274f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q f10275g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ I0.z f10276h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1208v(boolean z3, boolean z4, Q q3, A0.i iVar, I0.z zVar) {
        super(1);
        this.f10273e = z3;
        this.f10274f = z4;
        this.f10275g = q3;
        this.f10276h = zVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        C0031g c0031g = (C0031g) obj;
        if (this.f10273e || !this.f10274f) {
            return Boolean.FALSE;
        }
        Q q3 = this.f10275g;
        I0.F f3 = q3.f9979e;
        C1204q c1204q = q3.f9994t;
        R1.y yVar = null;
        if (f3 != null) {
            I0.z i3 = q3.f9978d.i(S1.m.A0(new I0.k(), new C0188a(c0031g, 1)));
            f3.a(null, i3);
            c1204q.n(i3);
            yVar = R1.y.f4171a;
        }
        if (yVar == null) {
            I0.z zVar = this.f10276h;
            String str = zVar.f3097a.f596a;
            int i4 = C0.J.f568c;
            long j3 = zVar.f3098b;
            int i5 = (int) (j3 >> 32);
            int i6 = (int) (j3 & 4294967295L);
            f2.j.f(str, "<this>");
            f2.j.f(c0031g, "replacement");
            if (i6 < i5) {
                throw new IndexOutOfBoundsException("End index (" + i6 + ") is less than start index (" + i5 + ").");
            }
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) str, 0, i5);
            sb.append((CharSequence) c0031g);
            sb.append((CharSequence) str, i6, str.length());
            String obj2 = sb.toString();
            int length = c0031g.f596a.length() + i5;
            c1204q.n(new I0.z(obj2, O2.l.J(length, length), 4));
        }
        return Boolean.TRUE;
    }
}
