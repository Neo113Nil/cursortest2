package kotlin.random;

import c2.AbstractC1379b;
import io.jsonwebtoken.JwtParser;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f41170b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final e f41171c = AbstractC1379b.f13349a.b();

    public static final class a extends e implements Serializable {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // kotlin.random.e
        public int d(int i4) {
            return e.f41171c.d(i4);
        }

        @Override // kotlin.random.e
        public boolean e() {
            return e.f41171c.e();
        }

        @Override // kotlin.random.e
        public byte[] f(byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return e.f41171c.f(array);
        }

        @Override // kotlin.random.e
        public byte[] g(byte[] array, int i4, int i5) {
            Intrinsics.checkNotNullParameter(array, "array");
            return e.f41171c.g(array, i4, i5);
        }

        @Override // kotlin.random.e
        public double h() {
            return e.f41171c.h();
        }

        @Override // kotlin.random.e
        public float i() {
            return e.f41171c.i();
        }

        @Override // kotlin.random.e
        public int j() {
            return e.f41171c.j();
        }

        @Override // kotlin.random.e
        public int k(int i4) {
            return e.f41171c.k(i4);
        }

        @Override // kotlin.random.e
        public int l(int i4, int i5) {
            return e.f41171c.l(i4, i5);
        }

        @Override // kotlin.random.e
        public long m() {
            return e.f41171c.m();
        }

        private a() {
        }
    }

    public abstract int d(int i4);

    public boolean e() {
        return d(1) != 0;
    }

    public byte[] f(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return g(array, 0, array.length);
    }

    public byte[] g(byte[] array, int i4, int i5) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (!new IntRange(0, array.length).h(i4) || !new IntRange(0, array.length).h(i5)) {
            throw new IllegalArgumentException(("fromIndex (" + i4 + ") or toIndex (" + i5 + ") are out of range: 0.." + array.length + JwtParser.SEPARATOR_CHAR).toString());
        }
        if (i4 > i5) {
            throw new IllegalArgumentException(("fromIndex (" + i4 + ") must be not greater than toIndex (" + i5 + ").").toString());
        }
        int i6 = (i5 - i4) / 4;
        for (int i7 = 0; i7 < i6; i7++) {
            int j4 = j();
            array[i4] = (byte) j4;
            array[i4 + 1] = (byte) (j4 >>> 8);
            array[i4 + 2] = (byte) (j4 >>> 16);
            array[i4 + 3] = (byte) (j4 >>> 24);
            i4 += 4;
        }
        int i8 = i5 - i4;
        int d4 = d(i8 * 8);
        for (int i9 = 0; i9 < i8; i9++) {
            array[i4 + i9] = (byte) (d4 >>> (i9 * 8));
        }
        return array;
    }

    public double h() {
        return d.b(d(26), d(27));
    }

    public float i() {
        return d(24) / 1.6777216E7f;
    }

    public int j() {
        return d(32);
    }

    public int k(int i4) {
        return l(0, i4);
    }

    public int l(int i4, int i5) {
        int j4;
        int i6;
        int i7;
        f.b(i4, i5);
        int i8 = i5 - i4;
        if (i8 > 0 || i8 == Integer.MIN_VALUE) {
            if (((-i8) & i8) == i8) {
                i7 = d(f.c(i8));
            } else {
                do {
                    j4 = j() >>> 1;
                    i6 = j4 % i8;
                } while ((j4 - i6) + (i8 - 1) < 0);
                i7 = i6;
            }
            return i4 + i7;
        }
        while (true) {
            int j5 = j();
            if (i4 <= j5 && j5 < i5) {
                return j5;
            }
        }
    }

    public long m() {
        return (j() << 32) + j();
    }
}
