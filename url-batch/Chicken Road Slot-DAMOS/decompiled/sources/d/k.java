package d;

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
import androidx.lifecycle.a1;
import androidx.lifecycle.h0;
import androidx.lifecycle.k0;
import androidx.lifecycle.o0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.appsflyer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k extends e3.a implements a1, androidx.lifecycle.k, f5.e, e0, s4.c {
    public final CopyOnWriteArrayList A;
    public final CopyOnWriteArrayList B;
    public final CopyOnWriteArrayList C;
    public boolean D;
    public boolean E;
    public final hd.q F;
    public final hd.q G;
    public final hd.q H;

    /* renamed from: e, reason: collision with root package name */
    public final z6.j f3243e;

    /* renamed from: i, reason: collision with root package name */
    public final l.d f3244i;

    /* renamed from: r, reason: collision with root package name */
    public final c6.s f3245r;

    /* renamed from: s, reason: collision with root package name */
    public z0 f3246s;

    /* renamed from: t, reason: collision with root package name */
    public final i f3247t;

    /* renamed from: u, reason: collision with root package name */
    public final hd.q f3248u;

    /* renamed from: v, reason: collision with root package name */
    public final j f3249v;

    /* renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArrayList f3250w;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f3251x;

    /* renamed from: y, reason: collision with root package name */
    public final CopyOnWriteArrayList f3252y;

    /* renamed from: z, reason: collision with root package name */
    public final CopyOnWriteArrayList f3253z;

    public k() {
        z6.j jVar = new z6.j();
        jVar.f10890b = new CopyOnWriteArraySet();
        this.f3243e = jVar;
        this.f3244i = new l.d(new b(this, 1));
        c6.s sVar = new c6.s(new h5.b(this, new a1.b(10, this)));
        this.f3245r = sVar;
        this.f3247t = new i(this);
        this.f3248u = hd.h.b(new c(this, 1));
        new AtomicInteger();
        this.f3249v = new j();
        this.f3250w = new CopyOnWriteArrayList();
        this.f3251x = new CopyOnWriteArrayList();
        this.f3252y = new CopyOnWriteArrayList();
        this.f3253z = new CopyOnWriteArrayList();
        this.A = new CopyOnWriteArrayList();
        this.B = new CopyOnWriteArrayList();
        this.C = new CopyOnWriteArrayList();
        this.F = hd.h.b(new c(this, 2));
        androidx.lifecycle.w wVar = this.f3790d;
        if (wVar == null) {
            i0.l("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i3 = 0;
        wVar.a(new androidx.lifecycle.s(this) { // from class: d.e

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ k f3225e;

            {
                this.f3225e = this;
            }

            @Override // androidx.lifecycle.s
            public final void d(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
                Window window;
                View peekDecorView;
                switch (i3) {
                    case 0:
                        k kVar = this.f3225e;
                        if (oVar == androidx.lifecycle.o.ON_STOP && (window = kVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        k kVar2 = this.f3225e;
                        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
                            kVar2.f3243e.f10889a = null;
                            if (!kVar2.isChangingConfigurations()) {
                                kVar2.f().a();
                            }
                            i iVar = kVar2.f3247t;
                            k kVar3 = iVar.f3236r;
                            kVar3.getWindow().getDecorView().removeCallbacks(iVar);
                            kVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f3790d.a(new androidx.lifecycle.s(this) { // from class: d.e

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ k f3225e;

            {
                this.f3225e = this;
            }

            @Override // androidx.lifecycle.s
            public final void d(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
                Window window;
                View peekDecorView;
                switch (i10) {
                    case 0:
                        k kVar = this.f3225e;
                        if (oVar == androidx.lifecycle.o.ON_STOP && (window = kVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        k kVar2 = this.f3225e;
                        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
                            kVar2.f3243e.f10889a = null;
                            if (!kVar2.isChangingConfigurations()) {
                                kVar2.f().a();
                            }
                            i iVar = kVar2.f3247t;
                            k kVar3 = iVar.f3236r;
                            kVar3.getWindow().getDecorView().removeCallbacks(iVar);
                            kVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(iVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.f3790d.a(new f5.b(this, i10));
        sVar.f();
        o0.c(this);
        ((c6.l) sVar.f1869e).i("android:support:activity-result", new f(0, this));
        g gVar = new g(this);
        k kVar = (k) jVar.f10889a;
        if (kVar != null) {
            gVar.a(kVar);
        }
        ((CopyOnWriteArraySet) jVar.f10890b).add(gVar);
        this.G = hd.h.b(new c(this, 3));
        this.H = hd.h.b(new c(this, 4));
    }

    public static void h(k kVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e2) {
            if (!Intrinsics.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e2;
            }
        } catch (NullPointerException e9) {
            if (!Intrinsics.a(e9.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e9;
            }
        }
    }

    @Override // d.e0
    public final c0 a() {
        return (c0) this.H.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f3247t.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // f5.e
    public final c6.l b() {
        return (c6.l) this.f3245r.f1869e;
    }

    @Override // s4.c
    public final c6.i c() {
        return a().a().f3209c;
    }

    @Override // androidx.lifecycle.k
    public final w0 d() {
        return (w0) this.G.getValue();
    }

    @Override // androidx.lifecycle.k
    public final k4.b e() {
        k4.e eVar = new k4.e(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = eVar.f5386a;
        if (application != null) {
            linkedHashMap.put(v0.f733d, getApplication());
        }
        linkedHashMap.put(o0.f703a, this);
        linkedHashMap.put(o0.f704b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(o0.f705c, extras);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.a1
    public final z0 f() {
        if (getApplication() == null) {
            i0.l("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.f3246s == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.f3246s = hVar.f3232a;
            }
            if (this.f3246s == null) {
                this.f3246s = new z0();
            }
        }
        z0 z0Var = this.f3246s;
        z0Var.getClass();
        return z0Var;
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.w g() {
        return this.f3790d;
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
    public final void onActivityResult(int i3, int i10, Intent intent) {
        if (this.f3249v.a(i3, i10, intent)) {
            return;
        }
        super.onActivityResult(i3, i10, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((s4.a) this.F.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.f3250w.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((n3.a) it.next()).accept(configuration);
        }
    }

    @Override // e3.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f3245r.g(bundle);
        z6.j jVar = this.f3243e;
        jVar.getClass();
        jVar.f10889a = this;
        Iterator it = ((CopyOnWriteArraySet) jVar.f10890b).iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i3 = k0.f695e;
        h0.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        menu.getClass();
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f3244i.f5643e).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((f4.h) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3244i.f5643e).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((f4.h) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        configuration.getClass();
        this.D = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.D = false;
            Iterator it = this.f3253z.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((n3.a) it.next()).accept(new e3.b(z10));
            }
        } catch (Throwable th) {
            this.D = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.f3252y.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((n3.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i3, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.f3244i.f5643e).iterator();
        if (it.hasNext()) {
            ((f4.h) it.next()).getClass();
            throw null;
        }
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        configuration.getClass();
        this.E = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.E = false;
            Iterator it = this.A.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((n3.a) it.next()).accept(new e3.u(z10));
            }
        } catch (Throwable th) {
            this.E = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        u8.d dVar;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            dVar = new u8.d(20);
        } else if (i3 >= 31) {
            pictureInPictureUiState.isStashed();
            dVar = new u8.d(20);
        } else {
            dVar = new u8.d(20);
        }
        Iterator it = this.B.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((n3.a) it.next()).accept(dVar);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        menu.getClass();
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f3244i.f5643e).iterator();
        if (!it.hasNext()) {
            return true;
        }
        ((f4.h) it.next()).getClass();
        throw null;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.f3249v.a(i3, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        z0 z0Var = this.f3246s;
        if (z0Var == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            z0Var = hVar.f3232a;
        }
        if (z0Var == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f3232a = z0Var;
        return hVar2;
    }

    @Override // e3.a, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        androidx.lifecycle.w wVar = this.f3790d;
        if (wVar != null) {
            androidx.lifecycle.p pVar = androidx.lifecycle.p.f709i;
            wVar.c("setCurrentState");
            wVar.e(pVar);
        }
        super.onSaveInstanceState(bundle);
        this.f3245r.h(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.f3251x.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((n3.a) it.next()).accept(Integer.valueOf(i3));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.C.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (i7.a.V()) {
                i7.a.n("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            w wVar = (w) this.f3248u.getValue();
            synchronized (wVar.f3267b) {
                try {
                    wVar.f3268c = true;
                    ArrayList arrayList = wVar.f3269d;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((Function0) obj).invoke();
                    }
                    wVar.f3269d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i3) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f3247t.a(decorView);
        super.setContentView(i3);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3) {
        intent.getClass();
        super.startActivityForResult(intent, i3);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i10, int i11, int i12) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i3, intent, i10, i11, i12);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i3, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i3, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i10, int i11, int i12, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i3, intent, i10, i11, i12, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f3247t.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f3247t.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        if (this.D) {
            return;
        }
        Iterator it = this.f3253z.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((n3.a) it.next()).accept(new e3.b(z10));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10) {
        if (this.E) {
            return;
        }
        Iterator it = this.A.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((n3.a) it.next()).accept(new e3.u(z10));
        }
    }
}
