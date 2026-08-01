package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes.dex */
public final class MapsInitializer {
    private static final String zza = "MapsInitializer";
    private static boolean zzb = false;
    private static Renderer zzc = Renderer.LEGACY;

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public enum Renderer {
        LEGACY,
        LATEST
    }

    private MapsInitializer() {
    }

    public static synchronized int initialize(Context context) {
        int initialize;
        synchronized (MapsInitializer.class) {
            initialize = initialize(context, null, null);
        }
        return initialize;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|16|17|(10:19|(1:(1:22))|23|24|(1:26)|27|28|(1:30)|31|32)|36|23|24|(0)|27|28|(0)|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        android.util.Log.e(com.google.android.gms.maps.MapsInitializer.zza, "Failed to retrieve renderer type or log initialization.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053 A[Catch: RemoteException -> 0x005f, all -> 0x0091, TryCatch #1 {RemoteException -> 0x005f, blocks: (B:24:0x004d, B:26:0x0053, B:27:0x0057), top: B:23:0x004d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[Catch: all -> 0x0091, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0022, B:12:0x0029, B:15:0x002d, B:17:0x003c, B:19:0x0041, B:24:0x004d, B:26:0x0053, B:27:0x0057, B:28:0x0067, B:30:0x007e, B:35:0x0060, B:39:0x0086, B:40:0x008b, B:42:0x008d), top: B:3:0x0003, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized int initialize(Context context, Renderer renderer, OnMapsSdkInitializedCallback onMapsSdkInitializedCallback) {
        synchronized (MapsInitializer.class) {
            Preconditions.checkNotNull(context, "Context is null");
            Log.d(zza, "preferredRenderer: ".concat(String.valueOf(String.valueOf(renderer))));
            if (zzb) {
                if (onMapsSdkInitializedCallback != null) {
                    onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
                }
                return 0;
            }
            try {
                com.google.android.gms.maps.internal.zzf zza2 = zzcc.zza(context, renderer);
                try {
                    CameraUpdateFactory.zza(zza2.zze());
                    BitmapDescriptorFactory.zza(zza2.zzj());
                    int i = 1;
                    zzb = true;
                    if (renderer != null) {
                        int ordinal = renderer.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                i = 2;
                            }
                        }
                        if (zza2.zzd() == 2) {
                            zzc = Renderer.LATEST;
                        }
                        zza2.zzl(ObjectWrapper.wrap(context), i);
                        Log.d(zza, "loadedRenderer: ".concat(String.valueOf(String.valueOf(zzc))));
                        if (onMapsSdkInitializedCallback != null) {
                            onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
                        }
                        return 0;
                    }
                    i = 0;
                    if (zza2.zzd() == 2) {
                    }
                    zza2.zzl(ObjectWrapper.wrap(context), i);
                    Log.d(zza, "loadedRenderer: ".concat(String.valueOf(String.valueOf(zzc))));
                    if (onMapsSdkInitializedCallback != null) {
                    }
                    return 0;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (GooglePlayServicesNotAvailableException e2) {
                return e2.errorCode;
            }
        }
    }
}
