package p5;

import android.content.Context;
import java.util.Objects;
import k4.d;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f20135a;

    /* renamed from: b, reason: collision with root package name */
    private final a f20136b;

    b(Boolean bool, a aVar) {
        this.f20135a = bool;
        this.f20136b = aVar;
    }

    k4.d a(Context context) {
        d.a aVar = new d.a();
        Boolean bool = this.f20135a;
        if (bool != null) {
            aVar.c(bool.booleanValue());
        }
        a aVar2 = this.f20136b;
        if (aVar2 != null) {
            aVar.b(aVar2.a(context));
        }
        return aVar.a();
    }

    a b() {
        return this.f20136b;
    }

    Boolean c() {
        return this.f20135a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f20135a, bVar.c()) && Objects.equals(this.f20136b, bVar.b());
    }

    public int hashCode() {
        return Objects.hash(this.f20135a, this.f20136b);
    }
}
