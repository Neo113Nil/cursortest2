package androidx.window.java.layout;

import f6.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import m6.l0;
import p6.b;
import p6.c;
import q.a;
import v5.l;
import v5.q;
import y5.d;

@f(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends k implements p<l0, d<? super q>, Object> {
    final /* synthetic */ a<T> $consumer;
    final /* synthetic */ b<T> $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WindowInfoTrackerCallbackAdapter$addListener$1$1(b<? extends T> bVar, a<T> aVar, d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1> dVar) {
        super(2, dVar);
        this.$flow = bVar;
        this.$consumer = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, dVar);
    }

    @Override // f6.p
    public final Object invoke(l0 l0Var, d<? super q> dVar) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(l0Var, dVar)).invokeSuspend(q.f22838a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c7;
        c7 = z5.d.c();
        int i7 = this.label;
        if (i7 == 0) {
            l.b(obj);
            b<T> bVar = this.$flow;
            final a<T> aVar = this.$consumer;
            Object obj2 = new c<T>() { // from class: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1
                @Override // p6.c
                public Object emit(T t6, d<? super q> dVar) {
                    a.this.accept(t6);
                    return q.f22838a;
                }
            };
            this.label = 1;
            if (bVar.a(obj2, this) == c7) {
                return c7;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.b(obj);
        }
        return q.f22838a;
    }
}
