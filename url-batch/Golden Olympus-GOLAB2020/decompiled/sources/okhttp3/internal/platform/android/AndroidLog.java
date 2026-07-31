package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

@SuppressSignatureCheck
@Metadata
/* loaded from: classes3.dex */
public final class AndroidLog {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidLog f43127a = new AndroidLog();

    /* renamed from: b, reason: collision with root package name */
    private static final CopyOnWriteArraySet f43128b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    private static final Map f43129c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = OkHttpClient.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = OkHttpClient.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = Http2.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = TaskRunner.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f43129c = MapsKt.toMap(linkedHashMap);
    }

    private AndroidLog() {
    }

    private final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f43128b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(AndroidLogHandler.f43130a);
        }
    }

    private final String d(String str) {
        String str2 = (String) f43129c.get(str);
        return str2 == null ? StringsKt.i1(str, 23) : str2;
    }

    public final void a(String loggerName, int i4, String message, Throwable th) {
        int min;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String d4 = d(loggerName);
        if (Log.isLoggable(d4, i4)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            String str = message;
            int length = str.length();
            int i5 = 0;
            while (i5 < length) {
                int b02 = StringsKt.b0(str, '\n', i5, false, 4, null);
                if (b02 == -1) {
                    b02 = length;
                }
                while (true) {
                    min = Math.min(b02, i5 + 4000);
                    String substring = str.substring(i5, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i4, d4, substring);
                    if (min >= b02) {
                        break;
                    } else {
                        i5 = min;
                    }
                }
                i5 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : f43129c.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
