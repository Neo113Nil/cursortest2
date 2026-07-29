package com.tapjoy;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.fn;
import com.tapjoy.internal.fr;
import com.tapjoy.internal.go;
import com.tapjoy.internal.ha;

/* loaded from: classes2.dex */
public class TJAdUnitActivity extends Activity implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    private static TJAdUnitActivity f7618b;

    /* renamed from: c, reason: collision with root package name */
    private TJAdUnit f7620c;

    /* renamed from: d, reason: collision with root package name */
    private TJPlacementData f7621d;
    private TJCloseButton g;
    private ProgressBar h;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f7619a = new Handler(Looper.getMainLooper());
    private TJAdUnitSaveStateData e = new TJAdUnitSaveStateData();
    private RelativeLayout f = null;
    private boolean i = false;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        TapjoyLog.d("TJAdUnitActivity", "TJAdUnitActivity onCreate: " + bundle);
        super.onCreate(bundle);
        f7618b = this;
        if (bundle != null) {
            this.e = (TJAdUnitSaveStateData) bundle.getSerializable("ad_unit_bundle");
            if (this.e != null && this.e.isVideoComplete) {
                TapjoyLog.d("TJAdUnitActivity", "finishing TJAdUnitActivity");
                finish();
                return;
            }
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getSerializable(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA) != null) {
            this.f7621d = (TJPlacementData) extras.getSerializable(TJAdUnitConstants.EXTRA_TJ_PLACEMENT_DATA);
            if (this.f7621d.getContentViewId() != null) {
                TapjoyConnectCore.viewWillOpen(this.f7621d.getContentViewId(), 1);
            }
            if (TJPlacementManager.a(this.f7621d.getKey()) != null) {
                this.f7620c = TJPlacementManager.a(this.f7621d.getKey()).getAdUnit();
            } else {
                this.f7620c = new TJAdUnit();
                this.f7620c.setAdContentTracker(new fn(this.f7621d.getPlacementName(), this.f7621d.getPlacementType()));
            }
            if (!this.f7620c.hasCalledLoad()) {
                TapjoyLog.d("TJAdUnitActivity", "No content loaded for ad unit -- loading now");
                this.f7620c.load(this.f7621d, false, this);
            }
            this.f7620c.setAdUnitActivity(this);
            if (Build.VERSION.SDK_INT < 11) {
                setTheme(R.style.Theme);
            } else {
                requestWindowFeature(1);
                getWindow().setFlags(1024, 1024);
                getWindow().setFlags(16777216, 16777216);
            }
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            this.f = new RelativeLayout(this);
            this.f.setLayoutParams(layoutParams);
            this.f.setBackgroundColor(0);
            TJWebView backgroundWebView = this.f7620c.getBackgroundWebView();
            backgroundWebView.setLayoutParams(layoutParams);
            if (backgroundWebView.getParent() != null) {
                ((ViewGroup) backgroundWebView.getParent()).removeView(backgroundWebView);
            }
            TJWebView webView = this.f7620c.getWebView();
            webView.setLayoutParams(layoutParams);
            if (webView.getParent() != null) {
                ((ViewGroup) webView.getParent()).removeView(webView);
            }
            VideoView videoView = this.f7620c.getVideoView();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(13);
            videoView.setLayoutParams(layoutParams2);
            if (videoView.getParent() != null) {
                ((ViewGroup) videoView.getParent()).removeView(videoView);
            }
            this.f.addView(backgroundWebView);
            this.f.addView(videoView);
            this.f.addView(webView);
            this.h = new ProgressBar(this, null, R.attr.progressBarStyleLarge);
            if (this.f7621d.hasProgressSpinner()) {
                setProgressSpinnerVisibility(true);
            } else {
                setProgressSpinnerVisibility(false);
            }
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            this.h.setLayoutParams(layoutParams3);
            this.f.addView(this.h);
            this.g = new TJCloseButton(this);
            this.g.setOnClickListener(this);
            this.f.addView(this.g);
            setContentView(this.f);
            this.f7620c.setVisible(true);
            TJCorePlacement a2 = TJPlacementManager.a(this.f7621d.getKey());
            if (a2 != null) {
                TapjoyLog.i(TJCorePlacement.f7679a, "Content shown for placement " + a2.f7681c.getPlacementName());
                a2.f.a();
                TJPlacement a3 = a2.a("SHOW");
                if (a3 == null || a3.getListener() == null) {
                    return;
                }
                a3.getListener().onContentShow(a3);
                return;
            }
            return;
        }
        TapjoyLog.e("TJAdUnitActivity", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Failed to launch AdUnit Activity"));
        finish();
    }

    public void setCloseButtonVisibility(boolean z) {
        if (z) {
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(4);
        }
    }

    public void setCloseButtonClickable(boolean z) {
        this.g.setClickableRequested(z);
    }

    public void setProgressSpinnerVisibility(boolean z) {
        if (z) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(4);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        handleClose();
    }

    public void handleClose() {
        handleClose(false);
    }

    public void handleClose(boolean z) {
        if (this.f7620c.getCloseRequested()) {
            return;
        }
        TapjoyLog.d("TJAdUnitActivity", TJAdUnitConstants.String.CLOSE_REQUESTED);
        this.f7620c.closeRequested(z);
        this.f7619a.postDelayed(new Runnable() { // from class: com.tapjoy.TJAdUnitActivity.1
            @Override // java.lang.Runnable
            public final void run() {
                if (TJAdUnitActivity.this.f7620c.getCloseRequested()) {
                    TapjoyLog.d("TJAdUnitActivity", "Did not receive callback from content. Closing ad.");
                    TJAdUnitActivity.this.finish();
                }
            }
        }, 1000L);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        TJPlacement a2;
        super.onDestroy();
        f7618b = null;
        TapjoyLog.d("TJAdUnitActivity", "onDestroy");
        if (this.f7620c != null) {
            this.f7620c.destroy();
        }
        if (this.f7621d == null || !this.f7621d.isBaseActivity()) {
            return;
        }
        if (this.f7621d.getContentViewId() != null) {
            TapjoyConnectCore.viewDidClose(this.f7621d.getContentViewId());
        }
        TJCorePlacement a3 = TJPlacementManager.a(this.f7621d.getKey());
        if (a3 == null || (a2 = a3.a("SHOW")) == null || a2.getListener() == null) {
            return;
        }
        TapjoyLog.i(TJCorePlacement.f7679a, "Content dismissed for placement " + a3.f7681c.getPlacementName());
        fr frVar = a3.f.f8134a;
        if (frVar != null) {
            frVar.f8126b.clear();
        }
        if (a2 == null || a2.f7712a == null) {
            return;
        }
        a2.f7712a.onContentDismiss(a2);
    }

    @Override // android.app.Activity
    protected void onResume() {
        TapjoyLog.d("TJAdUnitActivity", "onResume");
        super.onResume();
        if (this.f7620c.isLockedOrientation()) {
            setRequestedOrientation(this.f7620c.getLockedOrientation());
        }
        this.f7620c.resume(this.e);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        TapjoyLog.d("TJAdUnitActivity", "onStart");
        if (ha.a().n) {
            this.i = true;
            go.a(this);
        }
        if (this.f7621d.isBaseActivity()) {
            return;
        }
        setResult(-1, getIntent());
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        TapjoyLog.d("TJAdUnitActivity", "onPause");
        this.f7620c.pause();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TapjoyLog.d("TJAdUnitActivity", "onSaveInstanceState");
        this.e.seekTime = this.f7620c.getVideoSeekTime();
        this.e.isVideoComplete = this.f7620c.isVideoComplete();
        this.e.isVideoMuted = this.f7620c.isMuted();
        bundle.putSerializable("ad_unit_bundle", this.e);
    }

    @Override // android.app.Activity
    protected void onStop() {
        if (this.i) {
            this.i = false;
            go.b(this);
        }
        super.onStop();
        TapjoyLog.d("TJAdUnitActivity", "onStop");
    }

    public void showErrorDialog() {
        if (isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            new AlertDialog.Builder(this, R.style.Theme.Material.Light.Dialog.Alert).setMessage("An error occured. Please try again later.").setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.tapjoy.TJAdUnitActivity.2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TJAdUnitActivity.this.handleClose();
                    dialogInterface.cancel();
                }
            }).create().show();
        } else {
            new AlertDialog.Builder(this).setMessage("An error occured. Please try again later.").setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.tapjoy.TJAdUnitActivity.3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TJAdUnitActivity.this.handleClose();
                    dialogInterface.cancel();
                }
            }).create().show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        handleClose();
    }

    static void a() {
        TJAdUnitActivity tJAdUnitActivity = f7618b;
        if (tJAdUnitActivity != null) {
            tJAdUnitActivity.handleClose(true);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7620c.notifyOrientationChanged();
    }
}
