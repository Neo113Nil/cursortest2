package com.google.firebase.messaging;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.w8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import s7.l4;
import s7.q1;
import s7.v0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f3179a;

    /* renamed from: b, reason: collision with root package name */
    public long f3180b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3181c;

    public w(s7.m mVar, String str, long j) {
        this.f3181c = mVar;
        c7.c0.d(str);
        this.f3179a = str;
        this.f3180b = mVar.P("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public static String a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e2);
            return null;
        }
    }

    public static w b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new w(str, (String) null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new w(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e2) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public List c() {
        ArrayList arrayList;
        s7.m mVar = (s7.m) this.f3181c;
        ArrayList arrayList2 = new ArrayList();
        String valueOf = String.valueOf(this.f3180b);
        String str = this.f3179a;
        Cursor cursor = null;
        try {
            try {
                cursor = mVar.j0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, valueOf}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        long j = cursor.getLong(0);
                        long j3 = cursor.getLong(3);
                        boolean z10 = cursor.getLong(5) == 1;
                        long j10 = cursor.getLong(6);
                        byte[] blob = cursor.getBlob(4);
                        if (j > this.f3180b) {
                            this.f3180b = j;
                        }
                        try {
                            v8 v8Var = (v8) l4.d0(w8.J(), blob);
                            String string = cursor.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            v8Var.n(string);
                            long j11 = cursor.getLong(2);
                            v8Var.b();
                            ((w8) v8Var.f2389e).Q(j11);
                            v8Var.b();
                            ((w8) v8Var.f2389e).t(j10);
                            arrayList2.add(new s7.k(j, j3, z10, (w8) v8Var.d()));
                        } catch (IOException e2) {
                            v0 v0Var = ((q1) mVar.f1478d).f8937t;
                            q1.l(v0Var);
                            v0Var.f9050t.c(v0.A(str), e2, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e9) {
                v0 v0Var2 = ((q1) mVar.f1478d).f8937t;
                q1.l(v0Var2);
                v0Var2.f9050t.c(v0.A(str), e9, "Data loss. Error querying raw events batch. appId");
                arrayList = arrayList2;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public w(s7.m mVar, String str) {
        this.f3181c = mVar;
        c7.c0.d(str);
        this.f3179a = str;
        this.f3180b = -1L;
    }

    public w(String str, String str2, long j) {
        this.f3179a = str;
        this.f3181c = str2;
        this.f3180b = j;
    }
}
