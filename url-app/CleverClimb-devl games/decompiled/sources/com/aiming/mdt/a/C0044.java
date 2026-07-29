package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʻʼʾʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0044 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f74 = 1;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int f75 = 0;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static long f76 = 3131258245865755452L;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m104() {
        int i = f74 + 45;
        f75 = i % 128;
        if (i % 2 != 0) {
        }
        m105("\uf651茮\uf630큱퓫꣮狴").intern();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static String m105(String str) {
        int i = f74 + 77;
        f75 = i % 128;
        int i2 = i % 2;
        int i3 = f74 + 19;
        f75 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        char[] m724 = C0192.m724(f76, str.toCharArray());
        int i4 = 4;
        while (i4 < m724.length) {
            m724[i4] = (char) ((m724[i4] ^ m724[i4 % 4]) ^ ((i4 - 4) * f76));
            i4++;
            int i5 = f74 + 115;
            f75 = i5 % 128;
            int i6 = i5 % 2;
        }
        return new String(m724, 4, m724.length - 4);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static void m106() {
        int i = f75 + 35;
        f74 = i % 128;
        if (!(i % 2 != 0)) {
            m105("\uf482籾\uf4e3⼡神₊将\ud904").intern();
            Object obj = null;
            super.hashCode();
        } else {
            m105("\uf482籾\uf4e3⼡神₊将\ud904").intern();
        }
        int i2 = f74 + 95;
        f75 = i2 % 128;
        if (!(i2 % 2 != 0)) {
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static void m107() {
        int i = f74 + 23;
        f75 = i % 128;
        int i2 = i % 2;
        m105("\uf651茮\uf630큱퓫꣮狴").intern();
        int i3 = f75 + 77;
        f74 = i3 % 128;
        if ((i3 % 2 == 0 ? 'L' : ';') != 'L') {
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m108() {
        int i = f74 + 59;
        f75 = i % 128;
        int i2 = i % 2;
        m105("\uf651茮\uf630큱퓫꣮狴").intern();
        int i3 = f75 + 101;
        f74 = i3 % 128;
        if ((i3 % 2 == 0 ? '_' : 'a') != '_') {
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m109() {
        int i = f74 + 97;
        f75 = i % 128;
        if (i % 2 != 0) {
        }
        m105("\uf651茮\uf630큱퓫꣮狴").intern();
    }
}
