package y0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public int f16215a;

    /* renamed from: b, reason: collision with root package name */
    public int f16216b;

    /* renamed from: c, reason: collision with root package name */
    public int f16217c;

    /* renamed from: d, reason: collision with root package name */
    public int f16218d;

    /* renamed from: e, reason: collision with root package name */
    public int f16219e;

    /* renamed from: f, reason: collision with root package name */
    public int f16220f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f16221g;

    public boolean a(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i4 & (-2097152)) != -2097152 || (i5 = (i4 >>> 19) & 3) == 1 || (i6 = (i4 >>> 17) & 3) == 0 || (i7 = (i4 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i4 >>> 10) & 3) == 3) {
            return false;
        }
        this.f16215a = i5;
        this.f16221g = AbstractC1569a.f16111s[3 - i6];
        int i9 = AbstractC1569a.f16112t[i8];
        this.f16217c = i9;
        if (i5 == 2) {
            this.f16217c = i9 / 2;
        } else if (i5 == 0) {
            this.f16217c = i9 / 4;
        }
        int i10 = (i4 >>> 9) & 1;
        int i11 = 1152;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    throw new IllegalArgumentException();
                }
                i11 = 384;
            }
        } else if (i5 != 3) {
            i11 = 576;
        }
        this.f16220f = i11;
        if (i6 == 3) {
            int i12 = i5 == 3 ? AbstractC1569a.f16113u[i7 - 1] : AbstractC1569a.v[i7 - 1];
            this.f16219e = i12;
            this.f16216b = (((i12 * 12) / this.f16217c) + i10) * 4;
        } else {
            if (i5 == 3) {
                int i13 = i6 == 2 ? AbstractC1569a.f16114w[i7 - 1] : AbstractC1569a.f16115x[i7 - 1];
                this.f16219e = i13;
                this.f16216b = ((i13 * 144) / this.f16217c) + i10;
            } else {
                int i14 = AbstractC1569a.f16116y[i7 - 1];
                this.f16219e = i14;
                this.f16216b = (((i6 == 1 ? 72 : 144) * i14) / this.f16217c) + i10;
            }
        }
        this.f16218d = ((i4 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
