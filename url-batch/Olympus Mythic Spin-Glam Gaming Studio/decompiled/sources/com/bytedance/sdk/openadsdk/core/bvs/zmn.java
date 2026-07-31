package com.bytedance.sdk.openadsdk.core.bvs;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes13.dex */
public class zmn {
    private static volatile boolean fs;
    private static volatile zmn zmn;
    private static volatile long zn;
    private Handler btk;
    private final Queue<C0152zmn> fb = new LinkedList();
    private final rc hhw = kgc.fb();

    private zmn() {
    }

    public static zmn zmn() {
        if (zmn == null) {
            synchronized (zmn.class) {
                try {
                    if (zmn == null) {
                        zmn = new zmn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    private synchronized boolean fs(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int so = this.hhw.so();
        long yj = this.hhw.yj();
        if (this.fb.size() > 0 && this.fb.size() >= so) {
            long abs = Math.abs(currentTimeMillis - this.fb.peek().zmn);
            if (abs <= yj) {
                fs(yj - abs);
                return true;
            }
            this.fb.poll();
            this.fb.offer(new C0152zmn(currentTimeMillis, str));
        } else {
            this.fb.offer(new C0152zmn(currentTimeMillis, str));
        }
        return false;
    }

    public synchronized boolean zmn(String str) {
        try {
            if (fs(str)) {
                zmn(true);
                zmn(zn);
            } else {
                zmn(false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return fs;
    }

    private synchronized void zmn(long j) {
        try {
            if (this.btk == null) {
                this.btk = new Handler(Looper.getMainLooper());
            }
            this.btk.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bvs.zmn.1
                @Override // java.lang.Runnable
                public void run() {
                    zmn.this.zmn(false);
                }
            }, j);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void zmn(boolean z) {
        fs = z;
    }

    public synchronized boolean fs() {
        return fs;
    }

    private synchronized void fs(long j) {
        zn = j;
    }

    public synchronized String zn() {
        String str;
        try {
            HashMap hashMap = new HashMap();
            for (C0152zmn c0152zmn : this.fb) {
                if (hashMap.containsKey(c0152zmn.fs)) {
                    hashMap.put(c0152zmn.fs, Integer.valueOf(((Integer) hashMap.get(c0152zmn.fs)).intValue() + 1));
                } else {
                    hashMap.put(c0152zmn.fs, 1);
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
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.bvs.zmn$zmn, reason: collision with other inner class name */
    private static class C0152zmn {
        private final String fs;
        private final long zmn;

        private C0152zmn(long j, String str) {
            this.zmn = j;
            this.fs = str;
        }
    }
}
