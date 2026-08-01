package com.pgl.ssdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import com.bumptech.glide.load.Key;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.nio.charset.Charset;
import org.json.JSONArray;

/* compiled from: ExecuteIntelCid.java */
/* loaded from: classes3.dex */
public class B {
    private static String a(BufferedInputStream bufferedInputStream) {
        int read;
        byte[] bArr = new byte[4096];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb.append(new String(bArr, 0, read));
                }
            } catch (Exception unused) {
            }
        } while (read >= 4096);
        return sb.toString();
    }

    private static void b(LinkProperties linkProperties, JSONArray jSONArray) {
        for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
            if (linkAddress != null && linkAddress.getAddress() != null && !linkAddress.getAddress().isLoopbackAddress()) {
                jSONArray.put(linkAddress.getAddress().getHostAddress());
            }
        }
    }

    public static String[] b(Context context) {
        Network[] allNetworks;
        NetworkInfo networkInfo;
        LinkProperties linkProperties;
        int type;
        String[] strArr = new String[5];
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            JSONArray jSONArray5 = new JSONArray();
            for (Network network : allNetworks) {
                if (network != null && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.getState() == NetworkInfo.State.CONNECTED && (linkProperties = connectivityManager.getLinkProperties(network)) != null && ((type = networkInfo.getType()) == 0 || type == 1)) {
                    for (InetAddress inetAddress : linkProperties.getDnsServers()) {
                        if (inetAddress != null) {
                            jSONArray5.put(inetAddress.getHostAddress());
                        }
                    }
                    if (type == 0) {
                        b(linkProperties, jSONArray);
                        a(linkProperties, jSONArray2);
                    } else {
                        b(linkProperties, jSONArray3);
                        a(linkProperties, jSONArray4);
                    }
                }
            }
            strArr[0] = jSONArray3.toString();
            strArr[1] = jSONArray4.toString();
            strArr[2] = jSONArray.toString();
            strArr[3] = jSONArray2.toString();
            strArr[4] = jSONArray5.toString();
        }
        return strArr;
    }

    private static void a(LinkProperties linkProperties, JSONArray jSONArray) {
        InetAddress gateway;
        for (RouteInfo routeInfo : linkProperties.getRoutes()) {
            if (routeInfo != null && routeInfo.isDefaultRoute() && (gateway = routeInfo.getGateway()) != null && (!(gateway instanceof Inet6Address) || !"::".equals(gateway.getHostAddress()))) {
                jSONArray.put(gateway.getHostAddress());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(String str) {
        Process process;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        r0 = null;
        String str2 = null;
        try {
            process = Runtime.getRuntime().exec("sh");
            try {
                bufferedOutputStream = new BufferedOutputStream(process.getOutputStream());
                try {
                    bufferedInputStream = new BufferedInputStream(process.getInputStream());
                } catch (Exception unused) {
                    bufferedInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = null;
                }
            } catch (Exception unused2) {
                bufferedOutputStream = null;
                bufferedInputStream = null;
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException unused5) {
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused6) {
                    }
                }
                if (process != null) {
                    throw th;
                }
                process.destroy();
                throw th;
            }
        } catch (Exception unused7) {
            process = null;
        } catch (Throwable th3) {
            th = th3;
            process = null;
        }
        try {
            bufferedOutputStream.write(str.getBytes());
            bufferedOutputStream.write(10);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            process.waitFor();
            String a = a(bufferedInputStream);
            try {
                bufferedOutputStream.close();
            } catch (IOException unused8) {
            }
            try {
                bufferedInputStream.close();
            } catch (IOException unused9) {
            }
            str2 = a;
        } catch (Exception unused10) {
            if (bufferedOutputStream != null) {
            }
            if (bufferedInputStream != null) {
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
            }
            if (bufferedInputStream != null) {
            }
            if (process != null) {
            }
        }
        process.destroy();
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        if (r11.length() == 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized String a(Context context) {
        String str;
        synchronized (B.class) {
            try {
                String str2 = context.getFilesDir().getAbsolutePath() + "/dic";
                if (new File(str2).exists()) {
                    a("chmod 777 ".concat(String.valueOf(str2)));
                    String a = a(str2);
                    a("chmod 600 ".concat(String.valueOf(str2)));
                    if (a != null && a.length() > 0) {
                        return a;
                    }
                }
                InputStream open = context.getResources().getAssets().open("dic");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = open.read(bArr, 0, 4096);
                    if (read == -1) {
                        break;
                    }
                    byte[] bytes = "dic".getBytes(Charset.forName(Key.STRING_CHARSET_NAME));
                    for (int i = 0; i < read; i++) {
                        bArr[i] = (byte) (bArr[i] ^ bytes[i % bytes.length]);
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.close();
                a("chmod 777 ".concat(String.valueOf(str2)));
                str = a(str2);
                if (str == null || str.length() == 0) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(str2, "rw");
                    randomAccessFile.seek(16L);
                    randomAccessFile.write(new byte[]{2});
                    randomAccessFile.close();
                    str = a(str2);
                }
                a("chmod 600 ".concat(String.valueOf(str2)));
            } catch (Throwable unused) {
                str = "0[<!>]EXCEPTION[<!>]";
            }
            if (str != null) {
            }
            str = "0[<!>]ERROR[<!>]";
            return str;
        }
    }
}
