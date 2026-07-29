package com.aiming.mdt.core;

import android.app.Activity;
import android.text.TextUtils;
import com.aiming.mdt.Callback;
import com.aiming.mdt.a.C0026;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.a.C0114;
import com.aiming.mdt.a.C0131;
import com.aiming.mdt.a.C0139;
import com.aiming.mdt.a.C0162;
import com.aiming.mdt.a.C0170;
import com.aiming.mdt.a.C0177;
import com.aiming.mdt.a.C0193;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.core.C0261;
import com.aiming.mdt.utils.AdLog;
import com.aiming.mdt.utils.C0271;
import com.aiming.mdt.utils.C0280;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0285;
import com.aiming.mdt.utils.C0289;
import com.aiming.mdt.utils.Constants;
import com.aiming.mdt.utils.webview.ViewOnAttachStateChangeListenerC0269;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.aiming.mdt.core.ʻʽʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0249 {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static AtomicBoolean f770 = new AtomicBoolean(false);

    /* renamed from: ʻ, reason: contains not printable characters */
    private static AtomicBoolean f769 = new AtomicBoolean(false);

    /* renamed from: ʽ, reason: contains not printable characters */
    private static ConcurrentLinkedQueue<Callback> f771 = new ConcurrentLinkedQueue<>();

    /* renamed from: com.aiming.mdt.core.ʻʽʾ$ʻ, reason: contains not printable characters */
    static class RunnableC0250 implements Runnable {

        /* renamed from: ʻ, reason: contains not printable characters */
        private String f772;

        RunnableC0250(String str) {
            this.f772 = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Activity m429 = C0114.m427().m429();
                String m639 = C0170.m639(m429, this.f772);
                if (!TextUtils.isEmpty(m639)) {
                    C0249.m860(m639);
                    return;
                }
                C0249.m869();
                C0162.m619().m624("AppKey", this.f772);
                C0162.m619().m624("AdtVersion", Constants.SDK_V);
                C0249.m871(m429, this.f772);
            } catch (Exception e) {
                C0282.m972("initOnAsyncThread  exception : ", e);
                C0076.m232().m236(e);
                C0249.m860("AdTiming SDK init failed");
            }
        }
    }

    /* renamed from: com.aiming.mdt.core.ʻʽʾ$ʻʽ, reason: contains not printable characters */
    static class RunnableC0251 implements Runnable {

        /* renamed from: ʻʽ, reason: contains not printable characters */
        private String f773;

        RunnableC0251(String str) {
            this.f773 = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sb = new StringBuilder("Adt init error  ");
            sb.append(this.f773);
            C0282.m971(sb.toString());
            C0249.f770.set(false);
            C0249.f769.set(false);
            if (C0249.f771 != null) {
                Iterator it = C0249.f771.iterator();
                while (it.hasNext()) {
                    Callback callback = (Callback) it.next();
                    if (callback == null) {
                        AdLog singleton = AdLog.getSingleton();
                        StringBuilder sb2 = new StringBuilder("AdTiming SDK init failed ");
                        sb2.append(this.f773);
                        singleton.LogD(sb2.toString());
                    } else {
                        callback.onError(this.f773);
                    }
                }
                C0249.f771.clear();
            }
        }
    }

    /* renamed from: com.aiming.mdt.core.ʻʽʾ$ʼ, reason: contains not printable characters */
    static class RunnableC0252 implements Runnable {
        private RunnableC0252() {
        }

        /* synthetic */ RunnableC0252(byte b2) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0282.m971("Adt init Success ");
            C0249.f770.set(true);
            C0249.f769.set(false);
            C0282.m971("Adt init success");
            if (C0249.f771 != null) {
                Iterator it = C0249.f771.iterator();
                while (it.hasNext()) {
                    Callback callback = (Callback) it.next();
                    if (callback != null) {
                        callback.onSuccess();
                    }
                }
                C0249.f771.clear();
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static /* synthetic */ void m860(String str) {
        C0285.m979(new RunnableC0251(str));
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m861() {
        return f770.get();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    static /* synthetic */ void m863(Activity activity, String str, Callback callback) {
        f769.set(true);
        if (!ViewOnAttachStateChangeListenerC0269.m920().m925(activity)) {
            C0285.m979(new RunnableC0251("AdTiming SDK init failed WebView not support"));
        } else {
            ViewOnAttachStateChangeListenerC0269.m920().m924();
            C0289.m980(new RunnableC0250(str));
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static void m865(Activity activity, String str, Callback callback) {
        if (f770.get()) {
            return;
        }
        if (f771 != null && callback != null) {
            f771.add(callback);
        }
        if (f769.get()) {
            return;
        }
        if (activity == null) {
            C0285.m979(new RunnableC0251("Activity is empty"));
            return;
        }
        C0226.m835(activity);
        C0193.m726().m727(activity);
        C0285.m979(new RunnableC0258(activity, str, callback));
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    static boolean m866() {
        return f769.get();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static /* synthetic */ void m868(Activity activity, String str, C0131 c0131) {
        try {
            C0282.m968(C0226.m829(), c0131.m489() == 1);
            AdLog.getSingleton().init(C0226.m829());
            C0162.m619().m621("Config", c0131);
            C0246.m859(activity, c0131);
            C0076.m232().m235(c0131.m496(), str);
            String format = new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date());
            String str2 = (String) C0162.m619().m622("AL", String.class);
            if ((TextUtils.isEmpty(str2) || !str2.equals(format)) && !TextUtils.isEmpty(str)) {
                String m960 = C0280.m960(3, str);
                if (!TextUtils.isEmpty(m960)) {
                    C0026.m23().m672(m960).m668(C0226.m826()).m665(new C0271(C0280.m963(3, new String[0]))).m671(30000).m667(60000).m669(true).m670(C0226.m829());
                    C0162.m619().m624("AL", format);
                }
            }
            C0261.C0262.f799.m911(activity, c0131);
            C0177.m679(c0131);
        } catch (Exception e) {
            C0282.m972("doAfterGetConfig  exception : ", e);
            C0076.m232().m236(e);
        }
    }

    /* renamed from: ʼʽ, reason: contains not printable characters */
    static /* synthetic */ void m869() {
        C0162.m619().m620(C0226.m829());
        C0139.m535();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static /* synthetic */ void m871(Activity activity, String str) {
        C0282.m971("Adt init request config");
        C0247 c0247 = new C0247(activity, str);
        String m960 = C0280.m960(4, str);
        if (TextUtils.isEmpty(m960)) {
            c0247.mo14("empty Url");
        } else {
            C0026.m23().m672(m960).m668(C0226.m826()).m665(new C0271(C0280.m963(4, new String[0]))).m671(30000).m667(60000).m669(true).m664(c0247).m670(C0226.m829());
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static void m872(Callback callback) {
        if (f771 == null || callback == null) {
            return;
        }
        f771.add(callback);
    }
}
