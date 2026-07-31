package com.bytedance.sdk.openadsdk.core;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes13.dex */
public class am {
    private static am zmn;
    private com.bytedance.sdk.openadsdk.zmn.btk.zmn btk;
    private com.bytedance.sdk.openadsdk.zmn.zn.fs hhw;
    private com.bytedance.sdk.openadsdk.zmn.fb.fs nps;
    private final AtomicInteger fs = new AtomicInteger(0);
    private Map<Integer, com.bytedance.sdk.openadsdk.core.model.zmn> zn = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, zmn<?>> fb = new ConcurrentHashMap<>();
    private final Map<String, fs> zg = new HashMap();

    public interface fs {
        void zmn();
    }

    public static class zmn<T> {
        public final String fs;
        public final T zmn;
        public final long zn = System.currentTimeMillis();

        public zmn(T t, String str) {
            this.zmn = t;
            this.fs = str;
        }
    }

    public <T> void zmn(String str, T t) {
        if (TextUtils.isEmpty(str) || t == null) {
            return;
        }
        this.fb.put(str, new zmn<>(t, str));
    }

    public <T> T zmn(String str, Class<T> cls) {
        zmn<?> zmnVar;
        if (TextUtils.isEmpty(str) || cls == null || (zmnVar = this.fb.get(str)) == null || !cls.isInstance(zmnVar.zmn)) {
            return null;
        }
        return cls.cast(zmnVar.zmn);
    }

    public zmn<?> zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.fb.remove(str);
    }

    private am() {
    }

    @MainThread
    public static am zmn() {
        if (zmn == null) {
            zmn = new am();
        }
        return zmn;
    }

    public com.bytedance.sdk.openadsdk.core.model.nqi zmn(int i) {
        com.bytedance.sdk.openadsdk.core.model.zmn remove = this.zn.remove(Integer.valueOf(i));
        if (remove != null) {
            return remove.mw();
        }
        return null;
    }

    public int zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        com.bytedance.sdk.openadsdk.core.model.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.model.zmn();
        zmnVar.fs(nqiVar);
        return zmn(zmnVar);
    }

    public com.bytedance.sdk.openadsdk.zmn.btk.zmn fs() {
        return this.btk;
    }

    public com.bytedance.sdk.openadsdk.zmn.zn.fs zn() {
        return this.hhw;
    }

    public com.bytedance.sdk.openadsdk.zmn.fb.fs fb() {
        return this.nps;
    }

    public void zmn(com.bytedance.sdk.openadsdk.zmn.zn.fs fsVar) {
        this.hhw = fsVar;
    }

    public void zmn(com.bytedance.sdk.openadsdk.zmn.btk.zmn zmnVar) {
        this.btk = zmnVar;
    }

    public void zmn(com.bytedance.sdk.openadsdk.zmn.fb.fs fsVar) {
        this.nps = fsVar;
    }

    public void btk() {
        this.btk = null;
        this.hhw = null;
        this.nps = null;
    }

    public int zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        int incrementAndGet = this.fs.incrementAndGet();
        this.zn.put(Integer.valueOf(incrementAndGet), zmnVar);
        return incrementAndGet;
    }

    public com.bytedance.sdk.openadsdk.core.model.zmn fs(int i) {
        return this.zn.remove(Integer.valueOf(i));
    }

    public void zn(int i) {
        this.zn.remove(Integer.valueOf(i));
    }

    public static int zmn(Intent intent) {
        if (intent != null) {
            return intent.getIntExtra("meta_index", -1);
        }
        return -1;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, fs fsVar) {
        if (nqiVar == null || fsVar == null) {
            return;
        }
        String fb = fb(nqiVar);
        if (TextUtils.isEmpty(fb)) {
            return;
        }
        this.zg.put(fb, fsVar);
    }

    private static String fb(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (nqiVar == null) {
            return null;
        }
        String wbj = nqiVar.wbj();
        return TextUtils.isEmpty(wbj) ? String.valueOf(nqiVar.hashCode()) : wbj;
    }

    public void fs(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        fs fsVar;
        if (nqiVar == null) {
            return;
        }
        String fb = fb(nqiVar);
        if (TextUtils.isEmpty(fb) || (fsVar = this.zg.get(fb)) == null) {
            return;
        }
        fsVar.zmn();
    }

    public void zn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        String fb = fb(nqiVar);
        if (TextUtils.isEmpty(fb)) {
            return;
        }
        this.zg.remove(fb);
    }

    public void zmn(String str, boolean z, boolean z2) {
        boolean z3 = z || !z2;
        boolean cn = iv.fs().cn();
        if (cn) {
            com.bytedance.sdk.component.utils.iqz.zmn("BVA", "cleanListener: isFinish = " + z + ",isConfigChange = " + z2);
        }
        if (z3) {
            zmn(str, cn);
        } else if (z || !z2) {
            zmn(str, cn);
        }
    }

    private void zmn(String str, boolean z) {
        zmn<?> zmn2 = zmn(str);
        if (z) {
            if (zmn2 == null) {
                com.bytedance.sdk.component.utils.iqz.zmn("BVA", "cleanListener: removeCallback failed,listenerKey=".concat(String.valueOf(str)));
                return;
            }
            com.bytedance.sdk.component.utils.iqz.zmn("BVA", "cleanListener: removeCallback success,listenerKey=" + str + ",callback=" + zmn2.zmn);
        }
    }
}
