package com.google.android.gms.maps.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzcc {
    private static final String zza = "zzcc";

    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    private static Context zzb;
    private static zzf zzc;

    public static zzf zza(Context context, @Nullable MapsInitializer.Renderer renderer) {
        Preconditions.checkNotNull(context);
        Log.d(zza, "preferredRenderer: ".concat(String.valueOf(renderer)));
        zzf zzfVar = zzc;
        if (zzfVar != null) {
            return zzfVar;
        }
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
        if (isGooglePlayServicesAvailable != 0) {
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
        zzf zzd = zzd(context, renderer);
        zzc = zzd;
        try {
            if (zzd.zzd() == 2) {
                try {
                    zzc.zzm(ObjectWrapper.wrap(zzc(context, renderer)));
                } catch (RemoteException e8) {
                    throw new RuntimeRemoteException(e8);
                } catch (UnsatisfiedLinkError unused) {
                    Log.w(zza, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    zzb = null;
                    zzc = zzd(context, MapsInitializer.Renderer.LEGACY);
                }
            }
            try {
                zzf zzfVar2 = zzc;
                Context zzc2 = zzc(context, renderer);
                Objects.requireNonNull(zzc2);
                zzfVar2.zzk(ObjectWrapper.wrap(zzc2.getResources()), 19000000);
                return zzc;
            } catch (RemoteException e9) {
                throw new RuntimeRemoteException(e9);
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    private static Context zzb(Exception exc, Context context) {
        Log.e(zza, "Failed to load maps module, use pre-Chimera", exc);
        return GooglePlayServicesUtil.getRemoteContext(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:5|6)|(6:8|(1:10)|13|14|15|16)|27|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r5 != 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        r0 = "com.google.android.gms.maps_core_dynamite";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r0.equals("com.google.android.gms.maps_dynamite") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        r4 = zzb(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        android.util.Log.d(com.google.android.gms.maps.internal.zzcc.zza, "Attempting to load maps_dynamite again.");
        r4 = com.google.android.gms.dynamite.DynamiteModule.load(r4, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        r4 = zzb(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0022, code lost:
    
        if (r5 != com.google.android.gms.maps.MapsInitializer.Renderer.LEGACY) goto L11;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Context zzc(Context context, @Nullable MapsInitializer.Renderer renderer) {
        String str = "com.google.android.gms.maps_legacy_dynamite";
        Context context2 = zzb;
        if (context2 != null) {
            return context2;
        }
        try {
            Class.forName("com.google.android.gms.maps.internal.UseLegacyRendererAsDefault");
        } catch (ClassNotFoundException unused) {
        }
        if (renderer != null) {
            int ordinal = renderer.ordinal();
            if (ordinal != 0) {
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

    private static zzf zzd(Context context, @Nullable MapsInitializer.Renderer renderer) {
        Log.i(zza, "Making Creator dynamically");
        try {
            IBinder iBinder = (IBinder) zze(((ClassLoader) Preconditions.checkNotNull(zzc(context, renderer).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return queryLocalInterface instanceof zzf ? (zzf) queryLocalInterface : new zze(iBinder);
        } catch (ClassNotFoundException e8) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e8);
        }
    }

    private static Object zze(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e8) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e8);
        } catch (InstantiationException e9) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e9);
        }
    }
}
