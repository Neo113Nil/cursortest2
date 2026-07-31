package S0;

import I2.l;
import Z1.i;
import a1.AbstractC0179q;
import a1.C0178p;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0230o;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0236v;
import androidx.lifecycle.K;
import com.gates.olympus.miruv.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class b extends Activity implements InterfaceC0236v {

    /* renamed from: d, reason: collision with root package name */
    public final C0238x f3274d = new C0238x(this);

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object invoke;
        boolean booleanValue;
        i.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        i.e(decorView, "window.decorView");
        if (l.u(decorView, keyEvent)) {
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
                if (!l.f2515d) {
                    try {
                        l.f2516e = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    l.f2515d = true;
                }
                Method method = l.f2516e;
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
        int i3 = AbstractC0179q.f3561a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = C0178p.f3557d;
            C0178p c0178p = (C0178p) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (c0178p == null) {
                c0178p = new C0178p();
                c0178p.f3558a = null;
                c0178p.f3559b = null;
                c0178p.f3560c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, c0178p);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = c0178p.f3558a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = C0178p.f3557d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (c0178p.f3558a == null) {
                                c0178p.f3558a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = C0178p.f3557d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    c0178p.f3558a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        c0178p.f3558a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a3 = c0178p.a(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (c0178p.f3559b == null) {
                        c0178p.f3559b = new SparseArray();
                    }
                    c0178p.f3559b.put(keyCode, new WeakReference(a3));
                }
            }
            if (a3 != null) {
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
        i.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        i.e(decorView, "window.decorView");
        if (l.u(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i3 = K.f3973e;
        I.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        i.f(bundle, "outState");
        this.f3274d.g(EnumC0230o.f4027f);
        super.onSaveInstanceState(bundle);
    }
}
