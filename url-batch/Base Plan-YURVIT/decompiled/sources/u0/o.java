package u0;

import F.C0032n;
import java.util.Locale;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3038a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3039b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3040c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3041d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3042e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3043f;

    /* renamed from: g, reason: collision with root package name */
    public final p f3044g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f3045h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3046i;

    /* renamed from: j, reason: collision with root package name */
    public final C0032n f3047j;

    /* renamed from: k, reason: collision with root package name */
    public final String[] f3048k;

    /* renamed from: l, reason: collision with root package name */
    public final o[] f3049l;

    /* renamed from: m, reason: collision with root package name */
    public final Locale[] f3050m;

    public o(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, p pVar, Integer num, String str, C0032n c0032n, String[] strArr, o[] oVarArr, Locale[] localeArr) {
        this.f3038a = z2;
        this.f3039b = z3;
        this.f3040c = z4;
        this.f3041d = z5;
        this.f3042e = z6;
        this.f3043f = i2;
        this.f3044g = pVar;
        this.f3045h = num;
        this.f3046i = str;
        this.f3047j = c0032n;
        this.f3048k = strArr;
        this.f3049l = oVarArr;
        this.f3050m = localeArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 u0.o, still in use, count: 2, list:
          (r8v1 u0.o) from 0x021e: PHI (r8v2 u0.o) = (r8v1 u0.o), (r8v4 u0.o) binds: [B:68:0x0211, B:75:0x04fc] A[DONT_GENERATE, DONT_INLINE]
          (r8v1 u0.o) from 0x01e8: MOVE (r30v5 u0.o) = (r8v1 u0.o) (LINE:489)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static u0.o a(org.json.JSONObject r35) {
        /*
            Method dump skipped, instructions count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.o.a(org.json.JSONObject):u0.o");
    }
}
