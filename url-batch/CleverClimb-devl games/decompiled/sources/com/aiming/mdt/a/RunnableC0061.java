package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʻʼˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0061 implements Runnable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f137 = 0;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static char[] f138 = {'G', 8110, 16355, 24545, 32538, 40745, 49017, 56964, 65264, 7887, 16124, 24123, 32347, 40551, 48536, 56739, 65012, 7451, 15655, 23877, 32040, 40071, 48334, 56548, 64543, 7224, 15390};

    /* renamed from: ʼ, reason: contains not printable characters */
    private static long f139 = -3695017543590666278L;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f140 = 1;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ EnumC0066 f141;

    RunnableC0061(EnumC0066 enumC0066) {
        this.f141 = enumC0066;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = f137 + 55;
        f140 = i % 128;
        int i2 = 0;
        try {
            if (i % 2 != 0) {
                EnumC0066.m202(this.f141);
            } else {
                EnumC0066.m202(this.f141);
            }
        } catch (Throwable unused) {
            int i3 = f140 + 105;
            f137 = i3 % 128;
            if (i3 % 2 == 0) {
            }
            char[] cArr = new char[27];
            while (true) {
                if ((i2 >= 27 ? '/' : 'S') != 'S') {
                    new String(cArr).intern();
                    C0044.m107();
                    return;
                } else {
                    cArr[i2] = (char) (f138[i2 + 0] ^ (i2 * f139));
                    i2++;
                    int i4 = f137 + 63;
                    f140 = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        }
    }
}
