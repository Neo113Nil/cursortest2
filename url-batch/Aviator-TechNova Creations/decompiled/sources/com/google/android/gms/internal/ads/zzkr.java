package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzkr {
    final /* synthetic */ zzks zza;
    private final WeakReference zzb;
    private final IntConsumer zzc;

    /* synthetic */ zzkr(zzks zzksVar, Context context, byte[] bArr) {
        Objects.requireNonNull(zzksVar);
        this.zza = zzksVar;
        this.zzb = new WeakReference(context);
        IntConsumer intConsumer = new IntConsumer() { // from class: com.google.android.gms.internal.ads.zzkp
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                zzks zzksVar2 = zzkr.this.zza;
                if (zzksVar2.zzae()) {
                    return;
                }
                zzksVar2.zzT(1, 19, Integer.valueOf(i));
            }
        };
        this.zzc = intConsumer;
        final zzdx zzd = zzksVar.zzY().zzd(zzksVar.zzX(), null);
        Objects.requireNonNull(zzd);
        context.registerDeviceIdChangeListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzkq
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzdx.this.zzn(runnable);
            }
        }, intConsumer);
    }

    final /* synthetic */ void zza() {
        Context context = (Context) this.zzb.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.zzc);
    }
}
