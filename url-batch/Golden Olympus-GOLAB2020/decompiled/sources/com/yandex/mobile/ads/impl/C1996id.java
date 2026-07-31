package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.id, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1996id {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final CopyOnWriteArraySet<Logger> f27154a = new CopyOnWriteArraySet<>();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<String, String> f27155b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f27156c = 0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = td1.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = td1.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = mg0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = a42.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttplib.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f27155b = MapsKt.toMap(linkedHashMap);
    }

    public static void a(@NotNull String loggerName, int i4, @NotNull String message, @Nullable Throwable th) {
        int min;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = f27155b.get(loggerName);
        if (str == null) {
            str = StringsKt.i1(loggerName, 23);
        }
        if (Log.isLoggable(str, i4)) {
            if (th != null) {
                message = message + "\n" + Log.getStackTraceString(th);
            }
            String str2 = message;
            int length = str2.length();
            int i5 = 0;
            while (i5 < length) {
                int b02 = StringsKt.b0(str2, '\n', i5, false, 4, null);
                if (b02 == -1) {
                    b02 = length;
                }
                while (true) {
                    min = Math.min(b02, i5 + 4000);
                    String substring = str2.substring(i5, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    Log.println(i4, str, substring);
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

    public static void a() {
        Level level;
        for (Map.Entry<String, String> entry : f27155b.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Logger logger = Logger.getLogger(key);
            if (f27154a.add(logger)) {
                logger.setUseParentHandlers(false);
                if (Log.isLoggable(value, 3)) {
                    level = Level.FINE;
                } else {
                    level = Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING;
                }
                logger.setLevel(level);
                logger.addHandler(C2019jd.f27635a);
            }
        }
    }
}
