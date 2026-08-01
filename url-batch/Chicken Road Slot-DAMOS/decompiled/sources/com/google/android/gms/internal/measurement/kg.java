package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class kg implements jg, ug {

    /* renamed from: i, reason: collision with root package name */
    public static final String f2464i = new String();

    /* renamed from: a, reason: collision with root package name */
    public final Level f2465a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2466b;

    /* renamed from: c, reason: collision with root package name */
    public og f2467c;

    /* renamed from: d, reason: collision with root package name */
    public rg f2468d;

    /* renamed from: e, reason: collision with root package name */
    public zg f2469e;

    /* renamed from: f, reason: collision with root package name */
    public g f2470f;
    public Object[] g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v5 f2471h;

    public kg(v5 v5Var, Level level) {
        Objects.requireNonNull(v5Var);
        this.f2471h = v5Var;
        d.f2209a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.f2467c = null;
        this.f2468d = null;
        this.f2469e = null;
        this.f2470f = null;
        this.g = null;
        g1.c(level, "level");
        this.f2465a = level;
        this.f2466b = nanos;
    }

    @Override // com.google.android.gms.internal.measurement.ug
    public final ug a(Throwable th) {
        vg vgVar = ng.f2585a;
        g1.c(vgVar, "metadata key");
        if (th != null) {
            e(vgVar, th);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.ug
    public final ug b() {
        qg qgVar = new qg();
        qgVar.f2718b = 0;
        if (this.f2468d == null) {
            this.f2468d = qgVar;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022b  */
    @Override // com.google.android.gms.internal.measurement.ug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str, Object[] objArr) {
        boolean z10;
        zg zgVar;
        og ogVar;
        StackTraceElement[] stackTraceElementArr;
        int m10;
        int i3;
        zg zgVar2;
        ah ahVar;
        zg zgVar3;
        rg rgVar = this.f2468d;
        pg pgVar = rg.f2766a;
        if (rgVar == null) {
            ((i) d.f2209a).getClass();
            i.f2387b.getClass();
            this.f2468d = pgVar;
        }
        sg sgVar = this.f2468d;
        if (sgVar != pgVar) {
            og ogVar2 = this.f2467c;
            if (ogVar2 != null && ogVar2.f2651f > 0) {
                g1.c(sgVar, "logSiteKey");
                int i10 = ogVar2.f2651f;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (ng.f2590f.equals(ogVar2.i(i11))) {
                        sgVar = new bh(sgVar, ogVar2.j(i11));
                    }
                }
            }
        } else {
            sgVar = null;
        }
        oa d10 = d();
        int a9 = d10.a();
        int i12 = 0;
        while (true) {
            if (i12 >= a9) {
                break;
            }
            if (d10.i(i12).f2898a != "eye3tag") {
                i12++;
            } else if (d10.k(ng.f2585a) == null) {
                vg vgVar = ng.f2592i;
                if (d10.k(vgVar) == null) {
                    e(vgVar, ch.SMALL);
                }
            }
        }
        og ogVar3 = this.f2467c;
        int i13 = -1;
        zg zgVar4 = zg.f3054a;
        if (ogVar3 != null) {
            if (sgVar != null) {
                int i14 = ig.f2410d;
                if (ogVar3.k(ng.f2588d) != null) {
                    kotlin.collections.i0.j();
                    return;
                }
                og ogVar4 = this.f2467c;
                fg fgVar = gg.f2342d;
                if (((Integer) ogVar4.k(ng.f2586b)) == null) {
                    zgVar2 = null;
                } else {
                    gg ggVar = (gg) gg.f2342d.c(sgVar, ogVar4);
                    AtomicLong atomicLong = ggVar.f2343c;
                    zgVar2 = ggVar;
                    if (atomicLong.incrementAndGet() < r10.intValue()) {
                        zgVar2 = zgVar4;
                    }
                }
                og ogVar5 = this.f2467c;
                fg fgVar2 = ah.f2150d;
                Integer num = (Integer) ogVar5.k(ng.f2587c);
                if (num == null || num.intValue() <= 0) {
                    ahVar = 0;
                } else {
                    ahVar = (ah) ah.f2150d.c(sgVar, ogVar5);
                    int nextInt = ((Random) ah.f2151e.get()).nextInt(num.intValue());
                    AtomicInteger atomicInteger = ahVar.f2152c;
                    if ((nextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        ahVar = zgVar4;
                    }
                }
                if (zgVar2 != null) {
                    if (ahVar != 0 && zgVar2 != zgVar4 && ahVar != (zgVar3 = zg.f3055b)) {
                        if (ahVar != zgVar4 && zgVar2 != zgVar3) {
                            zgVar2 = new xg(zgVar2, ahVar);
                        }
                    }
                    this.f2469e = zgVar2;
                    if (zgVar2 == zgVar4) {
                        z10 = false;
                        zgVar = this.f2469e;
                        if (zgVar != null) {
                            yg ygVar = (yg) yg.f3022c.c(sgVar, this.f2467c);
                            AtomicInteger atomicInteger2 = ygVar.f3024b;
                            AtomicBoolean atomicBoolean = ygVar.f3023a;
                            int incrementAndGet = atomicInteger2.incrementAndGet();
                            if (zgVar != zgVar4 && atomicBoolean.compareAndSet(false, true)) {
                                try {
                                    zgVar.a();
                                    atomicBoolean.set(false);
                                    atomicInteger2.addAndGet(-incrementAndGet);
                                    i13 = (-1) + incrementAndGet;
                                } catch (Throwable th) {
                                    atomicBoolean.set(false);
                                    throw th;
                                }
                            }
                            if (z10 && i13 > 0 && (ogVar = this.f2467c) != null) {
                                ogVar.l(ng.f2589e, Integer.valueOf(i13));
                            }
                            z10 &= i13 >= 0;
                        }
                        if (z10) {
                            return;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                        this.g = copyOf;
                        for (Object obj : copyOf) {
                        }
                        if (str != f2464i) {
                            c0 c0Var = c0.f2179b;
                            this.f2470f = new g(str);
                        }
                        ((i) d.f2209a).getClass();
                        x b10 = n.f2553b.b();
                        if (!b10.f2960a.isEmpty()) {
                            oa d11 = d();
                            vg vgVar2 = ng.f2591h;
                            x xVar = (x) d11.k(vgVar2);
                            if (xVar != null) {
                                w wVar = xVar.f2960a;
                                if (!wVar.isEmpty()) {
                                    w wVar2 = b10.f2960a;
                                    if (!wVar2.isEmpty()) {
                                        xVar = new x(new w(wVar2, wVar));
                                    }
                                    b10 = xVar;
                                }
                            }
                            e(vgVar2, b10);
                        }
                        y2 y2Var = (y2) this.f2471h.f2870e;
                        try {
                            h0 h0Var = (h0) h0.f2353e.get();
                            int i15 = h0Var.f2354d + 1;
                            h0Var.f2354d = i15;
                            if (i15 == 0) {
                                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                            }
                            try {
                                if (i15 <= 100) {
                                    y2Var.f(this);
                                } else {
                                    v5.d("unbounded recursion in log statement", this);
                                }
                                h0Var.close();
                                return;
                            } finally {
                            }
                        } catch (RuntimeException e2) {
                            try {
                                y2Var.i(e2, this);
                                return;
                            } catch (RuntimeException e9) {
                                String name = e9.getClass().getName();
                                String message = e9.getMessage();
                                StringBuilder sb2 = new StringBuilder(name.length() + 2 + String.valueOf(message).length());
                                sb2.append(name);
                                sb2.append(": ");
                                sb2.append(message);
                                v5.d(sb2.toString(), this);
                                try {
                                    e9.printStackTrace(System.err);
                                    return;
                                } catch (RuntimeException unused) {
                                    return;
                                }
                            }
                        }
                    }
                }
                zgVar2 = ahVar;
                this.f2469e = zgVar2;
                if (zgVar2 == zgVar4) {
                }
            }
            og ogVar6 = this.f2467c;
            vg vgVar3 = ng.f2592i;
            ch chVar = (ch) ogVar6.k(vgVar3);
            if (chVar != null) {
                og ogVar7 = this.f2467c;
                if (ogVar7 != null && (m10 = ogVar7.m(vgVar3)) >= 0) {
                    int i16 = m10 + m10;
                    int i17 = i16 + 2;
                    while (true) {
                        i3 = ogVar7.f2651f;
                        if (i17 >= i3 + i3) {
                            break;
                        }
                        Object obj2 = ogVar7.f2650e[i17];
                        if (!obj2.equals(vgVar3)) {
                            Object[] objArr2 = ogVar7.f2650e;
                            objArr2[i16] = obj2;
                            objArr2[i16 + 1] = objArr2[i17 + 1];
                            i16 += 2;
                        }
                        i17 += 2;
                    }
                    ogVar7.f2651f = i3 - ((i17 - i16) >> 1);
                    while (i16 < i17) {
                        ogVar7.f2650e[i16] = null;
                        i16++;
                    }
                }
                oa d12 = d();
                vg vgVar4 = ng.f2585a;
                Throwable th2 = (Throwable) d12.k(vgVar4);
                int i18 = chVar.f2208d;
                String[] strArr = f0.f2268a;
                if (i18 <= 0 && i18 != -1) {
                    te.a1.e("invalid maximum depth: 0");
                    return;
                }
                f0.f2269b.getClass();
                if (!(i18 == -1 || i18 > 0)) {
                    te.a1.e("maxDepth must be > 0 or -1");
                    return;
                }
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                String name2 = kg.class.getName();
                int i19 = 3;
                boolean z11 = false;
                while (true) {
                    if (i19 >= stackTrace.length) {
                        i19 = -1;
                        break;
                    }
                    if (!stackTrace[i19].getClassName().equals(name2)) {
                        if (z11) {
                            break;
                        }
                    } else {
                        z11 = true;
                    }
                    i19++;
                }
                if (i19 == -1) {
                    stackTraceElementArr = new StackTraceElement[0];
                } else {
                    int length = stackTrace.length - i19;
                    if (i18 <= 0 || i18 >= length) {
                        i18 = length;
                    }
                    stackTraceElementArr = new StackTraceElement[i18];
                    System.arraycopy(stackTrace, i19, stackTraceElementArr, 0, i18);
                }
                tg tgVar = new tg(chVar.toString(), th2);
                tgVar.setStackTrace(stackTraceElementArr);
                e(vgVar4, tgVar);
            }
        }
        z10 = true;
        zgVar = this.f2469e;
        if (zgVar != null) {
        }
        if (z10) {
        }
    }

    public final oa d() {
        og ogVar = this.f2467c;
        return ogVar != null ? ogVar : jh.f2432e;
    }

    public final void e(vg vgVar, Object obj) {
        if (this.f2467c == null) {
            og ogVar = new og();
            ogVar.f2650e = new Object[8];
            ogVar.f2651f = 0;
            this.f2467c = ogVar;
        }
        this.f2467c.l(vgVar, obj);
    }
}
