package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzggw extends zzghb {
    private final Context zza;
    private final Map zzb;

    zzggw(zzawg zzawgVar, zzgfx zzgfxVar, Map map, Context context, zzgoe zzgoeVar) {
        super("4E5LGVIWQ1GEduvP5TN/xg9UMJg1ApPRTsJapm6hD1tpcLj2ORRJ8msrY4RVPfxM", "Dj3g22+8PSWa8Tetil7hQ1gD69SNesarbyARD9M1zvc=", zzawgVar, zzgfxVar, zzgoeVar.zza(120));
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Long l = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l2 = (Long) method.invoke("", this.zza);
                if (l2 == null) {
                    throw null;
                }
                Long l3 = l2;
                l = l2;
            } else {
                ListenableFuture listenableFuture = (ListenableFuture) this.zzb.get("gs");
                if (listenableFuture != null && listenableFuture.isDone()) {
                    l = Long.valueOf(((zzaxg) listenableFuture.get()).zze());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzawgVar) {
            zzawgVar.zzR(l.longValue());
        }
    }
}
