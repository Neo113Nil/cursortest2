package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yj {
    public static zz a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        zz q = zz.q(rootWindowInsets, null);
        q.t(q);
        q.r(view.getRootView());
        return q;
    }

    public static void b(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof xn) {
            ((xn) viewParent).d(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.ab(viewParent, "ViewParent ", " does not implement interface method onNestedPreScroll"), e);
            }
        }
    }

    public static void c(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof xo) {
            ((xo) viewParent).f(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof xn) {
            ((xn) viewParent).e(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.ab(viewParent, "ViewParent ", " does not implement interface method onNestedScroll"), e);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof xn) {
            ((xn) viewParent).g(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.ab(viewParent, "ViewParent ", " does not implement interface method onNestedScrollAccepted"), e);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof xn) {
            ((xn) viewParent).h(view, i);
        } else if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", a.ab(viewParent, "ViewParent ", " does not implement interface method onStopNestedScroll"), e);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.ab(viewParent, "ViewParent ", " does not implement interface method onNestedFling"), e);
            return false;
        }
    }

    public static boolean g(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.ab(viewParent, "ViewParent ", " does not implement interface method onNestedPreFling"), e);
            return false;
        }
    }

    public static boolean h(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof xn) {
            return ((xn) viewParent).t(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", a.ab(viewParent, "ViewParent ", " does not implement interface method onStartNestedScroll"), e);
            return false;
        }
    }

    public static final aek i(aek aekVar, aek aekVar2) {
        return (aekVar2 == null || aekVar2.compareTo(aekVar) >= 0) ? aekVar : aekVar2;
    }

    public static final aem j(aer aerVar) {
        AtomicReference atomicReference;
        aem aemVar;
        kxf kxfVar;
        ael L = aerVar.L();
        L.getClass();
        do {
            atomicReference = (AtomicReference) L.e.a;
            aem aemVar2 = (aem) atomicReference.get();
            if (aemVar2 != null) {
                return aemVar2;
            }
            kxt kxtVar = new kxt();
            kvj kvjVar = kwa.a;
            kxfVar = lcv.a;
            aemVar = new aem(L, ixe.h(kxtVar, kxfVar.i()));
        } while (!a.j(atomicReference, aemVar));
        ixg.i(aemVar, kxfVar.i(), 0, new dtf(aemVar, (kqj) null, 1), 2);
        return aemVar;
    }

    public static final Method k() {
        return (Method) ams.d.a();
    }

    public static final Method l() {
        return (Method) ams.c.a();
    }

    public static final aml m(Context context, String str, amk amkVar, boolean z, boolean z2) {
        if (z && (str == null || str.length() == 0)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new aml(context, str, amkVar, z, z2);
    }

    public static final void n(amo amoVar, Object[] objArr) {
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    amoVar.d(i);
                } else if (obj instanceof byte[]) {
                    amoVar.a(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    amoVar.b(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    amoVar.b(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    amoVar.c(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    amoVar.c(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    amoVar.c(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    amoVar.c(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    amoVar.e(i, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    amoVar.c(i, true != ((Boolean) obj).booleanValue() ? 0L : 1L);
                }
            }
        }
    }

    public static final void o(ana anaVar, String str) {
        amh a = anaVar.a(str);
        try {
            a.l();
            ixf.i(a, null);
        } finally {
        }
    }
}
