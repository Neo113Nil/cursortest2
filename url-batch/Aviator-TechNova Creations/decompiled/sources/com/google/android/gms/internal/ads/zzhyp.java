package com.google.android.gms.internal.ads;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhyp extends zzhyl {
    private final Object zza;

    public zzhyp(Boolean bool) {
        this.zza = Objects.requireNonNull(bool);
    }

    private static boolean zzl(zzhyp zzhypVar) {
        Object obj = zzhypVar.zza;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzhyp zzhypVar = (zzhyp) obj;
        Object obj2 = this.zza;
        if (obj2 == null) {
            return zzhypVar.zza == null;
        }
        if (zzl(this) && zzl(zzhypVar)) {
            return ((obj2 instanceof BigInteger) || (zzhypVar.zza instanceof BigInteger)) ? zzk().equals(zzhypVar.zzk()) : zzh().longValue() == zzhypVar.zzh().longValue();
        }
        if (obj2 instanceof Number) {
            Object obj3 = zzhypVar.zza;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return zzj().compareTo(zzhypVar.zzj()) == 0;
                }
                double zzi = zzi();
                double zzi2 = zzhypVar.zzi();
                if (zzi != zzi2) {
                    return Double.isNaN(zzi) && Double.isNaN(zzi2);
                }
                return true;
            }
        }
        return obj2.equals(zzhypVar.zza);
    }

    public final int hashCode() {
        long doubleToLongBits;
        Object obj = this.zza;
        if (obj == null) {
            return 31;
        }
        if (zzl(this)) {
            doubleToLongBits = zzh().longValue();
        } else {
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(zzh().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final boolean zza() {
        return this.zza instanceof Boolean;
    }

    public final boolean zzb() {
        Object obj = this.zza;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(zzd());
    }

    public final boolean zzc() {
        return this.zza instanceof Number;
    }

    @Override // com.google.android.gms.internal.ads.zzhyl
    public final String zzd() {
        Object obj = this.zza;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return zzh().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        String valueOf = String.valueOf(obj.getClass());
        String.valueOf(valueOf);
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(valueOf)));
    }

    public final Number zzh() {
        Object obj = this.zza;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new zzhyu((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final double zzi() {
        return this.zza instanceof Number ? zzh().doubleValue() : Double.parseDouble(zzd());
    }

    public final BigDecimal zzj() {
        Object obj = this.zza;
        return obj instanceof BigDecimal ? (BigDecimal) obj : zzhzd.zza(zzd());
    }

    public final BigInteger zzk() {
        Object obj = this.zza;
        return obj instanceof BigInteger ? (BigInteger) obj : zzl(this) ? BigInteger.valueOf(zzh().longValue()) : zzhzd.zzb(zzd());
    }

    public zzhyp(Number number) {
        this.zza = Objects.requireNonNull(number);
    }

    public zzhyp(String str) {
        this.zza = Objects.requireNonNull(str);
    }
}
