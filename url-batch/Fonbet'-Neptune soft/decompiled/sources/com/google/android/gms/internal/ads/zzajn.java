package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
final class zzajn {
    private static final zzfwe zza = zzfwe.zzb(zzfva.zzc(':'));
    private static final zzfwe zzb = zzfwe.zzb(zzfva.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzadw zzadwVar, zzaer zzaerVar, List list) throws IOException {
        int i;
        char c;
        int i2 = this.zzd;
        if (i2 == 0) {
            long j = 0;
            long zzd = zzadwVar.zzd();
            if (zzd != -1 && zzd >= 8) {
                j = (-8) + zzd;
            }
            zzaerVar.zza = j;
            this.zzd = 1;
            return 1;
        }
        int i3 = 8;
        if (i2 != 1) {
            char c2 = 2820;
            short s = 2819;
            short s2 = 2817;
            short s3 = 2816;
            short s4 = 2192;
            if (i2 != 2) {
                long zzf = zzadwVar.zzf();
                int zzd2 = (int) ((zzadwVar.zzd() - zzadwVar.zzf()) - this.zze);
                zzen zzenVar = new zzen(zzd2);
                zzadwVar.zzi(zzenVar.zzN(), 0, zzd2);
                int i4 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i4 >= list2.size()) {
                        zzaerVar.zza = 0L;
                        return 1;
                    }
                    zzajm zzajmVar = (zzajm) list2.get(i4);
                    zzenVar.zzL((int) (zzajmVar.zza - zzf));
                    zzenVar.zzM(4);
                    int zzi = zzenVar.zzi();
                    String zzB = zzenVar.zzB(zzi, StandardCharsets.UTF_8);
                    switch (zzB.hashCode()) {
                        case -1711564334:
                            if (!zzB.equals("SlowMotion_Data")) {
                                break;
                            } else {
                                c = 2192;
                                int i5 = zzajmVar.zzb - (zzi + 8);
                                if (c == 2192) {
                                    ArrayList arrayList = new ArrayList();
                                    List zzf2 = zzb.zzf(zzenVar.zzB(i5, StandardCharsets.UTF_8));
                                    for (int i6 = 0; i6 < zzf2.size(); i6++) {
                                        List zzf3 = zza.zzf((CharSequence) zzf2.get(i6));
                                        if (zzf3.size() != 3) {
                                            throw zzaz.zza(null, null);
                                        }
                                        try {
                                            arrayList.add(new zzahn(Long.parseLong((String) zzf3.get(0)), Long.parseLong((String) zzf3.get(1)), 1 << (Integer.parseInt((String) zzf3.get(2)) - 1)));
                                        } catch (NumberFormatException e) {
                                            throw zzaz.zza(null, e);
                                        }
                                    }
                                    list.add(new zzaho(arrayList));
                                } else if (c != 2816 && c != 2817 && c != 2819 && c != c2) {
                                    throw new IllegalStateException();
                                }
                                i4++;
                                c2 = 2820;
                            }
                        case -1332107749:
                            if (!zzB.equals("Super_SlowMotion_Edit_Data")) {
                                break;
                            } else {
                                c = 2819;
                                int i52 = zzajmVar.zzb - (zzi + 8);
                                if (c == 2192) {
                                }
                                i4++;
                                c2 = 2820;
                            }
                            break;
                        case -1251387154:
                            if (!zzB.equals("Super_SlowMotion_Data")) {
                                break;
                            } else {
                                c = 2816;
                                int i522 = zzajmVar.zzb - (zzi + 8);
                                if (c == 2192) {
                                }
                                i4++;
                                c2 = 2820;
                            }
                            break;
                        case -830665521:
                            if (!zzB.equals("Super_SlowMotion_Deflickering_On")) {
                                break;
                            } else {
                                c = c2;
                                int i5222 = zzajmVar.zzb - (zzi + 8);
                                if (c == 2192) {
                                }
                                i4++;
                                c2 = 2820;
                            }
                            break;
                        case 1760745220:
                            if (!zzB.equals("Super_SlowMotion_BGM")) {
                                break;
                            } else {
                                c = 2817;
                                int i52222 = zzajmVar.zzb - (zzi + 8);
                                if (c == 2192) {
                                }
                                i4++;
                                c2 = 2820;
                            }
                            break;
                    }
                }
                throw zzaz.zza("Invalid SEF name", null);
            }
            long zzd3 = zzadwVar.zzd();
            int i7 = this.zze - 20;
            zzen zzenVar2 = new zzen(i7);
            zzadwVar.zzi(zzenVar2.zzN(), 0, i7);
            int i8 = 0;
            while (i8 < i7 / 12) {
                zzenVar2.zzM(2);
                zzen zzenVar3 = zzenVar2;
                short zzD = zzenVar3.zzD();
                if (zzD == s4 || zzD == s3 || zzD == s2 || zzD == s || zzD == 2820) {
                    i = i7;
                    this.zzc.add(new zzajm(zzD, (zzd3 - this.zze) - zzenVar3.zzi(), zzenVar3.zzi()));
                } else {
                    zzenVar3.zzM(i3);
                    i = i7;
                }
                i8++;
                i7 = i;
                zzenVar2 = zzenVar3;
                i3 = 8;
                s = 2819;
                s2 = 2817;
                s3 = 2816;
                s4 = 2192;
            }
            List list3 = this.zzc;
            if (list3.isEmpty()) {
                zzaerVar.zza = 0L;
            } else {
                this.zzd = 3;
                zzaerVar.zza = ((zzajm) list3.get(0)).zza;
            }
        } else {
            zzen zzenVar4 = new zzen(8);
            zzadwVar.zzi(zzenVar4.zzN(), 0, 8);
            this.zze = zzenVar4.zzi() + 8;
            if (zzenVar4.zzg() != 1397048916) {
                zzaerVar.zza = 0L;
            } else {
                zzaerVar.zza = zzadwVar.zzf() - (this.zze - 12);
                this.zzd = 2;
            }
        }
        return 1;
    }
}
