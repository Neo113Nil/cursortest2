package com.bytedance.sdk.component.yiw.vG;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.bNS;
import java.net.InetAddress;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: TNCManager.java */
/* loaded from: classes.dex */
public class sUS {
    private boolean Jd;
    private icD NB;
    private NB so;
    private pvs vG;
    private Context yiw;
    private int zM;
    private long icD = 0;
    private boolean sUS = false;
    private int Mxy = 0;
    private long Wyp = 19700101000L;
    private int qh = 0;
    private HashMap<String, Integer> kj = new HashMap<>();
    private HashMap<String, Integer> Ju = new HashMap<>();
    private int IP = 0;
    private HashMap<String, Integer> bNS = new HashMap<>();
    private HashMap<String, Integer> mnm = new HashMap<>();
    private boolean vA = true;
    private Map<String, Integer> cR = new HashMap();
    Handler pvs = new Handler(Looper.getMainLooper()) { // from class: com.bytedance.sdk.component.yiw.vG.sUS.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 10000) {
                return;
            }
            sUS.this.icD(message.arg1 != 0);
        }
    };

    private boolean pvs(int i) {
        return i >= 200 && i < 400;
    }

    private sUS() {
    }

    public sUS(int i) {
        this.zM = i;
    }

    public String pvs() {
        return "ttnet_tnc_config" + this.zM;
    }

    public pvs icD() {
        return this.vG;
    }

    public void pvs(boolean z) {
        this.Jd = z;
    }

    public void pvs(icD icd) {
        this.NB = icd;
    }

    public boolean vG() {
        return this.Jd;
    }

    public icD Jd() {
        return this.NB;
    }

    public void NB() {
        this.cR.clear();
    }

    public synchronized void pvs(Context context, boolean z) {
        if (!this.sUS) {
            this.yiw = context;
            this.vA = z;
            this.so = new NB(context, z, this.zM);
            if (z) {
                Mxy();
            }
            this.vG = so.pvs().pvs(this.zM, this.yiw);
            this.sUS = true;
        }
    }

    private void Mxy() {
        SharedPreferences sharedPreferences = this.yiw.getSharedPreferences(pvs(), 0);
        this.Mxy = sharedPreferences.getInt("tnc_probe_cmd", 0);
        this.Wyp = sharedPreferences.getLong("tnc_probe_version", 19700101000L);
    }

    public Jd sUS() {
        NB nb = this.so;
        if (nb != null) {
            return nb.vG();
        }
        return null;
    }

    public Map<String, String> yiw() {
        Jd sUS = sUS();
        if (sUS != null) {
            return sUS.Jd;
        }
        return null;
    }

    public NB so() {
        return this.so;
    }

    public String pvs(String str) {
        String str2;
        Map<String, String> yiw;
        if (TextUtils.isEmpty(str) || str.contains("/network/get_network") || str.contains("/get_domains/v4") || str.contains("/ies/speed")) {
            return str;
        }
        String str3 = null;
        try {
            URL url = new URL(str);
            str2 = url.getProtocol();
            try {
                str3 = url.getHost();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if ((!"http".equals(str2) && !"https".equals(str2)) || TextUtils.isEmpty(str3) || Jd(str3) || (yiw = yiw()) == null || !yiw.containsKey(str3)) {
            return str;
        }
        String str4 = yiw.get(str3);
        if (TextUtils.isEmpty(str4)) {
            return str;
        }
        String str5 = str2 + "://" + str3;
        return str.startsWith(str5) ? str.replaceFirst(str5, str2 + "://" + str4) : str;
    }

    public synchronized void pvs(Ju ju, bNS bns) {
        URL url;
        if (ju == null || bns == null) {
            return;
        }
        if (this.vA) {
            if (com.bytedance.sdk.component.yiw.Jd.NB.pvs(this.yiw)) {
                try {
                    url = ju.icD().pvs();
                } catch (Exception unused) {
                    url = null;
                }
                if (url == null) {
                    return;
                }
                String protocol = url.getProtocol();
                String host = url.getHost();
                String path = url.getPath();
                String pvs = pvs(ju);
                int vG = bns.vG();
                if ("http".equals(protocol) || "https".equals(protocol)) {
                    if (TextUtils.isEmpty(pvs)) {
                        return;
                    }
                    Jd sUS = sUS();
                    if (sUS != null && sUS.icD) {
                        pvs(bns, host);
                    }
                    if (sUS == null) {
                        return;
                    }
                    this.kj.size();
                    this.Ju.size();
                    this.bNS.size();
                    this.mnm.size();
                    if (vG > 0) {
                        if (pvs(vG)) {
                            if (this.qh > 0 || this.IP > 0) {
                                Wyp();
                            }
                            vG(host);
                            return;
                        }
                        if (!icD(vG)) {
                            this.IP++;
                            this.bNS.put(path, 0);
                            this.mnm.put(pvs, 0);
                            if (this.IP >= sUS.so && this.bNS.size() >= sUS.Mxy && this.mnm.size() >= sUS.Wyp) {
                                pvs(false, 0L);
                                Wyp();
                            }
                            icD(host);
                        }
                    }
                }
            }
        }
    }

    private String pvs(Ju ju) {
        if (ju == null || ju.icD() == null || ju.icD().pvs() == null) {
            return "";
        }
        try {
            return InetAddress.getByName(ju.icD().pvs().getHost()).getHostAddress();
        } catch (Exception unused) {
            return "";
        }
    }

    private void icD(String str) {
        Map<String, String> yiw;
        if (TextUtils.isEmpty(str) || (yiw = yiw()) == null || !yiw.containsValue(str)) {
            return;
        }
        if (this.cR.get(str) == null) {
            this.cR.put(str, 1);
        } else {
            this.cR.put(str, Integer.valueOf(this.cR.get(str).intValue() + 1));
        }
    }

    private void vG(String str) {
        if (!TextUtils.isEmpty(str) && this.cR.containsKey(str)) {
            this.cR.put(str, 0);
        }
    }

    private boolean Jd(String str) {
        Map<String, String> yiw = yiw();
        if (yiw == null) {
            return false;
        }
        String str2 = yiw.get(str);
        return (TextUtils.isEmpty(str2) || this.cR.get(str2) == null || this.cR.get(str2).intValue() < 3) ? false : true;
    }

    public synchronized void pvs(Ju ju, Exception exc) {
        URL url;
        if (ju != null) {
            if (ju.icD() != null && exc != null) {
                if (this.vA) {
                    if (com.bytedance.sdk.component.yiw.Jd.NB.pvs(this.yiw)) {
                        try {
                            url = ju.icD().pvs();
                        } catch (Exception unused) {
                            url = null;
                        }
                        if (url == null) {
                            return;
                        }
                        String protocol = url.getProtocol();
                        String host = url.getHost();
                        String path = url.getPath();
                        String pvs = pvs(ju);
                        if ("http".equals(protocol) || "https".equals(protocol)) {
                            Jd sUS = sUS();
                            if (sUS == null) {
                                return;
                            }
                            this.kj.size();
                            this.Ju.size();
                            this.bNS.size();
                            this.mnm.size();
                            this.qh++;
                            this.kj.put(path, 0);
                            this.Ju.put(pvs, 0);
                            if (this.qh >= sUS.NB && this.kj.size() >= sUS.sUS && this.Ju.size() >= sUS.yiw) {
                                pvs(false, 0L);
                                Wyp();
                            }
                            icD(host);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pvs(bNS bns, String str) {
        String[] split;
        int i;
        long j;
        Jd sUS;
        if (bns != null && this.vA) {
            String pvs = bns.pvs("tnc-cmd", null);
            if (TextUtils.isEmpty(pvs) || (split = pvs.split("@")) == null || split.length != 2) {
                return;
            }
            try {
                i = Integer.parseInt(split[0]);
            } catch (Throwable unused) {
                i = 0;
            }
            try {
                j = Long.parseLong(split[1]);
            } catch (Throwable unused2) {
                j = 0;
                if (j > this.Wyp) {
                }
            }
            if (j > this.Wyp) {
                return;
            }
            this.Mxy = i;
            this.Wyp = j;
            this.yiw.getSharedPreferences(pvs(), 0).edit().putInt("tnc_probe_cmd", i).putLong("tnc_probe_version", j).apply();
            if (this.Mxy != 10000 || (sUS = sUS()) == null) {
                return;
            }
            pvs(true, sUS.kj > 0 ? new Random(System.currentTimeMillis()).nextInt(sUS.kj) * 1000 : 0L);
        }
    }

    private void pvs(boolean z, long j) {
        if (this.pvs.hasMessages(10000)) {
            return;
        }
        Message obtainMessage = this.pvs.obtainMessage();
        obtainMessage.what = 10000;
        obtainMessage.arg1 = z ? 1 : 0;
        if (j > 0) {
            this.pvs.sendMessageDelayed(obtainMessage, j);
        } else {
            this.pvs.sendMessage(obtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(boolean z) {
        if (sUS() == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z || this.icD + (r0.qh * 1000) <= elapsedRealtime) {
            this.icD = elapsedRealtime;
            so.pvs().pvs(this.zM, this.yiw).vG();
        }
    }

    private void Wyp() {
        this.qh = 0;
        this.kj.clear();
        this.Ju.clear();
        this.IP = 0;
        this.bNS.clear();
        this.mnm.clear();
    }

    private boolean icD(int i) {
        if (i < 100 || i >= 1000) {
            return true;
        }
        Jd sUS = sUS();
        return (sUS == null || TextUtils.isEmpty(sUS.Ju) || !sUS.Ju.contains(String.valueOf(i))) ? false : true;
    }
}
