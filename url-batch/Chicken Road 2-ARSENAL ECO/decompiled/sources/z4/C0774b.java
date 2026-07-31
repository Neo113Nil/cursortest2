package z4;

import A3.c;
import java.util.List;
import n6.i;
import z3.d;
import z3.f;
import z3.m;

/* renamed from: z4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774b extends f {

    /* renamed from: k, reason: collision with root package name */
    public static final C0773a f6340k;

    /* renamed from: h, reason: collision with root package name */
    public final List f6341h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6342i;

    /* renamed from: j, reason: collision with root package name */
    public final List f6343j;

    static {
        d dVar = d.f6297g;
        m mVar = m.f6336g;
        f6340k = new C0773a(C0774b.class);
    }

    public C0774b(A3.d dVar, int i7, A3.d dVar2, i iVar) {
        super(f6340k, iVar);
        this.f6341h = c.R(dVar, "attributes");
        this.f6342i = i7;
        this.f6343j = c.R(dVar2, "entity_refs");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0774b)) {
            return false;
        }
        C0774b c0774b = (C0774b) obj;
        return a().equals(c0774b.a()) && this.f6341h.equals(c0774b.f6341h) && c.O(Integer.valueOf(this.f6342i), Integer.valueOf(c0774b.f6342i)) && this.f6343j.equals(c0774b.f6343j);
    }

    public final int hashCode() {
        int i7 = this.f6306g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = this.f6343j.hashCode() + ((Integer.hashCode(this.f6342i) + ((this.f6341h.hashCode() + (a().hashCode() * 37)) * 37)) * 37);
        this.f6306g = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f6341h;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f6342i);
        List list2 = this.f6343j;
        if (!list2.isEmpty()) {
            sb.append(", entity_refs=");
            sb.append(list2);
        }
        StringBuilder replace = sb.replace(0, 2, "Resource{");
        replace.append('}');
        return replace.toString();
    }
}
