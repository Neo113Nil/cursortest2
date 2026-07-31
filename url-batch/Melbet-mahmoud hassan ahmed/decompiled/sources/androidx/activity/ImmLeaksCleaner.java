package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements g {

    /* renamed from: g, reason: collision with root package name */
    private static int f480g;

    /* renamed from: h, reason: collision with root package name */
    private static Field f481h;

    /* renamed from: i, reason: collision with root package name */
    private static Field f482i;

    /* renamed from: j, reason: collision with root package name */
    private static Field f483j;

    /* renamed from: f, reason: collision with root package name */
    private Activity f484f;

    ImmLeaksCleaner(Activity activity) {
        this.f484f = activity;
    }

    private static void g() {
        try {
            f480g = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f482i = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f483j = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f481h = declaredField3;
            declaredField3.setAccessible(true);
            f480g = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.g
    public void d(i iVar, e.b bVar) {
        if (bVar != e.b.ON_DESTROY) {
            return;
        }
        if (f480g == 0) {
            g();
        }
        if (f480g == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f484f.getSystemService("input_method");
            try {
                Object obj = f481h.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f482i.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f483j.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
