package com.liulishuo.filedownloader.services;

import com.liulishuo.filedownloader.connection.c;
import com.liulishuo.filedownloader.services.k;
import com.liulishuo.filedownloader.stream.b;
import com.liulishuo.filedownloader.util.c;

/* loaded from: classes4.dex */
public class c {
    private final a mMaker;

    public static class a {
        c.a mConnectionCountAdapter;
        c.b mConnectionCreator;
        c.InterfaceC0298c mDatabaseCustomMaker;
        k mForegroundServiceConfig;
        c.d mIdGenerator;
        Integer mMaxNetworkThreadCount;
        c.e mOutputStreamCreator;

        public void commit() {
        }

        public a connectionCountAdapter(c.a aVar) {
            this.mConnectionCountAdapter = aVar;
            return this;
        }

        public a connectionCreator(c.b bVar) {
            this.mConnectionCreator = bVar;
            return this;
        }

        public a database(c.InterfaceC0298c interfaceC0298c) {
            this.mDatabaseCustomMaker = interfaceC0298c;
            return this;
        }

        public a foregroundServiceConfig(k kVar) {
            this.mForegroundServiceConfig = kVar;
            return this;
        }

        public a idGenerator(c.d dVar) {
            this.mIdGenerator = dVar;
            return this;
        }

        public a maxNetworkThreadCount(int i8) {
            if (i8 > 0) {
                this.mMaxNetworkThreadCount = Integer.valueOf(i8);
            }
            return this;
        }

        public a outputStreamCreator(c.e eVar) {
            this.mOutputStreamCreator = eVar;
            if (eVar == null || eVar.supportSeek() || com.liulishuo.filedownloader.util.e.getImpl().fileNonPreAllocation) {
                return this;
            }
            throw new IllegalArgumentException("Since the provided FileDownloadOutputStream does not support the seek function, if FileDownloader pre-allocates file size at the beginning of the download, it will can not be resumed from the breakpoint. If you need to ensure that the resumption is available, please add and set the value of 'file.non-pre-allocation' field to 'true' in the 'filedownloader.properties' file which is in your application assets folder manually for resolving this problem.");
        }

        public String toString() {
            return com.liulishuo.filedownloader.util.f.formatString("component: database[%s], maxNetworkCount[%s], outputStream[%s], connection[%s], connectionCountAdapter[%s]", this.mDatabaseCustomMaker, this.mMaxNetworkThreadCount, this.mOutputStreamCreator, this.mConnectionCreator, this.mConnectionCountAdapter);
        }
    }

    public c() {
        this.mMaker = null;
    }

    private c.a createDefaultConnectionCountAdapter() {
        return new com.liulishuo.filedownloader.connection.a();
    }

    private c.b createDefaultConnectionCreator() {
        return new c.b();
    }

    private com.liulishuo.filedownloader.database.a createDefaultDatabase() {
        return new com.liulishuo.filedownloader.database.c();
    }

    private k createDefaultForegroundServiceConfig() {
        return new k.b().needRecreateChannelId(true).build();
    }

    private c.d createDefaultIdGenerator() {
        return new b();
    }

    private c.e createDefaultOutputStreamCreator() {
        return new b.a();
    }

    private int getDefaultMaxNetworkThreadCount() {
        return com.liulishuo.filedownloader.util.e.getImpl().downloadMaxNetworkThreadCount;
    }

    public c.a createConnectionCountAdapter() {
        a aVar = this.mMaker;
        if (aVar == null) {
            return createDefaultConnectionCountAdapter();
        }
        c.a aVar2 = aVar.mConnectionCountAdapter;
        if (aVar2 == null) {
            return createDefaultConnectionCountAdapter();
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "initial FileDownloader manager with the customize connection count adapter: %s", aVar2);
        }
        return aVar2;
    }

    public c.b createConnectionCreator() {
        a aVar = this.mMaker;
        if (aVar == null) {
            return createDefaultConnectionCreator();
        }
        c.b bVar = aVar.mConnectionCreator;
        if (bVar == null) {
            return createDefaultConnectionCreator();
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "initial FileDownloader manager with the customize connection creator: %s", bVar);
        }
        return bVar;
    }

    public com.liulishuo.filedownloader.database.a createDatabase() {
        c.InterfaceC0298c interfaceC0298c;
        a aVar = this.mMaker;
        if (aVar == null || (interfaceC0298c = aVar.mDatabaseCustomMaker) == null) {
            return createDefaultDatabase();
        }
        com.liulishuo.filedownloader.database.a customMake = interfaceC0298c.customMake();
        if (customMake == null) {
            return createDefaultDatabase();
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "initial FileDownloader manager with the customize database: %s", customMake);
        }
        return customMake;
    }

    public k createForegroundServiceConfig() {
        a aVar = this.mMaker;
        if (aVar == null) {
            return createDefaultForegroundServiceConfig();
        }
        k kVar = aVar.mForegroundServiceConfig;
        if (kVar == null) {
            return createDefaultForegroundServiceConfig();
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "initial FileDownloader manager with the customize foreground service config: %s", kVar);
        }
        return kVar;
    }

    public c.d createIdGenerator() {
        a aVar = this.mMaker;
        if (aVar == null) {
            return createDefaultIdGenerator();
        }
        c.d dVar = aVar.mIdGenerator;
        if (dVar == null) {
            return createDefaultIdGenerator();
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "initial FileDownloader manager with the customize id generator: %s", dVar);
        }
        return dVar;
    }

    public c.e createOutputStreamCreator() {
        a aVar = this.mMaker;
        if (aVar == null) {
            return createDefaultOutputStreamCreator();
        }
        c.e eVar = aVar.mOutputStreamCreator;
        if (eVar == null) {
            return createDefaultOutputStreamCreator();
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "initial FileDownloader manager with the customize output stream: %s", eVar);
        }
        return eVar;
    }

    public int getMaxNetworkThreadCount() {
        a aVar = this.mMaker;
        if (aVar == null) {
            return getDefaultMaxNetworkThreadCount();
        }
        Integer num = aVar.mMaxNetworkThreadCount;
        if (num == null) {
            return getDefaultMaxNetworkThreadCount();
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "initial FileDownloader manager with the customize maxNetworkThreadCount: %d", num);
        }
        return com.liulishuo.filedownloader.util.e.getValidNetworkThreadCount(num.intValue());
    }

    public c(a aVar) {
        this.mMaker = aVar;
    }
}
