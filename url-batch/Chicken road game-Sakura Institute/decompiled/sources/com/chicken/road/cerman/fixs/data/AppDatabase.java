package com.chicken.road.cerman.fixs.data;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppDatabase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0011"}, d2 = {"Lcom/chicken/road/cerman/fixs/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "chickenDao", "Lcom/chicken/road/cerman/fixs/data/ChickenDao;", "feedDao", "Lcom/chicken/road/cerman/fixs/data/FeedDao;", "eggDao", "Lcom/chicken/road/cerman/fixs/data/EggDao;", "saleDao", "Lcom/chicken/road/cerman/fixs/data/SaleDao;", "weightDao", "Lcom/chicken/road/cerman/fixs/data/WeightDao;", "vaccinationDao", "Lcom/chicken/road/cerman/fixs/data/VaccinationDao;", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AppDatabase extends RoomDatabase {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile AppDatabase INSTANCE;

    public abstract ChickenDao chickenDao();

    public abstract EggDao eggDao();

    public abstract FeedDao feedDao();

    public abstract SaleDao saleDao();

    public abstract VaccinationDao vaccinationDao();

    public abstract WeightDao weightDao();

    /* compiled from: AppDatabase.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/chicken/road/cerman/fixs/data/AppDatabase$Companion;", "", "<init>", "()V", "INSTANCE", "Lcom/chicken/road/cerman/fixs/data/AppDatabase;", "get", "ctx", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AppDatabase get(Context ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            AppDatabase appDatabase = AppDatabase.INSTANCE;
            if (appDatabase == null) {
                synchronized (this) {
                    appDatabase = AppDatabase.INSTANCE;
                    if (appDatabase == null) {
                        Context applicationContext = ctx.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        RoomDatabase build = Room.databaseBuilder(applicationContext, AppDatabase.class, "broiler.db").fallbackToDestructiveMigration().build();
                        Companion companion = AppDatabase.INSTANCE;
                        AppDatabase.INSTANCE = (AppDatabase) build;
                        appDatabase = (AppDatabase) build;
                    }
                }
            }
            return appDatabase;
        }
    }
}
