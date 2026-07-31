package com.google.android.recaptcha.internal;

import W1.i;
import a2.AbstractC1241b;
import android.app.Application;
import java.util.Map;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x2.AbstractC3517c;
import x2.InterfaceC3515a;

/* loaded from: classes.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final zzl zze;
    private final InterfaceC3515a zzb = AbstractC3517c.b(false, 1, null);
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();

    /* JADX WARN: Multi-variable type inference failed */
    public zzcv(Application application) {
        Map map;
        Map map2;
        this.zza = application;
        int i4 = 1;
        this.zze = new zzl(null, i4, 0 == true ? 1 : 0);
        int i5 = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(zzaz.class.getName().hashCode(), new zzaz(null, 1, null)), new zzaw(zzfu.class.getName().hashCode(), new zzfu()), new zzaw(zzbe.class.getName().hashCode(), new zzbe()), new zzaw(zzjd.class.getName().hashCode(), new zzjd()), new zzaw(zzbr.class.getName().hashCode(), new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(zzex.class.getName().hashCode(), new zzex(0 == true ? 1 : 0, i4, 0 == true ? 1 : 0)), new zzaw(zzfk.class.getName().hashCode(), new zzfk(true)), new zzaw(Application.class.getName().hashCode(), application), new zzaw(zzbf.class.getName().hashCode(), new zzbf(application)), new zzaw(zzfj.class.getName().hashCode(), new zzfj()), new zzaw(zzaq.class.getName().hashCode(), new zzbm(application)), new zzaw(zzey.class.getName().hashCode(), new zzfa()), new zzaw(zzff.class.getName().hashCode(), new zzff())};
        for (int i6 = 0; i6 < 13; i6++) {
            zzaw zzawVar = zzawVarArr[i6];
            map = zzav.zzc;
            if (!map.containsKey(Integer.valueOf(zzawVar.zza()))) {
                map2 = zzav.zzc;
                map2.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (Intrinsics.areEqual(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j4) {
        if (j4 < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (androidx.core.content.a.a(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return Intrinsics.areEqual(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j4, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, d dVar, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            zzbiVar = zzcvVar.zzf;
        }
        zzbi zzbiVar2 = zzbiVar;
        if ((i4 & 16) != 0) {
            zzchVar = zzch.zza;
        }
        zzch zzchVar2 = zzchVar;
        if ((i4 & 2) != 0) {
            j4 = 10000;
        }
        return zzcvVar.zzg(str, j4, null, zzbiVar2, zzchVar2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, int i4, Function2 function2, d dVar) {
        zzcu zzcuVar;
        int i5;
        Exception e4;
        zzen zzenVar;
        zzbd e5;
        if (dVar instanceof zzcu) {
            zzcuVar = (zzcu) dVar;
            int i6 = zzcuVar.zzc;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                zzcuVar.zzc = i6 - Integer.MIN_VALUE;
                Object obj = zzcuVar.zza;
                Object f4 = AbstractC1241b.f();
                i5 = zzcuVar.zzc;
                if (i5 != 0) {
                    ResultKt.a(obj);
                    zzek zzk = zzk(str, this.zzf, i4);
                    zzen zzf = zzk.zzf(6);
                    try {
                        zzcuVar.zzd = zzf;
                        zzcuVar.zzc = 1;
                        obj = function2.invoke(zzk, zzcuVar);
                        if (obj == f4) {
                            return f4;
                        }
                        zzenVar = zzf;
                    } catch (zzbd e6) {
                        e5 = e6;
                        zzenVar = zzf;
                        zzenVar.zzb(e5);
                        throw e5.zzc();
                    } catch (Exception e7) {
                        e4 = e7;
                        zzenVar = zzf;
                        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zza, e4.getMessage());
                        zzenVar.zzb(zzbdVar);
                        throw zzbdVar.zzc();
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = zzcuVar.zzd;
                    try {
                        ResultKt.a(obj);
                    } catch (zzbd e8) {
                        e5 = e8;
                        zzenVar.zzb(e5);
                        throw e5.zzc();
                    } catch (Exception e9) {
                        e4 = e9;
                        zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zza, e4.getMessage());
                        zzenVar.zzb(zzbdVar2);
                        throw zzbdVar2.zzc();
                    }
                }
                zzenVar.zza();
                return obj;
            }
        }
        zzcuVar = new zzcu(this, dVar);
        Object obj2 = zzcuVar.zza;
        Object f42 = AbstractC1241b.f();
        i5 = zzcuVar.zzc;
        if (i5 != 0) {
        }
        zzenVar.zza();
        return obj2;
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i4) {
        String uuid = UUID.randomUUID().toString();
        int i5 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) i.b(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, uuid, i4, this.zza, zzesVar, null);
        zzekVar.zzc(uuid);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e A[Catch: all -> 0x00bc, TryCatch #1 {all -> 0x00bc, blocks: (B:25:0x0084, B:28:0x0099, B:33:0x008e), top: B:24:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, long j4, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, d dVar) {
        zzcs zzcsVar;
        Object obj;
        Object f4;
        int i4;
        zzbi zzbiVar2;
        zzch zzchVar2;
        long j5;
        zzcv zzcvVar;
        String str2;
        InterfaceC3515a interfaceC3515a;
        InterfaceC3515a interfaceC3515a2;
        try {
            if (dVar instanceof zzcs) {
                zzcsVar = (zzcs) dVar;
                int i5 = zzcsVar.zzg;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    zzcsVar.zzg = i5 - Integer.MIN_VALUE;
                    obj = zzcsVar.zze;
                    f4 = AbstractC1241b.f();
                    i4 = zzcsVar.zzg;
                    if (i4 != 0) {
                        ResultKt.a(obj);
                        InterfaceC3515a interfaceC3515a3 = this.zzb;
                        zzcsVar.zza = this;
                        zzcsVar.zzh = str;
                        zzcsVar.zzb = null;
                        zzcsVar.zzj = zzbiVar;
                        zzcsVar.zzi = zzchVar;
                        zzcsVar.zzc = interfaceC3515a3;
                        zzcsVar.zzd = j4;
                        zzcsVar.zzg = 1;
                        if (interfaceC3515a3.b(null, zzcsVar) != f4) {
                            zzbiVar2 = zzbiVar;
                            zzchVar2 = zzchVar;
                            j5 = j4;
                            zzcvVar = this;
                            str2 = str;
                            interfaceC3515a = interfaceC3515a3;
                        }
                        return f4;
                    }
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3515a2 = (InterfaceC3515a) zzcsVar.zza;
                        try {
                            ResultKt.a(obj);
                            zzdc zzdcVar = (zzdc) obj;
                            interfaceC3515a2.c(null);
                            return zzdcVar;
                        } catch (Throwable th) {
                            th = th;
                            interfaceC3515a2.c(null);
                            throw th;
                        }
                    }
                    long j6 = zzcsVar.zzd;
                    InterfaceC3515a interfaceC3515a4 = (InterfaceC3515a) zzcsVar.zzc;
                    zzch zzchVar3 = zzcsVar.zzi;
                    zzbi zzbiVar3 = zzcsVar.zzj;
                    String str3 = zzcsVar.zzh;
                    zzcv zzcvVar2 = (zzcv) zzcsVar.zza;
                    ResultKt.a(obj);
                    zzchVar2 = zzchVar3;
                    zzbiVar2 = zzbiVar3;
                    str2 = str3;
                    zzcvVar = zzcvVar2;
                    j5 = j6;
                    interfaceC3515a = interfaceC3515a4;
                    int i6 = !Intrinsics.areEqual(zzchVar2, zzch.zza) ? 3 : Intrinsics.areEqual(zzchVar2, zzch.zzb) ? 4 : 2;
                    zzct zzctVar = new zzct(zzcvVar, str2, j5, null, zzbiVar2, zzchVar2, null);
                    zzcsVar.zza = interfaceC3515a;
                    zzcsVar.zzh = null;
                    zzcsVar.zzb = null;
                    zzcsVar.zzj = null;
                    zzcsVar.zzi = null;
                    zzcsVar.zzc = null;
                    zzcsVar.zzg = 2;
                    obj = zzcvVar.zzj(str2, i6, zzctVar, zzcsVar);
                    if (obj != f4) {
                        interfaceC3515a2 = interfaceC3515a;
                        zzdc zzdcVar2 = (zzdc) obj;
                        interfaceC3515a2.c(null);
                        return zzdcVar2;
                    }
                    return f4;
                }
            }
            if (!Intrinsics.areEqual(zzchVar2, zzch.zza)) {
            }
            zzct zzctVar2 = new zzct(zzcvVar, str2, j5, null, zzbiVar2, zzchVar2, null);
            zzcsVar.zza = interfaceC3515a;
            zzcsVar.zzh = null;
            zzcsVar.zzb = null;
            zzcsVar.zzj = null;
            zzcsVar.zzi = null;
            zzcsVar.zzc = null;
            zzcsVar.zzg = 2;
            obj = zzcvVar.zzj(str2, i6, zzctVar2, zzcsVar);
            if (obj != f4) {
            }
            return f4;
        } catch (Throwable th2) {
            th = th2;
            interfaceC3515a2 = interfaceC3515a;
            interfaceC3515a2.c(null);
            throw th;
        }
        zzcsVar = new zzcs(this, dVar);
        obj = zzcsVar.zze;
        f4 = AbstractC1241b.f();
        i4 = zzcsVar.zzg;
        if (i4 != 0) {
        }
    }
}
