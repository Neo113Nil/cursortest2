package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.da;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzau {
    final /* synthetic */ zzaw zza;
    private final String zzb;
    private long zzc;

    public zzau(zzaw zzawVar, String str) {
        this.zza = zzawVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = -1L;
    }

    public final List zza() {
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = this.zza.zzj().query("raw_events", new String[]{"rowid", "name", da.a.f15878d, "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.zzb, String.valueOf(this.zzc)}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        long j4 = cursor.getLong(0);
                        long j5 = cursor.getLong(3);
                        boolean z4 = cursor.getLong(5) == 1;
                        byte[] blob = cursor.getBlob(4);
                        if (j4 > this.zzc) {
                            this.zzc = j4;
                        }
                        try {
                            com.google.android.gms.internal.measurement.zzhl zzhlVar = (com.google.android.gms.internal.measurement.zzhl) zzqa.zzp(com.google.android.gms.internal.measurement.zzhm.zze(), blob);
                            String string = cursor.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            zzhlVar.zzi(string);
                            zzhlVar.zzm(cursor.getLong(2));
                            arrayList.add(new zzat(j4, j5, z4, (com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba()));
                        } catch (IOException e4) {
                            this.zza.zzu.zzaW().zze().zzc("Data loss. Failed to merge raw event. appId", zzhe.zzn(this.zzb), e4);
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e5) {
                this.zza.zzu.zzaW().zze().zzc("Data loss. Error querying raw events batch. appId", zzhe.zzn(this.zzb), e5);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public zzau(zzaw zzawVar, String str, long j4) {
        long zzaz;
        this.zza = zzawVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        zzaz = zzawVar.zzaz("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j4)}, -1L);
        this.zzc = zzaz;
    }
}
