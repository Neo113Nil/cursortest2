package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public abstract class zzaul implements zzauk {
    protected static volatile zzavp zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    protected zzavh zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    protected zzaul(Context context) {
        try {
            zzatd.zzd();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzct)).booleanValue()) {
                this.zzr = new zzavh();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzj() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzm(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        zzauj zzaujVar;
        String str2;
        int i2;
        Exception exc;
        int i3;
        int i4;
        String zza2;
        int i5;
        int i6 = i;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcm)).booleanValue();
        zzaro zzaroVar = null;
        if (booleanValue) {
            zzaujVar = zza != null ? zza.zzd() : null;
            str2 = "be";
        } else {
            zzaujVar = null;
            str2 = null;
        }
        try {
            if (i6 == 3) {
                zzaroVar = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i5 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    if (booleanValue) {
                        if (i6 != i2) {
                        }
                        zzaujVar.zzc(i4, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (zzaroVar != null) {
                        }
                        zza2 = Integer.toString(5);
                        return zza2;
                    }
                    i3 = 2;
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (zzaroVar != null) {
                    }
                    zza2 = Integer.toString(5);
                    return zza2;
                }
            } else if (i6 == 2) {
                zzaroVar = zzd(context, view, activity);
                i5 = PointerIconCompat.TYPE_TEXT;
            } else {
                zzaroVar = zzc(context, null);
                i5 = 1000;
            }
            if (!booleanValue || zzaujVar == null) {
                i2 = 3;
            } else {
                i2 = 3;
                try {
                    zzaujVar.zzc(i5, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    if (booleanValue && zzaujVar != null) {
                        if (i6 != i2) {
                            i3 = 2;
                            i4 = PointerIconCompat.TYPE_HELP;
                        } else {
                            i3 = 2;
                            if (i6 == 2) {
                                i4 = PointerIconCompat.TYPE_VERTICAL_TEXT;
                            } else {
                                i6 = 1;
                                i4 = 1001;
                            }
                        }
                        zzaujVar.zzc(i4, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis222 = System.currentTimeMillis();
                        if (zzaroVar != null) {
                        }
                        zza2 = Integer.toString(5);
                        return zza2;
                    }
                    i3 = 2;
                    long currentTimeMillis2222 = System.currentTimeMillis();
                    if (zzaroVar != null) {
                    }
                    zza2 = Integer.toString(5);
                    return zza2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            i2 = 3;
        }
        i3 = 2;
        long currentTimeMillis22222 = System.currentTimeMillis();
        if (zzaroVar != null) {
            try {
            } catch (Exception e4) {
                zza2 = Integer.toString(7);
                if (booleanValue && zzaujVar != null) {
                    zzaujVar.zzc(i6 == i2 ? PointerIconCompat.TYPE_CROSSHAIR : i6 == i3 ? PointerIconCompat.TYPE_COPY : GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, e4);
                }
            }
            if (((zzasj) zzaroVar.zzbr()).zzaY() != 0) {
                zzasj zzasjVar = (zzasj) zzaroVar.zzbr();
                int i7 = zzatd.zzc;
                zza2 = zzatd.zza(zzasjVar.zzaV(), str);
                if (booleanValue && zzaujVar != null) {
                    zzaujVar.zzc(i6 == i2 ? PointerIconCompat.TYPE_CELL : i6 == i3 ? PointerIconCompat.TYPE_ALIAS : 1004, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, null);
                }
                return zza2;
            }
        }
        zza2 = Integer.toString(5);
        return zza2;
    }

    protected abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzavf;

    protected abstract zzaro zzb(Context context, View view, Activity activity);

    protected abstract zzaro zzc(Context context, zzarh zzarhVar);

    protected abstract zzaro zzd(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zze(Context context, String str, View view) {
        return zzm(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzm(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzg(Context context) {
        if (zzavs.zzc()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzm(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final String zzh(Context context, View view, Activity activity) {
        return zzm(context, null, 2, view, activity, null);
    }

    protected abstract zzavr zzi(MotionEvent motionEvent) throws zzavf;

    @Override // com.google.android.gms.internal.ads.zzauk
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l;
        if (this.zzu) {
            zzj();
            this.zzu = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzs = motionEvent.getRawX();
            this.zzt = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = rawX - this.zzs;
            double d2 = rawY - this.zzt;
            this.zzk += Math.sqrt((d * d) + (d2 * d2));
            this.zzs = rawX;
            this.zzt = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzb = obtain;
                    this.zzc.add(obtain);
                    if (this.zzc.size() > 6) {
                        ((MotionEvent) this.zzc.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += motionEvent.getHistorySize() + 1;
                    zzavr zzi = zzi(motionEvent);
                    Long l2 = zzi.zzd;
                    if (l2 != null && zzi.zzg != null) {
                        this.zzi += l2.longValue() + zzi.zzg.longValue();
                    }
                    if (this.zzq != null && (l = zzi.zze) != null && zzi.zzh != null) {
                        this.zzj += l.longValue() + zzi.zzh.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (zzavf unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final synchronized void zzl(int i, int i2, int i3) {
        if (this.zzb != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzck)).booleanValue()) {
                zzj();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            this.zzb = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, i2 * this.zzq.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavh zzavhVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzct)).booleanValue() || (zzavhVar = this.zzr) == null) {
            return;
        }
        zzavhVar.zzb(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    public void zzo(View view) {
    }
}
