package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes.dex */
final class ie4 extends ne4 {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f6630e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f6631b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6632c;

    /* renamed from: d, reason: collision with root package name */
    private int f6633d;

    public ie4(td4 td4Var) {
        super(td4Var);
    }

    @Override // com.google.android.gms.internal.ads.ne4
    protected final boolean a(dr2 dr2Var) {
        bf4 bf4Var;
        int i7;
        if (this.f6631b) {
            dr2Var.g(1);
        } else {
            int s7 = dr2Var.s();
            int i8 = s7 >> 4;
            this.f6633d = i8;
            if (i8 == 2) {
                i7 = f6630e[(s7 >> 2) & 3];
                bf4Var = new bf4();
                bf4Var.s("audio/mpeg");
                bf4Var.e0(1);
            } else if (i8 == 7 || i8 == 8) {
                String str = i8 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                bf4Var = new bf4();
                bf4Var.s(str);
                bf4Var.e0(1);
                i7 = 8000;
            } else {
                if (i8 != 10) {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Audio format not supported: ");
                    sb.append(i8);
                    throw new me4(sb.toString());
                }
                this.f6631b = true;
            }
            bf4Var.t(i7);
            this.f9063a.b(bf4Var.y());
            this.f6632c = true;
            this.f6631b = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ne4
    protected final boolean b(dr2 dr2Var, long j7) {
        if (this.f6633d == 2) {
            int i7 = dr2Var.i();
            this.f9063a.e(dr2Var, i7);
            this.f9063a.a(j7, 1, i7, 0, null);
            return true;
        }
        int s7 = dr2Var.s();
        if (s7 != 0 || this.f6632c) {
            if (this.f6633d == 10 && s7 != 1) {
                return false;
            }
            int i8 = dr2Var.i();
            this.f9063a.e(dr2Var, i8);
            this.f9063a.a(j7, 1, i8, 0, null);
            return true;
        }
        int i9 = dr2Var.i();
        byte[] bArr = new byte[i9];
        dr2Var.b(bArr, 0, i9);
        pb4 a7 = qb4.a(bArr);
        bf4 bf4Var = new bf4();
        bf4Var.s("audio/mp4a-latm");
        bf4Var.f0(a7.f10171c);
        bf4Var.e0(a7.f10170b);
        bf4Var.t(a7.f10169a);
        bf4Var.i(Collections.singletonList(bArr));
        this.f9063a.b(bf4Var.y());
        this.f6632c = true;
        return false;
    }
}
