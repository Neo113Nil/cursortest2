package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u9 implements zf0, pq2 {
    public Context m;

    public u9(Context context, int i) {
        switch (i) {
            case 2:
                this.m = context.getApplicationContext();
                break;
            case 3:
                this.m = context;
                break;
            case 4:
                ll3.v(context);
                Context applicationContext = context.getApplicationContext();
                ll3.v(applicationContext);
                this.m = applicationContext;
                break;
            default:
                this.m = context.getApplicationContext();
                break;
        }
    }

    @Override // defpackage.zf0
    public void a(s93 s93Var) {
        t00 t00Var = new t00("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), t00Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new s50(this, s93Var, threadPoolExecutor, 2));
    }

    public g60 b() {
        Context context = this.m;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        g60 g60Var = new g60();
        g60Var.m = mc0.a(bd3.e);
        j31 j31Var = new j31(context);
        g60Var.n = j31Var;
        int i = 26;
        g60Var.o = mc0.a(new t21(i, j31Var, new ar0(18, j31Var)));
        j31 j31Var2 = g60Var.n;
        g60Var.p = new vi0(j31Var2, 1);
        w52 a = mc0.a(new tt1(9, g60Var.p, mc0.a(new vi0(j31Var2, 0))));
        g60Var.q = a;
        nm1 nm1Var = new nm1(25);
        j31 j31Var3 = g60Var.n;
        mh mhVar = new mh(j31Var3, a, nm1Var, 22);
        w52 w52Var = g60Var.m;
        w52 w52Var2 = g60Var.o;
        fy fyVar = new fy(w52Var, w52Var2, mhVar, a, a);
        oy2 oy2Var = new oy2();
        oy2Var.m = j31Var3;
        oy2Var.n = w52Var2;
        oy2Var.o = a;
        oy2Var.p = mhVar;
        oy2Var.q = w52Var;
        oy2Var.r = a;
        oy2Var.s = a;
        g60Var.r = mc0.a(new mh(fyVar, oy2Var, new js0(w52Var, a, mhVar, a), i));
        return g60Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:22)|23|24|25|26|27|28|29|(1:31)(1:80)|32|(9:34|35|36|37|38|(2:39|(3:41|(3:57|58|59)(7:43|44|(2:46|(1:49))|50|(1:52)(1:56)|53|54)|55)(1:60))|61|62|63)(1:79)|64|14) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0073, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0074, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r0);
        r5 = defpackage.t.m;
     */
    /* JADX WARN: Finally extract failed */
    @Override // defpackage.pq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object get() {
        sw1 sw1Var;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        char c;
        Object obj = tl3.g;
        Context context = this.m;
        sw1 sw1Var2 = ll3.a;
        if (sw1Var2 != null) {
            return sw1Var2;
        }
        synchronized (ll3.class) {
            try {
                sw1Var = ll3.a;
                if (sw1Var == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    hi hiVar = rl3.a;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        sw1Var = t.m;
                        ll3.a = sw1Var;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        sw1Var = t.m;
                        ll3.a = sw1Var;
                    }
                    if (!context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    Context context2 = context;
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    char c2 = 0;
                    File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                    sw1 sw1Var3 = file.exists() ? new p42(file) : t.m;
                    if (sw1Var3.b()) {
                        File file2 = (File) sw1Var3.a();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                            try {
                                fl2 fl2Var = new fl2(0);
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        StringBuilder sb = new StringBuilder(readLine.length() + 9);
                                        sb.append("Invalid: ");
                                        sb.append(readLine);
                                        Log.e("HermeticFileOverrides", sb.toString());
                                    } else {
                                        String str3 = new String(split[c2]);
                                        String decode = Uri.decode(new String(split[1]));
                                        String str4 = (String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            String str5 = new String(split[2]);
                                            str4 = Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        fl2 fl2Var2 = (fl2) fl2Var.get(str3);
                                        if (fl2Var2 == null) {
                                            c = 0;
                                            fl2Var2 = new fl2(0);
                                            fl2Var.put(str3, fl2Var2);
                                        } else {
                                            c = 0;
                                        }
                                        fl2Var2.put(decode, str4);
                                        c2 = c;
                                    }
                                }
                                String obj2 = file2.toString();
                                String packageName = context2.getPackageName();
                                StringBuilder sb2 = new StringBuilder(obj2.length() + 28 + String.valueOf(packageName).length());
                                sb2.append("Parsed ");
                                sb2.append(obj2);
                                sb2.append(" for Android package ");
                                sb2.append(packageName);
                                Log.w("HermeticFileOverrides", sb2.toString());
                                gl3 gl3Var = new gl3(fl2Var);
                                bufferedReader.close();
                                sw1Var = new p42(gl3Var);
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        sw1Var = t.m;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    ll3.a = sw1Var;
                }
            } catch (Throwable th3) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th3;
            } finally {
            }
        }
        return sw1Var;
    }
}
