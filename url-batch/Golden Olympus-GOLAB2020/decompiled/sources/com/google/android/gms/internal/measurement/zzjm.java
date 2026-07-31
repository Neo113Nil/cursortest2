package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.common.base.Preconditions;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzjm implements zzjr {
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private volatile Map zzh;
    private static final Map zzb = new androidx.collection.a();
    public static final String[] zza = {b9.h.f15463W, "value"};
    private final Object zzg = new Object();
    private final List zzi = new ArrayList();

    private zzjm(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        Preconditions.checkNotNull(contentResolver);
        Preconditions.checkNotNull(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        this.zzf = new zzjl(this, null);
    }

    public static zzjm zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzjm zzjmVar;
        synchronized (zzjm.class) {
            Map map = zzb;
            zzjmVar = (zzjm) map.get(uri);
            if (zzjmVar == null) {
                try {
                    zzjm zzjmVar2 = new zzjm(contentResolver, uri, runnable);
                    try {
                        contentResolver.registerContentObserver(uri, false, zzjmVar2.zzf);
                        map.put(uri, zzjmVar2);
                    } catch (SecurityException unused) {
                    }
                    zzjmVar = zzjmVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzjmVar;
    }

    public static /* synthetic */ Map zzc(zzjm zzjmVar) {
        ContentResolver contentResolver = zzjmVar.zzc;
        Uri uri = zzjmVar.zzd;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor query = acquireUnstableContentProviderClient.query(uri, zza, null, null, null);
                try {
                    if (query == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        Map map = Collections.EMPTY_MAP;
                        acquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = query.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        query.close();
                        acquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map aVar = count <= 256 ? new androidx.collection.a(count) : new HashMap(count, 1.0f);
                    while (query.moveToNext()) {
                        aVar.put(query.getString(0), query.getString(1));
                    }
                    if (query.isAfterLast()) {
                        query.close();
                        acquireUnstableContentProviderClient.release();
                        return aVar;
                    }
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map3 = Collections.EMPTY_MAP;
                    query.close();
                    acquireUnstableContentProviderClient.release();
                    return map3;
                } finally {
                }
            } catch (RemoteException e4) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e4);
                Map map4 = Collections.EMPTY_MAP;
                acquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th) {
            acquireUnstableContentProviderClient.release();
            throw th;
        }
    }

    static synchronized void zze() {
        synchronized (zzjm.class) {
            try {
                Map map = zzb;
                for (zzjm zzjmVar : map.values()) {
                    zzjmVar.zzc.unregisterContentObserver(zzjmVar.zzf);
                }
                map.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) zzd().get(str);
    }

    public final Map zzd() {
        Map map;
        Map map2 = this.zzh;
        if (map2 == null) {
            synchronized (this.zzg) {
                map2 = this.zzh;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) zzjp.zza(new zzjq() { // from class: com.google.android.gms.internal.measurement.zzjk
                                @Override // com.google.android.gms.internal.measurement.zzjq
                                public final Object zza() {
                                    return zzjm.zzc(zzjm.this);
                                }
                            });
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException e4) {
                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e4);
                        map = Collections.EMPTY_MAP;
                    }
                    this.zzh = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final void zzf() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.zzi.iterator();
                while (it.hasNext()) {
                    ((zzjn) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
