package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.zzg;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbf extends zzar {
    private boolean started;
    private final zzbc zzwv;
    private final zzco zzww;
    private final zzcn zzwx;
    private final zzax zzwy;
    private long zzwz;
    private final zzbw zzxa;
    private final zzbw zzxb;
    private final zzcz zzxc;
    private long zzxd;
    private boolean zzxe;

    protected zzbf(zzat zzatVar, zzav zzavVar) {
        super(zzatVar);
        Preconditions.checkNotNull(zzavVar);
        this.zzwz = Long.MIN_VALUE;
        this.zzwx = new zzcn(zzatVar);
        this.zzwv = new zzbc(zzatVar);
        this.zzww = new zzco(zzatVar);
        this.zzwy = new zzax(zzatVar);
        this.zzxc = new zzcz(zzbt());
        this.zzxa = new zzbg(this, zzatVar);
        this.zzxb = new zzbh(this, zzatVar);
    }

    private final void zza(zzaw zzawVar, zzv zzvVar) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotNull(zzvVar);
        com.google.android.gms.analytics.zza zzaVar = new com.google.android.gms.analytics.zza(zzbs());
        zzaVar.zza(zzawVar.zzcp());
        zzaVar.enableAdvertisingIdCollection(zzawVar.zzcq());
        zzg zzi = zzaVar.zzi();
        zzad zzadVar = (zzad) zzi.zzb(zzad.class);
        zzadVar.zzl("data");
        zzadVar.zzb(true);
        zzi.zza(zzvVar);
        zzy zzyVar = (zzy) zzi.zzb(zzy.class);
        zzu zzuVar = (zzu) zzi.zzb(zzu.class);
        for (Map.Entry<String, String> entry : zzawVar.zzcs().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ("an".equals(key)) {
                zzuVar.setAppName(value);
            } else if ("av".equals(key)) {
                zzuVar.setAppVersion(value);
            } else if ("aid".equals(key)) {
                zzuVar.setAppId(value);
            } else if ("aiid".equals(key)) {
                zzuVar.setAppInstallerId(value);
            } else if ("uid".equals(key)) {
                zzadVar.setUserId(value);
            } else {
                zzyVar.set(key, value);
            }
        }
        zzb("Sending installation campaign to", zzawVar.zzcp(), zzvVar);
        zzi.zza(zzcb().zzfa());
        zzi.zzs();
    }

    private final long zzcy() {
        zzk.zzab();
        zzch();
        try {
            return this.zzwv.zzcy();
        } catch (SQLiteException e) {
            zze("Failed to get min/max hit times from local store", e);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdd() {
        zzb((zzca) new zzbj(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzde() {
        try {
            this.zzwv.zzcx();
            zzdi();
        } catch (SQLiteException e) {
            zzd("Failed to delete stale hits", e);
        }
        this.zzxb.zzh(86400000L);
    }

    private final void zzdf() {
        if (this.zzxe || !zzbu.zzdt() || this.zzwy.isConnected()) {
            return;
        }
        if (this.zzxc.zzj(zzcc.zzzt.get().longValue())) {
            this.zzxc.start();
            zzq("Connecting to service");
            if (this.zzwy.connect()) {
                zzq("Connected to service");
                this.zzxc.clear();
                onServiceConnected();
            }
        }
    }

    private final boolean zzdg() {
        zzk.zzab();
        zzch();
        zzq("Dispatching a batch of local hits");
        boolean z = !this.zzwy.isConnected();
        boolean z2 = !this.zzww.zzew();
        if (z && z2) {
            zzq("No network or service available. Will retry later");
            return false;
        }
        long max = Math.max(zzbu.zzdx(), zzbu.zzdy());
        ArrayList arrayList = new ArrayList();
        long j = 0;
        while (true) {
            try {
                try {
                    this.zzwv.beginTransaction();
                    arrayList.clear();
                    try {
                        List<zzch> zzd = this.zzwv.zzd(max);
                        if (zzd.isEmpty()) {
                            zzq("Store is empty, nothing to dispatch");
                            zzdk();
                            try {
                                this.zzwv.setTransactionSuccessful();
                                this.zzwv.endTransaction();
                                return false;
                            } catch (SQLiteException e) {
                                zze("Failed to commit local dispatch transaction", e);
                                zzdk();
                                return false;
                            }
                        }
                        zza("Hits loaded from store. count", Integer.valueOf(zzd.size()));
                        Iterator<zzch> it = zzd.iterator();
                        while (it.hasNext()) {
                            if (it.next().zzem() == j) {
                                zzd("Database contains successfully uploaded hit", Long.valueOf(j), Integer.valueOf(zzd.size()));
                                zzdk();
                                try {
                                    this.zzwv.setTransactionSuccessful();
                                    this.zzwv.endTransaction();
                                    return false;
                                } catch (SQLiteException e2) {
                                    zze("Failed to commit local dispatch transaction", e2);
                                    zzdk();
                                    return false;
                                }
                            }
                        }
                        if (this.zzwy.isConnected()) {
                            zzq("Service connected, sending hits to the service");
                            while (!zzd.isEmpty()) {
                                zzch zzchVar = zzd.get(0);
                                if (!this.zzwy.zzb(zzchVar)) {
                                    break;
                                }
                                j = Math.max(j, zzchVar.zzem());
                                zzd.remove(zzchVar);
                                zzb("Hit sent do device AnalyticsService for delivery", zzchVar);
                                try {
                                    this.zzwv.zze(zzchVar.zzem());
                                    arrayList.add(Long.valueOf(zzchVar.zzem()));
                                } catch (SQLiteException e3) {
                                    zze("Failed to remove hit that was send for delivery", e3);
                                    zzdk();
                                    try {
                                        this.zzwv.setTransactionSuccessful();
                                        this.zzwv.endTransaction();
                                        return false;
                                    } catch (SQLiteException e4) {
                                        zze("Failed to commit local dispatch transaction", e4);
                                        zzdk();
                                        return false;
                                    }
                                }
                            }
                        }
                        if (this.zzww.zzew()) {
                            List<Long> zzb = this.zzww.zzb(zzd);
                            Iterator<Long> it2 = zzb.iterator();
                            while (it2.hasNext()) {
                                j = Math.max(j, it2.next().longValue());
                            }
                            try {
                                this.zzwv.zza(zzb);
                                arrayList.addAll(zzb);
                            } catch (SQLiteException e5) {
                                zze("Failed to remove successfully uploaded hits", e5);
                                zzdk();
                                try {
                                    this.zzwv.setTransactionSuccessful();
                                    this.zzwv.endTransaction();
                                    return false;
                                } catch (SQLiteException e6) {
                                    zze("Failed to commit local dispatch transaction", e6);
                                    zzdk();
                                    return false;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                this.zzwv.setTransactionSuccessful();
                                this.zzwv.endTransaction();
                                return false;
                            } catch (SQLiteException e7) {
                                zze("Failed to commit local dispatch transaction", e7);
                                zzdk();
                                return false;
                            }
                        }
                        try {
                            this.zzwv.setTransactionSuccessful();
                            this.zzwv.endTransaction();
                        } catch (SQLiteException e8) {
                            zze("Failed to commit local dispatch transaction", e8);
                            zzdk();
                            return false;
                        }
                    } catch (SQLiteException e9) {
                        zzd("Failed to read hits from persisted store", e9);
                        zzdk();
                        try {
                            this.zzwv.setTransactionSuccessful();
                            this.zzwv.endTransaction();
                            return false;
                        } catch (SQLiteException e10) {
                            zze("Failed to commit local dispatch transaction", e10);
                            zzdk();
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    this.zzwv.setTransactionSuccessful();
                    this.zzwv.endTransaction();
                    throw th;
                }
                this.zzwv.setTransactionSuccessful();
                this.zzwv.endTransaction();
                throw th;
            } catch (SQLiteException e11) {
                zze("Failed to commit local dispatch transaction", e11);
                zzdk();
                return false;
            }
        }
    }

    private final void zzdj() {
        zzbz zzbz = zzbz();
        if (zzbz.zzei() && !zzbz.zzef()) {
            long zzcy = zzcy();
            if (zzcy == 0 || Math.abs(zzbt().currentTimeMillis() - zzcy) > zzcc.zzys.get().longValue()) {
                return;
            }
            zza("Dispatch alarm scheduled (ms)", Long.valueOf(zzbu.zzdw()));
            zzbz.zzej();
        }
    }

    private final void zzdk() {
        if (this.zzxa.zzef()) {
            zzq("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzxa.cancel();
        zzbz zzbz = zzbz();
        if (zzbz.zzef()) {
            zzbz.cancel();
        }
    }

    private final long zzdl() {
        if (this.zzwz != Long.MIN_VALUE) {
            return this.zzwz;
        }
        long longValue = zzcc.zzyn.get().longValue();
        zzde zzca = zzca();
        zzca.zzch();
        if (!zzca.zzaca) {
            return longValue;
        }
        zzca().zzch();
        return r0.zzaac * 1000;
    }

    private final void zzdm() {
        zzch();
        zzk.zzab();
        this.zzxe = true;
        this.zzwy.disconnect();
        zzdi();
    }

    private final boolean zzx(String str) {
        return Wrappers.packageManager(getContext()).checkCallingOrSelfPermission(str) == 0;
    }

    protected final void onServiceConnected() {
        zzk.zzab();
        zzk.zzab();
        zzch();
        if (!zzbu.zzdt()) {
            zzt("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.zzwy.isConnected()) {
            zzq("Service not connected");
            return;
        }
        if (this.zzwv.isEmpty()) {
            return;
        }
        zzq("Dispatching local hits to device AnalyticsService");
        while (true) {
            try {
                List<zzch> zzd = this.zzwv.zzd(zzbu.zzdx());
                if (zzd.isEmpty()) {
                    zzdi();
                    return;
                }
                while (!zzd.isEmpty()) {
                    zzch zzchVar = zzd.get(0);
                    if (!this.zzwy.zzb(zzchVar)) {
                        zzdi();
                        return;
                    }
                    zzd.remove(zzchVar);
                    try {
                        this.zzwv.zze(zzchVar.zzem());
                    } catch (SQLiteException e) {
                        zze("Failed to remove hit that was send for delivery", e);
                        zzdk();
                        return;
                    }
                }
            } catch (SQLiteException e2) {
                zze("Failed to read hits from store", e2);
                zzdk();
                return;
            }
        }
    }

    final void start() {
        zzch();
        Preconditions.checkState(!this.started, "Analytics backend already started");
        this.started = true;
        zzbw().zza(new zzbi(this));
    }

    public final long zza(zzaw zzawVar, boolean z) {
        Preconditions.checkNotNull(zzawVar);
        zzch();
        zzk.zzab();
        try {
            try {
                this.zzwv.beginTransaction();
                zzbc zzbcVar = this.zzwv;
                long zzco = zzawVar.zzco();
                String zzaz = zzawVar.zzaz();
                Preconditions.checkNotEmpty(zzaz);
                zzbcVar.zzch();
                zzk.zzab();
                int delete = zzbcVar.getWritableDatabase().delete("properties", "app_uid=? AND cid<>?", new String[]{String.valueOf(zzco), zzaz});
                if (delete > 0) {
                    zzbcVar.zza("Deleted property records", Integer.valueOf(delete));
                }
                long zza = this.zzwv.zza(zzawVar.zzco(), zzawVar.zzaz(), zzawVar.zzcp());
                zzawVar.zzb(1 + zza);
                zzbc zzbcVar2 = this.zzwv;
                Preconditions.checkNotNull(zzawVar);
                zzbcVar2.zzch();
                zzk.zzab();
                SQLiteDatabase writableDatabase = zzbcVar2.getWritableDatabase();
                Map<String, String> zzcs = zzawVar.zzcs();
                Preconditions.checkNotNull(zzcs);
                Uri.Builder builder = new Uri.Builder();
                for (Map.Entry<String, String> entry : zzcs.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                String encodedQuery = builder.build().getEncodedQuery();
                if (encodedQuery == null) {
                    encodedQuery = "";
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_uid", Long.valueOf(zzawVar.zzco()));
                contentValues.put("cid", zzawVar.zzaz());
                contentValues.put("tid", zzawVar.zzcp());
                contentValues.put("adid", Integer.valueOf(zzawVar.zzcq() ? 1 : 0));
                contentValues.put("hits_count", Long.valueOf(zzawVar.zzcr()));
                contentValues.put("params", encodedQuery);
                try {
                    if (writableDatabase.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                        zzbcVar2.zzu("Failed to insert/update a property (got -1)");
                    }
                } catch (SQLiteException e) {
                    zzbcVar2.zze("Error storing a property", e);
                }
                this.zzwv.setTransactionSuccessful();
                return zza;
            } catch (SQLiteException e2) {
                zze("Failed to update Analytics property", e2);
                try {
                    this.zzwv.endTransaction();
                } catch (SQLiteException e3) {
                    zze("Failed to end transaction", e3);
                }
                return -1L;
            }
        } finally {
            try {
                this.zzwv.endTransaction();
            } catch (SQLiteException e4) {
                zze("Failed to end transaction", e4);
            }
        }
    }

    public final void zza(zzch zzchVar) {
        Pair<String, Long> zzfh;
        Preconditions.checkNotNull(zzchVar);
        zzk.zzab();
        zzch();
        if (this.zzxe) {
            zzr("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            zza("Delivering hit", zzchVar);
        }
        if (TextUtils.isEmpty(zzchVar.zzeq()) && (zzfh = zzcb().zzff().zzfh()) != null) {
            Long l = (Long) zzfh.second;
            String str = (String) zzfh.first;
            String valueOf = String.valueOf(l);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(":");
            sb.append(str);
            String sb2 = sb.toString();
            HashMap hashMap = new HashMap(zzchVar.zzcs());
            hashMap.put("_m", sb2);
            zzchVar = new zzch(this, hashMap, zzchVar.zzen(), zzchVar.zzeo(), zzchVar.zzem(), zzchVar.zzel(), zzchVar.getCommands());
        }
        zzdf();
        if (this.zzwy.zzb(zzchVar)) {
            zzr("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        try {
            this.zzwv.zzc(zzchVar);
            zzdi();
        } catch (SQLiteException e) {
            zze("Delivery failed to save hit to a database", e);
            zzbu().zza(zzchVar, "deliver: failed to insert hit to database");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        this.zzwv.zzm();
        this.zzww.zzm();
        this.zzwy.zzm();
    }

    protected final void zzb(zzaw zzawVar) {
        zzk.zzab();
        zzb("Sending first hit to property", zzawVar.zzcp());
        if (zzcb().zzfb().zzj(zzbu.zzed())) {
            return;
        }
        String zzfe = zzcb().zzfe();
        if (TextUtils.isEmpty(zzfe)) {
            return;
        }
        zzv zza = zzdd.zza(zzbu(), zzfe);
        zzb("Found relevant installation campaign", zza);
        zza(zzawVar, zza);
    }

    public final void zzb(zzca zzcaVar) {
        long j = this.zzxd;
        zzk.zzab();
        zzch();
        long zzfc = zzcb().zzfc();
        zzb("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(zzfc != 0 ? Math.abs(zzbt().currentTimeMillis() - zzfc) : -1L));
        zzdf();
        try {
            zzdg();
            zzcb().zzfd();
            zzdi();
            if (zzcaVar != null) {
                zzcaVar.zza(null);
            }
            if (this.zzxd != j) {
                this.zzwx.zzev();
            }
        } catch (Throwable th) {
            zze("Local dispatch failed", th);
            zzcb().zzfd();
            zzdi();
            if (zzcaVar != null) {
                zzcaVar.zza(th);
            }
        }
    }

    public final void zzbn() {
        zzk.zzab();
        zzch();
        zzq("Delete all hits from local store");
        try {
            zzbc zzbcVar = this.zzwv;
            zzk.zzab();
            zzbcVar.zzch();
            zzbcVar.getWritableDatabase().delete("hits2", null, null);
            zzbc zzbcVar2 = this.zzwv;
            zzk.zzab();
            zzbcVar2.zzch();
            zzbcVar2.getWritableDatabase().delete("properties", null, null);
            zzdi();
        } catch (SQLiteException e) {
            zzd("Failed to delete hits from store", e);
        }
        zzdf();
        if (this.zzwy.zzct()) {
            zzq("Device service unavailable. Can't clear hits stored on the device service.");
        }
    }

    final void zzbr() {
        zzk.zzab();
        this.zzxd = zzbt().currentTimeMillis();
    }

    protected final void zzdc() {
        zzch();
        zzk.zzab();
        Context context = zzbs().getContext();
        if (!zzct.zza(context)) {
            zzt("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzcu.zze(context)) {
            zzu("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!CampaignTrackingReceiver.zza(context)) {
            zzt("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzcb().zzfa();
        if (!zzx("android.permission.ACCESS_NETWORK_STATE")) {
            zzu("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzdm();
        }
        if (!zzx("android.permission.INTERNET")) {
            zzu("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzdm();
        }
        if (zzcu.zze(getContext())) {
            zzq("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzt("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.zzxe && !this.zzwv.isEmpty()) {
            zzdf();
        }
        zzdi();
    }

    public final void zzdh() {
        zzk.zzab();
        zzch();
        zzr("Sync dispatching local hits");
        long j = this.zzxd;
        zzdf();
        try {
            zzdg();
            zzcb().zzfd();
            zzdi();
            if (this.zzxd != j) {
                this.zzwx.zzev();
            }
        } catch (Throwable th) {
            zze("Sync local dispatch failed", th);
            zzdi();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r4 > 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzdi() {
        long min;
        zzk.zzab();
        zzch();
        boolean z = true;
        if (!(!this.zzxe && zzdl() > 0)) {
            this.zzwx.unregister();
            zzdk();
            return;
        }
        if (this.zzwv.isEmpty()) {
            this.zzwx.unregister();
            zzdk();
            return;
        }
        if (!zzcc.zzzo.get().booleanValue()) {
            this.zzwx.zzet();
            z = this.zzwx.isConnected();
        }
        if (!z) {
            zzdk();
            zzdj();
            return;
        }
        zzdj();
        long zzdl = zzdl();
        long zzfc = zzcb().zzfc();
        if (zzfc != 0) {
            min = zzdl - Math.abs(zzbt().currentTimeMillis() - zzfc);
        }
        min = Math.min(zzbu.zzdv(), zzdl);
        zza("Dispatch scheduled (ms)", Long.valueOf(min));
        if (this.zzxa.zzef()) {
            this.zzxa.zzi(Math.max(1L, min + this.zzxa.zzee()));
        } else {
            this.zzxa.zzh(min);
        }
    }

    public final void zzg(long j) {
        zzk.zzab();
        zzch();
        if (j < 0) {
            j = 0;
        }
        this.zzwz = j;
        zzdi();
    }

    public final void zzy(String str) {
        Preconditions.checkNotEmpty(str);
        zzk.zzab();
        zzv zza = zzdd.zza(zzbu(), str);
        if (zza == null) {
            zzd("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        String zzfe = zzcb().zzfe();
        if (str.equals(zzfe)) {
            zzt("Ignoring duplicate install campaign");
            return;
        }
        if (!TextUtils.isEmpty(zzfe)) {
            zzd("Ignoring multiple install campaigns. original, new", zzfe, str);
            return;
        }
        zzcb().zzac(str);
        if (zzcb().zzfb().zzj(zzbu.zzed())) {
            zzd("Campaign received too late, ignoring", zza);
            return;
        }
        zzb("Received installation campaign", zza);
        Iterator<zzaw> it = this.zzwv.zzf(0L).iterator();
        while (it.hasNext()) {
            zza(it.next(), zza);
        }
    }
}
