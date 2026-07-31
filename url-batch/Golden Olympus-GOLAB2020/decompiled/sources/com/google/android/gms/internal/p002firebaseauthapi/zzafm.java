package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.collection.a;
import com.google.firebase.FirebaseApp;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzafm {
    private static final Map<String, zzafl> zza = new a();
    private static final Map<String, List<WeakReference<zzafo>>> zzb = new a();

    private static String zza(String str, int i4, boolean z4) {
        if (z4) {
            return "http://[" + str + "]:" + i4 + "/";
        }
        return "http://" + str + StringUtils.PROCESS_POSTFIX_DELIMITER + i4 + "/";
    }

    public static String zzb(String str) {
        zzafl zzaflVar;
        String str2;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        if (zzaflVar != null) {
            str2 = "" + zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(StringUtils.PROCESS_POSTFIX_DELIMITER));
        } else {
            str2 = "https://";
        }
        return str2 + "www.googleapis.com/identitytoolkit/v3/relyingparty";
    }

    public static String zzc(String str) {
        zzafl zzaflVar;
        String str2;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        if (zzaflVar != null) {
            str2 = "" + zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(StringUtils.PROCESS_POSTFIX_DELIMITER));
        } else {
            str2 = "https://";
        }
        return str2 + "identitytoolkit.googleapis.com/v2";
    }

    public static String zzd(String str) {
        zzafl zzaflVar;
        String str2;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        if (zzaflVar != null) {
            str2 = "" + zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(StringUtils.PROCESS_POSTFIX_DELIMITER));
        } else {
            str2 = "https://";
        }
        return str2 + "securetoken.googleapis.com/v1";
    }

    public static String zza(String str) {
        zzafl zzaflVar;
        Map<String, zzafl> map = zza;
        synchronized (map) {
            zzaflVar = map.get(str);
        }
        if (zzaflVar != null) {
            return zza(zzaflVar.zzb(), zzaflVar.zza(), zzaflVar.zzb().contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) + "emulator/auth/handler";
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzafo zzafoVar) {
        Map<String, List<WeakReference<zzafo>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzafoVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference<>(zzafoVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zza(FirebaseApp firebaseApp, String str, int i4) {
        String apiKey = firebaseApp.getOptions().getApiKey();
        Map<String, zzafl> map = zza;
        synchronized (map) {
            map.put(apiKey, new zzafl(str, i4));
        }
        Map<String, List<WeakReference<zzafo>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(apiKey)) {
                    Iterator<WeakReference<zzafo>> it = map2.get(apiKey).iterator();
                    boolean z4 = false;
                    while (it.hasNext()) {
                        zzafo zzafoVar = it.next().get();
                        if (zzafoVar != null) {
                            zzafoVar.zza();
                            z4 = true;
                        }
                    }
                    if (!z4) {
                        zza.remove(apiKey);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(FirebaseApp firebaseApp) {
        return zza.containsKey(firebaseApp.getOptions().getApiKey());
    }
}
