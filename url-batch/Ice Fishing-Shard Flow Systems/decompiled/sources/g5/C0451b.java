package g5;

import T6.i;
import c4.AbstractC0300f;
import c4.EnumC0298d;
import c4.EnumC0307m;
import d4.d;
import java.util.List;

/* renamed from: g5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451b extends AbstractC0300f {

    /* renamed from: n, reason: collision with root package name */
    public static final C0450a f5031n;

    /* renamed from: i, reason: collision with root package name */
    public final List f5032i;

    /* renamed from: l, reason: collision with root package name */
    public final int f5033l;

    /* renamed from: m, reason: collision with root package name */
    public final List f5034m;

    static {
        EnumC0298d enumC0298d = EnumC0298d.f4212e;
        EnumC0307m enumC0307m = EnumC0307m.f4251e;
        f5031n = new C0450a(C0451b.class);
    }

    public C0451b(d dVar, int i2, d dVar2, i iVar) {
        super(f5031n, iVar);
        this.f5032i = V6.b.E("attributes", dVar);
        this.f5033l = i2;
        this.f5034m = V6.b.E("entity_refs", dVar2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0451b)) {
            return false;
        }
        C0451b c0451b = (C0451b) obj;
        return a().equals(c0451b.a()) && this.f5032i.equals(c0451b.f5032i) && V6.b.z(Integer.valueOf(this.f5033l), Integer.valueOf(c0451b.f5033l)) && this.f5034m.equals(c0451b.f5034m);
    }

    public final int hashCode() {
        int i2 = this.f4221e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f5034m.hashCode() + ((Integer.hashCode(this.f5033l) + ((this.f5032i.hashCode() + (a().hashCode() * 37)) * 37)) * 37);
        this.f4221e = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f5032i;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f5033l);
        List list2 = this.f5034m;
        if (!list2.isEmpty()) {
            sb.append(", entity_refs=");
            sb.append(list2);
        }
        StringBuilder replace = sb.replace(0, 2, "Resource{");
        replace.append('}');
        return replace.toString();
    }
}
