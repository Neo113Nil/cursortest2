package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.G;
import o2.InterfaceC3316J;

/* loaded from: classes.dex */
final class zzal extends l implements Function2 {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzan zzd;
    final /* synthetic */ zzen zze;
    final /* synthetic */ G zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzal(zzan zzanVar, zzen zzenVar, G g4, d dVar) {
        super(2, dVar);
        this.zzd = zzanVar;
        this.zze = zzenVar;
        this.zzf = g4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzal(this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((InterfaceC3316J) obj, (d) obj2)).invokeSuspend(Unit.f41027a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (o2.U.a(r4, r7) != r0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026 A[Catch: Exception -> 0x001c, TRY_ENTER, TryCatch #0 {Exception -> 0x001c, blocks: (B:8:0x0026, B:10:0x0032, B:38:0x0018), top: B:37:0x0018 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0049 -> B:7:0x0024). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007c -> B:5:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j4;
        boolean z4;
        boolean z5;
        int errorCode;
        Object f4 = AbstractC1241b.f();
        int i4 = this.zzc;
        if (i4 == 0) {
            ResultKt.a(obj);
            j4 = 1000;
            z4 = true;
            if (!z4) {
            }
        } else if (i4 != 1) {
            z5 = this.zzb;
            j4 = this.zza;
            ResultKt.a(obj);
            z4 = z5;
            j4 += j4;
            if (!z4) {
                return Unit.f41027a;
            }
            zzan zzanVar = this.zzd;
            this.zza = j4;
            this.zzc = 1;
            obj = zzanVar.zzi(this);
        } else {
            j4 = this.zza;
            try {
                ResultKt.a(obj);
            } catch (Exception e4) {
                this.zzf.f41132b = e4;
                z5 = (e4 instanceof StandardIntegrityException) && ((errorCode = ((StandardIntegrityException) e4).getErrorCode()) == -100 || errorCode == -18 || errorCode == -12 || errorCode == -8 || errorCode == -3);
                if (!z5) {
                    throw e4;
                }
                this.zza = j4;
                this.zzb = true;
                this.zzc = 2;
            }
            this.zzd.zzf().J((StandardIntegrityManager.StandardIntegrityTokenProvider) obj);
            this.zzd.zze = zzao.zzc;
            this.zze.zza();
            z4 = false;
            if (!z4) {
            }
        }
    }
}
