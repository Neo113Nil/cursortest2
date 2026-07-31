package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.C1427a3;
import com.ironsource.C1500l;
import com.ironsource.C1507m;
import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.ch;
import com.ironsource.fr;
import com.ironsource.hh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mh;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.of;
import com.ironsource.ow;
import com.ironsource.rv;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.to;
import com.ironsource.u5;
import com.ironsource.wj;

/* loaded from: classes2.dex */
public class ControllerActivity extends Activity implements to, rv {

    /* renamed from: n, reason: collision with root package name */
    private static final String f19058n = "ControllerActivity";

    /* renamed from: o, reason: collision with root package name */
    private static final int f19059o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static String f19060p = "removeWebViewContainerView | mContainer is null";

    /* renamed from: q, reason: collision with root package name */
    private static String f19061q = "removeWebViewContainerView | view is null";

    /* renamed from: a, reason: collision with root package name */
    private String f19062a;

    /* renamed from: b, reason: collision with root package name */
    private v f19063b;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f19064c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f19065d;

    /* renamed from: e, reason: collision with root package name */
    private of f19066e;

    /* renamed from: g, reason: collision with root package name */
    private String f19068g;

    /* renamed from: k, reason: collision with root package name */
    private C1427a3 f19072k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f19073l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19074m;
    public int currentRequestedRotation = -1;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19067f = false;

    /* renamed from: h, reason: collision with root package name */
    private Handler f19069h = new Handler();

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f19070i = new a();

