package X0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final i f3631a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f3632b;

    public A(i iVar) {
        this.f3631a = iVar;
        this.f3632b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a9 = (A) obj;
        i iVar = this.f3631a;
        if (iVar != null && iVar.equals(a9.f3631a)) {
            return true;
        }
        Throwable th = this.f3632b;
        if (th == null || a9.f3632b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3631a, this.f3632b});
    }

    public A(Throwable th) {
        this.f3632b = th;
        this.f3631a = null;
    }
}
