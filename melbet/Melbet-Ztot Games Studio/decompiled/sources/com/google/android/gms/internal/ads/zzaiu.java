package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzaiu {
    private static final zzfvh zza = zzfvh.zzb(zzfui.zzc(':'));
    private static final zzfvh zzb = zzfvh.zzb(zzfui.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int zza(zzacl zzaclVar, zzadf zzadfVar, List list) throws IOException {
        int i;
        char c;
        char c2;
        int i2 = this.zzd;
        if (i2 == 0) {
            long zzd = zzaclVar.zzd();
            zzadfVar.zza = (zzd == -1 || zzd < 8) ? 0L : zzd - 8;
            this.zzd = 1;
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            char c3 = 2819;
            short s = 2817;
            short s2 = 2816;
            short s3 = 2192;
            if (i2 != 2) {
                long zzf = zzaclVar.zzf();
                int zzd2 = (int) ((zzaclVar.zzd() - zzaclVar.zzf()) - this.zze);
                zzek zzekVar = new zzek(zzd2);
                zzaclVar.zzi(zzekVar.zzM(), 0, zzd2);
                int i4 = 0;
                while (i4 < this.zzc.size()) {
                    zzait zzaitVar = (zzait) this.zzc.get(i4);
                    zzekVar.zzK((int) (zzaitVar.zza - zzf));
                    zzekVar.zzL(4);
                    int zzi = zzekVar.zzi();
                    String zzA = zzekVar.zzA(zzi, zzfuj.zzc);
                    switch (zzA.hashCode()) {
                        case -1711564334:
                            if (zzA.equals("SlowMotion_Data")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1332107749:
                            if (zzA.equals("Super_SlowMotion_Edit_Data")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1251387154:
                            if (zzA.equals("Super_SlowMotion_Data")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -830665521:
                            if (zzA.equals("Super_SlowMotion_Deflickering_On")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1760745220:
                            if (zzA.equals("Super_SlowMotion_BGM")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        c2 = 2192;
                    } else if (c == 1) {
                        c2 = 2816;
                    } else if (c == 2) {
                        c2 = 2817;
                    } else if (c == 3) {
                        c2 = 2819;
                    } else {
                        if (c != 4) {
                            throw zzbo.zza("Invalid SEF name", null);
                        }
                        c2 = 2820;
                    }
                    int i5 = zzaitVar.zzb - (zzi + 8);
                    if (c2 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List zze = zzb.zze(zzekVar.zzA(i5, zzfuj.zzc));
                        for (int i6 = 0; i6 < zze.size(); i6++) {
                            List zze2 = zza.zze((CharSequence) zze.get(i6));
                            if (zze2.size() != 3) {
                                throw zzbo.zza(null, null);
                            }
                            try {
                                arrayList.add(new zzagu(Long.parseLong((String) zze2.get(0)), Long.parseLong((String) zze2.get(1)), 1 << (Integer.parseInt((String) zze2.get(2)) - 1)));
                            } catch (NumberFormatException e) {
                                throw zzbo.zza(null, e);
                            }
                        }
                        list.add(new zzagv(arrayList));
                    } else if (c2 != 2816 && c2 != 2817 && c2 != c3 && c2 != 2820) {
                        throw new IllegalStateException();
                    }
                    i4++;
                    c3 = 2819;
                }
                zzadfVar.zza = 0L;
            } else {
                long zzd3 = zzaclVar.zzd();
                int i7 = this.zze - 20;
                zzek zzekVar2 = new zzek(i7);
                zzaclVar.zzi(zzekVar2.zzM(), 0, i7);
                int i8 = 0;
                while (i8 < i7 / 12) {
                    zzekVar2.zzL(i3);
                    short zzC = zzekVar2.zzC();
                    if (zzC == s3 || zzC == s2 || zzC == s || zzC == 2819 || zzC == 2820) {
                        i = i7;
                        this.zzc.add(new zzait(zzC, (zzd3 - this.zze) - zzekVar2.zzi(), zzekVar2.zzi()));
                    } else {
                        zzekVar2.zzL(8);
                        i = i7;
                    }
                    i8++;
                    i7 = i;
                    i3 = 2;
                    s = 2817;
                    s2 = 2816;
                    s3 = 2192;
                }
                if (this.zzc.isEmpty()) {
                    zzadfVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzadfVar.zza = ((zzait) this.zzc.get(0)).zza;
                }
            }
        } else {
            zzek zzekVar3 = new zzek(8);
            zzaclVar.zzi(zzekVar3.zzM(), 0, 8);
            this.zze = zzekVar3.zzi() + 8;
            if (zzekVar3.zzg() != 1397048916) {
                zzadfVar.zza = 0L;
            } else {
                zzadfVar.zza = zzaclVar.zzf() - (this.zze - 12);
                this.zzd = 2;
            }
        }
        return 1;
    }
}
