package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.JsonReader;
import android.util.JsonToken;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccs implements cfb {
    final URL a;
    private final ConnectivityManager b;
    private final Context c;
    private final kee d;

    public ccs(Context context) {
        ibn ibnVar = new ibn();
        ccv ccvVar = ccv.a;
        ibnVar.a(cdo.class, ccvVar);
        ibnVar.a(cdf.class, ccvVar);
        cdc cdcVar = cdc.a;
        ibnVar.a(cdy.class, cdcVar);
        ibnVar.a(cdm.class, cdcVar);
        ccw ccwVar = ccw.a;
        ibnVar.a(cdq.class, ccwVar);
        ibnVar.a(cdg.class, ccwVar);
        ccu ccuVar = ccu.a;
        ibnVar.a(cct.class, ccuVar);
        ibnVar.a(cde.class, ccuVar);
        cdb cdbVar = cdb.a;
        ibnVar.a(cdx.class, cdbVar);
        ibnVar.a(cdl.class, cdbVar);
        ccx ccxVar = ccx.a;
        ibnVar.a(cds.class, ccxVar);
        ibnVar.a(cdh.class, ccxVar);
        cda cdaVar = cda.a;
        ibnVar.a(cdv.class, cdaVar);
        ibnVar.a(cdk.class, cdaVar);
        ccz cczVar = ccz.a;
        ibnVar.a(cdu.class, cczVar);
        ibnVar.a(cdj.class, cczVar);
        cdd cddVar = cdd.a;
        ibnVar.a(cec.class, cddVar);
        ibnVar.a(cdn.class, cddVar);
        ccy ccyVar = ccy.a;
        ibnVar.a(cdt.class, ccyVar);
        ibnVar.a(cdi.class, ccyVar);
        ibnVar.b();
        this.d = new kee(ibnVar);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.a = d(ccq.a);
    }

    private static URL d(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: ".concat(String.valueOf(str)), e);
        }
    }

    @Override // defpackage.cfb
    public final ceo a(ceo ceoVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        cen c = ceoVar.c();
        c.c("sdk-version", Build.VERSION.SDK_INT);
        c.d("model", Build.MODEL);
        c.d("hardware", Build.HARDWARE);
        c.d("device", Build.DEVICE);
        c.d("product", Build.PRODUCT);
        c.d("os-uild", Build.ID);
        c.d("manufacturer", Build.MANUFACTURER);
        c.d("fingerprint", Build.FINGERPRINT);
        c.b().put("tz-offset", String.valueOf(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        c.c("net-type", activeNetworkInfo == null ? ceb.NONE.u : activeNetworkInfo.getType());
        int i = -1;
        if (activeNetworkInfo == null) {
            subtype = cea.UNKNOWN_MOBILE_SUBTYPE.v;
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = cea.COMBINED.v;
            } else if (cea.a(subtype) == null) {
                subtype = 0;
            }
        }
        c.c("mobile-subtype", subtype);
        c.d("country", Locale.getDefault().getCountry());
        c.d("locale", Locale.getDefault().getLanguage());
        Context context = this.c;
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        c.d("mcc_mnc", simOperator);
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            ow.r("CctTransportBackend", "Unable to find version code for package", e);
        }
        c.d("application_build", Integer.toString(i));
        return c.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x036a A[Catch: IOException -> 0x03be, TryCatch #1 {IOException -> 0x03be, blocks: (B:100:0x035c, B:101:0x0362, B:103:0x036a, B:105:0x0380, B:108:0x0384, B:110:0x038a, B:123:0x03a7, B:118:0x03ae, B:130:0x03b6), top: B:99:0x035c }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0380 A[Catch: IOException -> 0x03be, TryCatch #1 {IOException -> 0x03be, blocks: (B:100:0x035c, B:101:0x0362, B:103:0x036a, B:105:0x0380, B:108:0x0384, B:110:0x038a, B:123:0x03a7, B:118:0x03ae, B:130:0x03b6), top: B:99:0x035c }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x038a A[Catch: IOException -> 0x03be, TRY_LEAVE, TryCatch #1 {IOException -> 0x03be, blocks: (B:100:0x035c, B:101:0x0362, B:103:0x036a, B:105:0x0380, B:108:0x0384, B:110:0x038a, B:123:0x03a7, B:118:0x03ae, B:130:0x03b6), top: B:99:0x035c }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0384 A[EDGE_INSN: B:133:0x0384->B:108:0x0384 BREAK  A[LOOP:4: B:101:0x0362->B:132:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x037d  */
    @Override // defpackage.cfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cey b(cex cexVar) {
        String str;
        String str2;
        cfz cfzVar;
        int i;
        ccr c;
        int i2;
        String str3;
        Integer num;
        cdw cdwVar;
        Iterator it;
        Iterator it2;
        int i3;
        HashMap hashMap = new HashMap();
        for (ceo ceoVar : cexVar.a) {
            String str4 = ceoVar.a;
            if (hashMap.containsKey(str4)) {
                ((List) hashMap.get(str4)).add(ceoVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ceoVar);
                hashMap.put(str4, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = hashMap.entrySet().iterator();
        while (true) {
            String str5 = "UTF-8";
            if (!it3.hasNext()) {
                cdf cdfVar = new cdf(arrayList2);
                URL url = this.a;
                byte[] bArr = cexVar.b;
                if (bArr != null) {
                    try {
                        Set set = ccq.b;
                        String str6 = new String(bArr, Charset.forName("UTF-8"));
                        if (!str6.startsWith("1$")) {
                            throw new IllegalArgumentException("Version marker missing from extras");
                        }
                        String[] split = str6.substring(2).split(Pattern.quote("\\"), 2);
                        if (split.length != 2) {
                            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
                        }
                        String str7 = split[0];
                        if (str7.isEmpty()) {
                            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                        }
                        String str8 = split[1];
                        if (true == str8.isEmpty()) {
                            str8 = null;
                        }
                        ccq ccqVar = new ccq(str7, str8);
                        str = ccqVar.e;
                        if (str == null) {
                            str = null;
                        }
                        String str9 = ccqVar.d;
                        if (str9 != null) {
                            url = d(str9);
                        }
                    } catch (IllegalArgumentException unused) {
                        return new cey(3, -1L, null);
                    }
                } else {
                    str = null;
                }
                Iterable iterable = cexVar.a;
                Iterator it4 = iterable.iterator();
                try {
                    if (it4.hasNext()) {
                        str2 = ((ceo) it4.next()).h;
                        Iterator it5 = iterable.iterator();
                        while (it5.hasNext()) {
                            String str10 = ((ceo) it5.next()).h;
                            if (!Objects.equals(str2, str10)) {
                                ow.s("Invalid pseudonymous id event found: %s", str10);
                            }
                        }
                        cfzVar = new cfz(url, cdfVar, str, str2);
                        i = 5;
                        do {
                            c = c(cfzVar);
                            URL url2 = c.b;
                            cfzVar = url2 == null ? new cfz(url2, (cdo) cfzVar.c, (String) cfzVar.a, (String) cfzVar.d) : null;
                            if (cfzVar != null) {
                                break;
                            }
                            i--;
                        } while (i > 0);
                        i2 = c.a;
                        if (i2 != 200) {
                            return new cey(1, c.c, c.d);
                        }
                        if (i2 >= 500 || i2 == 404) {
                            return new cey(2, -1L, null);
                        }
                        if (i2 != 400) {
                            return new cey(3, -1L, null);
                        }
                        try {
                            return new cey(4, -1L, null);
                        } catch (IOException e) {
                            e = e;
                            ow.r("CctTransportBackend", "Could not make request to the backend", e);
                            return new cey(2, -1L, null);
                        }
                    }
                    cfzVar = new cfz(url, cdfVar, str, str2);
                    i = 5;
                    do {
                        c = c(cfzVar);
                        URL url22 = c.b;
                        if (url22 == null) {
                        }
                        if (cfzVar != null) {
                        }
                    } while (i > 0);
                    i2 = c.a;
                    if (i2 != 200) {
                    }
                } catch (IOException e2) {
                    e = e2;
                }
                str2 = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            ceo ceoVar2 = (ceo) ((List) entry.getValue()).get(0);
            ced cedVar = ced.a;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            cdg cdgVar = new cdg(cdp.b, new cde(Integer.valueOf(ceoVar2.a("sdk-version")), ceoVar2.d("model"), ceoVar2.d("hardware"), ceoVar2.d("device"), ceoVar2.d("product"), ceoVar2.d("os-uild"), ceoVar2.d("manufacturer"), ceoVar2.d("fingerprint"), ceoVar2.d("locale"), ceoVar2.d("country"), ceoVar2.d("mcc_mnc"), ceoVar2.d("application_build")));
            try {
                num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                str3 = null;
            } catch (NumberFormatException unused2) {
                str3 = (String) entry.getKey();
                num = null;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it6 = ((List) entry.getValue()).iterator();
            while (it6.hasNext()) {
                ceo ceoVar3 = (ceo) it6.next();
                cem cemVar = ceoVar3.c;
                ccl cclVar = cemVar.a;
                if (cclVar.equals(new ccl("proto"))) {
                    byte[] bArr2 = cemVar.b;
                    cdwVar = new cdw();
                    cdwVar.e = bArr2;
                } else if (cclVar.equals(new ccl("json"))) {
                    String str11 = new String(cemVar.b, Charset.forName(str5));
                    cdw cdwVar2 = new cdw();
                    cdwVar2.f = str11;
                    cdwVar = cdwVar2;
                } else {
                    ow.s("Received event of unsupported encoding %s. Skipping...", cclVar);
                    it3 = it3;
                }
                cdwVar.a = ceoVar3.d;
                byte b = cdwVar.j;
                cdwVar.j = (byte) (b | 1);
                cdwVar.d = ceoVar3.e;
                cdwVar.j = (byte) (b | 3);
                String str12 = (String) ceoVar3.f.get("tz-offset");
                cdwVar.g = str12 == null ? 0L : Long.valueOf(str12).longValue();
                cdwVar.j = (byte) (cdwVar.j | 4);
                cdwVar.h = new cdn((ceb) ceb.t.get(ceoVar3.a("net-type")), cea.a(ceoVar3.a("mobile-subtype")));
                Integer num2 = ceoVar3.b;
                if (num2 != null) {
                    cdwVar.b = num2;
                }
                Integer num3 = ceoVar3.g;
                if (num3 != null) {
                    cdwVar.c = new cdh(new cdk(new cdj(num3)), cdr.b);
                }
                byte[] bArr3 = ceoVar3.i;
                if (bArr3 == null && ceoVar3.j == null && ceoVar3.k == null) {
                    it = it3;
                    it2 = it6;
                } else {
                    if (bArr3 == null) {
                        bArr3 = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    List list = ceoVar3.k;
                    it = it3;
                    if (list != null) {
                        it2 = it6;
                        ArrayList arrayList5 = new ArrayList(list.size());
                        for (Iterator it7 = list.iterator(); it7.hasNext(); it7 = it7) {
                            arrayList5.add(Base64.encodeToString((byte[]) it7.next(), 2));
                        }
                        i3 = 2;
                        arrayList4.addAll(arrayList5);
                    } else {
                        it2 = it6;
                        i3 = 2;
                    }
                    byte[] bArr4 = ceoVar3.j;
                    if (bArr4 != null) {
                        arrayList4.add(Base64.encodeToString(bArr4, i3));
                    }
                    if (true == arrayList4.isEmpty()) {
                        arrayList4 = null;
                    }
                    cdwVar.i = new cdi(bArr3, arrayList4);
                }
                if (cdwVar.j != 7) {
                    StringBuilder sb = new StringBuilder();
                    if ((cdwVar.j & 1) == 0) {
                        sb.append(" eventTimeMs");
                    }
                    if ((cdwVar.j & 2) == 0) {
                        sb.append(" eventUptimeMs");
                    }
                    if ((cdwVar.j & 4) == 0) {
                        sb.append(" timezoneOffsetSeconds");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                arrayList3.add(new cdl(cdwVar.a, cdwVar.b, cdwVar.c, cdwVar.d, cdwVar.e, cdwVar.f, cdwVar.g, cdwVar.h, cdwVar.i));
                str5 = str5;
                it3 = it;
                it6 = it2;
            }
            arrayList2.add(new cdm(currentTimeMillis, elapsedRealtime, cdgVar, num, str3, arrayList3, cedVar));
        }
    }

    public final ccr c(cfz cfzVar) {
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URL) cfzVar.b).openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(130000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "4.1.2_1p"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        Object obj = cfzVar.d;
        if (obj != null) {
            httpURLConnection.setRequestProperty("Cookie", String.format("NID=%s", obj));
        }
        Object obj2 = cfzVar.a;
        if (obj2 != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", (String) obj2);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.d.a(cfzVar.c, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    httpURLConnection.getHeaderField("Content-Type");
                    httpURLConnection.getHeaderField("Content-Encoding");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new ccr(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L, null);
                    }
                    if (responseCode != 200) {
                        return new ccr(responseCode, null, 0L, null);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            JsonReader jsonReader = new JsonReader(new BufferedReader(new InputStreamReader(gZIPInputStream)));
                            try {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                                        cdz cdzVar = jsonReader.peek() == JsonToken.STRING ? new cdz(Long.parseLong(jsonReader.nextString())) : new cdz(jsonReader.nextLong());
                                        jsonReader.close();
                                        long j = cdzVar.a;
                                        String headerField = httpURLConnection.getHeaderField("Set-Cookie");
                                        if (headerField != null) {
                                            for (String str2 : headerField.split(";")) {
                                                String[] split = str2.trim().split("=", 2);
                                                if (split.length == 2) {
                                                    String str3 = split[0];
                                                    str = split[1];
                                                    if (str3.equals("NID")) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        str = null;
                                        ccr ccrVar = new ccr(200, null, j, str);
                                        if (gZIPInputStream != null) {
                                            gZIPInputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        return ccrVar;
                                    }
                                    jsonReader.skipValue();
                                }
                                throw new IOException("Response is missing nextRequestWaitMillis field.");
                            } catch (Throwable th) {
                                jsonReader.close();
                                throw th;
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ibe e) {
            e = e;
            ow.r("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ccr(400, null, 0L, null);
        } catch (ConnectException e2) {
            e = e2;
            ow.r("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ccr(500, null, 0L, null);
        } catch (UnknownHostException e3) {
            e = e3;
            ow.r("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new ccr(500, null, 0L, null);
        } catch (IOException e4) {
            e = e4;
            ow.r("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new ccr(400, null, 0L, null);
        }
    }
}
