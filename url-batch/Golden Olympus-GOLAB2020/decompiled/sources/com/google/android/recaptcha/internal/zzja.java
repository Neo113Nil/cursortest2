package com.google.android.recaptcha.internal;

import W1.h;
import W1.i;
import a2.AbstractC1241b;
import android.app.Application;
import android.webkit.WebView;
import com.ironsource.cc;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3333i;
import o2.AbstractC3337k;
import o2.AbstractC3364y;
import o2.InterfaceC3360w;
import o2.U0;

/* loaded from: classes.dex */
public final class zzja extends zze {
    public InterfaceC3360w zza;
    public zzfo zzb;
    private final zzek zzc;
    private zzsc zzf;
    private final zzek zzj;
    private final h zzk;
    private final h zzl;
    private final h zzm;
    private final h zzn;
    private final h zzo;
    private zzen zzp;
    private final zzbi zzq;
    private final Map zzd = zzjb.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcb zzg = new zzcb(zzje.zza);
    private final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);

    public zzja(zzek zzekVar, zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zza = zzekVar.zza();
        zza.zzc(zzekVar.zzd());
        this.zzj = zza;
        int i4 = zzav.zza;
        this.zzk = i.b(zzis.zza);
        this.zzl = i.b(zzit.zza);
        this.zzm = i.b(zziu.zza);
        this.zzn = i.b(zziv.zza);
        this.zzo = i.b(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzE(zzsc zzscVar, d dVar) {
        zzim zzimVar;
        int i4;
        zzbd zzbdVar;
        zzja zzjaVar;
        if (dVar instanceof zzim) {
            zzimVar = (zzim) dVar;
            int i5 = zzimVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzimVar.zzc = i5 - Integer.MIN_VALUE;
                Object obj = zzimVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzimVar.zzc;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    try {
                        zzff zzffVar = (zzff) this.zzn.getValue();
                        zzek zzekVar = this.zzj;
                        zzimVar.zzd = this;
                        zzimVar.zzc = 1;
                        obj = zzffVar.zzd(zzscVar, zzekVar, zzimVar);
                        if (obj == f4) {
                            return f4;
                        }
                        zzjaVar = this;
                    } catch (zzbd e4) {
                        zzbdVar = e4;
                        zzjaVar = this;
                        zzjaVar.zzA().o(zzbdVar);
                        return Unit.f41027a;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzjaVar = zzimVar.zzd;
                    try {
                        ResultKt.a(obj);
                    } catch (zzbd e5) {
                        zzbdVar = e5;
                        zzjaVar.zzA().o(zzbdVar);
                        return Unit.f41027a;
                    }
                }
                AbstractC3337k.d(zzjaVar.zzq.zzb(), null, null, new zzin(zzjaVar, (String) obj, null), 3, null);
                return Unit.f41027a;
            }
        }
        zzimVar = new zzim(this, dVar);
        Object obj2 = zzimVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzimVar.zzc;
        if (i4 != 0) {
        }
        AbstractC3337k.d(zzjaVar.zzq.zzb(), null, null, new zzin(zzjaVar, (String) obj2, null), 3, null);
        return Unit.f41027a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(1:(4:9|10|11|12)(2:28|29))(4:30|31|32|(1:34)(1:35))|13|14|15|16))|39|6|(0)(0)|13|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        r2 = r9;
        r9 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzF(String str, d dVar) {
        zzio zzioVar;
        int i4;
        Exception exc;
        zzja zzjaVar;
        String str2;
        String str3;
        zzja zzjaVar2;
        zzen zzenVar;
        if (dVar instanceof zzio) {
            zzioVar = (zzio) dVar;
            int i5 = zzioVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzioVar.zzc = i5 - Integer.MIN_VALUE;
                Object obj = zzioVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzioVar.zzc;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    this.zzp = this.zzj.zzf(26);
                    try {
                        String zza = ((zzbr) this.zzl.getValue()).zza();
                        zzioVar.zzd = this;
                        zzioVar.zze = str;
                        zzioVar.zzf = zza;
                        zzioVar.zzc = 1;
                        Object zzw = zzw(zzioVar);
                        if (zzw == f4) {
                            return f4;
                        }
                        str2 = str;
                        str3 = zza;
                        obj = zzw;
                        zzjaVar2 = this;
                    } catch (Exception e4) {
                        exc = e4;
                        zzjaVar = this;
                        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                        zzenVar = zzjaVar.zzp;
                        if (zzenVar != null) {
                            zzenVar.zzb(zzbdVar);
                        }
                        zzjaVar.zzp = null;
                        zzjaVar.zzA().o(zzbdVar);
                        return Unit.f41027a;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str4 = zzioVar.zzf;
                    String str5 = zzioVar.zze;
                    zzjaVar = zzioVar.zzd;
                    try {
                        ResultKt.a(obj);
                        str3 = str4;
                        str2 = str5;
                        zzjaVar2 = zzjaVar;
                    } catch (Exception e5) {
                        exc = e5;
                        zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                        zzenVar = zzjaVar.zzp;
                        if (zzenVar != null) {
                        }
                        zzjaVar.zzp = null;
                        zzjaVar.zzA().o(zzbdVar2);
                        return Unit.f41027a;
                    }
                }
                ((WebView) obj).loadDataWithBaseURL(str3, str2, "text/html", cc.f15721N, null);
                return Unit.f41027a;
            }
        }
        zzioVar = new zzio(this, dVar);
        Object obj2 = zzioVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzioVar.zzc;
        if (i4 != 0) {
        }
        ((WebView) obj2).loadDataWithBaseURL(str3, str2, "text/html", cc.f15721N, null);
        return Unit.f41027a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzG(String str, d dVar) {
        zzix zzixVar;
        Object obj;
        int i4;
        zzja zzjaVar;
        zzja zzjaVar2;
        if (dVar instanceof zzix) {
            zzixVar = (zzix) dVar;
            int i5 = zzixVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzixVar.zzc = i5 - Integer.MIN_VALUE;
                obj = zzixVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzixVar.zzc;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    zzcb zzcbVar = this.zzg;
                    zzje[] zzjeVarArr = {zzje.zzd, zzje.zzc, zzje.zzb};
                    zzixVar.zzd = this;
                    zzixVar.zze = str;
                    zzixVar.zzc = 1;
                    obj = zzcbVar.zzb(zzjeVarArr, zzixVar);
                    if (obj != f4) {
                        zzjaVar = this;
                    }
                    return f4;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = zzixVar.zze;
                    zzjaVar2 = zzixVar.zzd;
                    ResultKt.a(obj);
                    zzjaVar2.zza = AbstractC3364y.c(null, 1, null);
                    zzek zzekVar = zzjaVar2.zzj;
                    zzekVar.zzc(str);
                    AbstractC3337k.d(zzjaVar2.zzq.zza(), null, null, new zziz(zzjaVar2, zzekVar.zzf(42), null), 3, null);
                    return Unit.f41027a;
                }
                str = zzixVar.zze;
                zzjaVar = zzixVar.zzd;
                ResultKt.a(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.f41027a;
                }
                zzcb zzcbVar2 = zzjaVar.zzg;
                zzje zzjeVar = zzje.zzb;
                zzixVar.zzd = zzjaVar;
                zzixVar.zze = str;
                zzixVar.zzc = 2;
                if (zzcbVar2.zzc(zzjeVar, zzixVar) != f4) {
                    zzjaVar2 = zzjaVar;
                    zzjaVar2.zza = AbstractC3364y.c(null, 1, null);
                    zzek zzekVar2 = zzjaVar2.zzj;
                    zzekVar2.zzc(str);
                    AbstractC3337k.d(zzjaVar2.zzq.zza(), null, null, new zziz(zzjaVar2, zzekVar2.zzf(42), null), 3, null);
                    return Unit.f41027a;
                }
                return f4;
            }
        }
        zzixVar = new zzix(this, dVar);
        obj = zzixVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzixVar.zzc;
        if (i4 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    public final InterfaceC3360w zzA() {
        InterfaceC3360w interfaceC3360w = this.zza;
        if (interfaceC3360w != null) {
            return interfaceC3360w;
        }
        return null;
    }

    public final zzft zzC(zzsc zzscVar, zzcg zzcgVar, WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(CollectionsKt.toLongArray(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzen zza(String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzd(String str, d dVar) {
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        if (r8.zzG(r4, r2) != r3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object zzf(String str, d dVar) {
        zzip zzipVar;
        Object obj;
        int i4;
        String str2;
        zzja zzjaVar;
        zzja zzjaVar2;
        zzja zzjaVar3;
        String str3;
        zzja zzjaVar4;
        InterfaceC3360w zzA;
        zzja zzjaVar5;
        InterfaceC3360w interfaceC3360w;
        if (dVar instanceof zzip) {
            zzipVar = (zzip) dVar;
            int i5 = zzipVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzipVar.zzc = i5 - Integer.MIN_VALUE;
                obj = zzipVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzipVar.zzc;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    zzcb zzcbVar = this.zzg;
                    zzje zzjeVar = zzje.zzd;
                    zzipVar.zzd = this;
                    zzipVar.zze = str;
                    zzipVar.zzc = 1;
                    obj = zzcbVar.zza(zzjeVar, zzipVar);
                    if (obj != f4) {
                        str2 = str;
                        zzjaVar = this;
                    }
                    return f4;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        str2 = zzipVar.zze;
                        zzjaVar2 = zzipVar.zzd;
                        ResultKt.a(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            zzipVar.zzd = zzjaVar2;
                            zzipVar.zze = str2;
                            zzipVar.zzc = 3;
                        }
                        zzjaVar3 = zzjaVar2;
                        zzA = zzjaVar3.zzA();
                        zzipVar.zzd = zzjaVar3;
                        zzipVar.zze = str2;
                        zzipVar.zzc = 4;
                        if (zzA.await(zzipVar) != f4) {
                        }
                        return f4;
                    }
                    if (i4 == 3) {
                        str2 = zzipVar.zze;
                        zzjaVar3 = zzipVar.zzd;
                        ResultKt.a(obj);
                        try {
                            zzA = zzjaVar3.zzA();
                            zzipVar.zzd = zzjaVar3;
                            zzipVar.zze = str2;
                            zzipVar.zzc = 4;
                            if (zzA.await(zzipVar) != f4) {
                                zzjaVar5 = zzjaVar3;
                                InterfaceC3360w c4 = AbstractC3364y.c(null, 1, null);
                                zzjaVar5.zze.put(str2, c4);
                                zztp zzf = zztq.zzf();
                                zzf.zze(str2);
                                byte[] zzd = ((zztq) zzf.zzk()).zzd();
                                AbstractC3337k.d(zzjaVar5.zzq.zzb(), null, null, new zziq(zzjaVar5, zzkh.zzh().zzi(zzd, 0, zzd.length), null), 3, null);
                                zzipVar.zzd = zzjaVar5;
                                zzipVar.zze = str2;
                                zzipVar.zzc = 5;
                                obj = c4.await(zzipVar);
                                if (obj != f4) {
                                }
                            }
                            return f4;
                        } catch (Exception e4) {
                            e = e4;
                            str3 = str2;
                            zzjaVar4 = zzjaVar3;
                            zzbd zza = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzW, e.getMessage()));
                            interfaceC3360w = (InterfaceC3360w) zzjaVar4.zze.remove(str3);
                            if (interfaceC3360w != null) {
                            }
                            Result.Companion companion = Result.Companion;
                            return Result.m243constructorimpl(ResultKt.createFailure(zza));
                        }
                    }
                    if (i4 != 4) {
                        if (i4 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = zzipVar.zze;
                        zzjaVar4 = zzipVar.zzd;
                        try {
                            ResultKt.a(obj);
                            zzsi zzsiVar = (zzsi) obj;
                            zzsh zzf2 = zzsi.zzf();
                            zzf2.zze(str3);
                            zzsl zzf3 = zzsm.zzf();
                            zzf3.zze(zzsiVar.zzl());
                            zzf2.zzq(zzf3);
                            zzsj zzf4 = zzsk.zzf();
                            zzf4.zze(zzsiVar.zzj());
                            zzf4.zzf(zzsiVar.zzM());
                            zzf2.zzr(zzf4);
                            Result.Companion companion2 = Result.Companion;
                            return Result.m243constructorimpl(zzf2.zzk());
                        } catch (Exception e5) {
                            e = e5;
                            zzbd zza2 = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzW, e.getMessage()));
                            interfaceC3360w = (InterfaceC3360w) zzjaVar4.zze.remove(str3);
                            if (interfaceC3360w != null) {
                                kotlin.coroutines.jvm.internal.b.a(interfaceC3360w.o(zza2));
                            }
                            Result.Companion companion3 = Result.Companion;
                            return Result.m243constructorimpl(ResultKt.createFailure(zza2));
                        }
                    }
                    str2 = zzipVar.zze;
                    zzjaVar5 = zzipVar.zzd;
                    try {
                        ResultKt.a(obj);
                        InterfaceC3360w c42 = AbstractC3364y.c(null, 1, null);
                        zzjaVar5.zze.put(str2, c42);
                        zztp zzf5 = zztq.zzf();
                        zzf5.zze(str2);
                        byte[] zzd2 = ((zztq) zzf5.zzk()).zzd();
                        AbstractC3337k.d(zzjaVar5.zzq.zzb(), null, null, new zziq(zzjaVar5, zzkh.zzh().zzi(zzd2, 0, zzd2.length), null), 3, null);
                        zzipVar.zzd = zzjaVar5;
                        zzipVar.zze = str2;
                        zzipVar.zzc = 5;
                        obj = c42.await(zzipVar);
                        if (obj != f4) {
                            str3 = str2;
                            zzjaVar4 = zzjaVar5;
                            zzsi zzsiVar2 = (zzsi) obj;
                            zzsh zzf22 = zzsi.zzf();
                            zzf22.zze(str3);
                            zzsl zzf32 = zzsm.zzf();
                            zzf32.zze(zzsiVar2.zzl());
                            zzf22.zzq(zzf32);
                            zzsj zzf42 = zzsk.zzf();
                            zzf42.zze(zzsiVar2.zzj());
                            zzf42.zzf(zzsiVar2.zzM());
                            zzf22.zzr(zzf42);
                            Result.Companion companion22 = Result.Companion;
                            return Result.m243constructorimpl(zzf22.zzk());
                        }
                        return f4;
                    } catch (Exception e6) {
                        e = e6;
                        str3 = str2;
                        zzjaVar4 = zzjaVar5;
                        zzbd zza22 = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzW, e.getMessage()));
                        interfaceC3360w = (InterfaceC3360w) zzjaVar4.zze.remove(str3);
                        if (interfaceC3360w != null) {
                        }
                        Result.Companion companion32 = Result.Companion;
                        return Result.m243constructorimpl(ResultKt.createFailure(zza22));
                    }
                }
                str2 = zzipVar.zze;
                zzjaVar = zzipVar.zzd;
                ResultKt.a(obj);
                if (!((Boolean) obj).booleanValue()) {
                    zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzav, null);
                    Result.Companion companion4 = Result.Companion;
                    return Result.m243constructorimpl(ResultKt.createFailure(zzbdVar));
                }
                zzcb zzcbVar2 = zzjaVar.zzg;
                zzje zzjeVar2 = zzje.zzc;
                zzipVar.zzd = zzjaVar;
                zzipVar.zze = str2;
                zzipVar.zzc = 2;
                obj = zzcbVar2.zza(zzjeVar2, zzipVar);
                if (obj != f4) {
                    zzjaVar2 = zzjaVar;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    zzjaVar3 = zzjaVar2;
                    zzA = zzjaVar3.zzA();
                    zzipVar.zzd = zzjaVar3;
                    zzipVar.zze = str2;
                    zzipVar.zzc = 4;
                    if (zzA.await(zzipVar) != f4) {
                    }
                }
                return f4;
            }
        }
        zzipVar = new zzip(this, dVar);
        obj = zzipVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzipVar.zzc;
        if (i4 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzg(zzbd zzbdVar, d dVar) {
        if (Intrinsics.areEqual(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return Unit.f41027a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object zzh(zzsc zzscVar, d dVar) {
        zzir zzirVar;
        int i4;
        if (dVar instanceof zzir) {
            zzirVar = (zzir) dVar;
            int i5 = zzirVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzirVar.zzc = i5 - Integer.MIN_VALUE;
                Object obj = zzirVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzirVar.zzc;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.a(obj);
                        Result.Companion companion = Result.Companion;
                        return Result.m243constructorimpl(ResultKt.createFailure(new zzbd(zzbb.zzb, zzba.zzav, null)));
                    }
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                    Result.Companion companion2 = Result.Companion;
                    return Result.m243constructorimpl(Unit.f41027a);
                }
                ResultKt.a(obj);
                if (zzscVar.zzT() && zzscVar.zzR() && zzscVar.zzQ()) {
                    this.zzf = zzscVar;
                    String zzd = this.zzc.zzd();
                    zzirVar.zzc = 2;
                } else {
                    zzcb zzcbVar = this.zzg;
                    zzje zzjeVar = zzje.zzd;
                    zzirVar.zzc = 1;
                }
                return f4;
            }
        }
        zzirVar = new zzir(this, dVar);
        Object obj2 = zzirVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzirVar.zzc;
        if (i4 == 0) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzi(String str, long j4, Exception exc, d dVar) {
        exc.getMessage();
        InterfaceC3360w interfaceC3360w = (InterfaceC3360w) this.zze.remove(str);
        if (interfaceC3360w != null) {
            kotlin.coroutines.jvm.internal.b.a(interfaceC3360w.o(exc));
        }
        return Unit.f41027a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzj(Exception exc, d dVar) {
        return ((exc instanceof U0) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(d dVar) {
        return AbstractC3333i.g(this.zzq.zzb().n(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null), dVar);
    }

    public final Object zzx(d dVar) {
        Object g4 = AbstractC3333i.g(this.zzq.zzb().n(), new zzil(this, null), dVar);
        return g4 == AbstractC1241b.f() ? g4 : Unit.f41027a;
    }
}
