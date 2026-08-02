package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.core.view.PointerIconCompat;
import com.android.billingclient.api.zzn$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import kotlin.io.path.DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zznv implements zzlq, zznw {
    private final Context zza;
    private final zznx zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzbp zzn;
    private zznu zzo;
    private zznu zzp;
    private zznu zzq;
    private zzaf zzr;
    private zzaf zzs;
    private zzaf zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzcb zze = new zzcb();
    private final zzca zzf = new zzca();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zznv(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zznt zzntVar = new zznt(zznt.zza);
        this.zzb = zzntVar;
        zzntVar.zzh(this);
    }

    public static zznv zzb(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager m1591m = DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0.m1591m(context.getSystemService("media_metrics"));
        if (m1591m == null) {
            return null;
        }
        createPlaybackSession = m1591m.createPlaybackSession();
        return new zznv(context, createPlaybackSession);
    }

    private static int zzr(int i) {
        switch (zzet.zzj(i)) {
            case GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE /* 6002 */:
                return 24;
            case GamesStatusCodes.STATUS_MULTIPLAYER_DISABLED /* 6003 */:
                return 28;
            case GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_INVALID_OPERATION /* 6004 */:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.zzc;
            build = this.zzj.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, zzaf zzafVar, int i) {
        if (zzet.zzG(this.zzs, zzafVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzafVar;
        zzx(0, j, zzafVar, i2);
    }

    private final void zzu(long j, zzaf zzafVar, int i) {
        if (zzet.zzG(this.zzt, zzafVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzafVar;
        zzx(2, j, zzafVar, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzcc zzccVar, zzui zzuiVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzuiVar == null || (zza = zzccVar.zza(zzuiVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzccVar.zzd(zza, this.zzf, false);
        zzccVar.zze(this.zzf.zzc, this.zze, 0L);
        zzax zzaxVar = this.zze.zzd.zzb;
        if (zzaxVar != null) {
            int zzn = zzet.zzn(zzaxVar.zza);
            i = zzn != 0 ? zzn != 1 ? zzn != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        zzcb zzcbVar = this.zze;
        long j = zzcbVar.zzm;
        if (j != -9223372036854775807L && !zzcbVar.zzk && !zzcbVar.zzi && !zzcbVar.zzb()) {
            builder.setMediaDurationMillis(zzet.zzu(j));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j, zzaf zzafVar, int i) {
        if (zzet.zzG(this.zzr, zzafVar)) {
            return;
        }
        int i2 = this.zzr == null ? 1 : 0;
        this.zzr = zzafVar;
        zzx(1, j, zzafVar, i2);
    }

    private final void zzx(int i, long j, zzaf zzafVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0.m(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzafVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzafVar.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzafVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzafVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzafVar.zzi;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzafVar.zzr;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzafVar.zzs;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzafVar.zzz;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzafVar.zzA;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzafVar.zzd;
            if (str4 != null) {
                int i8 = zzet.zza;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                if (create.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) create.second);
                }
            }
            float f = zzafVar.zzt;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        PlaybackSession playbackSession = this.zzc;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzy(zznu zznuVar) {
        if (zznuVar != null) {
            return zznuVar.zzc.equals(this.zzb.zze());
        }
        return false;
    }

    public final LogSessionId zza() {
        LogSessionId sessionId;
        sessionId = this.zzc.getSessionId();
        return sessionId;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzc(zzlo zzloVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        zzui zzuiVar = zzloVar.zzd;
        if (zzuiVar == null || !zzuiVar.zzb()) {
            zzs();
            this.zzi = str;
            playerName = zzn$$ExternalSyntheticApiModelOutline0.m269m().setPlayerName("AndroidXMedia3");
            playerVersion = playerName.setPlayerVersion("1.4.0-alpha02");
            this.zzj = playerVersion;
            zzv(zzloVar.zzb, zzloVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzd(zzlo zzloVar, String str, boolean z) {
        zzui zzuiVar = zzloVar.zzd;
        if ((zzuiVar == null || !zzuiVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zze(zzlo zzloVar, zzaf zzafVar, zzho zzhoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzf(zzlo zzloVar, int i, long j, long j2) {
        zzui zzuiVar = zzloVar.zzd;
        if (zzuiVar != null) {
            zznx zznxVar = this.zzb;
            zzcc zzccVar = zzloVar.zzb;
            HashMap hashMap = this.zzh;
            String zzf = zznxVar.zzf(zzccVar, zzuiVar);
            Long l = (Long) hashMap.get(zzf);
            Long l2 = (Long) this.zzg.get(zzf);
            this.zzh.put(zzf, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.zzg.put(zzf, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzg(zzlo zzloVar, zzue zzueVar) {
        zzui zzuiVar = zzloVar.zzd;
        if (zzuiVar == null) {
            return;
        }
        zzaf zzafVar = zzueVar.zzb;
        zzafVar.getClass();
        zznu zznuVar = new zznu(zzafVar, 0, this.zzb.zzf(zzloVar.zzb, zzuiVar));
        int i = zzueVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzp = zznuVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzq = zznuVar;
                return;
            }
        }
        this.zzo = zznuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzh(zzlo zzloVar, int i, long j) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01e7, code lost:
    
        if (r8 != 1) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzlq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzbw zzbwVar, zzlp zzlpVar) {
        int i;
        int i2;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        PlaybackStateEvent build;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis2;
        NetworkEvent build2;
        int i3;
        int errorCode;
        int zzr;
        int i4;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis3;
        PlaybackErrorEvent.Builder errorCode2;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build3;
        zzy zzyVar;
        int i5;
        int i6;
        if (zzlpVar.zzb() == 0) {
            return;
        }
        for (int i7 = 0; i7 < zzlpVar.zzb(); i7++) {
            int zza = zzlpVar.zza(i7);
            zzlo zzc = zzlpVar.zzc(zza);
            if (zza == 0) {
                this.zzb.zzk(zzc);
            } else if (zza == 11) {
                this.zzb.zzj(zzc, this.zzk);
            } else {
                this.zzb.zzi(zzc);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzlpVar.zzd(0)) {
            zzlo zzc2 = zzlpVar.zzc(0);
            if (this.zzj != null) {
                zzv(zzc2.zzb, zzc2.zzd);
            }
        }
        if (zzlpVar.zzd(2) && this.zzj != null) {
            zzfxr zza2 = zzbwVar.zzo().zza();
            int size = zza2.size();
            int i8 = 0;
            loop1: while (true) {
                if (i8 >= size) {
                    zzyVar = null;
                    break;
                }
                zzcj zzcjVar = (zzcj) zza2.get(i8);
                int i9 = 0;
                while (true) {
                    i6 = i8 + 1;
                    if (i9 < zzcjVar.zza) {
                        if (zzcjVar.zzd(i9) && (zzyVar = zzcjVar.zzb(i9).zzp) != null) {
                            break loop1;
                        } else {
                            i9++;
                        }
                    }
                }
                i8 = i6;
            }
            if (zzyVar != null) {
                PlaybackMetrics.Builder builder = this.zzj;
                int i10 = zzet.zza;
                int i11 = 0;
                while (true) {
                    if (i11 >= zzyVar.zzb) {
                        i5 = 1;
                        break;
                    }
                    UUID uuid = zzyVar.zza(i11).zza;
                    if (uuid.equals(zzk.zzd)) {
                        i5 = 3;
                        break;
                    } else if (uuid.equals(zzk.zze)) {
                        i5 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzk.zzc)) {
                            i5 = 6;
                            break;
                        }
                        i11++;
                    }
                }
                builder.setDrmType(i5);
            }
        }
        if (zzlpVar.zzd(PointerIconCompat.TYPE_COPY)) {
            this.zzy++;
        }
        zzbp zzbpVar = this.zzn;
        if (zzbpVar != null) {
            Context context = this.zza;
            if (zzbpVar.zza == 1001) {
                i3 = 20;
            } else {
                zzhw zzhwVar = (zzhw) zzbpVar;
                boolean z = zzhwVar.zzc == 1;
                int i12 = zzhwVar.zzg;
                Throwable cause = zzbpVar.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    if (z) {
                        i3 = 35;
                        if (i12 != 0) {
                        }
                    }
                    if (z && i12 == 3) {
                        i3 = 15;
                    } else {
                        if (!z || i12 != 2) {
                            if (cause instanceof zzsk) {
                                i4 = zzet.zzk(((zzsk) cause).zzd);
                                i3 = 13;
                            } else if (cause instanceof zzse) {
                                i4 = ((zzse) cause).zzb;
                                i3 = 14;
                            } else if (cause instanceof OutOfMemoryError) {
                                i3 = 14;
                            } else if (cause instanceof zzph) {
                                i4 = ((zzph) cause).zza;
                                i3 = 17;
                            } else if (cause instanceof zzpk) {
                                i4 = ((zzpk) cause).zza;
                                i3 = 18;
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                zzr = zzr(errorCode);
                                int i13 = zzr;
                                i4 = errorCode;
                                i3 = i13;
                            } else {
                                i3 = 22;
                            }
                            PlaybackSession playbackSession = this.zzc;
                            timeSinceCreatedMillis3 = zzn$$ExternalSyntheticApiModelOutline0.m268m().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd);
                            errorCode2 = timeSinceCreatedMillis3.setErrorCode(i3);
                            subErrorCode = errorCode2.setSubErrorCode(i4);
                            exception = subErrorCode.setException(zzbpVar);
                            build3 = exception.build();
                            playbackSession.reportPlaybackErrorEvent(build3);
                            this.zzz = true;
                            this.zzn = null;
                        }
                        i3 = 23;
                    }
                } else if (cause instanceof zzgn) {
                    i4 = ((zzgn) cause).zzc;
                    i3 = 5;
                    PlaybackSession playbackSession2 = this.zzc;
                    timeSinceCreatedMillis3 = zzn$$ExternalSyntheticApiModelOutline0.m268m().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd);
                    errorCode2 = timeSinceCreatedMillis3.setErrorCode(i3);
                    subErrorCode = errorCode2.setSubErrorCode(i4);
                    exception = subErrorCode.setException(zzbpVar);
                    build3 = exception.build();
                    playbackSession2.reportPlaybackErrorEvent(build3);
                    this.zzz = true;
                    this.zzn = null;
                } else if ((cause instanceof zzgm) || (cause instanceof zzbo)) {
                    i3 = 11;
                } else {
                    boolean z2 = cause instanceof zzgl;
                    if (z2 || (cause instanceof zzgv)) {
                        if (zzei.zzb(context).zza() == 1) {
                            i3 = 3;
                        } else {
                            Throwable cause2 = cause.getCause();
                            i3 = cause2 instanceof UnknownHostException ? 6 : cause2 instanceof SocketTimeoutException ? 7 : (z2 && ((zzgl) cause).zzb == 1) ? 4 : 8;
                        }
                    } else if (zzbpVar.zza == 1002) {
                        i3 = 21;
                    } else if (cause instanceof zzrb) {
                        Throwable cause3 = cause.getCause();
                        cause3.getClass();
                        int i14 = zzet.zza;
                        if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                            errorCode = zzet.zzk(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                            zzr = zzr(errorCode);
                            int i132 = zzr;
                            i4 = errorCode;
                            i3 = i132;
                            PlaybackSession playbackSession22 = this.zzc;
                            timeSinceCreatedMillis3 = zzn$$ExternalSyntheticApiModelOutline0.m268m().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd);
                            errorCode2 = timeSinceCreatedMillis3.setErrorCode(i3);
                            subErrorCode = errorCode2.setSubErrorCode(i4);
                            exception = subErrorCode.setException(zzbpVar);
                            build3 = exception.build();
                            playbackSession22.reportPlaybackErrorEvent(build3);
                            this.zzz = true;
                            this.zzn = null;
                        } else if (zzet.zza >= 23 && zzn$$ExternalSyntheticApiModelOutline0.m278m((Object) cause3)) {
                            i3 = 27;
                        } else if (cause3 instanceof NotProvisionedException) {
                            i3 = 24;
                        } else if (cause3 instanceof DeniedByServerException) {
                            i3 = 29;
                        } else {
                            if (!(cause3 instanceof zzrl)) {
                                i3 = cause3 instanceof zzra ? 28 : 30;
                            }
                            i3 = 23;
                        }
                    } else if ((cause instanceof zzgi) && (cause.getCause() instanceof FileNotFoundException)) {
                        Throwable cause4 = cause.getCause();
                        cause4.getClass();
                        Throwable cause5 = cause4.getCause();
                        int i15 = zzet.zza;
                        i3 = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? 32 : 31;
                    } else {
                        i3 = 9;
                    }
                }
            }
            i4 = 0;
            PlaybackSession playbackSession222 = this.zzc;
            timeSinceCreatedMillis3 = zzn$$ExternalSyntheticApiModelOutline0.m268m().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd);
            errorCode2 = timeSinceCreatedMillis3.setErrorCode(i3);
            subErrorCode = errorCode2.setSubErrorCode(i4);
            exception = subErrorCode.setException(zzbpVar);
            build3 = exception.build();
            playbackSession222.reportPlaybackErrorEvent(build3);
            this.zzz = true;
            this.zzn = null;
        }
        if (zzlpVar.zzd(2)) {
            zzck zzo = zzbwVar.zzo();
            boolean zzb = zzo.zzb(2);
            boolean zzb2 = zzo.zzb(1);
            boolean zzb3 = zzo.zzb(3);
            if (!zzb && !zzb2) {
                if (zzb3) {
                    zzb3 = true;
                }
            }
            if (!zzb) {
                zzw(elapsedRealtime, null, 0);
            }
            if (!zzb2) {
                zzt(elapsedRealtime, null, 0);
            }
            if (!zzb3) {
                zzu(elapsedRealtime, null, 0);
            }
        }
        if (zzy(this.zzo)) {
            zznu zznuVar = this.zzo;
            zzaf zzafVar = zznuVar.zza;
            if (zzafVar.zzs != -1) {
                int i16 = zznuVar.zzb;
                zzw(elapsedRealtime, zzafVar, 0);
                this.zzo = null;
            }
        }
        if (zzy(this.zzp)) {
            zznu zznuVar2 = this.zzp;
            zzaf zzafVar2 = zznuVar2.zza;
            int i17 = zznuVar2.zzb;
            zzt(elapsedRealtime, zzafVar2, 0);
            this.zzp = null;
        }
        if (zzy(this.zzq)) {
            zznu zznuVar3 = this.zzq;
            zzaf zzafVar3 = zznuVar3.zza;
            int i18 = zznuVar3.zzb;
            zzu(elapsedRealtime, zzafVar3, 0);
            this.zzq = null;
        }
        switch (zzei.zzb(this.zza).zza()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 9;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
            case 8:
            default:
                i = 1;
                break;
            case 7:
                i = 3;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 7;
                break;
        }
        if (i != this.zzm) {
            this.zzm = i;
            PlaybackSession playbackSession3 = this.zzc;
            networkType = DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0.m1592m().setNetworkType(i);
            timeSinceCreatedMillis2 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.zzd);
            build2 = timeSinceCreatedMillis2.build();
            playbackSession3.reportNetworkEvent(build2);
        }
        if (zzbwVar.zzf() != 2) {
            this.zzu = false;
        }
        if (((zzll) zzbwVar).zzC() == null) {
            this.zzv = false;
        } else if (zzlpVar.zzd(10)) {
            this.zzv = true;
        }
        int zzf = zzbwVar.zzf();
        if (this.zzu) {
            i2 = 5;
        } else if (this.zzv) {
            i2 = 13;
        } else {
            i2 = 4;
            if (zzf == 4) {
                i2 = 11;
            } else if (zzf == 2) {
                int i19 = this.zzl;
                i2 = (i19 == 0 || i19 == 2 || i19 == 12) ? 2 : !zzbwVar.zzu() ? 7 : zzbwVar.zzg() != 0 ? 10 : 6;
            } else if (zzf != 3) {
                i2 = (zzf != 1 || this.zzl == 0) ? this.zzl : 12;
            } else if (zzbwVar.zzu()) {
                i2 = zzbwVar.zzg() != 0 ? 9 : 3;
            }
        }
        if (this.zzl != i2) {
            this.zzl = i2;
            this.zzz = true;
            PlaybackSession playbackSession4 = this.zzc;
            state = DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0.m1593m().setState(this.zzl);
            timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(elapsedRealtime - this.zzd);
            build = timeSinceCreatedMillis.build();
            playbackSession4.reportPlaybackStateEvent(build);
        }
        if (zzlpVar.zzd(1028)) {
            this.zzb.zzg(zzlpVar.zzc(1028));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzj(zzlo zzloVar, zztz zztzVar, zzue zzueVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzk(zzlo zzloVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzl(zzlo zzloVar, zzbp zzbpVar) {
        this.zzn = zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzm(zzlo zzloVar, zzbv zzbvVar, zzbv zzbvVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzn(zzlo zzloVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzo(zzlo zzloVar, zzhn zzhnVar) {
        this.zzw += zzhnVar.zzg;
        this.zzx += zzhnVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final /* synthetic */ void zzp(zzlo zzloVar, zzaf zzafVar, zzho zzhoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzq(zzlo zzloVar, zzcp zzcpVar) {
        zznu zznuVar = this.zzo;
        if (zznuVar != null) {
            zzaf zzafVar = zznuVar.zza;
            if (zzafVar.zzs == -1) {
                zzad zzb = zzafVar.zzb();
                zzb.zzac(zzcpVar.zzb);
                zzb.zzI(zzcpVar.zzc);
                this.zzo = new zznu(zzb.zzad(), 0, zznuVar.zzc);
            }
        }
    }
}
