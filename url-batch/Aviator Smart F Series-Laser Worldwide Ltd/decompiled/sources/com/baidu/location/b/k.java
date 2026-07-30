package com.baidu.location.b;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import com.baidu.location.Jni;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.google.common.primitives.UnsignedBytes;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static k f4736a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f4737b = "0";
    private Handler F;

    /* renamed from: c, reason: collision with root package name */
    private int f4738c = 1;

    /* renamed from: d, reason: collision with root package name */
    private double f4739d = 0.699999988079071d;

    /* renamed from: e, reason: collision with root package name */
    private String f4740e = "3G|4G";

    /* renamed from: f, reason: collision with root package name */
    private int f4741f = 1;

    /* renamed from: g, reason: collision with root package name */
    private int f4742g = 307200;

    /* renamed from: h, reason: collision with root package name */
    private int f4743h = 15;

    /* renamed from: i, reason: collision with root package name */
    private int f4744i = 1;

    /* renamed from: j, reason: collision with root package name */
    private double f4745j = 3.5d;

    /* renamed from: k, reason: collision with root package name */
    private double f4746k = 3.0d;

    /* renamed from: l, reason: collision with root package name */
    private double f4747l = 0.5d;

    /* renamed from: m, reason: collision with root package name */
    private int f4748m = 300;

    /* renamed from: n, reason: collision with root package name */
    private int f4749n = 60;

    /* renamed from: o, reason: collision with root package name */
    private int f4750o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f4751p = 60;

    /* renamed from: q, reason: collision with root package name */
    private int f4752q = 0;

    /* renamed from: r, reason: collision with root package name */
    private long f4753r = 0;

    /* renamed from: s, reason: collision with root package name */
    private d f4754s = null;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4755t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f4756u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f4757v = 0;

    /* renamed from: w, reason: collision with root package name */
    private float f4758w = 0.0f;

    /* renamed from: x, reason: collision with root package name */
    private float f4759x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    private long f4760y = 0;

    /* renamed from: z, reason: collision with root package name */
    private int f4761z = 500;
    long A = 0;
    Location B = null;
    Location C = null;
    StringBuilder D = null;
    long E = 0;
    private byte[] G = new byte[4];
    private byte[] H = null;
    private int I = 0;
    private List<Byte> J = null;
    private boolean K = false;
    int L = 0;
    double M = 116.22345545d;
    double N = 40.245667323d;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Location f4762a;

        a(Location location) {
            this.f4762a = location;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.b(this.f4762a);
        }
    }

    class b extends Thread {
        b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            k.this.a(new File(com.baidu.location.e.i.h() + "/baidu/tempdata", "intime.dat"), "https://itsdata.map.baidu.com/long-conn-gps/sdk.php");
        }
    }

    private static class c implements HostnameVerifier {

        /* renamed from: a, reason: collision with root package name */
        private URL f4765a;

        public c(URL url) {
            this.f4765a = url;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return this.f4765a.getHost().equals(str);
        }
    }

    class d extends com.baidu.location.e.g {

        /* renamed from: o, reason: collision with root package name */
        String f4766o = null;

        public d() {
            this.f5229g = new HashMap();
        }

        @Override // com.baidu.location.e.g
        public void a() {
            this.f5225c = com.baidu.location.e.e.f5212k;
            String encode = Jni.encode(this.f4766o);
            this.f4766o = null;
            this.f5229g.put("q", encode);
        }

        public void a(String str) {
            this.f4766o = str;
            b(com.baidu.location.e.e.f5212k);
        }

        @Override // com.baidu.location.e.g
        public void a(boolean z7) {
            String str;
            if (z7 && (str = this.f5227e) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("prod", com.baidu.location.e.c.f5164a);
                    jSONObject.put("uptime", System.currentTimeMillis());
                    k.this.e(jSONObject.toString());
                } catch (Exception unused) {
                }
            }
            Map<String, Object> map = this.f5229g;
            if (map != null) {
                map.clear();
            }
        }
    }

    private k() {
        this.F = null;
        this.F = new Handler();
    }

    public static k a() {
        if (f4736a == null) {
            f4736a = new k();
        }
        return f4736a;
    }

    private String b(String str) {
        Calendar calendar = Calendar.getInstance();
        return String.format(str, Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)));
    }

    private void c() {
        if (this.K) {
            return;
        }
        this.K = true;
        d(com.baidu.location.e.c.f5164a);
        j();
        d();
    }

    private void d() {
        String[] split = "9.6.5.3".split("\\.");
        int length = split.length;
        byte[] bArr = this.G;
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
        bArr[3] = 0;
        if (length >= 4) {
            length = 4;
        }
        for (int i8 = 0; i8 < length; i8++) {
            try {
                this.G[i8] = (byte) (Integer.valueOf(split[i8]).intValue() & 255);
            } catch (Exception unused) {
            }
        }
        this.H = a(com.baidu.location.e.c.f5164a + ":" + com.baidu.location.e.c.a().f5171h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0102, code lost:
    
        if (r8 > 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x011a, code lost:
    
        r3 = (byte) (r3 | com.google.common.primitives.UnsignedBytes.MAX_POWER_OF_TWO);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0118, code lost:
    
        if (r8 > 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e(Location location) {
        byte bearing;
        if (location == null) {
            return;
        }
        int longitude = (int) ((location.getLongitude() - this.B.getLongitude()) * 1000000.0d);
        int latitude = (int) ((location.getLatitude() - this.B.getLatitude()) * 1000000.0d);
        int i8 = !location.hasBearing() ? 1 : 0;
        int i9 = !location.hasSpeed() ? 1 : 0;
        char c8 = longitude > 0 ? (char) 0 : (char) 1;
        int abs = Math.abs(longitude);
        char c9 = latitude > 0 ? (char) 0 : (char) 1;
        int abs2 = Math.abs(latitude);
        if (this.I > 1) {
            this.C = this.B;
        }
        this.B = location;
        if (this.C != null && location.getTime() > this.C.getTime() && this.B.getTime() - this.C.getTime() < 5000) {
            long time = this.B.getTime() - this.C.getTime();
            float[] fArr = new float[2];
            Location.distanceBetween(this.B.getAltitude(), this.B.getLongitude(), this.C.getLatitude(), this.C.getLongitude(), fArr);
            double speed = ((fArr[0] - (this.C.getSpeed() * time)) * 2.0f) / (time * time);
            if (speed > this.f4759x) {
                this.f4759x = (float) speed;
            }
        }
        this.J.add(Byte.valueOf((byte) (abs & 255)));
        this.J.add(Byte.valueOf((byte) ((abs & 65280) >> 8)));
        this.J.add(Byte.valueOf((byte) (abs2 & 255)));
        this.J.add(Byte.valueOf((byte) ((abs2 & 65280) >> 8)));
        if (i8 > 0) {
            bearing = c9 > 0 ? (byte) 96 : (byte) 32;
        } else {
            bearing = (byte) (((byte) (((int) (location.getBearing() / 15.0f)) & 255)) & 31);
            if (c9 > 0) {
                bearing = (byte) (bearing | 64);
            }
        }
        this.J.add(Byte.valueOf(bearing));
        if (i9 > 0) {
            this.J.add(Byte.valueOf(UnsignedBytes.MAX_POWER_OF_TWO));
        } else {
            this.J.add(Byte.valueOf((byte) (((byte) (((int) ((location.getSpeed() * 3.6d) / 4.0d)) & 255)) & Byte.MAX_VALUE)));
        }
    }

    private boolean f() {
        if (this.f4755t) {
            if (!this.f4756u) {
                if (this.f4758w >= this.f4747l) {
                    return true;
                }
                this.f4756u = true;
                this.f4757v = this.f4743h;
                return true;
            }
            if (this.f4758w >= this.f4747l) {
                this.f4757v = 0;
                this.f4756u = false;
                return true;
            }
            int i8 = this.f4757v + this.f4743h;
            this.f4757v = i8;
            if (i8 <= this.f4748m || System.currentTimeMillis() - this.f4760y > this.f4749n * 1000) {
                return true;
            }
        } else {
            if (this.f4758w >= this.f4745j || this.f4759x >= this.f4746k) {
                this.f4755t = true;
                return true;
            }
            if (this.f4750o == 1 && System.currentTimeMillis() - this.f4760y > this.f4751p * 1000) {
                return true;
            }
        }
        return false;
    }

    private void g() {
        this.J = null;
        this.E = 0L;
        this.I = 0;
        this.B = null;
        this.C = null;
        this.f4758w = 0.0f;
        this.f4759x = 0.0f;
    }

    private void h() {
        if (this.E == 0 || System.currentTimeMillis() - this.E < this.f4743h * 1000) {
            return;
        }
        if (com.baidu.location.f.getServiceContext().getSharedPreferences("loc_navi_mode", 4).getBoolean("is_navi_on", false)) {
            g();
            return;
        }
        if (this.f4741f == 1 && !f()) {
            g();
            return;
        }
        if (com.baidu.location.e.c.f5164a.equals("com.ubercab.driver")) {
            if (e()) {
                g();
                return;
            }
        } else if (!a(com.baidu.location.e.c.f5164a, com.baidu.location.f.getServiceContext())) {
            g();
            return;
        }
        List<Byte> list = this.J;
        if (list != null) {
            try {
                int size = list.size();
                this.J.set(0, Byte.valueOf((byte) (size & 255)));
                this.J.set(1, Byte.valueOf((byte) ((65280 & size) >> 8)));
                this.J.set(3, Byte.valueOf((byte) (this.I & 255)));
                byte[] bArr = new byte[size];
                for (int i8 = 0; i8 < size; i8++) {
                    bArr[i8] = this.J.get(i8).byteValue();
                }
                File file = new File(com.baidu.location.e.i.h(), "baidu/tempdata");
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (file.exists()) {
                    File file2 = new File(file, "intime.dat");
                    if (file2.exists()) {
                        file2.delete();
                    }
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                        bufferedOutputStream.write(bArr);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        new b().start();
                    } catch (Exception unused) {
                    }
                }
                g();
                this.f4760y = System.currentTimeMillis();
            } catch (Exception unused2) {
            }
        }
    }

    private void i() {
        List<Byte> list;
        byte b8;
        this.J.add((byte) 0);
        this.J.add((byte) 0);
        if (f4737b.equals("0")) {
            list = this.J;
            b8 = -82;
        } else {
            list = this.J;
            b8 = -66;
        }
        list.add(Byte.valueOf(b8));
        this.J.add((byte) 0);
        this.J.add(Byte.valueOf(this.G[0]));
        this.J.add(Byte.valueOf(this.G[1]));
        this.J.add(Byte.valueOf(this.G[2]));
        this.J.add(Byte.valueOf(this.G[3]));
        int length = this.H.length;
        this.J.add(Byte.valueOf((byte) ((length + 1) & 255)));
        for (int i8 = 0; i8 < length; i8++) {
            this.J.add(Byte.valueOf(this.H[i8]));
        }
    }

    private void j() {
        if (System.currentTimeMillis() - this.f4753r > 86400000) {
            if (this.f4754s == null) {
                this.f4754s = new d();
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(com.baidu.location.e.c.a().a(false));
            stringBuffer.append(com.baidu.location.b.d.a().c());
            stringBuffer.append("&cnloc=");
            stringBuffer.append(n.a().b());
            this.f4754s.a(stringBuffer.toString());
        }
        k();
    }

    private void k() {
    }

    private void c(int i8) {
        if (i8 == 0) {
            return;
        }
        try {
            File file = new File(com.baidu.location.e.h.f5254a + "/grtcf.dat");
            if (!file.exists()) {
                File file2 = new File(com.baidu.location.e.h.f5254a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file.createNewFile()) {
                    return;
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(2L);
                randomAccessFile.writeInt(0);
                randomAccessFile.seek(8L);
                byte[] bytes = "1980_01_01:0".getBytes();
                randomAccessFile.writeInt(bytes.length);
                randomAccessFile.write(bytes);
                randomAccessFile.seek(200L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.seek(800L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.close();
            }
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            randomAccessFile2.seek(8L);
            byte[] bytes2 = (b("%d_%02d_%02d") + ":" + i8).getBytes();
            randomAccessFile2.writeInt(bytes2.length);
            randomAccessFile2.write(bytes2);
            randomAccessFile2.close();
        } catch (Exception unused) {
        }
    }

    private void d(Location location) {
        this.E = System.currentTimeMillis();
        b((int) (location.getTime() / 1000));
        b((int) (location.getLongitude() * 1000000.0d));
        b((int) (location.getLatitude() * 1000000.0d));
        int i8 = !location.hasBearing() ? 1 : 0;
        int i9 = !location.hasSpeed() ? 1 : 0;
        if (i8 > 0) {
            this.J.add((byte) 32);
        } else {
            this.J.add(Byte.valueOf((byte) (((byte) (((int) (location.getBearing() / 15.0f)) & 255)) & (-33))));
        }
        if (i9 > 0) {
            this.J.add(Byte.valueOf(UnsignedBytes.MAX_POWER_OF_TWO));
        } else {
            this.J.add(Byte.valueOf((byte) (((byte) (((int) ((location.getSpeed() * 3.6d) / 4.0d)) & 255)) & Byte.MAX_VALUE)));
        }
        this.B = location;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        try {
            File file = new File(com.baidu.location.e.h.f5254a + "/grtcf.dat");
            if (!file.exists()) {
                File file2 = new File(com.baidu.location.e.h.f5254a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file.createNewFile()) {
                    return;
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(2L);
                randomAccessFile.writeInt(0);
                randomAccessFile.seek(8L);
                byte[] bytes = "1980_01_01:0".getBytes();
                randomAccessFile.writeInt(bytes.length);
                randomAccessFile.write(bytes);
                randomAccessFile.seek(200L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.seek(800L);
                randomAccessFile.writeBoolean(false);
                randomAccessFile.close();
            }
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
            randomAccessFile2.seek(2L);
            int readInt = randomAccessFile2.readInt();
            int i8 = 1;
            while (i8 <= readInt) {
                randomAccessFile2.seek(i8 * 2048);
                int readInt2 = randomAccessFile2.readInt();
                byte[] bArr = new byte[readInt2];
                randomAccessFile2.read(bArr, 0, readInt2);
                if (new String(bArr).contains(com.baidu.location.e.c.f5164a)) {
                    break;
                } else {
                    i8++;
                }
            }
            if (i8 >= readInt) {
                randomAccessFile2.seek(2L);
                randomAccessFile2.writeInt(i8);
            }
            randomAccessFile2.seek(i8 * 2048);
            byte[] bytes2 = str.getBytes();
            randomAccessFile2.writeInt(bytes2.length);
            randomAccessFile2.write(bytes2);
            randomAccessFile2.close();
        } catch (Exception unused) {
        }
    }

    public void b() {
        if (this.K) {
            this.K = false;
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(File file, String str) {
        String uuid = UUID.randomUUID().toString();
        try {
            try {
                HttpsURLConnection.setDefaultSSLSocketFactory(com.baidu.location.e.i.k());
                URL url = new URL(str);
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setUseCaches(false);
                httpsURLConnection.setRequestMethod(HttpManager.HTTP_POST);
                httpsURLConnection.setRequestProperty("Charset", "utf-8");
                httpsURLConnection.setHostnameVerifier(new c(url));
                httpsURLConnection.setRequestProperty("connection", "close");
                httpsURLConnection.setRequestProperty("Content-Type", com.yanzhenjie.kalle.i.VALUE_APPLICATION_FORM + ";boundary=" + uuid);
                if (file == null || !file.exists()) {
                    return "0";
                }
                OutputStream outputStream = httpsURLConnection.getOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(HttpClient.ENDFLAG);
                stringBuffer.append(uuid);
                stringBuffer.append("\r\n");
                stringBuffer.append("Content-Disposition: form-data; name=\"location_dat\"; filename=\"" + file.getName() + "\"\r\n");
                StringBuilder sb = new StringBuilder();
                sb.append("Content-Type: application/octet-stream; charset=utf-8");
                sb.append("\r\n");
                stringBuffer.append(sb.toString());
                stringBuffer.append("\r\n");
                dataOutputStream.write(stringBuffer.toString().getBytes());
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    dataOutputStream.write(bArr, 0, read);
                }
                fileInputStream.close();
                dataOutputStream.write("\r\n".getBytes());
                dataOutputStream.write((HttpClient.ENDFLAG + uuid + HttpClient.ENDFLAG + "\r\n").getBytes());
                dataOutputStream.flush();
                dataOutputStream.close();
                int responseCode = httpsURLConnection.getResponseCode();
                outputStream.close();
                httpsURLConnection.disconnect();
                int i8 = this.f4752q + 400;
                this.f4752q = i8;
                c(i8);
                return responseCode == 200 ? "1" : "0";
            } catch (Exception e8) {
                e8.printStackTrace();
                return "0";
            }
        } catch (MalformedURLException | IOException unused) {
            return "0";
        }
    }

    private void b(int i8) {
        byte[] a8 = a(i8);
        for (int i9 = 0; i9 < 4; i9++) {
            this.J.add(Byte.valueOf(a8[i9]));
        }
    }

    private void c(Location location) {
        if (System.currentTimeMillis() - this.A < this.f4761z || location == null) {
            return;
        }
        if (location.hasSpeed() && location.getSpeed() > this.f4758w) {
            this.f4758w = location.getSpeed();
        }
        try {
            if (this.J == null) {
                this.J = new ArrayList();
                i();
                d(location);
            } else {
                e(location);
            }
        } catch (Exception unused) {
        }
        this.I++;
    }

    private void d(String str) {
        try {
            File file = new File(com.baidu.location.e.h.f5254a + "/grtcf.dat");
            if (file.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(2L);
                int readInt = randomAccessFile.readInt();
                randomAccessFile.seek(8L);
                int readInt2 = randomAccessFile.readInt();
                int i8 = 1;
                if (readInt2 < 4096) {
                    byte[] bArr = new byte[readInt2];
                    randomAccessFile.read(bArr, 0, readInt2);
                    String str2 = new String(bArr);
                    if (str2.contains(b("%d_%02d_%02d")) && str2.contains(":")) {
                        try {
                            String[] split = str2.split(":");
                            if (split.length > 1) {
                                this.f4752q = Integer.valueOf(split[1]).intValue();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                while (true) {
                    if (i8 > readInt) {
                        break;
                    }
                    randomAccessFile.seek(i8 * 2048);
                    int readInt3 = randomAccessFile.readInt();
                    if (readInt3 <= 4096) {
                        byte[] bArr2 = new byte[readInt3];
                        randomAccessFile.read(bArr2, 0, readInt3);
                        String str3 = new String(bArr2);
                        if (str != null && str3.contains(str)) {
                            c(str3);
                            break;
                        }
                    }
                    i8++;
                }
                randomAccessFile.close();
            }
        } catch (Exception unused2) {
        }
    }

    private boolean e() {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel;
        Throwable th;
        FileChannel fileChannel2 = null;
        FileLock fileLock = null;
        RandomAccessFile randomAccessFile2 = null;
        boolean z7 = false;
        try {
            File file = new File(com.baidu.location.e.i.f() + File.separator + "gflk.dat");
            if (!file.exists()) {
                file.createNewFile();
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
        try {
            fileChannel = randomAccessFile.getChannel();
        } catch (Exception unused2) {
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile = randomAccessFile2;
                randomAccessFile.close();
            }
            return z7;
        } catch (Throwable th3) {
            fileChannel = null;
            th = th3;
        }
        try {
            fileLock = fileChannel.tryLock();
        } catch (Exception unused3) {
            z7 = true;
        } catch (Throwable th4) {
            th = th4;
            th = th;
            fileChannel2 = fileChannel;
            if (fileChannel2 != null) {
                try {
                    fileChannel2.close();
                } catch (Exception unused4) {
                    throw th;
                }
            }
            if (randomAccessFile == null) {
                throw th;
            }
            randomAccessFile.close();
            throw th;
        }
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (Exception unused5) {
            }
        }
        if (fileChannel != null) {
            fileChannel.close();
        }
        randomAccessFile.close();
        return z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Location location) {
        c(location);
        h();
    }

    private void c(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("on")) {
                    this.f4738c = jSONObject.getInt("on");
                }
                if (jSONObject.has("bash")) {
                    this.f4739d = jSONObject.getDouble("bash");
                }
                if (jSONObject.has("net")) {
                    this.f4740e = jSONObject.getString("net");
                }
                if (jSONObject.has("tcon")) {
                    this.f4741f = jSONObject.getInt("tcon");
                }
                if (jSONObject.has("tcsh")) {
                    this.f4742g = jSONObject.getInt("tcsh");
                }
                if (jSONObject.has("per")) {
                    this.f4743h = jSONObject.getInt("per");
                }
                if (jSONObject.has("chdron")) {
                    this.f4744i = jSONObject.getInt("chdron");
                }
                if (jSONObject.has("spsh")) {
                    this.f4745j = jSONObject.getDouble("spsh");
                }
                if (jSONObject.has("acsh")) {
                    this.f4746k = jSONObject.getDouble("acsh");
                }
                if (jSONObject.has("stspsh")) {
                    this.f4747l = jSONObject.getDouble("stspsh");
                }
                if (jSONObject.has("drstsh")) {
                    this.f4748m = jSONObject.getInt("drstsh");
                }
                if (jSONObject.has("stper")) {
                    this.f4749n = jSONObject.getInt("stper");
                }
                if (jSONObject.has("nondron")) {
                    this.f4750o = jSONObject.getInt("nondron");
                }
                if (jSONObject.has("nondrper")) {
                    this.f4751p = jSONObject.getInt("nondrper");
                }
                if (jSONObject.has("uptime")) {
                    this.f4753r = jSONObject.getLong("uptime");
                }
                k();
            } catch (JSONException unused) {
            }
        }
    }

    public void a(Location location) {
        if (!this.K) {
            c();
        }
        if (this.f4738c == 1 && this.f4740e.contains(com.baidu.location.c.d.a(com.baidu.location.c.h.a().g()))) {
            if (this.f4741f != 1 || this.f4752q <= this.f4742g) {
                this.F.post(new a(location));
            }
        }
    }

    private boolean a(String str, Context context) {
        return true;
    }

    private byte[] a(int i8) {
        return new byte[]{(byte) (i8 & 255), (byte) ((65280 & i8) >> 8), (byte) ((16711680 & i8) >> 16), (byte) ((i8 & (-16777216)) >> 24)};
    }

    private byte[] a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes();
        byte nextInt = (byte) new SecureRandom().nextInt(255);
        byte nextInt2 = (byte) new SecureRandom().nextInt(255);
        byte[] bArr = new byte[bytes.length + 2];
        int length = bytes.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            bArr[i9] = (byte) (bytes[i8] ^ nextInt);
            i8++;
            i9++;
        }
        bArr[i9] = nextInt;
        bArr[i9 + 1] = nextInt2;
        return bArr;
    }
}
