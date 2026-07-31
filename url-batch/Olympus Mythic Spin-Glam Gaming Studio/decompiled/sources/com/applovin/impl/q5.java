package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class q5 extends i5 {
    private final com.applovin.impl.sdk.network.e g;
    private final AppLovinPostbackListener h;
    private final d6.b i;

    class a implements AppLovinPostbackListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i) {
            q5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (q5.this.h != null) {
                q5.this.h.onPostbackSuccess(q5.this.g.f());
            }
        }
    }

    public q5(com.applovin.impl.sdk.network.e eVar, d6.b bVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.g = eVar;
        this.h = appLovinPostbackListener;
        this.i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.g, b());
        bVar.a(this.i);
        b().q0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.g.f())) {
            if (this.g.u()) {
                b().x0().a(this.g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.d(this.b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.g.f(), -900);
        }
    }

    class b extends l6 {
        final String m;

        b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
            this.m = q5.this.g.f();
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, Object obj, int i) {
            if (obj instanceof String) {
                for (String str2 : this.a.c(x4.i0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                r0.c(jSONObject, this.a);
                                r0.b(jSONObject, this.a);
                                r0.a(jSONObject, this.a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (q5.this.h != null) {
                q5.this.h.onPostbackSuccess(this.m);
            }
            if (q5.this.g.t()) {
                this.a.t().a(q5.this.g.s(), this.m, i, obj, null, true);
            }
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i, String str2, Object obj) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Failed to dispatch postback. Error code: " + i + " URL: " + this.m);
            }
            if (q5.this.h != null) {
                q5.this.h.onPostbackFailure(this.m, i);
            }
            if (q5.this.g.t()) {
                this.a.t().a(q5.this.g.s(), this.m, i, obj, str2, false);
            }
        }
    }
}
