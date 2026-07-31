package w1;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final u1.l0 f7665a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7667c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7668d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7669e;

    /* renamed from: f, reason: collision with root package name */
    public a f7670f;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7672h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7666b = true;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f7671g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public g0(a aVar, int i) {
        this.f7672h = i;
        this.f7665a = (u1.l0) aVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [p6.e, q6.g] */
    /* JADX WARN: Type inference failed for: r3v5, types: [u1.l0, w1.a] */
    public static final void a(g0 g0Var, u1.a aVar, int i, d1 d1Var) {
        HashMap hashMap = g0Var.f7671g;
        float f6 = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f6) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f6) & 4294967295L;
        while (true) {
            long j7 = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (g0Var.f7672h) {
                    case 0:
                        f1.g0 g0Var2 = d1.M;
                        j7 = d1Var.Z0(j7);
                        break;
                    default:
                        o0 C0 = d1Var.C0();
                        q6.i.b(C0);
                        long j8 = C0.f7738s;
                        j7 = e1.b.e((Float.floatToRawIntBits((int) (j8 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j8 >> 32)) << 32), j7);
                        break;
                }
                d1Var = d1Var.f7616t;
                q6.i.b(d1Var);
                if (d1Var.equals(g0Var.f7665a.m())) {
                    int round = Math.round(aVar instanceof u1.k ? Float.intBitsToFloat((int) (j7 & 4294967295L)) : Float.intBitsToFloat((int) (j7 >> 32)));
                    if (hashMap.containsKey(aVar)) {
                        q6.i.e(hashMap, "<this>");
                        Object obj = hashMap.get(aVar);
                        if (obj == null && !hashMap.containsKey(aVar)) {
                            throw new NoSuchElementException("Key " + aVar + " is missing in the map.");
                        }
                        int intValue = ((Number) obj).intValue();
                        u1.k kVar = u1.d.f7200a;
                        round = ((Number) aVar.f7168a.g(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(aVar, Integer.valueOf(round));
                    return;
                }
            } while (!g0Var.b(d1Var).containsKey(aVar));
            float c8 = g0Var.c(d1Var, aVar);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c8);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c8);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(d1 d1Var) {
        switch (this.f7672h) {
            case 0:
                return d1Var.m0().a();
            default:
                o0 C0 = d1Var.C0();
                q6.i.b(C0);
                return C0.m0().a();
        }
    }

    public final int c(d1 d1Var, u1.a aVar) {
        switch (this.f7672h) {
            case 0:
                return d1Var.h0(aVar);
            default:
                o0 C0 = d1Var.C0();
                q6.i.b(C0);
                return C0.h0(aVar);
        }
    }

    public final boolean d() {
        return this.f7667c || this.f7668d || this.f7669e;
    }

    public final boolean e() {
        h();
        return this.f7670f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [u1.l0, w1.a] */
    public final void f() {
        this.f7666b = true;
        ?? r02 = this.f7665a;
        a o2 = r02.o();
        if (o2 == null) {
            return;
        }
        if (this.f7667c) {
            o2.requestLayout();
        }
        if (this.f7668d) {
            r02.N();
        }
        if (this.f7669e) {
            r02.requestLayout();
        }
        o2.a().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [u1.l0, w1.a] */
    public final void g() {
        HashMap hashMap = this.f7671g;
        hashMap.clear();
        b1.e eVar = new b1.e(12, this);
        ?? r22 = this.f7665a;
        r22.P(eVar);
        hashMap.putAll(b(r22.m()));
        this.f7666b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [u1.l0, w1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        g0 a8;
        g0 a9;
        boolean d8 = d();
        ?? r12 = this.f7665a;
        a aVar = r12;
        if (!d8) {
            a o2 = r12.o();
            if (o2 == null) {
                return;
            }
            a aVar2 = o2.a().f7670f;
            if (aVar2 != null) {
                boolean d9 = aVar2.a().d();
                aVar = aVar2;
            }
            a aVar3 = this.f7670f;
            if (aVar3 == null || aVar3.a().d()) {
                return;
            }
            a o5 = aVar3.o();
            if (o5 != null && (a9 = o5.a()) != null) {
                a9.h();
            }
            a o6 = aVar3.o();
            aVar = (o6 == null || (a8 = o6.a()) == null) ? null : a8.f7670f;
        }
        this.f7670f = aVar;
    }
}
