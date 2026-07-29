package com.aiming.mdt.core;

import android.app.Activity;
import android.text.TextUtils;
import com.aiming.mdt.a.C0027;
import com.aiming.mdt.a.C0045;
import com.aiming.mdt.a.C0088;
import com.aiming.mdt.a.C0111;
import com.aiming.mdt.a.C0121;
import com.aiming.mdt.a.C0131;
import com.aiming.mdt.mediation.CustomAdEvent;
import com.aiming.mdt.mediation.CustomEventFactory;
import com.aiming.mdt.utils.C0282;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.aiming.mdt.core.ʽʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0261 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private Map<C0088, CustomAdEvent> f797 = new HashMap();

    /* renamed from: ʽ, reason: contains not printable characters */
    private Map<String, C0088[]> f798 = new HashMap();

    /* renamed from: ʻ, reason: contains not printable characters */
    private Map<String, C0088> f796 = new HashMap();

    /* renamed from: com.aiming.mdt.core.ʽʾ$ʽ, reason: contains not printable characters */
    static final class C0262 {

        /* renamed from: ʻ, reason: contains not printable characters */
        private static final C0261 f799 = new C0261();
    }

    protected C0261() {
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m905(int i) {
        return i == 2 || i == 3 || i == 4;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static C0261 m906() {
        return C0262.f799;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final C0088 m907(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f796.get(str);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    final void m908(String str) {
        this.f798.remove(str);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    final void m909(String str, C0088[] c0088Arr) {
        if (c0088Arr == null) {
            return;
        }
        this.f798.put(str, c0088Arr);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final CustomAdEvent m910(int i, C0088 c0088) {
        if (c0088 == null) {
            return null;
        }
        try {
            CustomAdEvent customAdEvent = this.f797.get(c0088);
            if (customAdEvent == null) {
                StringBuilder sb = new StringBuilder("get Ins Event by create new : ");
                sb.append(c0088.toString());
                C0282.m971(sb.toString());
                switch (i) {
                    case 0:
                        customAdEvent = CustomEventFactory.createBanner(c0088.m303());
                        break;
                    case 1:
                        customAdEvent = CustomEventFactory.createNative(c0088.m303());
                        break;
                    case 2:
                        customAdEvent = CustomEventFactory.createVideo(c0088.m303());
                        break;
                    case 3:
                        customAdEvent = CustomEventFactory.createInteractive(c0088.m303());
                        break;
                    case 4:
                        customAdEvent = CustomEventFactory.createInterstitial(c0088.m303());
                        break;
                }
                if (c0088 != null && customAdEvent != null) {
                    this.f797.put(c0088, customAdEvent);
                }
            } else {
                StringBuilder sb2 = new StringBuilder("get Ins Event from map: ");
                sb2.append(c0088.toString());
                C0282.m971(sb2.toString());
            }
            return customAdEvent;
        } catch (Exception e) {
            C0282.m972("AdManager", e);
            return null;
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    final void m911(Activity activity, C0131 c0131) {
        Map<String, C0045> m492 = c0131.m492();
        if (m492 == null || m492.isEmpty()) {
            return;
        }
        Iterator<String> it = m492.keySet().iterator();
        while (it.hasNext()) {
            C0045 c0045 = m492.get(it.next());
            if (c0045 != null && m905(c0045.m116())) {
                int m116 = c0045.m116();
                if (m116 == 2) {
                    C0027.m24().m27(activity, String.valueOf(c0045.m124()));
                } else if (m116 == 3) {
                    C0121.m465().m467(activity, c0045.m124());
                } else {
                    C0111.m419().m420(activity, c0045.m124());
                }
            }
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    final C0088[] m912(String str) {
        return this.f798.get(str);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m913(String str, C0088 c0088) {
        if (c0088 == null) {
            return;
        }
        this.f796.put(str, c0088);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m914(C0088 c0088) {
        if (this.f797.isEmpty()) {
            return;
        }
        this.f797.remove(c0088);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void m915(String str) {
        if (this.f796.isEmpty()) {
            return;
        }
        this.f796.remove(str);
    }
}
