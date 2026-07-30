package com.facebook.internal;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import defpackage.tp2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Logger {
    public static final String LOG_TAG_BASE = "FacebookSDK.";
    private final LoggingBehavior behavior;
    private StringBuilder contents;
    private int priority;
    private final String tag;
    public static final Companion Companion = new Companion(null);
    private static final HashMap<String, String> stringsToReplace = new HashMap<>();

    public Logger(LoggingBehavior loggingBehavior, String str) {
        loggingBehavior.getClass();
        str.getClass();
        this.priority = 3;
        this.behavior = loggingBehavior;
        this.tag = LOG_TAG_BASE + Validate.notNullOrEmpty(str, "tag");
        this.contents = new StringBuilder();
    }

    public static final synchronized void registerAccessToken(String str) {
        synchronized (Logger.class) {
            Companion.registerAccessToken(str);
        }
    }

    public static final synchronized void registerStringToReplace(String str, String str2) {
        synchronized (Logger.class) {
            Companion.registerStringToReplace(str, str2);
        }
    }

    private final boolean shouldLog() {
        return FacebookSdk.isLoggingBehaviorEnabled(this.behavior);
    }

    public final void append(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        if (shouldLog()) {
            StringBuilder sb = this.contents;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            sb.append(String.format(str, Arrays.copyOf(copyOf, copyOf.length)));
        }
    }

    public final void appendKeyValue(String str, Object obj) {
        str.getClass();
        obj.getClass();
        append("  %s:\t%s\n", str, obj);
    }

    public final String getContents() {
        return Companion.replaceStrings(this.contents.toString());
    }

    public final int getPriority() {
        return this.priority;
    }

    public final void log() {
        logString(this.contents.toString());
        this.contents = new StringBuilder();
    }

    public final void logString(String str) {
        str.getClass();
        Companion.log(this.behavior, this.priority, this.tag, str);
    }

    public final void setPriority(int i) {
        Validate.oneOf(Integer.valueOf(i), "value", 7, 3, 6, 4, 2, 5);
        setPriority(i);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized String replaceStrings(String str) {
            for (Map.Entry entry : Logger.stringsToReplace.entrySet()) {
                str = tp2.m(str, (String) entry.getKey(), (String) entry.getValue());
            }
            return str;
        }

        public final void log(LoggingBehavior loggingBehavior, int i, String str, String str2) {
            loggingBehavior.getClass();
            str.getClass();
            str2.getClass();
            if (FacebookSdk.isLoggingBehaviorEnabled(loggingBehavior)) {
                String replaceStrings = replaceStrings(str2);
                if (!tp2.o(str, Logger.LOG_TAG_BASE, false)) {
                    str = Logger.LOG_TAG_BASE.concat(str);
                }
                Log.println(i, str, replaceStrings);
                if (loggingBehavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final synchronized void registerAccessToken(String str) {
            str.getClass();
            if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                registerStringToReplace(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void registerStringToReplace(String str, String str2) {
            str.getClass();
            str2.getClass();
            Logger.stringsToReplace.put(str, str2);
        }

        private Companion() {
        }

        public final void log(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
            loggingBehavior.getClass();
            str.getClass();
            str2.getClass();
            objArr.getClass();
            if (FacebookSdk.isLoggingBehaviorEnabled(loggingBehavior)) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                log(loggingBehavior, 3, str, String.format(str2, Arrays.copyOf(copyOf, copyOf.length)));
            }
        }

        public final void log(LoggingBehavior loggingBehavior, int i, String str, String str2, Object... objArr) {
            loggingBehavior.getClass();
            str.getClass();
            str2.getClass();
            objArr.getClass();
            if (FacebookSdk.isLoggingBehaviorEnabled(loggingBehavior)) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                log(loggingBehavior, i, str, String.format(str2, Arrays.copyOf(copyOf, copyOf.length)));
            }
        }

        public final void log(LoggingBehavior loggingBehavior, String str, String str2) {
            loggingBehavior.getClass();
            str.getClass();
            str2.getClass();
            log(loggingBehavior, 3, str, str2);
        }
    }

    public static final void log(LoggingBehavior loggingBehavior, int i, String str, String str2, Object... objArr) {
        Companion.log(loggingBehavior, i, str, str2, objArr);
    }

    public static final void log(LoggingBehavior loggingBehavior, String str, String str2) {
        Companion.log(loggingBehavior, str, str2);
    }

    public static final void log(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
        Companion.log(loggingBehavior, str, str2, objArr);
    }

    public static final void log(LoggingBehavior loggingBehavior, int i, String str, String str2) {
        Companion.log(loggingBehavior, i, str, str2);
    }

    public final void append(String str) {
        str.getClass();
        if (shouldLog()) {
            this.contents.append(str);
        }
    }

    public final void append(StringBuilder sb) {
        sb.getClass();
        if (shouldLog()) {
            this.contents.append((CharSequence) sb);
        }
    }
}
