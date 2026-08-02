package defpackage;

import android.os.Parcel;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kde implements kmo {
    protected final kcs a;
    protected final jwt b;
    final int c;
    protected kdp d;
    protected kmm e;
    protected kmp f;
    private InputStream g;
    private int h;
    private int i;
    private ArrayList j;
    private boolean k;
    private int l;
    private int m;
    private kdc n = kdc.a;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public kde(kcs kcsVar, jwt jwtVar, int i) {
        this.a = kcsVar;
        this.b = jwtVar;
        this.c = i;
    }

    private final void d() {
        kdd kddVar;
        if (this.i == 0) {
            int i = 0;
            while (i < this.j.size() && (kddVar = (kdd) this.j.get(i)) != null) {
                i++;
                if (kddVar.d) {
                    this.i = i;
                    p();
                    return;
                }
            }
        }
    }

    private final boolean n() {
        return this.g != null || this.i > 0;
    }

    private final boolean o() {
        return this.k && this.h >= this.l;
    }

    private final void p() {
        kmm kmmVar = this.e;
        kmmVar.getClass();
        kmm.d(kmmVar);
        kmm.d(this.e);
        this.o++;
    }

    protected abstract void a(kbq kbqVar);

    protected abstract void b();

    public abstract void c(int i, Parcel parcel);

    @Override // defpackage.kmo
    public final synchronized InputStream e() {
        kcx kcxVar;
        InputStream inputStream = this.g;
        if (inputStream != null) {
            this.g = null;
        } else if (this.p <= 0 || !n()) {
            inputStream = null;
        } else {
            int i = this.i;
            this.i = 0;
            if (i == 1) {
                kdd kddVar = (kdd) this.j.remove(0);
                int i2 = kddVar.c;
                InputStream inputStream2 = kddVar.a;
                kcxVar = new kcx(kddVar.b);
            } else {
                byte[][] bArr = new byte[i][];
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    byte[] bArr2 = ((kdd) this.j.remove(0)).b;
                    bArr[i4] = bArr2;
                    i3 += bArr2.length;
                }
                kcxVar = new kcx(bArr, i3);
            }
            this.h += i;
            d();
            inputStream = kcxVar;
        }
        if (inputStream != null) {
            this.p--;
        } else {
            this.r = false;
            if (o() && !l()) {
                k(kdc.d);
                h();
                return null;
            }
        }
        return inputStream;
    }

    public final void f(kbq kbqVar, kbq kbqVar2, boolean z) {
        if (l()) {
            return;
        }
        boolean z2 = this.n != kdc.a;
        k(kdc.f);
        if (z2) {
            this.e.c();
        }
        if (!z) {
            kcs kcsVar = this.a;
            int i = this.c;
            try {
                kdq c = kdq.c();
                try {
                    c.a().writeInt(0);
                    ixa.c(c.a(), ixa.b(c.a(), kbqVar) | 8);
                    kcsVar.i(i, c);
                    c.close();
                } finally {
                }
            } catch (kbr e) {
                kcs.b.logp(Level.FINER, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", (Throwable) e);
            }
        }
        if (z2) {
            a(kbqVar2);
        }
        this.a.k(this.c);
    }

    final void g(kbq kbqVar) {
        f(kbq.c, kbqVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:
    
        r4.q = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void h() {
        int ordinal;
        if (!this.q) {
            this.q = true;
            while (true) {
                int ordinal2 = this.n.ordinal();
                if (ordinal2 == 2) {
                    if (this.f == null || this.r) {
                        break;
                    }
                    if (n()) {
                        if (this.p == 0) {
                            break;
                        }
                        ordinal = this.n.ordinal();
                        if (ordinal != 2) {
                        }
                        if (this.k) {
                        }
                    } else {
                        if (!o()) {
                            break;
                        }
                        ordinal = this.n.ordinal();
                        if (ordinal != 2) {
                        }
                        if (this.k) {
                        }
                    }
                } else {
                    if (ordinal2 != 3) {
                        break;
                    }
                    if (this.f == null) {
                        break;
                    }
                    if (!this.k) {
                        break;
                    }
                    ordinal = this.n.ordinal();
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new AssertionError();
                        }
                    } else if (!this.r) {
                        if (n()) {
                            this.r = true;
                            this.f.d(this);
                        } else if (this.k) {
                            k(kdc.d);
                        }
                    }
                    if (this.k) {
                        k(kdc.e);
                        b();
                    }
                }
            }
        }
    }

    final synchronized void i(Parcel parcel) {
        if (l()) {
            return;
        }
        try {
            int readInt = parcel.readInt();
            if (ixa.d(readInt, 8)) {
                kbq b = kbq.b((readInt >> 16) & 255);
                if ((readInt & 32) != 0) {
                    b = b.e(parcel.readString());
                }
                f(b, b, true);
                return;
            }
            int readInt2 = parcel.readInt();
            boolean d = ixa.d(readInt, 1);
            boolean d2 = ixa.d(readInt, 2);
            boolean d3 = ixa.d(readInt, 4);
            if (d) {
                c(readInt, parcel);
                k(kdc.c);
            }
            if (d2) {
                if ((readInt & 64) != 0) {
                    throw new kbr(kbq.f.e("Parcelable messages not allowed"));
                }
                int readInt3 = parcel.readInt();
                if (readInt3 > parcel.dataAvail()) {
                    throw new kbr(kbq.k.e("Message size is larger than remaining parcel size: " + readInt3 + " > " + parcel.dataAvail()));
                }
                byte[] c = kcy.c(readInt3);
                if (readInt3 > 0) {
                    parcel.readByteArray(c);
                }
                int i = readInt & 128;
                boolean z = i == 0;
                if (this.j == null) {
                    if (this.o == 0 && i == 0 && readInt2 == this.h) {
                        hoq.H(this.g == null);
                        this.g = new kcx(c);
                        p();
                    } else {
                        this.j = new ArrayList(16);
                    }
                }
                kdd kddVar = new kdd(c, readInt3, z);
                int i2 = readInt2 - this.h;
                int size = this.j.size();
                ArrayList arrayList = this.j;
                if (i2 < size) {
                    arrayList.set(i2, kddVar);
                    d();
                } else if (i2 > arrayList.size()) {
                    do {
                        this.j.add(null);
                    } while (i2 > this.j.size());
                    this.j.add(kddVar);
                } else {
                    this.j.add(kddVar);
                    d();
                }
            }
            if (d3) {
                this.l = readInt2;
                this.k = true;
            }
            int i3 = this.h;
            if (readInt2 == i3) {
                ArrayList arrayList2 = this.j;
                if (arrayList2 == null) {
                    this.h = i3 + 1;
                } else if (!d2 && !d3) {
                    arrayList2.remove(0);
                    this.h++;
                }
            }
            int dataSize = this.m + parcel.dataSize();
            this.m = dataSize;
            kmm kmmVar = this.e;
            if (kmmVar != null && dataSize != 0) {
                kmmVar.a(dataSize);
                kmm.d(this.e);
                this.m = 0;
            }
            h();
        } catch (kbr e) {
            kbq kbqVar = e.a;
            f(kbqVar, kbqVar, false);
        }
    }

    final void j(kdp kdpVar, kmp kmpVar) {
        this.d = kdpVar;
        this.e = kdpVar.c;
        this.f = kmpVar;
        if (l()) {
            return;
        }
        k(kdc.b);
    }

    protected final void k(kdc kdcVar) {
        kdc kdcVar2 = this.n;
        int ordinal = kdcVar.ordinal();
        if (ordinal == 1) {
            hoq.M(kdcVar2 == kdc.a, "%s -> %s", kdcVar2, kdcVar);
        } else if (ordinal == 2) {
            hoq.M(kdcVar2 == kdc.b || kdcVar2 == kdc.a, "%s -> %s", kdcVar2, kdcVar);
        } else if (ordinal == 3) {
            hoq.M(kdcVar2 == kdc.c, "%s -> %s", kdcVar2, kdcVar);
        } else if (ordinal == 4) {
            hoq.M(kdcVar2 == kdc.d, "%s -> %s", kdcVar2, kdcVar);
        } else if (ordinal != 5) {
            throw new AssertionError();
        }
        this.n = kdcVar;
    }

    protected final boolean l() {
        return this.n == kdc.f;
    }

    public final void m() {
        this.p++;
        h();
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String simpleName = getClass().getSimpleName();
        boolean z = this.k;
        String valueOf = String.valueOf(this.n);
        boolean n = n();
        kmp kmpVar = this.f;
        sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("[SfxA=");
        sb.append(z);
        sb.append("/De=");
        sb.append(valueOf);
        sb.append("/Msg=");
        sb.append(n);
        sb.append("/Lis=");
        sb.append(kmpVar != null);
        sb.append("]");
        return sb.toString();
    }
}
