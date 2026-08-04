package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzaer implements zzaek {
    public final zzgjz zza;
    private final int zzb;

    private zzaer(int i, zzgjz zzgjzVar) {
        this.zzb = i;
        this.zza = zzgjzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaer zzb(int i, zzef zzefVar) {
        zzaek zzaesVar;
        String str;
        zzgjw zzgjwVar = new zzgjw();
        int zze = zzefVar.zze();
        int i2 = -2;
        while (zzefVar.zzd() > 8) {
            int zzC = zzefVar.zzC();
            int zzg = zzefVar.zzg() + zzefVar.zzC();
            zzefVar.zzf(zzg);
            if (zzC != 1414744396) {
                zzaes zzaesVar2 = null;
                switch (zzC) {
                    case 1718776947:
                        if (i2 == 2) {
                            zzefVar.zzk(4);
                            int zzC2 = zzefVar.zzC();
                            int zzC3 = zzefVar.zzC();
                            zzefVar.zzk(4);
                            int zzC4 = zzefVar.zzC();
                            switch (zzC4) {
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
                                StringBuilder sb = new StringBuilder(String.valueOf(zzC4).length() + 44);
                                sb.append("Ignoring track with unsupported compression ");
                                sb.append(zzC4);
                                zzds.zzc("StreamFormatChunk", sb.toString());
                            } else {
                                zzs zzsVar = new zzs();
                                zzsVar.zzt(zzC2);
                                zzsVar.zzu(zzC3);
                                zzsVar.zzm(str);
                                zzaesVar2 = new zzaes(zzsVar.zzM());
                            }
                        } else if (i2 == 1) {
                            int zzu = zzefVar.zzu();
                            String str2 = zzu != 1 ? zzu != 85 ? zzu != 255 ? zzu != 8192 ? zzu != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int zzu2 = zzefVar.zzu();
                                int zzC5 = zzefVar.zzC();
                                zzefVar.zzk(6);
                                int zzz = zzeo.zzz(zzefVar.zzu(), ByteOrder.LITTLE_ENDIAN);
                                int zzu3 = zzefVar.zzd() > 0 ? zzefVar.zzu() : 0;
                                zzs zzsVar2 = new zzs();
                                zzsVar2.zzm(str2);
                                zzsVar2.zzE(zzu2);
                                zzsVar2.zzF(zzC5);
                                if (str2.equals("audio/raw") && zzz != 0) {
                                    zzsVar2.zzG(zzz);
                                }
                                if (str2.equals("audio/mp4a-latm") && zzu3 > 0) {
                                    byte[] bArr = new byte[zzu3];
                                    zzefVar.zzm(bArr, 0, zzu3);
                                    zzsVar2.zzp(zzgjz.zzj(bArr));
                                }
                                zzaesVar = new zzaes(zzsVar2.zzM());
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(zzu).length() + 43);
                                sb2.append("Ignoring track with unsupported format tag ");
                                sb2.append(zzu);
                                zzds.zzc("StreamFormatChunk", sb2.toString());
                            }
                        } else {
                            zzds.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzeo.zzQ(i2)));
                        }
                        zzaesVar = zzaesVar2;
                        break;
                    case 1751742049:
                        zzaesVar = zzaeo.zzb(zzefVar);
                        break;
                    case 1752331379:
                        zzaesVar = zzaep.zzb(zzefVar);
                        break;
                    case 1852994675:
                        zzaesVar = zzaet.zzb(zzefVar);
                        break;
                    default:
                        zzaesVar = zzaesVar2;
                        break;
                }
            } else {
                zzaesVar = zzb(zzefVar.zzC(), zzefVar);
            }
            if (zzaesVar != null) {
                if (zzaesVar.zza() == 1752331379) {
                    i2 = ((zzaep) zzaesVar).zzc();
                }
                zzgjwVar.zzf(zzaesVar);
            }
            zzefVar.zzh(zzg);
            zzefVar.zzf(zze);
        }
        return new zzaer(i, zzgjwVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaek
    public final int zza() {
        return this.zzb;
    }

    public final zzaek zzc(Class cls) {
        zzgjz zzgjzVar = this.zza;
        int size = zzgjzVar.size();
        int i = 0;
        while (i < size) {
            zzaek zzaekVar = (zzaek) zzgjzVar.get(i);
            i++;
            if (zzaekVar.getClass() == cls) {
                return zzaekVar;
            }
        }
        return null;
    }
}
