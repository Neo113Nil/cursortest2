package com.crrepa.band.my.home.guidance.privacy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.home.guidance.privacy.PrivatePolicyDialog;
import com.just.agentweb.AgentWeb;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class PrivatePolicyWebActivity extends BaseActivity {
    private static final String TITLE = "title";
    private static final String URL = "url";
    private AgentWeb agentWeb;
    private PrivatePolicyDialog privatePolicyDialog;

    public static Intent getCallingIntent(Context context, String str, String str2, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) PrivatePolicyWebActivity.class);
        intent.putExtra(TITLE, str);
        intent.putExtra("url", str2);
        intent.putExtra("isPrivacyPolicy", z7);
        return intent;
    }

    private void initTitleView() {
        ((TextView) findViewById(R.id.tv_title)).setText(getIntent().getStringExtra(TITLE));
        ((ImageView) findViewById(R.id.iv_back)).setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.privacy.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivatePolicyWebActivity.this.lambda$initTitleView$0(view);
            }
        });
        if (getIntent().getBooleanExtra("isPrivacyPolicy", false)) {
            ImageView imageView = (ImageView) findViewById(R.id.iv_right);
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.privacy.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrivatePolicyWebActivity.this.lambda$initTitleView$1(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTitleView$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTitleView$1(View view) {
        if (this.privatePolicyDialog == null) {
            this.privatePolicyDialog = new PrivatePolicyDialog(this, new PrivatePolicyDialog.a() { // from class: com.crrepa.band.my.home.guidance.privacy.j
                @Override // com.crrepa.band.my.home.guidance.privacy.PrivatePolicyDialog.a
                public final void onSelected(String str) {
                    PrivatePolicyWebActivity.this.loadUrl(str);
                }
            });
        }
        this.privatePolicyDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadUrl(String str) {
        if (this.agentWeb == null) {
            this.agentWeb = AgentWeb.with(this).setAgentWebParent((LinearLayout) findViewById(R.id.ll), new LinearLayout.LayoutParams(-1, -1)).useDefaultIndicator().createAgentWeb().ready().go(str);
        }
        this.agentWeb.getUrlLoader().loadUrl(str);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_private_policy_web);
        initTitleView();
        loadUrl(getIntent().getStringExtra("url"));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.agentWeb.getWebLifeCycle().onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.agentWeb.getWebLifeCycle().onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.agentWeb.getWebLifeCycle().onResume();
        s0.logPage(getClass(), "隐私协议网页或软件许可及服务协议");
    }
}
