package com.tapjoy;

import com.aiming.mdt.utils.Constants;
import com.tapjoy.internal.fk;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* loaded from: classes2.dex */
public class TapjoyURLConnection {
    public static final int TYPE_GET = 0;
    public static final int TYPE_POST = 1;

    public TapjoyHttpURLResponse getRedirectFromURL(String str) {
        return getResponseFromURL(str, "", 0, true, null, null, null);
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str, Map map) {
        return getResponseFromURL(str, TapjoyUtil.convertURLParams(map, false), 0);
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str, Map map, int i) {
        return getResponseFromURL(str, TapjoyUtil.convertURLParams(map, false), i);
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str) {
        return getResponseFromURL(str, "", 0);
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str, String str2) {
        return getResponseFromURL(str, str2, 0);
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str, String str2, int i) {
        return getResponseFromURL(str, str2, i, false, null, null, null);
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str, Map map, Map map2, Map map3) {
        return getResponseFromURL(str, map != null ? TapjoyUtil.convertURLParams(map, false) : "", 1, false, map2, "application/x-www-form-urlencoded", TapjoyUtil.convertURLParams(map3, false));
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str, Map map, Map map2, String str2) {
        return getResponseFromURL(str, map != null ? TapjoyUtil.convertURLParams(map, false) : "", 1, false, map2, "application/json;charset=utf-8", str2);
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str, String str2, int i, boolean z, Map map, String str3, String str4) {
        Exception e;
        HttpURLConnection httpURLConnection;
        TapjoyHttpURLResponse tapjoyHttpURLResponse = new TapjoyHttpURLResponse();
        try {
            String str5 = str + str2;
            StringBuilder sb = new StringBuilder("http ");
            sb.append(i == 0 ? "get" : "post");
            sb.append(": ");
            sb.append(str5);
            TapjoyLog.i("TapjoyURLConnection", sb.toString());
            httpURLConnection = (HttpURLConnection) fk.a(new URL(str5));
            if (z) {
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                } catch (Exception e2) {
                    e = e2;
                    TapjoyLog.e("TapjoyURLConnection", "Exception: " + e.toString());
                    tapjoyHttpURLResponse.statusCode = 0;
                    if (httpURLConnection != null) {
                        try {
                            if (tapjoyHttpURLResponse.response == null) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
                                StringBuilder sb2 = new StringBuilder();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    sb2.append(readLine + '\n');
                                }
                                tapjoyHttpURLResponse.response = sb2.toString();
                            }
                        } catch (Exception e3) {
                            TapjoyLog.e("TapjoyURLConnection", "Exception trying to get error code/content: " + e3.toString());
                        }
                    }
                    TapjoyLog.i("TapjoyURLConnection", "--------------------");
                    TapjoyLog.i("TapjoyURLConnection", "response status: " + tapjoyHttpURLResponse.statusCode);
                    TapjoyLog.i("TapjoyURLConnection", "response size: " + tapjoyHttpURLResponse.contentLength);
                    if (tapjoyHttpURLResponse.redirectURL != null) {
                        TapjoyLog.i("TapjoyURLConnection", "redirectURL: " + tapjoyHttpURLResponse.redirectURL);
                    }
                    TapjoyLog.i("TapjoyURLConnection", "--------------------");
                    return tapjoyHttpURLResponse;
                }
            }
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(30000);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (i == 1) {
                httpURLConnection.setRequestMethod("POST");
                if (str4 != null) {
                    TapjoyLog.i("TapjoyURLConnection", "Content-Type: " + str3);
                    TapjoyLog.i("TapjoyURLConnection", "Content:");
                    TapjoyLog.i("TapjoyURLConnection", str4);
                    httpURLConnection.setRequestProperty(Constants.KEY_CONTENT_TYPE, str3);
                    httpURLConnection.setRequestProperty("Connection", "close");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setFixedLengthStreamingMode(str4.length());
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
                    outputStreamWriter.write(str4);
                    outputStreamWriter.close();
                }
            }
            httpURLConnection.connect();
            tapjoyHttpURLResponse.statusCode = httpURLConnection.getResponseCode();
            tapjoyHttpURLResponse.headerFields = httpURLConnection.getHeaderFields();
            tapjoyHttpURLResponse.date = httpURLConnection.getDate();
            tapjoyHttpURLResponse.expires = httpURLConnection.getExpiration();
            BufferedReader bufferedReader2 = z ? null : new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            if (!z) {
                StringBuilder sb3 = new StringBuilder();
                while (true) {
                    String readLine2 = bufferedReader2.readLine();
                    if (readLine2 == null) {
                        break;
                    }
                    sb3.append(readLine2 + '\n');
                }
                tapjoyHttpURLResponse.response = sb3.toString();
            }
            if (tapjoyHttpURLResponse.statusCode == 302) {
                tapjoyHttpURLResponse.redirectURL = httpURLConnection.getHeaderField(Constants.KEY_LOCATION);
            }
            String headerField = httpURLConnection.getHeaderField("content-length");
            if (headerField != null) {
                try {
                    tapjoyHttpURLResponse.contentLength = Integer.valueOf(headerField).intValue();
                } catch (Exception e4) {
                    TapjoyLog.e("TapjoyURLConnection", "Exception: " + e4.toString());
                }
            }
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
        } catch (Exception e5) {
            e = e5;
            httpURLConnection = null;
        }
        TapjoyLog.i("TapjoyURLConnection", "--------------------");
        TapjoyLog.i("TapjoyURLConnection", "response status: " + tapjoyHttpURLResponse.statusCode);
        TapjoyLog.i("TapjoyURLConnection", "response size: " + tapjoyHttpURLResponse.contentLength);
        if (tapjoyHttpURLResponse.redirectURL != null && tapjoyHttpURLResponse.redirectURL.length() > 0) {
            TapjoyLog.i("TapjoyURLConnection", "redirectURL: " + tapjoyHttpURLResponse.redirectURL);
        }
        TapjoyLog.i("TapjoyURLConnection", "--------------------");
        return tapjoyHttpURLResponse;
    }

    public String getContentLength(String str) {
        String str2;
        try {
            String replaceAll = str.replaceAll(" ", "%20");
            TapjoyLog.d("TapjoyURLConnection", "requestURL: " + replaceAll);
            HttpURLConnection httpURLConnection = (HttpURLConnection) fk.a(new URL(replaceAll));
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(30000);
            str2 = httpURLConnection.getHeaderField("content-length");
        } catch (Exception e) {
            TapjoyLog.e("TapjoyURLConnection", "Exception: " + e.toString());
            str2 = null;
        }
        TapjoyLog.d("TapjoyURLConnection", "content-length: " + str2);
        return str2;
    }
}
