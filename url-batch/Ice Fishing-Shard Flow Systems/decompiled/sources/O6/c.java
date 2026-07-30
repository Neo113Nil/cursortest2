package O6;

import D6.w;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.t;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f1933a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1934b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = w.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(w.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(K6.h.class.getName(), "okhttp.Http2");
        linkedHashMap.put(G6.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f1934b = I.i(linkedHashMap);
    }

    public static void a(String loggerName, int i2, String message, Throwable th) {
        int min;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = (String) f1934b.get(loggerName);
        if (str == null) {
            str = t.s(23, loggerName);
        }
        if (Log.isLoggable(str, i2)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            int length = message.length();
            int i5 = 0;
            while (i5 < length) {
                int x7 = StringsKt.x(message, '\n', i5, 4);
                if (x7 == -1) {
                    x7 = length;
                }
                while (true) {
                    min = Math.min(x7, i5 + 4000);
                    String substring = message.substring(i5, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    Log.println(i2, str, substring);
                    if (min >= x7) {
                        break;
                    } else {
                        i5 = min;
                    }
                }
                i5 = min + 1;
            }
        }
    }
}
