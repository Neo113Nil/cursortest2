package com.google.gson.d;

/* compiled from: VersionUtils.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6508a = c();

    private static int c() {
        String[] split = System.getProperty("java.version").split("[._]");
        int parseInt = Integer.parseInt(split[0]);
        return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
    }

    public static int a() {
        return f6508a;
    }

    public static boolean b() {
        return f6508a >= 9;
    }
}
