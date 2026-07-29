package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.tapjoy.TJAdUnitConstants;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzde extends zzar {
    private String zzaaa;
    protected int zzaac;
    private int zzabz;
    protected boolean zzaca;
    private boolean zzacb;
    private boolean zzacc;
    private String zzzz;

    public zzde(zzat zzatVar) {
        super(zzatVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        ApplicationInfo applicationInfo;
        int i;
        zzcg zzo;
        Context context = getContext();
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            zzd("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            zzt("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) <= 0 || (zzo = new zzce(zzbs()).zzo(i)) == null) {
            return;
        }
        zzq("Loading global XML config values");
        if (zzo.zzzz != null) {
            String str = zzo.zzzz;
            this.zzzz = str;
            zzb("XML config - app name", str);
        }
        if (zzo.zzaaa != null) {
            String str2 = zzo.zzaaa;
            this.zzaaa = str2;
            zzb("XML config - app version", str2);
        }
        if (zzo.zzaab != null) {
            String lowerCase = zzo.zzaab.toLowerCase(Locale.US);
            int i2 = "verbose".equals(lowerCase) ? 0 : TJAdUnitConstants.String.VIDEO_INFO.equals(lowerCase) ? 1 : "warning".equals(lowerCase) ? 2 : "error".equals(lowerCase) ? 3 : -1;
            if (i2 >= 0) {
                this.zzabz = i2;
                zza("XML config - log level", Integer.valueOf(i2));
            }
        }
        if (zzo.zzaac >= 0) {
            int i3 = zzo.zzaac;
            this.zzaac = i3;
            this.zzaca = true;
            zzb("XML config - dispatch period (sec)", Integer.valueOf(i3));
        }
        if (zzo.zzaad != -1) {
            boolean z = zzo.zzaad == 1;
            this.zzacc = z;
            this.zzacb = true;
            zzb("XML config - dry run", Boolean.valueOf(z));
        }
    }

    public final String zzaf() {
        zzch();
        return this.zzzz;
    }

    public final String zzag() {
        zzch();
        return this.zzaaa;
    }

    public final boolean zzfm() {
        zzch();
        return false;
    }

    public final boolean zzfn() {
        zzch();
        return this.zzacb;
    }

    public final boolean zzfo() {
        zzch();
        return this.zzacc;
    }
}
