package androidx.lifecycle;

import a2.AbstractC1241b;
import androidx.lifecycle.AbstractC1346l;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.B0;
import o2.InterfaceC3316J;

/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1348n extends AbstractC1347m implements InterfaceC1351q {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1346l f12666b;

    /* renamed from: c, reason: collision with root package name */
    private final CoroutineContext f12667c;

    /* renamed from: androidx.lifecycle.n$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: l, reason: collision with root package name */
        int f12668l;

        /* renamed from: m, reason: collision with root package name */
        private /* synthetic */ Object f12669m;

        a(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = C1348n.this.new a(dVar);
            aVar.f12669m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC1241b.f();
            if (this.f12668l != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
            InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.f12669m;
            if (C1348n.this.a().getCurrentState().compareTo(AbstractC1346l.b.INITIALIZED) >= 0) {
                C1348n.this.a().addObserver(C1348n.this);
            } else {
                B0.d(interfaceC3316J.n(), null, 1, null);
            }
            return Unit.f41027a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC3316J interfaceC3316J, kotlin.coroutines.d dVar) {
            return ((a) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
        }
    }

    public C1348n(AbstractC1346l lifecycle, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f12666b = lifecycle;
        this.f12667c = coroutineContext;
        if (a().getCurrentState() == AbstractC1346l.b.DESTROYED) {
            B0.d(n(), null, 1, null);
        }
    }

    public AbstractC1346l a() {
        return this.f12666b;
    }

    public final void b() {
        AbstractC3337k.d(this, o2.Z.c().p(), null, new a(null), 2, null);
    }

    @Override // o2.InterfaceC3316J
    public CoroutineContext n() {
        return this.f12667c;
    }

    @Override // androidx.lifecycle.InterfaceC1351q
    public void onStateChanged(InterfaceC1354u source, AbstractC1346l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (a().getCurrentState().compareTo(AbstractC1346l.b.DESTROYED) <= 0) {
            a().removeObserver(this);
            B0.d(n(), null, 1, null);
        }
    }
}
