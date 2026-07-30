package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.ar.bean.DuMixARConfig;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.ar.statistic.StatisticConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ie implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public HandlerThread f2486a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f2487b;

    /* renamed from: c, reason: collision with root package name */
    public me f2488c;

    /* renamed from: d, reason: collision with root package name */
    public sd f2489d;

    public class a implements c6 {
        public a() {
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            try {
                String content = iHttpResponse.getContent();
                if (TextUtils.isEmpty(content)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(content);
                if (jSONObject.getInt("err_code") != 0) {
                    jSONObject.getString("err_msg");
                    if (ie.this.f2488c != null) {
                        ie.this.f2488c.a(false, null);
                        return;
                    }
                    return;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                String str = (String) jSONObject2.get(StatisticConstants.VPS_SESSION_ID);
                if (jSONObject2.has("srt")) {
                    JSONObject jSONObject3 = new JSONObject(jSONObject2.getString("srt"));
                    if (jSONObject3.has("scale")) {
                        double d8 = jSONObject3.getDouble("scale");
                        if (ie.this.f2488c != null) {
                            ie.this.f2488c.a((float) d8);
                        }
                    }
                    if (jSONObject3.has("rotation")) {
                        JSONArray jSONArray = jSONObject3.getJSONArray("rotation");
                        float[] fArr = new float[jSONArray.length()];
                        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                            fArr[i8] = (float) jSONArray.getDouble(i8);
                            Log.e("rotation", fArr[i8] + "");
                        }
                        if (ie.this.f2488c != null) {
                            ie.this.f2488c.b(fArr);
                        }
                    }
                    if (jSONObject3.has("translation")) {
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("translation");
                        float[] fArr2 = new float[jSONArray2.length()];
                        for (int i9 = 0; i9 < jSONArray2.length(); i9++) {
                            fArr2[i9] = (float) jSONArray2.getDouble(i9);
                            Log.e("translation", fArr2[i9] + "");
                        }
                        if (ie.this.f2488c != null) {
                            ie.this.f2488c.a(fArr2);
                        }
                    }
                }
                if (TextUtils.isEmpty(str) && ie.this.f2488c != null) {
                    ie.this.f2488c.a(false, null);
                }
                if (ie.this.f2488c != null) {
                    ie.this.f2488c.a(true, str);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                if (ie.this.f2488c != null) {
                    ie.this.f2488c.a(false, null);
                }
            }
        }
    }

    public class b implements Comparator<String> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public class c implements c6 {
        public c() {
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            Log.e("response trackFrame err", "" + httpException.getMessage());
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            try {
                if (ie.this.f2488c == null) {
                    return;
                }
                InputStream stream = iHttpResponse.getStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = stream.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        stream.close();
                        ie.this.f2488c.b(byteArray);
                        return;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
    }

    public static class d extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public k2 f2492a;

        public d(Looper looper, k2 k2Var) {
            super(looper);
            this.f2492a = k2Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.f2492a.handleMessage(message);
        }
    }

    public ie() {
        HandlerThread handlerThread = new HandlerThread("VpasController");
        this.f2486a = handlerThread;
        handlerThread.start();
        this.f2487b = new d(this.f2486a.getLooper(), this);
    }

    public final JSONObject b(String str) {
        double d8;
        double d9;
        long currentTimeMillis = System.currentTimeMillis();
        TreeMap a8 = a();
        sd sdVar = this.f2489d;
        if (sdVar == null || sdVar.b() == null) {
            d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
            d9 = 0.0d;
        } else {
            d8 = this.f2489d.b()[0];
            d9 = this.f2489d.b()[1];
        }
        a8.put("lat", Double.valueOf(d8));
        a8.put("lng", Double.valueOf(d9));
        a8.put("timestamp", Long.valueOf(currentTimeMillis));
        a8.put("ar_key", Long.valueOf(Long.parseLong(str)));
        a8.put(HttpConstants.HTTP_APP_ID, Integer.valueOf(Integer.parseInt(DuMixARConfig.getAipAppId())));
        String a9 = ne.a(a8);
        a8.put(HttpConstants.SIGN, a9.toUpperCase());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lat", d8);
            jSONObject.put("lng", d9);
            jSONObject.put("timestamp", currentTimeMillis);
            jSONObject.put("ar_key", Long.parseLong(str));
            jSONObject.put(HttpConstants.HTTP_APP_ID, Integer.parseInt(DuMixARConfig.getAipAppId()));
            jSONObject.put(HttpConstants.SIGN, a9.toUpperCase());
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    public final void c(String str) {
        je.a(id.l(), b(str), new a());
    }

    @Override // com.baidu.ar.k2
    public void handleMessage(Message message) {
        Object obj;
        int i8 = message.what;
        if (i8 != 1001) {
            if (i8 == 1002 && (obj = message.obj) != null) {
                a((byte[]) obj);
                return;
            }
            return;
        }
        Object obj2 = message.obj;
        if (obj2 != null) {
            c((String) obj2);
        }
    }

    public static TreeMap a() {
        return new TreeMap(new b());
    }

    public void a(me meVar, sd sdVar) {
        this.f2488c = meVar;
        this.f2489d = sdVar;
    }

    public void a(String str) {
        Handler handler = this.f2487b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1001, str));
        }
    }

    public void a(byte[] bArr) {
        je.a(new c(), bArr);
    }
}
