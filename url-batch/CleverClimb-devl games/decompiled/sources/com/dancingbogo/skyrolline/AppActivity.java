package com.dancingbogo.skyrolline;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.cmplay.b.g;
import com.cmplay.internalpush.b;
import com.cmplay.internalpush.i;
import com.cmplay.internalpush.n;
import com.cmplay.kinfoc.report.KInfocReportManager;
import com.cmplay.policy.gdpr.GDPRController;
import com.dancingbogo.skyrolline.ad.a.c;
import com.dancingbogo.skyrolline.util.NativeUtil;
import com.dancingbogo.skyrolline.util.d;
import com.dancingbogo.skyrolline.util.j;
import com.facebook.appevents.f;
import com.google.ads.consent.ConsentInformation;
import com.google.ads.consent.ConsentStatus;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.Games;
import com.ironsource.b.k;
import com.unity3d.player.UnityPlayer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class AppActivity extends a implements g.a, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public static final String FROM_SOURCE_NOTIFICATION = "from_source_notification";
    public static final String FROM_SOURCE_NOTIFICATION_JUMP_LEVEL = "from_source_notification_jump_level";
    private static final int RC_RESOLVE = 5000;
    private static final int RC_SIGN_IN = 9001;
    private static final int RC_UNUSED = 5001;
    private static WeakReference<Activity> mActRef;
    private long activityStart;
    private GoogleApiClient mGoogleApiClient;
    private boolean mJumpLevel = false;
    public int mJumpLevelCount = -1;
    private List<c> mAdsList = new ArrayList();

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public void onConnected(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public void onConnectionSuspended(int i) {
    }

    public static Activity getActivityRef() {
        if (mActRef == null) {
            return null;
        }
        return mActRef.get();
    }

    @Override // com.dancingbogo.skyrolline.a, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.activityStart = System.currentTimeMillis();
        super.onCreate(bundle);
        hideSystemUI();
        this.mJumpLevel = false;
        mActRef = new WeakReference<>(this);
        GDPRController.setReport(new GDPRController.IReport() { // from class: com.dancingbogo.skyrolline.AppActivity.1
            @Override // com.cmplay.policy.gdpr.GDPRController.IReport
            public void doReport(String str, String str2) {
                b.b(str, str2);
            }
        });
        new Handler().postDelayed(new Runnable() { // from class: com.dancingbogo.skyrolline.AppActivity.2
            @Override // java.lang.Runnable
            public void run() {
                AppActivity.this.initAd();
                for (c cVar : AppActivity.this.mAdsList) {
                    if (cVar != null) {
                        cVar.onCreate(AppActivity.this);
                    }
                }
            }
        }, 500L);
        j.a();
        d.a((Activity) this, true);
        n.a().a(new i.a() { // from class: com.dancingbogo.skyrolline.AppActivity.3
            @Override // com.cmplay.internalpush.i.a
            public void a() {
                UnityPlayer.UnitySendMessage("RubikSDKScript", "HandleHidePeacockActivity", "");
            }
        });
        parseIntent();
        com.dancingbogo.skyrolline.b.b.a(GameApp.f4485a).b("key_opened_v48", true);
        g.a().a(this);
        com.cmplay.b.b.a().a("active_main");
        com.cmplay.b.b.a().c();
    }

    private void parseIntent() {
        Intent intent = getIntent();
        if (intent != null) {
            this.mJumpLevel = intent.getBooleanExtra(FROM_SOURCE_NOTIFICATION, false);
            if (this.mJumpLevel) {
                this.mJumpLevelCount = intent.getIntExtra(FROM_SOURCE_NOTIFICATION_JUMP_LEVEL, -1);
                NativeUtil.getInstance().reportInfoc("rollingsky_games_notification", "style0=2&action=2", true);
                NativeUtil.getInstance().reportInfoc("rollingsky_games_gameshow1", "source0=3", true);
            } else {
                NativeUtil.getInstance().reportInfoc("rollingsky_games_gameshow1", "source0=1", true);
            }
        }
        com.dancingbogo.skyrolline.util.b.b("AppActivity", "mJumpLevel = " + this.mJumpLevel + "jump level = " + this.mJumpLevelCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initAd() {
        initGDPR();
        for (Integer num : com.dancingbogo.skyrolline.ad.a.a()) {
            c a2 = com.dancingbogo.skyrolline.ad.a.a(num.intValue(), (com.dancingbogo.skyrolline.ad.a.b) null);
            if (a2 != null) {
                this.mAdsList.add(a2);
            }
        }
    }

    private void initGDPR() {
        if (GDPRController.checkIfGDPRAgreedAdStayInformed(this)) {
            ConsentInformation.a(this).a(ConsentStatus.PERSONALIZED);
            k.a(true);
        } else {
            ConsentInformation.a(this).a(ConsentStatus.NON_PERSONALIZED);
            k.a(false);
        }
    }

    @Override // com.dancingbogo.skyrolline.a, android.app.Activity
    public void onResume() {
        super.onResume();
        hideSystemUI();
        f.a((Context) this);
        for (c cVar : this.mAdsList) {
            if (cVar != null) {
                cVar.onResume(this);
            }
        }
        if (KInfocReportManager.getInstance() != null) {
            KInfocReportManager.getInstance().onGameResume();
        }
        g.a().a(System.currentTimeMillis());
        g.a().a(this);
    }

    @Override // com.dancingbogo.skyrolline.a, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        hideSystemUI();
    }

    @Override // com.dancingbogo.skyrolline.a, android.app.Activity
    public void onStart() {
        super.onStart();
        for (c cVar : this.mAdsList) {
            if (cVar != null) {
                cVar.onStart(this);
            }
        }
    }

    @Override // com.dancingbogo.skyrolline.a, android.app.Activity
    public void onPause() {
        super.onPause();
        f.b(this);
        for (c cVar : this.mAdsList) {
            if (cVar != null) {
                cVar.onPaused(this);
            }
        }
        if (KInfocReportManager.getInstance() != null) {
            KInfocReportManager.getInstance().onGamePause();
        }
    }

    @Override // com.dancingbogo.skyrolline.a, android.app.Activity
    public void onStop() {
        super.onStop();
        for (c cVar : this.mAdsList) {
            if (cVar != null) {
                cVar.onStop(this);
            }
        }
        if (this.mGoogleApiClient != null) {
            this.mGoogleApiClient.disconnect();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onStop();
        for (c cVar : this.mAdsList) {
            if (cVar != null) {
                cVar.onBackPressed();
            }
        }
    }

    @Override // com.dancingbogo.skyrolline.a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        for (c cVar : this.mAdsList) {
            if (cVar != null) {
                cVar.onDestroy(this);
            }
        }
        if (KInfocReportManager.getInstance() != null) {
            KInfocReportManager.getInstance().onGameExit();
        }
        g.a().a((g.a) null);
        g.a().b();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        com.dancingbogo.skyrolline.util.b.b("AppActivity", "onActivityResult request = " + i + " response = " + i2);
        g.a().a(System.currentTimeMillis());
        super.onActivityResult(i, i2, intent);
        for (c cVar : this.mAdsList) {
            if (cVar != null) {
                cVar.activityResult(i, i2, intent);
            }
        }
        if (i == 9001 && this.mGoogleApiClient != null) {
            if (i2 == -1 || i2 == 10001) {
                this.mGoogleApiClient.connect();
            } else if (i2 == 0) {
                this.mGoogleApiClient.disconnect();
            }
        }
        g.a().a(i, i2, intent);
    }

    private void initGoogleApi() {
        this.mGoogleApiClient = new GoogleApiClient.Builder(this).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(Games.API, Games.GamesOptions.builder().setShowConnectingPopup(true).build()).addScope(Games.SCOPE_GAMES).build();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        if (connectionResult == null) {
            return;
        }
        try {
            com.dancingbogo.skyrolline.util.b.b("AppActivity", "onConnectionFailed connectionResult = " + connectionResult.getErrorCode());
            connectionResult.startResolutionForResult(this, 9001);
        } catch (IntentSender.SendIntentException e) {
            e.printStackTrace();
        }
    }

    public boolean IsSignedIn() {
        if (this.mGoogleApiClient == null) {
            com.dancingbogo.skyrolline.util.b.b("AppActivity", "mGoogleApiClient = null false");
            return false;
        }
        com.dancingbogo.skyrolline.util.b.b("AppActivity", "IsSignedIn = " + this.mGoogleApiClient.isConnected());
        return this.mGoogleApiClient.isConnected();
    }

    public void showLeaderboards() {
        if (this.mGoogleApiClient == null) {
            return;
        }
        if (IsSignedIn()) {
            com.dancingbogo.skyrolline.util.b.b("AppActivity", "showLeaderboards = ");
            startActivityForResult(Games.Leaderboards.getAllLeaderboardsIntent(this.mGoogleApiClient), RC_UNUSED);
        } else {
            com.dancingbogo.skyrolline.util.b.b("AppActivity", "showLeaderboards = connect");
            this.mGoogleApiClient.connect();
        }
    }

    public void unlockAchievement(String str) {
        if (this.mGoogleApiClient == null) {
            return;
        }
        if (IsSignedIn()) {
            com.dancingbogo.skyrolline.util.b.b("AppActivity", "unlockAchievement = ");
            Games.Achievements.unlock(this.mGoogleApiClient, str);
        } else {
            com.dancingbogo.skyrolline.util.b.b("AppActivity", "unlockAchievement = connect");
            this.mGoogleApiClient.connect();
        }
    }

    public void submitScore(String str, long j, String str2) {
        if (this.mGoogleApiClient == null) {
            return;
        }
        if (IsSignedIn()) {
            com.dancingbogo.skyrolline.util.b.b("AppActivity", "submitScore = ");
            Games.Leaderboards.submitScore(this.mGoogleApiClient, str, j, str2);
        } else {
            com.dancingbogo.skyrolline.util.b.b("AppActivity", "submitScore = connect");
            this.mGoogleApiClient.connect();
        }
    }

    public void authenticate() {
        initGoogleApi();
        if (this.mGoogleApiClient == null) {
            return;
        }
        com.dancingbogo.skyrolline.util.b.b("AppActivity", "authenticate = ");
        this.mGoogleApiClient.connect();
    }

    public void showAchievements() {
        if (this.mGoogleApiClient == null) {
            return;
        }
        if (IsSignedIn()) {
            com.dancingbogo.skyrolline.util.b.b("AppActivity", "showAchievements = ");
            startActivityForResult(Games.Achievements.getAchievementsIntent(this.mGoogleApiClient), RC_UNUSED);
        } else {
            com.dancingbogo.skyrolline.util.b.b("AppActivity", "showAchievements = connect");
            this.mGoogleApiClient.connect();
        }
    }

    public int getOpenNewLevel() {
        return this.mJumpLevelCount;
    }

    private void hideSystemUI() {
        if (Build.VERSION.SDK_INT > 18) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(8);
            decorView.setSystemUiVisibility(5895);
        }
    }

    public void onShare(com.cmplay.b.f fVar) {
        g.a().d(this, fVar);
    }

    public String getUserName() {
        if (!IsSignedIn()) {
            return "Guest";
        }
        String displayName = Games.Players.getCurrentPlayer(this.mGoogleApiClient).getDisplayName();
        Log.i("AppActivity", "name = = " + Games.Players.getCurrentPlayer(this.mGoogleApiClient).getDisplayName() + "url =" + Games.Players.getCurrentPlayer(this.mGoogleApiClient).getIconImageUrl() + "ID =" + Games.Players.getCurrentPlayer(this.mGoogleApiClient).getPlayerId() + "title =" + Games.Players.getCurrentPlayer(this.mGoogleApiClient).getTitle());
        return displayName;
    }
}
