package x2;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class q extends A {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8759d;

    /* renamed from: e, reason: collision with root package name */
    public final SerialDescriptor f8760e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8761f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, boolean z3) {
        super(null);
        Z1.i.f(str, "body");
        this.f8759d = z3;
        this.f8761f = str.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f8759d == qVar.f8759d && Z1.i.a(this.f8761f, qVar.f8761f);
    }

    @Override // x2.A
    public final String getContent() {
        return this.f8761f;
    }

    public final int hashCode() {
        return this.f8761f.hashCode() + (Boolean.hashCode(this.f8759d) * 31);
    }

    @Override // x2.A
    public final boolean isString() {
        return this.f8759d;
    }

    @Override // x2.A
    public final String toString() {
        boolean z3 = this.f8759d;
        String str = this.f8761f;
        if (!z3) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        y2.l.a(sb, str);
        String sb2 = sb.toString();
        Z1.i.e(sb2, "toString(...)");
        return sb2;
    }
}
