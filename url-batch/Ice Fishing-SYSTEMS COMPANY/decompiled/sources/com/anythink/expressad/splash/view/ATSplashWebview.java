package com.anythink.expressad.splash.view;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;

/* loaded from: classes.dex */
public class ATSplashWebview extends WindVaneWebView {

    /* renamed from: d, reason: collision with root package name */
    private static final String f20912d = "ATSplashWebview";

    /* renamed from: e, reason: collision with root package name */
    private String f20913e;

    public ATSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
    }

    public String getRequestId() {
        return this.f20913e;
    }

    public void setRequestId(String str) {
        this.f20913e = str;
    }
}
