package com.mopub.common.privacy;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.mopub.common.MoPub;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.privacy.ConsentDialogLayout;
import com.mopub.common.util.Intents;
import com.mopub.exceptions.IntentNotResolvableException;
import com.tapjoy.TapjoyConstants;

/* loaded from: classes2.dex */
public class ConsentDialogActivity extends Activity {
    private static final int CLOSE_BUTTON_DELAY_MS = 10000;
    private static final String KEY_HTML_PAGE = "html-page-content";
    private Handler mCloseButtonHandler;
    private ConsentStatus mConsentStatus;
    private Runnable mEnableCloseButtonRunnable;
    private ConsentDialogLayout mView;

    static void start(Context context, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        if (TextUtils.isEmpty(str)) {
            MoPubLog.e("ConsentDialogActivity htmlData can't be empty string.");
            return;
        }
        try {
            Intents.startActivity(context, createIntent(context, str));
        } catch (ActivityNotFoundException | IntentNotResolvableException unused) {
            MoPubLog.e("ConsentDialogActivity not found - did you declare it in AndroidManifest.xml?");
        }
    }

    static Intent createIntent(Context context, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        Bundle bundle = new Bundle();
        bundle.putString(KEY_HTML_PAGE, str);
        return Intents.getStartActivityIntent(context, ConsentDialogActivity.class, bundle);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(KEY_HTML_PAGE);
        if (TextUtils.isEmpty(stringExtra)) {
            MoPubLog.e("Web page for ConsentDialogActivity is empty");
            finish();
            return;
        }
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        this.mView = new ConsentDialogLayout(this);
        this.mView.setConsentClickListener(new ConsentDialogLayout.ConsentListener() { // from class: com.mopub.common.privacy.ConsentDialogActivity.1
            @Override // com.mopub.common.privacy.ConsentDialogLayout.ConsentListener
            public void onConsentClick(ConsentStatus consentStatus) {
                ConsentDialogActivity.this.saveConsentStatus(consentStatus);
                ConsentDialogActivity.this.setCloseButtonVisibility(false);
            }

            @Override // com.mopub.common.privacy.ConsentDialogLayout.ConsentListener
            public void onCloseClick() {
                ConsentDialogActivity.this.finish();
            }
        });
        this.mEnableCloseButtonRunnable = new Runnable() { // from class: com.mopub.common.privacy.ConsentDialogActivity.2
            @Override // java.lang.Runnable
            public void run() {
                ConsentDialogActivity.this.setCloseButtonVisibility(true);
            }
        };
        setContentView(this.mView);
        this.mView.startLoading(stringExtra, new ConsentDialogLayout.PageLoadListener() { // from class: com.mopub.common.privacy.ConsentDialogActivity.3
            @Override // com.mopub.common.privacy.ConsentDialogLayout.PageLoadListener
            public void onLoadProgress(int i) {
                int i2 = ConsentDialogLayout.FINISHED_LOADING;
            }
        });
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.mCloseButtonHandler = new Handler();
        this.mCloseButtonHandler.postDelayed(this.mEnableCloseButtonRunnable, TapjoyConstants.TIMER_INCREMENT);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        setCloseButtonVisibility(true);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        PersonalInfoManager personalInformationManager = MoPub.getPersonalInformationManager();
        if (personalInformationManager != null && this.mConsentStatus != null) {
            personalInformationManager.changeConsentStateFromDialog(this.mConsentStatus);
        }
        super.onDestroy();
    }

    void setCloseButtonVisibility(boolean z) {
        if (this.mCloseButtonHandler != null) {
            this.mCloseButtonHandler.removeCallbacks(this.mEnableCloseButtonRunnable);
        }
        if (this.mView != null) {
            this.mView.setCloseVisible(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveConsentStatus(ConsentStatus consentStatus) {
        Preconditions.checkNotNull(consentStatus);
        this.mConsentStatus = consentStatus;
    }
}
