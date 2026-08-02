package defpackage;

import android.content.Intent;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fsl extends frz implements aec, fte {
    private static final fss l;
    public final jpu b;
    public final fsj c;
    public final gzp d;
    public final ftr e;
    public final fuc f;
    public final boolean g;
    public ftt h;
    public fsi i;
    public final kee k;
    private final fso m;
    private final gbi n;
    private final fto o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final fsk t;
    private hvi u;
    private boolean v;
    private final ftf w;
    private final iyi x;
    public static final hoq j = new hoq();
    public static final hkh a = hkh.l("AccountControllerImpl");

    static {
        jkj k = fss.a.k();
        if (!k.b.M()) {
            k.t();
        }
        fss fssVar = (fss) k.b;
        fssVar.b |= 1;
        fssVar.c = -1;
        jkp q = k.q();
        q.getClass();
        l = (fss) q;
    }

    public fsl(jpu jpuVar, fso fsoVar, fsj fsjVar, gzp gzpVar, ftr ftrVar, gbi gbiVar, iyi iyiVar, fuc fucVar, fto ftoVar, ftf ftfVar, gzp gzpVar2, gzp gzpVar3, gzp gzpVar4, gzp gzpVar5, gzp gzpVar6) {
        jpuVar.getClass();
        fsoVar.getClass();
        ftrVar.getClass();
        iyiVar.getClass();
        fucVar.getClass();
        ftoVar.getClass();
        ftfVar.getClass();
        gzpVar2.getClass();
        gzpVar4.getClass();
        gzpVar5.getClass();
        gzpVar6.getClass();
        this.b = jpuVar;
        this.m = fsoVar;
        this.c = fsjVar;
        this.d = gzpVar;
        this.e = ftrVar;
        this.n = gbiVar;
        this.x = iyiVar;
        this.f = fucVar;
        this.o = ftoVar;
        this.w = ftfVar;
        this.k = new kee(this);
        this.t = new fsk(this);
        this.p = ((Boolean) gzpVar2.d(false)).booleanValue();
        this.q = ((Boolean) gzpVar3.d(false)).booleanValue();
        this.g = !((Boolean) gzpVar4.d(false)).booleanValue();
        this.r = !((Boolean) gzpVar5.d(false)).booleanValue();
        this.s = ((Boolean) gzpVar6.d(false)).booleanValue();
        Object obj = ftrVar.b;
        if (obj != null && !ksp.b(obj, this)) {
            throw new IllegalStateException("Check failed.");
        }
        ftrVar.b = this;
        jpuVar.L().a(new gwn(this));
        fsjVar.d(new fsa(this, 0), new fsa(this, 2));
    }

    public static final void v(fss fssVar) {
        if ((fssVar.b & 32) == 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (fssVar.h <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        int H = a.H(fssVar.e);
        if (H == 0) {
            H = 1;
        }
        int i = H - 1;
        if (i == 1 || i == 2) {
            if ((fssVar.b & 2) != 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (fssVar.f.size() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            int i2 = fssVar.b;
            if ((i2 & 8) != 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (fssVar.i) {
                throw new IllegalStateException("Check failed.");
            }
            if ((i2 & 64) != 0) {
                throw new IllegalStateException("Check failed.");
            }
            return;
        }
        if (i == 3) {
            if ((fssVar.b & 2) == 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (fssVar.f.size() != 0) {
                throw new IllegalStateException("Check failed.");
            }
            int i3 = fssVar.b;
            if ((i3 & 8) == 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (fssVar.i) {
                throw new IllegalStateException("Check failed.");
            }
            if ((i3 & 64) != 0) {
                throw new IllegalStateException("Check failed.");
            }
            return;
        }
        if (i == 4) {
            if ((fssVar.b & 2) == 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (fssVar.f.size() != 0) {
                throw new IllegalStateException("Check failed.");
            }
            int i4 = fssVar.b;
            if ((i4 & 8) != 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (fssVar.i) {
                throw new IllegalStateException("Check failed.");
            }
            if ((i4 & 64) != 0) {
                throw new IllegalStateException("Check failed.");
            }
            return;
        }
        if (i != 5) {
            throw new IllegalArgumentException("AccountControllerOperation.type is of value UNKNOWN - the proto might be skewed during the parcel/unparcel process.");
        }
        if ((fssVar.b & 2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (fssVar.f.size() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        int i5 = fssVar.b;
        if ((i5 & 8) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (!fssVar.i) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i5 & 64) == 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public static final fsv w(Intent intent) {
        return (fsv) oy.m(intent, "account_error", fsv.class);
    }

    private final void z(hel helVar, hvi hviVar, int i) {
        p();
        boolean isDone = hviVar.isDone();
        ftr ftrVar = this.e;
        if (!isDone) {
            ftrVar.l();
            gzp h = gzp.h(helVar);
            gyf gyfVar = gyf.a;
            y(2, null, h, gyfVar, false, gyfVar, hviVar, i);
            return;
        }
        ftrVar.i();
        gzp g = gzp.g(helVar);
        gyf gyfVar2 = gyf.a;
        fss x = x(2, null, g, gyfVar2, false, gyfVar2, i);
        try {
            kee keeVar = this.k;
            ProtoParsers$InternalDontUse protoParsers$InternalDontUse = new ProtoParsers$InternalDontUse(null, x);
            Object aR = hnu.aR(hviVar);
            aR.getClass();
            keeVar.f(protoParsers$InternalDontUse, (fry) aR);
        } catch (ExecutionException e) {
            e = e;
            kee keeVar2 = this.k;
            ProtoParsers$InternalDontUse protoParsers$InternalDontUse2 = new ProtoParsers$InternalDontUse(null, x);
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            keeVar2.e(protoParsers$InternalDontUse2, e);
        }
    }

    @Override // defpackage.aec
    public final void a(aer aerVar) {
        String concat;
        jpu jpuVar = this.b;
        fso fsoVar = this.m;
        int d = jpuVar.d();
        int i = fsoVar.a;
        if (i == 0) {
            fsoVar.a = d;
        } else if (d != i) {
            StringBuilder sb = new StringBuilder("Failed to use AccountController in ");
            sb.append(jpuVar);
            sb.append(". AccountController cannot be injected into both an Activity and a screen Fragment in the same hierarchy. Previously injected in ");
            sb.append((Object) (i != 1 ? i != 2 ? "FRAGMENT" : "FRAGMENT_HOST" : "ACTIVITY"));
            throw new IllegalStateException(sb.toString());
        }
        fsi fsiVar = (fsi) new agj(jpuVar).a(fsi.class);
        this.i = fsiVar;
        if (fsiVar == null) {
            ksp.a("viewModel");
            fsiVar = null;
        }
        fsiVar.d.c = this.p;
        if (this.h == null) {
            this.h = ftt.a().e();
        }
        if (this.c.a().hasExtra("$tiktok$for_requirement_activity")) {
            if (this.h == null) {
                ksp.a("config");
            }
            fto ftoVar = this.o;
            if (this.h == null) {
                ksp.a("config");
            }
            hel b = ftoVar.b();
            if (b.isEmpty()) {
                concat = "";
            } else {
                Objects.toString(b);
                concat = " Requirements: ".concat(String.valueOf(b));
            }
            IllegalStateException illegalStateException = new IllegalStateException("Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?".concat(concat));
            if (!this.q) {
                throw illegalStateException;
            }
            ((hkf) ((hkf) a.f()).h(illegalStateException).i("com/google/apps/tiktok/account/api/controller/AccountControllerImpl", "onCreate", 211, "AccountControllerImpl.kt")).s("The requirement activity bit is set while the requirements are not overridden with an empty list. If the activity is not a requirement Activity, then it's likely the app is started by another malicious app which sets the requirement activity bit in the Intent");
        }
        fsi fsiVar2 = this.i;
        if (fsiVar2 == null) {
            ksp.a("viewModel");
            fsiVar2 = null;
        }
        if (fsiVar2.d.a()) {
            fsi fsiVar3 = this.i;
            if (fsiVar3 == null) {
                ksp.a("viewModel");
                fsiVar3 = null;
            }
            fsiVar3.b(l);
            gty aC = hoq.aC(76, "AccountController getInitialAccount");
            try {
                frx frxVar = new frx();
                if (this.h == null) {
                    ksp.a("config");
                }
                ftt fttVar = this.h;
                if (fttVar == null) {
                    ksp.a("config");
                    fttVar = null;
                }
                hel helVar = fttVar.c;
                helVar.getClass();
                hvi k = k(helVar, frxVar, false);
                aC.b(k);
                ixf.j(aC, null);
                this.u = k;
            } finally {
            }
        }
        this.n.h(this.t);
        ftf ftfVar = this.w;
        fao.c();
        List list = ftfVar.d;
        synchronized (list) {
            list.add(this);
        }
    }

    @Override // defpackage.aec
    public final void b(aer aerVar) {
        fao.c();
        List list = this.w.d;
        synchronized (list) {
            list.remove(this);
        }
        fsi fsiVar = this.i;
        if (fsiVar == null) {
            ksp.a("viewModel");
            fsiVar = null;
        }
        fsh fshVar = fsiVar.d;
        fshVar.b = gzp.g(Boolean.valueOf(fshVar.c));
        fshVar.a = null;
        fshVar.d = 3;
    }

    @Override // defpackage.aec
    public final void d(aer aerVar) {
        r();
    }

    @Override // defpackage.aec
    public final void e(aer aerVar) {
        if (this.v) {
            r();
            return;
        }
        this.v = true;
        fsi fsiVar = this.i;
        fsi fsiVar2 = null;
        if (fsiVar == null) {
            ksp.a("viewModel");
            fsiVar = null;
        }
        boolean a2 = fsiVar.d.a();
        ftr ftrVar = this.e;
        if (!a2) {
            ftrVar.j();
            fty ftyVar = ftrVar.h().a;
            if (ftyVar instanceof ftw) {
                iyi iyiVar = ftrVar.d;
                ftw ftwVar = (ftw) ftyVar;
                frv.a(ftwVar.a);
                iyiVar.l(ftwVar.b);
            }
            r();
        } else {
            if (ftrVar.m()) {
                throw new IllegalArgumentException("Should not have account before initial start.");
            }
            if (this.u == null) {
                throw new IllegalStateException("Should have had initial account fetch.");
            }
            fsi fsiVar3 = this.i;
            if (fsiVar3 == null) {
                ksp.a("viewModel");
                fsiVar3 = null;
            }
            if (fsiVar3.a() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            fsi fsiVar4 = this.i;
            if (fsiVar4 == null) {
                ksp.a("viewModel");
                fsiVar4 = null;
            }
            if (ksp.b(fsiVar4.a(), l)) {
                ftt fttVar = this.h;
                if (fttVar == null) {
                    ksp.a("config");
                    fttVar = null;
                }
                hel helVar = fttVar.c;
                helVar.getClass();
                hvi hviVar = this.u;
                hviVar.getClass();
                z(helVar, hviVar, 0);
            }
            this.u = null;
        }
        fsi fsiVar5 = this.i;
        if (fsiVar5 == null) {
            ksp.a("viewModel");
            fsiVar5 = null;
        }
        if (fsiVar5.d.b.f()) {
            fsi fsiVar6 = this.i;
            if (fsiVar6 == null) {
                ksp.a("viewModel");
            } else {
                fsiVar2 = fsiVar6;
            }
            if (((Boolean) fsiVar2.d.b.b()).booleanValue() || !this.p) {
                return;
            }
            this.e.i();
        }
    }

    @Override // defpackage.frz
    public final frz g(ftt fttVar) {
        o();
        if (this.h != null) {
            throw new IllegalStateException("Config can be set once, in the constructor only.");
        }
        this.h = fttVar;
        return this;
    }

    @Override // defpackage.frz
    public final void h(frv frvVar) {
        frvVar.getClass();
        o();
        n();
        t(frvVar, true, 0);
    }

    @Override // defpackage.frz
    public final void i(hel helVar) {
        helVar.getClass();
        u(helVar, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.frz
    public final void j(ftm ftmVar) {
        o();
        iyi iyiVar = this.x;
        ?? r0 = iyiVar.a;
        ((ArrayList) r0).add(ftmVar);
        Collections.shuffle(r0, (Random) iyiVar.b);
    }

    public final hvi k(hel helVar, frx frxVar, boolean z) {
        fsj fsjVar = this.c;
        ftk ftkVar = new ftk(fsjVar.a());
        if (!z) {
            fsi fsiVar = this.i;
            if (fsiVar == null) {
                ksp.a("viewModel");
                fsiVar = null;
            }
            fsiVar.c = false;
        }
        fto ftoVar = this.o;
        hvi a2 = ftoVar.a(ftkVar, helVar, frxVar);
        if (this.h == null) {
            ksp.a("config");
        }
        return hti.g(a2, gvx.c(new bpp(ftoVar, fsjVar.a(), a2, 9, null)), huf.a);
    }

    @Override // defpackage.fte
    public final hvi l() {
        fsi fsiVar = this.i;
        if (fsiVar == null) {
            ksp.a("viewModel");
            fsiVar = null;
        }
        fsiVar.c = true;
        fsi fsiVar2 = this.i;
        if (fsiVar2 == null) {
            ksp.a("viewModel");
            fsiVar2 = null;
        }
        if (!fsiVar2.b) {
            fsj fsjVar = this.c;
            if (!fsjVar.g() && !fsjVar.f()) {
                return m(0);
            }
        }
        return hnu.aJ(null);
    }

    public final hvi m(int i) {
        hvi hviVar;
        fsi fsiVar = this.i;
        if (fsiVar == null) {
            ksp.a("viewModel");
            fsiVar = null;
        }
        if (!fsiVar.c) {
            return hnu.aJ(null);
        }
        fsi fsiVar2 = this.i;
        if (fsiVar2 == null) {
            ksp.a("viewModel");
            fsiVar2 = null;
        }
        fsiVar2.c = false;
        gty aC = hoq.aC(77, "Revalidate Account");
        try {
            int g = this.e.g();
            if (g == -1) {
                hviVar = hnu.aJ(null);
            } else {
                frv a2 = frv.a(g);
                fto ftoVar = this.o;
                if (this.h == null) {
                    ksp.a("config");
                }
                hvi c = ftoVar.c(a2, this.c.a(), new frx());
                gyf gyfVar = gyf.a;
                aC.b(c);
                y(5, a2, gyfVar, gyfVar, false, gyfVar, c, i);
                hviVar = c;
            }
            ixf.j(aC, null);
            return hviVar;
        } finally {
        }
    }

    public final void n() {
        ftt fttVar = this.h;
        if (fttVar == null) {
            ksp.a("config");
            fttVar = null;
        }
        if (!fttVar.b) {
            throw new IllegalStateException("Activity not configured for account selection.");
        }
    }

    public final void o() {
        if (this.p) {
            throw new IllegalStateException("Attempted to use the account controller when accounts are disabled");
        }
    }

    public final void p() {
        if (this.s) {
            fao.g();
            if (fao.g()) {
                hoq.H(gax.a >= 0);
                if (gax.a > 0) {
                    throw new IllegalStateException("AccountController methods cannot be called from the lifecycle-invocable callbacks, see b/216297191 for more details");
                }
            }
        }
    }

    public final void q() {
        fsi fsiVar = this.i;
        fsi fsiVar2 = null;
        if (fsiVar == null) {
            ksp.a("viewModel");
            fsiVar = null;
        }
        fsiVar.b = false;
        if (this.e.m()) {
            return;
        }
        fsi fsiVar3 = this.i;
        if (fsiVar3 == null) {
            ksp.a("viewModel");
        } else {
            fsiVar2 = fsiVar3;
        }
        fsiVar2.c = false;
    }

    public final void r() {
        fsi fsiVar = this.i;
        if (fsiVar == null) {
            ksp.a("viewModel");
            fsiVar = null;
        }
        if (fsiVar.b) {
            return;
        }
        this.f.g();
        m(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(hel helVar, int i) {
        if (helVar.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        hjs listIterator = helVar.listIterator(0);
        listIterator.getClass();
        while (listIterator.hasNext()) {
            E next = listIterator.next();
            next.getClass();
            Class cls = (Class) next;
            if (!ftj.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(a.ab(cls, "selector ", " is not an interactive selector"));
            }
        }
        hvi a2 = this.o.a(new ftk(this.c.a()), helVar, new frx());
        gzp g = gzp.g(helVar);
        gyf gyfVar = gyf.a;
        y(3, null, g, gyfVar, false, gyfVar, a2, i);
    }

    public final void t(frv frvVar, boolean z, int i) {
        hvi c;
        p();
        gty aC = hoq.aC(79, "Switch Account");
        try {
            fsi fsiVar = this.i;
            if (fsiVar == null) {
                ksp.a("viewModel");
                fsiVar = null;
            }
            fsiVar.c = false;
            fto ftoVar = this.o;
            if (z) {
                if (this.h == null) {
                    ksp.a("config");
                }
                c = hti.g(ftoVar.b.e(frvVar), gvx.c(new evv(ftoVar, frvVar, this.c.a(), new frx(), 3)), huf.a);
            } else {
                if (this.h == null) {
                    ksp.a("config");
                }
                c = ftoVar.c(frvVar, this.c.a(), new frx());
            }
            hvi hviVar = c;
            if (!hviVar.isDone()) {
                int i2 = frvVar.a;
                ftr ftrVar = this.e;
                if (i2 != ftrVar.g()) {
                    ftrVar.l();
                }
            }
            gyf gyfVar = gyf.a;
            gzp g = gzp.g(Boolean.valueOf(z));
            aC.b(hviVar);
            y(4, frvVar, gyfVar, g, false, gyfVar, hviVar, i);
            ixf.j(aC, null);
        } finally {
        }
    }

    public final void u(hel helVar, int i) {
        if (helVar.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        gty aC = hoq.aC(80, "Switch Account With Custom Selectors");
        try {
            z(helVar, k(helVar, new frx(), false), i);
            ixf.j(aC, null);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fss x(int i, frv frvVar, gzp gzpVar, gzp gzpVar2, boolean z, gzp gzpVar3, int i2) {
        int i3;
        if (this.r) {
            fao.c();
        }
        fsi fsiVar = this.i;
        fsi fsiVar2 = null;
        if (fsiVar == null) {
            ksp.a("viewModel");
            fsiVar = null;
        }
        if (fsiVar.a().c == Integer.MAX_VALUE) {
            i3 = 0;
        } else {
            fsi fsiVar3 = this.i;
            if (fsiVar3 == null) {
                ksp.a("viewModel");
                fsiVar3 = null;
            }
            i3 = fsiVar3.a().c + 1;
        }
        jkj k = fss.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        fss fssVar = (fss) jkpVar;
        fssVar.b |= 1;
        fssVar.c = i3;
        if (frvVar != null) {
            if (!jkpVar.M()) {
                k.t();
            }
            fss fssVar2 = (fss) k.b;
            fssVar2.b |= 2;
            fssVar2.d = frvVar.a;
        }
        if (!k.b.M()) {
            k.t();
        }
        fss fssVar3 = (fss) k.b;
        fssVar3.e = i - 1;
        fssVar3.b |= 4;
        if (gzpVar.f()) {
            hel helVar = (hel) gzpVar.b();
            if (helVar.isEmpty()) {
                throw new IllegalStateException("Check failed.");
            }
            ArrayList arrayList = new ArrayList(helVar.size());
            hjs listIterator = helVar.listIterator(0);
            listIterator.getClass();
            while (listIterator.hasNext()) {
                E next = listIterator.next();
                next.getClass();
                String name = ((Class) next).getName();
                name.getClass();
                arrayList.add(name);
            }
            if (!k.b.M()) {
                k.t();
            }
            fss fssVar4 = (fss) k.b;
            jkx jkxVar = fssVar4.f;
            if (!jkxVar.c()) {
                fssVar4.f = jkp.A(jkxVar);
            }
            jiz.f(arrayList, fssVar4.f);
        }
        if (gzpVar2.f()) {
            boolean booleanValue = ((Boolean) gzpVar2.b()).booleanValue();
            if (!k.b.M()) {
                k.t();
            }
            fss fssVar5 = (fss) k.b;
            fssVar5.b |= 8;
            fssVar5.g = booleanValue;
        }
        if (!k.b.M()) {
            k.t();
        }
        fss fssVar6 = (fss) k.b;
        fssVar6.b |= 32;
        fssVar6.i = z;
        if (gzpVar3.f()) {
            int a2 = this.f.a.a((fub) gzpVar3.b());
            if (!k.b.M()) {
                k.t();
            }
            fss fssVar7 = (fss) k.b;
            fssVar7.b |= 64;
            fssVar7.j = a2;
        }
        int i4 = i2 + 1;
        if (!k.b.M()) {
            k.t();
        }
        fss fssVar8 = (fss) k.b;
        fssVar8.b |= 16;
        fssVar8.h = i4;
        fsi fsiVar4 = this.i;
        if (fsiVar4 == null) {
            ksp.a("viewModel");
            fsiVar4 = null;
        }
        jkp q = k.q();
        q.getClass();
        fsiVar4.b((fss) q);
        fsi fsiVar5 = this.i;
        if (fsiVar5 == null) {
            ksp.a("viewModel");
            fsiVar5 = null;
        }
        v(fsiVar5.a());
        fsi fsiVar6 = this.i;
        if (fsiVar6 == null) {
            ksp.a("viewModel");
        } else {
            fsiVar2 = fsiVar6;
        }
        return fsiVar2.a();
    }

    public final void y(int i, frv frvVar, gzp gzpVar, gzp gzpVar2, boolean z, gzp gzpVar3, hvi hviVar, int i2) {
        fss x = x(i, frvVar, gzpVar, gzpVar2, z, gzpVar3, i2);
        fsi fsiVar = this.i;
        if (fsiVar == null) {
            ksp.a("viewModel");
            fsiVar = null;
        }
        fsiVar.b = true;
        try {
            this.n.k(new cbp(hviVar), new cbp(new ProtoParsers$InternalDontUse(null, x)), this.t);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Cannot switch account before Activity resumes.", e);
        }
    }

    @Override // defpackage.aec
    public final /* synthetic */ void bJ(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void f(aer aerVar) {
    }
}
