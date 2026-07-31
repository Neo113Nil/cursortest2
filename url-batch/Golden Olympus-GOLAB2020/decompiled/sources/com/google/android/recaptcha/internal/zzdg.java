package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import o2.U0;
import o2.W0;

/* loaded from: classes.dex */
final class zzdg extends l implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdg(zzdt zzdtVar, String str, long j4, zzsp zzspVar, d dVar) {
        super(2, dVar);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j4;
        this.zzf = zzspVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zzek zzu;
        zzen zzenVar;
        Exception e4;
        U0 e5;
        zzbd e6;
        zzbd zzs;
        zzbd zzs2;
        zzbd zzs3;
        Object f4 = AbstractC1241b.f();
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                ResultKt.a(obj);
            } catch (zzbd e7) {
                e6 = e7;
                zzs3 = this.zzc.zzs(e6, e6);
                zzenVar.zzb(zzs3);
                throw zzs3;
            } catch (U0 e8) {
                e5 = e8;
                zzs2 = this.zzc.zzs(e5, new zzbd(zzbb.zzc, zzba.zzb, e5.getMessage()));
                zzenVar.zzb(zzs2);
                throw zzs2;
            } catch (Exception e9) {
                e4 = e9;
                zzs = this.zzc.zzs(e4, new zzbd(zzbb.zzc, zzba.zzZ, e4.getMessage()));
                zzenVar.zzb(zzs);
                throw zzs;
            }
        } else {
            ResultKt.a(obj);
            zzu = this.zzc.zzu(this.zzd);
            zzen zzf = zzu.zzf(28);
            try {
                long j4 = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzf, null);
                this.zza = zzf;
                this.zzb = 1;
                Object c4 = W0.c(j4, zzdfVar, this);
                if (c4 == f4) {
                    return f4;
                }
                zzenVar = zzf;
                obj = c4;
            } catch (zzbd e10) {
                zzenVar = zzf;
                e6 = e10;
                zzs3 = this.zzc.zzs(e6, e6);
                zzenVar.zzb(zzs3);
                throw zzs3;
            } catch (U0 e11) {
                zzenVar = zzf;
                e5 = e11;
                zzs2 = this.zzc.zzs(e5, new zzbd(zzbb.zzc, zzba.zzb, e5.getMessage()));
                zzenVar.zzb(zzs2);
                throw zzs2;
            } catch (Exception e12) {
                zzenVar = zzf;
                e4 = e12;
                zzs = this.zzc.zzs(e4, new zzbd(zzbb.zzc, zzba.zzZ, e4.getMessage()));
                zzenVar.zzb(zzs);
                throw zzs;
            }
        }
        return (zzsr) obj;
    }
}
