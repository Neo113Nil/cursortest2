package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class pb {

    /* renamed from: b, reason: collision with root package name */
    public static final pb f2671b;

    /* renamed from: a, reason: collision with root package name */
    public final b8.k f2672a;

    static {
        int i3 = b8.k.f1430t;
        f2671b = new pb(b8.z.f1466v);
    }

    public pb(b8.k kVar) {
        this.f2672a = kVar;
    }

    public static pb a(y0 y0Var) {
        String str;
        long j;
        ob obVar;
        int G = y0Var.G();
        if (G < 0) {
            a2.r.o("Negative number of flags");
            return null;
        }
        int i3 = b8.k.f1430t;
        b8.j jVar = new b8.j();
        long j3 = 0;
        for (int i10 = 0; i10 < G; i10++) {
            long H = y0Var.H();
            int i11 = (int) H;
            long j10 = H >>> 3;
            if (j10 == 0) {
                j = 0;
                str = y0Var.w();
            } else {
                long j11 = j10 + j3;
                if (j11 > 2305843009213693951L) {
                    a2.r.o("Flag name larger than max size");
                    return null;
                }
                str = null;
                j = j11;
            }
            int i12 = i11 & 7;
            if (i12 == 0 || i12 == 1) {
                obVar = new ob(j, str, i12, 0L, null);
            } else if (i12 == 2) {
                obVar = new ob(j, str, i12, y0Var.H(), null);
            } else if (i12 == 3) {
                obVar = new ob(j, str, i12, Double.doubleToRawLongBits(y0Var.o()), null);
            } else if (i12 == 4) {
                obVar = new ob(j, str, i12, 0L, y0Var.w());
            } else {
                if (i12 != 5) {
                    a2.r.o(v4.a.n(new StringBuilder(String.valueOf(i12).length() + 23), "Unrecognized flag type ", i12));
                    return null;
                }
                obVar = new ob(j, str, i12, 0L, y0Var.z());
            }
            long j12 = obVar.f2641d;
            if (j12 != 0) {
                j3 = j12;
            }
            jVar.a(obVar);
        }
        return new pb(jVar.c());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pb)) {
            return false;
        }
        return this.f2672a.equals(((pb) obj).f2672a);
    }

    public final int hashCode() {
        b8.k kVar = this.f2672a;
        kVar.getClass();
        return a.a.M(kVar);
    }
}
