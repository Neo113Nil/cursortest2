package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzsl extends zzcp {
    private int[] zzd;
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int[] iArr2 = iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzk = zzk(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i : iArr2) {
                int zzD = (zzfj.zzD(this.zzb.zzd) * i) + position;
                int i2 = this.zzb.zzd;
                if (i2 != 2) {
                    if (i2 == 3) {
                        zzk.put(byteBuffer.get(zzD));
                    } else if (i2 != 4) {
                        if (i2 != 21) {
                            if (i2 != 22) {
                                if (i2 != 268435456) {
                                    if (i2 != 1342177280) {
                                        if (i2 != 1610612736) {
                                            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 21);
                                            sb.append("Unexpected encoding: ");
                                            sb.append(i2);
                                            throw new IllegalStateException(sb.toString());
                                        }
                                    }
                                }
                            }
                            zzk.putInt(byteBuffer.getInt(zzD));
                        }
                        byte b = byteBuffer.get(byteBuffer.order() == ByteOrder.BIG_ENDIAN ? zzD : zzD + 2);
                        byte b2 = byteBuffer.get(zzD + 1);
                        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                            zzD += 2;
                        }
                        int i3 = ((b << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) | ((b2 << 16) & 16711680) | ((byteBuffer.get(zzD) << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                        int i4 = i3 >> 8;
                        zzgrc.zzf((i4 & ViewCompat.MEASURED_STATE_MASK) == 0 || (i4 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i4));
                        zzgrc.zza(zzk.remaining() >= 3);
                        zzk.put((byte) (zzk.order() == ByteOrder.BIG_ENDIAN ? (i3 >> 24) & 255 : i4 & 255)).put((byte) ((i3 >> 16) & 255)).put((byte) (zzk.order() == ByteOrder.BIG_ENDIAN ? i4 & 255 : (i3 >> 24) & 255));
                    } else {
                        zzk.putFloat(byteBuffer.getFloat(zzD));
                    }
                }
                zzk.putShort(byteBuffer.getShort(zzD));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcl.zza;
        }
        int i = zzclVar.zzd;
        if (!zzfj.zzA(i)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i2 = zzclVar.zzc;
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (true) {
            int length = iArr.length;
            if (i3 >= length) {
                return z ? new zzcl(zzclVar.zzb, length, i) : zzcl.zza;
            }
            int i4 = iArr[i3];
            if (i4 >= i2) {
                String arrays = Arrays.toString(iArr);
                StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 59);
                sb.append("Channel map (");
                sb.append(arrays);
                sb.append(") trying to access non-existent input channel.");
                throw new zzcn(sb.toString(), zzclVar);
            }
            z |= i4 != i3;
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzo() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(int[] iArr) {
        this.zzd = iArr;
    }
}
