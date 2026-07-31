package kotlin.ranges;

/* loaded from: classes3.dex */
final class c implements l2.b {

    /* renamed from: a, reason: collision with root package name */
    private final float f41180a;

    /* renamed from: b, reason: collision with root package name */
    private final float f41181b;

    public c(float f4, float f5) {
        this.f41180a = f4;
        this.f41181b = f5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l2.b
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return b(((Number) comparable).floatValue());
    }

    public boolean b(float f4) {
        return f4 >= this.f41180a && f4 <= this.f41181b;
    }

    public boolean c() {
        return this.f41180a > this.f41181b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (c() && ((c) obj).c()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f41180a == cVar.f41180a && this.f41181b == cVar.f41181b;
    }

    public int hashCode() {
        if (c()) {
            return -1;
        }
        return (Float.hashCode(this.f41180a) * 31) + Float.hashCode(this.f41181b);
    }

    public String toString() {
        return this.f41180a + ".." + this.f41181b;
    }
}
