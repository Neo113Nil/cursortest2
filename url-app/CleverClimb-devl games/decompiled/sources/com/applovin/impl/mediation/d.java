package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.p;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final j f2759a;

    /* renamed from: b, reason: collision with root package name */
    private final p f2760b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f2761c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Class<? extends MaxAdapter>> f2762d = new HashMap();
    private final Set<String> e = new HashSet();

    d(j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f2759a = jVar;
        this.f2760b = jVar.u();
    }

    private e a(com.applovin.impl.mediation.a.e eVar, Class<? extends MaxAdapter> cls) {
        try {
            e eVar2 = new e(eVar, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f2759a.K()), this.f2759a);
            if (eVar2.c()) {
                return eVar2;
            }
            this.f2760b.e("MediationAdapterManager", "Adapter is disabled after initialization: " + eVar);
            return null;
        } catch (Throwable th) {
            this.f2760b.c("MediationAdapterManager", "Failed to load adapter: " + eVar, th);
            return null;
        }
    }

    private Class<? extends MaxAdapter> a(String str) {
        p pVar;
        String str2;
        String str3;
        try {
            Class<?> cls = Class.forName(str);
            if (cls == null) {
                pVar = this.f2760b;
                str2 = "MediationAdapterManager";
                str3 = "No class found for " + str;
            } else {
                if (MaxAdapter.class.isAssignableFrom(cls)) {
                    return cls.asSubclass(MaxAdapter.class);
                }
                pVar = this.f2760b;
                str2 = "MediationAdapterManager";
                str3 = str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.";
            }
            pVar.e(str2, str3);
            return null;
        } catch (Throwable th) {
            this.f2760b.c("MediationAdapterManager", "Failed to load: " + str, th);
            return null;
        }
    }

    e a(com.applovin.impl.mediation.a.e eVar) {
        Class<? extends MaxAdapter> a2;
        if (eVar == null) {
            throw new IllegalArgumentException("No adapter spec specified");
        }
        String u = eVar.u();
        String t = eVar.t();
        if (TextUtils.isEmpty(u)) {
            this.f2760b.d("MediationAdapterManager", "No adapter name provided for " + t + ", not loading the adapter ");
            return null;
        }
        if (TextUtils.isEmpty(t)) {
            this.f2760b.d("MediationAdapterManager", "Unable to find default classname for '" + u + "'");
            return null;
        }
        synchronized (this.f2761c) {
            if (this.e.contains(t)) {
                this.f2760b.a("MediationAdapterManager", "Not attempting to load " + u + " due to prior errors");
                return null;
            }
            if (this.f2762d.containsKey(t)) {
                a2 = this.f2762d.get(t);
            } else {
                a2 = a(t);
                if (a2 == null) {
                    this.e.add(t);
                    this.f2760b.e("MediationAdapterManager", "Failed to load adapter classname: " + t);
                    return null;
                }
            }
            e a3 = a(eVar, a2);
            if (a3 != null) {
                this.f2760b.a("MediationAdapterManager", "Loaded " + u);
                this.f2762d.put(t, a2);
                return a3;
            }
            this.f2760b.d("MediationAdapterManager", "Failed to load " + u);
            this.e.add(t);
            return null;
        }
    }

    Collection<String> a() {
        Set unmodifiableSet;
        synchronized (this.f2761c) {
            HashSet hashSet = new HashSet(this.f2762d.size());
            Iterator<Class<? extends MaxAdapter>> it = this.f2762d.values().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getName());
            }
            unmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return unmodifiableSet;
    }

    Collection<String> b() {
        Set unmodifiableSet;
        synchronized (this.f2761c) {
            unmodifiableSet = Collections.unmodifiableSet(this.e);
        }
        return unmodifiableSet;
    }
}
