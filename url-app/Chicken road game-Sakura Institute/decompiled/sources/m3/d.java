package m3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;
import z2.C1405I;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f8338c = new d(C1403G.K(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f8339a;

    /* renamed from: b, reason: collision with root package name */
    public final s f8340b;

    public d(Set pins, s sVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f8339a = pins;
        this.f8340b = sVar;
    }

    public final void a(String hostname, Function0 cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set set = this.f8339a;
        C1405I c1405i = C1405I.f11931d;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c1405i.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (Intrinsics.a(dVar.f8339a, this.f8339a) && Intrinsics.a(dVar.f8340b, this.f8340b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f8339a.hashCode() + 1517) * 41;
        s sVar = this.f8340b;
        return hashCode + (sVar != null ? sVar.hashCode() : 0);
    }
}
