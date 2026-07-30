package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes2.dex */
public final class GQ implements AQ, InterfaceC4282zQ {

    /* renamed from: A, reason: collision with root package name */
    public AQ[] f25168A;

    /* renamed from: B, reason: collision with root package name */
    public C3797qQ f25169B;

    /* renamed from: n, reason: collision with root package name */
    public final AQ[] f25170n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f25171u;

    /* renamed from: v, reason: collision with root package name */
    public final IdentityHashMap f25172v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f25173w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f25174x = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public Object f25175y;

    /* renamed from: z, reason: collision with root package name */
    public C3041cR f25176z;

    public GQ(long[] jArr, AQ... aqArr) {
        this.f25170n = aqArr;
        SB sb = UB.f27942u;
        C3675oC c3675oC = C3675oC.f33115x;
        this.f25169B = new C3797qQ(c3675oC, c3675oC);
        this.f25172v = new IdentityHashMap();
        this.f25168A = new AQ[0];
        this.f25171u = new boolean[aqArr.length];
        for (int i = 0; i < aqArr.length; i++) {
            long j9 = jArr[i];
            if (j9 != 0) {
                this.f25171u[i] = true;
                this.f25170n[i] = new C2932aR(aqArr[i], j9);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long a(long j9, HO ho) {
        AQ[] aqArr = this.f25168A;
        return (aqArr.length > 0 ? aqArr[0] : this.f25170n[0]).a(j9, ho);
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final boolean b(C3633nO c3633nO) {
        ArrayList arrayList = this.f25173w;
        if (arrayList.isEmpty()) {
            return this.f25169B.b(c3633nO);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AQ) arrayList.get(i)).b(c3633nO);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final boolean c() {
        return this.f25169B.c();
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final long d() {
        return this.f25169B.d();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.zQ, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4282zQ
    public final /* bridge */ /* synthetic */ void e(WQ wq) {
        ?? r12 = this.f25175y;
        r12.getClass();
        r12.e(this);
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final void f(long j9) {
        this.f25169B.f(j9);
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final void g(InterfaceC4282zQ interfaceC4282zQ, long j9) {
        this.f25175y = interfaceC4282zQ;
        ArrayList arrayList = this.f25173w;
        AQ[] aqArr = this.f25170n;
        Collections.addAll(arrayList, aqArr);
        for (AQ aq : aqArr) {
            aq.g(this, j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long h(long j9) {
        long h9 = this.f25168A[0].h(j9);
        int i = 1;
        while (true) {
            AQ[] aqArr = this.f25168A;
            if (i >= aqArr.length) {
                return h9;
            }
            if (aqArr[i].h(h9) != h9) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.WQ
    public final long i() {
        return this.f25169B.i();
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long j(InterfaceC3716p[] interfaceC3716pArr, boolean[] zArr, VQ[] vqArr, boolean[] zArr2, long j9) {
        int length;
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2;
        int length2 = interfaceC3716pArr.length;
        int[] iArr3 = new int[length2];
        int[] iArr4 = new int[length2];
        int i = 0;
        int i4 = 0;
        while (true) {
            length = interfaceC3716pArr.length;
            identityHashMap = this.f25172v;
            if (i4 >= length) {
                break;
            }
            VQ vq = vqArr[i4];
            Integer num = vq == null ? null : (Integer) identityHashMap.get(vq);
            iArr3[i4] = num == null ? -1 : num.intValue();
            InterfaceC3716p interfaceC3716p = interfaceC3716pArr[i4];
            if (interfaceC3716p != null) {
                String str = interfaceC3716p.a().f23998b;
                iArr4[i4] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr4[i4] = -1;
            }
            i4++;
        }
        identityHashMap.clear();
        VQ[] vqArr2 = new VQ[length];
        VQ[] vqArr3 = new VQ[length];
        InterfaceC3716p[] interfaceC3716pArr2 = new InterfaceC3716p[length];
        AQ[] aqArr = this.f25170n;
        ArrayList arrayList = new ArrayList(aqArr.length);
        long j10 = j9;
        int i9 = 0;
        while (i9 < aqArr.length) {
            int i10 = i;
            while (i10 < interfaceC3716pArr.length) {
                vqArr3[i10] = iArr3[i10] == i9 ? vqArr[i10] : null;
                if (iArr4[i10] == i9) {
                    InterfaceC3716p interfaceC3716p2 = interfaceC3716pArr[i10];
                    interfaceC3716p2.getClass();
                    iArr = iArr4;
                    iArr2 = iArr3;
                    B8 b82 = (B8) this.f25174x.get(interfaceC3716p2.a());
                    b82.getClass();
                    interfaceC3716pArr2[i10] = new FQ(interfaceC3716p2, b82);
                } else {
                    iArr = iArr4;
                    iArr2 = iArr3;
                    interfaceC3716pArr2[i10] = null;
                }
                i10++;
                iArr4 = iArr;
                iArr3 = iArr2;
            }
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            ArrayList arrayList2 = arrayList;
            AQ[] aqArr2 = aqArr;
            int i11 = i9;
            long j11 = aqArr[i9].j(interfaceC3716pArr2, zArr, vqArr3, zArr2, j10);
            if (i11 == 0) {
                j10 = j11;
            } else if (j11 != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z8 = false;
            for (int i12 = 0; i12 < interfaceC3716pArr.length; i12++) {
                if (iArr5[i12] == i11) {
                    VQ vq2 = vqArr3[i12];
                    vq2.getClass();
                    vqArr2[i12] = vq2;
                    identityHashMap.put(vq2, Integer.valueOf(i11));
                    z8 = true;
                } else if (iArr6[i12] == i11) {
                    PA.T(vqArr3[i12] == null);
                }
            }
            if (z8) {
                arrayList2.add(aqArr2[i11]);
            }
            i9 = i11 + 1;
            arrayList = arrayList2;
            aqArr = aqArr2;
            iArr4 = iArr5;
            iArr3 = iArr6;
            i = 0;
        }
        int i13 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(vqArr2, i13, vqArr, i13, length);
        this.f25168A = (AQ[]) arrayList3.toArray(new AQ[i13]);
        this.f25169B = new C3797qQ(arrayList3, AbstractC2655Lg.s(arrayList3, Rz.f27459f));
        return j10;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.zQ, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4282zQ
    public final void k(AQ aq) {
        AQ[] aqArr;
        ArrayList arrayList = this.f25173w;
        arrayList.remove(aq);
        if (arrayList.isEmpty()) {
            int i = 0;
            int i4 = 0;
            while (true) {
                aqArr = this.f25170n;
                if (i >= aqArr.length) {
                    break;
                }
                i4 += aqArr[i].p().f29710a;
                i++;
            }
            B8[] b8Arr = new B8[i4];
            int i9 = 0;
            for (int i10 = 0; i10 < aqArr.length; i10++) {
                C3041cR p6 = aqArr[i10].p();
                int i11 = p6.f29710a;
                int i12 = 0;
                while (i12 < i11) {
                    B8 a9 = p6.a(i12);
                    int i13 = a9.f23997a;
                    TP[] tpArr = new TP[i13];
                    int i14 = 0;
                    while (i14 < i13) {
                        TP tp = a9.f24000d[i14];
                        tp.getClass();
                        C4065vP c4065vP = new C4065vP(tp);
                        String str = tp.f27763a;
                        if (str == null) {
                            str = "";
                        }
                        AQ[] aqArr2 = aqArr;
                        int i15 = i9;
                        StringBuilder sb = new StringBuilder(str.length() + CL.b(i10, 1));
                        sb.append(i10);
                        sb.append(":");
                        sb.append(str);
                        c4065vP.f34773a = sb.toString();
                        String str2 = tp.f27774m;
                        if (str2 != null) {
                            StringBuilder sb2 = new StringBuilder(CL.b(i10, 1) + str2.length());
                            sb2.append(i10);
                            sb2.append(":");
                            sb2.append(str2);
                            c4065vP.f34783l = sb2.toString();
                        }
                        tpArr[i14] = new TP(c4065vP);
                        i14++;
                        aqArr = aqArr2;
                        i9 = i15;
                    }
                    AQ[] aqArr3 = aqArr;
                    int i16 = i9;
                    int b9 = CL.b(i10, 1);
                    String str3 = a9.f23998b;
                    StringBuilder sb3 = new StringBuilder(b9 + String.valueOf(str3).length());
                    sb3.append(i10);
                    sb3.append(":");
                    sb3.append(str3);
                    B8 b82 = new B8(sb3.toString(), tpArr);
                    this.f25174x.put(b82, a9);
                    i9 = i16 + 1;
                    b8Arr[i16] = b82;
                    i12++;
                    aqArr = aqArr3;
                }
            }
            this.f25176z = new C3041cR(b8Arr);
            ?? r12 = this.f25175y;
            r12.getClass();
            r12.k(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final void l(long j9) {
        for (AQ aq : this.f25168A) {
            aq.l(j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final void m() {
        int i = 0;
        while (true) {
            AQ[] aqArr = this.f25170n;
            if (i >= aqArr.length) {
                return;
            }
            aqArr[i].m();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final C3041cR p() {
        C3041cR c3041cR = this.f25176z;
        c3041cR.getClass();
        return c3041cR;
    }

    @Override // com.google.android.gms.internal.ads.AQ
    public final long t() {
        long j9 = -9223372036854775807L;
        for (AQ aq : this.f25168A) {
            long t9 = aq.t();
            if (t9 != com.anythink.basead.exoplayer.b.f6539b) {
                if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
                    for (AQ aq2 : this.f25168A) {
                        if (aq2 == aq) {
                            break;
                        }
                        if (aq2.h(t9) != t9) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j9 = t9;
                } else if (t9 != j9) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j9 != com.anythink.basead.exoplayer.b.f6539b && aq.h(j9) != j9) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j9;
    }
}
