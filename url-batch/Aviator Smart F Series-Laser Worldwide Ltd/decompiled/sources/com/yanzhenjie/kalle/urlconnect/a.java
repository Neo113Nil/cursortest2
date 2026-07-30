package com.yanzhenjie.kalle.urlconnect;

import android.text.TextUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes4.dex */
public class a implements com.yanzhenjie.kalle.connect.b {
    private HttpURLConnection mConnection;

    public a(HttpURLConnection httpURLConnection) {
        this.mConnection = httpURLConnection;
    }

    private static boolean hasBody(int i8) {
        return i8 > 100 && i8 != 204 && i8 != 205 && (i8 < 300 || i8 >= 400);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.yanzhenjie.kalle.connect.b
    public void disconnect() {
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.yanzhenjie.kalle.connect.b
    public int getCode() {
        return this.mConnection.getResponseCode();
    }

    @Override // com.yanzhenjie.kalle.connect.b
    public Map<String, List<String>> getHeaders() {
        return this.mConnection.getHeaderFields();
    }

    @Override // com.yanzhenjie.kalle.connect.b
    public InputStream getInputStream() {
        int responseCode = this.mConnection.getResponseCode();
        return !hasBody(this.mConnection.getRequestMethod(), responseCode) ? new s5.a(this) : responseCode >= 400 ? getInputStream(this.mConnection.getContentEncoding(), new s5.b(this, this.mConnection.getErrorStream())) : getInputStream(this.mConnection.getContentEncoding(), new s5.b(this, this.mConnection.getInputStream()));
    }

    @Override // com.yanzhenjie.kalle.connect.b
    public OutputStream getOutputStream() {
        return this.mConnection.getOutputStream();
    }

    private static boolean hasBody(String str, int i8) {
        return !"HEAD".equalsIgnoreCase(str) && hasBody(i8);
    }

    private static InputStream getInputStream(String str, InputStream inputStream) {
        return (TextUtils.isEmpty(str) || !str.contains("gzip")) ? inputStream : new GZIPInputStream(inputStream);
    }
}
