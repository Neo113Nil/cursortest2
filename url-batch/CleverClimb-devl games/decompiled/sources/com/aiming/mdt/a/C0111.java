package com.aiming.mdt.a;

import android.app.Activity;
import com.aiming.mdt.core.C0261;
import com.aiming.mdt.interstitial.InterstitialAdListener;
import com.aiming.mdt.mediation.CustomInterstitialEvent;
import com.aiming.mdt.utils.C0282;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʼʽʾʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0111 extends C0261 {

    /* renamed from: ʽ, reason: contains not printable characters */
    private Map<String, C0089> f320;

    /* renamed from: com.aiming.mdt.a.ʼʽʾʿˉ$ʻ, reason: contains not printable characters */
    static final class C0112 {

        /* renamed from: ʼ, reason: contains not printable characters */
        private static final C0111 f321 = new C0111(0);
    }

    private C0111() {
        this.f320 = new HashMap();
    }

    /* synthetic */ C0111(byte b2) {
        this();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static C0111 m419() {
        return C0112.f321;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m420(Activity activity, String str) {
        if (activity == null) {
            return;
        }
        try {
            C0088 m907 = m907(str);
            if (m907 != null) {
                CustomInterstitialEvent customInterstitialEvent = (CustomInterstitialEvent) C0261.m906().m910(4, m907);
                if (customInterstitialEvent != null && customInterstitialEvent.isReady()) {
                    return;
                } else {
                    m915(str);
                }
            }
            m423(activity, str, null).m898();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("preload error : ");
            sb.append(th.getMessage());
            C0282.m969(sb.toString());
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    final void m421(Activity activity, String str, C0088 c0088) {
        CustomInterstitialEvent customInterstitialEvent = (CustomInterstitialEvent) C0261.m906().m910(4, c0088);
        if (customInterstitialEvent != null) {
            customInterstitialEvent.destroy(activity);
            C0261.m906().m914(c0088);
        }
        if (m907(str) != null) {
            m915(str);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    final void m422(String str) {
        this.f320.remove(str);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final C0089 m423(Activity activity, String str, InterstitialAdListener interstitialAdListener) {
        C0089 c0089 = this.f320.get(str);
        if (c0089 == null) {
            c0089 = new C0089(activity, str, interstitialAdListener);
            this.f320.put(str, c0089);
        }
        c0089.mo139(activity);
        return c0089;
    }
}
