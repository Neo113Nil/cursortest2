package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.j;
import com.anythink.expressad.foundation.g.f.l;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f extends j<String> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f19456c = "f";

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f19457d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.foundation.g.f.c.b[] f19458e;

    /* renamed from: f, reason: collision with root package name */
    private String f19459f;

    private f(int i, String str, Map<String, String> map, com.anythink.expressad.foundation.g.f.c.b[] bVarArr, com.anythink.expressad.foundation.g.f.e<String> eVar) {
        super(i, str, eVar);
        this.f19459f = "---------Ij5ei4KM7KM7ae0KM7cH2ae0Ij5Ef1";
        this.f19457d = map;
        this.f19458e = bVarArr;
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final void a(OutputStream outputStream) {
        DataOutputStream dataOutputStream = (DataOutputStream) outputStream;
        try {
            try {
                com.anythink.expressad.foundation.g.f.c.b[] bVarArr = this.f19458e;
                if (bVarArr != null) {
                    for (com.anythink.expressad.foundation.g.f.c.b bVar : bVarArr) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("--");
                        sb.append(this.f19459f);
                        sb.append("\r\n");
                        sb.append("Content-Disposition: form-data;name=\"" + bVar.f() + "\";filename=\"" + bVar.e() + "\"\r\n");
                        StringBuilder sb2 = new StringBuilder("Content-Type: ");
                        sb2.append(bVar.g());
                        sb2.append("\r\n\r\n");
                        sb.append(sb2.toString());
                        dataOutputStream.write(sb.toString().getBytes());
                        if (bVar.c() != null) {
                            byte[] bArr = new byte[1024];
                            int i = 0;
                            while (true) {
                                int read = bVar.c().read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                dataOutputStream.write(bArr, 0, read);
                                i += read;
                                com.anythink.expressad.foundation.g.f.e<T> eVar = this.f19524b;
                                if (eVar != 0) {
                                    eVar.a(bVar.a(), i);
                                }
                            }
                            bVar.c().close();
                        } else {
                            dataOutputStream.write(bVar.d(), 0, bVar.d().length);
                        }
                        dataOutputStream.write("\r\n".getBytes());
                    }
                }
                dataOutputStream.writeBytes("--" + this.f19459f + "--\r\n");
                dataOutputStream.flush();
                try {
                    dataOutputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            } catch (IOException e9) {
                e9.getMessage();
                this.f19524b.a(new com.anythink.expressad.foundation.g.f.a.a(2, null));
                try {
                    dataOutputStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            throw th;
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final byte[] h() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.f19457d.entrySet()) {
            sb.append("--");
            sb.append(this.f19459f);
            sb.append("\r\n");
            sb.append("Content-Disposition: form-data; name=\"" + entry.getKey() + "\"\r\n\r\n");
            sb.append(entry.getValue());
            sb.append("\r\n");
        }
        return sb.toString().getBytes();
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final void i() {
        super.i();
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "multipart/form-data; boundary=" + this.f19459f);
        a((Map<String, String>) hashMap);
    }

    @Override // com.anythink.expressad.foundation.g.f.j
    public final l<String> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        try {
            return l.a(new String(cVar.f19478b, com.anythink.expressad.foundation.g.f.g.d.a(cVar.f19480d)), cVar);
        } catch (UnsupportedEncodingException e6) {
            e6.getMessage();
            return l.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        }
    }
}
