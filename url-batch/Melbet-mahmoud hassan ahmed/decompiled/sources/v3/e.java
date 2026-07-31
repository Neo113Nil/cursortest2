package v3;

import androidx.annotation.RecentlyNonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {
    @RecentlyNonNull
    public static <K, V> Map<K, V> a(@RecentlyNonNull K k7, @RecentlyNonNull V v6, @RecentlyNonNull K k8, @RecentlyNonNull V v7, @RecentlyNonNull K k9, @RecentlyNonNull V v8) {
        Map f7 = f(3, false);
        f7.put(k7, v6);
        f7.put(k8, v7);
        f7.put(k9, v8);
        return Collections.unmodifiableMap(f7);
    }

    @RecentlyNonNull
    public static <K, V> Map<K, V> b(@RecentlyNonNull K[] kArr, @RecentlyNonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            StringBuilder sb = new StringBuilder(66);
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map f7 = f(length, false);
        for (int i7 = 0; i7 < kArr.length; i7++) {
            f7.put(kArr[i7], vArr[i7]);
        }
        return Collections.unmodifiableMap(f7);
    }

    @RecentlyNonNull
    @Deprecated
    public static <T> Set<T> c(@RecentlyNonNull T t6, @RecentlyNonNull T t7, @RecentlyNonNull T t8) {
        Set e7 = e(3, false);
        e7.add(t6);
        e7.add(t7);
        e7.add(t8);
        return Collections.unmodifiableSet(e7);
    }

    @RecentlyNonNull
    @Deprecated
    public static <T> Set<T> d(@RecentlyNonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t6 = tArr[0];
            T t7 = tArr[1];
            Set e7 = e(2, false);
            e7.add(t6);
            e7.add(t7);
            return Collections.unmodifiableSet(e7);
        }
        if (length == 3) {
            return c(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set e8 = e(length, false);
            Collections.addAll(e8, tArr);
            return Collections.unmodifiableSet(e8);
        }
        T t8 = tArr[0];
        T t9 = tArr[1];
        T t10 = tArr[2];
        T t11 = tArr[3];
        Set e9 = e(4, false);
        e9.add(t8);
        e9.add(t9);
        e9.add(t10);
        e9.add(t11);
        return Collections.unmodifiableSet(e9);
    }

    private static <T> Set<T> e(int i7, boolean z6) {
        return i7 <= (true != z6 ? 256 : 128) ? new h.b(i7) : new HashSet(i7, true != z6 ? 1.0f : 0.75f);
    }

    private static <K, V> Map<K, V> f(int i7, boolean z6) {
        return i7 <= 256 ? new h.a(i7) : new HashMap(i7, 1.0f);
    }
}
