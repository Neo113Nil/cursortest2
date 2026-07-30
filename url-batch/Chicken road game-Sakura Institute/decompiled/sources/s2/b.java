package s2;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import b3.r;
import b3.s;
import com.android.installreferrer.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b extends Activity implements v {

    /* renamed from: f, reason: collision with root package name */
    public final x f8494f = new x(this);

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object invoke;
        boolean booleanValue;
        r6.k.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        r6.k.e(decorView, "window.decorView");
        if (t6.a.x(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z8 = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!t6.a.f8928b) {
                    try {
                        t6.a.f8929c = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    t6.a.f8928b = true;
                }
                Method method = t6.a.f8929c;
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
        int i7 = s.f1365a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = r.f1361d;
            r rVar = (r) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (rVar == null) {
                rVar = new r();
                rVar.f1362a = null;
                rVar.f1363b = null;
                rVar.f1364c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, rVar);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = rVar.f1362a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = r.f1361d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (rVar.f1362a == null) {
                                rVar.f1362a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = r.f1361d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    rVar.f1362a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        rVar.f1362a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a3 = rVar.a(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (rVar.f1363b == null) {
                        rVar.f1363b = new SparseArray();
                    }
                    rVar.f1363b.put(keyCode, new WeakReference(a3));
                }
            }
            if (a3 != null) {
                z8 = true;
            }
        }
        if (z8) {
            return true;
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        r6.k.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        r6.k.e(decorView, "window.decorView");
        if (t6.a.x(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i7 = l0.f996g;
        j0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        r6.k.f(bundle, "outState");
        this.f8494f.g(androidx.lifecycle.o.f1009h);
        super.onSaveInstanceState(bundle);
    }
}
