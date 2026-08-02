package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707nm {

    /* renamed from: A, reason: collision with root package name */
    public final Map f7955A;

    /* renamed from: B, reason: collision with root package name */
    public final I9 f7956B;

    /* renamed from: a, reason: collision with root package name */
    public final String f7957a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7958b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7959c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7960d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7961e;
    public final List f;

    /* renamed from: g, reason: collision with root package name */
    public final List f7962g;

    /* renamed from: h, reason: collision with root package name */
    public final List f7963h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f7964i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7965j;

    /* renamed from: k, reason: collision with root package name */
    public final String f7966k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7967l;

    /* renamed from: m, reason: collision with root package name */
    public final C0818s4 f7968m;

    /* renamed from: n, reason: collision with root package name */
    public final long f7969n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7970p;

    /* renamed from: q, reason: collision with root package name */
    public final String f7971q;

    /* renamed from: r, reason: collision with root package name */
    public final Km f7972r;

    /* renamed from: s, reason: collision with root package name */
    public final De f7973s;

    /* renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f7974t;

    /* renamed from: u, reason: collision with root package name */
    public final long f7975u;
    public final long v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f7976w;

    /* renamed from: x, reason: collision with root package name */
    public final C0636l3 f7977x;

    /* renamed from: y, reason: collision with root package name */
    public final C0868u2 f7978y;
    public final Gm z;

    public C0707nm(C0681mm c0681mm) {
        String str;
        long j3;
        long j4;
        Gm gm;
        Map map;
        I9 i9;
        this.f7957a = c0681mm.f7890a;
        List list = c0681mm.f7891b;
        this.f7958b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f7959c = c0681mm.f7892c;
        this.f7960d = c0681mm.f7893d;
        this.f7961e = c0681mm.f7894e;
        List list2 = c0681mm.f;
        this.f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c0681mm.f7895g;
        this.f7962g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c0681mm.f7896h;
        this.f7963h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map2 = c0681mm.f7897i;
        this.f7964i = map2 != null ? CollectionUtils.unmodifiableMapCopy(map2) : null;
        this.f7965j = c0681mm.f7898j;
        this.f7966k = c0681mm.f7899k;
        this.f7968m = c0681mm.f7901m;
        this.f7973s = c0681mm.f7902n;
        this.f7969n = c0681mm.o;
        this.o = c0681mm.f7903p;
        this.f7967l = c0681mm.f7900l;
        this.f7970p = c0681mm.f7904q;
        str = c0681mm.f7905r;
        this.f7971q = str;
        this.f7972r = c0681mm.f7906s;
        j3 = c0681mm.f7907t;
        this.f7975u = j3;
        j4 = c0681mm.f7908u;
        this.v = j4;
        this.f7976w = c0681mm.v;
        RetryPolicyConfig retryPolicyConfig = c0681mm.f7909w;
        if (retryPolicyConfig == null) {
            Am am = new Am();
            this.f7974t = new RetryPolicyConfig(am.f5789w, am.f5790x);
        } else {
            this.f7974t = retryPolicyConfig;
        }
        this.f7977x = c0681mm.f7910x;
        this.f7978y = c0681mm.f7911y;
        gm = c0681mm.z;
        this.z = gm == null ? new Gm(O7.f6402b.f8648a) : c0681mm.z;
        map = c0681mm.f7888A;
        this.f7955A = map == null ? Collections.EMPTY_MAP : c0681mm.f7888A;
        i9 = c0681mm.f7889B;
        this.f7956B = i9;
    }

    public final C0681mm a(C0818s4 c0818s4) {
        C0681mm c0681mm = new C0681mm(c0818s4);
        c0681mm.f7890a = this.f7957a;
        c0681mm.f = this.f;
        c0681mm.f7895g = this.f7962g;
        c0681mm.f7898j = this.f7965j;
        c0681mm.f7891b = this.f7958b;
        c0681mm.f7892c = this.f7959c;
        c0681mm.f7893d = this.f7960d;
        c0681mm.f7894e = this.f7961e;
        c0681mm.f7896h = this.f7963h;
        c0681mm.f7897i = this.f7964i;
        c0681mm.f7899k = this.f7966k;
        c0681mm.f7900l = this.f7967l;
        c0681mm.f7904q = this.f7970p;
        c0681mm.o = this.f7969n;
        c0681mm.f7903p = this.o;
        c0681mm.f7905r = this.f7971q;
        c0681mm.f7902n = this.f7973s;
        c0681mm.f7907t = this.f7975u;
        c0681mm.f7908u = this.v;
        c0681mm.f7906s = this.f7972r;
        c0681mm.v = this.f7976w;
        c0681mm.f7909w = this.f7974t;
        c0681mm.f7910x = this.f7977x;
        c0681mm.f7911y = this.f7978y;
        c0681mm.z = this.z;
        c0681mm.f7888A = this.f7955A;
        c0681mm.f7889B = this.f7956B;
        return c0681mm;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f7957a + "', reportUrls=" + this.f7958b + ", getAdUrl='" + this.f7959c + "', reportAdUrl='" + this.f7960d + "', certificateUrl='" + this.f7961e + "', hostUrlsFromStartup=" + this.f + ", hostUrlsFromClient=" + this.f7962g + ", diagnosticUrls=" + this.f7963h + ", customSdkHosts=" + this.f7964i + ", encodedClidsFromResponse='" + this.f7965j + "', lastClientClidsForStartupRequest='" + this.f7966k + "', lastChosenForRequestClids='" + this.f7967l + "', collectingFlags=" + this.f7968m + ", obtainTime=" + this.f7969n + ", hadFirstStartup=" + this.o + ", startupDidNotOverrideClids=" + this.f7970p + ", countryInit='" + this.f7971q + "', statSending=" + this.f7972r + ", permissionsCollectingConfig=" + this.f7973s + ", retryPolicyConfig=" + this.f7974t + ", obtainServerTime=" + this.f7975u + ", firstStartupServerTime=" + this.v + ", outdated=" + this.f7976w + ", cacheControl=" + this.f7977x + ", attributionConfig=" + this.f7978y + ", startupUpdateConfig=" + this.z + ", modulesRemoteConfigs=" + this.f7955A + ", externalAttributionConfig=" + this.f7956B + '}';
    }
}