    /* renamed from: j, reason: collision with root package name */
    final RelativeLayout.LayoutParams f19071j = new RelativeLayout.LayoutParams(-1, -1);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f19067f));
        }
    }

    class b implements View.OnSystemUiVisibilityChangeListener {
        b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i4) {
            if ((i4 & 4098) == 0) {
                ControllerActivity.this.f19069h.removeCallbacks(ControllerActivity.this.f19070i);
                ControllerActivity.this.f19069h.postDelayed(ControllerActivity.this.f19070i, 500L);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().addFlags(UserVerificationMethods.USER_VERIFY_PATTERN);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().clearFlags(UserVerificationMethods.USER_VERIFY_PATTERN);
        }
    }

    private View a(ViewGroup viewGroup) {
        return d() ? viewGroup.findViewById(1) : ch.a().a(this.f19062a).getPresentingView();
    }

    private boolean d() {
        return this.f19062a == null;
    }

    private void e() {
        runOnUiThread(new c());
    }

    private void f() {
        ViewGroup viewGroup;
        try {
            if (this.f19064c == null) {
                throw new Exception(f19060p);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f19065d.getParent();
            View a4 = a(viewGroup2);
            if (a4 == null) {
                throw new Exception(f19061q);
            }
            if (isFinishing() && (viewGroup = (ViewGroup) a4.getParent()) != null) {
                viewGroup.removeView(a4);
            }
            viewGroup2.removeView(this.f19065d);
        } catch (Exception e4) {
            o9.d().a(e4);
            mh.a(fr.f16291s, new hh().a(cc.f15708A, e4.getMessage()).a());
            Logger.i(f19058n, "removeWebViewContainerView fail " + e4.getMessage());
        }
    }

    private void g() {
        int L3 = this.f19066e.L(this);
        String str = f19058n;
        Logger.i(str, "setInitiateLandscapeOrientation");
        if (L3 == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(0);
            return;
        }
        if (L3 == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (L3 == 3) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (L3 != 1) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void h() {
        int L3 = this.f19066e.L(this);
        String str = f19058n;
        Logger.i(str, "setInitiatePortraitOrientation");
        if (L3 == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(1);
            return;
        }
        if (L3 == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (L3 == 1) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (L3 != 3) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // com.ironsource.to
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i(f19058n, "onBackPressed");
        if (u5.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.to
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f19066e = nm.S().f();
        try {
            new C1507m(this).a();
            new C1500l(this).a();
            v vVar = (v) wj.b((Context) this).a().j();
            this.f19063b = vVar;
            vVar.s().setId(1);
            this.f19063b.a((to) this);
            this.f19063b.a((rv) this);
            Intent intent = getIntent();
            this.f19068g = intent.getStringExtra(b9.h.f15490m);
            this.f19067f = intent.getBooleanExtra(b9.h.f15508v, false);
            this.f19062a = intent.getStringExtra("adViewId");
            this.f19073l = false;
            this.f19074m = intent.getBooleanExtra(b9.h.f15517z0, false);
            if (this.f19067f) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
                runOnUiThread(this.f19070i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f19064c = relativeLayout;
            setContentView(relativeLayout, this.f19071j);
            this.f19065d = a(this.f19062a);
            if (this.f19064c.findViewById(1) == null && this.f19065d.getParent() != null) {
                finish();
            }
            c();
            this.f19064c.addView(this.f19065d, this.f19071j);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        String str = f19058n;
        Logger.i(str, "onDestroy");
        f();
        if (this.f19073l) {
            return;
        }
        Logger.i(str, "onDestroy | destroyedFromBackground");
        b();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && this.f19063b.y()) {
            this.f19063b.x();
            return true;
        }
        if (this.f19067f && (i4 == 25 || i4 == 24)) {
            this.f19069h.removeCallbacks(this.f19070i);
            this.f19069h.postDelayed(this.f19070i, 500L);
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // com.ironsource.to
    public void onOrientationChanged(String str, int i4) {
        a(str, i4);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        Logger.i(f19058n, "onPause, isFinishing=" + isFinishing());
        t.a(this);
        v vVar = this.f19063b;
        if (vVar != null) {
            vVar.a((Context) this);
            if (!this.f19074m) {
                this.f19063b.B();
            }
            this.f19063b.a(false, b9.h.f15466Z);
            this.f19063b.g(this.f19068g, b9.h.f15505t0);
        }
        if (isFinishing()) {
            this.f19073l = true;
            b();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        Logger.i(f19058n, b9.h.f15507u0);
        v vVar = this.f19063b;
        if (vVar != null) {
            vVar.b(this);
            if (!this.f19074m) {
                this.f19063b.F();
            }
            this.f19063b.a(true, b9.h.f15466Z);
            this.f19063b.g(this.f19068g, b9.h.f15507u0);
        }
        t.b(this);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Logger.i(f19058n, "onStart");
        v vVar = this.f19063b;
        if (vVar != null) {
            vVar.g(this.f19068g, "onStart");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        Logger.i(f19058n, "onStop");
        v vVar = this.f19063b;
        if (vVar != null) {
            vVar.g(this.f19068g, "onStop");
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(f19058n, "onUserLeaveHint");
        v vVar = this.f19063b;
        if (vVar != null) {
            vVar.g(this.f19068g, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.rv
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.rv
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.rv
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.rv
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.rv
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        if (this.f19067f && z4) {
            runOnUiThread(this.f19070i);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i4) {
        if (this.currentRequestedRotation != i4) {
            Logger.i(f19058n, "Rotation: Req = " + i4 + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i4;
            super.setRequestedOrientation(i4);
        }
    }

    public void toggleKeepScreen(boolean z4) {
        if (z4) {
            e();
        } else {
            a();
        }
    }

    private FrameLayout a(String str) {
        return !b(str) ? this.f19063b.s() : ow.a(getApplicationContext(), ch.a().a(str).getPresentingView());
    }

    private void b() {
        String str = f19058n;
        Logger.i(str, "clearWebviewController");
        v vVar = this.f19063b;
        if (vVar == null) {
            Logger.i(str, "clearWebviewController, null");
            return;
        }
        vVar.a(v.u.Gone);
        this.f19063b.C();
        this.f19063b.D();
        this.f19063b.g(this.f19068g, "onDestroy");
    }

    private void c() {
        Intent intent = getIntent();
        a(intent.getStringExtra(b9.h.f15429A), intent.getIntExtra(b9.h.f15431B, 0));
    }

    private void a() {
        runOnUiThread(new d());
    }

    private boolean b(String str) {
        return (TextUtils.isEmpty(str) || str.equals(Integer.toString(1))) ? false : true;
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void a(String str, int i4) {
        int i5;
        if (str != null) {
            if (b9.h.f15433C.equalsIgnoreCase(str)) {
                g();
                return;
            }
            if (b9.h.f15435D.equalsIgnoreCase(str)) {
                h();
                return;
            }
            if (b9.h.f15441G.equalsIgnoreCase(str)) {
                if (!this.f19066e.E(this)) {
                    return;
                } else {
                    i5 = 1;
                }
            } else if (getRequestedOrientation() != -1) {
                return;
            } else {
                i5 = 4;
            }
            setRequestedOrientation(i5);
        }
    }
}
