package com.baidu.mapapi.http;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import cn.hutool.core.util.l;
import com.baidu.mapapi.JNIInitializer;
import com.baidu.mapapi.common.Logger;
import com.baidu.mapapi.http.wrapper.FileWrapper;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.baidu.mapsdkplatform.comapi.util.g;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* loaded from: classes2.dex */
public class HttpClient {
    public static final String BOUNDRYSTR = "bd_map_sdk_cc";
    public static final String ENDFLAG = "--";
    public static final String FILE_TEMPLATE = "Content-Disposition: form-data; name=\"%s\"; filename=\"%s\"";
    public static final String NEWLINE = "\r\n";
    public static final String PARAM_TEMPLATE = "Content-Disposition: form-data; name=\"%s\"";
    public static boolean isHttpsEnable = true;

    /* renamed from: c, reason: collision with root package name */
    private HttpURLConnection f5456c;

    /* renamed from: f, reason: collision with root package name */
    private final String f5459f;

    /* renamed from: g, reason: collision with root package name */
    private ProtoResultCallback f5460g;

    /* renamed from: h, reason: collision with root package name */
    private HttpHeader f5461h;

    /* renamed from: a, reason: collision with root package name */
    private String f5454a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f5455b = null;

    /* renamed from: d, reason: collision with root package name */
    private int f5457d = 10000;

    /* renamed from: e, reason: collision with root package name */
    private int f5458e = 10000;

    public static class HttpHeader {

        /* renamed from: a, reason: collision with root package name */
        private String f5462a;

        /* renamed from: b, reason: collision with root package name */
        private String f5463b;

        /* renamed from: c, reason: collision with root package name */
        private String f5464c;

        /* renamed from: d, reason: collision with root package name */
        private String f5465d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, Object> f5466e;

        public HttpHeader() {
        }

        public String getAccept() {
            return this.f5465d;
        }

        public String getCharset() {
            return this.f5463b;
        }

        public String getConnection() {
            return this.f5462a;
        }

        public String getContentType() {
            return this.f5464c;
        }

        public Map<String, Object> getCustom() {
            return this.f5466e;
        }

        public HttpHeader setAccept(String str) {
            this.f5465d = str;
            return this;
        }

        public HttpHeader setCharset(String str) {
            this.f5463b = str;
            return this;
        }

        public HttpHeader setConnection(String str) {
            this.f5462a = str;
            return this;
        }

        public HttpHeader setContentType(String str) {
            this.f5464c = str;
            return this;
        }

        public HttpHeader setCustom(Map<String, Object> map) {
            this.f5466e = map;
            return this;
        }

        public HttpHeader(String str, String str2, String str3, String str4) {
            this.f5462a = str;
            this.f5463b = str2;
            this.f5464c = str3;
            this.f5465d = str4;
        }
    }

    public enum HttpStateError {
        NO_ERROR,
        NETWORK_ERROR,
        INNER_ERROR,
        REQUEST_ERROR,
        SERVER_ERROR
    }

    public static abstract class ProtoResultCallback {
        public abstract void onFailed(HttpStateError httpStateError);

        public abstract void onSuccess(String str);
    }

