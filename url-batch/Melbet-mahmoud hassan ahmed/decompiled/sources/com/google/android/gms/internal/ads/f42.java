package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f42 {

    /* renamed from: a, reason: collision with root package name */
    private final ar f4991a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4992b;

    /* renamed from: c, reason: collision with root package name */
    private final n32 f4993c;

    /* renamed from: d, reason: collision with root package name */
    private final po0 f4994d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4995e;

    /* renamed from: f, reason: collision with root package name */
    private final xw2 f4996f;

    /* renamed from: g, reason: collision with root package name */
    private final a3.t1 f4997g = y2.t.p().h();

    public f42(Context context, po0 po0Var, ar arVar, n32 n32Var, String str, xw2 xw2Var) {
        this.f4992b = context;
        this.f4994d = po0Var;
        this.f4991a = arVar;
        this.f4993c = n32Var;
        this.f4995e = str;
        this.f4996f = xw2Var;
    }

    private static final void c(SQLiteDatabase sQLiteDatabase, ArrayList<kt> arrayList) {
        int size = arrayList.size();
        long j7 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            kt ktVar = arrayList.get(i7);
            if (ktVar.b0() == 2 && ktVar.K() > j7) {
                j7 = ktVar.K();
            }
        }
        if (j7 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j7));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    final /* synthetic */ Void a(boolean z6, SQLiteDatabase sQLiteDatabase) {
        if (z6) {
            this.f4992b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) sw.c().b(m10.f8287q6)).booleanValue()) {
            ww2 b7 = ww2.b("oa_upload");
            b7.a("oa_failed_reqs", String.valueOf(a42.a(sQLiteDatabase, 0)));
            b7.a("oa_total_reqs", String.valueOf(a42.a(sQLiteDatabase, 1)));
            b7.a("oa_upload_time", String.valueOf(y2.t.a().b()));
            b7.a("oa_last_successful_time", String.valueOf(a42.b(sQLiteDatabase, 2)));
            b7.a("oa_session_id", this.f4997g.K() ? "" : this.f4995e);
            this.f4996f.a(b7);
            ArrayList<kt> c7 = a42.c(sQLiteDatabase);
            c(sQLiteDatabase, c7);
            int size = c7.size();
            for (int i7 = 0; i7 < size; i7++) {
                kt ktVar = c7.get(i7);
                ww2 b8 = ww2.b("oa_signals");
                b8.a("oa_session_id", this.f4997g.K() ? "" : this.f4995e);
                ft L = ktVar.L();
                String valueOf = L.J() ? String.valueOf(L.L() - 1) : "-1";
                String obj = x73.b(ktVar.Q(), new e43() { // from class: com.google.android.gms.internal.ads.e42
                    @Override // com.google.android.gms.internal.ads.e43
                    public final Object apply(Object obj2) {
                        return ((xr) obj2).name();
                    }
                }).toString();
                b8.a("oa_sig_ts", String.valueOf(ktVar.K()));
                b8.a("oa_sig_status", String.valueOf(ktVar.b0() - 1));
                b8.a("oa_sig_resp_lat", String.valueOf(ktVar.J()));
                b8.a("oa_sig_render_lat", String.valueOf(ktVar.I()));
                b8.a("oa_sig_formats", obj);
                b8.a("oa_sig_nw_type", valueOf);
                b8.a("oa_sig_wifi", String.valueOf(ktVar.c0() - 1));
                b8.a("oa_sig_airplane", String.valueOf(ktVar.Y() - 1));
                b8.a("oa_sig_data", String.valueOf(ktVar.Z() - 1));
                b8.a("oa_sig_nw_resp", String.valueOf(ktVar.H()));
                b8.a("oa_sig_offline", String.valueOf(ktVar.a0() - 1));
                b8.a("oa_sig_nw_state", String.valueOf(ktVar.P().zza()));
                if (L.I() && L.J() && L.L() == 2) {
                    b8.a("oa_sig_cell_type", String.valueOf(L.K() - 1));
                }
                this.f4996f.a(b8);
            }
        } else {
            ArrayList<kt> c8 = a42.c(sQLiteDatabase);
            lt F = pt.F();
            F.s(this.f4992b.getPackageName());
            F.t(Build.MODEL);
            F.u(a42.a(sQLiteDatabase, 0));
            F.r(c8);
            F.w(a42.a(sQLiteDatabase, 1));
            F.x(y2.t.a().b());
            F.v(a42.b(sQLiteDatabase, 2));
            final pt o7 = F.o();
            c(sQLiteDatabase, c8);
            this.f4991a.b(new zq() { // from class: com.google.android.gms.internal.ads.b42
                @Override // com.google.android.gms.internal.ads.zq
                public final void a(ps psVar) {
                    psVar.z(pt.this);
                }
            });
            au F2 = bu.F();
            F2.r(this.f4994d.f10302g);
            F2.t(this.f4994d.f10303h);
            F2.s(true == this.f4994d.f10304i ? 0 : 2);
            final bu o8 = F2.o();
            this.f4991a.b(new zq() { // from class: com.google.android.gms.internal.ads.c42
                @Override // com.google.android.gms.internal.ads.zq
                public final void a(ps psVar) {
                    bu buVar = bu.this;
                    hs y6 = psVar.s().y();
                    y6.s(buVar);
                    psVar.x(y6);
                }
            });
            this.f4991a.c(10004);
        }
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }

    public final void b(final boolean z6) {
        try {
            this.f4993c.a(new pv2() { // from class: com.google.android.gms.internal.ads.d42
                @Override // com.google.android.gms.internal.ads.pv2
                public final Object c(Object obj) {
                    f42.this.a(z6, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e7) {
            String valueOf = String.valueOf(e7.getMessage());
            io0.d(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }
}
