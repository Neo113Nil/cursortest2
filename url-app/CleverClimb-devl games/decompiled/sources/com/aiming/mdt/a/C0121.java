package com.aiming.mdt.a;

import android.app.Activity;
import com.aiming.mdt.core.C0261;
import com.aiming.mdt.interactive.InteractiveAdListener;
import com.aiming.mdt.mediation.CustomInteractiveEvent;
import com.aiming.mdt.utils.C0282;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʼʽʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0121 extends C0261 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private Map<String, C0132> f371;

    /* renamed from: com.aiming.mdt.a.ʼʽʿˉ$ʻʽ, reason: contains not printable characters */
    static final class C0122 {

        /* renamed from: ʻʼ, reason: contains not printable characters */
        private static final C0121 f372 = new C0121(0);
    }

    private C0121() {
        this.f371 = new HashMap();
    }

    /* synthetic */ C0121(byte b2) {
        this();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static C0121 m465() {
        return C0122.f372;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    final void m466(Activity activity, String str, C0088 c0088) {
        CustomInteractiveEvent customInteractiveEvent = (CustomInteractiveEvent) C0261.m906().m910(3, c0088);
        if (customInteractiveEvent != null) {
            customInteractiveEvent.destroy(activity);
            C0261.m906().m914(c0088);
        }
        if (m907(str) != null) {
            m915(str);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m467(Activity activity, String str) {
        if (activity == null) {
            return;
        }
        try {
            C0088 m907 = m907(str);
            if (m907 != null) {
                CustomInteractiveEvent customInteractiveEvent = (CustomInteractiveEvent) C0261.m906().m910(3, m907);
                if (customInteractiveEvent != null && customInteractiveEvent.isReady()) {
                    return;
                } else {
                    m915(str);
                }
            }
            m469(activity, str, null).m898();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("preload error : ");
            sb.append(th.getMessage());
            C0282.m969(sb.toString());
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    final void m468(String str) {
        this.f371.remove(str);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final C0132 m469(Activity activity, String str, InteractiveAdListener interactiveAdListener) {
        C0132 c0132 = this.f371.get(str);
        if (c0132 == null) {
            c0132 = new C0132(activity, str, interactiveAdListener);
            this.f371.put(str, c0132);
        }
        c0132.mo139(activity);
        return c0132;
    }
}
