package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzftd implements zzfrw {
    private final CoroutineScope zza;
    private final Mutex zzb;
    private final Mutex zzc;
    private final Mutex zzd;
    private boolean zze;
    private zzfru zzf;
    private boolean zzg;
    private final DataStore zzh;
    private final zzdpw zzi;

    public zzftd(DataStore adQualityDataStore, zzftf coroutineScopeProvider, zzdpw dataPinger, zzfsf clock) {
        Intrinsics.checkNotNullParameter(adQualityDataStore, "adQualityDataStore");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(dataPinger, "dataPinger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.zzi = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = MutexKt.Mutex$default(false, 1, null);
        this.zzc = MutexKt.Mutex$default(false, 1, null);
        this.zzd = MutexKt.Mutex$default(false, 1, null);
        this.zzh = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        if (r9.lock(null, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzs(String str, Continuation continuation) {
        zzfsi zzfsiVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        Object updateData;
        try {
            if (continuation instanceof zzfsi) {
                zzfsiVar = (zzfsi) continuation;
                int i2 = zzfsiVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfsiVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfsiVar.zzc;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfsiVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzd;
                        zzfsiVar.zza = str;
                        zzfsiVar.zzb = mutex;
                        zzfsiVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) zzfsiVar.zza;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = (Mutex) zzfsiVar.zzb;
                        String str2 = (String) zzfsiVar.zza;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                        str = str2;
                    }
                    DataStore dataStore = this.zzh;
                    zzfsj zzfsjVar = new zzfsj(str, null);
                    zzfsiVar.zza = mutex;
                    zzfsiVar.zzb = null;
                    zzfsiVar.zze = 2;
                    updateData = dataStore.updateData(zzfsjVar, zzfsiVar);
                    if (updateData != coroutine_suspended) {
                        Mutex mutex4 = mutex;
                        obj = updateData;
                        mutex2 = mutex4;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            DataStore dataStore2 = this.zzh;
            zzfsj zzfsjVar2 = new zzfsj(str, null);
            zzfsiVar.zza = mutex;
            zzfsiVar.zzb = null;
            zzfsiVar.zze = 2;
            updateData = dataStore2.updateData(zzfsjVar2, zzfsiVar);
            if (updateData != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
        zzfsiVar = new zzfsi(this, continuation);
        Object obj2 = zzfsiVar.zzc;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfsiVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (r8.lock(null, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzt(Continuation continuation) {
        zzfsl zzfslVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        Object updateData;
        try {
            if (continuation instanceof zzfsl) {
                zzfslVar = (zzfsl) continuation;
                int i2 = zzfslVar.zzd;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfslVar.zzd = i2 - Integer.MIN_VALUE;
                    Object obj = zzfslVar.zzb;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfslVar.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzd;
                        zzfslVar.zza = mutex;
                        zzfslVar.zzd = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) zzfslVar.zza;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = (Mutex) zzfslVar.zza;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    }
                    DataStore dataStore = this.zzh;
                    zzfsm zzfsmVar = new zzfsm(null);
                    zzfslVar.zza = mutex;
                    zzfslVar.zzd = 2;
                    updateData = dataStore.updateData(zzfsmVar, zzfslVar);
                    if (updateData != coroutine_suspended) {
                        mutex2 = mutex;
                        obj = updateData;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            DataStore dataStore2 = this.zzh;
            zzfsm zzfsmVar2 = new zzfsm(null);
            zzfslVar.zza = mutex;
            zzfslVar.zzd = 2;
            updateData = dataStore2.updateData(zzfsmVar2, zzfslVar);
            if (updateData != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        zzfslVar = new zzfsl(this, continuation);
        Object obj2 = zzfslVar.zzb;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfslVar.zzd;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #0 {all -> 0x0077, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0054, B:17:0x0058, B:18:0x005c, B:20:0x0065, B:21:0x0069), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0054, B:17:0x0058, B:18:0x005c, B:20:0x0065, B:21:0x0069), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0054, B:17:0x0058, B:18:0x005c, B:20:0x0065, B:21:0x0069), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzu(long j, Continuation continuation) {
        zzfsk zzfskVar;
        int i;
        Mutex mutex;
        zzfru zzfruVar;
        zzfru zzfruVar2;
        zzfru zzfruVar3;
        try {
            if (continuation instanceof zzfsk) {
                zzfskVar = (zzfsk) continuation;
                int i2 = zzfskVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfskVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfskVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfskVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzb;
                        zzfskVar.zzb = mutex2;
                        zzfskVar.zza = j;
                        zzfskVar.zze = 1;
                        if (mutex2.lock(null, zzfskVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzfskVar.zza;
                        mutex = (Mutex) zzfskVar.zzb;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzfruVar = this.zzf;
                    if (zzfruVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfruVar = null;
                    }
                    zzfruVar2 = this.zzf;
                    if (zzfruVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfruVar2 = null;
                    }
                    long zzi = j - zzfruVar2.zzi();
                    zzfruVar3 = this.zzf;
                    if (zzfruVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfruVar3 = null;
                    }
                    zzfruVar.zzb(zzi - zzfruVar3.zzg());
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            zzfruVar = this.zzf;
            if (zzfruVar == null) {
            }
            zzfruVar2 = this.zzf;
            if (zzfruVar2 == null) {
            }
            long zzi2 = j - zzfruVar2.zzi();
            zzfruVar3 = this.zzf;
            if (zzfruVar3 == null) {
            }
            zzfruVar.zzb(zzi2 - zzfruVar3.zzg());
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        zzfskVar = new zzfsk(this, continuation);
        Object obj2 = zzfskVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfskVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0060, code lost:
    
        if (r2.lock(null, r0) != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066 A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:35:0x0062, B:37:0x0066, B:38:0x006c), top: B:34:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzv(Continuation continuation) {
        zzfsp zzfspVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        zzfru zzfruVar;
        Mutex mutex2;
        zzfrv zzfrvVar;
        Mutex mutex3;
        try {
            if (continuation instanceof zzfsp) {
                zzfspVar = (zzfsp) continuation;
                int i2 = zzfspVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfspVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfspVar.zzc;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfspVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzb;
                        zzfspVar.zza = mutex;
                        zzfspVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex3 = (Mutex) zzfspVar.zza;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    mutex3.unlock(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            mutex2 = (Mutex) zzfspVar.zzb;
                            zzfrvVar = (zzfrv) zzfspVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                DataStore dataStore = this.zzh;
                                zzfsq zzfsqVar = new zzfsq(zzfrvVar, null);
                                zzfspVar.zza = mutex2;
                                zzfspVar.zzb = null;
                                zzfspVar.zze = 3;
                                obj = dataStore.updateData(zzfsqVar, zzfspVar);
                                if (obj != coroutine_suspended) {
                                    mutex3 = mutex2;
                                    mutex3.unlock(null);
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex3 = mutex2;
                                throw th;
                            }
                        }
                        mutex = (Mutex) zzfspVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzfruVar = this.zzf;
                    if (zzfruVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfruVar = null;
                    }
                    zzfrv zzfrvVar2 = (zzfrv) zzfruVar.zzbu();
                    mutex.unlock(null);
                    Intrinsics.checkNotNull(zzfrvVar2);
                    mutex2 = this.zzd;
                    zzfspVar.zza = zzfrvVar2;
                    zzfspVar.zzb = mutex2;
                    zzfspVar.zze = 2;
                    if (mutex2.lock(null, zzfspVar) != coroutine_suspended) {
                        zzfrvVar = zzfrvVar2;
                        DataStore dataStore2 = this.zzh;
                        zzfsq zzfsqVar2 = new zzfsq(zzfrvVar, null);
                        zzfspVar.zza = mutex2;
                        zzfspVar.zzb = null;
                        zzfspVar.zze = 3;
                        obj = dataStore2.updateData(zzfsqVar2, zzfspVar);
                        if (obj != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            zzfruVar = this.zzf;
            if (zzfruVar == null) {
            }
            zzfrv zzfrvVar22 = (zzfrv) zzfruVar.zzbu();
            mutex.unlock(null);
            Intrinsics.checkNotNull(zzfrvVar22);
            mutex2 = this.zzd;
            zzfspVar.zza = zzfrvVar22;
            zzfspVar.zzb = mutex2;
            zzfspVar.zze = 2;
            if (mutex2.lock(null, zzfspVar) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } finally {
            mutex.unlock(null);
        }
        zzfspVar = new zzfsp(this, continuation);
        Object obj2 = zzfspVar.zzc;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfspVar.zze;
        if (i != 0) {
        }
    }

    private static final boolean zzw(zzfrv zzfrvVar) {
        boolean z;
        List zzk = zzfrvVar.zzk();
        Long l = zzk != null ? (Long) CollectionsKt.lastOrNull(zzk) : null;
        boolean z2 = zzfrvVar.zzl() > zzfrvVar.zzm() && !zzfrvVar.zzd();
        if (l != null) {
            if (zzfrvVar.zzi() - l.longValue() > 5000) {
                z = true;
                return !z2 || z;
            }
        }
        z = false;
        if (z2) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zza() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfsy(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzb(String gwsQueryId) {
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfss(this, gwsQueryId, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzc() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfso(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzd() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzftc(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zze() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfsw(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzf() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfta(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final void zzg() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfsu(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        if (zzt(r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        if (r9 == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzftd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzh(Continuation continuation) {
        zzfsx zzfsxVar;
        ?? r2;
        Mutex mutex;
        try {
            if (continuation instanceof zzfsx) {
                zzfsxVar = (zzfsx) continuation;
                int i = zzfsxVar.zzd;
                if ((i & Integer.MIN_VALUE) != 0) {
                    zzfsxVar.zzd = i - Integer.MIN_VALUE;
                    Object obj = zzfsxVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = zzfsxVar.zzd;
                    if (r2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzd;
                        zzfsxVar.zza = mutex2;
                        zzfsxVar.zzd = 1;
                        if (mutex2.lock(null, zzfsxVar) != coroutine_suspended) {
                            mutex = mutex2;
                        }
                        return coroutine_suspended;
                    }
                    if (r2 == 1) {
                        Mutex mutex3 = (Mutex) zzfsxVar.zza;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    } else {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        Mutex mutex4 = (Mutex) zzfsxVar.zza;
                        ResultKt.throwOnFailure(obj);
                        r2 = mutex4;
                        zzfrz zzfrzVar = (zzfrz) obj;
                        if (zzfrzVar == null || zzfrzVar.zza() == 0) {
                            return Unit.INSTANCE;
                        }
                        for (Map.Entry entry : zzfrzVar.zzb().entrySet()) {
                            zzhib zzcc = ((zzfrv) entry.getValue()).zzcc();
                            Intrinsics.checkNotNullExpressionValue(zzcc, "toBuilder(...)");
                            zzfru zzfruVar = (zzfru) zzcc;
                            Object value = entry.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                            if (zzw((zzfrv) value)) {
                                zzfruVar.zzf(true);
                            }
                            zzdpw zzdpwVar = this.zzi;
                            zzhih zzbu = zzfruVar.zzbu();
                            Intrinsics.checkNotNullExpressionValue(zzbu, "build(...)");
                            zzdpwVar.zza((zzfrv) zzbu);
                        }
                        zzfsxVar.zza = null;
                        zzfsxVar.zzd = 3;
                    }
                    Flow data = this.zzh.getData();
                    zzfsxVar.zza = mutex;
                    zzfsxVar.zzd = 2;
                    obj = FlowKt.firstOrNull(data, zzfsxVar);
                    r2 = mutex;
                }
            }
            if (r2 != 0) {
            }
            Flow data2 = this.zzh.getData();
            zzfsxVar.zza = mutex;
            zzfsxVar.zzd = 2;
            obj = FlowKt.firstOrNull(data2, zzfsxVar);
            r2 = mutex;
        } finally {
            r2.unlock(null);
        }
        zzfsxVar = new zzfsx(this, continuation);
        Object obj2 = zzfsxVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = zzfsxVar.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:11:0x0057, B:13:0x005b, B:17:0x0061, B:19:0x0071, B:20:0x0077), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[Catch: all -> 0x0083, TRY_ENTER, TryCatch #0 {all -> 0x0083, blocks: (B:11:0x0057, B:13:0x005b, B:17:0x0061, B:19:0x0071, B:20:0x0077), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(String str, Continuation continuation) {
        zzfsr zzfsrVar;
        int i;
        String str2;
        Mutex mutex;
        long j;
        try {
            if (continuation instanceof zzfsr) {
                zzfsrVar = (zzfsr) continuation;
                int i2 = zzfsrVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfsrVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfsrVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfsrVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzb;
                        long currentTimeMillis = System.currentTimeMillis();
                        zzfsrVar.zzf = str;
                        zzfsrVar.zza = mutex2;
                        zzfsrVar.zzb = currentTimeMillis;
                        zzfsrVar.zze = 1;
                        if (mutex2.lock(null, zzfsrVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        mutex = mutex2;
                        j = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzfsrVar.zzb;
                        mutex = (Mutex) zzfsrVar.zza;
                        str2 = zzfsrVar.zzf;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (!this.zze) {
                        return Unit.INSTANCE;
                    }
                    this.zze = true;
                    zzfru zzfruVar = (zzfru) zzfrv.zzp().zzcc();
                    this.zzf = zzfruVar;
                    if (zzfruVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfruVar = null;
                    }
                    zzfruVar.zza(str2);
                    zzfruVar.zzj(j);
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            if (!this.zze) {
            }
        } finally {
            mutex.unlock(null);
        }
        zzfsrVar = new zzfsr(this, continuation);
        Object obj2 = zzfsrVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfsrVar.zze;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (zzv(r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (zzu(r5, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005f, code lost:
    
        if (r2.lock(null, r0) != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:24:0x0085, B:26:0x0089, B:27:0x008f), top: B:23:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065 A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:36:0x0061, B:38:0x0065, B:41:0x006b), top: B:35:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:36:0x0061, B:38:0x0065, B:41:0x006b), top: B:35:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(Continuation continuation) {
        zzfsn zzfsnVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzfru zzfruVar;
        try {
            if (continuation instanceof zzfsn) {
                zzfsnVar = (zzfsn) continuation;
                int i2 = zzfsnVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfsnVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfsnVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfsnVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzfsnVar.zza = mutex;
                        zzfsnVar.zze = 1;
                    } else if (i == 1) {
                        mutex = (Mutex) zzfsnVar.zza;
                        ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        j = zzfsnVar.zzb;
                        mutex2 = (Mutex) zzfsnVar.zza;
                        ResultKt.throwOnFailure(obj);
                        try {
                            zzfruVar = this.zzf;
                            if (zzfruVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                zzfruVar = null;
                            }
                            zzfruVar.zzo(j);
                            mutex.unlock(null);
                            zzfsnVar.zza = null;
                            zzfsnVar.zze = 3;
                        } finally {
                        }
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        zzfsnVar.zze = 4;
                    }
                    if (!this.zzg) {
                        return Unit.INSTANCE;
                    }
                    this.zzg = true;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    mutex2 = this.zzb;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzfsnVar.zza = mutex2;
                    zzfsnVar.zzb = currentTimeMillis;
                    zzfsnVar.zze = 2;
                    if (mutex2.lock(null, zzfsnVar) != coroutine_suspended) {
                        j = currentTimeMillis;
                        zzfruVar = this.zzf;
                        if (zzfruVar == null) {
                        }
                        zzfruVar.zzo(j);
                        mutex.unlock(null);
                        zzfsnVar.zza = null;
                        zzfsnVar.zze = 3;
                    }
                    return coroutine_suspended;
                }
            }
            if (!this.zzg) {
            }
        } finally {
        }
        zzfsnVar = new zzfsn(this, continuation);
        Object obj2 = zzfsnVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfsnVar.zze;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0050, code lost:
    
        if (r2.lock(null, r0) != r1) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0056 A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #1 {all -> 0x011f, blocks: (B:58:0x0052, B:60:0x0056, B:64:0x005d), top: B:57:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzk(Continuation continuation) {
        zzftb zzftbVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzfru zzfruVar;
        zzfru zzfruVar2;
        zzfru zzfruVar3;
        try {
            if (continuation instanceof zzftb) {
                zzftbVar = (zzftb) continuation;
                int i2 = zzftbVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzftbVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzftbVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzftbVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzftbVar.zza = mutex;
                        zzftbVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j = zzftbVar.zzb;
                            mutex2 = (Mutex) zzftbVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzfruVar = this.zzf;
                                if (zzfruVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfruVar = null;
                                }
                                if (zzfruVar.zzr() > 0) {
                                    zzfru zzfruVar4 = this.zzf;
                                    if (zzfruVar4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzfruVar4 = null;
                                    }
                                    List zzq = zzfruVar4.zzq();
                                    Intrinsics.checkNotNullExpressionValue(zzq, "getAdClickTimestampsMsList(...)");
                                    Object last = CollectionsKt.last((List<? extends Object>) zzq);
                                    Intrinsics.checkNotNullExpressionValue(last, "last(...)");
                                    long longValue = j - ((Number) last).longValue();
                                    zzfru zzfruVar5 = this.zzf;
                                    if (zzfruVar5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzfruVar5 = null;
                                    }
                                    zzfruVar5.zzt();
                                    if (longValue < 5000) {
                                        zzfru zzfruVar6 = this.zzf;
                                        if (zzfruVar6 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                            zzfruVar6 = null;
                                        }
                                        zzfruVar6.zzd(zzfruVar6.zzc() + 1);
                                    }
                                }
                                zzfruVar2 = this.zzf;
                                if (zzfruVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfruVar2 = null;
                                }
                                if (zzfruVar2.zzn() > 0) {
                                    zzfru zzfruVar7 = this.zzf;
                                    if (zzfruVar7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzfruVar7 = null;
                                    }
                                    List zzm = zzfruVar7.zzm();
                                    Intrinsics.checkNotNullExpressionValue(zzm, "getAppBackgroundTimestampsMsList(...)");
                                    Object last2 = CollectionsKt.last((List<? extends Object>) zzm);
                                    Intrinsics.checkNotNullExpressionValue(last2, "last(...)");
                                    long longValue2 = j - ((Number) last2).longValue();
                                    zzfru zzfruVar8 = this.zzf;
                                    if (zzfruVar8 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzfruVar8 = null;
                                    }
                                    zzfruVar8.zzh(zzfruVar8.zzg() + longValue2);
                                }
                                zzfruVar3 = this.zzf;
                                if (zzfruVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfruVar3 = null;
                                }
                                zzfruVar3.zzp(j);
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } finally {
                            }
                        }
                        mutex = (Mutex) zzftbVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (this.zzg) {
                        return Unit.INSTANCE;
                    }
                    this.zzg = false;
                    Unit unit = Unit.INSTANCE;
                    mutex2.unlock(null);
                    Mutex mutex3 = this.zzb;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzftbVar.zza = mutex3;
                    zzftbVar.zzb = currentTimeMillis;
                    zzftbVar.zze = 2;
                    if (mutex3.lock(null, zzftbVar) != coroutine_suspended) {
                        mutex2 = mutex3;
                        j = currentTimeMillis;
                        zzfruVar = this.zzf;
                        if (zzfruVar == null) {
                        }
                        if (zzfruVar.zzr() > 0) {
                        }
                        zzfruVar2 = this.zzf;
                        if (zzfruVar2 == null) {
                        }
                        if (zzfruVar2.zzn() > 0) {
                        }
                        zzfruVar3 = this.zzf;
                        if (zzfruVar3 == null) {
                        }
                        zzfruVar3.zzp(j);
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            if (this.zzg) {
            }
        } finally {
        }
        zzftbVar = new zzftb(this, continuation);
        Object obj2 = zzftbVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzftbVar.zze;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f6, code lost:
    
        if (zzs(r14, r0) == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0064, code lost:
    
        if (r2.lock(null, r0) != r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006a A[Catch: all -> 0x0101, TRY_LEAVE, TryCatch #0 {all -> 0x0101, blocks: (B:52:0x0066, B:54:0x006a, B:58:0x0071), top: B:51:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(Continuation continuation) {
        zzfsv zzfsvVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzfru zzfruVar;
        zzfru zzfruVar2;
        zzfru zzfruVar3;
        zzfru zzfruVar4;
        zzfru zzfruVar5;
        zzfrv zzfrvVar;
        try {
            if (continuation instanceof zzfsv) {
                zzfsvVar = (zzfsv) continuation;
                int i2 = zzfsvVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfsvVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfsvVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfsvVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzb;
                        zzfsvVar.zza = mutex;
                        zzfsvVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                zzfrvVar = (zzfrv) zzfsvVar.zza;
                                ResultKt.throwOnFailure(obj);
                                if (this.zzi.zza(zzfrvVar)) {
                                    String zza = zzfrvVar.zza();
                                    Intrinsics.checkNotNullExpressionValue(zza, "getGwsQueryId(...)");
                                    zzfsvVar.zza = null;
                                    zzfsvVar.zze = 4;
                                }
                                return Unit.INSTANCE;
                            }
                            j = zzfsvVar.zzb;
                            mutex2 = (Mutex) zzfsvVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzfruVar = this.zzf;
                                if (zzfruVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfruVar = null;
                                }
                                zzfruVar2 = this.zzf;
                                if (zzfruVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfruVar2 = null;
                                }
                                long zzi = j - zzfruVar2.zzi();
                                zzfruVar3 = this.zzf;
                                if (zzfruVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfruVar3 = null;
                                }
                                zzfruVar.zzb(zzi - zzfruVar3.zzg());
                                zzfruVar4 = this.zzf;
                                if (zzfruVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfruVar4 = null;
                                }
                                zzfruVar4.zzl(j);
                                zzfruVar5 = this.zzf;
                                if (zzfruVar5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfruVar5 = null;
                                }
                                zzfrv zzfrvVar2 = (zzfrv) zzfruVar5.zzbu();
                                mutex.unlock(null);
                                Intrinsics.checkNotNull(zzfrvVar2);
                                zzfsvVar.zza = zzfrvVar2;
                                zzfsvVar.zze = 3;
                                if (zzv(zzfsvVar) != coroutine_suspended) {
                                    zzfrvVar = zzfrvVar2;
                                    if (this.zzi.zza(zzfrvVar)) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } finally {
                            }
                        }
                        mutex = (Mutex) zzfsvVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (this.zze) {
                        return Unit.INSTANCE;
                    }
                    this.zze = false;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    mutex2 = this.zzb;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzfsvVar.zza = mutex2;
                    zzfsvVar.zzb = currentTimeMillis;
                    zzfsvVar.zze = 2;
                    if (mutex2.lock(null, zzfsvVar) != coroutine_suspended) {
                        j = currentTimeMillis;
                        zzfruVar = this.zzf;
                        if (zzfruVar == null) {
                        }
                        zzfruVar2 = this.zzf;
                        if (zzfruVar2 == null) {
                        }
                        long zzi2 = j - zzfruVar2.zzi();
                        zzfruVar3 = this.zzf;
                        if (zzfruVar3 == null) {
                        }
                        zzfruVar.zzb(zzi2 - zzfruVar3.zzg());
                        zzfruVar4 = this.zzf;
                        if (zzfruVar4 == null) {
                        }
                        zzfruVar4.zzl(j);
                        zzfruVar5 = this.zzf;
                        if (zzfruVar5 == null) {
                        }
                        zzfrv zzfrvVar22 = (zzfrv) zzfruVar5.zzbu();
                        mutex.unlock(null);
                        Intrinsics.checkNotNull(zzfrvVar22);
                        zzfsvVar.zza = zzfrvVar22;
                        zzfsvVar.zze = 3;
                        if (zzv(zzfsvVar) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (this.zze) {
            }
        } finally {
        }
        zzfsvVar = new zzfsv(this, continuation);
        Object obj2 = zzfsvVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfsvVar.zze;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0100, code lost:
    
        if (zzs(r15, r0) == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0088, code lost:
    
        if (r2.lock(null, r0) != r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0064, code lost:
    
        if (r2.lock(null, r0) != r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006a A[Catch: all -> 0x010b, TRY_LEAVE, TryCatch #1 {all -> 0x010b, blocks: (B:55:0x0066, B:57:0x006a, B:61:0x0071), top: B:54:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(Continuation continuation) {
        zzfsz zzfszVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long currentTimeMillis;
        zzfrv zzfrvVar;
        try {
            if (continuation instanceof zzfsz) {
                zzfszVar = (zzfsz) continuation;
                int i2 = zzfszVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfszVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfszVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfszVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzb;
                        zzfszVar.zza = mutex;
                        zzfszVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                zzfrvVar = (zzfrv) zzfszVar.zza;
                                ResultKt.throwOnFailure(obj);
                                if (this.zzi.zza(zzfrvVar)) {
                                    String zza = zzfrvVar.zza();
                                    Intrinsics.checkNotNullExpressionValue(zza, "getGwsQueryId(...)");
                                    zzfszVar.zza = null;
                                    zzfszVar.zze = 4;
                                }
                                return Unit.INSTANCE;
                            }
                            currentTimeMillis = zzfszVar.zzb;
                            mutex2 = (Mutex) zzfszVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzfru zzfruVar = this.zzf;
                                if (zzfruVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfruVar = null;
                                }
                                zzfru zzfruVar2 = this.zzf;
                                if (zzfruVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfruVar2 = null;
                                }
                                long zzi = currentTimeMillis - zzfruVar2.zzi();
                                zzfru zzfruVar3 = this.zzf;
                                if (zzfruVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfruVar3 = null;
                                }
                                zzfruVar.zzb(zzi - zzfruVar3.zzg());
                                zzfru zzfruVar4 = this.zzf;
                                if (zzfruVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfruVar4 = null;
                                }
                                zzfruVar4.zzk(currentTimeMillis);
                                zzfru zzfruVar5 = this.zzf;
                                if (zzfruVar5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfruVar5 = null;
                                }
                                zzfruVar5.zze(true);
                                zzfru zzfruVar6 = this.zzf;
                                if (zzfruVar6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfruVar6 = null;
                                }
                                zzfrv zzfrvVar2 = (zzfrv) zzfruVar6.zzbu();
                                mutex2.unlock(null);
                                Intrinsics.checkNotNull(zzfrvVar2);
                                zzfszVar.zza = zzfrvVar2;
                                zzfszVar.zze = 3;
                                if (zzv(zzfszVar) != coroutine_suspended) {
                                    zzfrvVar = zzfrvVar2;
                                    if (this.zzi.zza(zzfrvVar)) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } finally {
                            }
                        }
                        mutex = (Mutex) zzfszVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (this.zze) {
                        return Unit.INSTANCE;
                    }
                    this.zze = false;
                    Unit unit = Unit.INSTANCE;
                    mutex2.unlock(null);
                    mutex2 = this.zzb;
                    currentTimeMillis = System.currentTimeMillis();
                    zzfszVar.zza = mutex2;
                    zzfszVar.zzb = currentTimeMillis;
                    zzfszVar.zze = 2;
                }
            }
            if (this.zze) {
            }
        } finally {
        }
        zzfszVar = new zzfsz(this, continuation);
        Object obj2 = zzfszVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfszVar.zze;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:11:0x004f, B:13:0x0053, B:14:0x0059), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzn(Continuation continuation) {
        zzfst zzfstVar;
        int i;
        Mutex mutex;
        long j;
        zzfru zzfruVar;
        try {
            if (continuation instanceof zzfst) {
                zzfstVar = (zzfst) continuation;
                int i2 = zzfstVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfstVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfstVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfstVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzb;
                        long currentTimeMillis = System.currentTimeMillis();
                        zzfstVar.zzb = mutex2;
                        zzfstVar.zza = currentTimeMillis;
                        zzfstVar.zze = 1;
                        if (mutex2.lock(null, zzfstVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                        j = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzfstVar.zza;
                        mutex = (Mutex) zzfstVar.zzb;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzfruVar = this.zzf;
                    if (zzfruVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfruVar = null;
                    }
                    zzfruVar.zzs(j);
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            zzfruVar = this.zzf;
            if (zzfruVar == null) {
            }
            zzfruVar.zzs(j);
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        zzfstVar = new zzfst(this, continuation);
        Object obj2 = zzfstVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfstVar.zze;
        if (i != 0) {
        }
    }
}
