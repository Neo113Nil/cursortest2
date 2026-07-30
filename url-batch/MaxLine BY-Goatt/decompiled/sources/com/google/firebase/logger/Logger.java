package com.google.firebase.logger;

import android.util.Log;
import defpackage.a;
import defpackage.ch2;
import defpackage.fi0;
import defpackage.j8;
import defpackage.q40;
import defpackage.up2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class Logger {
    public static final Companion Companion = new Companion(null);
    private static final ConcurrentHashMap<String, Logger> loggers = new ConcurrentHashMap<>();
    private boolean enabled;
    private Level minLevel;
    private final String tag;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class AndroidLogger extends Logger {

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Level.values().length];
                try {
                    iArr[Level.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Level.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Level.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Level.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Level.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidLogger(String str, boolean z, Level level) {
            super(str, z, level, null);
            str.getClass();
            level.getClass();
        }

        @Override // com.google.firebase.logger.Logger
        public int log(Level level, String str, Object[] objArr, Throwable th) {
            level.getClass();
            str.getClass();
            objArr.getClass();
            if (objArr.length != 0) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            }
            int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i == 1) {
                String tag = getTag();
                return th != null ? Log.v(tag, str, th) : Log.v(tag, str);
            }
            if (i == 2) {
                String tag2 = getTag();
                return th != null ? Log.d(tag2, str, th) : Log.d(tag2, str);
            }
            if (i == 3) {
                String tag3 = getTag();
                return th != null ? Log.i(tag3, str, th) : Log.i(tag3, str);
            }
            if (i == 4) {
                String tag4 = getTag();
                return th != null ? Log.w(tag4, str, th) : Log.w(tag4, str);
            }
            if (i == 5) {
                String tag5 = getTag();
                return th != null ? Log.e(tag5, str, th) : Log.e(tag5, str);
            }
            a.b();
            return 0;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class FakeLogger extends Logger {
        private final List<String> record;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(String str, boolean z, Level level) {
            super(str, z, level, null);
            str.getClass();
            level.getClass();
            this.record = new ArrayList();
        }

        private final String toLogMessage(Level level, String str, Object[] objArr, Throwable th) {
            StringBuilder sb;
            if (objArr.length != 0) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            }
            if (th != null) {
                sb = new StringBuilder();
                sb.append(level);
                sb.append(' ');
                sb.append(str);
                sb.append(' ');
                sb.append(Log.getStackTraceString(th));
            } else {
                sb = new StringBuilder();
                sb.append(level);
                sb.append(' ');
                sb.append(str);
            }
            return sb.toString();
        }

        public final void clearLogMessages() {
            this.record.clear();
        }

        public final boolean hasLogMessage(String str) {
            str.getClass();
            List<String> list = this.record;
            if (list != null && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (up2.q((String) it.next(), str)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean hasLogMessageThat(Function1<? super String, Boolean> function1) {
            function1.getClass();
            List<String> list = this.record;
            if (list != null && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) function1.invoke(it.next())).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.firebase.logger.Logger
        public int log(Level level, String str, Object[] objArr, Throwable th) {
            level.getClass();
            str.getClass();
            objArr.getClass();
            String logMessage = toLogMessage(level, str, objArr, th);
            System.out.println((Object) q40.l("Log: ", logMessage));
            this.record.add(logMessage);
            return logMessage.length();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Level {
        private static final /* synthetic */ fi0 $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        private final int priority;
        public static final Level VERBOSE = new Level("VERBOSE", 0, 2);
        public static final Level DEBUG = new Level("DEBUG", 1, 3);
        public static final Level INFO = new Level("INFO", 2, 4);
        public static final Level WARN = new Level("WARN", 3, 5);
        public static final Level ERROR = new Level("ERROR", 4, 6);

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{VERBOSE, DEBUG, INFO, WARN, ERROR};
        }

        static {
            Level[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j8.x($values);
        }

        private Level(String str, int i, int i2) {
            this.priority = i2;
        }

        public static fi0 getEntries() {
            return $ENTRIES;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }

        public final int getPriority$com_google_firebase_firebase_common() {
            return this.priority;
        }
    }

    private Logger(String str, boolean z, Level level) {
        this.tag = str;
        this.enabled = z;
        this.minLevel = level;
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            ch2.h("Super calls with default arguments not supported in this target, function: debug");
            return 0;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.debug(str, objArr, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            ch2.h("Super calls with default arguments not supported in this target, function: error");
            return 0;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.error(str, objArr, th);
    }

    public static final Logger getLogger(String str, boolean z, Level level) {
        return Companion.getLogger(str, z, level);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            ch2.h("Super calls with default arguments not supported in this target, function: info");
            return 0;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.info(str, objArr, th);
    }

    private final int logIfAble(Level level, String str, Object[] objArr, Throwable th) {
        if (!this.enabled) {
            return 0;
        }
        if (this.minLevel.getPriority$com_google_firebase_firebase_common() <= level.getPriority$com_google_firebase_firebase_common() || Log.isLoggable(this.tag, level.getPriority$com_google_firebase_firebase_common())) {
            return log(level, str, objArr, th);
        }
        return 0;
    }

    public static /* synthetic */ int logIfAble$default(Logger logger, Level level, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            ch2.h("Super calls with default arguments not supported in this target, function: logIfAble");
            return 0;
        }
        if ((i & 4) != 0) {
            objArr = new Object[0];
        }
        return logger.logIfAble(level, str, objArr, th);
    }

    public static final FakeLogger setupFakeLogger(String str, boolean z, Level level) {
        return Companion.setupFakeLogger(str, z, level);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            ch2.h("Super calls with default arguments not supported in this target, function: verbose");
            return 0;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.verbose(str, objArr, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            ch2.h("Super calls with default arguments not supported in this target, function: warn");
            return 0;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.warn(str, objArr, th);
    }

    public final int debug(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        return debug$default(this, str, objArr, null, 4, null);
    }

    public final int error(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        return error$default(this, str, objArr, null, 4, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Level getMinLevel() {
        return this.minLevel;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int info(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        return info$default(this, str, objArr, null, 4, null);
    }

    public abstract int log(Level level, String str, Object[] objArr, Throwable th);

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setMinLevel(Level level) {
        level.getClass();
        this.minLevel = level;
    }

    public final int verbose(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        return verbose$default(this, str, objArr, null, 4, null);
    }

    public final int warn(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        return warn$default(this, str, objArr, null, 4, null);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Logger getLogger$default(Companion companion, String str, boolean z, Level level, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                level = Level.INFO;
            }
            return companion.getLogger(str, z, level);
        }

        public static /* synthetic */ FakeLogger setupFakeLogger$default(Companion companion, String str, boolean z, Level level, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                level = Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z, level);
        }

        public final Logger getLogger(String str, boolean z, Level level) {
            Object putIfAbsent;
            str.getClass();
            level.getClass();
            ConcurrentHashMap concurrentHashMap = Logger.loggers;
            Object obj = concurrentHashMap.get(str);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new AndroidLogger(str, z, level)))) != null) {
                obj = putIfAbsent;
            }
            return (Logger) obj;
        }

        public final FakeLogger setupFakeLogger(String str, boolean z, Level level) {
            str.getClass();
            level.getClass();
            FakeLogger fakeLogger = new FakeLogger(str, z, level);
            Logger.loggers.put(str, fakeLogger);
            return fakeLogger;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Logger(String str, boolean z, Level level, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, level);
    }

    public final int debug(String str) {
        str.getClass();
        return debug$default(this, str, null, 2, null);
    }

    public final int error(String str) {
        str.getClass();
        return error$default(this, str, null, 2, null);
    }

    public final int info(String str) {
        str.getClass();
        return info$default(this, str, null, 2, null);
    }

    public final int verbose(String str) {
        str.getClass();
        return verbose$default(this, str, null, 2, null);
    }

    public final int warn(String str) {
        str.getClass();
        return warn$default(this, str, null, 2, null);
    }

    public final int debug(String str, Object[] objArr, Throwable th) {
        str.getClass();
        objArr.getClass();
        return logIfAble(Level.DEBUG, str, objArr, th);
    }

    public final int error(String str, Object[] objArr, Throwable th) {
        str.getClass();
        objArr.getClass();
        return logIfAble(Level.ERROR, str, objArr, th);
    }

    public final int info(String str, Object[] objArr, Throwable th) {
        str.getClass();
        objArr.getClass();
        return logIfAble(Level.INFO, str, objArr, th);
    }

    public final int verbose(String str, Object[] objArr, Throwable th) {
        str.getClass();
        objArr.getClass();
        return logIfAble(Level.VERBOSE, str, objArr, th);
    }

    public final int warn(String str, Object[] objArr, Throwable th) {
        str.getClass();
        objArr.getClass();
        return logIfAble(Level.WARN, str, objArr, th);
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            ch2.h("Super calls with default arguments not supported in this target, function: debug");
            return 0;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.debug(str, th);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            ch2.h("Super calls with default arguments not supported in this target, function: error");
            return 0;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.error(str, th);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            ch2.h("Super calls with default arguments not supported in this target, function: info");
            return 0;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.info(str, th);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            ch2.h("Super calls with default arguments not supported in this target, function: verbose");
            return 0;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.verbose(str, th);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            ch2.h("Super calls with default arguments not supported in this target, function: warn");
            return 0;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.warn(str, th);
    }

    public final int debug(String str, Throwable th) {
        str.getClass();
        return logIfAble$default(this, Level.DEBUG, str, null, th, 4, null);
    }

    public final int error(String str, Throwable th) {
        str.getClass();
        return logIfAble$default(this, Level.ERROR, str, null, th, 4, null);
    }

    public final int info(String str, Throwable th) {
        str.getClass();
        return logIfAble$default(this, Level.INFO, str, null, th, 4, null);
    }

    public final int verbose(String str, Throwable th) {
        str.getClass();
        return logIfAble$default(this, Level.VERBOSE, str, null, th, 4, null);
    }

    public final int warn(String str, Throwable th) {
        str.getClass();
        return logIfAble$default(this, Level.WARN, str, null, th, 4, null);
    }
}
