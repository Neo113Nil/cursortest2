package okhttp3.internal.platform.android;

import android.util.Log;
import com.miteksystems.misnap.workflow.util.TextUtil;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes3.dex */
public final class AndroidLogHandler extends Handler {
    public static final AndroidLogHandler INSTANCE = new AndroidLogHandler();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = AndroidLog.configuredLoggers;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int access$getAndroidLevel = TextUtil.access$getAndroidLevel(logRecord);
        String message = logRecord.getMessage();
        message.getClass();
        Throwable thrown = logRecord.getThrown();
        String str = (String) AndroidLog.knownLoggers.get(loggerName);
        if (str == null) {
            str = StringsKt___StringsKt.take(23, loggerName);
        }
        if (Log.isLoggable(str, access$getAndroidLevel)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i = 0;
            while (i < length) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) message, '\n', i, false, 4);
                if (indexOf$default == -1) {
                    indexOf$default = length;
                }
                while (true) {
                    min = Math.min(indexOf$default, i + 4000);
                    Log.println(access$getAndroidLevel, str, message.substring(i, min));
                    if (min >= indexOf$default) {
                        break;
                    } else {
                        i = min;
                    }
                }
                i = min + 1;
            }
        }
    }
}
