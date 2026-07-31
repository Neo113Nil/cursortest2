package H0;

import android.text.TextUtils;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: o, reason: collision with root package name */
    private static final String f732o = "d";

    /* renamed from: a, reason: collision with root package name */
    private Map f733a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f734b;

    /* renamed from: c, reason: collision with root package name */
    private int f735c;

    /* renamed from: d, reason: collision with root package name */
    private long f736d;

    /* renamed from: e, reason: collision with root package name */
    private long f737e;

    /* renamed from: f, reason: collision with root package name */
    private long f738f;

    /* renamed from: g, reason: collision with root package name */
    private String f739g;

    /* renamed from: h, reason: collision with root package name */
    private int f740h;

    /* renamed from: i, reason: collision with root package name */
    private int f741i;

    /* renamed from: j, reason: collision with root package name */
    private String f742j;

    /* renamed from: k, reason: collision with root package name */
    private long f743k;

    /* renamed from: l, reason: collision with root package name */
    private String f744l;

    /* renamed from: m, reason: collision with root package name */
    private Exception f745m;

    /* renamed from: n, reason: collision with root package name */
    private String f746n;

    public d(int i4, Map map, byte[] bArr, long j4) {
        this.f740h = 2;
        this.f741i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f742j = "";
        this.f743k = 0L;
        this.f744l = "";
        this.f735c = i4;
        this.f733a = map;
        this.f734b = ByteBuffer.wrap(bArr).array();
        this.f736d = j4;
        H();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0053, code lost:
    
        if (r8.getInt("resultCode") == 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void E() {
        int i4;
        if (B()) {
            Logger.i(f732o, "GRSSDK get httpcode{304} not any changed.");
            l(1);
            return;
        }
        if (!D()) {
            Logger.i(f732o, "GRSSDK parse server body all failed.");
            l(2);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(StringUtils.byte2Str(this.f734b));
            if (jSONObject.has("isSuccess")) {
                if (jSONObject.getInt("isSuccess") == 1) {
                    i4 = 1;
                }
                i4 = 2;
            } else if (!jSONObject.has("resultCode")) {
                Logger.e(f732o, "sth. wrong because server errorcode's key.");
                i4 = -1;
            }
            if (i4 != 1 && jSONObject.has("services")) {
                i4 = 0;
            }
            l(i4);
            if (i4 == 1 || i4 == 0) {
                u(jSONObject.has("services") ? jSONObject.getJSONObject("services").toString() : "");
                s(jSONObject.has("errorList") ? jSONObject.getJSONObject("errorList").toString() : "");
            } else {
                g(jSONObject.has("errorCode") ? jSONObject.getInt("errorCode") : ConnectionResult.RESOLUTION_REQUIRED);
                q(jSONObject.has("errorDesc") ? jSONObject.getString("errorDesc") : "");
            }
        } catch (JSONException e4) {
            Logger.w(f732o, "GrsResponse GrsResponse(String result) JSONException: %s", StringUtils.anonymizeMessage(e4.getMessage()));
            l(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: JSONException -> 0x0032, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0032, blocks: (B:14:0x0025, B:16:0x002b, B:19:0x003a, B:21:0x0040, B:25:0x0034), top: B:13:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void F() {
        if (!D() && !C() && !B()) {
            return;
        }
        Map G3 = G();
        if (G3.size() <= 0) {
            Logger.w(f732o, "parseHeader {headers.size() <= 0}");
            return;
        }
        try {
            if (!D()) {
                if (B()) {
                }
                if (C()) {
                    return;
                }
                o(G3);
                return;
            }
            j(G3);
            e(G3);
            if (C()) {
            }
        } catch (JSONException e4) {
            Logger.w(f732o, "parseHeader catch JSONException: %s", StringUtils.anonymizeMessage(e4.getMessage()));
        }
    }

    private Map G() {
        HashMap hashMap = new HashMap(16);
        Map map = this.f733a;
        if (map == null || map.size() <= 0) {
            Logger.v(f732o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
            return hashMap;
        }
        for (Map.Entry entry : this.f733a.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                hashMap.put(str, (String) it.next());
            }
        }
        return hashMap;
    }

    private void H() {
        F();
        E();
    }

    private void e(Map map) {
        if (!map.containsKey("ETag")) {
            Logger.i(f732o, "Response Heads has not Etag");
            return;
        }
        String str = (String) map.get("ETag");
        if (TextUtils.isEmpty(str)) {
            Logger.i(f732o, "The Response Heads Etag is Empty");
        } else {
            Logger.i(f732o, "success get Etag from server");
            d(str);
        }
    }

    private void g(int i4) {
        this.f741i = i4;
    }

    private void j(Map map) {
        long time;
        if (map.containsKey("Cache-Control")) {
            String str = (String) map.get("Cache-Control");
            if (!TextUtils.isEmpty(str) && str.contains("max-age=")) {
                try {
                    time = Long.parseLong(str.substring(str.indexOf("max-age=") + 8));
                } catch (NumberFormatException e4) {
                    e = e4;
                    time = 0;
                }
                try {
                    Logger.v(f732o, "Cache-Control value{%s}", Long.valueOf(time));
                } catch (NumberFormatException e5) {
                    e = e5;
                    Logger.w(f732o, "getExpireTime addHeadersToResult NumberFormatException", e);
                    if (time > 0) {
                    }
                    time = 86400;
                    long j4 = time * 1000;
                    Logger.i(f732o, "convert expireTime{%s}", Long.valueOf(j4));
                    n(String.valueOf(j4 + System.currentTimeMillis()));
                }
            }
            time = 0;
        } else {
            if (map.containsKey("Expires")) {
                String str2 = (String) map.get("Expires");
                Logger.v(f732o, "expires is{%s}", str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
                String str3 = map.containsKey("Date") ? (String) map.get("Date") : null;
                try {
                    time = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
                } catch (ParseException e6) {
                    Logger.w(f732o, "getExpireTime ParseException.", e6);
                }
            } else {
                Logger.i(f732o, "response headers neither contains Cache-Control nor Expires.");
            }
            time = 0;
        }
        if (time > 0 || time > 2592000) {
            time = 86400;
        }
        long j42 = time * 1000;
        Logger.i(f732o, "convert expireTime{%s}", Long.valueOf(j42));
        n(String.valueOf(j42 + System.currentTimeMillis()));
    }

    private void l(int i4) {
        this.f740h = i4;
    }

    private void m(long j4) {
        this.f743k = j4;
    }

    private void n(String str) {
        this.f742j = str;
    }

    private void o(Map map) {
        long j4;
        if (map.containsKey("Retry-After")) {
            String str = (String) map.get("Retry-After");
            if (!TextUtils.isEmpty(str)) {
                try {
                    j4 = Long.parseLong(str);
                } catch (NumberFormatException e4) {
                    Logger.w(f732o, "getRetryAfter addHeadersToResult NumberFormatException", e4);
                }
                long j5 = j4 * 1000;
                Logger.v(f732o, "convert retry-afterTime{%s}", Long.valueOf(j5));
                m(j5);
            }
        }
        j4 = 0;
        long j52 = j4 * 1000;
        Logger.v(f732o, "convert retry-afterTime{%s}", Long.valueOf(j52));
        m(j52);
    }

    private void u(String str) {
        this.f739g = str;
    }

    public String A() {
        return this.f746n;
    }

    public boolean B() {
        return this.f735c == 304;
    }

    public boolean C() {
        return this.f735c == 503;
    }

    public boolean D() {
        return this.f735c == 200;
    }

    public String a() {
        return this.f742j;
    }

    public void c(long j4) {
        this.f738f = j4;
    }

    public void d(String str) {
        this.f744l = str;
    }

    public int f() {
        return this.f735c;
    }

    public void h(long j4) {
        this.f737e = j4;
    }

    public void i(String str) {
        this.f746n = str;
    }

    public int k() {
        return this.f741i;
    }

    public Exception p() {
        return this.f745m;
    }

    public String r() {
        return this.f744l;
    }

    public int t() {
        return this.f740h;
    }

    public long v() {
        return this.f738f;
    }

    public long w() {
        return this.f737e;
    }

    public long x() {
        return this.f736d;
    }

    public String y() {
        return this.f739g;
    }

    public long z() {
        return this.f743k;
    }

    public d(Exception exc, long j4) {
        this.f735c = 0;
        this.f740h = 2;
        this.f741i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f742j = "";
        this.f743k = 0L;
        this.f744l = "";
        this.f745m = exc;
        this.f736d = j4;
    }

    private void q(String str) {
    }

    private void s(String str) {
    }

    public void b(int i4) {
    }
}
