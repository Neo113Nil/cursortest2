package u;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final i0 f9518b = new i0(new m0((j0) null, (r) null, (LinkedHashMap) null, 127));

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f9519c = new i0(new m0((j0) null, (r) null, (LinkedHashMap) null, 95));

    /* renamed from: a, reason: collision with root package name */
    public final m0 f9520a;

    public i0(m0 m0Var) {
        this.f9520a = m0Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i0) && ((i0) obj).f9520a.equals(this.f9520a);
    }

    public final int hashCode() {
        return this.f9520a.hashCode();
    }

    public final String toString() {
        if (equals(f9518b)) {
            return "ExitTransition.None";
        }
        if (equals(f9519c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        m0 m0Var = this.f9520a;
        j0 j0Var = m0Var.f9533a;
        sb2.append(j0Var != null ? j0Var.toString() : null);
        sb2.append(",\nSlide - null,\nShrink - null,\nScale - ");
        sb2.append((String) null);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(m0Var.f9534b);
        return sb2.toString();
    }
}
