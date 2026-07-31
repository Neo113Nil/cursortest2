package t2;

import W1.AbstractC1233c;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import o2.AbstractC3315I;

/* loaded from: classes3.dex */
public abstract class y {

    static final class a extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f46264i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f46265j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f46266k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, Object obj, CoroutineContext coroutineContext) {
            super(1);
            this.f46264i = function1;
            this.f46265j = obj;
            this.f46266k = coroutineContext;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f41027a;
        }

        public final void invoke(Throwable th) {
            y.b(this.f46264i, this.f46265j, this.f46266k);
        }
    }

    public static final Function1 a(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        return new a(function1, obj, coroutineContext);
    }

    public static final void b(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        P c4 = c(function1, obj, null);
        if (c4 != null) {
            AbstractC3315I.a(coroutineContext, c4);
        }
    }

    public static final P c(Function1 function1, Object obj, P p4) {
        try {
            function1.invoke(obj);
            return p4;
        } catch (Throwable th) {
            if (p4 != null && p4.getCause() != th) {
                AbstractC1233c.a(p4, th);
                return p4;
            }
            return new P("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static /* synthetic */ P d(Function1 function1, Object obj, P p4, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            p4 = null;
        }
        return c(function1, obj, p4);
    }
}
