package com.google.androidbrowserhelper.trusted;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* loaded from: classes4.dex */
public class FocusActivity extends Activity {
    private static final String EXTRA_FOCUS_INTENT = "androidx.browser.customtabs.extra.FOCUS_INTENT";
    private static Boolean mActivityExistsCached;

    public static void addToIntent(Intent intent, Context context) {
        Intent intent2 = new Intent(context, (Class<?>) FocusActivity.class);
        if (mActivityExistsCached == null) {
            mActivityExistsCached = Boolean.valueOf(intent2.resolveActivityInfo(context.getPackageManager(), 0) != null);
        }
        if (Boolean.FALSE.equals(mActivityExistsCached)) {
            return;
        }
        intent2.setFlags(268435456);
        intent.putExtra(EXTRA_FOCUS_INTENT, PendingIntent.getActivity(context, 0, intent2, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
    }
}
