package com.bytedance.sdk.component.btk.zmn;

import android.util.Log;
import com.bytedance.sdk.component.btk.btk;
import com.bytedance.sdk.component.utils.iv;
import com.ironsource.C4701ic;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public class zmn implements com.bytedance.sdk.component.btk.fb<zn> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.bytedance.sdk.component.btk.fb
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public zn<byte[]> zmn(btk btkVar) {
        Closeable closeable;
        InputStream inputStream;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        String message;
        Closeable closeable2;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2 = null;
        Map<String, String> map = null;
        int i = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(btkVar.zmn()).openConnection();
                httpURLConnection.setRequestMethod(C4701ic.a);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = PangleNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr2 = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    } catch (MalformedURLException e) {
                        e = e;
                        bArr = null;
                    } catch (IOException e2) {
                        e = e2;
                        bArr = null;
                    }
                }
                i = 200;
                bArr = byteArrayOutputStream.toByteArray();
                try {
                    map = btkVar.fs() ? zmn(httpURLConnection) : null;
                    iv.zmn(inputStream);
                    iv.zmn(byteArrayOutputStream);
                    message = "success";
                } catch (MalformedURLException e3) {
                    e = e3;
                    Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                    message = e.getMessage();
                    closeable2 = byteArrayOutputStream;
                    iv.zmn(inputStream);
                    iv.zmn(closeable2);
                    return new zn<>(i, bArr, message, map);
                } catch (IOException e4) {
                    e = e4;
                    Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                    message = e.getMessage();
                    closeable2 = byteArrayOutputStream;
                    iv.zmn(inputStream);
                    iv.zmn(closeable2);
                    return new zn<>(i, bArr, message, map);
                }
            } catch (MalformedURLException e5) {
                e = e5;
                bArr = null;
                byteArrayOutputStream = bArr;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                iv.zmn(inputStream);
                iv.zmn(closeable2);
                return new zn<>(i, bArr, message, map);
            } catch (IOException e6) {
                e = e6;
                bArr = null;
                byteArrayOutputStream = bArr;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                iv.zmn(inputStream);
                iv.zmn(closeable2);
                return new zn<>(i, bArr, message, map);
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                inputStream2 = inputStream;
                iv.zmn(inputStream2);
                iv.zmn(closeable);
                throw th;
            }
        } catch (MalformedURLException e7) {
            e = e7;
            inputStream = null;
            bArr = null;
        } catch (IOException e8) {
            e = e8;
            inputStream = null;
            bArr = null;
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            iv.zmn(inputStream2);
            iv.zmn(closeable);
            throw th;
        }
        return new zn<>(i, bArr, message, map);
    }

    private Map<String, String> zmn(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                hashMap.put(str, list.get(0));
            }
        }
        return hashMap;
    }
}
