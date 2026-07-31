package androidx.lifecycle;

import a2.AbstractC1241b;
import androidx.lifecycle.AbstractC1346l;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o2.AbstractC3313G;
import o2.C3345o;
import o2.InterfaceC3343n;

/* loaded from: classes.dex */
public abstract class f0 {

    static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1346l f12643b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f12644c;

        a(AbstractC1346l abstractC1346l, c cVar) {
            this.f12643b = abstractC1346l;
            this.f12644c = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f12643b.addObserver(this.f12644c);
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AbstractC3313G f12645i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ AbstractC1346l f12646j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ c f12647k;

        static final class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC1346l f12648b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f12649c;

            a(AbstractC1346l abstractC1346l, c cVar) {
                this.f12648b = abstractC1346l;
                this.f12649c = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12648b.removeObserver(this.f12649c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC3313G abstractC3313G, AbstractC1346l abstractC1346l, c cVar) {
            super(1);
            this.f12645i = abstractC3313G;
            this.f12646j = abstractC1346l;
            this.f12647k = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f41027a;
        }

        public final void invoke(Throwable th) {
            AbstractC3313G abstractC3313G = this.f12645i;
            kotlin.coroutines.g gVar = kotlin.coroutines.g.f41113b;
            if (abstractC3313G.i(gVar)) {
                this.f12645i.g(gVar, new a(this.f12646j, this.f12647k));
            } else {
                this.f12646j.removeObserver(this.f12647k);
            }
        }
    }

    public static final class c implements InterfaceC1351q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1346l.b f12650b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC1346l f12651c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3343n f12652d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f12653e;

        c(AbstractC1346l.b bVar, AbstractC1346l abstractC1346l, InterfaceC3343n interfaceC3343n, Function0 function0) {
            this.f12650b = bVar;
            this.f12651c = abstractC1346l;
            this.f12652d = interfaceC3343n;
            this.f12653e = function0;
        }

        @Override // androidx.lifecycle.InterfaceC1351q
        public void onStateChanged(InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar) {
            Object m243constructorimpl;
            if (aVar != AbstractC1346l.a.Companion.c(this.f12650b)) {
                if (aVar == AbstractC1346l.a.ON_DESTROY) {
                    this.f12651c.removeObserver(this);
                    InterfaceC3343n interfaceC3343n = this.f12652d;
                    Result.Companion companion = Result.Companion;
                    interfaceC3343n.resumeWith(Result.m243constructorimpl(ResultKt.createFailure(new C1349o())));
                    return;
                }
                return;
            }
            this.f12651c.removeObserver(this);
            InterfaceC3343n interfaceC3343n2 = this.f12652d;
            Function0 function0 = this.f12653e;
            try {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion3 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            interfaceC3343n2.resumeWith(m243constructorimpl);
        }
    }

    public static final Object a(AbstractC1346l abstractC1346l, AbstractC1346l.b bVar, boolean z4, AbstractC3313G abstractC3313G, Function0 function0, kotlin.coroutines.d dVar) {
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        c cVar = new c(bVar, abstractC1346l, c3345o, function0);
        if (z4) {
            abstractC3313G.g(kotlin.coroutines.g.f41113b, new a(abstractC1346l, cVar));
        } else {
            abstractC1346l.addObserver(cVar);
        }
        c3345o.f(new b(abstractC3313G, abstractC1346l, cVar));
        Object y4 = c3345o.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }
}
