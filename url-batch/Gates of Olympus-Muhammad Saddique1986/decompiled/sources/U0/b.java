package U0;

import O2.l;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.C0294x;
import androidx.lifecycle.EnumC0286o;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0292v;
import androidx.lifecycle.K;
import c1.AbstractC0394s;
import c1.r;
import com.gatesof.olympus.martu.marku.R;
import f2.j;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class b extends Activity implements InterfaceC0292v {

    /* renamed from: d, reason: collision with root package name */
    public final C0294x f4509d = new C0294x(this);

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object invoke;
        boolean booleanValue;
        j.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        j.e(decorView, "window.decorView");
        if (l.Y(decorView, keyEvent)) {
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
                if (!l.f3906e) {
                    try {
                        l.f3907f = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    l.f3906e = true;
                }
                Method method = l.f3907f;
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
        int i3 = AbstractC0394s.f5610a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = r.f5606d;
            r rVar = (r) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (rVar == null) {
                rVar = new r();
                rVar.f5607a = null;
                rVar.f5608b = null;
                rVar.f5609c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, rVar);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = rVar.f5607a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = r.f5606d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (rVar.f5607a == null) {
                                rVar.f5607a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = r.f5606d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    rVar.f5607a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        rVar.f5607a.put((View) parent, Boolean.TRUE);
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
                    if (rVar.f5608b == null) {
                        rVar.f5608b = new SparseArray();
                    }
                    rVar.f5608b.put(keyCode, new WeakReference(a3));
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
        j.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        j.e(decorView, "window.decorView");
        if (l.Y(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i3 = K.f5174e;
        I.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        j.f(bundle, "outState");
        this.f4509d.g(EnumC0286o.f5228f);
        super.onSaveInstanceState(bundle);
    }
}
