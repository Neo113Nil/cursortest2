package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzatx extends zzaux {
    private static final zzauy zzi = new zzauy();
    private final Context zzj;

    public zzatx(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2, Context context, zzaoz zzaozVar) {
        super(zzatjVar, "p0JEft1H0Ux+/zQoofBGK8/hHhAdN3veKIjNmetX6I2+7J67s0tf2NBKaWy11XvI", "yaxGJhC1WxugM+8EfEc/xAIuDWtPkz77G//hU7f/vWw=", zzapgVar, i, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaqd zzc = this.zzb.zzc();
            if (zzc == null || !zzc.zzaj()) {
                return null;
            }
            return zzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzaqu zzaquVar;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzaqu zzaquVar2 = (zzaqu) zza.get();
            if (zzaquVar2 == null || zzatm.zzd(zzaquVar2.zza) || zzaquVar2.zza.equals(ExifInterface.LONGITUDE_EAST) || zzaquVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzatm.zzd(null)) {
                    (!zzatm.zzd(null) ? false : false).booleanValue();
                    i = 3;
                } else {
                    i = 5;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzck);
                String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcj)).booleanValue() ? zzb() : null;
                if (bool.booleanValue() && this.zzb.zzp() && zzatm.zzd(zzb)) {
                    zzb = zzc();
                }
                zzaqu zzaquVar3 = new zzaqu((String) this.zzf.invoke(null, this.zzj, valueOf, zzb));
                if (zzatm.zzd(zzaquVar3.zza) || zzaquVar3.zza.equals(ExifInterface.LONGITUDE_EAST)) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String zzc = zzc();
                        if (!zzatm.zzd(zzc)) {
                            zzaquVar3.zza = zzc;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                zza.set(zzaquVar3);
            }
            zzaquVar = (zzaqu) zza.get();
        }
        synchronized (this.zze) {
            if (zzaquVar != null) {
                this.zze.zzx(zzaquVar.zza);
                this.zze.zzX(zzaquVar.zzb);
                this.zze.zzZ(zzaquVar.zzc);
                this.zze.zzi(zzaquVar.zzd);
                this.zze.zzw(zzaquVar.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzf = zzatm.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcl));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzatm.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcm)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(ExifInterface.LATITUDE_SOUTH)) {
                return null;
            }
            final zzgbt zze = zzgbt.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzauz
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    zzgbt zzgbtVar = zzgbt.this;
                    if (list == null) {
                        zzgbtVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                            if (apkChecksum.getType() == 8) {
                                zzgbtVar.zzc(zzatm.zzb(apkChecksum.getValue()));
                                return;
                            }
                        }
                        zzgbtVar.zzc(null);
                    } catch (Throwable unused) {
                        zzgbtVar.zzc(null);
                    }
                }
            });
            return (String) zze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
