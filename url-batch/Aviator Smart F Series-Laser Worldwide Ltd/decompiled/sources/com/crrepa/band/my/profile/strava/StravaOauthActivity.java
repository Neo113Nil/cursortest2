package com.crrepa.band.my.profile.strava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityStravaOauthBinding;
import com.crrepa.band.my.profile.strava.model.StravaModel;
import com.crrepa.band.my.profile.strava.model.StravaTokenResp;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes2.dex */
public class StravaOauthActivity extends BaseVBActivity<ActivityStravaOauthBinding> {
    private StravaModel stravaModel;

    private void checkOauthMsg() {
        Intent intent = getIntent();
        if (intent == null || intent.getData() == null) {
            showOauthFailed();
            return;
        }
        Uri data = intent.getData();
        Log.d("StravaOauth", data.toString());
        String queryParameter = data.getQueryParameter("code");
        if (TextUtils.isEmpty(queryParameter)) {
            showOauthFailed();
        } else {
            requestToken(queryParameter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestToken$1(StravaTokenResp stravaTokenResp) {
        if (stravaTokenResp == null) {
            showOauthFailed();
        } else {
            showOauthSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestToken$2(Throwable th) {
        showOauthFailed();
    }

    @SuppressLint({"CheckResult"})
    private void requestToken(String str) {
        if (this.stravaModel == null) {
            this.stravaModel = new StravaModel();
        }
        this.stravaModel.requestToken(str).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.profile.strava.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StravaOauthActivity.this.lambda$requestToken$1((StravaTokenResp) obj);
            }
        }, new Consumer() { // from class: com.crrepa.band.my.profile.strava.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StravaOauthActivity.this.lambda$requestToken$2((Throwable) obj);
            }
        });
    }

    private void showOauthFailed() {
        ((ActivityStravaOauthBinding) this.binding).tvOauthIng.setVisibility(8);
        ((ActivityStravaOauthBinding) this.binding).tvOauthFailed.setVisibility(0);
        ((ActivityStravaOauthBinding) this.binding).tvOauthFailedTips.setVisibility(0);
        r0.showShort(getApplicationContext(), R.string.strava_oauth_failed_tips);
        finish();
    }

    private void showOauthSuccess() {
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        ((ActivityStravaOauthBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.strava.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StravaOauthActivity.this.lambda$initBinding$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        checkOauthMsg();
    }
}
