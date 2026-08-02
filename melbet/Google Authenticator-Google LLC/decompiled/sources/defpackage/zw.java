package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zw {
    static final zz h;
    final zz i;

    static {
        h = (Build.VERSION.SDK_INT >= 36 ? new zm() : Build.VERSION.SDK_INT >= 35 ? new zl() : Build.VERSION.SDK_INT >= 34 ? new zk() : Build.VERSION.SDK_INT >= 31 ? new zj() : Build.VERSION.SDK_INT >= 30 ? new zi() : Build.VERSION.SDK_INT >= 29 ? new zh() : new zg()).a().l().m().n();
    }

    public zw(zz zzVar) {
        this.i = zzVar;
    }

    public vb A() {
        return d();
    }

    public vb B() {
        return d();
    }

    public vb C() {
        return d();
    }

    public vb a(int i) {
        return vb.a;
    }

    public vb c(int i) {
        if ((i & 8) == 0) {
            return vb.a;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public vb d() {
        return vb.a;
    }

    public zz e(int i, int i2, int i3, int i4) {
        return h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw)) {
            return false;
        }
        zw zwVar = (zw) obj;
        return r() == zwVar.r() && x() == zwVar.x() && Objects.equals(d(), zwVar.d()) && Objects.equals(t(), zwVar.t()) && Objects.equals(y(), zwVar.y());
    }

    public List f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List g(int i) {
        return Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(r()), Boolean.valueOf(x()), d(), t(), y());
    }

    public boolean r() {
        return false;
    }

    public vb t() {
        return vb.a;
    }

    public zz u() {
        return this.i;
    }

    public zz v() {
        return this.i;
    }

    public boolean x() {
        return false;
    }

    public xf y() {
        return null;
    }

    public zz z() {
        return this.i;
    }

    public void j() {
    }

    public void h(View view) {
    }

    public void i(View view) {
    }

    public void k(xh xhVar) {
    }

    public void l(vb[] vbVarArr) {
    }

    public void n(zz zzVar) {
    }

    public void o(int i) {
    }

    public void p(Rect[][] rectArr) {
    }

    public void q(Rect[][] rectArr) {
    }

    public void w(vb vbVar) {
    }
}
