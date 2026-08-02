package f1;

import E.AbstractC0005f;
import T.C0096n;
import W.AbstractC0108a;
import a.AbstractC0124a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8596a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8597b;

    /* renamed from: c, reason: collision with root package name */
    public long f8598c;

    /* renamed from: d, reason: collision with root package name */
    public int f8599d;

    /* renamed from: e, reason: collision with root package name */
    public int f8600e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8601f;

    /* renamed from: g, reason: collision with root package name */
    public Object f8602g;

    public g(List list) {
        this.f8596a = 0;
        this.f8601f = list;
        this.f8602g = new y0.F[list.size()];
        this.f8598c = -9223372036854775807L;
    }

    @Override // f1.h
    public final void a(W.u uVar) {
        boolean z;
        boolean z4;
        switch (this.f8596a) {
            case 0:
                if (this.f8597b) {
                    if (this.f8599d == 2) {
                        if (uVar.a() == 0) {
                            z4 = false;
                        } else {
                            if (uVar.z() != 32) {
                                this.f8597b = false;
                            }
                            this.f8599d--;
                            z4 = this.f8597b;
                        }
                        if (!z4) {
                        }
                    }
                    if (this.f8599d == 1) {
                        if (uVar.a() == 0) {
                            z = false;
                        } else {
                            if (uVar.z() != 0) {
                                this.f8597b = false;
                            }
                            this.f8599d--;
                            z = this.f8597b;
                        }
                        if (!z) {
                        }
                    }
                    int i4 = uVar.f3352b;
                    int a3 = uVar.a();
                    for (y0.F f4 : (y0.F[]) this.f8602g) {
                        uVar.M(i4);
                        f4.a(a3, uVar);
                    }
                    this.f8600e += a3;
                    break;
                }
                break;
            default:
                W.u uVar2 = (W.u) this.f8601f;
                ((y0.F) this.f8602g).getClass();
                if (this.f8597b) {
                    int a4 = uVar.a();
                    int i5 = this.f8600e;
                    if (i5 < 10) {
                        int min = Math.min(a4, 10 - i5);
                        System.arraycopy(uVar.f3351a, uVar.f3352b, uVar2.f3351a, this.f8600e, min);
                        if (this.f8600e + min == 10) {
                            uVar2.M(0);
                            if (73 != uVar2.z() || 68 != uVar2.z() || 51 != uVar2.z()) {
                                AbstractC0108a.s("Id3Reader", "Discarding invalid ID3 tag");
                                this.f8597b = false;
                                break;
                            } else {
                                uVar2.N(3);
                                this.f8599d = uVar2.y() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a4, this.f8599d - this.f8600e);
                    ((y0.F) this.f8602g).a(min2, uVar);
                    this.f8600e += min2;
                    break;
                }
                break;
        }
    }

    @Override // f1.h
    public final void b() {
        switch (this.f8596a) {
            case 0:
                this.f8597b = false;
                this.f8598c = -9223372036854775807L;
                break;
            default:
                this.f8597b = false;
                this.f8598c = -9223372036854775807L;
                break;
        }
    }

    @Override // f1.h
    public final void c(boolean z) {
        int i4;
        switch (this.f8596a) {
            case 0:
                if (this.f8597b) {
                    AbstractC0124a.t(this.f8598c != -9223372036854775807L);
                    for (y0.F f4 : (y0.F[]) this.f8602g) {
                        f4.e(this.f8598c, 1, this.f8600e, 0, null);
                    }
                    this.f8597b = false;
                    break;
                }
                break;
            default:
                ((y0.F) this.f8602g).getClass();
                if (this.f8597b && (i4 = this.f8599d) != 0 && this.f8600e == i4) {
                    AbstractC0124a.t(this.f8598c != -9223372036854775807L);
                    ((y0.F) this.f8602g).e(this.f8598c, 1, this.f8599d, 0, null);
                    this.f8597b = false;
                    break;
                }
                break;
        }
    }

    @Override // f1.h
    public final void d(int i4, long j4) {
        switch (this.f8596a) {
            case 0:
                if ((i4 & 4) != 0) {
                    this.f8597b = true;
                    this.f8598c = j4;
                    this.f8600e = 0;
                    this.f8599d = 2;
                    break;
                }
                break;
            default:
                if ((i4 & 4) != 0) {
                    this.f8597b = true;
                    this.f8598c = j4;
                    this.f8599d = 0;
                    this.f8600e = 0;
                    break;
                }
                break;
        }
    }

    @Override // f1.h
    public final void e(y0.p pVar, E e4) {
        switch (this.f8596a) {
            case 0:
                y0.F[] fArr = (y0.F[]) this.f8602g;
                for (int i4 = 0; i4 < fArr.length; i4++) {
                    D d4 = (D) ((List) this.f8601f).get(i4);
                    e4.a();
                    e4.c();
                    y0.F z = pVar.z(e4.f8529c, 3);
                    C0096n c0096n = new C0096n();
                    e4.c();
                    c0096n.f2819a = (String) e4.f8531e;
                    c0096n.f2830l = T.F.n("video/mp2t");
                    c0096n.f2831m = T.F.n("application/dvbsubs");
                    c0096n.f2832p = Collections.singletonList(d4.f8526b);
                    c0096n.f2822d = d4.f8525a;
                    AbstractC0005f.w(c0096n, z);
                    fArr[i4] = z;
                }
                break;
            default:
                e4.a();
                e4.c();
                y0.F z4 = pVar.z(e4.f8529c, 5);
                this.f8602g = z4;
                C0096n c0096n2 = new C0096n();
                e4.c();
                c0096n2.f2819a = (String) e4.f8531e;
                c0096n2.f2830l = T.F.n("video/mp2t");
                c0096n2.f2831m = T.F.n("application/id3");
                AbstractC0005f.w(c0096n2, z4);
                break;
        }
    }

    public g() {
        this.f8596a = 1;
        this.f8601f = new W.u(10);
        this.f8598c = -9223372036854775807L;
    }
}
