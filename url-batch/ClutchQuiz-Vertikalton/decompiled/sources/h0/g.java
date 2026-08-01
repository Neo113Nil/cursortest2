package h0;

import U0.i;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.clutchquizarena.app.R;
import f1.p;
import g1.l;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n0.v;
import n0.y;
import o1.AbstractC0282a;
import o1.AbstractC0299s;
import o1.C0291j;
import o1.I;
import o1.J;
import p.C0309c;
import s1.q;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static long f2582a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2583b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2584c = true;
    public static boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public static Field f2585e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2586f;

    public static View d(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static j0.c f(j0.d dVar, SQLiteDatabase sQLiteDatabase) {
        g1.f.e(dVar, "refHolder");
        g1.f.e(sQLiteDatabase, "sqLiteDatabase");
        j0.c cVar = dVar.f2652a;
        if (cVar != null && g1.f.a(cVar.f2651a, sQLiteDatabase)) {
            return cVar;
        }
        j0.c cVar2 = new j0.c(sQLiteDatabase);
        dVar.f2652a = cVar2;
        return cVar2;
    }

    public static boolean g() {
        boolean isEnabled;
        try {
            if (f2583b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2583b == null) {
                f2582a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2583b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2583b.invoke(null, Long.valueOf(f2582a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final void k(View view, f fVar) {
        g1.f.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void n(p pVar, AbstractC0282a abstractC0282a, AbstractC0282a abstractC0282a2) {
        try {
            s1.a.c(T.d.y(((Z0.e) pVar).a(abstractC0282a, abstractC0282a2)), i.f864a, null);
        } catch (Throwable th) {
            abstractC0282a2.b(T.d.p(th));
            throw th;
        }
    }

    public static final Object o(q qVar, q qVar2, p pVar) {
        Object c0291j;
        Object B2;
        I i;
        try {
            l.a(pVar);
            c0291j = pVar.d(qVar2, qVar);
        } catch (Throwable th) {
            c0291j = new C0291j(th, false);
        }
        Y0.a aVar = Y0.a.f1163a;
        if (c0291j == aVar || (B2 = qVar.B(c0291j)) == AbstractC0299s.f3361c) {
            return aVar;
        }
        if (B2 instanceof C0291j) {
            throw ((C0291j) B2).f3348a;
        }
        J j2 = B2 instanceof J ? (J) B2 : null;
        return (j2 == null || (i = j2.f3313a) == null) ? B2 : i;
    }

    public static void p(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            v.b(viewGroup, z2);
        } else if (f2584c) {
            try {
                v.b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f2584c = false;
            }
        }
    }

    public abstract boolean a(p.g gVar, C0309c c0309c);

    public abstract boolean b(p.g gVar, Object obj, Object obj2);

    public abstract boolean c(p.g gVar, p.f fVar, p.f fVar2);

    public float e(View view) {
        if (d) {
            try {
                return y.a(view);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void i(p.f fVar, p.f fVar2);

    public abstract void j(p.f fVar, Thread thread);

    public void l(View view, float f2) {
        if (d) {
            try {
                y.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
        view.setAlpha(f2);
    }

    public void m(View view, int i) {
        if (!f2586f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2585e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2586f = true;
        }
        Field field = f2585e;
        if (field != null) {
            try {
                f2585e.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
