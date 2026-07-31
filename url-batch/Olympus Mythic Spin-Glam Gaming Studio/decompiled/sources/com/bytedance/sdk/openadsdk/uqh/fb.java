package com.bytedance.sdk.openadsdk.uqh;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.uqh.fs;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class fb {
    private zmn fb;
    private zn fs;
    private hhw zn;
    private final String zmn = "StrategyCenter";
    private int btk = 0;
    private final ConcurrentHashMap<String, Object> hhw = new ConcurrentHashMap<>();
    private Runnable nps = new Runnable() { // from class: com.bytedance.sdk.openadsdk.uqh.fb.2
        @Override // java.lang.Runnable
        public void run() {
            fb.this.zn();
        }
    };

    public fb(hhw hhwVar) {
        this.fs = null;
        nps npsVar = new nps(hhwVar);
        this.zn = npsVar;
        String zn = npsVar.zn();
        if (!TextUtils.isEmpty(zn) && !zn.startsWith("pag")) {
            zn = "pag_".concat(zn);
        }
        this.fs = new zn(this.zn.fs(), zn);
    }

    public void zmn(zmn zmnVar) {
        this.fb = zmnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn() {
        hhw hhwVar = this.zn;
        if (hhwVar == null || hhwVar.btk() == null || this.zn.hhw() == null || this.zn.zg()) {
            return;
        }
        this.zn.zmn().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uqh.fb.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                fb.this.btk++;
                try {
                    if (fb.this.fb != null) {
                        fb.this.fb.zmn();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(fb.this.zn.btk()).openConnection();
                    if (fb.this.zn.nps() != null && fb.this.zn.nps().size() > 0) {
                        for (Map.Entry<String, String> entry : fb.this.zn.nps().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    try {
                        outputStream = PangleNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
                        try {
                            outputStream.write(fb.this.zn.hhw().toString().getBytes());
                            outputStream.close();
                            int httpUrlConnectionGetResponseCode = PangleNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                            Log.i("StrategyCenter", "executing strategy fetch");
                            if (httpUrlConnectionGetResponseCode != 200) {
                                if (fb.this.fb != null) {
                                    fb.this.fb.zmn(httpUrlConnectionGetResponseCode, httpURLConnection.getResponseMessage());
                                }
                            } else {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(PangleNetworkBridge.urlConnectionGetInputStream(httpURLConnection)));
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    } else {
                                        stringBuffer.append(readLine);
                                    }
                                }
                                bufferedReader.close();
                                JSONObject zmn = fb.this.zn.zmn(PangleNetworkBridge.jsonObjectInit(stringBuffer.toString()));
                                fb.this.fs.fs();
                                fb.this.fb();
                                fb.this.fs.zmn(zmn);
                                if (fb.this.fb != null) {
                                    fb.this.fb.fs();
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = null;
                    }
                } catch (Throwable th3) {
                    Log.e("StrategyCenter", th3.getMessage() == null ? "error " : th3.getMessage());
                    if (fb.this.fb != null) {
                        fb.this.fb.zmn(-1, th3.getMessage());
                    }
                }
                fb.this.fs.zmn("local_last_update_time", System.currentTimeMillis());
                fb.this.zmn();
            }
        });
    }

    public void zmn() {
        if (this.zn != null) {
            int i = 3600000;
            int zmn = this.fs.zmn("req_interval", 3600000);
            long j = 0;
            long fs = this.fs.fs("local_last_update_time", 0L);
            if (zmn >= 600000 && zmn <= 86400000) {
                i = zmn;
            }
            long currentTimeMillis = System.currentTimeMillis() - fs;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(currentTimeMillis)));
            if (currentTimeMillis >= 0) {
                long j2 = i;
                if (currentTimeMillis <= j2) {
                    j = j2 - currentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j)));
            this.zn.fb().removeCallbacks(this.nps);
            if (this.btk > 24) {
                return;
            }
            this.zn.fb().postDelayed(this.nps, j);
        }
    }

    public int zmn(String str, int i) {
        zn znVar = this.fs;
        return znVar == null ? i : znVar.zmn(str, i);
    }

    public String zmn(String str, String str2) {
        zn znVar = this.fs;
        return znVar == null ? str2 : znVar.zmn(str, str2);
    }

    public boolean zmn(String str, boolean z) {
        zn znVar = this.fs;
        return znVar == null ? z : znVar.zmn(str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r4.getClass().isInstance(r0) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> T zmn(String str, T t, fs.zmn<T> zmnVar) {
        if (this.fs != null && str != null) {
            T t2 = (T) this.hhw.get(str);
            if (t2 != null) {
                if (t != null) {
                }
                return t2;
            }
            if (zmnVar != null) {
                try {
                    T t3 = (T) this.fs.zmn(str, t, zmnVar);
                    if (t3 != null) {
                        this.hhw.put(str, t3);
                        return t3;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return t;
    }

    public zn fs() {
        return this.fs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fb() {
        this.hhw.clear();
    }
}
