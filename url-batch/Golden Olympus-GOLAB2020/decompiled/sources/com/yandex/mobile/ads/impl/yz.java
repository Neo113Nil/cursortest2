package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;
import java.io.EOFException;
import java.io.IOException;
import ru.rustore.sdk.user.profile.UserProfileProvider;

/* loaded from: classes3.dex */
final class yz implements rd1 {

    /* renamed from: a, reason: collision with root package name */
    private final qd1 f35393a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35394b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35395c;

    /* renamed from: d, reason: collision with root package name */
    private final n22 f35396d;

    /* renamed from: e, reason: collision with root package name */
    private int f35397e;

    /* renamed from: f, reason: collision with root package name */
    private long f35398f;

    /* renamed from: g, reason: collision with root package name */
    private long f35399g;

    /* renamed from: h, reason: collision with root package name */
    private long f35400h;

    /* renamed from: i, reason: collision with root package name */
    private long f35401i;

    /* renamed from: j, reason: collision with root package name */
    private long f35402j;

    /* renamed from: k, reason: collision with root package name */
    private long f35403k;

    /* renamed from: l, reason: collision with root package name */
    private long f35404l;

    private final class a implements tw1 {
        @Override // com.yandex.mobile.ads.impl.tw1
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final long c() {
            yz yzVar = yz.this;
            return yzVar.f35396d.a(yzVar.f35398f);
        }

        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final tw1.a b(long j4) {
            long b4 = yz.this.f35396d.b(j4);
            yz yzVar = yz.this;
            long j5 = yzVar.f35394b;
            long j6 = yzVar.f35395c;
            int i4 = u82.f32873a;
            vw1 vw1Var = new vw1(j4, Math.max(j5, Math.min(((((j6 - j5) * b4) / yzVar.f35398f) + j5) - UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, j6 - 1)));
            return new tw1.a(vw1Var, vw1Var);
        }
    }

    public yz(n22 n22Var, long j4, long j5, long j6, long j7, boolean z4) {
        C2253tf.a(j4 >= 0 && j5 > j4);
        this.f35396d = n22Var;
        this.f35394b = j4;
        this.f35395c = j5;
        if (j6 == j5 - j4 || z4) {
            this.f35398f = j7;
            this.f35397e = 4;
        } else {
            this.f35397e = 0;
        }
        this.f35393a = new qd1();
    }

    @Override // com.yandex.mobile.ads.impl.rd1
    public final tw1 a() {
        if (this.f35398f != 0) {
            return new a();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    @Override // com.yandex.mobile.ads.impl.rd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(lz lzVar) {
        long j4;
        long j5;
        long j6;
        int i4 = this.f35397e;
        if (i4 == 0) {
            j4 = 0;
            long a4 = lzVar.a();
            this.f35399g = a4;
            this.f35397e = 1;
            long j7 = this.f35395c - 65307;
            if (j7 > a4) {
                return j7;
            }
        } else if (i4 != 1) {
            if (i4 == 2) {
                j5 = 2;
                if (this.f35401i != this.f35402j) {
                    long a5 = lzVar.a();
                    if (!this.f35393a.a(lzVar, this.f35402j)) {
                        j6 = this.f35401i;
                        if (j6 == a5) {
                            throw new IOException("No ogg page can be found.");
                        }
                    } else {
                        this.f35393a.a(lzVar, false);
                        lzVar.c();
                        long j8 = this.f35400h;
                        qd1 qd1Var = this.f35393a;
                        long j9 = qd1Var.f30741b;
                        long j10 = j8 - j9;
                        int i5 = qd1Var.f30743d + qd1Var.f30744e;
                        if (0 > j10 || j10 >= 72000) {
                            if (j10 < 0) {
                                this.f35402j = a5;
                                this.f35404l = j9;
                            } else {
                                this.f35401i = lzVar.a() + i5;
                                this.f35403k = this.f35393a.f30741b;
                            }
                            long j11 = this.f35402j;
                            long j12 = this.f35401i;
                            if (j11 - j12 < 100000) {
                                this.f35402j = j12;
                                j6 = j12;
                            } else {
                                long a6 = lzVar.a() - (i5 * (j10 <= 0 ? 2L : 1L));
                                long j13 = this.f35402j;
                                long j14 = this.f35401i;
                                int i6 = u82.f32873a;
                                j6 = Math.max(j14, Math.min((((j13 - j14) * j10) / (this.f35404l - this.f35403k)) + a6, j13 - 1));
                            }
                        }
                    }
                    if (j6 == -1) {
                        return j6;
                    }
                    this.f35397e = 3;
                }
                j6 = -1;
                if (j6 == -1) {
                }
            } else {
                if (i4 != 3) {
                    if (i4 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j5 = 2;
            }
            while (true) {
                this.f35393a.a(lzVar, -1L);
                this.f35393a.a(lzVar, false);
                qd1 qd1Var2 = this.f35393a;
                if (qd1Var2.f30741b > this.f35400h) {
                    lzVar.c();
                    this.f35397e = 4;
                    return -(this.f35403k + j5);
                }
                lzVar.a(qd1Var2.f30743d + qd1Var2.f30744e);
                this.f35401i = lzVar.a();
                this.f35403k = this.f35393a.f30741b;
            }
        } else {
            j4 = 0;
        }
        qd1 qd1Var3 = this.f35393a;
        qd1Var3.f30740a = 0;
        qd1Var3.f30741b = j4;
        qd1Var3.f30742c = 0;
        qd1Var3.f30743d = 0;
        qd1Var3.f30744e = 0;
        if (qd1Var3.a(lzVar, -1L)) {
            this.f35393a.a(lzVar, false);
            qd1 qd1Var4 = this.f35393a;
            lzVar.a(qd1Var4.f30743d + qd1Var4.f30744e);
            long j15 = this.f35393a.f30741b;
            while (true) {
                qd1 qd1Var5 = this.f35393a;
                if ((qd1Var5.f30740a & 4) == 4 || !qd1Var5.a(lzVar, -1L) || lzVar.a() >= this.f35395c || !this.f35393a.a(lzVar, true)) {
                    break;
                }
                qd1 qd1Var6 = this.f35393a;
                try {
                    lzVar.a(qd1Var6.f30743d + qd1Var6.f30744e);
                    j15 = this.f35393a.f30741b;
                } catch (EOFException unused) {
                }
            }
            this.f35398f = j15;
            this.f35397e = 4;
            return this.f35399g;
        }
        throw new EOFException();
    }

    @Override // com.yandex.mobile.ads.impl.rd1
    public final void a(long j4) {
        long j5 = this.f35398f - 1;
        int i4 = u82.f32873a;
        this.f35400h = Math.max(0L, Math.min(j4, j5));
        this.f35397e = 2;
        this.f35401i = this.f35394b;
        this.f35402j = this.f35395c;
        this.f35403k = 0L;
        this.f35404l = this.f35398f;
    }
}
