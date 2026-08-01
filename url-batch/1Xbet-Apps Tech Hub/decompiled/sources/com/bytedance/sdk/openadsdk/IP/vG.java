package com.bytedance.sdk.openadsdk.IP;

import android.text.TextUtils;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: StrategyCenter.java */
/* loaded from: classes2.dex */
public class vG {
    private pvs Jd;
    private icD icD;
    private Jd vG;
    private final String pvs = "StrategyCenter";
    private int NB = 0;
    private Runnable sUS = new Runnable() { // from class: com.bytedance.sdk.openadsdk.IP.vG.2
        @Override // java.lang.Runnable
        public void run() {
            vG.this.icD();
        }
    };

    public vG(Jd jd) {
        this.icD = null;
        NB nb = new NB(jd);
        this.vG = nb;
        String vG = nb.vG();
        if (!TextUtils.isEmpty(vG) && !vG.startsWith("pag")) {
            vG = "pag_".concat(String.valueOf(vG));
        }
        this.icD = new icD(this.vG.icD(), vG);
    }

    public void pvs(pvs pvsVar) {
        this.Jd = pvsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD() {
        Jd jd = this.vG;
        if (jd == null || jd.NB() == null || this.vG.sUS() == null) {
            return;
        }
        this.vG.pvs().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.IP.vG.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                vG.this.NB++;
                try {
                    if (vG.this.Jd != null) {
                        pvs unused = vG.this.Jd;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(vG.this.vG.NB()).openConnection();
                    if (vG.this.vG.yiw() != null && vG.this.vG.yiw().size() > 0) {
                        for (Map.Entry<String, String> entry : vG.this.vG.yiw().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                    httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(vG.this.vG.sUS().toString().getBytes());
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            Log.i("StrategyCenter", "executing strategy fetch");
                            if (responseCode == 200) {
                                if (vG.this.Jd != null) {
                                    pvs unused2 = vG.this.Jd;
                                }
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
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
                                JSONObject pvs = vG.this.vG.pvs(new JSONObject(stringBuffer.toString()));
                                vG.this.icD.pvs();
                                vG.this.icD.pvs(pvs);
                            } else if (vG.this.Jd != null) {
                                pvs unused3 = vG.this.Jd;
                                httpURLConnection.getResponseMessage();
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
                    if (vG.this.Jd != null) {
                        pvs unused4 = vG.this.Jd;
                        th3.getMessage();
                    }
                }
                vG.this.icD.pvs("local_last_update_time", System.currentTimeMillis());
                vG.this.pvs();
            }
        });
    }

    public void pvs() {
        if (this.vG != null) {
            int i = 3600000;
            int pvs = this.icD.pvs("req_interval", 3600000);
            long j = 0;
            long icD = this.icD.icD("local_last_update_time", 0L);
            if (pvs >= 600000 && pvs <= 86400000) {
                i = pvs;
            }
            long currentTimeMillis = System.currentTimeMillis() - icD;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(currentTimeMillis)));
            if (currentTimeMillis >= 0) {
                long j2 = i;
                if (currentTimeMillis <= j2) {
                    j = j2 - currentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j)));
            this.vG.Jd().removeCallbacks(this.sUS);
            if (this.NB > 24) {
                return;
            }
            this.vG.Jd().postDelayed(this.sUS, j);
        }
    }
}
