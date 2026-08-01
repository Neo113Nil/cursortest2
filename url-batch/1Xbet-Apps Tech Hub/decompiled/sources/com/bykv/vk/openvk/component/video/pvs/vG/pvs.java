package com.bykv.vk.openvk.component.video.pvs.vG;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.Key;
import com.bykv.vk.openvk.component.video.pvs.icD.Mxy;
import com.bykv.vk.openvk.component.video.pvs.icD.NB;
import com.bykv.vk.openvk.component.video.pvs.icD.icD.vG;
import com.bytedance.sdk.component.so.sUS;
import com.bytedance.sdk.component.so.so;
import com.google.common.net.HttpHeaders;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class pvs {
    private static final Handler icD = new Handler(Looper.getMainLooper());
    public static final Charset pvs = Charset.forName(Key.STRING_CHARSET_NAME);

    public static void pvs(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void pvs(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void pvs(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void pvs(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean pvs(String str) {
        if (str != null) {
            return str.startsWith("http://") || str.startsWith("https://");
        }
        return false;
    }

    public static int icD(String str) {
        return pvs(str, 0);
    }

    public static int pvs(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static String pvs(com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs pvsVar, int i) {
        int pvs2;
        if (pvsVar == null || !pvsVar.icD()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(pvsVar.NB().toUpperCase()).append(' ').append(pvsVar.pvs()).append(' ').append(pvsVar.sUS()).append("\r\n");
        if (NB.vG) {
            Log.i("TAG_PROXY_headers", pvsVar.NB().toUpperCase() + " " + pvsVar.pvs() + " " + pvsVar.sUS());
        }
        List<Mxy.icD> pvs3 = pvs(pvsVar.vG());
        boolean z = true;
        if (pvs3 != null) {
            int size = pvs3.size();
            for (int i2 = 0; i2 < size; i2++) {
                Mxy.icD icd = pvs3.get(i2);
                if (icd != null) {
                    String str = icd.pvs;
                    String str2 = icd.icD;
                    sb.append(str).append(": ").append(str2).append("\r\n");
                    if (HttpHeaders.CONTENT_RANGE.equalsIgnoreCase(str) || (HttpHeaders.ACCEPT_RANGES.equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                        z = false;
                    }
                }
            }
        }
        if (z && (pvs2 = pvs(pvsVar)) > 0) {
            sb.append("Content-Range: bytes ").append(Math.max(i, 0)).append("-").append(pvs2 - 1).append("/").append(pvs2).append("\r\n");
        }
        sb.append("Connection: close\r\n\r\n");
        String sb2 = sb.toString();
        if (NB.vG) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb2);
        }
        return sb2;
    }

    public static String pvs(int i, int i2) {
        String icD2 = icD(i, i2);
        if (icD2 == null) {
            return null;
        }
        return "bytes=".concat(String.valueOf(icD2));
    }

    public static String icD(int i, int i2) {
        if (i >= 0 && i2 > 0) {
            return i + "-" + i2;
        }
        if (i > 0) {
            return i + "-";
        }
        if (i >= 0 || i2 <= 0) {
            return null;
        }
        return "-".concat(String.valueOf(i2));
    }

    public static List<String> pvs(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (pvs(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static String pvs(com.bykv.vk.openvk.component.video.pvs.icD.icD.pvs pvsVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (i <= 0) {
            sb.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb.append("Accept-Ranges: bytes\r\nContent-Type: ");
        sb.append(pvsVar.icD).append("\r\n");
        if (i <= 0) {
            sb.append("Content-Length: ").append(pvsVar.vG).append("\r\n");
        } else {
            sb.append("Content-Range: bytes ").append(i).append("-").append(pvsVar.vG - 1).append("/").append(pvsVar.vG).append("\r\nContent-Length: ");
            sb.append(pvsVar.vG - i).append("\r\n");
        }
        sb.append("Connection: close\r\n\r\n");
        String sb2 = sb.toString();
        if (NB.vG) {
            Log.i("TAG_PROXY_WRITE_TO_MP", sb2);
        }
        return sb2;
    }

    public static int pvs() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 1);
    }

    /* compiled from: Util.java */
    /* renamed from: com.bykv.vk.openvk.component.video.pvs.vG.pvs$1, reason: invalid class name */
    static class AnonymousClass1 implements FilenameFilter {
        private Pattern pvs = Pattern.compile("^cpu[0-9]+$");

        AnonymousClass1() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.pvs.matcher(str).matches();
        }
    }

    public static int pvs(com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs pvsVar) {
        int lastIndexOf;
        if (pvsVar == null) {
            return -1;
        }
        if (pvsVar.pvs() == 200) {
            return pvs(pvsVar.pvs(HttpHeaders.CONTENT_LENGTH, null), -1);
        }
        if (pvsVar.pvs() == 206) {
            String pvs2 = pvsVar.pvs(HttpHeaders.CONTENT_RANGE, null);
            if (!TextUtils.isEmpty(pvs2) && (lastIndexOf = pvs2.lastIndexOf("/")) >= 0 && lastIndexOf < pvs2.length() - 1) {
                return pvs(pvs2.substring(lastIndexOf + 1), -1);
            }
        }
        return -1;
    }

    public static String pvs(com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs pvsVar, boolean z, boolean z2) {
        String pvs2;
        if (pvsVar == null) {
            if (NB.vG) {
                Log.e("TAG_PROXY_Response", "response null");
            }
            return "response null";
        }
        if (!pvsVar.icD()) {
            if (NB.vG) {
                Log.e("TAG_PROXY_Response", "response code: " + pvsVar.pvs());
            }
            return "response code: " + pvsVar.pvs();
        }
        String pvs3 = pvsVar.pvs(HttpHeaders.CONTENT_TYPE, null);
        if (!vG(pvs3)) {
            if (NB.vG) {
                Log.e("TAG_PROXY_Response", "Content-Type: ".concat(String.valueOf(pvs3)));
            }
            return "Content-Type: ".concat(String.valueOf(pvs3));
        }
        int pvs4 = pvs(pvsVar);
        if (pvs4 <= 0) {
            if (NB.vG) {
                Log.e("TAG_PROXY_Response", "Content-Length: ".concat(String.valueOf(pvs4)));
            }
            return "Content-Length: ".concat(String.valueOf(pvs4));
        }
        if (z && ((pvs2 = pvsVar.pvs(HttpHeaders.ACCEPT_RANGES, null)) == null || !pvs2.contains("bytes"))) {
            if (NB.vG) {
                Log.e("TAG_PROXY_Response", "Accept-Ranges: ".concat(String.valueOf(pvs2)));
            }
            return "Accept-Ranges: ".concat(String.valueOf(pvs2));
        }
        if (!z2 || pvsVar.Jd() != null) {
            return null;
        }
        if (NB.vG) {
            Log.e("TAG_PROXY_Response", "response body null");
        }
        return "response body null";
    }

    public static boolean vG(String str) {
        if (str != null) {
            return str.startsWith("video/") || "application/octet-stream".equals(str) || "binary/octet-stream".equals(str);
        }
        return false;
    }

    public static boolean icD() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static void pvs(so soVar) {
        if (soVar != null) {
            if (icD()) {
                sUS.icD(soVar);
                if (NB.vG) {
                    Log.e("TAG_PROXY_UTIL", "invoke in pool thread");
                    return;
                }
                return;
            }
            soVar.run();
            if (NB.vG) {
                Log.e("TAG_PROXY_UTIL", "invoke calling thread");
            }
        }
    }

    public static void pvs(Runnable runnable) {
        if (runnable != null) {
            if (icD()) {
                runnable.run();
            } else {
                icD.post(runnable);
            }
        }
    }

    public static List<Mxy.icD> pvs(List<Mxy.icD> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        if (NB.vG) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Mxy.icD icd = list.get(i);
                if (icd != null) {
                    Log.i("TAG_PROXY_PRE_FILTER", icd.pvs + ": " + icd.pvs);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Mxy.icD icd2 : list) {
            if (HttpHeaders.HOST.equals(icd2.pvs) || HttpHeaders.KEEP_ALIVE.equals(icd2.pvs) || HttpHeaders.CONNECTION.equals(icd2.pvs) || "Proxy-Connection".equals(icd2.pvs)) {
                arrayList.add(icd2);
            }
        }
        list.removeAll(arrayList);
        if (NB.vG) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Mxy.icD icd3 = list.get(i2);
                if (icd3 != null) {
                    Log.i("TAG_PROXY_POST_FILTER", icd3.pvs + ": " + icd3.icD);
                }
            }
        }
        return list;
    }

    public static List<Mxy.icD> pvs(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                Set<Map.Entry<String, String>> entrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : entrySet) {
                    arrayList.add(new Mxy.icD(entry.getKey(), entry.getValue()));
                }
                return arrayList;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static com.bykv.vk.openvk.component.video.pvs.icD.icD.pvs pvs(com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs pvsVar, vG vGVar, String str, int i) {
        String str2;
        String str3;
        String str4;
        com.bykv.vk.openvk.component.video.pvs.icD.icD.pvs pvs2 = vGVar.pvs(str, i);
        if (pvs2 != null) {
            return pvs2;
        }
        int pvs3 = pvs(pvsVar);
        String pvs4 = pvsVar.pvs(HttpHeaders.CONTENT_TYPE, null);
        if (pvs3 <= 0 || TextUtils.isEmpty(pvs4)) {
            return pvs2;
        }
        com.bykv.vk.openvk.component.video.pvs.icD.NB.NB yiw = pvsVar.yiw();
        if (yiw != null) {
            str3 = yiw.icD;
            str2 = icD(yiw.NB);
        } else {
            str2 = "";
            str3 = str2;
        }
        String icD2 = icD(pvsVar.vG());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestUrl", str3);
            jSONObject.put("requestHeaders", str2);
            jSONObject.put("responseHeaders", icD2);
            str4 = jSONObject.toString();
        } catch (Throwable unused) {
            str4 = "";
        }
        com.bykv.vk.openvk.component.video.pvs.icD.icD.pvs pvsVar2 = new com.bykv.vk.openvk.component.video.pvs.icD.icD.pvs(str, pvs4, pvs3, i, str4);
        vGVar.pvs(pvsVar2);
        return pvsVar2;
    }

    public static String icD(List<Mxy.icD> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Mxy.icD icd = list.get(0);
            if (icd != null) {
                sb.append(icd.pvs).append(": ").append(icd.icD).append("\r\n");
            }
        }
        return sb.toString();
    }

    public static String icD(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append((Object) entry.getKey()).append(": ").append((Object) entry.getValue()).append("\r\n");
        }
        return sb.toString();
    }
}
