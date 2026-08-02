package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum hlq {
    STRING('s', hls.GENERAL, "-#", true),
    BOOLEAN('b', hls.BOOLEAN, "-", true),
    CHAR('c', hls.CHARACTER, "-", true),
    DECIMAL('d', hls.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', hls.INTEGRAL, "-#0(", false),
    HEX('x', hls.INTEGRAL, "-#0(", true),
    FLOAT('f', hls.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', hls.FLOAT, "-#0+ (", true),
    GENERAL('g', hls.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', hls.FLOAT, "-#0+ ", true);

    public static final hlq[] k = new hlq[26];
    public final char l;
    public final hls m;
    public final int n;
    public final String o;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    static {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hlq.<clinit>():void");
    }

    hlq(char c, hls hlsVar, String str, boolean z) {
        this.l = c;
        this.m = hlsVar;
        hlr hlrVar = hlr.a;
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int a = hlr.a(str.charAt(i2));
            if (a < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i |= 1 << a;
        }
        this.n = i;
        this.o = "%" + c;
    }
}
