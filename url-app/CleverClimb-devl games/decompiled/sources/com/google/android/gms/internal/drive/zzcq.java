package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzcq extends UnregisterListenerMethod<zzaw, zzdi> {
    private final /* synthetic */ DriveResource zzfo;
    private final /* synthetic */ zzdi zzfp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcq(zzch zzchVar, ListenerHolder.ListenerKey listenerKey, DriveResource driveResource, zzdi zzdiVar) {
        super(listenerKey);
        this.zzfo = driveResource;
        this.zzfp = zzdiVar;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    protected final /* synthetic */ void unregisterListener(zzaw zzawVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzee zzeeVar;
        zzeo zzeoVar = (zzeo) zzawVar.getService();
        zzgm zzgmVar = new zzgm(this.zzfo.getDriveId(), 1);
        zzeeVar = this.zzfp.zzgf;
        zzeoVar.zza(zzgmVar, zzeeVar, (String) null, new zzhk(taskCompletionSource));
    }
}
