package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebu {
    public gzp a;
    public gzp b;
    public eca c;
    public gzp d;
    public gzp e;
    public hel f;
    public ebz g;
    public eck h;
    public Runnable i;
    public byte j;
    public int k;
    public dja l;
    private gzp m;
    private gzp n;
    private gzp o;
    private gzp p;
    private gzp q;
    private gzp r;
    private boolean s;

    public ebu(ebv ebvVar) {
        gyf gyfVar = gyf.a;
        this.m = gyfVar;
        this.n = gyfVar;
        this.o = gyfVar;
        this.a = gyfVar;
        this.b = gyfVar;
        this.d = gyfVar;
        this.e = gyfVar;
        this.p = gyfVar;
        this.q = gyfVar;
        this.r = gyfVar;
        this.m = ebvVar.a;
        this.n = ebvVar.b;
        this.o = ebvVar.c;
        this.a = ebvVar.d;
        this.l = ebvVar.r;
        this.b = ebvVar.e;
        this.c = ebvVar.f;
        this.d = ebvVar.g;
        this.e = ebvVar.h;
        this.f = ebvVar.i;
        this.g = ebvVar.j;
        this.p = ebvVar.k;
        this.q = ebvVar.l;
        this.r = ebvVar.m;
        this.k = ebvVar.q;
        this.h = ebvVar.n;
        this.s = ebvVar.o;
        this.i = ebvVar.p;
        this.j = (byte) 3;
    }

    public final ebv a() {
        dja djaVar;
        eca ecaVar;
        hel helVar;
        ebz ebzVar;
        eck eckVar;
        Runnable runnable;
        if (this.j == 3 && (djaVar = this.l) != null && (ecaVar = this.c) != null && (helVar = this.f) != null && (ebzVar = this.g) != null && this.k != 0 && (eckVar = this.h) != null && (runnable = this.i) != null) {
            return new ebv(this.m, this.n, this.o, this.a, djaVar, this.b, ecaVar, this.d, this.e, helVar, ebzVar, this.p, this.q, this.r, eckVar, this.s, runnable);
        }
        StringBuilder sb = new StringBuilder();
        if (this.l == null) {
            sb.append(" policyFooterCustomizer");
        }
        if (this.c == null) {
            sb.append(" flavorsFeature");
        }
        if (this.f == null) {
            sb.append(" commonActions");
        }
        if (this.g == null) {
            sb.append(" educationManager");
        }
        if ((this.j & 1) == 0) {
            sb.append(" isExperimental");
        }
        if (this.k == 0) {
            sb.append(" largeScreenDialogAlignment");
        }
        if (this.h == null) {
            sb.append(" materialVersion");
        }
        if ((this.j & 2) == 0) {
            sb.append(" enableQuickProfileSwitching");
        }
        if (this.i == null) {
            sb.append(" onSlowAccountSwitchingRunnable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.s = z;
        this.j = (byte) (this.j | 2);
    }

    public ebu() {
        gyf gyfVar = gyf.a;
        this.m = gyfVar;
        this.n = gyfVar;
        this.o = gyfVar;
        this.a = gyfVar;
        this.b = gyfVar;
        this.d = gyfVar;
        this.e = gyfVar;
        this.p = gyfVar;
        this.q = gyfVar;
        this.r = gyfVar;
    }
}
