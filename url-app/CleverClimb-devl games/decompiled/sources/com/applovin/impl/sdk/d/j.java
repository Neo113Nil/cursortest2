package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.d.q;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j extends a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.f f3095a;

    /* renamed from: c, reason: collision with root package name */
    private final AppLovinPostbackListener f3096c;

    /* renamed from: d, reason: collision with root package name */
    private final q.a f3097d;

    public j(com.applovin.impl.sdk.network.f fVar, q.a aVar, com.applovin.impl.sdk.j jVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", jVar);
        if (fVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f3095a = fVar;
        this.f3096c = appLovinPostbackListener;
        this.f3097d = aVar;
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.f3058c;
    }

    @Override // java.lang.Runnable
    public void run() {
        final String a2 = this.f3095a.a();
        if (com.applovin.impl.sdk.e.i.b(a2)) {
            w<JSONObject> wVar = new w<JSONObject>(this.f3095a, b()) { // from class: com.applovin.impl.sdk.d.j.1
                @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
                public void a(int i) {
                    d("Failed to dispatch postback. Error code: " + i + " URL: " + a2);
                    if (j.this.f3096c != null) {
                        j.this.f3096c.onPostbackFailure(a2, i);
                    }
                }

                @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
                public void a(JSONObject jSONObject, int i) {
                    a("Successfully dispatched postback to URL: " + a2);
                    if (j.this.f3096c != null) {
                        j.this.f3096c.onPostbackSuccess(a2);
                    }
                }
            };
            wVar.a(this.f3097d);
            b().C().a(wVar);
        } else {
            b("Requested URL is not valid; nothing to do...");
            if (this.f3096c != null) {
                this.f3096c.onPostbackFailure(a2, AppLovinErrorCodes.INVALID_URL);
            }
        }
    }
}
