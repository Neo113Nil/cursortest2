package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.mh0;
import com.yandex.mobile.ads.impl.pp1;
import com.yandex.mobile.ads.impl.wm;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xd1 extends AbstractC2211rj {

    /* renamed from: e, reason: collision with root package name */
    private final wm.a f34519e;

    /* renamed from: f, reason: collision with root package name */
    private final ah0 f34520f;

    /* renamed from: g, reason: collision with root package name */
    private final String f34521g;

    /* renamed from: h, reason: collision with root package name */
    private final C1885dm f34522h;

    /* renamed from: i, reason: collision with root package name */
    private final ah0 f34523i;

    /* renamed from: j, reason: collision with root package name */
    private oj1<String> f34524j;

    /* renamed from: k, reason: collision with root package name */
    private oq1 f34525k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f34526l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f34527m;

    /* renamed from: n, reason: collision with root package name */
    private long f34528n;

    /* renamed from: o, reason: collision with root package name */
    private long f34529o;

    static {
        k60.a("goog.exo.okhttp");
    }

    public xd1(td1 td1Var, String str, ah0 ah0Var) {
        super(true);
        this.f34519e = (wm.a) C2253tf.a(td1Var);
        this.f34521g = str;
        this.f34522h = null;
        this.f34523i = ah0Var;
        this.f34524j = null;
        this.f34520f = new ah0();
    }

    private int c(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        long j4 = this.f34528n;
        if (j4 != -1) {
            long j5 = j4 - this.f34529o;
            if (j5 == 0) {
                return -1;
            }
            i5 = (int) Math.min(i5, j5);
        }
        InputStream inputStream = this.f34526l;
        int i6 = u82.f32873a;
        int read = inputStream.read(bArr, i4, i5);
        if (read == -1) {
            return -1;
        }
        this.f34529o += read;
        c(read);
        return read;
    }

    private void f() {
        oq1 oq1Var = this.f34525k;
        if (oq1Var != null) {
            sq1 a4 = oq1Var.a();
            a4.getClass();
            v82.a((Closeable) a4.c());
            this.f34525k = null;
        }
        this.f34526l = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.iv
    public final long a(mv mvVar) {
        mh0 mh0Var;
        String sb;
        long j4 = 0;
        this.f34529o = 0L;
        this.f34528n = 0L;
        b(mvVar);
        long j5 = mvVar.f29244f;
        long j6 = mvVar.f29245g;
        String uri = mvVar.f29239a.toString();
        Intrinsics.checkNotNullParameter(uri, "<this>");
        try {
            Intrinsics.checkNotNullParameter(uri, "<this>");
            mh0Var = new mh0.a().a(null, uri).a();
        } catch (IllegalArgumentException unused) {
            mh0Var = null;
        }
        if (mh0Var == null) {
            throw new xg0("Malformed URL", 1004);
        }
        pp1.a a4 = new pp1.a().a(mh0Var);
        C1885dm c1885dm = this.f34522h;
        if (c1885dm != null) {
            a4.a(c1885dm);
        }
        HashMap hashMap = new HashMap();
        ah0 ah0Var = this.f34523i;
        if (ah0Var != null) {
            hashMap.putAll(ah0Var.a());
        }
        hashMap.putAll(this.f34520f.a());
        hashMap.putAll(mvVar.f29243e);
        for (Map.Entry entry : hashMap.entrySet()) {
            a4.b((String) entry.getKey(), (String) entry.getValue());
        }
        int i4 = nh0.f29643c;
        if (j5 == 0 && j6 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j5);
            sb2.append("-");
            if (j6 != -1) {
                sb2.append((j5 + j6) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            a4.a("Range", sb);
        }
        String str = this.f34521g;
        if (str != null) {
            a4.a("User-Agent", str);
        }
        if ((mvVar.f29247i & 1) != 1) {
            a4.a("Accept-Encoding", "identity");
        }
        byte[] bArr = mvVar.f29242d;
        a4.a(mv.a(mvVar.f29241c), bArr != null ? sp1.a(bArr) : mvVar.f29241c == 2 ? sp1.a(u82.f32878f) : null);
        tn1 a5 = this.f34519e.a(a4.a());
        try {
            mx1 b4 = mx1.b();
            a5.a(new wd1(b4));
            try {
                oq1 oq1Var = (oq1) b4.get();
                this.f34525k = oq1Var;
                sq1 a6 = oq1Var.a();
                a6.getClass();
                this.f34526l = a6.c().S();
                int d4 = oq1Var.d();
                if (!oq1Var.h()) {
                    if (d4 == 416) {
                        if (mvVar.f29244f == nh0.a(oq1Var.g().a("Content-Range"))) {
                            this.f34527m = true;
                            c(mvVar);
                            long j7 = mvVar.f29245g;
                            if (j7 != -1) {
                                return j7;
                            }
                            return 0L;
                        }
                    }
                    try {
                        InputStream inputStream = this.f34526l;
                        inputStream.getClass();
                        int i5 = u82.f32873a;
                        byte[] bArr2 = new byte[Base64Utils.IO_BUFFER_SIZE];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int read = inputStream.read(bArr2);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        }
                        byteArrayOutputStream.toByteArray();
                    } catch (IOException unused2) {
                        int i6 = u82.f32873a;
                    }
                    TreeMap c4 = oq1Var.g().c();
                    f();
                    throw new zg0(d4, d4 == 416 ? new jv(2008) : null, c4);
                }
                kw0 b5 = a6.b();
                String kw0Var = b5 != null ? b5.toString() : "";
                oj1<String> oj1Var = this.f34524j;
                if (oj1Var != null && !oj1Var.apply(kw0Var)) {
                    f();
                    throw new yg0(kw0Var);
                }
                if (d4 == 200) {
                    long j8 = mvVar.f29244f;
                    if (j8 != 0) {
                        j4 = j8;
                    }
                }
                long j9 = mvVar.f29245g;
                if (j9 != -1) {
                    this.f34528n = j9;
                } else {
                    long a7 = a6.a();
                    this.f34528n = a7 != -1 ? a7 - j4 : -1L;
                }
                this.f34527m = true;
                c(mvVar);
                try {
                    a(j4);
                    return this.f34528n;
                } catch (xg0 e4) {
                    f();
                    throw e4;
                }
            } catch (InterruptedException unused3) {
                a5.a();
                throw new InterruptedIOException();
            } catch (ExecutionException e5) {
                throw new IOException(e5);
            }
        } catch (IOException e6) {
            throw xg0.a(e6, 1);
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void close() {
        if (this.f34527m) {
            this.f34527m = false;
            e();
            f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Map<String, List<String>> getResponseHeaders() {
        oq1 oq1Var = this.f34525k;
        return oq1Var == null ? Collections.EMPTY_MAP : oq1Var.g().c();
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Uri getUri() {
        oq1 oq1Var = this.f34525k;
        if (oq1Var == null) {
            return null;
        }
        return Uri.parse(oq1Var.o().g().toString());
    }

    @Override // com.yandex.mobile.ads.impl.fv
    public final int read(byte[] bArr, int i4, int i5) {
        try {
            return c(bArr, i4, i5);
        } catch (IOException e4) {
            int i6 = u82.f32873a;
            throw xg0.a(e4, 2);
        }
    }

    private void a(long j4) {
        if (j4 == 0) {
            return;
        }
        byte[] bArr = new byte[Base64Utils.IO_BUFFER_SIZE];
        while (j4 > 0) {
            try {
                int min = (int) Math.min(j4, Base64Utils.IO_BUFFER_SIZE);
                InputStream inputStream = this.f34526l;
                int i4 = u82.f32873a;
                int read = inputStream.read(bArr, 0, min);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read != -1) {
                    j4 -= read;
                    c(read);
                } else {
                    throw new xg0(2008);
                }
            } catch (IOException e4) {
                if (e4 instanceof xg0) {
                    throw ((xg0) e4);
                }
                throw new xg0(2000);
            }
        }
    }
}
