package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zz {
    public static final zz a;
    public final zw b;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            a = zu.g;
        } else if (Build.VERSION.SDK_INT >= 30) {
            a = zs.f;
        } else {
            a = zw.h;
        }
    }

    private zz(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.b = new zv(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            this.b = new zu(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.b = new zt(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = new zs(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.b = new zr(this, windowInsets);
        } else {
            this.b = new zq(this, windowInsets);
        }
    }

    static vb j(vb vbVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, vbVar.b - i);
        int max2 = Math.max(0, vbVar.c - i2);
        int max3 = Math.max(0, vbVar.d - i3);
        int max4 = Math.max(0, vbVar.e - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? vbVar : vb.d(max, max2, max3, max4);
    }

    public static zz q(WindowInsets windowInsets, View view) {
        tw.F(windowInsets);
        zz zzVar = new zz(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = yq.a;
            zzVar.t(yj.a(view));
            zzVar.r(view.getRootView());
            zzVar.b.o(view.getWindowSystemUiVisibility());
        }
        return zzVar;
    }

    @Deprecated
    public final int a() {
        return this.b.d().e;
    }

    @Deprecated
    public final int b() {
        return this.b.d().b;
    }

    @Deprecated
    public final int c() {
        return this.b.d().d;
    }

    @Deprecated
    public final int d() {
        return this.b.d().c;
    }

    public final WindowInsets e() {
        zw zwVar = this.b;
        if (zwVar instanceof zo) {
            return ((zo) zwVar).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zz) {
            return Objects.equals(this.b, ((zz) obj).b);
        }
        return false;
    }

    public final vb f(int i) {
        return this.b.a(i);
    }

    public final vb g(int i) {
        return this.b.c(i);
    }

    @Deprecated
    public final vb h() {
        return this.b.t();
    }

    public final int hashCode() {
        zw zwVar = this.b;
        if (zwVar == null) {
            return 0;
        }
        return zwVar.hashCode();
    }

    @Deprecated
    public final vb i() {
        return this.b.d();
    }

    public final xf k() {
        return this.b.y();
    }

    @Deprecated
    public final zz l() {
        return this.b.z();
    }

    @Deprecated
    public final zz m() {
        return this.b.u();
    }

    @Deprecated
    public final zz n() {
        return this.b.v();
    }

    public final zz o(int i, int i2, int i3, int i4) {
        return this.b.e(i, i2, i3, i4);
    }

    @Deprecated
    public final zz p(int i, int i2, int i3, int i4) {
        zn zmVar = Build.VERSION.SDK_INT >= 36 ? new zm(this) : Build.VERSION.SDK_INT >= 35 ? new zl(this) : Build.VERSION.SDK_INT >= 34 ? new zk(this) : Build.VERSION.SDK_INT >= 31 ? new zj(this) : Build.VERSION.SDK_INT >= 30 ? new zi(this) : Build.VERSION.SDK_INT >= 29 ? new zh(this) : new zg(this);
        zmVar.c(vb.d(i, i2, i3, i4));
        return zmVar.a();
    }

    final void r(View view) {
        zw zwVar = this.b;
        zwVar.h(view);
        zwVar.i(view);
        zwVar.j();
    }

    final void s(vb[] vbVarArr) {
        this.b.l(vbVarArr);
    }

    final void t(zz zzVar) {
        this.b.n(zzVar);
    }

    final void u(Rect[][] rectArr) {
        this.b.p(rectArr);
    }

    final void v(Rect[][] rectArr) {
        this.b.q(rectArr);
    }

    public final boolean w() {
        return this.b.x();
    }

    final void x() {
        this.b.k(null);
    }

    public zz() {
        this.b = new zw(this);
    }
}
