package com.google.android.gms.internal.ads;

import com.google.android.material.internal.ViewUtils;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzacb {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, Opcodes.CHECKCAST, 224, 256, 384, 448, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static zzam zza(byte[] bArr, String str, String str2, zzad zzadVar) {
        zzfi zzfiVar;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzfiVar = new zzfi(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b2 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b2;
                }
            }
            int length = copyOf.length;
            zzfiVar = new zzfi(copyOf, length);
            if (copyOf[0] == 31) {
                zzfi zzfiVar2 = new zzfi(copyOf, length);
                while (zzfiVar2.zza() >= 16) {
                    zzfiVar2.zzl(2);
                    zzfiVar.zzf(zzfiVar2.zzd(14), 14);
                }
            }
            zzfiVar.zzi(copyOf, copyOf.length);
        }
        zzfiVar.zzl(60);
        int i3 = zzb[zzfiVar.zzd(6)];
        int i4 = zzc[zzfiVar.zzd(4)];
        int zzd2 = zzfiVar.zzd(5);
        int i5 = zzd2 < 29 ? (zzd[zzd2] * 1000) / 2 : -1;
        zzfiVar.zzl(10);
        int i6 = i3 + (zzfiVar.zzd(2) > 0 ? 1 : 0);
        zzak zzakVar = new zzak();
        zzakVar.zzJ(str);
        zzakVar.zzU("audio/vnd.dts");
        zzakVar.zzx(i5);
        zzakVar.zzy(i6);
        zzakVar.zzV(i4);
        zzakVar.zzD(null);
        zzakVar.zzM(str2);
        return zzakVar.zzac();
    }
}
