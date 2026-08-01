package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzajv implements zzalj {
    private final List zza;

    public zzajv() {
        this(0);
    }

    public zzajv(int i, List list) {
        this.zza = list;
    }

    private final zzakz zzb(zzali zzaliVar) {
        return new zzakz(zzd(zzaliVar));
    }

    private final zzaln zzc(zzali zzaliVar) {
        return new zzaln(zzd(zzaliVar));
    }

    private final List zzd(zzali zzaliVar) {
        String str;
        int i;
        List list;
        zzfj zzfjVar = new zzfj(zzaliVar.zzd);
        List list2 = this.zza;
        while (zzfjVar.zza() > 0) {
            int zzl = zzfjVar.zzl();
            int zzc = zzfjVar.zzc() + zzfjVar.zzl();
            if (zzl == 134) {
                list2 = new ArrayList();
                int zzl2 = zzfjVar.zzl() & 31;
                for (int i2 = 0; i2 < zzl2; i2++) {
                    String zzy = zzfjVar.zzy(3, zzftl.zzc);
                    int zzl3 = zzfjVar.zzl();
                    boolean z = (zzl3 & 128) != 0;
                    if (z) {
                        i = zzl3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzl4 = (byte) zzfjVar.zzl();
                    zzfjVar.zzH(1);
                    if (z) {
                        int i3 = zzl4 & 64;
                        int i4 = zzeh.zza;
                        list = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzak zzakVar = new zzak();
                    zzakVar.zzU(str);
                    zzakVar.zzM(zzy);
                    zzakVar.zzw(i);
                    zzakVar.zzK(list);
                    list2.add(zzakVar.zzac());
                }
            }
            zzfjVar.zzG(zzc);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.zzalj
    public final zzall zza(int i, zzali zzaliVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzakp(new zzakm(zzaliVar.zzb));
            }
            if (i == 21) {
                return new zzakp(new zzakk());
            }
            if (i == 27) {
                return new zzakp(new zzakh(zzb(zzaliVar), false, false));
            }
            if (i == 36) {
                return new zzakp(new zzakj(zzb(zzaliVar)));
            }
            if (i == 89) {
                return new zzakp(new zzajx(zzaliVar.zzc));
            }
            if (i == 138) {
                return new zzakp(new zzajw(zzaliVar.zzb));
            }
            if (i == 172) {
                return new zzakp(new zzajr(zzaliVar.zzb));
            }
            if (i == 257) {
                return new zzaky(new zzako("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new zzaky(new zzako("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new zzakp(new zzaju(false, zzaliVar.zzb));
                            case 16:
                                return new zzakp(new zzakd(zzc(zzaliVar)));
                            case 17:
                                return new zzakp(new zzakl(zzaliVar.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzakp(new zzajo(zzaliVar.zzb));
            }
        }
        return new zzakp(new zzaka(zzc(zzaliVar)));
    }

    public zzajv(int i) {
        this.zza = zzfwu.zzl();
    }
}
