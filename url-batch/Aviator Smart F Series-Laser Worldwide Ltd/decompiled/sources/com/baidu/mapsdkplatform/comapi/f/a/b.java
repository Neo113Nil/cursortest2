package com.baidu.mapsdkplatform.comapi.f.a;

import android.content.Context;
import android.os.Build;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.mapapi.NetworkUtil;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.baidu.mapsdkplatform.comapi.util.SyncSysInfo;
import com.baidu.mapsdkplatform.comapi.util.f;
import com.baidu.mapsdkplatform.comapi.util.g;
import com.baidu.mapsdkplatform.comjni.util.JNIHandler;
import com.google.android.gms.measurement.AppMeasurement;
import com.yanzhenjie.kalle.i;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f8011a = "";

    /* renamed from: b, reason: collision with root package name */
    private static String f8012b = "";

    /* renamed from: c, reason: collision with root package name */
    private static String f8013c = "";

    /* renamed from: d, reason: collision with root package name */
    private Context f8014d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            File[] listFiles;
            if (f.b().a() == null) {
                return;
            }
            File file = new File(b.f8011a);
            if (!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
                return;
            }
            try {
                Arrays.sort(listFiles, new c());
            } catch (Exception unused) {
            }
            int length = listFiles.length;
            if (length > 10) {
                length = 10;
            }
            for (int i8 = 0; i8 < length; i8++) {
                File file2 = listFiles[i8];
                if (!file2.isDirectory() && file2.exists() && file2.isFile() && file2.getName().contains(b.f8012b)) {
                    if (file2.getName().endsWith(".txt")) {
                        b.this.b(file2);
                    } else if (file2.getName().endsWith(".zip") && file2.exists()) {
                        b.this.b(file2);
                    }
                }
            }
            if (listFiles.length > 10) {
                b.this.a(listFiles);
            }
        }
    }

    /* renamed from: com.baidu.mapsdkplatform.comapi.f.a.b$b, reason: collision with other inner class name */
    private static final class C0075b {

        /* renamed from: a, reason: collision with root package name */
        private static final b f8016a = new b();
    }

    public static b c() {
        return C0075b.f8016a;
    }

    private void d() {
        File filesDir;
        Context context = this.f8014d;
        if (context == null || (filesDir = context.getFilesDir()) == null) {
            return;
        }
        String path = filesDir.getPath();
        if (path.isEmpty()) {
            return;
        }
        String str = path + File.separator + AppMeasurement.CRASH_ORIGIN;
        File file = new File(str);
        if (file.exists()) {
            f8011a = str;
        } else if (file.mkdir()) {
            f8011a = str;
        } else {
            f8011a = path;
        }
    }

    private HttpURLConnection e() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://api.map.baidu.com/lbs_sdkcc/report").openConnection();
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod(HttpManager.HTTP_POST);
            httpURLConnection.setRequestProperty("Connection", i.VALUE_KEEP_ALIVE);
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=bd_map_sdk_cc");
            httpURLConnection.setRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.setConnectTimeout(10000);
            return httpURLConnection;
        } catch (Exception unused) {
            return null;
        }
    }

    private void f() {
        String str;
        String str2 = f8011a;
        if (str2 == null || str2.isEmpty() || (str = f8012b) == null || str.isEmpty()) {
            return;
        }
        String str3 = f8011a + File.separator + f8012b;
        com.baidu.mapsdkplatform.comapi.f.a.a.a().a(str3);
        JNIHandler.registerNativeHandler(str3);
    }

    private void g() {
        if (NetworkUtil.isNetworkAvailable(this.f8014d)) {
            new Thread(new a()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[Catch: all -> 0x000f, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #11 {, blocks: (B:11:0x000b, B:46:0x00f9, B:50:0x0102, B:54:0x0108, B:82:0x011e, B:70:0x0127, B:75:0x0131, B:76:0x0134, B:102:0x013b, B:91:0x0144, B:98:0x014e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean b(File file) {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        InputStream inputStream;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        r1 = null;
        bufferedReader2 = null;
        InputStream inputStream2 = null;
        r1 = null;
        bufferedReader2 = null;
        BufferedReader bufferedReader3 = null;
        try {
            httpURLConnection = e();
            if (httpURLConnection == null) {
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            try {
                httpURLConnection.connect();
                outputStream = httpURLConnection.getOutputStream();
                try {
                    outputStream.write(a(a(file).toString().getBytes()));
                    outputStream.write(a(("--bd_map_sdk_cc\r\nContent-Disposition: form-data; name=\"file\"; filename=\"c.txt\"\r\n\r\n").getBytes()));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
                    DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = dataInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    outputStream.write(a(byteArrayOutputStream.toByteArray()));
                    dataInputStream.close();
                    byteArrayOutputStream.close();
                    outputStream.write(a("\r\n--bd_map_sdk_cc--\r\n".getBytes()));
                    outputStream.flush();
                    if (httpURLConnection.getResponseCode() == 200) {
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                            try {
                                try {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    while (true) {
                                        int read2 = bufferedReader.read();
                                        if (read2 == -1) {
                                            break;
                                        }
                                        stringBuffer.append((char) read2);
                                    }
                                    try {
                                        JSONObject jSONObject = new JSONObject(stringBuffer.toString());
                                        if (jSONObject.has("status") && jSONObject.getInt("status") == 0 && file.exists()) {
                                            file.delete();
                                        }
                                    } catch (Exception unused2) {
                                    }
                                    inputStream2 = inputStream;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader2 = bufferedReader;
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (Exception unused3) {
                                        }
                                    }
                                    if (inputStream != null && bufferedReader2 != null) {
                                        try {
                                            inputStream.close();
                                            bufferedReader2.close();
                                        } catch (Exception unused4) {
                                        }
                                    }
                                    if (httpURLConnection != null) {
                                        throw th;
                                    }
                                    try {
                                        httpURLConnection.disconnect();
                                        throw th;
                                    } catch (Exception unused5) {
                                        throw th;
                                    }
                                }
                            } catch (Exception unused6) {
                                bufferedReader3 = bufferedReader;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Exception unused7) {
                                    }
                                }
                                if (inputStream != null && bufferedReader3 != null) {
                                    try {
                                        inputStream.close();
                                        bufferedReader3.close();
                                    } catch (Exception unused8) {
                                    }
                                }
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception unused9) {
                                    }
                                }
                                return false;
                            }
                        } catch (Exception unused10) {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        bufferedReader = null;
                    }
                    try {
                        outputStream.close();
                    } catch (Exception unused11) {
                    }
                    if (inputStream2 != null && bufferedReader != null) {
                        try {
                            inputStream2.close();
                            bufferedReader.close();
                        } catch (Exception unused12) {
                        }
                    }
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused13) {
                    }
                    return true;
                } catch (Exception unused14) {
                    inputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                }
            } catch (Exception unused15) {
                outputStream = null;
                inputStream = outputStream;
                if (outputStream != null) {
                }
                if (inputStream != null) {
                    inputStream.close();
                    bufferedReader3.close();
                }
                if (httpURLConnection != null) {
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                outputStream = null;
                inputStream = outputStream;
                if (outputStream != null) {
                }
                if (inputStream != null) {
                    inputStream.close();
                    bufferedReader2.close();
                }
                if (httpURLConnection != null) {
                }
            }
        } catch (Exception unused16) {
            httpURLConnection = null;
            outputStream = null;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            outputStream = null;
        }
    }

    public void a(Context context) {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            f8013c = strArr[0];
        }
        this.f8014d = context;
        String g8 = g.g();
        if (g8.isEmpty()) {
            return;
        }
        if (g8.contains("_")) {
            g8 = g8.replaceAll("_", "");
        }
        f8012b = g8 + "_" + g.o() + "_";
        d();
        f();
        g();
    }

    public void a(String str, String str2) {
        JNIHandler.addLog(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File[] fileArr) {
        int length = fileArr.length;
        for (int i8 = 0; i8 < length - 10; i8++) {
            int i9 = i8 + 10;
            File file = fileArr[i9];
            if (file != null && file.exists()) {
                fileArr[i9].delete();
            }
        }
    }

    private StringBuilder a(File file) {
        String[] split = file.getName().substring(0, file.getName().length() - 4).split("_");
        StringBuilder sb = new StringBuilder();
        sb.append("--bd_map_sdk_cc");
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"phoneinfo\"\r\n");
        sb.append("\r\n");
        sb.append(URLDecoder.decode(SyncSysInfo.getPhoneInfo() + "&abi=" + f8013c));
        sb.append("\r\n");
        sb.append("--bd_map_sdk_cc");
        sb.append("\r\n");
        String str = split[0];
        if (str != null && !str.isEmpty()) {
            sb.append("Content-Disposition: form-data; name=\"packname\"\r\n");
            sb.append("\r\n");
            sb.append(split[0]);
            sb.append("\r\n");
            sb.append("--bd_map_sdk_cc");
            sb.append("\r\n");
        }
        String str2 = split[1];
        if (str2 != null && !str2.isEmpty()) {
            sb.append("Content-Disposition: form-data; name=\"version\"\r\n");
            sb.append("\r\n");
            sb.append(split[1]);
            sb.append("\r\n");
            sb.append("--bd_map_sdk_cc");
            sb.append("\r\n");
        }
        String str3 = split[2];
        if (str3 != null && !str3.isEmpty()) {
            sb.append("Content-Disposition: form-data; name=\"timestamp\"\r\n");
            sb.append("\r\n");
            sb.append(split[2]);
            sb.append("\r\n");
            sb.append("--bd_map_sdk_cc");
            sb.append("\r\n");
        }
        sb.append("Content-Disposition: form-data; name=\"os\"\r\n");
        sb.append("\r\n");
        sb.append(HttpConstants.OS_TYPE_VALUE);
        sb.append("\r\n");
        sb.append("--bd_map_sdk_cc");
        sb.append("\r\n");
        return sb;
    }

    private byte[] a(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        a(byteArrayInputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        byteArrayInputStream.close();
        return byteArray;
    }

    private void a(InputStream inputStream, OutputStream outputStream) {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read != -1) {
                gZIPOutputStream.write(bArr, 0, read);
            } else {
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                try {
                    outputStream.close();
                    inputStream.close();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }
}
