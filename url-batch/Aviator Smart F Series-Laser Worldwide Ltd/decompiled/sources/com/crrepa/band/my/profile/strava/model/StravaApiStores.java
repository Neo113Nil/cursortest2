package com.crrepa.band.my.profile.strava.model;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import r7.l;
import r7.o;
import r7.q;
import r7.t;

/* loaded from: classes2.dex */
public interface StravaApiStores {
    public static final String BASE_STRAVA_URL = "https://www.strava.com";

    @r7.e
    @o("/oauth/deauthorize")
    Observable<DeauthorizeResp> deauthorize(@r7.c("access_token") String str);

    @r7.e
    @o("/api/v3/oauth/token")
    Observable<StravaTokenResp> refreshToken(@r7.c("client_id") String str, @r7.c("client_secret") String str2, @r7.c("grant_type") String str3, @r7.c("refresh_token") String str4);

    @r7.e
    @o("/oauth/token")
    Observable<StravaTokenResp> requestToken(@r7.c("client_id") String str, @r7.c("client_secret") String str2, @r7.c("code") String str3, @r7.c("grant_type") String str4);

    @l
    @o("/api/v3/uploads")
    Observable<GPXUploadResp> uploadGPXFile(@q MultipartBody.Part part, @q("activity_type") RequestBody requestBody, @q("name") RequestBody requestBody2, @q("description") RequestBody requestBody3, @q("trainer") RequestBody requestBody4, @q("commute") RequestBody requestBody5, @q("data_type") RequestBody requestBody6, @q("external_id") RequestBody requestBody7);

    @r7.f("https://api.moyoung.com/users/strava/refresh-token")
    Observable<UploadRefreshTokenResp> uploadRefreshToken(@t("refresh_token") String str, @t("share") String str2);
}
