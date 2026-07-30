package B2;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class H extends LinkedHashMap {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ K f172n;

    public H(K k6) {
        Objects.requireNonNull(k6);
        this.f172n = k6;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        K k6 = this.f172n;
        synchronized (k6) {
            try {
                if (size() <= k6.f181a) {
                    return false;
                }
                k6.f186f.add(new Pair((String) entry.getKey(), ((I) entry.getValue()).f174b));
                return size() > k6.f181a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
