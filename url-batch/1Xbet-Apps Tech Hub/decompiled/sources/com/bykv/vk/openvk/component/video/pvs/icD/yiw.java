package com.bykv.vk.openvk.component.video.pvs.icD;

import android.os.SystemClock;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import com.bykv.vk.openvk.component.video.pvs.icD.Mxy;
import com.bykv.vk.openvk.component.video.pvs.icD.icD;
import com.bykv.vk.openvk.component.video.pvs.icD.kj;
import com.bykv.vk.openvk.component.video.pvs.icD.so;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* compiled from: ProxyTask.java */
/* loaded from: classes.dex */
class yiw extends com.bykv.vk.openvk.component.video.pvs.icD.pvs {
    private final vG IP;
    private final Socket Ju;
    private final Jd bNS;
    private volatile com.bykv.vk.openvk.component.video.pvs.icD.icD mnm;
    private volatile boolean vA;

    /* compiled from: ProxyTask.java */
    public interface vG {
        void icD(yiw yiwVar);

        void pvs(yiw yiwVar);
    }

    yiw(pvs pvsVar) {
        super(pvsVar.pvs, pvsVar.icD);
        this.vA = true;
        this.Ju = pvsVar.vG;
        this.IP = pvsVar.Jd;
        this.bNS = Jd.vG();
    }

