package com.startapp.sdk.internal;

import android.app.Activity;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.net.URLDecoder;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class v1 implements oc {
    private static final String LOG_TAG = "v1";
    protected u1 openListener;

    public v1(u1 u1Var) {
        this.openListener = u1Var;
    }

    public void applyOrientationProperties(Activity activity, xc xcVar) {
        try {
            int i4 = 0;
            int i5 = activity.getResources().getConfiguration().orientation == 1 ? 1 : 0;
            int i6 = xcVar.f7867b;
            if (i6 == 0) {
                i4 = 1;
            } else if (i6 != 1) {
                i4 = xcVar.f7866a ? -1 : i5;
            }
            int i7 = p0.f7428a;
            try {
                activity.setRequestedOrientation(i4);
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    @Override // com.startapp.sdk.internal.oc
    public abstract void close();

    @Override // com.startapp.sdk.internal.oc
    public void createCalendarEvent(String str) {
        isFeatureSupported("calendar");
    }

    @Override // com.startapp.sdk.internal.oc
    public void expand(String str) {
    }

    public abstract boolean isFeatureSupported(String str);

    @Override // com.startapp.sdk.internal.oc
    public boolean open(String str) {
        try {
            String trim = URLDecoder.decode(str, CharEncoding.UTF_8).trim();
            return trim.startsWith("sms") ? openSMS(trim) : trim.startsWith("tel") ? openTel(trim) : this.openListener.a(trim);
        } catch (Exception unused) {
            return this.openListener.a(str);
        }
    }

    public boolean openSMS(String str) {
        isFeatureSupported("sms");
        return true;
    }

    public boolean openTel(String str) {
        isFeatureSupported("tel");
        return true;
    }

    @Override // com.startapp.sdk.internal.oc
    public void playVideo(String str) {
        isFeatureSupported("inlineVideo");
    }

    @Override // com.startapp.sdk.internal.oc
    public void resize() {
    }

    @Override // com.startapp.sdk.internal.oc
    public void setExpandProperties(Map<String, String> map) {
    }

    @Override // com.startapp.sdk.internal.oc
    public abstract void setOrientationProperties(Map<String, String> map);

    @Override // com.startapp.sdk.internal.oc
    public void setResizeProperties(Map<String, String> map) {
    }

    @Override // com.startapp.sdk.internal.oc
    public void storePicture(String str) {
        isFeatureSupported("storePicture");
    }

    @Override // com.startapp.sdk.internal.oc
    public abstract void useCustomClose(String str);
}
