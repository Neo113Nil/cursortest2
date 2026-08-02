package defpackage;

import android.content.Context;
import android.icu.text.IDNA;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.DesugarCollections;
import j$.util.StringJoiner;
import java.io.File;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.ApiVersion;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;
import org.chromium.net.VersionSafeProxyOptions;
import org.chromium.net.impl.ImplVersion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lir extends ICronetEngineBuilder {
    protected final liz b;
    public final Context c;
    public boolean d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public liq j;
    public String k;
    public boolean l;
    private final List n = new ArrayList();
    private final List o = new ArrayList();
    private final liw p;
    private static final Pattern m = Pattern.compile("^[0-9\\.]*$");
    static final int a = jay.g();

    public lir(Context context, liw liwVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.p = liwVar;
        this.b = lja.a(applicationContext, liwVar);
        try {
            this.g = true;
            this.h = true;
            this.i = false;
            a(0);
            this.l = false;
            this.d = true;
            e(uptimeMillis, true, liwVar);
        } catch (Throwable th) {
            e(uptimeMillis, false, liwVar);
            throw th;
        }
    }

    private final void e(long j, boolean z, liw liwVar) {
        if (a >= 30) {
            return;
        }
        liv livVar = new liv();
        livVar.d = false;
        try {
            livVar.h = 2;
            livVar.g = Process.myUid();
            livVar.f = new liy(ImplVersion.getCronetVersion());
            livVar.c = liwVar;
            livVar.e = new liy(ApiVersion.getCronetVersion());
            livVar.a = getLogCronetInitializationRef();
            livVar.d = Boolean.valueOf(z);
        } finally {
            livVar.b = (int) (SystemClock.uptimeMillis() - j);
            this.b.b(livVar);
        }
    }

    public final void a(int i) {
        liq liqVar;
        liq liqVar2 = liq.DISABLED;
        if (i == 0) {
            liqVar = liq.DISABLED;
        } else if (i == 1) {
            liqVar = liq.MEMORY;
        } else if (i == 2) {
            liqVar = liq.DISK_NO_HTTP;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Unknown public builder cache mode");
            }
            liqVar = liq.DISK;
        }
        if (liqVar.e == 1 && this.f == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.j = liqVar;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        c(str, set, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        d(str);
        return this;
    }

    public final void b(String str) {
        if (!new File(str).isDirectory()) {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
        this.f = str;
    }

    public final void c(String str, Set set, Date date) {
        boolean hasErrors;
        Set errors;
        String error;
        str.getClass();
        set.getClass();
        date.getClass();
        if (m.matcher(str).matches()) {
            throw new IllegalArgumentException(a.Z(str, "Hostname ", " is illegal. A hostname should not consist of digits and/or dots only."));
        }
        if (str.length() > 253) {
            throw new IllegalArgumentException(a.Z(str, "Hostname ", " is too long. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
        try {
            IDNA idna = lkk.a;
            if (idna == null) {
                IDN.toASCII(str, 2);
            } else {
                StringBuilder sb = new StringBuilder();
                IDNA.Info info = new IDNA.Info();
                idna.nameToASCII(str, sb, info);
                hasErrors = info.hasErrors();
                if (hasErrors) {
                    StringJoiner stringJoiner = new StringJoiner(", ");
                    errors = info.getErrors();
                    Iterator it = errors.iterator();
                    while (it.hasNext()) {
                        error = a$$ExternalSyntheticApiModelOutline0.m(it.next()).toString();
                        stringJoiner.add(error);
                    }
                    throw new IllegalArgumentException("Failed to convert IDN to ASCII: ".concat(stringJoiner.toString()));
                }
                IDN.toASCII(sb.toString(), 2);
            }
            HashMap hashMap = new HashMap();
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                byte[] bArr = (byte[]) it2.next();
                if (bArr == null || bArr.length != 32) {
                    throw new IllegalArgumentException("Public key pin is invalid");
                }
                hashMap.put(Base64.encodeToString(bArr, 0), bArr);
            }
            List list = this.o;
            list.add(new jax());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(a.Z(str, "Hostname ", " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123."), e);
        }
    }

    public final void d(String str) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(String.valueOf(str)));
        }
        this.n.add(new jax());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        this.i = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        a(i);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.l = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.d = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        this.g = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return ljz.a(this.c, this.p, ImplVersion.getCronetVersion());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    protected long getLogCronetInitializationRef() {
        return 0L;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set getSupportedConfigOptions() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        this.k = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setProxyOptionsV2(ProxyOptions proxyOptions) {
        new VersionSafeProxyOptions(proxyOptions);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        b(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.e = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
