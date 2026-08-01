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
import androidx.fragment.app.b;
import com.trembin.nirefon.betfury.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class yd extends xd implements tm0, ws, sb0 {
    public final ag g = new ag();
    public final s6 h;
    public final i5 i;
    public sm0 j;
    public final ud k;
    public final wg0 l;
    public final AtomicInteger m;
    public final wd n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public final CopyOnWriteArrayList s;
    public final CopyOnWriteArrayList t;
    public final CopyOnWriteArrayList u;
    public boolean v;
    public boolean w;
    public final wg0 x;
    public final wg0 y;

    public yd() {
        b bVar = (b) this;
        int i = 1;
        this.h = new s6(new nd(bVar, i));
        rb0 rb0Var = new rb0(this, new h2(9, this));
        i5 i5Var = new i5(rb0Var);
        this.i = i5Var;
        this.k = new ud(bVar);
        this.l = new wg0(new od(bVar, i));
        this.m = new AtomicInteger();
        this.n = new wd(bVar);
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = new CopyOnWriteArrayList();
        this.t = new CopyOnWriteArrayList();
        this.u = new CopyOnWriteArrayList();
        this.x = new wg0(new od(bVar, 2));
        nx nxVar = this.f;
        if (nxVar == null) {
            s9.u("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        int i2 = 0;
        nxVar.a(new qd(i2, bVar));
        this.f.a(new qd(i, bVar));
        this.f.a(new u70(i, bVar));
        rb0Var.a();
        bi.x(this);
        ((i5) i5Var.h).N("android:support:activity-result", new rd(i2, bVar));
        g(new sd(bVar, i2));
        this.y = new wg0(new od(bVar, 4));
    }

    public static void f(b bVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!mv.c(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!mv.c(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.sb0
    public final i5 a() {
        return (i5) this.i.h;
    }

    @Override // defpackage.ws
    public final a30 c() {
        a30 a30Var = new a30(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = a30Var.a;
        if (application != null) {
            linkedHashMap.put(qm0.k, getApplication());
        }
        linkedHashMap.put(bi.k, this);
        linkedHashMap.put(bi.l, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(bi.m, extras);
        }
        return a30Var;
    }

    @Override // defpackage.tm0
    public final sm0 d() {
        if (getApplication() == null) {
            s9.u("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.j == null) {
            td tdVar = (td) getLastNonConfigurationInstance();
            if (tdVar != null) {
                this.j = tdVar.a;
            }
            if (this.j == null) {
                this.j = new sm0();
            }
        }
        sm0 sm0Var = this.j;
        sm0Var.getClass();
        return sm0Var;
    }

    @Override // defpackage.lx
    public final nx e() {
        return this.f;
    }

    public final void g(z40 z40Var) {
        ag agVar = this.g;
        agVar.getClass();
        yd ydVar = agVar.b;
        if (ydVar != null) {
            z40Var.a(ydVar);
        }
        agVar.a.add(z40Var);
    }

    public final y40 h() {
        return (y40) this.y.getValue();
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
        if (this.n.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((dk) this.x.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.o.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((uf) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.xd, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.i.L(bundle);
        ag agVar = this.g;
        agVar.getClass();
        agVar.b = this;
        Iterator it = agVar.a.iterator();
        while (it.hasNext()) {
            ((z40) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = i90.g;
        g90.b(this);
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
        Iterator it = ((CopyOnWriteArrayList) this.h.d).iterator();
        while (it.hasNext()) {
            ((eq) it.next()).a.j();
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
                if (((eq) it.next()).a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.v = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.v = false;
            Iterator it = this.r.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((uf) it.next()).accept(new z20(z));
            }
        } catch (Throwable th) {
            this.v = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.q.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((uf) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.h.d).iterator();
        while (it.hasNext()) {
            ((eq) it.next()).a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.w = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.w = false;
            Iterator it = this.s.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((uf) it.next()).accept(new o50(z));
            }
        } catch (Throwable th) {
            this.w = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        xy xyVar;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        int i2 = 4;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            xyVar = new xy(i2);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            xyVar = new xy(i2);
        } else {
            xyVar = new xy(i2);
        }
        Iterator it = this.t.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((uf) it.next()).accept(xyVar);
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
            ((eq) it.next()).a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.n.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        td tdVar;
        sm0 sm0Var = this.j;
        if (sm0Var == null && (tdVar = (td) getLastNonConfigurationInstance()) != null) {
            sm0Var = tdVar.a;
        }
        if (sm0Var == null) {
            return null;
        }
        td tdVar2 = new td();
        tdVar2.a = sm0Var;
        return tdVar2;
    }

    @Override // defpackage.xd, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        nx nxVar = this.f;
        if (nxVar != null) {
            gx gxVar = gx.CREATED;
            gxVar.getClass();
            nxVar.c("setCurrentState");
            nxVar.e(gxVar);
        }
        super.onSaveInstanceState(bundle);
        this.i.M(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.p.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((uf) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.u.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (zb0.j()) {
                zb0.b("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            hr hrVar = (hr) this.l.getValue();
            synchronized (hrVar.a) {
                try {
                    hrVar.b = true;
                    ArrayList arrayList = hrVar.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((ir) obj).a();
                    }
                    hrVar.c.clear();
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
        ud udVar = this.k;
        udVar.getClass();
        if (!udVar.h) {
            udVar.h = true;
            decorView.getViewTreeObserver().addOnDrawListener(udVar);
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
        if (this.v) {
            return;
        }
        Iterator it = this.r.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((uf) it.next()).accept(new z20(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.w) {
            return;
        }
        Iterator it = this.s.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((uf) it.next()).accept(new o50(z));
        }
    }
}
