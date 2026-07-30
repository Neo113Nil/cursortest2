package kotlin;

import com.facebook.appevents.AppEventsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class UByte$$ExternalSyntheticBackport0 {
    public static /* synthetic */ int m(int i, int i2) {
        return (int) ((i & 4294967295L) / (i2 & 4294967295L));
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ long m578m(long j, long j2) {
        if (j2 < 0) {
            return (j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if ((j3 ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE)) {
            j2 = 0;
        }
        return j3 - j2;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ String m579m(int i, int i2) {
        return Long.toString(i & 4294967295L, i2);
    }

    public static /* synthetic */ String m(long j, int i) {
        if (j == 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        if (j > 0) {
            return Long.toString(j, i);
        }
        if (i < 2 || i > 36) {
            i = 10;
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = Character.forDigit(((int) j) & i3, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            long m$1 = (i & 1) == 0 ? (j >>> 1) / (i >>> 1) : m$1(j, i);
            long j2 = i;
            cArr[63] = Character.forDigit((int) (j - (m$1 * j2)), i);
            i2 = 63;
            while (m$1 > 0) {
                i2--;
                cArr[i2] = Character.forDigit((int) (m$1 % j2), i);
                m$1 /= j2;
            }
        }
        return new String(cArr, i2, 64 - i2);
    }

    public static /* synthetic */ List m(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ Optional m(Optional optional, Supplier supplier) {
        Objects.requireNonNull(supplier);
        return optional.isPresent() ? optional : (Optional) Objects.requireNonNull((Optional) supplier.get());
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ Set m581m(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            if (!hashSet.add(Objects.requireNonNull(obj))) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ int m$1(int i, int i2) {
        return (int) ((i & 4294967295L) % (i2 & 4294967295L));
    }

    public static /* synthetic */ long m$1(long j, long j2) {
        if (j2 < 0) {
            return (j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j >= 0) {
            return j / j2;
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return j3 + (((j - (j3 * j2)) ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0 : 1);
    }

    public static /* synthetic */ String m$1(long j, int i) {
        if (j == 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        if (j > 0) {
            return Long.toString(j, i);
        }
        if (i < 2 || i > 36) {
            i = 10;
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = Character.forDigit(((int) j) & i3, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            long m$1 = (i & 1) == 0 ? (j >>> 1) / (i >>> 1) : m$1(j, i);
            long j2 = i;
            cArr[63] = Character.forDigit((int) (j - (m$1 * j2)), i);
            i2 = 63;
            while (m$1 > 0) {
                i2--;
                cArr[i2] = Character.forDigit((int) (m$1 % j2), i);
                m$1 /= j2;
            }
        }
        return new String(cArr, i2, 64 - i2);
    }

    public static /* synthetic */ String m$2(long j, int i) {
        if (j == 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        if (j > 0) {
            return Long.toString(j, i);
        }
        if (i < 2 || i > 36) {
            i = 10;
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = Character.forDigit(((int) j) & i3, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            long m$1 = (i & 1) == 0 ? (j >>> 1) / (i >>> 1) : m$1(j, i);
            long j2 = i;
            cArr[63] = Character.forDigit((int) (j - (m$1 * j2)), i);
            i2 = 63;
            while (m$1 > 0) {
                i2--;
                cArr[i2] = Character.forDigit((int) (m$1 % j2), i);
                m$1 /= j2;
            }
        }
        return new String(cArr, i2, 64 - i2);
    }
}
