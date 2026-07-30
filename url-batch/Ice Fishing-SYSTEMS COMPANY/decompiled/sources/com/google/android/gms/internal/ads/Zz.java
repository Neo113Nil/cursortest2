package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Zz implements Uz {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29130a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f29131b;

    /* renamed from: c, reason: collision with root package name */
    public final C3875ry f29132c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29133d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29134e;

    /* renamed from: f, reason: collision with root package name */
    public final C4158xA f29135f;

    /* renamed from: g, reason: collision with root package name */
    public final C2915aA f29136g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29137h;

    public Zz(Context context, ExecutorService executorService, C3066cy c3066cy, C3875ry c3875ry, C4158xA c4158xA, C2915aA c2915aA) {
        this.f29130a = context;
        this.f29131b = executorService;
        this.f29132c = c3875ry;
        this.f29135f = c4158xA;
        this.f29136g = c2915aA;
        this.f29133d = c3066cy.R();
        int L8 = c3066cy.L();
        if (L8 == 1) {
            AbstractC3684oL.a();
            throw null;
        }
        int i = L8 - 2;
        this.f29137h = i != 0 ? i != 1 ? i != 2 ? 5 : 4 : 3 : 2;
        this.f29134e = c3066cy.X().C();
    }

    public static Jy b(int i) {
        Iy D8 = Jy.D();
        D8.h();
        ((Jy) D8.f30000u).I(i);
        return (Jy) D8.j();
    }

    @Override // com.google.android.gms.internal.ads.Uz
    public final JD a() {
        int i;
        Q7 A8 = R7.A();
        byte[] k6 = AbstractC3194fG.k();
        QK qk = SK.f27529u;
        QK s3 = SK.s(k6, 0, k6.length);
        A8.h();
        ((R7) A8.f30000u).B(s3);
        long j9 = Build.VERSION.SDK_INT;
        A8.h();
        ((R7) A8.f30000u).C(j9);
        String str = Build.MODEL;
        A8.h();
        ((R7) A8.f30000u).D(str);
        Context context = this.f29130a;
        String packageName = context.getPackageName();
        A8.h();
        ((R7) A8.f30000u).E(packageName);
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        A8.h();
        ((R7) A8.f30000u).F(i);
        A8.h();
        ((R7) A8.f30000u).G(this.f29133d);
        A8.h();
        ((R7) A8.f30000u).H(3);
        A8.h();
        ((R7) A8.f30000u).I(this.f29137h);
        byte[] b9 = ((R7) A8.j()).b();
        FC fc = HC.f25321e;
        if (fc.f25324b != null) {
            fc = new FC(fc.f25323a, (Character) null);
        }
        String g9 = fc.g(b9.length, b9);
        C3875ry c3875ry = this.f29132c;
        c3875ry.getClass();
        final int i4 = 2;
        C3999uD A9 = C3686oN.A(JD.s(com.bumptech.glide.f.i(new Zw(c3875ry, Uri.parse(this.f29134e).buildUpon().appendQueryParameter("aspq", g9).build().toString(), false, (String) null, new byte[0]))), new XA(this) { // from class: com.google.android.gms.internal.ads.Yz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Zz f28933b;

            {
                this.f28933b = this;
            }

            @Override // com.google.android.gms.internal.ads.XA
            public final Object apply(Object obj) {
                Jy b10;
                switch (i4) {
                    case 0:
                        this.f28933b.f29135f.b(20007);
                        return Zz.b(13);
                    case 1:
                        this.f28933b.f29135f.b(20008);
                        return Zz.b(13);
                    default:
                        C3822qy c3822qy = (C3822qy) obj;
                        Zz zz = this.f28933b;
                        zz.getClass();
                        int i9 = c3822qy.f33913a;
                        C4158xA c4158xA = zz.f29135f;
                        if (i9 != 200) {
                            c4158xA.c(20003, new String(AbstractC3194fG.k(), StandardCharsets.UTF_8));
                            return Zz.b(7);
                        }
                        try {
                            String str2 = new String(c3822qy.f33914b);
                            if (TextUtils.isEmpty(str2)) {
                                c4158xA.b(20004);
                                b10 = Zz.b(8);
                            } else {
                                S7 C7 = S7.C(PA.x(str2, true), YK.a());
                                if (C7.A().C() && C7.A().A()) {
                                    if (zz.f29136g.a(C7)) {
                                        Iy D8 = Jy.D();
                                        Ly F8 = My.F();
                                        C2968b8 B8 = C7.A().B();
                                        F8.h();
                                        ((My) F8.f30000u).I(B8);
                                        List B9 = C7.B();
                                        F8.h();
                                        ((My) F8.f30000u).K((InterfaceC3414jL) B9);
                                        My my = (My) F8.j();
                                        D8.h();
                                        ((Jy) D8.f30000u).E(my);
                                        SK D9 = C7.A().D();
                                        D8.h();
                                        ((Jy) D8.f30000u).F(D9);
                                        D8.h();
                                        ((Jy) D8.f30000u).I(2);
                                        b10 = (Jy) D8.j();
                                    } else {
                                        c4158xA.b(20006);
                                        b10 = Zz.b(12);
                                    }
                                }
                                c4158xA.b(20004);
                                b10 = Zz.b(8);
                            }
                            return b10;
                        } catch (Throwable th) {
                            c4158xA.d(20005, th);
                            return Zz.b(6);
                        }
                }
            }
        }, this.f29131b);
        final int i9 = 0;
        XA xa = new XA(this) { // from class: com.google.android.gms.internal.ads.Yz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Zz f28933b;

            {
                this.f28933b = this;
            }

            @Override // com.google.android.gms.internal.ads.XA
            public final Object apply(Object obj) {
                Jy b10;
                switch (i9) {
                    case 0:
                        this.f28933b.f29135f.b(20007);
                        return Zz.b(13);
                    case 1:
                        this.f28933b.f29135f.b(20008);
                        return Zz.b(13);
                    default:
                        C3822qy c3822qy = (C3822qy) obj;
                        Zz zz = this.f28933b;
                        zz.getClass();
                        int i92 = c3822qy.f33913a;
                        C4158xA c4158xA = zz.f29135f;
                        if (i92 != 200) {
                            c4158xA.c(20003, new String(AbstractC3194fG.k(), StandardCharsets.UTF_8));
                            return Zz.b(7);
                        }
                        try {
                            String str2 = new String(c3822qy.f33914b);
                            if (TextUtils.isEmpty(str2)) {
                                c4158xA.b(20004);
                                b10 = Zz.b(8);
                            } else {
                                S7 C7 = S7.C(PA.x(str2, true), YK.a());
                                if (C7.A().C() && C7.A().A()) {
                                    if (zz.f29136g.a(C7)) {
                                        Iy D8 = Jy.D();
                                        Ly F8 = My.F();
                                        C2968b8 B8 = C7.A().B();
                                        F8.h();
                                        ((My) F8.f30000u).I(B8);
                                        List B9 = C7.B();
                                        F8.h();
                                        ((My) F8.f30000u).K((InterfaceC3414jL) B9);
                                        My my = (My) F8.j();
                                        D8.h();
                                        ((Jy) D8.f30000u).E(my);
                                        SK D9 = C7.A().D();
                                        D8.h();
                                        ((Jy) D8.f30000u).F(D9);
                                        D8.h();
                                        ((Jy) D8.f30000u).I(2);
                                        b10 = (Jy) D8.j();
                                    } else {
                                        c4158xA.b(20006);
                                        b10 = Zz.b(12);
                                    }
                                }
                                c4158xA.b(20004);
                                b10 = Zz.b(8);
                            }
                            return b10;
                        } catch (Throwable th) {
                            c4158xA.d(20005, th);
                            return Zz.b(6);
                        }
                }
            }
        };
        HD hd = HD.f25326n;
        final int i10 = 1;
        ZC u7 = C3686oN.u(C3686oN.u(A9, UnknownHostException.class, xa, hd), SocketException.class, new XA(this) { // from class: com.google.android.gms.internal.ads.Yz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Zz f28933b;

            {
                this.f28933b = this;
            }

            @Override // com.google.android.gms.internal.ads.XA
            public final Object apply(Object obj) {
                Jy b10;
                switch (i10) {
                    case 0:
                        this.f28933b.f29135f.b(20007);
                        return Zz.b(13);
                    case 1:
                        this.f28933b.f29135f.b(20008);
                        return Zz.b(13);
                    default:
                        C3822qy c3822qy = (C3822qy) obj;
                        Zz zz = this.f28933b;
                        zz.getClass();
                        int i92 = c3822qy.f33913a;
                        C4158xA c4158xA = zz.f29135f;
                        if (i92 != 200) {
                            c4158xA.c(20003, new String(AbstractC3194fG.k(), StandardCharsets.UTF_8));
                            return Zz.b(7);
                        }
                        try {
                            String str2 = new String(c3822qy.f33914b);
                            if (TextUtils.isEmpty(str2)) {
                                c4158xA.b(20004);
                                b10 = Zz.b(8);
                            } else {
                                S7 C7 = S7.C(PA.x(str2, true), YK.a());
                                if (C7.A().C() && C7.A().A()) {
                                    if (zz.f29136g.a(C7)) {
                                        Iy D8 = Jy.D();
                                        Ly F8 = My.F();
                                        C2968b8 B8 = C7.A().B();
                                        F8.h();
                                        ((My) F8.f30000u).I(B8);
                                        List B9 = C7.B();
                                        F8.h();
                                        ((My) F8.f30000u).K((InterfaceC3414jL) B9);
                                        My my = (My) F8.j();
                                        D8.h();
                                        ((Jy) D8.f30000u).E(my);
                                        SK D9 = C7.A().D();
                                        D8.h();
                                        ((Jy) D8.f30000u).F(D9);
                                        D8.h();
                                        ((Jy) D8.f30000u).I(2);
                                        b10 = (Jy) D8.j();
                                    } else {
                                        c4158xA.b(20006);
                                        b10 = Zz.b(12);
                                    }
                                }
                                c4158xA.b(20004);
                                b10 = Zz.b(8);
                            }
                            return b10;
                        } catch (Throwable th) {
                            c4158xA.d(20005, th);
                            return Zz.b(6);
                        }
                }
            }
        }, hd);
        this.f29135f.e(20002, u7);
        return u7;
    }
}
