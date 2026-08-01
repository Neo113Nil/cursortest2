package com.bykv.vk.openvk.component.video.pvs.icD;

import com.bykv.vk.openvk.component.video.pvs.icD.Mxy;
import com.bykv.vk.openvk.component.video.pvs.icD.kj;
import com.google.common.net.HttpHeaders;
import io.ktor.client.utils.CacheControl;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AbsTask.java */
/* loaded from: classes.dex */
abstract class pvs implements qh {
    private static final AtomicLong Ju = new AtomicLong();
    protected volatile Mxy Mxy;
    protected com.bykv.vk.openvk.component.video.pvs.icD.Jd.pvs NB;
    protected volatile kj Wyp;
    protected final com.bykv.vk.openvk.component.video.pvs.icD.icD.vG icD;
    protected volatile com.bykv.vk.openvk.component.video.pvs.icD.pvs.pvs pvs;
    protected volatile List<Mxy.icD> sUS;
    protected volatile String so;
    protected volatile String yiw;
    protected final AtomicInteger vG = new AtomicInteger();
    protected final AtomicLong Jd = new AtomicLong();
    protected volatile boolean qh = false;
    public final long kj = Ju.incrementAndGet();
    private final AtomicInteger IP = new AtomicInteger(0);
    private int bNS = -1;

    public pvs(com.bykv.vk.openvk.component.video.pvs.icD.pvs.pvs pvsVar, com.bykv.vk.openvk.component.video.pvs.icD.icD.vG vGVar) {
        this.pvs = pvsVar;
        this.icD = vGVar;
    }

    public void pvs() {
        this.IP.compareAndSet(0, 1);
    }

    public boolean icD() {
        return this.IP.get() == 1;
    }

    protected void vG() {
        this.IP.compareAndSet(0, 2);
    }

    public boolean Jd() {
        return this.IP.get() == 2;
    }

    protected void NB() throws com.bykv.vk.openvk.component.video.pvs.icD.vG.pvs {
        if (icD()) {
            throw new com.bykv.vk.openvk.component.video.pvs.icD.vG.pvs();
        }
    }

    protected com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs pvs(kj.pvs pvsVar, int i, int i2, String str) throws IOException {
        com.bykv.vk.openvk.component.video.pvs.icD.NB.icD icD = com.bykv.vk.openvk.component.video.pvs.icD.NB.vG.pvs().icD();
        com.bykv.vk.openvk.component.video.pvs.icD.NB.NB nb = new com.bykv.vk.openvk.component.video.pvs.icD.NB.NB();
        HashMap hashMap = new HashMap();
        nb.icD = pvsVar.pvs;
        nb.pvs = 0;
        if ("HEAD".equalsIgnoreCase(str)) {
            nb.pvs = 4;
        }
        List<Mxy.icD> list = this.sUS;
        if (list != null && !list.isEmpty()) {
            for (Mxy.icD icd : list) {
                if (!HttpHeaders.RANGE.equalsIgnoreCase(icd.pvs) && !HttpHeaders.CONNECTION.equalsIgnoreCase(icd.pvs) && !"Proxy-Connection".equalsIgnoreCase(icd.pvs) && !HttpHeaders.HOST.equalsIgnoreCase(icd.pvs)) {
                    hashMap.put(icd.pvs, icd.icD);
                }
            }
        }
        String pvs = com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(i, i2);
        if (pvs != null) {
            hashMap.put(HttpHeaders.RANGE, pvs);
        }
        if (NB.sUS) {
            hashMap.put(HttpHeaders.CACHE_CONTROL, CacheControl.NO_CACHE);
        }
        Jd vG = Jd.vG();
        sUS pvs2 = sUS.pvs();
        boolean z = this.Mxy == null;
        vG pvs3 = z ? vG.pvs() : pvs2.icD();
        vG icD2 = z ? vG.icD() : pvs2.vG();
        if (pvs3 != null || icD2 != null) {
            if (pvs3 != null) {
                throw null;
            }
            if (icD2 != null) {
                throw null;
            }
        }
        nb.NB = hashMap;
        if (this.qh) {
            this.qh = false;
            return null;
        }
        return icD.pvs(nb);
    }

    protected int sUS() {
        if (this.Mxy != null) {
            return this.Mxy.vG.pvs;
        }
        return this.pvs instanceof com.bykv.vk.openvk.component.video.pvs.icD.pvs.icD ? 1 : 0;
    }

    protected boolean yiw() {
        return sUS() == 1;
    }

    protected void pvs(int i, int i2) {
        if (i <= 0 || i2 < 0) {
            return;
        }
        int i3 = NB.yiw;
        int sUS = sUS();
        if (i3 == 1 || (i3 == 2 && sUS == 1)) {
            int i4 = (int) ((i2 / i) * 100.0f);
            if (i4 > 100) {
                i4 = 100;
            }
            synchronized (this) {
                if (i4 <= this.bNS) {
                    return;
                }
                this.bNS = i4;
                com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.icD.pvs.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (pvs.this.NB != null) {
                            kj kjVar = pvs.this.Wyp;
                            int unused = pvs.this.bNS;
                        }
                    }
                });
            }
        }
    }
}
