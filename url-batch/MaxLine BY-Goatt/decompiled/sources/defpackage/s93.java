package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.c;
import androidx.compose.foundation.gestures.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.majelw.libystne.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class s93 {
    public static final ng0 j;
    public static final ng0 k;
    public static final ng0 m;
    public static x01 r;
    public static final vh a = new vh(3);
    public static final vh b = new vh(2);
    public static final wh c = new wh();
    public static final by1 d = new by1(28);
    public static final by1 e = new by1(29);
    public static final my f = new my(-666057005, new py(3), false);
    public static final my g = new my(9103121, new py(4), false);
    public static final my h = new my(2097437484, new ww(12), false);
    public static final my i = new my(287533899, new ww(13), false);
    public static final k51 l = new k51();
    public static final String[] n = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", FirebaseAnalytics.Event.AD_IMPRESSION, FirebaseAnalytics.Event.SCREEN_VIEW, "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] o = {FirebaseAnalytics.Event.AD_IMPRESSION};
    public static final String[] p = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, "_err", "_f", "_v", "_iap", Constants.ScionAnalytics.EVENT_NOTIFICATION_DISMISS, Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND, Constants.ScionAnalytics.EVENT_NOTIFICATION_OPEN, Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE, "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN};
    public static final String[] q = {FirebaseAnalytics.Event.PURCHASE, FirebaseAnalytics.Event.REFUND, FirebaseAnalytics.Event.ADD_PAYMENT_INFO, FirebaseAnalytics.Event.ADD_SHIPPING_INFO, FirebaseAnalytics.Event.ADD_TO_CART, FirebaseAnalytics.Event.ADD_TO_WISHLIST, FirebaseAnalytics.Event.BEGIN_CHECKOUT, FirebaseAnalytics.Event.REMOVE_FROM_CART, FirebaseAnalytics.Event.SELECT_ITEM, FirebaseAnalytics.Event.SELECT_PROMOTION, FirebaseAnalytics.Event.VIEW_CART, FirebaseAnalytics.Event.VIEW_ITEM, FirebaseAnalytics.Event.VIEW_ITEM_LIST, FirebaseAnalytics.Event.VIEW_PROMOTION, "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", FirebaseAnalytics.Event.SELECT_CONTENT, FirebaseAnalytics.Event.VIEW_SEARCH_RESULTS};

    static {
        int i2 = 1;
        j = new ng0("REMOVED_TASK", i2);
        k = new ng0("CLOSED_EMPTY", i2);
        m = new ng0("NO_VALUE", i2);
    }

    public static final boolean A(t22 t22Var) {
        return (t22Var.b() || !t22Var.h || t22Var.d) ? false : true;
    }

    public static final boolean B(t22 t22Var) {
        return t22Var.h && !t22Var.d;
    }

    public static void C(String str, String str2, Object obj) {
        String G = G(str);
        if (Log.isLoggable(G, 3)) {
            Log.d(G, String.format(str2, obj));
        }
    }

    public static void D(String str, String str2, Exception exc) {
        String G = G(str);
        if (Log.isLoggable(G, 6)) {
            Log.e(G, str2, exc);
        }
    }

    public static final xm0 E(pk2 pk2Var, CoroutineContext coroutineContext, int i2, hq hqVar) {
        return ((i2 == 0 || i2 == -3) && hqVar == hq.m) ? pk2Var : new lt(pk2Var, coroutineContext, i2, hqVar);
    }

    public static void F(bf1 bf1Var) {
        if (!bf1Var.isDone()) {
            lh.g(zj2.j("Future was expected to be done: %s", bf1Var));
            return;
        }
        boolean z = false;
        while (true) {
            try {
                bf1Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static String G(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static final int H(nc2 nc2Var) {
        nc2Var.getClass();
        uc2 M = nc2Var.M("SELECT changes()");
        try {
            M.E();
            int i2 = (int) M.getLong(0);
            yk3.w(M, null);
            return i2;
        } finally {
        }
    }

    public static final boolean I(t22 t22Var, long j2, long j3) {
        int i2 = t22Var.i == 1 ? 1 : 0;
        long j4 = t22Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        float f2 = i2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32)) * f2;
        float f3 = ((int) (j2 >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f2;
        return (intBitsToFloat > f3) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j2 & 4294967295L)) + intBitsToFloat4);
    }

    public static final void J(sc1 sc1Var, nv2 nv2Var, cu1 cu1Var) {
        nm2 d2 = ci2.d();
        Function1 e2 = d2 != null ? d2.e() : null;
        nm2 f2 = ci2.f(d2);
        try {
            cw2 d3 = sc1Var.d();
            if (d3 == null) {
                return;
            }
            wv2 wv2Var = sc1Var.e;
            if (wv2Var == null) {
                return;
            }
            t81 c2 = sc1Var.c();
            if (c2 == null) {
                return;
            }
            uj2.c(nv2Var, sc1Var.a, d3.a, c2, wv2Var, sc1Var.b(), cu1Var);
            Unit unit = Unit.a;
        } finally {
            ci2.j(d2, f2, e2);
        }
    }

    public static void M(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void N(int i2, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float max = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z && iArr.length == 1) ? max : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + max;
            i3++;
            i7++;
        }
    }

    public static final Object O(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final long P(t22 t22Var, boolean z) {
        long f2 = au1.f(t22Var.c, t22Var.g);
        if (z || !t22Var.b()) {
            return f2;
        }
        return 0L;
    }

    public static final View Q(o90 o90Var) {
        if (!((ul1) o90Var).m.z) {
            h21.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) l91.a(s03.J(o90Var));
    }

    public static final vl1 R(vl1 vl1Var, uf2 uf2Var, ww1 ww1Var, boolean z, om0 om0Var, bn1 bn1Var, dy1 dy1Var, a00 a00Var, int i2) {
        px1 px1Var;
        vl1 vl1Var2;
        uf2 uf2Var2;
        ww1 ww1Var2;
        om0 om0Var2;
        bn1 bn1Var2;
        boolean z2;
        boolean z3;
        if ((i2 & 64) != 0) {
            dy1Var = null;
        }
        dy1 dy1Var2 = dy1Var;
        Context context = (Context) a00Var.j(AndroidCompositionLocals_androidKt.b);
        nx1 nx1Var = (nx1) a00Var.j(ox1.a);
        if (nx1Var != null) {
            a00Var.X(1586021609);
            boolean f2 = a00Var.f(context) | a00Var.f(nx1Var);
            Object M = a00Var.M();
            if (f2 || M == sz.a) {
                M = new q9(context, nx1Var);
                a00Var.i0(M);
            }
            px1Var = (q9) M;
            a00Var.q(false);
        } else {
            a00Var.X(1586120933);
            a00Var.q(false);
            px1Var = qb2.b0;
        }
        px1 px1Var2 = px1Var;
        ww1 ww1Var3 = ww1.m;
        vl1 k2 = vl1Var.k(ww1Var == ww1Var3 ? tu.b : tu.a).k(px1Var2.h());
        if (((u81) a00Var.j(p00.n)) != u81.n || ww1Var == ww1Var3) {
            vl1Var2 = k2;
            uf2Var2 = uf2Var;
            ww1Var2 = ww1Var;
            om0Var2 = om0Var;
            bn1Var2 = bn1Var;
            z2 = true;
            z3 = z;
        } else {
            vl1Var2 = k2;
            uf2Var2 = uf2Var;
            z3 = z;
            om0Var2 = om0Var;
            bn1Var2 = bn1Var;
            z2 = false;
            ww1Var2 = ww1Var;
        }
        return a.b(vl1Var2, uf2Var2, ww1Var2, px1Var2, z3, z2, om0Var2, bn1Var2, dy1Var2);
    }

    public static yh S(float f2) {
        return new yh(f2, true, sc.o);
    }

    public static final boolean T(Throwable th, Function0 function0) {
        oa0 oa0Var;
        th.getClass();
        List b2 = l.b(th);
        boolean z = false;
        if (b2 == null || !b2.isEmpty()) {
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof oa0) {
                    return false;
                }
            }
        }
        try {
            List list = (List) function0.invoke();
            boolean isEmpty = list.isEmpty();
            z = !isEmpty;
            oa0Var = !isEmpty ? new oa0(list) : null;
        } catch (Throwable th2) {
            oa0Var = th2;
        }
        if (oa0Var != null) {
            wi0.a(th, oa0Var);
        }
        return z;
    }

    public static final void a(Function0 function0, my myVar, vl1 vl1Var, Function2 function2, Function2 function22, Function2 function23, fk2 fk2Var, long j2, long j3, long j4, long j5, cb0 cb0Var, a00 a00Var, int i2) {
        long j6;
        cb0 cb0Var2;
        long j7;
        fk2 fk2Var2;
        long j8;
        vl1 vl1Var2;
        long j9;
        vl1 vl1Var3;
        fk2 fk2Var3;
        long j10;
        long j11;
        long j12;
        long j13;
        cb0 cb0Var3;
        a00Var.Z(-2081346864);
        if (((i2 | 306209152) & 306783379) == 306783378 && a00Var.B()) {
            a00Var.S();
            vl1Var3 = vl1Var;
            fk2Var3 = fk2Var;
            j10 = j2;
            j11 = j3;
            j12 = j4;
            j13 = j5;
            cb0Var3 = cb0Var;
        } else {
            a00Var.U();
            if ((i2 & 1) == 0 || a00Var.z()) {
                fk2 a2 = kk2.a(1, a00Var);
                long d2 = hw.d(38, a00Var);
                long d3 = hw.d(31, a00Var);
                long d4 = hw.d(18, a00Var);
                long d5 = hw.d(19, a00Var);
                j6 = d5;
                cb0Var2 = new cb0();
                j7 = d3;
                fk2Var2 = a2;
                j8 = d2;
                vl1Var2 = sl1.a;
                j9 = d4;
            } else {
                a00Var.S();
                vl1Var2 = vl1Var;
                fk2Var2 = fk2Var;
                j8 = j2;
                j7 = j3;
                j9 = j4;
                j6 = j5;
                cb0Var2 = cb0Var;
            }
            a00Var.r();
            e6.c(function0, myVar, vl1Var2, function2, function22, function23, fk2Var2, j8, j7, j9, j6, cb0Var2, a00Var, 1797558, 3456);
            vl1Var3 = vl1Var2;
            fk2Var3 = fk2Var2;
            j10 = j8;
            j11 = j7;
            j12 = j9;
            j13 = j6;
            cb0Var3 = cb0Var2;
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new s6(function0, myVar, vl1Var3, function2, function22, function23, fk2Var3, j10, j11, j12, j13, cb0Var3, i2);
        }
    }

    public static final void b(fz2 fz2Var, vl1 vl1Var, Function1 function1, f6 f6Var, Function1 function12, my myVar, a00 a00Var, int i2) {
        int i3;
        rp3 rp3Var;
        Function1 function13;
        zc zcVar;
        fn2 fn2Var;
        a00 a00Var2;
        zc zcVar2;
        Function1 function14 = function1;
        a00Var.Z(-114689412);
        if ((i2 & 6) == 0) {
            i3 = (a00Var.f(fz2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= a00Var.f(vl1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= a00Var.h(function14) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= a00Var.f(f6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= a00Var.h(function12) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        my myVar2 = myVar;
        if ((196608 & i2) == 0) {
            i3 |= a00Var.h(myVar2) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        }
        if ((74899 & i3) == 74898 && a00Var.B()) {
            a00Var.S();
            function13 = function14;
            a00Var2 = a00Var;
        } else {
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object M = a00Var.M();
            Object obj = sz.a;
            if (z || M == obj) {
                M = new zc(fz2Var, f6Var);
                a00Var.i0(M);
            }
            zc zcVar3 = (zc) M;
            boolean z2 = i4 == 4;
            Object M2 = a00Var.M();
            Object obj2 = M2;
            if (z2 || M2 == obj) {
                Object[] objArr = {fz2Var.a.j()};
                fn2 fn2Var2 = new fn2();
                fn2Var2.addAll(oi.y(objArr));
                a00Var.i0(fn2Var2);
                obj2 = fn2Var2;
            }
            fn2 fn2Var3 = (fn2) obj2;
            boolean z3 = i4 == 4;
            Object M3 = a00Var.M();
            if (z3 || M3 == obj) {
                long[] jArr = oe2.a;
                M3 = new tn1();
                a00Var.i0(M3);
            }
            tn1 tn1Var = (tn1) M3;
            rp3 rp3Var2 = fz2Var.a;
            lz1 lz1Var = fz2Var.d;
            if (!fn2Var3.contains(rp3Var2.j())) {
                fn2Var3.clear();
                fn2Var3.add(rp3Var2.j());
            }
            if (Intrinsics.b(rp3Var2.j(), lz1Var.getValue())) {
                if (fn2Var3.size() != 1 || !Intrinsics.b(fn2Var3.get(0), rp3Var2.j())) {
                    fn2Var3.clear();
                    fn2Var3.add(rp3Var2.j());
                }
                if (tn1Var.e != 1 || tn1Var.c(rp3Var2.j())) {
                    tn1Var.a();
                }
                zcVar3.b = f6Var;
            }
            if (Intrinsics.b(rp3Var2.j(), lz1Var.getValue()) || fn2Var3.contains(lz1Var.getValue())) {
                rp3Var = rp3Var2;
            } else {
                ListIterator listIterator = fn2Var3.listIterator();
                int i5 = 0;
                while (true) {
                    sx0 sx0Var = (sx0) listIterator;
                    rp3Var = rp3Var2;
                    if (!sx0Var.hasNext()) {
                        i5 = -1;
                        break;
                    } else {
                        if (Intrinsics.b(function12.invoke(sx0Var.next()), function12.invoke(lz1Var.getValue()))) {
                            break;
                        }
                        i5++;
                        rp3Var2 = rp3Var;
                    }
                }
                if (i5 == -1) {
                    fn2Var3.add(lz1Var.getValue());
                } else {
                    fn2Var3.set(i5, lz1Var.getValue());
                }
            }
            if (tn1Var.c(lz1Var.getValue()) && tn1Var.c(rp3Var.j())) {
                a00Var.X(915535767);
                a00Var.q(false);
                function13 = function14;
                zcVar = zcVar3;
            } else {
                a00Var.X(912931457);
                tn1Var.a();
                int size = fn2Var3.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj3 = fn2Var3.get(i6);
                    tn1Var.m(obj3, yj1.H(885640742, new qc(fz2Var, obj3, function14, zcVar3, fn2Var3, myVar2), a00Var));
                    i6++;
                    function14 = function14;
                    myVar2 = myVar;
                }
                function13 = function14;
                zcVar = zcVar3;
                a00Var.q(false);
            }
            boolean f2 = a00Var.f(fz2Var.f()) | a00Var.f(zcVar);
            Object M4 = a00Var.M();
            if (f2 || M4 == obj) {
                M4 = (r20) function13.invoke(zcVar);
                a00Var.i0(M4);
            }
            r20 r20Var = (r20) M4;
            fz2 fz2Var2 = zcVar.a;
            boolean f3 = a00Var.f(zcVar);
            Object M5 = a00Var.M();
            if (f3 || M5 == obj) {
                M5 = ij2.j(Boolean.FALSE);
                a00Var.i0(M5);
            }
            zn1 zn1Var = (zn1) M5;
            zn1 k2 = ij2.k(r20Var.d, a00Var);
            if (Intrinsics.b(fz2Var2.a.j(), fz2Var2.d.getValue())) {
                zn1Var.setValue(Boolean.FALSE);
            } else if (k2.getValue() != null) {
                zn1Var.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) zn1Var.getValue()).booleanValue();
            vl1 vl1Var2 = sl1.a;
            if (booleanValue) {
                a00Var.X(249037309);
                zc zcVar4 = zcVar;
                fn2Var = fn2Var3;
                a00Var2 = a00Var;
                zcVar2 = zcVar4;
                bz2 a2 = jz2.a(zcVar4.a, v33.h, null, a00Var2, 0, 2);
                boolean f4 = a00Var2.f(a2);
                Object M6 = a00Var2.M();
                if (f4 || M6 == obj) {
                    M6 = yk3.v(vl1Var2).k(new yc(zcVar2, a2, k2));
                    a00Var2.i0(M6);
                }
                vl1Var2 = (vl1) M6;
                a00Var2.q(false);
            } else {
                fn2Var = fn2Var3;
                a00Var2 = a00Var;
                zcVar2 = zcVar;
                a00Var2.X(249353726);
                a00Var2.q(false);
            }
            vl1 k3 = vl1Var.k(vl1Var2);
            Object M7 = a00Var2.M();
            if (M7 == obj) {
                M7 = new uc(zcVar2);
                a00Var2.i0(M7);
            }
            uc ucVar = (uc) M7;
            int D = iv1.D(a00Var2);
            v02 l2 = a00Var2.l();
            vl1 E = bd3.E(a00Var2, k3);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, ucVar, oz.f);
            uj2.e(a00Var2, l2, oz.e);
            sc scVar = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar);
            }
            uj2.e(a00Var2, E, oz.d);
            a00Var2.X(-1491001814);
            int size2 = fn2Var.size();
            int i7 = 0;
            while (i7 < size2) {
                fn2 fn2Var4 = fn2Var;
                Object obj4 = fn2Var4.get(i7);
                a00Var2.T(1908315325, 0, function12.invoke(obj4), null);
                Function2 function2 = (Function2) tn1Var.g(obj4);
                if (function2 == null) {
                    a00Var2.X(-971711888);
                } else {
                    a00Var2.X(1908317105);
                    function2.invoke(a00Var2, 0);
                }
                a00Var2.q(false);
                a00Var2.q(false);
                i7++;
                fn2Var = fn2Var4;
            }
            a00Var2.q(false);
            a00Var2.q(true);
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new rc(fz2Var, vl1Var, function13, f6Var, function12, myVar, i2);
        }
    }

    public static final void c(ik ikVar, boolean z, nh nhVar, Function0 function0, a00 a00Var, int i2) {
        boolean z2;
        a00 a00Var2 = a00Var;
        a00Var2.Z(-141288322);
        int i3 = i2 | (a00Var2.h(ikVar) ? 4 : 2) | (a00Var2.g(z) ? 32 : 16) | (a00Var2.d(nhVar.ordinal()) ? 256 : 128) | (a00Var2.h(function0) ? 2048 : 1024);
        if (a00Var2.P(i3 & 1, (i3 & 1171) != 1170)) {
            yb2 a2 = zb2.a(16.0f);
            sl1 sl1Var = sl1.a;
            vl1 u = yk3.u(sl1Var, a2);
            long j2 = cw.k;
            su suVar = ap.e;
            vl1 h2 = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.a.e(7, l41.q(1.5f, cw.l, androidx.compose.foundation.a.b(u, j2, suVar), zb2.a(16.0f)), null, function0, false), 10.0f);
            oj1 e2 = fp.e(qb2.p, false);
            int D = iv1.D(a00Var2);
            v02 l2 = a00Var2.l();
            vl1 E = bd3.E(a00Var2, h2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            sc scVar = oz.f;
            uj2.e(a00Var2, e2, scVar);
            sc scVar2 = oz.e;
            uj2.e(a00Var2, l2, scVar2);
            sc scVar3 = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar3);
            }
            sc scVar4 = oz.d;
            uj2.e(a00Var2, E, scVar4);
            yn ynVar = qb2.B;
            yh yhVar = new yh(6.0f, true, sc.o);
            vl1 c2 = b.c(sl1Var, 1.0f);
            qw a3 = ow.a(yhVar, ynVar, a00Var2, 54);
            int D2 = iv1.D(a00Var2);
            v02 l3 = a00Var2.l();
            vl1 E2 = bd3.E(a00Var2, c2);
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a3, scVar);
            uj2.e(a00Var2, l3, scVar2);
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D2))) {
                q40.r(D2, a00Var2, D2, scVar3);
            }
            uj2.e(a00Var2, E2, scVar4);
            wj.a(ikVar, null, 56.0f, a00Var2, (i3 & 14) | 384, 2);
            String c3 = ikVar.c(nhVar);
            long j3 = cw.h;
            jq0 jq0Var = jq0.t;
            bp2 bp2Var = n13.a;
            yv2.b(c3, null, j3, 0L, jq0Var, 0L, new ut2(3), 0L, 2, false, 1, 0, ((l13) a00Var2.j(bp2Var)).i, a00Var, 196992, 3120, 54746);
            a00Var2 = a00Var;
            String b2 = ikVar.b();
            if (b2 == null) {
                a00Var2.X(-1953267577);
            } else {
                a00Var2.X(-1953267576);
                yv2.b("Mohs ".concat(b2), null, cw.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(bp2Var)).o, a00Var, 384, 0, 65530);
                a00Var2 = a00Var;
                Unit unit = Unit.a;
            }
            a00Var2.q(false);
            a00Var2.q(true);
            if (z) {
                a00Var2.X(-1983388747);
                vl1 b3 = androidx.compose.foundation.a.b(yk3.u(b.h(androidx.compose.foundation.layout.a.c(qb2.r), 20.0f), zb2.a(999.0f)), cw.w, suVar);
                oj1 e3 = fp.e(qb2.t, false);
                int D3 = iv1.D(a00Var2);
                v02 l4 = a00Var2.l();
                vl1 E3 = bd3.E(a00Var2, b3);
                a00Var2.b0();
                if (a00Var2.S) {
                    a00Var2.k(o00Var);
                } else {
                    a00Var2.l0();
                }
                uj2.e(a00Var2, e3, scVar);
                uj2.e(a00Var2, l4, scVar2);
                if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D3))) {
                    q40.r(D3, a00Var2, D3, scVar3);
                }
                uj2.e(a00Var2, E3, scVar4);
                k01.a(bd3.s(), uj2.f(R.string.cd_studied, a00Var2), b.h(sl1Var, 14.0f), ap.d(4281998338L), a00Var2, 3456, 0);
                z2 = true;
                a00Var2.q(true);
            } else {
                z2 = true;
                a00Var2.X(-1992415606);
            }
            a00Var2.q(false);
            a00Var2.q(z2);
        } else {
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new ok(ikVar, z, nhVar, function0, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.b(r46.M(), java.lang.Integer.valueOf(r13)) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final int i2, final int i3, final String str, final Function1 function1, jk jkVar, Function1 function12, a00 a00Var, final int i4) {
        jk jkVar2;
        a00 a00Var2;
        final Function1 function13;
        int i5;
        sc scVar;
        sc scVar2;
        final int i6;
        sc scVar3 = sc.o;
        a00Var.Z(1090539335);
        int i7 = i4 | (a00Var.d(i2) ? 4 : 2) | (a00Var.d(i3) ? 32 : 16) | (a00Var.f(str) ? 256 : 128) | (a00Var.h(function1) ? 2048 : 1024) | (a00Var.d(jkVar == null ? -1 : jkVar.ordinal()) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE) | (a00Var.h(function12) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        if (a00Var.P(i7 & 1, (74899 & i7) != 74898)) {
            qw a2 = ow.a(new yh(12.0f, true, scVar3), qb2.A, a00Var, 6);
            int D = iv1.D(a00Var);
            v02 l2 = a00Var.l();
            sl1 sl1Var = sl1.a;
            vl1 E = bd3.E(a00Var, sl1Var);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            sc scVar4 = oz.f;
            uj2.e(a00Var, a2, scVar4);
            sc scVar5 = oz.e;
            uj2.e(a00Var, l2, scVar5);
            sc scVar6 = oz.g;
            if (a00Var.S) {
                i5 = i7;
            } else {
                i5 = i7;
            }
            q40.r(D, a00Var, D, scVar6);
            sc scVar7 = oz.d;
            uj2.e(a00Var, E, scVar7);
            String f2 = uj2.f(R.string.atlas_title, a00Var);
            bp2 bp2Var = n13.a;
            pw2 pw2Var = ((l13) a00Var.j(bp2Var)).c;
            long j2 = cw.h;
            yv2.b(f2, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, pw2Var, a00Var, 384, 0, 65530);
            float f3 = i3 > 0 ? i2 / i3 : 0.0f;
            yv2.b(uj2.g(R.string.atlas_progress, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, a00Var), null, cw.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(bp2Var)).m, a00Var, 384, 0, 65530);
            vl1 u = yk3.u(b.d(b.c(sl1Var, 1.0f), 8.0f), zb2.a(999.0f));
            long j3 = cw.k;
            vl1 b2 = androidx.compose.foundation.a.b(u, j3, ap.e);
            oj1 e2 = fp.e(qb2.p, false);
            int D2 = iv1.D(a00Var);
            v02 l3 = a00Var.l();
            vl1 E2 = bd3.E(a00Var, b2);
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e2, scVar4);
            uj2.e(a00Var, l3, scVar5);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D2))) {
                scVar = scVar6;
                q40.r(D2, a00Var, D2, scVar);
            } else {
                scVar = scVar6;
            }
            uj2.e(a00Var, E2, scVar7);
            fp.a(androidx.compose.foundation.a.a(yk3.u(b.d(b.c(sl1Var, d.b(f3, 0.0f, 1.0f)), 8.0f), zb2.a(999.0f)), nj.q(qv.g(new aw(cw.p), new aw(cw.q)))), a00Var, 0);
            a00Var.q(true);
            g81 g81Var = g81.b;
            long j4 = aw.f;
            sc scVar8 = scVar;
            int i8 = i5 >> 6;
            ak2.a(str, function1, b.c(sl1Var, 1.0f), false, null, j8.c, j8.d, null, g81Var, null, true, 0, 0, zb2.a(16.0f), by1.n(j2, j2, j3, j3, j2, j4, j4, a00Var), a00Var, (i8 & 14) | 113246592 | (i8 & 112), 12779520, 1932920);
            a00Var2 = a00Var;
            yh yhVar = new yh(8.0f, true, scVar3);
            zn znVar = qb2.y;
            fc2 a3 = ec2.a(yhVar, znVar, a00Var2, 6);
            int D3 = iv1.D(a00Var2);
            v02 l4 = a00Var2.l();
            vl1 E3 = bd3.E(a00Var2, sl1Var);
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a3, scVar4);
            uj2.e(a00Var2, l4, scVar5);
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D3))) {
                q40.r(D3, a00Var2, D3, scVar8);
            }
            uj2.e(a00Var2, E3, scVar7);
            String f4 = uj2.f(R.string.section_all, a00Var2);
            boolean z = jkVar == null;
            int i9 = i5 & 458752;
            boolean z2 = i9 == 131072;
            Object M = a00Var2.M();
            nj njVar = sz.a;
            if (z2 || M == njVar) {
                function13 = function12;
                final int i10 = 1;
                M = new Function0() { // from class: mk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i11 = i10;
                        Function1 function14 = function13;
                        switch (i11) {
                            case 0:
                                function14.invoke(jk.p);
                                break;
                            case 1:
                                function14.invoke(null);
                                break;
                            case 2:
                                function14.invoke(jk.m);
                                break;
                            case 3:
                                function14.invoke(jk.n);
                                break;
                            default:
                                function14.invoke(jk.o);
                                break;
                        }
                        return Unit.a;
                    }
                };
                a00Var2.i0(M);
            } else {
                function13 = function12;
            }
            o(f4, z, (Function0) M, a00Var2, 0);
            String f5 = uj2.f(R.string.section_gems, a00Var2);
            jkVar2 = jkVar;
            boolean z3 = jkVar2 == jk.m;
            boolean z4 = i9 == 131072;
            Object M2 = a00Var2.M();
            if (z4 || M2 == njVar) {
                scVar2 = scVar7;
                final int i11 = 2;
                M2 = new Function0() { // from class: mk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i112 = i11;
                        Function1 function14 = function13;
                        switch (i112) {
                            case 0:
                                function14.invoke(jk.p);
                                break;
                            case 1:
                                function14.invoke(null);
                                break;
                            case 2:
                                function14.invoke(jk.m);
                                break;
                            case 3:
                                function14.invoke(jk.n);
                                break;
                            default:
                                function14.invoke(jk.o);
                                break;
                        }
                        return Unit.a;
                    }
                };
                a00Var2.i0(M2);
            } else {
                scVar2 = scVar7;
            }
            o(f5, z3, (Function0) M2, a00Var2, 0);
            String f6 = uj2.f(R.string.section_minerals, a00Var2);
            boolean z5 = jkVar2 == jk.n;
            boolean z6 = i9 == 131072;
            Object M3 = a00Var2.M();
            if (z6 || M3 == njVar) {
                final int i12 = 3;
                M3 = new Function0() { // from class: mk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i112 = i12;
                        Function1 function14 = function13;
                        switch (i112) {
                            case 0:
                                function14.invoke(jk.p);
                                break;
                            case 1:
                                function14.invoke(null);
                                break;
                            case 2:
                                function14.invoke(jk.m);
                                break;
                            case 3:
                                function14.invoke(jk.n);
                                break;
                            default:
                                function14.invoke(jk.o);
                                break;
                        }
                        return Unit.a;
                    }
                };
                a00Var2.i0(M3);
            }
            o(f6, z5, (Function0) M3, a00Var2, 0);
            a00Var2.q(true);
            fc2 a4 = ec2.a(new yh(8.0f, true, scVar3), znVar, a00Var2, 6);
            int D4 = iv1.D(a00Var2);
            v02 l5 = a00Var2.l();
            vl1 E4 = bd3.E(a00Var2, sl1Var);
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a4, scVar4);
            uj2.e(a00Var2, l5, scVar5);
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D4))) {
                q40.r(D4, a00Var2, D4, scVar8);
            }
            uj2.e(a00Var2, E4, scVar2);
            String f7 = uj2.f(R.string.section_fossils, a00Var2);
            boolean z7 = jkVar2 == jk.o;
            boolean z8 = i9 == 131072;
            Object M4 = a00Var2.M();
            if (z8 || M4 == njVar) {
                final int i13 = 4;
                M4 = new Function0() { // from class: mk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i112 = i13;
                        Function1 function14 = function13;
                        switch (i112) {
                            case 0:
                                function14.invoke(jk.p);
                                break;
                            case 1:
                                function14.invoke(null);
                                break;
                            case 2:
                                function14.invoke(jk.m);
                                break;
                            case 3:
                                function14.invoke(jk.n);
                                break;
                            default:
                                function14.invoke(jk.o);
                                break;
                        }
                        return Unit.a;
                    }
                };
                a00Var2.i0(M4);
            }
            o(f7, z7, (Function0) M4, a00Var2, 0);
            String f8 = uj2.f(R.string.section_metals, a00Var2);
            boolean z9 = jkVar2 == jk.p;
            boolean z10 = i9 == 131072;
            Object M5 = a00Var2.M();
            if (z10 || M5 == njVar) {
                i6 = 0;
                M5 = new Function0() { // from class: mk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i112 = i6;
                        Function1 function14 = function13;
                        switch (i112) {
                            case 0:
                                function14.invoke(jk.p);
                                break;
                            case 1:
                                function14.invoke(null);
                                break;
                            case 2:
                                function14.invoke(jk.m);
                                break;
                            case 3:
                                function14.invoke(jk.n);
                                break;
                            default:
                                function14.invoke(jk.o);
                                break;
                        }
                        return Unit.a;
                    }
                };
                a00Var2.i0(M5);
            } else {
                i6 = 0;
            }
            o(f8, z9, (Function0) M5, a00Var2, i6);
            a00Var2.q(true);
            a00Var2.q(true);
        } else {
            jkVar2 = jkVar;
            a00Var2 = a00Var;
            function13 = function12;
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            final jk jkVar3 = jkVar2;
            final Function1 function14 = function13;
            s.d = new Function2(i2, i3, str, function1, jkVar3, function14, i4) { // from class: nk
                public final /* synthetic */ int m;
                public final /* synthetic */ int n;
                public final /* synthetic */ String o;
                public final /* synthetic */ Function1 p;
                public final /* synthetic */ jk q;
                public final /* synthetic */ Function1 r;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = s03.R(1);
                    s93.d(this.m, this.n, this.o, this.p, this.q, this.r, (a00) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(Function1 function1, vl1 vl1Var, zk zkVar, a00 a00Var, int i2) {
        Function1 function12;
        vl1 vl1Var2;
        zk zkVar2;
        int i3;
        zk zkVar3;
        zk zkVar4;
        sc scVar = sc.o;
        function1.getClass();
        a00Var.Z(-1839974931);
        int i4 = (a00Var.h(function1) ? 4 : 2) | i2 | 176;
        if (a00Var.P(i4 & 1, (i4 & 147) != 146)) {
            a00Var.U();
            int i5 = i2 & 1;
            sl1 sl1Var = sl1.a;
            if (i5 == 0 || a00Var.z()) {
                u53 a2 = qf1.a(a00Var);
                if (a2 == null) {
                    lh.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                zk zkVar5 = (zk) ci2.l(d82.a(zk.class), a2, a2 instanceof jx0 ? ((jx0) a2).getDefaultViewModelCreationExtras() : h50.b, a00Var);
                i3 = i4 & (-897);
                zkVar3 = zkVar5;
                vl1Var2 = sl1Var;
            } else {
                a00Var.S();
                vl1Var2 = vl1Var;
                i3 = i4 & (-897);
                zkVar3 = zkVar;
            }
            a00Var.r();
            zn1 b2 = ij2.b(zkVar3.e, a00Var);
            nh nhVar = tp2.i(Locale.getDefault().getLanguage(), "ru", true) ? nh.m : nh.n;
            int i6 = i3;
            vl1 a3 = androidx.compose.foundation.a.a(b.b(vl1Var2, 1.0f), nj.u(qv.g(new aw(cw.a), new aw(cw.b))));
            oj1 e2 = fp.e(qb2.p, false);
            int D = iv1.D(a00Var);
            v02 l2 = a00Var.l();
            vl1 E = bd3.E(a00Var, a3);
            pz.b.getClass();
            Function0 function0 = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(function0);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e2, oz.f);
            uj2.e(a00Var, l2, oz.e);
            sc scVar2 = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar2);
            }
            uj2.e(a00Var, E, oz.d);
            lw0 lw0Var = new lw0(3);
            zx1 zx1Var = new zx1(16.0f, 16.0f, 16.0f, 16.0f);
            yh yhVar = new yh(12.0f, true, scVar);
            yh yhVar2 = new yh(12.0f, true, scVar);
            vl1 b3 = b.b(sl1Var, 1.0f);
            boolean f2 = a00Var.f(b2) | a00Var.h(zkVar3) | a00Var.d(nhVar.ordinal()) | ((i6 & 14) == 4);
            Object M = a00Var.M();
            if (f2 || M == sz.a) {
                Object lkVar = new lk(zkVar3, b2, nhVar, function1, 0);
                zkVar4 = zkVar3;
                a00Var.i0(lkVar);
                M = lkVar;
            } else {
                zkVar4 = zkVar3;
            }
            function12 = function1;
            o70.e(lw0Var, b3, null, zx1Var, yhVar2, yhVar, null, false, (Function1) M, a00Var, 1772592);
            a00Var.q(true);
            zkVar2 = zkVar4;
        } else {
            function12 = function1;
            a00Var.S();
            vl1Var2 = vl1Var;
            zkVar2 = zkVar;
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new pk(function12, vl1Var2, zkVar2, i2);
        }
    }

    public static final void f(Function0 function0, vl1 vl1Var, boolean z, fk2 fk2Var, tq tqVar, s03 s03Var, yx1 yx1Var, my myVar, a00 a00Var, int i2) {
        int i3;
        long j2;
        bn1 bn1Var;
        long j3;
        boolean z2;
        nd ndVar;
        a00Var.Z(650121315);
        if ((i2 & 6) == 0) {
            i3 = (a00Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= a00Var.f(vl1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= a00Var.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= a00Var.f(fk2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= a00Var.f(tqVar) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        if ((196608 & i2) == 0) {
            i3 |= a00Var.f(s03Var) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        }
        if ((1572864 & i2) == 0) {
            i3 |= a00Var.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= a00Var.f(yx1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= a00Var.f(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= a00Var.h(myVar) ? 536870912 : 268435456;
        }
        if ((306783379 & i3) == 306783378 && a00Var.B()) {
            a00Var.S();
        } else {
            a00Var.U();
            if ((i2 & 1) != 0 && !a00Var.z()) {
                a00Var.S();
            }
            a00Var.r();
            a00Var.X(-239156623);
            Object M = a00Var.M();
            Object obj = sz.a;
            if (M == obj) {
                M = new bn1();
                a00Var.i0(M);
            }
            bn1 bn1Var2 = (bn1) M;
            a00Var.q(false);
            long j4 = z ? tqVar.a : tqVar.c;
            long j5 = z ? tqVar.b : tqVar.d;
            a00Var.X(-239150048);
            if (s03Var == null) {
                bn1Var = bn1Var2;
                j3 = j5;
                z2 = false;
                ndVar = null;
            } else {
                int i4 = ((i3 >> 9) & 896) | ((i3 >> 6) & 14);
                Object M2 = a00Var.M();
                if (M2 == obj) {
                    M2 = new fn2();
                    a00Var.i0(M2);
                }
                fn2 fn2Var = (fn2) M2;
                boolean f2 = a00Var.f(bn1Var2);
                Object M3 = a00Var.M();
                if (f2 || M3 == obj) {
                    j2 = j5;
                    M3 = new v(bn1Var2, fn2Var, null, 9);
                    a00Var.i0(M3);
                } else {
                    j2 = j5;
                }
                l41.h(a00Var, bn1Var2, (Function2) M3);
                a41 a41Var = (a41) zv.C(fn2Var);
                float f3 = (z && !(a41Var instanceof u42) && (a41Var instanceof cy0)) ? 1.0f : 0.0f;
                Object M4 = a00Var.M();
                if (M4 == obj) {
                    bn1Var = bn1Var2;
                    M4 = new jc(new pc0(f3), v33.c, null, 12);
                    a00Var.i0(M4);
                } else {
                    bn1Var = bn1Var2;
                }
                jc jcVar = (jc) M4;
                pc0 pc0Var = new pc0(f3);
                boolean h2 = a00Var.h(jcVar) | a00Var.c(f3) | ((((i4 & 14) ^ 6) > 4 && a00Var.g(z)) || (i4 & 6) == 4) | ((((i4 & 896) ^ 384) > 256 && a00Var.f(s03Var)) || (i4 & 384) == 256) | a00Var.h(a41Var);
                Object M5 = a00Var.M();
                if (h2 || M5 == obj) {
                    float f4 = f3;
                    j3 = j2;
                    z2 = false;
                    Object vqVar = new vq(jcVar, f4, z, s03Var, a41Var, null);
                    a00Var.i0(vqVar);
                    M5 = vqVar;
                } else {
                    j3 = j2;
                    z2 = false;
                }
                l41.h(a00Var, pc0Var, (Function2) M5);
                ndVar = jcVar.c;
            }
            a00Var.q(z2);
            float f5 = ndVar != null ? ((pc0) ndVar.n.getValue()).m : 0.0f;
            vl1 a2 = wh2.a(vl1Var, o3.E);
            my H = yj1.H(956488494, new z8(j3, yx1Var, myVar), a00Var);
            t52 t52Var = kr2.a;
            float f6 = ((pc0) a00Var.j(t52Var)).m + 0.0f;
            yk3.c(new ye[]{e20.a.a(new aw(j3)), t52Var.a(new pc0(f6))}, yj1.H(1279702876, new jr2(a2, fk2Var, j4, f6, bn1Var, z, function0, f5, H), a00Var), a00Var, 56);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new wq(function0, vl1Var, z, fk2Var, tqVar, s03Var, yx1Var, myVar, i2);
        }
    }

    public static lq g(int i2, int i3, hq hqVar) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            hqVar = hq.m;
        }
        if (i2 == -2) {
            if (hqVar != hq.m) {
                return new w00(1, hqVar);
            }
            gt.a.getClass();
            return new lq(ft.b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? hqVar == hq.m ? new lq(i2) : new w00(i2, hqVar) : new lq(Integer.MAX_VALUE) : hqVar == hq.m ? new lq(0) : new w00(1, hqVar);
        }
        if (hqVar == hq.m) {
            return new w00(1, hq.n);
        }
        lh.e("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x047b, code lost:
    
        if (r6 > ((r8 != null ? r8.longValue() : 0) + 5000)) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x057c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x060f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x064d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0691 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x072b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0795 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0825 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x085d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x08c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(nv2 nv2Var, Function1 function1, vl1 vl1Var, pw2 pw2Var, ch2 ch2Var, Function1 function12, bn1 bn1Var, nn2 nn2Var, boolean z, int i2, int i3, c11 c11Var, f81 f81Var, boolean z2, my myVar, a00 a00Var, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        ww1 ww1Var;
        boolean f2;
        Object M;
        int i9;
        Object M2;
        to0 to0Var;
        yd ydVar;
        n72 y;
        Object sc1Var;
        xy2 xy2Var;
        boolean z3;
        cu1 cu1Var;
        Object obj;
        int i10;
        yd ydVar2;
        no0 no0Var;
        x63 x63Var;
        pw2 pw2Var2;
        jw2 jw2Var;
        yd ydVar3;
        ca0 ca0Var;
        hp0 hp0Var;
        ca0 ca0Var2;
        boolean z4;
        boolean z5;
        nv2 a2;
        Object M3;
        Object obj2;
        z13 z13Var;
        Object M4;
        Object M5;
        Object M6;
        int i11;
        c11 c11Var2;
        int i12;
        sc1 sc1Var2;
        boolean z6;
        boolean h2;
        Object e40Var;
        no0 no0Var2;
        z13 z13Var2;
        dv2 dv2Var;
        xy2 xy2Var2;
        ea eaVar;
        sc1 sc1Var3;
        Object obj3;
        to0 to0Var2;
        sv2 sv2Var;
        bn1 bn1Var2;
        nv2 nv2Var2;
        c11 c11Var3;
        op opVar;
        boolean z7;
        sc1 sc1Var4;
        boolean z8;
        boolean z9;
        Object daVar;
        gv2 gv2Var;
        cu1 cu1Var2;
        int i13;
        vl1 vl1Var2;
        sc1 sc1Var5;
        Unit unit;
        zn1 zn1Var;
        sv2 sv2Var2;
        c11 c11Var4;
        boolean h3;
        Object M7;
        vl1 vl1Var3;
        vl1 k2;
        boolean h4;
        Object g40Var;
        sc1 sc1Var6;
        cu1 cu1Var3;
        boolean h5;
        Object M8;
        x63 x63Var2;
        boolean h6;
        Object M9;
        cu1 cu1Var4;
        sc1 sc1Var7;
        x63 x63Var3;
        boolean z10;
        Object M10;
        sv2 sv2Var3;
        gv2 gv2Var2;
        boolean z11;
        AppendedSemanticsElement appendedSemanticsElement;
        vl1 vl1Var4;
        boolean h7;
        Object M11;
        boolean h8;
        Object M12;
        c11 c11Var5;
        gv2 gv2Var3;
        boolean h9;
        Object M13;
        boolean z12;
        int i14;
        a00 a00Var2 = a00Var;
        jw2 jw2Var2 = nv2Var.c;
        yd ydVar4 = nv2Var.a;
        a00Var2.Z(-958708118);
        if ((i4 & 6) == 0) {
            i6 = i4 | (a00Var2.f(nv2Var) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= a00Var2.h(function1) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= a00Var2.f(vl1Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= a00Var2.f(pw2Var) ? 2048 : 1024;
        }
        int i15 = i4 & 24576;
        int i16 = Utility.DEFAULT_STREAM_BUFFER_SIZE;
        if (i15 == 0) {
            i6 |= a00Var2.f(ch2Var) ? 16384 : 8192;
        }
        int i17 = i4 & 196608;
        int i18 = NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        if (i17 == 0) {
            i6 |= a00Var2.h(function12) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= a00Var2.f(bn1Var) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= a00Var2.f(nn2Var) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= a00Var2.g(z) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= a00Var2.d(i2) ? 536870912 : 268435456;
        }
        int i19 = i6;
        if ((i5 & 6) == 0) {
            i7 = i5 | (a00Var2.d(i3) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= a00Var2.f(c11Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= a00Var2.f(f81Var) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= a00Var2.g(z2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            if (a00Var2.g(false)) {
                i16 = 16384;
            }
            i7 |= i16;
        }
        if ((i5 & 196608) == 0) {
            if (a00Var2.h(myVar)) {
                i18 = 131072;
            }
            i7 |= i18;
        }
        int i20 = i7;
        if ((i19 & 306783379) == 306783378 && (74899 & i20) == 74898 && a00Var2.B()) {
            a00Var2.S();
        } else {
            a00Var2.U();
            if ((i4 & 1) != 0 && !a00Var2.z()) {
                a00Var2.S();
            }
            a00Var2.r();
            Object M14 = a00Var2.M();
            Object obj4 = sz.a;
            if (M14 == obj4) {
                M14 = new to0();
                a00Var2.i0(M14);
            }
            to0 to0Var3 = (to0) M14;
            Object M15 = a00Var2.M();
            if (M15 == obj4) {
                pc1 pc1Var = qc1.a;
                M15 = new ea();
                a00Var2.i0(M15);
            }
            ea eaVar2 = (ea) M15;
            Object M16 = a00Var2.M();
            if (M16 == obj4) {
                M16 = new sv2(eaVar2);
                a00Var2.i0(M16);
            }
            sv2 sv2Var4 = (sv2) M16;
            ca0 ca0Var3 = (ca0) a00Var2.j(p00.h);
            hp0 hp0Var2 = (hp0) a00Var2.j(p00.k);
            long j2 = ((kw2) a00Var2.j(lw2.a)).b;
            no0 no0Var3 = (no0) a00Var2.j(p00.i);
            x63 x63Var4 = (x63) a00Var2.j(p00.t);
            kn2 kn2Var = (kn2) a00Var2.j(p00.p);
            if (i2 != 1 || z) {
                i8 = 1;
            } else {
                i8 = 1;
                if (c11Var.a) {
                    ww1Var = ww1.n;
                    Object[] objArr = {ww1Var};
                    tt1 tt1Var = dv2.f;
                    f2 = a00Var2.f(ww1Var);
                    M = a00Var2.M();
                    if (!f2 || M == obj4) {
                        M = new u(7, ww1Var);
                        a00Var2.i0(M);
                    }
                    dv2 dv2Var2 = (dv2) ll3.Q(objArr, tt1Var, (Function0) M, a00Var2, 0, 4);
                    int i21 = i19 & 14;
                    i9 = (i21 != 4 ? i8 : 0) | ((i19 & 57344) != 16384 ? i8 : 0);
                    M2 = a00Var2.M();
                    if (i9 == 0 || M2 == obj4) {
                        xy2 r2 = z71.r(ch2Var, ydVar4);
                        if (jw2Var2 == null) {
                            to0Var = to0Var3;
                            long j3 = jw2Var2.a;
                            cu1 cu1Var5 = r2.b;
                            int i22 = jw2.c;
                            int g2 = cu1Var5.g((int) (j3 >> 32));
                            int g3 = cu1Var5.g((int) (j3 & 4294967295L));
                            int min = Math.min(g2, g3);
                            int max = Math.max(g2, g3);
                            wd wdVar = new wd(r2.a);
                            ydVar = ydVar4;
                            wdVar.n.add(new vd(min, max, new un2(0L, 0L, (jq0) null, (fq0) null, (gq0) null, (ip0) null, (String) null, 0L, (nn) null, (qv2) null, (sf1) null, 0L, xt2.c, (dk2) null, 61439), BuildConfig.FLAVOR));
                            r2 = new xy2(wdVar.b(), cu1Var5);
                        } else {
                            to0Var = to0Var3;
                            ydVar = ydVar4;
                        }
                        M2 = r2;
                        a00Var2.i0(M2);
                    } else {
                        to0Var = to0Var3;
                        ydVar = ydVar4;
                    }
                    xy2 xy2Var3 = (xy2) M2;
                    yd ydVar5 = xy2Var3.a;
                    cu1 cu1Var6 = xy2Var3.b;
                    y = a00Var2.y();
                    if (y != null) {
                        lh.g("no recompose scope found");
                        return;
                    }
                    y.b |= 1;
                    boolean f3 = a00Var2.f(kn2Var);
                    Object M17 = a00Var2.M();
                    if (f3 || M17 == obj4) {
                        xy2Var = xy2Var3;
                        z3 = z;
                        cu1Var = cu1Var6;
                        obj = obj4;
                        i10 = i21;
                        ydVar2 = ydVar;
                        no0Var = no0Var3;
                        x63Var = x63Var4;
                        pw2Var2 = pw2Var;
                        zt2 zt2Var = new zt2(ydVar5, pw2Var2, z3, ca0Var3, hp0Var2, ah0.m);
                        jw2Var = jw2Var2;
                        ydVar3 = ydVar5;
                        ca0Var = ca0Var3;
                        hp0Var = hp0Var2;
                        sc1Var = new sc1(zt2Var, y, kn2Var);
                        a00Var2.i0(sc1Var);
                    } else {
                        z3 = z;
                        cu1Var = cu1Var6;
                        obj = obj4;
                        i10 = i21;
                        sc1Var = M17;
                        ydVar2 = ydVar;
                        jw2Var = jw2Var2;
                        ca0Var = ca0Var3;
                        no0Var = no0Var3;
                        x63Var = x63Var4;
                        pw2Var2 = pw2Var;
                        xy2Var = xy2Var3;
                        ydVar3 = ydVar5;
                        hp0Var = hp0Var2;
                    }
                    sc1 sc1Var8 = (sc1) sc1Var;
                    sc1Var8.s = function1;
                    sc1Var8.w = j2;
                    mh mhVar = sc1Var8.r;
                    mhVar.o = f81Var;
                    mhVar.p = no0Var;
                    sc1Var8.j = ydVar2;
                    zt2 zt2Var2 = sc1Var8.a;
                    ah0 ah0Var = ah0.m;
                    if (Intrinsics.b(zt2Var2.a, ydVar3) && Intrinsics.b(zt2Var2.b, pw2Var2) && zt2Var2.e == z3 && zt2Var2.f == (i14 = i8) && zt2Var2.c == Integer.MAX_VALUE && zt2Var2.d == i14 && Intrinsics.b(zt2Var2.g, ca0Var) && Intrinsics.b(zt2Var2.i, ah0Var) && zt2Var2.h == hp0Var) {
                        ca0Var2 = ca0Var;
                    } else {
                        ca0Var2 = ca0Var;
                        zt2Var2 = new zt2(ydVar3, pw2Var2, z3, ca0Var2, hp0Var, ah0Var);
                    }
                    if (sc1Var8.a != zt2Var2) {
                        sc1Var8.p = true;
                    }
                    sc1Var8.a = zt2Var2;
                    t21 t21Var = sc1Var8.d;
                    wv2 wv2Var = sc1Var8.e;
                    long j4 = nv2Var.b;
                    jw2 jw2Var3 = jw2Var;
                    boolean b2 = Intrinsics.b(jw2Var3, ((qf0) t21Var.o).c());
                    if (!Intrinsics.b(((nv2) t21Var.n).a.n, ydVar2.n)) {
                        t21Var.o = new qf0(ydVar2, j4);
                        z4 = true;
                    } else if (jw2.a(((nv2) t21Var.n).b, j4)) {
                        z4 = false;
                    } else {
                        ((qf0) t21Var.o).f(jw2.e(j4), jw2.d(j4));
                        z4 = false;
                        z5 = true;
                        if (jw2Var3 != null) {
                            qf0 qf0Var = (qf0) t21Var.o;
                            qf0Var.d = -1;
                            qf0Var.e = -1;
                        } else {
                            long j5 = jw2Var3.a;
                            if (!jw2.b(j5)) {
                                ((qf0) t21Var.o).e(jw2.e(j5), jw2.d(j5));
                            }
                        }
                        if (z4 && (z5 || b2)) {
                            a2 = nv2Var;
                        } else {
                            qf0 qf0Var2 = (qf0) t21Var.o;
                            qf0Var2.d = -1;
                            qf0Var2.e = -1;
                            a2 = nv2.a(nv2Var, null, 0L, 3);
                        }
                        nv2 nv2Var3 = (nv2) t21Var.n;
                        t21Var.n = a2;
                        if (wv2Var != null) {
                            wv2Var.a(nv2Var3, a2);
                        }
                        M3 = a00Var2.M();
                        obj2 = obj;
                        if (M3 == obj2) {
                            M3 = new z13();
                            a00Var2.i0(M3);
                        }
                        z13Var = (z13) M3;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!z13Var.e) {
                            Long l2 = z13Var.d;
                        }
                        z13Var.d = Long.valueOf(currentTimeMillis);
                        z13Var.a(nv2Var);
                        M4 = a00Var2.M();
                        if (M4 == obj2) {
                            M4 = new gv2(z13Var);
                            a00Var2.i0(M4);
                        }
                        gv2 gv2Var4 = (gv2) M4;
                        cu1 cu1Var7 = cu1Var;
                        gv2Var4.b = cu1Var7;
                        gv2Var4.c = sc1Var8.t;
                        gv2Var4.d = sc1Var8;
                        gv2Var4.e.setValue(nv2Var);
                        gv2Var4.f = (vu) a00Var2.j(p00.e);
                        gv2Var4.g = (qw2) a00Var2.j(p00.q);
                        gv2Var4.h = (hx0) a00Var2.j(p00.l);
                        to0 to0Var4 = to0Var;
                        gv2Var4.i = to0Var4;
                        gv2Var4.j.setValue(true);
                        gv2Var4.k.setValue(Boolean.valueOf(z2));
                        M5 = a00Var2.M();
                        if (M5 == obj2) {
                            q00 q00Var = new q00(l41.x(h.m, a00Var2));
                            a00Var2.i0(q00Var);
                            M5 = q00Var;
                        }
                        a50 a50Var = ((q00) M5).m;
                        M6 = a00Var2.M();
                        if (M6 == obj2) {
                            M6 = new op();
                            a00Var2.i0(M6);
                        }
                        op opVar2 = (op) M6;
                        int i23 = i20 & 7168;
                        int i24 = i20 & 57344;
                        int i25 = i10;
                        boolean h10 = (i24 != 16384) | a00Var2.h(sc1Var8) | (i23 != 2048) | a00Var2.h(sv2Var4) | (i25 != 4);
                        i11 = (i20 & 112) ^ 48;
                        if (i11 <= 32) {
                            c11Var2 = c11Var;
                            if (a00Var2.f(c11Var2)) {
                                i12 = i25;
                                sc1Var2 = sc1Var8;
                                z6 = true;
                                h2 = h10 | z6 | a00Var2.h(cu1Var7) | a00Var2.h(a50Var) | a00Var2.h(opVar2) | a00Var2.h(gv2Var4);
                                Object M18 = a00Var2.M();
                                if (!h2 || M18 == obj2) {
                                    no0Var2 = no0Var;
                                    c11 c11Var6 = c11Var2;
                                    z13Var2 = z13Var;
                                    dv2Var = dv2Var2;
                                    xy2Var2 = xy2Var;
                                    eaVar = eaVar2;
                                    sc1Var3 = sc1Var2;
                                    obj3 = obj2;
                                    to0Var2 = to0Var4;
                                    sv2Var = sv2Var4;
                                    bn1Var2 = bn1Var;
                                    e40Var = new e40(sc1Var3, z2, sv2Var, nv2Var, c11Var6, cu1Var7, gv2Var4, a50Var, opVar2);
                                    nv2Var2 = nv2Var;
                                    c11Var3 = c11Var6;
                                    opVar = opVar2;
                                    z7 = z2;
                                    a00Var2.i0(e40Var);
                                } else {
                                    z7 = z2;
                                    e40Var = M18;
                                    no0Var2 = no0Var;
                                    c11Var3 = c11Var2;
                                    z13Var2 = z13Var;
                                    dv2Var = dv2Var2;
                                    xy2Var2 = xy2Var;
                                    eaVar = eaVar2;
                                    sc1Var3 = sc1Var2;
                                    obj3 = obj2;
                                    to0Var2 = to0Var4;
                                    opVar = opVar2;
                                    bn1Var2 = bn1Var;
                                    nv2Var2 = nv2Var;
                                    sv2Var = sv2Var4;
                                }
                                vl1 a3 = c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(to0Var2), (Function1) e40Var), z7, bn1Var2);
                                zn1 k3 = ij2.k(Boolean.valueOf(z7), a00Var2);
                                Unit unit2 = Unit.a;
                                boolean f4 = a00Var2.f(k3) | a00Var2.h(sc1Var3) | a00Var2.h(sv2Var) | a00Var2.h(gv2Var4);
                                if (i11 > 32 || !a00Var2.f(c11Var3)) {
                                    sc1Var4 = sc1Var3;
                                    if ((i20 & 48) != 32) {
                                        z8 = false;
                                        z9 = f4 | z8;
                                        Object M19 = a00Var2.M();
                                        if (!z9 || M19 == obj3) {
                                            gv2Var = gv2Var4;
                                            cu1Var2 = cu1Var7;
                                            i13 = i11;
                                            vl1Var2 = a3;
                                            sc1Var5 = sc1Var4;
                                            unit = unit2;
                                            daVar = new da(sc1Var5, k3, sv2Var, gv2Var, c11Var, null, 2);
                                            zn1Var = k3;
                                            sv2Var2 = sv2Var;
                                            c11Var4 = c11Var;
                                            a00Var2.i0(daVar);
                                        } else {
                                            c11Var4 = c11Var3;
                                            gv2Var = gv2Var4;
                                            daVar = M19;
                                            sv2Var2 = sv2Var;
                                            cu1Var2 = cu1Var7;
                                            i13 = i11;
                                            vl1Var2 = a3;
                                            sc1Var5 = sc1Var4;
                                            zn1Var = k3;
                                            unit = unit2;
                                        }
                                        l41.h(a00Var2, unit, (Function2) daVar);
                                        h3 = a00Var2.h(sc1Var5);
                                        M7 = a00Var2.M();
                                        if (!h3 || M7 == obj3) {
                                            M7 = new d40(sc1Var5, 1);
                                            a00Var2.i0(M7);
                                        }
                                        a60 a60Var = new a60((Function1) M7, null);
                                        vl1Var3 = sl1.a;
                                        k2 = vl1Var3.k(new SuspendPointerInputElement(8675309, null, new qr2(a60Var), 6));
                                        h4 = a00Var2.h(sc1Var5) | (i24 == 16384) | (i23 == 2048) | a00Var2.h(cu1Var2) | a00Var2.h(gv2Var);
                                        Object M20 = a00Var2.M();
                                        if (!h4 || M20 == obj3) {
                                            cu1 cu1Var8 = cu1Var2;
                                            g40Var = new g40(sc1Var5, to0Var2, z2, gv2Var, cu1Var8);
                                            sc1Var6 = sc1Var5;
                                            cu1Var3 = cu1Var8;
                                            a00Var2.i0(g40Var);
                                        } else {
                                            g40Var = M20;
                                            sc1Var6 = sc1Var5;
                                            cu1Var3 = cu1Var2;
                                        }
                                        Function1 function13 = (Function1) g40Var;
                                        if (z2) {
                                            k2 = bd3.n(k2, new j30(5, function13, bn1Var2));
                                        }
                                        ot2 ot2Var = gv2Var.u;
                                        ev2 ev2Var = gv2Var.t;
                                        vl1 k4 = k2.k(new SuspendPointerInputElement(ot2Var, ev2Var, new qr2(new ed(ot2Var, ev2Var, (o30) null, 18)), 4)).k(new PointerHoverIconModifierElement());
                                        int i26 = i12;
                                        h5 = a00Var2.h(sc1Var6) | (i26 == 4) | a00Var2.h(cu1Var3);
                                        M8 = a00Var2.M();
                                        if (!h5 || M8 == obj3) {
                                            M8 = new oc(sc1Var6, nv2Var2, cu1Var3, 3);
                                            a00Var2.i0(M8);
                                        }
                                        vl1 a4 = androidx.compose.ui.draw.a.a(vl1Var3, (Function1) M8);
                                        x63Var2 = x63Var;
                                        h6 = a00Var2.h(sc1Var6) | (i23 == 2048) | a00Var2.f(x63Var2) | a00Var2.h(gv2Var) | (i26 == 4) | a00Var2.h(cu1Var3);
                                        M9 = a00Var2.M();
                                        if (!h6 || M9 == obj3) {
                                            cu1Var4 = cu1Var3;
                                            sc1Var7 = sc1Var6;
                                            f40 f40Var = new f40(sc1Var7, z2, x63Var2, gv2Var, nv2Var2, cu1Var4);
                                            x63Var3 = x63Var2;
                                            a00Var2.i0(f40Var);
                                            M9 = f40Var;
                                        } else {
                                            cu1Var4 = cu1Var3;
                                            sc1Var7 = sc1Var6;
                                            x63Var3 = x63Var2;
                                        }
                                        vl1 d2 = androidx.compose.ui.layout.a.d(vl1Var3, (Function1) M9);
                                        xy2 xy2Var4 = xy2Var2;
                                        boolean h11 = a00Var2.h(xy2Var4) | (i26 == 4) | (i23 == 2048) | a00Var2.g(false) | (i24 == 16384) | a00Var2.h(sc1Var7) | a00Var2.h(cu1Var4) | a00Var2.h(gv2Var);
                                        int i27 = i13;
                                        z10 = h11 | ((i27 <= 32 && a00Var2.f(c11Var4)) || (i20 & 48) == 32);
                                        M10 = a00Var2.M();
                                        if (!z10 || M10 == obj3) {
                                            c11 c11Var7 = c11Var4;
                                            gv2 gv2Var5 = gv2Var;
                                            sc1 sc1Var9 = sc1Var7;
                                            sv2Var3 = sv2Var2;
                                            k40 k40Var = new k40(xy2Var4, nv2Var, z2, c11Var7, sc1Var9, cu1Var4, gv2Var5, to0Var2);
                                            sc1Var7 = sc1Var9;
                                            gv2Var2 = gv2Var5;
                                            c11Var4 = c11Var7;
                                            a00Var2.i0(k40Var);
                                            M10 = k40Var;
                                        } else {
                                            gv2Var2 = gv2Var;
                                            sv2Var3 = sv2Var2;
                                        }
                                        AtomicInteger atomicInteger = wh2.a;
                                        AppendedSemanticsElement appendedSemanticsElement2 = new AppendedSemanticsElement((Function1) M10, true);
                                        z11 = !z2 && ((Boolean) ((mc1) x63Var3).a.getValue()).booleanValue() && jw2.b(((jw2) sc1Var7.x.getValue()).a) && jw2.b(((jw2) sc1Var7.y.getValue()).a);
                                        float f5 = eu2.a;
                                        if (z11) {
                                            cu1 cu1Var9 = cu1Var4;
                                            sc1 sc1Var10 = sc1Var7;
                                            sc1Var7 = sc1Var10;
                                            appendedSemanticsElement = appendedSemanticsElement2;
                                            cu1Var4 = cu1Var9;
                                            vl1Var4 = bd3.n(vl1Var3, new pc(nn2Var, sc1Var10, nv2Var, cu1Var9, 1));
                                        } else {
                                            appendedSemanticsElement = appendedSemanticsElement2;
                                            vl1Var4 = vl1Var3;
                                        }
                                        h7 = a00Var2.h(gv2Var2);
                                        M11 = a00Var2.M();
                                        if (!h7 || M11 == obj3) {
                                            M11 = new y30(gv2Var2, 0);
                                            a00Var2.i0(M11);
                                        }
                                        l41.f(gv2Var2, (Function1) M11, a00Var2);
                                        h8 = a00Var2.h(sc1Var7) | a00Var2.h(sv2Var3) | (i26 == 4) | ((i27 <= 32 && a00Var2.f(c11Var4)) || (i20 & 48) == 32);
                                        M12 = a00Var2.M();
                                        if (!h8 || M12 == obj3) {
                                            c11 c11Var8 = c11Var4;
                                            gc gcVar = new gc(sc1Var7, sv2Var3, nv2Var, c11Var8, 1);
                                            c11Var5 = c11Var8;
                                            a00Var2.i0(gcVar);
                                            M12 = gcVar;
                                        } else {
                                            c11Var5 = c11Var4;
                                        }
                                        l41.f(c11Var5, (Function1) M12, a00Var2);
                                        gv2Var3 = gv2Var2;
                                        AppendedSemanticsElement appendedSemanticsElement3 = appendedSemanticsElement;
                                        vl1 n2 = bd3.n(vl1Var3, new ru2(sc1Var7, gv2Var3, nv2Var, true, i2 == 1, cu1Var4, z13Var2, sc1Var7.t, c11Var5.e));
                                        boolean booleanValue = ((Boolean) zn1Var.getValue()).booleanValue();
                                        ea eaVar3 = eaVar;
                                        h9 = a00Var2.h(sc1Var7) | ((i27 <= 32 && a00Var2.f(c11Var5)) || (i20 & 48) == 32) | a00Var2.h(eaVar3);
                                        M13 = a00Var2.M();
                                        if (!h9 || M13 == obj3) {
                                            h9 h9Var = new h9(sc1Var7, to0Var2, c11Var5, eaVar3, 1);
                                            a00Var2.i0(h9Var);
                                            M13 = h9Var;
                                        }
                                        int i28 = 3;
                                        cu1 cu1Var10 = cu1Var4;
                                        dv2 dv2Var3 = dv2Var;
                                        vl1 d3 = androidx.compose.ui.layout.a.d(bd3.n(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(vl1Var, eaVar3, sc1Var7, gv2Var3).k(androidx.compose.foundation.text.handwriting.a.a((Function0) M13, booleanValue)).k(vl1Var2), new ih2(i28, no0Var2, sc1Var7)), new p8(14, sc1Var7, gv2Var3)).k(n2), new ku(i28, dv2Var3, bn1Var, z2)).k(k4).k(appendedSemanticsElement3), new d40(sc1Var7, 0));
                                        z12 = !z2 && sc1Var7.b() && ((Boolean) sc1Var7.q.getValue()).booleanValue() && ((Boolean) ((mc1) x63Var3).a.getValue()).booleanValue();
                                        if (z12 && ch1.a()) {
                                            vl1Var3 = bd3.n(vl1Var3, new mc(2, gv2Var3));
                                        }
                                        a00Var2 = a00Var;
                                        i(d3, gv2Var3, yj1.H(-374338080, new b40(myVar, sc1Var7, pw2Var, i3, i2, dv2Var3, nv2Var, ch2Var, vl1Var4, a4, d2, vl1Var3, opVar, gv2Var3, z12, function12, cu1Var10, ca0Var2), a00Var2), a00Var2, 384);
                                    }
                                } else {
                                    sc1Var4 = sc1Var3;
                                }
                                z8 = true;
                                z9 = f4 | z8;
                                Object M192 = a00Var2.M();
                                if (z9) {
                                }
                                gv2Var = gv2Var4;
                                cu1Var2 = cu1Var7;
                                i13 = i11;
                                vl1Var2 = a3;
                                sc1Var5 = sc1Var4;
                                unit = unit2;
                                daVar = new da(sc1Var5, k3, sv2Var, gv2Var, c11Var, null, 2);
                                zn1Var = k3;
                                sv2Var2 = sv2Var;
                                c11Var4 = c11Var;
                                a00Var2.i0(daVar);
                                l41.h(a00Var2, unit, (Function2) daVar);
                                h3 = a00Var2.h(sc1Var5);
                                M7 = a00Var2.M();
                                if (!h3) {
                                }
                                M7 = new d40(sc1Var5, 1);
                                a00Var2.i0(M7);
                                a60 a60Var2 = new a60((Function1) M7, null);
                                vl1Var3 = sl1.a;
                                k2 = vl1Var3.k(new SuspendPointerInputElement(8675309, null, new qr2(a60Var2), 6));
                                h4 = a00Var2.h(sc1Var5) | (i24 == 16384) | (i23 == 2048) | a00Var2.h(cu1Var2) | a00Var2.h(gv2Var);
                                Object M202 = a00Var2.M();
                                if (h4) {
                                }
                                cu1 cu1Var82 = cu1Var2;
                                g40Var = new g40(sc1Var5, to0Var2, z2, gv2Var, cu1Var82);
                                sc1Var6 = sc1Var5;
                                cu1Var3 = cu1Var82;
                                a00Var2.i0(g40Var);
                                Function1 function132 = (Function1) g40Var;
                                if (z2) {
                                }
                                ot2 ot2Var2 = gv2Var.u;
                                ev2 ev2Var2 = gv2Var.t;
                                vl1 k42 = k2.k(new SuspendPointerInputElement(ot2Var2, ev2Var2, new qr2(new ed(ot2Var2, ev2Var2, (o30) null, 18)), 4)).k(new PointerHoverIconModifierElement());
                                int i262 = i12;
                                h5 = a00Var2.h(sc1Var6) | (i262 == 4) | a00Var2.h(cu1Var3);
                                M8 = a00Var2.M();
                                if (!h5) {
                                }
                                M8 = new oc(sc1Var6, nv2Var2, cu1Var3, 3);
                                a00Var2.i0(M8);
                                vl1 a42 = androidx.compose.ui.draw.a.a(vl1Var3, (Function1) M8);
                                x63Var2 = x63Var;
                                h6 = a00Var2.h(sc1Var6) | (i23 == 2048) | a00Var2.f(x63Var2) | a00Var2.h(gv2Var) | (i262 == 4) | a00Var2.h(cu1Var3);
                                M9 = a00Var2.M();
                                if (h6) {
                                }
                                cu1Var4 = cu1Var3;
                                sc1Var7 = sc1Var6;
                                f40 f40Var2 = new f40(sc1Var7, z2, x63Var2, gv2Var, nv2Var2, cu1Var4);
                                x63Var3 = x63Var2;
                                a00Var2.i0(f40Var2);
                                M9 = f40Var2;
                                vl1 d22 = androidx.compose.ui.layout.a.d(vl1Var3, (Function1) M9);
                                xy2 xy2Var42 = xy2Var2;
                                boolean h112 = a00Var2.h(xy2Var42) | (i262 == 4) | (i23 == 2048) | a00Var2.g(false) | (i24 == 16384) | a00Var2.h(sc1Var7) | a00Var2.h(cu1Var4) | a00Var2.h(gv2Var);
                                int i272 = i13;
                                z10 = h112 | ((i272 <= 32 && a00Var2.f(c11Var4)) || (i20 & 48) == 32);
                                M10 = a00Var2.M();
                                if (z10) {
                                }
                                c11 c11Var72 = c11Var4;
                                gv2 gv2Var52 = gv2Var;
                                sc1 sc1Var92 = sc1Var7;
                                sv2Var3 = sv2Var2;
                                k40 k40Var2 = new k40(xy2Var42, nv2Var, z2, c11Var72, sc1Var92, cu1Var4, gv2Var52, to0Var2);
                                sc1Var7 = sc1Var92;
                                gv2Var2 = gv2Var52;
                                c11Var4 = c11Var72;
                                a00Var2.i0(k40Var2);
                                M10 = k40Var2;
                                AtomicInteger atomicInteger2 = wh2.a;
                                AppendedSemanticsElement appendedSemanticsElement22 = new AppendedSemanticsElement((Function1) M10, true);
                                if (z2) {
                                }
                                float f52 = eu2.a;
                                if (z11) {
                                }
                                h7 = a00Var2.h(gv2Var2);
                                M11 = a00Var2.M();
                                if (!h7) {
                                }
                                M11 = new y30(gv2Var2, 0);
                                a00Var2.i0(M11);
                                l41.f(gv2Var2, (Function1) M11, a00Var2);
                                h8 = a00Var2.h(sc1Var7) | a00Var2.h(sv2Var3) | (i262 == 4) | ((i272 <= 32 && a00Var2.f(c11Var4)) || (i20 & 48) == 32);
                                M12 = a00Var2.M();
                                if (h8) {
                                }
                                c11 c11Var82 = c11Var4;
                                gc gcVar2 = new gc(sc1Var7, sv2Var3, nv2Var, c11Var82, 1);
                                c11Var5 = c11Var82;
                                a00Var2.i0(gcVar2);
                                M12 = gcVar2;
                                l41.f(c11Var5, (Function1) M12, a00Var2);
                                gv2Var3 = gv2Var2;
                                AppendedSemanticsElement appendedSemanticsElement32 = appendedSemanticsElement;
                                vl1 n22 = bd3.n(vl1Var3, new ru2(sc1Var7, gv2Var3, nv2Var, true, i2 == 1, cu1Var4, z13Var2, sc1Var7.t, c11Var5.e));
                                boolean booleanValue2 = ((Boolean) zn1Var.getValue()).booleanValue();
                                ea eaVar32 = eaVar;
                                h9 = a00Var2.h(sc1Var7) | ((i272 <= 32 && a00Var2.f(c11Var5)) || (i20 & 48) == 32) | a00Var2.h(eaVar32);
                                M13 = a00Var2.M();
                                if (!h9) {
                                }
                                h9 h9Var2 = new h9(sc1Var7, to0Var2, c11Var5, eaVar32, 1);
                                a00Var2.i0(h9Var2);
                                M13 = h9Var2;
                                int i282 = 3;
                                cu1 cu1Var102 = cu1Var4;
                                dv2 dv2Var32 = dv2Var;
                                vl1 d32 = androidx.compose.ui.layout.a.d(bd3.n(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(vl1Var, eaVar32, sc1Var7, gv2Var3).k(androidx.compose.foundation.text.handwriting.a.a((Function0) M13, booleanValue2)).k(vl1Var2), new ih2(i282, no0Var2, sc1Var7)), new p8(14, sc1Var7, gv2Var3)).k(n22), new ku(i282, dv2Var32, bn1Var, z2)).k(k42).k(appendedSemanticsElement32), new d40(sc1Var7, 0));
                                if (z2) {
                                }
                                if (z12) {
                                    vl1Var3 = bd3.n(vl1Var3, new mc(2, gv2Var3));
                                }
                                a00Var2 = a00Var;
                                i(d32, gv2Var3, yj1.H(-374338080, new b40(myVar, sc1Var7, pw2Var, i3, i2, dv2Var32, nv2Var, ch2Var, vl1Var4, a42, d22, vl1Var3, opVar, gv2Var3, z12, function12, cu1Var102, ca0Var2), a00Var2), a00Var2, 384);
                            }
                        } else {
                            c11Var2 = c11Var;
                        }
                        i12 = i25;
                        sc1Var2 = sc1Var8;
                        if ((i20 & 48) != 32) {
                            z6 = false;
                            h2 = h10 | z6 | a00Var2.h(cu1Var7) | a00Var2.h(a50Var) | a00Var2.h(opVar2) | a00Var2.h(gv2Var4);
                            Object M182 = a00Var2.M();
                            if (h2) {
                            }
                            no0Var2 = no0Var;
                            c11 c11Var62 = c11Var2;
                            z13Var2 = z13Var;
                            dv2Var = dv2Var2;
                            xy2Var2 = xy2Var;
                            eaVar = eaVar2;
                            sc1Var3 = sc1Var2;
                            obj3 = obj2;
                            to0Var2 = to0Var4;
                            sv2Var = sv2Var4;
                            bn1Var2 = bn1Var;
                            e40Var = new e40(sc1Var3, z2, sv2Var, nv2Var, c11Var62, cu1Var7, gv2Var4, a50Var, opVar2);
                            nv2Var2 = nv2Var;
                            c11Var3 = c11Var62;
                            opVar = opVar2;
                            z7 = z2;
                            a00Var2.i0(e40Var);
                            vl1 a32 = c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(to0Var2), (Function1) e40Var), z7, bn1Var2);
                            zn1 k32 = ij2.k(Boolean.valueOf(z7), a00Var2);
                            Unit unit22 = Unit.a;
                            boolean f42 = a00Var2.f(k32) | a00Var2.h(sc1Var3) | a00Var2.h(sv2Var) | a00Var2.h(gv2Var4);
                            if (i11 > 32) {
                            }
                            sc1Var4 = sc1Var3;
                            if ((i20 & 48) != 32) {
                            }
                            z8 = true;
                            z9 = f42 | z8;
                            Object M1922 = a00Var2.M();
                            if (z9) {
                            }
                            gv2Var = gv2Var4;
                            cu1Var2 = cu1Var7;
                            i13 = i11;
                            vl1Var2 = a32;
                            sc1Var5 = sc1Var4;
                            unit = unit22;
                            daVar = new da(sc1Var5, k32, sv2Var, gv2Var, c11Var, null, 2);
                            zn1Var = k32;
                            sv2Var2 = sv2Var;
                            c11Var4 = c11Var;
                            a00Var2.i0(daVar);
                            l41.h(a00Var2, unit, (Function2) daVar);
                            h3 = a00Var2.h(sc1Var5);
                            M7 = a00Var2.M();
                            if (!h3) {
                            }
                            M7 = new d40(sc1Var5, 1);
                            a00Var2.i0(M7);
                            a60 a60Var22 = new a60((Function1) M7, null);
                            vl1Var3 = sl1.a;
                            k2 = vl1Var3.k(new SuspendPointerInputElement(8675309, null, new qr2(a60Var22), 6));
                            h4 = a00Var2.h(sc1Var5) | (i24 == 16384) | (i23 == 2048) | a00Var2.h(cu1Var2) | a00Var2.h(gv2Var);
                            Object M2022 = a00Var2.M();
                            if (h4) {
                            }
                            cu1 cu1Var822 = cu1Var2;
                            g40Var = new g40(sc1Var5, to0Var2, z2, gv2Var, cu1Var822);
                            sc1Var6 = sc1Var5;
                            cu1Var3 = cu1Var822;
                            a00Var2.i0(g40Var);
                            Function1 function1322 = (Function1) g40Var;
                            if (z2) {
                            }
                            ot2 ot2Var22 = gv2Var.u;
                            ev2 ev2Var22 = gv2Var.t;
                            vl1 k422 = k2.k(new SuspendPointerInputElement(ot2Var22, ev2Var22, new qr2(new ed(ot2Var22, ev2Var22, (o30) null, 18)), 4)).k(new PointerHoverIconModifierElement());
                            int i2622 = i12;
                            h5 = a00Var2.h(sc1Var6) | (i2622 == 4) | a00Var2.h(cu1Var3);
                            M8 = a00Var2.M();
                            if (!h5) {
                            }
                            M8 = new oc(sc1Var6, nv2Var2, cu1Var3, 3);
                            a00Var2.i0(M8);
                            vl1 a422 = androidx.compose.ui.draw.a.a(vl1Var3, (Function1) M8);
                            x63Var2 = x63Var;
                            h6 = a00Var2.h(sc1Var6) | (i23 == 2048) | a00Var2.f(x63Var2) | a00Var2.h(gv2Var) | (i2622 == 4) | a00Var2.h(cu1Var3);
                            M9 = a00Var2.M();
                            if (h6) {
                            }
                            cu1Var4 = cu1Var3;
                            sc1Var7 = sc1Var6;
                            f40 f40Var22 = new f40(sc1Var7, z2, x63Var2, gv2Var, nv2Var2, cu1Var4);
                            x63Var3 = x63Var2;
                            a00Var2.i0(f40Var22);
                            M9 = f40Var22;
                            vl1 d222 = androidx.compose.ui.layout.a.d(vl1Var3, (Function1) M9);
                            xy2 xy2Var422 = xy2Var2;
                            boolean h1122 = a00Var2.h(xy2Var422) | (i2622 == 4) | (i23 == 2048) | a00Var2.g(false) | (i24 == 16384) | a00Var2.h(sc1Var7) | a00Var2.h(cu1Var4) | a00Var2.h(gv2Var);
                            int i2722 = i13;
                            z10 = h1122 | ((i2722 <= 32 && a00Var2.f(c11Var4)) || (i20 & 48) == 32);
                            M10 = a00Var2.M();
                            if (z10) {
                            }
                            c11 c11Var722 = c11Var4;
                            gv2 gv2Var522 = gv2Var;
                            sc1 sc1Var922 = sc1Var7;
                            sv2Var3 = sv2Var2;
                            k40 k40Var22 = new k40(xy2Var422, nv2Var, z2, c11Var722, sc1Var922, cu1Var4, gv2Var522, to0Var2);
                            sc1Var7 = sc1Var922;
                            gv2Var2 = gv2Var522;
                            c11Var4 = c11Var722;
                            a00Var2.i0(k40Var22);
                            M10 = k40Var22;
                            AtomicInteger atomicInteger22 = wh2.a;
                            AppendedSemanticsElement appendedSemanticsElement222 = new AppendedSemanticsElement((Function1) M10, true);
                            if (z2) {
                            }
                            float f522 = eu2.a;
                            if (z11) {
                            }
                            h7 = a00Var2.h(gv2Var2);
                            M11 = a00Var2.M();
                            if (!h7) {
                            }
                            M11 = new y30(gv2Var2, 0);
                            a00Var2.i0(M11);
                            l41.f(gv2Var2, (Function1) M11, a00Var2);
                            h8 = a00Var2.h(sc1Var7) | a00Var2.h(sv2Var3) | (i2622 == 4) | ((i2722 <= 32 && a00Var2.f(c11Var4)) || (i20 & 48) == 32);
                            M12 = a00Var2.M();
                            if (h8) {
                            }
                            c11 c11Var822 = c11Var4;
                            gc gcVar22 = new gc(sc1Var7, sv2Var3, nv2Var, c11Var822, 1);
                            c11Var5 = c11Var822;
                            a00Var2.i0(gcVar22);
                            M12 = gcVar22;
                            l41.f(c11Var5, (Function1) M12, a00Var2);
                            gv2Var3 = gv2Var2;
                            AppendedSemanticsElement appendedSemanticsElement322 = appendedSemanticsElement;
                            vl1 n222 = bd3.n(vl1Var3, new ru2(sc1Var7, gv2Var3, nv2Var, true, i2 == 1, cu1Var4, z13Var2, sc1Var7.t, c11Var5.e));
                            boolean booleanValue22 = ((Boolean) zn1Var.getValue()).booleanValue();
                            ea eaVar322 = eaVar;
                            h9 = a00Var2.h(sc1Var7) | ((i2722 <= 32 && a00Var2.f(c11Var5)) || (i20 & 48) == 32) | a00Var2.h(eaVar322);
                            M13 = a00Var2.M();
                            if (!h9) {
                            }
                            h9 h9Var22 = new h9(sc1Var7, to0Var2, c11Var5, eaVar322, 1);
                            a00Var2.i0(h9Var22);
                            M13 = h9Var22;
                            int i2822 = 3;
                            cu1 cu1Var1022 = cu1Var4;
                            dv2 dv2Var322 = dv2Var;
                            vl1 d322 = androidx.compose.ui.layout.a.d(bd3.n(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(vl1Var, eaVar322, sc1Var7, gv2Var3).k(androidx.compose.foundation.text.handwriting.a.a((Function0) M13, booleanValue22)).k(vl1Var2), new ih2(i2822, no0Var2, sc1Var7)), new p8(14, sc1Var7, gv2Var3)).k(n222), new ku(i2822, dv2Var322, bn1Var, z2)).k(k422).k(appendedSemanticsElement322), new d40(sc1Var7, 0));
                            if (z2) {
                            }
                            if (z12) {
                            }
                            a00Var2 = a00Var;
                            i(d322, gv2Var3, yj1.H(-374338080, new b40(myVar, sc1Var7, pw2Var, i3, i2, dv2Var322, nv2Var, ch2Var, vl1Var4, a422, d222, vl1Var3, opVar, gv2Var3, z12, function12, cu1Var1022, ca0Var2), a00Var2), a00Var2, 384);
                        }
                        z6 = true;
                        h2 = h10 | z6 | a00Var2.h(cu1Var7) | a00Var2.h(a50Var) | a00Var2.h(opVar2) | a00Var2.h(gv2Var4);
                        Object M1822 = a00Var2.M();
                        if (h2) {
                        }
                        no0Var2 = no0Var;
                        c11 c11Var622 = c11Var2;
                        z13Var2 = z13Var;
                        dv2Var = dv2Var2;
                        xy2Var2 = xy2Var;
                        eaVar = eaVar2;
                        sc1Var3 = sc1Var2;
                        obj3 = obj2;
                        to0Var2 = to0Var4;
                        sv2Var = sv2Var4;
                        bn1Var2 = bn1Var;
                        e40Var = new e40(sc1Var3, z2, sv2Var, nv2Var, c11Var622, cu1Var7, gv2Var4, a50Var, opVar2);
                        nv2Var2 = nv2Var;
                        c11Var3 = c11Var622;
                        opVar = opVar2;
                        z7 = z2;
                        a00Var2.i0(e40Var);
                        vl1 a322 = c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(to0Var2), (Function1) e40Var), z7, bn1Var2);
                        zn1 k322 = ij2.k(Boolean.valueOf(z7), a00Var2);
                        Unit unit222 = Unit.a;
                        boolean f422 = a00Var2.f(k322) | a00Var2.h(sc1Var3) | a00Var2.h(sv2Var) | a00Var2.h(gv2Var4);
                        if (i11 > 32) {
                        }
                        sc1Var4 = sc1Var3;
                        if ((i20 & 48) != 32) {
                        }
                        z8 = true;
                        z9 = f422 | z8;
                        Object M19222 = a00Var2.M();
                        if (z9) {
                        }
                        gv2Var = gv2Var4;
                        cu1Var2 = cu1Var7;
                        i13 = i11;
                        vl1Var2 = a322;
                        sc1Var5 = sc1Var4;
                        unit = unit222;
                        daVar = new da(sc1Var5, k322, sv2Var, gv2Var, c11Var, null, 2);
                        zn1Var = k322;
                        sv2Var2 = sv2Var;
                        c11Var4 = c11Var;
                        a00Var2.i0(daVar);
                        l41.h(a00Var2, unit, (Function2) daVar);
                        h3 = a00Var2.h(sc1Var5);
                        M7 = a00Var2.M();
                        if (!h3) {
                        }
                        M7 = new d40(sc1Var5, 1);
                        a00Var2.i0(M7);
                        a60 a60Var222 = new a60((Function1) M7, null);
                        vl1Var3 = sl1.a;
                        k2 = vl1Var3.k(new SuspendPointerInputElement(8675309, null, new qr2(a60Var222), 6));
                        h4 = a00Var2.h(sc1Var5) | (i24 == 16384) | (i23 == 2048) | a00Var2.h(cu1Var2) | a00Var2.h(gv2Var);
                        Object M20222 = a00Var2.M();
                        if (h4) {
                        }
                        cu1 cu1Var8222 = cu1Var2;
                        g40Var = new g40(sc1Var5, to0Var2, z2, gv2Var, cu1Var8222);
                        sc1Var6 = sc1Var5;
                        cu1Var3 = cu1Var8222;
                        a00Var2.i0(g40Var);
                        Function1 function13222 = (Function1) g40Var;
                        if (z2) {
                        }
                        ot2 ot2Var222 = gv2Var.u;
                        ev2 ev2Var222 = gv2Var.t;
                        vl1 k4222 = k2.k(new SuspendPointerInputElement(ot2Var222, ev2Var222, new qr2(new ed(ot2Var222, ev2Var222, (o30) null, 18)), 4)).k(new PointerHoverIconModifierElement());
                        int i26222 = i12;
                        h5 = a00Var2.h(sc1Var6) | (i26222 == 4) | a00Var2.h(cu1Var3);
                        M8 = a00Var2.M();
                        if (!h5) {
                        }
                        M8 = new oc(sc1Var6, nv2Var2, cu1Var3, 3);
                        a00Var2.i0(M8);
                        vl1 a4222 = androidx.compose.ui.draw.a.a(vl1Var3, (Function1) M8);
                        x63Var2 = x63Var;
                        h6 = a00Var2.h(sc1Var6) | (i23 == 2048) | a00Var2.f(x63Var2) | a00Var2.h(gv2Var) | (i26222 == 4) | a00Var2.h(cu1Var3);
                        M9 = a00Var2.M();
                        if (h6) {
                        }
                        cu1Var4 = cu1Var3;
                        sc1Var7 = sc1Var6;
                        f40 f40Var222 = new f40(sc1Var7, z2, x63Var2, gv2Var, nv2Var2, cu1Var4);
                        x63Var3 = x63Var2;
                        a00Var2.i0(f40Var222);
                        M9 = f40Var222;
                        vl1 d2222 = androidx.compose.ui.layout.a.d(vl1Var3, (Function1) M9);
                        xy2 xy2Var4222 = xy2Var2;
                        boolean h11222 = a00Var2.h(xy2Var4222) | (i26222 == 4) | (i23 == 2048) | a00Var2.g(false) | (i24 == 16384) | a00Var2.h(sc1Var7) | a00Var2.h(cu1Var4) | a00Var2.h(gv2Var);
                        int i27222 = i13;
                        z10 = h11222 | ((i27222 <= 32 && a00Var2.f(c11Var4)) || (i20 & 48) == 32);
                        M10 = a00Var2.M();
                        if (z10) {
                        }
                        c11 c11Var7222 = c11Var4;
                        gv2 gv2Var5222 = gv2Var;
                        sc1 sc1Var9222 = sc1Var7;
                        sv2Var3 = sv2Var2;
                        k40 k40Var222 = new k40(xy2Var4222, nv2Var, z2, c11Var7222, sc1Var9222, cu1Var4, gv2Var5222, to0Var2);
                        sc1Var7 = sc1Var9222;
                        gv2Var2 = gv2Var5222;
                        c11Var4 = c11Var7222;
                        a00Var2.i0(k40Var222);
                        M10 = k40Var222;
                        AtomicInteger atomicInteger222 = wh2.a;
                        AppendedSemanticsElement appendedSemanticsElement2222 = new AppendedSemanticsElement((Function1) M10, true);
                        if (z2) {
                        }
                        float f5222 = eu2.a;
                        if (z11) {
                        }
                        h7 = a00Var2.h(gv2Var2);
                        M11 = a00Var2.M();
                        if (!h7) {
                        }
                        M11 = new y30(gv2Var2, 0);
                        a00Var2.i0(M11);
                        l41.f(gv2Var2, (Function1) M11, a00Var2);
                        h8 = a00Var2.h(sc1Var7) | a00Var2.h(sv2Var3) | (i26222 == 4) | ((i27222 <= 32 && a00Var2.f(c11Var4)) || (i20 & 48) == 32);
                        M12 = a00Var2.M();
                        if (h8) {
                        }
                        c11 c11Var8222 = c11Var4;
                        gc gcVar222 = new gc(sc1Var7, sv2Var3, nv2Var, c11Var8222, 1);
                        c11Var5 = c11Var8222;
                        a00Var2.i0(gcVar222);
                        M12 = gcVar222;
                        l41.f(c11Var5, (Function1) M12, a00Var2);
                        gv2Var3 = gv2Var2;
                        AppendedSemanticsElement appendedSemanticsElement3222 = appendedSemanticsElement;
                        vl1 n2222 = bd3.n(vl1Var3, new ru2(sc1Var7, gv2Var3, nv2Var, true, i2 == 1, cu1Var4, z13Var2, sc1Var7.t, c11Var5.e));
                        boolean booleanValue222 = ((Boolean) zn1Var.getValue()).booleanValue();
                        ea eaVar3222 = eaVar;
                        h9 = a00Var2.h(sc1Var7) | ((i27222 <= 32 && a00Var2.f(c11Var5)) || (i20 & 48) == 32) | a00Var2.h(eaVar3222);
                        M13 = a00Var2.M();
                        if (!h9) {
                        }
                        h9 h9Var222 = new h9(sc1Var7, to0Var2, c11Var5, eaVar3222, 1);
                        a00Var2.i0(h9Var222);
                        M13 = h9Var222;
                        int i28222 = 3;
                        cu1 cu1Var10222 = cu1Var4;
                        dv2 dv2Var3222 = dv2Var;
                        vl1 d3222 = androidx.compose.ui.layout.a.d(bd3.n(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(vl1Var, eaVar3222, sc1Var7, gv2Var3).k(androidx.compose.foundation.text.handwriting.a.a((Function0) M13, booleanValue222)).k(vl1Var2), new ih2(i28222, no0Var2, sc1Var7)), new p8(14, sc1Var7, gv2Var3)).k(n2222), new ku(i28222, dv2Var3222, bn1Var, z2)).k(k4222).k(appendedSemanticsElement3222), new d40(sc1Var7, 0));
                        if (z2) {
                        }
                        if (z12) {
                        }
                        a00Var2 = a00Var;
                        i(d3222, gv2Var3, yj1.H(-374338080, new b40(myVar, sc1Var7, pw2Var, i3, i2, dv2Var3222, nv2Var, ch2Var, vl1Var4, a4222, d2222, vl1Var3, opVar, gv2Var3, z12, function12, cu1Var10222, ca0Var2), a00Var2), a00Var2, 384);
                    }
                    z5 = false;
                    if (jw2Var3 != null) {
                    }
                    if (z4) {
                    }
                    qf0 qf0Var22 = (qf0) t21Var.o;
                    qf0Var22.d = -1;
                    qf0Var22.e = -1;
                    a2 = nv2.a(nv2Var, null, 0L, 3);
                    nv2 nv2Var32 = (nv2) t21Var.n;
                    t21Var.n = a2;
                    if (wv2Var != null) {
                    }
                    M3 = a00Var2.M();
                    obj2 = obj;
                    if (M3 == obj2) {
                    }
                    z13Var = (z13) M3;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (!z13Var.e) {
                    }
                    z13Var.d = Long.valueOf(currentTimeMillis2);
                    z13Var.a(nv2Var);
                    M4 = a00Var2.M();
                    if (M4 == obj2) {
                    }
                    gv2 gv2Var42 = (gv2) M4;
                    cu1 cu1Var72 = cu1Var;
                    gv2Var42.b = cu1Var72;
                    gv2Var42.c = sc1Var8.t;
                    gv2Var42.d = sc1Var8;
                    gv2Var42.e.setValue(nv2Var);
                    gv2Var42.f = (vu) a00Var2.j(p00.e);
                    gv2Var42.g = (qw2) a00Var2.j(p00.q);
                    gv2Var42.h = (hx0) a00Var2.j(p00.l);
                    to0 to0Var42 = to0Var;
                    gv2Var42.i = to0Var42;
                    gv2Var42.j.setValue(true);
                    gv2Var42.k.setValue(Boolean.valueOf(z2));
                    M5 = a00Var2.M();
                    if (M5 == obj2) {
                    }
                    a50 a50Var2 = ((q00) M5).m;
                    M6 = a00Var2.M();
                    if (M6 == obj2) {
                    }
                    op opVar22 = (op) M6;
                    int i232 = i20 & 7168;
                    int i242 = i20 & 57344;
                    int i252 = i10;
                    boolean h102 = (i242 != 16384) | a00Var2.h(sc1Var8) | (i232 != 2048) | a00Var2.h(sv2Var4) | (i252 != 4);
                    i11 = (i20 & 112) ^ 48;
                    if (i11 <= 32) {
                    }
                    i12 = i252;
                    sc1Var2 = sc1Var8;
                    if ((i20 & 48) != 32) {
                    }
                    z6 = true;
                    h2 = h102 | z6 | a00Var2.h(cu1Var72) | a00Var2.h(a50Var2) | a00Var2.h(opVar22) | a00Var2.h(gv2Var42);
                    Object M18222 = a00Var2.M();
                    if (h2) {
                    }
                    no0Var2 = no0Var;
                    c11 c11Var6222 = c11Var2;
                    z13Var2 = z13Var;
                    dv2Var = dv2Var2;
                    xy2Var2 = xy2Var;
                    eaVar = eaVar2;
                    sc1Var3 = sc1Var2;
                    obj3 = obj2;
                    to0Var2 = to0Var42;
                    sv2Var = sv2Var4;
                    bn1Var2 = bn1Var;
                    e40Var = new e40(sc1Var3, z2, sv2Var, nv2Var, c11Var6222, cu1Var72, gv2Var42, a50Var2, opVar22);
                    nv2Var2 = nv2Var;
                    c11Var3 = c11Var6222;
                    opVar = opVar22;
                    z7 = z2;
                    a00Var2.i0(e40Var);
                    vl1 a3222 = c.a(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(to0Var2), (Function1) e40Var), z7, bn1Var2);
                    zn1 k3222 = ij2.k(Boolean.valueOf(z7), a00Var2);
                    Unit unit2222 = Unit.a;
                    boolean f4222 = a00Var2.f(k3222) | a00Var2.h(sc1Var3) | a00Var2.h(sv2Var) | a00Var2.h(gv2Var42);
                    if (i11 > 32) {
                    }
                    sc1Var4 = sc1Var3;
                    if ((i20 & 48) != 32) {
                    }
                    z8 = true;
                    z9 = f4222 | z8;
                    Object M192222 = a00Var2.M();
                    if (z9) {
                    }
                    gv2Var = gv2Var42;
                    cu1Var2 = cu1Var72;
                    i13 = i11;
                    vl1Var2 = a3222;
                    sc1Var5 = sc1Var4;
                    unit = unit2222;
                    daVar = new da(sc1Var5, k3222, sv2Var, gv2Var, c11Var, null, 2);
                    zn1Var = k3222;
                    sv2Var2 = sv2Var;
                    c11Var4 = c11Var;
                    a00Var2.i0(daVar);
                    l41.h(a00Var2, unit, (Function2) daVar);
                    h3 = a00Var2.h(sc1Var5);
                    M7 = a00Var2.M();
                    if (!h3) {
                    }
                    M7 = new d40(sc1Var5, 1);
                    a00Var2.i0(M7);
                    a60 a60Var2222 = new a60((Function1) M7, null);
                    vl1Var3 = sl1.a;
                    k2 = vl1Var3.k(new SuspendPointerInputElement(8675309, null, new qr2(a60Var2222), 6));
                    h4 = a00Var2.h(sc1Var5) | (i242 == 16384) | (i232 == 2048) | a00Var2.h(cu1Var2) | a00Var2.h(gv2Var);
                    Object M202222 = a00Var2.M();
                    if (h4) {
                    }
                    cu1 cu1Var82222 = cu1Var2;
                    g40Var = new g40(sc1Var5, to0Var2, z2, gv2Var, cu1Var82222);
                    sc1Var6 = sc1Var5;
                    cu1Var3 = cu1Var82222;
                    a00Var2.i0(g40Var);
                    Function1 function132222 = (Function1) g40Var;
                    if (z2) {
                    }
                    ot2 ot2Var2222 = gv2Var.u;
                    ev2 ev2Var2222 = gv2Var.t;
                    vl1 k42222 = k2.k(new SuspendPointerInputElement(ot2Var2222, ev2Var2222, new qr2(new ed(ot2Var2222, ev2Var2222, (o30) null, 18)), 4)).k(new PointerHoverIconModifierElement());
                    int i262222 = i12;
                    h5 = a00Var2.h(sc1Var6) | (i262222 == 4) | a00Var2.h(cu1Var3);
                    M8 = a00Var2.M();
                    if (!h5) {
                    }
                    M8 = new oc(sc1Var6, nv2Var2, cu1Var3, 3);
                    a00Var2.i0(M8);
                    vl1 a42222 = androidx.compose.ui.draw.a.a(vl1Var3, (Function1) M8);
                    x63Var2 = x63Var;
                    h6 = a00Var2.h(sc1Var6) | (i232 == 2048) | a00Var2.f(x63Var2) | a00Var2.h(gv2Var) | (i262222 == 4) | a00Var2.h(cu1Var3);
                    M9 = a00Var2.M();
                    if (h6) {
                    }
                    cu1Var4 = cu1Var3;
                    sc1Var7 = sc1Var6;
                    f40 f40Var2222 = new f40(sc1Var7, z2, x63Var2, gv2Var, nv2Var2, cu1Var4);
                    x63Var3 = x63Var2;
                    a00Var2.i0(f40Var2222);
                    M9 = f40Var2222;
                    vl1 d22222 = androidx.compose.ui.layout.a.d(vl1Var3, (Function1) M9);
                    xy2 xy2Var42222 = xy2Var2;
                    boolean h112222 = a00Var2.h(xy2Var42222) | (i262222 == 4) | (i232 == 2048) | a00Var2.g(false) | (i242 == 16384) | a00Var2.h(sc1Var7) | a00Var2.h(cu1Var4) | a00Var2.h(gv2Var);
                    int i272222 = i13;
                    z10 = h112222 | ((i272222 <= 32 && a00Var2.f(c11Var4)) || (i20 & 48) == 32);
                    M10 = a00Var2.M();
                    if (z10) {
                    }
                    c11 c11Var72222 = c11Var4;
                    gv2 gv2Var52222 = gv2Var;
                    sc1 sc1Var92222 = sc1Var7;
                    sv2Var3 = sv2Var2;
                    k40 k40Var2222 = new k40(xy2Var42222, nv2Var, z2, c11Var72222, sc1Var92222, cu1Var4, gv2Var52222, to0Var2);
                    sc1Var7 = sc1Var92222;
                    gv2Var2 = gv2Var52222;
                    c11Var4 = c11Var72222;
                    a00Var2.i0(k40Var2222);
                    M10 = k40Var2222;
                    AtomicInteger atomicInteger2222 = wh2.a;
                    AppendedSemanticsElement appendedSemanticsElement22222 = new AppendedSemanticsElement((Function1) M10, true);
                    if (z2) {
                    }
                    float f52222 = eu2.a;
                    if (z11) {
                    }
                    h7 = a00Var2.h(gv2Var2);
                    M11 = a00Var2.M();
                    if (!h7) {
                    }
                    M11 = new y30(gv2Var2, 0);
                    a00Var2.i0(M11);
                    l41.f(gv2Var2, (Function1) M11, a00Var2);
                    h8 = a00Var2.h(sc1Var7) | a00Var2.h(sv2Var3) | (i262222 == 4) | ((i272222 <= 32 && a00Var2.f(c11Var4)) || (i20 & 48) == 32);
                    M12 = a00Var2.M();
                    if (h8) {
                    }
                    c11 c11Var82222 = c11Var4;
                    gc gcVar2222 = new gc(sc1Var7, sv2Var3, nv2Var, c11Var82222, 1);
                    c11Var5 = c11Var82222;
                    a00Var2.i0(gcVar2222);
                    M12 = gcVar2222;
                    l41.f(c11Var5, (Function1) M12, a00Var2);
                    gv2Var3 = gv2Var2;
                    AppendedSemanticsElement appendedSemanticsElement32222 = appendedSemanticsElement;
                    vl1 n22222 = bd3.n(vl1Var3, new ru2(sc1Var7, gv2Var3, nv2Var, true, i2 == 1, cu1Var4, z13Var2, sc1Var7.t, c11Var5.e));
                    boolean booleanValue2222 = ((Boolean) zn1Var.getValue()).booleanValue();
                    ea eaVar32222 = eaVar;
                    h9 = a00Var2.h(sc1Var7) | ((i272222 <= 32 && a00Var2.f(c11Var5)) || (i20 & 48) == 32) | a00Var2.h(eaVar32222);
                    M13 = a00Var2.M();
                    if (!h9) {
                    }
                    h9 h9Var2222 = new h9(sc1Var7, to0Var2, c11Var5, eaVar32222, 1);
                    a00Var2.i0(h9Var2222);
                    M13 = h9Var2222;
                    int i282222 = 3;
                    cu1 cu1Var102222 = cu1Var4;
                    dv2 dv2Var32222 = dv2Var;
                    vl1 d32222 = androidx.compose.ui.layout.a.d(bd3.n(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(vl1Var, eaVar32222, sc1Var7, gv2Var3).k(androidx.compose.foundation.text.handwriting.a.a((Function0) M13, booleanValue2222)).k(vl1Var2), new ih2(i282222, no0Var2, sc1Var7)), new p8(14, sc1Var7, gv2Var3)).k(n22222), new ku(i282222, dv2Var32222, bn1Var, z2)).k(k42222).k(appendedSemanticsElement32222), new d40(sc1Var7, 0));
                    if (z2) {
                    }
                    if (z12) {
                    }
                    a00Var2 = a00Var;
                    i(d32222, gv2Var3, yj1.H(-374338080, new b40(myVar, sc1Var7, pw2Var, i3, i2, dv2Var32222, nv2Var, ch2Var, vl1Var4, a42222, d22222, vl1Var3, opVar, gv2Var3, z12, function12, cu1Var102222, ca0Var2), a00Var2), a00Var2, 384);
                }
            }
            ww1Var = ww1.m;
            Object[] objArr2 = {ww1Var};
            tt1 tt1Var2 = dv2.f;
            f2 = a00Var2.f(ww1Var);
            M = a00Var2.M();
            if (!f2) {
            }
            M = new u(7, ww1Var);
            a00Var2.i0(M);
            dv2 dv2Var22 = (dv2) ll3.Q(objArr2, tt1Var2, (Function0) M, a00Var2, 0, 4);
            int i212 = i19 & 14;
            i9 = (i212 != 4 ? i8 : 0) | ((i19 & 57344) != 16384 ? i8 : 0);
            M2 = a00Var2.M();
            if (i9 == 0) {
            }
            xy2 r22 = z71.r(ch2Var, ydVar4);
            if (jw2Var2 == null) {
            }
            M2 = r22;
            a00Var2.i0(M2);
            xy2 xy2Var32 = (xy2) M2;
            yd ydVar52 = xy2Var32.a;
            cu1 cu1Var62 = xy2Var32.b;
            y = a00Var2.y();
            if (y != null) {
            }
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new c40(nv2Var, function1, vl1Var, pw2Var, ch2Var, function12, bn1Var, nn2Var, z, i2, i3, c11Var, f81Var, z2, myVar, i4, i5);
        }
    }

    public static final void i(vl1 vl1Var, gv2 gv2Var, my myVar, a00 a00Var, int i2) {
        a00Var.Z(-20551815);
        int i3 = (a00Var.f(vl1Var) ? 4 : 2) | i2 | (a00Var.h(gv2Var) ? 32 : 16);
        if ((i3 & 147) == 146 && a00Var.B()) {
            a00Var.S();
        } else {
            oj1 e2 = fp.e(qb2.p, true);
            int D = iv1.D(a00Var);
            v02 l2 = a00Var.l();
            vl1 E = bd3.E(a00Var, vl1Var);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e2, oz.f);
            uj2.e(a00Var, l2, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            iv1.c(gv2Var, myVar, a00Var, (i3 >> 3) & 126);
            a00Var.q(true);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new m8(vl1Var, gv2Var, myVar, i2, 2);
        }
    }

    public static final void j(String str, boolean z, Function0 function0, a00 a00Var, int i2) {
        a00 a00Var2;
        a00Var.Z(-360213748);
        int i3 = i2 | (a00Var.f(str) ? 4 : 2) | (a00Var.g(z) ? 32 : 16) | (a00Var.h(function0) ? 256 : 128);
        if (a00Var.P(i3 & 1, (i3 & 147) != 146)) {
            vl1 i4 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.e(7, l41.q(1.0f, z ? cw.m : cw.t, androidx.compose.foundation.a.b(yk3.u(sl1.a, zb2.a(999.0f)), z ? cw.n : cw.s, ap.e), zb2.a(999.0f)), null, function0, false), 14.0f, 7.0f);
            oj1 e2 = fp.e(qb2.p, false);
            int D = iv1.D(a00Var);
            v02 l2 = a00Var.l();
            vl1 E = bd3.E(a00Var, i4);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e2, oz.f);
            uj2.e(a00Var, l2, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            yv2.b(str, null, z ? ap.d(4281996880L) : cw.u, 0L, z ? jq0.t : jq0.r, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(n13.a)).n, a00Var, i3 & 14, 0, 65498);
            a00Var2 = a00Var;
            a00Var2.q(true);
        } else {
            a00Var2 = a00Var;
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new w4(str, z, function0, i2, 3);
        }
    }

    public static final void k(a61 a61Var, Function0 function0, a00 a00Var, int i2) {
        boolean z;
        a00 a00Var2 = a00Var;
        a00Var2.Z(-826360214);
        int i3 = i2 | (a00Var2.f(a61Var) ? 4 : 2) | (a00Var2.h(function0) ? 32 : 16);
        if (a00Var2.P(i3 & 1, (i3 & 19) != 18)) {
            yb2 a2 = zb2.a(16.0f);
            sl1 sl1Var = sl1.a;
            vl1 h2 = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.a.e(7, l41.q(1.5f, aw.b(cw.w, 0.55f), androidx.compose.foundation.a.b(yk3.u(sl1Var, a2), cw.s, ap.e), zb2.a(16.0f)), null, function0, false), 10.0f);
            qw a3 = ow.a(new yh(8.0f, true, sc.o), qb2.A, a00Var2, 6);
            int D = iv1.D(a00Var2);
            v02 l2 = a00Var2.l();
            vl1 E = bd3.E(a00Var2, h2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            sc scVar = oz.f;
            uj2.e(a00Var2, a3, scVar);
            sc scVar2 = oz.e;
            uj2.e(a00Var2, l2, scVar2);
            sc scVar3 = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar3);
            }
            sc scVar4 = oz.d;
            uj2.e(a00Var2, E, scVar4);
            vl1 a4 = androidx.compose.foundation.a.a(yk3.u(androidx.compose.foundation.layout.a.d(b.c(sl1Var, 1.0f)), zb2.a(12.0f)), new xd1(qv.g(new aw(cw.c), new aw(cw.n)), 0L, 9187343241974906880L));
            oj1 e2 = fp.e(qb2.t, false);
            int D2 = iv1.D(a00Var2);
            v02 l3 = a00Var2.l();
            vl1 E2 = bd3.E(a00Var2, a4);
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, e2, scVar);
            uj2.e(a00Var2, l3, scVar2);
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D2))) {
                q40.r(D2, a00Var2, D2, scVar3);
            }
            uj2.e(a00Var2, E2, scVar4);
            String str = a61Var.k;
            Double d2 = a61Var.i;
            if (str != null) {
                a00Var2.X(-1993515880);
                mh2.a(a61Var.k, yk3.u(b.b(sl1Var, 1.0f), zb2.a(12.0f)), a00Var2);
            } else {
                a00Var2.X(-2001375620);
            }
            a00Var2.q(false);
            a00Var2.q(true);
            String str2 = a61Var.b;
            if (up2.y(str2)) {
                str2 = "—";
            }
            long j2 = cw.u;
            jq0 jq0Var = jq0.t;
            bp2 bp2Var = n13.a;
            yv2.b(str2, null, j2, 0L, jq0Var, 0L, null, 0L, 2, false, 1, 0, ((l13) a00Var2.j(bp2Var)).i, a00Var, 196992, 3120, 55258);
            String c2 = c61.c(a61Var.c, a00Var);
            String b2 = c61.b(a61Var.d, a00Var);
            String str3 = a61Var.e;
            yv2.b(c2 + " · " + b2 + (str3 != null ? " ".concat(str3) : BuildConfig.FLAVOR), null, cw.v, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((l13) a00Var.j(bp2Var)).n, a00Var, 384, 3120, 55290);
            a00Var2 = a00Var;
            if (d2 == null || Intrinsics.a(d2)) {
                z = false;
                a00Var2.X(-1861642142);
            } else {
                a00Var2.X(-1852868181);
                yv2.b(c61.a(d2), null, cw.m, 0L, jq0Var, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(bp2Var)).m, a00Var, 196992, 0, 65498);
                a00Var2 = a00Var;
                z = false;
            }
            a00Var2.q(z);
            a00Var2.q(true);
        } else {
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new ss(i2, 5, a61Var, function0);
        }
    }

    public static final long l(int i2) {
        long j2 = i2 << 32;
        int i3 = w71.p;
        return j2;
    }

    public static sk2 m(int i2, hq hqVar) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        int i4 = (i2 & 2) == 0 ? 16 : 0;
        if (i3 <= 0 && i4 <= 0 && hqVar != hq.m) {
            ch2.g(hqVar, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i5 = i4 + i3;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new sk2(i3, i5, hqVar);
    }

    public static final void n(Function1 function1, Function0 function0, vl1 vl1Var, f61 f61Var, a00 a00Var, int i2) {
        vl1 vl1Var2;
        f61 f61Var2;
        int i3;
        f61 f61Var3;
        vl1 vl1Var3;
        yh yhVar;
        f61 f61Var4;
        sc scVar = sc.o;
        function1.getClass();
        function0.getClass();
        a00Var.Z(-614915463);
        int i4 = i2 | (a00Var.h(function1) ? 4 : 2) | (a00Var.h(function0) ? 32 : 16) | 1408;
        if (a00Var.P(i4 & 1, (i4 & 1171) != 1170)) {
            a00Var.U();
            int i5 = i2 & 1;
            sl1 sl1Var = sl1.a;
            if (i5 == 0 || a00Var.z()) {
                u53 a2 = qf1.a(a00Var);
                if (a2 == null) {
                    lh.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i3 = i4 & (-7169);
                    f61Var3 = (f61) ci2.l(d82.a(f61.class), a2, a2 instanceof jx0 ? ((jx0) a2).getDefaultViewModelCreationExtras() : h50.b, a00Var);
                    vl1Var3 = sl1Var;
                }
            } else {
                a00Var.S();
                i3 = i4 & (-7169);
                vl1Var3 = vl1Var;
                f61Var3 = f61Var;
            }
            a00Var.r();
            zn1 b2 = ij2.b(f61Var3.e, a00Var);
            f61 f61Var5 = f61Var3;
            vl1 b3 = androidx.compose.foundation.a.b(b.b(vl1Var3, 1.0f), cw.r, ap.e);
            oj1 e2 = fp.e(qb2.p, false);
            int D = iv1.D(a00Var);
            v02 l2 = a00Var.l();
            vl1 E = bd3.E(a00Var, b3);
            pz.b.getClass();
            Function0 function02 = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(function02);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e2, oz.f);
            uj2.e(a00Var, l2, oz.e);
            sc scVar2 = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar2);
            }
            uj2.e(a00Var, E, oz.d);
            lw0 lw0Var = new lw0(2);
            zx1 zx1Var = new zx1(16.0f, 16.0f, 16.0f, 16.0f);
            yh yhVar2 = new yh(12.0f, true, scVar);
            yh yhVar3 = new yh(12.0f, true, scVar);
            vl1 b4 = b.b(sl1Var, 1.0f);
            boolean f2 = ((i3 & 112) == 32) | a00Var.f(b2) | a00Var.h(f61Var5) | ((i3 & 14) == 4);
            Object M = a00Var.M();
            if (f2 || M == sz.a) {
                yhVar = yhVar3;
                M = new lk(function0, b2, f61Var5, function1, 1);
                f61Var4 = f61Var5;
                a00Var.i0(M);
            } else {
                yhVar = yhVar3;
                f61Var4 = f61Var5;
            }
            o70.e(lw0Var, b4, null, zx1Var, yhVar, yhVar2, null, false, (Function1) M, a00Var, 1772592);
            a00Var.q(true);
            vl1Var2 = vl1Var3;
            f61Var2 = f61Var4;
        } else {
            a00Var.S();
            vl1Var2 = vl1Var;
            f61Var2 = f61Var;
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new mu0(function1, function0, vl1Var2, f61Var2, i2);
        }
    }

    public static final void o(String str, boolean z, Function0 function0, a00 a00Var, int i2) {
        a00 a00Var2;
        xd1 q2;
        a00Var.Z(-1919075281);
        int i3 = i2 | (a00Var.f(str) ? 4 : 2) | (a00Var.g(z) ? 32 : 16) | (a00Var.h(function0) ? 256 : 128);
        if (a00Var.P(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                q2 = nj.q(qv.g(new aw(cw.p), new aw(cw.q)));
            } else {
                long j2 = cw.k;
                q2 = nj.q(qv.g(new aw(j2), new aw(j2)));
            }
            vl1 i4 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.e(7, l41.q(1.0f, z ? aw.f : cw.l, androidx.compose.foundation.a.a(yk3.u(sl1.a, zb2.a(999.0f)), q2), zb2.a(999.0f)), null, function0, false), 16.0f, 8.0f);
            oj1 e2 = fp.e(qb2.p, false);
            int D = iv1.D(a00Var);
            v02 l2 = a00Var.l();
            vl1 E = bd3.E(a00Var, i4);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e2, oz.f);
            uj2.e(a00Var, l2, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            yv2.b(str, null, cw.h, 0L, z ? jq0.t : jq0.r, 0L, null, 0L, 0, false, 0, 0, null, a00Var, (i3 & 14) | 384, 0, 131034);
            a00Var2 = a00Var;
            a00Var2.q(true);
        } else {
            a00Var2 = a00Var;
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new w4(str, z, function0, i2, 1);
        }
    }

    public static final void p(final int i2, final double d2, a00 a00Var, final int i3) {
        int i4;
        a00 a00Var2 = a00Var;
        a00Var2.Z(-2131972341);
        int i5 = i3 | (a00Var2.d(i2) ? 4 : 2);
        Object E = a00Var2.E();
        if ((E instanceof Double) && d2 == ((Number) E).doubleValue()) {
            i4 = 16;
        } else {
            a00Var2.j0(Double.valueOf(d2));
            i4 = 32;
        }
        int i6 = i5 | i4;
        if (a00Var2.P(i6 & 1, (i6 & 19) != 18)) {
            sl1 sl1Var = sl1.a;
            vl1 h2 = androidx.compose.foundation.layout.a.h(l41.q(1.0f, cw.t, androidx.compose.foundation.a.b(yk3.u(b.c(sl1Var, 1.0f), zb2.a(16.0f)), cw.s, ap.e), zb2.a(16.0f)), 16.0f);
            fc2 a2 = ec2.a(new yh(20.0f, true, sc.o), qb2.y, a00Var2, 6);
            int D = iv1.D(a00Var2);
            v02 l2 = a00Var2.l();
            vl1 E2 = bd3.E(a00Var2, h2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            sc scVar = oz.f;
            uj2.e(a00Var2, a2, scVar);
            sc scVar2 = oz.e;
            uj2.e(a00Var2, l2, scVar2);
            sc scVar3 = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar3);
            }
            sc scVar4 = oz.d;
            uj2.e(a00Var2, E2, scVar4);
            yn ynVar = qb2.A;
            wh whVar = c;
            qw a3 = ow.a(whVar, ynVar, a00Var2, 0);
            int D2 = iv1.D(a00Var2);
            v02 l3 = a00Var2.l();
            vl1 E3 = bd3.E(a00Var2, sl1Var);
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a3, scVar);
            uj2.e(a00Var2, l3, scVar2);
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D2))) {
                q40.r(D2, a00Var2, D2, scVar3);
            }
            uj2.e(a00Var2, E3, scVar4);
            String valueOf = String.valueOf(i2);
            bp2 bp2Var = n13.a;
            pw2 pw2Var = ((l13) a00Var2.j(bp2Var)).f;
            long j2 = cw.u;
            jq0 jq0Var = jq0.t;
            yv2.b(valueOf, null, j2, 0L, jq0Var, 0L, null, 0L, 0, false, 0, 0, pw2Var, a00Var, 196992, 0, 65498);
            String f2 = uj2.f(R.string.summary_items, a00Var);
            long j3 = cw.v;
            yv2.b(f2, null, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(bp2Var)).n, a00Var, 384, 0, 65530);
            a00Var.q(true);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            qw a4 = ow.a(whVar, ynVar, a00Var, 0);
            int D3 = iv1.D(a00Var);
            v02 l4 = a00Var.l();
            vl1 E4 = bd3.E(a00Var, layoutWeightElement);
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, a4, scVar);
            uj2.e(a00Var, l4, scVar2);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D3))) {
                q40.r(D3, a00Var, D3, scVar3);
            }
            uj2.e(a00Var, E4, scVar4);
            yv2.b(c61.a(Double.valueOf(d2)), null, cw.m, 0L, jq0Var, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(bp2Var)).f, a00Var, 196992, 0, 65498);
            yv2.b(uj2.f(R.string.summary_total, a00Var), null, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(bp2Var)).n, a00Var, 384, 0, 65530);
            yv2.b(uj2.f(R.string.summary_value_hint, a00Var), null, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(bp2Var)).o, a00Var, 384, 0, 65530);
            a00Var2 = a00Var;
            a00Var2.q(true);
            a00Var2.q(true);
        } else {
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new Function2(i2, d2, i3) { // from class: so1
                public final /* synthetic */ int m;
                public final /* synthetic */ double n;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = s03.R(1);
                    s93.p(this.m, this.n, (a00) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void q(Function0 function0, vl1 vl1Var, boolean z, fk2 fk2Var, tq tqVar, yx1 yx1Var, my myVar, a00 a00Var, int i2) {
        Function0 function02;
        int i3;
        tq tqVar2;
        int i4;
        vl1 vl1Var2;
        yx1 yx1Var2;
        fk2 fk2Var2;
        boolean z2;
        tq tqVar3;
        fk2 fk2Var3;
        yx1 yx1Var3;
        vl1 vl1Var3;
        tq tqVar4;
        boolean z3;
        a00Var.Z(-2106428362);
        if ((i2 & 6) == 0) {
            function02 = function0;
            i3 = i2 | (a00Var.h(function02) ? 4 : 2);
        } else {
            function02 = function0;
            i3 = i2;
        }
        int i5 = i3 | 115025328;
        if ((306783379 & i5) == 306783378 && a00Var.B()) {
            a00Var.S();
            vl1Var3 = vl1Var;
            z3 = z;
            fk2Var3 = fk2Var;
            tqVar4 = tqVar;
            yx1Var3 = yx1Var;
        } else {
            a00Var.U();
            if ((i2 & 1) == 0 || a00Var.z()) {
                zx1 zx1Var = uq.a;
                fk2 a2 = kk2.a(5, a00Var);
                gw gwVar = (gw) a00Var.j(hw.a);
                tq tqVar5 = gwVar.K;
                if (tqVar5 == null) {
                    long j2 = aw.f;
                    tqVar2 = new tq(j2, hw.c(gwVar, 26), j2, aw.b(hw.c(gwVar, 18), 0.38f));
                    gwVar.K = tqVar2;
                } else {
                    tqVar2 = tqVar5;
                }
                zx1 zx1Var2 = uq.a;
                i4 = i5 & (-64513);
                vl1Var2 = sl1.a;
                yx1Var2 = zx1Var2;
                fk2Var2 = a2;
                z2 = true;
                tqVar3 = tqVar2;
            } else {
                a00Var.S();
                z2 = z;
                fk2Var2 = fk2Var;
                tqVar3 = tqVar;
                yx1Var2 = yx1Var;
                i4 = i5 & (-64513);
                vl1Var2 = vl1Var;
            }
            a00Var.r();
            f(function02, vl1Var2, z2, fk2Var2, tqVar3, null, yx1Var2, myVar, a00Var, i4 & 2147483646);
            fk2Var3 = fk2Var2;
            yx1Var3 = yx1Var2;
            vl1Var3 = vl1Var2;
            tqVar4 = tqVar3;
            z3 = z2;
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new wq(function0, vl1Var3, z3, fk2Var3, tqVar4, yx1Var3, myVar, i2, 1);
        }
    }

    public static final void r(gv2 gv2Var, a00 a00Var, int i2) {
        vl1 k2;
        a00Var.Z(-1436003720);
        if ((((a00Var.h(gv2Var) ? 4 : 2) | i2) & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            sc1 sc1Var = gv2Var.d;
            int i3 = 0;
            if (sc1Var != null) {
                int i4 = 1;
                if (((Boolean) sc1Var.o.getValue()).booleanValue()) {
                    sc1 sc1Var2 = gv2Var.d;
                    o30 o30Var = null;
                    yd ydVar = sc1Var2 != null ? sc1Var2.a.a : null;
                    if (ydVar != null && ydVar.n.length() > 0) {
                        a00Var.X(-285446808);
                        boolean f2 = a00Var.f(gv2Var);
                        Object M = a00Var.M();
                        nj njVar = sz.a;
                        if (f2 || M == njVar) {
                            M = new ev2(gv2Var, i3);
                            a00Var.i0(M);
                        }
                        bu2 bu2Var = (bu2) M;
                        ca0 ca0Var = (ca0) a00Var.j(p00.h);
                        cu1 cu1Var = gv2Var.b;
                        long j2 = gv2Var.j().b;
                        int i5 = jw2.c;
                        int g2 = cu1Var.g((int) (j2 >> 32));
                        sc1 sc1Var3 = gv2Var.d;
                        cw2 d2 = sc1Var3 != null ? sc1Var3.d() : null;
                        d2.getClass();
                        bw2 bw2Var = d2.a;
                        w72 c2 = bw2Var.c(d.c(g2, 0, bw2Var.a.a.n.length()));
                        long i6 = ap.i((ca0Var.D(eu2.a) / 2.0f) + c2.a, c2.d);
                        boolean e2 = a00Var.e(i6);
                        Object M2 = a00Var.M();
                        if (e2 || M2 == njVar) {
                            M2 = new m40(i6);
                            a00Var.i0(M2);
                        }
                        du1 du1Var = (du1) M2;
                        boolean h2 = a00Var.h(bu2Var) | a00Var.h(gv2Var);
                        Object M3 = a00Var.M();
                        if (h2 || M3 == njVar) {
                            M3 = new ed(bu2Var, gv2Var, o30Var, 5);
                            a00Var.i0(M3);
                        }
                        k2 = sl1.a.k(new SuspendPointerInputElement(bu2Var, null, new qr2((Function2) M3), 6));
                        boolean e3 = a00Var.e(i6);
                        Object M4 = a00Var.M();
                        if (e3 || M4 == njVar) {
                            M4 = new c9(i6, i4);
                            a00Var.i0(M4);
                        }
                        e9.a(du1Var, wh2.a(k2, (Function1) M4), 0L, a00Var, 0);
                        a00Var.q(false);
                    }
                }
            }
            a00Var.X(-284257090);
            a00Var.q(false);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new c0(i2, 7, gv2Var);
        }
    }

    public static final void s(gv2 gv2Var, boolean z, a00 a00Var, int i2) {
        int i3;
        cw2 d2;
        a00Var.Z(626339208);
        if ((i2 & 6) == 0) {
            i3 = (a00Var.h(gv2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= a00Var.g(z) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && a00Var.B()) {
            a00Var.S();
        } else if (z) {
            a00Var.X(-1286242594);
            sc1 sc1Var = gv2Var.d;
            bw2 bw2Var = null;
            if (sc1Var != null && (d2 = sc1Var.d()) != null) {
                bw2 bw2Var2 = d2.a;
                sc1 sc1Var2 = gv2Var.d;
                if (!(sc1Var2 != null ? sc1Var2.p : true)) {
                    bw2Var = bw2Var2;
                }
            }
            if (bw2Var == null) {
                a00Var.X(-1285984396);
            } else {
                a00Var.X(-1285984395);
                if (jw2.b(gv2Var.j().b)) {
                    a00Var.X(-1679637798);
                    a00Var.q(false);
                } else {
                    a00Var.X(-1680616096);
                    int g2 = gv2Var.b.g((int) (gv2Var.j().b >> 32));
                    int g3 = gv2Var.b.g((int) (gv2Var.j().b & 4294967295L));
                    k92 a2 = bw2Var.a(g2);
                    k92 a3 = bw2Var.a(Math.max(g3 - 1, 0));
                    sc1 sc1Var3 = gv2Var.d;
                    if (sc1Var3 == null || !((Boolean) sc1Var3.m.getValue()).booleanValue()) {
                        a00Var.X(-1679975078);
                        a00Var.q(false);
                    } else {
                        a00Var.X(-1680216289);
                        nk2.b(true, a2, gv2Var, a00Var, ((i3 << 6) & 896) | 6);
                        a00Var.q(false);
                    }
                    sc1 sc1Var4 = gv2Var.d;
                    if (sc1Var4 == null || !((Boolean) sc1Var4.n.getValue()).booleanValue()) {
                        a00Var.X(-1679655654);
                        a00Var.q(false);
                    } else {
                        a00Var.X(-1679895904);
                        nk2.b(false, a3, gv2Var, a00Var, ((i3 << 6) & 896) | 6);
                        a00Var.q(false);
                    }
                    a00Var.q(false);
                }
                sc1 sc1Var5 = gv2Var.d;
                if (sc1Var5 != null) {
                    lz1 lz1Var = sc1Var5.l;
                    if (!Intrinsics.b(gv2Var.r.a.n, gv2Var.j().a.n)) {
                        lz1Var.setValue(Boolean.FALSE);
                    }
                    if (sc1Var5.b()) {
                        if (((Boolean) lz1Var.getValue()).booleanValue()) {
                            gv2Var.o();
                        } else {
                            gv2Var.k();
                        }
                    }
                    Unit unit = Unit.a;
                }
            }
            a00Var.q(false);
            a00Var.q(false);
        } else {
            a00Var.X(651305535);
            a00Var.q(false);
            gv2Var.k();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new l40(gv2Var, z, i2);
        }
    }

    public static final void t(mb1 mb1Var, Object obj, int i2, Object obj2, a00 a00Var, int i3) {
        int i4;
        a00Var.Z(1439843069);
        if ((i3 & 6) == 0) {
            i4 = (a00Var.f(mb1Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= a00Var.f(obj) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= a00Var.d(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= a00Var.f(obj2) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && a00Var.B()) {
            a00Var.S();
        } else {
            ((jd2) obj).e(obj2, yj1.H(980966366, new l9(i2, mb1Var, obj2), a00Var), a00Var, 48);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new lb1(mb1Var, obj, i2, obj2, i3);
        }
    }

    public static final void u(sc1 sc1Var) {
        wv2 wv2Var = sc1Var.e;
        if (wv2Var != null) {
            sc1Var.t.invoke(nv2.a((nv2) sc1Var.d.n, null, 0L, 3));
            sv2 sv2Var = wv2Var.a;
            AtomicReference atomicReference = sv2Var.b;
            while (true) {
                if (atomicReference.compareAndSet(wv2Var, null)) {
                    sv2Var.a.g();
                    break;
                } else if (atomicReference.get() != wv2Var) {
                    break;
                }
            }
        }
        sc1Var.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v(kx2 kx2Var, xt0 xt0Var, Throwable th, r30 r30Var) {
        bn0 bn0Var;
        int i2;
        try {
            if (r30Var instanceof bn0) {
                bn0Var = (bn0) r30Var;
                int i3 = bn0Var.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    bn0Var.o = i3 - Integer.MIN_VALUE;
                    Object obj = bn0Var.n;
                    Object obj2 = b50.m;
                    i2 = bn0Var.o;
                    if (i2 != 0) {
                        ca2.b(obj);
                        bn0Var.m = th;
                        bn0Var.o = 1;
                        if (xt0Var.a(kx2Var, th, bn0Var) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = bn0Var.m;
                        ca2.b(obj);
                    }
                    return Unit.a;
                }
            }
            if (i2 != 0) {
            }
            return Unit.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                wi0.a(th2, th);
            }
            throw th2;
        }
        bn0Var = new bn0(r30Var);
        Object obj3 = bn0Var.n;
        Object obj22 = b50.m;
        i2 = bn0Var.o;
    }

    public static final void w(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static final void x(sv2 sv2Var, sc1 sc1Var, nv2 nv2Var, c11 c11Var, cu1 cu1Var) {
        t21 t21Var = sc1Var.d;
        d40 d40Var = sc1Var.t;
        d40 d40Var2 = sc1Var.u;
        c82 c82Var = new c82();
        oc ocVar = new oc(t21Var, d40Var, c82Var, 12);
        i22 i22Var = sv2Var.a;
        i22Var.b(nv2Var, c11Var, ocVar, d40Var2);
        wv2 wv2Var = new wv2(sv2Var, i22Var);
        sv2Var.b.set(wv2Var);
        c82Var.m = wv2Var;
        sc1Var.e = wv2Var;
        J(sc1Var, nv2Var, cu1Var);
    }

    public static final ExtractedText y(nv2 nv2Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = nv2Var.a.n;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = nv2Var.b;
        extractedText.selectionStart = jw2.e(j2);
        extractedText.selectionEnd = jw2.d(j2);
        extractedText.flags = !up2.p(nv2Var.a.n, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final boolean z(t22 t22Var) {
        return !t22Var.h && t22Var.d;
    }

    public abstract void K(Throwable th);

    public abstract void L(js0 js0Var);
}
