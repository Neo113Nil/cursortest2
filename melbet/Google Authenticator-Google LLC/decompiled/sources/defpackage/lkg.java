package defpackage;

import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import j$.util.concurrent.ThreadLocalRandom;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkg extends liz {
    private static final String a = "lkg";
    private final AtomicInteger b;
    private final lkj c;

    public lkg() {
        lkj lkjVar = new lkj();
        this.b = new AtomicInteger();
        this.c = lkjVar;
    }

    private static int e(liw liwVar) {
        int ordinal = liwVar.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    @Override // defpackage.liz
    public final long a() {
        long nextLong = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
        return nextLong >= -1 ? nextLong + 2 : nextLong;
    }

    @Override // defpackage.liz
    public final void b(liv livVar) {
        int i;
        new cyi("CronetLoggerImpl#logCronetEngineBuilderInitializedInfo", 2, null);
        try {
            long j = livVar.a;
            int i2 = livVar.h;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 != 0) {
                i = i3 != 1 ? 0 : 2;
            } else {
                i = 1;
            }
            int i4 = livVar.b;
            int e = e(livVar.c);
            int c = jay.c(livVar.d) - 1;
            liy liyVar = livVar.e;
            int i5 = liyVar.a;
            int i6 = liyVar.b;
            int i7 = liyVar.c;
            int i8 = liyVar.d;
            liy liyVar2 = livVar.f;
            jay.d(j, i, i4, e, c, i5, i6, i7, i8, liyVar2 == null ? -1 : liyVar2.a, liyVar2 == null ? -1 : liyVar2.b, liyVar2 == null ? -1 : liyVar2.c, liyVar2 != null ? liyVar2.d : -1, livVar.g);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[Catch: all -> 0x01fb, TryCatch #5 {all -> 0x01fb, blocks: (B:22:0x0063, B:24:0x007c, B:26:0x008e, B:28:0x00a8, B:30:0x00ab, B:33:0x00b2, B:35:0x00c5, B:36:0x00c9, B:38:0x00d4, B:40:0x00dc, B:41:0x00e7, B:44:0x01da, B:50:0x01ab, B:53:0x01b9, B:55:0x01c2), top: B:21:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r50v0, types: [lkg] */
    /* JADX WARN: Type inference failed for: r50v1 */
    /* JADX WARN: Type inference failed for: r50v10 */
    /* JADX WARN: Type inference failed for: r50v2 */
    /* JADX WARN: Type inference failed for: r50v3 */
    /* JADX WARN: Type inference failed for: r50v4 */
    /* JADX WARN: Type inference failed for: r50v5 */
    /* JADX WARN: Type inference failed for: r50v6 */
    /* JADX WARN: Type inference failed for: r50v7 */
    /* JADX WARN: Type inference failed for: r50v8 */
    /* JADX WARN: Type inference failed for: r50v9 */
    @Override // defpackage.liz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j, liu liuVar, liy liyVar, liw liwVar) {
        String str;
        int i;
        int i2;
        int i3;
        String str2;
        boolean z;
        boolean z2;
        int i4;
        Object cast;
        if (liwVar == null) {
            return;
        }
        try {
            try {
                new cyi("CronetLoggerImpl#writeCronetEngineCreation", 2, null);
                try {
                    lkh lkhVar = new lkh(liuVar.f);
                    int i5 = liyVar.a;
                    int i6 = liyVar.b;
                    int i7 = liyVar.c;
                    int i8 = liyVar.d;
                    int ordinal = liwVar.ordinal();
                    try {
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                i = 1;
                            } else if (ordinal == 2) {
                                i = 2;
                            } else if (ordinal == 3) {
                                i = 3;
                            } else if (ordinal == 4) {
                                i = 4;
                            }
                            boolean z3 = liuVar.d;
                            boolean z4 = liuVar.c;
                            i2 = liuVar.e;
                            if (i2 != 0) {
                                this = 1;
                                i3 = 1;
                            } else if (i2 == 1) {
                                this = 1;
                                i3 = 2;
                            } else if (i2 != 2) {
                                this = 1;
                                i3 = 4;
                            } else {
                                i3 = 3;
                                this = 1;
                            }
                            boolean z5 = liuVar.a;
                            boolean z6 = liuVar.b;
                            boolean z7 = liuVar.g;
                            str2 = (String) lkhVar.f("QUIC", "connection_options", null, String.class);
                            if (lkh.h(str2)) {
                                ArrayList arrayList = new ArrayList();
                                String[] split = str2.split(",", -1);
                                i4 = -1;
                                int length = split.length;
                                int i9 = 0;
                                while (i9 < length) {
                                    int i10 = i9;
                                    String str3 = split[i10];
                                    boolean z8 = z6;
                                    boolean z9 = z5;
                                    if (lkh.b.contains(str3.toUpperCase(Locale.ROOT).trim())) {
                                        arrayList.add(str3);
                                    }
                                    i9 = i10 + 1;
                                    z5 = z9;
                                    z6 = z8;
                                }
                                z = z6;
                                z2 = z5;
                                StringBuilder sb = new StringBuilder();
                                Iterator it = arrayList.iterator();
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    while (true) {
                                        sb.append((CharSequence) next);
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        sb.append((CharSequence) ",");
                                        next = it.next();
                                    }
                                }
                                str2 = sb.toString();
                            } else {
                                z = z6;
                                z2 = z5;
                                i4 = -1;
                            }
                            String str4 = str2;
                            int c = jay.c((Boolean) lkhVar.f("QUIC", "store_server_configs_in_properties", null, Boolean.class)) - 1;
                            int b = lkhVar.b();
                            int a2 = lkhVar.a();
                            int c2 = jay.c((Boolean) lkhVar.f("QUIC", "goaway_sessions_on_ip_change", null, Boolean.class)) - 1;
                            int c3 = jay.c((Boolean) lkhVar.f("QUIC", "close_sessions_on_ip_change", null, Boolean.class)) - 1;
                            int k = lkhVar.k() - 1;
                            int j2 = lkhVar.j() - 1;
                            int c4 = jay.c((Boolean) lkhVar.f("QUIC", "disable_bidirectional_streams", null, Boolean.class)) - 1;
                            Integer valueOf = Integer.valueOf(i4);
                            int intValue = ((Integer) lkhVar.f("QUIC", "max_time_before_crypto_handshake_seconds", valueOf, Integer.class)).intValue();
                            int intValue2 = ((Integer) lkhVar.f("QUIC", "max_idle_time_before_crypto_handshake_seconds", valueOf, Integer.class)).intValue();
                            int c5 = jay.c((Boolean) lkhVar.f("QUIC", "enable_socket_recv_optimization", null, Boolean.class)) - 1;
                            int i11 = lkhVar.i() - 1;
                            int m = lkhVar.m() - 1;
                            int c6 = lkhVar.c();
                            int d = lkhVar.d();
                            int intValue3 = ((Integer) lkhVar.f("StaleDNS", "max_stale_uses", valueOf, Integer.class)).intValue();
                            int l = lkhVar.l() - 1;
                            int n = lkhVar.n() - 1;
                            int e = lkhVar.e();
                            int o = lkhVar.o() - 1;
                            if (lkhVar.c.length() != 0) {
                                try {
                                    cast = Boolean.class.cast(lkhVar.c.get("disable_ipv6_on_wifi"));
                                } catch (ClassCastException | JSONException e2) {
                                    String str5 = lkh.a;
                                    if (jav.f(str5, 2)) {
                                        String message = e2.getMessage();
                                        Object[] objArr = new Object[2];
                                        objArr[0] = "disable_ipv6_on_wifi";
                                        objArr[this] = message;
                                        jav.d(str5, String.format("Failed to get %s options: %s", objArr), new Object[0]);
                                    }
                                }
                                jay.e(j, i5, i6, i7, i8, i, z3, z4, i3, z2, z, z7, str4, c, b, a2, c2, c3, k, j2, c4, intValue, intValue2, c5, i11, m, c6, d, intValue3, l, n, e, o, jay.c((Boolean) cast) - 1, liuVar.h, Process.myUid());
                                Trace.endSection();
                                return;
                            }
                            cast = null;
                            jay.e(j, i5, i6, i7, i8, i, z3, z4, i3, z2, z, z7, str4, c, b, a2, c2, c3, k, j2, c4, intValue, intValue2, c5, i11, m, c6, d, intValue3, l, n, e, o, jay.c((Boolean) cast) - 1, liuVar.h, Process.myUid());
                            Trace.endSection();
                            return;
                        }
                        boolean z52 = liuVar.a;
                        boolean z62 = liuVar.b;
                        boolean z72 = liuVar.g;
                        str2 = (String) lkhVar.f("QUIC", "connection_options", null, String.class);
                        if (lkh.h(str2)) {
                        }
                        String str42 = str2;
                        int c7 = jay.c((Boolean) lkhVar.f("QUIC", "store_server_configs_in_properties", null, Boolean.class)) - 1;
                        int b2 = lkhVar.b();
                        int a22 = lkhVar.a();
                        int c22 = jay.c((Boolean) lkhVar.f("QUIC", "goaway_sessions_on_ip_change", null, Boolean.class)) - 1;
                        int c32 = jay.c((Boolean) lkhVar.f("QUIC", "close_sessions_on_ip_change", null, Boolean.class)) - 1;
                        int k2 = lkhVar.k() - 1;
                        int j22 = lkhVar.j() - 1;
                        int c42 = jay.c((Boolean) lkhVar.f("QUIC", "disable_bidirectional_streams", null, Boolean.class)) - 1;
                        Integer valueOf2 = Integer.valueOf(i4);
                        int intValue4 = ((Integer) lkhVar.f("QUIC", "max_time_before_crypto_handshake_seconds", valueOf2, Integer.class)).intValue();
                        int intValue22 = ((Integer) lkhVar.f("QUIC", "max_idle_time_before_crypto_handshake_seconds", valueOf2, Integer.class)).intValue();
                        int c52 = jay.c((Boolean) lkhVar.f("QUIC", "enable_socket_recv_optimization", null, Boolean.class)) - 1;
                        int i112 = lkhVar.i() - 1;
                        int m2 = lkhVar.m() - 1;
                        int c62 = lkhVar.c();
                        int d2 = lkhVar.d();
                        int intValue32 = ((Integer) lkhVar.f("StaleDNS", "max_stale_uses", valueOf2, Integer.class)).intValue();
                        int l2 = lkhVar.l() - 1;
                        int n2 = lkhVar.n() - 1;
                        int e3 = lkhVar.e();
                        int o2 = lkhVar.o() - 1;
                        if (lkhVar.c.length() != 0) {
                        }
                        cast = null;
                        jay.e(j, i5, i6, i7, i8, i, z3, z4, i3, z2, z, z72, str42, c7, b2, a22, c22, c32, k2, j22, c42, intValue4, intValue22, c52, i112, m2, c62, d2, intValue32, l2, n2, e3, o2, jay.c((Boolean) cast) - 1, liuVar.h, Process.myUid());
                        Trace.endSection();
                        return;
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        try {
                            Trace.endSection();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                    i = 0;
                    boolean z32 = liuVar.d;
                    boolean z42 = liuVar.c;
                    i2 = liuVar.e;
                    if (i2 != 0) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    this = 1;
                }
            } catch (Exception e4) {
                e = e4;
                this = 1;
                str = a;
                if (jav.f(str, 3)) {
                    return;
                }
                Long valueOf3 = Long.valueOf(j);
                String message2 = e.getMessage();
                Object[] objArr2 = new Object[2];
                objArr2[0] = valueOf3;
                objArr2[this] = message2;
                jav.b(str, String.format("Failed to log CronetEngine:%s creation: %s", objArr2), new Object[0]);
            }
        } catch (Exception e5) {
            e = e5;
            str = a;
            if (jav.f(str, 3)) {
            }
        }
    }

    @Override // defpackage.liz
    public final void d(long j, lix lixVar) {
        double d;
        int i;
        byte[] bytes;
        lkj lkjVar = this.c;
        synchronized (lkjVar.a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (lkjVar.c + 1000 <= elapsedRealtime) {
                lkjVar.b = 1;
                lkjVar.c = elapsedRealtime;
            } else {
                if (lkjVar.b > 0) {
                    this.b.incrementAndGet();
                    return;
                }
                lkjVar.b = 1;
            }
            int andSet = this.b.getAndSet(0);
            new cyi("CronetLoggerImpl#writeCronetTrafficReported", 2, null);
            try {
                long j2 = lixVar.a;
                jay.a(j2, "Request header size is negative");
                double d2 = j2 / 1024.0d;
                if (jay.b(d2, 0, 1)) {
                    d = 1024.0d;
                    i = 1;
                } else if (jay.b(d2, 1, 10)) {
                    d = 1024.0d;
                    i = 2;
                } else if (jay.b(d2, 10, 25)) {
                    d = 1024.0d;
                    i = 3;
                } else if (jay.b(d2, 25, 50)) {
                    d = 1024.0d;
                    i = 4;
                } else {
                    boolean b = jay.b(d2, 50, 100);
                    d = 1024.0d;
                    i = b ? 5 : 6;
                }
                double d3 = d;
                jay.a(-1L, "Request body size is negative");
                int i2 = jay.b(-9.765625E-4d, 10, 50) ? 3 : jay.b(-9.765625E-4d, 50, 200) ? 4 : jay.b(-9.765625E-4d, 200, 500) ? 5 : jay.b(-9.765625E-4d, 500, 1000) ? 6 : jay.b(-9.765625E-4d, 1000, 5000) ? 7 : 8;
                long j3 = lixVar.b;
                jay.a(j3, "Response header size is negative");
                double d4 = j3 / d3;
                int i3 = jay.b(d4, 0, 1) ? 1 : jay.b(d4, 1, 10) ? 2 : jay.b(d4, 10, 25) ? 3 : jay.b(d4, 25, 50) ? 4 : jay.b(d4, 50, 100) ? 5 : 6;
                long j4 = lixVar.c;
                jay.a(j4, "Response body size is negative");
                double d5 = j4 / d3;
                int i4 = d5 == 0.0d ? 1 : (d5 <= 0.0d || d5 >= 10.0d) ? jay.b(d5, 10, 50) ? 3 : jay.b(d5, 50, 200) ? 4 : jay.b(d5, 200, 500) ? 5 : jay.b(d5, 500, 1000) ? 6 : jay.b(d5, 1000, 5000) ? 7 : 8 : 2;
                int i5 = lixVar.d;
                String str = lixVar.f;
                MessageDigest messageDigest = lki.a;
                long j5 = 0;
                if (messageDigest != null && str != null && !str.isEmpty() && (bytes = str.getBytes(StandardCharsets.UTF_8)) != null && bytes.length != 0) {
                    j5 = ByteBuffer.wrap(messageDigest.digest(bytes)).getLong();
                }
                int millis = (int) lixVar.e.toMillis();
                int i6 = lixVar.m - 1;
                jay.f(j, i, i2, i3, i4, i5, j5, millis, andSet, i6 != 0 ? i6 != 1 ? 3 : 2 : 1, lixVar.g, lixVar.h, lixVar.i, jay.c(false) - 1, jay.c(Boolean.valueOf(lixVar.j)) - 1, lixVar.k, jay.c(false) - 1, e(lixVar.l), jay.c(null) - 1, jay.c(false) - 1);
                Trace.endSection();
            } finally {
            }
        }
    }
}
