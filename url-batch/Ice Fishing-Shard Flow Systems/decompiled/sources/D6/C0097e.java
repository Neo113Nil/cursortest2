package D6;

import a.AbstractC0169a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: D6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097e {

    /* renamed from: c, reason: collision with root package name */
    public static final C0097e f483c = new C0097e(CollectionsKt.C(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f484a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0169a f485b;

    public C0097e(Set pins, AbstractC0169a abstractC0169a) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f484a = pins;
        this.f485b = abstractC0169a;
    }

    public final void a(String hostname, Function0 cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        kotlin.collections.A a7 = kotlin.collections.A.f6115d;
        Iterator it = this.f484a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        a7.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0097e)) {
            return false;
        }
        C0097e c0097e = (C0097e) obj;
        return Intrinsics.a(c0097e.f484a, this.f484a) && Intrinsics.a(c0097e.f485b, this.f485b);
    }

    public final int hashCode() {
        int hashCode = (this.f484a.hashCode() + 1517) * 41;
        AbstractC0169a abstractC0169a = this.f485b;
        return hashCode + (abstractC0169a != null ? abstractC0169a.hashCode() : 0);
    }
}
