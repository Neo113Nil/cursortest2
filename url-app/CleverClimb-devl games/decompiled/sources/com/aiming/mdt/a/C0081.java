package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʻʽˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0081 {

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private static int f199 = 0;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private static int f200 = 1;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private static int f201;

    /* renamed from: ʻ, reason: contains not printable characters */
    private String f202;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private String f203;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private String f204;

    /* renamed from: ʼ, reason: contains not printable characters */
    private String f205;

    /* renamed from: ʽ, reason: contains not printable characters */
    private long f206;

    /* renamed from: ʾ, reason: contains not printable characters */
    private String f207;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static String m248(String str, boolean z, int i, int i2, int i3) {
        char[] cArr;
        char[] charArray = str.toCharArray();
        char[] cArr2 = new char[i2];
        int i4 = 0;
        while (true) {
            if ((i4 < i2 ? 'P' : 'B') != 'P') {
                break;
            }
            int i5 = f201 + 19;
            f200 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr2[i4] = (char) (charArray[i4] + i3);
                cArr2[i4] = (char) (cArr2[i4] % 0);
                i4 += 5;
            } else {
                cArr2[i4] = (char) (charArray[i4] + i3);
                cArr2[i4] = cArr2[i4];
                i4++;
            }
        }
        if (i > 0) {
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            int i6 = i2 - i;
            System.arraycopy(cArr3, 0, cArr2, i6, i);
            System.arraycopy(cArr3, i, cArr2, 0, i6);
        }
        if (z) {
            cArr = new char[i2];
            int i7 = f201 + 59;
            f200 = i7 % 128;
            if (i7 % 2 == 0) {
            }
            for (int i8 = 0; i8 < i2; i8++) {
                cArr[i8] = cArr2[(i2 - i8) - 1];
            }
        } else {
            cArr = cArr2;
        }
        return new String(cArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m248("\u0017ￚ￭.ￚ\u001c", false, 3, 6, 77).intern());
        sb.append(this.f206);
        sb.append(m248("￩ￖ\u0013\ufff8\u001d\u0016\u0018\u0010\u001f\u001c\u0010\u0012ￖￏￛ", true, 15, 15, 81).intern());
        sb.append(this.f202);
        sb.append(m248("\ufff1\uffde￣ￗ\uffde\u001b&$\u0018 %\uffde", false, 2, 12, 73).intern());
        sb.append(this.f204);
        sb.append('\'');
        sb.append(m248(",￣ￜ￨￣\ufff6￣$0\u001d", true, 4, 10, 68).intern());
        sb.append(this.f205);
        sb.append('\'');
        sb.append(m248("\ufff6￣￨ￜ￣,\n\u001d)!￣", false, 2, 11, 68).intern());
        sb.append(this.f203);
        sb.append('\'');
        sb.append(m248("$-\u001d\uffdf\ufff2\uffdf￤\uffd8\uffdf(\u000e\u0019", false, 6, 12, 72).intern());
        sb.append(this.f207);
        sb.append('\'');
        sb.append('}');
        String obj = sb.toString();
        int i = f200 + 91;
        f201 = i % 128;
        if (i % 2 != 0) {
        }
        return obj;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final String m249() {
        int i = f200 + 45;
        f201 = i % 128;
        int i2 = i % 2;
        String str = this.f202;
        int i3 = f200 + 45;
        f201 = i3 % 128;
        if (!(i3 % 2 != 0)) {
        }
        return str;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m250(String str) {
        int i = f200 + 101;
        f201 = i % 128;
        if ((i % 2 != 0 ? '\t' : 'W') != 'W') {
            this.f207 = str;
            Object obj = null;
            super.hashCode();
        } else {
            this.f207 = str;
        }
        int i2 = f200 + 99;
        f201 = i2 % 128;
        if (i2 % 2 != 0) {
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final String m251() {
        int i = f200 + 49;
        f201 = i % 128;
        int i2 = i % 2;
        String str = this.f205;
        int i3 = f201 + 29;
        f200 = i3 % 128;
        if ((i3 % 2 == 0 ? 'Q' : 'V') != 'V') {
        }
        return str;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m252(String str) {
        int i = f201 + 37;
        f200 = i % 128;
        if (i % 2 == 0) {
        }
        this.f205 = str;
        int i2 = f201 + 91;
        f200 = i2 % 128;
        if (i2 % 2 == 0) {
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final String m253() {
        int i = f201 + 53;
        f200 = i % 128;
        int i2 = i % 2;
        String str = this.f204;
        int i3 = f200 + 99;
        f201 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        return str;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m254(String str) {
        int i = f200 + 53;
        f201 = i % 128;
        if (!(i % 2 == 0)) {
            this.f202 = str;
        } else {
            this.f202 = str;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final String m255() {
        int i = f200 + 119;
        f201 = i % 128;
        int i2 = i % 2;
        String str = this.f207;
        int i3 = f200 + 125;
        f201 = i3 % 128;
        if ((i3 % 2 != 0 ? '@' : (char) 4) != '@') {
        }
        return str;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m256(long j) {
        int i = f201 + 43;
        f200 = i % 128;
        if (!(i % 2 == 0)) {
            this.f206 = j;
            return;
        }
        this.f206 = j;
        Object obj = null;
        super.hashCode();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m257(String str) {
        int i = f200 + 35;
        f201 = i % 128;
        if (i % 2 != 0) {
            this.f203 = str;
        } else {
            this.f203 = str;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final String m258() {
        int i = f200 + 79;
        f201 = i % 128;
        int i2 = i % 2;
        String str = this.f203;
        int i3 = f200 + 61;
        f201 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        return str;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m259(String str) {
        int i = f201 + 85;
        f200 = i % 128;
        if (i % 2 == 0) {
        }
        this.f204 = str;
        int i2 = f200 + 59;
        f201 = i2 % 128;
        if ((i2 % 2 != 0 ? 'D' : 'Y') != 'D') {
        }
    }
}
