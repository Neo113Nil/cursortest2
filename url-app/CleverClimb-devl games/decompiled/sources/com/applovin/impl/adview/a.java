package com.applovin.impl.adview;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class a extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f2468a;

    public a(Activity activity, int i, int i2) {
        super(activity);
        RelativeLayout.LayoutParams layoutParams;
        setClickable(false);
        this.f2468a = new ProgressBar(activity, null, i2);
        this.f2468a.setIndeterminate(true);
        this.f2468a.setClickable(false);
        if (i == -2 || i == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i, i);
        } else {
            int dpToPx = AppLovinSdkUtils.dpToPx(activity, i);
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        }
        layoutParams.addRule(13);
        this.f2468a.setLayoutParams(layoutParams);
        addView(this.f2468a);
    }

    public void a() {
        setVisibility(0);
    }

    public void b() {
        setVisibility(8);
    }

    public void setColor(int i) {
        this.f2468a.getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}
