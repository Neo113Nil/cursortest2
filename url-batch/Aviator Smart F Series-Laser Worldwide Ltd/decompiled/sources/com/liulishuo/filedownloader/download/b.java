package com.liulishuo.filedownloader.download;

import com.liulishuo.filedownloader.database.a;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.services.c;
import com.liulishuo.filedownloader.services.k;
import com.liulishuo.filedownloader.util.c;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class b {
    private c.a connectionCountAdapter;
    private c.b connectionCreator;
    private com.liulishuo.filedownloader.database.a database;
    private k foregroundServiceConfig;
    private c.d idGenerator;
    private com.liulishuo.filedownloader.services.c initialParams;
    private c.e outputStreamCreator;

    private static final class a {
        private static final b INSTANCE = new b();

        private a() {
        }
    }

    private c.a getConnectionCountAdapter() {
        c.a aVar = this.connectionCountAdapter;
        if (aVar != null) {
            return aVar;
        }
        synchronized (this) {
            try {
                if (this.connectionCountAdapter == null) {
                    this.connectionCountAdapter = getDownloadMgrInitialParams().createConnectionCountAdapter();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.connectionCountAdapter;
    }

    private c.b getConnectionCreator() {
        c.b bVar = this.connectionCreator;
        if (bVar != null) {
            return bVar;
        }
        synchronized (this) {
            try {
                if (this.connectionCreator == null) {
                    this.connectionCreator = getDownloadMgrInitialParams().createConnectionCreator();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.connectionCreator;
    }

    private com.liulishuo.filedownloader.services.c getDownloadMgrInitialParams() {
        com.liulishuo.filedownloader.services.c cVar = this.initialParams;
        if (cVar != null) {
            return cVar;
        }
        synchronized (this) {
            try {
                if (this.initialParams == null) {
                    this.initialParams = new com.liulishuo.filedownloader.services.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.initialParams;
    }

    public static b getImpl() {
        return a.INSTANCE;
    }

    private c.e getOutputStreamCreator() {
        c.e eVar = this.outputStreamCreator;
        if (eVar != null) {
            return eVar;
        }
        synchronized (this) {
            try {
                if (this.outputStreamCreator == null) {
                    this.outputStreamCreator = getDownloadMgrInitialParams().createOutputStreamCreator();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.outputStreamCreator;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:70:0x0036, B:72:0x003d, B:74:0x0044, B:76:0x004b, B:11:0x0062, B:27:0x0072, B:29:0x007d, B:10:0x005f), top: B:69:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:15:0x00f9, B:42:0x00b0, B:43:0x00d4, B:45:0x00db, B:48:0x00e8, B:51:0x00f3, B:53:0x0104, B:55:0x011a, B:57:0x011e, B:58:0x0134, B:59:0x013c), top: B:14:0x00f9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void maintainDatabase(a.InterfaceC0290a interfaceC0290a) {
        long j8;
        long j9;
        FileDownloadModel fileDownloadModel;
        String str;
        String targetFilePath;
        int id;
        int transOldId;
        long j10;
        String str2 = "refreshed data count: %d , delete data count: %d, reset id count: %d. consume %d";
        Iterator it = interfaceC0290a.iterator();
        c.d idGeneratorInstance = getImpl().getIdGeneratorInstance();
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (it.hasNext()) {
            try {
                try {
                    fileDownloadModel = (FileDownloadModel) it.next();
                    str = str2;
                } catch (Throwable th) {
                    th = th;
                    j8 = currentTimeMillis;
                    j9 = j11;
                    com.liulishuo.filedownloader.util.f.markConverted(com.liulishuo.filedownloader.util.c.getAppContext());
                    interfaceC0290a.onFinishMaintain();
                    if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                    }
                    throw th;
                }
                try {
                    if (fileDownloadModel.getStatus() != 3) {
                        try {
                            if (fileDownloadModel.getStatus() != 2) {
                                if (fileDownloadModel.getStatus() != -1) {
                                    if (fileDownloadModel.getStatus() == 1 && fileDownloadModel.getSoFar() > 0) {
                                    }
                                    targetFilePath = fileDownloadModel.getTargetFilePath();
                                    if (targetFilePath != null) {
                                        j8 = currentTimeMillis;
                                        j9 = j11;
                                    } else {
                                        File file = new File(targetFilePath);
                                        if (fileDownloadModel.getStatus() == -2) {
                                            j8 = currentTimeMillis;
                                            try {
                                                if (com.liulishuo.filedownloader.util.f.isBreakpointAvailable(fileDownloadModel.getId(), fileDownloadModel, fileDownloadModel.getPath(), null)) {
                                                    File file2 = new File(fileDownloadModel.getTempFilePath());
                                                    if (!file2.exists() && file.exists()) {
                                                        boolean renameTo = file.renameTo(file2);
                                                        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                                                            j9 = j11;
                                                            com.liulishuo.filedownloader.util.d.d(com.liulishuo.filedownloader.database.a.class, "resume from the old no-temp-file architecture [%B], [%s]->[%s]", Boolean.valueOf(renameTo), file.getPath(), file2.getPath());
                                                            if (fileDownloadModel.getStatus() != 1 && fileDownloadModel.getSoFar() <= 0) {
                                                            }
                                                            if (com.liulishuo.filedownloader.util.f.isBreakpointAvailable(fileDownloadModel.getId(), fileDownloadModel) && !file.exists()) {
                                                                id = fileDownloadModel.getId();
                                                                transOldId = idGeneratorInstance.transOldId(id, fileDownloadModel.getUrl(), fileDownloadModel.getPath(), fileDownloadModel.isPathAsDirectory());
                                                                if (transOldId != id) {
                                                                    if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                                                                        com.liulishuo.filedownloader.util.d.d(com.liulishuo.filedownloader.database.a.class, "the id is changed on restoring from db: old[%d] -> new[%d]", Integer.valueOf(id), Integer.valueOf(transOldId));
                                                                    }
                                                                    fileDownloadModel.setId(transOldId);
                                                                    interfaceC0290a.changeFileDownloadModelId(id, fileDownloadModel);
                                                                    j13++;
                                                                }
                                                                interfaceC0290a.onRefreshedValidData(fileDownloadModel);
                                                                j10 = j9 + 1;
                                                                j11 = j10;
                                                                str2 = str;
                                                                currentTimeMillis = j8;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                j9 = j11;
                                                str2 = str;
                                                com.liulishuo.filedownloader.util.f.markConverted(com.liulishuo.filedownloader.util.c.getAppContext());
                                                interfaceC0290a.onFinishMaintain();
                                                if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                                                }
                                                throw th;
                                            }
                                        } else {
                                            j8 = currentTimeMillis;
                                        }
                                        j9 = j11;
                                        if (fileDownloadModel.getStatus() != 1) {
                                        }
                                        if (com.liulishuo.filedownloader.util.f.isBreakpointAvailable(fileDownloadModel.getId(), fileDownloadModel)) {
                                            id = fileDownloadModel.getId();
                                            transOldId = idGeneratorInstance.transOldId(id, fileDownloadModel.getUrl(), fileDownloadModel.getPath(), fileDownloadModel.isPathAsDirectory());
                                            if (transOldId != id) {
                                            }
                                            interfaceC0290a.onRefreshedValidData(fileDownloadModel);
                                            j10 = j9 + 1;
                                            j11 = j10;
                                            str2 = str;
                                            currentTimeMillis = j8;
                                        }
                                    }
                                    it.remove();
                                    interfaceC0290a.onRemovedInvalidData(fileDownloadModel);
                                    j12++;
                                    j10 = j9;
                                    j11 = j10;
                                    str2 = str;
                                    currentTimeMillis = j8;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j8 = currentTimeMillis;
                            j9 = j11;
                            str2 = str;
                            com.liulishuo.filedownloader.util.f.markConverted(com.liulishuo.filedownloader.util.c.getAppContext());
                            interfaceC0290a.onFinishMaintain();
                            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                                com.liulishuo.filedownloader.util.d.d(com.liulishuo.filedownloader.database.a.class, str2, Long.valueOf(j9), Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(System.currentTimeMillis() - j8));
                            }
                            throw th;
                        }
                    }
                    it.remove();
                    interfaceC0290a.onRemovedInvalidData(fileDownloadModel);
                    j12++;
                    j10 = j9;
                    j11 = j10;
                    str2 = str;
                    currentTimeMillis = j8;
                } catch (Throwable th4) {
                    th = th4;
                    str2 = str;
                    com.liulishuo.filedownloader.util.f.markConverted(com.liulishuo.filedownloader.util.c.getAppContext());
                    interfaceC0290a.onFinishMaintain();
                    if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                    }
                    throw th;
                }
                fileDownloadModel.setStatus((byte) -2);
                targetFilePath = fileDownloadModel.getTargetFilePath();
                if (targetFilePath != null) {
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        String str3 = str2;
        long j14 = currentTimeMillis;
        long j15 = j11;
        com.liulishuo.filedownloader.util.f.markConverted(com.liulishuo.filedownloader.util.c.getAppContext());
        interfaceC0290a.onFinishMaintain();
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(com.liulishuo.filedownloader.database.a.class, str3, Long.valueOf(j15), Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(System.currentTimeMillis() - j14));
        }
    }

    public com.liulishuo.filedownloader.connection.b createConnection(String str) {
        return getConnectionCreator().create(str);
    }

    public com.liulishuo.filedownloader.stream.a createOutputStream(File file) {
        return getOutputStreamCreator().create(file);
    }

    public int determineConnectionCount(int i8, String str, String str2, long j8) {
        return getConnectionCountAdapter().determineConnectionCount(i8, str, str2, j8);
    }

    public com.liulishuo.filedownloader.database.a getDatabaseInstance() {
        com.liulishuo.filedownloader.database.a aVar = this.database;
        if (aVar != null) {
            return aVar;
        }
        synchronized (this) {
            try {
                if (this.database == null) {
                    com.liulishuo.filedownloader.database.a createDatabase = getDownloadMgrInitialParams().createDatabase();
                    this.database = createDatabase;
                    maintainDatabase(createDatabase.maintainer());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.database;
    }

    public k getForegroundConfigInstance() {
        k kVar = this.foregroundServiceConfig;
        if (kVar != null) {
            return kVar;
        }
        synchronized (this) {
            try {
                if (this.foregroundServiceConfig == null) {
                    this.foregroundServiceConfig = getDownloadMgrInitialParams().createForegroundServiceConfig();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.foregroundServiceConfig;
    }

    public c.d getIdGeneratorInstance() {
        c.d dVar = this.idGenerator;
        if (dVar != null) {
            return dVar;
        }
        synchronized (this) {
            try {
                if (this.idGenerator == null) {
                    this.idGenerator = getDownloadMgrInitialParams().createIdGenerator();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.idGenerator;
    }

    public int getMaxNetworkThreadCount() {
        return getDownloadMgrInitialParams().getMaxNetworkThreadCount();
    }

    public boolean isSupportSeek() {
        return getOutputStreamCreator().supportSeek();
    }

    public void setInitCustomMaker(c.a aVar) {
        synchronized (this) {
            this.initialParams = new com.liulishuo.filedownloader.services.c(aVar);
            this.connectionCreator = null;
            this.outputStreamCreator = null;
            this.database = null;
            this.idGenerator = null;
        }
    }
}
