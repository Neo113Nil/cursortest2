package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.jm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2737jm {

    /* renamed from: A, reason: collision with root package name */
    public final Dm f39291A;

    /* renamed from: B, reason: collision with root package name */
    public final Map f39292B;

    /* renamed from: C, reason: collision with root package name */
    public final W9 f39293C;

    /* renamed from: a, reason: collision with root package name */
    public final String f39294a;

    /* renamed from: b, reason: collision with root package name */
    public final List f39295b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39296c;

    /* renamed from: d, reason: collision with root package name */
    public final String f39297d;

    /* renamed from: e, reason: collision with root package name */
    public final String f39298e;

    /* renamed from: f, reason: collision with root package name */
    public final List f39299f;

    /* renamed from: g, reason: collision with root package name */
    public final List f39300g;

    /* renamed from: h, reason: collision with root package name */
    public final List f39301h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f39302i;

    /* renamed from: j, reason: collision with root package name */
    public final String f39303j;

    /* renamed from: k, reason: collision with root package name */
    public final String f39304k;

    /* renamed from: l, reason: collision with root package name */
    public final String f39305l;

    /* renamed from: m, reason: collision with root package name */
    public final G4 f39306m;

    /* renamed from: n, reason: collision with root package name */
    public final long f39307n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f39308o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f39309p;

    /* renamed from: q, reason: collision with root package name */
    public final String f39310q;

    /* renamed from: r, reason: collision with root package name */
    public final Hm f39311r;

    /* renamed from: s, reason: collision with root package name */
    public final Le f39312s;

    /* renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f39313t;

    /* renamed from: u, reason: collision with root package name */
    public final long f39314u;

    /* renamed from: v, reason: collision with root package name */
    public final long f39315v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f39316w;

    /* renamed from: x, reason: collision with root package name */
    public final BillingConfig f39317x;

    /* renamed from: y, reason: collision with root package name */
    public final C3133z3 f39318y;

    /* renamed from: z, reason: collision with root package name */
    public final C2924r2 f39319z;

    public C2737jm(C2711im c2711im) {
        String str;
        long j4;
        long j5;
        Dm dm;
        Map map;
        W9 w9;
        this.f39294a = c2711im.f39218a;
        List list = c2711im.f39219b;
        this.f39295b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f39296c = c2711im.f39220c;
        this.f39297d = c2711im.f39221d;
        this.f39298e = c2711im.f39222e;
        List list2 = c2711im.f39223f;
        this.f39299f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c2711im.f39224g;
        this.f39300g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c2711im.f39225h;
        this.f39301h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map2 = c2711im.f39226i;
        this.f39302i = map2 != null ? CollectionUtils.unmodifiableMapCopy(map2) : null;
        this.f39303j = c2711im.f39227j;
        this.f39304k = c2711im.f39228k;
        this.f39306m = c2711im.f39230m;
        this.f39312s = c2711im.f39231n;
        this.f39307n = c2711im.f39232o;
        this.f39308o = c2711im.f39233p;
        this.f39305l = c2711im.f39229l;
        this.f39309p = c2711im.f39234q;
        str = c2711im.f39235r;
        this.f39310q = str;
        this.f39311r = c2711im.f39236s;
        j4 = c2711im.f39237t;
        this.f39314u = j4;
        j5 = c2711im.f39238u;
        this.f39315v = j5;
        this.f39316w = c2711im.f39239v;
        RetryPolicyConfig retryPolicyConfig = c2711im.f39240w;
        if (retryPolicyConfig == null) {
            C3100xm c3100xm = new C3100xm();
            this.f39313t = new RetryPolicyConfig(c3100xm.f40234w, c3100xm.f40235x);
        } else {
            this.f39313t = retryPolicyConfig;
        }
        this.f39317x = c2711im.f39241x;
        this.f39318y = c2711im.f39242y;
        this.f39319z = c2711im.f39243z;
        dm = c2711im.f39215A;
        this.f39291A = dm == null ? new Dm(AbstractC2539c8.f38772b.f39987a) : c2711im.f39215A;
        map = c2711im.f39216B;
        this.f39292B = map == null ? Collections.EMPTY_MAP : c2711im.f39216B;
        w9 = c2711im.f39217C;
        this.f39293C = w9;
    }

    public final C2711im a(G4 g4) {
        C2711im c2711im = new C2711im(g4);
        c2711im.f39218a = this.f39294a;
        c2711im.f39223f = this.f39299f;
        c2711im.f39224g = this.f39300g;
        c2711im.f39227j = this.f39303j;
        c2711im.f39219b = this.f39295b;
        c2711im.f39220c = this.f39296c;
        c2711im.f39221d = this.f39297d;
        c2711im.f39222e = this.f39298e;
        c2711im.f39225h = this.f39301h;
        c2711im.f39226i = this.f39302i;
        c2711im.f39228k = this.f39304k;
        c2711im.f39229l = this.f39305l;
        c2711im.f39234q = this.f39309p;
        c2711im.f39232o = this.f39307n;
        c2711im.f39233p = this.f39308o;
        c2711im.f39235r = this.f39310q;
        c2711im.f39231n = this.f39312s;
        c2711im.f39237t = this.f39314u;
        c2711im.f39238u = this.f39315v;
        c2711im.f39236s = this.f39311r;
        c2711im.f39239v = this.f39316w;
        c2711im.f39240w = this.f39313t;
        c2711im.f39242y = this.f39318y;
        c2711im.f39241x = this.f39317x;
        c2711im.f39243z = this.f39319z;
        c2711im.f39215A = this.f39291A;
        c2711im.f39216B = this.f39292B;
        c2711im.f39217C = this.f39293C;
        return c2711im;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f39294a + "', reportUrls=" + this.f39295b + ", getAdUrl='" + this.f39296c + "', reportAdUrl='" + this.f39297d + "', certificateUrl='" + this.f39298e + "', hostUrlsFromStartup=" + this.f39299f + ", hostUrlsFromClient=" + this.f39300g + ", diagnosticUrls=" + this.f39301h + ", customSdkHosts=" + this.f39302i + ", encodedClidsFromResponse='" + this.f39303j + "', lastClientClidsForStartupRequest='" + this.f39304k + "', lastChosenForRequestClids='" + this.f39305l + "', collectingFlags=" + this.f39306m + ", obtainTime=" + this.f39307n + ", hadFirstStartup=" + this.f39308o + ", startupDidNotOverrideClids=" + this.f39309p + ", countryInit='" + this.f39310q + "', statSending=" + this.f39311r + ", permissionsCollectingConfig=" + this.f39312s + ", retryPolicyConfig=" + this.f39313t + ", obtainServerTime=" + this.f39314u + ", firstStartupServerTime=" + this.f39315v + ", outdated=" + this.f39316w + ", autoInappCollectingConfig=" + this.f39317x + ", cacheControl=" + this.f39318y + ", attributionConfig=" + this.f39319z + ", startupUpdateConfig=" + this.f39291A + ", modulesRemoteConfigs=" + this.f39292B + ", externalAttributionConfig=" + this.f39293C + '}';
    }
}
