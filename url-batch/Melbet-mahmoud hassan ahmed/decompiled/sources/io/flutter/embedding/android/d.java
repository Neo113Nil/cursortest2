package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.e;
import io.flutter.embedding.android.e;
import java.util.List;

/* loaded from: classes.dex */
public class d extends Activity implements e.c, androidx.lifecycle.i {

    /* renamed from: h, reason: collision with root package name */
    public static final int f17072h = u5.h.d(61938);

    /* renamed from: f, reason: collision with root package name */
    protected e f17073f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.lifecycle.j f17074g = new androidx.lifecycle.j(this);

    private void D() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }

    private void E() {
        if (G() == f.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    private View F() {
        return this.f17073f.r(null, null, null, f17072h, x() == t.surface);
    }

    private Drawable J() {
        try {
            Bundle I = I();
            int i7 = I != null ? I.getInt("io.flutter.embedding.android.SplashScreenDrawable") : 0;
            if (i7 != 0) {
                return l.a.a(getResources(), i7, getTheme());
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (Resources.NotFoundException e7) {
            z4.b.b("FlutterActivity", "Splash screen not found. Ensure the drawable exists and that it's valid.");
            throw e7;
        }
    }

    private boolean K() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private void L() {
        e eVar = this.f17073f;
        if (eVar != null) {
            eVar.F();
            this.f17073f = null;
        }
    }

    private boolean M(String str) {
        StringBuilder sb;
        String str2;
        e eVar = this.f17073f;
        if (eVar == null) {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after release.";
        } else {
            if (eVar.l()) {
                return true;
            }
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after detach.";
        }
        sb.append(str2);
        z4.b.f("FlutterActivity", sb.toString());
        return false;
    }

    private void N() {
        try {
            Bundle I = I();
            if (I != null) {
                int i7 = I.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i7 != -1) {
                    setTheme(i7);
                }
            } else {
                z4.b.e("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            z4.b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public w A() {
        return G() == f.opaque ? w.opaque : w.transparent;
    }

    @Override // io.flutter.embedding.android.e.c
    public void B(i iVar) {
    }

    @Override // io.flutter.embedding.android.e.c
    public void C(io.flutter.embedding.engine.a aVar) {
        if (this.f17073f.m()) {
            return;
        }
        j5.a.a(aVar);
    }

    protected f G() {
        return getIntent().hasExtra("background_mode") ? f.valueOf(getIntent().getStringExtra("background_mode")) : f.opaque;
    }

    protected io.flutter.embedding.engine.a H() {
        return this.f17073f.k();
    }

    protected Bundle I() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    @Override // io.flutter.embedding.android.e.c, androidx.lifecycle.i
    public androidx.lifecycle.e a() {
        return this.f17074g;
    }

    @Override // io.flutter.plugin.platform.b.d
    public boolean b() {
        return false;
    }

    @Override // io.flutter.embedding.android.e.c
    public void c() {
    }

    @Override // io.flutter.embedding.android.e.c
    public Activity d() {
        return this;
    }

    @Override // io.flutter.embedding.android.e.c
    public void e() {
        z4.b.f("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + H() + " evicted by another attaching activity");
        e eVar = this.f17073f;
        if (eVar != null) {
            eVar.s();
            this.f17073f.t();
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public void f() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public String g() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle I = I();
            if (I != null) {
                return I.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public Context getContext() {
        return this;
    }

    @Override // io.flutter.embedding.android.e.c
    public List<String> j() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean k() {
        return true;
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean l() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (n() != null || this.f17073f.m()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean m() {
        return true;
    }

    @Override // io.flutter.embedding.android.e.c
    public String n() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean o() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : n() == null;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        if (M("onActivityResult")) {
            this.f17073f.o(i7, i8, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (M("onBackPressed")) {
            this.f17073f.q();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        N();
        super.onCreate(bundle);
        e eVar = new e(this);
        this.f17073f = eVar;
        eVar.p(this);
        this.f17073f.y(bundle);
        this.f17074g.h(e.b.ON_CREATE);
        E();
        setContentView(F());
        D();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (M("onDestroy")) {
            this.f17073f.s();
            this.f17073f.t();
        }
        L();
        this.f17074g.h(e.b.ON_DESTROY);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (M("onNewIntent")) {
            this.f17073f.u(intent);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (M("onPause")) {
            this.f17073f.v();
        }
        this.f17074g.h(e.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (M("onPostResume")) {
            this.f17073f.w();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (M("onRequestPermissionsResult")) {
            this.f17073f.x(i7, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f17074g.h(e.b.ON_RESUME);
        if (M("onResume")) {
            this.f17073f.z();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (M("onSaveInstanceState")) {
            this.f17073f.A(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f17074g.h(e.b.ON_START);
        if (M("onStart")) {
            this.f17073f.B();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (M("onStop")) {
            this.f17073f.C();
        }
        this.f17074g.h(e.b.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        if (M("onTrimMemory")) {
            this.f17073f.D(i7);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (M("onUserLeaveHint")) {
            this.f17073f.E();
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public String p() {
        try {
            Bundle I = I();
            String string = I != null ? I.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public void q(io.flutter.embedding.engine.a aVar) {
    }

    @Override // io.flutter.embedding.android.e.c
    public String r() {
        try {
            Bundle I = I();
            if (I != null) {
                return I.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public io.flutter.plugin.platform.b s(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new io.flutter.plugin.platform.b(d(), aVar.n(), this);
    }

    @Override // io.flutter.embedding.android.e.c
    public void t(h hVar) {
    }

    @Override // io.flutter.embedding.android.e.c
    public String u() {
        String dataString;
        if (K() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean v() {
        try {
            Bundle I = I();
            if (I != null) {
                return I.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public io.flutter.embedding.engine.e w() {
        return io.flutter.embedding.engine.e.a(getIntent());
    }

    @Override // io.flutter.embedding.android.e.c
    public t x() {
        return G() == f.opaque ? t.surface : t.texture;
    }

    @Override // io.flutter.embedding.android.e.c
    public v y() {
        Drawable J = J();
        if (J != null) {
            return new b(J);
        }
        return null;
    }

    public io.flutter.embedding.engine.a z(Context context) {
        return null;
    }
}