    private static class b implements HostnameVerifier {
        private b() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
        }
    }

    public HttpClient(String str) {
        this.f5459f = str;
    }

    private HttpURLConnection a() {
        HttpURLConnection httpURLConnection;
        try {
            URL url = new URL(this.f5454a);
            if (isHttpsEnable) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                httpsURLConnection.setHostnameVerifier(new b());
                httpURLConnection = httpsURLConnection;
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            }
            httpURLConnection.setRequestMethod(this.f5459f);
            httpURLConnection.setDoOutput(!HttpManager.HTTP_GET.equalsIgnoreCase(this.f5459f));
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(this.f5457d);
            httpURLConnection.setReadTimeout(this.f5458e);
            a(httpURLConnection);
            return httpURLConnection;
        } catch (Exception e8) {
            Log.e("HttpClient", "url connect failed");
            if (Logger.debugEnable()) {
                e8.printStackTrace();
            } else {
                Logger.logW("HttpClient", e8.getMessage());
            }
            return null;
        }
    }

    public static String getAuthToken() {
        return g.F;
    }

    public static String getPhoneInfo() {
        return g.h();
    }

    public static Map<String, String> getPhoneInfoRaw() {
        return g.j();
    }

    protected boolean checkNetwork() {
        Network activeNetwork;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) JNIInitializer.getCachedContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 29) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
            }
            activeNetwork = connectivityManager.getActiveNetwork();
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            return networkCapabilities != null && networkCapabilities.hasCapability(12);
        } catch (Exception e8) {
            if (Logger.debugEnable()) {
                e8.printStackTrace();
            } else {
                Logger.logW("HttpClient", e8.getMessage());
            }
            e8.printStackTrace();
            return false;
        }
    }

    public void request(String str) {
        request(str, null, null, null);
    }

    public void setHeader(HttpHeader httpHeader) {
        this.f5461h = httpHeader;
    }

    public void setMaxTimeOut(int i8) {
        this.f5457d = i8;
    }

    public void setReadTimeOut(int i8) {
        this.f5458e = i8;
    }

    public static class HttpResponse {

        /* renamed from: a, reason: collision with root package name */
        private String f5467a;

        /* renamed from: b, reason: collision with root package name */
        private HttpStateError f5468b;

        public HttpResponse(String str) {
            this.f5467a = str;
            this.f5468b = HttpStateError.NO_ERROR;
        }

        public String getData() {
            return this.f5467a;
        }

        public HttpStateError getError() {
            return this.f5468b;
        }

        public void setData(String str) {
            this.f5467a = str;
        }

        public void setError(HttpStateError httpStateError) {
            this.f5468b = httpStateError;
        }

        public HttpResponse(HttpStateError httpStateError) {
            this.f5468b = httpStateError;
        }
    }

    public HttpClient(String str, ProtoResultCallback protoResultCallback) {
        this.f5459f = str;
        this.f5460g = protoResultCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163 A[Catch: all -> 0x00ab, TryCatch #4 {all -> 0x00ab, blocks: (B:38:0x009a, B:39:0x009f, B:41:0x00a6, B:43:0x00b1, B:57:0x015d, B:59:0x0163, B:60:0x016e, B:62:0x0177, B:63:0x017c, B:72:0x0167), top: B:37:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0177 A[Catch: all -> 0x00ab, TryCatch #4 {all -> 0x00ab, blocks: (B:38:0x009a, B:39:0x009f, B:41:0x00a6, B:43:0x00b1, B:57:0x015d, B:59:0x0163, B:60:0x016e, B:62:0x0177, B:63:0x017c, B:72:0x0167), top: B:37:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0191 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:29:0x0073, B:45:0x00b9, B:46:0x00c3, B:48:0x00c7, B:77:0x0199, B:78:0x019f, B:80:0x01a3, B:81:0x01a6, B:66:0x0187, B:67:0x018d, B:69:0x0191, B:93:0x0151, B:95:0x0155), top: B:28:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167 A[Catch: all -> 0x00ab, TryCatch #4 {all -> 0x00ab, blocks: (B:38:0x009a, B:39:0x009f, B:41:0x00a6, B:43:0x00b1, B:57:0x015d, B:59:0x0163, B:60:0x016e, B:62:0x0177, B:63:0x017c, B:72:0x0167), top: B:37:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a3 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:29:0x0073, B:45:0x00b9, B:46:0x00c3, B:48:0x00c7, B:77:0x0199, B:78:0x019f, B:80:0x01a3, B:81:0x01a6, B:66:0x0187, B:67:0x018d, B:69:0x0191, B:93:0x0151, B:95:0x0155), top: B:28:0x0073 }] */
    /* JADX WARN: Type inference failed for: r6v15, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpResponse request(String str, String str2, String str3, Map<String, List<FileWrapper>> map) {
        BufferedReader bufferedReader;
        Throwable th;
        InputStream inputStream;
        InputStream inputStream2;
        Exception e8;
        InputStream inputStream3;
        HttpURLConnection httpURLConnection;
        ProtoResultCallback protoResultCallback;
        HttpURLConnection httpURLConnection2;
        ?? responseCode;
        this.f5454a = str;
        if (str2 != null && !str2.isEmpty()) {
            this.f5454a += "?" + str2;
        }
        if (!checkNetwork()) {
            ProtoResultCallback protoResultCallback2 = this.f5460g;
            if (protoResultCallback2 != null) {
                protoResultCallback2.onFailed(HttpStateError.NETWORK_ERROR);
            }
            return new HttpResponse(HttpStateError.NETWORK_ERROR);
        }
        HttpURLConnection a8 = a();
        this.f5456c = a8;
        if (a8 == null) {
            Log.e("HttpClient", "url connection failed");
            ProtoResultCallback protoResultCallback3 = this.f5460g;
            if (protoResultCallback3 != null) {
                protoResultCallback3.onFailed(HttpStateError.INNER_ERROR);
            }
            return new HttpResponse(HttpStateError.INNER_ERROR);
        }
        if (TextUtils.isEmpty(this.f5454a)) {
            ProtoResultCallback protoResultCallback4 = this.f5460g;
            if (protoResultCallback4 != null) {
                protoResultCallback4.onFailed(HttpStateError.REQUEST_ERROR);
            }
            return new HttpResponse(HttpStateError.REQUEST_ERROR);
        }
        try {
            this.f5456c.connect();
            a(this.f5456c, str3, map);
            try {
                responseCode = this.f5456c.getResponseCode();
            } catch (Exception e9) {
                e = e9;
                inputStream2 = null;
            } catch (Throwable th2) {
                bufferedReader = null;
                th = th2;
                inputStream = null;
            }
            try {
                if (200 != responseCode) {
                    Log.e("HttpClient", "responseCode is: " + ((int) responseCode));
                    HttpStateError httpStateError = responseCode >= 500 ? HttpStateError.SERVER_ERROR : responseCode >= 400 ? HttpStateError.REQUEST_ERROR : HttpStateError.INNER_ERROR;
                    if (Logger.debugEnable()) {
                        Logger.logW("HttpClient", this.f5456c.getErrorStream().toString());
                    } else {
                        Logger.logW("HttpClient", "Get response from server failed, http response code=" + ((int) responseCode) + ", error=" + httpStateError);
                    }
                    ProtoResultCallback protoResultCallback5 = this.f5460g;
                    if (protoResultCallback5 != null) {
                        protoResultCallback5.onFailed(httpStateError);
                    }
                    HttpResponse httpResponse = new HttpResponse(httpStateError);
                    HttpURLConnection httpURLConnection3 = this.f5456c;
                    if (httpURLConnection3 != null) {
                        httpURLConnection3.disconnect();
                    }
                    return httpResponse;
                }
                inputStream3 = this.f5456c.getInputStream();
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream3, l.UTF_8));
                try {
                    try {
                        StringBuffer stringBuffer = new StringBuffer();
                        while (true) {
                            int read = bufferedReader.read();
                            if (read == -1) {
                                break;
                            }
                            stringBuffer.append((char) read);
                        }
                        this.f5455b = stringBuffer.toString();
                        if (inputStream3 != null) {
                            bufferedReader.close();
                            inputStream3.close();
                        }
                        HttpURLConnection httpURLConnection4 = this.f5456c;
                        if (httpURLConnection4 != null) {
                            httpURLConnection4.disconnect();
                        }
                        ProtoResultCallback protoResultCallback6 = this.f5460g;
                        if (protoResultCallback6 != null) {
                            protoResultCallback6.onSuccess(this.f5455b);
                        }
                        return new HttpResponse(this.f5455b);
                    } catch (Exception e10) {
                        e8 = e10;
                        inputStream3 = inputStream3;
                        if (Logger.debugEnable()) {
                            Logger.logW("HttpClient", e8.getMessage());
                        } else {
                            e8.printStackTrace();
                        }
                        Log.e("HttpClient", "Catch exception. INNER_ERROR", e8);
                        protoResultCallback = this.f5460g;
                        if (protoResultCallback != null) {
                            protoResultCallback.onFailed(HttpStateError.INNER_ERROR);
                        }
                        HttpResponse httpResponse2 = new HttpResponse(HttpStateError.INNER_ERROR);
                        if (inputStream3 != null && bufferedReader != null) {
                            bufferedReader.close();
                            inputStream3.close();
                        }
                        httpURLConnection2 = this.f5456c;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        return httpResponse2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = inputStream3;
                    if (inputStream != null && bufferedReader != null) {
                        bufferedReader.close();
                        inputStream.close();
                    }
                    httpURLConnection = this.f5456c;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                inputStream2 = responseCode;
                e = e11;
                InputStream inputStream4 = inputStream2;
                bufferedReader = null;
                e8 = e;
                inputStream3 = inputStream4;
                if (Logger.debugEnable()) {
                }
                Log.e("HttpClient", "Catch exception. INNER_ERROR", e8);
                protoResultCallback = this.f5460g;
                if (protoResultCallback != null) {
                }
                HttpResponse httpResponse22 = new HttpResponse(HttpStateError.INNER_ERROR);
                if (inputStream3 != null) {
                    bufferedReader.close();
                    inputStream3.close();
                }
                httpURLConnection2 = this.f5456c;
                if (httpURLConnection2 != null) {
                }
                return httpResponse22;
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                inputStream = responseCode;
                if (inputStream != null) {
                    bufferedReader.close();
                    inputStream.close();
                }
                httpURLConnection = this.f5456c;
                if (httpURLConnection != null) {
                }
                throw th;
            }
        } catch (Exception e12) {
            if (Logger.debugEnable()) {
                e12.printStackTrace();
            } else {
                Logger.logW("HttpClient", e12.getMessage());
            }
            Log.e("HttpClient", "Catch connection exception, INNER_ERROR", e12);
            ProtoResultCallback protoResultCallback7 = this.f5460g;
            if (protoResultCallback7 != null) {
                protoResultCallback7.onFailed(HttpStateError.INNER_ERROR);
            }
            return new HttpResponse(HttpStateError.INNER_ERROR);
        }
    }

    private void a(HttpURLConnection httpURLConnection) {
        HttpHeader httpHeader = this.f5461h;
        if (httpHeader == null || httpURLConnection == null) {
            return;
        }
        if (httpHeader.getConnection() != null && !this.f5461h.getConnection().isEmpty()) {
            httpURLConnection.setRequestProperty("Connection", this.f5461h.getConnection());
        }
        if (this.f5461h.getCharset() != null && !this.f5461h.getCharset().isEmpty()) {
            httpURLConnection.setRequestProperty("Charset", this.f5461h.getCharset());
        }
        if (this.f5461h.getContentType() != null && !this.f5461h.getContentType().isEmpty()) {
            httpURLConnection.setRequestProperty("Content-Type", this.f5461h.getContentType());
        }
        if (this.f5461h.getAccept() != null && !this.f5461h.getAccept().isEmpty()) {
            httpURLConnection.setRequestProperty("accept", this.f5461h.getAccept());
        }
        Map<String, Object> custom = this.f5461h.getCustom();
        if (custom == null || custom.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : custom.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), String.valueOf(entry.getValue()));
        }
    }

    private void a(HttpURLConnection httpURLConnection, String str, Map<String, List<FileWrapper>> map) {
        if (HttpManager.HTTP_GET.equalsIgnoreCase(this.f5459f)) {
            return;
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            a(str, outputStream);
            a(map, outputStream);
            if (TextUtils.equals(this.f5461h.getContentType(), "multipart/form-data;boundary=bd_map_sdk_cc")) {
                outputStream.write("--bd_map_sdk_cc--\r\n".getBytes());
            }
            outputStream.flush();
            outputStream.close();
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    private void a(String str, OutputStream outputStream) {
        if (str == null || str.isEmpty()) {
            return;
        }
        outputStream.write(str.getBytes());
    }

    private void a(Map<String, List<FileWrapper>> map, OutputStream outputStream) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, List<FileWrapper>> entry : map.entrySet()) {
            for (FileWrapper fileWrapper : entry.getValue()) {
                if (fileWrapper.getRawFile() != null) {
                    File rawFile = fileWrapper.getRawFile();
                    outputStream.write(("--bd_map_sdk_cc\r\n" + String.format(FILE_TEMPLATE, entry.getKey(), rawFile.getName()) + "\r\n" + String.format("Content-Type: %s", URLConnection.getFileNameMap().getContentTypeFor(rawFile.getName())) + "\r\n\r\n").getBytes());
                    a(rawFile, outputStream);
                    outputStream.write("\r\n".getBytes());
                } else {
                    byte[] file = fileWrapper.getFile();
                    String mimeType = fileWrapper.getMimeType();
                    String name = fileWrapper.getName();
                    if (file != null && file.length > 0 && !TextUtils.isEmpty(mimeType) && !TextUtils.isEmpty(name)) {
                        outputStream.write(("--bd_map_sdk_cc\r\n" + String.format(FILE_TEMPLATE, entry.getKey(), name) + "\r\n" + String.format("Content-Type: %s", mimeType) + "\r\n\r\n").getBytes());
                        outputStream.write(file);
                        outputStream.write("\r\n".getBytes());
                    }
                }
            }
        }
    }

    private void a(File file, OutputStream outputStream) {
        int read;
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[1024];
        do {
            read = fileInputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            }
        } while (read > 0);
        fileInputStream.close();
    }
}
