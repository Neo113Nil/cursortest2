package n2;

import java.util.Arrays;
import n2.b;

/* loaded from: classes.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19517a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19518b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f19519c;

    /* renamed from: d, reason: collision with root package name */
    private int f19520d;

    /* renamed from: e, reason: collision with root package name */
    private int f19521e;

    /* renamed from: f, reason: collision with root package name */
    private int f19522f;

    /* renamed from: g, reason: collision with root package name */
    private a[] f19523g;

    public q(boolean z6, int i7) {
        this(z6, i7, 0);
    }

    public q(boolean z6, int i7, int i8) {
        o2.a.a(i7 > 0);
        o2.a.a(i8 >= 0);
        this.f19517a = z6;
        this.f19518b = i7;
        this.f19522f = i8;
        this.f19523g = new a[i8 + 100];
        if (i8 <= 0) {
            this.f19519c = null;
            return;
        }
        this.f19519c = new byte[i8 * i7];
        for (int i9 = 0; i9 < i8; i9++) {
            this.f19523g[i9] = new a(this.f19519c, i9 * i7);
        }
    }

    @Override // n2.b
    public synchronized void a(a aVar) {
        a[] aVarArr = this.f19523g;
        int i7 = this.f19522f;
        this.f19522f = i7 + 1;
        aVarArr[i7] = aVar;
        this.f19521e--;
        notifyAll();
    }

    @Override // n2.b
    public synchronized void b(b.a aVar) {
        while (aVar != null) {
            a[] aVarArr = this.f19523g;
            int i7 = this.f19522f;
            this.f19522f = i7 + 1;
            aVarArr[i7] = aVar.a();
            this.f19521e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    @Override // n2.b
    public synchronized void c() {
        int i7 = 0;
        int max = Math.max(0, o2.m0.l(this.f19520d, this.f19518b) - this.f19521e);
        int i8 = this.f19522f;
        if (max >= i8) {
            return;
        }
        if (this.f19519c != null) {
            int i9 = i8 - 1;
            while (i7 <= i9) {
                a aVar = (a) o2.a.e(this.f19523g[i7]);
                if (aVar.f19388a == this.f19519c) {
                    i7++;
                } else {
                    a aVar2 = (a) o2.a.e(this.f19523g[i9]);
                    if (aVar2.f19388a != this.f19519c) {
                        i9--;
                    } else {
                        a[] aVarArr = this.f19523g;
                        aVarArr[i7] = aVar2;
                        aVarArr[i9] = aVar;
                        i9--;
                        i7++;
                    }
                }
            }
            max = Math.max(max, i7);
            if (max >= this.f19522f) {
                return;
            }
        }
        Arrays.fill(this.f19523g, max, this.f19522f, (Object) null);
        this.f19522f = max;
    }

    @Override // n2.b
    public synchronized a d() {
        a aVar;
        this.f19521e++;
        int i7 = this.f19522f;
        if (i7 > 0) {
            a[] aVarArr = this.f19523g;
            int i8 = i7 - 1;
            this.f19522f = i8;
            aVar = (a) o2.a.e(aVarArr[i8]);
            this.f19523g[this.f19522f] = null;
        } else {
            aVar = new a(new byte[this.f19518b], 0);
            int i9 = this.f19521e;
            a[] aVarArr2 = this.f19523g;
            if (i9 > aVarArr2.length) {
                this.f19523g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
            }
        }
        return aVar;
    }

    @Override // n2.b
    public int e() {
        return this.f19518b;
    }

    public synchronized int f() {
        return this.f19521e * this.f19518b;
    }

    public synchronized void g() {
        if (this.f19517a) {
            h(0);
        }
    }

    public synchronized void h(int i7) {
        boolean z6 = i7 < this.f19520d;
        this.f19520d = i7;
        if (z6) {
            c();
        }
    }
}
