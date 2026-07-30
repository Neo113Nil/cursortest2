package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes3.dex */
public final class MapsInitializer {
    private static final String zza = "MapsInitializer";
    private static boolean zzb = false;
    private static Renderer zzc = Renderer.LEGACY;

    public enum Renderer {
        LEGACY,
        LATEST
    }

    private MapsInitializer() {
    }

    public static synchronized int initialize(@NonNull Context context) {
        int initialize;
        synchronized (MapsInitializer.class) {
            initialize = initialize(context, null, null);
        }
        return initialize;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:11|12|13|14|15|16|(8:18|(1:(1:21))|22|23|(1:25)|26|27|(1:29))|34|22|23|(0)|26|27|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        android.util.Log.e(com.google.android.gms.maps.MapsInitializer.zza, "Failed to retrieve renderer type or log initialization.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f A[Catch: all -> 0x0024, RemoteException -> 0x0054, TryCatch #3 {RemoteException -> 0x0054, blocks: (B:23:0x0049, B:25:0x004f, B:26:0x0056), top: B:22:0x0049, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:12:0x0026, B:14:0x002a, B:16:0x0039, B:18:0x003e, B:23:0x0049, B:25:0x004f, B:26:0x0056, B:27:0x0065, B:29:0x0078, B:33:0x005e, B:37:0x0080, B:38:0x0085, B:41:0x0087), top: B:3:0x0003, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized int initialize(@NonNull Context context, @Nullable Renderer renderer, @Nullable OnMapsSdkInitializedCallback onMapsSdkInitializedCallback) {
        synchronized (MapsInitializer.class) {
            Preconditions.checkNotNull(context, "Context is null");
            Log.d(zza, "preferredRenderer: ".concat(String.valueOf(renderer)));
            if (!zzb) {
                try {
                    com.google.android.gms.maps.internal.zzf zza2 = zzcc.zza(context, renderer);
                    try {
                        CameraUpdateFactory.zza(zza2.zze());
                        BitmapDescriptorFactory.zza(zza2.zzj());
                        int i8 = 1;
                        zzb = true;
                        if (renderer != null) {
                            int ordinal = renderer.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    i8 = 2;
                                }
                            }
                            if (zza2.zzd() == 2) {
                                zzc = Renderer.LATEST;
                            }
                            zza2.zzl(ObjectWrapper.wrap(context), i8);
                            Log.d(zza, "loadedRenderer: ".concat(String.valueOf(zzc)));
                            if (onMapsSdkInitializedCallback != null) {
                                onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
                            }
                        }
                        i8 = 0;
                        if (zza2.zzd() == 2) {
                        }
                        zza2.zzl(ObjectWrapper.wrap(context), i8);
                        Log.d(zza, "loadedRenderer: ".concat(String.valueOf(zzc)));
                        if (onMapsSdkInitializedCallback != null) {
                        }
                    } catch (RemoteException e8) {
                        throw new RuntimeRemoteException(e8);
                    }
                } catch (GooglePlayServicesNotAvailableException e9) {
                    return e9.errorCode;
                }
            } else if (onMapsSdkInitializedCallback != null) {
                onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
            }
        }
        return 0;
    }
}
