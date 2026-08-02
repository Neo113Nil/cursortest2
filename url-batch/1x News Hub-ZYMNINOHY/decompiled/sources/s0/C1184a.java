package s0;

import com.google.android.gms.internal.play_billing.i2;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1184a {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f10288a;

    public C1184a(i2 i2Var) {
        this.f10288a = i2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1184a)) {
            return false;
        }
        C1184a c1184a = (C1184a) obj;
        c1184a.getClass();
        if (!this.f10288a.equals(c1184a.f10288a)) {
            return false;
        }
        Object obj2 = EnumC1186c.f10290a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return EnumC1186c.f10290a.hashCode() ^ (((1000003 * 1000003) ^ this.f10288a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f10288a + ", priority=" + EnumC1186c.f10290a + "}";
    }
}
