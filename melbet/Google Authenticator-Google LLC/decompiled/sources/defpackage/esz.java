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

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esz {
    private static volatile gzp a;

    private esz() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:8|(3:12|13|14)|20|21|22|23|24|25|26|(1:28)(1:74)|29|(9:31|32|33|34|35|(2:36|(3:38|(3:53|54|55)(7:40|41|(2:43|(1:46))|47|(1:49)|50|51)|52)(1:56))|57|58|59)(1:73)|60|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x005e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x005f, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r3);
        r3 = defpackage.gyf.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gzp a(Context context) {
        gzp gzpVar;
        Context a2;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        gzp gzpVar2;
        gzp gzpVar3 = a;
        if (gzpVar3 != null) {
            return gzpVar3;
        }
        synchronized (esz.class) {
            gzpVar = a;
            if (gzpVar == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                int i = etb.a;
                try {
                    if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                        gzpVar2 = gyf.a;
                        gzpVar = gzpVar2;
                        a = gzpVar;
                    }
                    StrictMode.allowThreadDiskWrites();
                    File file = new File(a2.getDir("phenotype_hermetic", 0), "overrides.txt");
                    gzp gzpVar4 = file.exists() ? gzp.h(file) : gyf.a;
                    if (gzpVar4.f()) {
                        Object b = gzpVar4.b();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) b)));
                            try {
                                qy qyVar = new qy(0);
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        Log.e("HermeticFileOverrides", a.ah(readLine, "Invalid: "));
                                    } else {
                                        String str3 = new String(split[0]);
                                        String decode = Uri.decode(new String(split[1]));
                                        String str4 = (String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            String str5 = new String(split[2]);
                                            str4 = Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        qy qyVar2 = (qy) qyVar.get(str3);
                                        if (qyVar2 == null) {
                                            qyVar2 = new qy(0);
                                            qyVar.put(str3, qyVar2);
                                        }
                                        qyVar2.put(decode, str4);
                                    }
                                }
                                Log.w("HermeticFileOverrides", "Parsed " + b.toString() + " for Android package " + a2.getPackageName());
                                bry bryVar = new bry(qyVar, (char[]) null);
                                bufferedReader.close();
                                gzpVar2 = gzp.h(bryVar);
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        gzpVar2 = gyf.a;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    gzpVar = gzpVar2;
                    a = gzpVar;
                } catch (Throwable th3) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th3;
                }
                a2 = djl.a(context);
                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            }
        }
        return gzpVar;
    }
}
