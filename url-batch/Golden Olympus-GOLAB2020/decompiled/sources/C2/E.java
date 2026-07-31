package C2;

import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class E {

    /* renamed from: e, reason: collision with root package name */
    private static final a f192e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final long[] f193f = new long[0];

    /* renamed from: a, reason: collision with root package name */
    private final A2.f f194a;

    /* renamed from: b, reason: collision with root package name */
    private final Function2 f195b;

    /* renamed from: c, reason: collision with root package name */
    private long f196c;

    /* renamed from: d, reason: collision with root package name */
    private final long[] f197d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public E(A2.f descriptor, Function2 readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f194a = descriptor;
        this.f195b = readIfAbsent;
        int f4 = descriptor.f();
        if (f4 <= 64) {
            this.f196c = f4 != 64 ? (-1) << f4 : 0L;
            this.f197d = f193f;
        } else {
            this.f196c = 0L;
            this.f197d = e(f4);
        }
    }

    private final void b(int i4) {
        int i5 = (i4 >>> 6) - 1;
        long[] jArr = this.f197d;
        jArr[i5] = jArr[i5] | (1 << (i4 & 63));
    }

    private final int c() {
        int length = this.f197d.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            int i6 = i5 * 64;
            long j4 = this.f197d[i4];
            while (j4 != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j4);
                j4 |= 1 << numberOfTrailingZeros;
                int i7 = numberOfTrailingZeros + i6;
                if (((Boolean) this.f195b.invoke(this.f194a, Integer.valueOf(i7))).booleanValue()) {
                    this.f197d[i4] = j4;
                    return i7;
                }
            }
            this.f197d[i4] = j4;
            i4 = i5;
        }
        return -1;
    }

    private final long[] e(int i4) {
        long[] jArr = new long[(i4 - 1) >>> 6];
        if ((i4 & 63) != 0) {
            jArr[AbstractC3219i.L(jArr)] = (-1) << i4;
        }
        return jArr;
    }

    public final void a(int i4) {
        if (i4 < 64) {
            this.f196c |= 1 << i4;
        } else {
            b(i4);
        }
    }

    public final int d() {
        int numberOfTrailingZeros;
        int f4 = this.f194a.f();
        do {
            long j4 = this.f196c;
            if (j4 == -1) {
                if (f4 > 64) {
                    return c();
                }
                return -1;
            }
            numberOfTrailingZeros = Long.numberOfTrailingZeros(~j4);
            this.f196c |= 1 << numberOfTrailingZeros;
        } while (!((Boolean) this.f195b.invoke(this.f194a, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }
}
