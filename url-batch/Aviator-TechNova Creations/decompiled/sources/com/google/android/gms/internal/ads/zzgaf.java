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

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgaf implements zzfyv {
    private final CoroutineScope zza;
    private final Mutex zzb;
    private final Mutex zzc;
    private final Mutex zzd;
    private boolean zze;
    private zzfyt zzf;
    private boolean zzg;
    private final DataStore zzh;
    private final zzdvj zzi;

    public zzgaf(DataStore adQualityDataStore, zzfzh coroutineScopeProvider, zzdvj dataPinger, zzfze clock) {
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
        zzfzk zzfzkVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        Object updateData;
        try {
            if (continuation instanceof zzfzk) {
                zzfzkVar = (zzfzk) continuation;
                int i2 = zzfzkVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfzkVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfzkVar.zzc;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfzkVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzd;
                        zzfzkVar.zza = str;
                        zzfzkVar.zzb = mutex;
                        zzfzkVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) zzfzkVar.zza;
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
                        Mutex mutex3 = (Mutex) zzfzkVar.zzb;
                        String str2 = (String) zzfzkVar.zza;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                        str = str2;
                    }
                    DataStore dataStore = this.zzh;
                    zzfzl zzfzlVar = new zzfzl(str, null);
                    zzfzkVar.zza = mutex;
                    zzfzkVar.zzb = null;
                    zzfzkVar.zze = 2;
                    updateData = dataStore.updateData(zzfzlVar, zzfzkVar);
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
            zzfzl zzfzlVar2 = new zzfzl(str, null);
            zzfzkVar.zza = mutex;
            zzfzkVar.zzb = null;
            zzfzkVar.zze = 2;
            updateData = dataStore2.updateData(zzfzlVar2, zzfzkVar);
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
        zzfzkVar = new zzfzk(this, continuation);
        Object obj2 = zzfzkVar.zzc;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfzkVar.zze;
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
        zzfzn zzfznVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        Object updateData;
        try {
            if (continuation instanceof zzfzn) {
                zzfznVar = (zzfzn) continuation;
                int i2 = zzfznVar.zzd;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfznVar.zzd = i2 - Integer.MIN_VALUE;
                    Object obj = zzfznVar.zzb;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfznVar.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzd;
                        zzfznVar.zza = mutex;
                        zzfznVar.zzd = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) zzfznVar.zza;
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
                        Mutex mutex3 = (Mutex) zzfznVar.zza;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    }
                    DataStore dataStore = this.zzh;
                    zzfzo zzfzoVar = new zzfzo(null);
                    zzfznVar.zza = mutex;
                    zzfznVar.zzd = 2;
                    updateData = dataStore.updateData(zzfzoVar, zzfznVar);
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
            zzfzo zzfzoVar2 = new zzfzo(null);
            zzfznVar.zza = mutex;
            zzfznVar.zzd = 2;
            updateData = dataStore2.updateData(zzfzoVar2, zzfznVar);
            if (updateData != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        zzfznVar = new zzfzn(this, continuation);
        Object obj2 = zzfznVar.zzb;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfznVar.zzd;
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
        zzfzm zzfzmVar;
        int i;
        Mutex mutex;
        zzfyt zzfytVar;
        zzfyt zzfytVar2;
        zzfyt zzfytVar3;
        try {
            if (continuation instanceof zzfzm) {
                zzfzmVar = (zzfzm) continuation;
                int i2 = zzfzmVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfzmVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfzmVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfzmVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzb;
                        zzfzmVar.zzb = mutex2;
                        zzfzmVar.zza = j;
                        zzfzmVar.zze = 1;
                        if (mutex2.lock(null, zzfzmVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzfzmVar.zza;
                        mutex = (Mutex) zzfzmVar.zzb;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzfytVar = this.zzf;
                    if (zzfytVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar = null;
                    }
                    zzfytVar2 = this.zzf;
                    if (zzfytVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar2 = null;
                    }
                    long zzi = j - zzfytVar2.zzi();
                    zzfytVar3 = this.zzf;
                    if (zzfytVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar3 = null;
                    }
                    zzfytVar.zzb(zzi - zzfytVar3.zzg());
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            zzfytVar = this.zzf;
            if (zzfytVar == null) {
            }
            zzfytVar2 = this.zzf;
            if (zzfytVar2 == null) {
            }
            long zzi2 = j - zzfytVar2.zzi();
            zzfytVar3 = this.zzf;
            if (zzfytVar3 == null) {
            }
            zzfytVar.zzb(zzi2 - zzfytVar3.zzg());
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        zzfzmVar = new zzfzm(this, continuation);
        Object obj2 = zzfzmVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfzmVar.zze;
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
        zzfzr zzfzrVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        zzfyt zzfytVar;
        Mutex mutex2;
        zzfyu zzfyuVar;
        Mutex mutex3;
        try {
            if (continuation instanceof zzfzr) {
                zzfzrVar = (zzfzr) continuation;
                int i2 = zzfzrVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfzrVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfzrVar.zzc;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfzrVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzb;
                        zzfzrVar.zza = mutex;
                        zzfzrVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex3 = (Mutex) zzfzrVar.zza;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    mutex3.unlock(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            mutex2 = (Mutex) zzfzrVar.zzb;
                            zzfyuVar = (zzfyu) zzfzrVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                DataStore dataStore = this.zzh;
                                zzfzs zzfzsVar = new zzfzs(zzfyuVar, null);
                                zzfzrVar.zza = mutex2;
                                zzfzrVar.zzb = null;
                                zzfzrVar.zze = 3;
                                obj = dataStore.updateData(zzfzsVar, zzfzrVar);
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
                        mutex = (Mutex) zzfzrVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzfytVar = this.zzf;
                    if (zzfytVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar = null;
                    }
                    zzfyu zzfyuVar2 = (zzfyu) zzfytVar.zzbu();
                    mutex.unlock(null);
                    Intrinsics.checkNotNull(zzfyuVar2);
                    mutex2 = this.zzd;
                    zzfzrVar.zza = zzfyuVar2;
                    zzfzrVar.zzb = mutex2;
                    zzfzrVar.zze = 2;
                    if (mutex2.lock(null, zzfzrVar) != coroutine_suspended) {
                        zzfyuVar = zzfyuVar2;
                        DataStore dataStore2 = this.zzh;
                        zzfzs zzfzsVar2 = new zzfzs(zzfyuVar, null);
                        zzfzrVar.zza = mutex2;
                        zzfzrVar.zzb = null;
                        zzfzrVar.zze = 3;
                        obj = dataStore2.updateData(zzfzsVar2, zzfzrVar);
                        if (obj != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            zzfytVar = this.zzf;
            if (zzfytVar == null) {
            }
            zzfyu zzfyuVar22 = (zzfyu) zzfytVar.zzbu();
            mutex.unlock(null);
            Intrinsics.checkNotNull(zzfyuVar22);
            mutex2 = this.zzd;
            zzfzrVar.zza = zzfyuVar22;
            zzfzrVar.zzb = mutex2;
            zzfzrVar.zze = 2;
            if (mutex2.lock(null, zzfzrVar) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } finally {
            mutex.unlock(null);
        }
        zzfzrVar = new zzfzr(this, continuation);
        Object obj2 = zzfzrVar.zzc;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfzrVar.zze;
        if (i != 0) {
        }
    }

    private static final boolean zzw(zzfyu zzfyuVar) {
        boolean z;
        List zzk = zzfyuVar.zzk();
        Long l = zzk != null ? (Long) CollectionsKt.lastOrNull(zzk) : null;
        boolean z2 = zzfyuVar.zzl() > zzfyuVar.zzm() && !zzfyuVar.zzd();
        if (l != null) {
            if (zzfyuVar.zzi() - l.longValue() > 5000) {
                z = true;
                return !z2 || z;
            }
        }
        z = false;
        if (z2) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zza() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzgaa(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzb(String gwsQueryId) {
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfzu(this, gwsQueryId, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzc() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfzq(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzd() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzgae(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zze() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfzy(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzf() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzgac(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzg() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzfzw(this, null), 3, null);
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
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzgaf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzh(Continuation continuation) {
        zzfzz zzfzzVar;
        ?? r2;
        Mutex mutex;
        try {
            if (continuation instanceof zzfzz) {
                zzfzzVar = (zzfzz) continuation;
                int i = zzfzzVar.zzd;
                if ((i & Integer.MIN_VALUE) != 0) {
                    zzfzzVar.zzd = i - Integer.MIN_VALUE;
                    Object obj = zzfzzVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = zzfzzVar.zzd;
                    if (r2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzd;
                        zzfzzVar.zza = mutex2;
                        zzfzzVar.zzd = 1;
                        if (mutex2.lock(null, zzfzzVar) != coroutine_suspended) {
                            mutex = mutex2;
                        }
                        return coroutine_suspended;
                    }
                    if (r2 == 1) {
                        Mutex mutex3 = (Mutex) zzfzzVar.zza;
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
                        Mutex mutex4 = (Mutex) zzfzzVar.zza;
                        ResultKt.throwOnFailure(obj);
                        r2 = mutex4;
                        zzfyy zzfyyVar = (zzfyy) obj;
                        if (zzfyyVar == null || zzfyyVar.zza() == 0) {
                            return Unit.INSTANCE;
                        }
                        for (Map.Entry entry : zzfyyVar.zzb().entrySet()) {
                            zzibl zzcc = ((zzfyu) entry.getValue()).zzcc();
                            Intrinsics.checkNotNullExpressionValue(zzcc, "toBuilder(...)");
                            zzfyt zzfytVar = (zzfyt) zzcc;
                            Object value = entry.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                            if (zzw((zzfyu) value)) {
                                zzfytVar.zzf(true);
                            }
                            zzdvj zzdvjVar = this.zzi;
                            zzibr zzbu = zzfytVar.zzbu();
                            Intrinsics.checkNotNullExpressionValue(zzbu, "build(...)");
                            zzdvjVar.zza((zzfyu) zzbu);
                        }
                        zzfzzVar.zza = null;
                        zzfzzVar.zzd = 3;
                    }
                    Flow data = this.zzh.getData();
                    zzfzzVar.zza = mutex;
                    zzfzzVar.zzd = 2;
                    obj = FlowKt.firstOrNull(data, zzfzzVar);
                    r2 = mutex;
                }
            }
            if (r2 != 0) {
            }
            Flow data2 = this.zzh.getData();
            zzfzzVar.zza = mutex;
            zzfzzVar.zzd = 2;
            obj = FlowKt.firstOrNull(data2, zzfzzVar);
            r2 = mutex;
        } finally {
            r2.unlock(null);
        }
        zzfzzVar = new zzfzz(this, continuation);
        Object obj2 = zzfzzVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = zzfzzVar.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:11:0x0057, B:13:0x005b, B:17:0x0061, B:19:0x0076, B:20:0x007c), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[Catch: all -> 0x0088, TRY_ENTER, TryCatch #0 {all -> 0x0088, blocks: (B:11:0x0057, B:13:0x005b, B:17:0x0061, B:19:0x0076, B:20:0x007c), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(String str, Continuation continuation) {
        zzfzt zzfztVar;
        int i;
        String str2;
        Mutex mutex;
        long j;
        try {
            if (continuation instanceof zzfzt) {
                zzfztVar = (zzfzt) continuation;
                int i2 = zzfztVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfztVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfztVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfztVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzb;
                        long currentTimeMillis = System.currentTimeMillis();
                        zzfztVar.zzf = str;
                        zzfztVar.zza = mutex2;
                        zzfztVar.zzb = currentTimeMillis;
                        zzfztVar.zze = 1;
                        if (mutex2.lock(null, zzfztVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        mutex = mutex2;
                        j = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzfztVar.zzb;
                        mutex = (Mutex) zzfztVar.zza;
                        str2 = zzfztVar.zzf;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (!this.zze) {
                        return Unit.INSTANCE;
                    }
                    this.zze = true;
                    zzibl zzcc = zzfyu.zzp().zzcc();
                    Intrinsics.checkNotNullExpressionValue(zzcc, "toBuilder(...)");
                    zzfyt zzfytVar = (zzfyt) zzcc;
                    this.zzf = zzfytVar;
                    if (zzfytVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar = null;
                    }
                    zzfytVar.zza(str2);
                    zzfytVar.zzj(j);
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            if (!this.zze) {
            }
        } finally {
            mutex.unlock(null);
        }
        zzfztVar = new zzfzt(this, continuation);
        Object obj2 = zzfztVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfztVar.zze;
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
        zzfzp zzfzpVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzfyt zzfytVar;
        try {
            if (continuation instanceof zzfzp) {
                zzfzpVar = (zzfzp) continuation;
                int i2 = zzfzpVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfzpVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfzpVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfzpVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzfzpVar.zza = mutex;
                        zzfzpVar.zze = 1;
                    } else if (i == 1) {
                        mutex = (Mutex) zzfzpVar.zza;
                        ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        j = zzfzpVar.zzb;
                        mutex2 = (Mutex) zzfzpVar.zza;
                        ResultKt.throwOnFailure(obj);
                        try {
                            zzfytVar = this.zzf;
                            if (zzfytVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                zzfytVar = null;
                            }
                            zzfytVar.zzo(j);
                            mutex.unlock(null);
                            zzfzpVar.zza = null;
                            zzfzpVar.zze = 3;
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
                        zzfzpVar.zze = 4;
                    }
                    if (!this.zzg) {
                        return Unit.INSTANCE;
                    }
                    this.zzg = true;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    mutex2 = this.zzb;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzfzpVar.zza = mutex2;
                    zzfzpVar.zzb = currentTimeMillis;
                    zzfzpVar.zze = 2;
                    if (mutex2.lock(null, zzfzpVar) != coroutine_suspended) {
                        j = currentTimeMillis;
                        zzfytVar = this.zzf;
                        if (zzfytVar == null) {
                        }
                        zzfytVar.zzo(j);
                        mutex.unlock(null);
                        zzfzpVar.zza = null;
                        zzfzpVar.zze = 3;
                    }
                    return coroutine_suspended;
                }
            }
            if (!this.zzg) {
            }
        } finally {
        }
        zzfzpVar = new zzfzp(this, continuation);
        Object obj2 = zzfzpVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfzpVar.zze;
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
        zzgad zzgadVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzfyt zzfytVar;
        zzfyt zzfytVar2;
        zzfyt zzfytVar3;
        try {
            if (continuation instanceof zzgad) {
                zzgadVar = (zzgad) continuation;
                int i2 = zzgadVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgadVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgadVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgadVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzgadVar.zza = mutex;
                        zzgadVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j = zzgadVar.zzb;
                            mutex2 = (Mutex) zzgadVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzfytVar = this.zzf;
                                if (zzfytVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfytVar = null;
                                }
                                if (zzfytVar.zzr() > 0) {
                                    zzfyt zzfytVar4 = this.zzf;
                                    if (zzfytVar4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzfytVar4 = null;
                                    }
                                    List zzq = zzfytVar4.zzq();
                                    Intrinsics.checkNotNullExpressionValue(zzq, "getAdClickTimestampsMsList(...)");
                                    Object last = CollectionsKt.last((List<? extends Object>) zzq);
                                    Intrinsics.checkNotNullExpressionValue(last, "last(...)");
                                    long longValue = j - ((Number) last).longValue();
                                    zzfyt zzfytVar5 = this.zzf;
                                    if (zzfytVar5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzfytVar5 = null;
                                    }
                                    zzfytVar5.zzt();
                                    if (longValue < 5000) {
                                        zzfyt zzfytVar6 = this.zzf;
                                        if (zzfytVar6 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                            zzfytVar6 = null;
                                        }
                                        zzfytVar6.zzd(zzfytVar6.zzc() + 1);
                                    }
                                }
                                zzfytVar2 = this.zzf;
                                if (zzfytVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfytVar2 = null;
                                }
                                if (zzfytVar2.zzn() > 0) {
                                    zzfyt zzfytVar7 = this.zzf;
                                    if (zzfytVar7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzfytVar7 = null;
                                    }
                                    List zzm = zzfytVar7.zzm();
                                    Intrinsics.checkNotNullExpressionValue(zzm, "getAppBackgroundTimestampsMsList(...)");
                                    Object last2 = CollectionsKt.last((List<? extends Object>) zzm);
                                    Intrinsics.checkNotNullExpressionValue(last2, "last(...)");
                                    long longValue2 = j - ((Number) last2).longValue();
                                    zzfyt zzfytVar8 = this.zzf;
                                    if (zzfytVar8 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzfytVar8 = null;
                                    }
                                    zzfytVar8.zzh(zzfytVar8.zzg() + longValue2);
                                }
                                zzfytVar3 = this.zzf;
                                if (zzfytVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfytVar3 = null;
                                }
                                zzfytVar3.zzp(j);
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } finally {
                            }
                        }
                        mutex = (Mutex) zzgadVar.zza;
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
                    zzgadVar.zza = mutex3;
                    zzgadVar.zzb = currentTimeMillis;
                    zzgadVar.zze = 2;
                    if (mutex3.lock(null, zzgadVar) != coroutine_suspended) {
                        mutex2 = mutex3;
                        j = currentTimeMillis;
                        zzfytVar = this.zzf;
                        if (zzfytVar == null) {
                        }
                        if (zzfytVar.zzr() > 0) {
                        }
                        zzfytVar2 = this.zzf;
                        if (zzfytVar2 == null) {
                        }
                        if (zzfytVar2.zzn() > 0) {
                        }
                        zzfytVar3 = this.zzf;
                        if (zzfytVar3 == null) {
                        }
                        zzfytVar3.zzp(j);
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
        zzgadVar = new zzgad(this, continuation);
        Object obj2 = zzgadVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgadVar.zze;
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
        zzfzx zzfzxVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzfyt zzfytVar;
        zzfyt zzfytVar2;
        zzfyt zzfytVar3;
        zzfyt zzfytVar4;
        zzfyt zzfytVar5;
        zzfyu zzfyuVar;
        try {
            if (continuation instanceof zzfzx) {
                zzfzxVar = (zzfzx) continuation;
                int i2 = zzfzxVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfzxVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfzxVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfzxVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzb;
                        zzfzxVar.zza = mutex;
                        zzfzxVar.zze = 1;
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
                                zzfyuVar = (zzfyu) zzfzxVar.zza;
                                ResultKt.throwOnFailure(obj);
                                if (this.zzi.zza(zzfyuVar)) {
                                    String zza = zzfyuVar.zza();
                                    Intrinsics.checkNotNullExpressionValue(zza, "getGwsQueryId(...)");
                                    zzfzxVar.zza = null;
                                    zzfzxVar.zze = 4;
                                }
                                return Unit.INSTANCE;
                            }
                            j = zzfzxVar.zzb;
                            mutex2 = (Mutex) zzfzxVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzfytVar = this.zzf;
                                if (zzfytVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfytVar = null;
                                }
                                zzfytVar2 = this.zzf;
                                if (zzfytVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfytVar2 = null;
                                }
                                long zzi = j - zzfytVar2.zzi();
                                zzfytVar3 = this.zzf;
                                if (zzfytVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfytVar3 = null;
                                }
                                zzfytVar.zzb(zzi - zzfytVar3.zzg());
                                zzfytVar4 = this.zzf;
                                if (zzfytVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfytVar4 = null;
                                }
                                zzfytVar4.zzl(j);
                                zzfytVar5 = this.zzf;
                                if (zzfytVar5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfytVar5 = null;
                                }
                                zzfyu zzfyuVar2 = (zzfyu) zzfytVar5.zzbu();
                                mutex.unlock(null);
                                Intrinsics.checkNotNull(zzfyuVar2);
                                zzfzxVar.zza = zzfyuVar2;
                                zzfzxVar.zze = 3;
                                if (zzv(zzfzxVar) != coroutine_suspended) {
                                    zzfyuVar = zzfyuVar2;
                                    if (this.zzi.zza(zzfyuVar)) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } finally {
                            }
                        }
                        mutex = (Mutex) zzfzxVar.zza;
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
                    zzfzxVar.zza = mutex2;
                    zzfzxVar.zzb = currentTimeMillis;
                    zzfzxVar.zze = 2;
                    if (mutex2.lock(null, zzfzxVar) != coroutine_suspended) {
                        j = currentTimeMillis;
                        zzfytVar = this.zzf;
                        if (zzfytVar == null) {
                        }
                        zzfytVar2 = this.zzf;
                        if (zzfytVar2 == null) {
                        }
                        long zzi2 = j - zzfytVar2.zzi();
                        zzfytVar3 = this.zzf;
                        if (zzfytVar3 == null) {
                        }
                        zzfytVar.zzb(zzi2 - zzfytVar3.zzg());
                        zzfytVar4 = this.zzf;
                        if (zzfytVar4 == null) {
                        }
                        zzfytVar4.zzl(j);
                        zzfytVar5 = this.zzf;
                        if (zzfytVar5 == null) {
                        }
                        zzfyu zzfyuVar22 = (zzfyu) zzfytVar5.zzbu();
                        mutex.unlock(null);
                        Intrinsics.checkNotNull(zzfyuVar22);
                        zzfzxVar.zza = zzfyuVar22;
                        zzfzxVar.zze = 3;
                        if (zzv(zzfzxVar) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (this.zze) {
            }
        } finally {
        }
        zzfzxVar = new zzfzx(this, continuation);
        Object obj2 = zzfzxVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfzxVar.zze;
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
        zzgab zzgabVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long currentTimeMillis;
        zzfyu zzfyuVar;
        try {
            if (continuation instanceof zzgab) {
                zzgabVar = (zzgab) continuation;
                int i2 = zzgabVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgabVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgabVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgabVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzb;
                        zzgabVar.zza = mutex;
                        zzgabVar.zze = 1;
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
                                zzfyuVar = (zzfyu) zzgabVar.zza;
                                ResultKt.throwOnFailure(obj);
                                if (this.zzi.zza(zzfyuVar)) {
                                    String zza = zzfyuVar.zza();
                                    Intrinsics.checkNotNullExpressionValue(zza, "getGwsQueryId(...)");
                                    zzgabVar.zza = null;
                                    zzgabVar.zze = 4;
                                }
                                return Unit.INSTANCE;
                            }
                            currentTimeMillis = zzgabVar.zzb;
                            mutex2 = (Mutex) zzgabVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzfyt zzfytVar = this.zzf;
                                if (zzfytVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfytVar = null;
                                }
                                zzfyt zzfytVar2 = this.zzf;
                                if (zzfytVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfytVar2 = null;
                                }
                                long zzi = currentTimeMillis - zzfytVar2.zzi();
                                zzfyt zzfytVar3 = this.zzf;
                                if (zzfytVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfytVar3 = null;
                                }
                                zzfytVar.zzb(zzi - zzfytVar3.zzg());
                                zzfyt zzfytVar4 = this.zzf;
                                if (zzfytVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfytVar4 = null;
                                }
                                zzfytVar4.zzk(currentTimeMillis);
                                zzfyt zzfytVar5 = this.zzf;
                                if (zzfytVar5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfytVar5 = null;
                                }
                                zzfytVar5.zze(true);
                                zzfyt zzfytVar6 = this.zzf;
                                if (zzfytVar6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzfytVar6 = null;
                                }
                                zzfyu zzfyuVar2 = (zzfyu) zzfytVar6.zzbu();
                                mutex2.unlock(null);
                                Intrinsics.checkNotNull(zzfyuVar2);
                                zzgabVar.zza = zzfyuVar2;
                                zzgabVar.zze = 3;
                                if (zzv(zzgabVar) != coroutine_suspended) {
                                    zzfyuVar = zzfyuVar2;
                                    if (this.zzi.zza(zzfyuVar)) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } finally {
                            }
                        }
                        mutex = (Mutex) zzgabVar.zza;
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
                    zzgabVar.zza = mutex2;
                    zzgabVar.zzb = currentTimeMillis;
                    zzgabVar.zze = 2;
                }
            }
            if (this.zze) {
            }
        } finally {
        }
        zzgabVar = new zzgab(this, continuation);
        Object obj2 = zzgabVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgabVar.zze;
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
        zzfzv zzfzvVar;
        int i;
        Mutex mutex;
        long j;
        zzfyt zzfytVar;
        try {
            if (continuation instanceof zzfzv) {
                zzfzvVar = (zzfzv) continuation;
                int i2 = zzfzvVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzfzvVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzfzvVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzfzvVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzb;
                        long currentTimeMillis = System.currentTimeMillis();
                        zzfzvVar.zzb = mutex2;
                        zzfzvVar.zza = currentTimeMillis;
                        zzfzvVar.zze = 1;
                        if (mutex2.lock(null, zzfzvVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                        j = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzfzvVar.zza;
                        mutex = (Mutex) zzfzvVar.zzb;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzfytVar = this.zzf;
                    if (zzfytVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzfytVar = null;
                    }
                    zzfytVar.zzs(j);
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            zzfytVar = this.zzf;
            if (zzfytVar == null) {
            }
            zzfytVar.zzs(j);
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        zzfzvVar = new zzfzv(this, continuation);
        Object obj2 = zzfzvVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzfzvVar.zze;
        if (i != 0) {
        }
    }
}
