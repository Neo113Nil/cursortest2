package android.support.v7.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.e;
import android.support.v7.view.f;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;

/* compiled from: AppCompatDelegateImplV14.java */
/* loaded from: classes.dex */
class g extends AppCompatDelegateImplV9 {
    private int t;
    private boolean u;
    private boolean v;
    private b w;

    @Override // android.support.v7.app.AppCompatDelegateImplV9
    View a(View view, String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    g(Context context, Window window, c cVar) {
        super(context, window, cVar);
        this.t = -100;
        this.v = true;
    }

    @Override // android.support.v7.app.AppCompatDelegateImplV9, android.support.v7.app.d
    public void a(Bundle bundle) {
        super.a(bundle);
        if (bundle == null || this.t != -100) {
            return;
        }
        this.t = bundle.getInt("appcompat:local_night_mode", -100);
    }

    @Override // android.support.v7.app.e
    Window.Callback a(Window.Callback callback) {
        return new a(callback);
    }

    @Override // android.support.v7.app.e
    public boolean p() {
        return this.v;
    }

    @Override // android.support.v7.app.e, android.support.v7.app.d
    public boolean j() {
        int x = x();
        int d2 = d(x);
        boolean h = d2 != -1 ? h(d2) : false;
        if (x == 0) {
            y();
            this.w.c();
        }
        this.u = true;
        return h;
    }

    @Override // android.support.v7.app.e, android.support.v7.app.d
    public void c() {
        super.c();
        j();
    }

    @Override // android.support.v7.app.AppCompatDelegateImplV9, android.support.v7.app.e, android.support.v7.app.d
    public void d() {
        super.d();
        if (this.w != null) {
            this.w.d();
        }
    }

    int d(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        y();
        return this.w.a();
    }

    private int x() {
        return this.t != -100 ? this.t : k();
    }

    @Override // android.support.v7.app.e, android.support.v7.app.d
    public void c(Bundle bundle) {
        super.c(bundle);
        if (this.t != -100) {
            bundle.putInt("appcompat:local_night_mode", this.t);
        }
    }

    @Override // android.support.v7.app.AppCompatDelegateImplV9, android.support.v7.app.e, android.support.v7.app.d
    public void g() {
        super.g();
        if (this.w != null) {
            this.w.d();
        }
    }

    private boolean h(int i) {
        Resources resources = this.f1634a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (z()) {
            ((Activity) this.f1634a).recreate();
            return true;
        }
        Configuration configuration2 = new Configuration(configuration);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        resources.updateConfiguration(configuration2, displayMetrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        j.a(resources);
        return true;
    }

    private void y() {
        if (this.w == null) {
            this.w = new b(m.a(this.f1634a));
        }
    }

    private boolean z() {
        if (!this.u || !(this.f1634a instanceof Activity)) {
            return false;
        }
        try {
            return (this.f1634a.getPackageManager().getActivityInfo(new ComponentName(this.f1634a, this.f1634a.getClass()), 0).configChanges & 512) == 0;
        } catch (PackageManager.NameNotFoundException e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImplV14.java */
    class a extends e.b {
        a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (g.this.p()) {
                return a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        final ActionMode a(ActionMode.Callback callback) {
            f.a aVar = new f.a(g.this.f1634a, callback);
            android.support.v7.view.b a2 = g.this.a(aVar);
            if (a2 != null) {
                return aVar.b(a2);
            }
            return null;
        }
    }

    /* compiled from: AppCompatDelegateImplV14.java */
    final class b {

        /* renamed from: b, reason: collision with root package name */
        private m f1644b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f1645c;

        /* renamed from: d, reason: collision with root package name */
        private BroadcastReceiver f1646d;
        private IntentFilter e;

        b(m mVar) {
            this.f1644b = mVar;
            this.f1645c = mVar.a();
        }

        final int a() {
            this.f1645c = this.f1644b.a();
            return this.f1645c ? 2 : 1;
        }

        final void b() {
            boolean a2 = this.f1644b.a();
            if (a2 != this.f1645c) {
                this.f1645c = a2;
                g.this.j();
            }
        }

        final void c() {
            d();
            if (this.f1646d == null) {
                this.f1646d = new BroadcastReceiver() { // from class: android.support.v7.app.g.b.1
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        b.this.b();
                    }
                };
            }
            if (this.e == null) {
                this.e = new IntentFilter();
                this.e.addAction("android.intent.action.TIME_SET");
                this.e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.e.addAction("android.intent.action.TIME_TICK");
            }
            g.this.f1634a.registerReceiver(this.f1646d, this.e);
        }

        final void d() {
            if (this.f1646d != null) {
                g.this.f1634a.unregisterReceiver(this.f1646d);
                this.f1646d = null;
            }
        }
    }
}
