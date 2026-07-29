package com.mopub.network;

import com.mopub.common.Preconditions;
import com.mopub.common.util.ResponseHeader;
import com.mopub.volley.Header;
import com.mopub.volley.toolbox.HttpResponse;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class HeaderUtils {
    public static String extractHeader(Map<String, String> map, ResponseHeader responseHeader) {
        return map.get(responseHeader.getKey().toLowerCase());
    }

    public static String extractHeader(JSONObject jSONObject, ResponseHeader responseHeader) {
        Preconditions.checkNotNull(responseHeader);
        return jSONObject == null ? "" : jSONObject.optString(getKeyIgnoreCase(jSONObject, responseHeader.getKey()));
    }

    public static Integer extractIntegerHeader(JSONObject jSONObject, ResponseHeader responseHeader) {
        return formatIntHeader(extractHeader(jSONObject, responseHeader));
    }

    public static boolean extractBooleanHeader(Map<String, String> map, ResponseHeader responseHeader, boolean z) {
        return formatBooleanHeader(extractHeader(map, responseHeader), z);
    }

    public static boolean extractBooleanHeader(JSONObject jSONObject, ResponseHeader responseHeader, boolean z) {
        return formatBooleanHeader(extractHeader(jSONObject, responseHeader), z);
    }

    public static Integer extractPercentHeader(JSONObject jSONObject, ResponseHeader responseHeader) {
        return formatPercentHeader(extractHeader(jSONObject, responseHeader));
    }

    public static String extractPercentHeaderString(JSONObject jSONObject, ResponseHeader responseHeader) {
        Integer extractPercentHeader = extractPercentHeader(jSONObject, responseHeader);
        if (extractPercentHeader != null) {
            return extractPercentHeader.toString();
        }
        return null;
    }

    public static String extractHeader(HttpResponse httpResponse, ResponseHeader responseHeader) {
        Header firstHeader = getFirstHeader(httpResponse.getHeaders(), responseHeader);
        if (firstHeader != null) {
            return firstHeader.getValue();
        }
        return null;
    }

    public static boolean extractBooleanHeader(HttpResponse httpResponse, ResponseHeader responseHeader, boolean z) {
        return formatBooleanHeader(extractHeader(httpResponse, responseHeader), z);
    }

    public static Integer extractIntegerHeader(HttpResponse httpResponse, ResponseHeader responseHeader) {
        return formatIntHeader(extractHeader(httpResponse, responseHeader));
    }

    public static int extractIntHeader(HttpResponse httpResponse, ResponseHeader responseHeader, int i) {
        Integer extractIntegerHeader = extractIntegerHeader(httpResponse, responseHeader);
        return extractIntegerHeader == null ? i : extractIntegerHeader.intValue();
    }

    private static boolean formatBooleanHeader(String str, boolean z) {
        return str == null ? z : str.equals("1");
    }

    private static Integer formatIntHeader(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (Exception unused) {
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
            numberFormat.setParseIntegerOnly(true);
            try {
                return Integer.valueOf(numberFormat.parse(str.trim()).intValue());
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    private static Integer formatPercentHeader(String str) {
        Integer formatIntHeader;
        if (str != null && (formatIntHeader = formatIntHeader(str.replace("%", ""))) != null && formatIntHeader.intValue() >= 0 && formatIntHeader.intValue() <= 100) {
            return formatIntHeader;
        }
        return null;
    }

    private static Header getFirstHeader(List<Header> list, ResponseHeader responseHeader) {
        Preconditions.checkNotNull(responseHeader);
        if (list == null) {
            return null;
        }
        for (Header header : list) {
            if (header.getName().equalsIgnoreCase(responseHeader.getKey())) {
                return header;
            }
        }
        return null;
    }

    private static String getKeyIgnoreCase(JSONObject jSONObject, String str) {
        Preconditions.checkNotNull(jSONObject);
        Preconditions.checkNotNull(str);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (str.equalsIgnoreCase(next)) {
                return next;
            }
        }
        return str;
    }
}
