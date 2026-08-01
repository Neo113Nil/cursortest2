package u;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f9516b = new h0(new m0((j0) null, (r) null, (LinkedHashMap) null, 127));

    /* renamed from: a, reason: collision with root package name */
    public final m0 f9517a;

    public h0(m0 m0Var) {
        this.f9517a = m0Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h0) && ((h0) obj).f9517a.equals(this.f9517a);
    }

    public final int hashCode() {
        return this.f9517a.hashCode();
    }

    public final String toString() {
        if (equals(f9516b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        j0 j0Var = this.f9517a.f9533a;
        sb2.append(j0Var != null ? j0Var.toString() : null);
        sb2.append(",\nSlide - null,\nShrink - null,\nScale - ");
        sb2.append((String) null);
        return sb2.toString();
    }
}
