package com.crrepa.n1;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f13428a = a();

    private e() {
    }

    private static int a() {
        return b(System.getProperty("java.version"));
    }

    public static int b() {
        return f13428a;
    }

    private static int c(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int a(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i8 = 0; i8 < str.length(); i8++) {
                char charAt = str.charAt(i8);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    static int b(String str) {
        int c8 = c(str);
        if (c8 == -1) {
            c8 = a(str);
        }
        if (c8 == -1) {
            return 6;
        }
        return c8;
    }

    public static boolean c() {
        return f13428a >= 9;
    }
}
