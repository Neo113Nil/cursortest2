package com.startapp.sdk.internal;

import android.app.Activity;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.net.URLDecoder;
import java.util.Map;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class r1 implements wb {
    private static final String LOG_TAG = "r1";
    protected q1 openListener;

    public r1(q1 q1Var) {
        this.openListener = q1Var;
    }

    public void applyOrientationProperties(Activity activity, fc fcVar) {
        try {
            int i = 0;
            int i2 = activity.getResources().getConfiguration().orientation == 1 ? 1 : 0;
            int i3 = fcVar.b;
            if (i3 == 0) {
                i = 1;
            } else if (i3 != 1) {
                i = fcVar.f237a ? -1 : i2;
            }
            int i4 = m0.f327a;
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            n8.a(th);
        }
    }

    @Override // com.startapp.sdk.internal.wb
    public abstract void close();

    @Override // com.startapp.sdk.internal.wb
    public void createCalendarEvent(String str) {
        isFeatureSupported("calendar");
    }

    @Override // com.startapp.sdk.internal.wb
    public void expand(String str) {
    }

    public abstract boolean isFeatureSupported(String str);

    @Override // com.startapp.sdk.internal.wb
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

    @Override // com.startapp.sdk.internal.wb
    public void playVideo(String str) {
        isFeatureSupported("inlineVideo");
    }

    @Override // com.startapp.sdk.internal.wb
    public void resize() {
    }

    @Override // com.startapp.sdk.internal.wb
    public void setExpandProperties(Map<String, String> map) {
    }

    @Override // com.startapp.sdk.internal.wb
    public abstract void setOrientationProperties(Map<String, String> map);

    @Override // com.startapp.sdk.internal.wb
    public void setResizeProperties(Map<String, String> map) {
    }

    @Override // com.startapp.sdk.internal.wb
    public void storePicture(String str) {
        isFeatureSupported("storePicture");
    }

    @Override // com.startapp.sdk.internal.wb
    public abstract void useCustomClose(String str);
}
