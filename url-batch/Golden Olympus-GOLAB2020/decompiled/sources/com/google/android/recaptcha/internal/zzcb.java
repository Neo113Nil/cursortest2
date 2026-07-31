package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.AbstractC3219i;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import x2.AbstractC3517c;
import x2.InterfaceC3515a;

/* loaded from: classes.dex */
public final class zzcb {
    private Object zza;
    private final InterfaceC3515a zzb = AbstractC3517c.b(false, 1, null);

    public zzcb(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj, d dVar) {
        zzby zzbyVar;
        int i4;
        InterfaceC3515a interfaceC3515a;
        zzcb zzcbVar;
        try {
            if (dVar instanceof zzby) {
                zzbyVar = (zzby) dVar;
                int i5 = zzbyVar.zzd;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    zzbyVar.zzd = i5 - Integer.MIN_VALUE;
                    Object obj2 = zzbyVar.zzb;
                    Object f4 = AbstractC1241b.f();
                    i4 = zzbyVar.zzd;
                    if (i4 != 0) {
                        ResultKt.a(obj2);
                        interfaceC3515a = this.zzb;
                        zzbyVar.zze = this;
                        zzbyVar.zzf = (zzje) obj;
                        zzbyVar.zza = interfaceC3515a;
                        zzbyVar.zzd = 1;
                        if (interfaceC3515a.b(null, zzbyVar) == f4) {
                            return f4;
                        }
                        zzcbVar = this;
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC3515a interfaceC3515a2 = (InterfaceC3515a) zzbyVar.zza;
                        zzje zzjeVar = zzbyVar.zzf;
                        zzcbVar = zzbyVar.zze;
                        ResultKt.a(obj2);
                        interfaceC3515a = interfaceC3515a2;
                        obj = zzjeVar;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(Intrinsics.areEqual(zzcbVar.zza, obj));
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(Intrinsics.areEqual(zzcbVar.zza, obj));
        } finally {
            interfaceC3515a.c(null);
        }
        zzbyVar = new zzby(this, dVar);
        Object obj22 = zzbyVar.zzb;
        Object f42 = AbstractC1241b.f();
        i4 = zzbyVar.zzd;
        if (i4 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(Object[] objArr, d dVar) {
        zzbz zzbzVar;
        int i4;
        InterfaceC3515a interfaceC3515a;
        zzcb zzcbVar;
        try {
            if (dVar instanceof zzbz) {
                zzbzVar = (zzbz) dVar;
                int i5 = zzbzVar.zzd;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    zzbzVar.zzd = i5 - Integer.MIN_VALUE;
                    Object obj = zzbzVar.zzb;
                    Object f4 = AbstractC1241b.f();
                    i4 = zzbzVar.zzd;
                    if (i4 != 0) {
                        ResultKt.a(obj);
                        interfaceC3515a = this.zzb;
                        zzbzVar.zze = this;
                        zzbzVar.zzf = (zzje[]) objArr;
                        zzbzVar.zza = interfaceC3515a;
                        zzbzVar.zzd = 1;
                        if (interfaceC3515a.b(null, zzbzVar) == f4) {
                            return f4;
                        }
                        zzcbVar = this;
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC3515a interfaceC3515a2 = (InterfaceC3515a) zzbzVar.zza;
                        zzje[] zzjeVarArr = zzbzVar.zzf;
                        zzcbVar = zzbzVar.zze;
                        ResultKt.a(obj);
                        interfaceC3515a = interfaceC3515a2;
                        objArr = zzjeVarArr;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(AbstractC3219i.A(objArr, zzcbVar.zza));
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(AbstractC3219i.A(objArr, zzcbVar.zza));
        } finally {
            interfaceC3515a.c(null);
        }
        zzbzVar = new zzbz(this, dVar);
        Object obj2 = zzbzVar.zzb;
        Object f42 = AbstractC1241b.f();
        i4 = zzbzVar.zzd;
        if (i4 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(Object obj, d dVar) {
        zzca zzcaVar;
        int i4;
        InterfaceC3515a interfaceC3515a;
        zzcb zzcbVar;
        try {
            if (dVar instanceof zzca) {
                zzcaVar = (zzca) dVar;
                int i5 = zzcaVar.zzd;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    zzcaVar.zzd = i5 - Integer.MIN_VALUE;
                    Object obj2 = zzcaVar.zzb;
                    Object f4 = AbstractC1241b.f();
                    i4 = zzcaVar.zzd;
                    if (i4 != 0) {
                        ResultKt.a(obj2);
                        interfaceC3515a = this.zzb;
                        zzcaVar.zze = this;
                        zzcaVar.zzf = (zzje) obj;
                        zzcaVar.zza = interfaceC3515a;
                        zzcaVar.zzd = 1;
                        if (interfaceC3515a.b(null, zzcaVar) == f4) {
                            return f4;
                        }
                        zzcbVar = this;
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC3515a interfaceC3515a2 = (InterfaceC3515a) zzcaVar.zza;
                        zzje zzjeVar = zzcaVar.zzf;
                        zzcbVar = zzcaVar.zze;
                        ResultKt.a(obj2);
                        interfaceC3515a = interfaceC3515a2;
                        obj = zzjeVar;
                    }
                    zzcbVar.zza = obj;
                    Unit unit = Unit.f41027a;
                    interfaceC3515a.c(null);
                    return Unit.f41027a;
                }
            }
            zzcbVar.zza = obj;
            Unit unit2 = Unit.f41027a;
            interfaceC3515a.c(null);
            return Unit.f41027a;
        } catch (Throwable th) {
            interfaceC3515a.c(null);
            throw th;
        }
        zzcaVar = new zzca(this, dVar);
        Object obj22 = zzcaVar.zzb;
        Object f42 = AbstractC1241b.f();
        i4 = zzcaVar.zzd;
        if (i4 != 0) {
        }
    }
}
