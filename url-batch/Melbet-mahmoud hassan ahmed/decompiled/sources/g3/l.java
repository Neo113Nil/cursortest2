package g3;

import android.util.Pair;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.sw;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final int f16661a = ((Integer) sw.c().b(m10.f8286q5)).intValue();

    /* renamed from: b, reason: collision with root package name */
    private final long f16662b = ((Long) sw.c().b(m10.f8294r5)).longValue();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Pair<Long, String>> f16663c = Collections.synchronizedMap(new b(this));

    private final void e() {
        long b7 = y2.t.a().b();
        try {
            Iterator<Map.Entry<String, Pair<Long, String>>> it = this.f16663c.entrySet().iterator();
            while (it.hasNext() && b7 - ((Long) it.next().getValue().first).longValue() > this.f16662b) {
                it.remove();
            }
        } catch (ConcurrentModificationException e7) {
            y2.t.p().s(e7, "QueryJsonMap.removeExpiredEntries");
        }
    }

    public final synchronized String b(String str) {
        Pair<Long, String> pair = this.f16663c.get(str);
        if (pair == null) {
            return null;
        }
        String str2 = (String) pair.second;
        this.f16663c.remove(str);
        return str2;
    }

    public final synchronized void c(String str, String str2) {
        this.f16663c.put(str, new Pair<>(Long.valueOf(y2.t.a().b()), str2));
        e();
    }

    public final synchronized void d(String str) {
        this.f16663c.remove(str);
    }
}
