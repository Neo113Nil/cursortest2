package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzajm implements zzamd {
    private final zzaji zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzajm(zzaji zzajiVar) {
        zzaji zzajiVar2 = (zzaji) zzaki.zza(zzajiVar, "input");
        this.zza = zzajiVar2;
        zzajiVar2.zzc = this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final double zza() {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final float zzb() {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zzc() {
        int i4 = this.zzd;
        if (i4 != 0) {
            this.zzb = i4;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i5 = this.zzb;
        if (i5 == 0 || i5 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i5 >>> 3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zze() {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zzf() {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zzg() {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zzh() {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zzi() {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final int zzj() {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final long zzk() {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final long zzl() {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final long zzm() {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final long zzn() {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final long zzo() {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final zzaiw zzp() {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final String zzq() {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final String zzr() {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final boolean zzs() {
        zzb(0);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final boolean zzt() {
        int i4;
        if (this.zza.zzw() || (i4 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zze(i4);
    }

    private final <T> void zzd(T t4, zzamc<T> zzamcVar, zzajv zzajvVar) {
        int zzj = this.zza.zzj();
        this.zza.zzt();
        int zzb = this.zza.zzb(zzj);
        this.zza.zza++;
        zzamcVar.zza(t4, this, zzajvVar);
        this.zza.zzc(0);
        r4.zza--;
        this.zza.zzd(zzb);
    }

    public static zzajm zza(zzaji zzajiVar) {
        zzajm zzajmVar = zzajiVar.zzc;
        return zzajmVar != null ? zzajmVar : new zzajm(zzajiVar);
    }

    private final <T> T zzb(zzamc<T> zzamcVar, zzajv zzajvVar) {
        T zza = zzamcVar.zza();
        zzd(zza, zzamcVar, zzajvVar);
        zzamcVar.zzd(zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zze(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            int i4 = this.zzb & 7;
            if (i4 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzakjVar.zzc(this.zza.zze());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i4 == 5) {
                do {
                    zzakjVar.zzc(this.zza.zze());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            throw zzakm.zza();
        }
        int i5 = this.zzb & 7;
        if (i5 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Integer.valueOf(this.zza.zze()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i5 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzakm.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzf(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            int i4 = this.zzb & 7;
            if (i4 == 1) {
                do {
                    zzakyVar.zza(this.zza.zzk());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i4 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzakyVar.zza(this.zza.zzk());
                } while (this.zza.zzc() < zzc);
                return;
            }
            throw zzakm.zza();
        }
        int i5 = this.zzb & 7;
        if (i5 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzk()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i5 == 2) {
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Long.valueOf(this.zza.zzk()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        throw zzakm.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzg(List<Float> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzake) {
            zzake zzakeVar = (zzake) list;
            int i4 = this.zzb & 7;
            if (i4 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzakeVar.zza(this.zza.zzb());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i4 == 5) {
                do {
                    zzakeVar.zza(this.zza.zzb());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            throw zzakm.zza();
        }
        int i5 = this.zzb & 7;
        if (i5 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Float.valueOf(this.zza.zzb()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i5 == 5) {
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzakm.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzh(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            int i4 = this.zzb & 7;
            if (i4 == 0) {
                do {
                    zzakjVar.zzc(this.zza.zzf());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i4 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakjVar.zzc(this.zza.zzf());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakm.zza();
        }
        int i5 = this.zzb & 7;
        if (i5 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i5 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakm.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzi(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            int i4 = this.zzb & 7;
            if (i4 == 0) {
                do {
                    zzakyVar.zza(this.zza.zzl());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i4 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakyVar.zza(this.zza.zzl());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakm.zza();
        }
        int i5 = this.zzb & 7;
        if (i5 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzl()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i5 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzl()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakm.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzj(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            int i4 = this.zzb & 7;
            if (i4 == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzakjVar.zzc(this.zza.zzg());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i4 == 5) {
                do {
                    zzakjVar.zzc(this.zza.zzg());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            throw zzakm.zza();
        }
        int i5 = this.zzb & 7;
        if (i5 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i5 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzakm.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzk(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            int i4 = this.zzb & 7;
            if (i4 == 1) {
                do {
                    zzakyVar.zza(this.zza.zzn());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i4 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzakyVar.zza(this.zza.zzn());
                } while (this.zza.zzc() < zzc);
                return;
            }
            throw zzakm.zza();
        }
        int i5 = this.zzb & 7;
        if (i5 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i5 == 2) {
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Long.valueOf(this.zza.zzn()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        throw zzakm.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzl(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            int i4 = this.zzb & 7;
            if (i4 == 0) {
                do {
                    zzakjVar.zzc(this.zza.zzh());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i4 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakjVar.zzc(this.zza.zzh());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakm.zza();
        }
        int i5 = this.zzb & 7;
        if (i5 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i5 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakm.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzm(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            int i4 = this.zzb & 7;
            if (i4 == 0) {
                do {
                    zzakyVar.zza(this.zza.zzo());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i4 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakyVar.zza(this.zza.zzo());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakm.zza();
        }
        int i5 = this.zzb & 7;
        if (i5 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i5 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakm.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzn(List<String> list) {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzo(List<String> list) {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzp(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            int i4 = this.zzb & 7;
            if (i4 == 0) {
                do {
                    zzakjVar.zzc(this.zza.zzj());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i4 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakjVar.zzc(this.zza.zzj());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakm.zza();
        }
        int i5 = this.zzb & 7;
        if (i5 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i5 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakm.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzq(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaky) {
            zzaky zzakyVar = (zzaky) list;
            int i4 = this.zzb & 7;
            if (i4 == 0) {
                do {
                    zzakyVar.zza(this.zza.zzp());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i4 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakyVar.zza(this.zza.zzp());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakm.zza();
        }
        int i5 = this.zzb & 7;
        if (i5 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i5 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakm.zza();
    }

    private final Object zza(zzanh zzanhVar, Class<?> cls, zzajv zzajvVar) {
        switch (zzajp.zza[zzanhVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzaly.zza().zza((Class) cls), zzajvVar);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final <T> void zzc(T t4, zzamc<T> zzamcVar, zzajv zzajvVar) {
        int i4 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzamcVar.zza(t4, this, zzajvVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzakm.zzg();
            }
        } finally {
            this.zzc = i4;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final <T> void zzb(T t4, zzamc<T> zzamcVar, zzajv zzajvVar) {
        zzb(2);
        zzd(t4, zzamcVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzb(List<zzaiw> list) {
        int zzi;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzakm.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzd(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzakj) {
            zzakj zzakjVar = (zzakj) list;
            int i4 = this.zzb & 7;
            if (i4 == 0) {
                do {
                    zzakjVar.zzc(this.zza.zzd());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i4 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzakjVar.zzc(this.zza.zzd());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakm.zza();
        }
        int i5 = this.zzb & 7;
        if (i5 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i5 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakm.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final <T> void zzb(List<T> list, zzamc<T> zzamcVar, zzajv zzajvVar) {
        int zzi;
        int i4 = this.zzb;
        if ((i4 & 7) == 2) {
            do {
                list.add(zzb(zzamcVar, zzajvVar));
                if (this.zza.zzw() || this.zzd != 0) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == i4);
            this.zzd = zzi;
            return;
        }
        throw zzakm.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zzc(List<Double> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajt) {
            zzajt zzajtVar = (zzajt) list;
            int i4 = this.zzb & 7;
            if (i4 == 1) {
                do {
                    zzajtVar.zza(this.zza.zza());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i4 == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzajtVar.zza(this.zza.zza());
                } while (this.zza.zzc() < zzc);
                return;
            }
            throw zzakm.zza();
        }
        int i5 = this.zzb & 7;
        if (i5 == 1) {
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i5 == 2) {
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Double.valueOf(this.zza.zza()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        throw zzakm.zza();
    }

    private final void zzb(int i4) {
        if ((this.zzb & 7) != i4) {
            throw zzakm.zza();
        }
    }

    private final <T> T zza(zzamc<T> zzamcVar, zzajv zzajvVar) {
        T zza = zzamcVar.zza();
        zzc(zza, zzamcVar, zzajvVar);
        zzamcVar.zzd(zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final <T> void zza(T t4, zzamc<T> zzamcVar, zzajv zzajvVar) {
        zzb(3);
        zzc(t4, zzamcVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    public final void zza(List<Boolean> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaiu) {
            zzaiu zzaiuVar = (zzaiu) list;
            int i4 = this.zzb & 7;
            if (i4 == 0) {
                do {
                    zzaiuVar.zza(this.zza.zzx());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i4 == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaiuVar.zza(this.zza.zzx());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzakm.zza();
        }
        int i5 = this.zzb & 7;
        if (i5 == 0) {
            do {
                list.add(Boolean.valueOf(this.zza.zzx()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i5 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Boolean.valueOf(this.zza.zzx()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzakm.zza();
    }

    private static void zzd(int i4) {
        if ((i4 & 7) != 0) {
            throw zzakm.zzg();
        }
    }

    private static void zzc(int i4) {
        if ((i4 & 3) != 0) {
            throw zzakm.zzg();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    @Deprecated
    public final <T> void zza(List<T> list, zzamc<T> zzamcVar, zzajv zzajvVar) {
        int zzi;
        int i4 = this.zzb;
        if ((i4 & 7) == 3) {
            do {
                list.add(zza(zzamcVar, zzajvVar));
                if (this.zza.zzw() || this.zzd != 0) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == i4);
            this.zzd = zzi;
            return;
        }
        throw zzakm.zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0060, code lost:
    
        r7.zza.zzd(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void zza(Map<K, V> map, zzale<K, V> zzaleVar, zzajv zzajvVar) {
        zzb(2);
        int zzb = this.zza.zzb(this.zza.zzj());
        Object obj = zzaleVar.zzb;
        Object obj2 = zzaleVar.zzd;
        while (true) {
            try {
                int zzc = zzc();
                if (zzc == Integer.MAX_VALUE || this.zza.zzw()) {
                    break;
                }
                if (zzc == 1) {
                    obj = zza(zzaleVar.zza, (Class<?>) null, (zzajv) null);
                } else if (zzc != 2) {
                    try {
                        if (!zzt()) {
                            throw new zzakm("Unable to parse map entry.");
                        }
                    } catch (zzakp unused) {
                        if (!zzt()) {
                            throw new zzakm("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj2 = zza(zzaleVar.zzc, zzaleVar.zzd.getClass(), zzajvVar);
                }
            } catch (Throwable th) {
                this.zza.zzd(zzb);
                throw th;
            }
        }
    }

    private final void zza(List<String> list, boolean z4) {
        int zzi;
        int zzi2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzaku) && !z4) {
                zzaku zzakuVar = (zzaku) list;
                do {
                    zzakuVar.zza(zzp());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            do {
                list.add(z4 ? zzr() : zzq());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzakm.zza();
    }

    private final void zza(int i4) {
        if (this.zza.zzc() != i4) {
            throw zzakm.zzj();
        }
    }
}
