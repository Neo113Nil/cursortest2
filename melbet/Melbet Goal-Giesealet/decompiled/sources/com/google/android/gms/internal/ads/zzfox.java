package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfox {
    private final Context zza;
    private final Executor zzb;
    private final zzfoh zzc;
    private final zzfow zzd;
    private Task zze;

    zzfox(Context context, Executor executor, zzfoh zzfohVar, zzfoj zzfojVar, zzfot zzfotVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfohVar;
        this.zzd = zzfotVar;
    }

    public static zzfox zza(Context context, Executor executor, zzfoh zzfohVar, zzfoj zzfojVar) {
        final zzfox zzfoxVar = new zzfox(context, executor, zzfohVar, zzfojVar, new zzfot());
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzfov
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfox.this.zzc();
            }
        };
        Executor executor2 = zzfoxVar.zzb;
        zzfoxVar.zze = Tasks.call(executor2, callable).addOnFailureListener(executor2, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfou
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                zzfox.this.zzd(exc);
            }
        });
        return zzfoxVar;
    }

    public final zzast zzb() {
        zzfow zzfowVar = this.zzd;
        Task task = this.zze;
        return !task.isSuccessful() ? zzfowVar.zza() : (zzast) task.getResult();
    }

    final /* synthetic */ zzast zzc() {
        Context context = this.zza;
        return zzfoo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void zzd(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
