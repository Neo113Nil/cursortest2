package com.google.android.recaptcha.internal;

import W1.h;
import W1.i;
import a2.AbstractC1241b;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlin.sequences.k;
import o2.AbstractC3327f;
import o2.AbstractC3333i;
import o2.AbstractC3367z0;
import o2.B0;
import o2.U0;
import o2.W0;

/* loaded from: classes.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final h zzd;
    private final h zze;
    private final h zzf;
    private final h zzg;
    private final h zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i4 = zzav.zza;
        this.zzd = i.b(zzdm.zza);
        this.zze = i.b(zzdn.zza);
        this.zzf = i.b(zzdo.zza);
        this.zzg = i.b(zzdp.zza);
        this.zzh = i.b(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zza = this.zzb.zza();
        zza.zzc(str);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzv(zzsc zzscVar, long j4, d dVar) {
        zzdj zzdjVar;
        int i4;
        Object zzc;
        zzdt zzdtVar;
        Throwable d4;
        if (dVar instanceof zzdj) {
            zzdjVar = (zzdj) dVar;
            int i5 = zzdjVar.zzd;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzdjVar.zzd = i5 - Integer.MIN_VALUE;
                zzdj zzdjVar2 = zzdjVar;
                Object obj = zzdjVar2.zzb;
                Object f4 = AbstractC1241b.f();
                i4 = zzdjVar2.zzd;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    zzy(zzscVar.zzO());
                    Iterator it = zzw().iterator();
                    while (it.hasNext()) {
                        this.zzc.zzf((zze) it.next());
                    }
                    zzl zzlVar = this.zzc;
                    zzek zzekVar = this.zzb;
                    zzdjVar2.zza = this;
                    zzdjVar2.zzd = 1;
                    zzc = zzlVar.zzc(j4, zzscVar, zzekVar, zzdjVar2);
                    if (zzc != f4) {
                        zzdtVar = this;
                    }
                    return f4;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) zzdjVar2.zza;
                    ResultKt.a(obj);
                    throw th;
                }
                zzdtVar = (zzdt) zzdjVar2.zza;
                ResultKt.a(obj);
                zzc = ((Result) obj).h();
                d4 = Result.d(zzc);
                if (d4 != null) {
                    return Unit.f41027a;
                }
                B0.f(zzdtVar.zzi.zzd().n(), null, 1, null);
                List D4 = k.D(AbstractC3367z0.k(zzdtVar.zzi.zzd().n()).getChildren());
                zzdjVar2.zza = d4;
                zzdjVar2.zzd = 2;
                if (AbstractC3327f.c(D4, zzdjVar2) != f4) {
                    throw d4;
                }
                return f4;
            }
        }
        zzdjVar = new zzdj(this, dVar);
        zzdj zzdjVar22 = zzdjVar;
        Object obj2 = zzdjVar22.zzb;
        Object f42 = AbstractC1241b.f();
        i4 = zzdjVar22.zzd;
        if (i4 != 0) {
        }
        d4 = Result.d(zzc);
        if (d4 != null) {
        }
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return CollectionsKt.toList(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i4 = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasCapability(16);
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) {
        try {
            zzrv zzj = zzrv.zzj(zzbt.zza(str));
            int i4 = zzav.zza;
            ((zzfu) i.b(zzde.zza).getValue()).zza(zzj);
        } catch (Exception e4) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e4.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzf = zzsp.zzf();
        zzf.zzs(this.zza);
        zzf.zze(recaptchaAction.getAction());
        zzf.zzf(zzscVar.zzN());
        zzf.zzq(zzscVar.zzM());
        zzf.zzr(zzsiVar);
        return (zzsp) zzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(String str, long j4, d dVar) {
        zzdd zzddVar;
        int i4;
        Exception e4;
        zzen zzenVar;
        U0 e5;
        zzbd e6;
        if (dVar instanceof zzdd) {
            zzddVar = (zzdd) dVar;
            int i5 = zzddVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzddVar.zzc = i5 - Integer.MIN_VALUE;
                Object obj = zzddVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzddVar.zzc;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    zzen zzf = zzu(str).zzf(27);
                    try {
                        zzl zzlVar = this.zzc;
                        zzddVar.zzd = zzf;
                        zzddVar.zzc = 1;
                        Object zzb = zzlVar.zzb(str, j4, zzddVar);
                        if (zzb == f4) {
                            return f4;
                        }
                        obj = zzb;
                        zzenVar = zzf;
                    } catch (zzbd e7) {
                        e6 = e7;
                        zzenVar = zzf;
                        zzenVar.zzb(e6);
                        throw e6;
                    } catch (U0 e8) {
                        e5 = e8;
                        zzenVar = zzf;
                        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzb, e5.getMessage());
                        zzenVar.zzb(zzbdVar);
                        throw zzbdVar;
                    } catch (Exception e9) {
                        e4 = e9;
                        zzenVar = zzf;
                        zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzaa, e4.getMessage());
                        zzenVar.zzb(zzbdVar2);
                        throw zzbdVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = zzddVar.zzd;
                    try {
                        ResultKt.a(obj);
                    } catch (zzbd e10) {
                        e6 = e10;
                        zzenVar.zzb(e6);
                        throw e6;
                    } catch (U0 e11) {
                        e5 = e11;
                        zzbd zzbdVar3 = new zzbd(zzbb.zzb, zzba.zzb, e5.getMessage());
                        zzenVar.zzb(zzbdVar3);
                        throw zzbdVar3;
                    } catch (Exception e12) {
                        e4 = e12;
                        zzbd zzbdVar22 = new zzbd(zzbb.zzb, zzba.zzaa, e4.getMessage());
                        zzenVar.zzb(zzbdVar22);
                        throw zzbdVar22;
                    }
                }
                zzsi zzsiVar = (zzsi) obj;
                zzenVar.zza();
                return zzsiVar;
            }
        }
        zzddVar = new zzdd(this, dVar);
        Object obj2 = zzddVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzddVar.zzc;
        if (i4 != 0) {
        }
        zzsi zzsiVar2 = (zzsi) obj2;
        zzenVar.zza();
        return zzsiVar2;
    }

    public final Object zzm(zzsp zzspVar, String str, long j4, d dVar) {
        return AbstractC3333i.g(this.zzi.zza().n(), new zzdg(this, str, j4, zzspVar, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzn(zzsc zzscVar, long j4, d dVar) {
        zzdk zzdkVar;
        int i4;
        try {
            if (dVar instanceof zzdk) {
                zzdkVar = (zzdk) dVar;
                int i5 = zzdkVar.zzc;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    zzdkVar.zzc = i5 - Integer.MIN_VALUE;
                    Object obj = zzdkVar.zza;
                    Object f4 = AbstractC1241b.f();
                    i4 = zzdkVar.zzc;
                    if (i4 != 0) {
                        ResultKt.a(obj);
                        zzdl zzdlVar = new zzdl(this, zzscVar, j4, null);
                        zzdkVar.zzc = 1;
                        if (W0.c(j4, zzdlVar, zzdkVar) == f4) {
                            return f4;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.a(obj);
                    }
                    return Unit.f41027a;
                }
            }
            if (i4 != 0) {
            }
            return Unit.f41027a;
        } catch (zzbd e4) {
            throw e4;
        } catch (U0 e5) {
            throw new zzbd(zzbb.zzb, zzba.zzb, e5.getMessage());
        } catch (Exception e6) {
            throw new zzbd(zzbb.zzb, zzba.zzap, e6.getMessage());
        }
        zzdkVar = new zzdk(this, dVar);
        Object obj2 = zzdkVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzdkVar.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzo(long j4, d dVar) {
        zzdr zzdrVar;
        int i4;
        Exception e4;
        zzen zzenVar;
        zzdt zzdtVar;
        U0 e5;
        zzbd e6;
        if (dVar instanceof zzdr) {
            zzdrVar = (zzdr) dVar;
            int i5 = zzdrVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzdrVar.zzc = i5 - Integer.MIN_VALUE;
                Object obj = zzdrVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzdrVar.zzc;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    zzen zzf = this.zzb.zzf(22);
                    try {
                        zzds zzdsVar = new zzds(this, zzf, null);
                        zzdrVar.zzd = this;
                        zzdrVar.zze = zzf;
                        zzdrVar.zzc = 1;
                        Object c4 = W0.c(j4, zzdsVar, zzdrVar);
                        if (c4 == f4) {
                            return f4;
                        }
                        obj = c4;
                        zzenVar = zzf;
                        zzdtVar = this;
                    } catch (zzbd e7) {
                        e6 = e7;
                        zzenVar = zzf;
                        zzdtVar = this;
                        if (Intrinsics.areEqual(e6.zzb(), zzbb.zzc)) {
                        }
                        zzenVar.zzb(e6);
                        throw e6;
                    } catch (U0 e8) {
                        e5 = e8;
                        zzenVar = zzf;
                        zzdtVar = this;
                        zzbd zzs = zzdtVar.zzs(e5, new zzbd(zzbb.zzc, zzba.zzb, e5.getMessage()));
                        zzenVar.zzb(zzs);
                        throw zzs;
                    } catch (Exception e9) {
                        e4 = e9;
                        zzenVar = zzf;
                        zzdtVar = this;
                        zzbd zzs2 = zzdtVar.zzs(e4, new zzbd(zzbb.zzc, zzba.zzaw, e4.getMessage()));
                        zzenVar.zzb(zzs2);
                        throw zzs2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = zzdrVar.zze;
                    zzdtVar = zzdrVar.zzd;
                    try {
                        ResultKt.a(obj);
                    } catch (zzbd e10) {
                        e6 = e10;
                        if (Intrinsics.areEqual(e6.zzb(), zzbb.zzc)) {
                            e6 = zzdtVar.zzs(e6, e6);
                        }
                        zzenVar.zzb(e6);
                        throw e6;
                    } catch (U0 e11) {
                        e5 = e11;
                        zzbd zzs3 = zzdtVar.zzs(e5, new zzbd(zzbb.zzc, zzba.zzb, e5.getMessage()));
                        zzenVar.zzb(zzs3);
                        throw zzs3;
                    } catch (Exception e12) {
                        e4 = e12;
                        zzbd zzs22 = zzdtVar.zzs(e4, new zzbd(zzbb.zzc, zzba.zzaw, e4.getMessage()));
                        zzenVar.zzb(zzs22);
                        throw zzs22;
                    }
                }
                return (zzsc) obj;
            }
        }
        zzdrVar = new zzdr(this, dVar);
        Object obj2 = zzdrVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzdrVar.zzc;
        if (i4 != 0) {
        }
        return (zzsc) obj2;
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzf = zzu(str).zzf(29);
        try {
            List<zzst> zzk = zzsrVar.zzk();
            LinkedHashMap linkedHashMap = new LinkedHashMap(g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(zzk, 10)), 16));
            for (zzst zzstVar : zzk) {
                Pair pair = TuplesKt.to(zzstVar.zzg(), zzstVar.zzi());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzf.zza();
        } catch (zzbd e4) {
            zzf.zzb(e4);
        } catch (Exception e5) {
            zzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e5.getMessage()));
        }
    }
}
