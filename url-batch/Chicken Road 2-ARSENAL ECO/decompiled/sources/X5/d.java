package X5;

import a1.AbstractC0223a;
import java.util.ArrayList;
import java.util.Set;
import l5.AbstractC0506j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f2905c = new d(AbstractC0506j.T(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f2906a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0223a f2907b;

    public d(Set set, AbstractC0223a abstractC0223a) {
        this.f2906a = set;
        this.f2907b = abstractC0223a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.i.a(dVar.f2906a, this.f2906a) && kotlin.jvm.internal.i.a(dVar.f2907b, this.f2907b);
    }

    public final int hashCode() {
        int hashCode = (this.f2906a.hashCode() + 1517) * 41;
        AbstractC0223a abstractC0223a = this.f2907b;
        return hashCode + (abstractC0223a != null ? abstractC0223a.hashCode() : 0);
    }
}
