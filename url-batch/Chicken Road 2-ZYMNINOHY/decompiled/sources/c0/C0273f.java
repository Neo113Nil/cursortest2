package c0;

/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273f {

    /* renamed from: d, reason: collision with root package name */
    public static final C0273f f5551d = new S0.f().a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5552a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5553b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5554c;

    public C0273f(S0.f fVar) {
        this.f5552a = fVar.f2411a;
        this.f5553b = fVar.f2412b;
        this.f5554c = fVar.f2413c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0273f.class != obj.getClass()) {
            return false;
        }
        C0273f c0273f = (C0273f) obj;
        return this.f5552a == c0273f.f5552a && this.f5553b == c0273f.f5553b && this.f5554c == c0273f.f5554c;
    }

    public final int hashCode() {
        return ((this.f5552a ? 1 : 0) << 2) + ((this.f5553b ? 1 : 0) << 1) + (this.f5554c ? 1 : 0);
    }
}
