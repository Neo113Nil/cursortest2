package com.applovin.impl.mediation.c;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f2756a = new ArrayList();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Set<String> f2757a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<String> f2758b;

        private a(Set<String> set, Set<String> set2) {
            this.f2757a = set;
            this.f2758b = set2;
        }

        public Set<String> a() {
            return this.f2757a;
        }

        public Set<String> b() {
            return this.f2758b;
        }
    }

    static {
        f2756a.add("com.applovin.mediation.adapters.AmazonMediationAdapter");
        f2756a.add("com.applovin.mediation.adapters.AppLovinMediationAdapter");
        f2756a.add("com.applovin.mediation.adapters.FacebookMediationAdapter");
        f2756a.add("com.applovin.mediation.adapters.GoogleMediationAdapter");
        f2756a.add("com.applovin.mediation.adapters.InneractiveMediationAdapter");
        f2756a.add("com.applovin.mediation.adapters.IronSourceMediationAdapter");
        f2756a.add("com.applovin.mediation.adapters.MillennialMediaMediationAdapter");
        f2756a.add("com.applovin.mediation.adapters.MintegralMediationAdapter");
        f2756a.add("com.applovin.mediation.adapters.MoPubMediationAdapter");
        f2756a.add("com.applovin.mediation.adapters.TapjoyMediationAdapter");
        f2756a.add("com.applovin.mediation.adapters.UnityAdsMediationAdapter");
        f2756a.add("com.applovin.mediation.adapters.VungleMediationAdapter");
    }

    public static a a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(f2756a.size());
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(f2756a.size());
        for (String str : f2756a) {
            try {
                Class.forName(str);
                linkedHashSet.add(str);
            } catch (Throwable unused) {
                linkedHashSet2.add(str);
            }
        }
        return new a(linkedHashSet, linkedHashSet2);
    }
}
