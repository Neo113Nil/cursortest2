package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaeb implements zzadt {
    public final zzfwu zza;
    private final int zzb;

    private zzaeb(int i, zzfwu zzfwuVar) {
        this.zzb = i;
        this.zza = zzfwuVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaeb zzc(int i, zzfj zzfjVar) {
        zzadt zzaecVar;
        String str;
        zzfwr zzfwrVar = new zzfwr();
        int zzd = zzfjVar.zzd();
        int i2 = -2;
        while (zzfjVar.zza() > 8) {
            int zzh = zzfjVar.zzh();
            int zzc = zzfjVar.zzc() + zzfjVar.zzh();
            zzfjVar.zzF(zzc);
            if (zzh != 1414744396) {
                zzaec zzaecVar2 = null;
                switch (zzh) {
                    case 1718776947:
                        if (i2 == 2) {
                            zzfjVar.zzH(4);
                            int zzh2 = zzfjVar.zzh();
                            int zzh3 = zzfjVar.zzh();
                            zzfjVar.zzH(4);
                            int zzh4 = zzfjVar.zzh();
                            switch (zzh4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                zzez.zzf("StreamFormatChunk", "Ignoring track with unsupported compression " + zzh4);
                            } else {
                                zzak zzakVar = new zzak();
                                zzakVar.zzab(zzh2);
                                zzakVar.zzH(zzh3);
                                zzakVar.zzU(str);
                                zzaecVar2 = new zzaec(zzakVar.zzac());
                            }
                        } else if (i2 == 1) {
                            int zzj = zzfjVar.zzj();
                            String str2 = zzj != 1 ? zzj != 85 ? zzj != 255 ? zzj != 8192 ? zzj != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int zzj2 = zzfjVar.zzj();
                                int zzh5 = zzfjVar.zzh();
                                zzfjVar.zzH(6);
                                int zzk = zzfs.zzk(zzfjVar.zzp());
                                int zzj3 = zzfjVar.zzj();
                                byte[] bArr = new byte[zzj3];
                                zzfjVar.zzC(bArr, 0, zzj3);
                                zzak zzakVar2 = new zzak();
                                zzakVar2.zzU(str2);
                                zzakVar2.zzy(zzj2);
                                zzakVar2.zzV(zzh5);
                                if ("audio/raw".equals(str2) && zzk != 0) {
                                    zzakVar2.zzP(zzk);
                                }
                                if ("audio/mp4a-latm".equals(str2) && zzj3 > 0) {
                                    zzakVar2.zzK(zzfwu.zzm(bArr));
                                }
                                zzaecVar = new zzaec(zzakVar2.zzac());
                                break;
                            } else {
                                zzez.zzf("StreamFormatChunk", "Ignoring track with unsupported format tag " + zzj);
                            }
                        } else {
                            zzez.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfs.zzB(i2)));
                        }
                        zzaecVar = zzaecVar2;
                        break;
                    case 1751742049:
                        zzaecVar = zzady.zzb(zzfjVar);
                        break;
                    case 1752331379:
                        zzaecVar = zzadz.zzb(zzfjVar);
                        break;
                    case 1852994675:
                        zzaecVar = zzaed.zzb(zzfjVar);
                        break;
                    default:
                        zzaecVar = zzaecVar2;
                        break;
                }
            } else {
                zzaecVar = zzc(zzfjVar.zzh(), zzfjVar);
            }
            if (zzaecVar != null) {
                if (zzaecVar.zza() == 1752331379) {
                    int i3 = ((zzadz) zzaecVar).zza;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        zzez.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzfwrVar.zzf(zzaecVar);
            }
            zzfjVar.zzG(zzc);
            zzfjVar.zzF(zzd);
        }
        return new zzaeb(i, zzfwrVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zza() {
        return this.zzb;
    }

    public final zzadt zzb(Class cls) {
        zzfwu zzfwuVar = this.zza;
        int size = zzfwuVar.size();
        int i = 0;
        while (i < size) {
            zzadt zzadtVar = (zzadt) zzfwuVar.get(i);
            i++;
            if (zzadtVar.getClass() == cls) {
                return zzadtVar;
            }
        }
        return null;
    }
}
