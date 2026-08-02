package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gwt {
    private final htz a;

    public gwt(htz htzVar) {
        this.a = htzVar;
    }

    public final gwt a(htv htvVar, Executor executor) {
        return new gwt(this.a.a(gvx.e(htvVar), executor));
    }

    public final gwu b() {
        return gwu.g(this.a.f());
    }

    public final String toString() {
        return "PropagatedClosingFuture[" + this.a.toString() + "]";
    }
}
