package K0;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f811a = new ConcurrentHashMap(16);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f812a;

        /* renamed from: b, reason: collision with root package name */
        private final long f813b;

        public a(long j4, long j5) {
            this.f812a = j4;
            this.f813b = j5;
        }

        public boolean a() {
            return SystemClock.elapsedRealtime() - this.f813b <= this.f812a;
        }
    }

    public static a a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("map size of get is before: ");
        Map map = f811a;
        sb.append(map.size());
        Logger.v("RequestUtil", sb.toString());
        a aVar = (a) map.get(str);
        Logger.v("RequestUtil", "map size of get is after: " + map.size());
        return aVar;
    }

    public static void b(String str, a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("map size of put is before: ");
        Map map = f811a;
        sb.append(map.size());
        Logger.v("RequestUtil", sb.toString());
        map.put(str, aVar);
        Logger.v("RequestUtil", "map size of put is after: " + map.size());
    }
}
