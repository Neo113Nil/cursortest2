package com.applovin.impl.sdk.network;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.e.i;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final j f3337a;

    /* renamed from: b, reason: collision with root package name */
    private final p f3338b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<e> f3339c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<e> f3340d;
    private final Object e;
    private final SharedPreferences f;

    public d(j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f3337a = jVar;
        this.f3338b = jVar.u();
        this.f = jVar.w().getSharedPreferences("com.applovin.sdk.impl.postbackQueue.domain", 0);
        this.e = new Object();
        this.f3339c = c();
        this.f3340d = new ArrayList<>();
    }

    private void b(e eVar) {
        synchronized (this.e) {
            if (this.f3339c.size() < ((Integer) this.f3337a.a(com.applovin.impl.sdk.b.b.dC)).intValue()) {
                this.f3339c.add(eVar);
                d();
                this.f3338b.a("PersistentPostbackManager", "Enqueued postback: " + eVar);
            } else {
                this.f3338b.c("PersistentPostbackManager", "Persistent queue has reached maximum size; postback retried in memory only." + eVar);
            }
        }
    }

    private ArrayList<e> c() {
        e eVar;
        Set<String> set = (Set) this.f3337a.b(com.applovin.impl.sdk.b.d.g, new LinkedHashSet(0), this.f);
        ArrayList<e> arrayList = new ArrayList<>(Math.max(1, set.size()));
        int intValue = ((Integer) this.f3337a.a(com.applovin.impl.sdk.b.b.dD)).intValue();
        this.f3338b.a("PersistentPostbackManager", "Deserializing " + set.size() + " postback(s).");
        for (String str : set) {
            try {
                eVar = new e(new JSONObject(str), this.f3337a);
            } catch (Throwable th) {
                this.f3338b.b("PersistentPostbackManager", "Unable to deserialize postback request from json: " + str, th);
            }
            if ((!((Boolean) this.f3337a.a(com.applovin.impl.sdk.b.b.dE)).booleanValue() || eVar.f() >= intValue) && eVar.f() <= intValue) {
                this.f3338b.a("PersistentPostbackManager", "Skipping deserialization because maximum attempt count exceeded for postback: " + eVar);
            }
            arrayList.add(eVar);
        }
        this.f3338b.a("PersistentPostbackManager", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
        return arrayList;
    }

    private void c(final e eVar) {
        this.f3338b.a("PersistentPostbackManager", "Preparing to submit postback..." + eVar);
        if (this.f3337a.c()) {
            this.f3338b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
            return;
        }
        synchronized (this.e) {
            eVar.g();
            d();
        }
        int intValue = ((Integer) this.f3337a.a(com.applovin.impl.sdk.b.b.dD)).intValue();
        if (eVar.f() <= intValue) {
            this.f3337a.J().dispatchPostbackRequest(f.b(this.f3337a).a(eVar.a()).b(eVar.d()).c(eVar.b()).a(eVar.c() != null ? new JSONObject(eVar.c()) : null).a(eVar.e()).a(), new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.network.d.1
                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackFailure(String str, int i) {
                    d.this.f3338b.b("PersistentPostbackManager", "Failed to submit postback with errorCode " + i + ". Will retry later...  Postback: " + eVar);
                    d.this.e(eVar);
                }

                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackSuccess(String str) {
                    d.this.d(eVar);
                    d.this.f3338b.a("PersistentPostbackManager", "Successfully submitted postback: " + eVar);
                    d.this.b();
                }
            });
            return;
        }
        this.f3338b.c("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + intValue + ". Dequeuing postback: " + eVar);
        d(eVar);
    }

    private void d() {
        p pVar;
        String str;
        String str2;
        if (com.applovin.impl.sdk.e.d.b()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f3339c.size());
            Iterator<e> it = this.f3339c.iterator();
            while (it.hasNext()) {
                try {
                    linkedHashSet.add(it.next().i().toString());
                } catch (Throwable th) {
                    this.f3338b.b("PersistentPostbackManager", "Unable to serialize postback request to JSON.", th);
                }
            }
            this.f3337a.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<HashSet>>) com.applovin.impl.sdk.b.d.g, (com.applovin.impl.sdk.b.d<HashSet>) linkedHashSet, this.f);
            pVar = this.f3338b;
            str = "PersistentPostbackManager";
            str2 = "Wrote updated postback queue to disk.";
        } else {
            pVar = this.f3338b;
            str = "PersistentPostbackManager";
            str2 = "Skipping writing postback queue to disk due to old Android version...";
        }
        pVar.a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(e eVar) {
        synchronized (this.e) {
            this.f3339c.remove(eVar);
            d();
        }
        this.f3338b.a("PersistentPostbackManager", "Dequeued successfully transmitted postback: " + eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(e eVar) {
        synchronized (this.e) {
            this.f3340d.add(eVar);
        }
    }

    public void a() {
        synchronized (this.e) {
            if (this.f3339c != null) {
                Iterator it = new ArrayList(this.f3339c).iterator();
                while (it.hasNext()) {
                    c((e) it.next());
                }
            }
        }
    }

    public void a(e eVar) {
        a(eVar, true);
    }

    public void a(e eVar, boolean z) {
        if (i.b(eVar.a())) {
            if (z) {
                eVar.h();
            }
            synchronized (this.e) {
                b(eVar);
                c(eVar);
            }
        }
    }

    public void b() {
        synchronized (this.e) {
            Iterator<e> it = this.f3340d.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
            this.f3340d.clear();
        }
    }
}
