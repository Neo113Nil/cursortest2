package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzfog implements Continuation {
    static final /* synthetic */ zzfog zza = new zzfog();

    private /* synthetic */ zzfog() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return new Boolean(task.isSuccessful());
    }
}
