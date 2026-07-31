package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class j84 implements Comparable<j84> {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7023f;

    /* renamed from: g, reason: collision with root package name */
    private final d84 f7024g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f7025h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f7026i;

    /* renamed from: j, reason: collision with root package name */
    private final int f7027j;

    /* renamed from: k, reason: collision with root package name */
    private final int f7028k;

    /* renamed from: l, reason: collision with root package name */
    private final int f7029l;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r4 <= 2.1474836E9f) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r10 >= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        if (r10 >= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r10 >= 0.0f) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:
    
        if (r10 >= 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j84(c0 c0Var, d84 d84Var, int i7, boolean z6) {
        boolean z7;
        this.f7024g = d84Var;
        boolean z8 = true;
        int i8 = 0;
        if (z6) {
            if (c0Var.f3665q != -1) {
                int i9 = d84Var.f9276a;
            }
            if (c0Var.f3666r != -1) {
                int i10 = d84Var.f9277b;
            }
            float f7 = c0Var.f3667s;
            if (f7 != -1.0f) {
                int i11 = d84Var.f9278c;
            }
            if (c0Var.f3656h != -1) {
                int i12 = d84Var.f9279d;
            }
            z7 = true;
            this.f7023f = z7;
            if (z6) {
                int i13 = c0Var.f3665q;
                if (i13 != -1) {
                    int i14 = d84Var.f9280e;
                }
                int i15 = c0Var.f3666r;
                if (i15 != -1) {
                    int i16 = d84Var.f9281f;
                }
                float f8 = c0Var.f3667s;
                if (f8 != -1.0f) {
                    int i17 = d84Var.f9282g;
                }
                int i18 = c0Var.f3656h;
                if (i18 != -1) {
                    int i19 = d84Var.f9283h;
                }
                this.f7025h = z8;
                this.f7026i = k84.m(i7, false);
                this.f7027j = c0Var.f3656h;
                this.f7028k = c0Var.a();
                while (true) {
                    if (i8 >= d84Var.f9287l.size()) {
                        i8 = Integer.MAX_VALUE;
                        break;
                    }
                    String str = c0Var.f3660l;
                    if (str != null && str.equals(d84Var.f9287l.get(i8))) {
                        break;
                    } else {
                        i8++;
                    }
                }
                this.f7029l = i8;
            }
            z8 = false;
            this.f7025h = z8;
            this.f7026i = k84.m(i7, false);
            this.f7027j = c0Var.f3656h;
            this.f7028k = c0Var.a();
            while (true) {
                if (i8 >= d84Var.f9287l.size()) {
                }
                i8++;
            }
            this.f7029l = i8;
        }
        z7 = false;
        this.f7023f = z7;
        if (z6) {
        }
        z8 = false;
        this.f7025h = z8;
        this.f7026i = k84.m(i7, false);
        this.f7027j = c0Var.f3656h;
        this.f7028k = c0Var.a();
        while (true) {
            if (i8 >= d84Var.f9287l.size()) {
            }
            i8++;
        }
        this.f7029l = i8;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j84 j84Var) {
        s83 s83Var;
        s83 a7;
        s83 s83Var2;
        if (this.f7023f && this.f7026i) {
            a7 = k84.f7420f;
        } else {
            s83Var = k84.f7420f;
            a7 = s83Var.a();
        }
        t63 c7 = t63.i().d(this.f7026i, j84Var.f7026i).d(this.f7023f, j84Var.f7023f).d(this.f7025h, j84Var.f7025h).c(Integer.valueOf(this.f7029l), Integer.valueOf(j84Var.f7029l), s83.c().a());
        Integer valueOf = Integer.valueOf(this.f7027j);
        Integer valueOf2 = Integer.valueOf(j84Var.f7027j);
        boolean z6 = this.f7024g.f9296u;
        s83Var2 = k84.f7421g;
        return c7.c(valueOf, valueOf2, s83Var2).c(Integer.valueOf(this.f7028k), Integer.valueOf(j84Var.f7028k), a7).c(Integer.valueOf(this.f7027j), Integer.valueOf(j84Var.f7027j), a7).a();
    }
}
