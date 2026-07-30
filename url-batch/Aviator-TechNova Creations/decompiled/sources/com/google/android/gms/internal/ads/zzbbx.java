package com.google.android.gms.internal.ads;

import com.bumptech.glide.load.Key;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbbx {
    private final zzbak zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzbbx(zzbak zzbakVar, String str, String str2, Class... clsArr) {
        this.zza = zzbakVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzbakVar.zzd().submit(new zzbbw(this));
    }

    private final String zzc(byte[] bArr, String str) throws zzazo, UnsupportedEncodingException {
        return new String(this.zza.zzf().zzb(bArr, str), Key.STRING_CHARSET_NAME);
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    final /* synthetic */ void zzb() {
        try {
            zzbak zzbakVar = this.zza;
            Class loadClass = zzbakVar.zze().loadClass(zzc(zzbakVar.zzg(), this.zzb));
            if (loadClass != null) {
                this.zzd = loadClass.getMethod(zzc(zzbakVar.zzg(), this.zzc), this.zze);
            }
        } catch (zzazo | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            this.zzf.countDown();
            throw th;
        }
        this.zzf.countDown();
    }
}
