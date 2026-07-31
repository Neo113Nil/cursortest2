package com.yandex.mobile.ads.impl;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.yandex.mobile.ads.impl.C1790a;
import com.yandex.mobile.ads.impl.t32;
import com.yandex.mobile.ads.impl.yb0;
import java.util.Collections;

/* renamed from: com.yandex.mobile.ads.impl.kh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2047kh extends t32 {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f28200e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f28201b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28202c;

    /* renamed from: d, reason: collision with root package name */
    private int f28203d;

    public C2047kh(p52 p52Var) {
        super(p52Var);
    }

    protected final boolean a(sf1 sf1Var) {
        if (this.f28201b) {
            sf1Var.f(1);
        } else {
            int t4 = sf1Var.t();
            int i4 = (t4 >> 4) & 15;
            this.f28203d = i4;
            if (i4 == 2) {
                this.f32145a.a(new yb0.a().e("audio/mpeg").c(1).l(f28200e[(t4 >> 2) & 3]).a());
                this.f28202c = true;
            } else if (i4 == 7 || i4 == 8) {
                this.f32145a.a(new yb0.a().e(i4 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").c(1).l(JosStatusCodes.RTN_CODE_COMMON_ERROR).a());
                this.f28202c = true;
            } else if (i4 != 10) {
                throw new t32.a("Audio format not supported: " + this.f28203d);
            }
            this.f28201b = true;
        }
        return true;
    }

    protected final boolean a(long j4, sf1 sf1Var) {
        if (this.f28203d == 2) {
            int a4 = sf1Var.a();
            this.f32145a.a(a4, sf1Var);
            this.f32145a.a(j4, 1, a4, 0, null);
            return true;
        }
        int t4 = sf1Var.t();
        if (t4 == 0 && !this.f28202c) {
            int a5 = sf1Var.a();
            byte[] bArr = new byte[a5];
            sf1Var.a(bArr, 0, a5);
            C1790a.C0181a a6 = C1790a.a(new rf1(a5, bArr), false);
            this.f32145a.a(new yb0.a().e("audio/mp4a-latm").a(a6.f23104c).c(a6.f23103b).l(a6.f23102a).a(Collections.singletonList(bArr)).a());
            this.f28202c = true;
            return false;
        }
        if (this.f28203d == 10 && t4 != 1) {
            return false;
        }
        int a7 = sf1Var.a();
        this.f32145a.a(a7, sf1Var);
        this.f32145a.a(j4, 1, a7, 0, null);
        return true;
    }
}
