package defpackage;

import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gs1 extends o81 implements Function1 {
    public static final gs1 A;
    public static final gs1 B;
    public static final gs1 C;
    public static final gs1 D;
    public static final gs1 E;
    public static final gs1 F;
    public static final gs1 G;
    public static final gs1 H;
    public static final gs1 I;
    public static final gs1 J;
    public static final gs1 K;
    public static final gs1 L;
    public static final gs1 M;
    public static final gs1 N;
    public static final gs1 O;
    public static final gs1 P;
    public static final gs1 Q;
    public static final gs1 n;
    public static final gs1 o;
    public static final gs1 p;
    public static final gs1 q;
    public static final gs1 r;
    public static final gs1 s;
    public static final gs1 t;
    public static final gs1 u;
    public static final gs1 v;
    public static final gs1 w;
    public static final gs1 x;
    public static final gs1 y;
    public static final gs1 z;
    public final /* synthetic */ int m;

    static {
        int i = 1;
        n = new gs1(i, 0);
        o = new gs1(i, 1);
        p = new gs1(i, 2);
        q = new gs1(i, 3);
        r = new gs1(i, 4);
        s = new gs1(i, 5);
        t = new gs1(i, 6);
        u = new gs1(i, 7);
        v = new gs1(i, 8);
        w = new gs1(i, 9);
        x = new gs1(i, 10);
        y = new gs1(i, 11);
        z = new gs1(i, 12);
        A = new gs1(i, 13);
        B = new gs1(i, 14);
        C = new gs1(i, 15);
        D = new gs1(i, 16);
        E = new gs1(i, 17);
        F = new gs1(i, 18);
        G = new gs1(i, 19);
        H = new gs1(i, 20);
        I = new gs1(i, 21);
        J = new gs1(i, 22);
        K = new gs1(i, 23);
        L = new gs1(i, 24);
        M = new gs1(i, 25);
        N = new gs1(i, 26);
        O = new gs1(i, 27);
        P = new gs1(i, 28);
        Q = new gs1(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gs1(int i, int i2) {
        super(i);
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                ks1 ks1Var = (ks1) obj;
                if (ks1Var.E() && ks1Var.q1(true)) {
                    i91 i91Var = ks1Var.A;
                    m91 m91Var = i91Var.Q;
                    if (m91Var.l > 0) {
                        if (m91Var.k || m91Var.j) {
                            i91Var.V(false);
                        }
                        m91Var.p.q0();
                    }
                    i91Var.O();
                    t7 t7Var = (t7) l91.a(i91Var);
                    x72 rectManager = t7Var.getRectManager();
                    if (ks1Var == i91Var.P.d) {
                        rectManager.g(i91Var, false);
                        rectManager.e(i91Var);
                    } else {
                        rectManager.f(i91Var);
                    }
                    if (i91Var.X > 0) {
                        tt1 tt1Var = t7Var.c0.e;
                        tt1Var.getClass();
                        if (i91Var.X > 0) {
                            ((eo1) tt1Var.n).b(i91Var);
                            i91Var.W = true;
                        }
                        t7Var.F(null);
                    }
                }
                return Unit.a;
            case 1:
                yt1 yt1Var = (yt1) obj;
                if (yt1Var.E()) {
                    yt1Var.m.L();
                }
                return Unit.a;
            case 2:
                return Unit.a;
            case 3:
                i91 i91Var2 = (i91) obj;
                if (i91Var2.I()) {
                    i91Var2.V(false);
                }
                return Unit.a;
            case 4:
                i91 i91Var3 = (i91) obj;
                if (i91Var3.I()) {
                    i91Var3.V(false);
                }
                return Unit.a;
            case 5:
                i91 i91Var4 = (i91) obj;
                if (i91Var4.I()) {
                    i91Var4.T(false);
                }
                return Unit.a;
            case 6:
                i91 i91Var5 = (i91) obj;
                if (i91Var5.I()) {
                    i91Var5.T(false);
                }
                return Unit.a;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                i91 i91Var6 = (i91) obj;
                if (i91Var6.I()) {
                    i91.U(i91Var6, false, 7);
                }
                return Unit.a;
            case 8:
                i91 i91Var7 = (i91) obj;
                if (i91Var7.I()) {
                    i91.W(i91Var7, false, 7);
                }
                return Unit.a;
            case 9:
                i91 i91Var8 = (i91) obj;
                if (i91Var8.I()) {
                    i91Var8.G();
                }
                return Unit.a;
            case 10:
                return Unit.a;
            case 11:
                return Unit.a;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                m32 m32Var = (m32) obj;
                if (m32Var.isAttachedToWindow()) {
                    m32Var.m();
                }
                return Unit.a;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return Unit.a;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return Integer.valueOf(((af2) obj).b);
            case 15:
                u31 u31Var = ((af2) obj).c;
                return Integer.valueOf(u31Var.d - u31Var.b);
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                return new jf2(((Number) obj).intValue());
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return Boolean.valueOf(!(((t22) obj).i == 2));
            case 18:
                t71[] t71VarArr = ii2.a;
                ji2 ji2Var = gi2.e;
                Unit unit = Unit.a;
                ((sh2) obj).d(ji2Var, unit);
                return unit;
            case 19:
                long j = ((au1) obj).a;
                return ap.D(j) ? new pd(au1.d(j), au1.e(j)) : oh2.a;
            case 20:
                pd pdVar = (pd) obj;
                return new au1(ap.i(pdVar.a, pdVar.b));
            case 21:
                return Unit.a;
            case 22:
                t71[] t71VarArr2 = ii2.a;
                ji2 ji2Var2 = gi2.l;
                t71 t71Var = ii2.a[5];
                ((sh2) obj).d(ji2Var2, Boolean.TRUE);
                return Unit.a;
            case 23:
                ((Number) obj).floatValue();
                return Unit.a;
            case 24:
                xu2 xu2Var = (xu2) obj;
                long j2 = xu2Var.f;
                int i = jw2.c;
                return new w90(((int) (j2 & 4294967295L)) - ti2.f((int) (j2 & 4294967295L), xu2Var.g.n), 0);
            case Constants.MAX_TREE_DEPTH /* 25 */:
                xu2 xu2Var2 = (xu2) obj;
                String str = xu2Var2.g.n;
                long j3 = xu2Var2.f;
                int i2 = jw2.c;
                int e = ti2.e((int) (j3 & 4294967295L), str);
                if (e != -1) {
                    return new w90(0, e - ((int) (xu2Var2.f & 4294967295L)));
                }
                return null;
            case 26:
                xu2 xu2Var3 = (xu2) obj;
                Integer d = xu2Var3.d();
                if (d == null) {
                    return null;
                }
                int intValue = d.intValue();
                long j4 = xu2Var3.f;
                int i3 = jw2.c;
                return new w90(((int) (j4 & 4294967295L)) - intValue, 0);
            case 27:
                xu2 xu2Var4 = (xu2) obj;
                Integer c = xu2Var4.c();
                if (c == null) {
                    return null;
                }
                int intValue2 = c.intValue();
                long j5 = xu2Var4.f;
                int i4 = jw2.c;
                return new w90(0, intValue2 - ((int) (j5 & 4294967295L)));
            case 28:
                xu2 xu2Var5 = (xu2) obj;
                cu1 cu1Var = xu2Var5.d;
                bw2 bw2Var = xu2Var5.c;
                Integer valueOf = bw2Var != null ? Integer.valueOf(cu1Var.b(bw2Var.h(bw2Var.e(cu1Var.g(jw2.e(xu2Var5.f)))))) : null;
                if (valueOf == null) {
                    return null;
                }
                int intValue3 = valueOf.intValue();
                long j6 = xu2Var5.f;
                int i5 = jw2.c;
                return new w90(((int) (j6 & 4294967295L)) - intValue3, 0);
            default:
                xu2 xu2Var6 = (xu2) obj;
                Integer b = xu2Var6.b();
                if (b == null) {
                    return null;
                }
                int intValue4 = b.intValue();
                long j7 = xu2Var6.f;
                int i6 = jw2.c;
                return new w90(0, intValue4 - ((int) (j7 & 4294967295L)));
        }
    }
}
