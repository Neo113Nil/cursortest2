package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.internal.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class e7 extends pc0 implements Function2 {
    public static final e7 A;
    public static final e7 B;
    public static final e7 C;
    public static final e7 D;
    public static final e7 E;
    public static final e7 F;
    public static final e7 G;
    public static final e7 H;
    public static final e7 I;
    public static final e7 e;
    public static final e7 g;
    public static final e7 h;
    public static final e7 i;
    public static final e7 j;
    public static final e7 k;
    public static final e7 l;
    public static final e7 m;
    public static final e7 n;
    public static final e7 o;
    public static final e7 p;
    public static final e7 q;
    public static final e7 r;
    public static final e7 s;
    public static final e7 t;
    public static final e7 u;
    public static final e7 v;
    public static final e7 w;
    public static final e7 x;
    public static final e7 y;
    public static final e7 z;
    public final /* synthetic */ int d;

    static {
        int i2 = 2;
        e = new e7(i2, 0);
        g = new e7(i2, 1);
        h = new e7(i2, 2);
        i = new e7(i2, 3);
        j = new e7(i2, 4);
        k = new e7(i2, 5);
        l = new e7(i2, 6);
        m = new e7(i2, 7);
        n = new e7(i2, 8);
        o = new e7(i2, 9);
        p = new e7(i2, 10);
        q = new e7(i2, 11);
        r = new e7(i2, 12);
        s = new e7(i2, 13);
        t = new e7(i2, 14);
        u = new e7(i2, 15);
        v = new e7(i2, 16);
        w = new e7(i2, 17);
        x = new e7(i2, 18);
        y = new e7(i2, 19);
        z = new e7(i2, 20);
        A = new e7(i2, 21);
        B = new e7(i2, 22);
        C = new e7(i2, 23);
        D = new e7(i2, 24);
        E = new e7(i2, 25);
        F = new e7(i2, 26);
        G = new e7(i2, 27);
        H = new e7(i2, 28);
        I = new e7(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [eo0] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [eo0] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27, types: [zl0] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [zl0] */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v58 */
    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i2 = 1;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                m90.k((jd0) obj).setUpdateBlock((Function1) obj2);
                return Unit.a;
            case 1:
                m90.k((jd0) obj).setReleaseBlock((Function1) obj2);
                return Unit.a;
            case 2:
                m90.k((jd0) obj).setModifier((am0) obj2);
                return Unit.a;
            case 3:
                m90.k((jd0) obj).setDensity((nr) obj2);
                return Unit.a;
            case 4:
                m90.k((jd0) obj).setLifecycleOwner((vg0) obj2);
                return Unit.a;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                m90.k((jd0) obj).setSavedStateRegistryOwner((e61) obj2);
                return Unit.a;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                pn1 k2 = m90.k((jd0) obj);
                int ordinal = ((vc0) obj2).ordinal();
                if (ordinal == 0) {
                    i2 = 0;
                } else if (ordinal != 1) {
                    l.a();
                    return null;
                }
                k2.setLayoutDirection(i2);
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = (String) obj;
                yl0 yl0Var = (yl0) obj2;
                if (str.length() == 0) {
                    return yl0Var.toString();
                }
                return str + ", " + yl0Var;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                hl hlVar = (hl) obj;
                int intValue = ((Number) obj2).intValue();
                if (!hlVar.O(intValue & 1, (intValue & 3) != 2)) {
                    hlVar.R();
                }
                return Unit.a;
            case 9:
                hl hlVar2 = (hl) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!hlVar2.O(intValue2 & 1, (intValue2 & 3) != 2)) {
                    hlVar2.R();
                }
                return Unit.a;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                ((Number) obj2).intValue();
                ((yk) obj).getClass();
                return Unit.a;
            case RequestError.STOP_TRACKING /* 11 */:
                ((jd0) ((yk) obj)).a0((vk0) obj2);
                return Unit.a;
            case 12:
                ((jd0) ((yk) obj)).b0((am0) obj2);
                return Unit.a;
            case 13:
                wl wlVar = (wl) obj2;
                jd0 jd0Var = (jd0) ((yk) obj);
                jd0Var.F = wlVar;
                l7 l7Var = jd0Var.J;
                ke1 ke1Var = yl.h;
                kw0 kw0Var = (kw0) wlVar;
                kw0Var.getClass();
                jd0Var.X((nr) m90.I(kw0Var, ke1Var));
                kw0 kw0Var2 = (kw0) wlVar;
                vc0 vc0Var = (vc0) m90.I(kw0Var2, yl.n);
                if (jd0Var.D != vc0Var) {
                    jd0Var.D = vc0Var;
                    jd0Var.C();
                    jd0 s2 = jd0Var.s();
                    if (s2 != null) {
                        s2.A();
                    }
                    jd0Var.B();
                    for (zl0 zl0Var = (zl0) l7Var.g; zl0Var != null; zl0Var = zl0Var.j) {
                        zl0Var.j0();
                    }
                }
                jd0Var.c0((on1) m90.I(kw0Var2, yl.s));
                zl0 zl0Var2 = (zl0) l7Var.g;
                if ((zl0Var2.h & 32768) != 0) {
                    while (zl0Var2 != null) {
                        if ((zl0Var2.g & 32768) != 0) {
                            zq zqVar = zl0Var2;
                            ?? r0 = 0;
                            while (zqVar != 0) {
                                if (zqVar instanceof ul) {
                                    zl0 zl0Var3 = ((zl0) ((ul) zqVar)).d;
                                    if (zl0Var3.r) {
                                        rp0.c(zl0Var3);
                                    } else {
                                        zl0Var3.n = true;
                                    }
                                } else if ((zqVar.g & 32768) != 0 && (zqVar instanceof zq)) {
                                    zl0 zl0Var4 = zqVar.t;
                                    int i3 = 0;
                                    r0 = r0;
                                    zqVar = zqVar;
                                    while (zl0Var4 != null) {
                                        if ((zl0Var4.g & 32768) != 0) {
                                            i3++;
                                            r0 = r0;
                                            if (i3 == 1) {
                                                zqVar = zl0Var4;
                                            } else {
                                                if (r0 == 0) {
                                                    r0 = new eo0(new zl0[16]);
                                                }
                                                if (zqVar != 0) {
                                                    r0.b(zqVar);
                                                    zqVar = 0;
                                                }
                                                r0.b(zl0Var4);
                                            }
                                        }
                                        zl0Var4 = zl0Var4.j;
                                        r0 = r0;
                                        zqVar = zqVar;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                zqVar = op.o(r0);
                            }
                        }
                        if ((zl0Var2.h & 32768) != 0) {
                            zl0Var2 = zl0Var2.j;
                        }
                    }
                }
                return Unit.a;
            case 14:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = nv.d;
                }
                return CollectionsKt.u(collection, list);
            case 15:
                return (a5) obj;
            case 16:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 17:
                return (an) obj;
            case 18:
                return (l5) obj;
            case 19:
                return (Unit) obj;
            case 20:
                return (Unit) obj;
            case 21:
                return (Unit) obj;
            case 22:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 23:
                e41 e41Var = (e41) obj;
                ((e41) obj2).getClass();
                return e41Var;
            case 24:
                return (u91) obj;
            case 25:
                return (String) obj;
            case 26:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 27:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 28:
                return (String) obj;
            default:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
        }
    }
}
