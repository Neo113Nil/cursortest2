package com.bytedance.sdk.component.yiw.icD;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.bNS;
import com.bytedance.sdk.component.icD.pvs.mnm;
import com.bytedance.sdk.component.icD.pvs.pvs;
import com.bytedance.sdk.component.icD.pvs.qh;
import com.bytedance.sdk.component.icD.pvs.sUS;
import com.bytedance.sdk.component.icD.pvs.yiw;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: GetExecutor.java */
/* loaded from: classes.dex */
public class icD extends vG {
    private com.bytedance.sdk.component.icD.pvs.pvs Wyp;
    private Map<String, String> kj;
    private boolean qh;
    public static final com.bytedance.sdk.component.icD.pvs.pvs pvs = new pvs.C0050pvs().pvs().icD();
    public static final com.bytedance.sdk.component.icD.pvs.pvs icD = new pvs.C0050pvs().icD();

    public icD(qh qhVar) {
        super(qhVar);
        this.Wyp = pvs;
        this.qh = false;
        this.kj = new HashMap();
    }

    public void pvs(String str, String str2) {
        if (str == null) {
            return;
        }
        this.kj.put(str, str2);
    }

    public void pvs(boolean z) {
        this.qh = z;
    }

    public void pvs(final com.bytedance.sdk.component.yiw.pvs.pvs pvsVar) {
        try {
            Ju.pvs pvsVar2 = new Ju.pvs();
            if (this.qh) {
                pvsVar2.icD(this.so);
            } else {
                yiw.pvs pvsVar3 = new yiw.pvs();
                Uri parse = Uri.parse(this.so);
                pvsVar3.pvs(parse.getScheme());
                pvsVar3.icD(parse.getHost());
                String encodedPath = parse.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    pvsVar3.vG(encodedPath);
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.kj.put(str, parse.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.kj.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String encode = URLEncoder.encode(key, Key.STRING_CHARSET_NAME);
                        if (value == null) {
                            value = "";
                        }
                        pvsVar3.pvs(encode, URLEncoder.encode(value, Key.STRING_CHARSET_NAME));
                    }
                }
                pvsVar2.pvs(pvsVar3.icD());
            }
            pvs(pvsVar2);
            pvsVar2.pvs(this.Wyp);
            pvsVar2.pvs((Object) icD());
            if (!TextUtils.isEmpty(this.NB)) {
                pvsVar2.pvs(this.NB);
            }
            if (this.sUS > 0) {
                pvsVar2.pvs(this.sUS);
            }
            this.vG.pvs(pvsVar2.pvs().icD()).pvs(new com.bytedance.sdk.component.icD.pvs.vG() { // from class: com.bytedance.sdk.component.yiw.icD.icD.1
                @Override // com.bytedance.sdk.component.icD.pvs.vG
                public void pvs(com.bytedance.sdk.component.icD.pvs.icD icd, IOException iOException) {
                    com.bytedance.sdk.component.yiw.pvs.pvs pvsVar4 = pvsVar;
                    if (pvsVar4 != null) {
                        pvsVar4.pvs(icD.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.icD.pvs.vG
                public void pvs(com.bytedance.sdk.component.icD.pvs.icD icd, bNS bns) throws IOException {
                    if (pvsVar != null) {
                        HashMap hashMap = new HashMap();
                        if (bns != null) {
                            sUS yiw = bns.yiw();
                            if (yiw != null) {
                                for (int i = 0; i < yiw.pvs(); i++) {
                                    hashMap.put(yiw.pvs(i), yiw.icD(i));
                                }
                            }
                            mnm sUS = bns.sUS();
                            pvsVar.pvs(icD.this, new com.bytedance.sdk.component.yiw.icD(bns.Jd(), bns.vG(), bns.NB(), hashMap, sUS == null ? "" : sUS.icD(), bns.icD(), bns.pvs()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            if (pvsVar != null) {
                pvsVar.pvs(this, new IOException(th.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.yiw.icD pvs() {
        try {
            Ju.pvs pvsVar = new Ju.pvs();
            String str = "";
            if (this.qh) {
                pvsVar.icD(this.so);
            } else {
                yiw.pvs pvsVar2 = new yiw.pvs();
                Uri parse = Uri.parse(this.so);
                pvsVar2.pvs(parse.getScheme());
                pvsVar2.icD(parse.getHost());
                String encodedPath = parse.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    pvsVar2.vG(encodedPath);
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str2 : queryParameterNames) {
                        this.kj.put(str2, parse.getQueryParameter(str2));
                    }
                }
                for (Map.Entry<String, String> entry : this.kj.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String encode = URLEncoder.encode(key, Key.STRING_CHARSET_NAME);
                        if (value == null) {
                            value = "";
                        }
                        pvsVar2.pvs(encode, URLEncoder.encode(value, Key.STRING_CHARSET_NAME));
                    }
                }
                pvsVar.pvs(pvsVar2.icD());
            }
            pvs(pvsVar);
            pvsVar.pvs(this.Wyp);
            pvsVar.pvs((Object) icD());
            bNS pvs2 = this.vG.pvs(pvsVar.pvs().icD()).pvs();
            if (pvs2 == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            sUS yiw = pvs2.yiw();
            if (yiw != null) {
                for (int i = 0; i < yiw.pvs(); i++) {
                    hashMap.put(yiw.pvs(i), yiw.icD(i));
                }
            }
            mnm sUS = pvs2.sUS();
            if (sUS != null) {
                str = sUS.icD();
            }
            return new com.bytedance.sdk.component.yiw.icD(pvs2.Jd(), pvs2.vG(), pvs2.NB(), hashMap, str, pvs2.icD(), pvs2.pvs());
        } catch (Throwable unused) {
            return null;
        }
    }
}
