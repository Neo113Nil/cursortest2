package com.bykv.vk.openvk.component.video.pvs.icD;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import com.bykv.vk.openvk.component.video.pvs.icD.Mxy;
import com.bykv.vk.openvk.component.video.pvs.icD.kj;
import com.bykv.vk.openvk.component.video.pvs.icD.so;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.List;

/* compiled from: DownloadTask.java */
/* loaded from: classes.dex */
class icD extends com.bykv.vk.openvk.component.video.pvs.icD.pvs {
    final Object IP;
    final Object Ju;
    private final int bNS;
    private volatile com.bykv.vk.openvk.component.video.pvs.icD.vG.icD cR;
    private final InterfaceC0020icD mnm;
    private volatile so.pvs vA;

    /* compiled from: DownloadTask.java */
    /* renamed from: com.bykv.vk.openvk.component.video.pvs.icD.icD$icD, reason: collision with other inner class name */
    public interface InterfaceC0020icD {
        void pvs(icD icd);
    }

    icD(pvs pvsVar) {
        super(pvsVar.Jd, pvsVar.NB);
        this.bNS = pvsVar.yiw;
        this.mnm = pvsVar.Mxy;
        this.Ju = this;
        this.yiw = pvsVar.pvs;
        this.so = pvsVar.icD;
        this.sUS = pvsVar.sUS;
        this.Wyp = pvsVar.vG;
        this.Mxy = pvsVar.so;
        this.IP = pvsVar.Wyp;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.pvs.pvs(this.so);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Wyp();
        } catch (Throwable unused) {
        }
        this.Jd.set(SystemClock.elapsedRealtime() - elapsedRealtime);
        this.pvs.icD(this.so);
        InterfaceC0020icD interfaceC0020icD = this.mnm;
        if (interfaceC0020icD != null) {
            interfaceC0020icD.pvs(this);
        }
    }

    so.pvs so() {
        return this.vA;
    }

    com.bykv.vk.openvk.component.video.pvs.icD.vG.icD Mxy() {
        return this.cR;
    }

    private boolean Wyp() throws com.bykv.vk.openvk.component.video.pvs.icD.vG.pvs {
        while (this.Wyp.pvs()) {
            NB();
            kj.pvs icD = this.Wyp.icD();
            try {
                pvs(icD);
                return true;
            } catch (so.pvs e) {
                this.vA = e;
                Boolean.valueOf(yiw());
                String str = this.yiw;
                return false;
            } catch (com.bykv.vk.openvk.component.video.pvs.icD.vG.icD e2) {
                this.cR = e2;
                return false;
            } catch (com.bykv.vk.openvk.component.video.pvs.icD.vG.vG unused) {
                icD.pvs();
                Boolean.valueOf(yiw());
                String str2 = this.yiw;
            } catch (IOException e3) {
                if (e3 instanceof SocketTimeoutException) {
                    icD.icD();
                }
                if (!icD()) {
                    Boolean.valueOf(yiw());
                    String str3 = this.yiw;
                }
            } catch (Throwable unused2) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c9, code lost:
    
        vG();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ce, code lost:
    
        if (com.bykv.vk.openvk.component.video.pvs.icD.NB.vG == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d0, code lost:
    
        android.util.Log.i("TAG_PROXY_DownloadTask", "download succeed, no need to cancel call");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d7, code lost:
    
        com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(r6.Jd());
        r4.pvs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pvs(kj.pvs pvsVar) throws IOException, so.pvs, com.bykv.vk.openvk.component.video.pvs.icD.vG.pvs, com.bykv.vk.openvk.component.video.pvs.icD.vG.icD {
        File vG = this.pvs.vG(this.so);
        long length = vG.length();
        int i = this.bNS;
        if (i > 0 && length >= i) {
            if (NB.vG) {
                Log.i("TAG_PROXY_DownloadTask", "no necessary to download for " + this.so + ", cache file size: " + length + ", max: " + this.bNS);
                return;
            }
            return;
        }
        int sUS = sUS();
        com.bykv.vk.openvk.component.video.pvs.icD.icD.pvs pvs2 = this.icD.pvs(this.so, sUS);
        if (pvs2 != null && length >= pvs2.vG) {
            if (NB.vG) {
                Log.i("TAG_PROXY_DownloadTask", "file download complete, key: " + this.so);
                return;
            }
            return;
        }
        NB();
        int i2 = (int) length;
        com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs pvs3 = pvs(pvsVar, i2, this.bNS, ShareTarget.METHOD_GET);
        if (pvs3 == null) {
            return;
        }
        boolean z = true;
        so soVar = null;
        try {
            NB();
            String pvs4 = com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs3, this.Mxy == null && NB.NB, true);
            if (pvs4 != null) {
                throw new com.bykv.vk.openvk.component.video.pvs.icD.vG.vG(pvs4 + ", rawKey: " + this.yiw + ", url: " + pvsVar);
            }
            int pvs5 = com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs3);
            if (pvs2 != null && pvs2.vG != pvs5) {
                if (NB.vG) {
                    Log.e("TAG_PROXY_DownloadTask", "Content-Length not match, old: " + pvs2.vG + ", " + pvs5 + ", key: " + this.so);
                }
                throw new com.bykv.vk.openvk.component.video.pvs.icD.vG.icD("Content-Length not match, old length: " + pvs2.vG + ", new length: " + pvs5 + ", rawKey: " + this.yiw + ", currentUrl: " + pvsVar + ", previousInfo: " + pvs2.NB);
            }
            com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs3, this.icD, this.so, sUS);
            com.bykv.vk.openvk.component.video.pvs.icD.icD.pvs pvs6 = this.icD.pvs(this.so, sUS);
            int i3 = pvs6 == null ? 0 : pvs6.vG;
            InputStream Jd = pvs3.Jd();
            so soVar2 = new so(vG, NB.Jd ? "rwd" : "rw");
            try {
                soVar2.pvs(length);
                if (NB.vG) {
                    Log.i("TAG_PROXY_DownloadTask", "preload start from: ".concat(String.valueOf(length)));
                }
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = Jd.read(bArr);
                    if (read >= 0) {
                        NB();
                        if (read > 0) {
                            soVar2.pvs(bArr, 0, read);
                            i2 += read;
                            if (this.Mxy != null) {
                                synchronized (this.Ju) {
                                    this.Ju.notifyAll();
                                }
                            }
                            this.vG.addAndGet(read);
                            pvs(i3, i2);
                        }
                        int i4 = this.bNS;
                        if (i4 > 0 && i2 >= i4) {
                            if (NB.vG) {
                                Log.w("TAG_PROXY_DownloadTask", "download, more data received, currentCacheFileSize: " + i2 + ", max: " + this.bNS);
                            }
                            com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs3.Jd());
                            soVar2.pvs();
                            pvs();
                            if (NB.vG) {
                                Log.w("TAG_PROXY_DownloadTask", "cancel call");
                                return;
                            }
                            return;
                        }
                        NB();
                    } else {
                        try {
                            break;
                        } catch (Throwable th) {
                            th = th;
                            soVar = soVar2;
                            z = false;
                            com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(pvs3.Jd());
                            if (soVar != null) {
                                soVar.pvs();
                            }
                            if (z) {
                                pvs();
                                if (NB.vG) {
                                    Log.w("TAG_PROXY_DownloadTask", "cancel call");
                                }
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                soVar = soVar2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* compiled from: DownloadTask.java */
    static final class pvs {
        com.bykv.vk.openvk.component.video.pvs.icD.pvs.pvs Jd;
        InterfaceC0020icD Mxy;
        com.bykv.vk.openvk.component.video.pvs.icD.icD.vG NB;
        Object Wyp;
        String icD;
        String pvs;
        List<Mxy.icD> sUS;
        Mxy so;
        kj vG;
        int yiw;

        pvs() {
        }

        pvs pvs(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("rawKey == null");
            }
            this.pvs = str;
            return this;
        }

        pvs icD(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("key == null");
            }
            this.icD = str;
            return this;
        }

        pvs pvs(kj kjVar) {
            if (kjVar == null) {
                throw new IllegalArgumentException("urls is empty");
            }
            this.vG = kjVar;
            return this;
        }

        pvs pvs(com.bykv.vk.openvk.component.video.pvs.icD.pvs.pvs pvsVar) {
            if (pvsVar == null) {
                throw new IllegalArgumentException("cache == null");
            }
            this.Jd = pvsVar;
            return this;
        }

        pvs pvs(com.bykv.vk.openvk.component.video.pvs.icD.icD.vG vGVar) {
            if (vGVar == null) {
                throw new IllegalArgumentException("db == null");
            }
            this.NB = vGVar;
            return this;
        }

        pvs pvs(List<Mxy.icD> list) {
            this.sUS = list;
            return this;
        }

        pvs pvs(int i) {
            this.yiw = i;
            return this;
        }

        pvs pvs(InterfaceC0020icD interfaceC0020icD) {
            this.Mxy = interfaceC0020icD;
            return this;
        }

        pvs pvs(Mxy mxy) {
            this.so = mxy;
            return this;
        }

        pvs pvs(Object obj) {
            this.Wyp = obj;
            return this;
        }

        icD pvs() {
            if (this.Jd == null || this.NB == null || TextUtils.isEmpty(this.pvs) || TextUtils.isEmpty(this.icD) || this.vG == null) {
                throw new IllegalArgumentException();
            }
            return new icD(this);
        }
    }
}
