package a0;

import a.AbstractC0124a;
import java.util.Arrays;

/* renamed from: a0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134J {

    /* renamed from: a, reason: collision with root package name */
    public int f3909a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3910b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3911c;

    /* renamed from: d, reason: collision with root package name */
    public int f3912d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3913e;

    public C0134J(int i4) {
        this.f3909a = i4;
        byte[] bArr = new byte[131];
        this.f3913e = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i4, int i5) {
        if (this.f3910b) {
            int i6 = i5 - i4;
            byte[] bArr2 = (byte[]) this.f3913e;
            int length = bArr2.length;
            int i7 = this.f3912d;
            if (length < i7 + i6) {
                this.f3913e = Arrays.copyOf(bArr2, (i7 + i6) * 2);
            }
            System.arraycopy(bArr, i4, (byte[]) this.f3913e, this.f3912d, i6);
            this.f3912d += i6;
        }
    }

    public boolean b(int i4) {
        if (!this.f3910b) {
            return false;
        }
        this.f3912d -= i4;
        this.f3910b = false;
        this.f3911c = true;
        return true;
    }

    public void c(int i4) {
        this.f3910b |= i4 > 0;
        this.f3909a += i4;
    }

    public void d() {
        this.f3910b = false;
        this.f3911c = false;
    }

    public void e(int i4) {
        AbstractC0124a.t(!this.f3910b);
        boolean z = i4 == this.f3909a;
        this.f3910b = z;
        if (z) {
            this.f3912d = 3;
            this.f3911c = false;
        }
    }

    public C0134J(g0 g0Var) {
        this.f3913e = g0Var;
    }
}
