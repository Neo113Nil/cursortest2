package kotlinx.coroutines.selects;

import f6.q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import y5.w;

/* loaded from: classes5.dex */
/* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements q {
    public static final OnTimeout$selectClause$1 INSTANCE = new OnTimeout$selectClause$1();

    OnTimeout$selectClause$1() {
        super(3, OnTimeout.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // f6.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((OnTimeout) obj, (j) obj2, obj3);
        return w.INSTANCE;
    }

    public final void invoke(OnTimeout onTimeout, j jVar, Object obj) {
        onTimeout.register(jVar, obj);
    }
}
