package gbcorp.c312.merkmarker.info.data.database;

import androidx.room.RoomDatabase;
import gbcorp.c312.merkmarker.info.data.dao.CartItemDao;
import gbcorp.c312.merkmarker.info.data.dao.OrderDao;
import kotlin.Metadata;

/* compiled from: MRKMRDatabase.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/database/MRKMRDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "cartItemDao", "Lgbcorp/c312/merkmarker/info/data/dao/CartItemDao;", "orderDao", "Lgbcorp/c312/merkmarker/info/data/dao/OrderDao;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MRKMRDatabase extends RoomDatabase {
    public static final int $stable = 8;

    public abstract CartItemDao cartItemDao();

    public abstract OrderDao orderDao();
}
