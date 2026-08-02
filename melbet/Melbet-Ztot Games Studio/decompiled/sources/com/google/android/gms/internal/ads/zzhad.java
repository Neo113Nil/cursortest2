package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
final class zzhad extends zzgwm {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgwm zzd;
    private final zzgwm zze;
    private final int zzf;
    private final int zzg;

    private zzhad(zzgwm zzgwmVar, zzgwm zzgwmVar2) {
        this.zzd = zzgwmVar;
        this.zze = zzgwmVar2;
        int zzd = zzgwmVar.zzd();
        this.zzf = zzd;
        this.zzc = zzd + zzgwmVar2.zzd();
        this.zzg = Math.max(zzgwmVar.zzf(), zzgwmVar2.zzf()) + 1;
    }

    static zzgwm zzC(zzgwm zzgwmVar, zzgwm zzgwmVar2) {
        if (zzgwmVar2.zzd() == 0) {
            return zzgwmVar;
        }
        if (zzgwmVar.zzd() == 0) {
            return zzgwmVar2;
        }
        int zzd = zzgwmVar.zzd() + zzgwmVar2.zzd();
        if (zzd < 128) {
            return zzD(zzgwmVar, zzgwmVar2);
        }
        if (zzgwmVar instanceof zzhad) {
            zzhad zzhadVar = (zzhad) zzgwmVar;
            if (zzhadVar.zze.zzd() + zzgwmVar2.zzd() < 128) {
                return new zzhad(zzhadVar.zzd, zzD(zzhadVar.zze, zzgwmVar2));
            }
            if (zzhadVar.zzd.zzf() > zzhadVar.zze.zzf() && zzhadVar.zzg > zzgwmVar2.zzf()) {
                return new zzhad(zzhadVar.zzd, new zzhad(zzhadVar.zze, zzgwmVar2));
            }
        }
        return zzd >= zzc(Math.max(zzgwmVar.zzf(), zzgwmVar2.zzf()) + 1) ? new zzhad(zzgwmVar, zzgwmVar2) : zzgzz.zza(new zzgzz(null), zzgwmVar, zzgwmVar2);
    }

    private static zzgwm zzD(zzgwm zzgwmVar, zzgwm zzgwmVar2) {
        int zzd = zzgwmVar.zzd();
        int zzd2 = zzgwmVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgwmVar.zzz(bArr, 0, 0, zzd);
        zzgwmVar2.zzz(bArr, 0, zzd, zzd2);
        return new zzgwk(bArr);
    }

    static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgwm)) {
            return false;
        }
        zzgwm zzgwmVar = (zzgwm) obj;
        if (this.zzc != zzgwmVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgwmVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzhaa zzhaaVar = null;
        zzhab zzhabVar = new zzhab(this, zzhaaVar);
        zzgwj next = zzhabVar.next();
        zzhab zzhabVar2 = new zzhab(zzgwmVar, zzhaaVar);
        zzgwj next2 = zzhabVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzd = next.zzd() - i;
            int zzd2 = next2.zzd() - i2;
            int min = Math.min(zzd, zzd2);
            if (!(i == 0 ? next.zzg(next2, i2, min) : next2.zzg(next, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzhabVar.next();
                i = 0;
            } else {
                i += min;
                next = next;
            }
            if (min == zzd2) {
                next2 = zzhabVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwm, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzgzx(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final byte zza(int i) {
        zzy(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.zze.zze(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final int zzi(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzi(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final int zzj(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzj(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final zzgwm zzk(int i, int i2) {
        int zzq = zzq(i, i2, this.zzc);
        if (zzq == 0) {
            return zzgwm.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzgwm zzgwmVar = this.zzd;
        return new zzhad(zzgwmVar.zzk(i, zzgwmVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgwm
    public final zzgww zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        Object[] objArr = 0;
        zzhab zzhabVar = new zzhab(this, null);
        while (zzhabVar.hasNext()) {
            arrayList.add(zzhabVar.next().zzn());
        }
        int i = zzgww.zzd;
        int i2 = 0;
        int i3 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i3 += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new zzgwq(arrayList, i3, true, objArr == true ? 1 : 0) : zzgww.zzG(new zzgyo(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    final void zzo(zzgwd zzgwdVar) throws IOException {
        this.zzd.zzo(zzgwdVar);
        this.zze.zzo(zzgwdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final boolean zzp() {
        zzgwm zzgwmVar = this.zzd;
        zzgwm zzgwmVar2 = this.zze;
        return zzgwmVar2.zzj(zzgwmVar.zzj(0, 0, this.zzf), 0, zzgwmVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    /* renamed from: zzs */
    public final zzgwh iterator() {
        return new zzgzx(this);
    }
}
