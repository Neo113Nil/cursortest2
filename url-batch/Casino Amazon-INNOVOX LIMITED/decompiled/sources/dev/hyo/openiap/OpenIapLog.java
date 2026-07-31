package dev.hyo.openiap;

import android.util.Log;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenIapLog.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001'B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J*\u0010\u0016\u001a\u00020\u000e2\"\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bJ\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\bJ\u0006\u0010\u001a\u001a\u00020\bJ\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\bJ\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\bJ\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\bJ$\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0019\u001a\u00020\bJ\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\bJ\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\bJ$\u0010$\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0019\u001a\u00020\bJ.\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"Ldev/hyo/openiap/OpenIapLog;", "", "<init>", "()V", ViewProps.ENABLED, "Ljava/util/concurrent/atomic/AtomicBoolean;", "defaultTagRef", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "handler", "Lkotlin/Function3;", "Ldev/hyo/openiap/OpenIapLog$Level;", "", "", "value", "", "isEnabled", "()Z", "setEnabled", "(Z)V", "enable", "setHandler", NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM, "setDefaultTag", "tag", "defaultTag", "debug", "message", "info", "warn", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "tr", "d", "i", "w", "e", "log", "level", "Level", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OpenIapLog {
    private static volatile Function3<? super Level, ? super String, ? super Throwable, Unit> handler;
    public static final OpenIapLog INSTANCE = new OpenIapLog();
    private static final AtomicBoolean enabled = new AtomicBoolean(false);
    private static final AtomicReference<String> defaultTagRef = new AtomicReference<>("OpenIAP");
    public static final int $stable = 8;

    /* compiled from: OpenIapLog.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Level.values().length];
            try {
                iArr[Level.Debug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Level.Info.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Level.Warn.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Level.Error.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OpenIapLog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/OpenIapLog$Level;", "", "<init>", "(Ljava/lang/String;I)V", "Debug", "Info", "Warn", "Error", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Level {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level Debug = new Level("Debug", 0);
        public static final Level Info = new Level("Info", 1);
        public static final Level Warn = new Level("Warn", 2);
        public static final Level Error = new Level("Error", 3);

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{Debug, Info, Warn, Error};
        }

        public static EnumEntries<Level> getEntries() {
            return $ENTRIES;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }

        static {
            Level[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Level(String str, int i) {
        }
    }

    private OpenIapLog() {
    }

    public final boolean isEnabled() {
        return enabled.get();
    }

    public final void setEnabled(boolean z) {
        enabled.set(z);
    }

    public final void enable(boolean value) {
        setEnabled(value);
    }

    public final void setHandler(Function3<? super Level, ? super String, ? super Throwable, Unit> custom) {
        handler = custom;
    }

    public final void setDefaultTag(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        defaultTagRef.set(tag);
    }

    public final String defaultTag() {
        String str = defaultTagRef.get();
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        return str;
    }

    public static /* synthetic */ void debug$default(OpenIapLog openIapLog, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = openIapLog.defaultTag();
        }
        openIapLog.debug(str, str2);
    }

    public final void debug(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(Level.Debug, message, null, tag);
    }

    public static /* synthetic */ void info$default(OpenIapLog openIapLog, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = openIapLog.defaultTag();
        }
        openIapLog.info(str, str2);
    }

    public final void info(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(Level.Info, message, null, tag);
    }

    public static /* synthetic */ void warn$default(OpenIapLog openIapLog, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = openIapLog.defaultTag();
        }
        openIapLog.warn(str, str2);
    }

    public final void warn(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(Level.Warn, message, null, tag);
    }

    public static /* synthetic */ void error$default(OpenIapLog openIapLog, String str, Throwable th, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            str2 = openIapLog.defaultTag();
        }
        openIapLog.error(str, th, str2);
    }

    public final void error(String message, Throwable tr, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        log(Level.Error, message, tr, tag);
    }

    public static /* synthetic */ void d$default(OpenIapLog openIapLog, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = openIapLog.defaultTag();
        }
        openIapLog.d(str, str2);
    }

    public final void d(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        debug(message, tag);
    }

    public static /* synthetic */ void i$default(OpenIapLog openIapLog, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = openIapLog.defaultTag();
        }
        openIapLog.i(str, str2);
    }

    public final void i(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        info(message, tag);
    }

    public static /* synthetic */ void w$default(OpenIapLog openIapLog, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = openIapLog.defaultTag();
        }
        openIapLog.w(str, str2);
    }

    public final void w(String message, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        warn(message, tag);
    }

    public static /* synthetic */ void e$default(OpenIapLog openIapLog, String str, Throwable th, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            str2 = openIapLog.defaultTag();
        }
        openIapLog.e(str, th, str2);
    }

    public final void e(String message, Throwable tr, String tag) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        error(message, tr, tag);
    }

    static /* synthetic */ void log$default(OpenIapLog openIapLog, Level level, String str, Throwable th, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        if ((i & 8) != 0) {
            str2 = openIapLog.defaultTag();
        }
        openIapLog.log(level, str, th, str2);
    }

    private final void log(Level level, String message, Throwable tr, String tag) {
        if (isEnabled()) {
            Function3<? super Level, ? super String, ? super Throwable, Unit> function3 = handler;
            if (function3 != null) {
                function3.invoke(level, message, tr);
                return;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i == 1) {
                Log.d(tag, message);
                return;
            }
            if (i == 2) {
                Log.i(tag, message);
            } else if (i == 3) {
                Log.w(tag, message);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                Log.e(tag, message, tr);
            }
        }
    }
}
