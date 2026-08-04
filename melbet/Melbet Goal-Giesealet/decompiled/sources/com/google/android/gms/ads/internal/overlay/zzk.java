package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzk extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzl zza;

    /* synthetic */ zzk(zzl zzlVar, byte[] bArr) {
        Objects.requireNonNull(zzlVar);
        this.zza = zzlVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        zzl zzlVar = this.zza;
        Bitmap zza = com.google.android.gms.ads.internal.zzt.zzy().zza(Integer.valueOf(zzlVar.zzc.zzo.zzf));
        if (zza != null) {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.zzl zzlVar2 = zzlVar.zzc.zzo;
            boolean z = zzlVar2.zzd;
            float f = zzlVar2.zze;
            Activity activity = zzlVar.zzb;
            if (!z || f <= 0.0f || f > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), zza);
            } else {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(zza, zza.getWidth(), zza.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), zza);
                }
            }
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzk.this.zza.zzb.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
