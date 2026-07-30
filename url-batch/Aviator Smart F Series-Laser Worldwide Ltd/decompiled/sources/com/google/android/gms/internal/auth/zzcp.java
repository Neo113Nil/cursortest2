package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import cn.hutool.core.text.l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes3.dex */
public final class zzcp {

    @GuardedBy("CachingReader.class")
    private static volatile zzdh zza;

    private zzcp() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:6|(5:8|(1:10)|11|12|13)|14|(5:16|(1:18)|11|12|13)|19|(2:21|(1:23))|24|25|26|27|28|29|30|(1:32)(1:83)|33|(10:35|36|37|38|39|40|(2:41|(3:43|(3:58|59|60)(7:45|46|(2:48|(1:51))|52|(1:54)|55|56)|57)(1:61))|62|63|64)(1:82)|65|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x006f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0070, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r3);
        r3 = com.google.android.gms.internal.auth.zzdh.zzc();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzdh zza(Context context) {
        zzdh zzdhVar;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        zzdh zzc;
        boolean isDeviceProtectedStorage;
        synchronized (zzcp.class) {
            try {
                zzdhVar = zza;
                if (zzdhVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        zzc = zzdh.zzc();
                        zzdhVar = zzc;
                        zza = zzdhVar;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        zzc = zzdh.zzc();
                        zzdhVar = zzc;
                        zza = zzdhVar;
                    }
                    if (zzcc.zzb()) {
                        isDeviceProtectedStorage = context.isDeviceProtectedStorage();
                        if (!isDeviceProtectedStorage) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                    }
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                    zzdh zzc2 = file.exists() ? zzdh.zzd(file) : zzdh.zzc();
                    if (zzc2.zzb()) {
                        File file2 = (File) zzc2.zza();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                            try {
                                SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(l.SPACE, 3);
                                    if (split.length != 3) {
                                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
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
                                        if (!simpleArrayMap.containsKey(str3)) {
                                            simpleArrayMap.put(str3, new SimpleArrayMap());
                                        }
                                        ((SimpleArrayMap) simpleArrayMap.get(str3)).put(decode, str4);
                                    }
                                }
                                Log.w("HermeticFileOverrides", "Parsed " + file2.toString() + " for Android package " + context.getPackageName());
                                zzci zzciVar = new zzci(simpleArrayMap);
                                bufferedReader.close();
                                zzc = zzdh.zzd(zzciVar);
                            } finally {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        } catch (IOException e8) {
                            throw new RuntimeException(e8);
                        }
                    } else {
                        zzc = zzdh.zzc();
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    zzdhVar = zzc;
                    zza = zzdhVar;
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th2;
            } finally {
            }
        }
        return zzdhVar;
    }
}
