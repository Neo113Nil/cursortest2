package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes2.dex */
public final class MapsInitializer {
    private static final String zza = "MapsInitializer";
    private static boolean zzb = false;
    private static Renderer zzc = Renderer.LEGACY;

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
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

    /* JADX WARN: Can't wrap try/catch for region: R(16:11|12|13|14|15|16|(10:18|(1:(1:21))|22|23|(1:25)|26|27|(1:29)|30|31)|35|22|23|(0)|26|27|(0)|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        android.util.Log.e(com.google.android.gms.maps.MapsInitializer.zza, "Failed to retrieve renderer type or log initialization.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[Catch: RemoteException -> 0x0066, all -> 0x009f, TryCatch #2 {RemoteException -> 0x0066, blocks: (B:23:0x0054, B:25:0x005a, B:26:0x005e), top: B:22:0x0054, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:7:0x0029, B:12:0x0030, B:14:0x0034, B:16:0x0043, B:18:0x0048, B:23:0x0054, B:25:0x005a, B:26:0x005e, B:27:0x006e, B:29:0x008c, B:34:0x0067, B:38:0x0094, B:39:0x0099, B:42:0x009b), top: B:3:0x0003, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized int initialize(Context context, Renderer renderer, OnMapsSdkInitializedCallback onMapsSdkInitializedCallback) {
        synchronized (MapsInitializer.class) {
            Preconditions.checkNotNull(context, "Context is null");
            String str = zza;
            String valueOf = String.valueOf(renderer);
            String.valueOf(valueOf).length();
            Log.d(str, "preferredRenderer: ".concat(String.valueOf(valueOf)));
            if (zzb) {
                if (onMapsSdkInitializedCallback != null) {
                    onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
                }
                return 0;
            }
            try {
                com.google.android.gms.maps.internal.zzf zza2 = zzca.zza(context, renderer);
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
                        String str2 = zza;
                        String valueOf2 = String.valueOf(zzc);
                        String.valueOf(valueOf2).length();
                        Log.d(str2, "loadedRenderer: ".concat(String.valueOf(valueOf2)));
                        if (onMapsSdkInitializedCallback != null) {
                            onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
                        }
                        return 0;
                    }
                    i = 0;
                    if (zza2.zzd() == 2) {
                    }
                    zza2.zzl(ObjectWrapper.wrap(context), i);
                    String str22 = zza;
                    String valueOf22 = String.valueOf(zzc);
                    String.valueOf(valueOf22).length();
                    Log.d(str22, "loadedRenderer: ".concat(String.valueOf(valueOf22)));
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
