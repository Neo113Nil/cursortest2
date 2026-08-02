package T;

import E.AbstractC0005f;
import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* renamed from: T.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104w {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f2893a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2894b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2895c;

    /* renamed from: d, reason: collision with root package name */
    public final v2.I f2896d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2897e;

    static {
        AbstractC0005f.s(0, 1, 2, 3, 4);
        W.J.G(5);
        W.J.G(6);
        W.J.G(7);
    }

    public C0104w(Uri uri, String str, V3.b bVar, List list, v2.I i4, long j4) {
        this.f2893a = uri;
        this.f2894b = F.n(str);
        this.f2895c = list;
        this.f2896d = i4;
        v2.F j5 = v2.I.j();
        for (int i5 = 0; i5 < i4.size(); i5++) {
            ((C0106y) i4.get(i5)).getClass();
            j5.b(new C0106y());
        }
        j5.f();
        this.f2897e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0104w)) {
            return false;
        }
        C0104w c0104w = (C0104w) obj;
        return this.f2893a.equals(c0104w.f2893a) && Objects.equals(this.f2894b, c0104w.f2894b) && Objects.equals(null, null) && this.f2895c.equals(c0104w.f2895c) && this.f2896d.equals(c0104w.f2896d) && this.f2897e == c0104w.f2897e;
    }

    public final int hashCode() {
        int hashCode = this.f2893a.hashCode() * 31;
        return (int) (((this.f2896d.hashCode() + ((this.f2895c.hashCode() + ((hashCode + (this.f2894b == null ? 0 : r1.hashCode())) * 29791)) * 961)) * 31 * 31) + this.f2897e);
    }
}
