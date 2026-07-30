package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpb;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes3.dex */
public final class zzeu extends zzgy {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzes zzd;
    private final zzes zze;
    private final zzes zzf;
    private final zzes zzg;
    private final zzes zzh;
    private final zzes zzi;
    private final zzes zzj;
    private final zzes zzk;
    private final zzes zzl;

    zzeu(zzge zzgeVar) {
        super(zzgeVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzes(this, 6, false, false);
        this.zze = new zzes(this, 6, true, false);
        this.zzf = new zzes(this, 6, false, true);
        this.zzg = new zzes(this, 5, false, false);
        this.zzh = new zzes(this, 5, true, false);
        this.zzi = new zzes(this, 5, false, true);
        this.zzj = new zzes(this, 4, false, false);
        this.zzk = new zzes(this, 3, false, false);
        this.zzl = new zzes(this, 2, false, false);
    }

    protected static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new zzet(str);
    }

    static String zzo(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String zzp = zzp(z, obj);
        String zzp2 = zzp(z, obj2);
        String zzp3 = zzp(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zzp)) {
            sb.append(str2);
            sb.append(zzp);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(zzp2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(zzp2);
        }
        if (!TextUtils.isEmpty(zzp3)) {
            sb.append(str3);
            sb.append(zzp3);
        }
        return sb.toString();
    }

    static String zzp(boolean z, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder();
            String str2 = charAt == '-' ? "-" : "";
            sb.append(str2);
            sb.append(round);
            sb.append("...");
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (!(obj instanceof zzet)) {
                return z ? "-" : obj.toString();
            }
            str = ((zzet) obj).zza;
            return str;
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String zzq = zzq(zzge.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzq(className).equals(zzq)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i++;
        }
        return sb2.toString();
    }

    static String zzq(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return str.substring(0, lastIndexOf);
        }
        zzpb.zzc();
        return ((Boolean) zzeh.zzay.zza(null)).booleanValue() ? "" : str;
    }

    public final zzes zzc() {
        return this.zzk;
    }

    public final zzes zzd() {
        return this.zzd;
    }

    public final zzes zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    protected final boolean zzf() {
        return false;
    }

    public final zzes zzh() {
        return this.zze;
    }

    public final zzes zzi() {
        return this.zzj;
    }

    public final zzes zzj() {
        return this.zzl;
    }

    public final zzes zzk() {
        return this.zzg;
    }

    public final zzes zzl() {
        return this.zzi;
    }

    public final zzes zzm() {
        return this.zzh;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    protected final String zzr() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                if (this.zzt.zzy() != null) {
                    this.zzc = this.zzt.zzy();
                } else {
                    this.zzc = this.zzt.zzf().zzn();
                }
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    protected final void zzu(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(zzr(), i)) {
            Log.println(i, zzr(), zzo(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzgb zzo = this.zzt.zzo();
        if (zzo == null) {
            Log.println(6, zzr(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzo.zzy()) {
                Log.println(6, zzr(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            zzo.zzp(new zzer(this, i, str, obj, obj2, obj3));
        }
    }
}
