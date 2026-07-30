package m0;

import java.util.Locale;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f820a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f821b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f822c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f823d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f824e;

    /* renamed from: f, reason: collision with root package name */
    public final int f825f;

    /* renamed from: g, reason: collision with root package name */
    public final p f826g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f827h;

    /* renamed from: i, reason: collision with root package name */
    public final String f828i;

    /* renamed from: j, reason: collision with root package name */
    public final c0.e f829j;

    /* renamed from: k, reason: collision with root package name */
    public final String[] f830k;

    /* renamed from: l, reason: collision with root package name */
    public final o[] f831l;
    public final Locale[] m;

    public o(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, p pVar, Integer num, String str, c0.e eVar, String[] strArr, o[] oVarArr, Locale[] localeArr) {
        this.f820a = z2;
        this.f821b = z3;
        this.f822c = z4;
        this.f823d = z5;
        this.f824e = z6;
        this.f825f = i2;
        this.f826g = pVar;
        this.f827h = num;
        this.f828i = str;
        this.f829j = eVar;
        this.f830k = strArr;
        this.f831l = oVarArr;
        this.m = localeArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 m0.o, still in use, count: 2, list:
          (r8v1 m0.o) from 0x021e: PHI (r8v2 m0.o) = (r8v1 m0.o), (r8v4 m0.o) binds: [B:68:0x0211, B:75:0x04fc] A[DONT_GENERATE, DONT_INLINE]
          (r8v1 m0.o) from 0x01e8: MOVE (r30v5 m0.o) = (r8v1 m0.o) (LINE:489)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static m0.o a(org.json.JSONObject r35) {
        /*
            Method dump skipped, instructions count: 1736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.o.a(org.json.JSONObject):m0.o");
    }
}
