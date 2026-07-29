package com.cmplay.gppay;

import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.cmplay.gppay.a.f;
import com.tapjoy.TJAdUnitConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private Handler f4149a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f4150b;

    /* renamed from: c, reason: collision with root package name */
    private com.cmplay.gppay.a f4151c;

    public static class a implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return 0;
            }
            String str = (String) obj2;
            try {
                JSONObject jSONObject = new JSONObject((String) obj);
                long j = jSONObject.has("price_amount_micros") ? jSONObject.getLong("price_amount_micros") : 0L;
                JSONObject jSONObject2 = new JSONObject(str);
                long j2 = jSONObject2.has("price_amount_micros") ? jSONObject2.getLong("price_amount_micros") : 0L;
                if (j == j2) {
                    return 0;
                }
                return j > j2 ? 1 : -1;
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }
    }

    public c(Handler handler, com.cmplay.gppay.a aVar, Handler handler2) {
        this.f4149a = handler;
        this.f4151c = aVar;
        this.f4150b = handler2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        int i = ((Calendar.getInstance(Locale.getDefault()).get(15) / 60) / 60) / 1000;
        if (i <= 0) {
            return String.valueOf(i);
        }
        return "+" + String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    public void a(final String str, final String str2, final String str3, String str4, final boolean z) {
        f.a("gp_pay", "验证订单：" + str2);
        f.a("gp_pay", "验证订单signature：" + str);
        this.f4149a.post(new Runnable() { // from class: com.cmplay.gppay.c.1
            /* JADX WARN: Removed duplicated region for block: B:85:0x0377 A[Catch: Exception -> 0x037b, IOException -> 0x037d, MalformedURLException -> 0x037f, JSONException -> 0x0383, TRY_ENTER, TryCatch #8 {MalformedURLException -> 0x037f, IOException -> 0x037d, JSONException -> 0x0383, Exception -> 0x037b, blocks: (B:44:0x0347, B:46:0x034c, B:85:0x0377, B:87:0x0389, B:88:0x038c), top: B:2:0x001d }] */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0389 A[Catch: Exception -> 0x037b, IOException -> 0x037d, MalformedURLException -> 0x037f, JSONException -> 0x0383, TryCatch #8 {MalformedURLException -> 0x037f, IOException -> 0x037d, JSONException -> 0x0383, Exception -> 0x037b, blocks: (B:44:0x0347, B:46:0x034c, B:85:0x0377, B:87:0x0389, B:88:0x038c), top: B:2:0x001d }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                String str5;
                String str6;
                String str7;
                HttpURLConnection httpURLConnection;
                BufferedReader bufferedReader;
                HttpURLConnection httpURLConnection2;
                int responseCode;
                Message obtainMessage = c.this.f4150b.obtainMessage();
                obtainMessage.what = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
                obtainMessage.obj = "pay-failed-default";
                try {
                    try {
                        HashMap hashMap = new HashMap();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("userId", b.a().f);
                        jSONObject.put("idType", b.a().n);
                        jSONObject.put("deviceId", b.a().o);
                        jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, str);
                        jSONObject.put("signedData", str2);
                        jSONObject.put("zone", c.this.a());
                        jSONObject.put("isSandBox", b.a().p);
                        b.a();
                        jSONObject.put("priceList", b.i);
                        hashMap.put("user", b.a().f);
                        hashMap.put("key", "25");
                        hashMap.put("protocolVer", b.e + "");
                        hashMap.put("content", jSONObject.toString());
                        hashMap.put("checkout", "1");
                        byte[] a2 = c.this.a(hashMap, "UTF-8");
                        URL url = new URL(b.f4107d + b.e + "");
                        StringBuilder sb = new StringBuilder();
                        sb.append("parsedUrl: ");
                        sb.append(url.toString());
                        f.a("gp_pay", sb.toString());
                        f.a("gp_pay", "parsedUrl: " + url.toString());
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                        try {
                            httpURLConnection.setConnectTimeout(20000);
                            httpURLConnection.setReadTimeout(20000);
                            httpURLConnection.setInstanceFollowRedirects(false);
                            HttpURLConnection.setFollowRedirects(false);
                            httpURLConnection.setUseCaches(false);
                            httpURLConnection.setDoInput(true);
                            httpURLConnection.setRequestMethod("POST");
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("gameid", b.a().m);
                            httpURLConnection.addRequestProperty("token", b.g);
                            httpURLConnection.addRequestProperty("userid", b.a().f);
                            httpURLConnection.addRequestProperty("scene", b.h);
                            httpURLConnection.addRequestProperty(Constants.KEY_CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
                            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(a2.length));
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(a2);
                            dataOutputStream.close();
                            f.a("gp_pay", "-----connection---gameid = " + b.a().m);
                            f.a("gp_pay", "-----connection---token = " + b.g);
                            f.a("gp_pay", "-----connection---userid = " + b.a().f);
                            f.a("gp_pay", "-----connection---scene = " + b.h);
                            f.a("gp_pay", "-----connection---getHeaderFields = " + httpURLConnection.getHeaderFields().toString());
                            int responseCode2 = httpURLConnection.getResponseCode();
                            f.a("gp_pay", "responseCode: " + responseCode2);
                            if (responseCode2 == 302) {
                                String headerField = httpURLConnection.getHeaderField(Constants.KEY_LOCATION);
                                f.a("gp_pay", "subUrl: " + headerField);
                                httpURLConnection2 = (HttpURLConnection) new URL(headerField).openConnection();
                                try {
                                    httpURLConnection2.setConnectTimeout(20000);
                                    httpURLConnection2.setReadTimeout(20000);
                                    httpURLConnection2.setInstanceFollowRedirects(false);
                                    HttpURLConnection.setFollowRedirects(false);
                                    httpURLConnection2.setUseCaches(false);
                                    httpURLConnection2.setDoInput(true);
                                    httpURLConnection2.setRequestMethod("POST");
                                    httpURLConnection2.setDoOutput(true);
                                    httpURLConnection2.addRequestProperty("gameid", b.a().m);
                                    httpURLConnection2.addRequestProperty("token", b.g);
                                    httpURLConnection2.addRequestProperty("userid", b.a().f);
                                    httpURLConnection2.addRequestProperty("scene", b.h);
                                    httpURLConnection2.addRequestProperty(Constants.KEY_CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
                                    httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(a2.length));
                                    DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection2.getOutputStream());
                                    dataOutputStream2.write(a2);
                                    dataOutputStream2.close();
                                } catch (Throwable th) {
                                    th = th;
                                    httpURLConnection = httpURLConnection2;
                                    bufferedReader = null;
                                    if (bufferedReader != null) {
                                    }
                                    if (httpURLConnection != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                httpURLConnection2 = httpURLConnection;
                            }
                            responseCode = httpURLConnection2.getResponseCode();
                            f.a("gp_pay", "responseCode2: " + responseCode);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        httpURLConnection = null;
                    }
                } catch (MalformedURLException e) {
                    obtainMessage.what = 201;
                    e.printStackTrace();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    obtainMessage.what = 201;
                } catch (JSONException e3) {
                    obtainMessage.what = 201;
                    e3.printStackTrace();
                } catch (Exception e4) {
                    obtainMessage.what = 904;
                    e4.printStackTrace();
                }
                if (responseCode == -1 || responseCode < 200 || responseCode > 299) {
                    throw new IOException("http responseCode Exception :" + responseCode);
                }
                StringBuffer stringBuffer = new StringBuffer();
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream(), "UTF-8"), 4096);
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (TextUtils.isEmpty(readLine)) {
                            break;
                        } else {
                            stringBuffer.append(readLine);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        httpURLConnection = httpURLConnection2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (!TextUtils.isEmpty(stringBuffer)) {
                    f.a("gp_pay", "服务器返回结果3: " + ((Object) stringBuffer));
                    JSONObject jSONObject2 = new JSONObject(stringBuffer.toString());
                    if (jSONObject2.optInt("key") == 25) {
                        int optInt = jSONObject2.optInt("code");
                        String optString = jSONObject2.optString(TJAdUnitConstants.String.MESSAGE);
                        if (optInt == 0) {
                            int optInt2 = jSONObject2.getJSONObject("data").optInt("code");
                            if (optInt2 == 0) {
                                obtainMessage.what = 100;
                            } else if (optInt2 == 1) {
                                obtainMessage.what = 303;
                            } else if (optInt2 == 2) {
                                obtainMessage.what = 203;
                            }
                            obtainMessage.obj = optString;
                        } else if (optInt == -1) {
                        }
                        obtainMessage.what = 202;
                        obtainMessage.obj = optString;
                    }
                }
                bufferedReader2.close();
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                if (z && obtainMessage.what == 100) {
                    obtainMessage.what = 101;
                }
                if (obtainMessage.what / 100 == 1 || obtainMessage.what == 303) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("orderJson", new JSONObject(str2));
                        obtainMessage.obj = jSONObject3.toString();
                    } catch (JSONException e5) {
                        obtainMessage.what = 201;
                        e5.printStackTrace();
                    }
                } else {
                    try {
                        str5 = new JSONObject(str2).optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                        str5 = "";
                    }
                    b.a().a(3, 2, str3, str5, "4," + obtainMessage.what + ",isRecovery=" + z);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obtainMessage.what);
                    sb2.append("");
                    String sb3 = sb2.toString();
                    if (obtainMessage.what == 201) {
                        str7 = Constants.ALL_LOAD;
                    } else if (obtainMessage.what == 202) {
                        str7 = Constants.ALL_READY;
                    } else if (obtainMessage.what == 203) {
                        str7 = "5";
                    } else {
                        str6 = sb3;
                        b.a().a(2, 2, str3, str5, str6);
                    }
                    str6 = str7;
                    b.a().a(2, 2, str3, str5, str6);
                }
                c.this.f4150b.sendMessage(obtainMessage);
            }
        });
    }
}
