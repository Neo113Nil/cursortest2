package h5;

/* renamed from: h5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0412c implements InterfaceC0413d {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0413d f4343f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0413d f4344g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0413d f4345h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0413d f4346i;

    public C0412c() {
        EnumC0411b enumC0411b = EnumC0411b.f4341f;
        this.f4343f = enumC0411b;
        EnumC0410a enumC0410a = EnumC0410a.f4339f;
        this.f4344g = enumC0410a;
        this.f4345h = enumC0411b;
        this.f4346i = enumC0410a;
    }

    @Override // h5.InterfaceC0413d
    public final String a() {
        return "ParentBased{root:AlwaysOnSampler,remoteParentSampled:" + this.f4343f.a() + ",remoteParentNotSampled:" + this.f4344g.a() + ",localParentSampled:" + this.f4345h.a() + ",localParentNotSampled:" + this.f4346i.a() + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0412c)) {
            return false;
        }
        C0412c c0412c = (C0412c) obj;
        c0412c.getClass();
        Object obj2 = EnumC0411b.f4341f;
        return obj2.equals(obj2) && this.f4343f.equals(c0412c.f4343f) && this.f4344g.equals(c0412c.f4344g) && this.f4345h.equals(c0412c.f4345h) && this.f4346i.equals(c0412c.f4346i);
    }

    public final int hashCode() {
        return this.f4346i.hashCode() + ((this.f4345h.hashCode() + ((this.f4344g.hashCode() + ((this.f4343f.hashCode() + (EnumC0411b.f4341f.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return a();
    }
}