    private icD so() {
        try {
            this.Mxy = Mxy.pvs(this.Ju.getInputStream());
            OutputStream outputStream = this.Ju.getOutputStream();
            com.bykv.vk.openvk.component.video.pvs.icD.pvs.pvs pvsVar = this.Mxy.vG.pvs == 1 ? NB.pvs : NB.icD;
            if (pvsVar == null) {
                if (NB.vG) {
                    Log.e("TAG_PROXY_ProxyTask", "cache is null");
                }
                return null;
            }
            this.pvs = pvsVar;
            this.yiw = this.Mxy.vG.icD;
            this.so = this.Mxy.vG.vG;
            this.Wyp = new kj(this.Mxy.vG.yiw);
            this.sUS = this.Mxy.icD;
            if (NB.vG) {
                Log.i("TAG_PROXY_ProxyTask", "request from MediaPlayer:    " + this.Mxy.toString());
            }
            return new icD(outputStream, this.Mxy.vG.Jd);
        } catch (Mxy.Jd e) {
            com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(this.Ju);
            if (NB.vG) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e));
            }
            if (this.pvs != null) {
                Boolean.valueOf(yiw());
            }
            String str = this.yiw;
            return null;
        } catch (IOException e2) {
            com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(this.Ju);
            if (NB.vG) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e2));
            }
            if (this.pvs != null) {
                Boolean.valueOf(yiw());
            }
            String str2 = this.yiw;
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bykv.vk.openvk.component.video.pvs.icD.icD.pvs pvs2;
        icD so = so();
        if (so == null) {
            return;
        }
        vG vGVar = this.IP;
        if (vGVar != null) {
            vGVar.pvs(this);
        }
        this.pvs.pvs(this.so);
        if (NB.so != 0 && ((pvs2 = this.icD.pvs(this.so, this.Mxy.vG.pvs)) == null || this.pvs.vG(this.so).length() < pvs2.vG)) {
            this.bNS.pvs(yiw(), this.so);
        }
        try {
            pvs(so);
        } catch (com.bykv.vk.openvk.component.video.pvs.icD.vG.pvs e) {
            if (NB.vG) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e));
            }
        } catch (Throwable th) {
            if (NB.vG) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(th));
            }
        }
        this.pvs.icD(this.so);
        this.bNS.pvs(yiw(), null);
        pvs();
        com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(this.Ju);
        vG vGVar2 = this.IP;
        if (vGVar2 != null) {
            vGVar2.icD(this);
        }
    }

    private boolean pvs(icD icd) throws com.bykv.vk.openvk.component.video.pvs.icD.vG.pvs {
        while (this.Wyp.pvs()) {
            NB();
            kj.pvs icD2 = this.Wyp.icD();
            try {
                pvs(icd, icD2);
                return true;
            } catch (so.pvs e) {
                if (NB.vG) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e));
                }
                this.vA = false;
                Boolean.valueOf(yiw());
                String str = this.yiw;
            } catch (com.bykv.vk.openvk.component.video.pvs.icD.vG.Jd e2) {
                if (NB.vG) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e2));
                }
                return true;
            } catch (com.bykv.vk.openvk.component.video.pvs.icD.vG.icD e3) {
                if (NB.vG) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e3));
                }
                return false;
            } catch (com.bykv.vk.openvk.component.video.pvs.icD.vG.vG unused) {
                icD2.pvs();
                Boolean.valueOf(yiw());
                String str2 = this.yiw;
            } catch (IOException e4) {
                if (e4 instanceof SocketTimeoutException) {
                    icD2.icD();
                }
                if (icD()) {
                    if (NB.vG) {
                        if ("Canceled".equalsIgnoreCase(e4.getMessage())) {
                            Log.w("TAG_PROXY_ProxyTask", "okhttp call canceled");
                        } else {
                            Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e4));
                        }
                    }
                } else {
                    Boolean.valueOf(yiw());
                    String str3 = this.yiw;
                }
            } catch (Exception e5) {
                if (NB.vG) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e5));
                }
            }
        }
        return false;
    }

    private void pvs(icD icd, kj.pvs pvsVar) throws com.bykv.vk.openvk.component.video.pvs.icD.vG.Jd, IOException, so.pvs, com.bykv.vk.openvk.component.video.pvs.icD.vG.pvs, com.bykv.vk.openvk.component.video.pvs.icD.vG.icD {
        if ("HEAD".equalsIgnoreCase(this.Mxy.pvs.pvs)) {
            icD(icd, pvsVar);
        } else {
            vG(icd, pvsVar);
        }
    }

    private void icD(icD icd, kj.pvs pvsVar) throws IOException, com.bykv.vk.openvk.component.video.pvs.icD.vG.Jd {
        byte[] pvs2 = pvs(this.icD.pvs(this.so, this.Mxy.vG.pvs), icd, pvsVar);
        if (pvs2 == null) {
            return;
        }
        icd.pvs(pvs2, 0, pvs2.length);
    }

    private void vG(icD icd, kj.pvs pvsVar) throws so.pvs, com.bykv.vk.openvk.component.video.pvs.icD.vG.Jd, IOException, com.bykv.vk.openvk.component.video.pvs.icD.vG.pvs, com.bykv.vk.openvk.component.video.pvs.icD.vG.icD {
        if (this.vA) {
            File vG2 = this.pvs.vG(this.so);
            long length = vG2.length();
            com.bykv.vk.openvk.component.video.pvs.icD.icD.pvs pvs2 = this.icD.pvs(this.so, this.Mxy.vG.pvs);
            int icD2 = icd.icD();
            if (length > icd.icD()) {
                if (NB.vG) {
                    Log.i("TAG_PROXY_ProxyTask", "cache hit, remainSize: " + (length - icD2));
                }
                pvs(pvs2, vG2, icd, pvsVar);
                return;
            }
        } else {
            icd.icD();
        }
        Jd(icd, pvsVar);
    }

    private byte[] pvs(com.bykv.vk.openvk.component.video.pvs.icD.icD.pvs pvsVar, icD icd, kj.pvs pvsVar2) throws IOException {
        if (pvsVar != null) {
            if (NB.vG) {
                Log.i("TAG_PROXY_ProxyTask", "get header from db");
            }
            return com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvsVar, icd.icD()).getBytes(com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs);
        }
        com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs pvs2 = pvs(pvsVar2, 0, -1, "HEAD");
        if (pvs2 == null) {
            return null;
        }
        try {
            String pvs3 = com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs2, false, false);
            if (pvs3 != null) {
                throw new com.bykv.vk.openvk.component.video.pvs.icD.vG.vG(pvs3 + ", rawKey: " + this.yiw + ", url: " + pvsVar2);
            }
            com.bykv.vk.openvk.component.video.pvs.icD.icD.pvs pvs4 = com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs2, this.icD, this.so, this.Mxy.vG.pvs);
            if (NB.vG) {
                Log.w("TAG_PROXY_ProxyTask", "get header from network");
            }
            return com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs4, icd.icD()).getBytes(com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs);
        } finally {
            com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs2.Jd());
        }
    }

    private void pvs(com.bykv.vk.openvk.component.video.pvs.icD.icD.pvs pvsVar, File file, icD icd, kj.pvs pvsVar2) throws IOException, com.bykv.vk.openvk.component.video.pvs.icD.vG.Jd, so.pvs, com.bykv.vk.openvk.component.video.pvs.icD.vG.pvs, com.bykv.vk.openvk.component.video.pvs.icD.vG.icD {
        final com.bytedance.sdk.component.so.yiw yiwVar;
        com.bykv.vk.openvk.component.video.pvs.icD.icD icd2;
        if (!icd.pvs()) {
            byte[] pvs2 = pvs(pvsVar, icd, pvsVar2);
            NB();
            if (pvs2 == null) {
                return;
            } else {
                icd.pvs(pvs2, 0, pvs2.length);
            }
        }
        so soVar = null;
        if (pvsVar == null && (pvsVar = this.icD.pvs(this.so, this.Mxy.vG.pvs)) == null) {
            if (NB.vG) {
                Log.e("TAG_PROXY_ProxyTask", "failed to get video header info from db");
            }
            pvs(null, icd, pvsVar2);
            pvsVar = this.icD.pvs(this.so, this.Mxy.vG.pvs);
            if (pvsVar == null) {
                throw new com.bykv.vk.openvk.component.video.pvs.icD.vG.vG("failed to get header, rawKey: " + this.yiw + ", url: " + pvsVar2);
            }
        }
        if (file.length() >= pvsVar.vG || !((icd2 = this.mnm) == null || icd2.icD() || icd2.Jd())) {
            yiwVar = null;
        } else {
            com.bykv.vk.openvk.component.video.pvs.icD.icD pvs3 = new icD.pvs().pvs(this.pvs).pvs(this.icD).pvs(this.yiw).icD(this.so).pvs(new kj(pvsVar2.pvs)).pvs(this.sUS).pvs(this.Mxy).pvs(new icD.InterfaceC0020icD() { // from class: com.bykv.vk.openvk.component.video.pvs.icD.yiw.1
                @Override // com.bykv.vk.openvk.component.video.pvs.icD.icD.InterfaceC0020icD
                public void pvs(com.bykv.vk.openvk.component.video.pvs.icD.icD icd3) {
                    yiw.this.vG.addAndGet(icd3.vG.get());
                    yiw.this.Jd.addAndGet(icd3.Jd.get());
                    synchronized (icd3.Ju) {
                        icd3.Ju.notifyAll();
                    }
                    if (icd3.Jd()) {
                        yiw.this.bNS.pvs(yiw.this.yiw(), null);
                    }
                }
            }).pvs();
            this.mnm = pvs3;
            yiwVar = new com.bytedance.sdk.component.so.yiw(pvs3, null, 10, 1);
            com.bytedance.sdk.component.so.sUS.icD(new com.bytedance.sdk.component.so.so("processCacheNetWorkConcurrent") { // from class: com.bykv.vk.openvk.component.video.pvs.icD.yiw.2
                @Override // java.lang.Runnable
                public void run() {
                    yiwVar.run();
                }
            });
            if (NB.vG) {
                Log.e("TAG_PROXY_ProxyTask", "fire download in process cache task");
            }
        }
        byte[] bArr = new byte[8192];
        try {
            so soVar2 = new so(file, "r");
            try {
                soVar2.pvs(icd.icD());
                int min = this.Mxy.vG.NB > 0 ? Math.min(pvsVar.vG, this.Mxy.vG.NB) : pvsVar.vG;
                while (icd.icD() < min) {
                    NB();
                    int pvs4 = soVar2.pvs(bArr);
                    if (pvs4 <= 0) {
                        com.bykv.vk.openvk.component.video.pvs.icD.icD icd3 = this.mnm;
                        if (icd3 != null) {
                            com.bykv.vk.openvk.component.video.pvs.icD.vG.icD Mxy = icd3.Mxy();
                            if (Mxy != null) {
                                throw Mxy;
                            }
                            so.pvs so = icd3.so();
                            if (so != null) {
                                throw so;
                            }
                        }
                        if (icd3 != null && !icd3.icD() && !icd3.Jd()) {
                            NB();
                            synchronized (icd3.Ju) {
                                try {
                                    icd3.Ju.wait(1000L);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                        if (NB.vG) {
                            Log.e("TAG_PROXY_ProxyTask", "download task has finished!!!");
                        }
                        throw new com.bykv.vk.openvk.component.video.pvs.icD.vG.vG("illegal state download task has finished, rawKey: " + this.yiw + ", url: " + pvsVar2);
                    }
                    icd.icD(bArr, 0, pvs4);
                    NB();
                }
                if (NB.vG) {
                    Log.i("TAG_PROXY_ProxyTask", "read cache file complete: " + icd.icD() + ", " + min);
                }
                vG();
                soVar2.pvs();
                if (yiwVar != null) {
                    try {
                        yiwVar.get();
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                soVar = soVar2;
                if (soVar != null) {
                    soVar.pvs();
                }
                if (yiwVar != null) {
                    try {
                        yiwVar.get();
                    } catch (Throwable unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void Jd(icD icd, kj.pvs pvsVar) throws com.bykv.vk.openvk.component.video.pvs.icD.vG.Jd, IOException, com.bykv.vk.openvk.component.video.pvs.icD.vG.pvs, com.bykv.vk.openvk.component.video.pvs.icD.vG.icD {
        String pvs2;
        so soVar;
        Mxy();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int icD2 = icd.icD();
        com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs pvs3 = pvs(pvsVar, icD2, this.Mxy.vG.NB, ShareTarget.METHOD_GET);
        if (pvs3 == null) {
            return;
        }
        so soVar2 = null;
        int i = 0;
        try {
            pvs2 = com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs3, false, true);
        } catch (Throwable th) {
            th = th;
        }
        if (pvs2 != null) {
            throw new com.bykv.vk.openvk.component.video.pvs.icD.vG.vG(pvs2 + ", rawKey: " + this.yiw + ", url: " + pvsVar);
        }
        com.bykv.vk.openvk.component.video.pvs.icD.icD.pvs pvs4 = this.icD.pvs(this.so, sUS());
        int pvs5 = com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs3);
        if (pvs4 != null && pvs4.vG != pvs5) {
            if (NB.vG) {
                Log.e("TAG_PROXY_ProxyTask", "Content-Length not match, old: " + pvs4.vG + ", " + pvs5 + ", key: " + this.so);
            }
            throw new com.bykv.vk.openvk.component.video.pvs.icD.vG.icD("Content-Length not match, old length: " + pvs4.vG + ", new length: " + pvs5 + ", rawKey: " + this.yiw + ", currentUrl: " + pvsVar + ", previousInfo: " + pvs4.NB);
        }
        if (!icd.pvs()) {
            String pvs6 = com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs3, icD2);
            NB();
            byte[] bytes = pvs6.getBytes(com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs);
            icd.pvs(bytes, 0, bytes.length);
        }
        NB();
        File Jd = this.pvs.Jd(this.so);
        if (this.vA && Jd != null && Jd.length() >= icd.icD()) {
            com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs3, this.icD, this.so, this.Mxy.vG.pvs);
            try {
                soVar = new so(Jd, "rwd");
                try {
                    soVar.pvs(icd.icD());
                } catch (Throwable th2) {
                    th = th2;
                    soVar2 = soVar;
                }
            } catch (so.pvs unused) {
                soVar = null;
            }
            if (NB.vG) {
                Log.i("TAG_PROXY_ProxyTask", "can write to cache file in network task, cache file size: " + Jd.length() + ", from: " + icd.icD());
            }
        } else {
            if (NB.vG) {
                Log.w("TAG_PROXY_ProxyTask", "can't write to cache file in network task, cache file size: " + Jd.length() + ", from: " + icd.icD());
            }
            soVar = null;
        }
        com.bykv.vk.openvk.component.video.pvs.icD.icD.pvs pvs7 = this.icD.pvs(this.so, sUS());
        int i2 = pvs7 == null ? 0 : pvs7.vG;
        byte[] bArr = new byte[8192];
        InputStream Jd2 = pvs3.Jd();
        int i3 = 0;
        while (true) {
            try {
                int read = Jd2.read(bArr);
                if (read < 0) {
                    break;
                }
                NB();
                if (read > 0) {
                    icd.icD(bArr, 0, read);
                    i3 += read;
                    if (soVar != null) {
                        try {
                            soVar.pvs(bArr, 0, read);
                        } catch (Throwable th3) {
                            soVar.pvs();
                            try {
                                if (NB.vG) {
                                    Log.e("TAG_PROXY_ProxyTask", "append to cache file error in network task!!! " + Log.getStackTraceString(th3));
                                }
                                soVar = null;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                    pvs(i2, icd.icD());
                }
                NB();
            } catch (Throwable th5) {
                th = th5;
                soVar2 = soVar;
            }
            th = th5;
            soVar2 = soVar;
            i = i3;
            com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs3.Jd());
            if (soVar2 != null) {
                soVar2.pvs();
            }
            this.vG.addAndGet(i);
            this.Jd.addAndGet(SystemClock.elapsedRealtime() - elapsedRealtime);
            throw th;
        }
        if (NB.vG) {
            Log.i("TAG_PROXY_ProxyTask", "read from net complete!");
        }
        vG();
        com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs3.Jd());
        if (soVar != null) {
            soVar.pvs();
        }
        this.vG.addAndGet(i3);
        this.Jd.addAndGet(SystemClock.elapsedRealtime() - elapsedRealtime);
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.icD.pvs
    public void pvs() {
        super.pvs();
        Mxy();
    }

    private void Mxy() {
        com.bykv.vk.openvk.component.video.pvs.icD.icD icd = this.mnm;
        this.mnm = null;
        if (icd != null) {
            icd.pvs();
        }
    }

    /* compiled from: ProxyTask.java */
    private static class icD {
        private int icD;
        private final OutputStream pvs;
        private boolean vG;

        icD(OutputStream outputStream, int i) {
            this.pvs = outputStream;
            this.icD = i;
        }

        boolean pvs() {
            return this.vG;
        }

        void pvs(byte[] bArr, int i, int i2) throws com.bykv.vk.openvk.component.video.pvs.icD.vG.Jd {
            if (this.vG) {
                return;
            }
            try {
                this.pvs.write(bArr, i, i2);
                this.vG = true;
            } catch (IOException e) {
                throw new com.bykv.vk.openvk.component.video.pvs.icD.vG.Jd(e);
            }
        }

        void icD(byte[] bArr, int i, int i2) throws com.bykv.vk.openvk.component.video.pvs.icD.vG.Jd {
            try {
                this.pvs.write(bArr, i, i2);
                this.icD += i2;
            } catch (IOException e) {
                throw new com.bykv.vk.openvk.component.video.pvs.icD.vG.Jd(e);
            }
        }

        int icD() {
            return this.icD;
        }
    }

    /* compiled from: ProxyTask.java */
    static final class pvs {
        vG Jd;
        com.bykv.vk.openvk.component.video.pvs.icD.icD.vG icD;
        com.bykv.vk.openvk.component.video.pvs.icD.pvs.pvs pvs;
        Socket vG;

        pvs() {
        }

        pvs pvs(com.bykv.vk.openvk.component.video.pvs.icD.icD.vG vGVar) {
            if (vGVar == null) {
                throw new IllegalArgumentException("db == null");
            }
            this.icD = vGVar;
            return this;
        }

        pvs pvs(Socket socket) {
            if (socket == null) {
                throw new IllegalArgumentException("socket == null");
            }
            this.vG = socket;
            return this;
        }

        pvs pvs(vG vGVar) {
            this.Jd = vGVar;
            return this;
        }

        yiw pvs() {
            if (this.icD == null || this.vG == null) {
                throw new IllegalArgumentException();
            }
            return new yiw(this);
        }
    }
}
