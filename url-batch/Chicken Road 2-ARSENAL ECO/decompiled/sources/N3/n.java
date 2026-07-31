package N3;

import java.util.Locale;
import u0.C0684n;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1732a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1733b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1734c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1735d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1736e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1737f;

    /* renamed from: g, reason: collision with root package name */
    public final o f1738g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f1739h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1740i;

    /* renamed from: j, reason: collision with root package name */
    public final C0684n f1741j;

    /* renamed from: k, reason: collision with root package name */
    public final String[] f1742k;

    /* renamed from: l, reason: collision with root package name */
    public final n[] f1743l;

    /* renamed from: m, reason: collision with root package name */
    public final Locale[] f1744m;

    public n(boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i7, o oVar, Integer num, String str, C0684n c0684n, String[] strArr, n[] nVarArr, Locale[] localeArr) {
        this.f1732a = z5;
        this.f1733b = z6;
        this.f1734c = z7;
        this.f1735d = z8;
        this.f1736e = z9;
        this.f1737f = i7;
        this.f1738g = oVar;
        this.f1739h = num;
        this.f1740i = str;
        this.f1741j = c0684n;
        this.f1742k = strArr;
        this.f1743l = nVarArr;
        this.f1744m = localeArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 N3.n, still in use, count: 2, list:
          (r8v1 N3.n) from 0x021e: PHI (r8v2 N3.n) = (r8v1 N3.n), (r8v4 N3.n) binds: [B:68:0x0211, B:75:0x04fc] A[DONT_GENERATE, DONT_INLINE]
          (r8v1 N3.n) from 0x01e8: MOVE (r30v5 N3.n) = (r8v1 N3.n) (LINE:489)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static N3.n a(org.json.JSONObject r35) {
        /*
            Method dump skipped, instructions count: 1740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.n.a(org.json.JSONObject):N3.n");
    }
}
