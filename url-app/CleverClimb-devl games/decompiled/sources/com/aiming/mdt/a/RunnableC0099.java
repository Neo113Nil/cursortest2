package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʻʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0099 implements Runnable {

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private static long f292 = -8943210553138907690L;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private static int f293 = 0;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private static int f294 = 1;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static char[] f295 = {63415, 33397, 7272, 38452, 8409, 47803, 13461, 53083, 22823, 54038, 28034, 'A', 30118, 60380, 25033, 55101, 19799, 'A', 30130, 60378, 25063, 55082, 19802, 50029, 14505, 44761, 9448, 39483, 4219, 34412, '/', 30117, 60363, 25021, 24574, 48032, 'k', 'm', 30112, 9005, 22252, 51353, 17066, '5', 30200, 60313, 25004, 55150, 't', 30117, 33822, 'p', 'f', 'p', 30118, 60357, 25062, 3119, 31208, 59267, 31835, 2455, 38908, 'm', 30135, 60376, 25073, 'i', 30143, 60360, 'R', 30131, 60381, 25079, 55101, 19805, 50032, 14479, 44740, 9455, 39472, 4114, 34427, 64441, 29076, 59375, 23826, 54084, 18787, 48784, 13442};

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ String f296;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ String f297;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ int f298;

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ int f299;

    RunnableC0099(String str, int i, String str2, int i2) {
        this.f297 = str;
        this.f298 = i;
        this.f296 = str2;
        this.f299 = i2;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String m374(int i, int i2, char c2) {
        int i3 = f294 + 33;
        f293 = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = new char[i2];
        int i5 = f293 + 77;
        f294 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (true) {
            if (i7 >= i2) {
                return new String(cArr);
            }
            cArr[i7] = (char) ((f295[i + i7] ^ (i7 * f292)) ^ c2);
            i7++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0191, code lost:
    
        if (r8 == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0193, code lost:
    
        r8 = com.aiming.mdt.a.RunnableC0099.f293 + 63;
        com.aiming.mdt.a.RunnableC0099.f294 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x019d, code lost:
    
        r3.put(r7, r5);
        r3.put(m374(63, 4, 0).intern(), com.aiming.mdt.a.C0179.m682());
        r3.put(m374(67, 3, 0).intern(), r14.f299);
        r0 = new com.aiming.mdt.a.C0025().m361(new com.aiming.mdt.a.C0145().m561(r0).m565(com.aiming.mdt.utils.C0283.m975(r3.toString().trim())).m562(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x01ec, code lost:
    
        if (r0.m336() == 200) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01f1, code lost:
    
        if (r4 == 20) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01f3, code lost:
    
        com.aiming.mdt.a.C0031.m45(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01f6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01ef, code lost:
    
        r4 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x019c, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x018e, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r0 = com.aiming.mdt.a.RunnableC0099.f293 + 45;
        com.aiming.mdt.a.RunnableC0099.f294 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        if ((r0 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003c, code lost:
    
        if (android.text.TextUtils.isEmpty(r14.f297) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (android.text.TextUtils.isEmpty(r14.f297) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        r0 = com.aiming.mdt.a.C0195.m731().m735();
        r3 = (java.lang.String) com.aiming.mdt.a.C0162.m619().m622(m374(11, 6, 0).intern(), java.lang.String.class);
        r7 = (java.lang.String) com.aiming.mdt.a.C0162.m619().m622(m374(17, 13, 0).intern(), java.lang.String.class);
        r8 = com.aiming.mdt.a.C0195.m731().m738().getPackageName();
        r9 = new java.lang.StringBuilder();
        r9.append(r0.m491());
        r9.append(m374(30, 4, 0).intern());
        r9.append(new com.aiming.mdt.a.C0189().m721(m374(34, 1, 24456).intern(), m374(35, 1, 48017).intern()).m721(m374(36, 1, 0).intern(), r3).m721(m374(37, 2, 0).intern(), 189).m721(m374(39, 4, 9054).intern(), m374(43, 5, 0).intern()).m720());
        r0 = r9.toString();
        r1 = new java.util.HashMap<>();
        com.aiming.mdt.a.C0031.m33((java.util.HashMap) r1);
        r3 = new org.json.JSONObject();
        r3.put(m374(48, 2, 0).intern(), java.lang.System.currentTimeMillis());
        r3.put(m374(50, 1, 33914).intern(), r7);
        r3.put(m374(51, 1, 0).intern(), r14.f297);
        r3.put(m374(52, 1, 0).intern(), java.lang.Integer.toString(r14.f298));
        r3.put(m374(53, 4, 0).intern(), r14.f296);
        r3.put(m374(57, 3, 3167).intern(), r8);
        r7 = m374(60, 3, 31794).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x018a, code lost:
    
        if (r14.f298 != 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x018c, code lost:
    
        r8 = false;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i = f293 + 43;
        f294 = i % 128;
        char c2 = 11;
        int i2 = 1;
        try {
            if (i % 2 == 0) {
                m374(1, 59, (char) 63460).intern();
                C0044.m108();
            } else {
                m374(0, 11, (char) 63460).intern();
                C0044.m108();
            }
        } catch (Exception e) {
            C0076.m232().m236(e);
            m374(70, 21, (char) 0).intern();
            C0044.m109();
        }
        C0076.m232().m236(e);
        m374(70, 21, (char) 0).intern();
        C0044.m109();
    }
}
