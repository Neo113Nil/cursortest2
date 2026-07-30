package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.ice.fishing.grenza.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class gn extends Activity implements o01 {
    public final s01 rtx2ld2ELZv4 = new s01(this, true);

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (ng0.BRwzKIf41E4i(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!ng0.PxuCJdSBwIXG) {
                    try {
                        ng0.lS5Rgt96tfkO = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    ng0.PxuCJdSBwIXG = true;
                }
                Method method = ng0.lS5Rgt96tfkO;
                boolean z = false;
                if (method != null) {
                    try {
                        Object invoke = method.invoke(actionBar, keyEvent);
                        if (invoke != null) {
                            z = ((Boolean) invoke).booleanValue();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        int i = rq2.PxuCJdSBwIXG;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = qq2.Y1f8riQaR6yg;
            qq2 qq2Var = (qq2) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (qq2Var == null) {
                qq2Var = new qq2();
                qq2Var.PxuCJdSBwIXG = null;
                qq2Var.lS5Rgt96tfkO = null;
                qq2Var.TSizfFm2Yiuu = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, qq2Var);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = qq2Var.PxuCJdSBwIXG;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = qq2.Y1f8riQaR6yg;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (qq2Var.PxuCJdSBwIXG == null) {
                                qq2Var.PxuCJdSBwIXG = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = qq2.Y1f8riQaR6yg;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    qq2Var.PxuCJdSBwIXG.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        qq2Var.PxuCJdSBwIXG.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View PxuCJdSBwIXG = qq2Var.PxuCJdSBwIXG(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (PxuCJdSBwIXG != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (qq2Var.lS5Rgt96tfkO == null) {
                        qq2Var.lS5Rgt96tfkO = new SparseArray();
                    }
                    qq2Var.lS5Rgt96tfkO.put(keyCode, new WeakReference(PxuCJdSBwIXG));
                }
            }
            if (PxuCJdSBwIXG != null) {
                return true;
            }
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (ng0.BRwzKIf41E4i(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        yu1.Companion.getClass();
        wu1.lS5Rgt96tfkO(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        s01 s01Var = this.rtx2ld2ELZv4;
        s01Var.getClass();
        s01Var.TSizfFm2Yiuu("setCurrentState");
        s01Var.e9gEMXR7LXtO(f01.wdg6QnbFHrFF);
        super.onSaveInstanceState(bundle);
    }
}
