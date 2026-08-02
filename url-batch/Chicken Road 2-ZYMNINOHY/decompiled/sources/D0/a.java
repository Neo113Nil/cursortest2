package D0;

import R1.m;
import R1.o;
import S1.j;
import T.C;
import T.C0086d;
import T.E;
import T.H;
import T.L;
import V0.g;
import V0.h;
import W.InterfaceC0113f;
import W.InterfaceC0118k;
import W.J;
import X.t;
import a0.C0137c;
import a0.SurfaceHolderCallbackC0125A;
import a2.i;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.location.LocationManager;
import android.util.Log;
import android.view.View;
import b0.C0255a;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.adinformation.ImageResourceConfig;
import com.startapp.sdk.internal.aa;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.i2;
import com.startapp.sdk.internal.i8;
import com.startapp.sdk.internal.s1;
import com.startapp.sdk.internal.t1;
import com.startapp.sdk.internal.zi;
import f1.B;
import i2.AbstractC0457a;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C0583e9;
import io.appmetrica.analytics.location.impl.u;
import io.flutter.Build;
import io.flutter.util.ViewUtils;
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
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import q0.C1377t;
import v2.F;
import y0.AbstractC1569a;
import y0.InterfaceC1575g;
import y0.r;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1575g, T1.b, InterfaceC0113f, FunctionWithThrowable, InterfaceC0118k, ViewUtils.ViewVisitor, i2, g7, zi, t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f331b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f330a = i4;
        this.f331b = obj;
    }

    @Override // com.startapp.sdk.internal.g7
    public Object a(Object obj) {
        switch (this.f330a) {
            case 24:
                return aa.a((aa) this.f331b, (Throwable) obj);
            case 25:
            default:
                return ((t1) this.f331b).a((Throwable) obj);
            case 26:
                return ((s1) this.f331b).a((Throwable) obj);
        }
    }

    @Override // W.InterfaceC0113f
    public void accept(Object obj) {
        switch (this.f330a) {
            case 6:
                h hVar = (h) this.f331b;
                V0.a aVar = (V0.a) obj;
                g gVar = new g(aVar.f3183b, i.m(aVar.f3184c, aVar.f3182a));
                hVar.f3197c.add(gVar);
                long j4 = hVar.f3204j;
                if (j4 == -9223372036854775807L || aVar.f3185d >= j4) {
                    hVar.f(gVar);
                    break;
                }
                break;
            default:
                ((F) this.f331b).b((V0.a) obj);
                break;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        return u.a((u) this.f331b, (LocationManager) obj);
    }

    @Override // y0.InterfaceC1575g
    public long b(long j4) {
        return J.k((j4 * r0.f16187e) / 1000000, 0L, ((r) this.f331b).f16192j - 1);
    }

    @Override // T1.b
    public Object c() {
        SQLiteDatabase a3;
        int i4 = this.f330a;
        Object obj = this.f331b;
        switch (i4) {
            case 2:
                j jVar = (j) ((S1.c) obj);
                jVar.getClass();
                int i5 = O1.a.f2008e;
                G1.c cVar = new G1.c(4);
                cVar.f835b = null;
                cVar.f836c = new ArrayList();
                cVar.f837d = null;
                cVar.f838e = "";
                HashMap hashMap = new HashMap();
                a3 = jVar.a();
                a3.beginTransaction();
                try {
                    O1.a aVar = (O1.a) j.t(a3.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new Q1.b(jVar, hashMap, cVar, 3));
                    a3.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 3:
                j jVar2 = (j) ((S1.d) obj);
                long q4 = jVar2.f2587b.q() - jVar2.f2589d.f2573d;
                a3 = jVar2.a();
                a3.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(q4)};
                    Cursor rawQuery = a3.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    try {
                        Cursor cursor = rawQuery;
                        while (cursor.moveToNext()) {
                            jVar2.k(cursor.getInt(0), O1.c.MESSAGE_TOO_OLD, cursor.getString(1));
                        }
                        rawQuery.close();
                        int delete = a3.delete("events", "timestamp_ms < ?", strArr);
                        a3.setTransactionSuccessful();
                        a3.endTransaction();
                        return Integer.valueOf(delete);
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                } finally {
                }
            case 4:
                j jVar3 = (j) ((m) obj).f2370i;
                a3 = jVar3.a();
                a3.beginTransaction();
                try {
                    a3.compileStatement("DELETE FROM log_event_dropped").execute();
                    a3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + jVar3.f2587b.q()).execute();
                    a3.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                o oVar = (o) obj;
                Iterator it = ((Iterable) ((j) oVar.f2374b).e(new d(10))).iterator();
                while (it.hasNext()) {
                    oVar.f2375c.a((L1.j) it.next(), 1, false);
                }
                return null;
        }
    }

    public J1.b d(B1.j jVar) {
        J1.c cVar = (J1.c) this.f331b;
        URL url = (URL) jVar.f201b;
        String r4 = AbstractC0457a.r("CctTransportBackend");
        if (Log.isLoggable(r4, 4)) {
            Log.i(r4, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f1165g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) jVar.f203d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    t1.h hVar = cVar.f1159a;
                    K1.i iVar = (K1.i) jVar.f202c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C2.d dVar = (C2.d) hVar.f15398b;
                    C2.e eVar = new C2.e(bufferedWriter, dVar.f269a, dVar.f270b, dVar.f271c, dVar.f272d);
                    eVar.e(iVar);
                    eVar.g();
                    eVar.f274b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String r5 = AbstractC0457a.r("CctTransportBackend");
                    if (Log.isLoggable(r5, 4)) {
                        Log.i(r5, String.format("Status Code: %d", valueOf));
                    }
                    AbstractC0457a.k("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC0457a.k("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new J1.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new J1.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            J1.b bVar = new J1.b(responseCode, null, K1.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f1516a);
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
        } catch (A2.b e4) {
            e = e4;
            AbstractC0457a.o("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new J1.b(400, null, 0L);
        } catch (ConnectException e5) {
            e = e5;
            AbstractC0457a.o("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new J1.b(500, null, 0L);
        } catch (UnknownHostException e6) {
            e = e6;
            AbstractC0457a.o("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new J1.b(500, null, 0L);
        } catch (IOException e7) {
            e = e7;
            AbstractC0457a.o("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new J1.b(400, null, 0L);
        }
    }

    @Override // W.InterfaceC0118k
    public void invoke(Object obj) {
        switch (this.f330a) {
            case 10:
                ((L) obj).onMediaMetadataChanged((C) this.f331b);
                break;
            case 11:
                ((L) obj).onAudioAttributesChanged((C0086d) this.f331b);
                break;
            case 12:
                ((L) obj).onCues((V.c) this.f331b);
                break;
            case 13:
                ((L) obj).onMediaMetadataChanged(((SurfaceHolderCallbackC0125A) this.f331b).f3838a.f3862R);
                break;
            case 14:
                ((L) obj).onMetadata((E) this.f331b);
                break;
            case 15:
                ((L) obj).onCues((List) this.f331b);
                break;
            case 16:
            case 17:
            default:
                ((b0.h) obj).getClass();
                break;
            case 18:
                ((b0.h) obj).o = (H) this.f331b;
                break;
            case C0583e9.f11743C /* 19 */:
                C0137c c0137c = (C0137c) this.f331b;
                b0.h hVar = (b0.h) obj;
                hVar.f5317y += c0137c.f4072g;
                hVar.z += c0137c.f4070e;
                break;
            case C0583e9.f11744D /* 20 */:
                n0.g gVar = (n0.g) this.f331b;
                b0.h hVar2 = (b0.h) obj;
                hVar2.getClass();
                hVar2.f5315w = gVar.f14558a;
                break;
        }
    }

    @Override // io.flutter.util.ViewUtils.ViewVisitor
    public boolean run(View view) {
        boolean lambda$hasChildViewOfType$0;
        lambda$hasChildViewOfType$0 = ViewUtils.lambda$hasChildViewOfType$0((Class[]) this.f331b, view);
        return lambda$hasChildViewOfType$0;
    }

    public /* synthetic */ a(C0255a c0255a, Object obj, int i4) {
        this.f330a = i4;
        this.f331b = obj;
    }

    @Override // com.startapp.sdk.internal.i2
    public void a(Bitmap bitmap, int i4) {
        ((ImageResourceConfig) this.f331b).a(bitmap, i4);
    }

    public /* synthetic */ a(C0255a c0255a, Object obj, long j4) {
        this.f330a = 21;
        this.f331b = obj;
    }

    @Override // com.startapp.sdk.internal.zi
    public void a(List list, VASTErrorCodes vASTErrorCodes) {
        i8.a((i8) this.f331b, list, vASTErrorCodes);
    }

    public /* synthetic */ a(C0255a c0255a, C1377t c1377t, n0.g gVar, IOException iOException, boolean z) {
        this.f330a = 20;
        this.f331b = gVar;
    }

    @Override // X.t
    public void a(long j4, W.u uVar) {
        switch (this.f330a) {
            case Build.API_LEVELS.API_28 /* 28 */:
                AbstractC1569a.f(j4, uVar, ((B) this.f331b).f8505c);
                break;
            default:
                AbstractC1569a.g(j4, uVar, ((B) this.f331b).f8505c);
                break;
        }
    }
}
