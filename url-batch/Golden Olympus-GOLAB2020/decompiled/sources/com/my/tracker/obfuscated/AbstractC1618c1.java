package com.my.tracker.obfuscated;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1618c1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Integer f21160a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f21161b = new AtomicBoolean();

    static boolean a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused) {
            AbstractC1708y2.b("LoggingHandler: case 0 failure");
        }
        try {
            if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused2) {
            AbstractC1708y2.b("LoggingHandler: case 1 failure");
        }
        try {
            return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));
        } catch (Throwable unused3) {
            AbstractC1708y2.b("LoggingHandler: case 2 failure");
            return false;
        }
    }

    static boolean b(Context context) {
        if (String.valueOf(f21160a).equals(AbstractC1624d2.a(String.format("%s_mytracker_debug", context.getPackageName())))) {
            AbstractC1708y2.a("LoggingHandler: debug data in SystemProperties has been found");
            return true;
        }
        AbstractC1708y2.a("LoggingHandler: no debug data in SystemProperties");
        return false;
    }

    public static void c(final Context context) {
        if (!f21161b.compareAndSet(false, true)) {
            AbstractC1708y2.a("LoggingHandler: instance has already been initialized");
        } else if (AbstractC1708y2.a()) {
            AbstractC1708y2.a("LoggingHandler: tracing has already been enabled");
        } else {
            AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.G
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1618c1.d(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Context context) {
        String str;
        if (a(context)) {
            AbstractC1708y2.a(true);
            str = "LoggingHandler: debug mode is enabled by device name";
        } else {
            if (f21160a.equals((Integer) AbstractC1624d2.a(context, "com.my.tracker.debugMode", Integer.class))) {
                AbstractC1708y2.a(true);
                str = "LoggingHandler: debug mode is enabled by manifest metadata";
            } else {
                if (!b(context)) {
                    return;
                }
                AbstractC1708y2.a(true);
                str = "LoggingHandler: debug mode is enabled by system properties";
            }
        }
        AbstractC1708y2.a(str);
    }
}
