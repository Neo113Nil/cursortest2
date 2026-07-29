package com.cmplay.gppay;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.cmplay.gppay.a.f;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private Handler f4156a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f4157b;

    public d(Handler handler, Handler handler2) {
        this.f4156a = handler;
        this.f4157b = handler2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message, Boolean bool, int i, int i2) {
        if (bool.booleanValue()) {
            message.what = i;
        } else {
            message.what = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message, Boolean bool, String str, JSONObject jSONObject) {
        if (!bool.booleanValue()) {
            message.obj = jSONObject;
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject.optInt("code") == 0) {
                String valueOf = String.valueOf(jSONObject.getJSONArray("data").getJSONObject(0).optLong("expiryTimeMillis"));
                f.a("gp_pay", "setMessageObject expiryTimeMillis: " + valueOf);
                jSONObject2.put("expiryTimeMillis", valueOf);
            } else {
                jSONObject2.put("expiryTimeMillis", "");
            }
            message.obj = jSONObject2;
        } catch (Exception e) {
            f.a("gp_pay", "setMessageObject Exception: " + e.getMessage());
            message.obj = str;
        }
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

    public void a(JSONObject jSONObject) {
        a(jSONObject, (Boolean) false, -1, "");
    }

    public void a(final JSONObject jSONObject, final Boolean bool, final int i, final String str) {
        f.a("gp_pay", "into getSubsInfo 查询订阅时间");
        f.a("gp_pay", "into getSubsInfo mCheckList = " + jSONObject.toString());
        this.f4156a.post(new Runnable() { // from class: com.cmplay.gppay.d.1
            /* JADX WARN: Removed duplicated region for block: B:20:0x024b A[Catch: Exception -> 0x024f, IOException -> 0x0251, MalformedURLException -> 0x0253, JSONException -> 0x0255, TRY_ENTER, TryCatch #6 {MalformedURLException -> 0x0253, IOException -> 0x0251, JSONException -> 0x0255, Exception -> 0x024f, blocks: (B:20:0x024b, B:22:0x025a, B:23:0x025d, B:45:0x0221, B:47:0x0226), top: B:2:0x001c }] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x025a A[Catch: Exception -> 0x024f, IOException -> 0x0251, MalformedURLException -> 0x0253, JSONException -> 0x0255, TryCatch #6 {MalformedURLException -> 0x0253, IOException -> 0x0251, JSONException -> 0x0255, Exception -> 0x024f, blocks: (B:20:0x024b, B:22:0x025a, B:23:0x025d, B:45:0x0221, B:47:0x0226), top: B:2:0x001c }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                HttpURLConnection httpURLConnection;
                int responseCode;
                Message obtainMessage = d.this.f4157b.obtainMessage();
                obtainMessage.obj = "pay-failed-default";
                d.this.a(obtainMessage, bool, i, 401);
                BufferedReader bufferedReader = null;
                try {
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("content", jSONObject.toString());
                        byte[] a2 = d.this.a(hashMap, "UTF-8");
                        String str2 = b.k ? "/platformPay/gpSubcription" : "/globalpay/gpSubcription";
                        String[] split = b.f4107d.split("\\/");
                        URL url = new URL((split[0] + "//" + split[2]) + str2);
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
                            int responseCode2 = httpURLConnection.getResponseCode();
                            f.a("gp_pay", "responseCode: " + responseCode2);
                            if (responseCode2 == 302) {
                                String headerField = httpURLConnection.getHeaderField(Constants.KEY_LOCATION);
                                f.a("gp_pay", "subUrl: " + headerField);
                                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(headerField).openConnection();
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
                                    httpURLConnection2.addRequestProperty(Constants.KEY_CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
                                    httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(a2.length));
                                    DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection2.getOutputStream());
                                    dataOutputStream2.write(a2);
                                    dataOutputStream2.close();
                                    httpURLConnection = httpURLConnection2;
                                } catch (Throwable th) {
                                    th = th;
                                    httpURLConnection = httpURLConnection2;
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    throw th;
                                }
                            }
                            responseCode = httpURLConnection.getResponseCode();
                            f.a("gp_pay", "responseCode2: " + responseCode);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        httpURLConnection = null;
                    }
                } catch (MalformedURLException e) {
                    f.a("gp_pay", "MalformedURLException: " + e.getMessage());
                    d.this.a(obtainMessage, bool, i, 402);
                    e.printStackTrace();
                } catch (IOException e2) {
                    f.a("gp_pay", "IOException: " + e2.getMessage());
                    e2.printStackTrace();
                    d.this.a(obtainMessage, bool, i, 402);
                } catch (JSONException e3) {
                    f.a("gp_pay", "JSONException: " + e3.getMessage());
                    d.this.a(obtainMessage, bool, i, 402);
                    e3.printStackTrace();
                } catch (Exception e4) {
                    f.a("gp_pay", "Exception: " + e4.getMessage());
                    d.this.a(obtainMessage, bool, i, 402);
                    e4.printStackTrace();
                }
                if (responseCode == -1 || responseCode < 200 || responseCode > 299) {
                    throw new IOException("http responseCode Exception :" + responseCode);
                }
                StringBuffer stringBuffer = new StringBuffer();
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"), 4096);
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
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        throw th;
                    }
                }
                if (!TextUtils.isEmpty(stringBuffer)) {
                    f.a("gp_pay", "服务器返回结果3: " + ((Object) stringBuffer));
                    JSONObject jSONObject2 = new JSONObject(stringBuffer.toString());
                    if (jSONObject2.optInt("code") == 0) {
                        d.this.a(obtainMessage, bool, i, 400);
                    } else {
                        d.this.a(obtainMessage, bool, i, 403);
                    }
                    d.this.a(obtainMessage, bool, str, jSONObject2);
                }
                bufferedReader2.close();
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                d.this.f4157b.sendMessage(obtainMessage);
            }
        });
    }
}
