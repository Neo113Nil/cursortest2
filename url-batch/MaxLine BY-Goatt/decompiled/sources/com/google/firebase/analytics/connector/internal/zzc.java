package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import defpackage.g11;
import defpackage.iv1;
import defpackage.k11;
import defpackage.p11;
import defpackage.tk3;
import defpackage.yk3;
import defpackage.zm3;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zzc {
    public static final /* synthetic */ int zza = 0;
    private static final p11 zzb;
    private static final k11 zzc;
    private static final k11 zzd;
    private static final k11 zze;
    private static final k11 zzf;
    private static final k11 zzg;

    static {
        String[] strArr = {"_ac", FirebaseAnalytics.Event.CAMPAIGN_DETAILS, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"};
        int i = p11.o;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(strArr, 0, objArr, 6, 9);
        zzb = p11.j(15, objArr);
        g11 g11Var = k11.n;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        yk3.t(7, objArr2);
        zzc = k11.f(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        yk3.t(3, objArr3);
        zzd = k11.f(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        yk3.t(2, objArr4);
        zze = k11.f(2, objArr4);
        zm3.m(4, "initialCapacity");
        String[] strArr2 = tk3.k;
        yk3.t(15, strArr2);
        Object[] copyOf = Arrays.copyOf(new Object[4], iv1.x(4, 15));
        System.arraycopy(strArr2, 0, copyOf, 0, 15);
        String[] strArr3 = tk3.l;
        yk3.t(15, strArr3);
        if (copyOf.length < 30) {
            copyOf = Arrays.copyOf(copyOf, iv1.x(copyOf.length, 30));
        }
        System.arraycopy(strArr3, 0, copyOf, 15, 15);
        zzf = k11.f(30, copyOf);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        yk3.t(2, objArr5);
        zzg = k11.f(2, objArr5);
    }

    public static boolean zza(String str) {
        return !zzd.contains(str);
    }

    public static boolean zzb(String str, Bundle bundle) {
        if (zzc.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        k11 k11Var = zze;
        int size = k11Var.size();
        int i = 0;
        while (i < size) {
            boolean containsKey = bundle.containsKey((String) k11Var.get(i));
            i++;
            if (containsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzc(String str) {
        return !zzb.contains(str);
    }

    public static boolean zzd(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(Constants.ScionAnalytics.ORIGIN_FCM) || str.equals("frc");
        }
        if (Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION.equals(str2)) {
            return str.equals(Constants.ScionAnalytics.ORIGIN_FCM) || str.equals("fiam");
        }
        if (zzf.contains(str2)) {
            return false;
        }
        k11 k11Var = zzg;
        int size = k11Var.size();
        int i = 0;
        while (i < size) {
            boolean matches = str2.matches((String) k11Var.get(i));
            i++;
            if (matches) {
                return false;
            }
        }
        return true;
    }

    public static boolean zze(String str, String str2, Bundle bundle) {
        if (!Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2)) {
            return true;
        }
        if (!zza(str) || bundle == null) {
            return false;
        }
        k11 k11Var = zze;
        int size = k11Var.size();
        int i = 0;
        while (i < size) {
            boolean containsKey = bundle.containsKey((String) k11Var.get(i));
            i++;
            if (containsKey) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            } else if (str.equals("fdl")) {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
        } else if (str.equals(Constants.ScionAnalytics.ORIGIN_FCM)) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }
}
