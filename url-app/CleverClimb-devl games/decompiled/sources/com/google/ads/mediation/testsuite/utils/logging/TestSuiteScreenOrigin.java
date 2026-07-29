package com.google.ads.mediation.testsuite.utils.logging;

import android.support.v4.os.EnvironmentCompat;

/* loaded from: classes.dex */
public enum TestSuiteScreenOrigin {
    Unknown(EnvironmentCompat.MEDIA_UNKNOWN),
    TestByAdUnit("test_by_ad_unit"),
    TestByNetwork("test_by_network");

    private final String name;

    TestSuiteScreenOrigin(String str) {
        this.name = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
