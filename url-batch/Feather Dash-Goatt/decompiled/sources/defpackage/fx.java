package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fx extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx(String str, Object obj, Object obj2, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.j = str;
        this.k = obj;
        this.l = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((fx) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 1:
                return ((fx) h((dn) obj2, (qn0) obj)).k(Unit.a);
            default:
                return ((fx) h((dn) obj2, (sn) obj)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new fx((String) this.j, (String) obj3, (String) obj2, dnVar, 0);
            case 1:
                fx fxVar = new fx((hy0) obj3, (Long) obj2, dnVar);
                fxVar.j = obj;
                return fxVar;
            default:
                return new fx((String) this.j, (Function0) obj3, (ao0) obj2, dnVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0134, code lost:
    
        if (r7 == null) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013a  */
    /* JADX WARN: Type inference failed for: r7v0, types: [fx] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.net.HttpURLConnection] */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        String str;
        BufferedReader bufferedReader;
        int i = this.i;
        Object obj2 = this.k;
        Object obj3 = this.l;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                ca0.v(obj);
                Map map = null;
                try {
                    try {
                        hx hxVar = hx.a;
                        String str2 = (String) this.j;
                        Charset charset = Charsets.UTF_8;
                        String encode = URLEncoder.encode(str2, charset.name());
                        encode.getClass();
                        String encode2 = URLEncoder.encode((String) obj2, charset.name());
                        encode2.getClass();
                        String encode3 = URLEncoder.encode((String) obj3, charset.name());
                        encode3.getClass();
                        URLConnection openConnection = new URL("https://gcdsdk.appsflyer.com/install_data/v4.0/" + encode + "?devkey=" + encode2 + "&device_id=" + encode3).openConnection();
                        openConnection.getClass();
                        httpURLConnection = (HttpURLConnection) openConnection;
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setConnectTimeout(10000);
                        httpURLConnection.setReadTimeout(10000);
                        httpURLConnection.setRequestProperty("accept", "application/json");
                        try {
                            int responseCode = httpURLConnection.getResponseCode();
                            if (200 > responseCode || responseCode >= 300) {
                                InputStream errorStream = httpURLConnection.getErrorStream();
                                if (errorStream != null) {
                                    bufferedReader = new BufferedReader(new InputStreamReader(errorStream, charset), 8192);
                                    try {
                                        str = xa0.u(bufferedReader);
                                        bufferedReader.close();
                                    } finally {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str = "";
                                }
                            } else {
                                InputStream inputStream = httpURLConnection.getInputStream();
                                inputStream.getClass();
                                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
                                try {
                                    str = xa0.u(bufferedReader);
                                    bufferedReader.close();
                                } finally {
                                }
                            }
                            ye1.j(str);
                            if (responseCode == 200) {
                                if (StringsKt.n(str)) {
                                    str = "{}";
                                }
                                Map c = hx.c(new JSONObject(str));
                                if (!c.isEmpty()) {
                                    map = c;
                                }
                            }
                        } catch (IOException unused) {
                            hx hxVar2 = hx.a;
                            break;
                        } catch (Exception unused2) {
                            hx hxVar3 = hx.a;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return map;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (this != 0) {
                            this.disconnect();
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                    httpURLConnection = null;
                } catch (Exception unused4) {
                    httpURLConnection = null;
                } catch (Throwable th3) {
                    th = th3;
                    this = 0;
                    if (this != 0) {
                    }
                    throw th;
                }
                httpURLConnection.disconnect();
                return map;
            case 1:
                tn tnVar2 = tn.d;
                ca0.v(obj);
                ((qn0) this.j).d((hy0) obj2, (Long) obj3);
                return Unit.a;
            default:
                tn tnVar3 = tn.d;
                ca0.v(obj);
                String str3 = (String) this.j;
                if (str3 != null && !StringsKt.n(str3)) {
                    ((ao0) obj3).setValue(str3);
                    ((Function0) obj2).invoke();
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(hy0 hy0Var, Long l, dn dnVar) {
        super(2, dnVar);
        this.i = 1;
        this.k = hy0Var;
        this.l = l;
    }
}
