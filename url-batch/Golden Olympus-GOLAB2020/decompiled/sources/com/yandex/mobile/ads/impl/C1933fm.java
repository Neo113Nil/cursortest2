package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.C1909em;
import com.yandex.mobile.ads.impl.InterfaceC1837bm;
import com.yandex.mobile.ads.impl.dz;
import com.yandex.mobile.ads.impl.iv;
import com.yandex.mobile.ads.impl.wa0;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.fm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1933fm implements iv {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1837bm f25839a;

    /* renamed from: b, reason: collision with root package name */
    private final iv f25840b;

    /* renamed from: c, reason: collision with root package name */
    private final c42 f25841c;

    /* renamed from: d, reason: collision with root package name */
    private final iv f25842d;

    /* renamed from: e, reason: collision with root package name */
    private final nm f25843e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f25844f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f25845g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f25846h;

    /* renamed from: i, reason: collision with root package name */
    private Uri f25847i;

    /* renamed from: j, reason: collision with root package name */
    private mv f25848j;

    /* renamed from: k, reason: collision with root package name */
    private mv f25849k;

    /* renamed from: l, reason: collision with root package name */
    private iv f25850l;

    /* renamed from: m, reason: collision with root package name */
    private long f25851m;

    /* renamed from: n, reason: collision with root package name */
    private long f25852n;

    /* renamed from: o, reason: collision with root package name */
    private long f25853o;

    /* renamed from: p, reason: collision with root package name */
    private om f25854p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f25855q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f25856r;

    /* renamed from: s, reason: collision with root package name */
    private long f25857s;

    /* JADX WARN: Multi-variable type inference failed */
    private void e() {
        iv ivVar = this.f25850l;
        if (ivVar == null) {
            return;
        }
        try {
            ivVar.close();
        } finally {
            this.f25849k = null;
            this.f25850l = null;
            om omVar = this.f25854p;
            if (omVar != null) {
                this.f25839a.b(omVar);
                this.f25854p = null;
            }
        }
    }

    private boolean h() {
        return this.f25850l == this.f25840b;
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void a(s62 s62Var) {
        s62Var.getClass();
        this.f25840b.a(s62Var);
        this.f25842d.a(s62Var);
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void close() {
        this.f25848j = null;
        this.f25847i = null;
        this.f25852n = 0L;
        try {
            e();
        } catch (Throwable th) {
            if (h() || (th instanceof InterfaceC1837bm.a)) {
                this.f25855q = true;
            }
            throw th;
        }
    }

    public final InterfaceC1837bm f() {
        return this.f25839a;
    }

    public final nm g() {
        return this.f25843e;
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Map<String, List<String>> getResponseHeaders() {
        return !h() ? this.f25842d.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Uri getUri() {
        return this.f25847i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r18.f25851m < r14) goto L26;
     */
    @Override // com.yandex.mobile.ads.impl.fv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(byte[] bArr, int i4, int i5) {
        long j4;
        if (i5 == 0) {
            return 0;
        }
        if (this.f25853o == 0) {
            return -1;
        }
        mv mvVar = this.f25848j;
        mvVar.getClass();
        mv mvVar2 = this.f25849k;
        mvVar2.getClass();
        try {
            if (this.f25852n >= this.f25857s) {
                a(mvVar, true);
            }
            iv ivVar = this.f25850l;
            ivVar.getClass();
            int read = ivVar.read(bArr, i4, i5);
            if (read == -1) {
                if (h()) {
                    j4 = -1;
                } else {
                    long j5 = mvVar2.f29245g;
                    if (j5 != -1) {
                        j4 = -1;
                    }
                    String str = mvVar.f29246h;
                    int i6 = u82.f32873a;
                    this.f25853o = 0L;
                    if (this.f25850l == this.f25841c) {
                        rr rrVar = new rr();
                        rr.a(rrVar, this.f25852n);
                        this.f25839a.a(str, rrVar);
                        return read;
                    }
                }
                long j6 = this.f25853o;
                if (j6 <= 0) {
                    if (j6 == j4) {
                    }
                }
                e();
                a(mvVar, false);
                return read(bArr, i4, i5);
            }
            long j7 = read;
            this.f25852n += j7;
            this.f25851m += j7;
            long j8 = this.f25853o;
            if (j8 != -1) {
                this.f25853o = j8 - j7;
                return read;
            }
            return read;
        } catch (Throwable th) {
            if (h() || (th instanceof InterfaceC1837bm.a)) {
                this.f25855q = true;
            }
            throw th;
        }
    }

    private C1933fm(InterfaceC1837bm interfaceC1837bm, iv ivVar, wa0 wa0Var, C1909em c1909em, nm nmVar, int i4, int i5) {
        this.f25839a = interfaceC1837bm;
        this.f25840b = wa0Var;
        this.f25843e = nmVar == null ? nm.f29682a : nmVar;
        this.f25844f = (i4 & 1) != 0;
        this.f25845g = false;
        this.f25846h = false;
        if (ivVar != null) {
            this.f25842d = ivVar;
            this.f25841c = c1909em != null ? new c42(ivVar, c1909em) : null;
        } else {
            this.f25842d = eh1.f25301a;
            this.f25841c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:3:0x0001, B:8:0x002c, B:10:0x0039, B:14:0x004d, B:16:0x0053, B:17:0x0078, B:19:0x007e, B:22:0x0089, B:23:0x0085, B:24:0x008b, B:28:0x0098, B:32:0x009f, B:34:0x0095, B:35:0x0056, B:37:0x0066, B:40:0x0070, B:41:0x0077, B:42:0x0040, B:44:0x0044, B:47:0x0025), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:3:0x0001, B:8:0x002c, B:10:0x0039, B:14:0x004d, B:16:0x0053, B:17:0x0078, B:19:0x007e, B:22:0x0089, B:23:0x0085, B:24:0x008b, B:28:0x0098, B:32:0x009f, B:34:0x0095, B:35:0x0056, B:37:0x0066, B:40:0x0070, B:41:0x0077, B:42:0x0040, B:44:0x0044, B:47:0x0025), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:3:0x0001, B:8:0x002c, B:10:0x0039, B:14:0x004d, B:16:0x0053, B:17:0x0078, B:19:0x007e, B:22:0x0089, B:23:0x0085, B:24:0x008b, B:28:0x0098, B:32:0x009f, B:34:0x0095, B:35:0x0056, B:37:0x0066, B:40:0x0070, B:41:0x0077, B:42:0x0040, B:44:0x0044, B:47:0x0025), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:3:0x0001, B:8:0x002c, B:10:0x0039, B:14:0x004d, B:16:0x0053, B:17:0x0078, B:19:0x007e, B:22:0x0089, B:23:0x0085, B:24:0x008b, B:28:0x0098, B:32:0x009f, B:34:0x0095, B:35:0x0056, B:37:0x0066, B:40:0x0070, B:41:0x0077, B:42:0x0040, B:44:0x0044, B:47:0x0025), top: B:2:0x0001 }] */
    @Override // com.yandex.mobile.ads.impl.iv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(mv mvVar) {
        boolean z4;
        long j4;
        long j5;
        try {
            String a4 = this.f25843e.a(mvVar);
            mv a5 = mvVar.a().a(a4).a();
            this.f25848j = a5;
            InterfaceC1837bm interfaceC1837bm = this.f25839a;
            Uri uri = a5.f29239a;
            String c4 = interfaceC1837bm.b(a4).c();
            Uri parse = c4 == null ? null : Uri.parse(c4);
            if (parse != null) {
                uri = parse;
            }
            this.f25847i = uri;
            this.f25852n = mvVar.f29244f;
            if ((!this.f25845g || !this.f25855q) && (!this.f25846h || mvVar.f29245g != -1)) {
                z4 = false;
                this.f25856r = z4;
                if (!z4) {
                    this.f25853o = -1L;
                } else {
                    long b4 = this.f25839a.b(a4).b();
                    this.f25853o = b4;
                    if (b4 != -1) {
                        long j6 = b4 - mvVar.f29244f;
                        this.f25853o = j6;
                        if (j6 < 0) {
                            throw new jv(2008);
                        }
                    }
                }
                j4 = mvVar.f29245g;
                if (j4 != -1) {
                    long j7 = this.f25853o;
                    if (j7 != -1) {
                        j4 = Math.min(j7, j4);
                    }
                    this.f25853o = j4;
                }
                j5 = this.f25853o;
                if (j5 <= 0 || j5 == -1) {
                    a(a5, false);
                }
                long j8 = mvVar.f29245g;
                return j8 == -1 ? j8 : this.f25853o;
            }
            z4 = true;
            this.f25856r = z4;
            if (!z4) {
            }
            j4 = mvVar.f29245g;
            if (j4 != -1) {
            }
            j5 = this.f25853o;
            if (j5 <= 0) {
            }
            a(a5, false);
            long j82 = mvVar.f29245g;
            if (j82 == -1) {
            }
        } catch (Throwable th) {
            if (h() || (th instanceof InterfaceC1837bm.a)) {
                this.f25855q = true;
            }
            throw th;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.fm$a */
    public static final class a implements iv.a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC1837bm f25858a;

        /* renamed from: b, reason: collision with root package name */
        private wa0.b f25859b = new wa0.b();

        /* renamed from: c, reason: collision with root package name */
        private nm f25860c = nm.f29682a;

        /* renamed from: d, reason: collision with root package name */
        private iv.a f25861d;

        @Override // com.yandex.mobile.ads.impl.iv.a
        public final iv a() {
            iv.a aVar = this.f25861d;
            iv a4 = aVar != null ? aVar.a() : null;
            InterfaceC1837bm interfaceC1837bm = this.f25858a;
            interfaceC1837bm.getClass();
            C1909em a5 = a4 != null ? new C1909em.b().a(interfaceC1837bm).a() : null;
            this.f25859b.getClass();
            return new C1933fm(interfaceC1837bm, a4, new wa0(), a5, this.f25860c, 0, 0);
        }

        public final C1933fm b() {
            iv.a aVar = this.f25861d;
            iv a4 = aVar != null ? aVar.a() : null;
            InterfaceC1837bm interfaceC1837bm = this.f25858a;
            interfaceC1837bm.getClass();
            C1909em a5 = a4 != null ? new C1909em.b().a(interfaceC1837bm).a() : null;
            this.f25859b.getClass();
            return new C1933fm(interfaceC1837bm, a4, new wa0(), a5, this.f25860c, 1, -1000);
        }

        public final a a(InterfaceC1837bm interfaceC1837bm) {
            this.f25858a = interfaceC1837bm;
            return this;
        }

        public final a a(dz.a aVar) {
            this.f25861d = aVar;
            return this;
        }
    }

    private void a(mv mvVar, boolean z4) {
        om e4;
        long j4;
        mv a4;
        iv ivVar;
        String str = mvVar.f29246h;
        int i4 = u82.f32873a;
        if (this.f25856r) {
            e4 = null;
        } else if (this.f25844f) {
            try {
                e4 = this.f25839a.e(str, this.f25852n, this.f25853o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            e4 = this.f25839a.c(str, this.f25852n, this.f25853o);
        }
        if (e4 == null) {
            ivVar = this.f25842d;
            a4 = mvVar.a().b(this.f25852n).a(this.f25853o).a();
            j4 = -1;
        } else if (e4.f30092e) {
            Uri fromFile = Uri.fromFile(e4.f30093f);
            long j5 = e4.f30090c;
            long j6 = this.f25852n - j5;
            long j7 = e4.f30091d - j6;
            j4 = -1;
            long j8 = this.f25853o;
            if (j8 != -1) {
                j7 = Math.min(j7, j8);
            }
            a4 = mvVar.a().a(fromFile).c(j5).b(j6).a(j7).a();
            ivVar = this.f25840b;
        } else {
            j4 = -1;
            long j9 = e4.f30091d;
            if (j9 == -1) {
                j9 = this.f25853o;
            } else {
                long j10 = this.f25853o;
                if (j10 != -1) {
                    j9 = Math.min(j9, j10);
                }
            }
            a4 = mvVar.a().b(this.f25852n).a(j9).a();
            ivVar = this.f25841c;
            if (ivVar == null) {
                ivVar = this.f25842d;
                this.f25839a.b(e4);
                e4 = null;
            }
        }
        this.f25857s = (this.f25856r || ivVar != this.f25842d) ? Long.MAX_VALUE : this.f25852n + 102400;
        if (z4) {
            iv ivVar2 = this.f25850l;
            iv ivVar3 = this.f25842d;
            if (ivVar2 != ivVar3) {
                throw new IllegalStateException();
            }
            if (ivVar == ivVar3) {
                return;
            }
            try {
                e();
            } catch (Throwable th) {
                if (!e4.f30092e) {
                    this.f25839a.b(e4);
                }
                throw th;
            }
        }
        if (e4 != null && !e4.f30092e) {
            this.f25854p = e4;
        }
        this.f25850l = ivVar;
        this.f25849k = a4;
        this.f25851m = 0L;
        long a5 = ivVar.a(a4);
        rr rrVar = new rr();
        if (a4.f29245g == j4 && a5 != j4) {
            this.f25853o = a5;
            rr.a(rrVar, this.f25852n + a5);
        }
        if (!h()) {
            Uri uri = ivVar.getUri();
            this.f25847i = uri;
            rr.a(rrVar, mvVar.f29239a.equals(uri) ? null : this.f25847i);
        }
        if (this.f25850l == this.f25841c) {
            this.f25839a.a(str, rrVar);
        }
    }
}
