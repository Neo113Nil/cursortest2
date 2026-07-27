package S0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2737a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2738b;

    public a(Object obj, b bVar) {
        this.f2737a = obj;
        this.f2738b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (this.f2737a.equals(aVar.f2737a)) {
            Object obj2 = d.f2741a;
            if (obj2.equals(obj2)) {
                b bVar = aVar.f2738b;
                b bVar2 = this.f2738b;
                if (bVar2 == null) {
                    if (bVar == null) {
                        return true;
                    }
                } else if (bVar2.equals(bVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.f2737a.hashCode()) * 1000003) ^ d.f2741a.hashCode()) * 1000003;
        b bVar = this.f2738b;
        return (bVar == null ? 0 : bVar.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f2737a + ", priority=" + d.f2741a + ", productData=" + this.f2738b + "}";
    }
}
