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
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ng extends cp implements aer, agl, aeh, ame, nw, oi, up, uq, ul, um, xk {
    private agk a;
    private final koi b;
    private final AtomicInteger c;
    private final CopyOnWriteArrayList d;
    private final CopyOnWriteArrayList e;
    public final oh g;
    public final CopyOnWriteArrayList h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;
    public final CopyOnWriteArrayList k;
    public final CopyOnWriteArrayList l;
    public final nf m;
    private boolean o;
    private boolean p;
    private final koi q;
    private final koi r;
    private final koi s;
    private final brr t;
    public final ny f = new ny();
    public final bvw n = new bvw(new Runnable() { // from class: my
        @Override // java.lang.Runnable
        public final void run() {
            ng.this.invalidateOptionsMenu();
        }
    });

    public ng() {
        brr j = yi.j(this);
        this.t = j;
        this.m = new nf(this);
        final int i = 1;
        this.b = new kop(new kri(this) { // from class: mz
            public final /* synthetic */ ng a;

            {
                this.a = this;
            }

            @Override // defpackage.kri
            public final Object a() {
                if (i != 0) {
                    return new nq(this.a.m);
                }
                ahh ahhVar = new ahh();
                this.a.f().e().b(ahhVar);
                return ahhVar;
            }
        });
        this.c = new AtomicInteger();
        this.g = new oh(this);
        this.h = new CopyOnWriteArrayList();
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
        final int i2 = 0;
        this.q = new kop(new kri(this) { // from class: mz
            public final /* synthetic */ ng a;

            {
                this.a = this;
            }

            @Override // defpackage.kri
            public final Object a() {
                if (i2 != 0) {
                    return new nq(this.a.m);
                }
                ahh ahhVar = new ahh();
                this.a.f().e().b(ahhVar);
                return ahhVar;
            }
        });
        if (L() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        L().a(new nd(this, i, null));
        L().a(new na(this, i2));
        L().a(new nd(this, 0));
        j.h();
        afx.c(this);
        aE().b("android:support:activity-result", new bn(this, 3));
        s(new dh(this, 2));
        this.r = new kop(new nb(this, i));
        this.s = new kop(new nb(this, i2));
    }

    public static final void v(ng ngVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!ksp.b(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!ksp.b(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    public agh N() {
        return (agh) this.r.a();
    }

    @Override // defpackage.agl
    public final agk O() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        t();
        agk agkVar = this.a;
        agkVar.getClass();
        return agkVar;
    }

    public ago P() {
        agp agpVar = new agp();
        if (getApplication() != null) {
            agpVar.b(agg.b, getApplication());
        }
        agpVar.b(afx.a, this);
        agpVar.b(afx.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            agpVar.b(afx.c, extras);
        }
        return agpVar;
    }

    @Override // defpackage.ame
    public final boe aE() {
        return (boe) this.t.a;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        u();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.oi
    public final oh c() {
        throw null;
    }

    @Override // defpackage.nw
    public final oe f() {
        return (oe) this.s.a();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.g.f(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ((ahh) this.q.a()).b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.h.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wo) it.next()).a(configuration);
        }
    }

    @Override // defpackage.cp, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.t.i(bundle);
        this.f.b(this);
        super.onCreate(bundle);
        int i = afp.b;
        afn.c(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        this.n.k(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.n.m(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.o = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.o = false;
            Iterator it = this.k.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((wo) it.next()).a(new ggw(z, null));
            }
        } catch (Throwable th) {
            this.o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.j.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wo) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.n.b).iterator();
        while (it.hasNext()) {
            ((by) ((kee) it.next()).a).v(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.p = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.p = false;
            Iterator it = this.l.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((wo) it.next()).a(new ggw(z, null));
            }
        } catch (Throwable th) {
            this.p = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        ox oxVar;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        if (Build.VERSION.SDK_INT >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            oxVar = new ox(null);
        } else if (Build.VERSION.SDK_INT >= 31) {
            pictureInPictureUiState.isStashed();
            oxVar = new ox(null);
        } else {
            oxVar = new ox(null);
        }
        Iterator it = this.d.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wo) it.next()).a(oxVar);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.n.l(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.g.f(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        ne neVar;
        agk agkVar = this.a;
        if (agkVar == null && (neVar = (ne) getLastNonConfigurationInstance()) != null) {
            agkVar = neVar.a;
        }
        if (agkVar == null) {
            return null;
        }
        ne neVar2 = new ne();
        neVar2.a = agkVar;
        return neVar2;
    }

    @Override // defpackage.cp, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (L() instanceof ael) {
            ael L = L();
            L.getClass();
            L.d(aek.c);
        }
        super.onSaveInstanceState(bundle);
        this.t.j(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.i.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wo) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.e.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final nq p() {
        return (nq) this.b.a();
    }

    public final oc q(ok okVar, ob obVar) {
        oh ohVar = this.g;
        ohVar.getClass();
        return ohVar.b("activity_rq#" + this.c.getAndIncrement(), this, okVar, obVar);
    }

    public final void r(wo woVar) {
        woVar.getClass();
        this.h.add(woVar);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (yk.g()) {
                yk.f("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            nq p = p();
            synchronized (p.a) {
                p.b = true;
                List list = p.c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((kri) it.next()).a();
                }
                list.clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void s(nz nzVar) {
        ny nyVar = this.f;
        if (nyVar.b != null) {
            nzVar.a();
        }
        nyVar.a.add(nzVar);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        u();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void t() {
        if (this.a == null) {
            ne neVar = (ne) getLastNonConfigurationInstance();
            if (neVar != null) {
                this.a = neVar.a;
            }
            if (this.a == null) {
                this.a = new agk();
            }
        }
    }

    public final void u() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        yl.d(decorView, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        ym.j(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        yi.i(decorView3, this);
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

    public final void w(oe oeVar) {
        L().a(new nv(oeVar, this, 1));
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
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
        u();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        u();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.m.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.o) {
            return;
        }
        Iterator it = this.k.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wo) it.next()).a(new ggw(z, null));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.p) {
            return;
        }
        Iterator it = this.l.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wo) it.next()).a(new ggw(z, null));
        }
    }
}
