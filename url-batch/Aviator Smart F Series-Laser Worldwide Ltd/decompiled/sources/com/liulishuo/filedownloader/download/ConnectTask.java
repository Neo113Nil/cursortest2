package com.liulishuo.filedownloader.download;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.liulishuo.filedownloader.download.a;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ConnectTask {
    final int downloadId;
    private String etag;
    final FileDownloadHeader header;
    private com.liulishuo.filedownloader.download.a profile;
    private List<String> redirectedUrlList;
    private Map<String, List<String>> requestHeader;
    final String url;

    class Reconnect extends Throwable {
        Reconnect() {
        }
    }

    static class b {
        private com.liulishuo.filedownloader.download.a connectionProfile;
        private Integer downloadId;
        private String etag;
        private FileDownloadHeader header;
        private String url;

        b() {
        }

        ConnectTask build() {
            com.liulishuo.filedownloader.download.a aVar;
            Integer num = this.downloadId;
            if (num == null || (aVar = this.connectionProfile) == null || this.url == null) {
                throw new IllegalArgumentException();
            }
            return new ConnectTask(aVar, num.intValue(), this.url, this.etag, this.header);
        }

        public b setConnectionProfile(com.liulishuo.filedownloader.download.a aVar) {
            this.connectionProfile = aVar;
            return this;
        }

        public b setDownloadId(int i8) {
            this.downloadId = Integer.valueOf(i8);
            return this;
        }

        public b setEtag(String str) {
            this.etag = str;
            return this;
        }

        public b setHeader(FileDownloadHeader fileDownloadHeader) {
            this.header = fileDownloadHeader;
            return this;
        }

        public b setUrl(String str) {
            this.url = str;
            return this;
        }
    }

    private void addRangeHeader(com.liulishuo.filedownloader.connection.b bVar) {
        if (bVar.dispatchAddResumeOffset(this.etag, this.profile.startOffset)) {
            return;
        }
        if (!TextUtils.isEmpty(this.etag)) {
            bVar.addHeader(HttpHeaders.IF_MATCH, this.etag);
        }
        this.profile.processProfile(bVar);
    }

    private void addUserRequiredHeader(com.liulishuo.filedownloader.connection.b bVar) {
        HashMap<String, List<String>> headers;
        FileDownloadHeader fileDownloadHeader = this.header;
        if (fileDownloadHeader == null || (headers = fileDownloadHeader.getHeaders()) == null) {
            return;
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.v(this, "%d add outside header: %s", Integer.valueOf(this.downloadId), headers);
        }
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value != null) {
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    bVar.addHeader(key, it.next());
                }
            }
        }
    }

    private void fixNeededHeader(com.liulishuo.filedownloader.connection.b bVar) {
        FileDownloadHeader fileDownloadHeader = this.header;
        if (fileDownloadHeader == null || fileDownloadHeader.getHeaders().get("User-Agent") == null) {
            bVar.addHeader("User-Agent", com.liulishuo.filedownloader.util.f.defaultUserAgent());
        }
    }

    com.liulishuo.filedownloader.connection.b connect() {
        com.liulishuo.filedownloader.connection.b createConnection = com.liulishuo.filedownloader.download.b.getImpl().createConnection(this.url);
        addUserRequiredHeader(createConnection);
        addRangeHeader(createConnection);
        fixNeededHeader(createConnection);
        this.requestHeader = createConnection.getRequestHeaderFields();
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "<---- %s request header %s", Integer.valueOf(this.downloadId), this.requestHeader);
        }
        createConnection.execute();
        ArrayList arrayList = new ArrayList();
        this.redirectedUrlList = arrayList;
        com.liulishuo.filedownloader.connection.b process = com.liulishuo.filedownloader.connection.d.process(this.requestHeader, createConnection, arrayList);
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "----> %s response header %s", Integer.valueOf(this.downloadId), process.getResponseHeaderFields());
        }
        return process;
    }

    String getFinalRedirectedUrl() {
        List<String> list = this.redirectedUrlList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.redirectedUrlList.get(r0.size() - 1);
    }

    public com.liulishuo.filedownloader.download.a getProfile() {
        return this.profile;
    }

    public Map<String, List<String>> getRequestHeader() {
        return this.requestHeader;
    }

    boolean isRangeNotFromBeginning() {
        return this.profile.currentOffset > 0;
    }

    public void retryOnConnectedWithNewParam(com.liulishuo.filedownloader.download.a aVar, String str) {
        if (aVar == null) {
            throw new IllegalArgumentException();
        }
        this.profile = aVar;
        this.etag = str;
        throw new Reconnect();
    }

    void updateConnectionProfile(long j8) {
        com.liulishuo.filedownloader.download.a aVar = this.profile;
        long j9 = aVar.currentOffset;
        if (j8 == j9) {
            com.liulishuo.filedownloader.util.d.w(this, "no data download, no need to update", new Object[0]);
            return;
        }
        com.liulishuo.filedownloader.download.a buildConnectionProfile = a.b.buildConnectionProfile(aVar.startOffset, j8, aVar.endOffset, aVar.contentLength - (j8 - j9));
        this.profile = buildConnectionProfile;
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.i(this, "after update profile:%s", buildConnectionProfile);
        }
    }

    private ConnectTask(com.liulishuo.filedownloader.download.a aVar, int i8, String str, String str2, FileDownloadHeader fileDownloadHeader) {
        this.downloadId = i8;
        this.url = str;
        this.etag = str2;
        this.header = fileDownloadHeader;
        this.profile = aVar;
    }
}
