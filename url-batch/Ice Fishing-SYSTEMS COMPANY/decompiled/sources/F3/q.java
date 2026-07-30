package F3;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.C3119dx;
import com.google.android.gms.internal.ads.C3668o5;
import com.google.android.gms.internal.ads.C3675oC;
import com.google.android.gms.internal.ads.InterfaceC3229fx;
import com.google.android.gms.internal.ads.Lr;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.UB;
import com.google.android.gms.internal.ads.W4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f1059a;

    /* renamed from: b, reason: collision with root package name */
    public int f1060b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1061c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1062d;

    public q() {
        this.f1061c = new long[10];
        this.f1062d = new Object[10];
    }

    public static q a(Lr lr) {
        String str;
        int i;
        int i4;
        int i9;
        int i10;
        int i11;
        try {
            if (lr.b() != 0) {
                throw W4.a(null, "Unsupported VVC version");
            }
            int K8 = lr.K();
            int i12 = K8 >> 1;
            int i13 = 1;
            str = "L";
            if ((K8 & 1) != 0) {
                lr.G(1);
                int K9 = lr.K() >> 4;
                i = lr.K() >> 5;
                int K10 = lr.K() & 63;
                int K11 = lr.K();
                i9 = K11 >> 1;
                str = (K11 & 1) != 0 ? "H" : "L";
                i4 = lr.K();
                lr.G(K10);
                int i14 = K9 & 7;
                if (i14 > 1) {
                    int K12 = lr.K();
                    for (int i15 = 0; i15 < i14 - 1; i15++) {
                        if (((K12 >> (7 - i15)) & 1) != 0) {
                            lr.G(1);
                        }
                    }
                }
                lr.G(lr.K() * 4);
                lr.G(6);
            } else {
                i = 0;
                i4 = 0;
                i9 = 0;
            }
            int K13 = lr.K();
            int i16 = lr.f26234b;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                i10 = 12;
                i11 = 13;
                if (i17 >= K13) {
                    break;
                }
                int K14 = lr.K() & 31;
                int L8 = (K14 == 13 || K14 == 12) ? 1 : lr.L();
                for (int i19 = 0; i19 < L8; i19++) {
                    int L9 = lr.L();
                    i18 = L9 + 4 + i18;
                    lr.G(L9);
                }
                i17++;
            }
            lr.E(i16);
            byte[] bArr = new byte[i18];
            int i20 = 0;
            int i21 = 0;
            while (i20 < K13) {
                int K15 = lr.K() & 31;
                int L10 = (K15 == i11 || K15 == i10) ? i13 : lr.L();
                int i22 = i13;
                for (int i23 = 0; i23 < L10; i23++) {
                    int L11 = lr.L();
                    System.arraycopy(PA.f26862N, 0, bArr, i21, 4);
                    int i24 = i21 + 4;
                    lr.H(bArr, i24, L11);
                    i21 = i24 + L11;
                }
                i20++;
                i13 = i22;
                i10 = 12;
                i11 = 13;
            }
            Locale locale = Locale.US;
            String str2 = "vvc1." + i9 + com.anythink.core.common.d.j.f12535z + str + i4;
            C3675oC j9 = UB.j(bArr);
            q qVar = new q();
            qVar.f1061c = j9;
            qVar.f1059a = (i12 & 3) + 1;
            qVar.f1062d = str2;
            qVar.f1060b = i + 8;
            return qVar;
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw W4.a(e6, "Error parsing VVC configuration");
        }
    }

    public synchronized void b() {
        try {
            C3119dx c3119dx = (C3119dx) this.f1062d;
            if (c3119dx.f30263b) {
                InterfaceC3229fx interfaceC3229fx = c3119dx.f30262a;
                interfaceC3229fx.c2((byte[]) this.f1061c);
                interfaceC3229fx.A(this.f1059a);
                interfaceC3229fx.e0(this.f1060b);
                interfaceC3229fx.k3();
                interfaceC3229fx.c();
            }
        } catch (RemoteException e6) {
            Log.d("GASS", "Clearcut log failed", e6);
        }
    }

    public synchronized void c(long j9, Object obj) {
        try {
            if (this.f1060b > 0) {
                if (j9 <= ((long[]) this.f1061c)[((this.f1059a + r0) - 1) % ((Object[]) this.f1062d).length]) {
                    synchronized (this) {
                        this.f1059a = 0;
                        this.f1060b = 0;
                        Arrays.fill((Object[]) this.f1062d, (Object) null);
                    }
                }
            }
            int length = ((Object[]) this.f1062d).length;
            if (this.f1060b >= length) {
                int i = length + length;
                long[] jArr = new long[i];
                Object[] objArr = new Object[i];
                int i4 = this.f1059a;
                int i9 = length - i4;
                System.arraycopy((long[]) this.f1061c, i4, jArr, 0, i9);
                System.arraycopy((Object[]) this.f1062d, this.f1059a, objArr, 0, i9);
                int i10 = this.f1059a;
                if (i10 > 0) {
                    System.arraycopy((long[]) this.f1061c, 0, jArr, i9, i10);
                    System.arraycopy((Object[]) this.f1062d, 0, objArr, i9, this.f1059a);
                }
                this.f1061c = jArr;
                this.f1062d = objArr;
                this.f1059a = 0;
            }
            int i11 = this.f1059a;
            int i12 = this.f1060b;
            Object[] objArr2 = (Object[]) this.f1062d;
            int length2 = (i11 + i12) % objArr2.length;
            ((long[]) this.f1061c)[length2] = j9;
            objArr2[length2] = obj;
            this.f1060b = i12 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int d() {
        return this.f1060b;
    }

    public synchronized Object e() {
        if (this.f1060b == 0) {
            return null;
        }
        return g();
    }

    public synchronized Object f(long j9) {
        Object obj;
        obj = null;
        while (this.f1060b > 0 && j9 - ((long[]) this.f1061c)[this.f1059a] >= 0) {
            obj = g();
        }
        return obj;
    }

    public Object g() {
        PA.T(this.f1060b > 0);
        Object[] objArr = (Object[]) this.f1062d;
        int i = this.f1059a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f1059a = (i + 1) % objArr.length;
        this.f1060b--;
        return obj;
    }

    public q(int i, ArrayList arrayList, int i4, C3668o5 c3668o5) {
        this.f1059a = i;
        this.f1061c = arrayList;
        this.f1060b = i4;
        this.f1062d = c3668o5;
    }

    public /* synthetic */ q(C3119dx c3119dx, byte[] bArr) {
        Objects.requireNonNull(c3119dx);
        this.f1062d = c3119dx;
        this.f1061c = bArr;
    }
}
