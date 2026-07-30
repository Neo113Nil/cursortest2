package U1;

import P.InterfaceC0144i;
import X5.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class c extends j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f2715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2716e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f2717i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, Function1 function1, V5.b bVar) {
        super(2, bVar);
        this.f2716e = hVar;
        this.f2717i = function1;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new c(this.f2716e, this.f2717i, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        h hVar = this.f2716e;
        ThreadLocal threadLocal = hVar.f2732b;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2715d;
        try {
            if (i2 == 0) {
                V6.b.P(obj);
                Object obj2 = threadLocal.get();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.a(obj2, bool)) {
                    throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                }
                threadLocal.set(bool);
                InterfaceC0144i interfaceC0144i = hVar.f2733c;
                b bVar = new b(this.f2717i, null);
                this.f2715d = 1;
                obj = d4.c.m(interfaceC0144i, bVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return (T.b) obj;
        } finally {
            threadLocal.set(Boolean.FALSE);
        }
    }
}
