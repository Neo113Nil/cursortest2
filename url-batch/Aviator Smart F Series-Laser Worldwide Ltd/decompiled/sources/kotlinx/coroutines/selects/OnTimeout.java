package kotlinx.coroutines.selects;

import f6.q;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.DelayKt;
import y5.w;

/* loaded from: classes5.dex */
final class OnTimeout {
    private final long timeMillis;

    public static final class a implements Runnable {
        final /* synthetic */ j $select$inlined;
        final /* synthetic */ OnTimeout this$0;

        public a(j jVar, OnTimeout onTimeout) {
            this.$select$inlined = jVar;
            this.this$0 = onTimeout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.$select$inlined.trySelect(this.this$0, w.INSTANCE);
        }
    }

    public OnTimeout(long j8) {
        this.timeMillis = j8;
    }

    public static /* synthetic */ void getSelectClause$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void register(j jVar, Object obj) {
        if (this.timeMillis <= 0) {
            jVar.selectInRegistrationPhase(w.INSTANCE);
            return;
        }
        a aVar = new a(jVar, this);
        s.checkNotNull(jVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        CoroutineContext context = jVar.getContext();
        jVar.disposeOnCompletion(DelayKt.getDelay(context).invokeOnTimeout(this.timeMillis, aVar, context));
    }

    public final c getSelectClause() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.INSTANCE;
        s.checkNotNull(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new d(this, (q) x.beforeCheckcastToFunctionOfArity(onTimeout$selectClause$1, 3), null, 4, null);
    }
}
