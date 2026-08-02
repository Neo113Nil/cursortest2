package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.jm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0725jm {

    /* renamed from: A, reason: collision with root package name */
    public final Map f12154A;

    /* renamed from: B, reason: collision with root package name */
    public final B9 f12155B;

    /* renamed from: a, reason: collision with root package name */
    public final String f12156a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12157b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12158c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12159d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12160e;

    /* renamed from: f, reason: collision with root package name */
    public final List f12161f;

    /* renamed from: g, reason: collision with root package name */
    public final List f12162g;

    /* renamed from: h, reason: collision with root package name */
    public final List f12163h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f12164i;

    /* renamed from: j, reason: collision with root package name */
    public final String f12165j;

    /* renamed from: k, reason: collision with root package name */
    public final String f12166k;

    /* renamed from: l, reason: collision with root package name */
    public final String f12167l;

    /* renamed from: m, reason: collision with root package name */
    public final C0759l4 f12168m;
    public final long n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f12169p;

    /* renamed from: q, reason: collision with root package name */
    public final String f12170q;

    /* renamed from: r, reason: collision with root package name */
    public final Gm f12171r;

    /* renamed from: s, reason: collision with root package name */
    public final C1080xe f12172s;

    /* renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f12173t;

    /* renamed from: u, reason: collision with root package name */
    public final long f12174u;
    public final long v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f12175w;

    /* renamed from: x, reason: collision with root package name */
    public final C0552d3 f12176x;

    /* renamed from: y, reason: collision with root package name */
    public final C0783m2 f12177y;
    public final Cm z;

    public C0725jm(C0699im c0699im) {
        String str;
        long j4;
        long j5;
        Cm cm;
        Map map;
        B9 b9;
        this.f12156a = c0699im.f12056a;
        List list = c0699im.f12057b;
        this.f12157b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f12158c = c0699im.f12058c;
        this.f12159d = c0699im.f12059d;
        this.f12160e = c0699im.f12060e;
        List list2 = c0699im.f12061f;
        this.f12161f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c0699im.f12062g;
        this.f12162g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c0699im.f12063h;
        this.f12163h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map2 = c0699im.f12064i;
        this.f12164i = map2 != null ? CollectionUtils.unmodifiableMapCopy(map2) : null;
        this.f12165j = c0699im.f12065j;
        this.f12166k = c0699im.f12066k;
        this.f12168m = c0699im.f12068m;
        this.f12172s = c0699im.n;
        this.n = c0699im.o;
        this.o = c0699im.f12069p;
        this.f12167l = c0699im.f12067l;
        this.f12169p = c0699im.f12070q;
        str = c0699im.f12071r;
        this.f12170q = str;
        this.f12171r = c0699im.f12072s;
        j4 = c0699im.f12073t;
        this.f12174u = j4;
        j5 = c0699im.f12074u;
        this.v = j5;
        this.f12175w = c0699im.v;
        RetryPolicyConfig retryPolicyConfig = c0699im.f12075w;
        if (retryPolicyConfig == null) {
            C1062wm c1062wm = new C1062wm();
            this.f12173t = new RetryPolicyConfig(c1062wm.f12978w, c1062wm.f12979x);
        } else {
            this.f12173t = retryPolicyConfig;
        }
        this.f12176x = c0699im.f12076x;
        this.f12177y = c0699im.f12077y;
        cm = c0699im.z;
        this.z = cm == null ? new Cm(I7.f10427b.f12855a) : c0699im.z;
        map = c0699im.f12054A;
        this.f12154A = map == null ? Collections.EMPTY_MAP : c0699im.f12054A;
        b9 = c0699im.f12055B;
        this.f12155B = b9;
    }

    public final C0699im a(C0759l4 c0759l4) {
        C0699im c0699im = new C0699im(c0759l4);
        c0699im.f12056a = this.f12156a;
        c0699im.f12061f = this.f12161f;
        c0699im.f12062g = this.f12162g;
        c0699im.f12065j = this.f12165j;
        c0699im.f12057b = this.f12157b;
        c0699im.f12058c = this.f12158c;
        c0699im.f12059d = this.f12159d;
        c0699im.f12060e = this.f12160e;
        c0699im.f12063h = this.f12163h;
        c0699im.f12064i = this.f12164i;
        c0699im.f12066k = this.f12166k;
        c0699im.f12067l = this.f12167l;
        c0699im.f12070q = this.f12169p;
        c0699im.o = this.n;
        c0699im.f12069p = this.o;
        c0699im.f12071r = this.f12170q;
        c0699im.n = this.f12172s;
        c0699im.f12073t = this.f12174u;
        c0699im.f12074u = this.v;
        c0699im.f12072s = this.f12171r;
        c0699im.v = this.f12175w;
        c0699im.f12075w = this.f12173t;
        c0699im.f12076x = this.f12176x;
        c0699im.f12077y = this.f12177y;
        c0699im.z = this.z;
        c0699im.f12054A = this.f12154A;
        c0699im.f12055B = this.f12155B;
        return c0699im;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f12156a + "', reportUrls=" + this.f12157b + ", getAdUrl='" + this.f12158c + "', reportAdUrl='" + this.f12159d + "', certificateUrl='" + this.f12160e + "', hostUrlsFromStartup=" + this.f12161f + ", hostUrlsFromClient=" + this.f12162g + ", diagnosticUrls=" + this.f12163h + ", customSdkHosts=" + this.f12164i + ", encodedClidsFromResponse='" + this.f12165j + "', lastClientClidsForStartupRequest='" + this.f12166k + "', lastChosenForRequestClids='" + this.f12167l + "', collectingFlags=" + this.f12168m + ", obtainTime=" + this.n + ", hadFirstStartup=" + this.o + ", startupDidNotOverrideClids=" + this.f12169p + ", countryInit='" + this.f12170q + "', statSending=" + this.f12171r + ", permissionsCollectingConfig=" + this.f12172s + ", retryPolicyConfig=" + this.f12173t + ", obtainServerTime=" + this.f12174u + ", firstStartupServerTime=" + this.v + ", outdated=" + this.f12175w + ", cacheControl=" + this.f12176x + ", attributionConfig=" + this.f12177y + ", startupUpdateConfig=" + this.z + ", modulesRemoteConfigs=" + this.f12154A + ", externalAttributionConfig=" + this.f12155B + '}';
    }
}
