package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j50 implements f, af0, ak, n31, vb1, zg1, if1, px0, to0, g9, j9, ym, dc1, mp0 {
    public static j50 e;
    public final /* synthetic */ int d;
    public static final kd g = new kd(-1.0f, -1.0f);
    public static final kd h = new kd(0.0f, -1.0f);
    public static final kd i = new kd(1.0f, -1.0f);
    public static final kd j = new kd(-1.0f, 0.0f);
    public static final kd k = new kd(0.0f, 0.0f);
    public static final kd l = new kd(1.0f, 0.0f);
    public static final kd m = new kd(-1.0f, 1.0f);
    public static final kd n = new kd(0.0f, 1.0f);
    public static final kd o = new kd(1.0f, 1.0f);
    public static final jd p = new jd(-1.0f);
    public static final jd q = new jd(0.0f);
    public static final jd r = new jd(1.0f);
    public static final id s = new id(-1.0f);
    public static final id t = new id(0.0f);
    public static final /* synthetic */ j50 u = new j50(2);
    public static final j50 v = new j50(3);
    public static final j50 w = new j50(4);
    public static final j50 x = new j50(5);
    public static final j50 y = new j50(6);
    public static final /* synthetic */ j50 z = new j50(7);
    public static final j50 A = new j50(8);
    public static final j50 B = new j50(9);
    public static final j50 C = new j50(10);
    public static final /* synthetic */ j50 D = new j50(11);
    public static final /* synthetic */ j50 E = new j50(12);

    public j50(d4 d4Var) {
        this.d = 13;
        ox0.a.getClass();
    }

    public static final float p(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i2 = -(binarySearch + 1);
        int i3 = i2 - 1;
        if (i3 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i3 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i3];
            float f10 = fArr[i2];
            f2 = fArr2[i3];
            f3 = f9;
            f4 = fArr2[i2];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (abs - f3) / (f5 - f3)))) + f2) * signum;
    }

    public static Typeface q(String str, x20 x20Var, int i2) {
        if (i2 == 0 && Intrinsics.a(x20Var, x20.i) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), x20Var.d, i2 == 1);
    }

    public static xf1 s(Pair[] pairArr) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            arrayList.add(new hi(((hi) pair.e).a));
        }
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair pair2 : pairArr) {
            arrayList2.add(Float.valueOf(((Number) pair2.d).floatValue()));
        }
        return new xf1(arrayList, arrayList2);
    }

    public static final ku1 t(PackageInfo packageInfo, ku1... ku1VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            mu1 mu1Var = new mu1(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < ku1VarArr.length; i2++) {
                if (ku1VarArr[i2].equals(mu1Var)) {
                    return ku1VarArr[i2];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean u(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z2;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z2 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z2 ? t(packageInfo2, ou1.a) : t(packageInfo2, ou1.a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z2 = true;
        if (packageInfo != null) {
            if ((!z2 ? t(packageInfo2, ou1.a) : t(packageInfo2, ou1.a[0])) == null) {
            }
        }
        return false;
    }

    @Override // defpackage.g9, defpackage.j9
    public float a() {
        return 0.0f;
    }

    @Override // defpackage.vb1
    public boolean b(Object obj, Object obj2) {
        switch (this.d) {
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                break;
            default:
                if (obj == obj2) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.zg1
    public long c() {
        int i2 = hi.h;
        return hi.g;
    }

    @Override // defpackage.ym
    public long d(long j2, long j3) {
        float v2 = uq1.v(j2, j3);
        long floatToRawIntBits = (Float.floatToRawIntBits(v2) << 32) | (Float.floatToRawIntBits(v2) & 4294967295L);
        int i2 = p61.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.ak
    public Object f(mc mcVar) {
        Object f = mcVar.f(new v01(nd.class, Executor.class));
        f.getClass();
        return new ow((Executor) f);
    }

    @Override // defpackage.mp0
    public boolean g(zl0 zl0Var) {
        return false;
    }

    @Override // defpackage.mp0
    public int h() {
        return 8;
    }

    @Override // defpackage.mp0
    public void i(jd0 jd0Var, long j2, i60 i60Var, int i2, boolean z2) {
        l7 l7Var = jd0Var.J;
        qp0 qp0Var = (qp0) l7Var.e;
        o31 o31Var = qp0.Q;
        ((qp0) l7Var.e).O0(qp0.T, qp0Var.G0(j2), i60Var, 1, z2);
    }

    @Override // defpackage.zg1
    public op j() {
        return null;
    }

    @Override // defpackage.zg1
    public float k() {
        return Float.NaN;
    }

    @Override // defpackage.j9
    public void l(xk0 xk0Var, int i2, int[] iArr, int[] iArr2) {
        yr1.W(i2, iArr, iArr2, false);
    }

    @Override // defpackage.g9
    public void m(xk0 xk0Var, int i2, int[] iArr, vc0 vc0Var, int[] iArr2) {
        if (vc0Var == vc0.d) {
            yr1.W(i2, iArr, iArr2, false);
        } else {
            yr1.W(i2, iArr, iArr2, true);
        }
    }

    @Override // defpackage.if1
    public zu1 n(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i2 = t41.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? t80.p(bundle) : t80.p(null);
    }

    @Override // defpackage.mp0
    public boolean o(jd0 jd0Var) {
        h81 v2 = jd0Var.v();
        boolean z2 = false;
        if (v2 != null && v2.h) {
            z2 = true;
        }
        return !z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fb, code lost:
    
        if (r11 != r14) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(Context context, String str, fn fnVar) {
        rx rxVar;
        tn tnVar;
        int i2;
        rz rzVar;
        ix ixVar;
        Context context2;
        Context context3;
        String appsFlyerUID;
        String a;
        wc1 wc1Var;
        Context context4;
        String str2;
        String str3;
        ix ixVar2;
        if (fnVar instanceof rx) {
            rxVar = (rx) fnVar;
            int i3 = rxVar.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rxVar.r = i3 - Integer.MIN_VALUE;
                Object obj = rxVar.p;
                tnVar = tn.d;
                i2 = rxVar.r;
                zc1 zc1Var = zc1.a;
                if (i2 != 0) {
                    ca0.v(obj);
                    Context applicationContext = context.getApplicationContext();
                    ix ixVar3 = new ix();
                    if (StringsKt.n("https://featherrdash.com/config.php") || StringsKt.n(str)) {
                        return Unit.a;
                    }
                    applicationContext.getClass();
                    rzVar = new rz(applicationContext);
                    applicationContext.getApplicationContext();
                    rxVar.h = str;
                    rxVar.i = applicationContext;
                    rxVar.j = ixVar3;
                    rxVar.k = rzVar;
                    rxVar.l = applicationContext;
                    rxVar.r = 1;
                    Object a2 = hx.a.a(rxVar);
                    if (a2 != tnVar) {
                        ixVar = ixVar3;
                        context2 = applicationContext;
                        obj = a2;
                        context3 = context2;
                    }
                    return tnVar;
                }
                if (i2 == 1) {
                    context2 = rxVar.l;
                    rz rzVar2 = rxVar.k;
                    ix ixVar4 = rxVar.j;
                    context3 = rxVar.i;
                    String str4 = rxVar.h;
                    ca0.v(obj);
                    rzVar = rzVar2;
                    str = str4;
                    ixVar = ixVar4;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca0.v(obj);
                        bd1 bd1Var = (bd1) obj;
                        if ((bd1Var instanceof ad1) || Intrinsics.a(bd1Var, yc1.a) || Intrinsics.a(bd1Var, zc1Var)) {
                            return Unit.a;
                        }
                        l.a();
                        return null;
                    }
                    str2 = rxVar.o;
                    str3 = rxVar.n;
                    wc1Var = rxVar.m;
                    context4 = rxVar.l;
                    ixVar2 = rxVar.j;
                    ca0.v(obj);
                    xc1 h2 = t80.h(context4, wc1Var, str3, str2, (String) obj);
                    rxVar.h = null;
                    rxVar.i = null;
                    rxVar.j = null;
                    rxVar.k = null;
                    rxVar.l = null;
                    rxVar.m = null;
                    rxVar.n = null;
                    rxVar.o = null;
                    rxVar.r = 3;
                    ixVar2.getClass();
                    if (StringsKt.n("https://featherrdash.com/config.php")) {
                        nq nqVar = ls.a;
                        obj = uq1.V(fq.g, new k8(ixVar2, h2, (dn) null), rxVar);
                    } else {
                        obj = zc1Var;
                    }
                }
                wc1 wc1Var2 = (wc1) obj;
                appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(context3);
                if (appsFlyerUID == null) {
                    appsFlyerUID = "";
                }
                rxVar.h = null;
                rxVar.i = null;
                rxVar.j = ixVar;
                rxVar.k = null;
                rxVar.l = context2;
                rxVar.m = wc1Var2;
                rxVar.n = appsFlyerUID;
                rxVar.o = str;
                rxVar.r = 2;
                a = rzVar.a();
                if (a != tnVar) {
                    wc1Var = wc1Var2;
                    obj = a;
                    context4 = context2;
                    str2 = str;
                    str3 = appsFlyerUID;
                    ixVar2 = ixVar;
                    xc1 h22 = t80.h(context4, wc1Var, str3, str2, (String) obj);
                    rxVar.h = null;
                    rxVar.i = null;
                    rxVar.j = null;
                    rxVar.k = null;
                    rxVar.l = null;
                    rxVar.m = null;
                    rxVar.n = null;
                    rxVar.o = null;
                    rxVar.r = 3;
                    ixVar2.getClass();
                    if (StringsKt.n("https://featherrdash.com/config.php")) {
                    }
                }
                return tnVar;
            }
        }
        rxVar = new rx(this, fnVar);
        Object obj2 = rxVar.p;
        tnVar = tn.d;
        i2 = rxVar.r;
        zc1 zc1Var2 = zc1.a;
        if (i2 != 0) {
        }
        wc1 wc1Var22 = (wc1) obj2;
        appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(context3);
        if (appsFlyerUID == null) {
        }
        rxVar.h = null;
        rxVar.i = null;
        rxVar.j = ixVar;
        rxVar.k = null;
        rxVar.l = context2;
        rxVar.m = wc1Var22;
        rxVar.n = appsFlyerUID;
        rxVar.o = str;
        rxVar.r = 2;
        a = rzVar.a();
        if (a != tnVar) {
        }
        return tnVar;
    }

    public String toString() {
        switch (this.d) {
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return "NeverEqualPolicy";
            case 9:
                return "ReferentialEqualityPolicy";
            case 15:
                return "Arrangement#Center";
            case 18:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j50(int i2) {
        this.d = i2;
    }

    @Override // defpackage.af0
    public void cancel() {
    }

    @Override // defpackage.af0
    public void e() {
    }
}
