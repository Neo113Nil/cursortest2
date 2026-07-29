package com.aiming.mdt.a;

import com.cmplay.policy.gdpr.DimenUtils;
import java.util.HashMap;

/* renamed from: com.aiming.mdt.a.ʻʾʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0087 {

    /* renamed from: ʻʼʿ, reason: contains not printable characters */
    private static int f216 = 0;

    /* renamed from: ʼʿ, reason: contains not printable characters */
    private static long f217 = -6415454780956250292L;

    /* renamed from: ʽʿ, reason: contains not printable characters */
    private static char[] f218 = {'(', 28418, 57079, 19862, 48477, 11293, 39844, 2891, 31240, 59864, 22668, 51252, 14265, '(', 28431, 57076, 19853, 48467, 11287, 39905, 1918, 26707, 55715, 19138, 47636, 11011, '(', 28421, 57077, 19860, 48450, 11354, 39819, 2936, 31241, 59855, 22675, 51309, 'B', 28473, 57067, 19853, 48478, 11289, 39867, 2919, 31284, 59861, 22664, 51233, 14250, '\t', 28440, 57081, 19863, 48475, 11317, 39852, 2862, 15905, 20784, 57553, 29631, 33651, 4608, 42393, 13644, 17453, 55230, 4301, 32715, 52787, 23885, 44420, 15577, 35685, 7095, 27338, 63777, 18520, 55482, 29166, 7934, 44813, 15471, 52461, '\t', 28446, 57085, 19863, 48448, 11283, 39846, 2919, 31237, 59798, 7386, 29655, 49727, 20803, 41363, 12537, 34686, 6069, 26304, 62742, 17476, 54521, 11129, 30467, 6163, 43489, 14987, 51784, 23351, 60581, 31867, 3332, 40658, 12232, '\t', 28446, 57085, 19861, 48453, 11289, 39867, 2929, 31252, 59896, 22657, 51252, 14325, 42726, 32801, 61223, 24287, 52642, 15724, 44081, 7054, 35656, 64028, 27133, 55456, 18441, 46978, '\t', 28426, 57079, 19848, 48476, 11283, 39871, 2886, 31237, 59848, 22673, 51254, 14325, 42687, 5724, 34126, 63212, 39402, 10258, 47983, 19361, 56060, 27971, 64901, 36031};

    /* renamed from: ʿ, reason: contains not printable characters */
    private static int f219 = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    private String f220;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private int f221;

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private boolean f222;

    /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
    private boolean f223;

    /* renamed from: ʻʼʾ, reason: contains not printable characters */
    private String f224;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private String f225;

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    private int f226;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private HashMap<String, String> f227;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    private String f228;

    /* renamed from: ʼ, reason: contains not printable characters */
    private String f229;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private String f230;

    /* renamed from: ʼʽʾ, reason: contains not printable characters */
    private boolean f231;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private String f232;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f233;

    /* renamed from: ʽʾ, reason: contains not printable characters */
    private int f234;

    /* renamed from: ʾ, reason: contains not printable characters */
    private String f235;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static String m264(int i, char c2, int i2) {
        int i3 = f216 + 115;
        f219 = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = new char[i];
        int i5 = 0;
        while (true) {
            if (!(i5 < i)) {
                return new String(cArr);
            }
            cArr[i5] = (char) ((f218[i2 + i5] ^ (i5 * f217)) ^ c2);
            i5++;
            int i6 = f219 + 21;
            f216 = i6 % 128;
            if (i6 % 2 != 0) {
            }
        }
    }

    public final String toString() {
        StringBuilder sb;
        String m264;
        String str = null;
        switch (this.f221) {
            case 0:
                sb = new StringBuilder();
                sb.append(this.f221);
                m264 = m264(13, (char) 0, 0);
                sb.append(m264.intern());
                str = sb.toString();
                break;
            case 1:
                sb = new StringBuilder();
                sb.append(this.f221);
                m264 = m264(7, (char) 0, 13);
                sb.append(m264.intern());
                str = sb.toString();
                break;
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f221);
                sb2.append(m264(6, (char) 1878, 20).intern());
                str = sb2.toString();
                int i = f219 + 69;
                f216 = i % 128;
                if (i % 2 == 0) {
                    break;
                } else {
                    break;
                }
            case 3:
                sb = new StringBuilder();
                sb.append(this.f221);
                m264 = m264(12, (char) 0, 26);
                sb.append(m264.intern());
                str = sb.toString();
                break;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m264(13, (char) 0, 38).intern());
        sb3.append(this.f225);
        sb3.append(m264(8, (char) 0, 51).intern());
        sb3.append(this.f220);
        sb3.append(m264(10, (char) 15912, 59).intern());
        sb3.append(str);
        sb3.append(m264(12, (char) 4292, 69).intern());
        sb3.append(this.f234);
        sb3.append(m264(5, (char) 29159, 81).intern());
        sb3.append(this.f232);
        sb3.append(m264(10, (char) 0, 86).intern());
        sb3.append(this.f223);
        sb3.append(m264(13, (char) 7379, 96).intern());
        sb3.append(this.f233);
        sb3.append(m264(11, (char) 30474, 109).intern());
        sb3.append(this.f229);
        sb3.append(m264(14, (char) 0, DimenUtils.DENSITY_LOW).intern());
        sb3.append(this.f235);
        sb3.append(m264(13, (char) 32808, 134).intern());
        sb3.append(this.f222);
        sb3.append(m264(16, (char) 0, 147).intern());
        sb3.append(this.f231);
        sb3.append(m264(9, (char) 63205, 163).intern());
        sb3.append(this.f230);
        String obj = sb3.toString();
        int i2 = f219 + 23;
        f216 = i2 % 128;
        if ((i2 % 2 != 0 ? '^' : '<') != '^') {
        }
        return obj;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final String m265() {
        int i = f219 + 93;
        f216 = i % 128;
        if ((i % 2 != 0 ? (char) 0 : '?') == '?') {
            return this.f220;
        }
        String str = this.f220;
        Object obj = null;
        super.hashCode();
        return str;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m266(int i) {
        int i2 = f219 + 77;
        f216 = i2 % 128;
        int i3 = i2 % 2;
        this.f234 = i;
        int i4 = f219 + 37;
        f216 = i4 % 128;
        if ((i4 % 2 != 0 ? ']' : '1') != ']') {
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m267(String str) {
        int i = f216 + 63;
        f219 = i % 128;
        if ((i % 2 == 0 ? (char) 3 : '\f') != 3) {
            this.f229 = str;
        } else {
            this.f229 = str;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m268(boolean z) {
        int i = f216 + 15;
        f219 = i % 128;
        if (i % 2 == 0) {
        }
        this.f231 = z;
        int i2 = f219 + 101;
        f216 = i2 % 128;
        if (i2 % 2 != 0) {
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final String m269() {
        int i = f216 + 53;
        f219 = i % 128;
        return (i % 2 == 0 ? (char) 0 : 'U') != 0 ? this.f229 : this.f229;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m270(int i) {
        int i2 = f219 + 63;
        f216 = i2 % 128;
        if (i2 % 2 != 0) {
        }
        this.f226 = i;
        int i3 = f219 + 91;
        f216 = i3 % 128;
        if (i3 % 2 != 0) {
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m271(String str) {
        int i = f216 + 35;
        f219 = i % 128;
        if (i % 2 == 0) {
        }
        this.f235 = str;
        int i2 = f216 + 43;
        f219 = i2 % 128;
        if (i2 % 2 == 0) {
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m272(HashMap<String, String> hashMap) {
        int i = f216 + 117;
        f219 = i % 128;
        int i2 = i % 2;
        this.f227 = hashMap;
        int i3 = f216 + 71;
        f219 = i3 % 128;
        if (i3 % 2 == 0) {
        }
    }

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    public final String m273() {
        int i = f216 + 55;
        f219 = i % 128;
        int i2 = i % 2;
        String str = this.f230;
        int i3 = f216 + 1;
        f219 = i3 % 128;
        if ((i3 % 2 == 0 ? '\b' : ' ') != ' ') {
        }
        return str;
    }

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    public final void m274(String str) {
        int i = f216 + 53;
        f219 = i % 128;
        if ((i % 2 == 0 ? '+' : (char) 3) != 3) {
            this.f228 = str;
        } else {
            this.f228 = str;
        }
    }

    /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
    public final int m275() {
        int i = f216 + 69;
        f219 = i % 128;
        if (i % 2 != 0) {
            return this.f226;
        }
        int i2 = this.f226;
        Object obj = null;
        super.hashCode();
        return i2;
    }

    /* renamed from: ʻʼʾ, reason: contains not printable characters */
    public final boolean m276() {
        int i = f219 + 13;
        f216 = i % 128;
        return !(i % 2 == 0) ? this.f223 : this.f223;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final String m277() {
        int i = f216 + 73;
        f219 = i % 128;
        if (i % 2 == 0) {
        }
        String str = this.f225;
        int i2 = f219 + 79;
        f216 = i2 % 128;
        if (i2 % 2 != 0) {
        }
        return str;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m278(int i) {
        int i2 = f219 + 119;
        f216 = i2 % 128;
        int i3 = i2 % 2;
        this.f221 = i;
        int i4 = f216 + 103;
        f219 = i4 % 128;
        if (i4 % 2 == 0) {
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m279(String str) {
        int i = f219 + 117;
        f216 = i % 128;
        int i2 = i % 2;
        this.f220 = str;
        int i3 = f216 + 79;
        f219 = i3 % 128;
        if ((i3 % 2 == 0 ? ']' : '\b') != '\b') {
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m280(boolean z) {
        int i = f216 + 103;
        f219 = i % 128;
        if (i % 2 != 0) {
            this.f222 = z;
            return;
        }
        this.f222 = z;
        Object obj = null;
        super.hashCode();
    }

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    public final int m281() {
        int i;
        int i2 = f216 + 13;
        f219 = i2 % 128;
        if (i2 % 2 == 0) {
            i = this.f234;
            Object obj = null;
            super.hashCode();
        } else {
            i = this.f234;
        }
        int i3 = f219 + 73;
        f216 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        return i;
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    public final HashMap<String, String> m282() {
        int i = f219 + 103;
        f216 = i % 128;
        if (i % 2 != 0) {
        }
        HashMap<String, String> hashMap = this.f227;
        int i2 = f219 + 55;
        f216 = i2 % 128;
        if (i2 % 2 == 0) {
        }
        return hashMap;
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    public final void m283(String str) {
        int i = f216 + 99;
        f219 = i % 128;
        if (i % 2 == 0) {
            this.f230 = str;
        } else {
            this.f230 = str;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final String m284() {
        String str;
        int i = f219 + 23;
        f216 = i % 128;
        if (i % 2 == 0) {
            str = this.f232;
        } else {
            str = this.f232;
            Object obj = null;
            super.hashCode();
        }
        int i2 = f216 + 9;
        f219 = i2 % 128;
        if ((i2 % 2 == 0 ? '%' : ')') != ')') {
        }
        return str;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m285(String str) {
        int i = f219 + 57;
        f216 = i % 128;
        if (i % 2 != 0) {
        }
        this.f232 = str;
        int i2 = f219 + 107;
        f216 = i2 % 128;
        if (i2 % 2 != 0) {
        }
    }

    /* renamed from: ʼʽ, reason: contains not printable characters */
    public final boolean m286() {
        int i = f219 + 103;
        f216 = i % 128;
        int i2 = i % 2;
        boolean z = this.f222;
        int i3 = f216 + 33;
        f219 = i3 % 128;
        if (i3 % 2 == 0) {
        }
        return z;
    }

    /* renamed from: ʼʽʾ, reason: contains not printable characters */
    public final String m287() {
        int i = f219 + 87;
        f216 = i % 128;
        return (i % 2 != 0 ? '\n' : '.') != '\n' ? this.f224 : this.f224;
    }

    /* renamed from: ʼʾ, reason: contains not printable characters */
    public final boolean m288() {
        int i = f219 + 119;
        f216 = i % 128;
        if (i % 2 != 0) {
        }
        boolean z = this.f231;
        int i2 = f219 + 109;
        f216 = i2 % 128;
        if ((i2 % 2 != 0 ? '1' : '6') != '6') {
        }
        return z;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int m289() {
        int i;
        int i2 = f219 + 33;
        f216 = i2 % 128;
        if ((i2 % 2 != 0 ? 'Z' : 'O') != 'O') {
            i = this.f221;
            Object obj = null;
            super.hashCode();
        } else {
            i = this.f221;
        }
        int i3 = f216 + 35;
        f219 = i3 % 128;
        if (i3 % 2 == 0) {
        }
        return i;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m290(int i) {
        int i2 = f216 + 77;
        f219 = i2 % 128;
        int i3 = i2 % 2;
        this.f233 = i;
        int i4 = f216 + 65;
        f219 = i4 % 128;
        if (i4 % 2 == 0) {
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m291(String str) {
        int i = f216 + 67;
        f219 = i % 128;
        if (i % 2 != 0) {
            this.f225 = str;
        } else {
            this.f225 = str;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m292(boolean z) {
        int i = f219 + 45;
        f216 = i % 128;
        int i2 = i % 2;
        this.f223 = z;
        int i3 = f216 + 35;
        f219 = i3 % 128;
        if (i3 % 2 == 0) {
        }
    }

    /* renamed from: ʽʾ, reason: contains not printable characters */
    public final String m293() {
        int i = f216 + 33;
        f219 = i % 128;
        int i2 = i % 2;
        String str = this.f228;
        int i3 = f219 + 117;
        f216 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        return str;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final String m294() {
        int i = f219 + 29;
        f216 = i % 128;
        int i2 = i % 2;
        String str = this.f235;
        int i3 = f216 + 65;
        f219 = i3 % 128;
        if (i3 % 2 == 0) {
        }
        return str;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final void m295(String str) {
        int i = f219 + 65;
        f216 = i % 128;
        if (!(i % 2 != 0)) {
            this.f224 = str;
        } else {
            this.f224 = str;
        }
    }
}
