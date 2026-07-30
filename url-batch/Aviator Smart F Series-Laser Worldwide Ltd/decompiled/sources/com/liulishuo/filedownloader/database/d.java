package com.liulishuo.filedownloader.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.SparseArray;
import com.liulishuo.filedownloader.database.a;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.util.c;
import com.liulishuo.filedownloader.util.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class d implements com.liulishuo.filedownloader.database.a {
    public static final String CONNECTION_TABLE_NAME = "filedownloaderConnection";
    public static final String TABLE_NAME = "filedownloader";
    private final SQLiteDatabase db = new e(com.liulishuo.filedownloader.util.c.getAppContext()).getWritableDatabase();

    public class a implements a.InterfaceC0290a {
        private final SparseArray<List<com.liulishuo.filedownloader.model.a>> connectionModelListMap;
        private b currentIterator;
        private final SparseArray<FileDownloadModel> downloaderModelMap;
        private final SparseArray<FileDownloadModel> needChangeIdList;

        a(d dVar) {
            this(null, null);
        }

        @Override // com.liulishuo.filedownloader.database.a.InterfaceC0290a
        public void changeFileDownloadModelId(int i8, FileDownloadModel fileDownloadModel) {
            this.needChangeIdList.put(i8, fileDownloadModel);
        }

        @Override // java.lang.Iterable
        public Iterator<FileDownloadModel> iterator() {
            b bVar = d.this.new b();
            this.currentIterator = bVar;
            return bVar;
        }

        @Override // com.liulishuo.filedownloader.database.a.InterfaceC0290a
        public void onFinishMaintain() {
            b bVar = this.currentIterator;
            if (bVar != null) {
                bVar.onFinishMaintain();
            }
            int size = this.needChangeIdList.size();
            if (size < 0) {
                return;
            }
            d.this.db.beginTransaction();
            for (int i8 = 0; i8 < size; i8++) {
                try {
                    int keyAt = this.needChangeIdList.keyAt(i8);
                    FileDownloadModel fileDownloadModel = this.needChangeIdList.get(keyAt);
                    d.this.db.delete(d.TABLE_NAME, "_id = ?", new String[]{String.valueOf(keyAt)});
                    d.this.db.insert(d.TABLE_NAME, null, fileDownloadModel.toContentValues());
                    if (fileDownloadModel.getConnectionCount() > 1) {
                        List<com.liulishuo.filedownloader.model.a> findConnectionModel = d.this.findConnectionModel(keyAt);
                        if (findConnectionModel.size() > 0) {
                            d.this.db.delete(d.CONNECTION_TABLE_NAME, "id = ?", new String[]{String.valueOf(keyAt)});
                            for (com.liulishuo.filedownloader.model.a aVar : findConnectionModel) {
                                aVar.setId(fileDownloadModel.getId());
                                d.this.db.insert(d.CONNECTION_TABLE_NAME, null, aVar.toContentValues());
                            }
                        }
                    }
                } catch (Throwable th) {
                    d.this.db.endTransaction();
                    throw th;
                }
            }
            SparseArray<FileDownloadModel> sparseArray = this.downloaderModelMap;
            if (sparseArray != null && this.connectionModelListMap != null) {
                int size2 = sparseArray.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    int id = this.downloaderModelMap.valueAt(i9).getId();
                    List<com.liulishuo.filedownloader.model.a> findConnectionModel2 = d.this.findConnectionModel(id);
                    if (findConnectionModel2 != null && findConnectionModel2.size() > 0) {
                        this.connectionModelListMap.put(id, findConnectionModel2);
                    }
                }
            }
            d.this.db.setTransactionSuccessful();
            d.this.db.endTransaction();
        }

        @Override // com.liulishuo.filedownloader.database.a.InterfaceC0290a
        public void onRefreshedValidData(FileDownloadModel fileDownloadModel) {
            SparseArray<FileDownloadModel> sparseArray = this.downloaderModelMap;
            if (sparseArray != null) {
                sparseArray.put(fileDownloadModel.getId(), fileDownloadModel);
            }
        }

        @Override // com.liulishuo.filedownloader.database.a.InterfaceC0290a
        public void onRemovedInvalidData(FileDownloadModel fileDownloadModel) {
        }

        a(SparseArray<FileDownloadModel> sparseArray, SparseArray<List<com.liulishuo.filedownloader.model.a>> sparseArray2) {
            this.needChangeIdList = new SparseArray<>();
            this.downloaderModelMap = sparseArray;
            this.connectionModelListMap = sparseArray2;
        }
    }

    class b implements Iterator {

        /* renamed from: c, reason: collision with root package name */
        private final Cursor f15173c;
        private int currentId;
        private final List<Integer> needRemoveId = new ArrayList();

        b() {
            this.f15173c = d.this.db.rawQuery("SELECT * FROM filedownloader", null);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15173c.moveToNext();
        }

        void onFinishMaintain() {
            this.f15173c.close();
            if (this.needRemoveId.isEmpty()) {
                return;
            }
            String join = TextUtils.join(", ", this.needRemoveId);
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "delete %s", join);
            }
            d.this.db.execSQL(f.formatString("DELETE FROM %s WHERE %s IN (%s);", d.TABLE_NAME, FileDownloadModel.ID, join));
            d.this.db.execSQL(f.formatString("DELETE FROM %s WHERE %s IN (%s);", d.CONNECTION_TABLE_NAME, "id", join));
        }

        @Override // java.util.Iterator
        public void remove() {
            this.needRemoveId.add(Integer.valueOf(this.currentId));
        }

        @Override // java.util.Iterator
        public FileDownloadModel next() {
            FileDownloadModel createFromCursor = d.createFromCursor(this.f15173c);
            this.currentId = createFromCursor.getId();
            return createFromCursor;
        }
    }

    public static class c implements c.InterfaceC0298c {
        @Override // com.liulishuo.filedownloader.util.c.InterfaceC0298c
        public com.liulishuo.filedownloader.database.a customMake() {
            return new d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FileDownloadModel createFromCursor(Cursor cursor) {
        FileDownloadModel fileDownloadModel = new FileDownloadModel();
        fileDownloadModel.setId(cursor.getInt(cursor.getColumnIndex(FileDownloadModel.ID)));
        fileDownloadModel.setUrl(cursor.getString(cursor.getColumnIndex("url")));
        fileDownloadModel.setPath(cursor.getString(cursor.getColumnIndex("path")), cursor.getShort(cursor.getColumnIndex(FileDownloadModel.PATH_AS_DIRECTORY)) == 1);
        fileDownloadModel.setStatus((byte) cursor.getShort(cursor.getColumnIndex("status")));
        fileDownloadModel.setSoFar(cursor.getLong(cursor.getColumnIndex(FileDownloadModel.SOFAR)));
        fileDownloadModel.setTotal(cursor.getLong(cursor.getColumnIndex(FileDownloadModel.TOTAL)));
        fileDownloadModel.setErrMsg(cursor.getString(cursor.getColumnIndex(FileDownloadModel.ERR_MSG)));
        fileDownloadModel.setETag(cursor.getString(cursor.getColumnIndex(FileDownloadModel.ETAG)));
        fileDownloadModel.setFilename(cursor.getString(cursor.getColumnIndex("filename")));
        fileDownloadModel.setConnectionCount(cursor.getInt(cursor.getColumnIndex(FileDownloadModel.CONNECTION_COUNT)));
        return fileDownloadModel;
    }

    public static c createMaker() {
        return new c();
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void clear() {
        this.db.delete(TABLE_NAME, null, null);
        this.db.delete(CONNECTION_TABLE_NAME, null, null);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public FileDownloadModel find(int i8) {
        Throwable th;
        Cursor cursor;
        try {
            cursor = this.db.rawQuery(f.formatString("SELECT * FROM %s WHERE %s = ?", TABLE_NAME, FileDownloadModel.ID), new String[]{Integer.toString(i8)});
            try {
                if (!cursor.moveToNext()) {
                    cursor.close();
                    return null;
                }
                FileDownloadModel createFromCursor = createFromCursor(cursor);
                cursor.close();
                return createFromCursor;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    @Override // com.liulishuo.filedownloader.database.a
    public List<com.liulishuo.filedownloader.model.a> findConnectionModel(int i8) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = this.db.rawQuery(f.formatString("SELECT * FROM %s WHERE %s = ?", CONNECTION_TABLE_NAME, "id"), new String[]{Integer.toString(i8)});
            while (cursor.moveToNext()) {
                com.liulishuo.filedownloader.model.a aVar = new com.liulishuo.filedownloader.model.a();
                aVar.setId(i8);
                aVar.setIndex(cursor.getInt(cursor.getColumnIndex(com.liulishuo.filedownloader.model.a.INDEX)));
                aVar.setStartOffset(cursor.getLong(cursor.getColumnIndex(com.liulishuo.filedownloader.model.a.START_OFFSET)));
                aVar.setCurrentOffset(cursor.getLong(cursor.getColumnIndex(com.liulishuo.filedownloader.model.a.CURRENT_OFFSET)));
                aVar.setEndOffset(cursor.getLong(cursor.getColumnIndex(com.liulishuo.filedownloader.model.a.END_OFFSET)));
                arrayList.add(aVar);
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void insert(FileDownloadModel fileDownloadModel) {
        this.db.insert(TABLE_NAME, null, fileDownloadModel.toContentValues());
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void insertConnectionModel(com.liulishuo.filedownloader.model.a aVar) {
        this.db.insert(CONNECTION_TABLE_NAME, null, aVar.toContentValues());
    }

    @Override // com.liulishuo.filedownloader.database.a
    public a.InterfaceC0290a maintainer() {
        return new a(this);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void onTaskStart(int i8) {
    }

    @Override // com.liulishuo.filedownloader.database.a
    public boolean remove(int i8) {
        return this.db.delete(TABLE_NAME, "_id = ?", new String[]{String.valueOf(i8)}) != 0;
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void removeConnections(int i8) {
        this.db.execSQL("DELETE FROM filedownloaderConnection WHERE id = " + i8);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void update(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            com.liulishuo.filedownloader.util.d.w(this, "update but model == null!", new Object[0]);
        } else if (find(fileDownloadModel.getId()) == null) {
            insert(fileDownloadModel);
        } else {
            this.db.update(TABLE_NAME, fileDownloadModel.toContentValues(), "_id = ? ", new String[]{String.valueOf(fileDownloadModel.getId())});
        }
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateCompleted(int i8, long j8) {
        remove(i8);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateConnected(int i8, long j8, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 2);
        contentValues.put(FileDownloadModel.TOTAL, Long.valueOf(j8));
        contentValues.put(FileDownloadModel.ETAG, str);
        contentValues.put("filename", str2);
        update(i8, contentValues);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateConnectionCount(int i8, int i9) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FileDownloadModel.CONNECTION_COUNT, Integer.valueOf(i9));
        this.db.update(TABLE_NAME, contentValues, "_id = ? ", new String[]{Integer.toString(i8)});
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateConnectionModel(int i8, int i9, long j8) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.liulishuo.filedownloader.model.a.CURRENT_OFFSET, Long.valueOf(j8));
        this.db.update(CONNECTION_TABLE_NAME, contentValues, "id = ? AND connectionIndex = ?", new String[]{Integer.toString(i8), Integer.toString(i9)});
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateError(int i8, Throwable th, long j8) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FileDownloadModel.ERR_MSG, th.toString());
        contentValues.put("status", (Byte) (byte) -1);
        contentValues.put(FileDownloadModel.SOFAR, Long.valueOf(j8));
        update(i8, contentValues);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateOldEtagOverdue(int i8, String str, long j8, long j9, int i9) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FileDownloadModel.SOFAR, Long.valueOf(j8));
        contentValues.put(FileDownloadModel.TOTAL, Long.valueOf(j9));
        contentValues.put(FileDownloadModel.ETAG, str);
        contentValues.put(FileDownloadModel.CONNECTION_COUNT, Integer.valueOf(i9));
        update(i8, contentValues);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updatePause(int i8, long j8) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) -2);
        contentValues.put(FileDownloadModel.SOFAR, Long.valueOf(j8));
        update(i8, contentValues);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updatePending(int i8) {
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateProgress(int i8, long j8) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 3);
        contentValues.put(FileDownloadModel.SOFAR, Long.valueOf(j8));
        update(i8, contentValues);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateRetry(int i8, Throwable th) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FileDownloadModel.ERR_MSG, th.toString());
        contentValues.put("status", (Byte) (byte) 5);
        update(i8, contentValues);
    }

    public a.InterfaceC0290a maintainer(SparseArray<FileDownloadModel> sparseArray, SparseArray<List<com.liulishuo.filedownloader.model.a>> sparseArray2) {
        return new a(sparseArray, sparseArray2);
    }

    private void update(int i8, ContentValues contentValues) {
        this.db.update(TABLE_NAME, contentValues, "_id = ? ", new String[]{String.valueOf(i8)});
    }
}
