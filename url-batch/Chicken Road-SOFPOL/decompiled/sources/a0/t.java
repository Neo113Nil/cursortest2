package a0;

import a0.g1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import m0.t2;
import m0.u1;
import m0.y1;
import r.s1;
import w1.x1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f142e;

    public /* synthetic */ t(int i, Object obj) {
        this.f141d = i;
        this.f142e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x03d2, code lost:
    
        if (r14 != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01dd, code lost:
    
        if (((u.m0) r0).f7048r != false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    @Override // p6.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        int i;
        f1.m mVar;
        long j7;
        f1.z zVar;
        boolean z3;
        h1.b bVar;
        g1 g1Var;
        float f6;
        float f8;
        long u7;
        e1.c s02;
        z.k kVar;
        z.k kVar2;
        int i8 = 2;
        float f9 = 0.0f;
        switch (this.f141d) {
            case 0:
                return new u(0, (w) this.f142e);
            case 1:
                return new u(i8, (i0) this.f142e);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                v0.e eVar = (v0.e) this.f142e;
                return Boolean.valueOf(eVar != null ? eVar.c(obj) : true);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                List list = (List) this.f142e;
                z.f fVar = (z.f) obj;
                q6.i.e(fVar, "$this$LazyRow");
                fVar.a(list.size(), new b6.f0(i8, list), new u0.c(802480018, true, new b6.w0(list)));
                return c6.m.f1757a;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                o4.t tVar = (o4.t) this.f142e;
                o4.w wVar = (o4.w) obj;
                q6.i.e(wVar, "$this$navigate");
                int i9 = o4.q.f5679j;
                wVar.f5701d = m.a.t(tVar.f5685b.g()).f5671e.f4348a;
                o4.a0 a0Var = new o4.a0();
                a0Var.f5618a = true;
                wVar.f5702e = a0Var.f5618a;
                wVar.f5699b = true;
                wVar.f5700c = true;
                return c6.m.f1757a;
            case 5:
                m0.z0 z0Var = (m0.z0) this.f142e;
                Integer num = (Integer) obj;
                num.intValue();
                z0Var.setValue(num);
                return c6.m.f1757a;
            case 6:
                return obj == ((d6.a) this.f142e) ? "(this Collection)" : String.valueOf(obj);
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                d6.f fVar2 = (d6.f) this.f142e;
                Map.Entry entry = (Map.Entry) obj;
                q6.i.e(entry, "it");
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == fVar2 ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != fVar2 ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                ((i7.c) this.f142e).f(null);
                return c6.m.f1757a;
            case x.v0.f8304b /* 9 */:
                ((m0.e1) this.f142e).h((int) (((r2.k) obj).f6528a >> 32));
                return c6.m.f1757a;
            case x.v0.f8306d /* 10 */:
                ((f1.g0) obj).a(((Number) ((t2) this.f142e).getValue()).floatValue());
                return c6.m.f1757a;
            case 11:
                d2.j jVar = (d2.j) obj;
                Object b8 = ((p6.a) this.f142e).b();
                Float f10 = (Float) (!Float.isNaN(((Number) b8).floatValue()) ? b8 : null);
                d2.f fVar3 = new d2.f(f10 != null ? f10.floatValue() : 0.0f, new v6.a(1.0f));
                w6.d[] dVarArr = d2.u.f2215a;
                d2.v vVar = d2.s.f2190c;
                w6.d dVar = d2.u.f2215a[1];
                vVar.a(jVar, fVar3);
                return c6.m.f1757a;
            case 12:
                j2.q qVar = (j2.q) obj;
                return ((j2.e) this.f142e).a(new j2.q(null, qVar.f4004b, qVar.f4005c, qVar.f4006d, qVar.f4007e)).f4008d;
            case 13:
                ((m0.y) this.f142e).z(obj);
                return c6.m.f1757a;
            case 14:
                y1 y1Var = (y1) this.f142e;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (y1Var.f5189b) {
                    try {
                        a7.s0 s0Var = y1Var.f5190c;
                        if (s0Var != null) {
                            d7.n0 n0Var = y1Var.f5206t;
                            u1 u1Var = u1.f5127e;
                            n0Var.getClass();
                            n0Var.j(null, u1Var);
                            s0Var.a(cancellationException);
                            y1Var.f5203q = null;
                            s0Var.w(new v0(7, y1Var, th));
                        } else {
                            y1Var.f5191d = cancellationException;
                            d7.n0 n0Var2 = y1Var.f5206t;
                            u1 u1Var2 = u1.f5126d;
                            n0Var2.getClass();
                            n0Var2.j(null, u1Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return c6.m.f1757a;
            case x.v0.f8308f /* 15 */:
                o.k0 k0Var = (o.k0) this.f142e;
                if (obj instanceof w0.v) {
                    ((w0.v) obj).f(4);
                }
                k0Var.a(obj);
                return c6.m.f1757a;
            case 16:
                o4.y yVar = (o4.y) this.f142e;
                o4.d dVar2 = (o4.d) obj;
                q6.i.e(dVar2, "backStackEntry");
                r4.c cVar = dVar2.f5626k;
                o4.o oVar = dVar2.f5621e;
                if (oVar == null) {
                    oVar = null;
                }
                if (oVar != null) {
                    cVar.a();
                    o4.o c8 = yVar.c(oVar);
                    if (c8 != null) {
                        return c8.equals(oVar) ? dVar2 : yVar.b().b(c8, c8.a(cVar.a()));
                    }
                }
                return null;
            case 17:
                Bundle bundle = (Bundle) obj;
                o4.t x7 = h0.a.x((Context) this.f142e);
                if (bundle != null) {
                    bundle.setClassLoader(x7.f5684a.getClassLoader());
                }
                r4.g gVar = x7.f5685b;
                LinkedHashMap linkedHashMap = gVar.f6595m;
                if (bundle != null) {
                    gVar.f6587d = bundle.containsKey("android-support-nav:controller:navigatorState") ? r2.o.M("android-support-nav:controller:navigatorState", bundle) : null;
                    gVar.f6588e = bundle.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) r2.o.N("android-support-nav:controller:backStack", bundle).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            r2.r.F("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            r2.r.F("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = i11 + 1;
                            r4.g gVar2 = gVar;
                            gVar.f6594l.put(Integer.valueOf(intArray[i10]), !q6.i.a(stringArrayList.get(i11), "") ? stringArrayList.get(i11) : null);
                            i10++;
                            i11 = i12;
                            gVar = gVar2;
                        }
                    }
                    if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            r2.r.F("android-support-nav:controller:backStackStates");
                            throw null;
                        }
                        int size = stringArrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            String str = stringArrayList2.get(i13);
                            i13++;
                            String str2 = str;
                            String str3 = "android-support-nav:controller:backStackStates:" + str2;
                            q6.i.e(str3, "key");
                            if (bundle.containsKey(str3)) {
                                ArrayList N = r2.o.N("android-support-nav:controller:backStackStates:" + str2, bundle);
                                d6.k kVar3 = new d6.k(N.size());
                                int size2 = N.size();
                                int i14 = 0;
                                while (i14 < size2) {
                                    Object obj2 = N.get(i14);
                                    i14++;
                                    kVar3.addLast(new o4.e((Bundle) obj2));
                                }
                                linkedHashMap.put(str2, kVar3);
                            }
                        }
                    }
                }
                if (bundle != null) {
                    boolean z7 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean valueOf = (z7 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z7) : null;
                    x7.f5688e = valueOf != null ? valueOf.booleanValue() : false;
                }
                return x7;
            case 18:
                r.i iVar = (r.i) obj;
                ((p6.e) this.f142e).g(iVar.f6307e.getValue(), r.d.f6262j.f6414b.i(iVar.f6308f));
                return c6.m.f1757a;
            case 19:
                t.s sVar = (t.s) this.f142e;
                c1.c cVar2 = (c1.c) obj;
                if (cVar2.b() * sVar.f6850u < 0.0f || e1.e.b(cVar2.f1561d.c()) <= 0.0f) {
                    return cVar2.a(new s1(12));
                }
                float f11 = 2;
                final float min = Math.min(r2.f.a(sVar.f6850u, 0.0f) ? 1.0f : (float) Math.ceil(cVar2.b() * sVar.f6850u), (float) Math.ceil(e1.e.b(cVar2.f1561d.c()) / f11));
                final float f12 = min / f11;
                final long floatToRawIntBits = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
                final long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar2.f1561d.c() >> 32)) - min) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar2.f1561d.c() & 4294967295L)) - min) & 4294967295L);
                float f13 = f11 * min;
                boolean z8 = f13 > e1.e.b(cVar2.f1561d.c());
                f1.p a8 = sVar.f6852w.a(cVar2.f1561d.c(), cVar2.f1561d.getLayoutDirection(), cVar2);
                if (!(a8 instanceof f1.c0)) {
                    if (!(a8 instanceof f1.e0)) {
                        boolean z9 = z8;
                        if (!(a8 instanceof f1.d0)) {
                            throw new a5.c();
                        }
                        final f1.p pVar = sVar.f6851v;
                        if (z9) {
                            floatToRawIntBits = 0;
                        }
                        final long j8 = floatToRawIntBits;
                        if (z9) {
                            floatToRawIntBits2 = cVar2.f1561d.c();
                        }
                        final long j9 = floatToRawIntBits2;
                        final h1.c gVar3 = z9 ? h1.f.f3080b : new h1.g(min, 0.0f, 0, 30);
                        return cVar2.a(new p6.c() { // from class: t.p
                            @Override // p6.c
                            public final Object i(Object obj3) {
                                w1.h0 h0Var = (w1.h0) obj3;
                                h0Var.a();
                                h1.d.j(h0Var, f1.p.this, j8, j9, 0.0f, gVar3, 104);
                                return c6.m.f1757a;
                            }
                        });
                    }
                    final f1.p pVar2 = sVar.f6851v;
                    e1.d dVar3 = ((f1.e0) a8).f2635e;
                    if (s6.a.w(dVar3)) {
                        final long j10 = dVar3.f2465e;
                        final h1.g gVar4 = new h1.g(min, 0.0f, 0, 30);
                        final boolean z10 = z8;
                        return cVar2.a(new p6.c() { // from class: t.q
                            @Override // p6.c
                            public final Object i(Object obj3) {
                                g1 g1Var2;
                                long j11;
                                w1.h0 h0Var = (w1.h0) obj3;
                                h0Var.a();
                                h1.b bVar2 = h0Var.f7680d;
                                boolean z11 = z10;
                                f1.p pVar3 = pVar2;
                                long j12 = j10;
                                if (z11) {
                                    h1.d.B(h0Var, pVar3, 0L, 0L, j12, null, 246);
                                } else {
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
                                    float f14 = f12;
                                    if (intBitsToFloat < f14) {
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar2.c() >> 32));
                                        float f15 = min;
                                        float f16 = intBitsToFloat2 - f15;
                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (bVar2.c() & 4294967295L)) - f15;
                                        g1 g1Var3 = bVar2.f3075e;
                                        long u8 = g1Var3.u();
                                        g1Var3.m().h();
                                        try {
                                            ((g1) ((b1.b) g1Var3.f84b).f1050e).m().c(f15, f15, f16, intBitsToFloat3, 0);
                                            j11 = u8;
                                            g1Var2 = g1Var3;
                                            try {
                                                h1.d.B(h0Var, pVar3, 0L, 0L, j12, null, 246);
                                                g1Var2.m().f();
                                                g1Var2.M(j11);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                g1Var2.m().f();
                                                g1Var2.M(j11);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            g1Var2 = g1Var3;
                                            j11 = u8;
                                        }
                                    } else {
                                        h1.d.B(h0Var, pVar3, floatToRawIntBits, floatToRawIntBits2, r2.o.p0(j12, f14), gVar4, 208);
                                    }
                                }
                                return c6.m.f1757a;
                            }
                        });
                    }
                    boolean z11 = z8;
                    if (sVar.f6849t == null) {
                        sVar.f6849t = new t.o();
                    }
                    t.o oVar2 = sVar.f6849t;
                    q6.i.b(oVar2);
                    f1.j jVar2 = oVar2.f6827d;
                    if (jVar2 == null) {
                        jVar2 = f1.l.a();
                        oVar2.f6827d = jVar2;
                    }
                    jVar2.d();
                    f1.j.a(jVar2, dVar3);
                    if (!z11) {
                        f1.j a9 = f1.l.a();
                        f1.j.a(a9, new e1.d(min, min, dVar3.b() - min, dVar3.a() - min, r2.o.p0(dVar3.f2465e, min), r2.o.p0(dVar3.f2466f, min), r2.o.p0(dVar3.f2467g, min), r2.o.p0(dVar3.f2468h, min)));
                        jVar2.c(jVar2, a9, 0);
                    }
                    return cVar2.a(new v0(15, jVar2, pVar2));
                }
                f1.p pVar3 = sVar.f6851v;
                f1.c0 c0Var = (f1.c0) a8;
                f1.j jVar3 = c0Var.f2630e;
                if (z8) {
                    return cVar2.a(new v0(16, c0Var, pVar3));
                }
                if (pVar3 instanceof f1.k0) {
                    mVar = new f1.m(5, f1.s.b(((f1.k0) pVar3).f2682e, 1.0f));
                    i = 1;
                } else {
                    i = 0;
                    mVar = null;
                }
                final e1.c b9 = jVar3.b();
                float f14 = b9.f2458b;
                float f15 = b9.f2457a;
                if (sVar.f6849t == null) {
                    sVar.f6849t = new t.o();
                }
                t.o oVar3 = sVar.f6849t;
                q6.i.b(oVar3);
                f1.j jVar4 = oVar3.f6827d;
                if (jVar4 == null) {
                    jVar4 = f1.l.a();
                    oVar3.f6827d = jVar4;
                }
                jVar4.d();
                float f16 = b9.f2457a;
                float f17 = b9.f2460d;
                float f18 = b9.f2459c;
                final f1.m mVar2 = mVar;
                float f19 = b9.f2458b;
                if (Float.isNaN(f16) || Float.isNaN(f19) || Float.isNaN(f18) || Float.isNaN(f17)) {
                    f1.l.b("Invalid rectangle, make sure no value is NaN");
                }
                if (jVar4.f2670b == null) {
                    jVar4.f2670b = new RectF();
                }
                RectF rectF = jVar4.f2670b;
                q6.i.b(rectF);
                rectF.set(f16, f19, f18, f17);
                Path path = jVar4.f2669a;
                RectF rectF2 = jVar4.f2670b;
                q6.i.b(rectF2);
                path.addRect(rectF2, Path.Direction.CCW);
                jVar4.c(jVar4, jVar3, 0);
                final q6.s sVar2 = new q6.s();
                long ceil = (((int) Math.ceil(b9.f2460d - f14)) & 4294967295L) | (((int) Math.ceil(b9.f2459c - f15)) << 32);
                t.o oVar4 = sVar.f6849t;
                q6.i.b(oVar4);
                f1.g gVar5 = oVar4.f6824a;
                f1.b bVar2 = oVar4.f6825b;
                if (gVar5 != null) {
                    j7 = ceil;
                    zVar = new f1.z(gVar5.a());
                } else {
                    j7 = ceil;
                    zVar = null;
                }
                try {
                    try {
                        if (zVar == null || zVar.f2710a != 0) {
                            f1.z zVar2 = gVar5 != null ? new f1.z(gVar5.a()) : null;
                            if (zVar2 == null || i != zVar2.f2710a) {
                                z3 = false;
                                if (gVar5 != null) {
                                    Bitmap bitmap = gVar5.f2643a;
                                    if (bVar2 != null) {
                                        boolean z12 = z3;
                                        if (Float.intBitsToFloat((int) (cVar2.f1561d.c() >> 32)) <= bitmap.getWidth()) {
                                            if (Float.intBitsToFloat((int) (cVar2.f1561d.c() & 4294967295L)) <= bitmap.getHeight()) {
                                            }
                                        }
                                    }
                                }
                                gVar5 = f1.p.e((int) (j7 >> 32), (int) (j7 & 4294967295L), i);
                                oVar4.f6824a = gVar5;
                                Canvas canvas = f1.c.f2629a;
                                bVar2 = new f1.b();
                                bVar2.f2622a = new Canvas(gVar5.f2643a);
                                oVar4.f6825b = bVar2;
                                bVar = oVar4.f6826c;
                                if (bVar == null) {
                                    bVar = new h1.b();
                                    oVar4.f6826c = bVar;
                                }
                                g1Var = bVar.f3075e;
                                h1.a aVar = bVar.f3074d;
                                f1.j jVar5 = jVar4;
                                long R = m.a.R(j7);
                                h1.b bVar3 = bVar;
                                r2.l layoutDirection = cVar2.f1561d.getLayoutDirection();
                                r2.c cVar3 = aVar.f3070a;
                                r2.l lVar = aVar.f3071b;
                                f1.q qVar2 = aVar.f3072c;
                                f1.g gVar6 = gVar5;
                                long j11 = aVar.f3073d;
                                aVar.f3070a = cVar2;
                                aVar.f3071b = layoutDirection;
                                aVar.f3072c = bVar2;
                                aVar.f3073d = R;
                                bVar2.h();
                                h1.d.r(bVar3, f1.s.f2698b, 0L, R, 58);
                                f6 = -f15;
                                f8 = -f14;
                                ((b1.b) g1Var.f84b).x(f6, f8);
                                h1.d.l(bVar3, c0Var.f2630e, pVar3, 0.0f, new h1.g(f13, 0.0f, 0, 30), 52);
                                float f20 = 1;
                                float intBitsToFloat = (Float.intBitsToFloat((int) (bVar3.c() >> 32)) + f20) / Float.intBitsToFloat((int) (bVar3.c() >> 32));
                                float intBitsToFloat2 = (Float.intBitsToFloat((int) (bVar3.c() & 4294967295L)) + f20) / Float.intBitsToFloat((int) (bVar3.c() & 4294967295L));
                                long M = bVar3.M();
                                u7 = g1Var.u();
                                g1Var.m().h();
                                ((b1.b) g1Var.f84b).w(intBitsToFloat, intBitsToFloat2, M);
                                h1.d.l(bVar3, jVar5, pVar3, 0.0f, null, 28);
                                ((b1.b) g1Var.f84b).x(-f6, -f8);
                                bVar2.f();
                                aVar.f3070a = cVar3;
                                aVar.f3071b = lVar;
                                aVar.f3072c = qVar2;
                                aVar.f3073d = j11;
                                gVar6.f2643a.prepareToDraw();
                                sVar2.f6205d = gVar6;
                                final long j12 = j7;
                                return cVar2.a(new p6.c() { // from class: t.r
                                    @Override // p6.c
                                    public final Object i(Object obj3) {
                                        q6.s sVar3 = sVar2;
                                        long j13 = j12;
                                        f1.m mVar3 = mVar2;
                                        w1.h0 h0Var = (w1.h0) obj3;
                                        h0Var.a();
                                        e1.c cVar4 = e1.c.this;
                                        float f21 = cVar4.f2457a;
                                        float f22 = cVar4.f2458b;
                                        h1.b bVar4 = h0Var.f7680d;
                                        ((b1.b) bVar4.f3075e.f84b).x(f21, f22);
                                        try {
                                            h1.d.x(h0Var, (f1.g) sVar3.f6205d, j13, 0.0f, mVar3, 890);
                                            ((b1.b) bVar4.f3075e.f84b).x(-f21, -f22);
                                            return c6.m.f1757a;
                                        } catch (Throwable th3) {
                                            ((b1.b) bVar4.f3075e.f84b).x(-f21, -f22);
                                            throw th3;
                                        }
                                    }
                                });
                            }
                        }
                        ((b1.b) g1Var.f84b).w(intBitsToFloat, intBitsToFloat2, M);
                        h1.d.l(bVar3, jVar5, pVar3, 0.0f, null, 28);
                        ((b1.b) g1Var.f84b).x(-f6, -f8);
                        bVar2.f();
                        aVar.f3070a = cVar3;
                        aVar.f3071b = lVar;
                        aVar.f3072c = qVar2;
                        aVar.f3073d = j11;
                        gVar6.f2643a.prepareToDraw();
                        sVar2.f6205d = gVar6;
                        final long j122 = j7;
                        return cVar2.a(new p6.c() { // from class: t.r
                            @Override // p6.c
                            public final Object i(Object obj3) {
                                q6.s sVar3 = sVar2;
                                long j13 = j122;
                                f1.m mVar3 = mVar2;
                                w1.h0 h0Var = (w1.h0) obj3;
                                h0Var.a();
                                e1.c cVar4 = e1.c.this;
                                float f21 = cVar4.f2457a;
                                float f22 = cVar4.f2458b;
                                h1.b bVar4 = h0Var.f7680d;
                                ((b1.b) bVar4.f3075e.f84b).x(f21, f22);
                                try {
                                    h1.d.x(h0Var, (f1.g) sVar3.f6205d, j13, 0.0f, mVar3, 890);
                                    ((b1.b) bVar4.f3075e.f84b).x(-f21, -f22);
                                    return c6.m.f1757a;
                                } catch (Throwable th3) {
                                    ((b1.b) bVar4.f3075e.f84b).x(-f21, -f22);
                                    throw th3;
                                }
                            }
                        });
                    } finally {
                        g1Var.m().f();
                        g1Var.M(u7);
                    }
                    h1.d.l(bVar3, c0Var.f2630e, pVar3, 0.0f, new h1.g(f13, 0.0f, 0, 30), 52);
                    float f202 = 1;
                    float intBitsToFloat3 = (Float.intBitsToFloat((int) (bVar3.c() >> 32)) + f202) / Float.intBitsToFloat((int) (bVar3.c() >> 32));
                    float intBitsToFloat22 = (Float.intBitsToFloat((int) (bVar3.c() & 4294967295L)) + f202) / Float.intBitsToFloat((int) (bVar3.c() & 4294967295L));
                    long M2 = bVar3.M();
                    u7 = g1Var.u();
                    g1Var.m().h();
                } catch (Throwable th3) {
                    ((b1.b) g1Var.f84b).x(-f6, -f8);
                    throw th3;
                }
                z3 = true;
                if (gVar5 != null) {
                }
                gVar5 = f1.p.e((int) (j7 >> 32), (int) (j7 & 4294967295L), i);
                oVar4.f6824a = gVar5;
                Canvas canvas2 = f1.c.f2629a;
                bVar2 = new f1.b();
                bVar2.f2622a = new Canvas(gVar5.f2643a);
                oVar4.f6825b = bVar2;
                bVar = oVar4.f6826c;
                if (bVar == null) {
                }
                g1Var = bVar.f3075e;
                h1.a aVar2 = bVar.f3074d;
                f1.j jVar52 = jVar4;
                long R2 = m.a.R(j7);
                h1.b bVar32 = bVar;
                r2.l layoutDirection2 = cVar2.f1561d.getLayoutDirection();
                r2.c cVar32 = aVar2.f3070a;
                r2.l lVar2 = aVar2.f3071b;
                f1.q qVar22 = aVar2.f3072c;
                f1.g gVar62 = gVar5;
                long j112 = aVar2.f3073d;
                aVar2.f3070a = cVar2;
                aVar2.f3071b = layoutDirection2;
                aVar2.f3072c = bVar2;
                aVar2.f3073d = R2;
                bVar2.h();
                h1.d.r(bVar32, f1.s.f2698b, 0L, R2, 58);
                f6 = -f15;
                f8 = -f14;
                ((b1.b) g1Var.f84b).x(f6, f8);
                break;
            case 20:
                q6.o oVar5 = (q6.o) this.f142e;
                x1 x1Var = (x1) obj;
                if (!oVar5.f6201d) {
                    q6.i.c(x1Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    break;
                }
                r7 = true;
                oVar5.f6201d = r7;
                return Boolean.valueOf(!r7);
            case 21:
                t.u0 u0Var = (t.u0) this.f142e;
                float floatValue = ((Float) obj).floatValue();
                m0.e1 e1Var = u0Var.f6867a;
                float g3 = e1Var.g() + floatValue + u0Var.f6871e;
                float s5 = r2.o.s(g3, 0.0f, u0Var.f6870d.g());
                r7 = g3 == s5;
                float g7 = s5 - e1Var.g();
                int round = Math.round(g7);
                e1Var.h(e1Var.g() + round);
                u0Var.f6871e = g7 - round;
                if (!r7) {
                    floatValue = g7;
                }
                return Float.valueOf(floatValue);
            case 22:
                q1.k kVar4 = (q1.k) obj;
                ((b6.j0) this.f142e).g(kVar4, Float.valueOf(Float.intBitsToFloat((int) (h0.a.R(kVar4, false) >> 32))));
                kVar4.a();
                return c6.m.f1757a;
            case 23:
                u.g gVar7 = ((u.x0) this.f142e).J;
                gVar7.f6991v = (u1.p) obj;
                if (gVar7.f6993x && (s02 = gVar7.s0()) != null && !gVar7.t0(s02, gVar7.f6994y)) {
                    gVar7.f6992w = true;
                    gVar7.u0();
                }
                gVar7.f6993x = false;
                return c6.m.f1757a;
            case 24:
                u.e1 e1Var2 = (u.e1) this.f142e;
                return new e1.b(e1Var2.c(e1Var2.f6971k, ((e1.b) obj).f2455a, e1Var2.f6970j));
            case 25:
                v0.e eVar2 = ((v0.d) this.f142e).f7437f;
                return Boolean.valueOf(eVar2 != null ? eVar2.c(obj) : true);
            case 26:
                w0.s sVar3 = (w0.s) this.f142e;
                synchronized (sVar3.f7565g) {
                    w0.r rVar = sVar3.i;
                    q6.i.b(rVar);
                    Object obj3 = rVar.f7549b;
                    q6.i.b(obj3);
                    int i15 = rVar.f7551d;
                    o.d0 d0Var = rVar.f7550c;
                    if (d0Var == null) {
                        d0Var = new o.d0();
                        rVar.f7550c = d0Var;
                        rVar.f7553f.m(obj3, d0Var);
                    }
                    rVar.c(obj, i15, obj3, d0Var);
                }
                return c6.m.f1757a;
            case 27:
                y3.b0 b0Var = (y3.b0) this.f142e;
                Throwable th4 = (Throwable) obj;
                if (th4 != null) {
                    b0Var.f8845j.s(new y3.k0(th4));
                }
                if (b0Var.f8847l.f1754e != c6.l.f1756a) {
                    ((y3.h0) b0Var.f8847l.getValue()).close();
                }
                return c6.m.f1757a;
            case 28:
                return ((r0.i) this.f142e).b(((Integer) obj).intValue());
            default:
                z.p pVar4 = (z.p) this.f142e;
                float f21 = -((Float) obj).floatValue();
                if ((f21 >= 0.0f || pVar4.d()) && (f21 <= 0.0f || pVar4.a())) {
                    if (Math.abs(pVar4.f9084h) > 0.5f) {
                        w.a.c("entered drag with non-zero pending scroll");
                    }
                    pVar4.f9080d = true;
                    float f22 = pVar4.f9084h + f21;
                    pVar4.f9084h = f22;
                    if (Math.abs(f22) > 0.5f) {
                        float f23 = pVar4.f9084h;
                        int round2 = Math.round(f23);
                        z.k f24 = ((z.k) pVar4.f9082f.getValue()).f(round2, !pVar4.f9078b);
                        if (f24 != null && (kVar2 = pVar4.f9079c) != null) {
                            z.k f25 = kVar2.f(round2, true);
                            if (f25 != null) {
                                pVar4.f9079c = f25;
                            } else {
                                kVar = null;
                                if (kVar == null) {
                                    pVar4.f(kVar, pVar4.f9078b, true);
                                    pVar4.f9097v.setValue(c6.m.f1757a);
                                    pVar4.h(f23 - pVar4.f9084h, kVar);
                                } else {
                                    w1.f0 f0Var = pVar4.f9086k;
                                    if (f0Var != null) {
                                        f0Var.k();
                                    }
                                    pVar4.h(f23 - pVar4.f9084h, pVar4.g());
                                }
                            }
                        }
                        kVar = f24;
                        if (kVar == null) {
                        }
                    }
                    if (Math.abs(pVar4.f9084h) > 0.5f) {
                        f21 -= pVar4.f9084h;
                        pVar4.f9084h = 0.0f;
                    }
                    f9 = f21;
                }
                return Float.valueOf(-f9);
        }
    }

    public /* synthetic */ t(int i, Object obj, Object obj2) {
        this.f141d = i;
        this.f142e = obj;
    }
}
