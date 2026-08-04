package com.proyecto26.inappbrowser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes3.dex */
public class ChromeTabsManagerActivity extends Activity {
    static final String BROWSER_RESULT_TYPE = "browserResultType";
    static final String DEFAULT_RESULT_TYPE = "dismiss";
    static final String KEY_BROWSER_INTENT = "browserIntent";
    private boolean mOpened = false;
    private String resultType = null;
    private boolean isError = false;

    public static Intent createStartIntent(Context context, Intent intent) {
        Intent createBaseIntent = createBaseIntent(context);
        createBaseIntent.putExtra(KEY_BROWSER_INTENT, intent);
        return createBaseIntent;
    }

    public static Intent createDismissIntent(Context context) {
        Intent createBaseIntent = createBaseIntent(context);
        createBaseIntent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        return createBaseIntent;
    }

    private static Intent createBaseIntent(Context context) {
        return new Intent(context, (Class<?>) ChromeTabsManagerActivity.class);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            if (getIntent().hasExtra(KEY_BROWSER_INTENT) && (bundle == null || bundle.getString(BROWSER_RESULT_TYPE) == null)) {
                Intent intent = (Intent) getIntent().getParcelableExtra(KEY_BROWSER_INTENT);
                intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                startActivity(intent);
                this.resultType = DEFAULT_RESULT_TYPE;
                return;
            }
            finish();
        } catch (Exception e) {
            this.isError = true;
            EventBus.getDefault().post(new ChromeTabsDismissedEvent("Unable to open url.", this.resultType, Boolean.valueOf(this.isError)));
            finish();
            e.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.mOpened) {
            this.mOpened = true;
        } else {
            this.resultType = "cancel";
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        String str = this.resultType;
        if (str != null) {
            str.hashCode();
            if (str.equals("cancel")) {
                EventBus.getDefault().post(new ChromeTabsDismissedEvent("chrome tabs activity closed", this.resultType, Boolean.valueOf(this.isError)));
            } else {
                EventBus.getDefault().post(new ChromeTabsDismissedEvent("chrome tabs activity destroyed", DEFAULT_RESULT_TYPE, Boolean.valueOf(this.isError)));
            }
            this.resultType = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.resultType = bundle.getString(BROWSER_RESULT_TYPE);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putString(BROWSER_RESULT_TYPE, DEFAULT_RESULT_TYPE);
        super.onSaveInstanceState(bundle);
    }
}
