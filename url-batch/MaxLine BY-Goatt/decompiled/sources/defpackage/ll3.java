package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.graphics.a;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.majelw.libystne.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ll3 {
    public static volatile sw1 a;
    public static final Object[] b = new Object[0];
    public static final j22 c = new j22(null, new a22());
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final nm1 f = new nm1(13);
    public static final Object g = new Object();
    public static x01 h;

    public static final void A(yd0 yd0Var, dw0 dw0Var) {
        boolean z;
        boolean z2;
        Canvas canvas;
        boolean z3;
        float f2;
        ls o = yd0Var.F().o();
        dw0 dw0Var2 = (dw0) yd0Var.F().o;
        ew0 ew0Var = dw0Var.a;
        if (dw0Var.s) {
            return;
        }
        dw0Var.a();
        if (!ew0Var.H()) {
            try {
                dw0Var.a.w(dw0Var.b, dw0Var.c, dw0Var, dw0Var.e);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = ew0Var.G() > 0.0f;
        if (z4) {
            o.r();
        }
        Canvas a2 = z6.a(o);
        boolean isHardwareAccelerated = a2.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            long j = dw0Var.t;
            float f3 = (int) (j >> 32);
            float f4 = (int) (j & 4294967295L);
            long j2 = dw0Var.u;
            float f5 = ((int) (j2 >> 32)) + f3;
            float f6 = ((int) (j2 & 4294967295L)) + f4;
            float a3 = ew0Var.a();
            mo x = ew0Var.x();
            int K = ew0Var.K();
            if (a3 < 1.0f || K != 3 || x != null || ew0Var.u() == 1) {
                vs3 vs3Var = dw0Var.p;
                if (vs3Var == null) {
                    vs3Var = yj1.e();
                    dw0Var.p = vs3Var;
                }
                vs3Var.c(a3);
                vs3Var.d(K);
                vs3Var.f(x);
                a2 = a2;
                f2 = f3;
                a2.saveLayer(f2, f4, f5, f6, (Paint) vs3Var.b);
            } else {
                a2.save();
                a2 = a2;
                f2 = f3;
            }
            a2.translate(f2, f4);
            a2.concat(ew0Var.C());
        }
        boolean z5 = !isHardwareAccelerated && dw0Var.w;
        if (z5) {
            o.m();
            bx1 d2 = dw0Var.d();
            if (d2 instanceof zw1) {
                ls.l(o, ((zw1) d2).a);
            } else if (d2 instanceof ax1) {
                oa oaVar = dw0Var.m;
                if (oaVar != null) {
                    oaVar.a.rewind();
                } else {
                    oaVar = qa.a();
                    dw0Var.m = oaVar;
                }
                oa.a(oaVar, ((ax1) d2).a);
                o.s(oaVar);
            } else {
                if (!(d2 instanceof yw1)) {
                    a.b();
                    return;
                }
                o.s(((yw1) d2).a);
            }
        }
        if (dw0Var2 != null) {
            du duVar = dw0Var2.r;
            if (!duVar.a) {
                k21.a("Only add dependencies during a tracking");
            }
            un1 un1Var = (un1) duVar.d;
            if (un1Var != null) {
                un1Var.a(dw0Var);
            } else if (((dw0) duVar.b) != null) {
                int i = pe2.a;
                un1 un1Var2 = new un1();
                dw0 dw0Var3 = (dw0) duVar.b;
                dw0Var3.getClass();
                un1Var2.a(dw0Var3);
                un1Var2.a(dw0Var);
                duVar.d = un1Var2;
                duVar.b = null;
            } else {
                duVar.b = dw0Var;
            }
            un1 un1Var3 = (un1) duVar.e;
            if (un1Var3 != null) {
                z3 = !un1Var3.k(dw0Var);
            } else if (((dw0) duVar.c) != dw0Var) {
                z3 = true;
            } else {
                duVar.c = null;
                z3 = false;
            }
            if (z3) {
                dw0Var.q++;
            }
        }
        if (((y6) o).a.isHardwareAccelerated()) {
            z = z4;
            z2 = z5;
            canvas = a2;
            ew0Var.s(o);
        } else {
            ns nsVar = dw0Var.o;
            if (nsVar == null) {
                nsVar = new ns();
                dw0Var.o = nsVar;
            }
            mh mhVar = nsVar.n;
            ca0 ca0Var = dw0Var.b;
            u81 u81Var = dw0Var.c;
            long Q = zm3.Q(dw0Var.u);
            ms msVar = ((ns) mhVar.p).m;
            ca0 ca0Var2 = msVar.a;
            u81 u81Var2 = msVar.b;
            ls o2 = mhVar.o();
            z2 = z5;
            canvas = a2;
            long v = mhVar.v();
            z = z4;
            dw0 dw0Var4 = (dw0) mhVar.o;
            mhVar.H(ca0Var);
            mhVar.I(u81Var);
            mhVar.G(o);
            mhVar.J(Q);
            mhVar.o = dw0Var;
            o.m();
            try {
                dw0Var.c(nsVar);
            } finally {
                o.j();
                mhVar.H(ca0Var2);
                mhVar.I(u81Var2);
                mhVar.G(o2);
                mhVar.J(v);
                mhVar.o = dw0Var4;
            }
        }
        if (z2) {
            o.j();
        }
        if (z) {
            o.n();
        }
        if (isHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    public static final bh2 B(bh2 bh2Var, kl3 kl3Var) {
        gn gnVar = (gn) kl3Var.d;
        if (bh2Var != null) {
            ah2 ah2Var = bh2Var.a;
            long j = ah2Var.c;
            ah2 ah2Var2 = bh2Var.b;
            if (j != ah2Var2.c) {
                boolean z = bh2Var.c;
                if ((z ? ah2Var : ah2Var2).b != 0) {
                    return bh2Var;
                }
                if (z) {
                    ah2Var = ah2Var2;
                }
                if (((bw2) gnVar.e).a.a.n.length() != ah2Var.b) {
                    return bh2Var;
                }
            } else if (ah2Var.b != ah2Var2.b) {
                return bh2Var;
            }
        }
        bh2 bh2Var2 = (bh2) kl3Var.c;
        String str = ((bw2) gnVar.e).a.a.n;
        if (bh2Var2 == null || str.length() == 0) {
            return bh2Var;
        }
        boolean z2 = kl3Var.b;
        String str2 = ((bw2) gnVar.e).a.a.n;
        int i = gnVar.b;
        int length = str2.length();
        if (i == 0) {
            int e2 = ti2.e(0, str2);
            return z2 ? bh2.a(bh2Var, o(bh2Var.a, gnVar, e2), null, true, 2) : bh2.a(bh2Var, null, o(bh2Var.b, gnVar, e2), false, 1);
        }
        if (i == length) {
            int f2 = ti2.f(length, str2);
            return z2 ? bh2.a(bh2Var, o(bh2Var.a, gnVar, f2), null, false, 2) : bh2.a(bh2Var, null, o(bh2Var.b, gnVar, f2), true, 1);
        }
        boolean z3 = bh2Var2.c;
        int f3 = z2 ^ z3 ? ti2.f(i, str2) : ti2.e(i, str2);
        return z2 ? bh2.a(bh2Var, o(bh2Var.a, gnVar, f3), null, z3, 2) : bh2.a(bh2Var, null, o(bh2Var.b, gnVar, f3), z3, 1);
    }

    public static boolean C(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final String D(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static String E(Context context, int i) {
        String valueOf;
        context.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            valueOf = context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i);
        }
        valueOf.getClass();
        return valueOf;
    }

    public static final boolean F(ai2 ai2Var) {
        Object g2 = ai2Var.d.m.g(gi2.I);
        if (g2 == null) {
            g2 = null;
        }
        zx2 zx2Var = (zx2) g2;
        tn1 tn1Var = ai2Var.d.m;
        Object g3 = tn1Var.g(gi2.x);
        if (g3 == null) {
            g3 = null;
        }
        fb2 fb2Var = (fb2) g3;
        boolean z = zx2Var != null;
        Object g4 = tn1Var.g(gi2.H);
        if (((Boolean) (g4 != null ? g4 : null)) == null || (fb2Var != null && fb2Var.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String G(ai2 ai2Var, Resources resources) {
        sh2 sh2Var = ai2Var.d;
        sh2 sh2Var2 = ai2Var.d;
        Object g2 = sh2Var.m.g(gi2.b);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        tn1 tn1Var = sh2Var2.m;
        Object g3 = tn1Var.g(gi2.I);
        if (g3 == null) {
            g3 = null;
        }
        zx2 zx2Var = (zx2) g3;
        Object g4 = tn1Var.g(gi2.x);
        if (g4 == null) {
            g4 = null;
        }
        fb2 fb2Var = (fb2) g4;
        if (zx2Var != null) {
            int ordinal = zx2Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        a.b();
                        return null;
                    }
                    if (g2 == null) {
                        g2 = resources.getString(R.string.indeterminate);
                    }
                } else if (fb2Var != null && fb2Var.a == 2 && g2 == null) {
                    g2 = resources.getString(R.string.state_off);
                }
            } else if (fb2Var != null && fb2Var.a == 2 && g2 == null) {
                g2 = resources.getString(R.string.state_on);
            }
        }
        Object g5 = tn1Var.g(gi2.H);
        if (g5 == null) {
            g5 = null;
        }
        Boolean bool = (Boolean) g5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((fb2Var == null || fb2Var.a != 4) && g2 == null) {
                g2 = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object g6 = tn1Var.g(gi2.c);
        if (g6 == null) {
            g6 = null;
        }
        j52 j52Var = (j52) g6;
        if (j52Var != null) {
            if (j52Var != j52.b) {
                if (g2 == null) {
                    g2 = resources.getString(R.string.template_percent, 0);
                }
            } else if (g2 == null) {
                g2 = resources.getString(R.string.in_progress);
            }
        }
        ji2 ji2Var = gi2.E;
        if (tn1Var.c(ji2Var)) {
            tn1 tn1Var2 = new ai2(ai2Var.a, true, ai2Var.c, sh2Var2).k().m;
            Object g7 = tn1Var2.g(gi2.a);
            if (g7 == null) {
                g7 = null;
            }
            Collection collection = (Collection) g7;
            if (collection == null || collection.isEmpty()) {
                Object g8 = tn1Var2.g(gi2.A);
                if (g8 == null) {
                    g8 = null;
                }
                Collection collection2 = (Collection) g8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g9 = tn1Var2.g(ji2Var);
                    if (g9 == null) {
                        g9 = null;
                    }
                    CharSequence charSequence = (CharSequence) g9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            g2 = str;
        }
        return (String) g2;
    }

    public static final yd H(ai2 ai2Var) {
        Object g2 = ai2Var.d.m.g(gi2.E);
        if (g2 == null) {
            g2 = null;
        }
        yd ydVar = (yd) g2;
        Object g3 = ai2Var.d.m.g(gi2.A);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        return ydVar == null ? list != null ? (yd) zv.v(list) : null : ydVar;
    }

    public static final fs I(o30 o30Var) {
        if (!(o30Var instanceof pb0)) {
            return new fs(1, o30Var);
        }
        fs m = ((pb0) o30Var).m();
        if (m != null) {
            if (!m.C()) {
                m = null;
            }
            if (m != null) {
                return m;
            }
        }
        return new fs(2, o30Var);
    }

    public static final void J(Throwable th, CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = v40.a.iterator();
        while (it.hasNext()) {
            try {
                ((u40) it.next()).L(th, coroutineContext);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    wi0.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            wi0.a(th, new pa0(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean M(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static void N(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final boolean O(String str) {
        str.getClass();
        return (Intrinsics.b(str, "GET") || Intrinsics.b(str, "HEAD")) ? false : true;
    }

    public static final Object P(v02 v02Var, t52 t52Var) {
        t52Var.getClass();
        Object obj = v02Var.get(t52Var);
        if (obj == null) {
            obj = t52Var.b();
        }
        return ((r33) obj).a(v02Var);
    }

    public static final Object Q(Object[] objArr, ce2 ce2Var, Function0 function0, a00 a00Var, int i, int i2) {
        Object[] objArr2;
        ce2 ce2Var2;
        final Object obj;
        Object c2;
        final String l = Long.toString(a00Var.T, CharsKt.checkRadix(36));
        l.getClass();
        ce2Var.getClass();
        final ld2 ld2Var = (ld2) a00Var.j(nd2.a);
        Object M = a00Var.M();
        Object obj2 = sz.a;
        if (M == obj2) {
            Object e2 = (ld2Var == null || (c2 = ld2Var.c(l)) == null) ? null : ce2Var.e(c2);
            if (e2 == null) {
                e2 = function0.invoke();
            }
            objArr2 = objArr;
            ce2Var2 = ce2Var;
            Object id2Var = new id2(ce2Var2, ld2Var, l, e2, objArr2);
            a00Var.i0(id2Var);
            M = id2Var;
        } else {
            objArr2 = objArr;
            ce2Var2 = ce2Var;
        }
        final id2 id2Var2 = (id2) M;
        Object obj3 = Arrays.equals(objArr2, id2Var2.q) ? id2Var2.p : null;
        if (obj3 == null) {
            obj3 = function0.invoke();
        }
        boolean h2 = a00Var.h(id2Var2) | ((((i & 112) ^ 48) > 32 && a00Var.h(ce2Var2)) || (i & 48) == 32) | a00Var.h(ld2Var) | a00Var.f(l) | a00Var.h(obj3) | a00Var.h(objArr2);
        Object M2 = a00Var.M();
        if (h2 || M2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = obj3;
            final ce2 ce2Var3 = ce2Var2;
            Object obj4 = new Function0() { // from class: t82
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z;
                    id2 id2Var3 = id2.this;
                    ld2 ld2Var2 = id2Var3.n;
                    ld2 ld2Var3 = ld2Var;
                    boolean z2 = true;
                    if (ld2Var2 != ld2Var3) {
                        id2Var3.n = ld2Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = id2Var3.o;
                    String str2 = l;
                    if (Intrinsics.b(str, str2)) {
                        z2 = z;
                    } else {
                        id2Var3.o = str2;
                    }
                    id2Var3.m = ce2Var3;
                    id2Var3.p = obj;
                    id2Var3.q = objArr3;
                    mh mhVar = id2Var3.r;
                    if (mhVar != null && z2) {
                        mhVar.K();
                        id2Var3.r = null;
                        id2Var3.b();
                    }
                    return Unit.a;
                }
            };
            a00Var.i0(obj4);
            M2 = obj4;
        } else {
            obj = obj3;
        }
        l41.m((Function0) M2, a00Var);
        return obj;
    }

    public static final Object R(Object[] objArr, Function0 function0, a00 a00Var, int i) {
        return Q(Arrays.copyOf(objArr, objArr.length), yj1.m, function0, a00Var, ((i << 6) & 7168) | 384, 0);
    }

    public static final kd2 S(a00 a00Var) {
        a00Var.X(1967008021);
        Object[] objArr = new Object[0];
        Object M = a00Var.M();
        if (M == sz.a) {
            M = new e4(17);
            a00Var.i0(M);
        }
        kd2 kd2Var = (kd2) Q(Arrays.copyOf(objArr, 0), kd2.q, (Function0) M, a00Var, 3456, 0);
        kd2Var.o = (ld2) a00Var.j(nd2.a);
        a00Var.q(false);
        return kd2Var;
    }

    public static final boolean T(View view, Integer num, Rect rect) {
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof t7) {
            return ((t7) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final u31 U(w72 w72Var) {
        return new u31(Math.round(w72Var.a), Math.round(w72Var.b), Math.round(w72Var.c), Math.round(w72Var.d));
    }

    public static final Integer V(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final Object[] W(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = b;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i2);
            }
            i = i2;
        }
    }

    public static final Object[] X(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final fo0 Y(int i) {
        if (i == 1) {
            return new fo0(2);
        }
        if (i == 2) {
            return new fo0(1);
        }
        if (i == 17) {
            return new fo0(3);
        }
        if (i == 33) {
            return new fo0(5);
        }
        if (i == 66) {
            return new fo0(4);
        }
        if (i != 130) {
            return null;
        }
        return new fo0(6);
    }

    public static final List Z(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(zv.u(arrayList)) : ah0.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, vl1 vl1Var, pw2 pw2Var, int i, boolean z, int i2, int i3, a00 a00Var, int i4, int i5) {
        int i6;
        pw2 pw2Var2;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        a00Var.Z(-1186827822);
        if ((i4 & 6) == 0) {
            i6 = (a00Var.f(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= a00Var.f(vl1Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            pw2Var2 = pw2Var;
            i6 |= a00Var.f(pw2Var2) ? 256 : 128;
        } else {
            pw2Var2 = pw2Var;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i6 |= a00Var.h(null) ? 2048 : 1024;
        }
        int i13 = i5 & 16;
        if (i13 != 0) {
            i6 |= 24576;
        } else if ((i4 & 24576) == 0) {
            i7 = i;
            i6 |= a00Var.d(i7) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
            i8 = i5 & 32;
            if (i8 == 0) {
                i6 |= 196608;
            } else if ((196608 & i4) == 0) {
                z2 = z;
                i6 |= a00Var.g(z2) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
                if ((1572864 & i4) == 0) {
                    i6 |= a00Var.d(i2) ? 1048576 : 524288;
                }
                i9 = i5 & 128;
                if (i9 != 0) {
                    i6 |= 12582912;
                } else if ((12582912 & i4) == 0) {
                    i10 = i3;
                    i6 |= a00Var.d(i10) ? 8388608 : 4194304;
                    if (((i6 | 100663296) & 38347923) == 38347922 || !a00Var.B()) {
                        int i14 = i13 == 0 ? 1 : i7;
                        if (i8 != 0) {
                            z2 = true;
                        }
                        int i15 = i9 == 0 ? 1 : i10;
                        yj1.K(i15, i2);
                        if (a00Var.j(qh2.a) == null) {
                            b71.o();
                            return;
                        }
                        a00Var.X(-1588686502);
                        a00Var.q(false);
                        a00Var.X(-1587866335);
                        boolean z4 = z2;
                        vl1 k = a.b(vl1Var, 0.0f, null, 131071).k(new TextStringSimpleElement(str, pw2Var2, (hp0) a00Var.j(p00.k), i14, z4, i2, i15));
                        a00Var.q(false);
                        k9 k9Var = k9.f;
                        int D = iv1.D(a00Var);
                        vl1 E = bd3.E(a00Var, k);
                        v02 l = a00Var.l();
                        pz.b.getClass();
                        o00 o00Var = oz.b;
                        a00Var.b0();
                        if (a00Var.S) {
                            a00Var.k(o00Var);
                        } else {
                            a00Var.l0();
                        }
                        uj2.e(a00Var, k9Var, oz.f);
                        uj2.e(a00Var, l, oz.e);
                        uj2.e(a00Var, E, oz.d);
                        sc scVar = oz.g;
                        if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                            q40.r(D, a00Var, D, scVar);
                        }
                        a00Var.q(true);
                        i11 = i14;
                        z3 = z4;
                        i12 = i15;
                    } else {
                        a00Var.S();
                        i11 = i7;
                        z3 = z2;
                        i12 = i10;
                    }
                    n72 s = a00Var.s();
                    if (s != null) {
                        s.d = new sn(str, vl1Var, pw2Var, i11, z3, i2, i12, i4, i5);
                        return;
                    }
                    return;
                }
                i10 = i3;
                if (((i6 | 100663296) & 38347923) == 38347922) {
                }
                if (i13 == 0) {
                }
                if (i8 != 0) {
                }
                if (i9 == 0) {
                }
                yj1.K(i15, i2);
                if (a00Var.j(qh2.a) == null) {
                }
            }
            z2 = z;
            if ((1572864 & i4) == 0) {
            }
            i9 = i5 & 128;
            if (i9 != 0) {
            }
            i10 = i3;
            if (((i6 | 100663296) & 38347923) == 38347922) {
            }
            if (i13 == 0) {
            }
            if (i8 != 0) {
            }
            if (i9 == 0) {
            }
            yj1.K(i15, i2);
            if (a00Var.j(qh2.a) == null) {
            }
        }
        i7 = i;
        i8 = i5 & 32;
        if (i8 == 0) {
        }
        z2 = z;
        if ((1572864 & i4) == 0) {
        }
        i9 = i5 & 128;
        if (i9 != 0) {
        }
        i10 = i3;
        if (((i6 | 100663296) & 38347923) == 38347922) {
        }
        if (i13 == 0) {
        }
        if (i8 != 0) {
        }
        if (i9 == 0) {
        }
        yj1.K(i15, i2);
        if (a00Var.j(qh2.a) == null) {
        }
    }

    public static final Map a0(Map map) {
        int size = map.size();
        if (size == 0) {
            return mi1.c();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) zv.t(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final void b(q80 q80Var, vl1 vl1Var, yx1 yx1Var, by1 by1Var, zn znVar, im2 im2Var, boolean z, hr1 hr1Var, by1 by1Var2, my myVar, a00 a00Var, int i) {
        hr1 hr1Var2;
        int i2;
        int i3;
        im2 im2Var2;
        by1 by1Var3;
        zn znVar2;
        by1 by1Var4;
        yx1 yx1Var2;
        boolean z2;
        boolean z3;
        by1 by1Var5;
        zn znVar3;
        by1 by1Var6;
        hr1 hr1Var3;
        im2 im2Var3;
        yx1 yx1Var3;
        a00Var.Z(1870896258);
        int i4 = i | (a00Var.f(q80Var) ? 4 : 2) | (a00Var.f(vl1Var) ? 32 : 16) | 911961472;
        if ((306783379 & i4) == 306783378 && a00Var.B()) {
            a00Var.S();
            yx1Var3 = yx1Var;
            by1Var5 = by1Var;
            znVar3 = znVar;
            im2Var3 = im2Var;
            z3 = z;
            hr1Var3 = hr1Var;
            by1Var6 = by1Var2;
        } else {
            a00Var.U();
            int i5 = 3;
            if ((i & 1) == 0 || a00Var.z()) {
                zx1 zx1Var = new zx1(0.0f, 0.0f, 0.0f, 0.0f);
                by1 by1Var7 = by1.n;
                zn znVar4 = qb2.z;
                int i6 = (i4 & 14) | 196608;
                ny1 ny1Var = new ny1();
                q70 a2 = co2.a(a00Var);
                Map map = f63.a;
                eo2 G = bd3.G(1, Float.valueOf(1.0f));
                Object obj = (ca0) a00Var.j(p00.h);
                Object obj2 = (u81) a00Var.j(p00.n);
                boolean f2 = ((((i6 & 14) ^ 6) > 4 && a00Var.f(q80Var)) || (i6 & 6) == 4) | a00Var.f(a2) | a00Var.f(G) | a00Var.f(ny1Var) | a00Var.f(obj) | a00Var.f(obj2);
                Object M = a00Var.M();
                Object obj3 = sz.a;
                if (f2 || M == obj3) {
                    M = new im2(new tt1(q80Var, new j30(i5, q80Var, obj2), ny1Var), a2, G);
                    a00Var.i0(M);
                }
                im2 im2Var4 = (im2) M;
                int i7 = i4 & (-29360129);
                int i8 = (i4 & 14) | 432;
                boolean z4 = (((i8 & 14) ^ 6) > 4 && a00Var.f(q80Var)) || (i8 & 6) == 4;
                Object M2 = a00Var.M();
                if (z4 || M2 == obj3) {
                    M2 = new o80(q80Var);
                    a00Var.i0(M2);
                }
                hr1Var2 = (o80) M2;
                i2 = i7;
                i3 = 3;
                im2Var2 = im2Var4;
                by1Var3 = by1Var7;
                znVar2 = znVar4;
                by1Var4 = by1.A;
                yx1Var2 = zx1Var;
                z2 = true;
            } else {
                a00Var.S();
                i2 = i4 & (-29360129);
                yx1Var2 = yx1Var;
                by1Var3 = by1Var;
                znVar2 = znVar;
                im2Var2 = im2Var;
                z2 = z;
                by1Var4 = by1Var2;
                i3 = 3;
                hr1Var2 = hr1Var;
            }
            a00Var.r();
            yk3.i(vl1Var, q80Var, yx1Var2, im2Var2, z2, by1Var3, hr1Var2, znVar2, by1Var4, myVar, a00Var, ((i2 << i3) & 112) | ((i2 >> 3) & 14) | 24576 | 920128896, 224688);
            zn znVar5 = znVar2;
            z3 = z2;
            by1Var5 = by1Var3;
            znVar3 = znVar5;
            by1Var6 = by1Var4;
            hr1Var3 = hr1Var2;
            im2Var3 = im2Var2;
            yx1Var3 = yx1Var2;
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new fy1(q80Var, vl1Var, yx1Var3, by1Var5, znVar3, im2Var3, z3, hr1Var3, by1Var6, myVar, i);
        }
    }

    public static final v02 b0(ye[] yeVarArr, v02 v02Var, v02 v02Var2) {
        u02 u02Var = new u02(v02.s);
        for (ye yeVar : yeVarArr) {
            t52 t52Var = (t52) yeVar.f;
            if (yeVar.e || !v02Var.containsKey(t52Var)) {
                u02Var.put(t52Var, t52Var.c(yeVar, (r33) v02Var2.get(t52Var)));
            }
        }
        return u02Var.e();
    }

    public static final void c(Object obj, int i, ub1 ub1Var, my myVar, a00 a00Var, int i2) {
        int i3;
        a00Var.Z(-2079116560);
        if ((i2 & 6) == 0) {
            i3 = (a00Var.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= a00Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= a00Var.h(ub1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= a00Var.h(myVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && a00Var.B()) {
            a00Var.S();
        } else {
            boolean f2 = a00Var.f(obj) | a00Var.f(ub1Var);
            Object M = a00Var.M();
            Object obj2 = sz.a;
            if (f2 || M == obj2) {
                M = new tb1(obj, ub1Var);
                a00Var.i0(M);
            }
            tb1 tb1Var = (tb1) M;
            iz1 iz1Var = tb1Var.c;
            lz1 lz1Var = tb1Var.e;
            lz1 lz1Var2 = tb1Var.f;
            iz1Var.i(i);
            t52 t52Var = l12.a;
            tb1 tb1Var2 = (tb1) a00Var.j(t52Var);
            nm2 d2 = ci2.d();
            Function1 e2 = d2 != null ? d2.e() : null;
            nm2 f3 = ci2.f(d2);
            try {
                if (tb1Var2 != ((tb1) lz1Var2.getValue())) {
                    lz1Var2.setValue(tb1Var2);
                    if (tb1Var.d.h() > 0) {
                        tb1 tb1Var3 = (tb1) lz1Var.getValue();
                        if (tb1Var3 != null) {
                            tb1Var3.b();
                        }
                        if (tb1Var2 != null) {
                            tb1Var2.a();
                        } else {
                            tb1Var2 = null;
                        }
                        lz1Var.setValue(tb1Var2);
                    }
                }
                Unit unit = Unit.a;
                ci2.j(d2, f3, e2);
                boolean f4 = a00Var.f(tb1Var);
                Object M2 = a00Var.M();
                if (f4 || M2 == obj2) {
                    M2 = new j6(23, tb1Var);
                    a00Var.i0(M2);
                }
                l41.f(tb1Var, (Function1) M2, a00Var);
                yk3.a(t52Var.a(tb1Var), myVar, a00Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                ci2.j(d2, f3, e2);
                throw th;
            }
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new lb1(obj, i, ub1Var, myVar, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c0(Context context, Executor executor, f52 f52Var, boolean z) {
        boolean z2;
        ?? r7;
        na0[] na0VarArr;
        na0[] na0VarArr2;
        na0[] na0VarArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        ?? r72;
        boolean z7;
        ma0 ma0Var;
        boolean z8;
        FileInputStream a2;
        boolean z9;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                f52Var.e(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        i52.c(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = zm3.h;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            ma0 ma0Var2 = new ma0(assets, executor, f52Var, name, file2);
            byte[] bArr3 = ma0Var2.c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        ma0Var2.b(4, null);
                    }
                    ma0Var2.f = true;
                    try {
                        try {
                            r7 = ma0Var2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e2) {
                            f52Var.e(6, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            na0VarArr2 = ma0Var2.g;
                            if (na0VarArr2 != null) {
                            }
                            f52 f52Var2 = ma0Var2.b;
                            na0VarArr3 = ma0Var2.g;
                            byte[] bArr4 = ma0Var2.c;
                            boolean z11 = r7;
                            z11 = r7;
                            if (na0VarArr3 != null) {
                            }
                            bArr = ma0Var2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            i52.c(context, (z6 || !z) ? false : z9);
                        } catch (IOException e3) {
                            f52Var.e(7, e3);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            na0VarArr2 = ma0Var2.g;
                            if (na0VarArr2 != null) {
                            }
                            f52 f52Var22 = ma0Var2.b;
                            na0VarArr3 = ma0Var2.g;
                            byte[] bArr42 = ma0Var2.c;
                            boolean z112 = r7;
                            z112 = r7;
                            if (na0VarArr3 != null) {
                            }
                            bArr = ma0Var2.h;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            i52.c(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e4) {
                                    f52Var.e(8, e4);
                                    try {
                                        r7.close();
                                    } catch (IOException e5) {
                                        f52Var.e(7, e5);
                                    }
                                    na0VarArr = null;
                                    ma0Var2.g = na0VarArr;
                                    na0VarArr2 = ma0Var2.g;
                                    if (na0VarArr2 != null) {
                                    }
                                    f52 f52Var222 = ma0Var2.b;
                                    na0VarArr3 = ma0Var2.g;
                                    byte[] bArr422 = ma0Var2.c;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (na0VarArr3 != null) {
                                    }
                                    bArr = ma0Var2.h;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    i52.c(context, (z6 || !z) ? false : z9);
                                }
                            } catch (IOException e6) {
                                f52Var.e(7, e6);
                                r7.close();
                                na0VarArr = null;
                                ma0Var2.g = na0VarArr;
                                na0VarArr2 = ma0Var2.g;
                                if (na0VarArr2 != null) {
                                }
                                f52 f52Var2222 = ma0Var2.b;
                                na0VarArr3 = ma0Var2.g;
                                byte[] bArr4222 = ma0Var2.c;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (na0VarArr3 != null) {
                                }
                                bArr = ma0Var2.h;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                i52.c(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, yk3.O(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            na0VarArr = zm3.O(r7, yk3.O(r7, 4), ma0Var2.e);
                            try {
                                r7.close();
                            } catch (IOException e7) {
                                f52Var.e(7, e7);
                            }
                            ma0Var2.g = na0VarArr;
                        }
                        na0VarArr2 = ma0Var2.g;
                        if (na0VarArr2 != null && ((r7 = Build.VERSION.SDK_INT) >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                r7 = "dexopt/baseline.profm";
                                a2 = ma0Var2.a(assets, "dexopt/baseline.profm");
                                z8 = r7;
                            } catch (FileNotFoundException e8) {
                                f52Var.e(9, e8);
                                z8 = r7;
                            } catch (IOException e9) {
                                f52Var.e(7, e9);
                                z8 = r7;
                            } catch (IllegalStateException e10) {
                                ma0Var2.g = null;
                                f52Var.e(8, e10);
                                z8 = r7;
                            }
                            if (a2 == null) {
                                try {
                                    if (!Arrays.equals(zm3.i, yk3.O(a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] O = yk3.O(a2, 4);
                                    ma0Var2.g = zm3.L(a2, O, bArr3, na0VarArr2);
                                    a2.close();
                                    ma0Var = ma0Var2;
                                    r7 = O;
                                    if (ma0Var != null) {
                                        ma0Var2 = ma0Var;
                                    }
                                } finally {
                                }
                            } else {
                                if (a2 != null) {
                                    a2.close();
                                    z8 = r7;
                                }
                                ma0Var = null;
                                r7 = z8;
                                if (ma0Var != null) {
                                }
                            }
                        }
                        f52 f52Var22222 = ma0Var2.b;
                        na0VarArr3 = ma0Var2.g;
                        byte[] bArr42222 = ma0Var2.c;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (na0VarArr3 != null && bArr42222 != null) {
                            r72 = ma0Var2.f;
                            if (r72 != 0) {
                                lh.g("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                r72 = new ByteArrayOutputStream();
                                try {
                                    r72.write(bArr2);
                                    r72.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e11) {
                                f52Var22222.e(7, e11);
                                z7 = r72;
                            } catch (IllegalStateException e12) {
                                f52Var22222.e(8, e12);
                                z7 = r72;
                            }
                            if (zm3.R(r72, bArr42222, na0VarArr3)) {
                                ma0Var2.h = r72.toByteArray();
                                r72.close();
                                z7 = r72;
                                ma0Var2.g = null;
                                z112222 = z7;
                            } else {
                                f52Var22222.e(5, null);
                                ma0Var2.g = null;
                                r72.close();
                                z112222 = r72;
                            }
                        }
                        bArr = ma0Var2.h;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!ma0Var2.f) {
                                    lh.g("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(ma0Var2.d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                ma0Var2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                ma0Var2.h = null;
                                                                                ma0Var2.g = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        ma0Var2.b(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        i52.c(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e14) {
                                        e = e14;
                                        ma0Var2.b(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        i52.c(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    z112222 = true;
                                    ma0Var2.b(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    i52.c(context, (z6 || !z) ? false : z9);
                                } catch (IOException e16) {
                                    e = e16;
                                    z112222 = true;
                                    ma0Var2.b(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    i52.c(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                ma0Var2.h = null;
                                ma0Var2.g = null;
                            }
                        }
                        if (z4) {
                            N(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            ma0Var2.b(4, null);
                        }
                        ma0Var2.f = true;
                        r7 = ma0Var2.a(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        na0VarArr2 = ma0Var2.g;
                        if (na0VarArr2 != null) {
                            r7 = "dexopt/baseline.profm";
                            a2 = ma0Var2.a(assets, "dexopt/baseline.profm");
                            z8 = r7;
                            if (a2 == null) {
                            }
                        }
                        f52 f52Var222222 = ma0Var2.b;
                        na0VarArr3 = ma0Var2.g;
                        byte[] bArr422222 = ma0Var2.c;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (na0VarArr3 != null) {
                            r72 = ma0Var2.f;
                            if (r72 != 0) {
                            }
                        }
                        bArr = ma0Var2.h;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        ma0Var2.b(4, null);
                    }
                }
                i52.c(context, (z6 || !z) ? false : z9);
            }
            ma0Var2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            i52.c(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e17) {
            f52Var.e(7, e17);
            i52.c(context, false);
        }
    }

    public static final bh2 d(kl3 kl3Var, by1 by1Var) {
        int b2 = kl3Var.b();
        gn gnVar = (gn) kl3Var.d;
        boolean z = b2 == 1;
        return new bh2(j(gnVar, z, true, by1Var), j(gnVar, z, false, by1Var), z);
    }

    public static final int e(qg1 qg1Var, xx0 xx0Var) {
        qg1 u0 = qg1Var.u0();
        if (u0 == null) {
            h21.b("Child of " + qg1Var + " cannot be null when calculating alignment line");
        }
        if (qg1Var.y0().a().containsKey(xx0Var)) {
            Integer num = (Integer) qg1Var.y0().a().get(xx0Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int t0 = u0.t0(xx0Var);
            if (t0 != Integer.MIN_VALUE) {
                u0.v = true;
                qg1Var.w = true;
                qg1Var.E0();
                u0.v = false;
                qg1Var.w = false;
                return t0 + ((int) (xx0Var instanceof xx0 ? u0.A0() & 4294967295L : u0.A0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean f(ai2 ai2Var) {
        sh2 k = ai2Var.k();
        return !k.m.c(gi2.i);
    }

    public static final void g(yn2 yn2Var) {
        int i = yn2Var.p;
        int[] iArr = yn2Var.n;
        Object[] objArr = yn2Var.o;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != g) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        yn2Var.m = false;
        yn2Var.p = i2;
    }

    public static final boolean h(ai2 ai2Var, Resources resources) {
        Object g2 = ai2Var.d.m.g(gi2.a);
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        return !s03.C(ai2Var) && (ai2Var.d.o || (ai2Var.o() && ((list != null ? (String) zv.v(list) : null) != null || H(ai2Var) != null || G(ai2Var, resources) != null || F(ai2Var))));
    }

    public static final ah2 i(kl3 kl3Var, gn gnVar, ah2 ah2Var) {
        int i = gnVar.c;
        int i2 = gnVar.b;
        boolean z = kl3Var.b;
        int i3 = z ? i2 : i;
        bw2 bw2Var = (bw2) gnVar.e;
        int i4 = gnVar.d;
        kc1 kc1Var = kc1.m;
        y91 a2 = ya1.a(kc1Var, new fh2(gnVar, i3));
        y91 a3 = ya1.a(kc1Var, new eh2(gnVar, i3, z ? i : i2, kl3Var, a2));
        if (1 != ah2Var.c) {
            return (ah2) a3.getValue();
        }
        if (i3 == i4) {
            return ah2Var;
        }
        if (((Number) a2.getValue()).intValue() != bw2Var.e(i4)) {
            return (ah2) a3.getValue();
        }
        int i5 = ah2Var.b;
        long k = bw2Var.k(i5);
        if (i4 != -1) {
            if (i3 != i4) {
                if (!((i2 >= i && i2 > i) ^ z)) {
                }
            }
            return gnVar.b(i3);
        }
        int i6 = jw2.c;
        return (i5 == ((int) (k >> 32)) || i5 == ((int) (4294967295L & k))) ? (ah2) a3.getValue() : gnVar.b(i3);
    }

    public static final ah2 j(gn gnVar, boolean z, boolean z2, by1 by1Var) {
        long a2;
        long j;
        int i = z2 ? gnVar.b : gnVar.c;
        switch (by1Var.m) {
            case 6:
                String str = ((bw2) gnVar.e).a.a.n;
                a2 = th2.a(mi2.h(str, i), mi2.g(str, i));
                break;
            default:
                a2 = ((bw2) gnVar.e).k(i);
                break;
        }
        if (z ^ z2) {
            int i2 = jw2.c;
            j = a2 >> 32;
        } else {
            int i3 = jw2.c;
            j = 4294967295L & a2;
        }
        return gnVar.b((int) j);
    }

    public static final w72 n(View view, t7 t7Var) {
        int[] iArr = yk3.s;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        t7Var.getLocationInWindow(iArr);
        float f2 = i - iArr[0];
        float f3 = i2 - iArr[1];
        return new w72(f2, f3, view.getWidth() + f2, view.getHeight() + f3);
    }

    public static final ah2 o(ah2 ah2Var, gn gnVar, int i) {
        return new ah2(((bw2) gnVar.e).a(i), i, ah2Var.c);
    }

    public static void p(boolean z) {
        if (z) {
            return;
        }
        b71.t();
    }

    public static void q(boolean z, String str) {
        if (z) {
            return;
        }
        lh.e(str);
    }

    public static void r(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void s(String str) {
        if (TextUtils.isEmpty(str)) {
            lh.e("Given String is empty or null");
        }
    }

    public static void t(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            lh.e(str2);
        }
    }

    public static void u(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        lh.g(str);
    }

    public static void v(Object obj) {
        if (obj != null) {
            return;
        }
        ch2.l("null reference");
    }

    public static void w(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ch2.l(str);
    }

    public static void x(boolean z, String str) {
        if (z) {
            return;
        }
        lh.g(str);
    }

    public static final void y(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                wi0.a(th, th2);
            }
        }
    }

    public void K(nc2 nc2Var, Iterable iterable) {
        nc2Var.getClass();
        if (iterable == null) {
            return;
        }
        uc2 M = nc2Var.M(z());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    k(M, obj);
                    M.E();
                    M.reset();
                }
            }
            Unit unit = Unit.a;
            yk3.w(M, null);
        } finally {
        }
    }

    public void L(nc2 nc2Var, Object obj) {
        nc2Var.getClass();
        uc2 M = nc2Var.M(z());
        try {
            k(M, obj);
            M.E();
            yk3.w(M, null);
        } finally {
        }
    }

    public abstract void k(uc2 uc2Var, Object obj);

    public ce l(Context context, Looper looper, sf sfVar, Object obj, uv0 uv0Var, vv0 vv0Var) {
        return m(context, looper, sfVar, obj, (aa3) uv0Var, (aa3) vv0Var);
    }

    public ce m(Context context, Looper looper, sf sfVar, Object obj, aa3 aa3Var, aa3 aa3Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract String z();
}
