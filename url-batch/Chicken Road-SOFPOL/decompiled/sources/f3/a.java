package f3;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.e0;
import androidx.lifecycle.h0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import com.snovikpovik.vuevnxsj.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q3.j0;
import q3.k0;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a extends Activity implements u {

    /* renamed from: d, reason: collision with root package name */
    public final w f2714d = new w(this, true);

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object invoke;
        boolean booleanValue;
        i.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        i.d(decorView, "getDecorView(...)");
        if (m.a.q(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z3 = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!m.a.f4869b) {
                    try {
                        m.a.f4870c = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    m.a.f4869b = true;
                }
                Method method = m.a.f4870c;
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
        Field field = k0.f6120a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = j0.f6114d;
            j0 j0Var = (j0) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (j0Var == null) {
                j0Var = new j0();
                j0Var.f6115a = null;
                j0Var.f6116b = null;
                j0Var.f6117c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, j0Var);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = j0Var.f6115a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = j0.f6114d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (j0Var.f6115a == null) {
                                j0Var.f6115a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = j0.f6114d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    j0Var.f6115a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        j0Var.f6115a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a8 = j0Var.a(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a8 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (j0Var.f6116b == null) {
                        j0Var.f6116b = new SparseArray();
                    }
                    j0Var.f6116b.put(keyCode, new WeakReference(a8));
                }
            }
            if (a8 != null) {
                z3 = true;
            }
        }
        if (z3) {
            return true;
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        i.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        i.d(decorView, "getDecorView(...)");
        if (m.a.q(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = h0.f829e;
        e0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        i.e(bundle, "outState");
        this.f2714d.g(p.f849f);
        super.onSaveInstanceState(bundle);
    }
}
