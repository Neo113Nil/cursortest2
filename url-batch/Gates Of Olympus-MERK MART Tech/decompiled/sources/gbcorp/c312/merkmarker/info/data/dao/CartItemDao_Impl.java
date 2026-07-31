package gbcorp.c312.merkmarker.info.data.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.firebase.analytics.FirebaseAnalytics;
import gbcorp.c312.merkmarker.info.data.entity.MRKMRCartItemEntity;
import gbcorp.c312.merkmarker.info.data.model.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CartItemDao_Impl.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00140\u0013H\u0016J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0096@¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001d\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u001bJ\u0016\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u001bJ\u0016\u0010!\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/dao/CartItemDao_Impl;", "Lgbcorp/c312/merkmarker/info/data/dao/CartItemDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfMRKMRCartItemEntity", "Landroidx/room/EntityInsertAdapter;", "Lgbcorp/c312/merkmarker/info/data/entity/MRKMRCartItemEntity;", "save", "", "cartItemEntity", "(Lgbcorp/c312/merkmarker/info/data/entity/MRKMRCartItemEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementProductQuantityOrAdd", "product", "Lgbcorp/c312/merkmarker/info/data/model/Product;", "(Lgbcorp/c312/merkmarker/info/data/model/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decrementProductQuantityOrRemove", "observeAll", "Lkotlinx/coroutines/flow/Flow;", "", "observeById", "id", "", "getAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getById", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteById", "deleteAll", "incrementQuantity", "productId", "decrementQuantity", "deleteIfQuantityOne", "Companion", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CartItemDao_Impl implements CartItemDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<MRKMRCartItemEntity> __insertAdapterOfMRKMRCartItemEntity;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CartItemDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfMRKMRCartItemEntity = new EntityInsertAdapter<MRKMRCartItemEntity>() { // from class: gbcorp.c312.merkmarker.info.data.dao.CartItemDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `cart_items` (`id`,`quantity`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, MRKMRCartItemEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8888bindLong(1, entity.getId());
                statement.mo8888bindLong(2, entity.getQuantity());
            }
        };
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.CartItemDao
    public Object save(final MRKMRCartItemEntity mRKMRCartItemEntity, Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.CartItemDao_Impl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit save$lambda$0;
                save$lambda$0 = CartItemDao_Impl.save$lambda$0(CartItemDao_Impl.this, mRKMRCartItemEntity, (SQLiteConnection) obj);
                return save$lambda$0;
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit save$lambda$0(CartItemDao_Impl cartItemDao_Impl, MRKMRCartItemEntity mRKMRCartItemEntity, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        cartItemDao_Impl.__insertAdapterOfMRKMRCartItemEntity.insert(_connection, (SQLiteConnection) mRKMRCartItemEntity);
        return Unit.INSTANCE;
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.CartItemDao
    public Object incrementProductQuantityOrAdd(Product product, Continuation<? super Unit> continuation) {
        Object performInTransactionSuspending = DBUtil.performInTransactionSuspending(this.__db, new CartItemDao_Impl$incrementProductQuantityOrAdd$2(this, product, null), continuation);
        return performInTransactionSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performInTransactionSuspending : Unit.INSTANCE;
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.CartItemDao
    public Object decrementProductQuantityOrRemove(Product product, Continuation<? super Unit> continuation) {
        Object performInTransactionSuspending = DBUtil.performInTransactionSuspending(this.__db, new CartItemDao_Impl$decrementProductQuantityOrRemove$2(this, product, null), continuation);
        return performInTransactionSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performInTransactionSuspending : Unit.INSTANCE;
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.CartItemDao
    public Flow<List<MRKMRCartItemEntity>> observeAll() {
        final String str = "SELECT * FROM cart_items";
        return FlowUtil.createFlow(this.__db, false, new String[]{"cart_items"}, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.CartItemDao_Impl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List observeAll$lambda$0;
                observeAll$lambda$0 = CartItemDao_Impl.observeAll$lambda$0(str, (SQLiteConnection) obj);
                return observeAll$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List observeAll$lambda$0(String str, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, FirebaseAnalytics.Param.QUANTITY);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(new MRKMRCartItemEntity((int) prepare.getLong(columnIndexOrThrow), (int) prepare.getLong(columnIndexOrThrow2)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.CartItemDao
    public Flow<MRKMRCartItemEntity> observeById(final int id) {
        final String str = "SELECT * FROM cart_items WHERE id = ?";
        return FlowUtil.createFlow(this.__db, false, new String[]{"cart_items"}, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.CartItemDao_Impl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MRKMRCartItemEntity observeById$lambda$0;
                observeById$lambda$0 = CartItemDao_Impl.observeById$lambda$0(str, id, (SQLiteConnection) obj);
                return observeById$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMRCartItemEntity observeById$lambda$0(String str, int i, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8888bindLong(1, i);
            return prepare.step() ? new MRKMRCartItemEntity((int) prepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id")), (int) prepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(prepare, FirebaseAnalytics.Param.QUANTITY))) : null;
        } finally {
            prepare.close();
        }
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.CartItemDao
    public Object getAll(Continuation<? super List<MRKMRCartItemEntity>> continuation) {
        final String str = "SELECT * FROM cart_items";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.CartItemDao_Impl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List all$lambda$0;
                all$lambda$0 = CartItemDao_Impl.getAll$lambda$0(str, (SQLiteConnection) obj);
                return all$lambda$0;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAll$lambda$0(String str, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, FirebaseAnalytics.Param.QUANTITY);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(new MRKMRCartItemEntity((int) prepare.getLong(columnIndexOrThrow), (int) prepare.getLong(columnIndexOrThrow2)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.CartItemDao
    public Object getById(final int i, Continuation<? super MRKMRCartItemEntity> continuation) {
        final String str = "SELECT * FROM cart_items WHERE id = ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.CartItemDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MRKMRCartItemEntity byId$lambda$0;
                byId$lambda$0 = CartItemDao_Impl.getById$lambda$0(str, i, (SQLiteConnection) obj);
                return byId$lambda$0;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMRCartItemEntity getById$lambda$0(String str, int i, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8888bindLong(1, i);
            return prepare.step() ? new MRKMRCartItemEntity((int) prepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id")), (int) prepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(prepare, FirebaseAnalytics.Param.QUANTITY))) : null;
        } finally {
            prepare.close();
        }
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.CartItemDao
    public Object deleteById(final int i, Continuation<? super Unit> continuation) {
        final String str = "DELETE FROM cart_items WHERE id = ?";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.CartItemDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit deleteById$lambda$0;
                deleteById$lambda$0 = CartItemDao_Impl.deleteById$lambda$0(str, i, (SQLiteConnection) obj);
                return deleteById$lambda$0;
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteById$lambda$0(String str, int i, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8888bindLong(1, i);
            prepare.step();
            prepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.CartItemDao
    public Object deleteAll(Continuation<? super Unit> continuation) {
        final String str = "DELETE FROM cart_items";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.CartItemDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit deleteAll$lambda$0;
                deleteAll$lambda$0 = CartItemDao_Impl.deleteAll$lambda$0(str, (SQLiteConnection) obj);
                return deleteAll$lambda$0;
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteAll$lambda$0(String str, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.step();
            prepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.CartItemDao
    public Object incrementQuantity(final int i, Continuation<? super Integer> continuation) {
        final String str = "UPDATE cart_items SET quantity = quantity + 1 WHERE id = ?";
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.CartItemDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int incrementQuantity$lambda$0;
                incrementQuantity$lambda$0 = CartItemDao_Impl.incrementQuantity$lambda$0(str, i, (SQLiteConnection) obj);
                return Integer.valueOf(incrementQuantity$lambda$0);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int incrementQuantity$lambda$0(String str, int i, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8888bindLong(1, i);
            prepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(_connection);
        } finally {
            prepare.close();
        }
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.CartItemDao
    public Object decrementQuantity(final int i, Continuation<? super Integer> continuation) {
        final String str = "UPDATE cart_items SET quantity = quantity - 1 WHERE id = ? AND quantity > 1";
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.CartItemDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int decrementQuantity$lambda$0;
                decrementQuantity$lambda$0 = CartItemDao_Impl.decrementQuantity$lambda$0(str, i, (SQLiteConnection) obj);
                return Integer.valueOf(decrementQuantity$lambda$0);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int decrementQuantity$lambda$0(String str, int i, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8888bindLong(1, i);
            prepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(_connection);
        } finally {
            prepare.close();
        }
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.CartItemDao
    public Object deleteIfQuantityOne(final int i, Continuation<? super Unit> continuation) {
        final String str = "DELETE FROM cart_items WHERE id = ? AND quantity = 1";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.CartItemDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit deleteIfQuantityOne$lambda$0;
                deleteIfQuantityOne$lambda$0 = CartItemDao_Impl.deleteIfQuantityOne$lambda$0(str, i, (SQLiteConnection) obj);
                return deleteIfQuantityOne$lambda$0;
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteIfQuantityOne$lambda$0(String str, int i, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8888bindLong(1, i);
            prepare.step();
            prepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    /* compiled from: CartItemDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/dao/CartItemDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.emptyList();
        }
    }
}
