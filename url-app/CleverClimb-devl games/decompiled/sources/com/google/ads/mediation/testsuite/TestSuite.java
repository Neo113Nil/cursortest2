package com.google.ads.mediation.testsuite;

import android.content.Context;
import android.content.Intent;
import com.google.ads.mediation.testsuite.activities.InitialActivity;
import com.google.ads.mediation.testsuite.utils.logging.LaunchEvent;
import com.google.ads.mediation.testsuite.utils.logging.Logger;
import com.google.ads.mediation.testsuite.utils.logging.TestSuiteState;

/* loaded from: classes.dex */
public class TestSuite {
    private static TestSuite instance = new TestSuite();
    private TestSuiteListener listener;

    private TestSuite() {
    }

    public static void launch(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) InitialActivity.class);
        intent.putExtra(InitialActivity.APPID_EXTRA_KEY, str);
        TestSuiteState.sharedInstance().setAdMobApplicationId(str);
        Logger.logEvent(new LaunchEvent(), context);
        context.startActivity(intent);
    }

    public static void setListener(TestSuiteListener testSuiteListener) {
        instance.listener = testSuiteListener;
    }

    public static TestSuiteListener getListener() {
        return instance.listener;
    }

    static void setUserAgentSuffix(String str) {
        TestSuiteState.sharedInstance().setUserAgentSuffix(str);
    }
}
