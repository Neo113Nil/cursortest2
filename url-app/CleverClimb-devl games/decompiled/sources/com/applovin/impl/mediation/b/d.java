package com.applovin.impl.mediation.b;

import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.e.i;
import com.applovin.impl.sdk.j;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class d extends com.applovin.impl.sdk.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f2731a;

    /* renamed from: c, reason: collision with root package name */
    private final String f2732c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.mediation.a.e f2733d;
    private final Map<String, String> e;
    private final String f;
    private final String g;
    private final boolean h;

    public d(String str, Map<String, String> map, int i, String str2, com.applovin.impl.mediation.a.e eVar, j jVar) {
        super("TaskFireMediationPostbacks", jVar);
        this.f2731a = str;
        this.f2732c = str + "_urls";
        this.e = map;
        this.f = String.valueOf(i);
        this.g = i.c(str2);
        this.f2733d = eVar;
        this.h = eVar.d(this.f2732c);
    }

    private com.applovin.impl.sdk.network.f a(String str, String str2, String str3) {
        return com.applovin.impl.sdk.network.f.b(b()).a(c(str, str2, str3)).a(false).a();
    }

    private com.applovin.impl.sdk.network.e b(String str, String str2, String str3) {
        return com.applovin.impl.sdk.network.e.j().a(c(str, str2, str3)).a(false).a();
    }

    private String c(String str, String str2, String str3) {
        return str.replace("{ERROR_CODE}", str2).replace("{ERROR_MESSAGE}", i.e(str3));
    }

    private void f() {
        try {
            final List<String> b2 = this.f2733d.b(this.f2732c, this.e);
            if (b2 == null || b2.isEmpty()) {
                a("No postbacks to fire for event: " + this.f2731a);
                return;
            }
            a("Firing " + b2.size() + " '" + this.f2731a + "' postback(s)");
            final AtomicInteger atomicInteger = new AtomicInteger();
            Iterator<String> it = b2.iterator();
            while (it.hasNext()) {
                b().J().dispatchPostbackRequest(a(it.next(), this.f, this.g), q.a.MEDIATION_POSTBACKS, new AppLovinPostbackListener() { // from class: com.applovin.impl.mediation.b.d.1
                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackFailure(String str, int i) {
                        d.this.d("Failed to fire postback: " + str);
                    }

                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackSuccess(String str) {
                        d.this.a("Successfully fired postback: " + str);
                        if (atomicInteger.incrementAndGet() == b2.size()) {
                            d.this.h();
                        }
                    }
                });
            }
        } catch (Throwable th) {
            a("Unable to create postback URL for mediated '" + this.f2731a + "'", th);
        }
    }

    private void g() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f2733d.b(this.f2732c, this.e));
            if (this.h) {
                arrayList.addAll(this.f2733d.a(this.f2732c, this.e));
            }
            if (arrayList.isEmpty()) {
                a("No persistent postbacks to fire for event: " + this.f2731a);
                return;
            }
            a("Firing " + arrayList.size() + " '" + this.f2731a + "' persistent postback(s)");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b().F().a(b((String) it.next(), this.f, this.g));
            }
        } catch (Throwable th) {
            a("Unable to create persistent postback URL for mediated '" + this.f2731a + "'", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.h) {
            List<String> a2 = this.f2733d.a(this.f2732c, this.e);
            if (a2 == null || a2.isEmpty()) {
                a("Skip firing of successive urls - none found");
                return;
            }
            a("Firing " + a2.size() + " '" + this.f2731a + "' successive postback(s)");
            Iterator<String> it = a2.iterator();
            while (it.hasNext()) {
                b().J().dispatchPostbackRequest(a(it.next(), this.f, this.g), q.a.MEDIATION_POSTBACKS, null);
            }
        }
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.I;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (((Boolean) b().a(com.applovin.impl.sdk.b.a.i)).booleanValue()) {
            g();
        } else {
            f();
        }
    }
}
