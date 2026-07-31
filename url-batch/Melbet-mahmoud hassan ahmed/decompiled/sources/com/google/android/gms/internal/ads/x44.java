package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x44 implements k64 {

    /* renamed from: a, reason: collision with root package name */
    private final vc4 f14038a;

    /* renamed from: b, reason: collision with root package name */
    private oc4 f14039b;

    /* renamed from: c, reason: collision with root package name */
    private pc4 f14040c;

    public x44(vc4 vc4Var) {
        this.f14038a = vc4Var;
    }

    @Override // com.google.android.gms.internal.ads.k64
    public final long a() {
        pc4 pc4Var = this.f14040c;
        if (pc4Var != null) {
            return pc4Var.b();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.k64
    public final void b() {
        if (this.f14039b != null) {
            this.f14039b = null;
        }
        this.f14040c = null;
    }

    @Override // com.google.android.gms.internal.ads.k64
    public final void c() {
        oc4 oc4Var = this.f14039b;
        if (oc4Var instanceof j0) {
            ((j0) oc4Var).a();
        }
    }

    @Override // com.google.android.gms.internal.ads.k64
    public final void d(long j7, long j8) {
        oc4 oc4Var = this.f14039b;
        Objects.requireNonNull(oc4Var);
        oc4Var.h(j7, j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        if (r6.b() != r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        if (r6.b() != r11) goto L33;
     */
    @Override // com.google.android.gms.internal.ads.k64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(fc1 fc1Var, Uri uri, Map<String, List<String>> map, long j7, long j8, rc4 rc4Var) {
        jc4 jc4Var = new jc4(fc1Var, j7, j8);
        this.f14040c = jc4Var;
        if (this.f14039b != null) {
            return;
        }
        oc4[] a7 = this.f14038a.a(uri, map);
        int length = a7.length;
        if (length == 1) {
            this.f14039b = a7[0];
        } else {
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                oc4 oc4Var = a7[i7];
                try {
                } catch (EOFException unused) {
                    if (this.f14039b == null) {
                    }
                } catch (Throwable th) {
                    wu1.f(this.f14039b != null || jc4Var.b() == j7);
                    jc4Var.i();
                    throw th;
                }
                if (oc4Var.c(jc4Var)) {
                    this.f14039b = oc4Var;
                    wu1.f(true);
                    jc4Var.i();
                    break;
                } else {
                    if (this.f14039b == null) {
                    }
                    boolean z6 = true;
                    wu1.f(z6);
                    jc4Var.i();
                    i7++;
                }
            }
            if (this.f14039b == null) {
                String f7 = n13.f(a7);
                StringBuilder sb = new StringBuilder(f7.length() + 58);
                sb.append("None of the available extractors (");
                sb.append(f7);
                sb.append(") could read the stream.");
                throw new o74(sb.toString(), uri);
            }
        }
        this.f14039b.g(rc4Var);
    }

    @Override // com.google.android.gms.internal.ads.k64
    public final int f(md4 md4Var) {
        oc4 oc4Var = this.f14039b;
        Objects.requireNonNull(oc4Var);
        pc4 pc4Var = this.f14040c;
        Objects.requireNonNull(pc4Var);
        return oc4Var.e(pc4Var, md4Var);
    }
}
