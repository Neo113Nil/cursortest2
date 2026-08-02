package T;

import E.AbstractC0005f;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: T.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107z {

    /* renamed from: a, reason: collision with root package name */
    public final String f2899a;

    /* renamed from: b, reason: collision with root package name */
    public final C0104w f2900b;

    /* renamed from: c, reason: collision with root package name */
    public final C0103v f2901c;

    /* renamed from: d, reason: collision with root package name */
    public final C f2902d;

    /* renamed from: e, reason: collision with root package name */
    public final C0101t f2903e;

    /* renamed from: f, reason: collision with root package name */
    public final C0105x f2904f;

    static {
        r rVar = new r();
        v2.G g4 = v2.I.f15571b;
        v2.a0 a0Var = v2.a0.f15605e;
        List list = Collections.EMPTY_LIST;
        v2.a0 a0Var2 = v2.a0.f15605e;
        C0102u c0102u = new C0102u();
        C0105x c0105x = C0105x.f2898a;
        rVar.a();
        c0102u.a();
        C c4 = C.f2631B;
        AbstractC0005f.s(0, 1, 2, 3, 4);
        W.J.G(5);
    }

    public C0107z(String str, C0101t c0101t, C0104w c0104w, C0103v c0103v, C c4, C0105x c0105x) {
        this.f2899a = str;
        this.f2900b = c0104w;
        this.f2901c = c0103v;
        this.f2902d = c4;
        this.f2903e = c0101t;
        this.f2904f = c0105x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0107z)) {
            return false;
        }
        C0107z c0107z = (C0107z) obj;
        return Objects.equals(this.f2899a, c0107z.f2899a) && this.f2903e.equals(c0107z.f2903e) && Objects.equals(this.f2900b, c0107z.f2900b) && this.f2901c.equals(c0107z.f2901c) && Objects.equals(this.f2902d, c0107z.f2902d) && Objects.equals(this.f2904f, c0107z.f2904f);
    }

    public final int hashCode() {
        int hashCode = this.f2899a.hashCode() * 31;
        C0104w c0104w = this.f2900b;
        int hashCode2 = (this.f2902d.hashCode() + ((this.f2903e.hashCode() + ((this.f2901c.hashCode() + ((hashCode + (c0104w != null ? c0104w.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f2904f.getClass();
        return hashCode2;
    }
}
