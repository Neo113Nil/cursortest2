package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class d0 implements m {
    public static final d0 BEFORE_ROC;
    public static final d0 ROC;
    public static final /* synthetic */ d0[] a;

    static {
        d0 d0Var = new d0("BEFORE_ROC", 0);
        BEFORE_ROC = d0Var;
        d0 d0Var2 = new d0("ROC", 1);
        ROC = d0Var2;
        a = new d0[]{d0Var, d0Var2};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) a.clone();
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ boolean c(j$.time.temporal.n nVar) {
        return j$.nio.file.attribute.a.q(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int f(j$.time.temporal.n nVar) {
        return j$.nio.file.attribute.a.l(this, nVar);
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal j(Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ Object k(j$.time.format.b bVar) {
        return j$.nio.file.attribute.a.u(this, bVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ long o(j$.time.temporal.n nVar) {
        return j$.nio.file.attribute.a.n(this, nVar);
    }
}
