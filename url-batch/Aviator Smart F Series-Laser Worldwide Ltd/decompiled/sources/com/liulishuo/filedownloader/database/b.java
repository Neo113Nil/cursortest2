package com.liulishuo.filedownloader.database;

import android.util.SparseArray;
import com.liulishuo.filedownloader.database.a;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.util.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class b implements com.liulishuo.filedownloader.database.a {
    final SparseArray<FileDownloadModel> downloaderModelMap = new SparseArray<>();
    final SparseArray<List<com.liulishuo.filedownloader.model.a>> connectionModelListMap = new SparseArray<>();

    class a implements a.InterfaceC0290a {
        a() {
        }

        @Override // com.liulishuo.filedownloader.database.a.InterfaceC0290a
        public void changeFileDownloadModelId(int i8, FileDownloadModel fileDownloadModel) {
        }

        @Override // java.lang.Iterable
        public Iterator<FileDownloadModel> iterator() {
            return b.this.new C0291b();
        }

        @Override // com.liulishuo.filedownloader.database.a.InterfaceC0290a
        public void onFinishMaintain() {
        }

        @Override // com.liulishuo.filedownloader.database.a.InterfaceC0290a
        public void onRefreshedValidData(FileDownloadModel fileDownloadModel) {
        }

        @Override // com.liulishuo.filedownloader.database.a.InterfaceC0290a
        public void onRemovedInvalidData(FileDownloadModel fileDownloadModel) {
        }
    }

    /* renamed from: com.liulishuo.filedownloader.database.b$b, reason: collision with other inner class name */
    class C0291b implements Iterator {
        C0291b() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public FileDownloadModel next() {
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    public static class c implements c.InterfaceC0298c {
        @Override // com.liulishuo.filedownloader.util.c.InterfaceC0298c
        public com.liulishuo.filedownloader.database.a customMake() {
            return new b();
        }
    }

    public static c createMaker() {
        return new c();
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void clear() {
        synchronized (this.downloaderModelMap) {
            this.downloaderModelMap.clear();
        }
    }

    @Override // com.liulishuo.filedownloader.database.a
    public FileDownloadModel find(int i8) {
        FileDownloadModel fileDownloadModel;
        synchronized (this.downloaderModelMap) {
            fileDownloadModel = this.downloaderModelMap.get(i8);
        }
        return fileDownloadModel;
    }

    @Override // com.liulishuo.filedownloader.database.a
    public List<com.liulishuo.filedownloader.model.a> findConnectionModel(int i8) {
        List<com.liulishuo.filedownloader.model.a> list;
        ArrayList arrayList = new ArrayList();
        synchronized (this.connectionModelListMap) {
            list = this.connectionModelListMap.get(i8);
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void insert(FileDownloadModel fileDownloadModel) {
        synchronized (this.downloaderModelMap) {
            this.downloaderModelMap.put(fileDownloadModel.getId(), fileDownloadModel);
        }
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void insertConnectionModel(com.liulishuo.filedownloader.model.a aVar) {
        int id = aVar.getId();
        synchronized (this.connectionModelListMap) {
            try {
                List<com.liulishuo.filedownloader.model.a> list = this.connectionModelListMap.get(id);
                if (list == null) {
                    list = new ArrayList<>();
                    this.connectionModelListMap.put(id, list);
                }
                list.add(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.liulishuo.filedownloader.database.a
    public a.InterfaceC0290a maintainer() {
        return new a();
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void onTaskStart(int i8) {
    }

    @Override // com.liulishuo.filedownloader.database.a
    public boolean remove(int i8) {
        synchronized (this.downloaderModelMap) {
            this.downloaderModelMap.remove(i8);
        }
        return true;
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void removeConnections(int i8) {
        synchronized (this.connectionModelListMap) {
            this.connectionModelListMap.remove(i8);
        }
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void update(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            com.liulishuo.filedownloader.util.d.w(this, "update but model == null!", new Object[0]);
            return;
        }
        if (find(fileDownloadModel.getId()) == null) {
            insert(fileDownloadModel);
            return;
        }
        synchronized (this.downloaderModelMap) {
            this.downloaderModelMap.remove(fileDownloadModel.getId());
            this.downloaderModelMap.put(fileDownloadModel.getId(), fileDownloadModel);
        }
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateCompleted(int i8, long j8) {
        remove(i8);
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateConnected(int i8, long j8, String str, String str2) {
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateConnectionCount(int i8, int i9) {
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateConnectionModel(int i8, int i9, long j8) {
        synchronized (this.connectionModelListMap) {
            try {
                List<com.liulishuo.filedownloader.model.a> list = this.connectionModelListMap.get(i8);
                if (list == null) {
                    return;
                }
                for (com.liulishuo.filedownloader.model.a aVar : list) {
                    if (aVar.getIndex() == i9) {
                        aVar.setCurrentOffset(j8);
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateError(int i8, Throwable th, long j8) {
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateOldEtagOverdue(int i8, String str, long j8, long j9, int i9) {
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updatePause(int i8, long j8) {
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updatePending(int i8) {
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateProgress(int i8, long j8) {
    }

    @Override // com.liulishuo.filedownloader.database.a
    public void updateRetry(int i8, Throwable th) {
    }
}
