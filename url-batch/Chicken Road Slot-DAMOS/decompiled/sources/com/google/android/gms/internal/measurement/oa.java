package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.util.Log;
import com.appsflyer.attribution.RequestError;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class oa {

    /* renamed from: a, reason: collision with root package name */
    public static volatile a8.g f2637a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2638b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static Thread f2639c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Handler f2640d;

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:22)(1:88)|23|24|25|26|27|28|29|(1:31)(1:80)|32|(9:34|35|36|37|38|(2:39|(3:41|(3:57|58|59)(7:43|44|(2:46|(1:49))|50|(1:52)(1:56)|53|54)|55)(1:60))|61|62|63)(1:79)|64|14) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0070, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r0);
        r5 = a8.a.f339d;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a8.g b(Context context) {
        a8.g gVar;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        a8.g gVar2;
        char c10;
        a8.g gVar3 = f2637a;
        if (gVar3 != null) {
            return gVar3;
        }
        synchronized (oa.class) {
            try {
                gVar = f2637a;
                if (gVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    s.e eVar = pa.f2670a;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        gVar = a8.a.f339d;
                        f2637a = gVar;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        gVar = a8.a.f339d;
                        f2637a = gVar;
                    }
                    Context createDeviceProtectedStorageContext = !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    char c11 = 0;
                    File file = new File(createDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                    a8.g gVar4 = file.exists() ? new a8.i(file) : a8.a.f339d;
                    if (gVar4.b()) {
                        File file2 = (File) gVar4.a();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                            try {
                                s.r0 r0Var = new s.r0(0);
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        StringBuilder sb2 = new StringBuilder(readLine.length() + 9);
                                        sb2.append("Invalid: ");
                                        sb2.append(readLine);
                                        Log.e("HermeticFileOverrides", sb2.toString());
                                    } else {
                                        String str3 = new String(split[c11]);
                                        String decode = Uri.decode(new String(split[1]));
                                        String str4 = (String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            String str5 = new String(split[2]);
                                            str4 = Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        s.r0 r0Var2 = (s.r0) r0Var.get(str3);
                                        if (r0Var2 == null) {
                                            c10 = 0;
                                            r0Var2 = new s.r0(0);
                                            r0Var.put(str3, r0Var2);
                                        } else {
                                            c10 = 0;
                                        }
                                        r0Var2.put(decode, str4);
                                        c11 = c10;
                                    }
                                }
                                String obj = file2.toString();
                                String packageName = createDeviceProtectedStorageContext.getPackageName();
                                StringBuilder sb3 = new StringBuilder(obj.length() + 28 + String.valueOf(packageName).length());
                                sb3.append("Parsed ");
                                sb3.append(obj);
                                sb3.append(" for Android package ");
                                sb3.append(packageName);
                                Log.w("HermeticFileOverrides", sb3.toString());
                                na naVar = new na(r0Var);
                                bufferedReader.close();
                                gVar2 = new a8.i(naVar);
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        gVar2 = a8.a.f339d;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    gVar = gVar2;
                    f2637a = gVar;
                }
            } catch (Throwable th3) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th3;
            } finally {
            }
        }
        return gVar;
    }

    public static f5 c(Object obj) {
        if (obj == null) {
            return f5.f2281c;
        }
        if (obj instanceof String) {
            return new i5((String) obj);
        }
        if (obj instanceof Double) {
            return new l3((Double) obj);
        }
        if (obj instanceof Long) {
            return new l3(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new l3(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new d2((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                te.a1.e("Invalid value type");
                return null;
            }
            n1 n1Var = new n1();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                n1Var.s(n1Var.q(), c(it.next()));
            }
            return n1Var;
        }
        c5 c5Var = new c5();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            f5 c10 = c(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                c5Var.k((String) obj2, c10);
            }
        }
        return c5Var;
    }

    public static String d(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length);
        for (byte b10 : bArr) {
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb2.append("\\a");
                        break;
                    case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) b10);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static void e(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static boolean f(Thread thread) {
        if (f2639c == null) {
            f2639c = Looper.getMainLooper().getThread();
        }
        return thread == f2639c;
    }

    public static Handler g() {
        if (f2640d == null) {
            synchronized (f2638b) {
                try {
                    if (f2640d == null) {
                        f2640d = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f2640d;
    }

    public static f5 h(r9 r9Var) {
        if (r9Var == null) {
            return f5.f2280b;
        }
        int B = r9Var.B() - 1;
        if (B == 1) {
            return r9Var.v() ? new i5(r9Var.w()) : f5.f2285l;
        }
        if (B == 2) {
            return r9Var.z() ? new l3(Double.valueOf(r9Var.A())) : new l3(null);
        }
        if (B == 3) {
            return r9Var.x() ? new d2(Boolean.valueOf(r9Var.y())) : new d2(null);
        }
        if (B != 4) {
            te.a1.e("Unknown type found. Cannot convert entity");
            return null;
        }
        List t6 = r9Var.t();
        ArrayList arrayList = new ArrayList();
        Iterator it = t6.iterator();
        while (it.hasNext()) {
            arrayList.add(h((r9) it.next()));
        }
        return new g5(r9Var.u(), arrayList);
    }

    public abstract int a();

    public abstract vg i(int i3);

    public abstract Object j(int i3);

    public abstract Object k(vg vgVar);
}
