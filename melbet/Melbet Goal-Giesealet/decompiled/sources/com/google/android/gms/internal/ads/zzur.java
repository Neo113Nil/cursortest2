package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public interface zzur {
    default void zzA(zzaj zzajVar) {
    }

    void zzC(zzun zzunVar);

    zzun zzG(zzup zzupVar, zzyv zzyvVar, long j);

    default zzbe zzH() {
        return null;
    }

    default boolean zzI() {
        return true;
    }

    zzaj zzJ();

    void zzl(Handler handler, zzva zzvaVar);

    void zzm(zzva zzvaVar);

    void zzn(Handler handler, zzrq zzrqVar);

    void zzo(zzrq zzrqVar);

    void zzp(zzuq zzuqVar, zzgy zzgyVar, zzox zzoxVar);

    void zzq(zzuq zzuqVar);

    void zzr(zzuq zzuqVar);

    void zzs(zzuq zzuqVar);

    void zzt() throws IOException;
}
