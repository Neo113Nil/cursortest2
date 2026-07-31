package gbcorp.c312.merkmarker.info.data.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.firebase.analytics.FirebaseAnalytics;
import gbcorp.c312.merkmarker.info.data.database.converter.Converters;
import gbcorp.c312.merkmarker.info.data.entity.MRKMROrderEntity;
import java.time.LocalDateTime;
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

/* compiled from: OrderDao_Impl.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\u0010H\u0016J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0096@¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/dao/OrderDao_Impl;", "Lgbcorp/c312/merkmarker/info/data/dao/OrderDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfMRKMROrderEntity", "Landroidx/room/EntityInsertAdapter;", "Lgbcorp/c312/merkmarker/info/data/entity/MRKMROrderEntity;", "__converters", "Lgbcorp/c312/merkmarker/info/data/database/converter/Converters;", "save", "", "orderEntity", "(Lgbcorp/c312/merkmarker/info/data/entity/MRKMROrderEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeAll", "Lkotlinx/coroutines/flow/Flow;", "", "getAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeByNumber", "orderNumber", "", "getByNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteByNumber", "", "Companion", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderDao_Impl implements OrderDao {
    private final Converters __converters;
    private final RoomDatabase __db;
    private final EntityInsertAdapter<MRKMROrderEntity> __insertAdapterOfMRKMROrderEntity;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public OrderDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__converters = new Converters();
        this.__db = __db;
        this.__insertAdapterOfMRKMROrderEntity = new EntityInsertAdapter<MRKMROrderEntity>() { // from class: gbcorp.c312.merkmarker.info.data.dao.OrderDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR ABORT INTO `orders` (`order_number`,`description`,`customer_first_name`,`customer_last_name`,`customer_email`,`price`,`timestamp`) VALUES (?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, MRKMROrderEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8890bindText(1, entity.getOrderNumber());
                statement.mo8890bindText(2, entity.getDescription());
                statement.mo8890bindText(3, entity.getCustomerFirstName());
                statement.mo8890bindText(4, entity.getCustomerLastName());
                statement.mo8890bindText(5, entity.getCustomerEmail());
                statement.mo8887bindDouble(6, entity.getPrice());
                String localDateTimeToString = OrderDao_Impl.this.__converters.localDateTimeToString(entity.getTimestamp());
                if (localDateTimeToString == null) {
                    statement.mo8889bindNull(7);
                } else {
                    statement.mo8890bindText(7, localDateTimeToString);
                }
            }
        };
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.OrderDao
    public Object save(final MRKMROrderEntity mRKMROrderEntity, Continuation<? super Long> continuation) {
        return DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.OrderDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long save$lambda$0;
                save$lambda$0 = OrderDao_Impl.save$lambda$0(OrderDao_Impl.this, mRKMROrderEntity, (SQLiteConnection) obj);
                return Long.valueOf(save$lambda$0);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long save$lambda$0(OrderDao_Impl orderDao_Impl, MRKMROrderEntity mRKMROrderEntity, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        return orderDao_Impl.__insertAdapterOfMRKMROrderEntity.insertAndReturnId(_connection, mRKMROrderEntity);
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.OrderDao
    public Flow<List<MRKMROrderEntity>> observeAll() {
        final String str = "SELECT * FROM orders";
        return FlowUtil.createFlow(this.__db, false, new String[]{"orders"}, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.OrderDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List observeAll$lambda$0;
                observeAll$lambda$0 = OrderDao_Impl.observeAll$lambda$0(str, this, (SQLiteConnection) obj);
                return observeAll$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List observeAll$lambda$0(String str, OrderDao_Impl orderDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "order_number");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "description");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "customer_first_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "customer_last_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "customer_email");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, FirebaseAnalytics.Param.PRICE);
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "timestamp");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text = prepare.getText(columnIndexOrThrow);
                String text2 = prepare.getText(columnIndexOrThrow2);
                String text3 = prepare.getText(columnIndexOrThrow3);
                String text4 = prepare.getText(columnIndexOrThrow4);
                String text5 = prepare.getText(columnIndexOrThrow5);
                double d = prepare.getDouble(columnIndexOrThrow6);
                int i = columnIndexOrThrow;
                LocalDateTime stringToLocalDateTime = orderDao_Impl.__converters.stringToLocalDateTime(prepare.isNull(columnIndexOrThrow7) ? null : prepare.getText(columnIndexOrThrow7));
                if (stringToLocalDateTime == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.".toString());
                }
                arrayList.add(new MRKMROrderEntity(text, text2, text3, text4, text5, d, stringToLocalDateTime));
                columnIndexOrThrow = i;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.OrderDao
    public Object getAll(Continuation<? super List<MRKMROrderEntity>> continuation) {
        final String str = "SELECT * FROM orders";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.OrderDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List all$lambda$0;
                all$lambda$0 = OrderDao_Impl.getAll$lambda$0(str, this, (SQLiteConnection) obj);
                return all$lambda$0;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAll$lambda$0(String str, OrderDao_Impl orderDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "order_number");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "description");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "customer_first_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "customer_last_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "customer_email");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, FirebaseAnalytics.Param.PRICE);
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "timestamp");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text = prepare.getText(columnIndexOrThrow);
                String text2 = prepare.getText(columnIndexOrThrow2);
                String text3 = prepare.getText(columnIndexOrThrow3);
                String text4 = prepare.getText(columnIndexOrThrow4);
                String text5 = prepare.getText(columnIndexOrThrow5);
                double d = prepare.getDouble(columnIndexOrThrow6);
                int i = columnIndexOrThrow;
                LocalDateTime stringToLocalDateTime = orderDao_Impl.__converters.stringToLocalDateTime(prepare.isNull(columnIndexOrThrow7) ? null : prepare.getText(columnIndexOrThrow7));
                if (stringToLocalDateTime == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.".toString());
                }
                arrayList.add(new MRKMROrderEntity(text, text2, text3, text4, text5, d, stringToLocalDateTime));
                columnIndexOrThrow = i;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.OrderDao
    public Flow<MRKMROrderEntity> observeByNumber(final String orderNumber) {
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        final String str = "SELECT * FROM orders WHERE order_number = ?";
        return FlowUtil.createFlow(this.__db, false, new String[]{"orders"}, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.OrderDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MRKMROrderEntity observeByNumber$lambda$0;
                observeByNumber$lambda$0 = OrderDao_Impl.observeByNumber$lambda$0(str, orderNumber, this, (SQLiteConnection) obj);
                return observeByNumber$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMROrderEntity observeByNumber$lambda$0(String str, String str2, OrderDao_Impl orderDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "order_number");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "description");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "customer_first_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "customer_last_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "customer_email");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, FirebaseAnalytics.Param.PRICE);
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "timestamp");
            MRKMROrderEntity mRKMROrderEntity = null;
            if (prepare.step()) {
                String text = prepare.getText(columnIndexOrThrow);
                String text2 = prepare.getText(columnIndexOrThrow2);
                String text3 = prepare.getText(columnIndexOrThrow3);
                String text4 = prepare.getText(columnIndexOrThrow4);
                String text5 = prepare.getText(columnIndexOrThrow5);
                double d = prepare.getDouble(columnIndexOrThrow6);
                LocalDateTime stringToLocalDateTime = orderDao_Impl.__converters.stringToLocalDateTime(prepare.isNull(columnIndexOrThrow7) ? null : prepare.getText(columnIndexOrThrow7));
                if (stringToLocalDateTime == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.".toString());
                }
                mRKMROrderEntity = new MRKMROrderEntity(text, text2, text3, text4, text5, d, stringToLocalDateTime);
            }
            return mRKMROrderEntity;
        } finally {
            prepare.close();
        }
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.OrderDao
    public Object getByNumber(final String str, Continuation<? super MRKMROrderEntity> continuation) {
        final String str2 = "SELECT * FROM orders WHERE order_number = ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.OrderDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MRKMROrderEntity byNumber$lambda$0;
                byNumber$lambda$0 = OrderDao_Impl.getByNumber$lambda$0(str2, str, this, (SQLiteConnection) obj);
                return byNumber$lambda$0;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MRKMROrderEntity getByNumber$lambda$0(String str, String str2, OrderDao_Impl orderDao_Impl, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "order_number");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "description");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "customer_first_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "customer_last_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "customer_email");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, FirebaseAnalytics.Param.PRICE);
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "timestamp");
            MRKMROrderEntity mRKMROrderEntity = null;
            if (prepare.step()) {
                String text = prepare.getText(columnIndexOrThrow);
                String text2 = prepare.getText(columnIndexOrThrow2);
                String text3 = prepare.getText(columnIndexOrThrow3);
                String text4 = prepare.getText(columnIndexOrThrow4);
                String text5 = prepare.getText(columnIndexOrThrow5);
                double d = prepare.getDouble(columnIndexOrThrow6);
                LocalDateTime stringToLocalDateTime = orderDao_Impl.__converters.stringToLocalDateTime(prepare.isNull(columnIndexOrThrow7) ? null : prepare.getText(columnIndexOrThrow7));
                if (stringToLocalDateTime == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.".toString());
                }
                mRKMROrderEntity = new MRKMROrderEntity(text, text2, text3, text4, text5, d, stringToLocalDateTime);
            }
            return mRKMROrderEntity;
        } finally {
            prepare.close();
        }
    }

    @Override // gbcorp.c312.merkmarker.info.data.dao.OrderDao
    public Object deleteByNumber(final String str, Continuation<? super Unit> continuation) {
        final String str2 = "DELETE FROM orders WHERE order_number = ?";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: gbcorp.c312.merkmarker.info.data.dao.OrderDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit deleteByNumber$lambda$0;
                deleteByNumber$lambda$0 = OrderDao_Impl.deleteByNumber$lambda$0(str2, str, (SQLiteConnection) obj);
                return deleteByNumber$lambda$0;
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteByNumber$lambda$0(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            prepare.step();
            prepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    /* compiled from: OrderDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/dao/OrderDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
