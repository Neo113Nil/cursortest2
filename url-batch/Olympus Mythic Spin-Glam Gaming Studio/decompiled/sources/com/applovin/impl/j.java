package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.ironsource.C4901tg;
import io.appmetrica.analytics.BuildConfig;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public class j implements AppLovinCommunicatorSubscriber {
    private final com.applovin.impl.sdk.k a;
    private final Object b = new Object();
    private final LinkedHashMap c = new a();
    private final Set d = Collections.synchronizedSet(new HashSet());

    class a extends LinkedHashMap {
        a() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public j(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        if (c()) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).subscribe(this, "safedk_ad_info");
        }
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.b) {
            bundle = (Bundle) this.c.get(str);
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    public void b(b bVar) {
        this.d.remove(bVar);
    }

    public void c(String str) {
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("AdReviewManager", "Removing ad info for serve id: " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.b) {
            this.c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return j.class.getSimpleName();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle(BuildConfig.SDK_BUILD_FLAVOR);
            if (bundle == null) {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            final String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.b) {
                try {
                    this.a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.a.O().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.c.put(string, bundle);
                } catch (Throwable th) {
                    throw th;
                }
            }
            final String string2 = bundle.getString("ad_review_creative_id");
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("AdReviewManager", "Received SafeDK ad info with Ad Review creative id: " + string2);
            }
            if (!StringUtils.isValidString(string2) || this.d.isEmpty()) {
                return;
            }
            HashSet hashSet = new HashSet(this.d);
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("AdReviewManager", "Notifying listeners: " + this.d);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                final b bVar = (b) it.next();
                this.a.q0().a((i5) new r6(this.a, "creativeIdGenerated", new Runnable() { // from class: com.applovin.impl.j$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.this.a(bVar, string, string2);
                    }
                }), d6.b.OTHER);
            }
        }
    }

    public static String b() {
        return b(C4901tg.b);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    private static java.lang.String b(java.lang.String r2) {
        /*
            java.lang.Class<com.applovin.quality.AppLovinQualityService> r0 = com.applovin.quality.AppLovinQualityService.class
            goto L9
        L3:
            java.lang.String r0 = "com.safedk.android.SafeDK"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L15
        L9:
            r1 = 0
            java.lang.reflect.Method r2 = r0.getMethod(r2, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.invoke(r1, r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L15
            return r2
        L15:
            java.lang.String r2 = ""
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j.b(java.lang.String):java.lang.String");
    }

    public static boolean c() {
        return StringUtils.isValidString(b());
    }

    public void a(b bVar) {
        this.d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }
}
