package A4;

import B.f;
import D6.z;
import I.C0108d;
import I.InterfaceC0107c;
import I.T;
import P0.n;
import Z0.m;
import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.J;
import com.google.firebase.messaging.L;
import d1.C0354a;
import d1.EnumC0356c;
import f1.C0393a;
import g1.i;
import g1.j;
import h1.h;
import i1.InterfaceC0542b;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import n.C0737u;
import org.json.JSONException;
import org.json.JSONObject;
import x4.C1009d;
import x4.o;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements e, S1.e, K1.a, OnCompleteListener, InterfaceC0542b, s4.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f87d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f88e;

    public /* synthetic */ b(int i2, Object obj) {
        this.f87d = i2;
        this.f88e = obj;
    }

    @Override // A4.e
    public boolean a(View view) {
        for (Class cls : (Class[]) this.f88e) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    @Override // i1.InterfaceC0542b
    public Object b() {
        SQLiteDatabase a7;
        int i2 = this.f87d;
        Object obj = this.f88e;
        switch (i2) {
            case 9:
                h hVar = (h) ((h1.c) obj);
                hVar.getClass();
                int i5 = C0354a.f4626e;
                n nVar = new n();
                nVar.f2214e = null;
                nVar.f2215i = new ArrayList();
                nVar.f2216l = null;
                nVar.f2217m = "";
                HashMap hashMap = new HashMap();
                a7 = hVar.a();
                a7.beginTransaction();
                try {
                    C0354a c0354a = (C0354a) h.B(a7.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C0393a(hVar, hashMap, nVar, 3));
                    a7.setTransactionSuccessful();
                    return c0354a;
                } finally {
                }
            case 10:
                h hVar2 = (h) ((h1.d) obj);
                long d7 = hVar2.f5137e.d() - hVar2.f5139l.f5126d;
                a7 = hVar2.a();
                a7.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(d7)};
                    Cursor rawQuery = a7.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            hVar2.j(rawQuery.getInt(0), EnumC0356c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = a7.delete("events", "timestamp_ms < ?", strArr);
                    a7.setTransactionSuccessful();
                    a7.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case RequestError.STOP_TRACKING /* 11 */:
                h hVar3 = (h) ((i) obj).f5006i;
                a7 = hVar3.a();
                a7.beginTransaction();
                try {
                    a7.compileStatement("DELETE FROM log_event_dropped").execute();
                    a7.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f5137e.d()).execute();
                    a7.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                j jVar = (j) obj;
                Iterator it = ((Iterable) ((h) jVar.f5008b).g(new c(27))).iterator();
                while (it.hasNext()) {
                    jVar.f5009c.a((a1.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // S1.e
    public Object c(z zVar) {
        return this.f88e;
    }

    public Y0.b d(D0.j jVar) {
        Y0.c cVar = (Y0.c) this.f88e;
        URL url = (URL) jVar.f330e;
        String u7 = d4.c.u("CctTransportBackend");
        if (Log.isLoggable(u7, 4)) {
            Log.i(u7, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f2910g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) jVar.f332l;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    l2.c cVar2 = cVar.f2904a;
                    Z0.i iVar = (Z0.i) jVar.f331i;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    Z1.d dVar = (Z1.d) cVar2.f6269d;
                    Z1.e eVar = new Z1.e(bufferedWriter, dVar.f3016a, dVar.f3017b, dVar.f3018c, dVar.f3019d);
                    eVar.f(iVar);
                    eVar.h();
                    eVar.f3021b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String u8 = d4.c.u("CctTransportBackend");
                    if (Log.isLoggable(u8, 4)) {
                        Log.i(u8, String.format("Status Code: %d", valueOf));
                    }
                    d4.c.k("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    d4.c.k("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new Y0.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new Y0.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            Y0.b bVar = new Y0.b(responseCode, null, m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f2998a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (X1.b e7) {
            e = e7;
            d4.c.l("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new Y0.b(400, null, 0L);
        } catch (ConnectException e8) {
            e = e8;
            d4.c.l("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new Y0.b(com.onesignal.core.internal.permissions.h.DELAY_TIME_CALLBACK_CALL, null, 0L);
        } catch (UnknownHostException e9) {
            e = e9;
            d4.c.l("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new Y0.b(com.onesignal.core.internal.permissions.h.DELAY_TIME_CALLBACK_CALL, null, 0L);
        } catch (IOException e10) {
            e = e10;
            d4.c.l("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new Y0.b(400, null, 0L);
        }
    }

    public boolean e(f fVar, int i2, Bundle bundle) {
        InterfaceC0107c interfaceC0107c;
        C0737u c0737u = (C0737u) this.f88e;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 25 && (i2 & 1) != 0) {
            try {
                ((K.h) fVar.f152e).n();
                Parcelable parcelable = (Parcelable) ((K.h) fVar.f152e).l();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e7) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        K.h hVar = (K.h) fVar.f152e;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.m()));
        if (i5 >= 31) {
            interfaceC0107c = new l2.c(clipData, 2);
        } else {
            C0108d c0108d = new C0108d();
            c0108d.f1177e = clipData;
            c0108d.f1178i = 2;
            interfaceC0107c = c0108d;
        }
        interfaceC0107c.q(hVar.p());
        interfaceC0107c.setExtras(bundle);
        return T.g(c0737u, interfaceC0107c.build()) == null;
    }

    @Override // s4.c
    public void g(Object obj) {
        b bVar = (b) this.f88e;
        boolean z7 = false;
        if (obj != null) {
            try {
                z7 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e7) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e7);
            }
        }
        ((B6.e) bVar.f88e).c(z7);
    }

    @Override // K1.a
    public Object h(Task task) {
        switch (this.f87d) {
            case 4:
                String str = (String) this.f88e;
                if (!task.isSuccessful()) {
                    throw new ExecutionException(task.getException());
                }
                String str2 = (String) task.getResult();
                if (TextUtils.isEmpty(str2) || !str2.endsWith(str)) {
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                return str;
            default:
                ((z) this.f88e).getClass();
                Bundle bundle = (Bundle) task.h();
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i2 = this.f87d;
        Object obj = this.f88e;
        switch (i2) {
            case 6:
                J.b((Intent) obj);
                break;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((L) obj).f4472b.d(null);
                break;
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 16:
                o oVar = (o) obj;
                HashMap hashMap = C1009d.f8340i;
                if (!task.isSuccessful()) {
                    oVar.a(task.getException());
                    break;
                } else {
                    oVar.c();
                    break;
                }
            default:
                x4.n nVar = (x4.n) obj;
                HashMap hashMap2 = C1009d.f8340i;
                if (!task.isSuccessful()) {
                    nVar.a(task.getException());
                    break;
                } else {
                    nVar.success(task.getResult());
                    break;
                }
        }
    }
}
