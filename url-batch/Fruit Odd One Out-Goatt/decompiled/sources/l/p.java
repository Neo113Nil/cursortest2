package l;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f757b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final r f758a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 30 ? new h() : i2 >= 29 ? new g() : new f()).b().f759a.a().f759a.b().f759a.c();
    }

    public p(r rVar) {
        this.f758a = rVar;
    }

    public r a() {
        return this.f758a;
    }

    public r b() {
        return this.f758a;
    }

    public r c() {
        return this.f758a;
    }

    public b e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return l() == pVar.l() && k() == pVar.k() && Objects.equals(i(), pVar.i()) && Objects.equals(g(), pVar.g()) && Objects.equals(e(), pVar.e());
    }

    public h.a f() {
        return i();
    }

    public h.a g() {
        return h.a.f369e;
    }

    public h.a h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), g(), e());
    }

    public h.a i() {
        return h.a.f369e;
    }

    public h.a j() {
        return i();
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m(int i2) {
        return true;
    }

    public void d(View view) {
    }

    public void n(h.a[] aVarArr) {
    }

    public void o(r rVar) {
    }

    public void p(h.a aVar) {
    }
}
