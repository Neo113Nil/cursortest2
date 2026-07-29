package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzcp extends RegisterListenerMethod<zzaw, zzdi> {
    private final /* synthetic */ DriveResource zzfo;
    private final /* synthetic */ zzdi zzfp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcp(zzch zzchVar, ListenerHolder listenerHolder, DriveResource driveResource, zzdi zzdiVar) {
        super(listenerHolder);
        this.zzfo = driveResource;
        this.zzfp = zzdiVar;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    protected final /* synthetic */ void registerListener(zzaw zzawVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzee zzeeVar;
        zzeo zzeoVar = (zzeo) zzawVar.getService();
        zzj zzjVar = new zzj(1, this.zzfo.getDriveId());
        zzeeVar = this.zzfp.zzgf;
        zzeoVar.zza(zzjVar, zzeeVar, (String) null, new zzhl(taskCompletionSource));
    }
}
