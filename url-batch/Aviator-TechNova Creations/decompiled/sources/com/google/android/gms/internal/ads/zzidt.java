package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzidt extends zzian {
    static final int[] zzb = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, Opcodes.D2F, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzian zzd;
    private final zzian zze;
    private final int zzf;
    private final int zzg;

    private zzidt(zzian zzianVar, zzian zzianVar2) {
        this.zzd = zzianVar;
        this.zze = zzianVar2;
        int zzc = zzianVar.zzc();
        this.zzf = zzc;
        this.zzc = zzc + zzianVar2.zzc();
        this.zzg = Math.max(zzianVar.zzp(), zzianVar2.zzp()) + 1;
    }

    /* synthetic */ zzidt(zzian zzianVar, zzian zzianVar2, byte[] bArr) {
        this(zzianVar, zzianVar2);
    }

    private static zzian zzF(zzian zzianVar, zzian zzianVar2) {
        int zzc = zzianVar.zzc();
        int zzc2 = zzianVar2.zzc();
        byte[] bArr = new byte[zzc + zzc2];
        zzianVar.zzx(bArr, 0, 0, zzc);
        zzianVar2.zzx(bArr, 0, zzc, zzc2);
        return zzian.zzu(bArr);
    }

    static zzian zzk(zzian zzianVar, zzian zzianVar2) {
        if (zzianVar2.zzc() == 0) {
            return zzianVar;
        }
        if (zzianVar.zzc() == 0) {
            return zzianVar2;
        }
        int zzc = zzianVar.zzc() + zzianVar2.zzc();
        if (zzc < 128) {
            return zzF(zzianVar, zzianVar2);
        }
        if (zzianVar instanceof zzidt) {
            zzidt zzidtVar = (zzidt) zzianVar;
            zzian zzianVar3 = zzidtVar.zze;
            if (zzianVar3.zzc() + zzianVar2.zzc() < 128) {
                return new zzidt(zzidtVar.zzd, zzF(zzianVar3, zzianVar2));
            }
            zzian zzianVar4 = zzidtVar.zzd;
            if (zzianVar4.zzp() > zzianVar3.zzp() && zzidtVar.zzg > zzianVar2.zzp()) {
                return new zzidt(zzianVar4, new zzidt(zzianVar3, zzianVar2));
            }
        }
        return zzc >= zzn(Math.max(zzianVar.zzp(), zzianVar2.zzp()) + 1) ? new zzidt(zzianVar, zzianVar2) : zzidr.zza(zzianVar, zzianVar2, new ArrayDeque());
    }

    static int zzn(int i) {
        int[] iArr = zzb;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzian, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzidq(this);
    }

    final /* synthetic */ zzian zzE() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zza(int i) {
        zzB(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zzian zzd(int i, int i2) {
        int i3 = this.zzc;
        int zzC = zzC(i, i2, i3);
        if (zzC == 0) {
            return zzian.zza;
        }
        if (zzC == i3) {
            return this;
        }
        int i4 = this.zzf;
        if (i2 <= i4) {
            return this.zzd.zzd(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.zze.zzd(i - i4, i5);
        }
        zzian zzianVar = this.zzd;
        return new zzidt(zzianVar.zzd(i, zzianVar.zzc()), this.zze.zzd(0, i5));
    }

    @Override // com.google.android.gms.internal.ads.zzian
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

    @Override // com.google.android.gms.internal.ads.zzian
    public final ByteBuffer zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    final void zzg(zziae zziaeVar) throws IOException {
        this.zzd.zzg(zziaeVar);
        this.zze.zzg(zziaeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final String zzh(Charset charset) {
        return new String(zzy(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzi() {
        zzids zzidsVar = new zzids(this, null);
        while (zzidsVar.hasNext()) {
            if (!zzidsVar.next().zzi()) {
                return zzier.zza(zzy());
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzj(zzian zzianVar) {
        byte[] bArr = null;
        zzids zzidsVar = new zzids(this, bArr);
        zziak next = zzidsVar.next();
        zzids zzidsVar2 = new zzids(zzianVar, bArr);
        zziak next2 = zzidsVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzc = next.zzc() - i;
            int zzc2 = next2.zzc() - i2;
            int min = Math.min(zzc, zzc2);
            if (!(i == 0 ? next.zzk(next2, i2, min) : next2.zzk(next, i, min))) {
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
            if (min == zzc) {
                i = 0;
                next = zzidsVar.next();
            } else {
                i += min;
                next = next;
            }
            if (min == zzc2) {
                next2 = zzidsVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final int zzl(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzl(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzl(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzl(this.zzd.zzl(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zziaq zzm() {
        ArrayList arrayList = new ArrayList();
        zzids zzidsVar = new zzids(this, null);
        while (zzidsVar.hasNext()) {
            arrayList.add(zzidsVar.next().zzf());
        }
        int i = zziaq.zze;
        return zziaq.zzF(new zzich(arrayList), 4096);
    }

    final /* synthetic */ zzian zzo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final int zzp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final boolean zzq() {
        return this.zzc >= zzn(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    /* renamed from: zzr */
    public final zziai iterator() {
        return new zzidq(this);
    }
}
