package com.withpersona.sdk2.inquiry.internal;

import android.os.Bundle;

/* loaded from: classes9.dex */
public final class InquiryArguments {
    public final Bundle bundle;

    public InquiryArguments(Bundle bundle) {
        this.bundle = bundle;
    }

    public final Environment getEnvironment() {
        Bundle bundle = this.bundle;
        String string2 = bundle != null ? bundle.getString("ENVIRONMENT_KEY") : null;
        if (string2 != null) {
            int hashCode = string2.hashCode();
            if (hashCode != -2056856391) {
                if (hashCode == -1711584601 && string2.equals("SANDBOX")) {
                    return Environment.SANDBOX;
                }
            } else if (string2.equals("PRODUCTION")) {
                return Environment.PRODUCTION;
            }
        }
        return Environment.PRODUCTION;
    }

    public final String getRequestKey() {
        String string2;
        Bundle bundle = this.bundle;
        return (bundle == null || (string2 = bundle.getString("REQUEST_KEY")) == null) ? "com.withpersona.sdk2.request_key" : string2;
    }

    public final String getSessionToken() {
        String string2;
        Bundle bundle = this.bundle;
        if (bundle == null || (string2 = bundle.getString("SESSION_TOKEN_KEY")) == null) {
            return null;
        }
        return "Bearer ".concat(string2);
    }

    public final Integer getTheme() {
        Bundle bundle = this.bundle;
        if (bundle != null) {
            return Integer.valueOf(bundle.getInt("THEME_KEY"));
        }
        return null;
    }
}
