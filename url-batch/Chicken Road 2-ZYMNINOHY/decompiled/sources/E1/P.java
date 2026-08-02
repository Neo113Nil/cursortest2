package E1;

import E.AbstractC0005f;
import a.AbstractC0124a;
import a2.C0162b;
import android.os.Parcel;
import androidx.datastore.preferences.protobuf.C0179l;
import com.google.android.gms.internal.play_billing.AbstractC0313f;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.C0316g;
import com.google.android.gms.internal.play_billing.H1;
import com.google.android.gms.internal.play_billing.InterfaceC0322i;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class P implements y0.C, q0.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f517a;

    /* renamed from: b, reason: collision with root package name */
    public int f518b;

    /* renamed from: c, reason: collision with root package name */
    public Object f519c;

    public /* synthetic */ P(int i4, int i5, Object obj) {
        this.f517a = i5;
        this.f519c = obj;
        this.f518b = i4;
    }

    @Override // q0.b0
    public void a() {
        C0179l c0179l = ((m0.r) this.f519c).f14445l;
        if (c0179l != null) {
            throw c0179l;
        }
    }

    public void b(long j4) {
        int i4 = this.f518b;
        long[] jArr = (long[]) this.f519c;
        if (i4 == jArr.length) {
            this.f519c = Arrays.copyOf(jArr, i4 * 2);
        }
        long[] jArr2 = (long[]) this.f519c;
        int i5 = this.f518b;
        this.f518b = i5 + 1;
        jArr2[i5] = j4;
    }

    public void c(long[] jArr) {
        int length = this.f518b + jArr.length;
        long[] jArr2 = (long[]) this.f519c;
        if (length > jArr2.length) {
            this.f519c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f519c, this.f518b, jArr.length);
        this.f518b = length;
    }

    public long d(int i4) {
        if (i4 >= 0 && i4 < this.f518b) {
            return ((long[]) this.f519c)[i4];
        }
        StringBuilder r4 = AbstractC0005f.r(i4, "Invalid index ", ", size is ");
        r4.append(this.f518b);
        throw new IndexOutOfBoundsException(r4.toString());
    }

    public boolean e() {
        return this.f518b < ((ArrayList) this.f519c).size();
    }

    public long f(y0.k kVar) {
        W.u uVar = (W.u) this.f519c;
        int i4 = 0;
        kVar.l(uVar.f3351a, 0, 1, false);
        int i5 = uVar.f3351a[0] & 255;
        if (i5 == 0) {
            return Long.MIN_VALUE;
        }
        int i6 = 128;
        int i7 = 0;
        while ((i5 & i6) == 0) {
            i6 >>= 1;
            i7++;
        }
        int i8 = i5 & (~i6);
        kVar.l(uVar.f3351a, 1, i7, false);
        while (i4 < i7) {
            i4++;
            i8 = (uVar.f3351a[i4] & 255) + (i8 << 8);
        }
        this.f518b = i7 + 1 + this.f518b;
        return i8;
    }

    public String g(H1 h1) {
        T t4 = (T) this.f519c;
        int i4 = this.f518b;
        try {
            if (t4.f524J == null) {
                throw null;
            }
            InterfaceC0322i interfaceC0322i = t4.f524J;
            String packageName = t4.f522H.getPackageName();
            String str = i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? i4 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            Q q4 = new Q(h1);
            C0316g c0316g = (C0316g) interfaceC0322i;
            Parcel a3 = c0316g.a();
            a3.writeString(packageName);
            a3.writeString(str);
            int i5 = AbstractC0313f.f5945a;
            a3.writeStrongBinder(q4);
            c0316g.c(a3, 1);
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e4) {
            t4.Q(95, 28, W.f532E);
            AbstractC0352w.i("BillingClientTesting", "An error occurred while retrieving billing override.", e4);
            h1.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override // q0.b0
    public boolean isReady() {
        m0.r rVar = (m0.r) this.f519c;
        int i4 = this.f518b;
        if (rVar.f14448q) {
            return false;
        }
        m0.q qVar = (m0.q) rVar.f14438e.get(i4);
        return qVar.f14430c.x(qVar.f14431d);
    }

    @Override // q0.b0
    public int k(long j4) {
        m0.r rVar = (m0.r) this.f519c;
        int i4 = this.f518b;
        if (rVar.f14448q) {
            return -3;
        }
        m0.q qVar = (m0.q) rVar.f14438e.get(i4);
        q0.a0 a0Var = qVar.f14430c;
        int v = a0Var.v(j4, qVar.f14431d);
        a0Var.H(v);
        return v;
    }

    @Override // q0.b0
    public int n(l2.e eVar, Z.f fVar, int i4) {
        m0.r rVar = (m0.r) this.f519c;
        int i5 = this.f518b;
        if (rVar.f14448q) {
            return -3;
        }
        m0.q qVar = (m0.q) rVar.f14438e.get(i5);
        return qVar.f14430c.C(eVar, fVar, i4, qVar.f14431d);
    }

    public String toString() {
        switch (this.f517a) {
            case 4:
                y2.a aVar = (y2.a) this.f519c;
                ArrayList arrayList = new ArrayList(aVar.f16262b);
                int i4 = 0;
                while (true) {
                    int i5 = aVar.f16262b;
                    if (i4 >= i5) {
                        return "UnsupportedBrands{major=" + W.J.X(this.f518b) + ", compatible=" + arrayList + "}";
                    }
                    AbstractC0124a.m(i4, i5);
                    arrayList.add(W.J.X(aVar.f16261a[i4]));
                    i4++;
                }
            default:
                return super.toString();
        }
    }

    public P(C0162b c0162b, int i4) {
        this.f517a = 6;
        d2.s.c(c0162b);
        this.f519c = c0162b;
        this.f518b = i4;
    }

    public P() {
        this.f517a = 3;
        this.f519c = new W.u(8);
    }

    public P(int[] iArr, int i4) {
        y2.a aVar;
        this.f517a = 4;
        this.f518b = i4;
        if (iArr != null) {
            y2.a aVar2 = y2.a.f16260c;
            aVar = iArr.length == 0 ? y2.a.f16260c : new y2.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = y2.a.f16260c;
        }
        this.f519c = aVar;
    }

    public P(int i4, int i5) {
        this.f517a = i5;
        switch (i5) {
            case 5:
                this.f519c = new long[i4];
                return;
            default:
                if (i4 > 0) {
                    this.f519c = new Object[i4];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    public P(ArrayList arrayList) {
        this.f517a = 2;
        this.f519c = arrayList;
    }

    public P(boolean z, boolean z4, boolean z5) {
        this.f517a = 7;
        this.f518b = (z || z4 || z5) ? 1 : 0;
    }
}
