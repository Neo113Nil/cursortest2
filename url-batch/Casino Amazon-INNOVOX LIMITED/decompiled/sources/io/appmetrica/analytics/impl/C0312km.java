package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.km, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0312km {
    public final Map A;
    public final C9 B;

    /* renamed from: a, reason: collision with root package name */
    public final String f1347a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;
    public final Map i;
    public final String j;
    public final String k;
    public final String l;
    public final C0345m4 m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final Hm r;
    public final C0654ye s;
    public final RetryPolicyConfig t;
    public final long u;
    public final long v;
    public final boolean w;
    public final C0138e3 x;
    public final C0368n2 y;
    public final Dm z;

    public C0312km(C0286jm c0286jm) {
        String str;
        long j;
        long j2;
        Dm dm;
        Map map;
        C9 c9;
        this.f1347a = c0286jm.f1327a;
        List list = c0286jm.b;
        this.b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.c = c0286jm.c;
        this.d = c0286jm.d;
        this.e = c0286jm.e;
        List list2 = c0286jm.f;
        this.f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c0286jm.g;
        this.g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c0286jm.h;
        this.h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map2 = c0286jm.i;
        this.i = map2 != null ? CollectionUtils.unmodifiableMapCopy(map2) : null;
        this.j = c0286jm.j;
        this.k = c0286jm.k;
        this.m = c0286jm.m;
        this.s = c0286jm.n;
        this.n = c0286jm.o;
        this.o = c0286jm.p;
        this.l = c0286jm.l;
        this.p = c0286jm.q;
        str = c0286jm.r;
        this.q = str;
        this.r = c0286jm.s;
        j = c0286jm.t;
        this.u = j;
        j2 = c0286jm.u;
        this.v = j2;
        this.w = c0286jm.v;
        RetryPolicyConfig retryPolicyConfig = c0286jm.w;
        if (retryPolicyConfig == null) {
            C0637xm c0637xm = new C0637xm();
            this.t = new RetryPolicyConfig(c0637xm.w, c0637xm.x);
        } else {
            this.t = retryPolicyConfig;
        }
        this.x = c0286jm.x;
        this.y = c0286jm.y;
        dm = c0286jm.z;
        this.z = dm == null ? new Dm(J7.b.f1540a) : c0286jm.z;
        map = c0286jm.A;
        this.A = map == null ? Collections.emptyMap() : c0286jm.A;
        c9 = c0286jm.B;
        this.B = c9;
    }

    public final C0286jm a(C0345m4 c0345m4) {
        C0286jm c0286jm = new C0286jm(c0345m4);
        c0286jm.f1327a = this.f1347a;
        c0286jm.f = this.f;
        c0286jm.g = this.g;
        c0286jm.j = this.j;
        c0286jm.b = this.b;
        c0286jm.c = this.c;
        c0286jm.d = this.d;
        c0286jm.e = this.e;
        c0286jm.h = this.h;
        c0286jm.i = this.i;
        c0286jm.k = this.k;
        c0286jm.l = this.l;
        c0286jm.q = this.p;
        c0286jm.o = this.n;
        c0286jm.p = this.o;
        c0286jm.r = this.q;
        c0286jm.n = this.s;
        c0286jm.t = this.u;
        c0286jm.u = this.v;
        c0286jm.s = this.r;
        c0286jm.v = this.w;
        c0286jm.w = this.t;
        c0286jm.x = this.x;
        c0286jm.y = this.y;
        c0286jm.z = this.z;
        c0286jm.A = this.A;
        c0286jm.B = this.B;
        return c0286jm;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f1347a + "', reportUrls=" + this.b + ", getAdUrl='" + this.c + "', reportAdUrl='" + this.d + "', certificateUrl='" + this.e + "', hostUrlsFromStartup=" + this.f + ", hostUrlsFromClient=" + this.g + ", diagnosticUrls=" + this.h + ", customSdkHosts=" + this.i + ", encodedClidsFromResponse='" + this.j + "', lastClientClidsForStartupRequest='" + this.k + "', lastChosenForRequestClids='" + this.l + "', collectingFlags=" + this.m + ", obtainTime=" + this.n + ", hadFirstStartup=" + this.o + ", startupDidNotOverrideClids=" + this.p + ", countryInit='" + this.q + "', statSending=" + this.r + ", permissionsCollectingConfig=" + this.s + ", retryPolicyConfig=" + this.t + ", obtainServerTime=" + this.u + ", firstStartupServerTime=" + this.v + ", outdated=" + this.w + ", cacheControl=" + this.x + ", attributionConfig=" + this.y + ", startupUpdateConfig=" + this.z + ", modulesRemoteConfigs=" + this.A + ", externalAttributionConfig=" + this.B + AbstractJsonLexerKt.END_OBJ;
    }
}
