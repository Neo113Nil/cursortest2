package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzdu extends GmsClient {
    public static final /* synthetic */ int zze = 0;
    private final SimpleArrayMap zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;
    private final SimpleArrayMap zzi;

    public zzdu(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzf = new SimpleArrayMap();
        this.zzg = new SimpleArrayMap();
        this.zzh = new SimpleArrayMap();
        this.zzi = new SimpleArrayMap();
    }

    private final boolean zzG(Feature feature) {
        Feature feature2;
        Feature[] availableFeatures = getAvailableFeatures();
        if (availableFeatures != null) {
            int i8 = 0;
            while (true) {
                if (i8 >= availableFeatures.length) {
                    feature2 = null;
                    break;
                }
                feature2 = availableFeatures[i8];
                if (feature.getName().equals(feature2.getName())) {
                    break;
                }
                i8++;
            }
            if (feature2 != null && feature2.getVersion() >= feature.getVersion()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof zzv ? (zzv) queryLocalInterface : new zzu(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return com.google.android.gms.location.zzo.zzo;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i8) {
        super.onConnectionSuspended(i8);
        synchronized (this.zzf) {
            this.zzf.clear();
        }
        synchronized (this.zzg) {
            this.zzg.clear();
        }
        synchronized (this.zzh) {
            this.zzh.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(Location location, TaskCompletionSource taskCompletionSource) {
        if (zzG(com.google.android.gms.location.zzo.zzh)) {
            ((zzv) getService()).zzB(location, new zzde(null, taskCompletionSource));
        } else {
            ((zzv) getService()).zzA(location);
            taskCompletionSource.setResult(null);
        }
    }

    public final void zzB(TaskCompletionSource taskCompletionSource) {
        ((zzv) getService()).zzC(new zzdi(null, taskCompletionSource));
    }

    public final void zzC(ListenerHolder listenerHolder, DeviceOrientationRequest deviceOrientationRequest, TaskCompletionSource taskCompletionSource) {
        ListenerHolder.ListenerKey listenerKey = listenerHolder.getListenerKey();
        Objects.requireNonNull(listenerKey);
        synchronized (this.zzh) {
            try {
                zzdl zzdlVar = (zzdl) this.zzh.get(listenerKey);
                if (zzdlVar == null) {
                    zzdlVar = new zzdl(listenerHolder);
                    this.zzh.put(listenerKey, zzdlVar);
                } else {
                    zzdlVar.zzc(listenerHolder);
                }
                ((zzv) getService()).zzF(new zzj(1, new zzh(deviceOrientationRequest, zzh.zza, null), zzdlVar, new zzdi(null, taskCompletionSource)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzD(ListenerHolder.ListenerKey listenerKey, TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzh) {
            try {
                zzdl zzdlVar = (zzdl) this.zzh.remove(listenerKey);
                if (zzdlVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                } else {
                    zzdlVar.zze();
                    ((zzv) getService()).zzF(new zzj(2, null, zzdlVar, new zzdi(Boolean.TRUE, taskCompletionSource)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzE(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) {
        if (zzG(com.google.android.gms.location.zzo.zzn)) {
            ((zzv) getService()).zze(geofencingRequest, pendingIntent, new zzde(null, taskCompletionSource));
        } else {
            ((zzv) getService()).zzd(geofencingRequest, pendingIntent, new zzdb(taskCompletionSource));
        }
    }

    public final void zzF(zzeh zzehVar, TaskCompletionSource taskCompletionSource) {
        if (zzG(com.google.android.gms.location.zzo.zzn)) {
            ((zzv) getService()).zzg(zzehVar, new zzde(null, taskCompletionSource));
        } else {
            ((zzv) getService()).zzf(zzehVar, new zzdb(taskCompletionSource));
        }
    }

    public final void zzp(com.google.android.gms.location.zzad zzadVar, TaskCompletionSource taskCompletionSource) {
        if (zzG(com.google.android.gms.location.zzo.zzj)) {
            ((zzv) getService()).zzo(zzadVar, new zzdz(5, null, new zzdg(taskCompletionSource), null, null));
        } else {
            taskCompletionSource.setResult(((zzv) getService()).zzp(getContext().getPackageName()));
        }
    }

    public final void zzq(LastLocationRequest lastLocationRequest, TaskCompletionSource taskCompletionSource) {
        if (zzG(com.google.android.gms.location.zzo.zzj)) {
            ((zzv) getService()).zzq(lastLocationRequest, zzdz.zzd(new zzdf(taskCompletionSource)));
        } else if (zzG(com.google.android.gms.location.zzo.zzf)) {
            ((zzv) getService()).zzr(lastLocationRequest, new zzdf(taskCompletionSource));
        } else {
            taskCompletionSource.setResult(((zzv) getService()).zzs());
        }
    }

    public final void zzr(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken, final TaskCompletionSource taskCompletionSource) {
        if (zzG(com.google.android.gms.location.zzo.zzj)) {
            final ICancelToken zzt = ((zzv) getService()).zzt(currentLocationRequest, zzdz.zzd(new zzdf(taskCompletionSource)));
            if (cancellationToken != null) {
                cancellationToken.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzdy
                    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                    public final /* synthetic */ void onCanceled() {
                        int i8 = zzdu.zze;
                        try {
                            ICancelToken.this.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        if (zzG(com.google.android.gms.location.zzo.zze)) {
            final ICancelToken zzu = ((zzv) getService()).zzu(currentLocationRequest, new zzdf(taskCompletionSource));
            if (cancellationToken != null) {
                cancellationToken.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzdw
                    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                    public final /* synthetic */ void onCanceled() {
                        int i8 = zzdu.zze;
                        try {
                            ICancelToken.this.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(new zzdc(this, taskCompletionSource), zzex.zza(), "GetCurrentLocation");
        final ListenerHolder.ListenerKey listenerKey = createListenerHolder.getListenerKey();
        Objects.requireNonNull(listenerKey);
        zzdd zzddVar = new zzdd(this, createListenerHolder, taskCompletionSource);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        LocationRequest.Builder builder = new LocationRequest.Builder(currentLocationRequest.getPriority(), 0L);
        builder.setMinUpdateIntervalMillis(0L);
        builder.setDurationMillis(currentLocationRequest.getDurationMillis());
        builder.setGranularity(currentLocationRequest.getGranularity());
        builder.setMaxUpdateAgeMillis(currentLocationRequest.getMaxUpdateAgeMillis());
        builder.zzb(currentLocationRequest.zza());
        builder.zza(currentLocationRequest.zzb());
        builder.setWaitForAccurateLocation(true);
        builder.zzc(currentLocationRequest.zzc());
        zzt(zzddVar, builder.build(), taskCompletionSource2);
        taskCompletionSource2.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzdv
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                int i8 = zzdu.zze;
                if (task.isSuccessful()) {
                    return;
                }
                TaskCompletionSource taskCompletionSource3 = TaskCompletionSource.this;
                Exception exception = task.getException();
                Objects.requireNonNull(exception);
                taskCompletionSource3.trySetException(exception);
            }
        });
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.gms.internal.location.zzdx
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    try {
                        zzdu.this.zzw(listenerKey, true, new TaskCompletionSource());
                    } catch (RemoteException unused) {
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:10:0x003f, B:11:0x0075, B:15:0x0056, B:16:0x0030), top: B:3:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:10:0x003f, B:11:0x0075, B:15:0x0056, B:16:0x0030), top: B:3:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzs(zzdm zzdmVar, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) {
        zzdt zzdtVar;
        ListenerHolder zza = zzdmVar.zza();
        ListenerHolder.ListenerKey listenerKey = zza.getListenerKey();
        Objects.requireNonNull(listenerKey);
        boolean zzG = zzG(com.google.android.gms.location.zzo.zzj);
        synchronized (this.zzf) {
            try {
                zzdt zzdtVar2 = (zzdt) this.zzf.get(listenerKey);
                if (zzdtVar2 != null && !zzG) {
                    zzdtVar2.zzc(zza);
                    zzdtVar = zzdtVar2;
                    zzdtVar2 = null;
                    if (zzG) {
                        ((zzv) getService()).zzv(new zzed(1, zzeb.zza(null, locationRequest), zzdtVar, null, null, new zzdj(taskCompletionSource, zzdtVar), listenerKey.toIdString()));
                    } else {
                        ((zzv) getService()).zzw(zzdz.zza(zzdtVar2, zzdtVar, listenerKey.toIdString()), locationRequest, new zzde(null, taskCompletionSource));
                    }
                }
                zzdt zzdtVar3 = new zzdt(zzdmVar);
                this.zzf.put(listenerKey, zzdtVar3);
                zzdtVar = zzdtVar3;
                if (zzG) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:10:0x003f, B:11:0x0075, B:15:0x0056, B:16:0x0030), top: B:3:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:10:0x003f, B:11:0x0075, B:15:0x0056, B:16:0x0030), top: B:3:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzt(zzdm zzdmVar, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) {
        zzdq zzdqVar;
        ListenerHolder zza = zzdmVar.zza();
        ListenerHolder.ListenerKey listenerKey = zza.getListenerKey();
        Objects.requireNonNull(listenerKey);
        boolean zzG = zzG(com.google.android.gms.location.zzo.zzj);
        synchronized (this.zzg) {
            try {
                zzdq zzdqVar2 = (zzdq) this.zzg.get(listenerKey);
                if (zzdqVar2 != null && !zzG) {
                    zzdqVar2.zzc(zza);
                    zzdqVar = zzdqVar2;
                    zzdqVar2 = null;
                    if (zzG) {
                        ((zzv) getService()).zzv(new zzed(1, zzeb.zza(null, locationRequest), null, zzdqVar, null, new zzcy(taskCompletionSource, zzdqVar), listenerKey.toIdString()));
                    } else {
                        ((zzv) getService()).zzw(zzdz.zzb(zzdqVar2, zzdqVar, listenerKey.toIdString()), locationRequest, new zzde(null, taskCompletionSource));
                    }
                }
                zzdq zzdqVar3 = new zzdq(zzdmVar);
                this.zzg.put(listenerKey, zzdqVar3);
                zzdqVar = zzdqVar3;
                if (zzG) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzu(PendingIntent pendingIntent, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) {
        if (zzG(com.google.android.gms.location.zzo.zzj)) {
            ((zzv) getService()).zzw(zzdz.zzc(pendingIntent), locationRequest, new zzde(null, taskCompletionSource));
            return;
        }
        zzv zzvVar = (zzv) getService();
        zzeb zza = zzeb.zza(null, locationRequest);
        zzdi zzdiVar = new zzdi(null, taskCompletionSource);
        int hashCode = pendingIntent.hashCode();
        StringBuilder sb = new StringBuilder(String.valueOf(hashCode).length() + 14);
        sb.append("PendingIntent@");
        sb.append(hashCode);
        zzvVar.zzv(new zzed(1, zza, null, null, pendingIntent, zzdiVar, sb.toString()));
    }

    public final void zzv(ListenerHolder.ListenerKey listenerKey, boolean z7, TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzf) {
            try {
                zzdt zzdtVar = (zzdt) this.zzf.remove(listenerKey);
                if (zzdtVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                zzdtVar.zzf();
                if (!z7) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                } else if (zzG(com.google.android.gms.location.zzo.zzj)) {
                    zzv zzvVar = (zzv) getService();
                    int identityHashCode = System.identityHashCode(zzdtVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(identityHashCode).length() + 18);
                    sb.append("ILocationListener@");
                    sb.append(identityHashCode);
                    zzvVar.zzx(zzdz.zza(null, zzdtVar, sb.toString()), new zzde(Boolean.TRUE, taskCompletionSource));
                } else {
                    ((zzv) getService()).zzv(new zzed(2, null, zzdtVar, null, null, new zzdi(Boolean.TRUE, taskCompletionSource), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzw(ListenerHolder.ListenerKey listenerKey, boolean z7, TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            try {
                zzdq zzdqVar = (zzdq) this.zzg.remove(listenerKey);
                if (zzdqVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                zzdqVar.zzg();
                if (!z7) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                } else if (zzG(com.google.android.gms.location.zzo.zzj)) {
                    zzv zzvVar = (zzv) getService();
                    int identityHashCode = System.identityHashCode(zzdqVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(identityHashCode).length() + 18);
                    sb.append("ILocationCallback@");
                    sb.append(identityHashCode);
                    zzvVar.zzx(zzdz.zzb(null, zzdqVar, sb.toString()), new zzde(Boolean.TRUE, taskCompletionSource));
                } else {
                    ((zzv) getService()).zzv(new zzed(2, null, null, zzdqVar, null, new zzdi(Boolean.TRUE, taskCompletionSource), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzx(PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource, Object obj) {
        if (zzG(com.google.android.gms.location.zzo.zzj)) {
            ((zzv) getService()).zzx(zzdz.zzc(pendingIntent), new zzde(null, taskCompletionSource));
        } else {
            ((zzv) getService()).zzv(new zzed(2, null, null, null, pendingIntent, new zzdi(null, taskCompletionSource), null));
        }
    }

    public final void zzy(TaskCompletionSource taskCompletionSource) {
        if (zzG(com.google.android.gms.location.zzo.zzg)) {
            ((zzv) getService()).zzz(true, new zzde(null, taskCompletionSource));
        } else {
            ((zzv) getService()).zzy(true);
            taskCompletionSource.setResult(null);
        }
    }

    public final void zzz(TaskCompletionSource taskCompletionSource) {
        if (zzG(com.google.android.gms.location.zzo.zzg)) {
            ((zzv) getService()).zzz(false, new zzde(Boolean.TRUE, taskCompletionSource));
        } else {
            ((zzv) getService()).zzy(false);
            taskCompletionSource.setResult(Boolean.TRUE);
        }
    }
}
