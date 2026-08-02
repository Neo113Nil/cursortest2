package S0;

import T.C0097o;
import W.J;
import kotlin.KotlinVersion;
import y0.F;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final F f2437a;

    /* renamed from: d, reason: collision with root package name */
    public A f2440d;

    /* renamed from: e, reason: collision with root package name */
    public k f2441e;

    /* renamed from: f, reason: collision with root package name */
    public int f2442f;

    /* renamed from: g, reason: collision with root package name */
    public int f2443g;

    /* renamed from: h, reason: collision with root package name */
    public int f2444h;

    /* renamed from: i, reason: collision with root package name */
    public int f2445i;

    /* renamed from: j, reason: collision with root package name */
    public final C0097o f2446j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2449m;

    /* renamed from: b, reason: collision with root package name */
    public final z f2438b = new z();

    /* renamed from: c, reason: collision with root package name */
    public final W.u f2439c = new W.u();

    /* renamed from: k, reason: collision with root package name */
    public final W.u f2447k = new W.u(1);

    /* renamed from: l, reason: collision with root package name */
    public final W.u f2448l = new W.u();

    public n(F f4, A a3, k kVar, C0097o c0097o) {
        this.f2437a = f4;
        this.f2440d = a3;
        this.f2441e = kVar;
        this.f2446j = c0097o;
        this.f2440d = a3;
        this.f2441e = kVar;
        f4.d(c0097o);
        e();
    }

    public final int a() {
        int i4 = !this.f2449m ? this.f2440d.f2388g[this.f2442f] : this.f2438b.f2563j[this.f2442f] ? 1 : 0;
        return b() != null ? i4 | 1073741824 : i4;
    }

    public final y b() {
        if (this.f2449m) {
            z zVar = this.f2438b;
            k kVar = zVar.f2554a;
            String str = J.f3263a;
            int i4 = kVar.f2429a;
            y yVar = zVar.f2566m;
            if (yVar == null) {
                y[] yVarArr = this.f2440d.f2382a.f2548l;
                yVar = yVarArr == null ? null : yVarArr[i4];
            }
            if (yVar != null && yVar.f2549a) {
                return yVar;
            }
        }
        return null;
    }

    public final boolean c() {
        this.f2442f++;
        if (!this.f2449m) {
            return false;
        }
        int i4 = this.f2443g + 1;
        this.f2443g = i4;
        int[] iArr = this.f2438b.f2560g;
        int i5 = this.f2444h;
        if (i4 != iArr[i5]) {
            return true;
        }
        this.f2444h = i5 + 1;
        this.f2443g = 0;
        return false;
    }

    public final int d(int i4, int i5) {
        W.u uVar;
        y b4 = b();
        if (b4 == null) {
            return 0;
        }
        int i6 = b4.f2552d;
        z zVar = this.f2438b;
        if (i6 != 0) {
            uVar = zVar.n;
        } else {
            byte[] bArr = b4.f2553e;
            String str = J.f3263a;
            int length = bArr.length;
            W.u uVar2 = this.f2448l;
            uVar2.K(length, bArr);
            i6 = bArr.length;
            uVar = uVar2;
        }
        boolean z = zVar.f2564k && zVar.f2565l[this.f2442f];
        boolean z4 = z || i5 != 0;
        W.u uVar3 = this.f2447k;
        uVar3.f3351a[0] = (byte) ((z4 ? 128 : 0) | i6);
        uVar3.M(0);
        F f4 = this.f2437a;
        f4.b(uVar3, 1, 1);
        f4.b(uVar, i6, 1);
        if (!z4) {
            return i6 + 1;
        }
        W.u uVar4 = this.f2439c;
        if (!z) {
            uVar4.J(8);
            byte[] bArr2 = uVar4.f3351a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i5 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[4] = (byte) ((i4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[5] = (byte) ((i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[6] = (byte) ((i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[7] = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
            f4.b(uVar4, 8, 1);
            return i6 + 9;
        }
        W.u uVar5 = zVar.n;
        int G4 = uVar5.G();
        uVar5.N(-2);
        int i7 = (G4 * 6) + 2;
        if (i5 != 0) {
            uVar4.J(i7);
            byte[] bArr3 = uVar4.f3351a;
            uVar5.k(bArr3, 0, i7);
            int i8 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i5;
            bArr3[2] = (byte) ((i8 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr3[3] = (byte) (i8 & KotlinVersion.MAX_COMPONENT_VALUE);
        } else {
            uVar4 = uVar5;
        }
        f4.b(uVar4, i7, 1);
        return i6 + 1 + i7;
    }

    public final void e() {
        z zVar = this.f2438b;
        zVar.f2557d = 0;
        zVar.f2567p = 0L;
        zVar.f2568q = false;
        zVar.f2564k = false;
        zVar.o = false;
        zVar.f2566m = null;
        this.f2442f = 0;
        this.f2444h = 0;
        this.f2443g = 0;
        this.f2445i = 0;
        this.f2449m = false;
    }
}
