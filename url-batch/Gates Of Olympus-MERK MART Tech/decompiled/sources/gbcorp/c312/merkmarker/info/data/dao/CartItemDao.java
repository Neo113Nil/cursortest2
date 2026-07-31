package gbcorp.c312.merkmarker.info.data.dao;

import gbcorp.c312.merkmarker.info.data.entity.MRKMRCartItemEntity;
import gbcorp.c312.merkmarker.info.data.model.Product;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MRKMRCartItemDao.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\fJ\u000e\u0010\u0012\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\nJ\u0016\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH§@¢\u0006\u0002\u0010\fJ\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0097@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH§@¢\u0006\u0002\u0010\fJ\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\fJ\u0016\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0097@¢\u0006\u0002\u0010\u0018¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/dao/CartItemDao;", "", "observeAll", "Lkotlinx/coroutines/flow/Flow;", "", "Lgbcorp/c312/merkmarker/info/data/entity/MRKMRCartItemEntity;", "observeById", "id", "", "getAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getById", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "cartItemEntity", "(Lgbcorp/c312/merkmarker/info/data/entity/MRKMRCartItemEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteById", "deleteAll", "incrementQuantity", "productId", "incrementProductQuantityOrAdd", "product", "Lgbcorp/c312/merkmarker/info/data/model/Product;", "(Lgbcorp/c312/merkmarker/info/data/model/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decrementQuantity", "deleteIfQuantityOne", "decrementProductQuantityOrRemove", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CartItemDao {
    default Object decrementProductQuantityOrRemove(Product product, Continuation<? super Unit> continuation) {
        return decrementProductQuantityOrRemove$suspendImpl(this, product, continuation);
    }

    Object decrementQuantity(int i, Continuation<? super Integer> continuation);

    Object deleteAll(Continuation<? super Unit> continuation);

    Object deleteById(int i, Continuation<? super Unit> continuation);

    Object deleteIfQuantityOne(int i, Continuation<? super Unit> continuation);

    Object getAll(Continuation<? super List<MRKMRCartItemEntity>> continuation);

    Object getById(int i, Continuation<? super MRKMRCartItemEntity> continuation);

    default Object incrementProductQuantityOrAdd(Product product, Continuation<? super Unit> continuation) {
        return incrementProductQuantityOrAdd$suspendImpl(this, product, continuation);
    }

    Object incrementQuantity(int i, Continuation<? super Integer> continuation);

    Flow<List<MRKMRCartItemEntity>> observeAll();

    Flow<MRKMRCartItemEntity> observeById(int id);

    Object save(MRKMRCartItemEntity mRKMRCartItemEntity, Continuation<? super Unit> continuation);

    /* compiled from: MRKMRCartItemDao.kt */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object incrementProductQuantityOrAdd(CartItemDao cartItemDao, Product product, Continuation<? super Unit> continuation) {
            return CartItemDao.super.incrementProductQuantityOrAdd(product, continuation);
        }

        @Deprecated
        public static Object decrementProductQuantityOrRemove(CartItemDao cartItemDao, Product product, Continuation<? super Unit> continuation) {
            return CartItemDao.super.decrementProductQuantityOrRemove(product, continuation);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r6.save(r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object incrementProductQuantityOrAdd$suspendImpl(CartItemDao cartItemDao, Product product, Continuation<? super Unit> continuation) {
        CartItemDao$incrementProductQuantityOrAdd$1 cartItemDao$incrementProductQuantityOrAdd$1;
        int i;
        int intValue;
        if (continuation instanceof CartItemDao$incrementProductQuantityOrAdd$1) {
            cartItemDao$incrementProductQuantityOrAdd$1 = (CartItemDao$incrementProductQuantityOrAdd$1) continuation;
            if ((cartItemDao$incrementProductQuantityOrAdd$1.label & Integer.MIN_VALUE) != 0) {
                cartItemDao$incrementProductQuantityOrAdd$1.label -= Integer.MIN_VALUE;
                Object obj = cartItemDao$incrementProductQuantityOrAdd$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cartItemDao$incrementProductQuantityOrAdd$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int id = product.getId();
                    cartItemDao$incrementProductQuantityOrAdd$1.L$0 = cartItemDao;
                    cartItemDao$incrementProductQuantityOrAdd$1.L$1 = product;
                    cartItemDao$incrementProductQuantityOrAdd$1.label = 1;
                    obj = cartItemDao.incrementQuantity(id, cartItemDao$incrementProductQuantityOrAdd$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = cartItemDao$incrementProductQuantityOrAdd$1.I$0;
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    product = (Product) cartItemDao$incrementProductQuantityOrAdd$1.L$1;
                    cartItemDao = (CartItemDao) cartItemDao$incrementProductQuantityOrAdd$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                intValue = ((Number) obj).intValue();
                if (intValue == 0) {
                    return Unit.INSTANCE;
                }
                MRKMRCartItemEntity mRKMRCartItemEntity = new MRKMRCartItemEntity(product.getId(), 1);
                cartItemDao$incrementProductQuantityOrAdd$1.L$0 = SpillingKt.nullOutSpilledVariable(cartItemDao);
                cartItemDao$incrementProductQuantityOrAdd$1.L$1 = SpillingKt.nullOutSpilledVariable(product);
                cartItemDao$incrementProductQuantityOrAdd$1.I$0 = intValue;
                cartItemDao$incrementProductQuantityOrAdd$1.label = 2;
            }
        }
        cartItemDao$incrementProductQuantityOrAdd$1 = new CartItemDao$incrementProductQuantityOrAdd$1(cartItemDao, continuation);
        Object obj2 = cartItemDao$incrementProductQuantityOrAdd$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cartItemDao$incrementProductQuantityOrAdd$1.label;
        if (i != 0) {
        }
        intValue = ((Number) obj2).intValue();
        if (intValue == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (r5.deleteIfQuantityOne(r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object decrementProductQuantityOrRemove$suspendImpl(CartItemDao cartItemDao, Product product, Continuation<? super Unit> continuation) {
        CartItemDao$decrementProductQuantityOrRemove$1 cartItemDao$decrementProductQuantityOrRemove$1;
        int i;
        int intValue;
        if (continuation instanceof CartItemDao$decrementProductQuantityOrRemove$1) {
            cartItemDao$decrementProductQuantityOrRemove$1 = (CartItemDao$decrementProductQuantityOrRemove$1) continuation;
            if ((cartItemDao$decrementProductQuantityOrRemove$1.label & Integer.MIN_VALUE) != 0) {
                cartItemDao$decrementProductQuantityOrRemove$1.label -= Integer.MIN_VALUE;
                Object obj = cartItemDao$decrementProductQuantityOrRemove$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cartItemDao$decrementProductQuantityOrRemove$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int id = product.getId();
                    cartItemDao$decrementProductQuantityOrRemove$1.L$0 = cartItemDao;
                    cartItemDao$decrementProductQuantityOrRemove$1.L$1 = product;
                    cartItemDao$decrementProductQuantityOrRemove$1.label = 1;
                    obj = cartItemDao.decrementQuantity(id, cartItemDao$decrementProductQuantityOrRemove$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = cartItemDao$decrementProductQuantityOrRemove$1.I$0;
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    product = (Product) cartItemDao$decrementProductQuantityOrRemove$1.L$1;
                    cartItemDao = (CartItemDao) cartItemDao$decrementProductQuantityOrRemove$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                intValue = ((Number) obj).intValue();
                if (intValue == 0) {
                    return Unit.INSTANCE;
                }
                int id2 = product.getId();
                cartItemDao$decrementProductQuantityOrRemove$1.L$0 = SpillingKt.nullOutSpilledVariable(cartItemDao);
                cartItemDao$decrementProductQuantityOrRemove$1.L$1 = SpillingKt.nullOutSpilledVariable(product);
                cartItemDao$decrementProductQuantityOrRemove$1.I$0 = intValue;
                cartItemDao$decrementProductQuantityOrRemove$1.label = 2;
            }
        }
        cartItemDao$decrementProductQuantityOrRemove$1 = new CartItemDao$decrementProductQuantityOrRemove$1(cartItemDao, continuation);
        Object obj2 = cartItemDao$decrementProductQuantityOrRemove$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cartItemDao$decrementProductQuantityOrRemove$1.label;
        if (i != 0) {
        }
        intValue = ((Number) obj2).intValue();
        if (intValue == 0) {
        }
    }
}
