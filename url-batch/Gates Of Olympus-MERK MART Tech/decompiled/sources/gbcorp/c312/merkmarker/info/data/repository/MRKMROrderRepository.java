package gbcorp.c312.merkmarker.info.data.repository;

import gbcorp.c312.merkmarker.info.data.dao.OrderDao;
import gbcorp.c312.merkmarker.info.data.entity.MRKMROrderEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MRKMROrderRepository.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\u000eJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/repository/MRKMROrderRepository;", "", "orderDao", "Lgbcorp/c312/merkmarker/info/data/dao/OrderDao;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lgbcorp/c312/merkmarker/info/data/dao/OrderDao;Lkotlinx/coroutines/CoroutineDispatcher;)V", "save", "", "orderEntity", "Lgbcorp/c312/merkmarker/info/data/entity/MRKMROrderEntity;", "(Lgbcorp/c312/merkmarker/info/data/entity/MRKMROrderEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeAll", "Lkotlinx/coroutines/flow/Flow;", "", "deleteByNumber", "", "orderNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMROrderRepository {
    public static final int $stable = 8;
    private final CoroutineDispatcher coroutineDispatcher;
    private final OrderDao orderDao;

    public MRKMROrderRepository(OrderDao orderDao, CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(orderDao, "orderDao");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.orderDao = orderDao;
        this.coroutineDispatcher = coroutineDispatcher;
    }

    public final Object save(MRKMROrderEntity mRKMROrderEntity, Continuation<? super Long> continuation) {
        return BuildersKt.withContext(this.coroutineDispatcher, new MRKMROrderRepository$save$2(this, mRKMROrderEntity, null), continuation);
    }

    public final Flow<List<MRKMROrderEntity>> observeAll() {
        return this.orderDao.observeAll();
    }

    public final Object deleteByNumber(String str, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.coroutineDispatcher, new MRKMROrderRepository$deleteByNumber$2(this, str, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
