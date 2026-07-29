package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.sdk.e.l;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;
import com.youappi.sdk.mediation.admob.ParamNames;

/* loaded from: classes.dex */
public class MaxAdView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f3390a;

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String attributeValue = attributeSet.getAttributeValue(AppLovinAdView.NAMESPACE, ParamNames.AD_UNIT_ID);
        if (attributeValue == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(attributeValue)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (!(context instanceof Activity)) {
            throw new IllegalArgumentException("Max ad view context is not an activity");
        }
        Activity activity = (Activity) context;
        a(attributeValue, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxAdView(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Activity activity) {
        super(activity);
        a(str, appLovinSdk, activity);
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int applyDimension = (int) TypedValue.applyDimension(1, 50.0f, displayMetrics);
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("Max Ad");
        textView.setGravity(17);
        addView(textView, i, applyDimension);
    }

    private void a(String str, AppLovinSdk appLovinSdk, Activity activity) {
        if (isInEditMode()) {
            a(activity);
        } else {
            this.f3390a = new MaxAdViewImpl(str, this, l.a(appLovinSdk), activity);
        }
    }

    public void destroy() {
        this.f3390a.destroy();
    }

    public void loadAd() {
        this.f3390a.loadAd();
    }

    public void setExtraParameter(String str, String str2) {
        this.f3390a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f3390a.setListener(maxAdViewAdListener);
    }

    public void startAutoRefresh() {
        this.f3390a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f3390a.stopAutoRefresh();
    }
}
