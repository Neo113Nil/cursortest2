package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3290h3 {

    /* renamed from: a, reason: collision with root package name */
    public int f31136a;

    /* renamed from: b, reason: collision with root package name */
    public long f31137b;

    /* renamed from: c, reason: collision with root package name */
    public int f31138c;

    /* renamed from: d, reason: collision with root package name */
    public int f31139d;

    /* renamed from: e, reason: collision with root package name */
    public int f31140e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f31141f = new int[com.anythink.basead.exoplayer.k.p.f8630b];

    /* renamed from: g, reason: collision with root package name */
    public final Lr f31142g = new Lr(com.anythink.basead.exoplayer.k.p.f8630b);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if (r13 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r12.f25675w >= r13) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r0 = java.lang.Math.min(r12.f25678z, 1);
        r12.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r0 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r5 = r12;
        r0 = r5.g(r12.f25672n, 0, java.lang.Math.min(1, 4096), 0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r0 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r5.f25675w += r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r0 != (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r5 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(J0 j02, long j9) {
        boolean z8;
        PA.n(j02.f25675w == j02.m());
        Lr lr = this.f31142g;
        lr.y(4);
        while (true) {
            if (j9 != -1 && j02.f25675w + 4 >= j9) {
                break;
            }
            try {
                z8 = j02.I(lr.f26233a, 0, 4, true);
            } catch (EOFException unused) {
                z8 = false;
            }
            if (!z8) {
                break;
            }
            lr.E(0);
            if (lr.P() == 1332176723) {
                j02.f25677y = 0;
                return true;
            }
            j02.b(1, false);
        }
    }

    public final boolean b(J0 j02, boolean z8) {
        boolean z9;
        boolean z10;
        this.f31136a = 0;
        this.f31137b = 0L;
        this.f31138c = 0;
        this.f31139d = 0;
        this.f31140e = 0;
        Lr lr = this.f31142g;
        lr.y(27);
        try {
            z9 = j02.I(lr.f26233a, 0, 27, z8);
        } catch (EOFException e6) {
            if (!z8) {
                throw e6;
            }
            z9 = false;
        }
        if (z9 && lr.P() == 1332176723) {
            if (lr.K() == 0) {
                this.f31136a = lr.K();
                this.f31137b = lr.e();
                lr.a();
                lr.a();
                lr.a();
                int K8 = lr.K();
                this.f31138c = K8;
                this.f31139d = K8 + 27;
                lr.y(K8);
                try {
                    z10 = j02.I(lr.f26233a, 0, this.f31138c, z8);
                } catch (EOFException e9) {
                    if (!z8) {
                        throw e9;
                    }
                    z10 = false;
                }
                if (z10) {
                    for (int i = 0; i < this.f31138c; i++) {
                        int K9 = lr.K();
                        this.f31141f[i] = K9;
                        this.f31140e += K9;
                    }
                    return true;
                }
            } else if (!z8) {
                throw W4.c("unsupported bit stream revision");
            }
        }
        return false;
    }
}
