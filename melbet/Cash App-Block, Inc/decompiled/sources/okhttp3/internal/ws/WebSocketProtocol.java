package okhttp3.internal.ws;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.internal.zzb;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.squareup.cash.investing.primitives.FilterConfiguration;
import com.withpersona.sdk2.camera.feed.CameraFeedKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import okio.Buffer;

/* loaded from: classes4.dex */
public abstract class WebSocketProtocol {
    public static boolean zzb = false;
    public static int zzc = 1;

    public static boolean areEqual(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    public static boolean hasNoSelection(Collection collection) {
        boolean isEmpty;
        Collection<FilterConfiguration> collection2 = collection;
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            for (FilterConfiguration filterConfiguration : collection2) {
                if (filterConfiguration instanceof FilterConfiguration.Empty) {
                    isEmpty = true;
                } else if (filterConfiguration instanceof FilterConfiguration.SubFilters) {
                    isEmpty = ((FilterConfiguration.SubFilters) filterConfiguration).subFilterSelections.isEmpty();
                } else {
                    if (!(filterConfiguration instanceof FilterConfiguration.Categories)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return false;
                    }
                    isEmpty = ((FilterConfiguration.Categories) filterConfiguration).categoryTokens.isEmpty();
                }
                if (!isEmpty) {
                    return false;
                }
            }
        }
        return true;
    }

    public static synchronized int initialize(Context context) {
        synchronized (WebSocketProtocol.class) {
            try {
                zzae.checkNotNull(context, "Context is null");
                Log.d("MapsInitializer", "preferredRenderer: ".concat("null"));
                if (!zzb) {
                    try {
                        zze zza = zzcc.zza(context);
                        try {
                            zzb zze = zza.zze();
                            zzae.checkNotNull(zze);
                            CameraUpdateFactory.zza = zze;
                            zzk zzj = zza.zzj();
                            if (CameraFeedKt.zza == null) {
                                zzae.checkNotNull(zzj, "delegate must not be null");
                                CameraFeedKt.zza = zzj;
                            }
                            zzb = true;
                            try {
                                if (zza.zzd() == 2) {
                                    zzc = 2;
                                }
                                ObjectWrapper objectWrapper = new ObjectWrapper(context);
                                Parcel zza2 = zza.zza();
                                zzc.zzg(zza2, objectWrapper);
                                zza2.writeInt(0);
                                zza.zzc(zza2, 10);
                            } catch (RemoteException e) {
                                Log.e("MapsInitializer", "Failed to retrieve renderer type or log initialization.", e);
                            }
                            int i = zzc;
                            Log.d("MapsInitializer", "loadedRenderer: ".concat(i != 1 ? i != 2 ? "null" : "LATEST" : "LEGACY"));
                        } catch (RemoteException e2) {
                            throw new RuntimeRemoteException((Throwable) e2);
                        }
                    } catch (GooglePlayServicesNotAvailableException e3) {
                        return e3.errorCode;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    public static void toggleMask(Buffer.UnsafeCursor unsafeCursor, byte[] bArr) {
        long j;
        unsafeCursor.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = unsafeCursor.data;
            int i2 = unsafeCursor.start;
            int i3 = unsafeCursor.end;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = unsafeCursor.offset;
            Buffer buffer = unsafeCursor.buffer;
            buffer.getClass();
            if (j2 == buffer.size) {
                a$$ExternalSyntheticBUOutline0.m$1("no more bytes");
                return;
            }
            j = unsafeCursor.offset;
        } while (unsafeCursor.seek(j == -1 ? 0L : j + (unsafeCursor.end - unsafeCursor.start)) != -1);
    }
}
