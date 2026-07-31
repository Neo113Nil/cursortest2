package gbcorp.c312.merkmarker.info.data.database;

import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.google.firebase.analytics.FirebaseAnalytics;
import gbcorp.c312.merkmarker.info.data.dao.CartItemDao;
import gbcorp.c312.merkmarker.info.data.dao.CartItemDao_Impl;
import gbcorp.c312.merkmarker.info.data.dao.OrderDao;
import gbcorp.c312.merkmarker.info.data.dao.OrderDao_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: MRKMRDatabase_Impl.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00120\u0010H\u0014J\u0016\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00110\u0014H\u0016J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u001a\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0011\u0012\u0004\u0012\u00020\u00150\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/database/MRKMRDatabase_Impl;", "Lgbcorp/c312/merkmarker/info/data/database/MRKMRDatabase;", "<init>", "()V", "_cartItemDao", "Lkotlin/Lazy;", "Lgbcorp/c312/merkmarker/info/data/dao/CartItemDao;", "_orderDao", "Lgbcorp/c312/merkmarker/info/data/dao/OrderDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "cartItemDao", "orderDao", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMRDatabase_Impl extends MRKMRDatabase {
    public static final int $stable = 8;
    private final Lazy<CartItemDao> _cartItemDao = LazyKt.lazy(new Function0() { // from class: gbcorp.c312.merkmarker.info.data.database.MRKMRDatabase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CartItemDao_Impl _cartItemDao$lambda$0;
            _cartItemDao$lambda$0 = MRKMRDatabase_Impl._cartItemDao$lambda$0(MRKMRDatabase_Impl.this);
            return _cartItemDao$lambda$0;
        }
    });
    private final Lazy<OrderDao> _orderDao = LazyKt.lazy(new Function0() { // from class: gbcorp.c312.merkmarker.info.data.database.MRKMRDatabase_Impl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            OrderDao_Impl _orderDao$lambda$0;
            _orderDao$lambda$0 = MRKMRDatabase_Impl._orderDao$lambda$0(MRKMRDatabase_Impl.this);
            return _orderDao$lambda$0;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartItemDao_Impl _cartItemDao$lambda$0(MRKMRDatabase_Impl mRKMRDatabase_Impl) {
        return new CartItemDao_Impl(mRKMRDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDao_Impl _orderDao$lambda$0(MRKMRDatabase_Impl mRKMRDatabase_Impl) {
        return new OrderDao_Impl(mRKMRDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate() { // from class: gbcorp.c312.merkmarker.info.data.database.MRKMRDatabase_Impl$createOpenDelegate$_openDelegate$1
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            {
                super(1, "e4d8b9c40a3023ed3f1f354d4f3fbfbf", "66b335e5f04ae5091aac85d1c0ed154c");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `cart_items` (`id` INTEGER NOT NULL, `quantity` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `orders` (`order_number` TEXT NOT NULL, `description` TEXT NOT NULL, `customer_first_name` TEXT NOT NULL, `customer_last_name` TEXT NOT NULL, `customer_email` TEXT NOT NULL, `price` REAL NOT NULL, `timestamp` TEXT NOT NULL, PRIMARY KEY(`order_number`))");
                SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e4d8b9c40a3023ed3f1f354d4f3fbfbf')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `cart_items`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `orders`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                MRKMRDatabase_Impl.this.internalInitInvalidationTracker(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                DBUtil.dropFtsSyncTriggers(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap.put(FirebaseAnalytics.Param.QUANTITY, new TableInfo.Column(FirebaseAnalytics.Param.QUANTITY, "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("cart_items", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                TableInfo read = TableInfo.INSTANCE.read(connection, "cart_items");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenDelegate.ValidationResult(false, "cart_items(gbcorp.c312.merkmarker.info.data.entity.MRKMRCartItemEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("order_number", new TableInfo.Column("order_number", "TEXT", true, 1, null, 1));
                linkedHashMap2.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("customer_first_name", new TableInfo.Column("customer_first_name", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("customer_last_name", new TableInfo.Column("customer_last_name", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("customer_email", new TableInfo.Column("customer_email", "TEXT", true, 0, null, 1));
                linkedHashMap2.put(FirebaseAnalytics.Param.PRICE, new TableInfo.Column(FirebaseAnalytics.Param.PRICE, "REAL", true, 0, null, 1));
                linkedHashMap2.put("timestamp", new TableInfo.Column("timestamp", "TEXT", true, 0, null, 1));
                TableInfo tableInfo2 = new TableInfo("orders", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                TableInfo read2 = TableInfo.INSTANCE.read(connection, "orders");
                if (!tableInfo2.equals(read2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "orders(gbcorp.c312.merkmarker.info.data.entity.MRKMROrderEntity).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "cart_items", "orders");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "cart_items", "orders");
    }

    @Override // androidx.room.RoomDatabase
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(CartItemDao.class), CartItemDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(Reflection.getOrCreateKotlinClass(OrderDao.class), OrderDao_Impl.INSTANCE.getRequiredConverters());
        return linkedHashMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<KClass<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> createAutoMigrations(Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // gbcorp.c312.merkmarker.info.data.database.MRKMRDatabase
    public CartItemDao cartItemDao() {
        return this._cartItemDao.getValue();
    }

    @Override // gbcorp.c312.merkmarker.info.data.database.MRKMRDatabase
    public OrderDao orderDao() {
        return this._orderDao.getValue();
    }
}
