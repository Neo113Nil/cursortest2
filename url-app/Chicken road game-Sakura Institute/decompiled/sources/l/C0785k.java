package l;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785k {

    /* renamed from: a, reason: collision with root package name */
    public final C0788n f7784a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7785b;

    public C0785k(C0788n c0788n, int i2) {
        this.f7784a = c0788n;
        this.f7785b = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        int i2 = this.f7785b;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "Finished" : "BoundReached");
        sb.append(", endState=");
        sb.append(this.f7784a);
        sb.append(')');
        return sb.toString();
    }
}
