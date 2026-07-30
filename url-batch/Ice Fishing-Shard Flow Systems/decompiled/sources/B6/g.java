package B6;

import R5.A;
import R5.D;
import R5.E;
import R5.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f222i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p writer, boolean z7) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f222i = z7;
    }

    @Override // B6.e
    public final void d(byte b7) {
        if (this.f222i) {
            R5.s sVar = R5.t.f2432e;
            k(String.valueOf(b7 & 255));
        } else {
            R5.s sVar2 = R5.t.f2432e;
            h(String.valueOf(b7 & 255));
        }
    }

    @Override // B6.e
    public final void f(int i2) {
        if (this.f222i) {
            R5.w wVar = R5.x.f2438e;
            k(Long.toString(i2 & 4294967295L, 10));
        } else {
            R5.w wVar2 = R5.x.f2438e;
            h(Long.toString(i2 & 4294967295L, 10));
        }
    }

    @Override // B6.e
    public final void g(long j) {
        int i2 = 63;
        String str = "0";
        if (this.f222i) {
            z zVar = A.f2400e;
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j7 = (j >>> 1) / 5;
                    long j8 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j7 * j8)), 10);
                    while (j7 > 0) {
                        i2--;
                        cArr[i2] = Character.forDigit((int) (j7 % j8), 10);
                        j7 /= j8;
                    }
                    str = new String(cArr, i2, 64 - i2);
                }
            }
            k(str);
            return;
        }
        z zVar2 = A.f2400e;
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j9 = (j >>> 1) / 5;
                long j10 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j9 * j10)), 10);
                while (j9 > 0) {
                    i2--;
                    cArr2[i2] = Character.forDigit((int) (j9 % j10), 10);
                    j9 /= j10;
                }
                str = new String(cArr2, i2, 64 - i2);
            }
        }
        h(str);
    }

    @Override // B6.e
    public final void j(short s7) {
        if (this.f222i) {
            D d7 = E.f2404e;
            k(String.valueOf(s7 & 65535));
        } else {
            D d8 = E.f2404e;
            h(String.valueOf(s7 & 65535));
        }
    }
}
