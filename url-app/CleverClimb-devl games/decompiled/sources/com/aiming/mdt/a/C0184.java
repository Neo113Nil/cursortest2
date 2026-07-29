package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʾˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0184 {

    /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
    private static long f636 = -4060245454466966518L;

    /* renamed from: ʻʼʾ, reason: contains not printable characters */
    private static char[] f637 = {33866, 38955, 48154, 53269, 62505, 2107, 11383, '(', 7235, 14457, 21614, 28762, 35867, 36906, 35905, 43131, 50284, 57432, 7190, 14461, 21544, 28731, 27707, 34829, 42053, 'I', 7278, 14382, '\t', 7241, 14453, 21619, 28760, 35923, 43093, 50209, 57406, 64531, 6144, 13396, '\t', 7263, 14438, 21618, 28690, 33344, 40464, 47659, 54819, 62043, '\t', 7263, 14439, 21627, 28762, 35955, 43099, 50211, 57406, 64558, 6238, 13347, 10339, 3154, 24669, 17505, 47219, 40031, 61448, 54336, '\t', 7246, 14449, 21608, 28737, 35921, 43097, 50191, 57396, 64608, 58334, 65421, 56239, 47016, 37771, 28639, 1323, 6497, 15707, 20812, 30072, 35140, 44401, 49447, 58654, 63761, 7461, 12583, 21774, 27081, 36291, 41425, 50616, '\t', 7262, 14453, 21613, 28739, 35942, 43077, 50230, 57397, 64608};

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    private static int f638 = 0;

    /* renamed from: ʽʾ, reason: contains not printable characters */
    private static int f639 = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    private String f640;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private String f641;

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private String f642;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private String f643;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private int f644;

    /* renamed from: ʼ, reason: contains not printable characters */
    private String f645;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private int f646;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private String f647;

    /* renamed from: ʽ, reason: contains not printable characters */
    private String f648;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f649;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String m691(char c2, int i, int i2) {
        char[] cArr = new char[i];
        int i3 = f639 + 123;
        f638 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (true) {
            if (i5 >= i) {
                return new String(cArr);
            }
            int i6 = f638 + 83;
            f639 = i6 % 128;
            int i7 = i6 % 2;
            cArr[i5] = (char) ((f637[i2 + i5] ^ (i5 * f636)) ^ c2);
            i5++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb;
        String m691;
        int i = f638 + 67;
        f639 = i % 128;
        String str = null;
        if (!(i % 2 != 0)) {
            switch (this.f646) {
                case 0:
                    sb = new StringBuilder();
                    sb.append(this.f646);
                    m691 = m691((char) 33890, 7, 0);
                    sb.append(m691.intern());
                    str = sb.toString();
                    break;
                case 1:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f646);
                    sb2.append(m691((char) 0, 6, 7).intern());
                    str = sb2.toString();
                    int i2 = f639 + 39;
                    f638 = i2 % 128;
                    int i3 = i2 % 2;
                    break;
                case 2:
                    sb = new StringBuilder();
                    sb.append(this.f646);
                    m691 = m691((char) 36866, 12, 13);
                    sb.append(m691.intern());
                    str = sb.toString();
                    break;
            }
        } else {
            switch (this.f646) {
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m691((char) 0, 3, 25).intern());
        sb3.append(this.f645);
        sb3.append(m691((char) 0, 12, 28).intern());
        sb3.append(this.f648);
        sb3.append(m691((char) 0, 5, 40).intern());
        sb3.append(this.f640);
        sb3.append(m691((char) 33353, 5, 45).intern());
        sb3.append(str);
        sb3.append(m691((char) 0, 11, 50).intern());
        sb3.append(this.f643);
        sb3.append(m691((char) 13354, 9, 61).intern());
        sb3.append(this.f642);
        sb3.append(m691((char) 0, 10, 70).intern());
        sb3.append(this.f647);
        sb3.append(m691((char) 58327, 6, 80).intern());
        sb3.append(this.f649);
        sb3.append(m691((char) 1314, 17, 86).intern());
        sb3.append(this.f644);
        sb3.append(m691((char) 0, 10, 103).intern());
        sb3.append(this.f641);
        return sb3.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final String m692() {
        int i = f638 + 55;
        f639 = i % 128;
        if (i % 2 != 0) {
            return this.f642;
        }
        String str = this.f642;
        Object obj = null;
        super.hashCode();
        return str;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m693(String str) {
        int i = f638 + 35;
        f639 = i % 128;
        if (!(i % 2 == 0)) {
            this.f647 = str;
        } else {
            this.f647 = str;
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final String m694() {
        int i = f638 + 65;
        f639 = i % 128;
        return (i % 2 == 0 ? '#' : '$') != '$' ? this.f640 : this.f640;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m695(String str) {
        int i = f639 + 33;
        f638 = i % 128;
        int i2 = i % 2;
        this.f645 = str;
        int i3 = f639 + 79;
        f638 = i3 % 128;
        if (i3 % 2 != 0) {
        }
    }

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    public final int m696() {
        int i = f639 + 27;
        f638 = i % 128;
        int i2 = i % 2;
        int i3 = this.f644;
        int i4 = f638 + 67;
        f639 = i4 % 128;
        if ((i4 % 2 == 0 ? '4' : ',') != '4') {
        }
        return i3;
    }

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    public final void m697(String str) {
        int i = f638 + 61;
        f639 = i % 128;
        int i2 = i % 2;
        this.f641 = str;
        int i3 = f638 + 79;
        f639 = i3 % 128;
        if ((i3 % 2 == 0 ? 'J' : '\n') != '\n') {
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final int m698() {
        int i = f639 + 35;
        f638 = i % 128;
        return (i % 2 != 0 ? 'E' : '/') != 'E' ? this.f649 : this.f649;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m699(int i) {
        int i2 = f638 + 91;
        f639 = i2 % 128;
        int i3 = i2 % 2;
        this.f646 = i;
        int i4 = f638 + 9;
        f639 = i4 % 128;
        if ((i4 % 2 == 0 ? '\r' : 'C') != '\r') {
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m700(String str) {
        int i = f639 + 71;
        f638 = i % 128;
        int i2 = i % 2;
        this.f642 = str;
        int i3 = f638 + 17;
        f639 = i3 % 128;
        if ((i3 % 2 == 0 ? 'C' : (char) 29) != 'C') {
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final String m701() {
        int i = f638 + 15;
        f639 = i % 128;
        int i2 = i % 2;
        String str = this.f648;
        int i3 = f639 + 23;
        f638 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        return str;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m702(int i) {
        int i2 = f638 + 57;
        f639 = i2 % 128;
        if (!(i2 % 2 == 0)) {
            this.f649 = i;
        } else {
            this.f649 = i;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m703(String str) {
        int i = f638 + 21;
        f639 = i % 128;
        if ((i % 2 == 0 ? '\f' : (char) 17) != '\f') {
            this.f648 = str;
        } else {
            this.f648 = str;
        }
    }

    /* renamed from: ʼʽ, reason: contains not printable characters */
    public final String m704() {
        int i = f639 + 121;
        f638 = i % 128;
        int i2 = i % 2;
        String str = this.f643;
        int i3 = f638 + 17;
        f639 = i3 % 128;
        if (i3 % 2 == 0) {
        }
        return str;
    }

    /* renamed from: ʼʾ, reason: contains not printable characters */
    public final int m705() {
        int i = f638 + 73;
        f639 = i % 128;
        int i2 = i % 2;
        int i3 = this.f646;
        int i4 = f638 + 7;
        f639 = i4 % 128;
        if ((i4 % 2 == 0 ? '`' : 'G') != '`') {
        }
        return i3;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final String m706() {
        int i = f638 + 47;
        f639 = i % 128;
        int i2 = i % 2;
        String str = this.f647;
        int i3 = f638 + 9;
        f639 = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m707(int i) {
        int i2 = f638 + 51;
        f639 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f644 = i;
            return;
        }
        this.f644 = i;
        Object obj = null;
        super.hashCode();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m708(String str) {
        int i = f639 + 69;
        f638 = i % 128;
        if ((i % 2 != 0 ? '2' : '.') != '2') {
            this.f640 = str;
        } else {
            this.f640 = str;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final void m709(String str) {
        int i = f638 + 17;
        f639 = i % 128;
        if (i % 2 == 0) {
        }
        this.f643 = str;
        int i2 = f638 + 41;
        f639 = i2 % 128;
        if (i2 % 2 == 0) {
        }
    }
}
