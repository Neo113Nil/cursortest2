package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.feathherdashh.dashgame.MainActivity;
import com.feathherdashh.dashgame.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class wj extends Activity implements e61, vg0 {
    public final xg0 d = new xg0(this, true);
    public final bn e;
    public final s40 g;
    public final xg0 h;
    public final c51 i;
    public mj0 j;
    public f61 k;
    public kr0 l;
    public final vj m;
    public final e30 n;
    public final rj o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public final CopyOnWriteArrayList s;
    public final CopyOnWriteArrayList t;
    public boolean u;
    public boolean v;

    public wj() {
        bn bnVar = new bn();
        this.e = bnVar;
        MainActivity mainActivity = (MainActivity) this;
        int i = 2;
        this.g = new s40(new e4(i, mainActivity));
        xg0 xg0Var = new xg0(this, true);
        this.h = xg0Var;
        d61 d61Var = new d61(this, new i6(8, this));
        c51 c51Var = new c51(d61Var, 2);
        this.i = c51Var;
        this.l = null;
        vj vjVar = new vj(mainActivity);
        this.m = vjVar;
        int i2 = 0;
        this.n = new e30(vjVar, new nj(mainActivity, i2));
        new AtomicInteger();
        this.o = new rj(mainActivity);
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = new CopyOnWriteArrayList();
        this.t = new CopyOnWriteArrayList();
        this.u = false;
        this.v = false;
        xg0Var.a(new sj(mainActivity, i2));
        xg0Var.a(new sj(mainActivity, 1));
        xg0Var.a(new sj(mainActivity, i));
        d61Var.a();
        og0 og0Var = xg0Var.c;
        if (og0Var != og0.e && og0Var != og0.g) {
            dd0.e("Failed requirement.");
            throw null;
        }
        if (((c51) c51Var.g).e() == null) {
            z51 z51Var = new z51((c51) c51Var.g, mainActivity);
            ((c51) c51Var.g).k("androidx.lifecycle.internal.SavedStateHandlesProvider", z51Var);
            xg0Var.a(new r11(3, z51Var));
        }
        ((c51) c51Var.g).k("android:support:activity-result", new oj(i2, mainActivity));
        pj pjVar = new pj(mainActivity);
        if (bnVar.b != null) {
            pjVar.a();
        }
        bnVar.a.add(pjVar);
    }

    @Override // defpackage.e61
    public final c51 a() {
        return (c51) this.i.g;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        this.m.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public final bn0 c() {
        bn0 bn0Var = new bn0(ao.b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = bn0Var.a;
        if (application != null) {
            linkedHashMap.put(vn1.f, getApplication());
        }
        linkedHashMap.put(uq1.l, this);
        linkedHashMap.put(uq1.m, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(uq1.n, getIntent().getExtras());
        }
        return bn0Var;
    }

    public final wn1 d() {
        if (this.k == null) {
            this.k = new f61(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.k;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int i = ln1.a;
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int i = ln1.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public final kr0 e() {
        if (this.l == null) {
            this.l = new kr0(new b4(1, this));
            this.h.a(new r11(1, this));
        }
        return this.l;
    }

    @Override // defpackage.vg0
    public final xg0 f() {
        return this.h;
    }

    public final mj0 g() {
        if (getApplication() == null) {
            dd0.j("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.j == null) {
            uj ujVar = (uj) getLastNonConfigurationInstance();
            if (ujVar != null) {
                this.j = ujVar.a;
            }
            if (this.j == null) {
                this.j = new mj0(1);
            }
        }
        return this.j;
    }

    public final void h() {
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
    }

    public final void i(Bundle bundle) {
        super.onCreate(bundle);
        int i = t21.d;
        r21.b(this);
    }

    public final void j(Bundle bundle) {
        bundle.getClass();
        og0 og0Var = og0.g;
        xg0 xg0Var = this.d;
        xg0Var.getClass();
        xg0Var.c("setCurrentState");
        xg0Var.e(og0Var);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.o.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        e().a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((i20) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.i.h(bundle);
        bn bnVar = this.e;
        bnVar.getClass();
        bnVar.b = this;
        Iterator it = bnVar.a.iterator();
        while (it.hasNext()) {
            ((pj) it.next()).a();
        }
        i(bundle);
        int i = t21.d;
        r21.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.g.e).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        af.c();
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.g.e).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                af.c();
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.u = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.u = false;
            Iterator it = this.s.iterator();
            while (it.hasNext()) {
                i20 i20Var = (i20) it.next();
                configuration.getClass();
                i20Var.a(new a60(23));
            }
        } catch (Throwable th) {
            this.u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((i20) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.g.e).iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            it.next().getClass();
            af.c();
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.v = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.v = false;
            Iterator it = this.t.iterator();
            while (it.hasNext()) {
                i20 i20Var = (i20) it.next();
                configuration.getClass();
                i20Var.a(new a60(25));
            }
        } catch (Throwable th) {
            this.v = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.g.e).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        af.c();
        return false;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.o.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        uj ujVar;
        mj0 mj0Var = this.j;
        if (mj0Var == null && (ujVar = (uj) getLastNonConfigurationInstance()) != null) {
            mj0Var = ujVar.a;
        }
        if (mj0Var == null) {
            return null;
        }
        uj ujVar2 = new uj();
        ujVar2.a = mj0Var;
        return ujVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        xg0 xg0Var = this.h;
        if (xg0Var != null) {
            og0 og0Var = og0.g;
            xg0Var.c("setCurrentState");
            xg0Var.e(og0Var);
        }
        j(bundle);
        this.i.j(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((i20) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (yi1.a()) {
                ca0.e("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            e30 e30Var = this.n;
            synchronized (e30Var.b) {
                try {
                    e30Var.a = true;
                    ArrayList arrayList = (ArrayList) e30Var.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Function0) obj).invoke();
                    }
                    ((ArrayList) e30Var.c).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        h();
        this.m.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h();
        this.m.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        this.m.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.u) {
            return;
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((i20) it.next()).a(new a60(23));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.v) {
            return;
        }
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((i20) it.next()).a(new a60(25));
        }
    }
}
