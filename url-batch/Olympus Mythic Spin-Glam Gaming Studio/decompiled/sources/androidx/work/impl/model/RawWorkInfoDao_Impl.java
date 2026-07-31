package androidx.work.impl.model;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {
    private final RoomDatabase __db;

    public RawWorkInfoDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:3:0x0011, B:4:0x0039, B:6:0x003f, B:8:0x004b, B:9:0x0057, B:12:0x0063, B:17:0x006c, B:18:0x007f, B:31:0x00cf, B:33:0x00db, B:34:0x00e0, B:36:0x00ee, B:38:0x00f3, B:40:0x00ca, B:41:0x00bf, B:42:0x00a7, B:45:0x00b3, B:46:0x00af, B:47:0x0099, B:48:0x0089, B:51:0x0090), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:3:0x0011, B:4:0x0039, B:6:0x003f, B:8:0x004b, B:9:0x0057, B:12:0x0063, B:17:0x006c, B:18:0x007f, B:31:0x00cf, B:33:0x00db, B:34:0x00e0, B:36:0x00ee, B:38:0x00f3, B:40:0x00ca, B:41:0x00bf, B:42:0x00a7, B:45:0x00b3, B:46:0x00af, B:47:0x0099, B:48:0x0089, B:51:0x0090), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:3:0x0011, B:4:0x0039, B:6:0x003f, B:8:0x004b, B:9:0x0057, B:12:0x0063, B:17:0x006c, B:18:0x007f, B:31:0x00cf, B:33:0x00db, B:34:0x00e0, B:36:0x00ee, B:38:0x00f3, B:40:0x00ca, B:41:0x00bf, B:42:0x00a7, B:45:0x00b3, B:46:0x00af, B:47:0x0099, B:48:0x0089, B:51:0x0090), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:3:0x0011, B:4:0x0039, B:6:0x003f, B:8:0x004b, B:9:0x0057, B:12:0x0063, B:17:0x006c, B:18:0x007f, B:31:0x00cf, B:33:0x00db, B:34:0x00e0, B:36:0x00ee, B:38:0x00f3, B:40:0x00ca, B:41:0x00bf, B:42:0x00a7, B:45:0x00b3, B:46:0x00af, B:47:0x0099, B:48:0x0089, B:51:0x0090), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:3:0x0011, B:4:0x0039, B:6:0x003f, B:8:0x004b, B:9:0x0057, B:12:0x0063, B:17:0x006c, B:18:0x007f, B:31:0x00cf, B:33:0x00db, B:34:0x00e0, B:36:0x00ee, B:38:0x00f3, B:40:0x00ca, B:41:0x00bf, B:42:0x00a7, B:45:0x00b3, B:46:0x00af, B:47:0x0099, B:48:0x0089, B:51:0x0090), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:3:0x0011, B:4:0x0039, B:6:0x003f, B:8:0x004b, B:9:0x0057, B:12:0x0063, B:17:0x006c, B:18:0x007f, B:31:0x00cf, B:33:0x00db, B:34:0x00e0, B:36:0x00ee, B:38:0x00f3, B:40:0x00ca, B:41:0x00bf, B:42:0x00a7, B:45:0x00b3, B:46:0x00af, B:47:0x0099, B:48:0x0089, B:51:0x0090), top: B:2:0x0011 }] */
    @Override // androidx.work.impl.model.RawWorkInfoDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List getWorkInfoPojos(SupportSQLiteQuery supportSQLiteQuery) {
        String string;
        Data fromByteArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, supportSQLiteQuery, true, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "id");
            int columnIndex2 = CursorUtil.getColumnIndex(query, "state");
            int columnIndex3 = CursorUtil.getColumnIndex(query, "output");
            int columnIndex4 = CursorUtil.getColumnIndex(query, "run_attempt_count");
            int columnIndex5 = CursorUtil.getColumnIndex(query, "generation");
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = new ArrayMap();
            while (query.moveToNext()) {
                String string2 = query.getString(columnIndex);
                if (((ArrayList) arrayMap.get(string2)) == null) {
                    arrayMap.put(string2, new ArrayList());
                }
                String string3 = query.getString(columnIndex);
                if (((ArrayList) arrayMap2.get(string3)) == null) {
                    arrayMap2.put(string3, new ArrayList());
                }
            }
            query.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
            __fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap2);
            ArrayList arrayList3 = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (columnIndex != -1 && !query.isNull(columnIndex)) {
                    string = query.getString(columnIndex);
                    WorkInfo.State intToState = columnIndex2 != -1 ? null : WorkTypeConverters.intToState(query.getInt(columnIndex2));
                    if (columnIndex3 != -1) {
                        fromByteArray = null;
                    } else {
                        fromByteArray = Data.fromByteArray(query.isNull(columnIndex3) ? null : query.getBlob(columnIndex3));
                    }
                    int i = columnIndex4 != -1 ? 0 : query.getInt(columnIndex4);
                    int i2 = columnIndex5 != -1 ? query.getInt(columnIndex5) : 0;
                    arrayList = (ArrayList) arrayMap.get(query.getString(columnIndex));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    ArrayList arrayList4 = arrayList;
                    arrayList2 = (ArrayList) arrayMap2.get(query.getString(columnIndex));
                    if (arrayList2 != null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, i, i2, arrayList4, arrayList2));
                }
                string = null;
                if (columnIndex2 != -1) {
                }
                if (columnIndex3 != -1) {
                }
                if (columnIndex4 != -1) {
                }
                int i22 = columnIndex5 != -1 ? query.getInt(columnIndex5) : 0;
                arrayList = (ArrayList) arrayMap.get(query.getString(columnIndex));
                if (arrayList == null) {
                }
                ArrayList arrayList42 = arrayList;
                arrayList2 = (ArrayList) arrayMap2.get(query.getString(columnIndex));
                if (arrayList2 != null) {
                }
                arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, i, i22, arrayList42, arrayList2));
            }
            query.close();
            return arrayList3;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* renamed from: androidx.work.impl.model.RawWorkInfoDao_Impl$1, reason: invalid class name */
    class AnonymousClass1 implements Callable<List<WorkSpec.WorkInfoPojo>> {
        final /* synthetic */ RawWorkInfoDao_Impl this$0;
        final /* synthetic */ SupportSQLiteQuery val$_internalQuery;

        /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00de A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:3:0x0010, B:4:0x0038, B:6:0x003e, B:8:0x004a, B:9:0x0056, B:12:0x0062, B:17:0x006b, B:18:0x0082, B:31:0x00d2, B:33:0x00de, B:34:0x00e3, B:36:0x00f1, B:38:0x00f6, B:40:0x00cd, B:41:0x00c2, B:42:0x00aa, B:45:0x00b6, B:46:0x00b2, B:47:0x009c, B:48:0x008c, B:51:0x0093), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f1 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:3:0x0010, B:4:0x0038, B:6:0x003e, B:8:0x004a, B:9:0x0056, B:12:0x0062, B:17:0x006b, B:18:0x0082, B:31:0x00d2, B:33:0x00de, B:34:0x00e3, B:36:0x00f1, B:38:0x00f6, B:40:0x00cd, B:41:0x00c2, B:42:0x00aa, B:45:0x00b6, B:46:0x00b2, B:47:0x009c, B:48:0x008c, B:51:0x0093), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00f6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00cd A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:3:0x0010, B:4:0x0038, B:6:0x003e, B:8:0x004a, B:9:0x0056, B:12:0x0062, B:17:0x006b, B:18:0x0082, B:31:0x00d2, B:33:0x00de, B:34:0x00e3, B:36:0x00f1, B:38:0x00f6, B:40:0x00cd, B:41:0x00c2, B:42:0x00aa, B:45:0x00b6, B:46:0x00b2, B:47:0x009c, B:48:0x008c, B:51:0x0093), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c2 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:3:0x0010, B:4:0x0038, B:6:0x003e, B:8:0x004a, B:9:0x0056, B:12:0x0062, B:17:0x006b, B:18:0x0082, B:31:0x00d2, B:33:0x00de, B:34:0x00e3, B:36:0x00f1, B:38:0x00f6, B:40:0x00cd, B:41:0x00c2, B:42:0x00aa, B:45:0x00b6, B:46:0x00b2, B:47:0x009c, B:48:0x008c, B:51:0x0093), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00aa A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:3:0x0010, B:4:0x0038, B:6:0x003e, B:8:0x004a, B:9:0x0056, B:12:0x0062, B:17:0x006b, B:18:0x0082, B:31:0x00d2, B:33:0x00de, B:34:0x00e3, B:36:0x00f1, B:38:0x00f6, B:40:0x00cd, B:41:0x00c2, B:42:0x00aa, B:45:0x00b6, B:46:0x00b2, B:47:0x009c, B:48:0x008c, B:51:0x0093), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x009c A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:3:0x0010, B:4:0x0038, B:6:0x003e, B:8:0x004a, B:9:0x0056, B:12:0x0062, B:17:0x006b, B:18:0x0082, B:31:0x00d2, B:33:0x00de, B:34:0x00e3, B:36:0x00f1, B:38:0x00f6, B:40:0x00cd, B:41:0x00c2, B:42:0x00aa, B:45:0x00b6, B:46:0x00b2, B:47:0x009c, B:48:0x008c, B:51:0x0093), top: B:2:0x0010 }] */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public List<WorkSpec.WorkInfoPojo> call() {
            String string;
            Data fromByteArray;
            ArrayList arrayList;
            ArrayList arrayList2;
            Cursor query = DBUtil.query(this.this$0.__db, this.val$_internalQuery, true, null);
            try {
                int columnIndex = CursorUtil.getColumnIndex(query, "id");
                int columnIndex2 = CursorUtil.getColumnIndex(query, "state");
                int columnIndex3 = CursorUtil.getColumnIndex(query, "output");
                int columnIndex4 = CursorUtil.getColumnIndex(query, "run_attempt_count");
                int columnIndex5 = CursorUtil.getColumnIndex(query, "generation");
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = new ArrayMap();
                while (query.moveToNext()) {
                    String string2 = query.getString(columnIndex);
                    if (((ArrayList) arrayMap.get(string2)) == null) {
                        arrayMap.put(string2, new ArrayList());
                    }
                    String string3 = query.getString(columnIndex);
                    if (((ArrayList) arrayMap2.get(string3)) == null) {
                        arrayMap2.put(string3, new ArrayList());
                    }
                }
                query.moveToPosition(-1);
                this.this$0.__fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                this.this$0.__fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap2);
                ArrayList arrayList3 = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (columnIndex != -1 && !query.isNull(columnIndex)) {
                        string = query.getString(columnIndex);
                        WorkInfo.State intToState = columnIndex2 != -1 ? null : WorkTypeConverters.intToState(query.getInt(columnIndex2));
                        if (columnIndex3 != -1) {
                            fromByteArray = null;
                        } else {
                            fromByteArray = Data.fromByteArray(query.isNull(columnIndex3) ? null : query.getBlob(columnIndex3));
                        }
                        int i = columnIndex4 != -1 ? 0 : query.getInt(columnIndex4);
                        int i2 = columnIndex5 != -1 ? query.getInt(columnIndex5) : 0;
                        arrayList = (ArrayList) arrayMap.get(query.getString(columnIndex));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        ArrayList arrayList4 = arrayList;
                        arrayList2 = (ArrayList) arrayMap2.get(query.getString(columnIndex));
                        if (arrayList2 != null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, i, i2, arrayList4, arrayList2));
                    }
                    string = null;
                    if (columnIndex2 != -1) {
                    }
                    if (columnIndex3 != -1) {
                    }
                    if (columnIndex4 != -1) {
                    }
                    int i22 = columnIndex5 != -1 ? query.getInt(columnIndex5) : 0;
                    arrayList = (ArrayList) arrayMap.get(query.getString(columnIndex));
                    if (arrayList == null) {
                    }
                    ArrayList arrayList42 = arrayList;
                    arrayList2 = (ArrayList) arrayMap2.get(query.getString(columnIndex));
                    if (arrayList2 != null) {
                    }
                    arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, i, i22, arrayList42, arrayList2));
                }
                query.close();
                return arrayList3;
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap arrayMap) {
        Set<String> keySet = arrayMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (arrayMap.getSize() > 999) {
            ArrayMap arrayMap2 = new ArrayMap(999);
            int size = arrayMap.getSize();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                arrayMap2.put((String) arrayMap.keyAt(i), (ArrayList) arrayMap.valueAt(i));
                i++;
                i2++;
                if (i2 == 999) {
                    __fetchRelationshipWorkTagAsjavaLangString(arrayMap2);
                    arrayMap2 = new ArrayMap(999);
                    i2 = 0;
                }
            }
            if (i2 > 0) {
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap2);
                return;
            }
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size2);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size2);
        int i3 = 1;
        for (String str : keySet) {
            if (str == null) {
                acquire.bindNull(i3);
            } else {
                acquire.bindString(i3, str);
            }
            i3++;
        }
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                ArrayList arrayList = (ArrayList) arrayMap.get(query.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(query.isNull(0) ? null : query.getString(0));
                }
            }
        } finally {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(ArrayMap arrayMap) {
        Set<String> keySet = arrayMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (arrayMap.getSize() > 999) {
            ArrayMap arrayMap2 = new ArrayMap(999);
            int size = arrayMap.getSize();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                arrayMap2.put((String) arrayMap.keyAt(i), (ArrayList) arrayMap.valueAt(i));
                i++;
                i2++;
                if (i2 == 999) {
                    __fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap2);
                    arrayMap2 = new ArrayMap(999);
                    i2 = 0;
                }
            }
            if (i2 > 0) {
                __fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap2);
                return;
            }
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size2);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size2);
        int i3 = 1;
        for (String str : keySet) {
            if (str == null) {
                acquire.bindNull(i3);
            } else {
                acquire.bindString(i3, str);
            }
            i3++;
        }
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                ArrayList arrayList = (ArrayList) arrayMap.get(query.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(Data.fromByteArray(query.isNull(0) ? null : query.getBlob(0)));
                }
            }
        } finally {
            query.close();
        }
    }
}
