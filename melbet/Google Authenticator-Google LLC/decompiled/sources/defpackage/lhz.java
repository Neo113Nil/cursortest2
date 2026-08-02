package defpackage;

import android.content.Context;
import android.net.http.ConnectionMigrationOptions;
import android.net.http.DnsOptions;
import android.net.http.HttpEngine;
import android.net.http.QuicOptions;
import j$.time.Duration;
import j$.time.TimeConversions;
import j$.util.DateRetargetClass;
import j$.util.DesugarCollections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.chromium.net.AndroidProxyOptions;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhz extends ICronetEngineBuilder {
    private static boolean a;
    private static boolean b;
    private boolean c;
    private final Context d;
    private final HttpEngine.Builder e;

    public lhz(Context context, HttpEngine.Builder builder) {
        this.d = context;
        this.e = builder;
    }

    private static int a(int i) {
        int i2 = i - 1;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 0;
            }
        }
        return i3;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        this.e.addPublicKeyPins(str, set, z, TimeConversions.convert(DateRetargetClass.toInstant(date)));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        this.e.addQuicHint(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        HttpEngine build;
        if (!this.c) {
            setUserAgent(getDefaultUserAgent());
        }
        build = this.e.build();
        return new lia(build);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z) {
        this.e.setEnableBrotli(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z) {
        this.e.setEnableHttp2(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i, long j) {
        this.e.setEnableHttpCache(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        if (!b) {
            b = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.e.setEnablePublicKeyPinningBypassForLocalTrustAnchors(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z) {
        this.e.setEnableQuic(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        String versionString;
        Context context = this.d;
        liw liwVar = liw.e;
        versionString = HttpEngine.getVersionString();
        return ljz.a(context, liwVar, versionString);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set getSupportedConfigOptions() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        ConnectionMigrationOptions build;
        DnsOptions.StaleDnsOptions.Builder allowCrossNetworkUsage;
        DnsOptions.Builder useHttpStackDnsResolver;
        DnsOptions.Builder staleDns;
        DnsOptions.StaleDnsOptions build2;
        DnsOptions.Builder staleDnsOptions;
        DnsOptions.Builder preestablishConnectionsToStaleDnsResults;
        DnsOptions build3;
        QuicOptions build4;
        lkh lkhVar = new lkh(str);
        ConnectionMigrationOptions.Builder builder = new ConnectionMigrationOptions.Builder();
        builder.setDefaultNetworkMigration(a(lkhVar.k()));
        builder.setPathDegradationMigration(a(jay.c((Boolean) lkhVar.f("QUIC", "allow_port_migration", null, Boolean.class))));
        int j = lkhVar.j();
        builder.setAllowNonDefaultNetworkUsage(a(j));
        if (j == 2) {
            builder.setPathDegradationMigration(a(2));
        }
        HttpEngine.Builder builder2 = this.e;
        build = builder.build();
        builder2.setConnectionMigrationOptions(build);
        DnsOptions.StaleDnsOptions.Builder builder3 = new DnsOptions.StaleDnsOptions.Builder();
        int c = lkhVar.c();
        if (c != -1) {
            builder3.setFreshLookupTimeout(TimeConversions.convert(Duration.ofMillis(c)));
        }
        int d = lkhVar.d();
        if (d != -1) {
            builder3.setMaxExpiredDelay(TimeConversions.convert(Duration.ofMillis(d)));
        }
        allowCrossNetworkUsage = builder3.setAllowCrossNetworkUsage(a(lkhVar.l()));
        allowCrossNetworkUsage.setUseStaleOnNameNotResolved(a(lkhVar.o()));
        DnsOptions.Builder builder4 = new DnsOptions.Builder();
        useHttpStackDnsResolver = builder4.setUseHttpStackDnsResolver(a(lkhVar.i()));
        staleDns = useHttpStackDnsResolver.setStaleDns(a(lkhVar.m()));
        build2 = builder3.build();
        staleDnsOptions = staleDns.setStaleDnsOptions(build2);
        preestablishConnectionsToStaleDnsResults = staleDnsOptions.setPreestablishConnectionsToStaleDnsResults(a(jay.c((Boolean) lkhVar.f("QUIC", "race_stale_dns_on_connection", null, Boolean.class))));
        preestablishConnectionsToStaleDnsResults.setPersistHostCache(a(lkhVar.n()));
        int e = lkhVar.e();
        if (e != -1) {
            builder4.setPersistHostCachePeriod(TimeConversions.convert(Duration.ofMillis(e)));
        }
        build3 = builder4.build();
        builder2.setDnsOptions(build3);
        QuicOptions.Builder builder5 = new QuicOptions.Builder();
        if (lkhVar.g() != null) {
            for (String str2 : lkhVar.g().split(",")) {
                builder5.addAllowedQuicHost(str2);
            }
        }
        int b2 = lkhVar.b();
        if (b2 != -1) {
            builder5.setInMemoryServerConfigsCacheSize(b2);
        }
        String str3 = (String) lkhVar.f("QUIC", "user_agent_id", null, String.class);
        if (str3 != null) {
            builder5.setHandshakeUserAgent(str3);
        }
        int a2 = lkhVar.a();
        if (a2 != -1) {
            builder5.setIdleConnectionTimeout(TimeConversions.convert(Duration.ofSeconds(a2)));
        }
        build4 = builder5.build();
        builder2.setQuicOptions(build4);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        if (!a) {
            a = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setProxyOptionsV2(ProxyOptions proxyOptions) {
        AndroidProxyOptions.apply(this.e, proxyOptions);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.e.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.e.setUserAgent(str);
        this.c = str != null;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
