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
import androidx.lifecycle.a;
import com.derinko.gbini.n1casino.R;
import defpackage.aq;
import defpackage.c3;
import defpackage.i90;
import defpackage.sb;
import defpackage.up;
import defpackage.wb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class wb extends vb implements j90, tm, g10 {
    public static final /* synthetic */ int y = 0;
    public final jd g = new jd();
    public final a6 h;
    public final f10 i;
    public i90 j;
    public final tb k;
    public final x40 l;
    public final ub m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public final CopyOnWriteArrayList s;
    public final CopyOnWriteArrayList t;
    public boolean u;
    public boolean v;
    public final x40 w;
    public final x40 x;

    public wb() {
        final c3 c3Var = (c3) this;
        int i = 1;
        this.h = new a6(new mb(c3Var, i));
        f10 f10Var = new f10(this);
        this.i = f10Var;
        this.k = new tb(c3Var);
        this.l = new x40(new nb(c3Var, i));
        new AtomicInteger();
        this.m = new ub();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = new CopyOnWriteArrayList();
        this.t = new CopyOnWriteArrayList();
        this.w = new x40(new nb(c3Var, 2));
        a aVar = this.f;
        if (aVar == null) {
            t8.t("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        int i2 = 0;
        aVar.a(new pb(i2, c3Var));
        this.f.a(new pb(i, c3Var));
        this.f.a(new yp() { // from class: androidx.activity.ComponentActivity$4
            @Override // defpackage.yp
            public final void b(aq aqVar, up upVar) {
                int i3 = wb.y;
                c3 c3Var2 = c3.this;
                if (c3Var2.j == null) {
                    sb sbVar = (sb) c3Var2.getLastNonConfigurationInstance();
                    if (sbVar != null) {
                        c3Var2.j = sbVar.a;
                    }
                    if (c3Var2.j == null) {
                        c3Var2.j = new i90();
                    }
                }
                c3Var2.f.f(this);
            }
        });
        f10Var.a();
        jw.q(this);
        f10Var.b.e("android:support:activity-result", new qb(i2, c3Var));
        g(new rb(c3Var, i2));
        this.x = new x40(new nb(c3Var, 3));
    }

    public static void f(c3 c3Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!zo.b(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!zo.b(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.g10
    public final i3 a() {
        return this.i.b;
    }

    @Override // defpackage.tm
    public final pu c() {
        pu puVar = new pu(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) puVar.a;
        if (getApplication() != null) {
            linkedHashMap.put(dh.n, getApplication());
        }
        linkedHashMap.put(jw.k, this);
        linkedHashMap.put(jw.l, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(jw.m, extras);
        }
        return puVar;
    }

    @Override // defpackage.j90
    public final i90 d() {
        if (getApplication() == null) {
            t8.t("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.j == null) {
            sb sbVar = (sb) getLastNonConfigurationInstance();
            if (sbVar != null) {
                this.j = sbVar.a;
            }
            if (this.j == null) {
                this.j = new i90();
            }
        }
        i90 i90Var = this.j;
        i90Var.getClass();
        return i90Var;
    }

    @Override // defpackage.aq
    public final a e() {
        return this.f;
    }

    public final void g(fw fwVar) {
        jd jdVar = this.g;
        jdVar.getClass();
        wb wbVar = jdVar.b;
        if (wbVar != null) {
            fwVar.a(wbVar);
        }
        jdVar.a.add(fwVar);
    }

    public final ew h() {
        return (ew) this.x.a();
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
        ((yf) this.w.a()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((dd) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.vb, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.i.b(bundle);
        jd jdVar = this.g;
        jdVar.getClass();
        jdVar.b = this;
        Iterator it = jdVar.a.iterator();
        while (it.hasNext()) {
            ((fw) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = wz.g;
        uz.b(this);
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
            ((vk) it.next()).a.j();
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
                if (((vk) it.next()).a.o()) {
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
                ((dd) it.next()).accept(new ou(z));
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
            ((dd) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.h.d).iterator();
        while (it.hasNext()) {
            ((vk) it.next()).a.p();
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
                ((dd) it.next()).accept(new tw(z));
            }
        } catch (Throwable th) {
            this.v = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        dh dhVar;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        int i2 = 29;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            dhVar = new dh(i2);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            dhVar = new dh(i2);
        } else {
            dhVar = new dh(i2);
        }
        Iterator it = this.s.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((dd) it.next()).accept(dhVar);
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
            ((vk) it.next()).a.s();
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
        sb sbVar;
        i90 i90Var = this.j;
        if (i90Var == null && (sbVar = (sb) getLastNonConfigurationInstance()) != null) {
            i90Var = sbVar.a;
        }
        if (i90Var == null) {
            return null;
        }
        sb sbVar2 = new sb();
        sbVar2.a = i90Var;
        return sbVar2;
    }

    @Override // defpackage.vb, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        a aVar = this.f;
        if (aVar != null) {
            aVar.c("setCurrentState");
            aVar.e(vp.h);
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
            ((dd) it.next()).accept(Integer.valueOf(i));
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
            if (o8.N()) {
                o8.d("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ll llVar = (ll) this.l.a();
            synchronized (llVar.a) {
                try {
                    llVar.b = true;
                    ArrayList arrayList = llVar.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((ml) obj).a();
                    }
                    llVar.c.clear();
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
        tb tbVar = this.k;
        tbVar.getClass();
        if (!tbVar.h) {
            tbVar.h = true;
            decorView.getViewTreeObserver().addOnDrawListener(tbVar);
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
            ((dd) it.next()).accept(new ou(z));
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
            ((dd) it.next()).accept(new tw(z));
        }
    }
}
