package com.crrepa.band.my;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityWebBinding;
import com.just.agentweb.AgentWeb;
import com.just.agentweb.WebChromeClient;
import com.just.agentweb.WebViewClient;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;

/* loaded from: classes2.dex */
public class WebActivity extends BaseVBActivity<ActivityWebBinding> {
    protected static final int MAX_PROGRESS = 100;
    protected static final String SHOW_TITLE_BAR = "SHOW_TITLE_BAR";
    protected static final String SHOW_WEB_TITLE = "is_show_web_title";
    protected static final String TITLE = "title";
    protected static final String URL = "url";
    protected AgentWeb agentWeb;

    class a extends WebChromeClient {
        a() {
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (WebActivity.this.getIntent().getBooleanExtra(WebActivity.SHOW_WEB_TITLE, false)) {
                ((TextView) WebActivity.this.findViewById(R.id.tv_title)).setText(str);
            }
        }
    }

    class b extends WebViewClient {
        b() {
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (webView.getProgress() == 100) {
                WebActivity.this.onPageLoaded();
            }
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            WebActivity.this.InjectJsOnPageStarted();
        }
    }

    public static Intent getCallingIntent(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) WebActivity.class);
        intent.putExtra(TITLE, str);
        intent.putExtra("url", str2);
        return intent;
    }

    private void initTitleView() {
        if (!getIntent().getBooleanExtra(SHOW_TITLE_BAR, true)) {
            ((ActivityWebBinding) this.binding).rlTitle.setVisibility(8);
            return;
        }
        ((TextView) findViewById(R.id.tv_title)).setText(getIntent().getStringExtra(TITLE));
        ImageView imageView = (ImageView) findViewById(R.id.iv_back);
        imageView.setImageResource(R.drawable.selector_title_back);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebActivity.this.lambda$initTitleView$0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initTitleView$0(View view) {
        onBackClicked();
    }

    private void loadUrl() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_web);
        this.agentWeb = AgentWeb.with(this).setAgentWebParent(linearLayout, new LinearLayout.LayoutParams(-1, -1)).useDefaultIndicator().setWebViewClient(new b()).setWebChromeClient(new a()).createAgentWeb().ready().go(getIntent().getStringExtra("url"));
    }

    protected void InjectJsOnPageStarted() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        initTitleView();
        loadUrl();
    }

    public void onBackClicked() {
        if (this.agentWeb.back()) {
            return;
        }
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        onBackClicked();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.agentWeb.getWebLifeCycle().onDestroy();
    }

    protected void onPageLoaded() {
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
    }

    public static Intent getCallingIntent(Context context, String str, String str2, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) WebActivity.class);
        intent.putExtra(TITLE, str);
        intent.putExtra("url", str2);
        intent.putExtra(SHOW_WEB_TITLE, z7);
        return intent;
    }
}
