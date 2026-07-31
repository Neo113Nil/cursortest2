package com.bytedance.sdk.component.nps.fs;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.fs.zmn.bvs;
import com.bytedance.sdk.component.fs.zmn.cn;
import com.bytedance.sdk.component.fs.zmn.hhw;
import com.bytedance.sdk.component.fs.zmn.klz;
import com.bytedance.sdk.component.fs.zmn.mw;
import com.bytedance.sdk.component.fs.zmn.rc;
import com.bytedance.sdk.component.fs.zmn.rt;
import com.ironsource.B5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class fb extends zn {
    mw zmn;

    public fb(rc rcVar) {
        super(rcVar);
        this.zmn = null;
    }

    public void btk(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.zmn = mw.zmn(bvs.zmn("application/json; charset=utf-8"), str);
    }

    public void zmn(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            str = JsonUtils.EMPTY_JSON;
        } else {
            str = jSONObject.toString();
        }
        this.zmn = mw.zmn(bvs.zmn("application/json; charset=utf-8"), str);
    }

    public void zmn(String str, byte[] bArr) {
        this.zmn = mw.zmn(bvs.zmn(str), bArr);
    }

    @Override // com.bytedance.sdk.component.nps.fs.zn
    public void zmn(final com.bytedance.sdk.component.nps.zmn.zmn zmnVar) {
        try {
            klz.zmn zmnVar2 = new klz.zmn();
            if (TextUtils.isEmpty(this.zg)) {
                zmnVar.zmn(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.btk)) {
                zmnVar2.zmn(this.btk);
            }
            int i = this.hhw;
            if (i > 0) {
                zmnVar2.zmn(i);
            }
            zmnVar2.fs(this.zg);
            if (this.zmn == null) {
                if (zmnVar != null) {
                    zmnVar.zmn(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                fs(zmnVar2);
                zmnVar2.zmn((Object) fb());
                zmn(zmnVar2);
                this.zn.zmn(zmnVar2.zmn(this.zmn).fs()).zmn(new com.bytedance.sdk.component.fs.zmn.zn() { // from class: com.bytedance.sdk.component.nps.fs.fb.1
                    @Override // com.bytedance.sdk.component.fs.zmn.zn
                    public void zmn(com.bytedance.sdk.component.fs.zmn.fs fsVar, IOException iOException) {
                        com.bytedance.sdk.component.nps.zmn.zmn zmnVar3 = zmnVar;
                        if (zmnVar3 != null) {
                            zmnVar3.zmn(fb.this, iOException);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
                    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.sdk.component.nps.zmn.zmn] */
                    /* JADX WARN: Type inference failed for: r14v0 */
                    /* JADX WARN: Type inference failed for: r14v1, types: [com.bytedance.sdk.component.nps.fs] */
                    /* JADX WARN: Type inference failed for: r14v10 */
                    /* JADX WARN: Type inference failed for: r14v4 */
                    /* JADX WARN: Type inference failed for: r14v5 */
                    /* JADX WARN: Type inference failed for: r14v6, types: [com.bytedance.sdk.component.nps.fs] */
                    /* JADX WARN: Type inference failed for: r14v7, types: [com.bytedance.sdk.component.nps.fs] */
                    /* JADX WARN: Type inference failed for: r14v8 */
                    /* JADX WARN: Type inference failed for: r14v9 */
                    /* JADX WARN: Type inference failed for: r15v1, types: [com.bytedance.sdk.component.nps.fs] */
                    @Override // com.bytedance.sdk.component.fs.zmn.zn
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void zmn(com.bytedance.sdk.component.fs.zmn.fs fsVar, rt rtVar) throws IOException {
                        ?? r14;
                        ?? r142;
                        com.bytedance.sdk.component.nps.zmn.zmn zmnVar3 = zmnVar;
                        if (zmnVar3 != null) {
                            if (rtVar == null) {
                                zmnVar3.zmn(fb.this, new IOException("No response"));
                                return;
                            }
                            fb.this.zmn(rtVar.bvs());
                            IOException iOException = null;
                            try {
                                HashMap hashMap = new HashMap();
                                hhw nps = rtVar.nps();
                                if (nps != null) {
                                    for (int i2 = 0; i2 < nps.zmn(); i2++) {
                                        String zmn = nps.zmn(i2);
                                        String fs = nps.fs(i2);
                                        hashMap.put(zmn, fs);
                                        if (zmn != null && zmn.equalsIgnoreCase("content-type")) {
                                            hashMap.put("content-type", fs == null ? "" : fs.toLowerCase());
                                        }
                                    }
                                }
                                cn hhw = rtVar.hhw();
                                if (com.bytedance.sdk.component.nps.zn.zmn.zmn(hashMap)) {
                                    byte[] fb = hhw.fb();
                                    r142 = new com.bytedance.sdk.component.nps.fs(rtVar.fb(), rtVar.zn(), rtVar.btk(), hashMap, null, rtVar.fs(), rtVar.zmn());
                                    try {
                                        r142.zmn(fb);
                                        r142 = r142;
                                    } catch (Throwable th) {
                                        th = th;
                                        iOException = r142;
                                        r14 = iOException;
                                        iOException = new IOException(th);
                                        if (r14 != 0) {
                                        }
                                    }
                                } else if (fb.this.iv) {
                                    byte[] fb2 = hhw.fb();
                                    fb fbVar = fb.this;
                                    ?? fsVar2 = new com.bytedance.sdk.component.nps.fs(rtVar.fb(), rtVar.zn(), rtVar.btk(), hashMap, new String(fb2, fbVar.zmn(fbVar.zmn(hhw))), rtVar.fs(), rtVar.zmn());
                                    try {
                                        fsVar2.zmn(fb2);
                                        r142 = fsVar2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        iOException = fsVar2;
                                        r14 = iOException;
                                        iOException = new IOException(th);
                                        if (r14 != 0) {
                                        }
                                    }
                                } else {
                                    if (hhw == null) {
                                        throw new IOException(rtVar.btk());
                                    }
                                    r142 = new com.bytedance.sdk.component.nps.fs(rtVar.fb(), rtVar.zn(), rtVar.btk(), hashMap, hhw.fs(), rtVar.fs(), rtVar.zmn());
                                }
                                fb.this.zmn((com.bytedance.sdk.component.nps.fs) r142, rtVar);
                                r14 = r142;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            if (r14 != 0) {
                                zmnVar.zmn(fb.this, r14);
                                return;
                            }
                            com.bytedance.sdk.component.nps.zmn.zmn zmnVar4 = zmnVar;
                            if (zmnVar4 instanceof com.bytedance.sdk.component.nps.zmn.fs) {
                                com.bytedance.sdk.component.nps.zmn.fs fsVar3 = (com.bytedance.sdk.component.nps.zmn.fs) zmnVar4;
                                fb fbVar2 = fb.this;
                                if (iOException == null) {
                                    iOException = new IOException("Unexpected exception");
                                }
                                fsVar3.zmn(fbVar2, iOException, new com.bytedance.sdk.component.nps.fs(rtVar.fb(), rtVar.zn(), rtVar.btk(), null, null, rtVar.fs(), rtVar.zmn()));
                                return;
                            }
                            fb fbVar3 = fb.this;
                            if (iOException == null) {
                                iOException = new IOException("Unexpected exception");
                            }
                            zmnVar4.zmn(fbVar3, iOException);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            zmnVar.zmn(this, new IOException(th.getMessage()));
        }
    }

    @Override // com.bytedance.sdk.component.nps.fs.zn
    public com.bytedance.sdk.component.nps.fs zmn() {
        com.bytedance.sdk.component.nps.fs fsVar;
        try {
            klz.zmn zmnVar = new klz.zmn();
            if (TextUtils.isEmpty(this.zg)) {
                return new com.bytedance.sdk.component.nps.fs(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            zmnVar.fs(this.zg);
            if (this.zmn == null) {
                return new com.bytedance.sdk.component.nps.fs(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            fs(zmnVar);
            zmnVar.zmn((Object) fb());
            zmn(zmnVar);
            rt fs = this.zn.zmn(zmnVar.zmn(this.zmn).fs()).fs();
            if (fs == null) {
                return null;
            }
            zmn(fs.bvs());
            HashMap hashMap = new HashMap();
            hhw nps = fs.nps();
            if (nps != null) {
                for (int i = 0; i < nps.zmn(); i++) {
                    String zmn = nps.zmn(i);
                    String fs2 = nps.fs(i);
                    hashMap.put(zmn, fs2);
                    if (zmn != null && zmn.equalsIgnoreCase("content-type")) {
                        hashMap.put("content-type", fs2 == null ? "" : fs2.toLowerCase());
                    }
                }
            }
            cn hhw = fs.hhw();
            if (com.bytedance.sdk.component.nps.zn.zmn.zmn(hashMap)) {
                byte[] fb = hhw.fb();
                fsVar = new com.bytedance.sdk.component.nps.fs(fs.fb(), fs.zn(), fs.btk(), hashMap, null, fs.fs(), fs.zmn());
                fsVar.zmn(fb);
            } else if (this.iv) {
                byte[] fb2 = hhw.fb();
                com.bytedance.sdk.component.nps.fs fsVar2 = new com.bytedance.sdk.component.nps.fs(fs.fb(), fs.zn(), fs.btk(), hashMap, new String(fb2, zmn(zmn(hhw))), fs.fs(), fs.zmn());
                fsVar2.zmn(fb2);
                fsVar = fsVar2;
            } else {
                if (hhw == null) {
                    throw new IOException(fs.btk());
                }
                fsVar = new com.bytedance.sdk.component.nps.fs(fs.fb(), fs.zn(), fs.btk(), hashMap, hhw.fs(), fs.fs(), fs.zmn());
            }
            zmn(fsVar, fs);
            return fsVar;
        } catch (Throwable th) {
            return new com.bytedance.sdk.component.nps.fs(false, 5001, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void zmn(String str, boolean z) {
        if (z) {
            zmn("application/json; charset=utf-8", hhw(str));
            fs("Content-Encoding", "gzip");
        } else {
            btk(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (r2 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] hhw(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused2) {
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
        try {
            gZIPOutputStream.write(str.getBytes(B5.O));
            try {
                gZIPOutputStream.close();
            } catch (IOException unused3) {
            }
        } catch (IOException unused4) {
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.close();
                } catch (IOException unused5) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.close();
                } catch (IOException unused6) {
                }
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (IOException unused7) {
                    throw th;
                }
            }
            throw th;
        }
        bArr = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused8) {
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset zmn(bvs bvsVar) {
        try {
            return bvsVar != null ? bvsVar.zmn(com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn) : com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bvs zmn(cn cnVar) {
        try {
            return cnVar.btk();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.component.nps.fs fsVar, rt rtVar) {
        if (fsVar == null || rtVar == null) {
            return;
        }
        fsVar.zmn(rtVar.zg());
    }
}
