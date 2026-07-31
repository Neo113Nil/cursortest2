package com.chartboost.sdk.impl;

import android.content.Context;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.ScriptInjector;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sc implements el {
    public static final a e = new a(null);
    public final AtomicReference a;
    public final Partner b;
    public volatile boolean c;
    public final tc d;

    public sc(Context applicationContext, dh sharedPrefsHelper, jg resourcesLoader, AtomicReference sdkConfig) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.checkNotNullParameter(resourcesLoader, "resourcesLoader");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.a = sdkConfig;
        Partner createPartner = Partner.createPartner("Chartboost", "9.12.1");
        Intrinsics.checkNotNullExpressionValue(createPartner, "createPartner(...)");
        this.b = createPartner;
        this.d = new tc(sharedPrefsHelper, resourcesLoader);
        Omid.activate(applicationContext);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.chartboost.sdk.impl.el
    public Partner a() {
        return this.b;
    }

    @Override // com.chartboost.sdk.impl.el
    public String a(String adResponseHtml) {
        Intrinsics.checkNotNullParameter(adResponseHtml, "adResponseHtml");
        if (!b()) {
            return adResponseHtml;
        }
        try {
            String injectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(c(), adResponseHtml);
            Intrinsics.checkNotNull(injectScriptContentIntoHtml);
            return injectScriptContentIntoHtml;
        } catch (Throwable unused) {
            return adResponseHtml;
        }
    }

    @Override // com.chartboost.sdk.impl.el
    public boolean isActive() {
        return b() && Omid.isActive();
    }

    @Override // com.chartboost.sdk.impl.el
    public boolean b() {
        sg sgVar;
        ce d;
        return (this.c || (sgVar = (sg) this.a.get()) == null || (d = sgVar.d()) == null || !d.g()) ? false : true;
    }

    @Override // com.chartboost.sdk.impl.el
    public String c() {
        return this.d.a();
    }
}
