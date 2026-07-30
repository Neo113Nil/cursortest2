package a8;

import com.google.android.gms.internal.ads.CL;
import java.util.List;
import r7.C4985p;

/* loaded from: classes2.dex */
public abstract class C implements Y7.e {

    /* renamed from: a, reason: collision with root package name */
    public final Y7.e f4428a;

    public C(Y7.e eVar) {
        this.f4428a = eVar;
    }

    @Override // Y7.e
    public final int c(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        Integer J = M7.q.J(name);
        if (J != null) {
            return J.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // Y7.e
    public final com.bumptech.glide.e d() {
        return Y7.i.f4057h;
    }

    @Override // Y7.e
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c4 = (C) obj;
        return kotlin.jvm.internal.h.a(this.f4428a, c4.f4428a) && kotlin.jvm.internal.h.a(a(), c4.a());
    }

    @Override // Y7.e
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // Y7.e
    public final boolean g() {
        return false;
    }

    @Override // Y7.e
    public final List getAnnotations() {
        return C4985p.f40358n;
    }

    @Override // Y7.e
    public final List h(int i) {
        if (i >= 0) {
            return C4985p.f40358n;
        }
        StringBuilder l9 = CL.l(i, "Illegal index ", ", ");
        l9.append(a());
        l9.append(" expects only non-negative indices");
        throw new IllegalArgumentException(l9.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f4428a.hashCode() * 31);
    }

    @Override // Y7.e
    public final Y7.e i(int i) {
        if (i >= 0) {
            return this.f4428a;
        }
        StringBuilder l9 = CL.l(i, "Illegal index ", ", ");
        l9.append(a());
        l9.append(" expects only non-negative indices");
        throw new IllegalArgumentException(l9.toString().toString());
    }

    @Override // Y7.e
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder l9 = CL.l(i, "Illegal index ", ", ");
        l9.append(a());
        l9.append(" expects only non-negative indices");
        throw new IllegalArgumentException(l9.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.f4428a + ')';
    }

    @Override // Y7.e
    public final void b() {
    }
}
