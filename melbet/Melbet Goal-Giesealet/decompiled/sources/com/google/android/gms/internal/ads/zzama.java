package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzama implements zzanq {
    private final List zza;

    public zzama() {
        this(0);
    }

    public zzama(int i, List list) {
        this.zza = list;
    }

    private final zzang zzc(zzanp zzanpVar) {
        return new zzang(zze(zzanpVar), "video/mp2t");
    }

    private final zzanv zzd(zzanp zzanpVar) {
        return new zzanv(zze(zzanpVar), "video/mp2t");
    }

    private final List zze(zzanp zzanpVar) {
        String str;
        int i;
        List list;
        zzef zzefVar = new zzef(zzanpVar.zze);
        List list2 = this.zza;
        while (zzefVar.zzd() > 0) {
            int zzs = zzefVar.zzs();
            int zzg = zzefVar.zzg() + zzefVar.zzs();
            if (zzs == 134) {
                list2 = new ArrayList();
                int zzs2 = zzefVar.zzs() & 31;
                for (int i2 = 0; i2 < zzs2; i2++) {
                    String zzK = zzefVar.zzK(3, StandardCharsets.UTF_8);
                    int zzs3 = zzefVar.zzs();
                    boolean z = (zzs3 & 128) != 0;
                    if (z) {
                        i = zzs3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzs4 = (byte) zzefVar.zzs();
                    zzefVar.zzk(1);
                    if (z) {
                        int i3 = zzs4 & SignedBytes.MAX_POWER_OF_TWO;
                        int i4 = zzdc.zza;
                        list = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzs zzsVar = new zzs();
                    zzsVar.zzm(str);
                    zzsVar.zze(zzK);
                    zzsVar.zzJ(i);
                    zzsVar.zzp(list);
                    list2.add(zzsVar.zzM());
                }
            }
            zzefVar.zzh(zzg);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.zzanq
    public final SparseArray zza() {
        return new SparseArray();
    }

    public zzama(int i) {
        this.zza = zzgjz.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzanq
    public final zzans zzb(int i, zzanp zzanpVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzamw(new zzamp(zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
            }
            if (i == 21) {
                return new zzamw(new zzamn("video/mp2t"));
            }
            if (i == 27) {
                return new zzamw(new zzamk(zzc(zzanpVar), false, false, "video/mp2t"));
            }
            if (i == 36) {
                return new zzamw(new zzamm(zzc(zzanpVar), "video/mp2t"));
            }
            if (i == 45) {
                return new zzamw(new zzamq("video/mp2t"));
            }
            if (i == 89) {
                return new zzamw(new zzamc(zzanpVar.zzd, "video/mp2t"));
            }
            if (i == 172) {
                return new zzamw(new zzalw(zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
            }
            if (i == 257) {
                return new zzane(new zzamv("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzamw(new zzamb(zzanpVar.zzb, zzanpVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i) {
                            case 15:
                                return new zzamw(new zzalz(false, zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzamw(new zzami(zzd(zzanpVar), "video/mp2t"));
                            case 17:
                                return new zzamw(new zzamo(zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
                            default:
                                switch (i) {
                                    case 134:
                                        return new zzane(new zzamv("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzamw(new zzamb(zzanpVar.zzb, zzanpVar.zza(), 4096, "video/mp2t"));
                }
                return new zzamw(new zzalt(zzanpVar.zzb, zzanpVar.zza(), "video/mp2t"));
            }
        }
        return new zzamw(new zzamf(zzd(zzanpVar), "video/mp2t"));
    }
}
