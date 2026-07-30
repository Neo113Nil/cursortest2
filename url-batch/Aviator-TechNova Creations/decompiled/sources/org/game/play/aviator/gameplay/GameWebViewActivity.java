package org.game.play.aviator.gameplay;

import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.gms.ads.MobileAds;
import com.pesonal.adsdk.AppManage;
import com.pesonal.adsdk.Click;
import org.game.play.aviator.gameplay.databinding.ActivityGameWebViewBinding;

/* loaded from: classes3.dex */
public class GameWebViewActivity extends AppCompatActivity {
    private ActivityGameWebViewBinding binding;
    private View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private WebChromeClient mWebChromeClient;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        ActivityGameWebViewBinding inflate = ActivityGameWebViewBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass1(true));
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        if (insetsController != null) {
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsetsCompat.Type.systemBars());
        }
        String stringExtra = getIntent().getStringExtra("url");
        if (stringExtra != null) {
            MobileAds.registerWebView(this.binding.webView);
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.binding.webView, true);
            WebSettings settings = this.binding.webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            this.binding.webView.setWebViewClient(new WebViewClient());
            this.mWebChromeClient = new WebChromeClient() { // from class: org.game.play.aviator.gameplay.GameWebViewActivity.2
                @Override // android.webkit.WebChromeClient
                public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                    if (GameWebViewActivity.this.mCustomView != null) {
                        customViewCallback.onCustomViewHidden();
                        return;
                    }
                    GameWebViewActivity.this.mCustomView = view;
                    GameWebViewActivity.this.mCustomViewCallback = customViewCallback;
                    GameWebViewActivity.this.binding.webView.setVisibility(8);
                    GameWebViewActivity.this.binding.fullscreenContainer.setVisibility(0);
                    GameWebViewActivity.this.binding.fullscreenContainer.addView(view);
                }

                @Override // android.webkit.WebChromeClient
                public void onHideCustomView() {
                    super.onHideCustomView();
                    if (GameWebViewActivity.this.mCustomView == null) {
                        return;
                    }
                    GameWebViewActivity.this.binding.webView.setVisibility(0);
                    GameWebViewActivity.this.binding.fullscreenContainer.setVisibility(8);
                    GameWebViewActivity.this.binding.fullscreenContainer.removeView(GameWebViewActivity.this.mCustomView);
                    if (GameWebViewActivity.this.mCustomViewCallback != null) {
                        GameWebViewActivity.this.mCustomViewCallback.onCustomViewHidden();
                    }
                    GameWebViewActivity.this.mCustomView = null;
                    GameWebViewActivity.this.mCustomViewCallback = null;
                }
            };
            this.binding.webView.setWebChromeClient(this.mWebChromeClient);
            this.binding.webView.loadUrl(stringExtra);
        }
    }

    /* renamed from: org.game.play.aviator.gameplay.GameWebViewActivity$1, reason: invalid class name */
    class AnonymousClass1 extends OnBackPressedCallback {
        AnonymousClass1(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (GameWebViewActivity.this.mCustomView != null) {
                GameWebViewActivity.this.mWebChromeClient.onHideCustomView();
            } else {
                if (GameWebViewActivity.this.binding.webView.canGoBack()) {
                    GameWebViewActivity.this.binding.webView.goBack();
                    return;
                }
                AppManage appManage = AppManage.getInstance(GameWebViewActivity.this);
                final GameWebViewActivity gameWebViewActivity = GameWebViewActivity.this;
                appManage.show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.GameWebViewActivity$1$$ExternalSyntheticLambda0
                    @Override // com.pesonal.adsdk.AppManage.MyCallback
                    public final void callbackCall() {
                        GameWebViewActivity.this.finish();
                    }
                }, Click.BACKWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
            }
        }
    }
}
