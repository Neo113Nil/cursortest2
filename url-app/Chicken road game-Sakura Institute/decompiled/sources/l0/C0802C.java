package l0;

import A.g0;
import G.V;
import W2.C0286h;
import W2.EnumC0303z;
import W2.r0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r0.AbstractC1065f;
import r0.l0;
import y2.AbstractC1341p;

/* renamed from: l0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0802C extends S.n implements M0.b, l0 {
    public C0811i B;

    /* renamed from: t, reason: collision with root package name */
    public Object f7877t;

    /* renamed from: u, reason: collision with root package name */
    public Object f7878u;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f7879v;

    /* renamed from: w, reason: collision with root package name */
    public Function2 f7880w;

    /* renamed from: x, reason: collision with root package name */
    public r0 f7881x;

    /* renamed from: y, reason: collision with root package name */
    public C0811i f7882y = w.f7951a;

    /* renamed from: z, reason: collision with root package name */
    public final I.d f7883z = new I.d(new C0800A[16]);

    /* renamed from: A, reason: collision with root package name */
    public final I.d f7875A = new I.d(new C0800A[16]);

    /* renamed from: C, reason: collision with root package name */
    public long f7876C = 0;

    public C0802C(Object obj, Object obj2, Object[] objArr, Function2 function2) {
        this.f7877t = obj;
        this.f7878u = obj2;
        this.f7879v = objArr;
        this.f7880w = function2;
    }

    public final Object B0(Function2 function2, C2.a frame) {
        D2.a aVar;
        C0286h c0286h = new C0286h(1, D2.f.b(frame));
        c0286h.s();
        C0800A completion = new C0800A(this, c0286h);
        synchronized (this.f7883z) {
            this.f7883z.b(completion);
            Intrinsics.checkNotNullParameter(function2, "<this>");
            Intrinsics.checkNotNullParameter(completion, "completion");
            C2.a b4 = D2.f.b(D2.f.a(completion, completion, function2));
            aVar = D2.a.f2163d;
            C2.c cVar = new C2.c(b4, aVar);
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            cVar.u(Unit.f7487a);
        }
        c0286h.v(new g0(16, completion));
        Object r2 = c0286h.r();
        if (r2 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r2;
    }

    public final void C0(C0811i c0811i, EnumC0812j enumC0812j) {
        C0286h c0286h;
        C0286h c0286h2;
        synchronized (this.f7883z) {
            I.d dVar = this.f7875A;
            dVar.c(dVar.f3332i, this.f7883z);
        }
        try {
            int ordinal = enumC0812j.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    I.d dVar2 = this.f7875A;
                    int i2 = dVar2.f3332i;
                    if (i2 > 0) {
                        int i4 = i2 - 1;
                        Object[] objArr = dVar2.f3330d;
                        do {
                            C0800A c0800a = (C0800A) objArr[i4];
                            if (enumC0812j == c0800a.f7870j && (c0286h2 = c0800a.f7869i) != null) {
                                c0800a.f7869i = null;
                                AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                                c0286h2.u(c0811i);
                            }
                            i4--;
                        } while (i4 >= 0);
                    }
                } else if (ordinal != 2) {
                }
            }
            I.d dVar3 = this.f7875A;
            int i5 = dVar3.f3332i;
            if (i5 > 0) {
                Object[] objArr2 = dVar3.f3330d;
                int i6 = 0;
                do {
                    C0800A c0800a2 = (C0800A) objArr2[i6];
                    if (enumC0812j == c0800a2.f7870j && (c0286h = c0800a2.f7869i) != null) {
                        c0800a2.f7869i = null;
                        AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                        c0286h.u(c0811i);
                    }
                    i6++;
                } while (i6 < i5);
            }
        } finally {
            this.f7875A.g();
        }
    }

    public final void D0() {
        r0 r0Var = this.f7881x;
        if (r0Var != null) {
            r0Var.D(new V("Pointer input was reset", 4));
            this.f7881x = null;
        }
    }

    @Override // r0.l0
    public final void K() {
        D0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // r0.l0
    public final void S() {
        C0811i c0811i = this.B;
        if (c0811i == null) {
            return;
        }
        ?? r12 = c0811i.f7907a;
        int size = r12.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((s) r12.get(i2)).f7926d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    s sVar = (s) r12.get(i4);
                    long j4 = sVar.f7923a;
                    boolean z4 = sVar.f7926d;
                    long j5 = sVar.f7924b;
                    long j6 = sVar.f7925c;
                    arrayList.add(new s(j4, j5, j6, false, sVar.f7927e, j5, j6, z4, z4, 1, 0L));
                }
                C0811i c0811i2 = new C0811i(arrayList, null);
                this.f7882y = c0811i2;
                C0(c0811i2, EnumC0812j.f7910d);
                C0(c0811i2, EnumC0812j.f7911e);
                C0(c0811i2, EnumC0812j.f7912i);
                this.B = null;
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // r0.l0
    public final void Z(C0811i c0811i, EnumC0812j enumC0812j, long j4) {
        this.f7876C = j4;
        if (enumC0812j == EnumC0812j.f7910d) {
            this.f7882y = c0811i;
        }
        if (this.f7881x == null) {
            this.f7881x = W2.B.m(p0(), null, EnumC0303z.f4307j, new C0801B(this, null), 1);
        }
        C0(c0811i, enumC0812j);
        ?? r5 = c0811i.f7907a;
        int size = r5.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0811i = null;
                break;
            } else if (!AbstractC0819q.c((s) r5.get(i2))) {
                break;
            } else {
                i2++;
            }
        }
        this.B = c0811i;
    }

    @Override // M0.b
    public final float e() {
        return AbstractC1065f.v(this).f9610w.e();
    }

    @Override // r0.l0
    public final void m() {
        D0();
    }

    @Override // M0.b
    public final float q() {
        return AbstractC1065f.v(this).f9610w.q();
    }

    @Override // S.n
    public final void u0() {
        D0();
    }
}
