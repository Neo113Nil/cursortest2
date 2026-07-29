package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Color;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class f extends RelativeLayout {
    public f(Context context, com.applovin.impl.sdk.j jVar) {
        super(context, null, ((Integer) jVar.a(com.applovin.impl.sdk.b.b.ch)).intValue());
        a(context, jVar);
    }

    private void a(Context context, com.applovin.impl.sdk.j jVar) {
        RelativeLayout.LayoutParams layoutParams;
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        int intValue = ((Integer) jVar.a(com.applovin.impl.sdk.b.b.cg)).intValue();
        if (intValue == -2 || intValue == -1) {
            layoutParams = new RelativeLayout.LayoutParams(intValue, intValue);
        } else {
            int dpToPx = AppLovinSdkUtils.dpToPx(context, intValue);
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        setBackgroundColor(Color.parseColor((String) jVar.a(com.applovin.impl.sdk.b.b.cc)));
        addView(progressBar);
    }
}
