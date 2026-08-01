package l;

import android.os.Build;
import android.view.View;
import h.C0037a;
import java.util.Objects;

/* loaded from: classes.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f975b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final q f976a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 30 ? new g() : i2 >= 29 ? new f() : new e()).b().f977a.a().f977a.b().f977a.c();
    }

    public o(q qVar) {
        this.f976a = qVar;
    }

    public q a() {
        return this.f976a;
    }

    public q b() {
        return this.f976a;
    }

    public q c() {
        return this.f976a;
    }

    public b e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l() == oVar.l() && k() == oVar.k() && Objects.equals(i(), oVar.i()) && Objects.equals(g(), oVar.g()) && Objects.equals(e(), oVar.e());
    }

    public C0037a f() {
        return i();
    }

    public C0037a g() {
        return C0037a.f585e;
    }

    public C0037a h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), g(), e());
    }

    public C0037a i() {
        return C0037a.f585e;
    }

    public C0037a j() {
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

    public void n(C0037a[] c0037aArr) {
    }

    public void o(q qVar) {
    }

    public void p(C0037a c0037a) {
    }
}
