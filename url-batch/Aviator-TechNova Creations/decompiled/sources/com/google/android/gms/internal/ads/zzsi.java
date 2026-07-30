package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzsi implements zzqm {
    private final Context zza;
    private final zzsh zzb;
    private zzed zzc;
    private zzdn zzd;
    private zzps zze;
    private zzpx zzf;
    private Looper zzg;
    private Context zzh;
    private final zzsm zzi;

    /* synthetic */ zzsi(zzsg zzsgVar, byte[] bArr) {
        this.zza = zzsgVar.zzd();
        zzsm zzg = zzsgVar.zzg();
        zzg.getClass();
        this.zzi = zzg;
        this.zze = zzsgVar.zze();
        this.zzb = zzsgVar.zzd() != null ? new zzsh(this, null) : null;
        this.zzd = zzdn.zza;
    }

    @EnsuresNonNull({"audioCapabilities"})
    private final void zzj(zzqf zzqfVar) {
        Context context;
        zzk();
        zzpx zzpxVar = this.zzf;
        if (zzpxVar == null && (context = this.zza) != null) {
            zzpx zzpxVar2 = new zzpx(context, new zzpw() { // from class: com.google.android.gms.internal.ads.zzsf
                @Override // com.google.android.gms.internal.ads.zzpw
                public final /* synthetic */ void zza(zzps zzpsVar) {
                    zzsi.this.zzg(zzpsVar);
                }
            }, zzqfVar.zzb, zzqfVar.zzc);
            this.zzf = zzpxVar2;
            this.zze = zzpxVar2.zzd();
        } else if (zzpxVar != null) {
            AudioDeviceInfo audioDeviceInfo = zzqfVar.zzc;
            if (audioDeviceInfo != null) {
                zzpxVar.zzc(audioDeviceInfo);
            }
            this.zzf.zzb(zzqfVar.zzb);
        }
        this.zze.getClass();
    }

    private final void zzk() {
        if (this.zza == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzg;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        String zzl = zzl(looper);
        String zzl2 = zzl(myLooper);
        if (!z) {
            throw new IllegalStateException(zzgrt.zzd("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", zzl, zzl2));
        }
        this.zzg = myLooper;
    }

    private static String zzl(Looper looper) {
        return looper == null ? AbstractJsonLexerKt.NULL : looper.getThread().getName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r6.zze.zzd(r1, r7) != null) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzqm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzqh zza(zzqf zzqfVar) {
        zzj(zzqfVar);
        zzsm zzsmVar = this.zzi;
        zzv zzvVar = zzqfVar.zza;
        zzd zzdVar = zzqfVar.zzb;
        zzpz zza = zzsmVar.zza(zzvVar, zzdVar);
        zzqg zzqgVar = new zzqg();
        int i = 0;
        if (Objects.equals(zzvVar.zzo, "audio/raw")) {
            int i2 = zzvVar.zzI;
            if (zzfj.zzA(i2)) {
                if (i2 != 2) {
                    i = 1;
                }
                i = 2;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
                sb.append("Invalid PCM encoding: ");
                sb.append(i2);
                zzee.zzc("ATAudioOutputProvider", sb.toString());
            }
        }
        zzqgVar.zzd(i);
        zzqgVar.zza(zza.zzb);
        zzqgVar.zzb(zza.zzc);
        zzqgVar.zzc(zza.zzd);
        return zzqgVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzql zzb(zzqf zzqfVar) throws zzqd {
        int i;
        int intValue;
        int i2;
        int i3;
        int i4;
        zzj(zzqfVar);
        zzv zzvVar = zzqfVar.zza;
        String str = zzvVar.zzo;
        if (Objects.equals(str, "audio/raw")) {
            int i5 = zzvVar.zzI;
            zzgrc.zza(zzfj.zzA(i5));
            i = zzvVar.zzH;
            int i6 = zzvVar.zzG;
            intValue = zzfj.zzB(i6);
            i3 = zzfj.zzD(i5) * i6;
            i4 = i5;
            i2 = 0;
        } else {
            i = zzvVar.zzH;
            zzpz zzpzVar = zzpz.zza;
            Pair zzd = this.zze.zzd(zzvVar, zzqfVar.zzb);
            if (zzd == null) {
                String valueOf = String.valueOf(zzvVar);
                String.valueOf(valueOf);
                throw new zzqd("Unable to configure passthrough for: ".concat(String.valueOf(valueOf)));
            }
            int intValue2 = ((Integer) zzd.first).intValue();
            intValue = ((Integer) zzd.second).intValue();
            i2 = 2;
            i3 = -1;
            i4 = intValue2;
        }
        int i7 = i;
        int i8 = zzvVar.zzj;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i8 == -1) {
            i8 = 768000;
        }
        int i9 = i8;
        int i10 = zzqfVar.zzf;
        if (i10 == -1) {
            int i11 = i3;
            zzgrc.zzi(AudioTrack.getMinBufferSize(i7, intValue, i4) != -2);
            int i12 = i11 == -1 ? 1 : i11;
            i10 = (((Math.max(r8, zzsy.zzb(r8, i4, i2, r11, i7, i9)) + i12) - 1) / i12) * i12;
        }
        zzqk zzqkVar = new zzqk();
        zzqkVar.zzb(i7);
        zzqkVar.zzc(intValue);
        zzqkVar.zza(i4);
        zzqkVar.zze(i10);
        zzqkVar.zzg(zzqfVar.zzd);
        zzqkVar.zzf(zzqfVar.zzb);
        zzqkVar.zzd(false);
        zzqkVar.zzh(zzqfVar.zze);
        return new zzql(zzqkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final void zzc(zzqj zzqjVar) {
        zzk();
        if (this.zzc == null) {
            zzed zzedVar = new zzed(Thread.currentThread());
            this.zzc = zzedVar;
            zzedVar.zzg(false);
        }
        this.zzc.zzb(zzqjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final void zzd(zzdn zzdnVar) {
        this.zzd = zzdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final void zze() {
        zzed zzedVar = this.zzc;
        if (zzedVar != null) {
            zzedVar.zzf();
        }
        zzpx zzpxVar = this.zzf;
        if (zzpxVar != null) {
            zzpxVar.zze();
        }
    }

    public final zzsd zzf(zzql zzqlVar) throws zzqi {
        Context context;
        try {
            int i = zzqlVar.zzg;
            int i2 = zzqlVar.zzh;
            Context context2 = null;
            if (i2 != -1 && (context = this.zza) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.zzh;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.zzh = context.createDeviceContext(i2);
                }
                context2 = this.zzh;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzqlVar.zzf.zza()).setAudioFormat(new AudioFormat.Builder().setSampleRate(zzqlVar.zzb).setChannelMask(zzqlVar.zzc).setEncoding(zzqlVar.zza).build()).setTransferMode(1).setBufferSizeInBytes(zzqlVar.zze).setSessionId(i);
            if (Build.VERSION.SDK_INT >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (Build.VERSION.SDK_INT >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new zzsd(build, zzqlVar, this.zzb, this.zzd);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new zzqi();
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zzqi(e);
        }
    }

    final void zzg(zzps zzpsVar) {
        zzk();
        zzps zzpsVar2 = this.zze;
        if (zzpsVar2 == null || zzpsVar.equals(zzpsVar2)) {
            return;
        }
        this.zze = zzpsVar;
        zzed zzedVar = this.zzc;
        if (zzedVar != null) {
            zzedVar.zzd(-1, zzse.zza);
            zzedVar.zze();
        }
    }

    final /* synthetic */ void zzh(zzps zzpsVar) {
        this.zze = zzpsVar;
    }

    final /* synthetic */ zzpx zzi() {
        return this.zzf;
    }
}
