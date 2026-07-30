package defpackage;

import android.R;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.StatFs;
import android.util.Log;
import android.view.KeyEvent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.Utility;
import com.google.firebase.encoders.json.BuildConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class z71 implements k93 {
    public static x01 A;
    public static final int[] m = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] n = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] o = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] p = {R.attr.name, R.attr.pathData};
    public static final my q = new my(-1260796322, new ww(7), false);
    public static final my r = new my(614912259, new ww(8), false);
    public static final my s = new my(-1155264539, new ww(9), false);
    public static final d11 t = new d11(false);
    public static final ng0 u = new ng0("NO_OWNER", 1);
    public static final nm1 v = new nm1(22);
    public static final nm1 w = new nm1(23);
    public static final nm1 x = new nm1(24);
    public static final ak0 y = new ak0(0, 0);
    public static x01 z;

    public static String A(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final dc2 B(jj1 jj1Var) {
        Object i = jj1Var.i();
        if (i instanceof dc2) {
            return (dc2) i;
        }
        return null;
    }

    public static final td2 C(u53 u53Var) {
        ar0 g = dq2.g(u53Var, new h90(1), 4);
        return (td2) ((js0) g.n).x(d82.a(td2.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final int D(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final float E(dc2 dc2Var) {
        if (dc2Var != null) {
            return dc2Var.a;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void F(xd0 xd0Var) {
        if (((ul1) xd0Var).m.z) {
            s03.H(xd0Var, 1).X0();
        }
    }

    public static final jo2 G(a50 a50Var, CoroutineContext coroutineContext, d50 d50Var, Function2 function2) {
        CoroutineContext b = r40.b(a50Var, coroutineContext);
        d50Var.getClass();
        jo2 ic1Var = d50Var == d50.n ? new ic1(b, function2) : new jo2(b, true);
        ic1Var.n0(d50Var, ic1Var, function2);
        return ic1Var;
    }

    public static /* synthetic */ jo2 H(a50 a50Var, CoroutineContext coroutineContext, Function2 function2, int i) {
        d50 d50Var = d50.p;
        if ((i & 1) != 0) {
            coroutineContext = h.m;
        }
        if ((i & 2) != 0) {
            d50Var = d50.m;
        }
        return G(a50Var, coroutineContext, d50Var, function2);
    }

    public static vs I(Context context) {
        List list;
        context.getClass();
        InputStream open = context.getAssets().open("care_seed.json");
        open.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, yt.b), Utility.DEFAULT_STREAM_BUFFER_SIZE);
        try {
            String r2 = yh2.r(bufferedReader);
            bufferedReader.close();
            JSONObject jSONObject = new JSONObject(r2);
            JSONArray optJSONArray = jSONObject.optJSONArray("warnings");
            le1 b = pv.b();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("slugs");
                    String optString = jSONObject2.optString("id");
                    optString.getClass();
                    String optString2 = jSONObject2.getJSONObject("title").optString("ru");
                    optString2.getClass();
                    String optString3 = jSONObject2.getJSONObject("title").optString("en");
                    optString3.getClass();
                    String optString4 = jSONObject2.getJSONObject("note").optString("ru");
                    optString4.getClass();
                    String optString5 = jSONObject2.getJSONObject("note").optString("en");
                    optString5.getClass();
                    if (optJSONArray2 == null) {
                        list = ah0.m;
                    } else {
                        int length2 = optJSONArray2.length();
                        ArrayList arrayList = new ArrayList(length2);
                        for (int i2 = 0; i2 < length2; i2++) {
                            arrayList.add(optJSONArray2.getString(i2));
                        }
                        list = arrayList;
                    }
                    b.add(new xs(optString, optString2, optString3, optString4, optString5, list));
                }
            }
            le1 a = pv.a(b);
            JSONArray optJSONArray3 = jSONObject.optJSONArray("storage");
            le1 b2 = pv.b();
            if (optJSONArray3 != null) {
                int length3 = optJSONArray3.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    JSONObject jSONObject3 = optJSONArray3.getJSONObject(i3);
                    String optString6 = jSONObject3.getJSONObject("title").optString("ru");
                    optString6.getClass();
                    String optString7 = jSONObject3.getJSONObject("title").optString("en");
                    optString7.getClass();
                    String optString8 = jSONObject3.getJSONObject(SDKConstants.PARAM_A2U_BODY).optString("ru");
                    optString8.getClass();
                    String optString9 = jSONObject3.getJSONObject(SDKConstants.PARAM_A2U_BODY).optString("en");
                    optString9.getClass();
                    b2.add(new ws(optString6, optString7, optString8, optString9));
                }
            }
            return new vs(a, pv.a(b2));
        } finally {
        }
    }

    public static mx0 J(String... strArr) {
        if (strArr.length % 2 != 0) {
            lh.e("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                lh.e("Headers cannot be null");
                return null;
            }
            strArr2[i2] = up2.K(str).toString();
        }
        int G = l41.G(0, strArr2.length - 1, 2);
        if (G >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                h(str2);
                i(str3, str2);
                if (i == G) {
                    break;
                }
                i += 2;
            }
        }
        return new mx0(strArr2);
    }

    public static final int K(oa1 oa1Var, ww1 ww1Var) {
        return (int) (ww1Var == ww1.m ? oa1Var.o & 4294967295L : oa1Var.o >> 32);
    }

    public static final sh1 L(w3 w3Var, Function1 function1, a00 a00Var) {
        final w3 w3Var2;
        zn1 k = ij2.k(w3Var, a00Var);
        final zn1 k2 = ij2.k(function1, a00Var);
        Object[] objArr = new Object[0];
        Object M = a00Var.M();
        Object obj = sz.a;
        if (M == obj) {
            M = new e4(1);
            a00Var.i0(M);
        }
        final String str = (String) ll3.R(objArr, (Function0) M, a00Var, 48);
        m4 m4Var = (m4) a00Var.j(if1.a);
        if (m4Var == null) {
            a00Var.X(1213380307);
            Object obj2 = (Context) a00Var.j(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(obj2 instanceof ContextWrapper)) {
                    obj2 = null;
                    break;
                }
                if (obj2 instanceof m4) {
                    break;
                }
                obj2 = ((ContextWrapper) obj2).getBaseContext();
            }
            m4Var = (m4) obj2;
        } else {
            a00Var.X(1213379439);
        }
        a00Var.q(false);
        if (m4Var == null) {
            lh.g("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        final i4 activityResultRegistry = m4Var.getActivityResultRegistry();
        Object M2 = a00Var.M();
        if (M2 == obj) {
            M2 = new c4();
            a00Var.i0(M2);
        }
        final c4 c4Var = (c4) M2;
        Object M3 = a00Var.M();
        if (M3 == obj) {
            M3 = new sh1(c4Var, k);
            a00Var.i0(M3);
        }
        sh1 sh1Var = (sh1) M3;
        boolean h = a00Var.h(c4Var) | a00Var.h(activityResultRegistry) | a00Var.f(str) | a00Var.h(w3Var) | a00Var.f(k2);
        Object M4 = a00Var.M();
        if (h || M4 == obj) {
            w3Var2 = w3Var;
            M4 = new Function1() { // from class: j4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    h4 c = activityResultRegistry.c(str, w3Var2, new k4(0, k2));
                    c4 c4Var2 = c4.this;
                    c4Var2.a = c;
                    return new l4(0, c4Var2);
                }
            };
            a00Var.i0(M4);
        } else {
            w3Var2 = w3Var;
        }
        Function1 function12 = (Function1) M4;
        boolean f = a00Var.f(activityResultRegistry) | a00Var.f(str) | a00Var.f(w3Var2);
        Object M5 = a00Var.M();
        if (f || M5 == obj) {
            M5 = new ac0(function12);
            a00Var.i0(M5);
        }
        return sh1Var;
    }

    public static final boolean M(tn1 tn1Var, Object obj, Object obj2) {
        Object g = tn1Var.g(obj);
        if (g == null) {
            return false;
        }
        if (!(g instanceof un1)) {
            if (!g.equals(obj2)) {
                return false;
            }
            tn1Var.k(obj);
            return true;
        }
        un1 un1Var = (un1) g;
        boolean k = un1Var.k(obj2);
        if (k && un1Var.g()) {
            tn1Var.k(obj);
        }
        return k;
    }

    public static final void N(tn1 tn1Var, Object obj) {
        boolean z2;
        long[] jArr = tn1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = tn1Var.b[i4];
                        Object obj3 = tn1Var.c[i4];
                        if (obj3 instanceof un1) {
                            un1 un1Var = (un1) obj3;
                            un1Var.k(obj);
                            z2 = un1Var.g();
                        } else {
                            z2 = obj3 == obj;
                        }
                        if (z2) {
                            tn1Var.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void O(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final Object P(CoroutineContext coroutineContext, Function2 function2) {
        pi0 pi0Var;
        CoroutineContext a;
        Thread currentThread = Thread.currentThread();
        g gVar = e.d;
        if (((e) coroutineContext.m(gVar)) == null) {
            pi0Var = bx2.a();
            a = r40.a(h.m, coroutineContext.p(pi0Var), true);
            t80 t80Var = vb0.a;
            if (a != t80Var && a.m(gVar) == null) {
                a = a.p(t80Var);
            }
        } else {
            pi0Var = (pi0) bx2.a.get();
            a = r40.a(h.m, coroutineContext, true);
            t80 t80Var2 = vb0.a;
            if (a != t80Var2 && a.m(gVar) == null) {
                a = a.p(t80Var2);
            }
        }
        qo qoVar = new qo(a, currentThread, pi0Var);
        qoVar.n0(d50.m, qoVar, function2);
        pi0 pi0Var2 = qoVar.s;
        if (pi0Var2 != null) {
            int i = pi0.r;
            pi0Var2.T(false);
        }
        while (!Thread.interrupted()) {
            try {
                long U = pi0Var2 != null ? pi0Var2.U() : Long.MAX_VALUE;
                if (!(qoVar.O() instanceof v11)) {
                    if (pi0Var2 != null) {
                        int i2 = pi0.r;
                        pi0Var2.R(false);
                    }
                    Object Y = j8.Y(qoVar.O());
                    gx gxVar = Y instanceof gx ? (gx) Y : null;
                    if (gxVar == null) {
                        return Y;
                    }
                    throw gxVar.a;
                }
                LockSupport.parkNanos(qoVar, U);
            } catch (Throwable th) {
                if (pi0Var2 != null) {
                    int i3 = pi0.r;
                    pi0Var2.R(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        qoVar.u(interruptedException);
        throw interruptedException;
    }

    public static final String Q(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R(int i, Object obj, m92 m92Var, jq0 jq0Var, int i2) {
        Object[] objArr;
        Object[] objArr2;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z2 = false;
        int i3 = 0;
        z2 = false;
        if ((i & 1) != 0 && !Intrinsics.b(m92Var.b, jq0Var)) {
            jq0 jq0Var2 = jq0.p;
            if (jq0Var.compareTo(jq0Var2) >= 0 && Intrinsics.c(m92Var.b.m, jq0Var2.m) < 0) {
                objArr = true;
                if ((i & 2) != 0) {
                    m92Var.getClass();
                    if (i2 != 0) {
                        objArr2 = true;
                        if (objArr2 == true && objArr != true) {
                            return obj;
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            int i4 = objArr != false ? jq0Var.m : m92Var.b.m;
                            if (objArr2 != true) {
                                m92Var.getClass();
                            } else if (i2 == 1) {
                                z2 = true;
                            }
                            return km.a((Typeface) obj, i4, z2);
                        }
                        Object[] objArr3 = objArr2 == true && i2 == 1;
                        if (objArr3 == true && objArr == true) {
                            i3 = 3;
                        } else if (objArr == true) {
                            i3 = 1;
                        } else if (objArr3 != false) {
                            i3 = 2;
                        }
                        return Typeface.create((Typeface) obj, i3);
                    }
                }
                objArr2 = false;
                if (objArr2 == true) {
                }
                if (Build.VERSION.SDK_INT >= 28) {
                }
            }
        }
        objArr = false;
        if ((i & 2) != 0) {
        }
        objArr2 = false;
        if (objArr2 == true) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
        }
    }

    public static final void S(List list, oa oaVar) {
        Path path;
        int i;
        float f;
        int i2;
        l02 l02Var;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        oa oaVar2 = oaVar;
        Path path2 = oaVar2.a;
        Path path3 = oaVar2.a;
        Path.FillType fillType = path2.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z2 = fillType == fillType2;
        path3.rewind();
        if (!z2) {
            fillType2 = Path.FillType.WINDING;
        }
        path3.setFillType(fillType2);
        l02 l02Var2 = list2.isEmpty() ? tz1.c : (l02) list2.get(0);
        int size = list2.size();
        float f10 = 0.0f;
        int i3 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i3 < size) {
            l02 l02Var3 = (l02) list2.get(i3);
            if (l02Var3 instanceof tz1) {
                path3.close();
                path = path3;
                i = size;
                f = f10;
                i2 = i3;
                l02Var = l02Var3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (l02Var3 instanceof f02) {
                    f02 f02Var = (f02) l02Var3;
                    float f17 = f02Var.c;
                    f13 += f17;
                    float f18 = f02Var.d;
                    f14 += f18;
                    path3.rMoveTo(f17, f18);
                    path = path3;
                    i = size;
                    f = f10;
                    i2 = i3;
                    f15 = f13;
                    f16 = f14;
                } else {
                    if (l02Var3 instanceof xz1) {
                        xz1 xz1Var = (xz1) l02Var3;
                        float f19 = xz1Var.c;
                        float f20 = xz1Var.d;
                        path3.moveTo(f19, f20);
                        f14 = f20;
                        f16 = f14;
                        path = path3;
                        f13 = f19;
                        f15 = f13;
                    } else {
                        if (l02Var3 instanceof e02) {
                            e02 e02Var = (e02) l02Var3;
                            float f21 = e02Var.d;
                            float f22 = e02Var.c;
                            path3.rLineTo(f22, f21);
                            f13 += f22;
                            f14 += f21;
                        } else if (l02Var3 instanceof wz1) {
                            wz1 wz1Var = (wz1) l02Var3;
                            float f23 = wz1Var.d;
                            float f24 = wz1Var.c;
                            oaVar2.c(f24, f23);
                            f13 = f24;
                            path = path3;
                            f14 = f23;
                        } else if (l02Var3 instanceof d02) {
                            float f25 = ((d02) l02Var3).c;
                            path3.rLineTo(f25, f10);
                            f13 += f25;
                        } else if (l02Var3 instanceof vz1) {
                            float f26 = ((vz1) l02Var3).c;
                            oaVar2.c(f26, f14);
                            f13 = f26;
                        } else {
                            if (l02Var3 instanceof j02) {
                                f9 = ((j02) l02Var3).c;
                                path3.rLineTo(f10, f9);
                            } else if (l02Var3 instanceof k02) {
                                float f27 = ((k02) l02Var3).c;
                                oaVar2.c(f13, f27);
                                f14 = f27;
                            } else if (l02Var3 instanceof c02) {
                                c02 c02Var = (c02) l02Var3;
                                path3.rCubicTo(c02Var.c, c02Var.d, c02Var.e, c02Var.f, c02Var.g, c02Var.h);
                                f11 = c02Var.e + f13;
                                f12 = c02Var.f + f14;
                                f13 += c02Var.g;
                                f9 = c02Var.h;
                            } else {
                                if (l02Var3 instanceof uz1) {
                                    uz1 uz1Var = (uz1) l02Var3;
                                    path3.cubicTo(uz1Var.c, uz1Var.d, uz1Var.e, uz1Var.f, uz1Var.g, uz1Var.h);
                                    f11 = uz1Var.e;
                                    f12 = uz1Var.f;
                                    f5 = uz1Var.g;
                                    f6 = uz1Var.h;
                                } else if (l02Var3 instanceof h02) {
                                    if (l02Var2.a) {
                                        f8 = f14 - f12;
                                        f7 = f13 - f11;
                                    } else {
                                        f7 = f10;
                                        f8 = f7;
                                    }
                                    h02 h02Var = (h02) l02Var3;
                                    path3.rCubicTo(f7, f8, h02Var.c, h02Var.d, h02Var.e, h02Var.f);
                                    f11 = h02Var.c + f13;
                                    f12 = h02Var.d + f14;
                                    f13 += h02Var.e;
                                    f9 = h02Var.f;
                                } else if (l02Var3 instanceof zz1) {
                                    if (l02Var2.a) {
                                        f13 = (f13 * 2.0f) - f11;
                                        f14 = (2.0f * f14) - f12;
                                    }
                                    zz1 zz1Var = (zz1) l02Var3;
                                    path3.cubicTo(f13, f14, zz1Var.c, zz1Var.d, zz1Var.e, zz1Var.f);
                                    f11 = zz1Var.c;
                                    f12 = zz1Var.d;
                                    f5 = zz1Var.e;
                                    f6 = zz1Var.f;
                                } else if (l02Var3 instanceof g02) {
                                    g02 g02Var = (g02) l02Var3;
                                    float f28 = g02Var.f;
                                    float f29 = g02Var.e;
                                    float f30 = g02Var.d;
                                    float f31 = g02Var.c;
                                    path3.rQuadTo(f31, f30, f29, f28);
                                    float f32 = f31 + f13;
                                    float f33 = f30 + f14;
                                    f13 += f29;
                                    f14 += f28;
                                    f11 = f32;
                                    path = path3;
                                    f12 = f33;
                                } else {
                                    if (l02Var3 instanceof yz1) {
                                        yz1 yz1Var = (yz1) l02Var3;
                                        float f34 = yz1Var.f;
                                        float f35 = yz1Var.e;
                                        float f36 = yz1Var.d;
                                        f4 = yz1Var.c;
                                        path3.quadTo(f4, f36, f35, f34);
                                        path = path3;
                                        f14 = f34;
                                        f13 = f35;
                                        f12 = f36;
                                    } else if (l02Var3 instanceof i02) {
                                        if (l02Var2.b) {
                                            f2 = f13 - f11;
                                            f3 = f14 - f12;
                                        } else {
                                            f2 = f10;
                                            f3 = f2;
                                        }
                                        i02 i02Var = (i02) l02Var3;
                                        float f37 = i02Var.d;
                                        float f38 = i02Var.c;
                                        path3.rQuadTo(f2, f3, f38, f37);
                                        f4 = f2 + f13;
                                        float f39 = f3 + f14;
                                        f13 += f38;
                                        f14 += f37;
                                        path = path3;
                                        f12 = f39;
                                    } else if (l02Var3 instanceof a02) {
                                        if (l02Var2.b) {
                                            f13 = (f13 * 2.0f) - f11;
                                            f14 = (2.0f * f14) - f12;
                                        }
                                        a02 a02Var = (a02) l02Var3;
                                        float f40 = a02Var.d;
                                        float f41 = a02Var.c;
                                        path3.quadTo(f13, f14, f41, f40);
                                        path = path3;
                                        i = size;
                                        f = f10;
                                        i2 = i3;
                                        f12 = f14;
                                        l02Var = l02Var3;
                                        f14 = f40;
                                        f11 = f13;
                                        f13 = f41;
                                    } else if (l02Var3 instanceof b02) {
                                        b02 b02Var = (b02) l02Var3;
                                        float f42 = b02Var.h + f13;
                                        float f43 = b02Var.i + f14;
                                        i = size;
                                        f = 0.0f;
                                        path = path3;
                                        i2 = i3;
                                        n(oaVar, f13, f14, f42, f43, b02Var.c, b02Var.d, b02Var.e, b02Var.f, b02Var.g);
                                        f11 = f42;
                                        f13 = f11;
                                        f12 = f43;
                                        f14 = f12;
                                        l02Var = l02Var3;
                                    } else {
                                        path = path3;
                                        i = size;
                                        f = f10;
                                        i2 = i3;
                                        if (!(l02Var3 instanceof sz1)) {
                                            a.b();
                                            return;
                                        }
                                        sz1 sz1Var = (sz1) l02Var3;
                                        float f44 = sz1Var.i;
                                        float f45 = sz1Var.h;
                                        l02Var = l02Var3;
                                        n(oaVar, f13, f14, f45, f44, sz1Var.c, sz1Var.d, sz1Var.e, sz1Var.f, sz1Var.g);
                                        f12 = f44;
                                        f14 = f12;
                                        f11 = f45;
                                        f13 = f11;
                                    }
                                    i = size;
                                    f = f10;
                                    i2 = i3;
                                    l02Var = l02Var3;
                                    f11 = f4;
                                }
                                f14 = f6;
                                path = path3;
                                f13 = f5;
                            }
                            f14 += f9;
                        }
                        path = path3;
                    }
                    i = size;
                    f = f10;
                    i2 = i3;
                }
                l02Var = l02Var3;
            }
            i3 = i2 + 1;
            list2 = list;
            oaVar2 = oaVar;
            size = i;
            path3 = path;
            l02Var2 = l02Var;
            f10 = f;
        }
    }

    public static final void T(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            StringBuilder sb = new StringBuilder("OffsetMapping.originalToTransformed returned invalid mapping: ");
            sb.append(i3);
            sb.append(" -> ");
            sb.append(i);
            sb.append(" is not in range of transformed text [0, ");
            b71.h(q40.o(sb, i2, ']'));
        }
    }

    public static final void U(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            StringBuilder sb = new StringBuilder("OffsetMapping.transformedToOriginal returned invalid mapping: ");
            sb.append(i3);
            sb.append(" -> ");
            sb.append(i);
            sb.append(" is not in range of original text [0, ");
            b71.h(q40.o(sb, i2, ']'));
        }
    }

    public static final Object V(CoroutineContext coroutineContext, Function2 function2, o30 o30Var) {
        Object Y;
        CoroutineContext context = o30Var.getContext();
        CoroutineContext p2 = !((Boolean) coroutineContext.y(Boolean.FALSE, new ww(17))).booleanValue() ? context.p(coroutineContext) : r40.a(context, coroutineContext, false);
        l41.C(p2);
        if (p2 == context) {
            we2 we2Var = new we2(o30Var, p2);
            Y = mi2.p(we2Var, we2Var, function2);
        } else {
            s30 s30Var = e.d;
            if (Intrinsics.b(p2.m(s30Var), context.m(s30Var))) {
                x13 x13Var = new x13(o30Var, p2);
                CoroutineContext coroutineContext2 = x13Var.q;
                Object c = zw2.c(coroutineContext2, null);
                try {
                    Object p3 = mi2.p(x13Var, x13Var, function2);
                    zw2.a(coroutineContext2, c);
                    Y = p3;
                } catch (Throwable th) {
                    zw2.a(coroutineContext2, c);
                    throw th;
                }
            } else {
                qb0 qb0Var = new qb0(o30Var, p2);
                gs.a(function2, qb0Var, qb0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = qb0.s;
                while (true) {
                    int i = atomicIntegerFieldUpdater.get(qb0Var);
                    if (i != 0) {
                        if (i != 2) {
                            lh.g("Already suspended");
                            return null;
                        }
                        Y = j8.Y(qb0Var.O());
                        if (Y instanceof gx) {
                            throw ((gx) Y).a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(qb0Var, 0, 1)) {
                        Y = b50.m;
                        break;
                    }
                }
            }
        }
        b50 b50Var = b50.m;
        return Y;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(defpackage.ur2 r8, defpackage.hn r9) {
        /*
            boolean r0 = r9 instanceof defpackage.z20
            if (r0 == 0) goto L13
            r0 = r9
            z20 r0 = (defpackage.z20) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            z20 r0 = new z20
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.n
            b50 r1 = defpackage.b50.m
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ur2 r8 = r0.m
            defpackage.ca2.b(r9)
            goto L40
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.lh.g(r8)
            r8 = 0
            return r8
        L30:
            defpackage.ca2.b(r9)
        L33:
            r0.m = r8
            r0.o = r3
            n22 r9 = defpackage.n22.n
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L40
            return r1
        L40:
            m22 r9 = (defpackage.m22) r9
            int r2 = r9.b
            java.util.List r9 = r9.a
            r2 = r2 & 66
            if (r2 == 0) goto L33
            int r2 = r9.size()
            r4 = 0
            r5 = r4
        L50:
            if (r5 >= r2) goto L69
            java.lang.Object r6 = r9.get(r5)
            t22 r6 = (defpackage.t22) r6
            boolean r7 = r6.b()
            if (r7 != 0) goto L33
            boolean r7 = r6.h
            if (r7 != 0) goto L33
            boolean r6 = r6.d
            if (r6 == 0) goto L33
            int r5 = r5 + 1
            goto L50
        L69:
            java.lang.Object r8 = r9.get(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z71.a(ur2, hn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0080 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(List list, q60 q60Var, r30 r30Var) {
        j60 j60Var;
        int i;
        List list2;
        c82 c82Var;
        Iterator it;
        Throwable th;
        if (r30Var instanceof j60) {
            j60Var = (j60) r30Var;
            int i2 = j60Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j60Var.p = i2 - Integer.MIN_VALUE;
                Object obj = j60Var.o;
                Object obj2 = b50.m;
                i = j60Var.p;
                o30 o30Var = null;
                int i3 = 1;
                if (i != 0) {
                    ca2.b(obj);
                    ArrayList arrayList = new ArrayList();
                    kc kcVar = new kc(list, arrayList, o30Var, i3);
                    j60Var.m = arrayList;
                    j60Var.p = 1;
                    if (q60Var.a(kcVar, j60Var) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = j60Var.n;
                        c82Var = (c82) j60Var.m;
                        try {
                            ca2.b(obj);
                        } catch (Throwable th2) {
                            Object obj3 = c82Var.m;
                            if (obj3 == null) {
                                c82Var.m = th2;
                            } else {
                                wi0.a((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            Function1 function1 = (Function1) it.next();
                            j60Var.m = c82Var;
                            j60Var.n = it;
                            j60Var.p = 2;
                            if (function1.invoke(j60Var) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) c82Var.m;
                        if (th == null) {
                            return Unit.a;
                        }
                        throw th;
                    }
                    list2 = (List) j60Var.m;
                    ca2.b(obj);
                }
                c82Var = new c82();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) c82Var.m;
                if (th == null) {
                }
            }
        }
        j60Var = new j60(r30Var);
        Object obj4 = j60Var.o;
        Object obj22 = b50.m;
        i = j60Var.p;
        o30 o30Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        c82Var = new c82();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) c82Var.m;
        if (th == null) {
        }
    }

    public static final String c(Object[] objArr, int i, int i2, s0 s0Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == s0Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final void d(tn1 tn1Var, Object obj, Object obj2) {
        int f = tn1Var.f(obj);
        boolean z2 = f < 0;
        Object obj3 = z2 ? null : tn1Var.c[f];
        if (obj3 != null) {
            if (obj3 instanceof un1) {
                ((un1) obj3).a(obj2);
            } else if (obj3 != obj2) {
                un1 un1Var = new un1();
                un1Var.a(obj3);
                un1Var.a(obj2);
                obj2 = un1Var;
            }
            obj2 = obj3;
        }
        if (!z2) {
            tn1Var.c[f] = obj2;
            return;
        }
        int i = ~f;
        tn1Var.b[i] = obj;
        tn1Var.c[i] = obj2;
    }

    public static int e(boolean[] zArr, int i, int[] iArr, boolean z2) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z2;
                i4++;
                i++;
            }
            i2 += i3;
            z2 = !z2;
        }
        return i2;
    }

    public static i90 g(a50 a50Var, bx0 bx0Var, Function2 function2, int i) {
        CoroutineContext coroutineContext = bx0Var;
        if ((i & 1) != 0) {
            coroutineContext = h.m;
        }
        d50 d50Var = d50.m;
        CoroutineContext b = r40.b(a50Var, coroutineContext);
        d50 d50Var2 = d50.m;
        i90 i90Var = new i90(b, true);
        i90Var.n0(d50Var, i90Var, function2);
        return i90Var;
    }

    public static void h(String str) {
        if (str.length() <= 0) {
            lh.e("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                lh.c(n33.f("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                return;
            }
        }
    }

    public static void i(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                lh.c(n33.f("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2).concat(n33.n(str2) ? BuildConfig.FLAVOR : ": ".concat(str)));
                return;
            }
        }
    }

    public static final Object j(o30 o30Var, ym0 ym0Var, xt0 xt0Var, xm0[] xm0VarArr) {
        vw vwVar = new vw(null, ym0Var, xt0Var, xm0VarArr);
        zm0 zm0Var = new zm0(o30Var, o30Var.getContext());
        Object p2 = mi2.p(zm0Var, zm0Var, vwVar);
        return p2 == b50.m ? p2 : Unit.a;
    }

    public static tn1 k() {
        long[] jArr = oe2.a;
        return new tn1();
    }

    public static final b72 l(Context context) {
        final mh mhVar = new mh(context, 11);
        Context context2 = (Context) mhVar.p;
        r80 r80Var = (r80) mhVar.n;
        final int i = 0;
        y91 b = ya1.b(new Function0() { // from class: o01
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2;
                int i3;
                y62 y62Var;
                int i4 = i;
                mh mhVar2 = mhVar;
                switch (i4) {
                    case 0:
                        Context context3 = (Context) mhVar2.p;
                        Bitmap.Config[] configArr = l.a;
                        double d = 0.2d;
                        try {
                            Object systemService = context3.getSystemService((Class<Object>) ActivityManager.class);
                            systemService.getClass();
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        r5 r5Var = new r5();
                        r5Var.b = new LinkedHashMap();
                        if (d > 0.0d) {
                            Bitmap.Config[] configArr2 = l.a;
                            try {
                                Object systemService2 = context3.getSystemService((Class<Object>) ActivityManager.class);
                                systemService2.getClass();
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                i3 = (context3.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                i3 = 256;
                            }
                            i2 = (int) (d * i3 * 1024.0d * 1024.0d);
                        } else {
                            i2 = 0;
                        }
                        return new e72(i2 > 0 ? new tt1(i2, r5Var) : new ar0(28, r5Var), r5Var);
                    default:
                        by1 by1Var = by1.y;
                        Context context4 = (Context) mhVar2.p;
                        synchronized (by1Var) {
                            try {
                                y62Var = by1.z;
                                if (y62Var == null) {
                                    e71 e71Var = gl0.a;
                                    t80 t80Var = vb0.a;
                                    j80 j80Var = j80.o;
                                    Bitmap.Config[] configArr3 = l.a;
                                    File cacheDir = context4.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File e = ul0.e(cacheDir);
                                    String str = qz1.n;
                                    qz1 s2 = nm1.s(e);
                                    long j = 10485760;
                                    try {
                                        File file = s2.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        j = d.d((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                    } catch (Exception unused3) {
                                    }
                                    y62 y62Var2 = new y62(j, j80Var, e71Var, s2);
                                    by1.z = y62Var2;
                                    y62Var = y62Var2;
                                }
                            } finally {
                            }
                        }
                        return y62Var;
                }
            }
        });
        final int i2 = 1;
        y91 b2 = ya1.b(new Function0() { // from class: o01
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22;
                int i3;
                y62 y62Var;
                int i4 = i2;
                mh mhVar2 = mhVar;
                switch (i4) {
                    case 0:
                        Context context3 = (Context) mhVar2.p;
                        Bitmap.Config[] configArr = l.a;
                        double d = 0.2d;
                        try {
                            Object systemService = context3.getSystemService((Class<Object>) ActivityManager.class);
                            systemService.getClass();
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        r5 r5Var = new r5();
                        r5Var.b = new LinkedHashMap();
                        if (d > 0.0d) {
                            Bitmap.Config[] configArr2 = l.a;
                            try {
                                Object systemService2 = context3.getSystemService((Class<Object>) ActivityManager.class);
                                systemService2.getClass();
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                i3 = (context3.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                i3 = 256;
                            }
                            i22 = (int) (d * i3 * 1024.0d * 1024.0d);
                        } else {
                            i22 = 0;
                        }
                        return new e72(i22 > 0 ? new tt1(i22, r5Var) : new ar0(28, r5Var), r5Var);
                    default:
                        by1 by1Var = by1.y;
                        Context context4 = (Context) mhVar2.p;
                        synchronized (by1Var) {
                            try {
                                y62Var = by1.z;
                                if (y62Var == null) {
                                    e71 e71Var = gl0.a;
                                    t80 t80Var = vb0.a;
                                    j80 j80Var = j80.o;
                                    Bitmap.Config[] configArr3 = l.a;
                                    File cacheDir = context4.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File e = ul0.e(cacheDir);
                                    String str = qz1.n;
                                    qz1 s2 = nm1.s(e);
                                    long j = 10485760;
                                    try {
                                        File file = s2.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        j = d.d((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                    } catch (Exception unused3) {
                                    }
                                    y62 y62Var2 = new y62(j, j80Var, e71Var, s2);
                                    by1.z = y62Var2;
                                    y62Var = y62Var2;
                                }
                            } finally {
                            }
                        }
                        return y62Var;
                }
            }
        });
        y91 b3 = ya1.b(new e4(6));
        ah0 ah0Var = ah0.m;
        return new b72(context2, r80Var, b, b2, b3, new gy(ah0Var, ah0Var, ah0Var, ah0Var, ah0Var), (p01) mhVar.o);
    }

    public static final pd2 m(wm1 wm1Var) {
        pd2 pd2Var;
        LinkedHashMap linkedHashMap = wm1Var.a;
        zd2 zd2Var = (zd2) linkedHashMap.get(v);
        Bundle bundle = null;
        if (zd2Var == null) {
            lh.e("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        u53 u53Var = (u53) linkedHashMap.get(w);
        if (u53Var == null) {
            lh.e("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(x);
        String str = (String) linkedHashMap.get(ar0.p);
        if (str == null) {
            lh.e("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        vd2 b = zd2Var.getSavedStateRegistry().b();
        sd2 sd2Var = b instanceof sd2 ? (sd2) b : null;
        if (sd2Var == null) {
            lh.g("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = C(u53Var).b;
        pd2 pd2Var2 = (pd2) linkedHashMap2.get(str);
        if (pd2Var2 != null) {
            return pd2Var2;
        }
        sd2Var.b();
        Bundle bundle3 = sd2Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                mi1.c();
                bundle4 = iv1.o((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                sd2Var.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            pd2Var = new pd2();
        } else {
            ClassLoader classLoader = pd2.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            uh1 uh1Var = new uh1(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                uh1Var.put(str2, bundle2.get(str2));
            }
            pd2Var = new pd2(uh1Var.b());
        }
        linkedHashMap2.put(str, pd2Var);
        return pd2Var;
    }

    public static final void n(oa oaVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z2, boolean z3) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            n(oaVar, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z2, z3);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = d16 * sqrt2;
        double d23 = sqrt2 * d17;
        if (z2 == z3) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = Math.atan2(d13 - d9, d12 - d8);
        double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
        if (z3 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * cos) - (d25 * sin);
        double d27 = (d25 * cos) + (d24 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d28 = -d10;
        double d29 = d28 * cos2;
        double d30 = d6 * sin2;
        double d31 = (d29 * sin3) - (d30 * cos3);
        double d32 = d28 * sin2;
        double d33 = d6 * cos2;
        double d34 = (cos3 * d33) + (sin3 * d32);
        double d35 = atan22 / ceil;
        double d36 = atan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < ceil) {
            double d40 = d36 + d35;
            double sin4 = Math.sin(d40);
            double cos4 = Math.cos(d40);
            int i2 = ceil;
            double d41 = (((d10 * cos2) * cos4) + d26) - (d30 * sin4);
            double d42 = (d33 * sin4) + (d10 * sin2 * cos4) + d27;
            double d43 = (d29 * sin4) - (d30 * cos4);
            double d44 = (cos4 * d33) + (sin4 * d32);
            double d45 = d40 - d36;
            double tan = Math.tan(d45 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            oaVar.a.cubicTo((float) ((d37 * sqrt3) + d), (float) ((d38 * sqrt3) + d39), (float) (d41 - (sqrt3 * d43)), (float) (d42 - (sqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            sin2 = sin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            ceil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    public static final void o(sm1 sm1Var, ls lsVar, cq cqVar, float f, dk2 dk2Var, xt2 xt2Var, ae0 ae0Var) {
        ArrayList arrayList = sm1Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            az1 az1Var = (az1) arrayList.get(i);
            az1Var.a.g(lsVar, cqVar, f, dk2Var, xt2Var, ae0Var);
            lsVar.h(0.0f, az1Var.a.b());
        }
    }

    public static final void p(zd2 zd2Var) {
        zc1 b = zd2Var.getLifecycle().b();
        if (b != zc1.n && b != zc1.o) {
            lh.e("Failed requirement.");
        } else if (zd2Var.getSavedStateRegistry().b() == null) {
            sd2 sd2Var = new sd2(zd2Var.getSavedStateRegistry(), (u53) zd2Var);
            zd2Var.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", sd2Var);
            zd2Var.getLifecycle().a(new v72(4, sd2Var));
        }
    }

    public static final xy2 r(ch2 ch2Var, yd ydVar) {
        ch2Var.getClass();
        int length = ydVar.n.length();
        int length2 = ydVar.n.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            T(i, length2, i);
        }
        T(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            U(i2, length, i2);
        }
        U(length2, length, length2);
        return new xy2(ydVar, new ak0(ydVar.n.length(), ydVar.n.length()));
    }

    public static ol1 s(ol1 ol1Var, u81 u81Var, pw2 pw2Var, ca0 ca0Var, hp0 hp0Var) {
        if (ol1Var != null && u81Var == ol1Var.a && Intrinsics.b(pw2Var, ol1Var.b) && ca0Var.d() == ol1Var.c.d() && hp0Var == ol1Var.d) {
            return ol1Var;
        }
        ol1 ol1Var2 = ol1.h;
        if (ol1Var2 != null && u81Var == ol1Var2.a && Intrinsics.b(pw2Var, ol1Var2.b) && ca0Var.d() == ol1Var2.c.d() && hp0Var == ol1Var2.d) {
            return ol1Var2;
        }
        ol1 ol1Var3 = new ol1(u81Var, ci2.i(pw2Var, u81Var), ca0Var, hp0Var);
        ol1.h = ol1Var3;
        return ol1Var3;
    }

    public static s52 t(String str) {
        if (str.equals("http/1.0")) {
            return s52.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return s52.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return s52.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return s52.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return s52.SPDY_3;
        }
        if (str.equals("quic")) {
            return s52.QUIC;
        }
        dm0.j("Unexpected protocol: ".concat(str));
        return null;
    }

    public static final x01 u() {
        x01 x01Var = z;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        ah0 ah0Var = y33.a;
        nn2 nn2Var = new nn2(aw.b);
        lx0 lx0Var = new lx0(1);
        lx0Var.k(20.0f, 11.0f);
        lx0Var.g(7.83f);
        lx0Var.j(5.59f, -5.59f);
        lx0Var.i(12.0f, 4.0f);
        lx0Var.j(-8.0f, 8.0f);
        lx0Var.j(8.0f, 8.0f);
        lx0Var.j(1.41f, -1.41f);
        lx0Var.i(7.83f, 13.0f);
        lx0Var.g(20.0f);
        lx0Var.p(-2.0f);
        lx0Var.d();
        w01.a(w01Var, lx0Var.m, nn2Var);
        x01 b = w01Var.b();
        z = b;
        return b;
    }

    public static final x01 w() {
        x01 x01Var = A;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Filled.FavoriteBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        ah0 ah0Var = y33.a;
        nn2 nn2Var = new nn2(aw.b);
        lx0 lx0Var = new lx0(1);
        lx0Var.k(16.5f, 3.0f);
        lx0Var.f(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
        lx0Var.e(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
        lx0Var.e(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
        lx0Var.f(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
        lx0Var.i(12.0f, 21.35f);
        lx0Var.j(1.45f, -1.32f);
        lx0Var.e(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
        lx0Var.e(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
        lx0Var.d();
        lx0Var.k(12.1f, 18.55f);
        lx0Var.j(-0.1f, 0.1f);
        lx0Var.j(-0.1f, -0.1f);
        lx0Var.e(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
        lx0Var.e(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
        lx0Var.f(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
        lx0Var.h(1.87f);
        lx0Var.e(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
        lx0Var.f(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
        lx0Var.f(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
        lx0Var.d();
        w01.a(w01Var, lx0Var.m, nn2Var);
        x01 b = w01Var.b();
        A = b;
        return b;
    }

    public static final long x(KeyEvent keyEvent) {
        return s93.l(keyEvent.getKeyCode());
    }

    public static Intent y(re reVar) {
        Intent parentActivityIntent = reVar.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String A2 = A(reVar, reVar.getComponentName());
            if (A2 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(reVar, A2);
            try {
                return A(reVar, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + A2 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent z(Context context, ComponentName componentName) {
        String A2 = A(context, componentName);
        if (A2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), A2);
        return A(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @Override // defpackage.k93
    public eo f(String str, int i, EnumMap enumMap) {
        if (str.isEmpty()) {
            lh.e("Found empty contents");
            return null;
        }
        int v2 = v();
        gh0 gh0Var = gh0.r;
        if (enumMap.containsKey(gh0Var)) {
            v2 = Integer.parseInt(enumMap.get(gh0Var).toString());
        }
        boolean[] q2 = q(str);
        int length = q2.length;
        int i2 = v2 + length;
        int max = Math.max(200, i2);
        int max2 = Math.max(1, 200);
        int i3 = max / i2;
        int i4 = (max - (length * i3)) / 2;
        eo eoVar = new eo(max, max2);
        int i5 = 0;
        while (i5 < length) {
            if (q2[i5]) {
                eoVar.c(i4, 0, i3, max2);
            }
            i5++;
            i4 += i3;
        }
        return eoVar;
    }

    public abstract boolean[] q(String str);

    public int v() {
        return 10;
    }
}
