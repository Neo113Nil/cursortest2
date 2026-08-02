package defpackage;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kej extends kem implements kfg, kji {
    public static final Logger s = Logger.getLogger(kej.class.getName());
    private kaa a;
    private volatile boolean b;
    private final kjj c;

    protected kej(kmm kmmVar, kaa kaaVar, jww jwwVar) {
        Boolean.TRUE.equals(jwwVar.e(khd.m));
        this.c = new kjj(this, kmmVar);
        this.a = kaaVar;
    }

    @Override // defpackage.kem
    public /* bridge */ /* synthetic */ kel b() {
        throw null;
    }

    protected abstract kee i();

    @Override // defpackage.kem, defpackage.kmn
    public final boolean k() {
        return b().c() && !this.b;
    }

    protected abstract kel l();

    @Override // defpackage.kfg
    public final void m(khi khiVar) {
        khiVar.b("remote_addr", a().a(jye.a));
    }

    @Override // defpackage.kfg
    public final void n(kbq kbqVar) {
        hoq.y(!kbqVar.g(), "Should not cancel with OK status");
        this.b = true;
        Object obj = i().a;
        khg khgVar = ((kef) obj).r;
        jzw jzwVar = khg.n;
        synchronized (khgVar.s) {
            if (khgVar.v) {
                return;
            }
            khgVar.v = true;
            khgVar.x = kbqVar;
            Collection collection = khgVar.t;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((ByteBuffer) ((ked) it.next()).c).clear();
            }
            collection.clear();
            BidirectionalStream bidirectionalStream = ((kef) obj).l;
            if (bidirectionalStream != null) {
                bidirectionalStream.cancel();
            } else {
                ((kef) obj).j.d((kef) obj, kbqVar);
            }
        }
    }

    @Override // defpackage.kfg
    public final void o() {
        if (l().k) {
            return;
        }
        l().k = true;
        kjj u = u();
        if (u.g) {
            return;
        }
        u.g = true;
        ikk ikkVar = u.k;
        if (ikkVar != null && ikkVar.x() == 0 && u.k != null) {
            u.k = null;
        }
        u.a(true, true);
    }

    @Override // defpackage.kfg
    public final void p(jxs jxsVar) {
        kaa kaaVar = this.a;
        jzw jzwVar = khd.b;
        kaaVar.f(jzwVar);
        this.a.h(jzwVar, Long.valueOf(jxsVar.b(TimeUnit.NANOSECONDS)));
    }

    @Override // defpackage.kfg
    public final void q(jxv jxvVar) {
        kel l = l();
        hoq.I(l.i == null, "Already called start");
        jxvVar.getClass();
        l.j = jxvVar;
    }

    @Override // defpackage.kfg
    public final void r(int i) {
        l().m.b = i;
    }

    @Override // defpackage.kfg
    public final void s(int i) {
        kjj kjjVar = this.c;
        hoq.I(kjjVar.a == -1, "max size already set");
        kjjVar.a = i;
    }

    @Override // defpackage.kfg
    public final void t(kfi kfiVar) {
        int i;
        kel l = l();
        hoq.I(l.i == null, "Already called setListener");
        l.i = kfiVar;
        kef kefVar = (kef) i().a;
        kefVar.k.run();
        keb kebVar = kefVar.q;
        if (kebVar != null) {
            kec kecVar = new kec(kefVar);
            String str = kefVar.e;
            Executor executor = kefVar.h;
            boolean z = kebVar.b;
            BidirectionalStream.Builder newBidirectionalStreamBuilder = kebVar.a.newBidirectionalStreamBuilder(str, kecVar, executor);
            if (z) {
                newBidirectionalStreamBuilder.setTrafficStatsTag(kebVar.c);
            }
            if (kebVar.d) {
                newBidirectionalStreamBuilder.setTrafficStatsUid(kebVar.e);
            }
            if (kefVar.m) {
                newBidirectionalStreamBuilder.delayRequestHeadersUntilFirstFlush(true);
            }
            Object obj = kefVar.n;
            if (obj != null || kefVar.o != null) {
                if (obj != null) {
                    newBidirectionalStreamBuilder.addRequestAnnotation(obj);
                }
                Collection collection = kefVar.o;
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        newBidirectionalStreamBuilder.addRequestAnnotation(it.next());
                    }
                }
            }
            String str2 = khd.j.a;
            newBidirectionalStreamBuilder.addHeader(str2, kefVar.f);
            String str3 = khd.h.a;
            newBidirectionalStreamBuilder.addHeader(str3, "application/grpc");
            newBidirectionalStreamBuilder.addHeader("te", "trailers");
            kaa kaaVar = kefVar.i;
            Logger logger = kms.a;
            Charset charset = jyr.a;
            int a = kaaVar.a();
            byte[][] bArr = new byte[a][];
            Object[] objArr = kaaVar.d;
            if (objArr instanceof byte[][]) {
                System.arraycopy(objArr, 0, bArr, 0, kaaVar.a());
            } else {
                for (int i2 = 0; i2 < kaaVar.e; i2++) {
                    int i3 = i2 + i2;
                    bArr[i3] = kaaVar.k(i2);
                    bArr[i3 + 1] = kaaVar.m(i2);
                }
            }
            int i4 = 0;
            for (int i5 = 0; i5 < a; i5 += 2) {
                byte[] bArr2 = bArr[i5];
                byte[] bArr3 = bArr[i5 + 1];
                if (kms.a(bArr2, kms.b)) {
                    i = i4 + 2;
                    bArr[i4] = bArr2;
                    bArr[i4 + 1] = jyr.b.g(bArr3).getBytes(StandardCharsets.US_ASCII);
                } else {
                    for (byte b : bArr3) {
                        if (b < 32 || b > 126) {
                            kms.a.logp(Level.WARNING, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", "Metadata key=" + new String(bArr2, StandardCharsets.US_ASCII) + ", value=" + Arrays.toString(bArr3) + " contains invalid ASCII characters");
                            break;
                        }
                    }
                    i = i4 + 2;
                    bArr[i4] = bArr2;
                    bArr[i4 + 1] = bArr3;
                }
                i4 = i;
            }
            if (i4 != a) {
                bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i4);
            }
            for (int i6 = 0; i6 < bArr.length; i6 += 2) {
                String str4 = new String(bArr[i6], StandardCharsets.UTF_8);
                if (!str3.equalsIgnoreCase(str4) && !str2.equalsIgnoreCase(str4) && !khd.i.a.equalsIgnoreCase(str4)) {
                    newBidirectionalStreamBuilder.addHeader(str4, new String(bArr[i6 + 1], StandardCharsets.UTF_8));
                }
            }
            kefVar.l = newBidirectionalStreamBuilder.build();
            kefVar.l.start();
        }
        this.a = null;
    }

    @Override // defpackage.kem
    protected final kjj u() {
        return this.c;
    }

    @Override // defpackage.kji
    public final void v(ikk ikkVar, boolean z, boolean z2) {
        Object obj;
        boolean z3 = true;
        if (ikkVar == null && !z) {
            z3 = false;
        }
        hoq.y(z3, "null frame before EOS");
        Object obj2 = i().a;
        khg khgVar = ((kef) obj2).r;
        jzw jzwVar = khg.n;
        synchronized (khgVar.s) {
            if (khgVar.v) {
                return;
            }
            if (ikkVar != null) {
                obj = ikkVar.a;
                ((Buffer) obj).flip();
            } else {
                obj = kef.a;
            }
            int remaining = ((ByteBuffer) obj).remaining();
            synchronized (khgVar.a) {
                khgVar.d += remaining;
            }
            if (khgVar.u) {
                ((kef) obj2).d((ByteBuffer) obj, z, z2);
            } else {
                khgVar.t.add(new ked((ByteBuffer) obj, z, z2));
            }
        }
    }
}
