package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgmx implements zzgmu {
    private final zzgoe zza;
    private final long zzb;

    zzgmx(zzgao zzgaoVar, zzgoe zzgoeVar, long j) {
        this.zza = zzgoeVar;
        this.zzb = j;
    }

    private static boolean zzc(zzgdu zzgduVar) {
        int zza = zzgduVar.zzb().zza().zza();
        int zzb = zzgduVar.zzb().zza().zzb();
        byte[] versionArray = zzatu.zza();
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        ByteBuffer allocate = ByteBuffer.allocate(6);
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(...)");
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) zza);
        allocate.putInt(zzb);
        byte[] array = allocate.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        return Arrays.equals(array, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zza(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            this.zza.zzb(20202);
            return true;
        }
        if (!zzc(zzgduVar)) {
            this.zza.zzb(20205);
            return true;
        }
        boolean z = zzgduVar.zzb().zzc() - System.currentTimeMillis() <= this.zzb;
        if (z) {
            this.zza.zzb(20203);
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zzb(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            this.zza.zzb(20204);
            return false;
        }
        if (zzc(zzgduVar)) {
            return true;
        }
        this.zza.zzb(20206);
        return false;
    }
}
