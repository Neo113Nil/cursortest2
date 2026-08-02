package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hmu {
    private static String a = "hnd";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "hnq";
    private static final String[] d = {"hnd", "com.google.common.flogger.backend.google.GooglePlatform", "hnq"};

    public static int a() {
        return hoo.a().a;
    }

    public static long b() {
        return hms.a.c();
    }

    public static hlw d(String str) {
        return hms.a.e(str);
    }

    public static hma f() {
        return i().bR();
    }

    public static hmt g() {
        return hms.a.h();
    }

    public static hnu i() {
        return hms.a.j();
    }

    public static hob k() {
        return i().b();
    }

    public static String l() {
        return hms.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().c(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract hlw e(String str);

    protected abstract hmt h();

    protected hnu j() {
        return hnw.a;
    }

    protected abstract String m();
}
