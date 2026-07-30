package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
class zzbk extends zzbl {
    final zzbh zzb;

    @CheckForNull
    final Character zzc;

    zzbk(zzbh zzbhVar, @CheckForNull Character ch) {
        this.zzb = zzbhVar;
        if (ch != null && zzbhVar.zzb(ch.charValue())) {
            throw new IllegalArgumentException(zzat.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzc = ch;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzbk) {
            zzbk zzbkVar = (zzbk) obj;
            if (this.zzb.equals(zzbkVar.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzbkVar.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch != null && ch.equals(ch2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode();
        Character ch = this.zzc;
        return hashCode ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    void zza(Appendable appendable, byte[] bArr, int i8, int i9) {
        int i10 = 0;
        zzas.zze(0, i9, bArr.length);
        while (i10 < i9) {
            zzc(appendable, bArr, i10, Math.min(this.zzb.zzd, i9 - i10));
            i10 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    final int zzb(int i8) {
        zzbh zzbhVar = this.zzb;
        return zzbhVar.zzc * zzbn.zza(i8, zzbhVar.zzd, RoundingMode.CEILING);
    }

    final void zzc(Appendable appendable, byte[] bArr, int i8, int i9) {
        zzas.zze(i8, i8 + i9, bArr.length);
        int i10 = 0;
        zzas.zzc(i9 <= this.zzb.zzd);
        long j8 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            j8 = (j8 | (bArr[i8 + i11] & 255)) << 8;
        }
        int i12 = ((i9 + 1) * 8) - this.zzb.zzb;
        while (i10 < i9 * 8) {
            zzbh zzbhVar = this.zzb;
            appendable.append(zzbhVar.zza(zzbhVar.zza & ((int) (j8 >>> (i12 - i10)))));
            i10 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i10 < this.zzb.zzd * 8) {
                appendable.append(this.zzc.charValue());
                i10 += this.zzb.zzb;
            }
        }
    }

    zzbk(String str, String str2, @CheckForNull Character ch) {
        this(new zzbh(str, str2.toCharArray()), ch);
    }
}
