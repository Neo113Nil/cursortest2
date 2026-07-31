package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzhe extends zzjr {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzhc zzd;
    private final zzhc zze;
    private final zzhc zzf;
    private final zzhc zzg;
    private final zzhc zzh;
    private final zzhc zzi;
    private final zzhc zzj;
    private final zzhc zzk;
    private final zzhc zzl;

    zzhe(zzio zzioVar) {
        super(zzioVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzhc(this, 6, false, false);
        this.zze = new zzhc(this, 6, true, false);
        this.zzf = new zzhc(this, 6, false, true);
        this.zzg = new zzhc(this, 5, false, false);
        this.zzh = new zzhc(this, 5, true, false);
        this.zzi = new zzhc(this, 5, false, true);
        this.zzj = new zzhc(this, 4, false, false);
        this.zzk = new zzhc(this, 3, false, false);
        this.zzl = new zzhc(this, 2, false, false);
    }

    protected static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new zzhd(str);
    }

    static String zzo(boolean z4, String str, Object obj, Object obj2, Object obj3) {
        String zzp = zzp(z4, obj);
        String zzp2 = zzp(z4, obj2);
        String zzp3 = zzp(z4, obj3);
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

    static String zzp(boolean z4, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i4 = 0;
        if (obj instanceof Long) {
            if (!z4) {
                return obj.toString();
            }
            Long l4 = (Long) obj;
            if (Math.abs(l4.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l4.longValue()));
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
            if (!(obj instanceof zzhd)) {
                return z4 ? "-" : obj.toString();
            }
            str = ((zzhd) obj).zza;
            return str;
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z4 ? th.getClass().getName() : th.toString());
        String zzq = zzq(zzio.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzq(className).equals(zzq)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i4++;
        }
        return sb2.toString();
    }

    static String zzq(String str) {
        int lastIndexOf;
        return (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, lastIndexOf);
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    protected final boolean zzc() {
        return false;
    }

    public final zzhc zzd() {
        return this.zzk;
    }

    public final zzhc zze() {
        return this.zzd;
    }

    public final zzhc zzf() {
        return this.zzf;
    }

    public final zzhc zzh() {
        return this.zze;
    }

    public final zzhc zzi() {
        return this.zzj;
    }

    public final zzhc zzj() {
        return this.zzl;
    }

    public final zzhc zzk() {
        return this.zzg;
    }

    public final zzhc zzl() {
        return this.zzi;
    }

    public final zzhc zzm() {
        return this.zzh;
    }

    protected final String zzr() {
        String str;
        synchronized (this) {
            try {
                if (this.zzc == null) {
                    zzio zzioVar = this.zzu;
                    if (zzioVar.zzz() != null) {
                        this.zzc = zzioVar.zzz();
                    } else {
                        this.zzc = this.zzu.zzf().zzq();
                    }
                }
                Preconditions.checkNotNull(this.zzc);
                str = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    protected final void zzu(int i4, boolean z4, boolean z5, String str, Object obj, Object obj2, Object obj3) {
        if (!z4 && Log.isLoggable(zzr(), i4)) {
            Log.println(i4, zzr(), zzo(false, str, obj, obj2, obj3));
        }
        if (z5 || i4 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzil zzo = this.zzu.zzo();
        if (zzo == null) {
            Log.println(6, zzr(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzo.zzy()) {
                Log.println(6, zzr(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i4 >= 9) {
                i4 = 8;
            }
            zzo.zzq(new zzhb(this, i4, str, obj, obj2, obj3));
        }
    }
}
