package a0;

import java.util.Objects;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: b, reason: collision with root package name */
    public static final o0 f4225b;

    /* renamed from: a, reason: collision with root package name */
    public final v2.M f4226a;

    static {
        t1.h hVar = new t1.h(23, false);
        hVar.f15398b = v2.M.j(2, 1, 5);
        f4225b = new o0(hVar);
    }

    public o0(t1.h hVar) {
        this.f4226a = (v2.M) hVar.f15398b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o0) && this.f4226a.equals(((o0) obj).f4226a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f4226a, null, null, bool, bool, bool, bool, bool);
    }
}
