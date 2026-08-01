package com.bytedance.sdk.component.icD.pvs.pvs.pvs;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.bytedance.sdk.component.icD.pvs.IP;
import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.bNS;
import com.bytedance.sdk.component.icD.pvs.so;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NetCall.java */
/* loaded from: classes.dex */
public class icD implements com.bytedance.sdk.component.icD.pvs.icD {
    com.bytedance.sdk.component.icD.pvs.Jd icD;
    Ju pvs;
    private AtomicBoolean vG = new AtomicBoolean(false);

    icD(Ju ju, com.bytedance.sdk.component.icD.pvs.Jd jd) {
        this.pvs = ju;
        this.icD = jd;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.icD
    public bNS pvs() throws IOException {
        Ju ju = this.pvs;
        if (ju != null && ju.icD != null) {
            if (this.pvs.icD.IP() == 0) {
                this.pvs.icD.bNS();
            }
            this.pvs.icD.pvs();
        }
        this.icD.vG().remove(this);
        this.icD.Jd().add(this);
        com.bytedance.sdk.component.icD.pvs.Jd jd = this.icD;
        if ((jd instanceof NB) && (jd.vG().size() + this.icD.Jd().size() > this.icD.pvs() || this.vG.get())) {
            this.icD.Jd().remove(this);
            return new yiw(yiw.pvs, "Maximum number of requests exceeded", this.pvs);
        }
        try {
            if (this.pvs.pvs != null && this.pvs.pvs.pvs != null && this.pvs.pvs.pvs.size() > 0) {
                ArrayList arrayList = new ArrayList(this.pvs.pvs.pvs);
                arrayList.add(new com.bytedance.sdk.component.icD.pvs.so() { // from class: com.bytedance.sdk.component.icD.pvs.pvs.pvs.icD.1
                    @Override // com.bytedance.sdk.component.icD.pvs.so
                    public bNS pvs(so.pvs pvsVar) throws IOException {
                        return icD.this.pvs(pvsVar.pvs());
                    }
                });
                return ((com.bytedance.sdk.component.icD.pvs.so) arrayList.get(0)).pvs(new vG(arrayList, this.pvs));
            }
            return pvs(this.pvs);
        } catch (Throwable th) {
            throw new IOException(th.getMessage());
        }
    }

    private boolean pvs(IP ip) {
        Ju ju;
        return ip != null && (ju = this.pvs) != null && ShareTarget.METHOD_POST.equalsIgnoreCase(ju.vG()) && ip.sUS == IP.pvs.BYTE_ARRAY_TYPE && ip.NB != null && ip.NB.length > 0;
    }

    private boolean icD(IP ip) {
        Ju ju;
        return (ip == null || (ju = this.pvs) == null || !ShareTarget.METHOD_POST.equalsIgnoreCase(ju.vG()) || ip.sUS != IP.pvs.STRING_TYPE || TextUtils.isEmpty(ip.Jd)) ? false : true;
    }

    public bNS pvs(Ju ju) throws IOException {
        HttpURLConnection httpURLConnection;
        Exception e;
        String message;
        int i = yiw.pvs;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(ju.icD().pvs().toString()).openConnection();
            } catch (Exception e2) {
                httpURLConnection = null;
                e = e2;
            }
            try {
                if (ju.Jd() != null && ju.Jd().size() > 0) {
                    for (Map.Entry<String, List<String>> entry : ju.Jd().entrySet()) {
                        String key = entry.getKey();
                        for (String str : entry.getValue()) {
                            if ("_disable_retry".equals(key) && "1".equals(str)) {
                                pvs(httpURLConnection);
                            } else {
                                httpURLConnection.addRequestProperty(key, str);
                            }
                        }
                    }
                }
                if (ju.pvs != null) {
                    if (ju.pvs.vG != null) {
                        httpURLConnection.setConnectTimeout((int) ju.pvs.vG.toMillis(ju.pvs.icD));
                    }
                    if (ju.pvs.vG != null) {
                        httpURLConnection.setReadTimeout((int) ju.pvs.NB.toMillis(ju.pvs.Jd));
                    }
                }
                if (ju.so() == null) {
                    httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                } else {
                    if (!vG() && ju.so().vG != null) {
                        httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_TYPE, ju.so().vG.pvs());
                    }
                    httpURLConnection.setRequestMethod(ju.vG());
                    if (ShareTarget.METHOD_POST.equalsIgnoreCase(ju.vG())) {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        if (pvs(ju.so())) {
                            outputStream.write(ju.so().NB);
                        } else if (icD(ju.so())) {
                            outputStream.write(ju.so().Jd.getBytes());
                        }
                        outputStream.flush();
                        outputStream.close();
                    }
                }
                if (ju != null && ju.icD != null) {
                    ju.icD.icD();
                }
                httpURLConnection.connect();
                if (ju != null && ju.icD != null) {
                    ju.icD.vG();
                }
                i = httpURLConnection.getResponseCode();
                if (ju != null && ju.icD != null) {
                    ju.icD.NB();
                }
            } catch (Exception e3) {
                e = e3;
                try {
                    message = httpURLConnection.getErrorStream().toString();
                } catch (Throwable unused) {
                    message = e.getMessage();
                }
                return new yiw(i, message, ju);
            }
            if (!this.vG.get()) {
                return new yiw(httpURLConnection, ju);
            }
            httpURLConnection.disconnect();
            this.icD.Jd().remove(this);
            message = "internal error";
            return new yiw(i, message, ju);
        } finally {
            this.icD.Jd().remove(this);
        }
    }

    private static void pvs(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    private boolean vG() {
        if (this.pvs.Jd() == null) {
            return false;
        }
        return this.pvs.Jd().containsKey(HttpHeaders.CONTENT_TYPE);
    }

    @Override // com.bytedance.sdk.component.icD.pvs.icD
    public void pvs(final com.bytedance.sdk.component.icD.pvs.vG vGVar) {
        Ju ju = this.pvs;
        if (ju != null && ju.icD != null) {
            this.pvs.icD.bNS();
        }
        this.icD.icD().submit(new com.bytedance.sdk.component.so.vG.icD(this.pvs.yiw(), this.pvs.sUS()) { // from class: com.bytedance.sdk.component.icD.pvs.pvs.pvs.icD.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    bNS pvs = icD.this.pvs();
                    if (pvs == null) {
                        vGVar.pvs(icD.this, new IOException("response is null"));
                    } else {
                        vGVar.pvs(icD.this, pvs);
                    }
                } catch (IOException e) {
                    vGVar.pvs(icD.this, e);
                }
            }
        });
    }

    /* renamed from: icD, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.icD.pvs.icD clone() {
        return new icD(this.pvs, this.icD);
    }
}
