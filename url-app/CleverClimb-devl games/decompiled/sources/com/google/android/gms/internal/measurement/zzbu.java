package com.google.android.gms.internal.measurement;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbu {
    private final zzat zzqh;
    private volatile Boolean zzxu;
    private String zzxv;
    private Set<Integer> zzxw;

    protected zzbu(zzat zzatVar) {
        Preconditions.checkNotNull(zzatVar);
        this.zzqh = zzatVar;
    }

    public static boolean zzdt() {
        return zzcc.zzyg.get().booleanValue();
    }

    public static int zzdu() {
        return zzcc.zzzd.get().intValue();
    }

    public static long zzdv() {
        return zzcc.zzyo.get().longValue();
    }

    public static long zzdw() {
        return zzcc.zzyr.get().longValue();
    }

    public static int zzdx() {
        return zzcc.zzyt.get().intValue();
    }

    public static int zzdy() {
        return zzcc.zzyu.get().intValue();
    }

    @VisibleForTesting
    public static String zzdz() {
        return zzcc.zzyw.get();
    }

    @VisibleForTesting
    public static String zzea() {
        return zzcc.zzyv.get();
    }

    public static String zzeb() {
        return zzcc.zzyx.get();
    }

    public static long zzed() {
        return zzcc.zzzl.get().longValue();
    }

    public final boolean zzds() {
        if (this.zzxu == null) {
            synchronized (this) {
                if (this.zzxu == null) {
                    ApplicationInfo applicationInfo = this.zzqh.getContext().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.zzxu = Boolean.valueOf(str != null && str.equals(myProcessName));
                    }
                    if ((this.zzxu == null || !this.zzxu.booleanValue()) && "com.google.android.gms.analytics".equals(myProcessName)) {
                        this.zzxu = Boolean.TRUE;
                    }
                    if (this.zzxu == null) {
                        this.zzxu = Boolean.TRUE;
                        this.zzqh.zzbu().zzu("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzxu.booleanValue();
    }

    public final Set<Integer> zzec() {
        String str = zzcc.zzzg.get();
        if (this.zzxw == null || this.zzxv == null || !this.zzxv.equals(str)) {
            String[] split = TextUtils.split(str, ",");
            HashSet hashSet = new HashSet();
            for (String str2 : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str2)));
                } catch (NumberFormatException unused) {
                }
            }
            this.zzxv = str;
            this.zzxw = hashSet;
        }
        return this.zzxw;
    }
}
