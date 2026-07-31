package B0;

import C0.m;
import D0.j;
import D3.B;
import H1.A;
import H1.K;
import H1.M;
import H1.r;
import H1.s;
import J0.k;
import J0.l;
import K0.h;
import O3.i;
import V.g;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.strategylink.Row.Five.MainActivity;
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
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k1.n;
import m1.AbstractC0521b;
import org.json.JSONException;
import org.json.JSONObject;
import t1.C0655b;
import u0.C0675e;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements i, k1.c, L0.b, O3.b, U.b, p1.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f68f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f69g;

    public /* synthetic */ b(int i7, Object obj) {
        this.f68f = i7;
        this.f69g = obj;
    }

    @Override // U.b
    public U.c a(U.a aVar) {
        Context context = (Context) this.f69g;
        String str = (String) aVar.f2484d;
        D1.b callback = (D1.b) aVar.f2485e;
        kotlin.jvm.internal.i.e(callback, "callback");
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new g(context, str, callback, true, true);
    }

    @Override // p1.c
    public Object b(A.e eVar) {
        return this.f69g;
    }

    @Override // L0.b
    public Object c() {
        SQLiteDatabase a7;
        int i7 = this.f68f;
        Object obj = this.f69g;
        switch (i7) {
            case 6:
                h hVar = (h) ((K0.c) obj);
                hVar.getClass();
                int i8 = G0.a.f809e;
                A a8 = new A();
                a8.f877b = null;
                a8.f878c = new ArrayList();
                a8.f879d = null;
                a8.f876a = "";
                HashMap hashMap = new HashMap();
                a7 = hVar.a();
                a7.beginTransaction();
                try {
                    G0.a aVar = (G0.a) h.v(a7.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new r(hVar, hashMap, a8, 4));
                    a7.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 7:
                h hVar2 = (h) ((K0.d) obj);
                long c7 = hVar2.f1358g.c() - hVar2.f1360i.f1347d;
                a7 = hVar2.a();
                a7.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(c7)};
                    Cursor rawQuery = a7.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            hVar2.h(rawQuery.getInt(0), G0.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
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
            case 8:
                h hVar3 = (h) ((k) obj).f1277i;
                a7 = hVar3.a();
                a7.beginTransaction();
                try {
                    a7.compileStatement("DELETE FROM log_event_dropped").execute();
                    a7.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f1358g.c()).execute();
                    a7.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                l lVar = (l) obj;
                Iterator it = ((Iterable) ((h) lVar.f1279b).e(new B1.g(12))).iterator();
                while (it.hasNext()) {
                    lVar.f1280c.a((j) it.next(), 1, false);
                }
                return null;
        }
    }

    public d d(c cVar) {
        e eVar = (e) this.f69g;
        URL url = (URL) cVar.f72h;
        String o7 = AbstractC0521b.o("CctTransportBackend");
        if (Log.isLoggable(o7, 4)) {
            Log.i(o7, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(eVar.f83g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) cVar.f71g;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    V5.g gVar = eVar.f77a;
                    C0.i iVar = (C0.i) cVar.f73i;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    v1.d dVar = (v1.d) gVar.f2734g;
                    v1.e eVar2 = new v1.e(bufferedWriter, dVar.f6113a, dVar.f6114b, dVar.f6115c, dVar.f6116d);
                    eVar2.f(iVar);
                    eVar2.h();
                    eVar2.f6118b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String o8 = AbstractC0521b.o("CctTransportBackend");
                    if (Log.isLoggable(o8, 4)) {
                        Log.i(o8, String.format("Status Code: %d", valueOf));
                    }
                    AbstractC0521b.i("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC0521b.i("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new d(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new d(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            d dVar2 = new d(responseCode, null, m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f178a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return dVar2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e4) {
            e = e4;
            AbstractC0521b.l("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new d(com.onesignal.core.internal.permissions.h.DELAY_TIME_CALLBACK_CALL, null, 0L);
        } catch (UnknownHostException e7) {
            e = e7;
            AbstractC0521b.l("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new d(com.onesignal.core.internal.permissions.h.DELAY_TIME_CALLBACK_CALL, null, 0L);
        } catch (IOException e8) {
            e = e8;
            AbstractC0521b.l("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new d(400, null, 0L);
        } catch (C0655b e9) {
            e = e9;
            AbstractC0521b.l("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new d(400, null, 0L);
        }
    }

    @Override // O3.i
    public void g(C0675e call, N3.j jVar) {
        MainActivity mainActivity = (MainActivity) this.f69g;
        int i7 = MainActivity.f3933l;
        kotlin.jvm.internal.i.e(call, "call");
        if (!kotlin.jvm.internal.i.a((String) call.f5975b, "openPushPortal")) {
            jVar.b();
            return;
        }
        String str = (String) call.c("pushPath");
        if (str == null) {
            jVar.a("INVALID_ARGUMENT", "pushPath is null", null);
            return;
        }
        try {
            try {
                C0675e a7 = new s().a();
                Uri parse = Uri.parse(str);
                Intent intent = (Intent) a7.f5975b;
                intent.setData(parse);
                mainActivity.startActivity(intent, (Bundle) a7.f5976c);
                jVar.d(Boolean.TRUE);
            } catch (Exception e4) {
                jVar.a("UNABLE_TO_OPEN", e4.getMessage(), null);
            }
        } catch (Exception unused) {
            mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            jVar.d(Boolean.TRUE);
        }
    }

    @Override // k1.c
    public void h(n nVar) {
        switch (this.f68f) {
            case 3:
                K.b((Intent) this.f69g);
                break;
            case 4:
                ((M) this.f69g).f925b.c(null);
                break;
            default:
                ((ScheduledFuture) this.f69g).cancel(false);
                break;
        }
    }

    @Override // O3.b
    public void o(Object obj) {
        b bVar = (b) this.f69g;
        boolean z5 = false;
        if (obj != null) {
            try {
                z5 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e4) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e4);
            }
        }
        ((B) bVar.f69g).b(z5);
    }
}
