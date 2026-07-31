package com.google.android.gms.internal.ads;

import java.util.Stack;

/* loaded from: classes.dex */
final class oh {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9666a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final Stack<nh> f9667b = new Stack<>();

    /* renamed from: c, reason: collision with root package name */
    private final xh f9668c = new xh();

    /* renamed from: d, reason: collision with root package name */
    private int f9669d;

    /* renamed from: e, reason: collision with root package name */
    private int f9670e;

    /* renamed from: f, reason: collision with root package name */
    private long f9671f;

    /* renamed from: g, reason: collision with root package name */
    private rh f9672g;

    oh() {
    }

    private final long d(bh bhVar, int i7) {
        bhVar.h(this.f9666a, 0, i7, false);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 = (j7 << 8) | (this.f9666a[i8] & 255);
        }
        return j7;
    }

    public final void a() {
        this.f9669d = 0;
        this.f9667b.clear();
        this.f9668c.d();
    }

    public final void b(rh rhVar) {
        this.f9672g = rhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x008b, code lost:
    
        if (r0 == 1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(bh bhVar) {
        String str;
        int b7;
        int c7;
        long j7;
        int i7;
        jm.e(this.f9672g != null);
        while (true) {
            if (!this.f9667b.isEmpty()) {
                long d7 = bhVar.d();
                j7 = this.f9667b.peek().f9093b;
                if (d7 >= j7) {
                    rh rhVar = this.f9672g;
                    i7 = this.f9667b.pop().f9092a;
                    rhVar.f11157a.c(i7);
                    return true;
                }
            }
            int i8 = this.f9669d;
            if (i8 == 0) {
                long e7 = this.f9668c.e(bhVar, true, false, 4);
                if (e7 == -2) {
                    bhVar.e();
                    while (true) {
                        bhVar.g(this.f9666a, 0, 4, false);
                        b7 = xh.b(this.f9666a[0]);
                        if (b7 != -1 && b7 <= 4) {
                            c7 = (int) xh.c(this.f9666a, b7, false);
                            vh vhVar = this.f9672g.f11157a;
                            if (vh.m(c7)) {
                                break;
                            }
                        }
                        bhVar.i(1, false);
                    }
                    bhVar.i(b7, false);
                    e7 = c7;
                }
                if (e7 == -1) {
                    return false;
                }
                this.f9670e = (int) e7;
                this.f9669d = 1;
            }
            this.f9671f = this.f9668c.e(bhVar, false, true, 8);
            this.f9669d = 2;
            rh rhVar2 = this.f9672g;
            int i9 = this.f9670e;
            vh vhVar2 = rhVar2.f11157a;
            int l7 = vh.l(i9);
            if (l7 != 0) {
                if (l7 == 1) {
                    long d8 = bhVar.d();
                    this.f9667b.add(new nh(this.f9670e, this.f9671f + d8, null));
                    this.f9672g.f11157a.i(this.f9670e, d8, this.f9671f);
                    this.f9669d = 0;
                    return true;
                }
                if (l7 == 2) {
                    long j8 = this.f9671f;
                    if (j8 <= 8) {
                        this.f9672g.f11157a.h(this.f9670e, d(bhVar, (int) j8));
                        this.f9669d = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j8);
                    throw new af(sb.toString());
                }
                if (l7 == 3) {
                    long j9 = this.f9671f;
                    if (j9 > 2147483647L) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j9);
                        throw new af(sb2.toString());
                    }
                    rh rhVar3 = this.f9672g;
                    int i10 = this.f9670e;
                    int i11 = (int) j9;
                    if (i11 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i11];
                        bhVar.h(bArr, 0, i11, false);
                        str = new String(bArr);
                    }
                    rhVar3.f11157a.j(i10, str);
                    this.f9669d = 0;
                    return true;
                }
                if (l7 == 4) {
                    this.f9672g.f11157a.k(this.f9670e, (int) this.f9671f, bhVar);
                    this.f9669d = 0;
                    return true;
                }
                long j10 = this.f9671f;
                if (j10 != 4 && j10 != 8) {
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Invalid float size: ");
                    sb3.append(j10);
                    throw new af(sb3.toString());
                }
                rh rhVar4 = this.f9672g;
                int i12 = (int) j10;
                rhVar4.f11157a.g(this.f9670e, i12 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(d(bhVar, i12)));
                this.f9669d = 0;
                return true;
            }
            bhVar.i((int) this.f9671f, false);
            this.f9669d = 0;
        }
    }
}
