package k7;

import f7.EnumC4517b;

/* renamed from: k7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4660a {

    /* renamed from: a, reason: collision with root package name */
    public final c7.c f38813a;

    /* renamed from: b, reason: collision with root package name */
    public final c7.d f38814b;

    /* renamed from: c, reason: collision with root package name */
    public final C4666g f38815c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38816d;

    public C4660a(c7.c cVar, c7.d dVar, C4666g c4666g, int i) {
        this.f38813a = cVar;
        this.f38814b = dVar;
        this.f38815c = c4666g;
        this.f38816d = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4660a)) {
            return false;
        }
        C4660a c4660a = (C4660a) obj;
        if (!this.f38813a.equals(c4660a.f38813a) || !this.f38814b.equals(c4660a.f38814b) || !this.f38815c.equals(c4660a.f38815c) || this.f38816d != c4660a.f38816d) {
            return false;
        }
        Object obj2 = EnumC4517b.f37809n;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((((((((this.f38813a.hashCode() ^ 1000003) * 1000003) ^ this.f38814b.hashCode()) * 1000003) ^ this.f38815c.hashCode()) * 1000003) ^ this.f38816d) * 1000003) ^ EnumC4517b.f37809n.hashCode();
    }

    public final String toString() {
        return "RegisteredView{instrumentSelector=" + this.f38813a + ", view=" + this.f38814b + "}";
    }
}
