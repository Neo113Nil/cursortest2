package defpackage;

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
import com.moontiko.really.admiralcasino.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class wc extends vc implements uc0, fp, n40 {
    public final je g = new je();
    public final k6 h;
    public final m40 i;
    public tc0 j;
    public final tc k;
    public final a80 l;
    public final uc m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public final CopyOnWriteArrayList s;
    public final CopyOnWriteArrayList t;
    public boolean u;
    public boolean v;
    public final a80 w;
    public final a80 x;

    public wc() {
        m3 m3Var = (m3) this;
        int i = 1;
        this.h = new k6(new mc(m3Var, i));
        m40 m40Var = new m40(this);
        this.i = m40Var;
        this.k = new tc(m3Var);
        this.l = new a80(new nc(m3Var, i));
        new AtomicInteger();
        this.m = new uc();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = new CopyOnWriteArrayList();
        this.t = new CopyOnWriteArrayList();
        this.w = new a80(new nc(m3Var, 2));
        os osVar = this.f;
        if (osVar == null) {
            g9.s("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        int i2 = 0;
        osVar.a(new pc(i2, m3Var));
        this.f.a(new pc(i, m3Var));
        this.f.a(new p10(i, m3Var));
        m40Var.a();
        kr.r(this);
        m40Var.b.e("android:support:activity-result", new qc(i2, m3Var));
        g(new rc(m3Var, i2));
        this.x = new a80(new nc(m3Var, 3));
    }

    public static void f(m3 m3Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!kr.b(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!kr.b(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.n40
    public final s3 a() {
        return this.i.b;
    }

    @Override // defpackage.fp
    public final qx c() {
        qx qxVar = new qx(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) qxVar.a;
        if (getApplication() != null) {
            linkedHashMap.put(rc0.i, getApplication());
        }
        linkedHashMap.put(kr.k, this);
        linkedHashMap.put(kr.l, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(kr.m, extras);
        }
        return qxVar;
    }

    @Override // defpackage.uc0
    public final tc0 d() {
        if (getApplication() == null) {
            g9.s("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.j == null) {
            sc scVar = (sc) getLastNonConfigurationInstance();
            if (scVar != null) {
                this.j = scVar.a;
            }
            if (this.j == null) {
                this.j = new tc0();
            }
        }
        tc0 tc0Var = this.j;
        tc0Var.getClass();
        return tc0Var;
    }

    @Override // defpackage.ms
    public final os e() {
        return this.f;
    }

    public final void g(iz izVar) {
        je jeVar = this.g;
        jeVar.getClass();
        wc wcVar = jeVar.b;
        if (wcVar != null) {
            izVar.a(wcVar);
        }
        jeVar.a.add(izVar);
    }

    public final hz h() {
        return (hz) this.x.a();
    }

    public final void i() {
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
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.m.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((xh) this.w.a()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((de) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.vc, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.i.b(bundle);
        je jeVar = this.g;
        jeVar.getClass();
        jeVar.b = this;
        Iterator it = jeVar.a.iterator();
        while (it.hasNext()) {
            ((iz) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = a30.g;
        y20.b(this);
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
        Iterator it = ((CopyOnWriteArrayList) this.h.i).iterator();
        while (it.hasNext()) {
            ((ym) it.next()).a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.h.i).iterator();
            while (it.hasNext()) {
                if (((ym) it.next()).a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.u = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.u = false;
            Iterator it = this.q.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((de) it.next()).accept(new px(z));
            }
        } catch (Throwable th) {
            this.u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.p.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((de) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.h.i).iterator();
        while (it.hasNext()) {
            ((ym) it.next()).a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.v = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.v = false;
            Iterator it = this.r.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((de) it.next()).accept(new xz(z));
            }
        } catch (Throwable th) {
            this.v = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        ky kyVar;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            kyVar = new ky(2);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            kyVar = new ky(2);
        } else {
            kyVar = new ky(2);
        }
        Iterator it = this.s.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((de) it.next()).accept(kyVar);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.h.i).iterator();
        while (it.hasNext()) {
            ((ym) it.next()).a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.m.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        sc scVar;
        tc0 tc0Var = this.j;
        if (tc0Var == null && (scVar = (sc) getLastNonConfigurationInstance()) != null) {
            tc0Var = scVar.a;
        }
        if (tc0Var == null) {
            return null;
        }
        sc scVar2 = new sc();
        scVar2.a = tc0Var;
        return scVar2;
    }

    @Override // defpackage.vc, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        os osVar = this.f;
        if (osVar != null) {
            osVar.c("setCurrentState");
            osVar.e(hs.h);
        }
        super.onSaveInstanceState(bundle);
        this.i.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.o.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((de) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.t.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (mz.y()) {
                mz.f("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            qn qnVar = (qn) this.l.a();
            synchronized (qnVar.a) {
                try {
                    qnVar.b = true;
                    ArrayList arrayList = qnVar.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((rn) obj).a();
                    }
                    qnVar.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        tc tcVar = this.k;
        tcVar.getClass();
        if (!tcVar.h) {
            tcVar.h = true;
            decorView.getViewTreeObserver().addOnDrawListener(tcVar);
        }
        super.setContentView(view);
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
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.u) {
            return;
        }
        Iterator it = this.q.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((de) it.next()).accept(new px(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.v) {
            return;
        }
        Iterator it = this.r.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((de) it.next()).accept(new xz(z));
        }
    }
}
