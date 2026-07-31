package com.my.tracker.obfuscated;

/* renamed from: com.my.tracker.obfuscated.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1684s2 {
    public static boolean a(C1680r2 c1680r2) {
        InterfaceC1633f2 a4 = c1680r2.a();
        if (a4 != null && a4.b() > 0) {
            return true;
        }
        InterfaceC1633f2[] d4 = c1680r2.d();
        if (d4 != null && d4.length > 0) {
            return true;
        }
        InterfaceC1697w[] b4 = c1680r2.b();
        return b4 != null && b4.length > 0;
    }

    private static boolean b(C1680r2 c1680r2) {
        InterfaceC1633f2 a4 = c1680r2.a();
        if (a4 == null) {
            return true;
        }
        return !(((a4.c() > 0L ? 1 : (a4.c() == 0L ? 0 : -1)) > 0) && (c1680r2.d() == null || c1680r2.d().length == 0)) && a4.a() == 0;
    }

    public static boolean c(C1680r2 c1680r2) {
        if (a(c1680r2.c())) {
            return b(c1680r2);
        }
        return false;
    }

    private static boolean a(long j4) {
        if (j4 > 0) {
            return true;
        }
        AbstractC1708y2.a("TimeSpentTickDtoValidator: dto timestamp should be > 0, actual = " + j4);
        return false;
    }
}
