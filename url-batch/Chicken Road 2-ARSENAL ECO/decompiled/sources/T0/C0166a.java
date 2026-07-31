package T0;

import java.util.Arrays;

/* renamed from: T0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2269a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.c f2270b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2271c;

    public C0166a(S0.c cVar, String str) {
        this.f2270b = cVar;
        this.f2271c = str;
        this.f2269a = Arrays.hashCode(new Object[]{cVar, U0.k.f2549a, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0166a)) {
            return false;
        }
        C0166a c0166a = (C0166a) obj;
        if (!U0.t.i(this.f2270b, c0166a.f2270b)) {
            return false;
        }
        U0.k kVar = U0.k.f2549a;
        return U0.t.i(kVar, kVar) && U0.t.i(this.f2271c, c0166a.f2271c);
    }

    public final int hashCode() {
        return this.f2269a;
    }
}
