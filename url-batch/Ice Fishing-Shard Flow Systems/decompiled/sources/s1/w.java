package s1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final C0870a f7747a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.d f7748b;

    public /* synthetic */ w(C0870a c0870a, q1.d dVar) {
        this.f7747a = c0870a;
        this.f7748b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (t1.u.i(this.f7747a, wVar.f7747a) && t1.u.i(this.f7748b, wVar.f7748b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7747a, this.f7748b});
    }

    public final String toString() {
        P0.e eVar = new P0.e(this);
        eVar.l(this.f7747a, "key");
        eVar.l(this.f7748b, "feature");
        return eVar.toString();
    }
}
