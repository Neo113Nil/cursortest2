package com.bytedance.sdk.openadsdk.nps;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.fs.zmn.btk;
import com.bytedance.sdk.component.fs.zmn.bvs;
import com.bytedance.sdk.component.fs.zmn.hhw;
import com.bytedance.sdk.component.fs.zmn.klz;
import com.bytedance.sdk.component.fs.zmn.mw;
import com.bytedance.sdk.component.fs.zmn.rc;
import com.bytedance.sdk.component.fs.zmn.rt;
import com.bytedance.sdk.component.fs.zmn.zn;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public class zmn implements INetWork {
    protected rc fs;
    protected rc zmn;

    public zmn() {
        rc.zmn zmnVar = new rc.zmn();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.zmn = zmnVar.zmn(10L, timeUnit).fs(10L, timeUnit).zn(10L, timeUnit).zmn();
        this.fs = new rc.zmn().zmn(10L, timeUnit).fs(30L, timeUnit).zn(30L, timeUnit).zmn();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.zmn.zmn(new klz.zmn().zmn().fs(str).zmn("gecko").fs()).zmn(new zn() { // from class: com.bytedance.sdk.openadsdk.nps.zmn.1
            @Override // com.bytedance.sdk.component.fs.zmn.zn
            public void zmn(com.bytedance.sdk.component.fs.zmn.fs fsVar, rt rtVar) throws IOException {
            }

            @Override // com.bytedance.sdk.component.fs.zmn.zn
            public void zmn(com.bytedance.sdk.component.fs.zmn.fs fsVar, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        rt fs = this.zmn.zmn(new klz.zmn().zmn().fs(str).zmn("gecko").fs()).fs();
        return new Response(zmn(fs.nps()), fs.zn() == 200 ? fs.hhw().fs() : null, fs.zn(), fs.btk());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        btk.zmn zmnVar = new btk.zmn();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                zmnVar.zmn((String) pair.first, (String) pair.second);
            }
        }
        rt fs = this.zmn.zmn(new klz.zmn().fs(str).zmn((mw) zmnVar.zmn()).zmn("gecko").fs()).fs();
        return new Response(zmn(fs.nps()), fs.zn() == 200 ? fs.hhw().fs() : null, fs.zn(), fs.btk());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        rt fs = this.zmn.zmn(new klz.zmn().fs(str).zmn(mw.zmn(bvs.zmn("application/json; charset=utf-8"), str2)).zmn("gecko").fs()).fs();
        return new Response(zmn(fs.nps()), fs.zn() == 200 ? fs.hhw().fs() : null, fs.zn(), fs.btk());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0044: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:26:0x0044 */
    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j, BufferOutputStream bufferOutputStream) throws Exception {
        Exception e;
        Closeable closeable;
        BufferedInputStream bufferedInputStream;
        Closeable closeable2 = null;
        int i = 0;
        try {
            try {
                try {
                    rt fs = this.fs.zmn(new klz.zmn().zmn().zmn("gecko").fs(str).fs()).fs();
                    int zn = fs.zn();
                    try {
                        bufferedInputStream = new BufferedInputStream(fs.hhw().zn());
                    } catch (Exception e2) {
                        e = e2;
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
                    } catch (Exception e3) {
                        e = e3;
                        i = zn;
                        throw new RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e.getMessage(), e);
                    }
                } catch (Throwable th) {
                    th = th;
                    closeable2 = closeable;
                    CloseableUtils.close(closeable2);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
            CloseableUtils.close(closeable2);
            throw th;
        }
    }

    private Map<String, String> zmn(hhw hhwVar) {
        if (hhwVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < hhwVar.zmn(); i++) {
            hashMap.put(hhwVar.zmn(i), hhwVar.fs(i));
        }
        return hashMap;
    }
}
