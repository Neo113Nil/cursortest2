package com.bytedance.sdk.component.yiw.vG;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.cR;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.component.yiw.pvs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: AppConfig.java */
/* loaded from: classes.dex */
public class pvs implements dyT.pvs {
    private static vG Mxy;
    private static ThreadPoolExecutor Wyp;
    private static boolean so;
    private com.bytedance.sdk.component.yiw.pvs IP;
    private int bNS;
    private final boolean icD;
    private final Context kj;
    private volatile boolean vG = false;
    private boolean Jd = true;
    private boolean NB = false;
    private long sUS = 0;
    private long yiw = 0;
    private AtomicBoolean qh = new AtomicBoolean(false);
    private volatile boolean Ju = false;
    final dyT pvs = com.bytedance.sdk.component.so.pvs.pvs.pvs().pvs(this, "tt-net");

    public pvs(Context context, int i) {
        this.kj = context;
        this.icD = cR.pvs(context);
        this.bNS = i;
    }

    public void pvs() {
        pvs(false);
    }

    public synchronized void pvs(boolean z) {
        if (this.icD) {
            Jd(z);
            return;
        }
        if (this.sUS <= 0) {
            try {
                yiw().execute(new Runnable() { // from class: com.bytedance.sdk.component.yiw.vG.pvs.1
                    @Override // java.lang.Runnable
                    public void run() {
                        pvs.this.icD();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public static void icD(boolean z) {
        so = z;
    }

    synchronized void icD() {
        if (System.currentTimeMillis() - this.sUS > 3600000) {
            this.sUS = System.currentTimeMillis();
            try {
                if (so.pvs().pvs(this.bNS).so() != null) {
                    so.pvs().pvs(this.bNS).so().icD();
                }
            } catch (Exception unused) {
            }
        }
    }

    private void Jd(boolean z) {
        if (this.NB) {
            return;
        }
        if (this.Jd) {
            this.Jd = false;
            this.sUS = 0L;
            this.yiw = 0L;
        }
        long j = z ? 360000L : 43200000L;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.sUS > j) {
            if (currentTimeMillis - this.yiw > 120000 || !this.Ju) {
                vG();
            }
        }
    }

    public boolean vG() {
        this.qh.get();
        yiw().execute(new Runnable() { // from class: com.bytedance.sdk.component.yiw.vG.pvs.2
            @Override // java.lang.Runnable
            public void run() {
                boolean pvs = com.bytedance.sdk.component.yiw.Jd.NB.pvs(pvs.this.kj);
                if (pvs) {
                    pvs.this.yiw = System.currentTimeMillis();
                    if (pvs.this.qh.compareAndSet(false, true)) {
                        pvs.this.vG(pvs);
                    }
                }
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
        int i = message.what;
        if (i == 101) {
            this.NB = false;
            this.sUS = System.currentTimeMillis();
            if (this.Jd) {
                pvs();
            }
            this.qh.set(false);
            return;
        }
        if (i != 102) {
            return;
        }
        this.NB = false;
        if (this.Jd) {
            pvs();
        }
        this.qh.set(false);
    }

    public synchronized void Jd() {
        if (this.Ju) {
            return;
        }
        this.Ju = true;
        long j = this.kj.getSharedPreferences("ss_app_config", 0).getLong("last_refresh_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (j > currentTimeMillis) {
            j = currentTimeMillis;
        }
        this.sUS = j;
        try {
            if (so.pvs().pvs(this.bNS).so() != null) {
                so.pvs().pvs(this.bNS).so().pvs();
            }
        } catch (Exception unused) {
        }
    }

    public void NB() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        try {
            if (this.icD) {
                Jd();
            } else {
                icD();
            }
        } catch (Throwable unused) {
        }
    }

    void vG(boolean z) {
        Jd();
        this.NB = true;
        if (!z) {
            this.pvs.sendEmptyMessage(102);
            return;
        }
        try {
            so();
        } catch (Exception unused) {
            this.qh.set(false);
        }
    }

    public String[] sUS() {
        String[] sUS = so.pvs().pvs(this.bNS).Jd() != null ? so.pvs().pvs(this.bNS).Jd().sUS() : null;
        return (sUS == null || sUS.length <= 0) ? new String[0] : sUS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pvs(Object obj) throws Exception {
        JSONObject jSONObject;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new JSONObject(str);
            if (!FirebaseAnalytics.Param.SUCCESS.equals(jSONObject.getString(PglCryptUtils.KEY_MESSAGE))) {
                return false;
            }
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        synchronized (this) {
            SharedPreferences.Editor edit = this.kj.getSharedPreferences("ss_app_config", 0).edit();
            edit.putLong("last_refresh_time", System.currentTimeMillis());
            edit.apply();
        }
        if (so.pvs().pvs(this.bNS).so() == null) {
            return true;
        }
        so.pvs().pvs(this.bNS).so().pvs(jSONObject2);
        return true;
    }

    private boolean so() {
        String[] sUS = sUS();
        if (sUS != null && sUS.length != 0) {
            pvs(0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final int i) {
        String[] sUS = sUS();
        if (sUS == null || sUS.length <= i) {
            icD(102);
            return;
        }
        String str = sUS[i];
        if (TextUtils.isEmpty(str)) {
            icD(102);
            return;
        }
        try {
            String pvs = pvs(str);
            if (TextUtils.isEmpty(pvs)) {
                icD(102);
                return;
            }
            com.bytedance.sdk.component.yiw.icD.icD vG = Mxy().vG();
            vG.icD(pvs);
            pvs(vG);
            vG.pvs(new com.bytedance.sdk.component.yiw.pvs.pvs() { // from class: com.bytedance.sdk.component.yiw.vG.pvs.3
                @Override // com.bytedance.sdk.component.yiw.pvs.pvs
                public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, com.bytedance.sdk.component.yiw.icD icd) {
                    JSONObject jSONObject;
                    if (icd == null || !icd.sUS()) {
                        pvs.this.pvs(i + 1);
                        return;
                    }
                    String str2 = null;
                    try {
                        jSONObject = new JSONObject(icd.Jd());
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    if (jSONObject == null) {
                        pvs.this.pvs(i + 1);
                        return;
                    }
                    try {
                        str2 = jSONObject.getString(PglCryptUtils.KEY_MESSAGE);
                    } catch (Exception unused2) {
                    }
                    if (!FirebaseAnalytics.Param.SUCCESS.equals(str2)) {
                        pvs.this.pvs(i + 1);
                        return;
                    }
                    try {
                        if (pvs.this.pvs(jSONObject)) {
                            pvs.this.icD(101);
                        } else {
                            pvs.this.pvs(i + 1);
                        }
                    } catch (Exception unused3) {
                    }
                }

                @Override // com.bytedance.sdk.component.yiw.pvs.pvs
                public void pvs(com.bytedance.sdk.component.yiw.icD.vG vGVar, IOException iOException) {
                    pvs.this.pvs(i + 1);
                }
            });
        } catch (Throwable th) {
            new StringBuilder("try app config exception: ").append(th);
        }
    }

    private com.bytedance.sdk.component.yiw.pvs Mxy() {
        if (this.IP == null) {
            this.IP = new pvs.C0060pvs().pvs(10L, TimeUnit.SECONDS).icD(10L, TimeUnit.SECONDS).vG(10L, TimeUnit.SECONDS).pvs();
        }
        return this.IP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(int i) {
        dyT dyt = this.pvs;
        if (dyt != null) {
            dyt.sendEmptyMessage(i);
        }
    }

    private String pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("https://");
        sb.append(str).append("/get_domains/v4/");
        return sb.toString();
    }

    private void pvs(com.bytedance.sdk.component.yiw.icD.icD icd) {
        if (icd == null) {
            return;
        }
        Address pvs = so.pvs().pvs(this.bNS).Jd() != null ? so.pvs().pvs(this.bNS).Jd().pvs(this.kj) : null;
        if (pvs != null && pvs.hasLatitude() && pvs.hasLongitude()) {
            icd.pvs("latitude", new StringBuilder().append(pvs.getLatitude()).toString());
            icd.pvs("longitude", new StringBuilder().append(pvs.getLongitude()).toString());
            String locality = pvs.getLocality();
            if (!TextUtils.isEmpty(locality)) {
                icd.pvs("city", Uri.encode(locality));
            }
        }
        if (this.vG) {
            icd.pvs("force", "1");
        }
        try {
            icd.pvs("abi", Build.SUPPORTED_ABIS[0]);
        } catch (Throwable unused) {
        }
        if (so.pvs().pvs(this.bNS).Jd() != null) {
            icd.pvs("aid", new StringBuilder().append(so.pvs().pvs(this.bNS).Jd().pvs()).toString());
            icd.pvs("device_platform", so.pvs().pvs(this.bNS).Jd().vG());
            icd.pvs("channel", so.pvs().pvs(this.bNS).Jd().icD());
            icd.pvs("version_code", new StringBuilder().append(so.pvs().pvs(this.bNS).Jd().Jd()).toString());
            icd.pvs("custom_info_1", so.pvs().pvs(this.bNS).Jd().NB());
        }
    }

    public static ExecutorService yiw() {
        vG vGVar = Mxy;
        ExecutorService threadPool = vGVar != null ? vGVar.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (Wyp == null) {
            synchronized (pvs.class) {
                if (Wyp == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    Wyp = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return Wyp;
    }

    public static void pvs(vG vGVar) {
        Mxy = vGVar;
    }
}
