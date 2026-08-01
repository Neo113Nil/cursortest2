package com.bytedance.adsdk.lottie.Jd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: DefaultLottieFetchResult.java */
/* loaded from: classes.dex */
public class pvs implements Jd {
    private final HttpURLConnection pvs;

    public pvs(HttpURLConnection httpURLConnection) {
        this.pvs = httpURLConnection;
    }

    @Override // com.bytedance.adsdk.lottie.Jd.Jd
    public boolean pvs() {
        try {
            return this.pvs.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.lottie.Jd.Jd
    public InputStream icD() throws IOException {
        return this.pvs.getInputStream();
    }

    @Override // com.bytedance.adsdk.lottie.Jd.Jd
    public String vG() {
        return this.pvs.getContentType();
    }

    @Override // com.bytedance.adsdk.lottie.Jd.Jd
    public String Jd() {
        try {
            if (pvs()) {
                return null;
            }
            return "Unable to fetch " + this.pvs.getURL() + ". Failed with " + this.pvs.getResponseCode() + "\n" + pvs(this.pvs);
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.pvs.disconnect();
    }

    private String pvs(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine).append('\n');
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
