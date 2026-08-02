package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.system.Os;
import android.view.PointerIcon;
import android.view.View;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yk {
    public static long a;
    public static Method b;
    public static Method c;
    private static Method d;

    public static void a(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    public static void b(Window window) {
        if (Build.VERSION.SDK_INT >= 35) {
            window.setDecorFitsSystemWindows(false);
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 256);
            window.setDecorFitsSystemWindows(false);
        }
    }

    public static agd c(agh aghVar, ktj ktjVar, ago agoVar) {
        return aghVar.b(ixf.f(ktjVar), agoVar);
    }

    public static agd d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public static afr e(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            return new afr();
        }
        ClassLoader classLoader = afr.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        kpy kpyVar = new kpy(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            kpyVar.put(str, bundle.get(str));
        }
        return new afr(kpyVar.e());
    }

    public static void f(String str) {
        Trace.beginSection(i(str));
    }

    public static boolean g() {
        boolean isEnabled;
        if (Build.VERSION.SDK_INT >= 29) {
            isEnabled = Trace.isEnabled();
            return isEnabled;
        }
        try {
            Method method = d;
            if (method == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                d = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object invoke = method.invoke(null, Long.valueOf(a));
            invoke.getClass();
            return ((Boolean) invoke).booleanValue();
        } catch (Exception e) {
            h(e);
            return false;
        }
    }

    public static void h(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw cause;
        }
    }

    public static String i(String str) {
        if (str.length() <= 127) {
            return str;
        }
        String substring = str.substring(0, 127);
        substring.getClass();
        return substring;
    }

    public static void j(aok aokVar, Throwable th) {
        aog aogVar = aokVar.d;
        Thread currentThread = Thread.currentThread();
        long id = currentThread.getId();
        aoi aoiVar = aogVar.a;
        aoi aoiVar2 = aogVar.b;
        if (aoiVar == null || aoiVar.a != id) {
            if (aoiVar2 == null || aoiVar2.a != id) {
                Os.gettid();
                currentThread.getName();
                aoiVar = aogVar.a(id);
                aogVar.b = aogVar.a;
                aogVar.a = aoiVar;
            } else {
                aoiVar = aoiVar2;
            }
        }
        boolean z = aoiVar.c.e;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            stackTraceElement.getClassName();
            stackTraceElement.getMethodName();
            stackTraceElement.getFileName();
            stackTraceElement.getLineNumber();
        }
        throw th;
    }

    public static ams k(hrz hrzVar, SQLiteDatabase sQLiteDatabase) {
        hrzVar.getClass();
        Object obj = hrzVar.a;
        if (obj != null) {
            ams amsVar = (ams) obj;
            if (ksp.b(amsVar.e, sQLiteDatabase)) {
                return amsVar;
            }
        }
        ams amsVar2 = new ams(sQLiteDatabase);
        hrzVar.a = amsVar2;
        return amsVar2;
    }
}
