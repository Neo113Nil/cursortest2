package W;

import a.AbstractC0124a;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3342a;

    /* renamed from: b, reason: collision with root package name */
    public int f3343b;

    /* renamed from: c, reason: collision with root package name */
    public int f3344c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f3345d;

    /* renamed from: e, reason: collision with root package name */
    public int f3346e;

    public t() {
        this.f3342a = 0;
        this.f3345d = J.f3264b;
    }

    public void a() {
        int i4;
        int i5;
        switch (this.f3342a) {
            case 0:
                int i6 = this.f3343b;
                AbstractC0124a.t(i6 >= 0 && (i6 < (i4 = this.f3346e) || (i6 == i4 && this.f3344c == 0)));
                break;
            default:
                int i7 = this.f3344c;
                AbstractC0124a.t(i7 >= 0 && (i7 < (i5 = this.f3343b) || (i7 == i5 && this.f3346e == 0)));
                break;
        }
    }

    public int b() {
        return ((this.f3346e - this.f3343b) * 8) - this.f3344c;
    }

    public void c() {
        if (this.f3344c == 0) {
            return;
        }
        this.f3344c = 0;
        this.f3343b++;
        a();
    }

    public boolean d(int i4) {
        int i5 = this.f3344c;
        int i6 = i4 / 8;
        int i7 = i5 + i6;
        int i8 = (this.f3346e + i4) - (i6 * 8);
        if (i8 > 7) {
            i7++;
            i8 -= 8;
        }
        while (true) {
            i5++;
            if (i5 > i7 || i7 >= this.f3343b) {
                break;
            }
            if (r(i5)) {
                i7++;
                i5 += 2;
            }
        }
        int i9 = this.f3343b;
        if (i7 >= i9) {
            return i7 == i9 && i8 == 0;
        }
        return true;
    }

    public boolean e() {
        int i4 = this.f3344c;
        int i5 = this.f3346e;
        int i6 = 0;
        while (this.f3344c < this.f3343b && !h()) {
            i6++;
        }
        boolean z = this.f3344c == this.f3343b;
        this.f3344c = i4;
        this.f3346e = i5;
        return !z && d((i6 * 2) + 1);
    }

    public int f() {
        AbstractC0124a.t(this.f3344c == 0);
        return this.f3343b;
    }

    public int g() {
        return (this.f3343b * 8) + this.f3344c;
    }

    public boolean h() {
        switch (this.f3342a) {
            case 0:
                boolean z = (this.f3345d[this.f3343b] & (128 >> this.f3344c)) != 0;
                s();
                return z;
            case 1:
            default:
                boolean z4 = (((this.f3345d[this.f3344c] & 255) >> this.f3346e) & 1) == 1;
                t(1);
                return z4;
            case 2:
                boolean z5 = (this.f3345d[this.f3344c] & (128 >> this.f3346e)) != 0;
                s();
                return z5;
        }
    }

    public int i(int i4) {
        switch (this.f3342a) {
            case 0:
                if (i4 == 0) {
                    return 0;
                }
                this.f3344c += i4;
                int i5 = 0;
                while (true) {
                    int i6 = this.f3344c;
                    if (i6 <= 8) {
                        byte[] bArr = this.f3345d;
                        int i7 = this.f3343b;
                        int i8 = ((-1) >>> (32 - i4)) & (i5 | ((bArr[i7] & 255) >> (8 - i6)));
                        if (i6 == 8) {
                            this.f3344c = 0;
                            this.f3343b = i7 + 1;
                        }
                        a();
                        return i8;
                    }
                    int i9 = i6 - 8;
                    this.f3344c = i9;
                    byte[] bArr2 = this.f3345d;
                    int i10 = this.f3343b;
                    this.f3343b = i10 + 1;
                    i5 |= (bArr2[i10] & 255) << i9;
                }
            case 1:
            default:
                int i11 = this.f3344c;
                int min = Math.min(i4, 8 - this.f3346e);
                byte[] bArr3 = this.f3345d;
                int i12 = i11 + 1;
                int i13 = ((bArr3[i11] & 255) >> this.f3346e) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - min));
                while (min < i4) {
                    i13 |= (bArr3[i12] & 255) << min;
                    min += 8;
                    i12++;
                }
                int i14 = i13 & ((-1) >>> (32 - i4));
                t(i4);
                return i14;
            case 2:
                this.f3346e += i4;
                int i15 = 0;
                while (true) {
                    int i16 = this.f3346e;
                    if (i16 <= 8) {
                        byte[] bArr4 = this.f3345d;
                        int i17 = this.f3344c;
                        int i18 = ((-1) >>> (32 - i4)) & (i15 | ((bArr4[i17] & 255) >> (8 - i16)));
                        if (i16 == 8) {
                            this.f3346e = 0;
                            this.f3344c = i17 + (r(i17 + 1) ? 2 : 1);
                        }
                        a();
                        return i18;
                    }
                    int i19 = i16 - 8;
                    this.f3346e = i19;
                    byte[] bArr5 = this.f3345d;
                    int i20 = this.f3344c;
                    i15 |= (bArr5[i20] & 255) << i19;
                    if (!r(i20 + 1)) {
                        r3 = 1;
                    }
                    this.f3344c = i20 + r3;
                }
        }
    }

    public void j(int i4, byte[] bArr) {
        int i5 = i4 >> 3;
        for (int i6 = 0; i6 < i5; i6++) {
            byte[] bArr2 = this.f3345d;
            int i7 = this.f3343b;
            int i8 = i7 + 1;
            this.f3343b = i8;
            byte b4 = bArr2[i7];
            int i9 = this.f3344c;
            byte b5 = (byte) (b4 << i9);
            bArr[i6] = b5;
            bArr[i6] = (byte) (((255 & bArr2[i8]) >> (8 - i9)) | b5);
        }
        int i10 = i4 & 7;
        if (i10 == 0) {
            return;
        }
        byte b6 = (byte) (bArr[i5] & (KotlinVersion.MAX_COMPONENT_VALUE >> i10));
        bArr[i5] = b6;
        int i11 = this.f3344c;
        if (i11 + i10 > 8) {
            byte[] bArr3 = this.f3345d;
            int i12 = this.f3343b;
            this.f3343b = i12 + 1;
            bArr[i5] = (byte) (b6 | ((bArr3[i12] & 255) << i11));
            this.f3344c = i11 - 8;
        }
        int i13 = this.f3344c + i10;
        this.f3344c = i13;
        byte[] bArr4 = this.f3345d;
        int i14 = this.f3343b;
        bArr[i5] = (byte) (((byte) (((255 & bArr4[i14]) >> (8 - i13)) << (8 - i10))) | bArr[i5]);
        if (i13 == 8) {
            this.f3344c = 0;
            this.f3343b = i14 + 1;
        }
        a();
    }

    public long k(int i4) {
        if (i4 <= 32) {
            int i5 = i(i4);
            String str = J.f3263a;
            return KeyboardMap.kValueMask & i5;
        }
        int i6 = i(i4 - 32);
        int i7 = i(32);
        String str2 = J.f3263a;
        return (KeyboardMap.kValueMask & i7) | ((i6 & KeyboardMap.kValueMask) << 32);
    }

    public void l(int i4, byte[] bArr) {
        AbstractC0124a.t(this.f3344c == 0);
        System.arraycopy(this.f3345d, this.f3343b, bArr, 0, i4);
        this.f3343b += i4;
        a();
    }

    public int m() {
        int i4 = 0;
        while (!h()) {
            i4++;
        }
        return ((1 << i4) - 1) + (i4 > 0 ? i(i4) : 0);
    }

    public int n() {
        int m4 = m();
        return ((m4 + 1) / 2) * (m4 % 2 == 0 ? -1 : 1);
    }

    public void o(int i4, byte[] bArr) {
        this.f3345d = bArr;
        this.f3343b = 0;
        this.f3344c = 0;
        this.f3346e = i4;
    }

    public void p(u uVar) {
        o(uVar.f3353c, uVar.f3351a);
        q(uVar.f3352b * 8);
    }

    public void q(int i4) {
        int i5 = i4 / 8;
        this.f3343b = i5;
        this.f3344c = i4 - (i5 * 8);
        a();
    }

    public boolean r(int i4) {
        if (2 > i4 || i4 >= this.f3343b) {
            return false;
        }
        byte[] bArr = this.f3345d;
        return bArr[i4] == 3 && bArr[i4 + (-2)] == 0 && bArr[i4 - 1] == 0;
    }

    public void s() {
        switch (this.f3342a) {
            case 0:
                int i4 = this.f3344c + 1;
                this.f3344c = i4;
                if (i4 == 8) {
                    this.f3344c = 0;
                    this.f3343b++;
                }
                a();
                break;
            default:
                int i5 = this.f3346e + 1;
                this.f3346e = i5;
                if (i5 == 8) {
                    this.f3346e = 0;
                    int i6 = this.f3344c;
                    this.f3344c = i6 + (r(i6 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i4) {
        int i5;
        switch (this.f3342a) {
            case 0:
                int i6 = i4 / 8;
                int i7 = this.f3343b + i6;
                this.f3343b = i7;
                int i8 = (i4 - (i6 * 8)) + this.f3344c;
                this.f3344c = i8;
                if (i8 > 7) {
                    this.f3343b = i7 + 1;
                    this.f3344c = i8 - 8;
                }
                a();
                break;
            case 1:
            default:
                int i9 = i4 / 8;
                int i10 = this.f3344c + i9;
                this.f3344c = i10;
                int i11 = (i4 - (i9 * 8)) + this.f3346e;
                this.f3346e = i11;
                boolean z = true;
                if (i11 > 7) {
                    this.f3344c = i10 + 1;
                    this.f3346e = i11 - 8;
                }
                int i12 = this.f3344c;
                if (i12 < 0 || (i12 >= (i5 = this.f3343b) && (i12 != i5 || this.f3346e != 0))) {
                    z = false;
                }
                AbstractC0124a.t(z);
                break;
            case 2:
                int i13 = this.f3344c;
                int i14 = i4 / 8;
                int i15 = i13 + i14;
                this.f3344c = i15;
                int i16 = (i4 - (i14 * 8)) + this.f3346e;
                this.f3346e = i16;
                if (i16 > 7) {
                    this.f3344c = i15 + 1;
                    this.f3346e = i16 - 8;
                }
                while (true) {
                    i13++;
                    if (i13 > this.f3344c) {
                        a();
                        break;
                    } else if (r(i13)) {
                        this.f3344c++;
                        i13 += 2;
                    }
                }
        }
    }

    public void u(int i4) {
        AbstractC0124a.t(this.f3344c == 0);
        this.f3343b += i4;
        a();
    }

    public t(byte[] bArr) {
        this.f3342a = 3;
        this.f3345d = bArr;
        this.f3343b = bArr.length;
    }

    public t(byte[] bArr, int i4, int i5) {
        this.f3342a = 2;
        this.f3345d = bArr;
        this.f3344c = i4;
        this.f3343b = i5;
        this.f3346e = 0;
        a();
    }

    public t(int i4, byte[] bArr) {
        this.f3342a = 0;
        this.f3345d = bArr;
        this.f3346e = i4;
    }

    public t(int i4, int i5) {
        this.f3342a = 1;
        this.f3343b = i4;
        this.f3344c = i5;
        this.f3345d = new byte[(i5 * 2) - 1];
        this.f3346e = 0;
    }
}
