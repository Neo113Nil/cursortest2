package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class g4 {
    public static final CopyOnWriteArraySet PxuCJdSBwIXG = new CopyOnWriteArraySet();
    public static final Map lS5Rgt96tfkO;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = if1.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(if1.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(zk0.class.getName(), "okhttp.Http2");
        linkedHashMap.put(be2.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        lS5Rgt96tfkO = w41.wLFCmsViZrNT(linkedHashMap);
    }

    public static void PxuCJdSBwIXG(String str, int i, String str2, Throwable th) {
        int min;
        String str3 = (String) lS5Rgt96tfkO.get(str);
        if (str3 == null) {
            str3 = ia2.JLGWdXyAxbxj(str, 23);
        }
        if (Log.isLoggable(str3, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int rxipThha848g = ia2.rxipThha848g(str2, '\n', i2, 4);
                if (rxipThha848g == -1) {
                    rxipThha848g = length;
                }
                while (true) {
                    min = Math.min(rxipThha848g, i2 + 4000);
                    Log.println(i, str3, str2.substring(i2, min));
                    if (min >= rxipThha848g) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
            }
        }
    }

    public static void lS5Rgt96tfkO(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (PxuCJdSBwIXG.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(h4.PxuCJdSBwIXG);
        }
    }
}
