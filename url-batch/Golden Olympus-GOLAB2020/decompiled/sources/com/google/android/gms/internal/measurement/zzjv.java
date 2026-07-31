package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.g;
import com.google.common.base.Optional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzjv {
    private static volatile Optional zza;

    private zzjv() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:8|(5:10|(1:12)|13|14|15)|16|(5:18|(1:20)|13|14|15)|21|(1:25)|26|27|28|29|30|31|32|(1:34)(1:81)|35|(9:37|38|39|40|41|(2:42|(3:44|(3:59|60|61)(7:46|47|(2:49|(1:52))|53|(1:55)|56|57)|58)(1:62))|63|64|65)(1:80)|66|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0075, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0076, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r3);
        r3 = com.google.common.base.Optional.absent();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Optional zza(Context context) {
        Optional optional;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        Optional absent;
        Optional optional2 = zza;
        if (optional2 != null) {
            return optional2;
        }
        synchronized (zzjv.class) {
            try {
                optional = zza;
                if (optional == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    int i4 = zzjx.zza;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        absent = Optional.absent();
                        optional = absent;
                        zza = optional;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        absent = Optional.absent();
                        optional = absent;
                        zza = optional;
                    }
                    if (zzji.zzc() && !context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                    Optional absent2 = file.exists() ? Optional.of(file) : Optional.absent();
                    if (absent2.isPresent()) {
                        File file2 = (File) absent2.get();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                            try {
                                g gVar = new g();
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
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
                                        g gVar2 = (g) gVar.get(str3);
                                        if (gVar2 == null) {
                                            gVar2 = new g();
                                            gVar.put(str3, gVar2);
                                        }
                                        gVar2.put(decode, str4);
                                    }
                                }
                                Log.w("HermeticFileOverrides", "Parsed " + file2.toString() + " for Android package " + context.getPackageName());
                                zzjo zzjoVar = new zzjo(gVar);
                                bufferedReader.close();
                                absent = Optional.of(zzjoVar);
                            } finally {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                        } catch (IOException e4) {
                            throw new RuntimeException(e4);
                        }
                    } else {
                        absent = Optional.absent();
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    optional = absent;
                    zza = optional;
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th2;
            } finally {
            }
        }
        return optional;
    }
}
