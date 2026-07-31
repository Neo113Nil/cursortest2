package D2;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class q extends A {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f899d;

    /* renamed from: e, reason: collision with root package name */
    public final SerialDescriptor f900e;

    /* renamed from: f, reason: collision with root package name */
    public final String f901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, boolean z3) {
        super(null);
        f2.j.f(str, "body");
        this.f899d = z3;
        this.f901f = str.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f899d == qVar.f899d && f2.j.a(this.f901f, qVar.f901f);
    }

    @Override // D2.A
    public final String getContent() {
        return this.f901f;
    }

    public final int hashCode() {
        return this.f901f.hashCode() + (Boolean.hashCode(this.f899d) * 31);
    }

    @Override // D2.A
    public final boolean isString() {
        return this.f899d;
    }

    @Override // D2.A
    public final String toString() {
        boolean z3 = this.f899d;
        String str = this.f901f;
        if (!z3) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        E2.q.a(sb, str);
        String sb2 = sb.toString();
        f2.j.e(sb2, "toString(...)");
        return sb2;
    }
}
