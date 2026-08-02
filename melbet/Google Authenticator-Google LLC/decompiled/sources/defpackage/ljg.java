package defpackage;

import android.content.Context;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;
import org.chromium.net.VersionSafeProxyOptions;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljg extends lir {
    private static final AtomicLong m = new AtomicLong(0);

    public ljg(Context context) {
        super(context, liw.d);
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        super.c(str, set, date);
        return this;
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        super.d(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        if (this.e == null) {
            this.e = getDefaultUserAgent();
        }
        return new ljf(this);
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        this.i = z;
        return this;
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        this.h = z;
        return this;
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        super.a(i);
        return this;
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.l = z;
        return this;
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.d = z;
        return this;
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        this.g = z;
        return this;
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    protected final long getLogCronetInitializationRef() {
        AtomicLong atomicLong = m;
        atomicLong.compareAndSet(0L, this.b.a());
        return atomicLong.get();
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        this.k = str;
        return this;
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder setProxyOptionsV2(ProxyOptions proxyOptions) {
        new VersionSafeProxyOptions(proxyOptions);
        return this;
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        super.b(str);
        return this;
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.e = str;
        return this;
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // defpackage.lir, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
