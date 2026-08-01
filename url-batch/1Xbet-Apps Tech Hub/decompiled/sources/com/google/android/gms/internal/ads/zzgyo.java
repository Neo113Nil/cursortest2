package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgyo extends zzgve {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, Opcodes.D2F, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgve zzd;
    private final zzgve zze;
    private final int zzf;
    private final int zzg;

    private zzgyo(zzgve zzgveVar, zzgve zzgveVar2) {
        this.zzd = zzgveVar;
        this.zze = zzgveVar2;
        int zzd = zzgveVar.zzd();
        this.zzf = zzd;
        this.zzc = zzd + zzgveVar2.zzd();
        this.zzg = Math.max(zzgveVar.zzf(), zzgveVar2.zzf()) + 1;
    }

    static zzgve zzC(zzgve zzgveVar, zzgve zzgveVar2) {
        if (zzgveVar2.zzd() == 0) {
            return zzgveVar;
        }
        if (zzgveVar.zzd() == 0) {
            return zzgveVar2;
        }
        int zzd = zzgveVar.zzd() + zzgveVar2.zzd();
        if (zzd < 128) {
            return zzD(zzgveVar, zzgveVar2);
        }
        if (zzgveVar instanceof zzgyo) {
            zzgyo zzgyoVar = (zzgyo) zzgveVar;
            if (zzgyoVar.zze.zzd() + zzgveVar2.zzd() < 128) {
                return new zzgyo(zzgyoVar.zzd, zzD(zzgyoVar.zze, zzgveVar2));
            }
            if (zzgyoVar.zzd.zzf() > zzgyoVar.zze.zzf() && zzgyoVar.zzg > zzgveVar2.zzf()) {
                return new zzgyo(zzgyoVar.zzd, new zzgyo(zzgyoVar.zze, zzgveVar2));
            }
        }
        return zzd >= zzc(Math.max(zzgveVar.zzf(), zzgveVar2.zzf()) + 1) ? new zzgyo(zzgveVar, zzgveVar2) : zzgyk.zza(new zzgyk(null), zzgveVar, zzgveVar2);
    }

    private static zzgve zzD(zzgve zzgveVar, zzgve zzgveVar2) {
        int zzd = zzgveVar.zzd();
        int zzd2 = zzgveVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgveVar.zzz(bArr, 0, 0, zzd);
        zzgveVar2.zzz(bArr, 0, zzd, zzd2);
        return new zzgva(bArr);
    }

    static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgve)) {
            return false;
        }
        zzgve zzgveVar = (zzgve) obj;
        if (this.zzc != zzgveVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgveVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgyl zzgylVar = null;
        zzgym zzgymVar = new zzgym(this, zzgylVar);
        zzguz next = zzgymVar.next();
        zzgym zzgymVar2 = new zzgym(zzgveVar, zzgylVar);
        zzguz next2 = zzgymVar2.next();
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
                next = zzgymVar.next();
                i = 0;
            } else {
                i += min;
                next = next;
            }
            if (min == zzd2) {
                next2 = zzgymVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgve, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgyi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final byte zza(int i) {
        zzy(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
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

    @Override // com.google.android.gms.internal.ads.zzgve
    protected final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    protected final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgve
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

    @Override // com.google.android.gms.internal.ads.zzgve
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

    @Override // com.google.android.gms.internal.ads.zzgve
    public final zzgve zzk(int i, int i2) {
        int zzq = zzq(i, i2, this.zzc);
        if (zzq == 0) {
            return zzgve.zzb;
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
        zzgve zzgveVar = this.zzd;
        return new zzgyo(zzgveVar.zzk(i, zzgveVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgve
    public final zzgvm zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        Object[] objArr = 0;
        zzgym zzgymVar = new zzgym(this, null);
        while (zzgymVar.hasNext()) {
            arrayList.add(zzgymVar.next().zzn());
        }
        int i = zzgvm.zzd;
        int i2 = 0;
        int i3 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i3 += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new zzgvi(arrayList, i3, true, objArr == true ? 1 : 0) : zzgvm.zzH(new zzgwz(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    protected final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    final void zzo(zzgut zzgutVar) throws IOException {
        this.zzd.zzo(zzgutVar);
        this.zze.zzo(zzgutVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final boolean zzp() {
        zzgve zzgveVar = this.zzd;
        zzgve zzgveVar2 = this.zze;
        return zzgveVar2.zzj(zzgveVar.zzj(0, 0, this.zzf), 0, zzgveVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* renamed from: zzs */
    public final zzguy iterator() {
        return new zzgyi(this);
    }
}
