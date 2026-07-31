package io.flutter.embedding.android;

import a5.a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
class e implements io.flutter.embedding.android.c<Activity> {

    /* renamed from: a, reason: collision with root package name */
    private c f17075a;

    /* renamed from: b, reason: collision with root package name */
    private io.flutter.embedding.engine.a f17076b;

    /* renamed from: c, reason: collision with root package name */
    k f17077c;

    /* renamed from: d, reason: collision with root package name */
    private io.flutter.plugin.platform.b f17078d;

    /* renamed from: e, reason: collision with root package name */
    ViewTreeObserver.OnPreDrawListener f17079e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17080f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17081g;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17083i;

    /* renamed from: j, reason: collision with root package name */
    private final k5.b f17084j = new a();

    /* renamed from: h, reason: collision with root package name */
    private boolean f17082h = false;

    class a implements k5.b {
        a() {
        }

        @Override // k5.b
        public void c() {
            e.this.f17075a.c();
            e.this.f17081g = false;
        }

        @Override // k5.b
        public void f() {
            e.this.f17075a.f();
            e.this.f17081g = true;
            e.this.f17082h = true;
        }
    }

    class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k f17086f;

        b(k kVar) {
            this.f17086f = kVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (e.this.f17081g && e.this.f17079e != null) {
                this.f17086f.getViewTreeObserver().removeOnPreDrawListener(this);
                e.this.f17079e = null;
            }
            return e.this.f17081g;
        }
    }

    interface c extends b.d {
        w A();

        void B(i iVar);

        void C(io.flutter.embedding.engine.a aVar);

        androidx.lifecycle.e a();

        void c();

        Activity d();

        void e();

        void f();

        String g();

        Context getContext();

        List<String> j();

        boolean k();

        boolean l();

        boolean m();

        String n();

        boolean o();

        String p();

        void q(io.flutter.embedding.engine.a aVar);

        String r();

        io.flutter.plugin.platform.b s(Activity activity, io.flutter.embedding.engine.a aVar);

        void t(h hVar);

        String u();

        boolean v();

        io.flutter.embedding.engine.e w();

        t x();

        v y();

        io.flutter.embedding.engine.a z(Context context);
    }

    e(c cVar) {
        this.f17075a = cVar;
    }

    private void g(k kVar) {
        if (this.f17075a.x() != t.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.f17079e != null) {
            kVar.getViewTreeObserver().removeOnPreDrawListener(this.f17079e);
        }
        this.f17079e = new b(kVar);
        kVar.getViewTreeObserver().addOnPreDrawListener(this.f17079e);
    }

    private void h() {
        String str;
        if (this.f17075a.n() == null && !this.f17076b.i().m()) {
            String g7 = this.f17075a.g();
            if (g7 == null && (g7 = n(this.f17075a.d().getIntent())) == null) {
                g7 = "/";
            }
            String r7 = this.f17075a.r();
            if (("Executing Dart entrypoint: " + this.f17075a.p() + ", library uri: " + r7) == null) {
                str = "\"\"";
            } else {
                str = r7 + ", and sending initial route: " + g7;
            }
            z4.b.e("FlutterActivityAndFragmentDelegate", str);
            this.f17076b.m().c(g7);
            String u6 = this.f17075a.u();
            if (u6 == null || u6.isEmpty()) {
                u6 = z4.a.e().c().f();
            }
            this.f17076b.i().k(r7 == null ? new a.b(u6, this.f17075a.p()) : new a.b(u6, r7, this.f17075a.p()), this.f17075a.j());
        }
    }

    private void i() {
        if (this.f17075a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String n(Intent intent) {
        Uri data;
        String path;
        if (!this.f17075a.v() || (data = intent.getData()) == null || (path = data.getPath()) == null || path.isEmpty()) {
            return null;
        }
        if (data.getQuery() != null && !data.getQuery().isEmpty()) {
            path = path + "?" + data.getQuery();
        }
        if (data.getFragment() == null || data.getFragment().isEmpty()) {
            return path;
        }
        return path + "#" + data.getFragment();
    }

    void A(Bundle bundle) {
        z4.b.e("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        i();
        if (this.f17075a.o()) {
            bundle.putByteArray("framework", this.f17076b.r().h());
        }
        if (this.f17075a.k()) {
            Bundle bundle2 = new Bundle();
            this.f17076b.h().e(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    void B() {
        z4.b.e("FlutterActivityAndFragmentDelegate", "onStart()");
        i();
        h();
        this.f17077c.setVisibility(0);
    }

    void C() {
        z4.b.e("FlutterActivityAndFragmentDelegate", "onStop()");
        i();
        if (this.f17075a.m()) {
            this.f17076b.j().c();
        }
        this.f17077c.setVisibility(8);
    }

    void D(int i7) {
        i();
        io.flutter.embedding.engine.a aVar = this.f17076b;
        if (aVar != null) {
            if (this.f17082h && i7 >= 10) {
                aVar.i().n();
                this.f17076b.u().a();
            }
            this.f17076b.q().n(i7);
        }
    }

    void E() {
        i();
        if (this.f17076b == null) {
            z4.b.f("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        } else {
            z4.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f17076b.h().f();
        }
    }

    void F() {
        this.f17075a = null;
        this.f17076b = null;
        this.f17077c = null;
        this.f17078d = null;
    }

    void G() {
        z4.b.e("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String n7 = this.f17075a.n();
        if (n7 != null) {
            io.flutter.embedding.engine.a a7 = io.flutter.embedding.engine.b.b().a(n7);
            this.f17076b = a7;
            this.f17080f = true;
            if (a7 != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + n7 + "'");
        }
        c cVar = this.f17075a;
        io.flutter.embedding.engine.a z6 = cVar.z(cVar.getContext());
        this.f17076b = z6;
        if (z6 != null) {
            this.f17080f = true;
            return;
        }
        z4.b.e("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        this.f17076b = new io.flutter.embedding.engine.a(this.f17075a.getContext(), this.f17075a.w().b(), false, this.f17075a.o());
        this.f17080f = false;
    }

    void H() {
        io.flutter.plugin.platform.b bVar = this.f17078d;
        if (bVar != null) {
            bVar.A();
        }
    }

    @Override // io.flutter.embedding.android.c
    public void e() {
        if (!this.f17075a.l()) {
            this.f17075a.e();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f17075a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    @Override // io.flutter.embedding.android.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Activity f() {
        Activity d7 = this.f17075a.d();
        if (d7 != null) {
            return d7;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    io.flutter.embedding.engine.a k() {
        return this.f17076b;
    }

    boolean l() {
        return this.f17083i;
    }

    boolean m() {
        return this.f17080f;
    }

    void o(int i7, int i8, Intent intent) {
        i();
        if (this.f17076b == null) {
            z4.b.f("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        z4.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i7 + "\nresultCode: " + i8 + "\ndata: " + intent);
        this.f17076b.h().a(i7, i8, intent);
    }

    void p(Context context) {
        i();
        if (this.f17076b == null) {
            G();
        }
        if (this.f17075a.k()) {
            z4.b.e("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f17076b.h().h(this, this.f17075a.a());
        }
        c cVar = this.f17075a;
        this.f17078d = cVar.s(cVar.d(), this.f17076b);
        this.f17075a.C(this.f17076b);
        this.f17083i = true;
    }

    void q() {
        i();
        if (this.f17076b == null) {
            z4.b.f("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        } else {
            z4.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f17076b.m().a();
        }
    }

    View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i7, boolean z6) {
        k kVar;
        z4.b.e("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        i();
        if (this.f17075a.x() == t.surface) {
            h hVar = new h(this.f17075a.getContext(), this.f17075a.A() == w.transparent);
            this.f17075a.t(hVar);
            kVar = new k(this.f17075a.getContext(), hVar);
        } else {
            i iVar = new i(this.f17075a.getContext());
            iVar.setOpaque(this.f17075a.A() == w.opaque);
            this.f17075a.B(iVar);
            kVar = new k(this.f17075a.getContext(), iVar);
        }
        this.f17077c = kVar;
        this.f17077c.l(this.f17084j);
        z4.b.e("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.f17077c.n(this.f17076b);
        this.f17077c.setId(i7);
        v y6 = this.f17075a.y();
        if (y6 == null) {
            if (z6) {
                g(this.f17077c);
            }
            return this.f17077c;
        }
        z4.b.f("FlutterActivityAndFragmentDelegate", "A splash screen was provided to Flutter, but this is deprecated. See flutter.dev/go/android-splash-migration for migration steps.");
        FlutterSplashView flutterSplashView = new FlutterSplashView(this.f17075a.getContext());
        flutterSplashView.setId(u5.h.d(486947586));
        flutterSplashView.g(this.f17077c, y6);
        return flutterSplashView;
    }

    void s() {
        z4.b.e("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        i();
        if (this.f17079e != null) {
            this.f17077c.getViewTreeObserver().removeOnPreDrawListener(this.f17079e);
            this.f17079e = null;
        }
        this.f17077c.s();
        this.f17077c.z(this.f17084j);
    }

    void t() {
        z4.b.e("FlutterActivityAndFragmentDelegate", "onDetach()");
        i();
        this.f17075a.q(this.f17076b);
        if (this.f17075a.k()) {
            z4.b.e("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.f17075a.d().isChangingConfigurations()) {
                this.f17076b.h().i();
            } else {
                this.f17076b.h().j();
            }
        }
        io.flutter.plugin.platform.b bVar = this.f17078d;
        if (bVar != null) {
            bVar.o();
            this.f17078d = null;
        }
        if (this.f17075a.m()) {
            this.f17076b.j().a();
        }
        if (this.f17075a.l()) {
            this.f17076b.f();
            if (this.f17075a.n() != null) {
                io.flutter.embedding.engine.b.b().d(this.f17075a.n());
            }
            this.f17076b = null;
        }
        this.f17083i = false;
    }

    void u(Intent intent) {
        i();
        if (this.f17076b == null) {
            z4.b.f("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        z4.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRoute message.");
        this.f17076b.h().c(intent);
        String n7 = n(intent);
        if (n7 == null || n7.isEmpty()) {
            return;
        }
        this.f17076b.m().b(n7);
    }

    void v() {
        z4.b.e("FlutterActivityAndFragmentDelegate", "onPause()");
        i();
        if (this.f17075a.m()) {
            this.f17076b.j().b();
        }
    }

    void w() {
        z4.b.e("FlutterActivityAndFragmentDelegate", "onPostResume()");
        i();
        if (this.f17076b != null) {
            H();
        } else {
            z4.b.f("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    void x(int i7, String[] strArr, int[] iArr) {
        i();
        if (this.f17076b == null) {
            z4.b.f("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        z4.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i7 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.f17076b.h().b(i7, strArr, iArr);
    }

    void y(Bundle bundle) {
        Bundle bundle2;
        z4.b.e("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        i();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f17075a.o()) {
            this.f17076b.r().j(bArr);
        }
        if (this.f17075a.k()) {
            this.f17076b.h().d(bundle2);
        }
    }

    void z() {
        z4.b.e("FlutterActivityAndFragmentDelegate", "onResume()");
        i();
        if (this.f17075a.m()) {
            this.f17076b.j().d();
        }
    }
}
