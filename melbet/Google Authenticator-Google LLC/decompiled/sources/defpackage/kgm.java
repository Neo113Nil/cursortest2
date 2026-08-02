package defpackage;

import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgm extends kaq {
    public static final Logger b;
    public static final Set c;
    static final boolean d;
    static final boolean e;
    protected static final boolean f;
    public static final kgl g;
    private static final String s;
    private static final String t;
    private static final String u;
    private static String v;
    private ixd A;
    public final String j;
    public final int k;
    public final long l;
    public final kbw m;
    public final kap n;
    public final hab o;
    protected boolean p;
    public boolean q;
    private final String w;
    private final kjm x;
    private boolean y;
    private Executor z;
    public final Random h = new Random();
    protected volatile int r = 1;
    public final AtomicReference i = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(kgm.class.getName());
        b = logger;
        c = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        s = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        t = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        u = property3;
        d = Boolean.parseBoolean(property);
        e = Boolean.parseBoolean(property2);
        f = Boolean.parseBoolean(property3);
        kgl kglVar = null;
        try {
            try {
                try {
                    kgl kglVar2 = (kgl) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, kgm.class.getClassLoader()).asSubclass(kgl.class).getConstructor(null).newInstance(null);
                    if (kglVar2.b() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", kglVar2.b());
                    } else {
                        kglVar = kglVar2;
                    }
                } catch (Exception e2) {
                    b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassCastException e4) {
            b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
        g = kglVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected kgm(String str, kal kalVar, kmh kmhVar, hab habVar, boolean z) {
        long parseLong;
        kalVar.getClass();
        str.getClass();
        URI create = URI.create("//".concat(str));
        hoq.C(create.getHost() != null, "Invalid DNS name: %s", str);
        String authority = create.getAuthority();
        authority.getClass();
        this.w = authority;
        this.j = create.getHost();
        if (create.getPort() == -1) {
            this.k = 443;
        } else {
            this.k = create.getPort();
        }
        Executor executor = kalVar.e;
        if (executor != null) {
            this.x = new kmj(executor, 1);
        } else {
            this.x = new kmj(kmhVar, 0);
        }
        if (z) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            parseLong = 30000000000L;
        } else {
            String property = System.getProperty("networkaddress.cache.ttl");
            if (property != null) {
                try {
                    parseLong = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    b.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
                if (parseLong > 0) {
                    parseLong = TimeUnit.SECONDS.toNanos(parseLong);
                }
            }
            parseLong = 30;
            if (parseLong > 0) {
            }
        }
        this.l = parseLong;
        this.o = habVar;
        this.m = kalVar.b;
        this.n = kalVar.c;
    }

    public static String e() {
        String str = v;
        if (str != null) {
            return str;
        }
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            v = hostName;
            return hostName;
        } catch (UnknownHostException e2) {
            throw new RuntimeException(e2);
        }
    }

    private final void f() {
        if (this.q || this.y) {
            return;
        }
        if (this.p) {
            long j = this.l;
            if (j != 0 && (j <= 0 || this.o.a(TimeUnit.NANOSECONDS) <= j)) {
                return;
            }
        }
        this.q = true;
        this.z.execute(new kgj(this, this.A));
    }

    @Override // defpackage.kaq
    public final String a() {
        return this.w;
    }

    @Override // defpackage.kaq
    public final void b() {
        hoq.I(this.A != null, "not started");
        f();
    }

    @Override // defpackage.kaq
    public final void c() {
        if (this.y) {
            return;
        }
        this.y = true;
        Executor executor = this.z;
        if (executor != null) {
            this.x.b(executor);
            this.z = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.kaq
    public final void d(ixd ixdVar) {
        hoq.I(this.A == null, "already started");
        this.z = this.x.a();
        this.A = ixdVar;
        f();
    }
}
