package kotlin.ranges;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i extends h {
    public static float c(float f4, float f5) {
        return f4 < f5 ? f5 : f4;
    }

    public static int d(int i4, int i5) {
        return i4 < i5 ? i5 : i4;
    }

    public static long e(long j4, long j5) {
        return j4 < j5 ? j5 : j4;
    }

    public static float f(float f4, float f5) {
        return f4 > f5 ? f5 : f4;
    }

    public static int g(int i4, int i5) {
        return i4 > i5 ? i5 : i4;
    }

    public static long h(long j4, long j5) {
        return j4 > j5 ? j5 : j4;
    }

    public static double i(double d4, double d5, double d6) {
        if (d5 <= d6) {
            return d4 < d5 ? d5 : d4 > d6 ? d6 : d4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d6 + " is less than minimum " + d5 + JwtParser.SEPARATOR_CHAR);
    }

    public static float j(float f4, float f5, float f6) {
        if (f5 <= f6) {
            return f4 < f5 ? f5 : f4 > f6 ? f6 : f4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f6 + " is less than minimum " + f5 + JwtParser.SEPARATOR_CHAR);
    }

    public static int k(int i4, int i5, int i6) {
        if (i5 <= i6) {
            return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i6 + " is less than minimum " + i5 + JwtParser.SEPARATOR_CHAR);
    }

    public static long l(long j4, long j5, long j6) {
        if (j5 <= j6) {
            return j4 < j5 ? j5 : j4 > j6 ? j6 : j4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j6 + " is less than minimum " + j5 + JwtParser.SEPARATOR_CHAR);
    }

    public static d m(int i4, int i5) {
        return d.f41182e.a(i4, i5, -1);
    }

    public static d n(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return d.f41182e.a(dVar.d(), dVar.b(), -dVar.e());
    }

    public static d o(d dVar, int i4) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        h.a(i4 > 0, Integer.valueOf(i4));
        d.a aVar = d.f41182e;
        int b4 = dVar.b();
        int d4 = dVar.d();
        if (dVar.e() <= 0) {
            i4 = -i4;
        }
        return aVar.a(b4, d4, i4);
    }

    public static IntRange p(int i4, int i5) {
        return i5 <= Integer.MIN_VALUE ? IntRange.f41172f.a() : new IntRange(i4, i5 - 1);
    }
}
