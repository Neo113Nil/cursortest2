package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class x32 implements nb3<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f14027a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y32 f14028b;

    x32(y32 y32Var, boolean z6) {
        this.f14028b = y32Var;
        this.f14027a = z6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // com.google.android.gms.internal.ads.nb3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        a3.t1 t1Var;
        List<String> emptyList;
        List asList;
        final ot otVar;
        n32 n32Var;
        char c7;
        Bundle bundle2 = bundle;
        t1Var = this.f14028b.f14531f;
        if (t1Var.K()) {
            return;
        }
        Object obj = bundle2.get("ad_types");
        if (obj instanceof List) {
            asList = (List) obj;
        } else {
            if (!(obj instanceof String[])) {
                emptyList = Collections.emptyList();
                final ArrayList arrayList = new ArrayList();
                for (String str : emptyList) {
                    switch (str.hashCode()) {
                        case -1396342996:
                            if (str.equals("banner")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1052618729:
                            if (str.equals("native")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -239580146:
                            if (str.equals("rewarded")) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 604727084:
                            if (str.equals("interstitial")) {
                                c7 = 1;
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    arrayList.add(c7 != 0 ? c7 != 1 ? c7 != 2 ? c7 != 3 ? xr.AD_FORMAT_TYPE_UNSPECIFIED : xr.REWARD_BASED_VIDEO_AD : xr.NATIVE_APP_INSTALL : xr.INTERSTITIAL : xr.BANNER);
                }
                y32 y32Var = this.f14028b;
                otVar = y32.f14525h.get(vs2.a(vs2.a(bundle2, "device"), "network").getInt("active_network_state", -1), ot.UNSPECIFIED);
                final ft a7 = y32.a(this.f14028b, bundle2);
                n32Var = this.f14028b.f14530e;
                final boolean z6 = this.f14027a;
                n32Var.a(new pv2() { // from class: com.google.android.gms.internal.ads.w32
                    @Override // com.google.android.gms.internal.ads.pv2
                    public final Object c(Object obj2) {
                        a3.t1 t1Var2;
                        x32 x32Var = x32.this;
                        boolean z7 = z6;
                        ArrayList arrayList2 = arrayList;
                        ft ftVar = a7;
                        ot otVar2 = otVar;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj2;
                        t1Var2 = x32Var.f14028b.f14531f;
                        if (!t1Var2.K()) {
                            byte[] f7 = y32.f(x32Var.f14028b, z7, arrayList2, ftVar, otVar2);
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("timestamp", Long.valueOf(y2.t.a().b()));
                            contentValues.put("serialized_proto_data", f7);
                            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
                            if (!z7) {
                                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
                            }
                        }
                        return null;
                    }
                });
            }
            asList = Arrays.asList((String[]) obj);
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj2 : asList) {
            if (obj2 instanceof String) {
                arrayList2.add((String) obj2);
            }
        }
        emptyList = Collections.unmodifiableList(arrayList2);
        final ArrayList arrayList3 = new ArrayList();
        while (r0.hasNext()) {
        }
        y32 y32Var2 = this.f14028b;
        otVar = y32.f14525h.get(vs2.a(vs2.a(bundle2, "device"), "network").getInt("active_network_state", -1), ot.UNSPECIFIED);
        final ft a72 = y32.a(this.f14028b, bundle2);
        n32Var = this.f14028b.f14530e;
        final boolean z62 = this.f14027a;
        n32Var.a(new pv2() { // from class: com.google.android.gms.internal.ads.w32
            @Override // com.google.android.gms.internal.ads.pv2
            public final Object c(Object obj22) {
                a3.t1 t1Var2;
                x32 x32Var = x32.this;
                boolean z7 = z62;
                ArrayList arrayList22 = arrayList3;
                ft ftVar = a72;
                ot otVar2 = otVar;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj22;
                t1Var2 = x32Var.f14028b.f14531f;
                if (!t1Var2.K()) {
                    byte[] f7 = y32.f(x32Var.f14028b, z7, arrayList22, ftVar, otVar2);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("timestamp", Long.valueOf(y2.t.a().b()));
                    contentValues.put("serialized_proto_data", f7);
                    sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                    sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
                    if (!z7) {
                        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
                    }
                }
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        io0.d("Failed to get signals bundle");
    }
}
