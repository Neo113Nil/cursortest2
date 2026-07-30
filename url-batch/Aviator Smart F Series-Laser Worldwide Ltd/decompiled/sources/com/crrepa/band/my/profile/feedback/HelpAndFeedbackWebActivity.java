package com.crrepa.band.my.profile.feedback;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.WebActivity;
import com.crrepa.band.my.databinding.ActivityWebBinding;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider;
import com.google.gson.JsonObject;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.p;
import com.moyoung.dafit.module.common.utils.u;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class HelpAndFeedbackWebActivity extends WebActivity {
    private static final String CUSTOMER_URL = "https://pollux-access.moyoung.com/v2";
    private boolean hideBackBtn = false;

    @SuppressLint({"CheckResult"})
    private void completelyCleanWebView(final WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.stopLoading();
            webView.setWebViewClient(null);
            webView.setWebChromeClient(null);
            if (Build.VERSION.SDK_INT >= 29) {
                webView.setWebViewRenderProcessClient(null);
            }
            ViewGroup viewGroup = (ViewGroup) webView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.clearCache(true);
            webView.clearHistory();
            webView.clearFormData();
            webView.clearMatches();
            webView.clearSslPreferences();
            webView.loadUrl("about:blank");
            Observable.timer(100L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.profile.feedback.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    HelpAndFeedbackWebActivity.lambda$completelyCleanWebView$1(webView, (Long) obj);
                }
            });
        } catch (Exception e8) {
            f.d("clean webView error: " + e8.getMessage());
        }
    }

    public static Intent getCallingIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) HelpAndFeedbackWebActivity.class);
        intent.putExtra("title", context.getString(R.string.help_feedback_title));
        intent.putExtra("url", CUSTOMER_URL);
        return intent;
    }

    private JsonObject getColorsObject() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("faqs_assist_1", getColorHexRRGGBBAA(R.color.faqs_assist_1));
        jsonObject.addProperty("faqs_assist_2", getColorHexRRGGBBAA(R.color.faqs_assist_2));
        jsonObject.addProperty("faqs_assist_3", getColorHexRRGGBBAA(R.color.faqs_assist_3));
        jsonObject.addProperty("faqs_assist_4", getColorHexRRGGBBAA(R.color.faqs_assist_4));
        jsonObject.addProperty("faqs_assist_5", getColorHexRRGGBBAA(R.color.faqs_assist_5));
        jsonObject.addProperty("faqs_assist_6", getColorHexRRGGBBAA(R.color.faqs_assist_6));
        jsonObject.addProperty("faqs_assist_7", getColorHexRRGGBBAA(R.color.faqs_assist_7));
        jsonObject.addProperty("faqs_assist_8", getColorHexRRGGBBAA(R.color.faqs_assist_8));
        jsonObject.addProperty("faqs_bg_1", getColorHexRRGGBBAA(R.color.faqs_bg_1));
        jsonObject.addProperty("faqs_bg_2", getColorHexRRGGBBAA(R.color.faqs_bg_2));
        jsonObject.addProperty("faqs_bg_3", getColorHexRRGGBBAA(R.color.faqs_bg_3));
        jsonObject.addProperty("faqs_bg_4", getColorHexRRGGBBAA(R.color.faqs_bg_4));
        jsonObject.addProperty("faqs_bg_5", getColorHexRRGGBBAA(R.color.faqs_bg_5));
        jsonObject.addProperty("faqs_main_1", getColorHexRRGGBBAA(R.color.faqs_main_1));
        jsonObject.addProperty("faqs_main_2", getColorHexRRGGBBAA(R.color.faqs_main_2));
        return jsonObject;
    }

    private JsonObject getOtherObject() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("radius_1", "16px 16px 16px 16px");
        jsonObject.addProperty("radius_2", "12px 12px 12px 12px");
        jsonObject.addProperty("radius_3", "44px 44px 44px 44px");
        jsonObject.addProperty("radius_4", "16px 16px 16px 16px");
        return jsonObject;
    }

    private String getParamsJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(BaseWatchFaceProvider.LANG, u.getLocaleLanguage());
        jsonObject.addProperty("questionType", (Number) 1);
        jsonObject.addProperty("app", getString(R.string.app_name));
        Boolean bool = Boolean.TRUE;
        jsonObject.addProperty("orderShow", bool);
        jsonObject.addProperty("faqsTypeShow", bool);
        jsonObject.addProperty("deviceId", p.getDeviceId(this));
        jsonObject.addProperty("firmware", BandInfoManager.getFirmwareVersion());
        jsonObject.addProperty("broadcast", BandInfoManager.getName());
        jsonObject.addProperty("emailShow", Boolean.FALSE);
        return jsonObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$completelyCleanWebView$1(WebView webView, Long l8) {
        try {
            webView.destroy();
        } catch (Exception e8) {
            f.d("destroy webView error: " + e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendDisplayButtonFlag$0(Boolean bool) {
        if (bool.booleanValue()) {
            ((ActivityWebBinding) this.binding).ivBack.setVisibility(8);
        } else {
            ((ActivityWebBinding) this.binding).ivBack.setVisibility(0);
        }
    }

    @Override // com.crrepa.band.my.WebActivity
    protected void InjectJsOnPageStarted() {
        this.agentWeb.getWebCreator().getWebView().evaluateJavascript(String.format("sessionStorage.setItem('%s', '%s');", "appParams", getParamsJson()), null);
        this.agentWeb.getWebCreator().getWebView().evaluateJavascript(String.format("sessionStorage.setItem('%s', '%s');", "colorsConfig", getColorsObject()), null);
        this.agentWeb.getWebCreator().getWebView().evaluateJavascript(String.format("sessionStorage.setItem('%s', '%s');", "otherConfig", getOtherObject()), null);
    }

    public String getColorHexRRGGBBAA(@ColorRes int i8) {
        int color = ContextCompat.getColor(this, i8);
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(color)), Integer.valueOf(Color.green(color)), Integer.valueOf(Color.blue(color)), Integer.valueOf(Color.alpha(color)));
    }

    @Override // com.crrepa.band.my.WebActivity, com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        int color = ContextCompat.getColor(this, R.color.bg_1_ff);
        k0.setTransparent(this);
        k0.setLightMode(this);
        ((ActivityWebBinding) this.binding).llWeb.setBackgroundColor(color);
        super.initBinding();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    @SuppressLint({"SetJavaScriptEnabled"})
    protected void loadData() {
        super.loadData();
        int color = ContextCompat.getColor(this, R.color.bg_1_ff);
        this.agentWeb.getAgentWebSettings().getWebSettings().setAllowFileAccess(true);
        this.agentWeb.getAgentWebSettings().getWebSettings().setAllowContentAccess(true);
        this.agentWeb.getAgentWebSettings().getWebSettings().setCacheMode(2);
        this.agentWeb.getAgentWebSettings().getWebSettings().setDomStorageEnabled(true);
        this.agentWeb.getAgentWebSettings().getWebSettings().setDatabaseEnabled(true);
        this.agentWeb.getAgentWebSettings().getWebSettings().setJavaScriptEnabled(true);
        this.agentWeb.getAgentWebSettings().getWebSettings().setLoadWithOverviewMode(true);
        this.agentWeb.getAgentWebSettings().getWebSettings().setUseWideViewPort(true);
        this.agentWeb.getAgentWebSettings().getWebSettings().setMixedContentMode(0);
        this.agentWeb.getWebCreator().getWebView().setBackgroundColor(color);
        this.agentWeb.getJsInterfaceHolder().addJavaObject("_dsbridge", this);
    }

    @Override // com.crrepa.band.my.WebActivity
    public void onBackClicked() {
        if (!this.agentWeb.back()) {
            finish();
        } else if (this.hideBackBtn) {
            this.agentWeb.getJsAccessEntrace().quickCallJs("backRouterToIndex");
        }
    }

    @Override // com.crrepa.band.my.WebActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        completelyCleanWebView(this.agentWeb.getWebCreator().getWebView());
        super.onDestroy();
    }

    @JavascriptInterface
    @SuppressLint({"CheckResult"})
    public void sendDisplayButtonFlag(boolean z7) {
        this.hideBackBtn = z7;
        Observable.just(Boolean.valueOf(z7)).subscribeOn(AndroidSchedulers.mainThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.profile.feedback.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HelpAndFeedbackWebActivity.this.lambda$sendDisplayButtonFlag$0((Boolean) obj);
            }
        });
    }
}
