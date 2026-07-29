package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʼʾʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0129 implements Runnable {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static long f394 = 5561384604608010367L;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static char[] f395 = {25823, 64661, 21559, 44428, 1296, 40590, 62977, 20373, 42822, 14469, 36871, 59786, 16654, 55993, 12813, 35740, 58117, 17617, 56341, 13697, 36096, 59034, 32262, 55245};

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int f396 = 1;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f397;

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ EnumC0150 f398;

    RunnableC0129(EnumC0150 enumC0150) {
        this.f398 = enumC0150;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = f396 + 5;
        f397 = i % 128;
        try {
            EnumC0150.m587(i % 2 != 0 ? this.f398 : this.f398);
            int i2 = f396 + 107;
            f397 = i2 % 128;
            if (!(i2 % 2 == 0)) {
                Object obj = null;
                super.hashCode();
            }
        } catch (Throwable th) {
            C0076.m232().m236(th);
            int i3 = f397 + 61;
            f396 = i3 % 128;
            if (i3 % 2 != 0) {
            }
            char[] cArr = new char[24];
            int i4 = 0;
            while (true) {
                if (i4 >= 24) {
                    new String(cArr).intern();
                    C0044.m107();
                    return;
                } else {
                    int i5 = f397 + 121;
                    f396 = i5 % 128;
                    int i6 = i5 % 2;
                    cArr[i4] = (char) ((f395[i4 + 0] ^ (i4 * f394)) ^ 25758);
                    i4++;
                }
            }
        }
    }
}
