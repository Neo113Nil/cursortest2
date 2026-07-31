package com.bytedance.adsdk.fs.fb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes12.dex */
public class zmn implements fb {
    private final HttpURLConnection zmn;

    public zmn(HttpURLConnection httpURLConnection) {
        this.zmn = httpURLConnection;
    }

    @Override // com.bytedance.adsdk.fs.fb.fb
    public boolean zmn() {
        try {
            return this.zmn.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.fs.fb.fb
    public InputStream fs() throws IOException {
        return this.zmn.getInputStream();
    }

    @Override // com.bytedance.adsdk.fs.fb.fb
    public String zn() {
        return this.zmn.getContentType();
    }

    @Override // com.bytedance.adsdk.fs.fb.fb
    public String fb() {
        try {
            if (zmn()) {
                return null;
            }
            return "Unable to fetch " + this.zmn.getURL() + ". Failed with " + this.zmn.getResponseCode() + "\n" + zmn(this.zmn);
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.zmn.disconnect();
    }

    private String zmn(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }
}
