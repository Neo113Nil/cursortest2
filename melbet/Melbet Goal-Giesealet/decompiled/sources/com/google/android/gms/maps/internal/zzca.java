package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzca {
    private static final String zza = "zzca";
    private static Context zzb;
    private static zzf zzc;

    public static zzf zza(Context context, MapsInitializer.Renderer renderer) throws GooglePlayServicesNotAvailableException {
        zzf zzeVar;
        Preconditions.checkNotNull(context);
        String str = zza;
        String valueOf = String.valueOf(renderer);
        String.valueOf(valueOf).length();
        Log.d(str, "preferredRenderer: ".concat(String.valueOf(valueOf)));
        zzf zzfVar = zzc;
        if (zzfVar != null) {
            return zzfVar;
        }
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
        if (isGooglePlayServicesAvailable != 0) {
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
        Log.i(str, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) zzd(((ClassLoader) Preconditions.checkNotNull(zzc(context, renderer).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                zzeVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                zzeVar = queryLocalInterface instanceof zzf ? (zzf) queryLocalInterface : new zze(iBinder);
            }
            zzc = zzeVar;
            try {
                Context zzc2 = zzc(context, renderer);
                zzc2.getClass();
                zzeVar.zzk(ObjectWrapper.wrap(zzc2.getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                return zzc;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } catch (ClassNotFoundException unused) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
        }
    }

    private static Context zzb(Exception exc, Context context) {
        Log.e(zza, "Failed to load maps module, use pre-Chimera", exc);
        return GooglePlayServicesUtil.getRemoteContext(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(6:5|(2:7|(1:9))(1:25)|10|11|12|13)|26|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r3.equals("com.google.android.gms.maps_dynamite") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r2 = zzb(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        android.util.Log.d(com.google.android.gms.maps.internal.zzca.zza, "Attempting to load maps_dynamite again.");
        r2 = com.google.android.gms.dynamite.DynamiteModule.load(r2, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        r2 = zzb(r3, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Context zzc(Context context, MapsInitializer.Renderer renderer) {
        String str;
        Context context2 = zzb;
        if (context2 != null) {
            return context2;
        }
        context.getApplicationContext();
        if (renderer != null) {
            int ordinal = renderer.ordinal();
            if (ordinal == 0) {
                str = "com.google.android.gms.maps_legacy_dynamite";
            } else if (ordinal == 1) {
                str = "com.google.android.gms.maps_core_dynamite";
            }
            Context zzb2 = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, str).getModuleContext();
            zzb = zzb2;
            return zzb2;
        }
        str = "com.google.android.gms.maps_dynamite";
        Context zzb22 = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, str).getModuleContext();
        zzb = zzb22;
        return zzb22;
    }

    private static <T> T zzd(Class cls) {
        try {
            return (T) cls.newInstance();
        } catch (IllegalAccessException unused) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf.length() != 0 ? "Unable to call the default constructor of ".concat(valueOf) : new String("Unable to call the default constructor of "));
        } catch (InstantiationException unused2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new IllegalStateException(valueOf2.length() != 0 ? "Unable to instantiate the dynamic class ".concat(valueOf2) : new String("Unable to instantiate the dynamic class "));
        }
    }
}
