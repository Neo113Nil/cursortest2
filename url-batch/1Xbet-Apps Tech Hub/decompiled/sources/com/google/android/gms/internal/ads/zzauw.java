package com.google.android.gms.internal.ads;

import com.bumptech.glide.load.Key;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzauw {
    protected static final String zza = "zzauw";
    private final zzatj zzb;
    private final String zzc;
    private final String zzd;
    private final Class[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzauw(zzatj zzatjVar, String str, String str2, Class... clsArr) {
        this.zzb = zzatjVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzatjVar.zzk().submit(new zzauv(this));
    }

    static /* bridge */ /* synthetic */ void zzb(zzauw zzauwVar) {
        try {
            zzatj zzatjVar = zzauwVar.zzb;
            Class loadClass = zzatjVar.zzi().loadClass(zzauwVar.zzc(zzatjVar.zzu(), zzauwVar.zzc));
            if (loadClass != null) {
                zzauwVar.zze = loadClass.getMethod(zzauwVar.zzc(zzauwVar.zzb.zzu(), zzauwVar.zzd), zzauwVar.zzf);
                Method method = zzauwVar.zze;
            }
        } catch (zzasn | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            zzauwVar.zzg.countDown();
            throw th;
        }
        zzauwVar.zzg.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzasn, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), Key.STRING_CHARSET_NAME);
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (this.zzg.await(2L, TimeUnit.SECONDS)) {
                return this.zze;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
