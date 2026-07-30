package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.ice.fishing.grenza.MainActivity;
import com.ice.fishing.grenza.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class hn extends gn implements pr2, bj0, qz1, vf1, ic1 {
    private static final cn Companion = new cn();
    public final CopyOnWriteArrayList BRwzKIf41E4i;
    public final CopyOnWriteArrayList EcgxDIVH5in8;
    public final qc2 IAToe7bXGz4N;
    public final ls OPXfSBeufaJ8;
    public final fn QrzZRwfaDlRX;
    public final CopyOnWriteArrayList RfyTYNmI9Srp;
    public boolean S2OOm9zPNm0h;
    public final CopyOnWriteArrayList S9EYkSpbGuxq;
    public final CopyOnWriteArrayList VhhvGxCb8gfr;
    public final CopyOnWriteArrayList XL4ISE6Oc65B;
    public boolean ZbWwgt3aGe7A;
    public final en cpQdD2nAriOS;
    public final nz1 dgRBjINgWbAK;
    public final qc2 e6tOsSdd2EFb;
    public final CopyOnWriteArrayList gPXPFXrUH4XX;
    public final qc2 pnx5pC0XzaCw;
    public final qc2 r3s1LDPKFs1S;
    public final i2 wdg6QnbFHrFF;
    public or2 x50lh2ztY7Y5;

    public hn() {
        ls lsVar = new ls();
        this.OPXfSBeufaJ8 = lsVar;
        final MainActivity mainActivity = (MainActivity) this;
        final int i = 1;
        this.wdg6QnbFHrFF = new i2(new vm(mainActivity, i));
        nz1.Companion.getClass();
        nz1 PxuCJdSBwIXG = mz1.PxuCJdSBwIXG(this);
        this.dgRBjINgWbAK = PxuCJdSBwIXG;
        this.cpQdD2nAriOS = new en(mainActivity);
        this.r3s1LDPKFs1S = new qc2(new wm(mainActivity, i));
        new AtomicInteger();
        this.QrzZRwfaDlRX = new fn();
        this.gPXPFXrUH4XX = new CopyOnWriteArrayList();
        this.BRwzKIf41E4i = new CopyOnWriteArrayList();
        this.XL4ISE6Oc65B = new CopyOnWriteArrayList();
        this.RfyTYNmI9Srp = new CopyOnWriteArrayList();
        this.EcgxDIVH5in8 = new CopyOnWriteArrayList();
        this.S9EYkSpbGuxq = new CopyOnWriteArrayList();
        this.VhhvGxCb8gfr = new CopyOnWriteArrayList();
        this.pnx5pC0XzaCw = new qc2(new wm(mainActivity, 2));
        s01 s01Var = this.rtx2ld2ELZv4;
        if (s01Var == null) {
            u9.rtx2ld2ELZv4("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i2 = 0;
        s01Var.PxuCJdSBwIXG(new l01() { // from class: ym
            @Override // defpackage.l01
            public final void cpQdD2nAriOS(o01 o01Var, e01 e01Var) {
                Window window;
                View peekDecorView;
                int i3 = i2;
                MainActivity mainActivity2 = mainActivity;
                switch (i3) {
                    case 0:
                        if (e01Var == e01.ON_STOP && (window = mainActivity2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (e01Var == e01.ON_DESTROY) {
                            mainActivity2.OPXfSBeufaJ8.lS5Rgt96tfkO = null;
                            if (!mainActivity2.isChangingConfigurations()) {
                                mainActivity2.RAsUl2FVSrh6().PxuCJdSBwIXG();
                            }
                            en enVar = mainActivity2.cpQdD2nAriOS;
                            MainActivity mainActivity3 = enVar.dgRBjINgWbAK;
                            mainActivity3.getWindow().getDecorView().removeCallbacks(enVar);
                            mainActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(enVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.rtx2ld2ELZv4.PxuCJdSBwIXG(new l01() { // from class: ym
            @Override // defpackage.l01
            public final void cpQdD2nAriOS(o01 o01Var, e01 e01Var) {
                Window window;
                View peekDecorView;
                int i3 = i;
                MainActivity mainActivity2 = mainActivity;
                switch (i3) {
                    case 0:
                        if (e01Var == e01.ON_STOP && (window = mainActivity2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (e01Var == e01.ON_DESTROY) {
                            mainActivity2.OPXfSBeufaJ8.lS5Rgt96tfkO = null;
                            if (!mainActivity2.isChangingConfigurations()) {
                                mainActivity2.RAsUl2FVSrh6().PxuCJdSBwIXG();
                            }
                            en enVar = mainActivity2.cpQdD2nAriOS;
                            MainActivity mainActivity3 = enVar.dgRBjINgWbAK;
                            mainActivity3.getWindow().getDecorView().removeCallbacks(enVar);
                            mainActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(enVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.rtx2ld2ELZv4.PxuCJdSBwIXG(new bn(i2, mainActivity));
        PxuCJdSBwIXG.PxuCJdSBwIXG();
        mm2.J54yh1s3n4Aq(this);
        PxuCJdSBwIXG.lS5Rgt96tfkO.wdg6QnbFHrFF("android:support:activity-result", new zm(i2, mainActivity));
        wf1 wf1Var = new wf1() { // from class: an
            @Override // defpackage.wf1
            public final void PxuCJdSBwIXG(hn hnVar) {
                hnVar.getClass();
                MainActivity mainActivity2 = MainActivity.this;
                Bundle RAsUl2FVSrh6 = mainActivity2.dgRBjINgWbAK.lS5Rgt96tfkO.RAsUl2FVSrh6("android:support:activity-result");
                if (RAsUl2FVSrh6 != null) {
                    fn fnVar = mainActivity2.QrzZRwfaDlRX;
                    LinkedHashMap linkedHashMap = fnVar.lS5Rgt96tfkO;
                    LinkedHashMap linkedHashMap2 = fnVar.PxuCJdSBwIXG;
                    Bundle bundle = fnVar.a92UlCVFR9N8;
                    ArrayList<Integer> integerArrayList = RAsUl2FVSrh6.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = RAsUl2FVSrh6.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = RAsUl2FVSrh6.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        fnVar.TSizfFm2Yiuu.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = RAsUl2FVSrh6.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        String str = stringArrayList.get(i3);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (!bundle.containsKey(str)) {
                                mm2.RfyTYNmI9Srp(linkedHashMap2).remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i3);
                        num2.getClass();
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i3);
                        str2.getClass();
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(intValue), str3);
                        fnVar.lS5Rgt96tfkO.put(str3, Integer.valueOf(intValue));
                    }
                }
            }
        };
        hn hnVar = lsVar.lS5Rgt96tfkO;
        if (hnVar != null) {
            wf1Var.PxuCJdSBwIXG(hnVar);
        }
        lsVar.PxuCJdSBwIXG.add(wf1Var);
        this.IAToe7bXGz4N = new qc2(new wm(mainActivity, 3));
        this.e6tOsSdd2EFb = new qc2(new wm(mainActivity, 4));
    }

    public static void OPXfSBeufaJ8(MainActivity mainActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!cs0.wdg6QnbFHrFF(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!cs0.wdg6QnbFHrFF(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.ic1
    public final hc1 PxuCJdSBwIXG() {
        return lS5Rgt96tfkO().PxuCJdSBwIXG().TSizfFm2Yiuu;
    }

    @Override // defpackage.pr2
    public final or2 RAsUl2FVSrh6() {
        if (getApplication() == null) {
            u9.rtx2ld2ELZv4("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.x50lh2ztY7Y5 == null) {
            dn dnVar = (dn) getLastNonConfigurationInstance();
            if (dnVar != null) {
                this.x50lh2ztY7Y5 = dnVar.PxuCJdSBwIXG;
            }
            if (this.x50lh2ztY7Y5 == null) {
                this.x50lh2ztY7Y5 = new or2();
            }
        }
        or2 or2Var = this.x50lh2ztY7Y5;
        or2Var.getClass();
        return or2Var;
    }

    @Override // defpackage.qz1
    public final cr1 TSizfFm2Yiuu() {
        return this.dgRBjINgWbAK.lS5Rgt96tfkO;
    }

    @Override // defpackage.bj0
    public final zu a92UlCVFR9N8() {
        z71 z71Var = new z71(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = z71Var.PxuCJdSBwIXG;
        if (application != null) {
            linkedHashMap.put(hr2.Y1f8riQaR6yg, getApplication());
        }
        linkedHashMap.put(mm2.RfyTYNmI9Srp, this);
        linkedHashMap.put(mm2.EcgxDIVH5in8, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(mm2.S9EYkSpbGuxq, extras);
        }
        return z71Var;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        wdg6QnbFHrFF();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.cpQdD2nAriOS.PxuCJdSBwIXG(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.vf1
    public final uf1 lS5Rgt96tfkO() {
        return (uf1) this.e6tOsSdd2EFb.getValue();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.QrzZRwfaDlRX.PxuCJdSBwIXG(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((b00) this.pnx5pC0XzaCw.getValue()).PxuCJdSBwIXG();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.gPXPFXrUH4XX.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((tr) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.gn, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.dgRBjINgWbAK.lS5Rgt96tfkO(bundle);
        ls lsVar = this.OPXfSBeufaJ8;
        lsVar.getClass();
        lsVar.lS5Rgt96tfkO = this;
        Iterator it = lsVar.PxuCJdSBwIXG.iterator();
        while (it.hasNext()) {
            ((wf1) it.next()).PxuCJdSBwIXG(this);
        }
        super.onCreate(bundle);
        yu1.Companion.getClass();
        wu1.lS5Rgt96tfkO(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.wdg6QnbFHrFF.OPXfSBeufaJ8).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((gd0) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.wdg6QnbFHrFF.OPXfSBeufaJ8).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((gd0) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.S2OOm9zPNm0h = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.S2OOm9zPNm0h = false;
            Iterator it = this.RfyTYNmI9Srp.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((tr) it.next()).accept(new y71(z));
            }
        } catch (Throwable th) {
            this.S2OOm9zPNm0h = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.XL4ISE6Oc65B.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((tr) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.wdg6QnbFHrFF.OPXfSBeufaJ8).iterator();
        if (it.hasNext()) {
            ((gd0) it.next()).getClass();
            throw null;
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.ZbWwgt3aGe7A = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.ZbWwgt3aGe7A = false;
            Iterator it = this.EcgxDIVH5in8.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((tr) it.next()).accept(new yl1(z));
            }
        } catch (Throwable th) {
            this.ZbWwgt3aGe7A = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        bm1 bm1Var;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        bm1.Companion.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            bm1Var = new bm1();
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            bm1Var = new bm1();
        } else {
            bm1Var = new bm1();
        }
        Iterator it = this.S9EYkSpbGuxq.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((tr) it.next()).accept(bm1Var);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.wdg6QnbFHrFF.OPXfSBeufaJ8).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((gd0) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.QrzZRwfaDlRX.PxuCJdSBwIXG(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        dn dnVar;
        or2 or2Var = this.x50lh2ztY7Y5;
        if (or2Var == null && (dnVar = (dn) getLastNonConfigurationInstance()) != null) {
            or2Var = dnVar.PxuCJdSBwIXG;
        }
        if (or2Var == null) {
            return null;
        }
        dn dnVar2 = new dn();
        dnVar2.PxuCJdSBwIXG = or2Var;
        return dnVar2;
    }

    @Override // defpackage.gn, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        s01 s01Var = this.rtx2ld2ELZv4;
        if (s01Var != null) {
            s01Var.TSizfFm2Yiuu("setCurrentState");
            s01Var.e9gEMXR7LXtO(f01.wdg6QnbFHrFF);
        }
        super.onSaveInstanceState(bundle);
        this.dgRBjINgWbAK.TSizfFm2Yiuu(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.BRwzKIf41E4i.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((tr) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.VhhvGxCb8gfr.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (sj0.BjEWd04qc7Mw()) {
                sj0.wdg6QnbFHrFF("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            zd0 zd0Var = (zd0) this.r3s1LDPKFs1S.getValue();
            synchronized (zd0Var.PxuCJdSBwIXG) {
                try {
                    zd0Var.lS5Rgt96tfkO = true;
                    ArrayList arrayList = zd0Var.TSizfFm2Yiuu;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((ae0) obj).PxuCJdSBwIXG();
                    }
                    zd0Var.TSizfFm2Yiuu.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.o01
    public final s01 rtx2ld2ELZv4() {
        return this.rtx2ld2ELZv4;
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        wdg6QnbFHrFF();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.cpQdD2nAriOS.PxuCJdSBwIXG(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void wdg6QnbFHrFF() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        wdg6QnbFHrFF();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.cpQdD2nAriOS.PxuCJdSBwIXG(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        wdg6QnbFHrFF();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.cpQdD2nAriOS.PxuCJdSBwIXG(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.S2OOm9zPNm0h) {
            return;
        }
        Iterator it = this.RfyTYNmI9Srp.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((tr) it.next()).accept(new y71(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.ZbWwgt3aGe7A) {
            return;
        }
        Iterator it = this.EcgxDIVH5in8.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((tr) it.next()).accept(new yl1(z));
        }
    }
}
