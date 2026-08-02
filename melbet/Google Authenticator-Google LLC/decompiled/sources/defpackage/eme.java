package defpackage;

import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eme {
    public String a;
    public lew b;
    public String c;
    public eru d;
    public eoc e;
    public Predicate f;
    public ekd g;
    public int h;
    private boolean i;
    private lgv j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private byte o;

    public final emf a() {
        lgv lgvVar;
        Predicate predicate;
        if (this.o == 31 && (lgvVar = this.j) != null && (predicate = this.f) != null) {
            return new emf(this.a, this.i, lgvVar, this.b, this.c, this.d, this.k, this.h, this.e, this.l, this.m, predicate, this.g, this.n);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.o & 1) == 0) {
            sb.append(" isEventNameConstant");
        }
        if (this.j == null) {
            sb.append(" metric");
        }
        if ((this.o & 2) == 0) {
            sb.append(" isUnsampled");
        }
        if ((this.o & 4) == 0) {
            sb.append(" shouldAttachActiveTraces");
        }
        if ((this.o & 8) == 0) {
            sb.append(" maxActiveTraces");
        }
        if (this.f == null) {
            sb.append(" activeTracePredicate");
        }
        if ((this.o & 16) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.n = i;
        this.o = (byte) (this.o | 16);
    }

    public final void c(boolean z) {
        this.i = z;
        this.o = (byte) (this.o | 1);
    }

    public final void d(boolean z) {
        this.k = z;
        this.o = (byte) (this.o | 2);
    }

    public final void e(int i) {
        this.m = i;
        this.o = (byte) (this.o | 8);
    }

    public final void f(lgv lgvVar) {
        if (lgvVar == null) {
            throw new NullPointerException("Null metric");
        }
        this.j = lgvVar;
    }

    public final void g(boolean z) {
        this.l = z;
        this.o = (byte) (this.o | 4);
    }
}
