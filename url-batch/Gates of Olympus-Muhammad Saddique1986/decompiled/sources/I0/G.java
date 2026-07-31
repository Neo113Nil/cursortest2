package I0;

import C0.C0031g;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final C0031g f3031a;

    /* renamed from: b, reason: collision with root package name */
    public final t f3032b;

    public G(C0031g c0031g, t tVar) {
        this.f3031a = c0031g;
        this.f3032b = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        return f2.j.a(this.f3031a, g3.f3031a) && f2.j.a(this.f3032b, g3.f3032b);
    }

    public final int hashCode() {
        return this.f3032b.hashCode() + (this.f3031a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f3031a) + ", offsetMapping=" + this.f3032b + ')';
    }
}
