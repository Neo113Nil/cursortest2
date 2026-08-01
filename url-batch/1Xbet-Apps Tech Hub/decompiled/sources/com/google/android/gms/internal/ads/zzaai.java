package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaai {
    private final zzzo zza = new zzzo();
    private final zzaae zzb;
    private final zzaah zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzaai(Context context) {
        zzaae zzaaeVar;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = zzfs.zza;
            zzaaeVar = zzaag.zzc(applicationContext);
            if (zzaaeVar == null) {
                zzaaeVar = zzaaf.zzc(applicationContext);
            }
        } else {
            zzaaeVar = null;
        }
        this.zzb = zzaaeVar;
        this.zzc = zzaaeVar != null ? zzaah.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* synthetic */ void zzb(zzaai zzaaiVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzaaiVar.zzk = refreshRate;
            zzaaiVar.zzl = (refreshRate * 80) / 100;
        } else {
            zzez.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzaaiVar.zzk = -9223372036854775807L;
            zzaaiVar.zzl = -9223372036854775807L;
        }
    }

    private final void zzk() {
        Surface surface;
        if (zzfs.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzaad.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (java.lang.Math.abs(r0 - r9.zzg) >= r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r5 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        if (r9.zza.zzb() >= 30) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzm() {
        if (zzfs.zza < 30 || this.zze == null) {
            return;
        }
        float zza = this.zza.zzg() ? this.zza.zza() : this.zzf;
        float f = this.zzg;
        if (zza != f) {
            boolean z = true;
            if (zza != -1.0f && f != -1.0f) {
                float f2 = 1.0f;
                if (this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                    f2 = 0.02f;
                }
            } else if (zza == -1.0f) {
            }
            this.zzg = zza;
            zzn(false);
        }
    }

    private final void zzn(boolean z) {
        Surface surface;
        if (zzfs.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            zzaad.zza(surface, f);
        }
    }

    public final long zza(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc = this.zza.zzc();
            long j3 = this.zzq + ((long) ((zzc * (this.zzm - this.zzp)) / this.zzi));
            if (Math.abs(j - j3) > 20000000) {
                zzl();
            } else {
                j = j3;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzaah zzaahVar = this.zzc;
        if (zzaahVar != null && this.zzk != -9223372036854775807L) {
            long j4 = zzaahVar.zza;
            if (j4 != -9223372036854775807L) {
                long j5 = this.zzk;
                long j6 = j4 + (((j - j4) / j5) * j5);
                if (j <= j6) {
                    j2 = j6 - j5;
                } else {
                    j6 = j5 + j6;
                    j2 = j6;
                }
                long j7 = this.zzl;
                if (j6 - j >= j - j2) {
                    j6 = j2;
                }
                return j6 - j7;
            }
        }
        return j;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j * 1000);
        zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzaah zzaahVar = this.zzc;
            zzaahVar.getClass();
            zzaahVar.zzb();
            this.zzb.zzb(new zzaab(this));
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzaae zzaaeVar = this.zzb;
        if (zzaaeVar != null) {
            zzaaeVar.zza();
            zzaah zzaahVar = this.zzc;
            zzaahVar.getClass();
            zzaahVar.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        int i = zzfs.zza;
        boolean zza = zzaac.zza(surface);
        Surface surface2 = this.zze;
        if (true == zza) {
            surface = null;
        }
        if (surface2 == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzn(true);
    }
}
