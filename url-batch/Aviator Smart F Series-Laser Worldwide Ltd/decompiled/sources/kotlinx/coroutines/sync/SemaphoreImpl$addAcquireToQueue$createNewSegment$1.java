package kotlinx.coroutines.sync;

import f6.p;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class SemaphoreImpl$addAcquireToQueue$createNewSegment$1 extends FunctionReferenceImpl implements p {
    public static final SemaphoreImpl$addAcquireToQueue$createNewSegment$1 INSTANCE = new SemaphoreImpl$addAcquireToQueue$createNewSegment$1();

    SemaphoreImpl$addAcquireToQueue$createNewSegment$1() {
        super(2, SemaphoreKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // f6.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (b) obj2);
    }

    public final b invoke(long j8, b bVar) {
        b createSegment;
        createSegment = SemaphoreKt.createSegment(j8, bVar);
        return createSegment;
    }
}
