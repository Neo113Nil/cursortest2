package z1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z2.C1441y;

/* renamed from: z1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1389o {

    /* renamed from: a, reason: collision with root package name */
    public final String f11901a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11902b;

    public C1389o(String athleteId) {
        ArrayList attempts = C1441y.f(null, null, null, null, null, null);
        Intrinsics.checkNotNullParameter(athleteId, "athleteId");
        Intrinsics.checkNotNullParameter(attempts, "attempts");
        this.f11901a = athleteId;
        this.f11902b = attempts;
    }

    public final Double a() {
        List list = this.f11902b;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : list) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        Intrinsics.checkNotNullParameter(destination, "<this>");
        Iterator it = destination.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1389o)) {
            return false;
        }
        C1389o c1389o = (C1389o) obj;
        return Intrinsics.a(this.f11901a, c1389o.f11901a) && Intrinsics.a(this.f11902b, c1389o.f11902b);
    }

    public final int hashCode() {
        return this.f11902b.hashCode() + (this.f11901a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldAttempt(athleteId=" + this.f11901a + ", attempts=" + this.f11902b + ")";
    }
}
