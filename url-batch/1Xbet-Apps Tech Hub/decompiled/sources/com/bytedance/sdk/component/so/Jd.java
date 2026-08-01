package com.bytedance.sdk.component.so;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.Ju;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PoolTaskStatistics.java */
/* loaded from: classes.dex */
public class Jd {
    private static AtomicInteger vG = new AtomicInteger(0);
    public static final String[] pvs = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};
    public static final String[] icD = {"tt_pangle", "bd_tracker"};
    private static int Jd = 0;
    private static int NB = 0;

    public static void pvs() {
        try {
            icD();
        } catch (Throwable unused) {
        }
    }

    private static void icD() {
        int i;
        String str;
        vG Mxy = sUS.Mxy();
        if (Mxy == null) {
            return;
        }
        int i2 = 1;
        int addAndGet = vG.addAndGet(1);
        if (sUS.vG < 0 || addAndGet % sUS.vG != 0 || Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        HashMap hashMap = new HashMap();
        if (allStackTraces == null) {
            return;
        }
        boolean pvs2 = Ju.pvs();
        int size = allStackTraces.size();
        if (size > NB) {
            NB = size;
        }
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next = it.next();
            i4 += i2;
            Thread key = next.getKey();
            StackTraceElement[] value = next.getValue();
            StringBuilder sb = new StringBuilder("\n");
            if (pvs2) {
                sb.append("Thread Name is : " + key.getName());
                sb.append("\n");
            }
            int length = value.length;
            String str2 = null;
            int i5 = 0;
            while (i5 < length) {
                String stackTraceElement = value[i5].toString();
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                if (pvs2) {
                    sb.append(stackTraceElement + "\n");
                }
                if (TextUtils.isEmpty(str2)) {
                    if (pvs(stackTraceElement, pvs)) {
                        str = stackTraceElement;
                    } else {
                        str = stackTraceElement;
                        if (!pvs(key.getName(), icD)) {
                        }
                    }
                    i3++;
                    str2 = str;
                }
                i5++;
                it = it2;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
            if (pvs2) {
                if (TextUtils.isEmpty(str2)) {
                    i = 1;
                } else {
                    String str3 = str2 + "&" + key.getName();
                    pvs pvsVar = (pvs) hashMap.get(str3);
                    if (pvsVar != null) {
                        i = 1;
                        pvsVar.pvs(pvsVar.pvs() + 1);
                    } else {
                        i = 1;
                        pvsVar = new pvs(str3, 1, sb.toString(), key.getName());
                    }
                    hashMap.put(str3, pvsVar);
                }
                if (!TextUtils.isEmpty(sb.toString())) {
                    Log.e("PoolTaskStatistics", "Thread index = " + i4 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    Log.w("PoolTaskStatistics", sb.toString());
                }
            } else {
                i = 1;
            }
            i2 = i;
            it = it3;
        }
        if (i3 > Jd) {
            Jd = i3;
        }
        if (pvs2) {
            Log.e("PoolTaskStatistics", "SDK current threads=" + i3 + ", SDK Max threads=" + Jd + ", Application threads = " + size + ", Application max threads = " + NB);
            Iterator it4 = hashMap.entrySet().iterator();
            while (it4.hasNext()) {
                Log.i("PoolTaskStatistics", ((pvs) ((Map.Entry) it4.next()).getValue()).toString());
            }
        }
        Mxy.pvs(new com.bytedance.sdk.component.so.icD.pvs(i3, Jd, size, NB));
    }

    private static boolean pvs(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* compiled from: PoolTaskStatistics.java */
    public static class pvs {
        public String Jd;
        public String icD;
        public int pvs;
        public String vG;

        public pvs(String str, int i, String str2, String str3) {
            this.vG = str;
            this.pvs = i;
            this.Jd = str2;
            this.icD = str3;
        }

        public void pvs(int i) {
            this.pvs = i;
        }

        public int pvs() {
            return this.pvs;
        }

        public String toString() {
            return "ThreadModel{times=" + this.pvs + ", name='" + this.icD + "', lastStackStack='" + this.vG + "'}";
        }
    }
}
