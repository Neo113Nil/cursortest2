package c2;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.o0 f1570a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1572c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1573d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1574e;

    /* renamed from: f, reason: collision with root package name */
    public a f1575f;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1576h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1571b = true;
    public final HashMap g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public h0(a aVar, int i3) {
        this.f1576h = i3;
        this.f1570a = (a2.o0) aVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [kotlin.jvm.functions.Function2, wd.n] */
    /* JADX WARN: Type inference failed for: r3v8, types: [a2.o0, c2.a] */
    public static final void a(h0 h0Var, a2.a aVar, int i3, i1 i1Var) {
        HashMap hashMap = h0Var.g;
        float f3 = i3;
        long floatToRawIntBits = Float.floatToRawIntBits(f3) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f3) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (h0Var.f1576h) {
                    case 0:
                        o1 o1Var = i1Var.Y;
                        if (o1Var != null) {
                            d2.i1 i1Var2 = (d2.i1) o1Var;
                            float[] b10 = i1Var2.b();
                            if (!i1Var2.G) {
                                j = k1.v.m(b10, j);
                            }
                        }
                        j = x3.j0.b(j, i1Var.M);
                        break;
                    default:
                        p0 B0 = i1Var.B0();
                        B0.getClass();
                        long j3 = B0.C;
                        j = j1.b.d((Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32), j);
                        break;
                }
                i1Var = i1Var.D;
                i1Var.getClass();
                if (i1Var.equals(h0Var.f1570a.v())) {
                    int round = Math.round(aVar instanceof a2.i ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
                    if (hashMap.containsKey(aVar)) {
                        int intValue = ((Number) kotlin.collections.p0.c(aVar, hashMap)).intValue();
                        a2.i iVar = a2.d.f73a;
                        round = ((Number) aVar.f51a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(aVar, Integer.valueOf(round));
                    return;
                }
            } while (!h0Var.b(i1Var).containsKey(aVar));
            float c10 = h0Var.c(i1Var, aVar);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c10);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c10);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(i1 i1Var) {
        switch (this.f1576h) {
            case 0:
                return i1Var.l0().a();
            default:
                p0 B0 = i1Var.B0();
                B0.getClass();
                return B0.l0().a();
        }
    }

    public final int c(i1 i1Var, a2.a aVar) {
        switch (this.f1576h) {
            case 0:
                return i1Var.g0(aVar);
            default:
                p0 B0 = i1Var.B0();
                B0.getClass();
                return B0.g0(aVar);
        }
    }

    public final boolean d() {
        return this.f1572c || this.f1573d || this.f1574e;
    }

    public final boolean e() {
        h();
        return this.f1575f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [a2.o0, c2.a] */
    public final void f() {
        this.f1571b = true;
        ?? r02 = this.f1570a;
        a A = r02.A();
        if (A == null) {
            return;
        }
        if (this.f1572c) {
            A.requestLayout();
        }
        if (this.f1573d) {
            r02.Q();
        }
        if (this.f1574e) {
            r02.requestLayout();
        }
        A.a().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [a2.o0, c2.a] */
    public final void g() {
        HashMap hashMap = this.g;
        hashMap.clear();
        a3.e eVar = new a3.e(2, this);
        ?? r22 = this.f1570a;
        r22.L(eVar);
        hashMap.putAll(b(r22.v()));
        this.f1571b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [a2.o0, c2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        h0 a9;
        h0 a10;
        boolean d10 = d();
        ?? r12 = this.f1570a;
        a aVar = r12;
        if (!d10) {
            a A = r12.A();
            if (A == null) {
                return;
            }
            a aVar2 = A.a().f1575f;
            if (aVar2 != null) {
                boolean d11 = aVar2.a().d();
                aVar = aVar2;
            }
            a aVar3 = this.f1575f;
            if (aVar3 == null || aVar3.a().d()) {
                return;
            }
            a A2 = aVar3.A();
            if (A2 != null && (a10 = A2.a()) != null) {
                a10.h();
            }
            a A3 = aVar3.A();
            aVar = (A3 == null || (a9 = A3.a()) == null) ? null : a9.f1575f;
        }
        this.f1575f = aVar;
    }
}
