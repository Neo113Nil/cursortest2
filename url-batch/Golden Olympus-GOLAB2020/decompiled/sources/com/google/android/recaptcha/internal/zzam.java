package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.G;
import o2.InterfaceC3316J;
import o2.InterfaceC3360w;
import o2.W0;

/* loaded from: classes.dex */
final class zzam extends l implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzam(zzan zzanVar, zzen zzenVar, d dVar) {
        super(2, dVar);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzam(this.zzc, this.zzd, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        G g4;
        Exception e4;
        Throwable th;
        Object f4 = AbstractC1241b.f();
        if (this.zzb != 0) {
            g4 = (G) this.zza;
            try {
                ResultKt.a(obj);
            } catch (Exception e5) {
                e4 = e5;
                InterfaceC3360w zzf = this.zzc.zzf();
                th = (Throwable) g4.f41132b;
                if (th == null) {
                    th = e4;
                }
                zzf.o(th);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e4.getMessage()));
                return Unit.f41027a;
            }
        } else {
            ResultKt.a(obj);
            G g5 = new G();
            try {
                zzal zzalVar = new zzal(this.zzc, this.zzd, g5, null);
                this.zza = g5;
                this.zzb = 1;
                if (W0.c(60000L, zzalVar, this) == f4) {
                    return f4;
                }
            } catch (Exception e6) {
                g4 = g5;
                e4 = e6;
                InterfaceC3360w zzf2 = this.zzc.zzf();
                th = (Throwable) g4.f41132b;
                if (th == null) {
                }
                zzf2.o(th);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e4.getMessage()));
                return Unit.f41027a;
            }
        }
        return Unit.f41027a;
    }
}
