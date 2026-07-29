package com.google.android.gms.internal.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.drive.CreateFileActivityOptions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzbg extends TaskApiCall<zzaw, IntentSender> {
    private final /* synthetic */ CreateFileActivityOptions zzep;

    zzbg(zzbb zzbbVar, CreateFileActivityOptions createFileActivityOptions) {
        this.zzep = createFileActivityOptions;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(zzaw zzawVar, TaskCompletionSource<IntentSender> taskCompletionSource) throws RemoteException {
        zzaw zzawVar2 = zzawVar;
        zzeo zzeoVar = (zzeo) zzawVar2.getService();
        this.zzep.zzdc.zza(zzawVar2.getContext());
        taskCompletionSource.setResult(zzeoVar.zza(new zzu(this.zzep.zzdc, this.zzep.zzdi.intValue(), this.zzep.zzay, this.zzep.zzbb, Integer.valueOf(this.zzep.zzdj))));
    }
}
