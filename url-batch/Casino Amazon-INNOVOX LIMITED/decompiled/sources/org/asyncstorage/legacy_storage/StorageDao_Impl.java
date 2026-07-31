package org.asyncstorage.legacy_storage;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
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

/* compiled from: StorageDao_Impl.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0096@¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0096@¢\u0006\u0002\u0010\rJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0096@¢\u0006\u0002\u0010\rJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0096@¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0096@¢\u0006\u0002\u0010\rJ\u000e\u0010\u0015\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lorg/asyncstorage/legacy_storage/StorageDao_Impl;", "Lorg/asyncstorage/legacy_storage/StorageDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfEntry", "Landroidx/room/EntityInsertAdapter;", "Lorg/asyncstorage/legacy_storage/Entry;", "setValues", "", "entries", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeValues", "getValues", "keys", "", "getKeys", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeValues", "clear", "Companion", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StorageDao_Impl implements StorageDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Entry> __insertAdapterOfEntry;

    public StorageDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfEntry = new EntityInsertAdapter<Entry>() { // from class: org.asyncstorage.legacy_storage.StorageDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `Storage` (`key`,`value`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, Entry entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo3268bindText(1, entity.getKey());
                String value = entity.getValue();
                if (value == null) {
                    statement.mo3267bindNull(2);
                } else {
                    statement.mo3268bindText(2, value);
                }
            }
        };
    }

    @Override // org.asyncstorage.legacy_storage.StorageDao
    public Object setValues(final List<Entry> list, Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: org.asyncstorage.legacy_storage.StorageDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit values$lambda$0;
                values$lambda$0 = StorageDao_Impl.setValues$lambda$0(StorageDao_Impl.this, list, (SQLiteConnection) obj);
                return values$lambda$0;
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setValues$lambda$0(StorageDao_Impl storageDao_Impl, List list, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        storageDao_Impl.__insertAdapterOfEntry.insert(_connection, list);
        return Unit.INSTANCE;
    }

    @Override // org.asyncstorage.legacy_storage.StorageDao
    public Object mergeValues(List<Entry> list, Continuation<? super Unit> continuation) {
        Object performInTransactionSuspending = DBUtil.performInTransactionSuspending(this.__db, new StorageDao_Impl$mergeValues$2(this, list, null), continuation);
        return performInTransactionSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performInTransactionSuspending : Unit.INSTANCE;
    }

    @Override // org.asyncstorage.legacy_storage.StorageDao
    public Object getValues(final List<String> list, Continuation<? super List<Entry>> continuation) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM Storage WHERE `key` IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return DBUtil.performSuspending(this.__db, true, true, new Function1() { // from class: org.asyncstorage.legacy_storage.StorageDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List values$lambda$1;
                values$lambda$1 = StorageDao_Impl.getValues$lambda$1(sb2, list, (SQLiteConnection) obj);
                return values$lambda$1;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getValues$lambda$1(String str, List list, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                prepare.mo3268bindText(i, (String) it.next());
                i++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "key");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "value");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(new Entry(prepare.getText(columnIndexOrThrow), prepare.isNull(columnIndexOrThrow2) ? null : prepare.getText(columnIndexOrThrow2)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // org.asyncstorage.legacy_storage.StorageDao
    public Object getKeys(Continuation<? super List<String>> continuation) {
        final String str = "SELECT `key` FROM Storage";
        return DBUtil.performSuspending(this.__db, true, true, new Function1() { // from class: org.asyncstorage.legacy_storage.StorageDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List keys$lambda$2;
                keys$lambda$2 = StorageDao_Impl.getKeys$lambda$2(str, (SQLiteConnection) obj);
                return keys$lambda$2;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getKeys$lambda$2(String str, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(prepare.getText(0));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // org.asyncstorage.legacy_storage.StorageDao
    public Object removeValues(final List<String> list, Continuation<? super Unit> continuation) {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM Storage WHERE `key` in (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: org.asyncstorage.legacy_storage.StorageDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit removeValues$lambda$3;
                removeValues$lambda$3 = StorageDao_Impl.removeValues$lambda$3(sb2, list, (SQLiteConnection) obj);
                return removeValues$lambda$3;
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeValues$lambda$3(String str, List list, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                prepare.mo3268bindText(i, (String) it.next());
                i++;
            }
            prepare.step();
            prepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // org.asyncstorage.legacy_storage.StorageDao
    public Object clear(Continuation<? super Unit> continuation) {
        final String str = "DELETE FROM Storage";
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: org.asyncstorage.legacy_storage.StorageDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit clear$lambda$4;
                clear$lambda$4 = StorageDao_Impl.clear$lambda$4(str, (SQLiteConnection) obj);
                return clear$lambda$4;
            }
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clear$lambda$4(String str, SQLiteConnection _connection) {
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

    /* compiled from: StorageDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lorg/asyncstorage/legacy_storage/StorageDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
