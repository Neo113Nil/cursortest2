package n7;

import com.anythink.basead.b.c.i;

/* renamed from: n7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4817c implements d {

    /* renamed from: n, reason: collision with root package name */
    public final d f39653n;

    /* renamed from: u, reason: collision with root package name */
    public final d f39654u;

    /* renamed from: v, reason: collision with root package name */
    public final d f39655v;

    /* renamed from: w, reason: collision with root package name */
    public final d f39656w;

    public C4817c() {
        EnumC4816b enumC4816b = EnumC4816b.f39651n;
        this.f39653n = enumC4816b;
        EnumC4815a enumC4815a = EnumC4815a.f39649n;
        this.f39654u = enumC4815a;
        this.f39655v = enumC4816b;
        this.f39656w = enumC4815a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4817c)) {
            return false;
        }
        C4817c c4817c = (C4817c) obj;
        c4817c.getClass();
        Object obj2 = EnumC4816b.f39651n;
        return obj2.equals(obj2) && this.f39653n.equals(c4817c.f39653n) && this.f39654u.equals(c4817c.f39654u) && this.f39655v.equals(c4817c.f39655v) && this.f39656w.equals(c4817c.f39656w);
    }

    @Override // n7.d
    public final String getDescription() {
        String description = this.f39653n.getDescription();
        String description2 = this.f39654u.getDescription();
        String description3 = this.f39655v.getDescription();
        String description4 = this.f39656w.getDescription();
        StringBuilder sb = new StringBuilder("ParentBased{root:AlwaysOnSampler,remoteParentSampled:");
        sb.append(description);
        sb.append(",remoteParentNotSampled:");
        sb.append(description2);
        sb.append(",localParentSampled:");
        return i.q(sb, description3, ",localParentNotSampled:", description4, "}");
    }

    public final int hashCode() {
        return this.f39656w.hashCode() + ((this.f39655v.hashCode() + ((this.f39654u.hashCode() + ((this.f39653n.hashCode() + (EnumC4816b.f39651n.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return getDescription();
    }
}
