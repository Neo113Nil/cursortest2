package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gwk extends AtomicInteger {
    public static final gwg a;
    public final gwk b;
    public final String c;
    public volatile gwh currentMetadata;
    public final String d;
    public final String e;
    public final long f;
    public final guc g;
    public int h;
    public gwk i;
    public boolean j;
    public volatile long k;
    int l;
    private final int m;

    static {
        gwg gwjVar;
        try {
            gwjVar = new gwi();
        } catch (Error | RuntimeException unused) {
            gwjVar = new gwj();
        }
        a = gwjVar;
    }

    public gwk(gwk gwkVar, String str, int i, long j, guc gucVar) {
        this.l = 2;
        this.j = false;
        this.k = 0L;
        this.b = gwkVar.f() ? gwkVar.b : gwkVar;
        this.c = str;
        this.h = -1;
        this.d = "B";
        this.e = "a";
        this.m = i;
        this.f = j;
        this.g = gucVar;
    }

    final int a() {
        gwk gwkVar = this.b;
        if (gwkVar == null) {
            return -1;
        }
        return gwkVar.h;
    }

    public final gtx b(boolean z, int i, Map map, Map map2) {
        int i2;
        jkj k = gtx.a.k();
        if (!k.b.M()) {
            k.t();
        }
        String str = this.c;
        jkp jkpVar = k.b;
        gtx gtxVar = (gtx) jkpVar;
        str.getClass();
        gtxVar.b |= 1;
        gtxVar.c = str;
        int i3 = this.h;
        if (!jkpVar.M()) {
            k.t();
        }
        jkp jkpVar2 = k.b;
        gtx gtxVar2 = (gtx) jkpVar2;
        gtxVar2.b |= 2;
        gtxVar2.d = i3;
        if (!jkpVar2.M()) {
            k.t();
        }
        jkp jkpVar3 = k.b;
        gtx gtxVar3 = (gtx) jkpVar3;
        gtxVar3.b |= 4;
        gtxVar3.e = i;
        int i4 = this.l;
        if (!jkpVar3.M()) {
            k.t();
        }
        jkp jkpVar4 = k.b;
        gtx gtxVar4 = (gtx) jkpVar4;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        gtxVar4.l = i5;
        gtxVar4.b |= 512;
        boolean z2 = this.j;
        if (!jkpVar4.M()) {
            k.t();
        }
        jkp jkpVar5 = k.b;
        gtx gtxVar5 = (gtx) jkpVar5;
        gtxVar5.b |= 1024;
        gtxVar5.m = z2;
        long j = this.f;
        if (!jkpVar5.M()) {
            k.t();
        }
        gtx gtxVar6 = (gtx) k.b;
        gtxVar6.b |= 8;
        gtxVar6.f = j / 1000000;
        long j2 = this.k;
        if (j2 != 0) {
            long j3 = (4611686018427387903L & j2) / 1000000;
            if (!k.b.M()) {
                k.t();
            }
            gtx gtxVar7 = (gtx) k.b;
            gtxVar7.b |= 32;
            gtxVar7.h = j3;
            hoq.H(true);
            boolean z3 = (j2 & 4611686018427387904L) != 0;
            if (!k.b.M()) {
                k.t();
            }
            gtx gtxVar8 = (gtx) k.b;
            gtxVar8.b |= 256;
            gtxVar8.k = z3;
        }
        if (z) {
            int i6 = get();
            if (!k.b.M()) {
                k.t();
            }
            gtx gtxVar9 = (gtx) k.b;
            gtxVar9.b |= 128;
            gtxVar9.j = i6;
        }
        String str2 = this.d;
        if (!str2.isEmpty()) {
            String str3 = this.e;
            if (!str3.isEmpty() && (i2 = this.m) != 0 && !map.isEmpty() && !map2.isEmpty()) {
                if (map.containsKey(str2)) {
                    int intValue = ((Integer) map.get(str2)).intValue();
                    if (!k.b.M()) {
                        k.t();
                    }
                    gtx gtxVar10 = (gtx) k.b;
                    gtxVar10.b |= 2048;
                    gtxVar10.n = intValue;
                }
                if (map2.containsKey(str3)) {
                    int intValue2 = ((Integer) map2.get(str3)).intValue();
                    if (!k.b.M()) {
                        k.t();
                    }
                    gtx gtxVar11 = (gtx) k.b;
                    gtxVar11.b |= 4096;
                    gtxVar11.o = intValue2;
                }
                if (!k.b.M()) {
                    k.t();
                }
                gtx gtxVar12 = (gtx) k.b;
                gtxVar12.b |= 8192;
                gtxVar12.p = i2;
            }
        }
        return (gtx) k.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final guc c() {
        Object a2 = a.a(this);
        if (a2 == null) {
            return gub.a;
        }
        gua b = guc.b();
        while (a2 != null) {
            gwh gwhVar = (gwh) a2;
            b.a((hoq) gwhVar.b, gwhVar.a);
            a2 = gwhVar.c;
        }
        return ((guc) b).f();
    }

    final void d(int i, gwk gwkVar) {
        this.h = i;
        this.i = gwkVar;
    }

    final boolean e() {
        return this.k != 0;
    }

    final boolean f() {
        return this.h < 0;
    }

    public gwk(String str, int i, guc gucVar, int i2) {
        this.l = 2;
        this.j = false;
        this.k = 0L;
        this.b = null;
        this.c = str;
        this.h = 0;
        this.d = "B";
        this.e = "a";
        this.m = i;
        this.f = 0L;
        this.g = gucVar;
        this.k = i2 != 2 ? Long.MIN_VALUE : 0L;
    }
}
