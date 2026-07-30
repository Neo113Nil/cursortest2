package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbay extends zzbby {
    private static final zzbbz zzh = new zzbbz();
    private final zzavz zzi;
    private final Context zzj;
    private final zzaye zzk;

    public zzbay(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2, Context context, zzavs zzavsVar, zzavz zzavzVar, zzaye zzayeVar) {
        super(zzbakVar, "ZQJAB1msowxCz8mqmvl8OKnBprztAFjM8nst6XEIBWdYMrqlQRx5Smd7STWtlGuv", "xxbBAKX4fynezd8sgu9AN42lCipqUqelmvdX3g0EV6w=", zzawgVar, i, 27);
        this.zzj = context;
        this.zzi = zzavzVar;
        this.zzk = zzayeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zzayb zzc() throws IllegalAccessException, InvocationTargetException {
        int zzb;
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdt)).booleanValue()) {
            zzb = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdz)).intValue();
        } else {
            zzb = this.zzi.zzb();
        }
        zzayb zzaybVar = new zzayb((String) this.zze.invoke(null, this.zzj, false, ""));
        zzaye zzayeVar = this.zzk;
        if (zzayeVar != null && zzayeVar.zza() != null) {
            try {
                str = (String) zzayeVar.zza().get(zzb, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            zzaybVar.zza = str;
            return zzaybVar;
        }
        str = ExifInterface.LONGITUDE_EAST;
        zzaybVar.zza = str;
        return zzaybVar;
    }

    private final String zzd() {
        try {
            zzbak zzbakVar = this.zza;
            if (zzbakVar.zzm() != null) {
                zzbakVar.zzm().get();
            }
            zzaxg zzl = zzbakVar.zzl();
            if (zzl == null || !zzl.zza()) {
                return null;
            }
            return zzl.zzb();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzayb zzaybVar;
        zzayb zzaybVar2;
        zzbbz zzbbzVar = zzh;
        Context context = this.zzj;
        AtomicReference zza = zzbbzVar.zza(context.getPackageName());
        synchronized (zza) {
            zzayb zzaybVar3 = (zzayb) zza.get();
            if (zzaybVar3 == null || zzban.zzc(zzaybVar3.zza) || zzaybVar3.zza.equals(ExifInterface.LONGITUDE_EAST) || zzaybVar3.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                boolean z = false;
                if (zzban.zzc(null)) {
                    (!zzban.zzc(null) ? false : false).booleanValue();
                    i = 3;
                } else {
                    i = 5;
                }
                if (this.zzk != null) {
                    zzaybVar = zzc();
                } else {
                    if (i == 3 && !this.zzi.zza()) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdh);
                    String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdg)).booleanValue() ? zzb() : null;
                    if (bool.booleanValue() && this.zza.zzi() && zzban.zzc(zzb)) {
                        zzb = zzd();
                    }
                    zzayb zzaybVar4 = new zzayb((String) this.zze.invoke(null, context, valueOf, zzb));
                    String str = zzaybVar4.zza;
                    if (zzban.zzc(str) || str.equals(ExifInterface.LONGITUDE_EAST)) {
                        int i2 = i - 1;
                        if (i2 == 3) {
                            String zzd = zzd();
                            if (!zzban.zzc(zzd)) {
                                zzaybVar4.zza = zzd;
                            }
                        } else if (i2 == 4) {
                            throw null;
                        }
                    }
                    zzaybVar = zzaybVar4;
                }
                zza.set(zzaybVar);
            }
            zzaybVar2 = (zzayb) zza.get();
        }
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            if (zzaybVar2 != null) {
                zzawgVar.zzo(zzaybVar2.zza);
                zzawgVar.zzu(zzaybVar2.zzb);
                zzawgVar.zzt(zzaybVar2.zzc);
                zzawgVar.zzD(zzaybVar2.zzd);
                zzawgVar.zzE(zzaybVar2.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzb = zzban.zzb((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdi));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzb)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzban.zzb((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdj)))));
            }
            Context context = this.zzj;
            return zzbcb.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
