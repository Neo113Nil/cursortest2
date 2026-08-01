package z;

import K.InterfaceC0015k;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0082o;
import androidx.lifecycle.C0088v;
import androidx.lifecycle.D;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0086t;

/* loaded from: classes.dex */
public abstract class j extends Activity implements InterfaceC0086t, InterfaceC0015k {
    private final o.k extraDataMap = new o.k();
    private final C0088v lifecycleRegistry = new C0088v(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        X0.f.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        X0.f.d(decorView, "window.decorView");
        if (q1.l.r(decorView, keyEvent)) {
            return true;
        }
        return q1.l.s(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        X0.f.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        X0.f.d(decorView, "window.decorView");
        if (q1.l.r(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends i> T getExtraData(Class<T> cls) {
        X0.f.e(cls, "extraDataClass");
        if (this.extraDataMap.getOrDefault(cls, null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public AbstractC0082o getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = F.f1442b;
        D.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        X0.f.e(bundle, "outState");
        this.lifecycleRegistry.g();
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(i iVar) {
        X0.f.e(iVar, "extraData");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 31) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r4.equals("--autofill") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = true;
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
        boolean z2 = false;
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
                    break;
            }
        }
        return !z2;
    }

    @Override // K.InterfaceC0015k
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        X0.f.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
