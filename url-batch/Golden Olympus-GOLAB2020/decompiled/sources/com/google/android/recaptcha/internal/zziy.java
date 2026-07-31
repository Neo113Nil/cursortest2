package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import android.webkit.WebView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import o2.InterfaceC3360w;

/* loaded from: classes.dex */
final class zziy extends l implements Function2 {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzja zzf;
    final /* synthetic */ zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zziy(zzja zzjaVar, zzen zzenVar, d dVar) {
        super(2, dVar);
        this.zzf = zzjaVar;
        this.zzg = zzenVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zziy(this.zzf, this.zzg, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziy) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cc, code lost:
    
        r8.zzg.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d3, code lost:
    
        return kotlin.Unit.f41027a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b8, code lost:
    
        if (r9.await(r8) != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        if (r9 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r1 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ba, code lost:
    
        r9 = r8.zzf.zzm();
        r1 = com.google.android.recaptcha.internal.zzje.zzc;
        r8.zze = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00c9, code lost:
    
        if (r9.zzc(r1, r8) != r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzja zzjaVar;
        zzsc zzscVar;
        zzsc zzscVar2;
        zzsc zzscVar3;
        zzcg zzcgVar;
        zzja zzjaVar2;
        zzjh zzjhVar;
        zzjh zzjhVar2;
        zzsc zzscVar4;
        Object zzE;
        Object f4 = AbstractC1241b.f();
        int i4 = this.zze;
        if (i4 == 0) {
            ResultKt.a(obj);
            zzjaVar = this.zzf;
            zzscVar = zzjaVar.zzf;
            if (zzscVar == null) {
                zzscVar = null;
            }
            zzscVar2 = this.zzf.zzf;
            if (zzscVar2 == null) {
                zzscVar2 = null;
            }
            zzcg zzcgVar2 = new zzcg(zzscVar2.zzf());
            zzja zzjaVar3 = this.zzf;
            this.zza = zzjaVar;
            this.zzb = zzjaVar;
            this.zzc = zzscVar;
            this.zzd = zzcgVar2;
            this.zze = 1;
            Object zzw = zzjaVar3.zzw(this);
            if (zzw != f4) {
                zzscVar3 = zzscVar;
                obj = zzw;
                zzcgVar = zzcgVar2;
                zzjaVar2 = zzjaVar;
            }
            return f4;
        }
        if (i4 != 1) {
            ResultKt.a(obj);
            if (i4 != 2) {
            }
            kotlin.coroutines.jvm.internal.b.b(this.zzf.zzA().hashCode());
            InterfaceC3360w zzA = this.zzf.zzA();
            this.zze = 3;
        } else {
            zzcgVar = (zzcg) this.zzd;
            zzscVar3 = (zzsc) this.zzc;
            zzjaVar = (zzja) this.zzb;
            zzjaVar2 = (zzja) this.zza;
            ResultKt.a(obj);
        }
        zzjaVar2.zzb = zzjaVar.zzC(zzscVar3, zzcgVar, (WebView) obj);
        kotlin.coroutines.jvm.internal.b.b(this.zzf.zzA().hashCode());
        zzjhVar = this.zzf.zzh;
        zzjhVar.zzd();
        zzjhVar2 = this.zzf.zzh;
        zzjhVar2.zze();
        zzja zzjaVar4 = this.zzf;
        zzscVar4 = zzjaVar4.zzf;
        if (zzscVar4 == null) {
            zzscVar4 = null;
        }
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 2;
        zzE = zzjaVar4.zzE(zzscVar4, this);
    }
}
