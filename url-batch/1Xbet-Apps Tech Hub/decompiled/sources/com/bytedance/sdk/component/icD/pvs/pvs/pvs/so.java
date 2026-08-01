package com.bytedance.sdk.component.icD.pvs.pvs.pvs;

import com.bytedance.sdk.component.icD.pvs.mnm;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: NetResponseBody.java */
/* loaded from: classes.dex */
public class so extends mnm {
    InputStream icD;
    HttpURLConnection pvs;

    so(HttpURLConnection httpURLConnection) throws IOException {
        this.pvs = httpURLConnection;
        this.icD = new sUS(httpURLConnection.getInputStream(), httpURLConnection);
    }

    so(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.pvs = httpURLConnection;
        this.icD = new sUS(inputStream, httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.icD.pvs.mnm
    public long pvs() {
        try {
            return this.pvs.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.icD.pvs.mnm
    public String icD() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.icD));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine + "\n");
                } else {
                    String stringBuffer2 = stringBuffer.toString();
                    close();
                    return stringBuffer2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.icD.pvs.mnm, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.icD.close();
            this.pvs.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.icD.pvs.mnm
    public InputStream vG() {
        return this.icD;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.mnm
    public byte[] Jd() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = this.icD.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.icD.pvs.mnm
    public com.bytedance.sdk.component.icD.pvs.Mxy NB() {
        if (this.pvs.getContentType() != null) {
            return com.bytedance.sdk.component.icD.pvs.Mxy.pvs(this.pvs.getContentType());
        }
        return null;
    }
}
