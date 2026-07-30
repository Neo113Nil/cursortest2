package com.liulishuo.filedownloader.connection;

import com.liulishuo.filedownloader.util.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class c implements com.liulishuo.filedownloader.connection.b {
    protected URLConnection mConnection;

    public static class a {
        private Integer connectTimeout;
        private Proxy proxy;
        private Integer readTimeout;

        public a connectTimeout(int i8) {
            this.connectTimeout = Integer.valueOf(i8);
            return this;
        }

        public a proxy(Proxy proxy) {
            this.proxy = proxy;
            return this;
        }

        public a readTimeout(int i8) {
            this.readTimeout = Integer.valueOf(i8);
            return this;
        }
    }

    public static class b implements c.b {
        private final a mConfiguration;

        public b() {
            this(null);
        }

        com.liulishuo.filedownloader.connection.b create(URL url) {
            return new c(url, this.mConfiguration);
        }

        public b(a aVar) {
            this.mConfiguration = aVar;
        }

        @Override // com.liulishuo.filedownloader.util.c.b
        public com.liulishuo.filedownloader.connection.b create(String str) {
            return new c(str, this.mConfiguration);
        }
    }

    public c(String str, a aVar) {
        this(new URL(str), aVar);
    }

    @Override // com.liulishuo.filedownloader.connection.b
    public void addHeader(String str, String str2) {
        this.mConnection.addRequestProperty(str, str2);
    }

    @Override // com.liulishuo.filedownloader.connection.b
    public boolean dispatchAddResumeOffset(String str, long j8) {
        return false;
    }

    @Override // com.liulishuo.filedownloader.connection.b
    public void ending() {
        try {
            this.mConnection.getInputStream().close();
        } catch (IOException unused) {
        }
    }

    @Override // com.liulishuo.filedownloader.connection.b
    public void execute() {
        this.mConnection.connect();
    }

    @Override // com.liulishuo.filedownloader.connection.b
    public InputStream getInputStream() {
        return this.mConnection.getInputStream();
    }

    @Override // com.liulishuo.filedownloader.connection.b
    public Map<String, List<String>> getRequestHeaderFields() {
        return this.mConnection.getRequestProperties();
    }

    @Override // com.liulishuo.filedownloader.connection.b
    public int getResponseCode() {
        URLConnection uRLConnection = this.mConnection;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    @Override // com.liulishuo.filedownloader.connection.b
    public String getResponseHeaderField(String str) {
        return this.mConnection.getHeaderField(str);
    }

    @Override // com.liulishuo.filedownloader.connection.b
    public Map<String, List<String>> getResponseHeaderFields() {
        return this.mConnection.getHeaderFields();
    }

    @Override // com.liulishuo.filedownloader.connection.b
    public boolean setRequestMethod(String str) {
        URLConnection uRLConnection = this.mConnection;
        if (!(uRLConnection instanceof HttpURLConnection)) {
            return false;
        }
        ((HttpURLConnection) uRLConnection).setRequestMethod(str);
        return true;
    }

    public c(URL url, a aVar) {
        if (aVar == null || aVar.proxy == null) {
            this.mConnection = url.openConnection();
        } else {
            this.mConnection = url.openConnection(aVar.proxy);
        }
        if (aVar != null) {
            if (aVar.readTimeout != null) {
                this.mConnection.setReadTimeout(aVar.readTimeout.intValue());
            }
            if (aVar.connectTimeout != null) {
                this.mConnection.setConnectTimeout(aVar.connectTimeout.intValue());
            }
        }
    }

    public c(String str) {
        this(str, (a) null);
    }
}
