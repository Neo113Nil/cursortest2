package kotlinx.coroutines;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
/* synthetic */ class JobSupport$onJoin$1 extends FunctionReferenceImpl implements f6.q {
    public static final JobSupport$onJoin$1 INSTANCE = new JobSupport$onJoin$1();

    JobSupport$onJoin$1() {
        super(3, JobSupport.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // f6.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((JobSupport) obj, (kotlinx.coroutines.selects.j) obj2, obj3);
        return y5.w.INSTANCE;
    }

    public final void invoke(JobSupport jobSupport, kotlinx.coroutines.selects.j jVar, Object obj) {
        jobSupport.registerSelectForOnJoin(jVar, obj);
    }
}
