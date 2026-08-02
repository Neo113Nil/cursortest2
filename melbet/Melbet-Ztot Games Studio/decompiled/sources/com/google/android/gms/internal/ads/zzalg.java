package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzalg implements zzaka {
    private final zzek zza = new zzek();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzalg(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzet.zzB(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * Ascii.DC4;
        this.zzg = i;
        boolean z = (bArr[0] & 32) != 0;
        this.zzb = z;
        if (z) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void zzd(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 == 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
                }
                z = false;
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zza(byte[] bArr, int i, int i2, zzajz zzajzVar, zzdn zzdnVar) {
        String zzA;
        int i3;
        int i4;
        this.zza.zzI(bArr, i + i2);
        this.zza.zzK(i);
        zzek zzekVar = this.zza;
        int i5 = 1;
        int i6 = 2;
        zzdi.zzd(zzekVar.zzb() >= 2);
        int zzq = zzekVar.zzq();
        if (zzq == 0) {
            zzA = "";
        } else {
            int zzd = zzekVar.zzd();
            Charset zzB = zzekVar.zzB();
            int zzd2 = zzekVar.zzd() - zzd;
            if (zzB == null) {
                zzB = zzfuj.zzc;
            }
            zzA = zzekVar.zzA(zzq - zzd2, zzB);
        }
        if (zzA.isEmpty()) {
            zzdnVar.zza(new zzajs(zzfxr.zzm(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zzA);
        zzd(spannableStringBuilder, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzc(spannableStringBuilder, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.zzf;
        while (true) {
            zzek zzekVar2 = this.zza;
            if (zzekVar2.zzb() < 8) {
                zzcz zzczVar = new zzcz();
                zzczVar.zzl(spannableStringBuilder);
                zzczVar.zze(f, 0);
                zzczVar.zzf(0);
                zzdnVar.zza(new zzajs(zzfxr.zzn(zzczVar.zzp()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int zzd3 = zzekVar2.zzd();
            int zzg = zzekVar2.zzg();
            int zzg2 = this.zza.zzg();
            if (zzg2 == 1937013100) {
                zzdi.zzd(this.zza.zzb() >= i6);
                int zzq2 = this.zza.zzq();
                int i7 = 0;
                while (i7 < zzq2) {
                    zzek zzekVar3 = this.zza;
                    zzdi.zzd(zzekVar3.zzb() >= 12);
                    int zzq3 = zzekVar3.zzq();
                    int zzq4 = zzekVar3.zzq();
                    zzekVar3.zzL(i6);
                    int zzm = zzekVar3.zzm();
                    zzekVar3.zzL(i5);
                    int zzg3 = zzekVar3.zzg();
                    if (zzq4 > spannableStringBuilder.length()) {
                        i3 = zzq2;
                        zzea.zzf("Tx3gParser", "Truncating styl end (" + zzq4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        i4 = spannableStringBuilder.length();
                    } else {
                        i3 = zzq2;
                        i4 = zzq4;
                    }
                    if (zzq3 >= i4) {
                        zzea.zzf("Tx3gParser", "Ignoring styl with start (" + zzq3 + ") >= end (" + i4 + ").");
                    } else {
                        int i8 = i4;
                        zzd(spannableStringBuilder, zzm, this.zzc, zzq3, i8, 0);
                        zzc(spannableStringBuilder, zzg3, this.zzd, zzq3, i8, 0);
                    }
                    i7++;
                    zzq2 = i3;
                    i5 = 1;
                    i6 = 2;
                }
            } else if (zzg2 == 1952608120 && this.zzb) {
                zzdi.zzd(this.zza.zzb() >= 2);
                f = Math.max(0.0f, Math.min(this.zza.zzq() / this.zzg, 0.95f));
                this.zza.zzK(zzd3 + zzg);
                i5 = 1;
                i6 = 2;
            }
            this.zza.zzK(zzd3 + zzg);
            i5 = 1;
            i6 = 2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final /* synthetic */ void zzb() {
    }
}
