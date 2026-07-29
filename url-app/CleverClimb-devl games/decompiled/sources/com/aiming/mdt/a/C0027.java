package com.aiming.mdt.a;

import android.app.Activity;
import com.aiming.mdt.core.C0261;
import com.aiming.mdt.mediation.CustomVideoEvent;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.video.VideoAdListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʻʼʽʾʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0027 extends C0261 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private Map<String, C0046> f18;

    /* renamed from: com.aiming.mdt.a.ʻʼʽʾʿˉ$ʼ, reason: contains not printable characters */
    static class C0028 {

        /* renamed from: ʻ, reason: contains not printable characters */
        private static C0027 f19 = new C0027(0);
    }

    private C0027() {
        this.f18 = new HashMap();
    }

    /* synthetic */ C0027(byte b2) {
        this();
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static C0027 m24() {
        return C0028.f19;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final C0046 m25(Activity activity, String str, VideoAdListener videoAdListener) {
        C0046 c0046 = this.f18.get(str);
        if (c0046 == null) {
            c0046 = new C0046(activity, str, videoAdListener);
            this.f18.put(str, c0046);
        }
        c0046.mo139(activity);
        return c0046;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    final void m26(String str) {
        this.f18.remove(str);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m27(Activity activity, String str) {
        if (activity == null) {
            return;
        }
        try {
            C0088 m907 = m907(str);
            if (m907 != null) {
                CustomVideoEvent customVideoEvent = (CustomVideoEvent) C0261.m906().m910(2, m907);
                if (customVideoEvent != null && customVideoEvent.isReady()) {
                    return;
                } else {
                    m915(str);
                }
            }
            m25(activity, str, null).m898();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("preload error : ");
            sb.append(th.getMessage());
            C0282.m969(sb.toString());
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    final void m28(Activity activity, String str, C0088 c0088) {
        if (c0088 == null) {
            return;
        }
        CustomVideoEvent customVideoEvent = (CustomVideoEvent) C0261.m906().m910(2, c0088);
        if (customVideoEvent != null) {
            customVideoEvent.destroy(activity);
            C0261.m906().m914(c0088);
        }
        if (m907(str) != null) {
            m915(str);
        }
    }
}
