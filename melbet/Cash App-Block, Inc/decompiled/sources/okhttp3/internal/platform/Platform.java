package okhttp3.internal.platform;

import java.util.Map;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;
import okhttp3.internal.platform.android.AndroidLog;

/* loaded from: classes3.dex */
public abstract class Platform {
    public static final Logger logger;
    public static volatile Android10Platform platform;

    static {
        try {
            for (Map.Entry entry : AndroidLog.knownLoggers.entrySet()) {
                AndroidLog.enableLogging((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        platform = new Android10Platform();
        logger = Logger.getLogger(OkHttpClient.class.getName());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
