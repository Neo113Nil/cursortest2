package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʻʼʽʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0034 implements Runnable {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static long f49 = 6960638233074866758L;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int f50 = 0;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f51 = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ C0119 f52;

    RunnableC0034(C0119 c0119) {
        this.f52 = c0119;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m53(String str) {
        int i = f51 + 79;
        f50 = i % 128;
        int i2 = 1;
        if (i % 2 != 0) {
        }
        int i3 = f51 + 11;
        f50 = i3 % 128;
        int i4 = i3 % 2;
        char[] charArray = str.toCharArray();
        int i5 = f50 + 101;
        f51 = i5 % 128;
        int i6 = i5 % 2;
        char[] cArr = charArray;
        char c2 = cArr[0];
        char[] cArr2 = new char[cArr.length - 1];
        while (i2 < cArr.length) {
            int i7 = f50 + 95;
            f51 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr2[i2] = (char) ((cArr[i2] & (i2 + c2)) * f49);
                i2 += 67;
            } else {
                cArr2[i2 - 1] = (char) ((cArr[i2] ^ (i2 * c2)) ^ f49);
                i2++;
            }
        }
        return new String(cArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
    
        if (r0 != null) goto L17;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C0109 m32;
        int i = f50 + 93;
        f51 = i % 128;
        try {
            if (i % 2 == 0) {
                m32 = C0031.m32();
                if ((m32 != null ? (char) 14 : 'Z') != 'Z') {
                    C0195.m731().m739(m32);
                    C0119.m455(this.f52, m32);
                    return;
                }
                m53("\uffef\ue5ee\ue5ec\ue5c8\ue595\ue583\ue5ba\ue5a6\ue559\ue501\ue579\ue570\ue552\ue52b\ue521\ue52b\ue4da").intern();
                C0044.m104();
                int i2 = f51 + 99;
                f50 = i2 % 128;
                if (i2 % 2 != 0) {
                }
                return;
            }
            m32 = C0031.m32();
        } catch (Exception e) {
            C0076.m232().m236(e);
            m53("ꓡ뻠台\uf4b2覭≑읫頄㴼톏櫥ྃꂣ䕟Ḩ댌吤\ue8c5跻⚇ﯨ").intern();
            C0044.m109();
        }
    }
}
