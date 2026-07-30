package com.crrepa.band.my.profile.strava.model;

import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class StravaRefreshTokenReq extends StravaTokenReq {
    @Override // com.crrepa.band.my.profile.strava.model.StravaTokenReq
    public String getClient_id() {
        return "117102";
    }

    @Override // com.crrepa.band.my.profile.strava.model.StravaTokenReq
    public String getClient_secret() {
        return "dccd00e912c2e7aa9ee01e36e41eeff13dff9ed6";
    }

    @Override // com.crrepa.band.my.profile.strava.model.StravaTokenReq
    public String getGrant_type() {
        return "refresh_token";
    }

    public String getRefreshToken() {
        return g.getInstance().getString("refresh_token", null);
    }
}
