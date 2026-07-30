package com.anythink.core.b;

import android.text.TextUtils;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.bv;
import com.google.android.gms.internal.ads.CL;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    private static f f11998e;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, Integer> f12000b;

    /* renamed from: f, reason: collision with root package name */
    private MediationBidManager f12003f;

    /* renamed from: d, reason: collision with root package name */
    private final String f12002d = "f";

    /* renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, ad> f11999a = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    List<Integer> f12001c = new CopyOnWriteArrayList();

    private f() {
    }

    public static f a() {
        if (f11998e == null) {
            f11998e = new f();
        }
        return f11998e;
    }

    public final MediationBidManager b() {
        return this.f12003f;
    }

    private boolean b(String str) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.f12000b;
        if (concurrentHashMap == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_c2sfirstStatus");
        return concurrentHashMap.get(sb.toString()) == null;
    }

    public final boolean b(int i) {
        boolean z8;
        synchronized (this.f12001c) {
            z8 = !this.f12001c.contains(Integer.valueOf(i));
        }
        return z8;
    }

    private void a(String str, bv bvVar, ad adVar) {
        ConcurrentHashMap<String, ad> concurrentHashMap = this.f11999a;
        StringBuilder b9 = AbstractC5088e.b(str);
        b9.append(adVar.f13585k);
        concurrentHashMap.put(b9.toString(), adVar);
        if (bvVar.am()) {
            com.anythink.core.common.a.a.a().a(str, adVar);
        }
    }

    public final void a(String str, ad adVar) {
        if (adVar == null) {
            return;
        }
        ConcurrentHashMap<String, ad> concurrentHashMap = this.f11999a;
        StringBuilder b9 = AbstractC5088e.b(str);
        b9.append(adVar.f13585k);
        ad adVar2 = concurrentHashMap.get(b9.toString());
        if (adVar2 == null || !TextUtils.equals(adVar.token, adVar2.token)) {
            return;
        }
        ConcurrentHashMap<String, ad> concurrentHashMap2 = this.f11999a;
        StringBuilder b10 = AbstractC5088e.b(str);
        b10.append(adVar.f13585k);
        concurrentHashMap2.remove(b10.toString());
    }

    public final ad a(String str, bv bvVar) {
        ConcurrentHashMap<String, ad> concurrentHashMap = this.f11999a;
        StringBuilder b9 = AbstractC5088e.b(str);
        b9.append(bvVar.z());
        ad adVar = concurrentHashMap.get(b9.toString());
        if (bvVar.am() && adVar == null) {
            adVar = com.anythink.core.common.a.a.a().a(str, bvVar.z());
            if (adVar != null) {
                bvVar.toString();
                ConcurrentHashMap<String, ad> concurrentHashMap2 = this.f11999a;
                StringBuilder b10 = AbstractC5088e.b(str);
                b10.append(bvVar.z());
                concurrentHashMap2.put(b10.toString(), adVar);
                return adVar;
            }
            bvVar.toString();
        }
        return adVar;
    }

    public final void a(MediationBidManager mediationBidManager) {
        this.f12003f = mediationBidManager;
    }

    private void a(String str) {
        if (this.f12000b == null) {
            this.f12000b = new ConcurrentHashMap<>();
        }
        this.f12000b.put(CL.j(str, "_c2sfirstStatus"), 1);
    }

    public final void a(int i) {
        synchronized (this.f12001c) {
            try {
                if (!this.f12001c.contains(Integer.valueOf(i))) {
                    this.f12001c.add(Integer.valueOf(i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
