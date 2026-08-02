package I1;

import com.google.android.gms.internal.play_billing.x1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final x1 f1124a;

    public a(x1 x1Var) {
        this.f1124a = x1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (!this.f1124a.equals(aVar.f1124a)) {
            return false;
        }
        Object obj2 = c.f1126a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return c.f1126a.hashCode() ^ (((1000003 * 1000003) ^ this.f1124a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f1124a + ", priority=" + c.f1126a + "}";
    }
}
