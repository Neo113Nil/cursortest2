package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxo extends bxt implements gjg, gxy {
    private final brn aj = new brn((byte[]) null, (short[]) null);
    private bxq d;
    private Context e;
    private boolean f;

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.i();
        try {
            aQ(layoutInflater, viewGroup, bundle);
            z();
            View inflate = layoutInflater.inflate(R.layout.migration_navigation_fragment, viewGroup, false);
            if (inflate == null) {
                e.j(this, z());
            }
            gta.o();
            return inflate;
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bxt, defpackage.faa, defpackage.bd
    public final void X(Activity activity) {
        this.b.i();
        try {
            super.X(activity);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gjg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bxq z() {
        bxq bxqVar = this.d;
        if (bxqVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.f) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return bxqVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void ad(View view, Bundle bundle) {
        this.b.i();
        try {
            hoq.ad(this);
            z();
            e.j(this, z());
            aP(view, bundle);
            bxq z = z();
            if (bundle != null) {
                ((hkf) ((hkf) bxq.a.e()).i("com/google/android/apps/authenticator2/migration/MigrationNavigationFragmentPeer", "onViewCreated", 120, "MigrationNavigationFragmentPeer.java")).s("Orientation change triggers fragment opening.");
                String string = bundle.getString("fragmentOpen");
                switch (string.hashCode()) {
                    case -944604910:
                        if (string.equals("ExportQrCodeFragment")) {
                            try {
                                z.a(byd.a(z.d, (bzk) jkp.v(bzk.a, bundle.getByteArray("otpsToExport"), jkd.a())), "ExportQrCodeFragment");
                                break;
                            } catch (jld e) {
                                ((hkf) ((hkf) ((hkf) bxq.a.g()).h(e)).i("com/google/android/apps/authenticator2/migration/MigrationNavigationFragmentPeer", "onViewCreated", (char) 136, "MigrationNavigationFragmentPeer.java")).s("Could not parse otps to export when opening ExportQrCodeFragment");
                                z.a(bxj.a(z.d), "MigrationFragment");
                                break;
                            }
                        }
                        z.a(bxj.a(z.d), "MigrationFragment");
                        break;
                    case 877146692:
                        if (string.equals("ExportFragment")) {
                            z.a(bxx.a(z.d), "ExportFragment");
                            break;
                        }
                        z.a(bxj.a(z.d), "MigrationFragment");
                        break;
                    case 1126934407:
                        if (string.equals("RemoveExportedFragment")) {
                            try {
                                z.a(byr.a(z.d, (bzk) jkp.v(bzk.a, bundle.getByteArray("otpsToExport"), jkd.a())), "RemoveExportedFragment");
                                break;
                            } catch (jld e2) {
                                ((hkf) ((hkf) ((hkf) bxq.a.g()).h(e2)).i("com/google/android/apps/authenticator2/migration/MigrationNavigationFragmentPeer", "onViewCreated", (char) 152, "MigrationNavigationFragmentPeer.java")).s("Could not parse otps to export when opening ExportQrCodeFragment");
                                z.a(bxj.a(z.d), "MigrationFragment");
                                break;
                            }
                        }
                        z.a(bxj.a(z.d), "MigrationFragment");
                        break;
                    case 2082345269:
                        if (string.equals("ImportFragment")) {
                            z.a(bza.a(z.d), "ImportFragment");
                            break;
                        }
                        z.a(bxj.a(z.d), "MigrationFragment");
                        break;
                    default:
                        z.a(bxj.a(z.d), "MigrationFragment");
                        break;
                }
            } else {
                z.a(bxj.a(z.d), "MigrationFragment");
            }
            gta.o();
        } finally {
        }
    }

    @Override // defpackage.bd
    public final void ah(Bundle bundle) {
        Bundle bundle2 = this.n;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        hoq.I(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.ah(bundle);
    }

    @Override // defpackage.bd
    public final LayoutInflater bv(Bundle bundle) {
        this.b.i();
        try {
            LayoutInflater at = at();
            LayoutInflater cloneInContext = at.cloneInContext(new gmq(at, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new glx(this, cloneInContext));
            gta.o();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bxt
    protected final /* bridge */ /* synthetic */ gmk d() {
        return new gma(this);
    }

    @Override // defpackage.bxt, defpackage.glo, defpackage.bd
    public final void e(Context context) {
        this.b.i();
        try {
            if (this.f) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.e(context);
            if (this.d == null) {
                bxr bxrVar = (bxr) hnu.bh(this, bxr.class);
                gty aA = hoq.aA(41, bxo.class, "CreatePeer");
                try {
                    this.d = bxrVar.i();
                    aA.close();
                } finally {
                }
            }
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void f(Bundle bundle) {
        this.b.i();
        try {
            aG(bundle);
            z();
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void g() {
        gut c = this.b.c();
        try {
            aL();
            if (this.R == null) {
                this.aj.q();
            }
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.faa, defpackage.bd
    public final void h() {
        gut b = this.b.b();
        try {
            aM();
            this.f = true;
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void i(Bundle bundle) {
        this.b.i();
        try {
            aO(bundle);
            bxq z = z();
            String str = ((bd) z.c.h().get(0)).I;
            bundle.putString("fragmentOpen", str);
            if (str.equals("ExportQrCodeFragment") || str.equals("RemoveExportedFragment")) {
                bundle.putByteArray("otpsToExport", z.e.f());
            }
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gxy
    public final gxv n(gxq gxqVar) {
        return this.aj.o(gxqVar);
    }

    @Override // defpackage.gxy
    public final void o(Class cls, gxu gxuVar) {
        this.aj.p(cls, gxuVar);
    }

    @Override // defpackage.bxt, defpackage.bd
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        if (this.e == null) {
            this.e = new glx(this, super.x());
        }
        return this.e;
    }
}
