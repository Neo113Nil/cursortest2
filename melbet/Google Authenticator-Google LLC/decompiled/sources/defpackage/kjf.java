package defpackage;

import java.io.Closeable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjf implements Closeable {
    public kjc a;
    public int b;
    public jxt c;
    public long e;
    private final kmm g;
    private final kmt h;
    private boolean j;
    private kfq k;
    private int n;
    private int p = 1;
    private int i = 5;
    public kfq d = new kfq();
    private boolean l = false;
    private int m = -1;
    public boolean f = false;
    private volatile boolean o = false;

    public kjf(kjc kjcVar, jxt jxtVar, int i, kmm kmmVar, kmt kmtVar) {
        this.a = kjcVar;
        this.c = jxtVar;
        this.b = i;
        this.g = kmmVar;
        this.h = kmtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r9.f == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (c() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
    
        if (r3 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0074, code lost:
    
        r9.a.j(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (r9.p != 2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
    
        r9.g.a(r3);
        r9.n += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        r3 = r9.p;
        r4 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r3 == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
    
        if (r4 == 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010b, code lost:
    
        r3 = r9.k.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0113, code lost:
    
        if ((r3 & 254) != 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        if (1 == (r3 & 1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0119, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011c, code lost:
    
        r9.j = r3;
        r3 = r9.k;
        r3.a(4);
        r3 = r3.e() | (((r3.e() << 24) | (r3.e() << 16)) | (r3.e() << 8));
        r9.i = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013f, code lost:
    
        if (r3 < 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0143, code lost:
    
        if (r3 > r9.b) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0145, code lost:
    
        r9.m++;
        defpackage.kmm.d(r9.g);
        r3 = r9.h;
        r3.d.a();
        r3.e = r3.a.a();
        r9.p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011b, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0195, code lost:
    
        throw new defpackage.kbt(defpackage.kbq.k.e("gRPC frame header malformed: reserved bits not zero"), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0091, code lost:
    
        if (r4 == 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00a6, code lost:
    
        r2 = r9.g;
        defpackage.kmm.d(r2);
        r9.n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00af, code lost:
    
        if (r9.j == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b1, code lost:
    
        r3 = r9.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b5, code lost:
    
        if (r3 == defpackage.jxc.a) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00b7, code lost:
    
        r4 = r9.k;
        r6 = defpackage.kkf.a;
        r4 = new defpackage.kje(r3.a(new defpackage.kkc(r4)), r9.b, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f1, code lost:
    
        r9.k = null;
        r9.a.a(new defpackage.kjd(r4));
        r9.p = 1;
        r9.i = 5;
        r9.e--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00cc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d2, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e0, code lost:
    
        throw new defpackage.kbt(defpackage.kbq.k.e("Can't decode compressed gRPC message as compression not configured"), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e1, code lost:
    
        r3 = r9.k.a;
        defpackage.kmm.d(r2);
        r2 = r9.k;
        r3 = defpackage.kkf.a;
        r4 = new defpackage.kkc(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0095, code lost:
    
        if (r3 == 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0097, code lost:
    
        r0 = "BODY";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00a5, code lost:
    
        throw new java.lang.AssertionError(defpackage.a.ah(r0, "Invalid state: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x009a, code lost:
    
        r0 = "HEADER";
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0196, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        if (this.l) {
            return;
        }
        this.l = true;
        while (true) {
            try {
                if (this.e <= 0) {
                    break;
                }
                try {
                    if (this.i > 0 && this.d.a == 0) {
                        break;
                    }
                    if (this.k == null) {
                        this.k = new kfq();
                    }
                    i = 0;
                    while (true) {
                        try {
                            int i2 = this.i - this.k.a;
                            if (i2 <= 0) {
                                break;
                            }
                            int i3 = this.d.a;
                            if (i3 != 0) {
                                int min = Math.min(i2, i3);
                                i += min;
                                this.k.h(this.d.g(min));
                            } else if (i > 0) {
                                this.a.j(i);
                                if (this.p == 2) {
                                    this.g.a(i);
                                    this.n += i;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (i > 0) {
                                this.a.j(i);
                                if (this.p == 2) {
                                    this.g.a(i);
                                    this.n += i;
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                }
            } finally {
                this.l = false;
            }
        }
        throw new kbt(kbq.h.e(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.b), Integer.valueOf(this.i))), null);
    }

    public final boolean b() {
        return this.d == null;
    }

    public final boolean c() {
        return this.d.a == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (b()) {
            return;
        }
        kfq kfqVar = this.k;
        boolean z = false;
        if (kfqVar != null && kfqVar.a > 0) {
            z = true;
        }
        try {
            kfq kfqVar2 = this.d;
            if (kfqVar2 != null) {
                kfqVar2.close();
            }
            kfq kfqVar3 = this.k;
            if (kfqVar3 != null) {
                kfqVar3.close();
            }
            this.d = null;
            this.k = null;
            this.a.e(z);
        } catch (Throwable th) {
            this.d = null;
            this.k = null;
            throw th;
        }
    }
}
