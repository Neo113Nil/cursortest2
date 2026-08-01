package com.bytedance.sdk.component.yiw.icD;

import android.text.TextUtils;
import com.bytedance.sdk.component.icD.pvs.IP;
import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.Mxy;
import com.bytedance.sdk.component.icD.pvs.bNS;
import com.bytedance.sdk.component.icD.pvs.mnm;
import com.bytedance.sdk.component.icD.pvs.qh;
import com.bytedance.sdk.component.icD.pvs.sUS;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: PostExecutor.java */
/* loaded from: classes.dex */
public class Jd extends vG {
    IP pvs;

    public Jd(qh qhVar) {
        super(qhVar);
        this.pvs = null;
    }

    public void Jd(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        this.pvs = IP.pvs(Mxy.pvs("application/json; charset=utf-8"), str);
    }

    public void pvs(JSONObject jSONObject) {
        this.pvs = IP.pvs(Mxy.pvs("application/json; charset=utf-8"), jSONObject != null ? jSONObject.toString() : "{}");
    }

    public void pvs(String str, byte[] bArr) {
        this.pvs = IP.pvs(Mxy.pvs(str), bArr);
    }

    public void pvs(final com.bytedance.sdk.component.yiw.pvs.pvs pvsVar) {
        try {
            Ju.pvs pvsVar2 = new Ju.pvs();
            if (TextUtils.isEmpty(this.so)) {
                pvsVar.pvs(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.NB)) {
                pvsVar2.pvs(this.NB);
            }
            if (this.sUS > 0) {
                pvsVar2.pvs(this.sUS);
            }
            pvsVar2.icD(this.so);
            if (this.pvs == null) {
                if (pvsVar != null) {
                    pvsVar.pvs(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                pvs(pvsVar2);
                pvsVar2.pvs((Object) icD());
                this.vG.pvs(pvsVar2.pvs(this.pvs).icD()).pvs(new com.bytedance.sdk.component.icD.pvs.vG() { // from class: com.bytedance.sdk.component.yiw.icD.Jd.1
                    @Override // com.bytedance.sdk.component.icD.pvs.vG
                    public void pvs(com.bytedance.sdk.component.icD.pvs.icD icd, IOException iOException) {
                        com.bytedance.sdk.component.yiw.pvs.pvs pvsVar3 = pvsVar;
                        if (pvsVar3 != null) {
                            pvsVar3.pvs(Jd.this, iOException);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
                    @Override // com.bytedance.sdk.component.icD.pvs.vG
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void pvs(com.bytedance.sdk.component.icD.pvs.icD icd, bNS bns) throws IOException {
                        com.bytedance.sdk.component.yiw.icD icd2;
                        HashMap hashMap;
                        com.bytedance.sdk.component.yiw.icD icd3;
                        com.bytedance.sdk.component.yiw.pvs.pvs pvsVar3 = pvsVar;
                        if (pvsVar3 != null) {
                            if (bns == null) {
                                pvsVar3.pvs(Jd.this, new IOException("No response"));
                                return;
                            }
                            IOException iOException = null;
                            try {
                                hashMap = new HashMap();
                                sUS yiw = bns.yiw();
                                if (yiw != null) {
                                    for (int i = 0; i < yiw.pvs(); i++) {
                                        String pvs = yiw.pvs(i);
                                        String icD = yiw.icD(i);
                                        hashMap.put(pvs, icD);
                                        if (pvs != null && pvs.equalsIgnoreCase("content-type")) {
                                            hashMap.put("content-type", icD == null ? "" : icD.toLowerCase());
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                if (com.bytedance.sdk.component.yiw.Jd.pvs.pvs(hashMap)) {
                                    byte[] Jd = bns.sUS().Jd();
                                    com.bytedance.sdk.component.yiw.icD icd4 = new com.bytedance.sdk.component.yiw.icD(bns.Jd(), bns.vG(), bns.NB(), hashMap, null, bns.icD(), bns.pvs());
                                    icd4.pvs(Jd);
                                    icd3 = icd4;
                                } else if (Jd.this.Mxy) {
                                    byte[] Jd2 = bns.sUS().Jd();
                                    Jd jd = Jd.this;
                                    com.bytedance.sdk.component.yiw.icD icd5 = new com.bytedance.sdk.component.yiw.icD(bns.Jd(), bns.vG(), bns.NB(), hashMap, new String(Jd2, jd.pvs(jd.pvs(bns.sUS()))), bns.icD(), bns.pvs());
                                    icd5.pvs(Jd2);
                                    icd3 = icd5;
                                } else {
                                    icd3 = new com.bytedance.sdk.component.yiw.icD(bns.Jd(), bns.vG(), bns.NB(), hashMap, bns.sUS().icD(), bns.icD(), bns.pvs());
                                }
                                Jd.this.pvs(icd3, bns);
                                icd2 = icd3;
                            } catch (Throwable th2) {
                                th = th2;
                                iOException = icd3;
                                icd2 = iOException;
                                iOException = new IOException(th);
                                if (icd2 == 0) {
                                }
                            }
                            if (icd2 == 0) {
                                pvsVar.pvs(Jd.this, icd2);
                                return;
                            }
                            com.bytedance.sdk.component.yiw.pvs.pvs pvsVar4 = pvsVar;
                            if (pvsVar4 instanceof com.bytedance.sdk.component.yiw.pvs.icD) {
                                com.bytedance.sdk.component.yiw.pvs.icD icd6 = (com.bytedance.sdk.component.yiw.pvs.icD) pvsVar4;
                                Jd jd2 = Jd.this;
                                if (iOException == null) {
                                    iOException = new IOException("Unexpected exception");
                                }
                                icd6.pvs(jd2, iOException, new com.bytedance.sdk.component.yiw.icD(bns.Jd(), bns.vG(), bns.NB(), null, null, bns.icD(), bns.pvs()));
                                return;
                            }
                            Jd jd3 = Jd.this;
                            if (iOException == null) {
                                iOException = new IOException("Unexpected exception");
                            }
                            pvsVar4.pvs(jd3, iOException);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            pvsVar.pvs(this, new IOException(th.getMessage()));
        }
    }

    public com.bytedance.sdk.component.yiw.icD pvs() {
        com.bytedance.sdk.component.yiw.icD icd;
        try {
            Ju.pvs pvsVar = new Ju.pvs();
            if (TextUtils.isEmpty(this.so)) {
                return new com.bytedance.sdk.component.yiw.icD(false, PAGErrorCode.LOAD_FACTORY_NULL_CODE, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            pvsVar.icD(this.so);
            if (this.pvs == null) {
                return new com.bytedance.sdk.component.yiw.icD(false, PAGErrorCode.LOAD_FACTORY_NULL_CODE, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            pvs(pvsVar);
            pvsVar.pvs((Object) icD());
            bNS pvs = this.vG.pvs(pvsVar.pvs(this.pvs).icD()).pvs();
            if (pvs == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            sUS yiw = pvs.yiw();
            if (yiw != null) {
                for (int i = 0; i < yiw.pvs(); i++) {
                    String pvs2 = yiw.pvs(i);
                    String icD = yiw.icD(i);
                    hashMap.put(pvs2, icD);
                    if (pvs2 != null && pvs2.equalsIgnoreCase("content-type")) {
                        hashMap.put("content-type", icD == null ? "" : icD.toLowerCase());
                    }
                }
            }
            if (com.bytedance.sdk.component.yiw.Jd.pvs.pvs(hashMap)) {
                byte[] Jd = pvs.sUS().Jd();
                icd = new com.bytedance.sdk.component.yiw.icD(pvs.Jd(), pvs.vG(), pvs.NB(), hashMap, null, pvs.icD(), pvs.pvs());
                icd.pvs(Jd);
            } else if (this.Mxy) {
                byte[] Jd2 = pvs.sUS().Jd();
                icd = new com.bytedance.sdk.component.yiw.icD(pvs.Jd(), pvs.vG(), pvs.NB(), hashMap, new String(Jd2, pvs(pvs(pvs.sUS()))), pvs.icD(), pvs.pvs());
                icd.pvs(Jd2);
            } else {
                icd = new com.bytedance.sdk.component.yiw.icD(pvs.Jd(), pvs.vG(), pvs.NB(), hashMap, pvs.sUS().icD(), pvs.icD(), pvs.pvs());
            }
            pvs(icd, pvs);
            return icd;
        } catch (Throwable th) {
            return new com.bytedance.sdk.component.yiw.icD(false, 5001, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public IP vG() {
        return this.pvs;
    }

    public void pvs(String str, boolean z) {
        if (z) {
            pvs("application/json; charset=utf-8", NB(str));
            icD(HttpHeaders.CONTENT_ENCODING, "gzip");
        } else {
            Jd(str);
        }
    }

    private byte[] NB(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e2) {
                com.bytedance.sdk.component.utils.Ju.pvs("PostExecutor", e2.toString());
            }
            try {
                gZIPOutputStream.write(str.getBytes("utf-8"));
                try {
                    gZIPOutputStream.close();
                } catch (IOException e3) {
                    com.bytedance.sdk.component.utils.Ju.pvs("PostExecutor", e3.toString());
                }
                bArr = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                e = e4;
                gZIPOutputStream2 = gZIPOutputStream;
                com.bytedance.sdk.component.utils.Ju.pvs("PostExecutor", e.toString());
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e5) {
                        com.bytedance.sdk.component.utils.Ju.pvs("PostExecutor", e5.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    bArr = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                }
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream2 = gZIPOutputStream;
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e6) {
                        com.bytedance.sdk.component.utils.Ju.pvs("PostExecutor", e6.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        com.bytedance.sdk.component.utils.Ju.pvs("PostExecutor", e7.toString());
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset pvs(Mxy mxy) {
        try {
            return mxy != null ? mxy.pvs(com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs) : com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Mxy pvs(mnm mnmVar) {
        try {
            return mnmVar.NB();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(com.bytedance.sdk.component.yiw.icD icd, bNS bns) {
        if (icd == null || bns == null) {
            return;
        }
        icd.pvs(bns.Mxy());
    }
}
