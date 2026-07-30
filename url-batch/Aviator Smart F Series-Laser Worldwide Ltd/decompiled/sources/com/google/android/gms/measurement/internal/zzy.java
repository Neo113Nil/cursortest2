package com.google.android.gms.measurement.internal;

import com.github.mikephil.charting.utils.i;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes3.dex */
abstract class zzy {
    final String zzb;
    final int zzc;
    Boolean zzd;
    Boolean zze;
    Long zzf;
    Long zzg;

    zzy(String str, int i8) {
        this.zzb = str;
        this.zzc = i8;
    }

    private static Boolean zzd(String str, int i8, boolean z7, String str2, List list, String str3, zzeu zzeuVar) {
        if (i8 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z7 && i8 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i8 - 1) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        if (zzeuVar != null) {
                            zzeuVar.zzk().zzb("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    @VisibleForTesting
    static Boolean zze(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.zzer zzerVar, double d8) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(zzerVar);
        if (zzerVar.zzg()) {
            if (zzerVar.zzm() != 1) {
                if (zzerVar.zzm() == 5) {
                    if (!zzerVar.zzk() || !zzerVar.zzj()) {
                        return null;
                    }
                } else if (!zzerVar.zzh()) {
                    return null;
                }
                int zzm = zzerVar.zzm();
                if (zzerVar.zzm() == 5) {
                    if (zzli.zzx(zzerVar.zze()) && zzli.zzx(zzerVar.zzd())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(zzerVar.zze());
                            bigDecimal4 = new BigDecimal(zzerVar.zzd());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!zzli.zzx(zzerVar.zzc())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(zzerVar.zzc());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (zzm == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i8 = zzm - 1;
                if (i8 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i8 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i8 != 3) {
                    if (i8 == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d8 != i.DOUBLE_EPSILON) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d8).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d8).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    @VisibleForTesting
    static Boolean zzf(String str, com.google.android.gms.internal.measurement.zzey zzeyVar, zzeu zzeuVar) {
        List list;
        Preconditions.checkNotNull(zzeyVar);
        if (str == null || !zzeyVar.zzi() || zzeyVar.zzj() == 1) {
            return null;
        }
        if (zzeyVar.zzj() == 7) {
            if (zzeyVar.zza() == 0) {
                return null;
            }
        } else if (!zzeyVar.zzh()) {
            return null;
        }
        int zzj = zzeyVar.zzj();
        boolean zzf = zzeyVar.zzf();
        String zzd = (zzf || zzj == 2 || zzj == 7) ? zzeyVar.zzd() : zzeyVar.zzd().toUpperCase(Locale.ENGLISH);
        if (zzeyVar.zza() == 0) {
            list = null;
        } else {
            List zze = zzeyVar.zze();
            if (!zzf) {
                ArrayList arrayList = new ArrayList(zze.size());
                Iterator it = zze.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                zze = Collections.unmodifiableList(arrayList);
            }
            list = zze;
        }
        return zzd(str, zzj, zzf, zzd, list, zzj == 2 ? zzd : null, zzeuVar);
    }

    static Boolean zzg(double d8, com.google.android.gms.internal.measurement.zzer zzerVar) {
        try {
            return zze(new BigDecimal(d8), zzerVar, Math.ulp(d8));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean zzh(long j8, com.google.android.gms.internal.measurement.zzer zzerVar) {
        try {
            return zze(new BigDecimal(j8), zzerVar, i.DOUBLE_EPSILON);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean zzi(String str, com.google.android.gms.internal.measurement.zzer zzerVar) {
        if (!zzli.zzx(str)) {
            return null;
        }
        try {
            return zze(new BigDecimal(str), zzerVar, i.DOUBLE_EPSILON);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    static Boolean zzj(Boolean bool, boolean z7) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z7);
    }

    abstract int zza();

    abstract boolean zzb();

    abstract boolean zzc();
}
