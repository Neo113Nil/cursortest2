package b0;

/* renamed from: b0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255F extends AbstractC0257H {

    /* renamed from: a, reason: collision with root package name */
    public final a0.d f4212a;

    public C0255F(a0.d dVar) {
        this.f4212a = dVar;
    }

    @Override // b0.AbstractC0257H
    public final a0.d a() {
        return this.f4212a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0255F) {
            return Z1.i.a(this.f4212a, ((C0255F) obj).f4212a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4212a.hashCode();
    }
}
