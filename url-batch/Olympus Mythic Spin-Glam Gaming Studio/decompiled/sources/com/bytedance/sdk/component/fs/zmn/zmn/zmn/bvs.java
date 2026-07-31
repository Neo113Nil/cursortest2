package com.bytedance.sdk.component.fs.zmn.zmn.zmn;

import com.bytedance.sdk.component.fs.zmn.cn;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes5.dex */
public class bvs extends cn {
    InputStream fs;
    HttpURLConnection zmn;
    InputStream zn;

    bvs(HttpURLConnection httpURLConnection) throws IOException {
        this.zmn = httpURLConnection;
        InputStream urlConnectionGetInputStream = PangleNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
        this.zn = urlConnectionGetInputStream;
        this.fs = new nps(urlConnectionGetInputStream, httpURLConnection);
    }

    bvs(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.zmn = httpURLConnection;
        this.zn = inputStream;
        this.fs = new nps(inputStream, httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.fs.zmn.cn
    public long zmn() {
        try {
            return this.zmn.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.fs.zmn.cn
    public String fs() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.fs));
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

    @Override // com.bytedance.sdk.component.fs.zmn.cn, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.fs.close();
            PangleNetworkBridge.httpUrlConnectionDisconnect(this.zmn);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.fs.zmn.cn
    public InputStream zn() {
        return this.fs;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.cn
    public byte[] fb() {
        try {
            if (this.zn == null) {
                return new byte[0];
            }
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = this.fs.read(bArr);
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

    @Override // com.bytedance.sdk.component.fs.zmn.cn
    public com.bytedance.sdk.component.fs.zmn.bvs btk() {
        if (this.zmn.getContentType() != null) {
            return com.bytedance.sdk.component.fs.zmn.bvs.zmn(this.zmn.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.cn
    public String hhw() {
        return this.zmn.getContentEncoding();
    }
}
