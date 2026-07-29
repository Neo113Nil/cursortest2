package org.apache.a.c.e;

import java.util.regex.Pattern;

/* compiled from: InetAddressUtils.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f9690a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f9691b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f9692c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    public static boolean a(String str) {
        return f9690a.matcher(str).matches();
    }

    public static boolean b(String str) {
        return f9691b.matcher(str).matches();
    }

    public static boolean c(String str) {
        return f9692c.matcher(str).matches();
    }

    public static boolean d(String str) {
        return b(str) || c(str);
    }
}
