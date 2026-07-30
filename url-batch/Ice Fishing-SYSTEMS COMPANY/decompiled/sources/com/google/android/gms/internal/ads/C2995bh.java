package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.bh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2995bh extends AbstractC3624nF {

    /* renamed from: A, reason: collision with root package name */
    public final String f29534A;

    /* renamed from: B, reason: collision with root package name */
    public final int f29535B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f29536C;

    /* renamed from: D, reason: collision with root package name */
    public InputStream f29537D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f29538E;

    /* renamed from: F, reason: collision with root package name */
    public Uri f29539F;

    /* renamed from: G, reason: collision with root package name */
    public volatile U8 f29540G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f29541H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f29542I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f29543K;

    /* renamed from: L, reason: collision with root package name */
    public long f29544L;

    /* renamed from: M, reason: collision with root package name */
    public J3.a f29545M;

    /* renamed from: N, reason: collision with root package name */
    public final AtomicLong f29546N;

    /* renamed from: x, reason: collision with root package name */
    public final Context f29547x;

    /* renamed from: y, reason: collision with root package name */
    public final InterfaceC3572mH f29548y;

    /* renamed from: z, reason: collision with root package name */
    public final Vx f29549z;

    public C2995bh(Context context, InterfaceC3572mH interfaceC3572mH, String str, int i, DN dn, Vx vx) {
        super(false);
        this.f29547x = context;
        this.f29548y = interfaceC3572mH;
        this.f29549z = vx;
        this.f29534A = str;
        this.f29535B = i;
        this.f29541H = false;
        this.f29542I = false;
        this.J = false;
        this.f29543K = false;
        this.f29544L = 0L;
        this.f29546N = new AtomicLong(-1L);
        this.f29545M = null;
        this.f29536C = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31828x2)).booleanValue();
        a(dn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0244  */
    /* JADX WARN: Type inference failed for: r5v19, types: [p2.j] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long F(C3197fJ c3197fJ) {
        R8 r82;
        boolean z8;
        long j9;
        boolean z9;
        boolean z10;
        long elapsedRealtime;
        Y8 y8;
        C3197fJ c3197fJ2 = c3197fJ;
        String str = "ms";
        if (this.f29538E) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z11 = true;
        this.f29538E = true;
        Uri uri = c3197fJ2.f30686a;
        this.f29539F = uri;
        boolean z12 = this.f29536C;
        if (!z12) {
            c(c3197fJ);
        }
        this.f29540G = U8.a(uri);
        C3151ea c3151ea = AbstractC3368ia.f31702j5;
        q2.r rVar = q2.r.f40116e;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            if (this.f29540G != null) {
                this.f29540G.f27931A = c3197fJ2.f30688c;
                U8 u82 = this.f29540G;
                String str2 = this.f29534A;
                u82.f27932B = str2 != null ? str2 : "";
                this.f29540G.f27933C = this.f29535B;
                r82 = p2.j.f39798C.f39809j.j(this.f29540G);
            } else {
                r82 = null;
            }
            if (r82 != null && r82.a()) {
                synchronized (r82) {
                    z8 = r82.f27314u;
                }
                this.f29541H = z8;
                this.J = r82.d();
                this.f29543K = r82.c();
                synchronized (r82) {
                    j9 = r82.f27316w;
                }
                this.f29544L = j9;
                this.f29542I = true;
                if (!f()) {
                    this.f29537D = r82.b();
                    if (this.f29536C) {
                        c(c3197fJ);
                    }
                    return -1L;
                }
            }
        } else if (this.f29540G != null) {
            this.f29540G.f27931A = c3197fJ2.f30688c;
            U8 u83 = this.f29540G;
            String str3 = this.f29534A;
            u83.f27932B = str3 != null ? str3 : "";
            this.f29540G.f27933C = this.f29535B;
            long longValue = (this.f29540G.f27940z ? (Long) rVar.f40119c.a(AbstractC3368ia.f31721l5) : (Long) rVar.f40119c.a(AbstractC3368ia.f31712k5)).longValue();
            ?? r52 = p2.j.f39798C;
            r52.f39810k.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            W8 o9 = T2.o(this.f29547x, this.f29540G);
            try {
                try {
                    y8 = (Y8) o9.f31242n.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z11 = r52;
                }
                try {
                    this.f29541H = y8.f28806b;
                    this.J = y8.f28807c;
                    this.f29543K = y8.f28809e;
                    this.f29544L = y8.f28808d;
                } catch (InterruptedException unused) {
                    z10 = true;
                    o9.cancel(true);
                    Thread.currentThread().interrupt();
                    p2.j.f39798C.f39810k.getClass();
                    elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    InterfaceC4019ug interfaceC4019ug = ((C3267gh) this.f29549z.f28329u).f31038C;
                    if (interfaceC4019ug != null) {
                        interfaceC4019ug.t(elapsedRealtime, z10);
                    }
                    this.f29542I = z10;
                    r52 = new StringBuilder(String.valueOf(elapsedRealtime).length() + 24);
                    r52.append("Cache connection took ");
                    r52.append(elapsedRealtime);
                    r52.append("ms");
                    str = r52.toString();
                    t2.C.k(str);
                    this.f29542I = false;
                    if (this.f29540G != null) {
                    }
                    return this.f29548y.F(c3197fJ2);
                } catch (ExecutionException | TimeoutException unused2) {
                    z9 = true;
                    o9.cancel(true);
                    p2.j.f39798C.f39810k.getClass();
                    elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    InterfaceC4019ug interfaceC4019ug2 = ((C3267gh) this.f29549z.f28329u).f31038C;
                    if (interfaceC4019ug2 != null) {
                        interfaceC4019ug2.t(elapsedRealtime, z9);
                    }
                    this.f29542I = z9;
                    r52 = new StringBuilder(String.valueOf(elapsedRealtime).length() + 24);
                    r52.append("Cache connection took ");
                    r52.append(elapsedRealtime);
                    r52.append("ms");
                    str = r52.toString();
                    t2.C.k(str);
                    this.f29542I = false;
                    if (this.f29540G != null) {
                    }
                    return this.f29548y.F(c3197fJ2);
                } catch (Throwable th2) {
                    th = th2;
                    p2.j.f39798C.f39810k.getClass();
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    InterfaceC4019ug interfaceC4019ug3 = ((C3267gh) this.f29549z.f28329u).f31038C;
                    if (interfaceC4019ug3 != null) {
                        interfaceC4019ug3.t(elapsedRealtime3, z11);
                    }
                    this.f29542I = z11;
                    StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 24);
                    sb.append("Cache connection took ");
                    sb.append(elapsedRealtime3);
                    sb.append(str);
                    t2.C.k(sb.toString());
                    throw th;
                }
            } catch (InterruptedException unused3) {
                z10 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z9 = false;
            } catch (Throwable th3) {
                th = th3;
                z11 = false;
            }
            if (!f()) {
                this.f29537D = y8.f28805a;
                if (z12) {
                    c(c3197fJ);
                }
                r52.f39810k.getClass();
                long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                InterfaceC4019ug interfaceC4019ug4 = ((C3267gh) this.f29549z.f28329u).f31038C;
                if (interfaceC4019ug4 != null) {
                    interfaceC4019ug4.t(elapsedRealtime4, true);
                }
                this.f29542I = true;
                StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                sb2.append("Cache connection took ");
                sb2.append(elapsedRealtime4);
                sb2.append("ms");
                t2.C.k(sb2.toString());
                return -1L;
            }
            r52.f39810k.getClass();
            long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime2;
            InterfaceC4019ug interfaceC4019ug5 = ((C3267gh) this.f29549z.f28329u).f31038C;
            if (interfaceC4019ug5 != null) {
                interfaceC4019ug5.t(elapsedRealtime5, true);
            }
            this.f29542I = true;
            StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime5).length() + 24);
            sb3.append("Cache connection took ");
            sb3.append(elapsedRealtime5);
            sb3.append("ms");
            str = sb3.toString();
            t2.C.k(str);
        }
        this.f29542I = false;
        if (this.f29540G != null) {
            Map map = c3197fJ2.f30687b;
            long j10 = c3197fJ2.f30688c;
            long j11 = c3197fJ2.f30689d;
            int i = c3197fJ2.f30690e;
            Uri parse = Uri.parse(this.f29540G.f27934n);
            PA.X(parse, "The uri must be set.");
            c3197fJ2 = new C3197fJ(parse, map, j10, j11, i);
        }
        return this.f29548y.F(c3197fJ2);
    }

    public final boolean f() {
        if (!this.f29536C) {
            return false;
        }
        C3151ea c3151ea = AbstractC3368ia.f31730m5;
        q2.r rVar = q2.r.f40116e;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() || this.J) {
            return ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31738n5)).booleanValue() && !this.f29543K;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final Uri i() {
        return this.f29539F;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final void o() {
        if (!this.f29538E) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f29538E = false;
        this.f29539F = null;
        boolean z8 = (this.f29536C && this.f29537D == null) ? false : true;
        InputStream inputStream = this.f29537D;
        if (inputStream != null) {
            S2.b.c(inputStream);
            this.f29537D = null;
        } else {
            this.f29548y.o();
        }
        if (z8) {
            e();
        }
    }

    @Override // com.google.android.gms.internal.ads.JN
    public final int z(byte[] bArr, int i, int i4) {
        if (!this.f29538E) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f29537D;
        int read = inputStream != null ? inputStream.read(bArr, i, i4) : this.f29548y.z(bArr, i, i4);
        if (this.f29536C && this.f29537D == null) {
            return read;
        }
        d(read);
        return read;
    }
}
