package t;

import E.A;
import E.C0024z;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import com.fc.barca.football.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.j;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1188a extends Activity implements m {

    /* renamed from: a, reason: collision with root package name */
    public final o f10332a = new o(this);

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent event) {
        Object invoke;
        boolean booleanValue;
        j.e(event, "event");
        View decorView = getWindow().getDecorView();
        j.d(decorView, "getDecorView(...)");
        if (android.support.v4.media.session.a.u(decorView, event)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(event);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (event.getKeyCode() == 82 && actionBar != null) {
                if (!android.support.v4.media.session.a.f1964a) {
                    try {
                        android.support.v4.media.session.a.f1965b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    android.support.v4.media.session.a.f1964a = true;
                }
                Method method = android.support.v4.media.session.a.f1965b;
                if (method != null) {
                    try {
                        invoke = method.invoke(actionBar, event);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                    if (invoke != null) {
                        booleanValue = ((Boolean) invoke).booleanValue();
                        if (booleanValue) {
                            return true;
                        }
                    }
                }
                booleanValue = false;
                if (booleanValue) {
                }
            }
        }
        if (window.superDispatchKeyEvent(event)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        Field field = A.f243a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = C0024z.f304d;
            C0024z c0024z = (C0024z) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (c0024z == null) {
                c0024z = new C0024z();
                c0024z.f305a = null;
                c0024z.f306b = null;
                c0024z.f307c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, c0024z);
            }
            if (event.getAction() == 0) {
                WeakHashMap weakHashMap = c0024z.f305a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = C0024z.f304d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (c0024z.f305a == null) {
                                c0024z.f305a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = C0024z.f304d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    c0024z.f305a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        c0024z.f305a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a3 = c0024z.a(decorView2);
            if (event.getAction() == 0) {
                int keyCode = event.getKeyCode();
                if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (c0024z.f306b == null) {
                        c0024z.f306b = new SparseArray();
                    }
                    c0024z.f306b.put(keyCode, new WeakReference(a3));
                }
            }
            if (a3 != null) {
                z = true;
            }
        }
        if (z) {
            return true;
        }
        return event.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        j.e(event, "event");
        View decorView = getWindow().getDecorView();
        j.d(decorView, "getDecorView(...)");
        if (android.support.v4.media.session.a.u(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i3 = w.f2408b;
        u.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        j.e(outState, "outState");
        androidx.lifecycle.h hVar = androidx.lifecycle.h.f2381c;
        o oVar = this.f10332a;
        oVar.d("setCurrentState");
        oVar.f(hVar);
        super.onSaveInstanceState(outState);
    }
}
