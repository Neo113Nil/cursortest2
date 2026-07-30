package defpackage;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
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
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements bg1, OnCompleteListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m2(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    public bg a(i8 i8Var) {
        cg cgVar = (cg) this.e;
        URL url = (URL) i8Var.e;
        String concat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(concat, 4)) {
            Log.i(concat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cgVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) i8Var.h;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    s40 s40Var = cgVar.a;
                    fb fbVar = (fb) i8Var.g;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    vb0 vb0Var = (vb0) s40Var.e;
                    wb0 wb0Var = new wb0(bufferedWriter, vb0Var.a, vb0Var.b, vb0Var.c, vb0Var.d);
                    wb0Var.f(fbVar);
                    wb0Var.h();
                    wb0Var.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String concat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(concat2, 4)) {
                        Log.i(concat2, String.format("Status Code: %d", valueOf));
                    }
                    xa0.k("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    xa0.k("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new bg(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new bg(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            bg bgVar = new bg(responseCode, null, sb.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bgVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException | UnknownHostException e) {
            xa0.l("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new bg(500, null, 0L);
        } catch (IOException | wv e2) {
            xa0.l("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new bg(400, null, 0L);
        }
    }

    @Override // defpackage.bg1
    public Object b() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 3:
                b51 b51Var = (b51) ((ne0) obj).i;
                SQLiteDatabase a = b51Var.a();
                a.beginTransaction();
                try {
                    a.compileStatement("DELETE FROM log_event_dropped").execute();
                    a.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + b51Var.e.d()).execute();
                    a.setTransactionSuccessful();
                    return null;
                } finally {
                    a.endTransaction();
                }
            default:
                o91 o91Var = (o91) obj;
                Iterator it = ((Iterable) ((b51) o91Var.e).c(new dd0(9))).iterator();
                while (it.hasNext()) {
                    ((i8) o91Var.g).o((cc) it.next(), 1, false);
                }
                return null;
        }
    }

    public void c() {
        Function2 function2 = (Function2) this.e;
        synchronized (pb1.c) {
            List list = pb1.h;
            list.getClass();
            ArrayList arrayList = new ArrayList(ai.h(list));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && Intrinsics.a(obj, function2)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            pb1.h = arrayList;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 4:
                op.v((Intent) obj);
                break;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                ((eq1) obj).b.c(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }
}
