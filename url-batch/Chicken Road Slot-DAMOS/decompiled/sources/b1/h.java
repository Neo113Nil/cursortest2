package b1;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.ra;
import com.google.android.gms.internal.measurement.se;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.onesignal.core.activities.PermissionsActivity;
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
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements w7.a, OnCompleteListener, l8.e, s6.b, j5.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f980e;

    public /* synthetic */ h(int i3, Object obj) {
        this.f979d = i3;
        this.f980e = obj;
    }

    @Override // s6.b
    public Object a() {
        switch (this.f979d) {
            case 9:
                r6.g gVar = (r6.g) ((q6.i) this.f980e).f8055e;
                SQLiteDatabase a9 = gVar.a();
                a9.beginTransaction();
                try {
                    a9.compileStatement("DELETE FROM log_event_dropped").execute();
                    a9.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar.f8198e.g()).execute();
                    a9.setTransactionSuccessful();
                    a9.endTransaction();
                    return null;
                } catch (Throwable th) {
                    a9.endTransaction();
                    throw th;
                }
            default:
                c6.i iVar = (c6.i) this.f980e;
                Iterator it = ((Iterable) ((r6.g) iVar.f1821b).h(new kotlin.collections.i0(28))).iterator();
                while (it.hasNext()) {
                    ((p.e) iVar.f1822c).i((k6.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // l8.e
    public Object b(se seVar) {
        return this.f980e;
    }

    public i6.b c(a1.n nVar) {
        i6.c cVar = (i6.c) this.f980e;
        URL url = (URL) nVar.f41i;
        String v10 = k7.e.v("CctTransportBackend");
        if (Log.isLoggable(v10, 4)) {
            Log.i(v10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) nVar.f40e;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    l.d dVar = cVar.f4656a;
                    j6.i iVar = (j6.i) nVar.f42r;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    r8.d dVar2 = (r8.d) dVar.f5643e;
                    r8.e eVar = new r8.e(bufferedWriter, dVar2.f8217a, dVar2.f8218b, dVar2.f8219c, dVar2.f8220d);
                    eVar.f(iVar);
                    eVar.h();
                    eVar.f8222b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String v11 = k7.e.v("CctTransportBackend");
                    if (Log.isLoggable(v11, 4)) {
                        Log.i(v11, String.format("Status Code: %d", valueOf));
                    }
                    k7.e.l("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    k7.e.l("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new i6.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new i6.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            i6.b bVar = new i6.b(responseCode, null, j6.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f5093a);
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
        } catch (ConnectException e2) {
            e = e2;
            k7.e.p("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new i6.b(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, null, 0L);
        } catch (UnknownHostException e9) {
            e = e9;
            k7.e.p("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new i6.b(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, null, 0L);
        } catch (IOException e10) {
            e = e10;
            k7.e.p("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new i6.b(400, null, 0L);
        } catch (p8.b e11) {
            e = e11;
            k7.e.p("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new i6.b(400, null, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    public void d() {
        Function2 function2 = (Function2) this.f980e;
        synchronized (r.f1030c) {
            ?? r22 = r.f1034h;
            r22.getClass();
            ArrayList arrayList = new ArrayList(kotlin.collections.z.j(r22, 10));
            boolean z10 = false;
            for (Object obj : r22) {
                boolean z11 = true;
                if (!z10 && Intrinsics.a(obj, function2)) {
                    z10 = true;
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(obj);
                }
            }
            r.f1034h = arrayList;
        }
    }

    @Override // j5.c
    public j5.d e(j5.b bVar) {
        Context context = (Context) this.f980e;
        String str = bVar.f5032b;
        j5.a aVar = bVar.f5033c;
        aVar.getClass();
        if (str != null && str.length() != 0) {
            return new k5.i(context, str, aVar, true, true);
        }
        a1.e("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    @Override // w7.a
    public Object f(Task task) {
        switch (this.f979d) {
            case 1:
                String str = (String) this.f980e;
                if (!task.isSuccessful()) {
                    throw new ExecutionException(task.getException());
                }
                String str2 = (String) task.getResult();
                if (TextUtils.isEmpty(str2) || !str2.endsWith(str)) {
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                return str;
            default:
                ((ra) this.f980e).getClass();
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
        switch (this.f979d) {
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                com.google.firebase.messaging.e0.c((Intent) this.f980e);
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                ((com.google.firebase.messaging.g0) this.f980e).f3136b.c(null);
                break;
            default:
                ((ScheduledFuture) this.f980e).cancel(false);
                break;
        }
    }
}
