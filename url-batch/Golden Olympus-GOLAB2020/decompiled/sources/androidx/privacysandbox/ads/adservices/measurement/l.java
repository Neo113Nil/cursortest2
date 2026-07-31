package androidx.privacysandbox.ads.adservices.measurement;

import a2.AbstractC1241b;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.C3345o;
import o2.InterfaceC3316J;
import o2.K;

/* loaded from: classes.dex */
public abstract class l extends b {

    /* renamed from: b, reason: collision with root package name */
    private final MeasurementManager f12761b;

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: l, reason: collision with root package name */
        int f12762l;

        /* renamed from: m, reason: collision with root package name */
        private /* synthetic */ Object f12763m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ l f12764n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, l lVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f12764n = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(null, this.f12764n, dVar);
            aVar.f12763m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC1241b.f();
            if (this.f12762l != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
            return ((a) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
        }
    }

    public l(MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f12761b = mMeasurementManager;
    }

    static /* synthetic */ Object h(l lVar, androidx.privacysandbox.ads.adservices.measurement.a aVar, kotlin.coroutines.d dVar) {
        new C3345o(AbstractC1241b.c(dVar), 1).E();
        lVar.i();
        throw null;
    }

    static /* synthetic */ Object j(l lVar, kotlin.coroutines.d dVar) {
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        lVar.i().getMeasurementApiStatus(new k(), androidx.core.os.m.a(c3345o));
        Object y4 = c3345o.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    static /* synthetic */ Object k(l lVar, Uri uri, InputEvent inputEvent, kotlin.coroutines.d dVar) {
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        lVar.i().registerSource(uri, inputEvent, new k(), androidx.core.os.m.a(c3345o));
        Object y4 = c3345o.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == AbstractC1241b.f() ? y4 : Unit.f41027a;
    }

    static /* synthetic */ Object l(l lVar, m mVar, kotlin.coroutines.d dVar) {
        Object g4 = K.g(new a(mVar, lVar, null), dVar);
        return g4 == AbstractC1241b.f() ? g4 : Unit.f41027a;
    }

    static /* synthetic */ Object m(l lVar, Uri uri, kotlin.coroutines.d dVar) {
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        lVar.i().registerTrigger(uri, new k(), androidx.core.os.m.a(c3345o));
        Object y4 = c3345o.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == AbstractC1241b.f() ? y4 : Unit.f41027a;
    }

    static /* synthetic */ Object n(l lVar, n nVar, kotlin.coroutines.d dVar) {
        new C3345o(AbstractC1241b.c(dVar), 1).E();
        lVar.i();
        throw null;
    }

    static /* synthetic */ Object o(l lVar, o oVar, kotlin.coroutines.d dVar) {
        new C3345o(AbstractC1241b.c(dVar), 1).E();
        lVar.i();
        throw null;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, kotlin.coroutines.d dVar) {
        return h(this, aVar, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object b(kotlin.coroutines.d dVar) {
        return j(this, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object c(Uri uri, InputEvent inputEvent, kotlin.coroutines.d dVar) {
        return k(this, uri, inputEvent, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object d(m mVar, kotlin.coroutines.d dVar) {
        return l(this, mVar, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object e(Uri uri, kotlin.coroutines.d dVar) {
        return m(this, uri, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object f(n nVar, kotlin.coroutines.d dVar) {
        return n(this, nVar, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object g(o oVar, kotlin.coroutines.d dVar) {
        return o(this, oVar, dVar);
    }

    protected final MeasurementManager i() {
        return this.f12761b;
    }
}
