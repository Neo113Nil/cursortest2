package n1;

/* loaded from: classes.dex */
public final class c extends C0316a {

    /* renamed from: d, reason: collision with root package name */
    public static final c f3762d = new c(1, 0, 1);

    @Override // n1.C0316a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f3755a == cVar.f3755a) {
                    if (this.f3756b == cVar.f3756b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // n1.C0316a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f3755a * 31) + this.f3756b;
    }

    @Override // n1.C0316a
    public final boolean isEmpty() {
        return this.f3755a > this.f3756b;
    }

    @Override // n1.C0316a
    public final String toString() {
        return this.f3755a + ".." + this.f3756b;
    }
}
