package com.yanzhenjie.kalle;

import android.os.Build;
import android.text.TextUtils;
import com.baidu.ar.util.SystemInfoUtil;
import java.net.HttpCookie;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class i extends com.yanzhenjie.kalle.util.c {
    public static final String KEY_ACCEPT = "Accept";
    public static final String KEY_ACCEPT_ENCODING = "Accept-Encoding";
    public static final String KEY_ACCEPT_LANGUAGE = "Accept-Language";
    public static final String KEY_ACCEPT_RANGE = "Accept-Range";
    public static final String KEY_CACHE_CONTROL = "Cache-Control";
    public static final String KEY_CONNECTION = "Connection";
    public static final String KEY_CONTENT_DISPOSITION = "Content-Disposition";
    public static final String KEY_CONTENT_ENCODING = "Content-Encoding";
    public static final String KEY_CONTENT_LENGTH = "Content-Length";
    public static final String KEY_CONTENT_RANGE = "Content-Range";
    public static final String KEY_CONTENT_TYPE = "Content-Type";
    public static final String KEY_COOKIE = "Cookie";
    public static final String KEY_DATE = "Date";
    public static final String KEY_EXPIRES = "Expires";
    public static final String KEY_E_TAG = "ETag";
    public static final String KEY_HOST = "Host";
    public static final String KEY_IF_MODIFIED_SINCE = "If-Modified-Since";
    public static final String KEY_IF_NONE_MATCH = "If-None-Match";
    public static final String KEY_LAST_MODIFIED = "Last-Modified";
    public static final String KEY_LOCATION = "Location";
    public static final String KEY_RANGE = "Range";
    public static final String KEY_SET_COOKIE = "Set-Cookie";
    public static final String KEY_USER_AGENT = "User-Agent";
    public static final String TIME_FORMAT_HTTP = "EEE, dd MMM y HH:mm:ss 'GMT'";
    public static final String VALUE_ACCEPT_ALL = "*/*";
    public static final String VALUE_ACCEPT_ENCODING = "gzip, deflate";
    public static final String VALUE_APPLICATION_FORM = "multipart/form-data";
    public static final String VALUE_APPLICATION_JSON = "application/json";
    public static final String VALUE_APPLICATION_STREAM = "application/octet-stream";
    public static final String VALUE_APPLICATION_URLENCODED = "application/x-www-form-urlencoded";
    public static final String VALUE_APPLICATION_XML = "application/xml";
    public static final String VALUE_CLOSE = "close";
    public static final String VALUE_KEEP_ALIVE = "keep-alive";
    public static final TimeZone TIME_ZONE_GMT = TimeZone.getTimeZone("GMT");
    public static final String VALUE_ACCEPT_LANGUAGE = getLanguage();
    public static final String VALUE_USER_AGENT = getUserAgent();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public i() {
        super(new TreeMap(new a()));
    }

    public static long analysisCacheExpires(i iVar) {
        long j8;
        long j9;
        long currentTimeMillis = System.currentTimeMillis();
        String cacheControl = iVar.getCacheControl();
        if (TextUtils.isEmpty(cacheControl)) {
            j8 = 0;
            j9 = 0;
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(cacheControl, SystemInfoUtil.COMMA);
            j8 = 0;
            j9 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String lowerCase = stringTokenizer.nextToken().trim().toLowerCase(Locale.getDefault());
                if (lowerCase.equals("no-cache") || lowerCase.equals("no-store")) {
                    return 0L;
                }
                if (lowerCase.startsWith("max-age=")) {
                    j8 = Long.parseLong(lowerCase.substring(8)) * 1000;
                } else {
                    if (lowerCase.startsWith("must-revalidate")) {
                        return 0L;
                    }
                    if (lowerCase.startsWith("stale-while-revalidate=")) {
                        j9 = Long.parseLong(lowerCase.substring(23)) * 1000;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(cacheControl)) {
            long j10 = currentTimeMillis + j8;
            return j9 > 0 ? j10 + j9 : j10;
        }
        long expires = iVar.getExpires();
        long date = iVar.getDate();
        if (expires > date) {
            return (currentTimeMillis + expires) - date;
        }
        return 0L;
    }

    public static long formatGMTToMillis(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TIME_FORMAT_HTTP, Locale.US);
        simpleDateFormat.setTimeZone(TIME_ZONE_GMT);
        return simpleDateFormat.parse(str).getTime();
    }

    public static String formatKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.toLowerCase(Locale.ENGLISH).split("-");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            String substring = str2.substring(0, 1);
            String substring2 = str2.substring(1);
            sb.append(substring.toUpperCase(Locale.ENGLISH));
            sb.append(substring2);
            sb.append("-");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.lastIndexOf("-"));
        }
        return sb.toString();
    }

    public static String formatMillisToGMT(long j8) {
        Date date = new Date(j8);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TIME_FORMAT_HTTP, Locale.US);
        simpleDateFormat.setTimeZone(TIME_ZONE_GMT);
        return simpleDateFormat.format(date);
    }

    public static i fromJSONString(String str) {
        i iVar = new i();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONArray jSONArray = new JSONArray(jSONObject.optString(next));
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                iVar.add(next, jSONArray.optString(i8));
            }
        }
        return iVar;
    }

    private long getDateField(String str) {
        String first = getFirst(str);
        if (TextUtils.isEmpty(first)) {
            return 0L;
        }
        try {
            return formatGMTToMillis(first);
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static List<HttpCookie> getHttpCookieList(i iVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = iVar.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equalsIgnoreCase("Set-Cookie")) {
                Iterator<String> it2 = iVar.get(str).iterator();
                while (it2.hasNext()) {
                    arrayList.addAll(HttpCookie.parse(it2.next()));
                }
            }
        }
        return arrayList;
    }

    public static String getLanguage() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
            sb.append(',');
            sb.append(language);
        }
        return sb.toString();
    }

    public static Map<String, String> getRequestHeaders(i iVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Object, List<Object>> entry : iVar.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), TextUtils.join("; ", entry.getValue()));
        }
        return linkedHashMap;
    }

    public static String getUserAgent() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Build.VERSION.RELEASE);
        stringBuffer.append("; ");
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            stringBuffer.append(language.toLowerCase(locale));
            String country = locale.getCountry();
            if (!TextUtils.isEmpty(country)) {
                stringBuffer.append("-");
                stringBuffer.append(country.toLowerCase(locale));
            }
        } else {
            stringBuffer.append("en");
        }
        if ("REL".equals(Build.VERSION.CODENAME)) {
            String str = Build.MODEL;
            if (str.length() > 0) {
                stringBuffer.append("; ");
                stringBuffer.append(str);
            }
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            stringBuffer.append(" Api/");
            stringBuffer.append(str2);
        }
        return String.format("Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/534.30 (KHTML, like Gecko) Version/5.0 %sSafari/534.30", stringBuffer, "Mobile ");
    }

    public static String parseSubValue(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str3;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreElements()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(61);
            if (indexOf > 0 && str2.equalsIgnoreCase(nextToken.substring(0, indexOf).trim())) {
                return nextToken.substring(indexOf + 1).trim();
            }
        }
        return str3;
    }

    public static String toJSONString(i iVar) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Object, List<Object>> entry : iVar.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject.toString();
    }

    public String getCacheControl() {
        List<String> list = get("Cache-Control");
        if (list == null) {
            list = Collections.emptyList();
        }
        return TextUtils.join(SystemInfoUtil.COMMA, list);
    }

    public String getContentDisposition() {
        return getFirst("Content-Disposition");
    }

    public String getContentEncoding() {
        return getFirst("Content-Encoding");
    }

    public long getContentLength() {
        String first = getFirst("Content-Length");
        if (TextUtils.isEmpty(first)) {
            first = "0";
        }
        return Long.parseLong(first);
    }

    public String getContentRange() {
        return getFirst("Content-Range");
    }

    public String getContentType() {
        return getFirst("Content-Type");
    }

    public long getDate() {
        return getDateField("Date");
    }

    public String getETag() {
        return getFirst("ETag");
    }

    public long getExpires() {
        return getDateField("Expires");
    }

    public long getLastModified() {
        return getDateField("Last-Modified");
    }

    public String getLocation() {
        return getFirst("Location");
    }

    @Override // com.yanzhenjie.kalle.util.c
    public /* bridge */ /* synthetic */ void add(Object obj, List list) {
        add((String) obj, (List<String>) list);
    }

    @Override // com.yanzhenjie.kalle.util.c
    public boolean containsKey(String str) {
        return super.containsKey((Object) formatKey(str));
    }

    @Override // com.yanzhenjie.kalle.util.c
    public List<String> get(String str) {
        return super.get((Object) formatKey(str));
    }

    @Override // com.yanzhenjie.kalle.util.c
    public String getFirst(String str) {
        return (String) super.getFirst((Object) formatKey(str));
    }

    @Override // com.yanzhenjie.kalle.util.c
    public List<String> remove(String str) {
        return super.remove((Object) formatKey(str));
    }

    @Override // com.yanzhenjie.kalle.util.c
    public /* bridge */ /* synthetic */ void set(Object obj, List list) {
        set((String) obj, (List<String>) list);
    }

    @Override // com.yanzhenjie.kalle.util.c
    public void add(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        super.add((Object) formatKey(str), (Object) str2);
    }

    @Override // com.yanzhenjie.kalle.util.c
    public void set(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        super.set((Object) formatKey(str), (Object) str2);
    }

    public void add(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list.isEmpty()) {
            return;
        }
        super.add((Object) formatKey(str), (List<Object>) list);
    }

    public void set(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list.isEmpty()) {
            return;
        }
        super.set((Object) formatKey(str), (List<Object>) list);
    }

    public void add(i iVar) {
        for (Map.Entry<Object, List<Object>> entry : iVar.entrySet()) {
            String str = (String) entry.getKey();
            Iterator<Object> it = entry.getValue().iterator();
            while (it.hasNext()) {
                add(str, (String) it.next());
            }
        }
    }

    public void set(i iVar) {
        for (Map.Entry<Object, List<Object>> entry : iVar.entrySet()) {
            set((String) entry.getKey(), (List<String>) entry.getValue());
        }
    }
}
