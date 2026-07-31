package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.C1513m5;
import com.ironsource.C1529o5;
import com.ironsource.InterfaceC1555s4;
import com.ironsource.cc;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.jn;
import com.ironsource.mb;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.ms;
import com.ironsource.o9;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f17544a = "1";

    /* renamed from: b, reason: collision with root package name */
    private final String f17545b = "102";

    /* renamed from: c, reason: collision with root package name */
    private final String f17546c = "102";

    /* renamed from: d, reason: collision with root package name */
    private final String f17547d = "GenericNotifications";

    /* renamed from: e, reason: collision with root package name */
    private f f17548e;

    /* renamed from: f, reason: collision with root package name */
    private IronSource.AD_UNIT f17549f;

    /* renamed from: g, reason: collision with root package name */
    private C1529o5 f17550g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC1555s4 f17551h;

    /* renamed from: i, reason: collision with root package name */
    private ISBannerSize f17552i;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        protected InterfaceC1555s4 f17553a;

        /* renamed from: b, reason: collision with root package name */
        protected d.a f17554b;

        /* renamed from: c, reason: collision with root package name */
        protected int f17555c;

        /* renamed from: d, reason: collision with root package name */
        protected String f17556d;

        /* renamed from: e, reason: collision with root package name */
        protected long f17557e;

        /* renamed from: f, reason: collision with root package name */
        protected int f17558f;

        /* renamed from: h, reason: collision with root package name */
        private int f17560h;

        /* renamed from: k, reason: collision with root package name */
        private final URL f17563k;

        /* renamed from: l, reason: collision with root package name */
        private final JSONObject f17564l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f17565m;

        /* renamed from: n, reason: collision with root package name */
        private final int f17566n;

        /* renamed from: o, reason: collision with root package name */
        private final long f17567o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f17568p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f17569q;

        /* renamed from: g, reason: collision with root package name */
        protected String f17559g = "other";

        /* renamed from: i, reason: collision with root package name */
        protected String f17561i = "";

        /* renamed from: j, reason: collision with root package name */
        protected int f17562j = 0;

        public a(InterfaceC1555s4 interfaceC1555s4, URL url, JSONObject jSONObject, boolean z4, int i4, long j4, boolean z5, boolean z6, int i5) {
            this.f17553a = interfaceC1555s4;
            this.f17563k = url;
            this.f17564l = jSONObject;
            this.f17565m = z4;
            this.f17566n = i4;
            this.f17567o = j4;
            this.f17568p = z5;
            this.f17569q = z6;
            this.f17560h = i5;
        }

        private String a() {
            return this.f17560h == 2 ? mb.b().d() : mb.b().c();
        }

        private JSONObject b(String str, String str2) {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String decryptAndDecompress = IronSourceAES.decryptAndDecompress(str, str2);
            if (decryptAndDecompress != null) {
                return new JSONObject(decryptAndDecompress);
            }
            throw new JSONException("decompression error");
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean b4 = b();
            InterfaceC1555s4 interfaceC1555s4 = this.f17553a;
            if (interfaceC1555s4 == null) {
                return;
            }
            a(b4, interfaceC1555s4, new Date().getTime() - this.f17557e);
        }

        private String a(HttpURLConnection httpURLConnection) {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        }

        protected boolean b() {
            long time;
            int responseCode;
            String str;
            this.f17557e = new Date().getTime();
            try {
                this.f17560h = this.f17562j == 1015 ? 1 : this.f17560h;
                this.f17558f = 0;
                HttpURLConnection httpURLConnection = null;
                while (true) {
                    int i4 = this.f17558f;
                    int i5 = this.f17566n;
                    if (i4 >= i5) {
                        this.f17558f = i5 - 1;
                        this.f17559g = "trials_fail";
                        return false;
                    }
                    try {
                        time = new Date().getTime();
                        String str2 = "Auction Handler: auction trial " + (this.f17558f + 1) + " out of " + this.f17566n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 0);
                        IronSourceUtils.sendAutomationLog(str2);
                        httpURLConnection = a(this.f17563k, this.f17567o);
                        a(httpURLConnection, this.f17564l, this.f17568p);
                        responseCode = httpURLConnection.getResponseCode();
                    } catch (SocketTimeoutException e4) {
                        o9.d().a(e4);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f17555c = 1006;
                        this.f17556d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e4.getMessage());
                    } catch (Throwable th) {
                        o9.d().a(th);
                        IronLog.INTERNAL.error("getting exception " + th);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.f17555c = 1000;
                        this.f17556d = th.getMessage();
                        this.f17559g = "other";
                        return false;
                    }
                    if (responseCode == 200 || responseCode == 204) {
                        try {
                            a(a(httpURLConnection), this.f17565m, this.f17569q);
                            httpURLConnection.disconnect();
                            return true;
                        } catch (JSONException e5) {
                            o9.d().a(e5);
                            if (e5.getMessage() != null && e5.getMessage().equalsIgnoreCase("decryption error")) {
                                this.f17555c = 1003;
                                str = "Auction decryption error";
                            } else if (e5.getMessage() == null || !e5.getMessage().equalsIgnoreCase("decompression error")) {
                                this.f17555c = 1002;
                                str = "Auction parsing error";
                            } else {
                                this.f17555c = 1008;
                                str = "Auction decompression error";
                            }
                            this.f17556d = str;
                            this.f17559g = "parsing";
                            IronLog.INTERNAL.error("Auction handle response exception " + e5.getMessage());
                            httpURLConnection.disconnect();
                            return false;
                        }
                    }
                    this.f17555c = 1001;
                    String str3 = "Auction response code not valid, error code response from server - " + responseCode;
                    this.f17556d = str3;
                    IronLog.INTERNAL.error(str3);
                    httpURLConnection.disconnect();
                    if (this.f17558f < this.f17566n - 1) {
                        a(this.f17567o, time);
                    }
                    this.f17558f++;
                }
            } catch (Exception e6) {
                o9.d().a(e6);
                this.f17555c = 1007;
                this.f17556d = e6.getMessage();
                this.f17558f = 0;
                this.f17559g = "other";
                IronLog.INTERNAL.error("Auction request exception " + e6.getMessage());
                return false;
            }
        }

        private HttpURLConnection a(URL url, long j4) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(jn.f16865b);
            httpURLConnection.setRequestProperty(cc.f15718K, "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j4);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        private JSONObject a(String str, String str2) {
            String decode = IronSourceAES.decode(str, str2);
            if (TextUtils.isEmpty(decode)) {
                throw new JSONException("decryption error");
            }
            return new JSONObject(decode);
        }

        protected JSONObject a(JSONObject jSONObject, boolean z4) {
            String a4 = a();
            String string = jSONObject.getString(this.f17560h == 2 ? "ct" : ms.f18193n);
            return z4 ? b(a4, string) : a(a4, string);
        }

        private void a(long j4, long j5) {
            long time = j4 - (new Date().getTime() - j5);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        protected void a(String str, boolean z4, boolean z5) {
            if (TextUtils.isEmpty(str)) {
                throw new JSONException("empty response");
            }
            JSONObject jSONObject = new JSONObject(str);
            if (z4) {
                jSONObject = a(jSONObject, z5);
            }
            d.a a4 = d.b().a(jSONObject);
            this.f17554b = a4;
            this.f17555c = a4.c();
            this.f17556d = this.f17554b.d();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z4) {
            String a4;
            String encode;
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.f17560h == 2) {
                try {
                    a4 = mb.b().a();
                } catch (JSONException e4) {
                    o9.d().a(e4);
                    this.f17561i = e4.getLocalizedMessage();
                    this.f17562j = 1015;
                    this.f17560h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e4.getMessage());
                }
                String jSONObject2 = jSONObject.toString();
                String a5 = a();
                if (z4) {
                    encode = IronSourceAES.encode(a5, jSONObject2);
                } else {
                    IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                    encode = IronSourceAES.compressAndEncrypt(a5, jSONObject2);
                }
                bufferedWriter.write(this.f17560h != 2 ? String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", a4, encode) : String.format("{\"request\" : \"%1$s\"}", encode));
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStreamWriter.close();
                outputStream.close();
            }
            a4 = "";
            String jSONObject22 = jSONObject.toString();
            String a52 = a();
            if (z4) {
            }
            bufferedWriter.write(this.f17560h != 2 ? String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", a4, encode) : String.format("{\"request\" : \"%1$s\"}", encode));
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }

        protected void a(boolean z4, InterfaceC1555s4 interfaceC1555s4, long j4) {
            if (z4) {
                interfaceC1555s4.a(this.f17554b.h(), this.f17554b.a(), this.f17554b.e(), this.f17554b.f(), this.f17554b.b(), this.f17558f + 1, j4, this.f17562j, this.f17561i);
            } else {
                interfaceC1555s4.a(this.f17555c, this.f17556d, this.f17558f + 1, this.f17559g, j4);
            }
        }
    }

    @Deprecated
    public e(IronSource.AD_UNIT ad_unit, C1529o5 c1529o5, InterfaceC1555s4 interfaceC1555s4) {
        this.f17549f = ad_unit;
        this.f17550g = c1529o5;
        this.f17551h = interfaceC1555s4;
    }

    private JSONObject a(Map<String, Object> map, List<String> list, h hVar, int i4, boolean z4, IronSourceSegment ironSourceSegment) {
        i iVar = new i(this.f17549f);
        iVar.a(map);
        iVar.a(list);
        iVar.a(hVar);
        iVar.a(i4);
        iVar.a(this.f17552i);
        iVar.a(ironSourceSegment);
        iVar.b(z4);
        return d.b().a(iVar);
    }

    public e(f fVar) {
        this.f17548e = fVar;
    }

    public void a(Context context, i iVar, InterfaceC1555s4 interfaceC1555s4) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f17548e.a(context, iVar, interfaceC1555s4));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("execute auction exception " + e4.getMessage());
            if (interfaceC1555s4 != null) {
                interfaceC1555s4.a(1000, e4.getMessage(), 0, "other", 0L);
            }
        }
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i4, IronSourceSegment ironSourceSegment) {
        try {
            boolean isEncryptedResponse = IronSourceUtils.isEncryptedResponse();
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(this.f17551h, new URL(this.f17550g.a(false)), a(map, list, hVar, i4, isEncryptedResponse, ironSourceSegment), isEncryptedResponse, this.f17550g.g(), this.f17550g.m(), this.f17550g.n(), this.f17550g.o(), this.f17550g.d()));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("execute auction exception " + e4.getMessage());
            this.f17551h.a(1000, e4.getMessage(), 0, "other", 0L);
        }
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i4, IronSourceSegment ironSourceSegment, ISBannerSize iSBannerSize) {
        this.f17552i = iSBannerSize;
        a(context, map, list, hVar, i4, ironSourceSegment);
    }

    public void a(C1513m5 c1513m5, int i4, C1513m5 c1513m52) {
        Iterator<String> it = c1513m5.h().iterator();
        while (it.hasNext()) {
            C1513m5 c1513m53 = c1513m5;
            int i5 = i4;
            d.b().a("reportLoadSuccess", c1513m53.c(), d.b().a(it.next(), i5, c1513m53, "", "", ""));
            i4 = i5;
            c1513m5 = c1513m53;
        }
        C1513m5 c1513m54 = c1513m5;
        int i6 = i4;
        if (c1513m52 != null) {
            Iterator<String> it2 = c1513m52.h().iterator();
            while (it2.hasNext()) {
                d.b().a("reportLoadSuccess", "GenericNotifications", d.b().a(it2.next(), i6, c1513m54, "", "102", ""));
            }
        }
    }

    public void a(C1513m5 c1513m5, int i4, C1513m5 c1513m52, String str) {
        Iterator<String> it = c1513m5.b().iterator();
        while (it.hasNext()) {
            C1513m5 c1513m53 = c1513m5;
            int i5 = i4;
            String str2 = str;
            d.b().a("reportImpression", c1513m53.c(), d.b().a(it.next(), i5, c1513m53, "", "", str2));
            i4 = i5;
            c1513m5 = c1513m53;
            str = str2;
        }
        C1513m5 c1513m54 = c1513m5;
        int i6 = i4;
        String str3 = str;
        if (c1513m52 != null) {
            Iterator<String> it2 = c1513m52.b().iterator();
            while (it2.hasNext()) {
                d.b().a("reportImpression", "GenericNotifications", d.b().a(it2.next(), i6, c1513m54, "", "102", str3));
            }
        }
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, C1513m5> concurrentHashMap, int i4, C1513m5 c1513m5, C1513m5 c1513m52) {
        int j4 = c1513m52.j();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            String str = arrayList.get(i5);
            i5++;
            String str2 = str;
            if (!str2.equals(c1513m52.c())) {
                C1513m5 c1513m53 = concurrentHashMap.get(str2);
                int j5 = c1513m53.j();
                String i6 = c1513m53.i();
                String str3 = j5 < j4 ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + c1513m53.c() + ", instancePriceOrder= " + j5 + ", loseReasonCode=" + str3 + ", winnerInstance=" + c1513m52.c() + ", winnerInstancePriceOrder=" + j4);
                Iterator<String> it = c1513m53.g().iterator();
                while (it.hasNext()) {
                    d.b().a("reportAuctionLose", c1513m53.c(), d.b().a(it.next(), i4, c1513m52, i6, str3, ""));
                }
            }
        }
        if (c1513m5 != null) {
            Iterator<String> it2 = c1513m5.g().iterator();
            while (it2.hasNext()) {
                d.b().a("reportAuctionLose", "GenericNotifications", d.b().a(it2.next(), i4, c1513m52, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<y> copyOnWriteArrayList, ConcurrentHashMap<String, C1513m5> concurrentHashMap, int i4, C1513m5 c1513m5, C1513m5 c1513m52) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<y> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i4, c1513m5, c1513m52);
    }

    public boolean a() {
        return this.f17548e.a();
    }
}
