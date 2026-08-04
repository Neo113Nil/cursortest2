package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdve extends zzfrr {

    @Nullable
    private final SensorManager zza;

    @Nullable
    private final Sensor zzb;
    private float zzc;
    private Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    @Nullable
    private zzdvd zzi;
    private boolean zzj;

    zzdve(Context context) {
        super("FlickDetector", "ads");
        this.zzc = 0.0f;
        this.zzd = Float.valueOf(0.0f);
        this.zze = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    public final void zza(zzdvd zzdvdVar) {
        this.zzi = zzdvdVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjR)).booleanValue()) {
                if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzj = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
                }
                if (this.zza == null || this.zzb == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.zzj = false;
                com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final void zzd(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjR)).booleanValue()) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (this.zze + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjT)).intValue() < currentTimeMillis) {
                this.zzf = 0;
                this.zze = currentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            Float valueOf = Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zzd = valueOf;
            float floatValue = valueOf.floatValue();
            float f = this.zzc;
            zzbbz zzbbzVar = zzbci.zzjS;
            if (floatValue > f + ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(0.0f);
                this.zzc = 0.0f;
            }
            if (this.zzg && this.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.zze = currentTimeMillis;
                int i = this.zzf + 1;
                this.zzf = i;
                this.zzg = false;
                this.zzh = false;
                zzdvd zzdvdVar = this.zzi;
                if (zzdvdVar != null) {
                    if (i == ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjU)).intValue()) {
                        zzdvs zzdvsVar = (zzdvs) zzdvdVar;
                        zzdvsVar.zzo(new zzdvq(zzdvsVar), zzdvr.GESTURE);
                    }
                }
            }
        }
    }
}
