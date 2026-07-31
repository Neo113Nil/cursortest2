package i6;

import X5.s;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import l5.t;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f4434a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f4435b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = s.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(s.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(e6.h.class.getName(), "okhttp.Http2");
        linkedHashMap.put(a6.e.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f4435b = t.u0(linkedHashMap);
    }

    public static void a(String str, int i7, String str2, Throwable th) {
        int min;
        String str3 = (String) f4435b.get(str);
        if (str3 == null) {
            str3 = F5.j.f0(str, 23);
        }
        if (Log.isLoggable(str3, i7)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i8 = 0;
            while (i8 < length) {
                int Q6 = F5.j.Q(str2, '\n', i8, 4);
                if (Q6 == -1) {
                    Q6 = length;
                }
                while (true) {
                    min = Math.min(Q6, i8 + 4000);
                    String substring = str2.substring(i8, min);
                    kotlin.jvm.internal.i.d(substring, "substring(...)");
                    Log.println(i7, str3, substring);
                    if (min >= Q6) {
                        break;
                    } else {
                        i8 = min;
                    }
                }
                i8 = min + 1;
            }
        }
    }
}
