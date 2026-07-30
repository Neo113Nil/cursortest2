package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.baidu.ar.constants.HttpConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class zzlo extends zzgy {
    private static final String[] zza = {"firebase_", "google_", "ga_"};
    private static final String[] zzb = {"_err"};
    private SecureRandom zzc;
    private final AtomicLong zzd;
    private int zze;
    private Integer zzf;

    zzlo(zzge zzgeVar) {
        super(zzgeVar);
        this.zzf = null;
        this.zzd = new AtomicLong(0L);
    }

    static MessageDigest zzF() {
        MessageDigest messageDigest;
        for (int i8 = 0; i8 < 2; i8++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList zzH(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(HttpConstants.HTTP_APP_ID, zzacVar.zza);
            bundle.putString("origin", zzacVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzacVar.zzd);
            bundle.putString("name", zzacVar.zzc.zzb);
            zzha.zzb(bundle, Preconditions.checkNotNull(zzacVar.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzacVar.zze);
            String str = zzacVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzaw zzawVar = zzacVar.zzg;
            if (zzawVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzawVar.zza);
                zzau zzauVar = zzawVar.zzb;
                if (zzauVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzauVar.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzacVar.zzh);
            zzaw zzawVar2 = zzacVar.zzi;
            if (zzawVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzawVar2.zza);
                zzau zzauVar2 = zzawVar2.zzb;
                if (zzauVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzauVar2.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzacVar.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzacVar.zzj);
            zzaw zzawVar3 = zzacVar.zzk;
            if (zzawVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzawVar3.zza);
                zzau zzauVar3 = zzawVar3.zzb;
                if (zzauVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzauVar3.zzc());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @WorkerThread
    public static void zzK(zziq zziqVar, Bundle bundle, boolean z7) {
        if (bundle != null && zziqVar != null) {
            if (!bundle.containsKey("_sc") || z7) {
                String str = zziqVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zziqVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zziqVar.zzc);
                return;
            }
            z7 = false;
        }
        if (bundle != null && zziqVar == null && z7) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    static boolean zzaj(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean zzak(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    static boolean zzal(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean zzam(Context context, boolean z7) {
        Preconditions.checkNotNull(context);
        return Build.VERSION.SDK_INT >= 24 ? zzav(context, "com.google.android.gms.measurement.AppMeasurementJobService") : zzav(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean zzan(String str) {
        return !zzb[0].equals(str);
    }

    static final boolean zzaq(Bundle bundle, int i8) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i8);
        return true;
    }

    @VisibleForTesting
    static final boolean zzar(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int zzas(String str) {
        if ("_ldl".equals(str)) {
            this.zzt.zzf();
            return 2048;
        }
        if (FileDownloadModel.ID.equals(str)) {
            this.zzt.zzf();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.zzt.zzf();
            return 100;
        }
        this.zzt.zzf();
        return 36;
    }

    private final Object zzat(int i8, Object obj, boolean z7, boolean z8) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return zzD(obj.toString(), i8, z7);
        }
        if (!z8 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle zzt = zzt((Bundle) parcelable);
                if (!zzt.isEmpty()) {
                    arrayList.add(zzt);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private static boolean zzau(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (zzlm.zza(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzav(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    @VisibleForTesting
    static long zzp(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i8 = 0;
        Preconditions.checkState(length > 0);
        long j8 = 0;
        for (int i9 = length - 1; i9 >= 0 && i9 >= bArr.length - 8; i9--) {
            j8 += (bArr[i9] & 255) << i8;
            i8 += 8;
        }
        return j8;
    }

    final Object zzA(String str, Object obj) {
        int i8 = 256;
        if ("_ev".equals(str)) {
            this.zzt.zzf();
            return zzat(256, obj, true, true);
        }
        if (zzaj(str)) {
            this.zzt.zzf();
        } else {
            this.zzt.zzf();
            i8 = 100;
        }
        return zzat(i8, obj, false, true);
    }

    final Object zzB(String str, Object obj) {
        return "_ldl".equals(str) ? zzat(zzas(str), obj, true, false) : zzat(zzas(str), obj, false, false);
    }

    final String zzC() {
        byte[] bArr = new byte[16];
        zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String zzD(String str, int i8, boolean z7) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i8) {
            return str;
        }
        if (z7) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i8))).concat("...");
        }
        return null;
    }

    public final URL zzE(long j8, String str, String str2, long j9) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 77000L, Integer.valueOf(zzm())), str2, str, Long.valueOf(j9));
            if (str.equals(this.zzt.zzf().zzm())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException e8) {
            e = e8;
            this.zzt.zzaA().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e9) {
            e = e9;
            this.zzt.zzaA().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @EnsuresNonNull({"this.secureRandom"})
    @WorkerThread
    final SecureRandom zzG() {
        zzg();
        if (this.zzc == null) {
            this.zzc = new SecureRandom();
        }
        return this.zzc;
    }

    @WorkerThread
    final void zzI(Bundle bundle, long j8) {
        long j9 = bundle.getLong("_et");
        if (j9 != 0) {
            this.zzt.zzaA().zzk().zzb("Params already contained engagement", Long.valueOf(j9));
        } else {
            j9 = 0;
        }
        bundle.putLong("_et", j8 + j9);
    }

    final void zzJ(Bundle bundle, int i8, String str, String str2, Object obj) {
        if (zzaq(bundle, i8)) {
            this.zzt.zzf();
            bundle.putString("_ev", zzD(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    final void zzL(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.zzt.zzv().zzP(bundle, str, bundle2.get(str));
            }
        }
    }

    final void zzM(Parcelable[] parcelableArr, int i8, boolean z7) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i9 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (zzak(str) && !zzau(str, zzhc.zzd) && (i9 = i9 + 1) > i8) {
                    if (z7) {
                        this.zzt.zzaA().zze().zzc("Param can't contain more than " + i8 + " item-scoped custom parameters", this.zzt.zzj().zze(str), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle, 28);
                    } else {
                        this.zzt.zzaA().zze().zzc("Param cannot contain item-scoped custom parameters", this.zzt.zzj().zze(str), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    final void zzN(zzev zzevVar, int i8) {
        int i9 = 0;
        for (String str : new TreeSet(zzevVar.zzd.keySet())) {
            if (zzak(str) && (i9 = i9 + 1) > i8) {
                this.zzt.zzaA().zze().zzc("Event can't contain more than " + i8 + " params", this.zzt.zzj().zzd(zzevVar.zza), this.zzt.zzj().zzb(zzevVar.zzd));
                zzaq(zzevVar.zzd, 5);
                zzevVar.zzd.remove(str);
            }
        }
    }

    final void zzO(zzln zzlnVar, String str, int i8, String str2, String str3, int i9) {
        Bundle bundle = new Bundle();
        zzaq(bundle, i8);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i8 == 6 || i8 == 7 || i8 == 2) {
            bundle.putLong("_el", i9);
        }
        zzlnVar.zza(str, "_err", bundle);
    }

    final void zzP(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.zzt.zzaA().zzl().zzc("Not putting event parameter. Invalid value type. name, type", this.zzt.zzj().zze(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zzQ(com.google.android.gms.internal.measurement.zzcf zzcfVar, boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z7);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e8) {
            this.zzt.zzaA().zzk().zzb("Error returning boolean value to wrapper", e8);
        }
    }

    public final void zzR(com.google.android.gms.internal.measurement.zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e8) {
            this.zzt.zzaA().zzk().zzb("Error returning bundle list to wrapper", e8);
        }
    }

    public final void zzS(com.google.android.gms.internal.measurement.zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e8) {
            this.zzt.zzaA().zzk().zzb("Error returning bundle value to wrapper", e8);
        }
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e8) {
            this.zzt.zzaA().zzk().zzb("Error returning byte array to wrapper", e8);
        }
    }

    public final void zzU(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i8) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i8);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e8) {
            this.zzt.zzaA().zzk().zzb("Error returning int value to wrapper", e8);
        }
    }

    public final void zzV(com.google.android.gms.internal.measurement.zzcf zzcfVar, long j8) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j8);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e8) {
            this.zzt.zzaA().zzk().zzb("Error returning long value to wrapper", e8);
        }
    }

    public final void zzW(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e8) {
            this.zzt.zzaA().zzk().zzb("Error returning string value to wrapper", e8);
        }
    }

    final void zzX(String str, String str2, String str3, Bundle bundle, List list, boolean z7) {
        int i8;
        String str4;
        int i9;
        int zza2;
        int i10;
        String str5;
        if (bundle == null) {
            return;
        }
        zzag zzf = this.zzt.zzf();
        zzpn.zzc();
        String str6 = null;
        int i11 = (zzf.zzt.zzf().zzs(null, zzeh.zzaz) && zzf.zzt.zzv().zzai(231100000, true)) ? 35 : 0;
        int i12 = 0;
        for (String str7 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str7)) {
                int zzj = !z7 ? zzj(str7) : 0;
                if (zzj == 0) {
                    zzj = zzi(str7);
                }
                i8 = zzj;
            } else {
                i8 = 0;
            }
            if (i8 != 0) {
                zzJ(bundle, i8, str7, str7, i8 == 3 ? str7 : str6);
                bundle.remove(str7);
                i10 = i11;
                str5 = str6;
            } else {
                if (zzag(bundle.get(str7))) {
                    this.zzt.zzaA().zzl().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str7);
                    str4 = str7;
                    i9 = i11;
                    zza2 = 22;
                } else {
                    str4 = str7;
                    i9 = i11;
                    zza2 = zza(str, str2, str7, bundle.get(str7), bundle, list, z7, false);
                }
                if (zza2 != 0 && !"_ev".equals(str4)) {
                    zzJ(bundle, zza2, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (zzak(str4) && !zzau(str4, zzhc.zzd)) {
                    int i13 = i12 + 1;
                    if (zzai(231100000, true)) {
                        i10 = i9;
                        if (i13 > i10) {
                            zzpn.zzc();
                            str5 = null;
                            if (this.zzt.zzf().zzs(null, zzeh.zzaz)) {
                                this.zzt.zzaA().zze().zzc("Item can't contain more than " + i10 + " item-scoped custom params", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                                zzaq(bundle, 28);
                                bundle.remove(str4);
                            } else {
                                this.zzt.zzaA().zze().zzc("Item cannot contain custom parameters", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                                zzaq(bundle, 23);
                                bundle.remove(str4);
                            }
                            i12 = i13;
                        }
                    } else {
                        this.zzt.zzaA().zze().zzc("Item array not supported on client's version of Google Play Services (Android Only)", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle, 23);
                        bundle.remove(str4);
                        i10 = i9;
                    }
                    str5 = null;
                    i12 = i13;
                }
                i10 = i9;
                str5 = null;
            }
            i11 = i10;
            str6 = str5;
        }
    }

    final boolean zzY(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (zzar(str)) {
                return true;
            }
            if (this.zzt.zzL()) {
                this.zzt.zzaA().zze().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzeu.zzn(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.zzt.zzL()) {
                this.zzt.zzaA().zze().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (zzar(str2)) {
            return true;
        }
        this.zzt.zzaA().zze().zzb("Invalid admob_app_id. Analytics disabled.", zzeu.zzn(str2));
        return false;
    }

    final boolean zzZ(String str, int i8, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i8) {
            return true;
        }
        this.zzt.zzaA().zze().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i8), str2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zza(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z7, boolean z8) {
        int i8;
        int i9;
        int size;
        zzg();
        if (zzag(obj)) {
            if (!z8) {
                return 21;
            }
            if (!zzau(str3, zzhc.zzc)) {
                return 20;
            }
            zzjy zzt = this.zzt.zzt();
            zzt.zzg();
            zzt.zza();
            if (zzt.zzN() && zzt.zzt.zzv().zzm() < 200900) {
                return 25;
            }
            this.zzt.zzf();
            boolean z9 = obj instanceof Parcelable[];
            if (z9) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            if (size > 200) {
                this.zzt.zzaA().zzl().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                this.zzt.zzf();
                if (z9) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i8 = 17;
                if (!zzaj(str2) || zzaj(str3)) {
                    this.zzt.zzf();
                    i9 = 256;
                } else {
                    this.zzt.zzf();
                    i9 = 100;
                }
                if (!zzab("param", str3, i9, obj)) {
                    return i8;
                }
                if (!z8) {
                    return 4;
                }
                if (obj instanceof Bundle) {
                    zzX(str, str2, str3, (Bundle) obj, list, z7);
                } else if (obj instanceof Parcelable[]) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            this.zzt.zzaA().zzl().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                            return 4;
                        }
                        zzX(str, str2, str3, (Bundle) parcelable, list, z7);
                    }
                } else {
                    if (!(obj instanceof ArrayList)) {
                        return 4;
                    }
                    ArrayList arrayList2 = (ArrayList) obj;
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        Object obj2 = arrayList2.get(i10);
                        if (!(obj2 instanceof Bundle)) {
                            this.zzt.zzaA().zzl().zzc("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str3);
                            return 4;
                        }
                        zzX(str, str2, str3, (Bundle) obj2, list, z7);
                    }
                }
                return i8;
            }
        }
        i8 = 0;
        if (zzaj(str2)) {
        }
        this.zzt.zzf();
        i9 = 256;
        if (!zzab("param", str3, i9, obj)) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @WorkerThread
    protected final void zzaC() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.zzt.zzaA().zzk().zza("Utils falling back to Random for random id");
            }
        }
        this.zzd.set(nextLong);
    }

    final boolean zzaa(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = zza;
        for (int i8 = 0; i8 < 3; i8++) {
            if (str2.startsWith(strArr3[i8])) {
                this.zzt.zzaA().zze().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzau(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zzau(str2, strArr2)) {
            return true;
        }
        this.zzt.zzaA().zze().zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    final boolean zzab(String str, String str2, int i8, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i8) {
                this.zzt.zzaA().zzl().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    final boolean zzac(String str, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                this.zzt.zzaA().zze().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.zzt.zzaA().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    final boolean zzad(String str, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.zzt.zzaA().zze().zzc("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.zzt.zzaA().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    @WorkerThread
    final boolean zzae(String str) {
        zzg();
        if (Wrappers.packageManager(this.zzt.zzaw()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.zzt.zzaA().zzc().zzb("Permission not granted", str);
        return false;
    }

    final boolean zzaf(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String zzl = this.zzt.zzf().zzl();
        this.zzt.zzay();
        return zzl.equals(str);
    }

    final boolean zzag(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    @VisibleForTesting
    final boolean zzah(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e8) {
            this.zzt.zzaA().zzd().zzb("Package name not found", e8);
            return true;
        } catch (CertificateException e9) {
            this.zzt.zzaA().zzd().zzb("Error obtaining certificate", e9);
            return true;
        }
    }

    public final boolean zzai(int i8, boolean z7) {
        Boolean zzj = this.zzt.zzt().zzj();
        if (zzm() < i8 / 1000) {
            return (zzj == null || zzj.booleanValue()) ? false : true;
        }
        return true;
    }

    final boolean zzao(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    final byte[] zzap(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    final int zzd(String str, Object obj) {
        return "_ldl".equals(str) ? zzab("user property referrer", str, zzas(str), obj) : zzab("user property", str, zzas(str), obj) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    protected final boolean zzf() {
        return true;
    }

    final int zzh(String str) {
        if (!zzac(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!zzaa(NotificationCompat.CATEGORY_EVENT, zzhb.zza, zzhb.zzb, str)) {
            return 13;
        }
        this.zzt.zzf();
        return !zzZ(NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
    }

    final int zzi(String str) {
        if (!zzac("event param", str)) {
            return 3;
        }
        if (!zzaa("event param", null, null, str)) {
            return 14;
        }
        this.zzt.zzf();
        return !zzZ("event param", 40, str) ? 3 : 0;
    }

    final int zzj(String str) {
        if (!zzad("event param", str)) {
            return 3;
        }
        if (!zzaa("event param", null, null, str)) {
            return 14;
        }
        this.zzt.zzf();
        return !zzZ("event param", 40, str) ? 3 : 0;
    }

    final int zzl(String str) {
        if (!zzac("user property", str)) {
            return 6;
        }
        if (!zzaa("user property", zzhd.zza, null, str)) {
            return 15;
        }
        this.zzt.zzf();
        return !zzZ("user property", 24, str) ? 6 : 0;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int zzm() {
        if (this.zzf == null) {
            this.zzf = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzt.zzaw()) / 1000);
        }
        return this.zzf.intValue();
    }

    public final int zzo(int i8) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzt.zzaw(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final long zzq() {
        long andIncrement;
        long j8;
        if (this.zzd.get() != 0) {
            synchronized (this.zzd) {
                this.zzd.compareAndSet(-1L, 1L);
                andIncrement = this.zzd.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.zzd) {
            long nextLong = new Random(System.nanoTime() ^ this.zzt.zzax().currentTimeMillis()).nextLong();
            int i8 = this.zze + 1;
            this.zze = i8;
            j8 = nextLong + i8;
        }
        return j8;
    }

    public final long zzr(long j8, long j9) {
        return (j8 + (j9 * 60000)) / 86400000;
    }

    final Bundle zzs(Uri uri, boolean z7) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("utm_id");
                str6 = uri.getQueryParameter("dclid");
                str7 = uri.getQueryParameter("srsltid");
                str8 = z7 ? uri.getQueryParameter("sfmc_id") : null;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && (!z7 || TextUtils.isEmpty(str8))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(FirebaseAnalytics.Param.CAMPAIGN, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(FirebaseAnalytics.Param.SOURCE, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString(FirebaseAnalytics.Param.MEDIUM, str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(FirebaseAnalytics.Param.CONTENT, queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("campaign_id", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("dclid", str6);
            }
            String queryParameter6 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("source_platform", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("creative_format", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("marketing_tactic", queryParameter8);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("srsltid", str7);
            }
            if (z7 && !TextUtils.isEmpty(str8)) {
                bundle.putString("sfmc_id", str8);
            }
            return bundle;
        } catch (UnsupportedOperationException e8) {
            this.zzt.zzaA().zzk().zzb("Install referrer url isn't a hierarchical URI", e8);
            return null;
        }
    }

    final Bundle zzt(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzA = zzA(str, bundle.get(str));
                if (zzA == null) {
                    this.zzt.zzaA().zzl().zzb("Param value can't be null", this.zzt.zzj().zze(str));
                } else {
                    zzP(bundle2, str, zzA);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final Bundle zzu(String str, String str2, Bundle bundle, List list, boolean z7) {
        int i8;
        int i9;
        String str3;
        boolean zzau = zzau(str2, zzhb.zzd);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int zzc = this.zzt.zzf().zzc();
        int i10 = 0;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str4)) {
                int zzj = !z7 ? zzj(str4) : 0;
                if (zzj == 0) {
                    zzj = zzi(str4);
                }
                i8 = zzj;
            } else {
                i8 = 0;
            }
            if (i8 != 0) {
                zzJ(bundle2, i8, str4, str4, i8 == 3 ? str4 : null);
                bundle2.remove(str4);
                i9 = zzc;
            } else {
                i9 = zzc;
                int zza2 = zza(str, str2, str4, bundle.get(str4), bundle2, list, z7, zzau);
                if (zza2 == 17) {
                    zzJ(bundle2, 17, str4, str4, Boolean.FALSE);
                } else if (zza2 != 0) {
                    str3 = str4;
                    if (!"_ev".equals(str3)) {
                        zzJ(bundle2, zza2, zza2 == 21 ? str2 : str3, str3, bundle.get(str3));
                        bundle2.remove(str3);
                    }
                    if (zzak(str3)) {
                        int i11 = i10 + 1;
                        if (i11 > i9) {
                            this.zzt.zzaA().zze().zzc("Event can't contain more than " + i9 + " params", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                            zzaq(bundle2, 5);
                            bundle2.remove(str3);
                        }
                        i10 = i11;
                    }
                }
                str3 = str4;
                if (zzak(str3)) {
                }
            }
            zzc = i9;
        }
        return bundle2;
    }

    final zzaw zzz(String str, String str2, Bundle bundle, String str3, long j8, boolean z7, boolean z8) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzh(str2) != 0) {
            this.zzt.zzaA().zzd().zzb("Invalid conditional property event name", this.zzt.zzj().zzf(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle zzu = zzu(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (z7) {
            zzu = zzt(zzu);
        }
        Preconditions.checkNotNull(zzu);
        return new zzaw(str2, new zzau(zzu), str3, j8);
    }
}
