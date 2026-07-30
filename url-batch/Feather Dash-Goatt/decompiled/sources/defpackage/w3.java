package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class w3 extends pc0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(Object obj, int i, Object obj2) {
        super(0);
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [zl0] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [zl0] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean dispatchKeyEvent;
        boolean dispatchGenericMotionEvent;
        l81 l81Var;
        jd0 jd0Var;
        s11 s11Var;
        int i = this.d;
        Object obj = this.g;
        Object obj2 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                return Boolean.valueOf(dispatchKeyEvent);
            case 1:
                dispatchGenericMotionEvent = super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) obj);
                return Boolean.valueOf(dispatchGenericMotionEvent);
            case 2:
                k4 k4Var = (k4) obj;
                e71 e71Var = (e71) obj2;
                z61 z61Var = e71Var.i;
                z61 z61Var2 = e71Var.j;
                Float f = e71Var.g;
                Float f2 = e71Var.h;
                float floatValue = (z61Var == null || f == null) ? 0.0f : ((Number) z61Var.a.invoke()).floatValue() - f.floatValue();
                float floatValue2 = (z61Var2 == null || f2 == null) ? 0.0f : ((Number) z61Var2.a.invoke()).floatValue() - f2.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    int t = k4Var.t(e71Var.d);
                    n81 n81Var = (n81) k4Var.l().b(k4Var.p);
                    if (n81Var != null) {
                        try {
                            o1 o1Var = k4Var.r;
                            if (o1Var != null) {
                                o1Var.a.setBoundsInScreen(k4Var.d(n81Var));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    n81 n81Var2 = (n81) k4Var.l().b(k4Var.q);
                    if (n81Var2 != null) {
                        try {
                            o1 o1Var2 = k4Var.s;
                            if (o1Var2 != null) {
                                o1Var2.a.setBoundsInScreen(k4Var.d(n81Var2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    k4Var.h.invalidate();
                    n81 n81Var3 = (n81) k4Var.l().b(t);
                    if (n81Var3 != null && (l81Var = n81Var3.a) != null && (jd0Var = l81Var.c) != null) {
                        if (z61Var != null) {
                            k4Var.u.h(t, z61Var);
                        }
                        if (z61Var2 != null) {
                            k4Var.v.h(t, z61Var2);
                        }
                        k4Var.p(jd0Var);
                    }
                }
                if (z61Var != null) {
                    e71Var.g = (Float) z61Var.a.invoke();
                }
                if (z61Var2 != null) {
                    e71Var.h = (Float) z61Var2.a.invoke();
                }
                return Unit.a;
            case 3:
                Function0 function0 = (Function0) obj2;
                if (function0 != null && (s11Var = (s11) function0.invoke()) != null) {
                    return s11Var;
                }
                qp0 qp0Var = (qp0) obj;
                if (!qp0Var.J0().r) {
                    qp0Var = null;
                }
                if (qp0Var != null) {
                    return t90.c(0L, ca0.x(qp0Var.g));
                }
                return null;
            case 4:
                ((z11) obj2).d = mo.k((m10) obj, xw0.a);
                return Unit.a;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                ((z11) obj2).d = ((o10) obj).B0();
                return Unit.a;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                ((f60) obj2).d((zl0) obj);
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                l7 l7Var = ((jd0) obj2).J;
                z11 z11Var = (z11) obj;
                if ((((zl0) l7Var.g).h & 8) != 0) {
                    for (zl0 zl0Var = (ig1) l7Var.f; zl0Var != null; zl0Var = zl0Var.i) {
                        if ((zl0Var.g & 8) != 0) {
                            zq zqVar = zl0Var;
                            ?? r5 = 0;
                            while (zqVar != 0) {
                                if (zqVar instanceof j81) {
                                    j81 j81Var = (j81) zqVar;
                                    if (j81Var.Y()) {
                                        h81 h81Var = new h81();
                                        z11Var.d = h81Var;
                                        h81Var.h = true;
                                    }
                                    if (j81Var.Z()) {
                                        ((h81) z11Var.d).g = true;
                                    }
                                    j81Var.W((u81) z11Var.d);
                                } else if ((zqVar.g & 8) != 0 && (zqVar instanceof zq)) {
                                    zl0 zl0Var2 = zqVar.t;
                                    int i2 = 0;
                                    zqVar = zqVar;
                                    r5 = r5;
                                    while (zl0Var2 != null) {
                                        if ((zl0Var2.g & 8) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                zqVar = zl0Var2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new eo0(new zl0[16]);
                                                }
                                                if (zqVar != 0) {
                                                    r5.b(zqVar);
                                                    zqVar = 0;
                                                }
                                                r5.b(zl0Var2);
                                            }
                                        }
                                        zl0Var2 = zl0Var2.j;
                                        zqVar = zqVar;
                                        r5 = r5;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                zqVar = op.o(r5);
                            }
                        }
                    }
                }
                return Unit.a;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                o31 o31Var = qp0.Q;
                ((Function1) obj2).invoke(o31Var);
                qp0 qp0Var2 = (qp0) obj;
                u91 u91Var = qp0Var2.H;
                u91 u91Var2 = o31Var.n;
                boolean z = u91Var != u91Var2;
                boolean z2 = qp0Var2.I;
                boolean z3 = o31Var.o;
                boolean z4 = z2 != z3;
                if (z || z4) {
                    qp0Var2.H = u91Var2;
                    qp0Var2.I = z3;
                    if (qp0Var2.J && (z4 || (z3 && z))) {
                        qp0Var2.s.D();
                    }
                }
                qp0Var2.J = true;
                o31Var.t = o31Var.n.a(o31Var.p, o31Var.r, o31Var.q);
                return Unit.a;
            case 9:
                Context context = (Context) obj2;
                context.getClass();
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(((gy0) obj).a.concat(".preferences_pb")));
            default:
                SharedPreferences sharedPreferences = ((Context) obj2).getSharedPreferences((String) obj, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
        }
    }
}
