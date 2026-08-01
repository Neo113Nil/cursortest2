package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public enum fh {
    /* JADX INFO: Fake field, exist only in values array */
    STRING('s', 1, "-#", true),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN('b', 2, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR('c', 3, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    DECIMAL('d', 4, "-0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    OCTAL('o', 4, "-#0(", false),
    HEX('x', 4, "-#0(", true),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT('f', 5, "-#0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT('e', 5, "-#0+ (", true),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL('g', 5, "-0+ ,(", true),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT_HEX('a', 5, "-#0+ ", true);


    /* renamed from: t, reason: collision with root package name */
    public static final fh[] f2302t = new fh[26];

    /* renamed from: d, reason: collision with root package name */
    public final char f2304d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2305e;

    /* renamed from: i, reason: collision with root package name */
    public final int f2306i;

    /* renamed from: r, reason: collision with root package name */
    public final String f2307r;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    static {
        /*
            com.google.android.gms.internal.measurement.fh r0 = new com.google.android.gms.internal.measurement.fh
            r3 = 115(0x73, float:1.61E-43)
            r6 = 1
            java.lang.String r1 = "STRING"
            r2 = 0
            r4 = 1
            java.lang.String r5 = "-#"
            r0.<init>(r3, r4, r5, r6)
            com.google.android.gms.internal.measurement.fh r1 = new com.google.android.gms.internal.measurement.fh
            r4 = 98
            r7 = 1
            java.lang.String r2 = "BOOLEAN"
            r3 = 1
            r5 = 2
            java.lang.String r6 = "-"
            r1.<init>(r4, r5, r6, r7)
            com.google.android.gms.internal.measurement.fh r2 = new com.google.android.gms.internal.measurement.fh
            r5 = 99
            r8 = 1
            java.lang.String r3 = "CHAR"
            r4 = 2
            r6 = 3
            java.lang.String r7 = "-"
            r2.<init>(r5, r6, r7, r8)
            com.google.android.gms.internal.measurement.fh r3 = new com.google.android.gms.internal.measurement.fh
            r6 = 100
            r9 = 0
            java.lang.String r4 = "DECIMAL"
            r5 = 3
            r14 = 4
            java.lang.String r8 = "-0+ ,("
            r7 = r14
            r3.<init>(r6, r7, r8, r9)
            com.google.android.gms.internal.measurement.fh r4 = new com.google.android.gms.internal.measurement.fh
            r13 = 111(0x6f, float:1.56E-43)
            r16 = 0
            java.lang.String r11 = "OCTAL"
            r12 = 4
            java.lang.String r15 = "-#0("
            r10 = r4
            r10.<init>(r13, r14, r15, r16)
            com.google.android.gms.internal.measurement.fh r5 = new com.google.android.gms.internal.measurement.fh
            r13 = 120(0x78, float:1.68E-43)
            r16 = 1
            java.lang.String r11 = "HEX"
            r12 = 5
            java.lang.String r15 = "-#0("
            r10 = r5
            r10.<init>(r13, r14, r15, r16)
            com.google.android.gms.internal.measurement.fh.HEX = r5
            com.google.android.gms.internal.measurement.fh r6 = new com.google.android.gms.internal.measurement.fh
            r9 = 102(0x66, float:1.43E-43)
            r12 = 0
            java.lang.String r7 = "FLOAT"
            r8 = 6
            r17 = 5
            java.lang.String r11 = "-#0+ ,("
            r10 = r17
            r6.<init>(r9, r10, r11, r12)
            com.google.android.gms.internal.measurement.fh r7 = new com.google.android.gms.internal.measurement.fh
            r16 = 101(0x65, float:1.42E-43)
            r19 = 1
            java.lang.String r14 = "EXPONENT"
            r15 = 7
            java.lang.String r18 = "-#0+ ("
            r13 = r7
            r13.<init>(r16, r17, r18, r19)
            com.google.android.gms.internal.measurement.fh r8 = new com.google.android.gms.internal.measurement.fh
            r16 = 103(0x67, float:1.44E-43)
            java.lang.String r14 = "GENERAL"
            r15 = 8
            java.lang.String r18 = "-0+ ,("
            r13 = r8
            r13.<init>(r16, r17, r18, r19)
            com.google.android.gms.internal.measurement.fh r9 = new com.google.android.gms.internal.measurement.fh
            r16 = 97
            java.lang.String r14 = "EXPONENT_HEX"
            r15 = 9
            java.lang.String r18 = "-#0+ "
            r13 = r9
            r13.<init>(r16, r17, r18, r19)
            com.google.android.gms.internal.measurement.fh[] r0 = new com.google.android.gms.internal.measurement.fh[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            com.google.android.gms.internal.measurement.fh.f2303u = r0
            r0 = 26
            com.google.android.gms.internal.measurement.fh[] r0 = new com.google.android.gms.internal.measurement.fh[r0]
            com.google.android.gms.internal.measurement.fh.f2302t = r0
            com.google.android.gms.internal.measurement.fh[] r0 = values()
            int r1 = r0.length
            r2 = 0
        La7:
            if (r2 >= r1) goto Lb8
            r3 = r0[r2]
            char r4 = r3.f2304d
            r4 = r4 | 32
            int r4 = r4 + (-97)
            com.google.android.gms.internal.measurement.fh[] r5 = com.google.android.gms.internal.measurement.fh.f2302t
            r5[r4] = r3
            int r2 = r2 + 1
            goto La7
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.fh.<clinit>():void");
    }

    fh(char c10, int i3, String str, boolean z10) {
        this.f2304d = c10;
        this.f2305e = i3;
        gh ghVar = gh.f2345e;
        int i10 = true != z10 ? 0 : 128;
        for (int i11 = 0; i11 < str.length(); i11++) {
            int charAt = ((int) ((gh.f2344d >>> ((str.charAt(i11) - ' ') * 3)) & 7)) - 1;
            if (charAt < 0) {
                te.a1.e("invalid flags: ".concat(str));
                throw null;
            }
            i10 |= 1 << charAt;
        }
        this.f2306i = i10;
        this.f2307r = n0.l.h(new StringBuilder(String.valueOf(c10).length() + 1), "%", c10);
    }
}
