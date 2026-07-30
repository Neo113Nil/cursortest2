package com.crrepa.band.my.profile.strava;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.CustomConfirmDialog;
import com.crrepa.band.my.databinding.ActivityStravaMainBinding;
import com.crrepa.band.my.profile.strava.StravaHttpDelegate;
import com.crrepa.band.my.profile.strava.model.StravaModel;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;

/* loaded from: classes2.dex */
public class StravaMainActivity extends BaseVBActivity<ActivityStravaMainBinding> {

    class a implements StravaHttpDelegate.a {
        a() {
        }

        @Override // com.crrepa.band.my.profile.strava.StravaHttpDelegate.a
        public void onFailed(String str) {
            StravaMainActivity.this.getPageLoadingUI().hide();
            r0.showShort(str);
        }

        @Override // com.crrepa.band.my.profile.strava.StravaHttpDelegate.a
        public /* bridge */ /* synthetic */ void onStravaOauthInvalid() {
            g.b(this);
        }

        @Override // com.crrepa.band.my.profile.strava.StravaHttpDelegate.a
        public void onSucceed(String str) {
            StravaMainActivity.this.getPageLoadingUI().hide();
            StravaModel.clearAccessToken();
            ((ActivityStravaMainBinding) ((BaseVBActivity) StravaMainActivity.this).binding).shadowConnect.setVisibility(0);
            ((ActivityStravaMainBinding) ((BaseVBActivity) StravaMainActivity.this).binding).shadowUnbind.setVisibility(8);
            ((ActivityStravaMainBinding) ((BaseVBActivity) StravaMainActivity.this).binding).tvStravaConnected.setVisibility(4);
        }

        @Override // com.crrepa.band.my.profile.strava.StravaHttpDelegate.a
        public /* bridge */ /* synthetic */ void onTokenRefreshed() {
            g.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deauthorize() {
        getPageLoadingUI().show();
        new StravaHttpDelegate(new a()).deauthorize();
    }

    private static Intent getStravaOauthIntent() {
        return new Intent("android.intent.action.VIEW", Uri.parse("https://www.strava.com/oauth/mobile/authorize").buildUpon().appendQueryParameter("client_id", "117102").appendQueryParameter("redirect_uri", "strava://dafit_oauth").appendQueryParameter("response_type", "code").appendQueryParameter("approval_prompt", TtmlNode.TEXT_EMPHASIS_AUTO).appendQueryParameter("scope", "activity:write,read").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        skipToOauth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        unbindStrava();
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityStravaMainBinding) this.binding).includeTitle.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityStravaMainBinding) vb).includeTitle.tvTitle, ((ActivityStravaMainBinding) vb).includeTitle.tvExpandedTitle);
        setSupportActionBar(((ActivityStravaMainBinding) this.binding).includeTitle.toolbar);
    }

    private void setTitle() {
        ((ActivityStravaMainBinding) this.binding).includeTitle.tvTitle.setText(R.string.strava_connect_title);
        ((ActivityStravaMainBinding) this.binding).includeTitle.tvExpandedTitle.setText(R.string.strava_connect_title);
        ((ActivityStravaMainBinding) this.binding).includeTitle.ivTitleBack.setImageResource(R.drawable.selector_title_back);
    }

    private void skipToOauth() {
        try {
            Intent stravaOauthIntent = getStravaOauthIntent();
            stravaOauthIntent.setClassName("com.strava", "com.strava.authorization.oauth.OauthIntentCatcherActivity");
            startActivity(stravaOauthIntent);
        } catch (Exception unused) {
            Intent stravaOauthIntent2 = getStravaOauthIntent();
            if (stravaOauthIntent2.resolveActivity(com.moyoung.dafit.module.common.utils.d.get().getPackageManager()) != null) {
                startActivity(stravaOauthIntent2);
            } else {
                r0.showShort("No browser available!");
            }
        }
    }

    private void unbindStrava() {
        CustomConfirmDialog customConfirmDialog = new CustomConfirmDialog(this);
        customConfirmDialog.setTitleTxt(R.string.strava_abort_dialog_title);
        customConfirmDialog.setContentTxt(R.string.strava_abort_dialog_content);
        customConfirmDialog.setOkTxt(R.string.abort);
        customConfirmDialog.show();
        customConfirmDialog.setOnOkClick(new BaseCustomConfirmDialog.b() { // from class: com.crrepa.band.my.profile.strava.h
            @Override // com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog.b
            public final void onConfirm() {
                StravaMainActivity.this.deauthorize();
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        setActionBar();
        setTitle();
        ((ActivityStravaMainBinding) this.binding).includeTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.strava.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StravaMainActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityStravaMainBinding) this.binding).btnConnect.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.strava.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StravaMainActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityStravaMainBinding) this.binding).btnUnbind.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.profile.strava.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StravaMainActivity.this.lambda$initBinding$2(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (TextUtils.isEmpty(com.moyoung.dafit.module.common.network.provider.g.getInstance().getString("access_token", null))) {
            return;
        }
        ((ActivityStravaMainBinding) this.binding).shadowConnect.setVisibility(8);
        ((ActivityStravaMainBinding) this.binding).shadowUnbind.setVisibility(0);
        ((ActivityStravaMainBinding) this.binding).tvStravaConnected.setVisibility(0);
    }
}
