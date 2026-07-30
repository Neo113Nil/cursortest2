package com.crrepa.band.my.home;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import cn.hutool.core.text.l;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.WebActivity;
import com.crrepa.band.my.device.scan.BandScanActivity;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.h0;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class PrivacyPolicyActivity extends AppCompatActivity {

    class a extends ClickableSpan {
        final /* synthetic */ String val$termsOfService;

        a(String str) {
            this.val$termsOfService = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            PrivacyPolicyActivity.this.startTermsOfServiceWeb(this.val$termsOfService);
            s0.logEvent("点击_首页服务条款");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(ContextCompat.getColor(d.get(), R.color.color_privacy_text));
            textPaint.setUnderlineText(false);
        }
    }

    class b extends ClickableSpan {
        final /* synthetic */ String val$privacyPolicy;

        b(String str) {
            this.val$privacyPolicy = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            PrivacyPolicyActivity.this.startPrivacyWeb(this.val$privacyPolicy);
            s0.logEvent("点击_首页隐私协议");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(ContextCompat.getColor(d.get(), R.color.color_privacy_text));
            textPaint.setUnderlineText(false);
        }
    }

    private void initTvDescription() {
        String string = getString(R.string.privacy_policy_btn_title);
        String string2 = getString(R.string.user_service_btn_title);
        String string3 = getString(R.string.privacy_content_0);
        String string4 = getString(R.string.privacy_content_1);
        String string5 = getString(R.string.privacy_content_2);
        String string6 = getString(R.string.privacy_content_3);
        SpannableStringBuilder create = h0.getBuilder(string3).append(l.SPACE).append(string4).setClickSpan(new b(string)).append(string5).append(l.SPACE).append(string6).setClickSpan(new a(string2)).append(getString(R.string.privacy_content_4)).create();
        TextView textView = (TextView) findViewById(R.id.tv_description);
        textView.setText(create);
        textView.setMovementMethod(q1.a.getInstance());
        textView.setFocusable(false);
        textView.setClickable(false);
        textView.setLongClickable(false);
    }

    private void initView() {
        initTvDescription();
        findViewById(R.id.tv_agree).setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyPolicyActivity.this.lambda$initView$0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        startActivity(BandScanActivity.getCallingIntent(this, true));
        s0.logEvent("首次点击同意隐私协议按钮");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPrivacyWeb(String str) {
        startActivity(WebActivity.getCallingIntent(this, str, " https://cdn.moyoung.com/HTML/app_privacy_aviator_smart.html", true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTermsOfServiceWeb(String str) {
        startActivity(WebActivity.getCallingIntent(this, str, "https://cdn.moyoung.com/HTML/aviator_smart_terms_service.html", false));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_privacy_policy);
        k0.setTranslucent(this, 0);
        k0.setDarkMode(this);
        initView();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "用户同意隐私条款页面");
    }
}
