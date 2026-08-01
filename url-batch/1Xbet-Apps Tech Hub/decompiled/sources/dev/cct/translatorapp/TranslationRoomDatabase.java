package dev.cct.translatorapp;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import dev.cct.translatorapp.dao.TranslationDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TranslationRoomDatabase.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Ldev/cct/translatorapp/TranslationRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "translationDao", "Ldev/cct/translatorapp/dao/TranslationDao;", "Companion", "TranslationDatabaseCallback", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TranslationRoomDatabase extends RoomDatabase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile TranslationRoomDatabase INSTANCE;

    public abstract TranslationDao translationDao();

    /* compiled from: TranslationRoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Ldev/cct/translatorapp/TranslationRoomDatabase$TranslationDatabaseCallback;", "Landroidx/room/RoomDatabase$Callback;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class TranslationDatabaseCallback extends RoomDatabase.Callback {
        private final CoroutineScope scope;

        public TranslationDatabaseCallback(CoroutineScope scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.scope = scope;
        }

        @Override // androidx.room.RoomDatabase.Callback
        public void onCreate(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            super.onCreate(db);
            TranslationRoomDatabase translationRoomDatabase = TranslationRoomDatabase.INSTANCE;
            if (translationRoomDatabase != null) {
                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new TranslationRoomDatabase$TranslationDatabaseCallback$onCreate$1$1(translationRoomDatabase, null), 3, null);
            }
        }
    }

    /* compiled from: TranslationRoomDatabase.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Ldev/cct/translatorapp/TranslationRoomDatabase$Companion;", "", "()V", "INSTANCE", "Ldev/cct/translatorapp/TranslationRoomDatabase;", "getDatabase", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TranslationRoomDatabase getDatabase(Context context, CoroutineScope scope) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(scope, "scope");
            TranslationRoomDatabase translationRoomDatabase = TranslationRoomDatabase.INSTANCE;
            if (translationRoomDatabase == null) {
                synchronized (this) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                    translationRoomDatabase = (TranslationRoomDatabase) Room.databaseBuilder(applicationContext, TranslationRoomDatabase.class, "translation_database").addCallback(new TranslationDatabaseCallback(scope)).fallbackToDestructiveMigration().build();
                    Companion companion = TranslationRoomDatabase.INSTANCE;
                    TranslationRoomDatabase.INSTANCE = translationRoomDatabase;
                }
            }
            return translationRoomDatabase;
        }
    }
}
