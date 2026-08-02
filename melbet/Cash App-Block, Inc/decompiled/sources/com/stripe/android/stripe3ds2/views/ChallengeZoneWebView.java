package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.squareup.cash.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes8.dex */
public final class ChallengeZoneWebView extends FrameLayout {
    public View.OnClickListener onClickListener;
    public String userEntry;
    public final ThreeDS2WebView webView;
    public static final Pattern PATTERN_METHOD_POST = Pattern.compile("method=\"post\"", 10);
    public static final Pattern PATTERN_FORM_ACTION = Pattern.compile("action=\"(.+?)\"", 10);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.userEntry = "";
        LayoutInflater.from(context).inflate(R.layout.stripe_challenge_zone_web_view, this);
        ThreeDS2WebView threeDS2WebView = (ThreeDS2WebView) ViewBindings.findChildViewById(this, R.id.web_view);
        if (threeDS2WebView == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(getResources().getResourceName(R.id.web_view)));
            throw null;
        }
        this.webView = threeDS2WebView;
        threeDS2WebView.setOnHtmlSubmitListener$3ds2sdk_release(new MaterialButton$$ExternalSyntheticLambda3(this, 26));
    }

    public final void loadHtml(String str) {
        String group;
        if (str == null) {
            return;
        }
        String replaceAll = PATTERN_METHOD_POST.matcher(str).replaceAll("method=\"get\"");
        replaceAll.getClass();
        Matcher matcher = PATTERN_FORM_ACTION.matcher(replaceAll);
        if (matcher.find() && (group = matcher.group(1)) != null && !"https://emv3ds/challenge".equals(group)) {
            replaceAll = new Regex(group).replace(replaceAll, "https://emv3ds/challenge");
        }
        this.webView.loadDataWithBaseURL(null, replaceAll, "text/html", "UTF-8", null);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public final void setOnClickListener$3ds2sdk_release(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneWebView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ ChallengeZoneWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
