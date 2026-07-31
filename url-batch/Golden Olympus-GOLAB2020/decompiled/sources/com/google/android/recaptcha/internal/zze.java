package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import o2.W0;

/* loaded from: classes.dex */
public abstract class zze {
    private boolean zza;

    protected zzen zza(String str) {
        throw null;
    }

    protected zzen zzb() {
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(2:18|19))(4:22|23|24|25))(5:46|47|48|(1:50)|21)|26|27|(1:29)|30|31))|54|6|7|(0)(0)|26|27|(0)|30|31|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dc, code lost:
    
        if (r0 != r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        r16 = r3;
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r4.zzb(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
    
        r3 = r6;
        r2 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[Catch: Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:27:0x0088, B:29:0x0095, B:30:0x009b), top: B:26:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, long j4, d dVar) {
        zza zzaVar;
        int i4;
        zzen zza;
        Exception exc;
        long j5;
        zzen zzenVar;
        zze zzeVar;
        zze zzeVar2;
        String str2;
        String str3 = str;
        long j6 = j4;
        if (dVar instanceof zza) {
            zzaVar = (zza) dVar;
            int i5 = zzaVar.zze;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzaVar.zze = i5 - Integer.MIN_VALUE;
                zza zzaVar2 = zzaVar;
                Object obj = zzaVar2.zzc;
                Object f4 = AbstractC1241b.f();
                i4 = zzaVar2.zze;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    zza = zza(str);
                    try {
                        zzb zzbVar = new zzb(this, str3, null);
                        zzaVar2.zza = this;
                        zzaVar2.zzf = str3;
                        zzaVar2.zzg = zza;
                        zzaVar2.zzb = j6;
                        zzaVar2.zze = 1;
                        obj = W0.c(j6, zzbVar, zzaVar2);
                        if (obj != f4) {
                            zzeVar2 = this;
                        }
                    } catch (Exception e4) {
                        exc = e4;
                        j5 = j6;
                        zzenVar = zza;
                        zzeVar = this;
                        zzbd zza2 = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
                        if (zzenVar != null) {
                        }
                        zzaVar2.zza = zzeVar;
                        zzaVar2.zzf = str3;
                        zzaVar2.zzg = null;
                        zzaVar2.zze = 2;
                        str2 = str3;
                        if (zzeVar.zzi(str2, j5, exc, zzaVar2) != f4) {
                        }
                        return f4;
                    }
                    return f4;
                }
                if (i4 == 1) {
                    long j7 = zzaVar2.zzb;
                    zzenVar = zzaVar2.zzg;
                    String str4 = zzaVar2.zzf;
                    zzeVar2 = (zze) zzaVar2.zza;
                    try {
                        ResultKt.a(obj);
                        zza = zzenVar;
                        j6 = j7;
                        str3 = str4;
                    } catch (Exception e5) {
                        Exception e6 = e5;
                        long j8 = j7;
                        str3 = str4;
                        zzeVar = zzeVar2;
                        j5 = j8;
                        exc = e6;
                        zzbd zza22 = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
                        if (zzenVar != null) {
                        }
                        zzaVar2.zza = zzeVar;
                        zzaVar2.zzf = str3;
                        zzaVar2.zzg = null;
                        zzaVar2.zze = 2;
                        str2 = str3;
                        if (zzeVar.zzi(str2, j5, exc, zzaVar2) != f4) {
                        }
                        return f4;
                    }
                } else {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.a(obj);
                        return Result.m243constructorimpl(obj);
                    }
                    String str5 = zzaVar2.zzf;
                    zze zzeVar3 = (zze) zzaVar2.zza;
                    ResultKt.a(obj);
                    Result.Companion companion = Result.Companion;
                    zzaVar2.zza = null;
                    zzaVar2.zzf = null;
                    zzaVar2.zze = 3;
                    obj = zzeVar3.zzd(str5, zzaVar2);
                }
                Object h4 = ((Result) obj).h();
                ResultKt.a(h4);
                zzsi zzsiVar = (zzsi) h4;
                if (zza != null) {
                    zza.zza();
                }
                return Result.m243constructorimpl(zzsiVar);
            }
        }
        zzaVar = new zza(this, dVar);
        zza zzaVar22 = zzaVar;
        Object obj2 = zzaVar22.zzc;
        Object f42 = AbstractC1241b.f();
        i4 = zzaVar22.zze;
        if (i4 != 0) {
        }
        Object h42 = ((Result) obj2).h();
        ResultKt.a(h42);
        zzsi zzsiVar2 = (zzsi) h42;
        if (zza != null) {
        }
        return Result.m243constructorimpl(zzsiVar2);
    }

    protected abstract Object zzd(String str, d dVar);

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        if (r11 != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[Catch: Exception -> 0x0051, TryCatch #1 {Exception -> 0x0051, blocks: (B:27:0x004d, B:28:0x007f, B:30:0x008e, B:31:0x0091), top: B:26:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(long j4, zzsc zzscVar, d dVar) {
        zzc zzcVar;
        int i4;
        Exception e4;
        zze zzeVar;
        zzen zzenVar;
        Object obj;
        Object obj2;
        zzbd zzbdVar;
        if (dVar instanceof zzc) {
            zzcVar = (zzc) dVar;
            int i5 = zzcVar.zzd;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzcVar.zzd = i5 - Integer.MIN_VALUE;
                Object obj3 = zzcVar.zzb;
                Object f4 = AbstractC1241b.f();
                i4 = zzcVar.zzd;
                if (i4 != 0) {
                    ResultKt.a(obj3);
                    zzen zzb = zzb();
                    if (this.zza) {
                        zzb.zza();
                        Result.Companion companion = Result.Companion;
                        return Result.m243constructorimpl(Unit.f41027a);
                    }
                    try {
                        zzd zzdVar = new zzd(this, zzscVar, null);
                        zzcVar.zza = this;
                        zzcVar.zze = zzb;
                        zzcVar.zzd = 1;
                        Object c4 = W0.c(j4, zzdVar, zzcVar);
                        if (c4 != f4) {
                            obj = c4;
                            zzenVar = zzb;
                            zzeVar = this;
                        }
                    } catch (Exception e5) {
                        e4 = e5;
                        zzeVar = this;
                        zzenVar = zzb;
                        zzeVar.zza = false;
                        zzcVar.zza = zzeVar;
                        zzcVar.zze = zzenVar;
                        zzcVar.zzd = 2;
                        Object zzj = zzeVar.zzj(e4, zzcVar);
                        obj2 = zzj;
                    }
                    return f4;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzbdVar = (zzbd) zzcVar.zza;
                        ResultKt.a(obj3);
                        Result.Companion companion2 = Result.Companion;
                        return Result.m243constructorimpl(ResultKt.createFailure(zzbdVar));
                    }
                    zzenVar = zzcVar.zze;
                    zzeVar = (zze) zzcVar.zza;
                    ResultKt.a(obj3);
                    obj2 = obj3;
                    zzbd zzbdVar2 = (zzbd) obj2;
                    if (zzenVar != null) {
                        zzenVar.zzb(zzbdVar2);
                    }
                    zzcVar.zza = zzbdVar2;
                    zzcVar.zze = null;
                    zzcVar.zzd = 3;
                    if (zzeVar.zzg(zzbdVar2, zzcVar) != f4) {
                        zzbdVar = zzbdVar2;
                        Result.Companion companion22 = Result.Companion;
                        return Result.m243constructorimpl(ResultKt.createFailure(zzbdVar));
                    }
                    return f4;
                }
                zzenVar = zzcVar.zze;
                zzeVar = (zze) zzcVar.zza;
                try {
                    ResultKt.a(obj3);
                    obj = obj3;
                } catch (Exception e6) {
                    e4 = e6;
                    zzeVar.zza = false;
                    zzcVar.zza = zzeVar;
                    zzcVar.zze = zzenVar;
                    zzcVar.zzd = 2;
                    Object zzj2 = zzeVar.zzj(e4, zzcVar);
                    obj2 = zzj2;
                }
                ResultKt.a(((Result) obj).h());
                Unit unit = Unit.f41027a;
                zzeVar.zza = true;
                if (zzenVar != null) {
                    zzenVar.zza();
                }
                return Result.m243constructorimpl(unit);
            }
        }
        zzcVar = new zzc(this, dVar);
        Object obj32 = zzcVar.zzb;
        Object f42 = AbstractC1241b.f();
        i4 = zzcVar.zzd;
        if (i4 != 0) {
        }
        ResultKt.a(((Result) obj).h());
        Unit unit2 = Unit.f41027a;
        zzeVar.zza = true;
        if (zzenVar != null) {
        }
        return Result.m243constructorimpl(unit2);
    }

    protected abstract Object zzf(String str, d dVar);

    protected Object zzg(zzbd zzbdVar, d dVar) {
        return Unit.f41027a;
    }

    protected abstract Object zzh(zzsc zzscVar, d dVar);

    protected Object zzi(String str, long j4, Exception exc, d dVar) {
        return Unit.f41027a;
    }

    protected Object zzj(Exception exc, d dVar) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    protected void zzk(zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
