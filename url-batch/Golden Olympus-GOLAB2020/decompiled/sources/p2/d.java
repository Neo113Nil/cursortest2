package p2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.ranges.g;
import o2.AbstractC3367z0;
import o2.InterfaceC3320b0;
import o2.InterfaceC3343n;
import o2.J0;
import o2.T;
import o2.Z;

/* loaded from: classes3.dex */
public final class d extends e implements T {

    /* renamed from: d, reason: collision with root package name */
    private final Handler f43365d;

    /* renamed from: e, reason: collision with root package name */
    private final String f43366e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f43367f;

    /* renamed from: g, reason: collision with root package name */
    private final d f43368g;

    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3343n f43369b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f43370c;

        public a(InterfaceC3343n interfaceC3343n, d dVar) {
            this.f43369b = interfaceC3343n;
            this.f43370c = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f43369b.k(this.f43370c, Unit.f41027a);
        }
    }

    static final class b extends s implements Function1 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Runnable f43372j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f43372j = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f41027a;
        }

        public final void invoke(Throwable th) {
            d.this.f43365d.removeCallbacks(this.f43372j);
        }
    }

    private d(Handler handler, String str, boolean z4) {
        super(null);
        this.f43365d = handler;
        this.f43366e = str;
        this.f43367f = z4;
        this.f43368g = z4 ? this : new d(handler, str, true);
    }

    private final void X(CoroutineContext coroutineContext, Runnable runnable) {
        AbstractC3367z0.c(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Z.b().g(coroutineContext, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(d dVar, Runnable runnable) {
        dVar.f43365d.removeCallbacks(runnable);
    }

    @Override // o2.H0
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public d p() {
        return this.f43368g;
    }

    @Override // o2.T
    public void e(long j4, InterfaceC3343n interfaceC3343n) {
        a aVar = new a(interfaceC3343n, this);
        if (this.f43365d.postDelayed(aVar, g.h(j4, 4611686018427387903L))) {
            interfaceC3343n.f(new b(aVar));
        } else {
            X(interfaceC3343n.getContext(), aVar);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f43365d == this.f43365d && dVar.f43367f == this.f43367f;
    }

    @Override // o2.T
    public InterfaceC3320b0 f(long j4, final Runnable runnable, CoroutineContext coroutineContext) {
        if (this.f43365d.postDelayed(runnable, g.h(j4, 4611686018427387903L))) {
            return new InterfaceC3320b0() { // from class: p2.c
                @Override // o2.InterfaceC3320b0
                public final void dispose() {
                    d.Z(d.this, runnable);
                }
            };
        }
        X(coroutineContext, runnable);
        return J0.f42008b;
    }

    @Override // o2.AbstractC3313G
    public void g(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f43365d.post(runnable)) {
            return;
        }
        X(coroutineContext, runnable);
    }

    public int hashCode() {
        return System.identityHashCode(this.f43365d) ^ (this.f43367f ? 1231 : 1237);
    }

    @Override // o2.AbstractC3313G
    public boolean i(CoroutineContext coroutineContext) {
        return (this.f43367f && Intrinsics.areEqual(Looper.myLooper(), this.f43365d.getLooper())) ? false : true;
    }

    @Override // o2.AbstractC3313G
    public String toString() {
        String U3 = U();
        if (U3 != null) {
            return U3;
        }
        String str = this.f43366e;
        if (str == null) {
            str = this.f43365d.toString();
        }
        if (!this.f43367f) {
            return str;
        }
        return str + ".immediate";
    }

    public /* synthetic */ d(Handler handler, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i4 & 2) != 0 ? null : str);
    }

    public d(Handler handler, String str) {
        this(handler, str, false);
    }
}
