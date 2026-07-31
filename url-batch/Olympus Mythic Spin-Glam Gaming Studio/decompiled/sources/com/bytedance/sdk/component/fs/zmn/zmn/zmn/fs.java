package com.bytedance.sdk.component.fs.zmn.zmn.zmn;

import android.text.TextUtils;
import com.bytedance.sdk.component.fs.zmn.klz;
import com.bytedance.sdk.component.fs.zmn.mw;
import com.bytedance.sdk.component.fs.zmn.rc;
import com.bytedance.sdk.component.fs.zmn.rt;
import com.bytedance.sdk.component.fs.zmn.zg;
import com.ironsource.C4701ic;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public class fs implements com.bytedance.sdk.component.fs.zmn.fs {
    private static List<Object> btk;
    com.bytedance.sdk.component.fs.zmn.fb fs;
    klz zmn;
    private AtomicBoolean fb = new AtomicBoolean(false);
    private final String zn = System.identityHashCode(this) + "-" + System.currentTimeMillis();

    static {
        try {
            btk = new ArrayList();
            Class<?> cls = Class.forName("com.android.okhttp.Protocol");
            Enum valueOf = Enum.valueOf(cls, "HTTP_1_1");
            if (valueOf != null) {
                btk.add(valueOf);
            }
            Enum valueOf2 = Enum.valueOf(cls, "HTTP_2");
            if (valueOf2 != null) {
                btk.add(valueOf2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    fs(klz klzVar, com.bytedance.sdk.component.fs.zmn.fb fbVar) {
        this.zmn = klzVar;
        this.fs = fbVar;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs
    public klz zmn() {
        return this.zmn;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs
    public rt fs() throws IOException {
        List<com.bytedance.sdk.component.fs.zmn.zg> list;
        com.bytedance.sdk.component.zn.zmn.zmn zmnVar;
        klz klzVar = this.zmn;
        if (klzVar != null && (zmnVar = klzVar.fs) != null) {
            if (zmnVar.rt() == 0) {
                this.zmn.fs.cn();
            }
            this.zmn.fs.zmn();
        }
        this.fs.zn().remove(this);
        this.fs.fb().add(this);
        com.bytedance.sdk.component.fs.zmn.fb fbVar = this.fs;
        if ((fbVar instanceof hhw) && (fbVar.zn().size() + this.fs.fb().size() > this.fs.zmn() || this.fb.get())) {
            this.fs.fb().remove(this);
            return new zg(zg.zmn, "Maximum number of requests exceeded", this.zmn);
        }
        try {
            rc rcVar = this.zmn.zmn;
            if (rcVar != null && (list = rcVar.zmn) != null && list.size() > 0) {
                ArrayList arrayList = new ArrayList(this.zmn.zmn.zmn);
                arrayList.add(new com.bytedance.sdk.component.fs.zmn.zg() { // from class: com.bytedance.sdk.component.fs.zmn.zmn.zmn.fs.1
                    @Override // com.bytedance.sdk.component.fs.zmn.zg
                    public rt zmn(zg.zmn zmnVar2) throws IOException {
                        return fs.this.zmn(zmnVar2.zmn());
                    }
                });
                return ((com.bytedance.sdk.component.fs.zmn.zg) arrayList.get(0)).zmn(new zn(arrayList, this.zmn));
            }
            return zmn(this.zmn);
        } finally {
        }
    }

    private boolean zmn(mw mwVar) {
        klz klzVar;
        byte[] bArr;
        return mwVar != null && (klzVar = this.zmn) != null && "POST".equalsIgnoreCase(klzVar.btk()) && mwVar.hhw == mw.zmn.BYTE_ARRAY_TYPE && (bArr = mwVar.btk) != null && bArr.length > 0;
    }

    private boolean fs(mw mwVar) {
        klz klzVar;
        return (mwVar == null || (klzVar = this.zmn) == null || !"POST".equalsIgnoreCase(klzVar.btk()) || mwVar.hhw != mw.zmn.STRING_TYPE || TextUtils.isEmpty(mwVar.fb)) ? false : true;
    }

    public rt zmn(klz klzVar) throws IOException {
        return zmn(klzVar, com.bytedance.sdk.component.nps.zmn.btk());
    }

    public rt zmn(klz klzVar, boolean z) throws IOException {
        boolean hhw = com.bytedance.sdk.component.nps.zmn.hhw();
        List<String> zmn = klzVar != null ? klzVar.zmn() : null;
        boolean z2 = (zmn == null || zmn.isEmpty()) ? false : true;
        if (hhw && z2) {
            return zmn(klzVar, zmn);
        }
        return fs(klzVar, z);
    }

    private klz zmn(klz klzVar, String str) {
        return klzVar.rc().fs(str).fs();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private rt zmn(klz klzVar, List<String> list) throws IOException {
        String str;
        int i;
        long j;
        int i2;
        boolean z;
        rt fs;
        rt rtVar;
        String url = klzVar.fb().zmn().toString();
        List<String> zmn = com.bytedance.sdk.component.nps.zn.zn.zmn().zmn(url, list);
        long currentTimeMillis = System.currentTimeMillis();
        long fs2 = klzVar.fs();
        int size = zmn.size();
        boolean z2 = false;
        rt rtVar2 = null;
        int i3 = 0;
        while (i3 < size) {
            String str2 = zmn.get(i3);
            boolean z3 = (str2 == null || !str2.equals(url)) ? z2 : true;
            if (System.currentTimeMillis() - currentTimeMillis > fs2) {
                com.bytedance.sdk.component.nps.zmn.zmn(this.zn, url, str2, -1, "Total timeout", false, i3 + 1, size);
                return rtVar2 != null ? rtVar2 : new zg(-1, "Total timeout", klzVar, str2);
            }
            if (this.fb.get()) {
                com.bytedance.sdk.component.nps.zmn.zmn(this.zn, url, str2, zg.fs, "Request canceled", false, i3 + 1, size);
                return new zg(zg.fs, "Request canceled", klzVar, str2);
            }
            int i4 = i3 + 1;
            try {
                zmn.size();
                fs = fs(z3 ? klzVar : zmn(klzVar, str2), com.bytedance.sdk.component.nps.zmn.btk());
                if (fs instanceof zg) {
                    ((zg) fs).zmn(str2);
                }
                try {
                } catch (IOException e) {
                    e = e;
                    rtVar = fs;
                    str = str2;
                    i = size;
                    j = currentTimeMillis;
                    i2 = i3;
                    z = z2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (fs.fb()) {
                try {
                    com.bytedance.sdk.component.nps.zn.zn.zmn().zmn(str2, url, true);
                    return fs;
                } catch (IOException e3) {
                    e = e3;
                    rtVar2 = fs;
                    str = str2;
                    i = size;
                    j = currentTimeMillis;
                    i2 = i3;
                    z = z2;
                    e.getMessage();
                    String str3 = str;
                    com.bytedance.sdk.component.nps.zn.zn.zmn().zmn(str3, url, z);
                    com.bytedance.sdk.component.nps.zmn.zmn(this.zn, url, str3, zg.zmn, e.getMessage(), true, i2 + 1, i);
                    if (i2 != zmn.size() - 1) {
                        e.getMessage();
                    }
                    i3 = i2 + 1;
                    z2 = z;
                    size = i;
                    currentTimeMillis = j;
                }
            } else {
                com.bytedance.sdk.component.nps.zn.zn.zmn().zmn(str2, url, z2);
                rtVar = fs;
                str = str2;
                j = currentTimeMillis;
                i2 = i3;
                z = z2;
                i = size;
                try {
                    com.bytedance.sdk.component.nps.zmn.zmn(this.zn, url, str2, fs.zn(), fs.btk(), true, i4, size);
                    rtVar.zn();
                } catch (IOException e4) {
                    e = e4;
                    rtVar2 = rtVar;
                    e.getMessage();
                    String str32 = str;
                    com.bytedance.sdk.component.nps.zn.zn.zmn().zmn(str32, url, z);
                    com.bytedance.sdk.component.nps.zmn.zmn(this.zn, url, str32, zg.zmn, e.getMessage(), true, i2 + 1, i);
                    if (i2 != zmn.size() - 1) {
                    }
                    i3 = i2 + 1;
                    z2 = z;
                    size = i;
                    currentTimeMillis = j;
                }
                if (i2 == zmn.size() - 1) {
                    return rtVar;
                }
                rtVar2 = rtVar;
                i3 = i2 + 1;
                z2 = z;
                size = i;
                currentTimeMillis = j;
            }
        }
        return rtVar2 != null ? rtVar2 : new zg(zg.zmn, "No URLs to try", klzVar, zmn.get(zmn.size() - 1));
    }

    private rt fs(klz klzVar, boolean z) throws IOException {
        HttpURLConnection httpURLConnection;
        IOException e;
        String zmn;
        int httpUrlConnectionGetResponseCode;
        int i = zg.zmn;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(klzVar.fb().zmn().toString()).openConnection();
            if (z) {
                try {
                    if (!"setting".equals(klzVar.zg()) && !"gecko".equals(klzVar.zg()) && !"load_ug_t".equals(klzVar.zg()) && !"pixel_web".equals(klzVar.zg())) {
                        fs(httpURLConnection);
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (i == -1 && z) {
                        klzVar.fb().zmn().toString();
                        return fs(klzVar, false);
                    }
                    zmn = zmn(httpURLConnection, e);
                    return new zg(i, zmn, klzVar);
                } catch (Exception e3) {
                    e = e3;
                    httpURLConnection2 = httpURLConnection;
                    zmn = zmn(httpURLConnection2, e);
                    return new zg(i, zmn, klzVar);
                }
            }
            if (klzVar.hhw() != null && !klzVar.hhw().isEmpty()) {
                for (Map.Entry<String, List<String>> entry : klzVar.hhw().entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        if ("_disable_retry".equals(key) && "1".equals(str)) {
                            zn(httpURLConnection);
                        } else {
                            httpURLConnection.addRequestProperty(key, str);
                        }
                    }
                }
            }
            rc rcVar = klzVar.zmn;
            if (rcVar != null) {
                TimeUnit timeUnit = rcVar.zn;
                if (timeUnit != null) {
                    httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(rcVar.fs));
                }
                rc rcVar2 = klzVar.zmn;
                TimeUnit timeUnit2 = rcVar2.btk;
                if (timeUnit2 != null) {
                    httpURLConnection.setReadTimeout((int) timeUnit2.toMillis(rcVar2.fb));
                }
            }
            if (klzVar.iv() == null) {
                httpURLConnection.setRequestMethod(C4701ic.a);
            } else {
                if (!btk() && klzVar.iv().zn != null) {
                    httpURLConnection.addRequestProperty("Content-Type", klzVar.iv().zn.zmn());
                }
                httpURLConnection.setRequestMethod(klzVar.btk());
                if ("POST".equalsIgnoreCase(klzVar.btk())) {
                    OutputStream urlConnectionGetOutputStream = PangleNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
                    if (zmn(klzVar.iv())) {
                        urlConnectionGetOutputStream.write(klzVar.iv().btk);
                    } else if (fs(klzVar.iv())) {
                        urlConnectionGetOutputStream.write(klzVar.iv().fb.getBytes());
                    }
                    urlConnectionGetOutputStream.flush();
                    urlConnectionGetOutputStream.close();
                }
            }
            com.bytedance.sdk.component.zn.zmn.zmn zmnVar = klzVar.fs;
            if (zmnVar != null) {
                zmnVar.fs();
            }
            httpURLConnection.connect();
            com.bytedance.sdk.component.zn.zmn.zmn zmnVar2 = klzVar.fs;
            if (zmnVar2 != null) {
                zmnVar2.zn();
            }
            httpUrlConnectionGetResponseCode = PangleNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            com.bytedance.sdk.component.zn.zmn.zmn zmnVar3 = klzVar.fs;
            if (zmnVar3 != null) {
                zmnVar3.btk();
            }
        } catch (IOException e4) {
            httpURLConnection = null;
            e = e4;
        } catch (Exception e5) {
            e = e5;
        }
        if (this.fb.get()) {
            i = zg.fs;
            zmn(httpURLConnection);
            zmn = "internal error";
            return new zg(i, zmn, klzVar);
        }
        return new zg(httpURLConnection, klzVar, httpUrlConnectionGetResponseCode);
    }

    private void zmn(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                PangleNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    private static String zmn(HttpURLConnection httpURLConnection, Exception exc) {
        try {
            return httpURLConnection.getErrorStream().toString();
        } catch (Throwable unused) {
            return exc.getMessage();
        }
    }

    private static void fs(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (btk.size() == 2) {
                obj2.getClass().getDeclaredMethod("setProtocols", List.class).invoke(obj2, btk);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static void zn(HttpURLConnection httpURLConnection) {
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

    private boolean btk() {
        if (this.zmn.hhw() == null) {
            return false;
        }
        return this.zmn.hhw().containsKey("Content-Type");
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs
    public void zmn(final com.bytedance.sdk.component.fs.zmn.zn znVar) {
        com.bytedance.sdk.component.zn.zmn.zmn zmnVar;
        klz klzVar = this.zmn;
        if (klzVar != null && (zmnVar = klzVar.fs) != null) {
            zmnVar.cn();
        }
        this.fs.fs().submit(new com.bytedance.sdk.component.zg.fs.zn(this.zmn.zg(), this.zmn.bvs()) { // from class: com.bytedance.sdk.component.fs.zmn.zmn.zmn.fs.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    rt fs = fs.this.fs();
                    if (fs == null) {
                        znVar.zmn(fs.this, new IOException("response is null"));
                    } else {
                        znVar.zmn(fs.this, fs);
                    }
                } catch (IOException e) {
                    znVar.zmn(fs.this, e);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs
    public void zn() {
        this.fb.set(true);
    }

    /* renamed from: fb, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.fs.zmn.fs clone() {
        return new fs(this.zmn, this.fs);
    }
}
