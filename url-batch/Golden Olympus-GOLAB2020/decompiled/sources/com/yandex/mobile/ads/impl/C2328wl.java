package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.wl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2328wl implements xl1 {

    /* renamed from: a, reason: collision with root package name */
    private final t70 f34107a;

    /* renamed from: b, reason: collision with root package name */
    private p70 f34108b;

    /* renamed from: c, reason: collision with root package name */
    private lz f34109c;

    public C2328wl(t70 t70Var) {
        this.f34107a = t70Var;
    }

    public final void a() {
        p70 p70Var = this.f34108b;
        if (p70Var instanceof n11) {
            ((n11) p70Var).a();
        }
    }

    public final long b() {
        lz lzVar = this.f34109c;
        if (lzVar != null) {
            return lzVar.a();
        }
        return -1L;
    }

    public final void c() {
        p70 p70Var = this.f34108b;
        if (p70Var != null) {
            p70Var.release();
            this.f34108b = null;
        }
        this.f34109c = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r7.f34108b != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        r12 = new java.lang.StringBuilder("None of the available extractors (");
        r13 = com.yandex.mobile.ads.impl.u82.f32873a;
        r13 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r11 >= r8.length) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        r13.append(r8[r11].getClass().getSimpleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if (r11 >= (r8.length - 1)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        r13.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        r12.append(r13.toString());
        r12.append(") could read the stream.");
        r8 = r12.toString();
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        throw new com.yandex.mobile.ads.impl.z72(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(iv ivVar, Uri uri, Map map, long j4, long j5, r70 r70Var) {
        lz lzVar = new lz(ivVar, j4, j5);
        this.f34109c = lzVar;
        if (this.f34108b != null) {
            return;
        }
        p70[] a4 = this.f34107a.a(uri, map);
        int i4 = 0;
        if (a4.length == 1) {
            this.f34108b = a4[0];
        } else {
            int length = a4.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                p70 p70Var = a4[i5];
                try {
                } catch (EOFException unused) {
                    if (this.f34108b != null) {
                        continue;
                    } else if (lzVar.a() != j4) {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    if (this.f34108b == null && lzVar.a() != j4) {
                        throw new IllegalStateException();
                    }
                    lzVar.c();
                    throw th;
                }
                if (p70Var.a(lzVar)) {
                    this.f34108b = p70Var;
                    lzVar.c();
                    break;
                } else {
                    if (this.f34108b == null && lzVar.a() != j4) {
                        throw new IllegalStateException();
                    }
                    lzVar.c();
                    i5++;
                }
            }
        }
        this.f34108b.a(r70Var);
    }

    public final int a(hj1 hj1Var) {
        p70 p70Var = this.f34108b;
        p70Var.getClass();
        lz lzVar = this.f34109c;
        lzVar.getClass();
        return p70Var.a(lzVar, hj1Var);
    }

    public final void a(long j4, long j5) {
        p70 p70Var = this.f34108b;
        p70Var.getClass();
        p70Var.a(j4, j5);
    }
}
