package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.n22;
import com.yandex.mobile.ads.impl.pb0;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class nb0 extends n22 {

    /* renamed from: n, reason: collision with root package name */
    private pb0 f29533n;

    /* renamed from: o, reason: collision with root package name */
    private a f29534o;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements rd1 {

        /* renamed from: a, reason: collision with root package name */
        private pb0 f29535a;

        /* renamed from: b, reason: collision with root package name */
        private pb0.a f29536b;

        /* renamed from: c, reason: collision with root package name */
        private long f29537c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f29538d = -1;

        public a(pb0 pb0Var, pb0.a aVar) {
            this.f29535a = pb0Var;
            this.f29536b = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.rd1
        public final tw1 a() {
            long j4 = this.f29537c;
            if (j4 != -1) {
                return new ob0(this.f29535a, j4);
            }
            throw new IllegalStateException();
        }

        @Override // com.yandex.mobile.ads.impl.rd1
        public final long a(lz lzVar) {
            long j4 = this.f29538d;
            if (j4 < 0) {
                return -1L;
            }
            long j5 = -(j4 + 2);
            this.f29538d = -1L;
            return j5;
        }

        @Override // com.yandex.mobile.ads.impl.rd1
        public final void a(long j4) {
            long[] jArr = this.f29536b.f30400a;
            this.f29538d = jArr[u82.b(jArr, j4, true)];
        }
    }

    nb0() {
    }

    @Override // com.yandex.mobile.ads.impl.n22
    protected final long a(sf1 sf1Var) {
        int i4;
        int i5;
        int t4;
        int i6 = -1;
        if (sf1Var.c()[0] != -1) {
            return -1L;
        }
        int i7 = (sf1Var.c()[2] & 255) >> 4;
        if (i7 == 6 || i7 == 7) {
            sf1Var.f(4);
            sf1Var.A();
        }
        switch (i7) {
            case 1:
                i6 = 192;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i4 = i7 - 2;
                i5 = 576;
                i6 = i5 << i4;
                break;
            case 6:
                t4 = sf1Var.t();
                i6 = t4 + 1;
                break;
            case 7:
                t4 = sf1Var.z();
                i6 = t4 + 1;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i4 = i7 - 8;
                i5 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                i6 = i5 << i4;
                break;
        }
        sf1Var.e(0);
        return i6;
    }

    @Override // com.yandex.mobile.ads.impl.n22
    protected final boolean a(sf1 sf1Var, long j4, n22.a aVar) {
        byte[] c4 = sf1Var.c();
        pb0 pb0Var = this.f29533n;
        if (pb0Var == null) {
            pb0 pb0Var2 = new pb0(17, c4);
            this.f29533n = pb0Var2;
            aVar.f29380a = pb0Var2.a(Arrays.copyOfRange(c4, 9, sf1Var.e()), null);
            return true;
        }
        byte b4 = c4[0];
        if ((b4 & Byte.MAX_VALUE) == 3) {
            pb0.a a4 = mb0.a(sf1Var);
            pb0 a5 = pb0Var.a(a4);
            this.f29533n = a5;
            this.f29534o = new a(a5, a4);
            return true;
        }
        if (b4 != -1) {
            return true;
        }
        a aVar2 = this.f29534o;
        if (aVar2 != null) {
            aVar2.f29537c = j4;
            aVar.f29381b = aVar2;
        }
        aVar.f29380a.getClass();
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.n22
    protected final void a(boolean z4) {
        super.a(z4);
        if (z4) {
            this.f29533n = null;
            this.f29534o = null;
        }
    }
}
