package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.sdk.controller.c;
import com.ironsource.sdk.data.AdUnitsState;
import com.ironsource.sdk.data.e;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;

/* loaded from: classes2.dex */
public class ControllerActivity extends Activity implements g, com.ironsource.sdk.e.f {

    /* renamed from: c, reason: collision with root package name */
    private static final String f7010c = "ControllerActivity";

    /* renamed from: d, reason: collision with root package name */
    private c f7013d;
    private RelativeLayout e;
    private FrameLayout f;
    private String k;
    private AdUnitsState l;

    /* renamed from: a, reason: collision with root package name */
    public int f7011a = -1;
    private boolean g = false;
    private Handler h = new Handler();
    private final Runnable i = new Runnable() { // from class: com.ironsource.sdk.controller.ControllerActivity.1
        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(com.ironsource.sdk.g.f.a(ControllerActivity.this.g));
        }
    };

    /* renamed from: b, reason: collision with root package name */
    final RelativeLayout.LayoutParams f7012b = new RelativeLayout.LayoutParams(-1, -1);
    private boolean j = false;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            com.ironsource.sdk.g.e.a(f7010c, "onCreate");
            j();
            k();
            this.f7013d = com.ironsource.sdk.a.a.c(this).a();
            this.f7013d.setId(1);
            this.f7013d.setOnWebViewControllerChangeListener(this);
            this.f7013d.setVideoEventsListener(this);
            Intent intent = getIntent();
            this.k = intent.getStringExtra("productType");
            this.g = intent.getBooleanExtra("immersive", false);
            if (this.g) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.ironsource.sdk.controller.ControllerActivity.2
                    @Override // android.view.View.OnSystemUiVisibilityChangeListener
                    public void onSystemUiVisibilityChange(int i) {
                        if ((i & 4098) == 0) {
                            ControllerActivity.this.h.removeCallbacks(ControllerActivity.this.i);
                            ControllerActivity.this.h.postDelayed(ControllerActivity.this.i, 500L);
                        }
                    }
                });
                runOnUiThread(this.i);
            }
            if (!TextUtils.isEmpty(this.k) && e.d.OfferWall.toString().equalsIgnoreCase(this.k)) {
                if (bundle != null) {
                    AdUnitsState adUnitsState = (AdUnitsState) bundle.getParcelable("state");
                    if (adUnitsState != null) {
                        this.l = adUnitsState;
                        this.f7013d.a(adUnitsState);
                    }
                    finish();
                } else {
                    this.l = this.f7013d.getSavedState();
                }
            }
            this.e = new RelativeLayout(this);
            setContentView(this.e, this.f7012b);
            this.f = this.f7013d.getLayout();
            if (this.e.findViewById(1) == null && this.f.getParent() != null) {
                this.j = true;
                finish();
            }
            h();
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    private void h() {
        Intent intent = getIntent();
        b(intent.getStringExtra("orientation_set_flag"), intent.getIntExtra("rotation_set_flag", 0));
    }

    private void b(String str, int i) {
        if (str != null) {
            if (TJAdUnitConstants.String.LANDSCAPE.equalsIgnoreCase(str)) {
                n();
                return;
            }
            if (TJAdUnitConstants.String.PORTRAIT.equalsIgnoreCase(str)) {
                o();
                return;
            }
            if (TapjoyConstants.TJC_NOTIFICATION_DEVICE_PREFIX.equalsIgnoreCase(str)) {
                if (com.ironsource.environment.c.h(this)) {
                    setRequestedOrientation(1);
                }
            } else if (getRequestedOrientation() == -1) {
                setRequestedOrientation(4);
            }
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (TextUtils.isEmpty(this.k) || !e.d.OfferWall.toString().equalsIgnoreCase(this.k)) {
            return;
        }
        this.l.setShouldRestore(true);
        bundle.putParcelable("state", this.l);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        com.ironsource.sdk.g.e.a(f7010c, "onResume");
        this.e.addView(this.f, this.f7012b);
        if (this.f7013d != null) {
            this.f7013d.c(this);
            this.f7013d.i();
            this.f7013d.a(true, "main");
        }
        ((AudioManager) getSystemService("audio")).requestAudioFocus(null, 3, 2);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.ironsource.sdk.g.e.a(f7010c, "onPause");
        ((AudioManager) getSystemService("audio")).abandonAudioFocus(null);
        if (this.f7013d != null) {
            this.f7013d.d(this);
            this.f7013d.h();
            this.f7013d.a(false, "main");
        }
        i();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.ironsource.sdk.g.e.a(f7010c, "onDestroy");
        if (this.j) {
            i();
        }
        if (this.f7013d != null) {
            this.f7013d.setState(c.d.Gone);
            this.f7013d.c();
        }
    }

    private void i() {
        if (this.e != null) {
            ViewGroup viewGroup = (ViewGroup) this.f.getParent();
            if (viewGroup.findViewById(1) != null) {
                viewGroup.removeView(this.f);
            }
        }
    }

    @Override // com.ironsource.sdk.e.f
    public void a() {
        finish();
    }

    @Override // com.ironsource.sdk.e.f
    public void a(String str, int i) {
        b(str, i);
    }

    @Override // com.ironsource.sdk.e.f
    public boolean b() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.ironsource.sdk.g.e.a(f7010c, "onBackPressed");
        if (com.ironsource.sdk.d.a.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        com.ironsource.sdk.g.e.a(f7010c, "onUserLeaveHint");
    }

    private void j() {
        requestWindowFeature(1);
    }

    private void k() {
        getWindow().setFlags(1024, 1024);
    }

    private void l() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.sdk.controller.ControllerActivity.3
            @Override // java.lang.Runnable
            public void run() {
                ControllerActivity.this.getWindow().addFlags(128);
            }
        });
    }

    private void m() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.sdk.controller.ControllerActivity.4
            @Override // java.lang.Runnable
            public void run() {
                ControllerActivity.this.getWindow().clearFlags(128);
            }
        });
    }

    private void n() {
        int c2 = com.ironsource.environment.c.c(this);
        com.ironsource.sdk.g.e.a(f7010c, "setInitiateLandscapeOrientation");
        if (c2 == 0) {
            com.ironsource.sdk.g.e.a(f7010c, "ROTATION_0");
            setRequestedOrientation(0);
            return;
        }
        if (c2 == 2) {
            com.ironsource.sdk.g.e.a(f7010c, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (c2 == 3) {
            com.ironsource.sdk.g.e.a(f7010c, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (c2 == 1) {
            com.ironsource.sdk.g.e.a(f7010c, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        } else {
            com.ironsource.sdk.g.e.a(f7010c, "No Rotation");
        }
    }

    private void o() {
        int c2 = com.ironsource.environment.c.c(this);
        com.ironsource.sdk.g.e.a(f7010c, "setInitiatePortraitOrientation");
        if (c2 == 0) {
            com.ironsource.sdk.g.e.a(f7010c, "ROTATION_0");
            setRequestedOrientation(1);
            return;
        }
        if (c2 == 2) {
            com.ironsource.sdk.g.e.a(f7010c, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (c2 == 1) {
            com.ironsource.sdk.g.e.a(f7010c, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (c2 == 3) {
            com.ironsource.sdk.g.e.a(f7010c, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        } else {
            com.ironsource.sdk.g.e.a(f7010c, "No Rotation");
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f7013d.j()) {
            this.f7013d.k();
            return true;
        }
        if (this.g && (i == 25 || i == 24)) {
            this.h.removeCallbacks(this.i);
            this.h.postDelayed(this.i, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (this.f7011a != i) {
            com.ironsource.sdk.g.e.a(f7010c, "Rotation: Req = " + i + " Curr = " + this.f7011a);
            this.f7011a = i;
            super.setRequestedOrientation(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.g && z) {
            runOnUiThread(this.i);
        }
    }

    @Override // com.ironsource.sdk.controller.g
    public void c() {
        a(true);
    }

    @Override // com.ironsource.sdk.controller.g
    public void d() {
        a(false);
    }

    @Override // com.ironsource.sdk.controller.g
    public void e() {
        a(true);
    }

    @Override // com.ironsource.sdk.controller.g
    public void f() {
        a(false);
    }

    @Override // com.ironsource.sdk.controller.g
    public void g() {
        a(false);
    }

    public void a(boolean z) {
        if (z) {
            l();
        } else {
            m();
        }
    }
}
