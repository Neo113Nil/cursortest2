package j$.time.format;

import com.google.firebase.encoders.json.BuildConfig;
import j$.time.temporal.TemporalAccessor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class x implements TemporalAccessor {
    public final /* synthetic */ j$.time.chrono.b a;
    public final /* synthetic */ TemporalAccessor b;
    public final /* synthetic */ j$.time.chrono.m c;
    public final /* synthetic */ j$.time.y d;

    public x(j$.time.chrono.b bVar, TemporalAccessor temporalAccessor, j$.time.chrono.m mVar, j$.time.y yVar) {
        this.a = bVar;
        this.b = temporalAccessor;
        this.c = mVar;
        this.d = yVar;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(j$.time.a0 a0Var) {
        return a0Var == j$.time.temporal.r.b ? this.c : a0Var == j$.time.temporal.r.a ? this.d : a0Var == j$.time.temporal.r.c ? this.b.b(a0Var) : a0Var.j(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !qVar.isDateBased()) ? this.b.f(qVar) : bVar.f(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !qVar.isDateBased()) ? this.b.g(qVar) : bVar.g(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !qVar.isDateBased()) ? this.b.k(qVar) : bVar.k(qVar);
    }

    public final String toString() {
        String str;
        String str2 = BuildConfig.FLAVOR;
        j$.time.chrono.m mVar = this.c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = BuildConfig.FLAVOR;
        }
        j$.time.y yVar = this.d;
        if (yVar != null) {
            str2 = " with zone " + yVar;
        }
        return this.b + str + str2;
    }
}
