package com.crrepa.band.my.profile.strava.model;

/* loaded from: classes2.dex */
public class StravaTokenReq {
    private String code;

    public String getClient_id() {
        return "117102";
    }

    public String getClient_secret() {
        return "dccd00e912c2e7aa9ee01e36e41eeff13dff9ed6";
    }

    public String getCode() {
        return this.code;
    }

    public String getGrant_type() {
        return "authorization_code";
    }

    public void setCode(String str) {
        this.code = str;
    }
}
