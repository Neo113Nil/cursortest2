package e3;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.h0;
import androidx.lifecycle.k0;
import androidx.lifecycle.w;
import com.appsflyer.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o3.b0;
import o3.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a extends Activity implements androidx.lifecycle.u {

    /* renamed from: d, reason: collision with root package name */
    public final w f3790d = new w(this, true);

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object invoke;
        boolean booleanValue;
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (cf.c.p(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z10 = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!cf.c.f2038e) {
                    try {
                        cf.c.f2039i = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    cf.c.f2038e = true;
                }
                Method method = cf.c.f2039i;
                if (method != null) {
                    try {
                        invoke = method.invoke(actionBar, keyEvent);
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
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        Field field = c0.f7378a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = b0.f7367d;
            b0 b0Var = (b0) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (b0Var == null) {
                b0Var = new b0();
                b0Var.f7368a = null;
                b0Var.f7369b = null;
                b0Var.f7370c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, b0Var);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = b0Var.f7368a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = b0.f7367d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (b0Var.f7368a == null) {
                                b0Var.f7368a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = b0.f7367d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    b0Var.f7368a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        b0Var.f7368a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a9 = b0Var.a(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a9 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (b0Var.f7369b == null) {
                        b0Var.f7369b = new SparseArray();
                    }
                    b0Var.f7369b.put(keyCode, new WeakReference(a9));
                }
            }
            if (a9 != null) {
                z10 = true;
            }
        }
        if (z10) {
            return true;
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (cf.c.p(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i3 = k0.f695e;
        h0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        androidx.lifecycle.p pVar = androidx.lifecycle.p.f709i;
        w wVar = this.f3790d;
        wVar.getClass();
        wVar.c("setCurrentState");
        wVar.e(pVar);
        super.onSaveInstanceState(bundle);
    }
}
