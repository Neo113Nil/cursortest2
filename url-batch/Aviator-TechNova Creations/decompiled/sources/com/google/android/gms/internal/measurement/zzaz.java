package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes3.dex */
public final class zzaz extends zzaw {
    protected zzaz() {
        this.zza.add(zzbl.APPLY);
        this.zza.add(zzbl.BLOCK);
        this.zza.add(zzbl.BREAK);
        this.zza.add(zzbl.CASE);
        this.zza.add(zzbl.DEFAULT);
        this.zza.add(zzbl.CONTINUE);
        this.zza.add(zzbl.DEFINE_FUNCTION);
        this.zza.add(zzbl.FN);
        this.zza.add(zzbl.IF);
        this.zza.add(zzbl.QUOTE);
        this.zza.add(zzbl.RETURN);
        this.zza.add(zzbl.SWITCH);
        this.zza.add(zzbl.TERNARY);
    }

    private static zzap zzc(zzg zzgVar, List list) {
        zzh.zzi(zzbl.FN.name(), 2, list);
        zzap zzb = zzgVar.zzb((zzap) list.get(0));
        zzap zzb2 = zzgVar.zzb((zzap) list.get(1));
        if (!(zzb2 instanceof zzae)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", zzb2.getClass().getCanonicalName()));
        }
        List zzm = ((zzae) zzb2).zzm();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new zzao(zzb.zzi(), zzm, arrayList, zzgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 2) {
            zzh.zzh(zzbl.APPLY.name(), 3, list);
            zzap zzb = zzgVar.zzb((zzap) list.get(0));
            String zzi = zzgVar.zzb((zzap) list.get(1)).zzi();
            zzap zzb2 = zzgVar.zzb((zzap) list.get(2));
            if (!(zzb2 instanceof zzae)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", zzb2.getClass().getCanonicalName()));
            }
            if (zzi.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return zzb.zzbU(zzi, zzgVar, ((zzae) zzb2).zzm());
        }
        if (ordinal == 15) {
            zzh.zzh(zzbl.BREAK.name(), 0, list);
            return zzap.zzh;
        }
        if (ordinal == 25) {
            return zzc(zzgVar, list);
        }
        if (ordinal == 41) {
            zzh.zzi(zzbl.IF.name(), 2, list);
            zzap zzb3 = zzgVar.zzb((zzap) list.get(0));
            zzap zzb4 = zzgVar.zzb((zzap) list.get(1));
            zzap zzb5 = list.size() > 2 ? zzgVar.zzb((zzap) list.get(2)) : null;
            zzap zzapVar = zzap.zzf;
            if (zzb3.zzg().booleanValue()) {
                zzapVar = zzgVar.zzc((zzae) zzb4);
            } else if (zzb5 != null) {
                zzapVar = zzgVar.zzc((zzae) zzb5);
            }
            return zzapVar instanceof zzag ? zzapVar : zzap.zzf;
        }
        if (ordinal == 54) {
            return new zzae(list);
        }
        if (ordinal == 57) {
            if (list.isEmpty()) {
                return zzap.zzj;
            }
            zzh.zzh(zzbl.RETURN.name(), 1, list);
            return new zzag("return", zzgVar.zzb((zzap) list.get(0)));
        }
        if (ordinal != 19) {
            if (ordinal == 20) {
                zzh.zzi(zzbl.DEFINE_FUNCTION.name(), 2, list);
                zzap zzc = zzc(zzgVar, list);
                zzai zzaiVar = (zzai) zzc;
                if (zzaiVar.zzc() == null) {
                    zzgVar.zzg("", zzc);
                    return zzc;
                }
                zzgVar.zzg(zzaiVar.zzc(), zzc);
                return zzc;
            }
            if (ordinal == 60) {
                zzh.zzh(zzbl.SWITCH.name(), 3, list);
                zzap zzb6 = zzgVar.zzb((zzap) list.get(0));
                zzap zzb7 = zzgVar.zzb((zzap) list.get(1));
                zzap zzb8 = zzgVar.zzb((zzap) list.get(2));
                if (!(zzb7 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(zzb8 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                zzae zzaeVar = (zzae) zzb7;
                zzae zzaeVar2 = (zzae) zzb8;
                boolean z = false;
                for (int i = 0; i < zzaeVar.zzc(); i++) {
                    if (z || zzb6.equals(zzgVar.zzb(zzaeVar.zze(i)))) {
                        zzap zzb9 = zzgVar.zzb(zzaeVar2.zze(i));
                        if (zzb9 instanceof zzag) {
                            return ((zzag) zzb9).zzc().equals("break") ? zzap.zzf : zzb9;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (zzaeVar.zzc() + 1 == zzaeVar2.zzc()) {
                    zzap zzb10 = zzgVar.zzb(zzaeVar2.zze(zzaeVar.zzc()));
                    if (zzb10 instanceof zzag) {
                        String zzc2 = ((zzag) zzb10).zzc();
                        if (zzc2.equals("return") || zzc2.equals("continue")) {
                            return zzb10;
                        }
                    }
                }
                return zzap.zzf;
            }
            if (ordinal == 61) {
                zzh.zzh(zzbl.TERNARY.name(), 3, list);
                return zzgVar.zzb((zzap) list.get(0)).zzg().booleanValue() ? zzgVar.zzb((zzap) list.get(1)) : zzgVar.zzb((zzap) list.get(2));
            }
            switch (ordinal) {
                case 11:
                    return zzgVar.zza().zzc(new zzae(list));
                case 12:
                    zzh.zzh(zzbl.BREAK.name(), 0, list);
                    return zzap.zzi;
                case 13:
                    break;
                default:
                    return super.zzb(str);
            }
        }
        if (list.isEmpty()) {
            return zzap.zzf;
        }
        zzap zzb11 = zzgVar.zzb((zzap) list.get(0));
        return zzb11 instanceof zzae ? zzgVar.zzc((zzae) zzb11) : zzap.zzf;
    }
}
