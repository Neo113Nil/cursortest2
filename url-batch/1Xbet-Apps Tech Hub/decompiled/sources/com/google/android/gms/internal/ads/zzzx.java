package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzzx extends HandlerThread implements Handler.Callback {
    private zzel zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzzz zze;

    public zzzx() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    int i2 = message.arg1;
                    zzel zzelVar = this.zza;
                    zzelVar.getClass();
                    zzelVar.zzb(i2);
                    this.zze = new zzzz(this, this.zza.zza(), i2 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzen e) {
                    zzez.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.zzd = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    zzez.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.zzc = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    zzez.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.zzd = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    zzel zzelVar2 = this.zza;
                    zzelVar2.getClass();
                    zzelVar2.zzc();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzzz zza(int i) {
        boolean z;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzel(this.zzb, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzzz zzzzVar = this.zze;
        zzzzVar.getClass();
        return zzzzVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
