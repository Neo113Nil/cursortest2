package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import o2.InterfaceC3360w;

/* loaded from: classes.dex */
final class zzea extends l implements Function1 {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ InterfaceC3360w zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzea(zzec zzecVar, long j4, InterfaceC3360w interfaceC3360w, d dVar) {
        super(1, dVar);
        this.zzc = zzecVar;
        this.zzd = j4;
        this.zze = interfaceC3360w;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(d dVar) {
        return new zzea(this.zzc, this.zzd, this.zze, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((d) obj)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzen zzenVar;
        zzbd e4;
        zzdt zzdtVar;
        zzen zzenVar2;
        zzdt zzdtVar2;
        zzcj zzcjVar;
        Object f4 = AbstractC1241b.f();
        int i4 = this.zzb;
        if (i4 == 0) {
            ResultKt.a(obj);
            zzekVar = this.zzc.zzb;
            zzen zzf = zzekVar.zzf(41);
            try {
                zzdtVar = this.zzc.zza;
                long j4 = this.zzd;
                this.zza = zzf;
                this.zzb = 1;
                Object zzo = zzdtVar.zzo(j4, this);
                if (zzo != f4) {
                    zzenVar2 = zzf;
                    obj = zzo;
                }
                return f4;
            } catch (zzbd e5) {
                zzenVar = zzf;
                e4 = e5;
                this.zzc.zzd = e4;
                zzenVar.zzb(e4);
                throw e4;
            }
        }
        if (i4 != 1) {
            zzenVar = (zzen) this.zza;
            try {
                ResultKt.a(obj);
                zzenVar.zza();
                zzec zzecVar = this.zzc;
                zzcjVar = zzcm.zzb;
                zzecVar.zzf = zzcjVar;
                return kotlin.coroutines.jvm.internal.b.a(this.zze.J(Unit.f41027a));
            } catch (zzbd e6) {
                e4 = e6;
                this.zzc.zzd = e4;
                zzenVar.zzb(e4);
                throw e4;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            ResultKt.a(obj);
        } catch (zzbd e7) {
            e4 = e7;
            zzenVar = zzenVar2;
            this.zzc.zzd = e4;
            zzenVar.zzb(e4);
            throw e4;
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdtVar2 = this.zzc.zza;
        long j5 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j5, this) != f4) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            zzec zzecVar2 = this.zzc;
            zzcjVar = zzcm.zzb;
            zzecVar2.zzf = zzcjVar;
            return kotlin.coroutines.jvm.internal.b.a(this.zze.J(Unit.f41027a));
        }
        return f4;
    }
}
