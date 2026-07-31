package b;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p extends r2.o {

    /* renamed from: a, reason: collision with root package name */
    public final u f1013a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.u f1014b;

    public p(u uVar, androidx.lifecycle.u uVar2) {
        q6.i.e(uVar, "callback");
        this.f1013a = uVar;
        this.f1014b = uVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return q6.i.a(this.f1013a, pVar.f1013a) && q6.i.a(this.f1014b, pVar.f1014b);
    }

    public final int hashCode() {
        int hashCode = this.f1013a.hashCode() * 31;
        androidx.lifecycle.u uVar = this.f1014b;
        return hashCode + (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f1013a + ", owner=" + this.f1014b + ')';
    }
}
