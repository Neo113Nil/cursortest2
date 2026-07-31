package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.tw1;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class sm1 implements p70 {

    /* renamed from: a, reason: collision with root package name */
    private final e52 f31847a;

    /* renamed from: e, reason: collision with root package name */
    private boolean f31851e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f31852f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31853g;

    /* renamed from: h, reason: collision with root package name */
    private long f31854h;

    /* renamed from: i, reason: collision with root package name */
    private qm1 f31855i;

    /* renamed from: j, reason: collision with root package name */
    private r70 f31856j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f31857k;

    /* renamed from: c, reason: collision with root package name */
    private final sf1 f31849c = new sf1(Base64Utils.IO_BUFFER_SIZE);

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<a> f31848b = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    private final rm1 f31850d = new rm1();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final q40 f31858a;

        /* renamed from: b, reason: collision with root package name */
        private final e52 f31859b;

        /* renamed from: c, reason: collision with root package name */
        private final rf1 f31860c = new rf1(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        private boolean f31861d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f31862e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f31863f;

        /* renamed from: g, reason: collision with root package name */
        private long f31864g;

        public a(q40 q40Var, e52 e52Var) {
            this.f31858a = q40Var;
            this.f31859b = e52Var;
        }
    }

    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.Zd
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                p70[] a4;
                a4 = sm1.a();
                return a4;
            }
        };
    }

    public sm1(e52 e52Var) {
        this.f31847a = e52Var;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f31856j = r70Var;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    @Override // com.yandex.mobile.ads.impl.p70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(q70 q70Var, hj1 hj1Var) {
        q40 re0Var;
        if (this.f31856j == null) {
            throw new IllegalStateException();
        }
        lz lzVar = (lz) q70Var;
        long b4 = lzVar.b();
        if (b4 != -1 && !this.f31850d.c()) {
            return this.f31850d.a(lzVar, hj1Var);
        }
        if (!this.f31857k) {
            this.f31857k = true;
            if (this.f31850d.a() != -9223372036854775807L) {
                qm1 qm1Var = new qm1(this.f31850d.b(), this.f31850d.a(), b4);
                this.f31855i = qm1Var;
                this.f31856j.a(qm1Var.a());
            } else {
                this.f31856j.a(new tw1.b(this.f31850d.a(), 0L));
            }
        }
        qm1 qm1Var2 = this.f31855i;
        if (qm1Var2 != null && qm1Var2.b()) {
            return this.f31855i.a(lzVar, hj1Var);
        }
        lzVar.c();
        long d4 = b4 != -1 ? b4 - lzVar.d() : -1L;
        if ((d4 != -1 && d4 < 4) || !lzVar.b(this.f31849c.c(), 0, 4, true)) {
            return -1;
        }
        this.f31849c.e(0);
        int h4 = this.f31849c.h();
        if (h4 == 441) {
            return -1;
        }
        if (h4 == 442) {
            lzVar.b(this.f31849c.c(), 0, 10, false);
            this.f31849c.e(9);
            lzVar.a((this.f31849c.t() & 7) + 14);
            return 0;
        }
        if (h4 == 443) {
            lzVar.b(this.f31849c.c(), 0, 2, false);
            this.f31849c.e(0);
            lzVar.a(this.f31849c.z() + 6);
            return 0;
        }
        if (((h4 & (-256)) >> 8) != 1) {
            lzVar.a(1);
            return 0;
        }
        int i4 = h4 & KotlinVersion.MAX_COMPONENT_VALUE;
        a aVar = this.f31848b.get(i4);
        if (!this.f31851e) {
            if (aVar == null) {
                q40 q40Var = null;
                if (i4 == 189) {
                    re0Var = new C2123o(null);
                    this.f31852f = true;
                    this.f31854h = lzVar.a();
                } else if ((h4 & 224) == 192) {
                    re0Var = new r11(null);
                    this.f31852f = true;
                    this.f31854h = lzVar.a();
                } else {
                    if ((h4 & 240) == 224) {
                        re0Var = new re0(null);
                        this.f31853g = true;
                        this.f31854h = lzVar.a();
                    }
                    if (q40Var != null) {
                        q40Var.a(this.f31856j, new e72.d(Integer.MIN_VALUE, i4, UserVerificationMethods.USER_VERIFY_HANDPRINT));
                        aVar = new a(q40Var, this.f31847a);
                        this.f31848b.put(i4, aVar);
                    }
                }
                q40Var = re0Var;
                if (q40Var != null) {
                }
            }
            if (lzVar.a() > ((this.f31852f && this.f31853g) ? this.f31854h + 8192 : 1048576L)) {
                this.f31851e = true;
                this.f31856j.a();
            }
        }
        lzVar.b(this.f31849c.c(), 0, 2, false);
        this.f31849c.e(0);
        int z4 = this.f31849c.z() + 6;
        if (aVar == null) {
            lzVar.a(z4);
        } else {
            this.f31849c.c(z4);
            lzVar.a(this.f31849c.c(), 0, z4, false);
            this.f31849c.e(6);
            sf1 sf1Var = this.f31849c;
            sf1Var.a(aVar.f31860c.f31172a, 0, 3);
            aVar.f31860c.c(0);
            aVar.f31860c.d(8);
            aVar.f31861d = aVar.f31860c.f();
            aVar.f31862e = aVar.f31860c.f();
            aVar.f31860c.d(6);
            sf1Var.a(aVar.f31860c.f31172a, 0, aVar.f31860c.b(8));
            aVar.f31860c.c(0);
            aVar.f31864g = 0L;
            if (aVar.f31861d) {
                aVar.f31860c.d(4);
                aVar.f31860c.d(1);
                aVar.f31860c.d(1);
                long b5 = (aVar.f31860c.b(3) << 30) | (aVar.f31860c.b(15) << 15) | aVar.f31860c.b(15);
                aVar.f31860c.d(1);
                if (!aVar.f31863f && aVar.f31862e) {
                    aVar.f31860c.d(4);
                    aVar.f31860c.d(1);
                    aVar.f31860c.d(1);
                    aVar.f31860c.d(1);
                    aVar.f31859b.b((aVar.f31860c.b(3) << 30) | (aVar.f31860c.b(15) << 15) | aVar.f31860c.b(15));
                    aVar.f31863f = true;
                }
                aVar.f31864g = aVar.f31859b.b(b5);
            }
            aVar.f31858a.a(4, aVar.f31864g);
            aVar.f31858a.a(sf1Var);
            aVar.f31858a.b();
            sf1 sf1Var2 = this.f31849c;
            sf1Var2.d(sf1Var2.b());
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r2 != r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r4.f31847a.c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        if (r5 != false) goto L15;
     */
    @Override // com.yandex.mobile.ads.impl.p70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j4, long j5) {
        boolean z4 = this.f31847a.c() == -9223372036854775807L;
        if (!z4) {
            long a4 = this.f31847a.a();
            if (a4 != -9223372036854775807L) {
                if (a4 != 0) {
                }
            }
        }
        qm1 qm1Var = this.f31855i;
        if (qm1Var != null) {
            qm1Var.a(j5);
        }
        for (int i4 = 0; i4 < this.f31848b.size(); i4++) {
            a valueAt = this.f31848b.valueAt(i4);
            valueAt.f31863f = false;
            valueAt.f31858a.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        byte[] bArr = new byte[14];
        lz lzVar = (lz) q70Var;
        lzVar.b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        lzVar.a(false, bArr[13] & 7);
        lzVar.b(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p70[] a() {
        return new p70[]{new sm1(new e52(0L))};
    }
}
