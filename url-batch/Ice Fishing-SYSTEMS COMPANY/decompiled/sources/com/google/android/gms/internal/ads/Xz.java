package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Xz implements Uz {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28745a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3901sN f28746b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2970bA f28747c;

    /* renamed from: d, reason: collision with root package name */
    public final C4158xA f28748d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f28749e;

    /* renamed from: f, reason: collision with root package name */
    public final Kz f28750f;

    /* renamed from: g, reason: collision with root package name */
    public final Dw f28751g;

    public Xz(Context context, InterfaceC3901sN interfaceC3901sN, InterfaceC2970bA interfaceC2970bA, C4158xA c4158xA, ExecutorService executorService, Kz kz, Dw dw) {
        this.f28745a = context;
        this.f28746b = interfaceC3901sN;
        this.f28747c = interfaceC2970bA;
        this.f28748d = c4158xA;
        this.f28749e = executorService;
        this.f28750f = kz;
        this.f28751g = dw;
    }

    public static Jy b(int i) {
        Iy D8 = Jy.D();
        D8.h();
        ((Jy) D8.f30000u).I(i);
        return (Jy) D8.j();
    }

    @Override // com.google.android.gms.internal.ads.Uz
    public final JD a() {
        InterfaceC3901sN interfaceC3901sN = this.f28746b;
        Objects.requireNonNull(interfaceC3901sN);
        Vs vs = new Vs(7, interfaceC3901sN);
        ExecutorService executorService = this.f28749e;
        JD s3 = JD.s(C3686oN.p(vs, executorService));
        final int i = 1;
        XA xa = new XA(this) { // from class: com.google.android.gms.internal.ads.Wz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Xz f28540b;

            {
                this.f28540b = this;
            }

            @Override // com.google.android.gms.internal.ads.XA
            public final Object apply(Object obj) {
                boolean z8;
                switch (i) {
                    case 0:
                        My my = (My) obj;
                        Xz xz = this.f28540b;
                        InterfaceC3901sN interfaceC3901sN2 = xz.f28746b;
                        String A8 = my.A().A();
                        String B8 = my.A().B();
                        C4158xA c4158xA = xz.f28748d;
                        C4104wA a9 = c4158xA.a(15203);
                        try {
                            a9.a();
                            Yw e6 = AbstractC3194fG.e(xz.f28745a, (X7) interfaceC3901sN2.d(), A8, B8, xz.f28751g);
                            a9.c();
                            int i4 = 2;
                            int i9 = e6.f28923v;
                            if (i9 == 2) {
                                c4158xA.b(15208);
                                return Xz.b(4);
                            }
                            byte[] bArr = e6.f28922u;
                            if (bArr == null || bArr.length == 0) {
                                c4158xA.b(5010);
                                return Xz.b(8);
                            }
                            try {
                                Z7 E8 = Z7.E(bArr, YK.a());
                                if (E8.A().A().isEmpty() || E8.A().B().isEmpty() || E8.C().a().length == 0) {
                                    c4158xA.b(15207);
                                } else {
                                    if (my.equals(My.G()) || !TextUtils.equals(my.A().A(), E8.A().A()) || !TextUtils.equals(my.A().B(), E8.A().B())) {
                                        if (i9 == 4) {
                                            byte[] a10 = E8.B().a();
                                            Kz kz = xz.f28750f;
                                            File file = kz.f26075a;
                                            try {
                                                AbstractC3035cL.u(file);
                                                AbstractC3035cL.l(file, a10);
                                                kz.f26076b.getClass();
                                                z8 = Cw.a(file);
                                            } catch (IOException | GeneralSecurityException e9) {
                                                kz.f26077c.d(2027, e9);
                                                z8 = false;
                                            }
                                            try {
                                                file.delete();
                                            } catch (SecurityException unused) {
                                            }
                                            if (!z8) {
                                                c4158xA.b(15206);
                                                return Xz.b(12);
                                            }
                                            i9 = 4;
                                        }
                                        Iy D8 = Jy.D();
                                        if (i9 == 2) {
                                            i4 = 4;
                                        } else if (i9 != 3) {
                                            i4 = i9 != 4 ? i9 != 6 ? 1 : 5 : 3;
                                        }
                                        D8.h();
                                        ((Jy) D8.f30000u).I(i4);
                                        Ly F8 = My.F();
                                        C3077d8 A9 = E8.A();
                                        F8.h();
                                        ((My) F8.f30000u).H(A9);
                                        X7 x72 = (X7) interfaceC3901sN2.d();
                                        F8.h();
                                        ((My) F8.f30000u).J(x72);
                                        My my2 = (My) F8.j();
                                        D8.h();
                                        ((Jy) D8.f30000u).E(my2);
                                        SK B9 = E8.B();
                                        D8.h();
                                        ((Jy) D8.f30000u).G(B9);
                                        SK C7 = E8.C();
                                        D8.h();
                                        ((Jy) D8.f30000u).F(C7);
                                        return (Jy) D8.j();
                                    }
                                    c4158xA.b(15209);
                                }
                                return Xz.b(11);
                            } catch (C3845rL e10) {
                                c4158xA.d(15205, e10);
                                return Xz.b(9);
                            } catch (NullPointerException unused2) {
                                c4158xA.b(15210);
                                return Xz.b(10);
                            }
                        } catch (Throwable th) {
                            try {
                                a9.b(th);
                                throw th;
                            } catch (Throwable th2) {
                                a9.c();
                                throw th2;
                            }
                        }
                    default:
                        X7 x73 = (X7) obj;
                        Xz xz2 = this.f28540b;
                        xz2.getClass();
                        if (AbstractC3035cL.o(x73)) {
                            return new Integer(0);
                        }
                        xz2.f28748d.c(15204, x73.name());
                        throw new Vz();
                }
            }
        };
        HD hd = HD.f25326n;
        final int i4 = 0;
        ZC u7 = C3686oN.u(C3686oN.A(C3686oN.y(C3686oN.A(s3, xa, hd), new C3907sc(16, this), hd), new XA(this) { // from class: com.google.android.gms.internal.ads.Wz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Xz f28540b;

            {
                this.f28540b = this;
            }

            @Override // com.google.android.gms.internal.ads.XA
            public final Object apply(Object obj) {
                boolean z8;
                switch (i4) {
                    case 0:
                        My my = (My) obj;
                        Xz xz = this.f28540b;
                        InterfaceC3901sN interfaceC3901sN2 = xz.f28746b;
                        String A8 = my.A().A();
                        String B8 = my.A().B();
                        C4158xA c4158xA = xz.f28748d;
                        C4104wA a9 = c4158xA.a(15203);
                        try {
                            a9.a();
                            Yw e6 = AbstractC3194fG.e(xz.f28745a, (X7) interfaceC3901sN2.d(), A8, B8, xz.f28751g);
                            a9.c();
                            int i42 = 2;
                            int i9 = e6.f28923v;
                            if (i9 == 2) {
                                c4158xA.b(15208);
                                return Xz.b(4);
                            }
                            byte[] bArr = e6.f28922u;
                            if (bArr == null || bArr.length == 0) {
                                c4158xA.b(5010);
                                return Xz.b(8);
                            }
                            try {
                                Z7 E8 = Z7.E(bArr, YK.a());
                                if (E8.A().A().isEmpty() || E8.A().B().isEmpty() || E8.C().a().length == 0) {
                                    c4158xA.b(15207);
                                } else {
                                    if (my.equals(My.G()) || !TextUtils.equals(my.A().A(), E8.A().A()) || !TextUtils.equals(my.A().B(), E8.A().B())) {
                                        if (i9 == 4) {
                                            byte[] a10 = E8.B().a();
                                            Kz kz = xz.f28750f;
                                            File file = kz.f26075a;
                                            try {
                                                AbstractC3035cL.u(file);
                                                AbstractC3035cL.l(file, a10);
                                                kz.f26076b.getClass();
                                                z8 = Cw.a(file);
                                            } catch (IOException | GeneralSecurityException e9) {
                                                kz.f26077c.d(2027, e9);
                                                z8 = false;
                                            }
                                            try {
                                                file.delete();
                                            } catch (SecurityException unused) {
                                            }
                                            if (!z8) {
                                                c4158xA.b(15206);
                                                return Xz.b(12);
                                            }
                                            i9 = 4;
                                        }
                                        Iy D8 = Jy.D();
                                        if (i9 == 2) {
                                            i42 = 4;
                                        } else if (i9 != 3) {
                                            i42 = i9 != 4 ? i9 != 6 ? 1 : 5 : 3;
                                        }
                                        D8.h();
                                        ((Jy) D8.f30000u).I(i42);
                                        Ly F8 = My.F();
                                        C3077d8 A9 = E8.A();
                                        F8.h();
                                        ((My) F8.f30000u).H(A9);
                                        X7 x72 = (X7) interfaceC3901sN2.d();
                                        F8.h();
                                        ((My) F8.f30000u).J(x72);
                                        My my2 = (My) F8.j();
                                        D8.h();
                                        ((Jy) D8.f30000u).E(my2);
                                        SK B9 = E8.B();
                                        D8.h();
                                        ((Jy) D8.f30000u).G(B9);
                                        SK C7 = E8.C();
                                        D8.h();
                                        ((Jy) D8.f30000u).F(C7);
                                        return (Jy) D8.j();
                                    }
                                    c4158xA.b(15209);
                                }
                                return Xz.b(11);
                            } catch (C3845rL e10) {
                                c4158xA.d(15205, e10);
                                return Xz.b(9);
                            } catch (NullPointerException unused2) {
                                c4158xA.b(15210);
                                return Xz.b(10);
                            }
                        } catch (Throwable th) {
                            try {
                                a9.b(th);
                                throw th;
                            } catch (Throwable th2) {
                                a9.c();
                                throw th2;
                            }
                        }
                    default:
                        X7 x73 = (X7) obj;
                        Xz xz2 = this.f28540b;
                        xz2.getClass();
                        if (AbstractC3035cL.o(x73)) {
                            return new Integer(0);
                        }
                        xz2.f28748d.c(15204, x73.name());
                        throw new Vz();
                }
            }
        }, executorService), Vz.class, Rz.f27456c, hd);
        this.f28748d.e(15202, u7);
        return u7;
    }
}
