package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import com.android.billingclient.api.zzn$$ExternalSyntheticApiModelOutline0;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzawd extends zzaxd {
    private static final zzaxe zzh = new zzaxe();
    private final Context zzi;

    public zzawd(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, int i, int i2, Context context, zzarh zzarhVar) {
        super(zzavpVar, "iz9pI8M74OdFMOjBXhk6CVKK/c29GtinDT3TfbuphLdYOSnoV+Rg8WuW9whaa7rD", "AMztxBQmasdCMrU1nlH2RhtlfSPsjcYFxTHFmKvCDYM=", zzaroVar, i, 27);
        this.zzi = context;
    }

    private final String zzc() {
        try {
            if (this.zza.zzl() != null) {
                this.zza.zzl().get();
            }
            zzasj zzc = this.zza.zzc();
            if (zzc == null || !zzc.zzaj()) {
                return null;
            }
            return zzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzata zzataVar;
        AtomicReference zza = zzh.zza(this.zzi.getPackageName());
        synchronized (zza) {
            zzata zzataVar2 = (zzata) zza.get();
            if (zzataVar2 == null || zzavs.zzd(zzataVar2.zza) || zzataVar2.zza.equals("E") || zzataVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzavs.zzd(null)) {
                    (!zzavs.zzd(null) ? false : false).booleanValue();
                    i = 3;
                } else {
                    i = 5;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzch);
                String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcg)).booleanValue() ? zzb() : null;
                if (bool.booleanValue() && this.zza.zzp() && zzavs.zzd(zzb)) {
                    zzb = zzc();
                }
                zzata zzataVar3 = new zzata((String) this.zze.invoke(null, this.zzi, valueOf, zzb));
                if (zzavs.zzd(zzataVar3.zza) || zzataVar3.zza.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String zzc = zzc();
                        if (!zzavs.zzd(zzc)) {
                            zzataVar3.zza = zzc;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                zza.set(zzataVar3);
            }
            zzataVar = (zzata) zza.get();
        }
        synchronized (this.zzd) {
            if (zzataVar != null) {
                this.zzd.zzx(zzataVar.zza);
                this.zzd.zzX(zzataVar.zzb);
                this.zzd.zzZ(zzataVar.zzc);
                this.zzd.zzi(zzataVar.zzd);
                this.zzd.zzw(zzataVar.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzf = zzavs.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzci));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzavs.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcj)))));
            }
            Context context = this.zzi;
            String packageName = context.getPackageName();
            this.zza.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzgdc zze = zzgdc.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaxf
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    int type;
                    byte[] value;
                    zzgdc zzgdcVar = zzgdc.this;
                    if (list == null) {
                        zzgdcVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum m267m = zzn$$ExternalSyntheticApiModelOutline0.m267m(list.get(i));
                            type = m267m.getType();
                            if (type == 8) {
                                value = m267m.getValue();
                                zzgdcVar.zzc(zzavs.zzb(value));
                                return;
                            }
                        }
                        zzgdcVar.zzc(null);
                    } catch (Throwable unused) {
                        zzgdcVar.zzc(null);
                    }
                }
            });
            return (String) zze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
