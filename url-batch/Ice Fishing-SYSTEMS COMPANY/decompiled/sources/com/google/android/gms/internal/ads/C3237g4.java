package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.g4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3237g4 implements InterfaceC3291h4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30948a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30949b;

    /* renamed from: c, reason: collision with root package name */
    public long f30950c;

    /* renamed from: d, reason: collision with root package name */
    public int f30951d;

    /* renamed from: e, reason: collision with root package name */
    public int f30952e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f30953f;

    /* renamed from: g, reason: collision with root package name */
    public Object f30954g;

    public C3237g4() {
        this.f30948a = 1;
        this.f30953f = new Lr(10);
        this.f30950c = com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void a() {
        switch (this.f30948a) {
            case 0:
                this.f30949b = false;
                this.f30950c = com.anythink.basead.exoplayer.b.f6539b;
                break;
            default:
                this.f30949b = false;
                this.f30950c = com.anythink.basead.exoplayer.b.f6539b;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void b(boolean z8) {
        int i;
        switch (this.f30948a) {
            case 0:
                if (this.f30949b) {
                    PA.T(this.f30950c != com.anythink.basead.exoplayer.b.f6539b);
                    int i4 = 0;
                    while (true) {
                        InterfaceC3448k1[] interfaceC3448k1Arr = (InterfaceC3448k1[]) this.f30954g;
                        if (i4 >= interfaceC3448k1Arr.length) {
                            this.f30949b = false;
                            break;
                        } else {
                            interfaceC3448k1Arr[i4].b(this.f30950c, 1, this.f30952e, 0, null);
                            i4++;
                        }
                    }
                }
                break;
            default:
                ((InterfaceC3448k1) this.f30954g).getClass();
                if (this.f30949b && (i = this.f30951d) != 0 && this.f30952e == i) {
                    PA.T(this.f30950c != com.anythink.basead.exoplayer.b.f6539b);
                    ((InterfaceC3448k1) this.f30954g).b(this.f30950c, 1, this.f30951d, 0, null);
                    this.f30949b = false;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void c(Lr lr) {
        boolean z8;
        boolean z9;
        switch (this.f30948a) {
            case 0:
                if (this.f30949b) {
                    int i = 0;
                    if (this.f30951d == 2) {
                        if (lr.B() == 0) {
                            z9 = false;
                        } else {
                            if (lr.K() != 32) {
                                this.f30949b = false;
                            }
                            this.f30951d--;
                            z9 = this.f30949b;
                        }
                        if (!z9) {
                        }
                    }
                    if (this.f30951d == 1) {
                        if (lr.B() == 0) {
                            z8 = false;
                        } else {
                            if (lr.K() != 0) {
                                this.f30949b = false;
                            }
                            this.f30951d--;
                            z8 = this.f30949b;
                        }
                        if (!z8) {
                        }
                    }
                    int i4 = lr.f26234b;
                    int B8 = lr.B();
                    while (true) {
                        InterfaceC3448k1[] interfaceC3448k1Arr = (InterfaceC3448k1[]) this.f30954g;
                        if (i >= interfaceC3448k1Arr.length) {
                            this.f30952e += B8;
                            break;
                        } else {
                            InterfaceC3448k1 interfaceC3448k1 = interfaceC3448k1Arr[i];
                            lr.E(i4);
                            interfaceC3448k1.a(B8, lr);
                            i++;
                        }
                    }
                }
                break;
            default:
                ((InterfaceC3448k1) this.f30954g).getClass();
                if (this.f30949b) {
                    int B9 = lr.B();
                    int i9 = this.f30952e;
                    if (i9 < 10) {
                        int min = Math.min(B9, 10 - i9);
                        byte[] bArr = lr.f26233a;
                        int i10 = lr.f26234b;
                        Lr lr2 = (Lr) this.f30953f;
                        System.arraycopy(bArr, i10, lr2.f26233a, this.f30952e, min);
                        if (this.f30952e + min == 10) {
                            lr2.E(0);
                            if (lr2.K() != 73 || lr2.K() != 68 || lr2.K() != 51) {
                                AbstractC3217fl.I("Id3Reader", "Discarding invalid ID3 tag");
                                this.f30949b = false;
                                break;
                            } else {
                                lr2.G(3);
                                this.f30951d = lr2.g() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(B9, this.f30951d - this.f30952e);
                    ((InterfaceC3448k1) this.f30954g).a(min2, lr);
                    this.f30952e += min2;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void d(int i, long j9) {
        switch (this.f30948a) {
            case 0:
                if ((i & 4) != 0) {
                    this.f30949b = true;
                    this.f30950c = j9;
                    this.f30952e = 0;
                    this.f30951d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f30949b = true;
                    this.f30950c = j9;
                    this.f30951d = 0;
                    this.f30952e = 0;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3291h4
    public final void e(Q0 q02, D4 d42) {
        switch (this.f30948a) {
            case 0:
                int i = 0;
                while (true) {
                    InterfaceC3448k1[] interfaceC3448k1Arr = (InterfaceC3448k1[]) this.f30954g;
                    if (i >= interfaceC3448k1Arr.length) {
                        break;
                    } else {
                        C4 c4 = (C4) ((List) this.f30953f).get(i);
                        d42.a();
                        d42.b();
                        InterfaceC3448k1 x3 = q02.x(d42.f24337d, 3);
                        C4065vP c4065vP = new C4065vP();
                        d42.b();
                        c4065vP.f34773a = d42.f24338e;
                        c4065vP.d("video/mp2t");
                        c4065vP.e(com.anythink.basead.exoplayer.k.o.aj);
                        c4065vP.f34788q = Collections.singletonList(c4.f24140b);
                        c4065vP.f34776d = c4.f24139a;
                        x3.e(new TP(c4065vP));
                        interfaceC3448k1Arr[i] = x3;
                        i++;
                    }
                }
            default:
                d42.a();
                d42.b();
                InterfaceC3448k1 x9 = q02.x(d42.f24337d, 5);
                this.f30954g = x9;
                C4065vP c4065vP2 = new C4065vP();
                d42.b();
                c4065vP2.f34773a = d42.f24338e;
                c4065vP2.d("video/mp2t");
                c4065vP2.e(com.anythink.basead.exoplayer.k.o.f8597V);
                x9.e(new TP(c4065vP2));
                break;
        }
    }

    public C3237g4(List list) {
        this.f30948a = 0;
        this.f30953f = list;
        this.f30954g = new InterfaceC3448k1[list.size()];
        this.f30950c = com.anythink.basead.exoplayer.b.f6539b;
    }
}
