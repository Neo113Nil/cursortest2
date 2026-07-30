package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.j5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3398j5 implements H0, D5, InterfaceC3865ro {

    /* renamed from: w, reason: collision with root package name */
    public static final C2959b f32082w = new C2959b(13);

    /* renamed from: n, reason: collision with root package name */
    public int f32083n;

    /* renamed from: u, reason: collision with root package name */
    public Object f32084u;

    /* renamed from: v, reason: collision with root package name */
    public Object f32085v;

    public C3398j5(G1.a aVar) {
        this.f32083n = -1;
        this.f32084u = new byte[8];
        this.f32085v = aVar;
    }

    public static C3398j5 c(String str, boolean z8) {
        return new C3398j5(str, Boolean.valueOf(z8), 1);
    }

    public static C3398j5 l(String str, long j9) {
        return new C3398j5(str, Long.valueOf(j9), 2);
    }

    public int a() {
        int i = this.f32083n;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public /* synthetic */ void mo2b(Object obj) {
        int i = C3093dO.f30001K0;
        ((I6) obj).h0((C2967b7) this.f32084u, (C2967b7) this.f32085v, this.f32083n);
    }

    @Override // com.google.android.gms.internal.ads.H0
    public void d() {
        byte[] bArr = AbstractC3548lu.f32614b;
        int length = bArr.length;
        ((Lr) this.f32085v).z(0, bArr);
    }

    public Object e(int i) {
        SparseArray sparseArray;
        if (this.f32083n == -1) {
            this.f32083n = 0;
        }
        while (true) {
            int i4 = this.f32083n;
            sparseArray = (SparseArray) this.f32084u;
            if (i4 > 0 && i < sparseArray.keyAt(i4)) {
                this.f32083n--;
            }
        }
        while (this.f32083n < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f32083n + 1)) {
            this.f32083n++;
        }
        return sparseArray.valueAt(this.f32083n);
    }

    @Override // com.google.android.gms.internal.ads.D5
    public byte f(J5 j52, int i) {
        int i4 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i9 = 1761855727 % 1384724137;
        int i10 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i11 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i12 = 1694830070 % 1383960411;
        int i13 = i >>> i10;
        int i14 = this.f32083n;
        byte[] bArr = (byte[]) this.f32084u;
        if (i13 != i14) {
            ((G1.a) this.f32085v).t(i13, bArr);
            this.f32083n = i13;
        }
        int i15 = i11 ^ i12;
        return (byte) (((j52.b(i) ^ bArr[i % (i4 ^ i9)]) << i15) >> i15);
    }

    @Override // com.google.android.gms.internal.ads.D5
    public J5 g(J5 j52, int i, int i4) {
        if (i < 0 || i > i4 || i4 > j52.f25735a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i4 - i];
        int i9 = 0;
        while (i < i4) {
            bArr[i9] = f(j52, i);
            i++;
            i9++;
        }
        return J5.e(bArr);
    }

    public void h(Object obj, Object obj2) {
        int i = this.f32083n + 1;
        Object[] objArr = (Object[]) this.f32084u;
        int length = objArr.length;
        int i4 = i + i;
        if (i4 > length) {
            this.f32084u = Arrays.copyOf(objArr, PB.d(length, i4));
        }
        AbstractC2720Pd.i(obj, obj2);
        Object[] objArr2 = (Object[]) this.f32084u;
        int i9 = this.f32083n;
        int i10 = i9 + i9;
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        this.f32083n = i9 + 1;
    }

    @Override // com.google.android.gms.internal.ads.D5
    public /* bridge */ /* synthetic */ D5 i() {
        return new C3398j5((G1.a) this.f32085v);
    }

    public synchronized byte[] j(int i) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f32085v;
            if (i4 >= arrayList.size()) {
                return new byte[i];
            }
            byte[] bArr = (byte[]) arrayList.get(i4);
            int length = bArr.length;
            if (length >= i) {
                this.f32083n -= length;
                arrayList.remove(i4);
                ((ArrayList) this.f32084u).remove(bArr);
                return bArr;
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.H0
    public G0 k(J0 j02, long j9) {
        long j10 = j02.f25675w;
        int min = (int) Math.min(112800L, j02.f25674v - j10);
        Lr lr = (Lr) this.f32085v;
        lr.y(min);
        j02.I(lr.f26233a, 0, min, false);
        int i = lr.f26235c;
        long j11 = -1;
        long j12 = -9223372036854775807L;
        long j13 = -1;
        while (lr.B() >= 188) {
            byte[] bArr = lr.f26233a;
            int i4 = lr.f26234b;
            while (i4 < i && bArr[i4] != 71) {
                i4++;
            }
            int i9 = i4 + 188;
            if (i9 > i) {
                break;
            }
            long p6 = PA.p(lr, i4, this.f32083n);
            if (p6 != com.anythink.basead.exoplayer.b.f6539b) {
                long c4 = ((It) this.f32084u).c(p6);
                if (c4 > j9) {
                    return j12 == com.anythink.basead.exoplayer.b.f6539b ? new G0(-1, c4, j10) : new G0(0, com.anythink.basead.exoplayer.b.f6539b, j10 + j13);
                }
                j12 = c4;
                long j14 = i4;
                if (100000 + j12 > j9) {
                    return new G0(0, com.anythink.basead.exoplayer.b.f6539b, j10 + j14);
                }
                j13 = j14;
            }
            lr.E(i9);
            j11 = i9;
        }
        return j12 != com.anythink.basead.exoplayer.b.f6539b ? new G0(-2, j12, j10 + j11) : G0.f25081d;
    }

    public void m(C4048v8 c4048v8) {
        synchronized (this.f32084u) {
            try {
                Iterator it = ((LinkedList) this.f32085v).iterator();
                while (it.hasNext()) {
                    C4048v8 c4048v82 = (C4048v8) it.next();
                    p2.j jVar = p2.j.f39798C;
                    if (jVar.f39808h.g().l()) {
                        if (!jVar.f39808h.g().m() && !c4048v8.equals(c4048v82) && c4048v82.f34732q.equals(c4048v8.f34732q)) {
                            it.remove();
                            return;
                        }
                    } else if (!c4048v8.equals(c4048v82) && c4048v82.f34730o.equals(c4048v8.f34730o)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(Set set) {
        if (set != null) {
            int size = set.size() + this.f32083n;
            Object[] objArr = (Object[]) this.f32084u;
            int length = objArr.length;
            int i = size + size;
            if (i > length) {
                this.f32084u = Arrays.copyOf(objArr, PB.d(length, i));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            h(entry.getKey(), entry.getValue());
        }
    }

    public synchronized void o(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                ((ArrayList) this.f32084u).add(bArr);
                ArrayList arrayList = (ArrayList) this.f32085v;
                int binarySearch = Collections.binarySearch(arrayList, bArr, f32082w);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                arrayList.add(binarySearch, bArr);
                this.f32083n += length;
                synchronized (this) {
                    while (this.f32083n > 4096) {
                        byte[] bArr2 = (byte[]) ((ArrayList) this.f32084u).remove(0);
                        ((ArrayList) this.f32085v).remove(bArr2);
                        this.f32083n -= bArr2.length;
                    }
                }
            }
        }
    }

    public C3944tC p() {
        return s(true);
    }

    public void q(C4048v8 c4048v8) {
        synchronized (this.f32084u) {
            try {
                LinkedList linkedList = (LinkedList) this.f32085v;
                if (linkedList.size() >= 10) {
                    int size = linkedList.size();
                    StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 30);
                    sb.append("Queue is full, current size = ");
                    sb.append(size);
                    String sb2 = sb.toString();
                    int i = t2.C.f40822b;
                    u2.i.a(sb2);
                    linkedList.remove(0);
                }
                int i4 = this.f32083n;
                this.f32083n = i4 + 1;
                c4048v8.f34727l = i4;
                synchronized (c4048v8.f34723g) {
                    try {
                        int i9 = c4048v8.f34726k;
                        int i10 = c4048v8.f34727l;
                        boolean z8 = c4048v8.f34720d;
                        int i11 = c4048v8.f34718b;
                        if (!z8) {
                            i11 = (i10 * i11) + (i9 * c4048v8.f34717a);
                        }
                        if (i11 > c4048v8.f34729n) {
                            c4048v8.f34729n = i11;
                        }
                    } finally {
                    }
                }
                linkedList.add(c4048v8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object r() {
        C3206fa c3206fa = (C3206fa) AbstractC2887Za.f28989a.get();
        Object obj = this.f32085v;
        if (c3206fa == null) {
            if (AbstractC2887Za.f28990b.get() == null) {
                return obj;
            }
            throw new ClassCastException();
        }
        int i = this.f32083n - 1;
        String str = (String) this.f32084u;
        SharedPreferences sharedPreferences = c3206fa.f30724a;
        if (i == 0) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, booleanValue));
            } catch (ClassCastException unused) {
                return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(booleanValue)));
            }
        }
        if (i == 1) {
            try {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            } catch (ClassCastException unused2) {
                return Long.valueOf(sharedPreferences.getInt(str, (int) r1));
            }
        }
        if (i != 2) {
            return sharedPreferences.getString(str, (String) obj);
        }
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) r1));
        } catch (ClassCastException unused3) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(((Double) obj).doubleValue())));
        }
    }

    public C3944tC s(boolean z8) {
        VB vb;
        VB vb2;
        if (z8 && (vb2 = (VB) this.f32085v) != null) {
            throw vb2.a();
        }
        C3944tC e6 = C3944tC.e(this.f32083n, (Object[]) this.f32084u, this);
        if (!z8 || (vb = (VB) this.f32085v) == null) {
            return e6;
        }
        throw vb.a();
    }

    public C3398j5(String str, Object obj, int i) {
        this.f32084u = str;
        this.f32085v = obj;
        this.f32083n = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3398j5(int i, boolean z8) {
        this(4);
        switch (i) {
            case 4:
                this.f32084u = new Object();
                this.f32085v = new LinkedList();
                break;
            case 7:
                break;
            case 9:
                C3796qP c3796qP = C3796qP.f33722B;
                this.f32084u = new SparseArray();
                this.f32085v = c3796qP;
                this.f32083n = -1;
                break;
            default:
                this.f32084u = new ArrayList();
                this.f32085v = new ArrayList(64);
                this.f32083n = 0;
                break;
        }
    }

    public C3398j5(int i) {
        this.f32084u = new Object[i + i];
        this.f32083n = 0;
    }
}
