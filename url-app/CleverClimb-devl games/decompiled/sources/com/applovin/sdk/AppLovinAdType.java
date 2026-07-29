package com.applovin.sdk;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class AppLovinAdType {

    /* renamed from: a, reason: collision with root package name */
    private final String f3398a;
    public static final AppLovinAdType REGULAR = new AppLovinAdType("REGULAR");
    public static final AppLovinAdType INCENTIVIZED = new AppLovinAdType("VIDEOA");
    public static final AppLovinAdType NATIVE = new AppLovinAdType("NATIVE");

    public AppLovinAdType(String str) {
        this.f3398a = str;
    }

    public static Set<AppLovinAdType> allTypes() {
        HashSet hashSet = new HashSet(2);
        hashSet.add(REGULAR);
        hashSet.add(INCENTIVIZED);
        return hashSet;
    }

    public static AppLovinAdType fromString(String str) {
        return str.toUpperCase(Locale.ENGLISH).equals(INCENTIVIZED.getLabel()) ? INCENTIVIZED : REGULAR;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppLovinAdType appLovinAdType = (AppLovinAdType) obj;
        if (this.f3398a != null) {
            if (this.f3398a.equals(appLovinAdType.f3398a)) {
                return true;
            }
        } else if (appLovinAdType.f3398a == null) {
            return true;
        }
        return false;
    }

    public String getLabel() {
        return this.f3398a.toUpperCase(Locale.ENGLISH);
    }

    public int hashCode() {
        if (this.f3398a != null) {
            return this.f3398a.hashCode();
        }
        return 0;
    }

    public String toString() {
        return getLabel();
    }
}
