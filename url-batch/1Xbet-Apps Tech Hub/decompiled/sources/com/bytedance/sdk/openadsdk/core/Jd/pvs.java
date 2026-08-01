package com.bytedance.sdk.openadsdk.core.Jd;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.settings.sUS;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: FrequentCallController.java */
/* loaded from: classes2.dex */
public class pvs {
    private static volatile boolean icD;
    private static volatile pvs pvs;
    private static volatile long vG;
    private Handler NB;
    private final Queue<C0068pvs> Jd = new LinkedList();
    private final sUS sUS = mnm.Jd();

    private pvs() {
    }

    public static pvs pvs() {
        if (pvs == null) {
            synchronized (pvs.class) {
                if (pvs == null) {
                    pvs = new pvs();
                }
            }
        }
        return pvs;
    }

    private synchronized boolean icD(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int dyT = this.sUS.dyT();
        long ZhG = this.sUS.ZhG();
        if (this.Jd.size() > 0 && this.Jd.size() >= dyT) {
            long abs = Math.abs(currentTimeMillis - this.Jd.peek().pvs);
            if (abs <= ZhG) {
                icD(ZhG - abs);
                return true;
            }
            this.Jd.poll();
            this.Jd.offer(new C0068pvs(currentTimeMillis, str));
        } else {
            this.Jd.offer(new C0068pvs(currentTimeMillis, str));
        }
        return false;
    }

    public synchronized boolean pvs(String str) {
        if (icD(str)) {
            pvs(true);
            pvs(vG);
        } else {
            pvs(false);
        }
        return icD;
    }

    private synchronized void pvs(long j) {
        if (this.NB == null) {
            this.NB = new Handler(Looper.getMainLooper());
        }
        this.NB.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Jd.pvs.1
            @Override // java.lang.Runnable
            public void run() {
                pvs.this.pvs(false);
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void pvs(boolean z) {
        icD = z;
    }

    public synchronized boolean icD() {
        return icD;
    }

    private synchronized void icD(long j) {
        vG = j;
    }

    public synchronized String vG() {
        String str;
        HashMap hashMap = new HashMap();
        for (C0068pvs c0068pvs : this.Jd) {
            if (hashMap.containsKey(c0068pvs.icD)) {
                hashMap.put(c0068pvs.icD, Integer.valueOf(((Integer) hashMap.get(c0068pvs.icD)).intValue() + 1));
            } else {
                hashMap.put(c0068pvs.icD, 1);
            }
        }
        str = "";
        int i = Integer.MIN_VALUE;
        for (String str2 : hashMap.keySet()) {
            int intValue = ((Integer) hashMap.get(str2)).intValue();
            if (i < intValue) {
                str = str2;
                i = intValue;
            }
        }
        return str;
    }

    /* compiled from: FrequentCallController.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.Jd.pvs$pvs, reason: collision with other inner class name */
    private static class C0068pvs {
        private final String icD;
        private final long pvs;

        private C0068pvs(long j, String str) {
            this.pvs = j;
            this.icD = str;
        }
    }
}
