package a4;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195a extends AbstractC0197c {

    /* renamed from: b, reason: collision with root package name */
    public final String f3884b;

    /* renamed from: c, reason: collision with root package name */
    public final Q2.a f3885c;

    public C0195a(Q2.a aVar, String str) {
        this.f3884b = str;
        if (aVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f3885c = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0197c)) {
            return false;
        }
        AbstractC0197c abstractC0197c = (AbstractC0197c) obj;
        String str = this.f3884b;
        if (str != null ? str.equals(((C0195a) abstractC0197c).f3884b) : ((C0195a) abstractC0197c).f3884b == null) {
            if (this.f3885c.equals(((C0195a) abstractC0197c).f3885c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3884b;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f3885c.hashCode();
    }

    public final String toString() {
        return "Resource{schemaUrl=" + this.f3884b + ", attributes=" + this.f3885c + "}";
    }
}
