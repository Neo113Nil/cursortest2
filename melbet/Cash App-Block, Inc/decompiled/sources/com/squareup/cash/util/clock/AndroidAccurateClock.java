package com.squareup.cash.util.clock;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.time.zzan;
import com.google.android.gms.internal.time.zzdg;
import com.google.android.gms.internal.time.zzhk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.time.TrustedTimeClient;
import com.google.android.gms.time.zzc;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class AndroidAccurateClock {
    public TrustedTimeClient _trustedTimeClient;
    public final Context context;

    public AndroidAccurateClock(Context context) {
        this.context = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: accurateTimestampOrNull-_x8W85U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3789accurateTimestampOrNull_x8W85U(ContinuationImpl continuationImpl) {
        AndroidAccurateClock$accurateTimestampOrNull$1 androidAccurateClock$accurateTimestampOrNull$1;
        int i;
        Long computeCurrentUnixEpochMillis;
        if (continuationImpl instanceof AndroidAccurateClock$accurateTimestampOrNull$1) {
            androidAccurateClock$accurateTimestampOrNull$1 = (AndroidAccurateClock$accurateTimestampOrNull$1) continuationImpl;
            int i2 = androidAccurateClock$accurateTimestampOrNull$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                androidAccurateClock$accurateTimestampOrNull$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = androidAccurateClock$accurateTimestampOrNull$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidAccurateClock$accurateTimestampOrNull$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    androidAccurateClock$accurateTimestampOrNull$1.label = 1;
                    obj = trustedTimeClient(androidAccurateClock$accurateTimestampOrNull$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                computeCurrentUnixEpochMillis = ((TrustedTimeClient) obj).computeCurrentUnixEpochMillis();
                if (computeCurrentUnixEpochMillis == null) {
                    return new AccurateClock$AccurateTimestamp(computeCurrentUnixEpochMillis.longValue());
                }
                return null;
            }
        }
        androidAccurateClock$accurateTimestampOrNull$1 = new AndroidAccurateClock$accurateTimestampOrNull$1(this, continuationImpl);
        Object obj3 = androidAccurateClock$accurateTimestampOrNull$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidAccurateClock$accurateTimestampOrNull$1.label;
        if (i != 0) {
        }
        computeCurrentUnixEpochMillis = ((TrustedTimeClient) obj3).computeCurrentUnixEpochMillis();
        if (computeCurrentUnixEpochMillis == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object trustedTimeClient(ContinuationImpl continuationImpl) {
        AndroidAccurateClock$trustedTimeClient$1 androidAccurateClock$trustedTimeClient$1;
        int i;
        Task task;
        if (continuationImpl instanceof AndroidAccurateClock$trustedTimeClient$1) {
            androidAccurateClock$trustedTimeClient$1 = (AndroidAccurateClock$trustedTimeClient$1) continuationImpl;
            int i2 = androidAccurateClock$trustedTimeClient$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                androidAccurateClock$trustedTimeClient$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = androidAccurateClock$trustedTimeClient$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidAccurateClock$trustedTimeClient$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    TrustedTimeClient trustedTimeClient = this._trustedTimeClient;
                    if (trustedTimeClient != null) {
                        return trustedTimeClient;
                    }
                    Context context = this.context;
                    zzan zzanVar = new zzan(context);
                    Context applicationContext = context.getApplicationContext();
                    synchronized (zzanVar.zzc) {
                        try {
                            if (zzanVar.zzd == null) {
                                zzanVar.zzd = zzanVar.zzb.zzb(zzanVar.zab).continueWithTask(zzhk.zza, new zzdg(3));
                            }
                            task = zzanVar.zzd;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Task continueWithTask = task.continueWithTask(zzhk.zza, new zzc(applicationContext, false));
                    continueWithTask.getClass();
                    androidAccurateClock$trustedTimeClient$1.label = 1;
                    obj = Okio.awaitImpl(continueWithTask, null, androidAccurateClock$trustedTimeClient$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                TrustedTimeClient trustedTimeClient2 = (TrustedTimeClient) obj;
                this._trustedTimeClient = trustedTimeClient2;
                obj.getClass();
                return trustedTimeClient2;
            }
        }
        androidAccurateClock$trustedTimeClient$1 = new AndroidAccurateClock$trustedTimeClient$1(this, continuationImpl);
        Object obj2 = androidAccurateClock$trustedTimeClient$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidAccurateClock$trustedTimeClient$1.label;
        if (i != 0) {
        }
        TrustedTimeClient trustedTimeClient22 = (TrustedTimeClient) obj2;
        this._trustedTimeClient = trustedTimeClient22;
        obj2.getClass();
        return trustedTimeClient22;
    }
}
