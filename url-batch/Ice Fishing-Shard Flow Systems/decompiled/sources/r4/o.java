package r4;

import com.google.firebase.messaging.z;
import java.util.Locale;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7507a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7508b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7509c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7510d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7511e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7512f;

    /* renamed from: g, reason: collision with root package name */
    public final p f7513g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f7514h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7515i;
    public final z j;

    /* renamed from: k, reason: collision with root package name */
    public final String[] f7516k;

    /* renamed from: l, reason: collision with root package name */
    public final o[] f7517l;

    /* renamed from: m, reason: collision with root package name */
    public final Locale[] f7518m;

    public o(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i2, p pVar, Integer num, String str, z zVar, String[] strArr, o[] oVarArr, Locale[] localeArr) {
        this.f7507a = z7;
        this.f7508b = z8;
        this.f7509c = z9;
        this.f7510d = z10;
        this.f7511e = z11;
        this.f7512f = i2;
        this.f7513g = pVar;
        this.f7514h = num;
        this.f7515i = str;
        this.j = zVar;
        this.f7516k = strArr;
        this.f7517l = oVarArr;
        this.f7518m = localeArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 r4.o, still in use, count: 2, list:
          (r8v1 r4.o) from 0x021e: PHI (r8v2 r4.o) = (r8v1 r4.o), (r8v4 r4.o) binds: [B:68:0x0211, B:75:0x04fc] A[DONT_GENERATE, DONT_INLINE]
          (r8v1 r4.o) from 0x01e8: MOVE (r30v5 r4.o) = (r8v1 r4.o) (LINE:489)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static r4.o a(org.json.JSONObject r35) {
        /*
            Method dump skipped, instructions count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.o.a(org.json.JSONObject):r4.o");
    }
}
