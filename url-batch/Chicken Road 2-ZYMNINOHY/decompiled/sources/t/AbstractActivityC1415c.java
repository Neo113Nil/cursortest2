package t;

import E.G;
import E.H;
import E.InterfaceC0006g;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.AbstractC0231j;
import androidx.lifecycle.C0237p;
import androidx.lifecycle.InterfaceC0235n;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import com.rockchicken.pump.up.road.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1415c extends Activity implements InterfaceC0235n, InterfaceC0006g {
    private final p.j extraDataMap = new p.j(0);
    private final C0237p lifecycleRegistry = new C0237p(this);

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchKeyEvent(KeyEvent event) {
        Object invoke;
        boolean booleanValue;
        kotlin.jvm.internal.i.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "getDecorView(...)");
        if (AbstractC0347t0.g(decorView, event)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return superDispatchKeyEvent(event);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (event.getKeyCode() == 82 && actionBar != null) {
                if (!AbstractC0347t0.f6015a) {
                    try {
                        AbstractC0347t0.f6016b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    AbstractC0347t0.f6015a = true;
                }
                Method method = AbstractC0347t0.f6016b;
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
        Field field = H.f375a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = G.f371d;
            G g4 = (G) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (g4 == null) {
                g4 = new G();
                g4.f372a = null;
                g4.f373b = null;
                g4.f374c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, g4);
            }
            if (event.getAction() == 0) {
                WeakHashMap weakHashMap = g4.f372a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = G.f371d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (g4.f372a == null) {
                                g4.f372a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = G.f371d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    g4.f372a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        g4.f372a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a3 = g4.a(decorView2);
            if (event.getAction() == 0) {
                int keyCode = event.getKeyCode();
                if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (g4.f373b == null) {
                        g4.f373b = new SparseArray();
                    }
                    g4.f373b.put(keyCode, new WeakReference(a3));
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
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "getDecorView(...)");
        if (AbstractC0347t0.g(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    public <T extends AbstractC1414b> T getExtraData(Class<T> extraDataClass) {
        kotlin.jvm.internal.i.e(extraDataClass, "extraDataClass");
        if (this.extraDataMap.get(extraDataClass) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public AbstractC0231j getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i4 = z.f5083b;
        x.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.e(outState, "outState");
        this.lifecycleRegistry.g();
        super.onSaveInstanceState(outState);
    }

    public void putExtraData(AbstractC1414b extraData) {
        kotlin.jvm.internal.i.e(extraData, "extraData");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 26) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 31) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean z = false;
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation")) {
                        break;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture")) {
                        break;
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill")) {
                        break;
                    }
                    break;
            }
        }
        return !z;
    }

    @Override // E.InterfaceC0006g
    public boolean superDispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
