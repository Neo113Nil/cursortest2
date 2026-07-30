package com.crrepa.band.my.home.guidance.privacy;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.WebActivity;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.u;

/* loaded from: classes2.dex */
public class b {

    class a extends ClickableSpan {
        final /* synthetic */ Context val$context;

        a(Context context) {
            this.val$context = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            b.startPrivacyWeb(this.val$context.getString(R.string.privacy_policy_btn_title), this.val$context);
            s0.logEvent("点击_首页隐私协议");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.crrepa.band.my.home.guidance.privacy.b$b, reason: collision with other inner class name */
    class C0206b extends ClickableSpan {
        final /* synthetic */ Context val$context;

        C0206b(Context context) {
            this.val$context = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            b.startTermsOfServiceWeb(this.val$context.getString(R.string.user_service_btn_title), this.val$context);
            s0.logEvent("点击_首页服务条款");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    private static SpannableStringBuilder getStringBuilder(Context context, String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.assist_10)), 0, str.length(), 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(14, true), 0, str.length(), 33);
        int indexOf = str.indexOf(str2);
        if (indexOf >= 0) {
            int length = str2.length() + indexOf;
            spannableStringBuilder.setSpan(new a(context), indexOf, length, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.main)), indexOf, length, 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, length, 33);
        }
        int indexOf2 = str.indexOf(str3);
        if (indexOf2 >= 0) {
            int length2 = str3.length() + indexOf2;
            spannableStringBuilder.setSpan(new C0206b(context), indexOf2, length2, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.main)), indexOf2, length2, 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), indexOf2, length2, 33);
        }
        return spannableStringBuilder;
    }

    public static void initPrivacyTextView(TextView textView, String str, String str2, String str3) {
        textView.setText(getStringBuilder(textView.getContext(), str, str2, str3));
        textView.setMovementMethod(q1.a.getInstance());
        textView.setFocusable(false);
        textView.setClickable(false);
        textView.setLongClickable(false);
    }

    private static void startPrivacyActivity(Context context, String str, String str2) {
        context.startActivity(WebActivity.getCallingIntent(context, str, str2));
    }

    public static void startPrivacyWeb(String str, Context context) {
        startPrivacyActivity(context, str, u.isZH() ? "http://cdn.moyoung.com/HTML/zh.html" : "http://cdn.moyoung.com/HTML/U.html");
    }

    public static void startTermsOfServiceWeb(String str, Context context) {
        startPrivacyActivity(context, str, u.isZH() ? "http://cdn.moyoung.com/HTML/software_license.html" : "http://cdn.moyoung.com/HTML/software_license_en.html");
    }
}
