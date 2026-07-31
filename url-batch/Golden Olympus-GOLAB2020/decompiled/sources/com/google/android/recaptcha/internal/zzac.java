package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;

/* loaded from: classes.dex */
final class zzac extends l implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(zzae zzaeVar, String str, d dVar) {
        super(2, dVar);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzac(this.zzc, this.zzd, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r7 != r0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzy zzyVar;
        zzan zzanVar;
        String str;
        Object f4 = AbstractC1241b.f();
        zzen zzenVar = this.zzb;
        try {
        } catch (Exception e4) {
            zzenVar.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e4.getMessage()));
            zzae zzaeVar = this.zzc;
            this.zza = zzaeVar;
            int i4 = 2;
            this.zzb = 2;
            if (e4 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e4).getErrorCode();
                if (errorCode == -100) {
                    i4 = 44;
                } else if (errorCode == -12) {
                    i4 = 39;
                } else if (errorCode == -3) {
                    i4 = 30;
                } else if (errorCode == -2) {
                    i4 = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            i4 = 54;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i4 = 53;
                            break;
                        case -17:
                            i4 = 52;
                            break;
                        case -16:
                            i4 = 43;
                            break;
                        case -15:
                            i4 = 42;
                            break;
                        case -14:
                            i4 = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i4 = 36;
                                    break;
                                case -8:
                                    i4 = 35;
                                    break;
                                case -7:
                                    i4 = 34;
                                    break;
                                case -6:
                                    i4 = 33;
                                    break;
                                case -5:
                                    i4 = 32;
                                    break;
                            }
                    }
                } else {
                    i4 = 28;
                }
            } else {
                i4 = 45;
            }
            zztd zzf = zzte.zzf();
            zzf.zzq(i4);
            zzf.zzr(15);
            obj = zzf.zzk();
            if (obj != f4) {
                zzyVar = zzaeVar;
            }
            return f4;
        }
        if (zzenVar == 0) {
            ResultKt.a(obj);
            zzen zzb = zzz.zzb(this.zzc, this.zzd);
            zzae zzaeVar2 = this.zzc;
            zzanVar = zzaeVar2.zzc;
            str = zzaeVar2.zze;
            this.zza = zzb;
            this.zzb = 1;
            obj = zzanVar.zzc(str, this);
            zzenVar = zzb;
        } else {
            if (zzenVar != 1) {
                zzyVar = (zzy) this.zza;
                ResultKt.a(obj);
                int zza = zzyVar.zza();
                zztd zztdVar = (zztd) ((zzte) obj).zzr();
                zztdVar.zzf(zzyVar.zza());
                return new zzw(zza, (zzte) zztdVar.zzk());
            }
            zzen zzenVar2 = (zzen) this.zza;
            ResultKt.a(obj);
            zzenVar = zzenVar2;
        }
        zzenVar.zza();
        zzae zzaeVar3 = this.zzc;
        zztf zzf2 = zzti.zzf();
        zztg zzf3 = zzth.zzf();
        zzf3.zzw((String) obj);
        zzf2.zzf((zzth) zzf3.zzk());
        return zzz.zza(zzaeVar3, (zzti) zzf2.zzk());
    }
}
