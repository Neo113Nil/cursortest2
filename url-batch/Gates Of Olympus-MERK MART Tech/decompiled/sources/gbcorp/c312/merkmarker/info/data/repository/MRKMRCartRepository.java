package gbcorp.c312.merkmarker.info.data.repository;

import gbcorp.c312.merkmarker.info.data.dao.CartItemDao;
import gbcorp.c312.merkmarker.info.data.entity.MRKMRCartItemEntity;
import gbcorp.c312.merkmarker.info.data.model.Product;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MRKMRCartRepository.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\rJ\u0016\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/repository/MRKMRCartRepository;", "", "cartItemDao", "Lgbcorp/c312/merkmarker/info/data/dao/CartItemDao;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lgbcorp/c312/merkmarker/info/data/dao/CartItemDao;Lkotlinx/coroutines/CoroutineDispatcher;)V", "observeAll", "Lkotlinx/coroutines/flow/Flow;", "", "Lgbcorp/c312/merkmarker/info/data/entity/MRKMRCartItemEntity;", "getAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteById", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "incrementQuantity", "productId", "incrementProductQuantityOrAdd", "product", "Lgbcorp/c312/merkmarker/info/data/model/Product;", "(Lgbcorp/c312/merkmarker/info/data/model/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decrementProductQuantityOrRemove", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMRCartRepository {
    public static final int $stable = 8;
    private final CartItemDao cartItemDao;
    private final CoroutineDispatcher coroutineDispatcher;

    public MRKMRCartRepository(CartItemDao cartItemDao, CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(cartItemDao, "cartItemDao");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.cartItemDao = cartItemDao;
        this.coroutineDispatcher = coroutineDispatcher;
    }

    public final Flow<List<MRKMRCartItemEntity>> observeAll() {
        return this.cartItemDao.observeAll();
    }

    public final Object getAll(Continuation<? super List<MRKMRCartItemEntity>> continuation) {
        return this.cartItemDao.getAll(continuation);
    }

    public final Object deleteById(int i, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.coroutineDispatcher, new MRKMRCartRepository$deleteById$2(this, i, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object deleteAll(Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.coroutineDispatcher, new MRKMRCartRepository$deleteAll$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object incrementQuantity(int i, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.coroutineDispatcher, new MRKMRCartRepository$incrementQuantity$2(this, i, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object incrementProductQuantityOrAdd(Product product, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.coroutineDispatcher, new MRKMRCartRepository$incrementProductQuantityOrAdd$2(this, product, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object decrementProductQuantityOrRemove(Product product, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.coroutineDispatcher, new MRKMRCartRepository$decrementProductQuantityOrRemove$2(this, product, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
