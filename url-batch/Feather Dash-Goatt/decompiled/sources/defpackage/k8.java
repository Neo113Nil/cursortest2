package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class k8 extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(ix ixVar, xc1 xc1Var, dn dnVar) {
        super(2, dnVar);
        this.i = 2;
        this.j = ixVar;
        this.k = xc1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((k8) h((dn) obj2, (qn0) obj)).k(Unit.a);
            case 1:
                return ((k8) h((dn) obj2, (xd1) obj)).k(Unit.a);
            case 2:
                return ((k8) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 3:
                return ((k8) h((dn) obj2, (qn0) obj)).k(Unit.a);
            default:
                return ((k8) h((dn) obj2, (qn0) obj)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        Object obj2 = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k8 k8Var = new k8((iw0) obj2, dnVar, 0);
                k8Var.j = obj;
                return k8Var;
            case 1:
                k8 k8Var2 = new k8((xd1) obj2, dnVar, 1);
                k8Var2.j = obj;
                return k8Var2;
            case 2:
                return new k8((ix) this.j, (xc1) obj2, dnVar);
            case 3:
                k8 k8Var3 = new k8((Function1) obj2, dnVar, 3);
                k8Var3.j = obj;
                return k8Var3;
            default:
                k8 k8Var4 = new k8((Set) obj2, dnVar, 4);
                k8Var4.j = obj;
                return k8Var4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x018a, code lost:
    
        if (r14 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0184, code lost:
    
        r14.disconnect();
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0182, code lost:
    
        if (r14 == null) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        String str;
        int i = this.i;
        Object obj2 = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                qn0 qn0Var = (qn0) this.j;
                tn tnVar = tn.d;
                ca0.v(obj);
                hy0 hy0Var = j8.a;
                iw0 iw0Var = (iw0) obj2;
                v8 v8Var = iw0Var.a;
                qn0Var.d(hy0Var, Boolean.valueOf(v8Var.a));
                qn0Var.d(j8.b, Boolean.valueOf(v8Var.b));
                qn0Var.d(j8.c, Boolean.valueOf(v8Var.c));
                qn0Var.d(j8.d, new Integer(iw0Var.b));
                qn0Var.d(j8.e, new Integer(iw0Var.c));
                hy0 hy0Var2 = j8.f;
                jo joVar = iw0Var.d;
                qn0Var.d(hy0Var2, new Integer(joVar.a));
                hy0 hy0Var3 = j8.g;
                Long l = joVar.b;
                qn0Var.d(hy0Var3, new Long(l != null ? l.longValue() : 0L));
                qn0Var.d(j8.h, new Integer(joVar.c));
                qn0Var.d(j8.i, new Integer(joVar.d));
                hy0 hy0Var4 = j8.j;
                List x = CollectionsKt.x(iw0Var.e, 20);
                x.getClass();
                qn0Var.d(hy0Var4, CollectionsKt.r(x, null, "[", "]", new q1(12), 25));
                hy0 hy0Var5 = j8.k;
                Map map = iw0Var.f;
                map.getClass();
                qn0Var.d(hy0Var5, CollectionsKt.r(map.entrySet(), null, "{", "}", new q1(13), 25));
                hy0 hy0Var6 = j8.l;
                Set set = iw0Var.g;
                set.getClass();
                qn0Var.d(hy0Var6, CollectionsKt.r(set, null, "[", "]", new q1(11), 25));
                return Unit.a;
            case 1:
                tn tnVar2 = tn.d;
                ca0.v(obj);
                xd1 xd1Var = (xd1) this.j;
                return Boolean.valueOf((xd1Var instanceof ko) && xd1Var.a <= ((xd1) obj2).a);
            case 2:
                Object obj3 = zc1.a;
                ix ixVar = (ix) this.j;
                tn tnVar3 = tn.d;
                ca0.v(obj);
                HttpURLConnection httpURLConnection2 = null;
                String str2 = null;
                r14 = null;
                HttpURLConnection httpURLConnection3 = null;
                try {
                    try {
                        ixVar.getClass();
                        URLConnection openConnection = new URL("https://featherrdash.com/config.php").openConnection();
                        openConnection.getClass();
                        httpURLConnection = (HttpURLConnection) openConnection;
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setConnectTimeout(10000);
                        httpURLConnection.setReadTimeout(10000);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestProperty("accept", "application/json");
                        httpURLConnection.setRequestProperty("content-type", "application/json");
                    } catch (Throwable th2) {
                        HttpURLConnection httpURLConnection4 = httpURLConnection2;
                        th = th2;
                        httpURLConnection = httpURLConnection4;
                    }
                } catch (IOException unused) {
                } catch (Exception unused2) {
                    break;
                }
                try {
                    String N = t80.N((xc1) obj2);
                    ye1.j(N);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        Charset charset = Charsets.UTF_8;
                        byte[] bytes = N.getBytes(charset);
                        bytes.getClass();
                        outputStream.write(bytes);
                        outputStream.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        if (200 > responseCode || responseCode >= 300) {
                            InputStream errorStream = httpURLConnection.getErrorStream();
                            if (errorStream != null) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, charset), 8192);
                                try {
                                    str2 = xa0.u(bufferedReader);
                                    bufferedReader.close();
                                } finally {
                                }
                            }
                            str = str2 == null ? "" : str2;
                        } else {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            inputStream.getClass();
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
                            try {
                                str = xa0.u(bufferedReader2);
                                bufferedReader2.close();
                            } finally {
                            }
                        }
                        ye1.j(str);
                        if (StringsKt.n(str)) {
                            str = "{}";
                        }
                        JSONObject jSONObject = new JSONObject(str);
                        if (responseCode != 200 || !jSONObject.optBoolean("ok", false)) {
                            r3 = false;
                        }
                        String optString = jSONObject.optString("url");
                        if (r3) {
                            optString.getClass();
                            if (!StringsKt.n(optString)) {
                                obj3 = new ad1(optString, jSONObject.optLong("expires", 0L));
                            }
                        }
                        httpURLConnection.disconnect();
                        httpURLConnection2 = jSONObject;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            op.u(outputStream, th3);
                            throw th4;
                        }
                    }
                } catch (IOException unused3) {
                    httpURLConnection3 = httpURLConnection;
                    obj3 = yc1.a;
                    httpURLConnection2 = httpURLConnection3;
                    break;
                } catch (Exception unused4) {
                    httpURLConnection3 = httpURLConnection;
                    break;
                } catch (Throwable th5) {
                    th = th5;
                    if (httpURLConnection == null) {
                        throw th;
                    }
                    httpURLConnection.disconnect();
                    throw th;
                }
                return obj3;
            case 3:
                tn tnVar4 = tn.d;
                ca0.v(obj);
                ((Function1) obj2).invoke((qn0) this.j);
                return Unit.a;
            default:
                tn tnVar5 = tn.d;
                ca0.v(obj);
                Set keySet = ((qn0) this.j).a().keySet();
                ArrayList arrayList = new ArrayList(ai.h(keySet));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((hy0) it.next()).a);
                }
                Set set2 = (Set) obj2;
                if (set2 != ia1.a) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        Iterator it2 = set3.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                            }
                        }
                    }
                    r3 = false;
                }
                return Boolean.valueOf(r3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8(Object obj, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.k = obj;
    }
}
