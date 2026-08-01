package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzec extends zzdz {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8 A[ADDED_TO_REGION, LOOP:6: B:43:0x00e8->B:44:0x00ea, LOOP_START, PHI: r0
      0x00e8: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:14:0x003e, B:44:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.zzb.zzd;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 268435456) {
                    if (i3 != 536870912) {
                        if (i3 != 805306368) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                    }
                    i2 /= 3;
                }
                ByteBuffer zzj = zzj(i2);
                i = this.zzb.zzd;
                if (i == 3) {
                    while (position < limit) {
                        zzj.put((byte) 0);
                        zzj.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i == 4) {
                    while (position < limit) {
                        short max = (short) (Math.max(-1.0f, Math.min(byteBuffer.getFloat(position), 1.0f)) * 32767.0f);
                        zzj.put((byte) (max & 255));
                        zzj.put((byte) ((max >> 8) & 255));
                        position += 4;
                    }
                } else if (i == 268435456) {
                    while (position < limit) {
                        zzj.put(byteBuffer.get(position + 1));
                        zzj.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i == 536870912) {
                    while (position < limit) {
                        zzj.put(byteBuffer.get(position + 1));
                        zzj.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else if (i == 805306368) {
                    while (position < limit) {
                        zzj.put(byteBuffer.get(position + 2));
                        zzj.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                } else if (i == 1342177280) {
                    while (position < limit) {
                        zzj.put(byteBuffer.get(position + 1));
                        zzj.put(byteBuffer.get(position));
                        position += 3;
                    }
                } else {
                    if (i != 1610612736) {
                        throw new IllegalStateException();
                    }
                    while (position < limit) {
                        zzj.put(byteBuffer.get(position + 1));
                        zzj.put(byteBuffer.get(position));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                zzj.flip();
            }
            i2 /= 2;
            ByteBuffer zzj2 = zzj(i2);
            i = this.zzb.zzd;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            zzj2.flip();
        }
        i2 += i2;
        ByteBuffer zzj22 = zzj(i2);
        i = this.zzb.zzd;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        zzj22.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final zzdw zzi(zzdw zzdwVar) throws zzdx {
        int i = zzdwVar.zzd;
        if (i != 3) {
            if (i == 2) {
                return zzdw.zza;
            }
            if (i != 268435456 && i != 536870912 && i != 1342177280 && i != 805306368 && i != 1610612736 && i != 4) {
                throw new zzdx("Unhandled input format:", zzdwVar);
            }
        }
        return new zzdw(zzdwVar.zzb, zzdwVar.zzc, 2);
    }
}
