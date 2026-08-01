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
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.k;
import androidx.lifecycle.a;
import com.awerser.monnit.betplay.R;
import defpackage.ac;
import defpackage.gq;
import defpackage.nq;
import defpackage.q90;
import defpackage.vb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class ac extends zb implements r90, ln, x10, mw, j2, nw, tw, qw, rw, cu {
    public static final /* synthetic */ int y = 0;
    public final nd g = new nd();
    public final r6 h;
    public final w10 i;
    public q90 j;
    public final wb k;
    public final d50 l;
    public final yb m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public final CopyOnWriteArrayList s;
    public final CopyOnWriteArrayList t;
    public boolean u;
    public boolean v;
    public final d50 w;
    public final d50 x;

    public ac() {
        final k kVar = (k) this;
        int i = 0;
        this.h = new r6(new rb(kVar, i));
        w10 w10Var = new w10(this);
        this.i = w10Var;
        this.k = new wb(kVar);
        int i2 = 1;
        this.l = new d50(new pb(kVar, i2));
        new AtomicInteger();
        this.m = new yb(kVar);
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = new CopyOnWriteArrayList();
        this.t = new CopyOnWriteArrayList();
        this.w = new d50(new pb(kVar, 2));
        a aVar = this.f;
        if (aVar == null) {
            o8.t("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        aVar.a(new sb(i, kVar));
        this.f.a(new sb(i2, kVar));
        this.f.a(new lq() { // from class: androidx.activity.ComponentActivity$4
            @Override // defpackage.lq
            public final void b(nq nqVar, gq gqVar) {
                int i3 = ac.y;
                k kVar2 = k.this;
                if (kVar2.j == null) {
                    vb vbVar = (vb) kVar2.getLastNonConfigurationInstance();
                    if (vbVar != null) {
                        kVar2.j = vbVar.a;
                    }
                    if (kVar2.j == null) {
                        kVar2.j = new q90();
                    }
                }
                kVar2.f.b(this);
            }
        });
        w10Var.a();
        j8.l(this);
        w10Var.b.c("android:support:activity-result", new tb(i, kVar));
        n(new ub(kVar, i));
        this.x = new d50(new pb(kVar, 3));
    }

    public static void m(k kVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!op.d(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!op.d(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.cu
    public final void a(rk rkVar) {
        rkVar.getClass();
        r6 r6Var = this.h;
        ((CopyOnWriteArrayList) r6Var.d).remove(rkVar);
        if (((HashMap) r6Var.b).remove(rkVar) == null) {
            ((Runnable) r6Var.c).run();
        } else {
            o8.c();
        }
    }

    @Override // defpackage.nw
    public final void c(hd hdVar) {
        hdVar.getClass();
        this.n.add(hdVar);
    }

    @Override // defpackage.nw
    public final void d(hd hdVar) {
        hdVar.getClass();
        this.n.remove(hdVar);
    }

    @Override // defpackage.rw
    public final void e(hd hdVar) {
        hdVar.getClass();
        this.r.add(hdVar);
    }

    @Override // defpackage.qw
    public final void f(hd hdVar) {
        hdVar.getClass();
        this.q.add(hdVar);
    }

    @Override // defpackage.cu
    public final void g(rk rkVar) {
        rkVar.getClass();
        r6 r6Var = this.h;
        ((CopyOnWriteArrayList) r6Var.d).add(rkVar);
        ((Runnable) r6Var.c).run();
    }

    @Override // defpackage.ln
    public final zd getDefaultViewModelCreationExtras() {
        ev evVar = new ev(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = evVar.a;
        if (application != null) {
            linkedHashMap.put(vg.n, getApplication());
        }
        linkedHashMap.put(j8.e, this);
        linkedHashMap.put(j8.f, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(j8.g, extras);
        }
        return evVar;
    }

    @Override // defpackage.nq
    public final iq getLifecycle() {
        return this.f;
    }

    @Override // defpackage.mw
    public final lw getOnBackPressedDispatcher() {
        return (lw) this.x.a();
    }

    @Override // defpackage.x10
    public final v10 getSavedStateRegistry() {
        return this.i.b;
    }

    @Override // defpackage.r90
    public final q90 getViewModelStore() {
        if (getApplication() == null) {
            o8.t("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.j == null) {
            vb vbVar = (vb) getLastNonConfigurationInstance();
            if (vbVar != null) {
                this.j = vbVar.a;
            }
            if (this.j == null) {
                this.j = new q90();
            }
        }
        q90 q90Var = this.j;
        q90Var.getClass();
        return q90Var;
    }

    @Override // defpackage.tw
    public final void h(hd hdVar) {
        hdVar.getClass();
        this.o.add(hdVar);
    }

    @Override // defpackage.j2
    public final i2 i() {
        return this.m;
    }

    @Override // defpackage.tw
    public final void j(hd hdVar) {
        hdVar.getClass();
        this.o.remove(hdVar);
    }

    @Override // defpackage.rw
    public final void k(hd hdVar) {
        hdVar.getClass();
        this.r.remove(hdVar);
    }

    @Override // defpackage.qw
    public final void l(hd hdVar) {
        hdVar.getClass();
        this.q.remove(hdVar);
    }

    public final void n(ow owVar) {
        nd ndVar = this.g;
        ndVar.getClass();
        ac acVar = ndVar.b;
        if (acVar != null) {
            owVar.a(acVar);
        }
        ndVar.a.add(owVar);
    }

    public final void o() {
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
        ((qf) this.w.a()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((hd) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.zb, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.i.b(bundle);
        nd ndVar = this.g;
        ndVar.getClass();
        ndVar.b = this;
        Iterator it = ndVar.a.iterator();
        while (it.hasNext()) {
            ((ow) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = l00.g;
        j00.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.h.d).iterator();
        while (it.hasNext()) {
            ((rk) it.next()).a.j(menu, menuInflater);
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
            Iterator it = ((CopyOnWriteArrayList) this.h.d).iterator();
            while (it.hasNext()) {
                if (((rk) it.next()).a.o(menuItem)) {
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
                ((hd) it.next()).accept(new dv(z));
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
            ((hd) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.h.d).iterator();
        while (it.hasNext()) {
            ((rk) it.next()).a.p(menu);
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
                ((hd) it.next()).accept(new gx(z));
            }
        } catch (Throwable th) {
            this.v = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        vg vgVar;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        int i2 = 29;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            vgVar = new vg(i2);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            vgVar = new vg(i2);
        } else {
            vgVar = new vg(i2);
        }
        Iterator it = this.s.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((hd) it.next()).accept(vgVar);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.h.d).iterator();
        while (it.hasNext()) {
            ((rk) it.next()).a.s(menu);
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
        vb vbVar;
        q90 q90Var = this.j;
        if (q90Var == null && (vbVar = (vb) getLastNonConfigurationInstance()) != null) {
            q90Var = vbVar.a;
        }
        if (q90Var == null) {
            return null;
        }
        vb vbVar2 = new vb();
        vbVar2.a = q90Var;
        return vbVar2;
    }

    @Override // defpackage.zb, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        a aVar = this.f;
        if (aVar != null) {
            aVar.d("setCurrentState");
            aVar.f(hq.h);
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
            ((hd) it.next()).accept(Integer.valueOf(i));
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
            if (vw.Q()) {
                vw.h("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ul ulVar = (ul) this.l.a();
            synchronized (ulVar.a) {
                try {
                    ulVar.b = true;
                    ArrayList arrayList = ulVar.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((vl) obj).a();
                    }
                    ulVar.c.clear();
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
        o();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        wb wbVar = this.k;
        wbVar.getClass();
        if (!wbVar.h) {
            wbVar.h = true;
            decorView.getViewTreeObserver().addOnDrawListener(wbVar);
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
            ((hd) it.next()).accept(new dv(z));
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
            ((hd) it.next()).accept(new gx(z));
        }
    }
}
