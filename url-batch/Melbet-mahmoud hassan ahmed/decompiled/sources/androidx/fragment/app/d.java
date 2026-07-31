package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.e;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import j.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class d extends ComponentActivity {

    /* renamed from: o, reason: collision with root package name */
    boolean f671o;

    /* renamed from: p, reason: collision with root package name */
    boolean f672p;

    /* renamed from: r, reason: collision with root package name */
    boolean f674r;

    /* renamed from: s, reason: collision with root package name */
    boolean f675s;

    /* renamed from: t, reason: collision with root package name */
    int f676t;

    /* renamed from: u, reason: collision with root package name */
    h.f<String> f677u;

    /* renamed from: m, reason: collision with root package name */
    final f f669m = f.b(new a());

    /* renamed from: n, reason: collision with root package name */
    final androidx.lifecycle.j f670n = new androidx.lifecycle.j(this);

    /* renamed from: q, reason: collision with root package name */
    boolean f673q = true;

    class a extends h<d> implements x, androidx.activity.c {
        public a() {
            super(d.this);
        }

        @Override // androidx.lifecycle.i
        public androidx.lifecycle.e a() {
            return d.this.f670n;
        }

        @Override // androidx.lifecycle.x
        public w c() {
            return d.this.c();
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        public View d(int i7) {
            return d.this.findViewById(i7);
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        public boolean e() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher h() {
            return d.this.h();
        }

        @Override // androidx.fragment.app.h
        public void k(Fragment fragment) {
            d.this.m(fragment);
        }

        @Override // androidx.fragment.app.h
        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.h
        public LayoutInflater n() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // androidx.fragment.app.h
        public int o() {
            Window window = d.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.h
        public boolean p() {
            return d.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.h
        public boolean q(Fragment fragment) {
            return !d.this.isFinishing();
        }

        @Override // androidx.fragment.app.h
        public void r() {
            d.this.p();
        }

        @Override // androidx.fragment.app.h
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public d m() {
            return d.this;
        }
    }

    static void f(int i7) {
        if ((i7 & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void k() {
        while (l(j(), e.c.CREATED)) {
        }
    }

    private static boolean l(i iVar, e.c cVar) {
        boolean z6 = false;
        for (Fragment fragment : iVar.d()) {
            if (fragment != null) {
                if (fragment.a().b().b(e.c.STARTED)) {
                    fragment.X.o(cVar);
                    z6 = true;
                }
                if (fragment.u() != null) {
                    z6 |= l(fragment.n(), cVar);
                }
            }
        }
        return z6;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f671o);
        printWriter.print(" mResumed=");
        printWriter.print(this.f672p);
        printWriter.print(" mStopped=");
        printWriter.print(this.f673q);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f669m.u().b(str, fileDescriptor, printWriter, strArr);
    }

    final View g(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f669m.w(view, str, context, attributeSet);
    }

    public i j() {
        return this.f669m.u();
    }

    public void m(Fragment fragment) {
    }

    @Deprecated
    protected boolean n(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void o() {
        this.f670n.h(e.b.ON_RESUME);
        this.f669m.p();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        this.f669m.v();
        int i9 = i7 >> 16;
        if (i9 == 0) {
            a.InterfaceC0080a f7 = j.a.f();
            if (f7 == null || !f7.a(this, i7, i8, intent)) {
                super.onActivityResult(i7, i8, intent);
                return;
            }
            return;
        }
        int i10 = i9 - 1;
        String f8 = this.f677u.f(i10);
        this.f677u.j(i10);
        if (f8 == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment t6 = this.f669m.t(f8);
        if (t6 != null) {
            t6.S(i7 & 65535, i8, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + f8);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f669m.v();
        this.f669m.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, j.c, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f669m.a(null);
        if (bundle != null) {
            this.f669m.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f676t = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f677u = new h.f<>(intArray.length);
                    for (int i7 = 0; i7 < intArray.length; i7++) {
                        this.f677u.i(intArray[i7], stringArray[i7]);
                    }
                }
            }
        }
        if (this.f677u == null) {
            this.f677u = new h.f<>();
            this.f676t = 0;
        }
        super.onCreate(bundle);
        this.f670n.h(e.b.ON_CREATE);
        this.f669m.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, Menu menu) {
        return i7 == 0 ? super.onCreatePanelMenu(i7, menu) | this.f669m.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i7, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View g7 = g(view, str, context, attributeSet);
        return g7 == null ? super.onCreateView(view, str, context, attributeSet) : g7;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View g7 = g(null, str, context, attributeSet);
        return g7 == null ? super.onCreateView(str, context, attributeSet) : g7;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f669m.h();
        this.f670n.h(e.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f669m.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 0) {
            return this.f669m.k(menuItem);
        }
        if (i7 != 6) {
            return false;
        }
        return this.f669m.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z6) {
        this.f669m.j(z6);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f669m.v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        if (i7 == 0) {
            this.f669m.l(menu);
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f672p = false;
        this.f669m.m();
        this.f670n.h(e.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z6) {
        this.f669m.n(z6);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        o();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i7, View view, Menu menu) {
        return i7 == 0 ? n(view, menu) | this.f669m.o(menu) : super.onPreparePanel(i7, view, menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.f669m.v();
        int i8 = (i7 >> 16) & 65535;
        if (i8 != 0) {
            int i9 = i8 - 1;
            String f7 = this.f677u.f(i9);
            this.f677u.j(i9);
            if (f7 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t6 = this.f669m.t(f7);
            if (t6 != null) {
                t6.r0(i7 & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + f7);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f672p = true;
        this.f669m.v();
        this.f669m.s();
    }

    @Override // androidx.activity.ComponentActivity, j.c, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        k();
        this.f670n.h(e.b.ON_STOP);
        Parcelable y6 = this.f669m.y();
        if (y6 != null) {
            bundle.putParcelable("android:support:fragments", y6);
        }
        if (this.f677u.k() > 0) {
            bundle.putInt("android:support:next_request_index", this.f676t);
            int[] iArr = new int[this.f677u.k()];
            String[] strArr = new String[this.f677u.k()];
            for (int i7 = 0; i7 < this.f677u.k(); i7++) {
                iArr[i7] = this.f677u.h(i7);
                strArr[i7] = this.f677u.l(i7);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f673q = false;
        if (!this.f671o) {
            this.f671o = true;
            this.f669m.c();
        }
        this.f669m.v();
        this.f669m.s();
        this.f670n.h(e.b.ON_START);
        this.f669m.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f669m.v();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f673q = true;
        k();
        this.f669m.r();
        this.f670n.h(e.b.ON_STOP);
    }

    @Deprecated
    public void p() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i7) {
        if (!this.f675s && i7 != -1) {
            f(i7);
        }
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i7, Bundle bundle) {
        if (!this.f675s && i7 != -1) {
            f(i7);
        }
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10) {
        if (!this.f674r && i7 != -1) {
            f(i7);
        }
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        if (!this.f674r && i7 != -1) {
            f(i7);
        }
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }
}
