package c2;

import a2.C0164d;
import d2.C0389g;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final C0284a f5695a;

    /* renamed from: b, reason: collision with root package name */
    public final C0164d f5696b;

    public /* synthetic */ n(C0284a c0284a, C0164d c0164d) {
        this.f5695a = c0284a;
        this.f5696b = c0164d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            if (d2.s.e(this.f5695a, nVar.f5695a) && d2.s.e(this.f5696b, nVar.f5696b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5695a, this.f5696b});
    }

    public final String toString() {
        C0389g c0389g = new C0389g(this);
        c0389g.C(this.f5695a, "key");
        c0389g.C(this.f5696b, "feature");
        return c0389g.toString();
    }
}
