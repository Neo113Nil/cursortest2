package com.bykv.vk.openvk.component.video.pvs.icD.sUS;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.sUS.vG;
import com.bykv.vk.openvk.component.video.pvs.icD.Jd;
import com.bykv.vk.openvk.component.video.pvs.icD.NB;
import com.bykv.vk.openvk.component.video.pvs.icD.sUS;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: VideoCachePreloader.java */
/* loaded from: classes.dex */
public class pvs {
    public static final boolean pvs = vG.vG();
    private HashMap<String, Boolean> icD;
    private C0022pvs vG;

    private pvs() {
        this.icD = new HashMap<>();
        icD();
    }

    public static pvs pvs() {
        return icD.pvs;
    }

    /* compiled from: VideoCachePreloader.java */
    private static class icD {
        private static final pvs pvs = new pvs();
    }

    public boolean icD() {
        if (this.vG != null) {
            return true;
        }
        com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG vG = vG();
        if (vG == null) {
            return false;
        }
        NB.pvs(true);
        NB.icD(true);
        NB.pvs(1);
        sUS.pvs().Jd();
        try {
            C0022pvs c0022pvs = new C0022pvs();
            this.vG = c0022pvs;
            c0022pvs.setName("csj_video_cache_preloader");
            this.vG.start();
            NB.pvs(vG, com.bykv.vk.openvk.component.video.api.vG.pvs());
            Jd.vG();
            Jd.vG().pvs(10485759);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        if (!icD()) {
            return false;
        }
        this.vG.pvs(vGVar);
        return true;
    }

    public String icD(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        if (vGVar == null) {
            return null;
        }
        boolean z = !TextUtils.isEmpty(vGVar.IP());
        return sUS.pvs().pvs(false, z, z ? vGVar.IP() : vGVar.Ju(), vGVar.Ju());
    }

    private static com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG vG() {
        File file = new File(com.bykv.vk.openvk.component.video.api.vG.pvs().getCacheDir(), "proxy_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG vGVar = new com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG(file);
            try {
                vGVar.pvs(104857600L);
                return vGVar;
            } catch (IOException unused) {
                return vGVar;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* compiled from: VideoCachePreloader.java */
    /* renamed from: com.bykv.vk.openvk.component.video.pvs.icD.sUS.pvs$pvs, reason: collision with other inner class name */
    class C0022pvs extends Thread {
        private final Queue<C0023pvs> Jd = new ArrayBlockingQueue(10);
        private Queue<C0023pvs> icD = new LinkedBlockingQueue();
        private boolean vG = true;
        private Queue<C0023pvs> NB = new LinkedBlockingQueue();

        public C0022pvs() {
        }

        private C0023pvs pvs(int i, com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
            this.Jd.size();
            C0023pvs poll = this.Jd.poll();
            if (poll == null) {
                poll = new C0023pvs();
            }
            poll.pvs = i;
            poll.sUS = vGVar;
            return poll;
        }

        private void pvs(C0023pvs c0023pvs) {
            c0023pvs.vG = null;
            c0023pvs.icD = null;
            c0023pvs.pvs = -1;
            c0023pvs.sUS = null;
            this.Jd.offer(c0023pvs);
        }

        private synchronized void icD(C0023pvs c0023pvs) {
            this.NB.add(c0023pvs);
            notify();
        }

        private void vG(C0023pvs c0023pvs) {
            if (c0023pvs == null) {
                return;
            }
            this.icD.offer(c0023pvs);
            notify();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.vG) {
                synchronized (this) {
                    if (!this.NB.isEmpty()) {
                        pvs();
                    }
                    while (!this.icD.isEmpty()) {
                        C0023pvs poll = this.icD.poll();
                        if (poll != null) {
                            int i = poll.pvs;
                            if (i != 0) {
                                if (i == 1) {
                                    Jd.vG().pvs(poll.icD);
                                } else if (i == 2) {
                                    Jd.vG().Jd();
                                } else if (i == 3) {
                                    Jd.vG().Jd();
                                    if (NB.vG() != null) {
                                        NB.vG();
                                        throw null;
                                    }
                                    if (NB.icD() != null) {
                                        NB.icD().pvs();
                                    }
                                } else if (i == 4) {
                                    Jd.vG().Jd();
                                    this.vG = false;
                                }
                            } else if (poll.vG != null && poll.vG.length > 0) {
                                ArrayList arrayList = new ArrayList();
                                for (String str : poll.vG) {
                                    if (com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(str)) {
                                        arrayList.add(str);
                                    }
                                }
                                Jd.vG().pvs(false, !TextUtils.isEmpty(poll.NB), poll.Jd, poll.icD, (String[]) arrayList.toArray(new String[arrayList.size()]));
                            }
                            pvs(poll);
                        }
                    }
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        private void pvs() {
            while (true) {
                C0023pvs poll = this.NB.poll();
                if (poll == null) {
                    return;
                }
                poll.icD = poll.sUS.Ju();
                poll.vG = new String[]{poll.sUS.Ju()};
                int pvs = poll.sUS.pvs();
                if (pvs <= 0) {
                    pvs = poll.sUS.vG();
                }
                poll.Jd = pvs;
                poll.NB = poll.sUS.IP();
                if (!TextUtils.isEmpty(poll.sUS.IP())) {
                    poll.icD = poll.sUS.IP();
                }
                poll.sUS = null;
                vG(poll);
            }
        }

        public void pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
            icD(pvs(0, vGVar));
        }

        /* compiled from: VideoCachePreloader.java */
        /* renamed from: com.bykv.vk.openvk.component.video.pvs.icD.sUS.pvs$pvs$pvs, reason: collision with other inner class name */
        private class C0023pvs {
            public int Jd;
            public String NB;
            public String icD;
            public int pvs;
            public com.bykv.vk.openvk.component.video.api.vG.vG sUS;
            public String[] vG;

            public C0023pvs() {
            }
        }
    }
}
