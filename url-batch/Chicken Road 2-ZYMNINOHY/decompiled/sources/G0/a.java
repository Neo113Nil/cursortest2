package G0;

import E.AbstractC0005f;
import S0.s;
import T.C0096n;
import T.E;
import T.G;
import T.r;
import V0.j;
import W.AbstractC0108a;
import W.u;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import v2.a0;
import y0.F;
import y0.k;
import y0.n;
import y0.o;
import y0.p;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: b, reason: collision with root package name */
    public p f815b;

    /* renamed from: c, reason: collision with root package name */
    public int f816c;

    /* renamed from: d, reason: collision with root package name */
    public int f817d;

    /* renamed from: e, reason: collision with root package name */
    public int f818e;

    /* renamed from: g, reason: collision with root package name */
    public H0.b f820g;

    /* renamed from: h, reason: collision with root package name */
    public o f821h;

    /* renamed from: i, reason: collision with root package name */
    public c f822i;

    /* renamed from: j, reason: collision with root package name */
    public s f823j;

    /* renamed from: a, reason: collision with root package name */
    public final u f814a = new u(2);

    /* renamed from: f, reason: collision with root package name */
    public long f819f = -1;

    @Override // y0.n
    public final void a(long j4, long j5) {
        if (j4 == 0) {
            this.f816c = 0;
            this.f823j = null;
        } else if (this.f816c == 5) {
            s sVar = this.f823j;
            sVar.getClass();
            sVar.a(j4, j5);
        }
    }

    @Override // y0.n
    public final boolean b(o oVar) {
        String u4;
        k kVar = (k) oVar;
        u uVar = this.f814a;
        uVar.J(2);
        kVar.l(uVar.f3351a, 0, 2, false);
        if (uVar.G() == 65496) {
            while (true) {
                uVar.J(2);
                kVar.l(uVar.f3351a, 0, 2, false);
                int G4 = uVar.G();
                this.f817d = G4;
                if (G4 == 65498) {
                    break;
                }
                uVar.J(2);
                kVar.E(uVar.f3351a, 0, 2);
                int G5 = uVar.G() - 2;
                if (G5 < 0) {
                    break;
                }
                if (this.f817d != 65505) {
                    kVar.a(G5, false);
                } else {
                    uVar.J(G5);
                    kVar.l(uVar.f3351a, 0, G5, false);
                    if (Objects.equals(uVar.u(), "http://ns.adobe.com/xap/1.0/") && (u4 = uVar.u()) != null) {
                        for (int i4 = 0; i4 < 4; i4++) {
                            if (u4.contains(d.f830a[i4] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x018b  */
    @Override // y0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(o oVar, r rVar) {
        String u4;
        c cVar;
        a0 a0Var;
        int i4;
        H0.b bVar;
        long j4;
        long j5;
        int i5 = this.f816c;
        long j6 = -1;
        u uVar = this.f814a;
        if (i5 == 0) {
            uVar.J(2);
            oVar.readFully(uVar.f3351a, 0, 2);
            int G4 = uVar.G();
            this.f817d = G4;
            if (G4 == 65498) {
                if (this.f819f != -1) {
                    this.f816c = 4;
                    return 0;
                }
                f();
                return 0;
            }
            if ((G4 < 65488 || G4 > 65497) && G4 != 65281) {
                this.f816c = 1;
            }
            return 0;
        }
        if (i5 == 1) {
            uVar.J(2);
            oVar.E(uVar.f3351a, 0, 2);
            this.f818e = uVar.G() - 2;
            oVar.v(2);
            this.f816c = 2;
            return 0;
        }
        if (i5 != 2) {
            if (i5 != 4) {
                if (i5 != 5) {
                    if (i5 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f822i == null || oVar != this.f821h) {
                    this.f821h = oVar;
                    this.f822i = new c(oVar, this.f819f);
                }
                s sVar = this.f823j;
                sVar.getClass();
                int c4 = sVar.c(this.f822i, rVar);
                if (c4 == 1) {
                    rVar.f2881a += this.f819f;
                }
                return c4;
            }
            long position = oVar.getPosition();
            long j7 = this.f819f;
            if (position != j7) {
                rVar.f2881a = j7;
                return 1;
            }
            if (!oVar.l(uVar.f3351a, 0, 1, true)) {
                f();
                return 0;
            }
            oVar.u();
            if (this.f823j == null) {
                this.f823j = new s(j.f3206v0, 8);
            }
            c cVar2 = new c(oVar, this.f819f);
            this.f822i = cVar2;
            if (!this.f823j.b(cVar2)) {
                f();
                return 0;
            }
            s sVar2 = this.f823j;
            long j8 = this.f819f;
            p pVar = this.f815b;
            pVar.getClass();
            sVar2.e(new c(j8, pVar, 6));
            H0.b bVar2 = this.f820g;
            bVar2.getClass();
            p pVar2 = this.f815b;
            pVar2.getClass();
            F z = pVar2.z(1024, 4);
            C0096n c0096n = new C0096n();
            c0096n.f2830l = T.F.n("image/jpeg");
            c0096n.f2829k = new E(bVar2);
            AbstractC0005f.w(c0096n, z);
            this.f816c = 5;
            return 0;
        }
        if (this.f817d == 65505) {
            u uVar2 = new u(this.f818e);
            oVar.readFully(uVar2.f3351a, 0, this.f818e);
            if (this.f820g == null && "http://ns.adobe.com/xap/1.0/".equals(uVar2.u()) && (u4 = uVar2.u()) != null) {
                long length = oVar.getLength();
                if (length != -1) {
                    try {
                        cVar = d.a(u4);
                    } catch (G | NumberFormatException | XmlPullParserException unused) {
                        AbstractC0108a.s("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        cVar = null;
                    }
                    if (cVar != null && (i4 = (a0Var = (a0) cVar.f829c).f15607d) >= 2) {
                        int i6 = i4 - 1;
                        long j9 = -1;
                        long j10 = -1;
                        long j11 = -1;
                        long j12 = -1;
                        while (i6 >= 0) {
                            b bVar3 = (b) a0Var.get(i6);
                            String str = bVar3.f824a;
                            boolean z4 = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (i6 == 0) {
                                j4 = j6;
                                length -= bVar3.f826c;
                                j5 = 0;
                            } else {
                                j4 = j6;
                                j5 = length - bVar3.f825b;
                            }
                            long j13 = length;
                            length = j5;
                            if (z4 && length != j13) {
                                j12 = j13 - length;
                                j11 = length;
                            }
                            if (i6 == 0) {
                                j10 = j13;
                                j9 = length;
                            }
                            i6--;
                            j6 = j4;
                        }
                        long j14 = j6;
                        if (j11 != j14 && j12 != j14 && j9 != j14 && j10 != j14) {
                            bVar = new H0.b(j9, j10, cVar.f828b, j11, j12);
                            this.f820g = bVar;
                            if (bVar != null) {
                                this.f819f = bVar.f1087d;
                            }
                        }
                    }
                }
                bVar = null;
                this.f820g = bVar;
                if (bVar != null) {
                }
            }
        } else {
            oVar.v(this.f818e);
        }
        this.f816c = 0;
        return 0;
    }

    @Override // y0.n
    public final void e(p pVar) {
        this.f815b = pVar;
    }

    public final void f() {
        p pVar = this.f815b;
        pVar.getClass();
        pVar.r();
        this.f815b.x(new A0.b(-9223372036854775807L));
        this.f816c = 6;
    }

    @Override // y0.n
    public final void release() {
        s sVar = this.f823j;
        if (sVar != null) {
            sVar.getClass();
        }
    }
}
