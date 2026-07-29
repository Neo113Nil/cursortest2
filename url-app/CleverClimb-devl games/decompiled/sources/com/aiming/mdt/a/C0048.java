package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʻʼʾˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0048 {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static long f91 = 7176593036023323497L;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private static int f92 = 1;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private static int f93;

    /* renamed from: ʻ, reason: contains not printable characters */
    private String f94;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private String f95;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private int f96;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f97;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String m141(String str) {
        char[] charArray;
        int i = f93 + 57;
        f92 = i % 128;
        if (i % 2 == 0) {
            charArray = str.toCharArray();
            Object obj = null;
            super.hashCode();
        } else {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        char c2 = cArr[0];
        char[] cArr2 = new char[cArr.length - 1];
        int i2 = 1;
        while (true) {
            if (i2 >= cArr.length) {
                return new String(cArr2);
            }
            int i3 = f92 + 119;
            f93 = i3 % 128;
            int i4 = i3 % 2;
            cArr2[i2 - 1] = (char) ((cArr[i2] ^ (i2 * c2)) ^ f91);
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m141("ᘥ䴥睇\u193c").intern());
        sb.append(this.f96);
        sb.append(m141("\ue77f밺").intern());
        sb.append(m141("᫉䇄溔ୟ〬\udeedﮱ\ue02c").intern());
        sb.append(this.f94);
        sb.append(m141("\ue77f밺").intern());
        sb.append(m141("Ά䒠摺п◠얶\ue531").intern());
        sb.append(this.f95);
        sb.append(m141("\ue77f밺").intern());
        sb.append(m141("螻\udcb5呭찷䗰ﶾ由").intern());
        sb.append(this.f97);
        String obj = sb.toString();
        int i = f92 + 121;
        f93 = i % 128;
        if ((i % 2 != 0 ? 'Z' : '\t') == '\t') {
            return obj;
        }
        Object obj2 = null;
        super.hashCode();
        return obj;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final String m142() {
        int i = f93 + 95;
        f92 = i % 128;
        if (i % 2 != 0) {
            return this.f94;
        }
        String str = this.f94;
        Object obj = null;
        super.hashCode();
        return str;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m143(String str) {
        int i = f92 + 99;
        f93 = i % 128;
        int i2 = i % 2;
        this.f94 = str;
        int i3 = f93 + 117;
        f92 = i3 % 128;
        if ((i3 % 2 == 0 ? '?' : '\\') != '\\') {
            Object obj = null;
            super.hashCode();
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final String m144() {
        int i = f93 + 85;
        f92 = i % 128;
        int i2 = i % 2;
        String str = this.f95;
        int i3 = f93 + 33;
        f92 = i3 % 128;
        if (i3 % 2 == 0) {
        }
        return str;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m145(int i) {
        int i2 = f93 + 59;
        f92 = i2 % 128;
        int i3 = i2 % 2;
        this.f97 = i;
        int i4 = f93 + 21;
        f92 = i4 % 128;
        if ((i4 % 2 == 0 ? '\'' : '4') != '4') {
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final int m146() {
        int i = f92 + 45;
        f93 = i % 128;
        int i2 = i % 2;
        int i3 = this.f97;
        int i4 = f92 + 91;
        f93 = i4 % 128;
        if ((i4 % 2 != 0 ? 'H' : 'L') != 'H') {
            return i3;
        }
        Object obj = null;
        super.hashCode();
        return i3;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m147(int i) {
        int i2 = f92 + 55;
        f93 = i2 % 128;
        if ((i2 % 2 != 0 ? '<' : '9') != '<') {
            this.f96 = i;
        } else {
            this.f96 = i;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m148(String str) {
        int i = f93 + 31;
        f92 = i % 128;
        if ((i % 2 == 0 ? 'b' : 'S') != 'b') {
            this.f95 = str;
        } else {
            this.f95 = str;
        }
    }
}
