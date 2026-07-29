package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʼʽʾʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0108 implements Runnable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f309 = 1;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f310 = 0;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static long f311 = 1550954232296103424L;

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ EnumC0150 f312;

    RunnableC0108(EnumC0150 enumC0150) {
        this.f312 = enumC0150;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = f309 + 79;
        f310 = i % 128;
        int i2 = i % 2;
        try {
            EnumC0150.m585(this.f312);
            int i3 = f310 + 51;
            f309 = i3 % 128;
            if (!(i3 % 2 == 0)) {
            }
        } catch (Throwable th) {
            C0076.m232().m236(th);
            int i4 = f309 + 89;
            f310 = i4 % 128;
            int i5 = i4 % 2;
            char[] charArray = "㛍\ue88c돮稰՛챳隥ꇾ栚㌕逸蒷俹ᘊ⅃\ue877늵緉Ћ콄陯ꃱ毻㈙﵊葪亠ᦥ".toCharArray();
            int i6 = f309 + 19;
            f310 = i6 % 128;
            int i7 = i6 % 2;
            char[] cArr = charArray;
            char c2 = cArr[0];
            char[] cArr2 = new char[cArr.length - 1];
            int i8 = 1;
            while (true) {
                if ((i8 >= cArr.length ? '\"' : (char) 27) == '\"') {
                    new String(cArr2).intern();
                    C0044.m107();
                    return;
                }
                int i9 = f310 + 31;
                f309 = i9 % 128;
                if (!(i9 % 2 == 0)) {
                    cArr2[i8 - 1] = (char) ((cArr[i8] ^ (i8 * c2)) ^ f311);
                    i8++;
                } else {
                    cArr2[i8] = (char) ((cArr[i8] ^ (i8 + c2)) - f311);
                    i8 += 95;
                }
            }
        }
    }
}
