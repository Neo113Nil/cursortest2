package w;

import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: g, reason: collision with root package name */
    public static final O f11047g = new O();

    /* renamed from: a, reason: collision with root package name */
    public final int f11048a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f11049b = null;

    /* renamed from: c, reason: collision with root package name */
    public final int f11050c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f11051d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f11052e = null;

    /* renamed from: f, reason: collision with root package name */
    public final H0.b f11053f = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o4 = (O) obj;
        return G0.n.a(this.f11048a, o4.f11048a) && Intrinsics.a(this.f11049b, o4.f11049b) && G0.o.a(this.f11050c, o4.f11050c) && G0.l.a(this.f11051d, o4.f11051d) && Intrinsics.a(null, null) && Intrinsics.a(this.f11052e, o4.f11052e) && Intrinsics.a(this.f11053f, o4.f11053f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f11048a) * 31;
        Boolean bool = this.f11049b;
        int c4 = AbstractC0784j.c(this.f11051d, AbstractC0784j.c(this.f11050c, (hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.f11052e;
        int hashCode2 = (c4 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        H0.b bVar = this.f11053f;
        return hashCode2 + (bVar != null ? bVar.f3226d.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) G0.n.b(this.f11048a)) + ", autoCorrectEnabled=" + this.f11049b + ", keyboardType=" + ((Object) G0.o.b(this.f11050c)) + ", imeAction=" + ((Object) G0.l.b(this.f11051d)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.f11052e + ", hintLocales=" + this.f11053f + ')';
    }
}
