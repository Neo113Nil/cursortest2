package T0;

import java.util.Arrays;
import u0.C0675e;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final C0166a f2234a;

    /* renamed from: b, reason: collision with root package name */
    public final R0.c f2235b;

    public /* synthetic */ C(C0166a c0166a, R0.c cVar) {
        this.f2234a = c0166a;
        this.f2235b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C)) {
            C c7 = (C) obj;
            if (U0.t.i(this.f2234a, c7.f2234a) && U0.t.i(this.f2235b, c7.f2235b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2234a, this.f2235b});
    }

    public final String toString() {
        C0675e c0675e = new C0675e(this);
        c0675e.b(this.f2234a, "key");
        c0675e.b(this.f2235b, "feature");
        return c0675e.toString();
    }
}
