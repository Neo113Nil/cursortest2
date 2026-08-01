package com.bytedance.sdk.openadsdk.Jd;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.icD.pvs.IP;
import com.bytedance.sdk.component.icD.pvs.Ju;
import com.bytedance.sdk.component.icD.pvs.Mxy;
import com.bytedance.sdk.component.icD.pvs.NB;
import com.bytedance.sdk.component.icD.pvs.bNS;
import com.bytedance.sdk.component.icD.pvs.qh;
import com.bytedance.sdk.component.icD.pvs.sUS;
import com.bytedance.sdk.component.icD.pvs.vG;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultNetWork.java */
/* loaded from: classes2.dex */
public class pvs implements INetWork {
    protected qh pvs = new qh.pvs().pvs(10, TimeUnit.SECONDS).icD(10, TimeUnit.SECONDS).vG(10, TimeUnit.SECONDS).pvs();
    protected qh icD = new qh.pvs().pvs(10, TimeUnit.SECONDS).icD(30, TimeUnit.SECONDS).vG(30, TimeUnit.SECONDS).pvs();

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.pvs.pvs(new Ju.pvs().pvs().icD(str).icD()).pvs(new vG() { // from class: com.bytedance.sdk.openadsdk.Jd.pvs.1
            @Override // com.bytedance.sdk.component.icD.pvs.vG
            public void pvs(com.bytedance.sdk.component.icD.pvs.icD icd, bNS bns) throws IOException {
            }

            @Override // com.bytedance.sdk.component.icD.pvs.vG
            public void pvs(com.bytedance.sdk.component.icD.pvs.icD icd, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        bNS pvs = this.pvs.pvs(new Ju.pvs().pvs().icD(str).icD()).pvs();
        return new Response(pvs(pvs.yiw()), pvs.vG() == 200 ? pvs.sUS().icD() : null, pvs.vG(), pvs.NB());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        NB.pvs pvsVar = new NB.pvs();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                pvsVar.pvs((String) pair.first, (String) pair.second);
            }
        }
        bNS pvs = this.pvs.pvs(new Ju.pvs().icD(str).pvs((IP) pvsVar.pvs()).icD()).pvs();
        return new Response(pvs(pvs.yiw()), pvs.vG() == 200 ? pvs.sUS().icD() : null, pvs.vG(), pvs.NB());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        bNS pvs = this.pvs.pvs(new Ju.pvs().icD(str).pvs(IP.pvs(Mxy.pvs("application/json; charset=utf-8"), str2)).icD()).pvs();
        return new Response(pvs(pvs.yiw()), pvs.vG() == 200 ? pvs.sUS().icD() : null, pvs.vG(), pvs.NB());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x007b: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:32:0x007b */
    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j, BufferOutputStream bufferOutputStream) throws Exception {
        Closeable closeable;
        Exception e;
        int vG;
        BufferedInputStream bufferedInputStream;
        Closeable closeable2 = null;
        int i = 0;
        try {
            try {
                try {
                    bNS pvs = this.icD.pvs(new Ju.pvs().pvs().icD(str).icD()).pvs();
                    vG = pvs.vG();
                    try {
                        bufferedInputStream = new BufferedInputStream(pvs.sUS().vG());
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 2048);
                        if (read != -1) {
                            bufferOutputStream.write(bArr, 0, read);
                        } else {
                            CloseableUtils.close(bufferedInputStream);
                            return;
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    i = vG;
                    throw new RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e.getMessage(), e);
                }
            } catch (Throwable th) {
                th = th;
                CloseableUtils.close(closeable2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
        }
    }

    private Map<String, String> pvs(sUS sus) {
        if (sus == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < sus.pvs(); i++) {
            hashMap.put(sus.pvs(i), sus.icD(i));
        }
        return hashMap;
    }
}
