package com.aiming.mdt.a;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.aiming.mdt.a.ʻʽʾʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC0066 implements InterfaceC0101 {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f145 = 0;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private static int f146 = 1;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static long f147 = 7249234743348328668L;

    /* renamed from: ʻ, reason: contains not printable characters */
    private ConcurrentLinkedQueue<C0184> f149 = new ConcurrentLinkedQueue<>();

    /* renamed from: ʽ, reason: contains not printable characters */
    private static char[] f148 = {'N', 30899, 61848, 27384, 58143, 23597, 54604, 20048, 50817, 16335, 47347, 12628, 43521, 9049, 40045, 5265, 36261, 1724, 32523, 63549, 29002, 60009, 25298, 36057, 62518, 32114, 58987, 28573, 53433, 23015, 49903, 18971, 45911, 13411, 48569, 9895, 45000, 4339, 38976, ':', 30869, 61909, 27364, 58114, 23660, 54620, 20075, 50880, 16383, 47348, 12573, 43571, 9031, 39972, 5303, 36268, 1785, 32541, 63524, 28938, 49729, 47809, 13234, 43221, 8567, 40527, 5942, 35864, 1201, 2013, 32605, 63022, 27977, 58597, 23505, 53989, ' ', 30906, 61905, 27386, 58115, 23588, 'f', 30901, 61910, 27367, 58136, 23555, 54618, 20039, 50828, 16341, 47355, 12575, 'G', 30888, 61932, 27381, 58115, 23591, 54651, 20081, 50819, 16345, 47339, 12551, 43632, 9081, 40026, 5288, 36346, 'G', 30888, 61932, 27381, 58115, 23591, 54637, 20086, 50834, 16339, 47338, 12628, 43525, 9086, 40004, 5342, '\n', 30873, 61898, 27366, 58143, 23614, 54625, 20074, 50822, 16339, 47266, 59056, 40566, 5909, 35888, 1503, 47850, 13215, 43176, 8269};

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static final EnumC0066 f144 = new EnumC0066(m200(9, 59107, 138).intern());

    static {
        new EnumC0066[1][0] = f144;
        int i = f146 + 121;
        f145 = i % 128;
        if (!(i % 2 != 0)) {
        }
    }

    private EnumC0066(String str) {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static String m200(int i, char c2, int i2) {
        char[] cArr = new char[i];
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                return new String(cArr);
            }
            int i4 = f146 + 77;
            f145 = i4 % 128;
            if ((i4 % 2 != 0 ? 'U' : (char) 4) != 4) {
                cArr[i3] = (char) ((f148[i2 >>> i3] * (i3 & f147)) | c2);
                i3 += 31;
            } else {
                cArr[i3] = (char) ((f148[i2 + i3] ^ (i3 * f147)) ^ c2);
                i3++;
            }
            int i5 = f145 + 93;
            f146 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m201(C0184 c0184) {
        int i = f146 + 53;
        f145 = i % 128;
        int i2 = i % 2;
        try {
            if (c0184.m705() != 2) {
                c0184.m701();
                m200(6, (char) 0, 76).intern();
                C0044.m108();
                return;
            }
            c0184.m701();
            m200(21, (char) 0, 39).intern();
            c0184.m696();
            C0044.m108();
            c0184.m708(c0184.m694().replace(m200(9, (char) 49774, 60).intern(), m200(7, (char) 2034, 69).intern()));
            c0184.m699(0);
            Thread.sleep(c0184.m696());
            new C0157(c0184, this).m598();
            int i3 = f146 + 81;
            f145 = i3 % 128;
            if ((i3 % 2 != 0 ? '1' : (char) 21) != 21) {
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
            m200(12, (char) 0, 82).intern();
            C0044.m109();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static /* synthetic */ void m202(EnumC0066 enumC0066) {
        int i = f145 + 45;
        f146 = i % 128;
        int i2 = i % 2;
        if (!(C0079.m244(C0195.m731().m738()))) {
            return;
        }
        m200(16, (char) 35998, 23).intern();
        enumC0066.f149.size();
        C0044.m108();
        C0184 poll = enumC0066.f149.poll();
        if (poll != null) {
            new C0157(poll, enumC0066).m598();
            int i3 = f146 + 89;
            f145 = i3 % 128;
            if (i3 % 2 != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r4.f149.addAll(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r0 != null) goto L22;
     */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void m203(EnumC0066 enumC0066) {
        ConcurrentLinkedQueue<C0184> m42;
        int i = f145 + 79;
        f146 = i % 128;
        int i2 = i % 2;
        if (enumC0066.f149.size() > 2) {
            m200(23, (char) 0, 0).intern();
            enumC0066.f149.size();
            C0044.m104();
            return;
        }
        Object obj = null;
        if (C0079.m244(C0195.m731().m738())) {
            int i3 = f145 + 105;
            f146 = i3 % 128;
            if ((i3 % 2 == 0 ? ':' : '6') != '6') {
                m42 = C0031.m42();
                super.hashCode();
            } else {
                m42 = C0031.m42();
            }
        }
        int i4 = f145 + 49;
        f146 = i4 % 128;
        if (i4 % 2 == 0) {
            super.hashCode();
        }
    }

    @Override // com.aiming.mdt.a.InterfaceC0101
    /* renamed from: ʼ */
    public final void mo102(C0184 c0184, C0157 c0157) {
        int i;
        int i2;
        int i3 = f145 + 97;
        f146 = i3 % 128;
        if (!(i3 % 2 != 0)) {
            i = 70;
            i2 = 28;
        } else {
            i = 17;
            i2 = 94;
        }
        m200(i, (char) 0, i2).intern();
        C0044.m104();
        m201(c0184);
        int i4 = f146 + 1;
        f145 = i4 % 128;
        if (i4 % 2 != 0) {
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m204() {
        C0057.m177().m178(new RunnableC0171(this), 10L, C0195.m731().m735().m499() * 60, TimeUnit.SECONDS);
        C0057.m177().m178(new RunnableC0061(this), 30L, new Random().nextInt(11) + 10, TimeUnit.SECONDS);
        int i = f146 + 109;
        f145 = i % 128;
        if (i % 2 != 0) {
        }
    }

    @Override // com.aiming.mdt.a.InterfaceC0101
    /* renamed from: ʽ */
    public final void mo103(C0184 c0184, C0157 c0157) {
        int i = f145 + 115;
        f146 = i % 128;
        int i2 = i % 2;
        m200(16, (char) 0, 111).intern();
        m200(11, (char) 0, 127).intern();
        C0044.m104();
        m201(c0184);
        int i3 = f145 + 111;
        f146 = i3 % 128;
        if (i3 % 2 == 0) {
        }
    }
}
