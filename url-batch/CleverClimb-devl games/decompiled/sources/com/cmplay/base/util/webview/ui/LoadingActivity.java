package com.cmplay.base.util.webview.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.cmplay.base.util.R;
import com.cmplay.base.util.p;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class LoadingActivity extends Activity {
    private static String KEY_LOADING_TYPE = "key_loading_type";
    private static WeakReference<Activity> mActRef;
    private static Context mContext;
    private LoadingView mLoadingView;

    public static void StartLoadingActivity(Context context, int i) {
        mContext = context.getApplicationContext();
        Intent intent = new Intent(context, (Class<?>) LoadingActivity.class);
        intent.setFlags(268435456);
        intent.putExtra(KEY_LOADING_TYPE, i);
        p.a(context, intent);
    }

    public static void StopLoadingActivity() {
        Activity activityRef = getActivityRef();
        if (activityRef != null) {
            activityRef.finish();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mActRef = new WeakReference<>(this);
        setContentView(R.layout.com_cmplay_message_loading_activity);
        initView();
        parseIntent(getIntent());
    }

    private void initView() {
        this.mLoadingView = (LoadingView) findViewById(R.id.loading_view);
    }

    @SuppressLint({"NewApi"})
    private void parseIntent(Intent intent) {
        int intExtra;
        if (intent == null || -1 == (intExtra = intent.getIntExtra(KEY_LOADING_TYPE, -1))) {
            return;
        }
        this.mLoadingView.setType(intExtra);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        mActRef = null;
    }

    public void setTransparentStyle() {
        this.mLoadingView.setLoadingTextColor(-1);
    }

    public void setLoadingText(String str) {
        this.mLoadingView.setLoadingText(str);
    }

    public static Activity getActivityRef() {
        if (mActRef == null) {
            return null;
        }
        return mActRef.get();
    }
}
