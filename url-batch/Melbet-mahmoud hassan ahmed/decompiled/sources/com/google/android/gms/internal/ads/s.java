package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f11585a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<r> f11586b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final d0 f11587c = new d0();

    /* renamed from: d, reason: collision with root package name */
    private t f11588d;

    /* renamed from: e, reason: collision with root package name */
    private int f11589e;

    /* renamed from: f, reason: collision with root package name */
    private int f11590f;

    /* renamed from: g, reason: collision with root package name */
    private long f11591g;

    private final long d(pc4 pc4Var, int i7) {
        ((jc4) pc4Var).m(this.f11585a, 0, i7, false);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 = (j7 << 8) | (this.f11585a[i8] & 255);
        }
        return j7;
    }

    public final void a(t tVar) {
        this.f11588d = tVar;
    }

    public final void b() {
        this.f11589e = 0;
        this.f11586b.clear();
        this.f11587c.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0087, code lost:
    
        if (r0 == 1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(pc4 pc4Var) {
        String str;
        jc4 jc4Var;
        int b7;
        int c7;
        long j7;
        int i7;
        wu1.b(this.f11588d);
        while (true) {
            r peek = this.f11586b.peek();
            if (peek != null) {
                long b8 = pc4Var.b();
                j7 = peek.f10933b;
                if (b8 >= j7) {
                    t tVar = this.f11588d;
                    i7 = this.f11586b.pop().f10932a;
                    ((w) tVar).f13652a.f(i7);
                    return true;
                }
            }
            int i8 = this.f11589e;
            if (i8 == 0) {
                long d7 = this.f11587c.d(pc4Var, true, false, 4);
                if (d7 == -2) {
                    pc4Var.i();
                    while (true) {
                        jc4Var = (jc4) pc4Var;
                        jc4Var.n(this.f11585a, 0, 4, false);
                        b7 = d0.b(this.f11585a[0]);
                        if (b7 != -1 && b7 <= 4) {
                            c7 = (int) d0.c(this.f11585a, b7, false);
                            a0 a0Var = ((w) this.f11588d).f13652a;
                            if (a0.o(c7)) {
                                break;
                            }
                        }
                        jc4Var.p(1, false);
                    }
                    jc4Var.p(b7, false);
                    d7 = c7;
                }
                if (d7 == -1) {
                    return false;
                }
                this.f11590f = (int) d7;
                this.f11589e = 1;
            }
            this.f11591g = this.f11587c.d(pc4Var, false, true, 8);
            this.f11589e = 2;
            t tVar2 = this.f11588d;
            int i9 = this.f11590f;
            a0 a0Var2 = ((w) tVar2).f13652a;
            int n7 = a0.n(i9);
            if (n7 != 0) {
                if (n7 == 1) {
                    long b9 = pc4Var.b();
                    this.f11586b.push(new r(this.f11590f, this.f11591g + b9, null));
                    ((w) this.f11588d).f13652a.k(this.f11590f, b9, this.f11591g);
                    this.f11589e = 0;
                    return true;
                }
                if (n7 == 2) {
                    long j8 = this.f11591g;
                    if (j8 <= 8) {
                        ((w) this.f11588d).f13652a.j(this.f11590f, d(pc4Var, (int) j8));
                        this.f11589e = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j8);
                    throw dz.a(sb.toString(), null);
                }
                if (n7 != 3) {
                    if (n7 == 4) {
                        ((w) this.f11588d).f13652a.d(this.f11590f, (int) this.f11591g, pc4Var);
                        this.f11589e = 0;
                        return true;
                    }
                    long j9 = this.f11591g;
                    if (j9 != 4 && j9 != 8) {
                        StringBuilder sb2 = new StringBuilder(40);
                        sb2.append("Invalid float size: ");
                        sb2.append(j9);
                        throw dz.a(sb2.toString(), null);
                    }
                    t tVar3 = this.f11588d;
                    int i10 = (int) j9;
                    ((w) tVar3).f13652a.i(this.f11590f, i10 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(d(pc4Var, i10)));
                    this.f11589e = 0;
                    return true;
                }
                long j10 = this.f11591g;
                if (j10 > 2147483647L) {
                    StringBuilder sb3 = new StringBuilder(41);
                    sb3.append("String element size: ");
                    sb3.append(j10);
                    throw dz.a(sb3.toString(), null);
                }
                t tVar4 = this.f11588d;
                int i11 = this.f11590f;
                int i12 = (int) j10;
                if (i12 == 0) {
                    str = "";
                } else {
                    byte[] bArr = new byte[i12];
                    ((jc4) pc4Var).m(bArr, 0, i12, false);
                    while (i12 > 0) {
                        int i13 = i12 - 1;
                        if (bArr[i13] != 0) {
                            break;
                        }
                        i12 = i13;
                    }
                    str = new String(bArr, 0, i12);
                }
                ((w) tVar4).f13652a.l(i11, str);
                this.f11589e = 0;
                return true;
            }
            ((jc4) pc4Var).p((int) this.f11591g, false);
            this.f11589e = 0;
        }
    }
}
