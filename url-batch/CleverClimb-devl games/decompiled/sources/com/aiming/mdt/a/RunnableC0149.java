package com.aiming.mdt.a;

import android.content.Context;
import com.aiming.mdt.adt.bean.AdBean;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.Constants;
import com.aiming.mdt.utils.webview.C0265;
import java.util.HashMap;

/* renamed from: com.aiming.mdt.a.ʽʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0149 implements Runnable {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ Context f496;

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ AdBean f497;

    RunnableC0149(Context context, AdBean adBean) {
        this.f496 = context;
        this.f497 = adBean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0265 m604 = ViewOnAttachStateChangeListenerC0159.m599().m604();
            if (m604 == null) {
                m604 = new C0265(this.f496);
            }
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.KEY_CACHE_CONTROL, "no-cache");
            m604.setWebViewClient(new C0023(this, hashMap));
            m604.loadUrl(this.f497.getAdUrl(), hashMap);
        } catch (Throwable th) {
            C0282.m972("AdReport", th);
            C0076.m232().m236(th);
        }
    }
}
