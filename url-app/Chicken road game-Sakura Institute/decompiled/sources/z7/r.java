package z7;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f10216i;

    /* renamed from: f, reason: collision with root package name */
    public final f8.h f10217f;

    /* renamed from: g, reason: collision with root package name */
    public final q f10218g;

    /* renamed from: h, reason: collision with root package name */
    public final c f10219h;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        r6.k.e(logger, "getLogger(Http2::class.java.name)");
        f10216i = logger;
    }

    public r(f8.a0 a0Var) {
        r6.k.f(a0Var, "source");
        this.f10217f = a0Var;
        q qVar = new q(a0Var);
        this.f10218g = qVar;
        this.f10219h = new c(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x024e, code lost:
    
        throw new java.io.IOException(a0.m.i("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(boolean z8, g4.o oVar) {
        int i7;
        int i8;
        Object[] array;
        try {
            this.f10217f.J(9L);
            int r8 = t7.b.r(this.f10217f);
            if (r8 > 16384) {
                throw new IOException(a0.m.i("FRAME_SIZE_ERROR: ", r8));
            }
            int readByte = this.f10217f.readByte() & 255;
            byte readByte2 = this.f10217f.readByte();
            int i9 = readByte2 & 255;
            int readInt = this.f10217f.readInt();
            int i10 = readInt & Integer.MAX_VALUE;
            Logger logger = f10216i;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(true, i10, r8, readByte, i9));
            }
            if (z8 && readByte != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = f.f10160b;
                sb.append(readByte < strArr.length ? strArr[readByte] : t7.b.g("0x%02x", Integer.valueOf(readByte)));
                throw new IOException(sb.toString());
            }
            int i11 = 3;
            int i12 = 2;
            switch (readByte) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    c(oVar, r8, i9, i10);
                    return true;
                case 1:
                    n(oVar, r8, i9, i10);
                    return true;
                case 2:
                    if (r8 != 5) {
                        throw new IOException(a0.m.g(r8, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i10 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    f8.h hVar = this.f10217f;
                    hVar.readInt();
                    hVar.readByte();
                    return true;
                case 3:
                    if (r8 != 4) {
                        throw new IOException(a0.m.g(r8, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i10 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int readInt2 = this.f10217f.readInt();
                    int[] e9 = l.h.e(14);
                    int length = e9.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            int i14 = e9[i13];
                            if (l.h.d(i14) == readInt2) {
                                i7 = i14;
                            } else {
                                i13++;
                            }
                        } else {
                            i7 = 0;
                        }
                    }
                    if (i7 == 0) {
                        throw new IOException(a0.m.i("TYPE_RST_STREAM unexpected error code: ", readInt2));
                    }
                    n nVar = (n) oVar.f4350g;
                    if (i10 != 0 && (readInt & 1) == 0) {
                        r2 = 1;
                    }
                    if (r2 == 0) {
                        v k8 = nVar.k(i10);
                        if (k8 == null) {
                            return true;
                        }
                        k8.i(i7);
                        return true;
                    }
                    nVar.f10189n.c(new j(nVar.f10183h + '[' + i10 + "] onReset", nVar, i10, i7, 1), 0L);
                    return true;
                case 4:
                    f8.h hVar2 = this.f10217f;
                    if (i10 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((readByte2 & 1) == 0) {
                        if (r8 % 6 != 0) {
                            throw new IOException(a0.m.i("TYPE_SETTINGS length % 6 != 0: ", r8));
                        }
                        z zVar = new z();
                        w6.b n8 = v1.g.n(v1.g.o(0, r8), 6);
                        int i15 = n8.f9521f;
                        int i16 = n8.f9522g;
                        int i17 = n8.f9523h;
                        if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                            while (true) {
                                short readShort = hVar2.readShort();
                                byte[] bArr = t7.b.f8932a;
                                int i18 = readShort & 65535;
                                int readInt3 = hVar2.readInt();
                                if (i18 != 2) {
                                    if (i18 == i11) {
                                        i18 = 4;
                                    } else if (i18 != 4) {
                                        if (i18 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                        }
                                    } else {
                                        if (readInt3 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i18 = 7;
                                    }
                                } else if (readInt3 != 0 && readInt3 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                zVar.c(i18, readInt3);
                                if (i15 != i16) {
                                    i15 += i17;
                                    i11 = 3;
                                }
                            }
                        }
                        n nVar2 = (n) oVar.f4350g;
                        nVar2.f10188m.c(new i(a0.m.m(new StringBuilder(), nVar2.f10183h, " applyAndAckSettings"), oVar, zVar, i12), 0L);
                        return true;
                    }
                    if (r8 != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    break;
                case 5:
                    t(oVar, r8, i9, i10);
                    return true;
                case 6:
                    if (r8 != 8) {
                        throw new IOException(a0.m.i("TYPE_PING length != 8: ", r8));
                    }
                    if (i10 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int readInt4 = this.f10217f.readInt();
                    int readInt5 = this.f10217f.readInt();
                    if (((readByte2 & 1) != 0 ? 1 : 0) == 0) {
                        ((n) oVar.f4350g).f10188m.c(new j(a0.m.m(new StringBuilder(), ((n) oVar.f4350g).f10183h, " ping"), (n) oVar.f4350g, readInt4, readInt5, 0), 0L);
                        return true;
                    }
                    n nVar3 = (n) oVar.f4350g;
                    synchronized (nVar3) {
                        try {
                            if (readInt4 == 1) {
                                nVar3.f10192q++;
                            } else if (readInt4 == 2) {
                                nVar3.f10194s++;
                            } else if (readInt4 == 3) {
                                nVar3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (r8 < 8) {
                        throw new IOException(a0.m.i("TYPE_GOAWAY length < 8: ", r8));
                    }
                    if (i10 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int readInt6 = this.f10217f.readInt();
                    int readInt7 = this.f10217f.readInt();
                    int i19 = r8 - 8;
                    int[] e10 = l.h.e(14);
                    int length2 = e10.length;
                    int i20 = 0;
                    while (true) {
                        if (i20 < length2) {
                            i8 = e10[i20];
                            if (l.h.d(i8) != readInt7) {
                                i20++;
                            }
                        } else {
                            i8 = 0;
                        }
                    }
                    if (i8 == 0) {
                        throw new IOException(a0.m.i("TYPE_GOAWAY unexpected error code: ", readInt7));
                    }
                    f8.i iVar = f8.i.f3600i;
                    if (i19 > 0) {
                        iVar = this.f10217f.h(i19);
                    }
                    r6.k.f(iVar, "debugData");
                    iVar.e();
                    n nVar4 = (n) oVar.f4350g;
                    synchronized (nVar4) {
                        array = nVar4.f10182g.values().toArray(new v[0]);
                        nVar4.f10186k = true;
                    }
                    v[] vVarArr = (v[]) array;
                    int length3 = vVarArr.length;
                    while (r2 < length3) {
                        v vVar = vVarArr[r2];
                        if (vVar.f10231a > readInt6 && vVar.f()) {
                            vVar.i(8);
                            ((n) oVar.f4350g).k(vVar.f10231a);
                        }
                        r2++;
                    }
                    break;
                case 8:
                    if (r8 != 4) {
                        throw new IOException(a0.m.i("TYPE_WINDOW_UPDATE length !=4: ", r8));
                    }
                    long readInt8 = this.f10217f.readInt() & 2147483647L;
                    if (readInt8 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i10 == 0) {
                        n nVar5 = (n) oVar.f4350g;
                        synchronized (nVar5) {
                            nVar5.f10201z += readInt8;
                            nVar5.notifyAll();
                        }
                        return true;
                    }
                    v c4 = ((n) oVar.f4350g).c(i10);
                    if (c4 != null) {
                        synchronized (c4) {
                            c4.f10236f += readInt8;
                            if (readInt8 > 0) {
                                c4.notifyAll();
                            }
                        }
                        return true;
                    }
                    break;
                default:
                    this.f10217f.skip(r8);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(g4.o oVar, int i7, int i8, int i9) {
        int i10;
        boolean z8;
        long j8;
        boolean z9;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i8 & 1) != 0;
        if ((i8 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i8 & 8) != 0) {
            byte readByte = this.f10217f.readByte();
            byte[] bArr = t7.b.f8932a;
            i10 = readByte & 255;
        } else {
            i10 = 0;
        }
        int a3 = p.a(i7, i8, i10);
        f8.h hVar = this.f10217f;
        r6.k.f(hVar, "source");
        n nVar = (n) oVar.f4350g;
        long j9 = 0;
        if (i9 == 0 || (i9 & 1) != 0) {
            v c4 = nVar.c(i9);
            if (c4 == null) {
                ((n) oVar.f4350g).w(i9, 2);
                long j10 = a3;
                ((n) oVar.f4350g).t(j10);
                hVar.skip(j10);
            } else {
                byte[] bArr2 = t7.b.f8932a;
                t tVar = c4.f10239i;
                long j11 = a3;
                tVar.getClass();
                long j12 = j11;
                while (true) {
                    if (j12 <= j9) {
                        v vVar = tVar.f10229k;
                        byte[] bArr3 = t7.b.f8932a;
                        vVar.f10232b.t(j11);
                        break;
                    }
                    synchronized (tVar.f10229k) {
                        z8 = tVar.f10225g;
                        j8 = j9;
                        z9 = tVar.f10227i.f3598g + j12 > tVar.f10224f;
                    }
                    if (z9) {
                        hVar.skip(j12);
                        tVar.f10229k.e(4);
                        break;
                    }
                    if (z8) {
                        hVar.skip(j12);
                        break;
                    }
                    long v5 = hVar.v(j12, tVar.f10226h);
                    if (v5 == -1) {
                        throw new EOFException();
                    }
                    j12 -= v5;
                    v vVar2 = tVar.f10229k;
                    synchronized (vVar2) {
                        try {
                            if (tVar.f10228j) {
                                f8.f fVar = tVar.f10226h;
                                fVar.skip(fVar.f3598g);
                            } else {
                                f8.f fVar2 = tVar.f10227i;
                                boolean z11 = fVar2.f3598g == j8;
                                fVar2.N(tVar.f10226h);
                                if (z11) {
                                    vVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j9 = j8;
                }
                if (z10) {
                    c4.h(t7.b.f8933b, true);
                }
            }
        } else {
            f8.f fVar3 = new f8.f();
            long j13 = a3;
            hVar.J(j13);
            hVar.v(j13, fVar3);
            nVar.f10189n.c(new k(nVar.f10183h + '[' + i9 + "] onData", nVar, i9, fVar3, a3, z10), 0L);
        }
        this.f10217f.skip(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10217f.close();
    }

    public final List k(int i7, int i8, int i9, int i10) {
        q qVar = this.f10218g;
        qVar.f10214j = i7;
        qVar.f10211g = i7;
        qVar.f10215k = i8;
        qVar.f10212h = i9;
        qVar.f10213i = i10;
        c cVar = this.f10219h;
        f8.a0 a0Var = cVar.f10144c;
        ArrayList arrayList = cVar.f10143b;
        while (!a0Var.b()) {
            byte readByte = a0Var.readByte();
            byte[] bArr = t7.b.f8932a;
            int i11 = readByte & 255;
            if (i11 == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & 128) == 128) {
                int e9 = cVar.e(i11, 127);
                int i12 = e9 - 1;
                if (i12 >= 0) {
                    b[] bVarArr = e.f10157a;
                    if (i12 <= bVarArr.length - 1) {
                        arrayList.add(bVarArr[i12]);
                    }
                }
                int length = cVar.f10146e + 1 + (i12 - e.f10157a.length);
                if (length >= 0) {
                    b[] bVarArr2 = cVar.f10145d;
                    if (length < bVarArr2.length) {
                        b bVar = bVarArr2[length];
                        r6.k.c(bVar);
                        arrayList.add(bVar);
                    }
                }
                throw new IOException(a0.m.i("Header index too large ", e9));
            }
            if (i11 == 64) {
                b[] bVarArr3 = e.f10157a;
                f8.i d8 = cVar.d();
                e.a(d8);
                cVar.c(new b(d8, cVar.d()));
            } else if ((readByte & 64) == 64) {
                cVar.c(new b(cVar.b(cVar.e(i11, 63) - 1), cVar.d()));
            } else if ((readByte & 32) == 32) {
                int e10 = cVar.e(i11, 31);
                cVar.f10142a = e10;
                if (e10 < 0 || e10 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + cVar.f10142a);
                }
                int i13 = cVar.f10148g;
                if (e10 < i13) {
                    if (e10 == 0) {
                        e6.k.c0(0, r7.length, null, cVar.f10145d);
                        cVar.f10146e = cVar.f10145d.length - 1;
                        cVar.f10147f = 0;
                        cVar.f10148g = 0;
                    } else {
                        cVar.a(i13 - e10);
                    }
                }
            } else if (i11 == 16 || i11 == 0) {
                b[] bVarArr4 = e.f10157a;
                f8.i d9 = cVar.d();
                e.a(d9);
                arrayList.add(new b(d9, cVar.d()));
            } else {
                arrayList.add(new b(cVar.b(cVar.e(i11, 15) - 1), cVar.d()));
            }
        }
        List w02 = e6.l.w0(arrayList);
        arrayList.clear();
        return w02;
    }

    public final void n(g4.o oVar, int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i10 = 0;
        int i11 = 1;
        boolean z8 = (i8 & 1) != 0;
        if ((i8 & 8) != 0) {
            byte readByte = this.f10217f.readByte();
            byte[] bArr = t7.b.f8932a;
            i10 = readByte & 255;
        }
        if ((i8 & 32) != 0) {
            f8.h hVar = this.f10217f;
            hVar.readInt();
            hVar.readByte();
            byte[] bArr2 = t7.b.f8932a;
            i7 -= 5;
        }
        List k8 = k(p.a(i7, i8, i10), i10, i8, i9);
        n nVar = (n) oVar.f4350g;
        if (i9 != 0 && (i9 & 1) == 0) {
            nVar.f10189n.c(new l(nVar.f10183h + '[' + i9 + "] onHeaders", nVar, i9, k8, z8), 0L);
            return;
        }
        synchronized (nVar) {
            v c4 = nVar.c(i9);
            if (c4 != null) {
                c4.h(t7.b.t(k8), z8);
                return;
            }
            if (nVar.f10186k) {
                return;
            }
            if (i9 <= nVar.f10184i) {
                return;
            }
            if (i9 % 2 == nVar.f10185j % 2) {
                return;
            }
            v vVar = new v(i9, nVar, false, z8, t7.b.t(k8));
            nVar.f10184i = i9;
            nVar.f10182g.put(Integer.valueOf(i9), vVar);
            nVar.f10187l.e().c(new i(nVar.f10183h + '[' + i9 + "] onStream", nVar, vVar, i11), 0L);
        }
    }

    public final void t(g4.o oVar, int i7, int i8, int i9) {
        int i10;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i8 & 8) != 0) {
            byte readByte = this.f10217f.readByte();
            byte[] bArr = t7.b.f8932a;
            i10 = readByte & 255;
        } else {
            i10 = 0;
        }
        int readInt = this.f10217f.readInt() & Integer.MAX_VALUE;
        List k8 = k(p.a(i7 - 4, i8, i10), i10, i8, i9);
        n nVar = (n) oVar.f4350g;
        synchronized (nVar) {
            if (nVar.D.contains(Integer.valueOf(readInt))) {
                nVar.w(readInt, 2);
                return;
            }
            nVar.D.add(Integer.valueOf(readInt));
            nVar.f10189n.c(new l(nVar.f10183h + '[' + readInt + "] onRequest", nVar, readInt, k8), 0L);
        }
    }
}
