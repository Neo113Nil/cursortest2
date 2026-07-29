package com.applovin.impl.sdk.d;

import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class s extends com.applovin.impl.sdk.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinAdLoadListener f3131a;

    /* renamed from: c, reason: collision with root package name */
    private final a f3132c;

    private static final class a extends com.applovin.impl.a.c {
        a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar) {
            super(jSONObject, jSONObject2, bVar, jVar);
        }

        void a(com.applovin.impl.sdk.e.m mVar) {
            if (mVar == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f2399a.add(mVar);
        }
    }

    private static final class b extends s {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f3133a;

        b(com.applovin.impl.a.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
            super(cVar, appLovinAdLoadListener, jVar);
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f3133a = cVar.c();
        }

        @Override // com.applovin.impl.sdk.d.a
        public com.applovin.impl.sdk.c.i a() {
            return com.applovin.impl.sdk.c.i.r;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.a.d dVar;
            a("Processing SDK JSON response...");
            String a2 = com.applovin.impl.sdk.e.f.a(this.f3133a, "xml", (String) null, this.f3073b);
            if (!com.applovin.impl.sdk.e.i.b(a2)) {
                d("No VAST response received.");
                dVar = com.applovin.impl.a.d.NO_WRAPPER_RESPONSE;
            } else {
                if (a2.length() < ((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.eK)).intValue()) {
                    try {
                        a(com.applovin.impl.sdk.e.n.a(a2, this.f3073b));
                        return;
                    } catch (Throwable th) {
                        a("Unable to parse VAST response", th);
                        a(com.applovin.impl.a.d.XML_PARSING);
                        this.f3073b.E().a(a());
                        return;
                    }
                }
                d("VAST response is over max length");
                dVar = com.applovin.impl.a.d.XML_PARSING;
            }
            a(dVar);
        }
    }

    private static final class c extends s {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.e.m f3134a;

        c(com.applovin.impl.sdk.e.m mVar, com.applovin.impl.a.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
            super(cVar, appLovinAdLoadListener, jVar);
            if (mVar == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (cVar == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f3134a = mVar;
        }

        @Override // com.applovin.impl.sdk.d.a
        public com.applovin.impl.sdk.c.i a() {
            return com.applovin.impl.sdk.c.i.s;
        }

        @Override // java.lang.Runnable
        public void run() {
            a("Processing VAST Wrapper response...");
            a(this.f3134a);
        }
    }

    s(com.applovin.impl.a.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskProcessVastResponse", jVar);
        if (cVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f3131a = appLovinAdLoadListener;
        this.f3132c = (a) cVar;
    }

    public static s a(com.applovin.impl.sdk.e.m mVar, com.applovin.impl.a.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        return new c(mVar, cVar, appLovinAdLoadListener, jVar);
    }

    public static s a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        return new b(new a(jSONObject, jSONObject2, bVar, jVar), appLovinAdLoadListener, jVar);
    }

    void a(com.applovin.impl.a.d dVar) {
        d("Failed to process VAST response due to VAST error code " + dVar);
        com.applovin.impl.a.i.a(this.f3132c, this.f3131a, dVar, -6, this.f3073b);
    }

    void a(com.applovin.impl.sdk.e.m mVar) {
        com.applovin.impl.a.d dVar;
        com.applovin.impl.sdk.d.a vVar;
        int a2 = this.f3132c.a();
        a("Finished parsing XML at depth " + a2);
        this.f3132c.a(mVar);
        if (!com.applovin.impl.a.i.a(mVar)) {
            if (com.applovin.impl.a.i.b(mVar)) {
                a("VAST response is inline. Rendering ad...");
                vVar = new v(this.f3132c, this.f3131a, this.f3073b);
                this.f3073b.C().a(vVar);
            } else {
                d("VAST response is an error");
                dVar = com.applovin.impl.a.d.NO_WRAPPER_RESPONSE;
                a(dVar);
            }
        }
        int intValue = ((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.eL)).intValue();
        if (a2 < intValue) {
            a("VAST response is wrapper. Resolving...");
            vVar = new y(this.f3132c, this.f3131a, this.f3073b);
            this.f3073b.C().a(vVar);
        } else {
            d("Reached beyond max wrapper depth of " + intValue);
            dVar = com.applovin.impl.a.d.WRAPPER_LIMIT_REACHED;
            a(dVar);
        }
    }
}
