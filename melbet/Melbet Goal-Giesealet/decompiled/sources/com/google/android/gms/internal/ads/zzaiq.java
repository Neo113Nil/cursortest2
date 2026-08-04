package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzaiq {
    private static final zzghq zza = zzghq.zza(zzggo.zzc(':'));
    private static final zzghq zzb = zzghq.zza(zzggo.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacv zzacvVar, zzads zzadsVar, List list) throws IOException {
        int i;
        char c;
        int i2 = this.zzd;
        if (i2 == 0) {
            long zzo = zzacvVar.zzo();
            zzadsVar.zza = (zzo == -1 || zzo < 8) ? 0L : zzo - 8;
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
                long zzn = zzacvVar.zzn();
                int zzo2 = (int) ((zzacvVar.zzo() - zzacvVar.zzn()) - this.zze);
                zzef zzefVar = new zzef(zzo2);
                zzacvVar.zzc(zzefVar.zzi(), 0, zzo2);
                int i4 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i4 >= list2.size()) {
                        zzadsVar.zza = 0L;
                        return 1;
                    }
                    zzaip zzaipVar = (zzaip) list2.get(i4);
                    zzefVar.zzh((int) (zzaipVar.zza - zzn));
                    zzefVar.zzk(4);
                    int zzC = zzefVar.zzC();
                    String zzK = zzefVar.zzK(zzC, StandardCharsets.UTF_8);
                    switch (zzK.hashCode()) {
                        case -1711564334:
                            if (!zzK.equals("SlowMotion_Data")) {
                                break;
                            } else {
                                c = 2192;
                                int i5 = zzaipVar.zzb - (zzC + 8);
                                if (c == 2192) {
                                    ArrayList arrayList = new ArrayList();
                                    List zze = zzb.zze(zzefVar.zzK(i5, StandardCharsets.UTF_8));
                                    for (int i6 = 0; i6 < zze.size(); i6++) {
                                        List zze2 = zza.zze((CharSequence) zze.get(i6));
                                        if (zze2.size() != 3) {
                                            throw zzas.zzb(null, null);
                                        }
                                        try {
                                            arrayList.add(new zzagp(Long.parseLong((String) zze2.get(0)), Long.parseLong((String) zze2.get(1)), 1 << (Integer.parseInt((String) zze2.get(2)) - 1)));
                                        } catch (NumberFormatException e) {
                                            throw zzas.zzb(null, e);
                                        }
                                    }
                                    list.add(new zzagq(arrayList));
                                } else if (c != 2816 && c != 2817 && c != 2819 && c != c2) {
                                    throw new IllegalStateException();
                                }
                                i4++;
                                c2 = 2820;
                            }
                        case -1332107749:
                            if (!zzK.equals("Super_SlowMotion_Edit_Data")) {
                                break;
                            } else {
                                c = 2819;
                                int i52 = zzaipVar.zzb - (zzC + 8);
                                if (c == 2192) {
                                }
                                i4++;
                                c2 = 2820;
                            }
                            break;
                        case -1251387154:
                            if (!zzK.equals("Super_SlowMotion_Data")) {
                                break;
                            } else {
                                c = 2816;
                                int i522 = zzaipVar.zzb - (zzC + 8);
                                if (c == 2192) {
                                }
                                i4++;
                                c2 = 2820;
                            }
                            break;
                        case -830665521:
                            if (!zzK.equals("Super_SlowMotion_Deflickering_On")) {
                                break;
                            } else {
                                c = c2;
                                int i5222 = zzaipVar.zzb - (zzC + 8);
                                if (c == 2192) {
                                }
                                i4++;
                                c2 = 2820;
                            }
                            break;
                        case 1760745220:
                            if (!zzK.equals("Super_SlowMotion_BGM")) {
                                break;
                            } else {
                                c = 2817;
                                int i52222 = zzaipVar.zzb - (zzC + 8);
                                if (c == 2192) {
                                }
                                i4++;
                                c2 = 2820;
                            }
                            break;
                    }
                }
                throw zzas.zzb("Invalid SEF name", null);
            }
            long zzo3 = zzacvVar.zzo();
            int i7 = this.zze - 20;
            zzef zzefVar2 = new zzef(i7);
            zzacvVar.zzc(zzefVar2.zzi(), 0, i7);
            int i8 = 0;
            while (i8 < i7 / 12) {
                zzefVar2.zzk(2);
                zzef zzefVar3 = zzefVar2;
                short zzw = zzefVar3.zzw();
                if (zzw == s4 || zzw == s3 || zzw == s2 || zzw == s || zzw == 2820) {
                    i = i7;
                    this.zzc.add(new zzaip(zzw, (zzo3 - this.zze) - zzefVar3.zzC(), zzefVar3.zzC()));
                } else {
                    zzefVar3.zzk(i3);
                    i = i7;
                }
                i8++;
                i7 = i;
                zzefVar2 = zzefVar3;
                i3 = 8;
                s = 2819;
                s2 = 2817;
                s3 = 2816;
                s4 = 2192;
            }
            List list3 = this.zzc;
            if (list3.isEmpty()) {
                zzadsVar.zza = 0L;
            } else {
                this.zzd = 3;
                zzadsVar.zza = ((zzaip) list3.get(0)).zza;
            }
        } else {
            zzef zzefVar4 = new zzef(8);
            zzacvVar.zzc(zzefVar4.zzi(), 0, 8);
            this.zze = zzefVar4.zzC() + 8;
            if (zzefVar4.zzB() != 1397048916) {
                zzadsVar.zza = 0L;
            } else {
                zzadsVar.zza = zzacvVar.zzn() - (this.zze - 12);
                this.zzd = 2;
            }
        }
        return 1;
    }
}
