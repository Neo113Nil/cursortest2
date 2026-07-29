package com.google.ads.mediation.testsuite.utils.logging;

import android.content.Context;

/* loaded from: classes.dex */
public class TestSuiteState {
    static final String USER_AGENT = "mediationtestsuite_android";
    private static TestSuiteState instance;
    private String adMobApplicationId;
    private String countryCode;
    private TestSuiteScreenOrigin originScreen = TestSuiteScreenOrigin.Unknown;
    private String userAgentSuffix;

    public static TestSuiteState sharedInstance() {
        if (instance == null) {
            instance = new TestSuiteState();
        }
        return instance;
    }

    private TestSuiteState() {
    }

    public String getApplicationPackageName(Context context) {
        return context.getPackageName();
    }

    public String getAdMobApplicationId() {
        return this.adMobApplicationId;
    }

    public void setAdMobApplicationId(String str) {
        this.adMobApplicationId = str;
    }

    public TestSuiteScreenOrigin getOriginScreen() {
        return this.originScreen;
    }

    public void setOriginScreen(TestSuiteScreenOrigin testSuiteScreenOrigin) {
        this.originScreen = testSuiteScreenOrigin;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public String getUserAgent() {
        if (this.userAgentSuffix == null) {
            return USER_AGENT;
        }
        return "mediationtestsuite_android_" + this.userAgentSuffix;
    }

    public void setUserAgentSuffix(String str) {
        this.userAgentSuffix = str;
    }
}
