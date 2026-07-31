package com.bytedance.sdk.component.nps.fs;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.fs.zmn.cn;
import com.bytedance.sdk.component.fs.zmn.hhw;
import com.bytedance.sdk.component.fs.zmn.klz;
import com.bytedance.sdk.component.fs.zmn.nps;
import com.bytedance.sdk.component.fs.zmn.rc;
import com.bytedance.sdk.component.fs.zmn.rt;
import com.bytedance.sdk.component.fs.zmn.zmn;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class fs extends zn {
    private boolean klz;
    private Map<String, String> mw;
    private com.bytedance.sdk.component.fs.zmn.zmn rc;
    public static final com.bytedance.sdk.component.fs.zmn.zmn zmn = new zmn.C0131zmn().zmn().fs();
    public static final com.bytedance.sdk.component.fs.zmn.zmn fs = new zmn.C0131zmn().fs();

    public fs(rc rcVar) {
        super(rcVar);
        this.rc = zmn;
        this.klz = false;
        this.mw = new HashMap();
    }

    public void zmn(boolean z) {
        this.klz = z;
    }

    @Override // com.bytedance.sdk.component.nps.fs.zn
    public void zmn(final com.bytedance.sdk.component.nps.zmn.zmn zmnVar) {
        try {
            klz.zmn zmnVar2 = new klz.zmn();
            if (this.klz) {
                zmnVar2.fs(this.zg);
            } else {
                nps.zmn zmnVar3 = new nps.zmn();
                Uri parse = Uri.parse(this.zg);
                zmnVar3.zmn(parse.getScheme());
                zmnVar3.fs(parse.getHost());
                String encodedPath = parse.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    zmnVar3.zn(encodedPath);
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.mw.put(str, parse.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.mw.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String encode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        zmnVar3.zmn(encode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                zmnVar2.zmn(zmnVar3.fs());
            }
            fs(zmnVar2);
            zmn(zmnVar2);
            zmnVar2.zmn(this.rc);
            zmnVar2.zmn((Object) fb());
            if (!TextUtils.isEmpty(this.btk)) {
                zmnVar2.zmn(this.btk);
            }
            int i = this.hhw;
            if (i > 0) {
                zmnVar2.zmn(i);
            }
            this.zn.zmn(zmnVar2.zmn().fs()).zmn(new com.bytedance.sdk.component.fs.zmn.zn() { // from class: com.bytedance.sdk.component.nps.fs.fs.1
                @Override // com.bytedance.sdk.component.fs.zmn.zn
                public void zmn(com.bytedance.sdk.component.fs.zmn.fs fsVar, IOException iOException) {
                    com.bytedance.sdk.component.nps.zmn.zmn zmnVar4 = zmnVar;
                    if (zmnVar4 != null) {
                        zmnVar4.zmn(fs.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.fs.zmn.zn
                public void zmn(com.bytedance.sdk.component.fs.zmn.fs fsVar, rt rtVar) throws IOException {
                    String fs2;
                    if (zmnVar != null) {
                        HashMap hashMap = new HashMap();
                        if (rtVar != null) {
                            fs.this.zmn(rtVar.bvs());
                            hhw nps = rtVar.nps();
                            if (nps != null) {
                                for (int i2 = 0; i2 < nps.zmn(); i2++) {
                                    hashMap.put(nps.zmn(i2), nps.fs(i2));
                                }
                            }
                            cn hhw = rtVar.hhw();
                            if (hhw == null) {
                                fs2 = "";
                            } else {
                                fs2 = hhw.fs();
                            }
                            zmnVar.zmn(fs.this, new com.bytedance.sdk.component.nps.fs(rtVar.fb(), rtVar.zn(), rtVar.btk(), hashMap, fs2, rtVar.fs(), rtVar.zmn()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            if (zmnVar != null) {
                zmnVar.zmn(this, new IOException(th.getMessage()));
            }
        }
    }

    @Override // com.bytedance.sdk.component.nps.fs.zn
    public com.bytedance.sdk.component.nps.fs zmn() {
        try {
            klz.zmn zmnVar = new klz.zmn();
            if (this.klz) {
                zmnVar.fs(this.zg);
            } else {
                nps.zmn zmnVar2 = new nps.zmn();
                Uri parse = Uri.parse(this.zg);
                zmnVar2.zmn(parse.getScheme());
                zmnVar2.fs(parse.getHost());
                String encodedPath = parse.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    zmnVar2.zn(encodedPath);
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.mw.put(str, parse.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.mw.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String encode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        zmnVar2.zmn(encode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                zmnVar.zmn(zmnVar2.fs());
            }
            fs(zmnVar);
            zmn(zmnVar);
            zmnVar.zmn(this.rc);
            zmnVar.zmn((Object) fb());
            rt fs2 = this.zn.zmn(zmnVar.zmn().fs()).fs();
            if (fs2 == null) {
                return null;
            }
            zmn(fs2.bvs());
            HashMap hashMap = new HashMap();
            hhw nps = fs2.nps();
            if (nps != null) {
                for (int i = 0; i < nps.zmn(); i++) {
                    hashMap.put(nps.zmn(i), nps.fs(i));
                }
            }
            cn hhw = fs2.hhw();
            return new com.bytedance.sdk.component.nps.fs(fs2.fb(), fs2.zn(), fs2.btk(), hashMap, hhw != null ? hhw.fs() : "", fs2.fs(), fs2.zmn());
        } catch (Throwable unused) {
            return null;
        }
    }
}
