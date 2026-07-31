package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zs0 extends ts0 implements im<tl> {

    /* renamed from: i, reason: collision with root package name */
    private String f15243i;

    /* renamed from: j, reason: collision with root package name */
    private final sq0 f15244j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15245k;

    /* renamed from: l, reason: collision with root package name */
    private final ys0 f15246l;

    /* renamed from: m, reason: collision with root package name */
    private final ds0 f15247m;

    /* renamed from: n, reason: collision with root package name */
    private ByteBuffer f15248n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f15249o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f15250p;

    /* renamed from: q, reason: collision with root package name */
    private final String f15251q;

    /* renamed from: r, reason: collision with root package name */
    private final int f15252r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f15253s;

    public zs0(tq0 tq0Var, sq0 sq0Var) {
        super(tq0Var);
        this.f15244j = sq0Var;
        this.f15246l = new ys0();
        this.f15247m = new ds0();
        this.f15250p = new Object();
        this.f15251q = tq0Var != null ? tq0Var.q() : "";
        this.f15252r = tq0Var != null ? tq0Var.f() : 0;
    }

    protected static final String A(String str) {
        String valueOf = String.valueOf(bo0.e(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    private final void B() {
        int a7 = (int) this.f15246l.a();
        int a8 = (int) this.f15247m.a(this.f15248n);
        int position = this.f15248n.position();
        int round = Math.round(a8 * (position / a7));
        boolean z6 = round > 0;
        int T = jq0.T();
        int V = jq0.V();
        String str = this.f15243i;
        l(str, A(str), position, a7, round, a8, z6, T, V);
    }

    @Override // com.google.android.gms.internal.ads.ts0
    public final void g() {
        this.f15245k = true;
    }

    @Override // com.google.android.gms.internal.ads.im
    public final /* bridge */ /* synthetic */ void k(tl tlVar, vl vlVar) {
        this.f15246l.b((yl) tlVar);
    }

    @Override // com.google.android.gms.internal.ads.im
    public final /* bridge */ /* synthetic */ void p(tl tlVar, int i7) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a6, code lost:
    
        r26.f15253s = true;
        j(r27, r11, (int) r26.f15247m.a(r26.f15248n));
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:? -> B:51:0x0144). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.ts0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(String str) {
        String str2;
        this.f15243i = str;
        String A = A(str);
        String str3 = "error";
        int i7 = 0;
        try {
            String str4 = this.f12368g;
            sq0 sq0Var = this.f15244j;
            tl ylVar = new yl(str4, null, this, sq0Var.f11921d, sq0Var.f11923f, true, null);
            if (this.f15244j.f11927j) {
                ylVar = new pr0(this.f12367f, ylVar, this.f15251q, this.f15252r, null, null, null);
            }
            ylVar.e(new vl(Uri.parse(str), null, 0L, 0L, -1L, null, 0));
            tq0 tq0Var = this.f12369h.get();
            if (tq0Var != null) {
                tq0Var.B(A, this);
            }
            v3.d a7 = y2.t.a();
            long b7 = a7.b();
            long longValue = ((Long) sw.c().b(m10.f8304t)).longValue();
            long longValue2 = ((Long) sw.c().b(m10.f8296s)).longValue();
            this.f15248n = ByteBuffer.allocate(this.f15244j.f11920c);
            int i8 = 8192;
            byte[] bArr = new byte[8192];
            long j7 = b7;
            while (true) {
                int d7 = ylVar.d(bArr, i7, Math.min(this.f15248n.remaining(), i8));
                if (d7 == -1) {
                    break;
                }
                synchronized (this.f15250p) {
                    try {
                        if (this.f15245k) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            str3 = null;
                            try {
                                this.f15248n.put(bArr, 0, d7);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.f15248n.remaining() <= 0) {
                                B();
                                break;
                            }
                            try {
                                if (this.f15245k) {
                                    int limit = this.f15248n.limit();
                                    StringBuilder sb = new StringBuilder(35);
                                    sb.append("Precache abort at ");
                                    sb.append(limit);
                                    sb.append(" bytes");
                                    throw new IOException(sb.toString());
                                }
                                long b8 = a7.b();
                                if (b8 - j7 >= longValue) {
                                    B();
                                    j7 = b8;
                                }
                                if (b8 - b7 > 1000 * longValue2) {
                                    StringBuilder sb2 = new StringBuilder(49);
                                    sb2.append("Timeout exceeded. Limit: ");
                                    sb2.append(longValue2);
                                    sb2.append(" sec");
                                    throw new IOException(sb2.toString());
                                }
                                str3 = str2;
                                i8 = 8192;
                                i7 = 0;
                            } catch (Exception e7) {
                                e = e7;
                                String canonicalName = e.getClass().getCanonicalName();
                                String message = e.getMessage();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length());
                                sb3.append(canonicalName);
                                sb3.append(":");
                                sb3.append(message);
                                String sb4 = sb3.toString();
                                StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 34 + sb4.length());
                                sb5.append("Failed to preload url ");
                                sb5.append(str);
                                sb5.append(" Exception: ");
                                sb5.append(sb4);
                                io0.g(sb5.toString());
                                h(str, A, str3, sb4);
                                return false;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            str3 = str2;
                            String canonicalName2 = e.getClass().getCanonicalName();
                            String message2 = e.getMessage();
                            StringBuilder sb32 = new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length());
                            sb32.append(canonicalName2);
                            sb32.append(":");
                            sb32.append(message2);
                            String sb42 = sb32.toString();
                            StringBuilder sb52 = new StringBuilder(String.valueOf(str).length() + 34 + sb42.length());
                            sb52.append("Failed to preload url ");
                            sb52.append(str);
                            sb52.append(" Exception: ");
                            sb52.append(sb42);
                            io0.g(sb52.toString());
                            h(str, A, str3, sb42);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (Exception e9) {
            e = e9;
            str2 = str3;
        }
    }

    public final String w() {
        return this.f15243i;
    }

    public final ByteBuffer y() {
        synchronized (this.f15250p) {
            ByteBuffer byteBuffer = this.f15248n;
            if (byteBuffer != null && !this.f15249o) {
                byteBuffer.flip();
                this.f15249o = true;
            }
            this.f15245k = true;
        }
        return this.f15248n;
    }

    public final boolean z() {
        return this.f15253s;
    }
}
