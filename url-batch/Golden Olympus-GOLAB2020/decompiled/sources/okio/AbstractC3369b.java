package okio;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.C3372e;

/* renamed from: okio.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3369b {

    /* renamed from: a, reason: collision with root package name */
    private static final C3372e.a f43254a = new C3372e.a();

    /* renamed from: b, reason: collision with root package name */
    private static final int f43255b = -1234567890;

    public static final boolean a(byte[] a4, int i4, byte[] b4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        for (int i7 = 0; i7 < i6; i7++) {
            if (a4[i7 + i4] != b4[i7 + i5]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j5 + " byteCount=" + j6);
        }
    }

    public static final int c() {
        return f43255b;
    }

    public static final C3372e.a d() {
        return f43254a;
    }

    public static final int e(h hVar, int i4) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return i4 == f43255b ? hVar.v() : i4;
    }

    public static final int f(byte[] bArr, int i4) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return i4 == f43255b ? bArr.length : i4;
    }

    public static final C3372e.a g(C3372e.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f43254a ? new C3372e.a() : unsafeCursor;
    }

    public static final int h(int i4) {
        return ((i4 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & i4) >>> 24) | ((16711680 & i4) >>> 8) | ((65280 & i4) << 8);
    }

    public static final short i(short s4) {
        return (short) (((s4 & 255) << 8) | ((65280 & s4) >>> 8));
    }

    public static final String j(byte b4) {
        return StringsKt.r(new char[]{H2.b.f()[(b4 >> 4) & 15], H2.b.f()[b4 & 15]});
    }

    public static final String k(int i4) {
        int i5 = 0;
        if (i4 == 0) {
            return "0";
        }
        char[] cArr = {H2.b.f()[(i4 >> 28) & 15], H2.b.f()[(i4 >> 24) & 15], H2.b.f()[(i4 >> 20) & 15], H2.b.f()[(i4 >> 16) & 15], H2.b.f()[(i4 >> 12) & 15], H2.b.f()[(i4 >> 8) & 15], H2.b.f()[(i4 >> 4) & 15], H2.b.f()[i4 & 15]};
        while (i5 < 8 && cArr[i5] == '0') {
            i5++;
        }
        return StringsKt.s(cArr, i5, 8);
    }
}
