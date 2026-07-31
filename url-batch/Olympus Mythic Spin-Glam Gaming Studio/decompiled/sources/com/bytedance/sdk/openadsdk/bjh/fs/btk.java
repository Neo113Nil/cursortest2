package com.bytedance.sdk.openadsdk.bjh.fs;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.oub;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public class btk {
    private static final Map<Integer, fs> zmn = new ConcurrentHashMap();

    public static void zmn(View view, nqi nqiVar, zmn zmnVar) {
        if (view == null || nqiVar == null || nqiVar.ufa()) {
            return;
        }
        boolean zn = zn(nqiVar);
        if (am.fs(nqiVar) && zmnVar != null) {
            zmnVar.zmn = -1;
        }
        zmn(zmn(view, nqiVar, zn, zmnVar));
    }

    private static boolean zn(nqi nqiVar) {
        if (nqiVar == null) {
            return false;
        }
        String zmn2 = oub.zmn(nqiVar);
        return ((!"open_ad".equals(zmn2) && !"fullscreen_interstitial_ad".equals(zmn2) && !"rewarded_video".equals(zmn2)) || am.fs(nqiVar) || nqiVar.cd() == 5 || nqiVar.cd() == 33 || !nqi.btk(nqiVar) || nqiVar.mrt() == null) ? false : true;
    }

    private static fs zmn(View view, nqi nqiVar, boolean z, zmn zmnVar) {
        if (view == null || nqiVar == null || nqiVar.ji() == null) {
            return null;
        }
        Integer fs = fs(nqiVar);
        Map<Integer, fs> map = zmn;
        if (map.containsKey(fs)) {
            fs fsVar = map.get(fs);
            if (fsVar != null) {
                fsVar.zmn(view);
            }
            return fsVar;
        }
        fs zmn2 = fs.zmn(z, fs, view, nqiVar, zmnVar);
        map.put(fs, zmn2);
        return zmn2;
    }

    private static void zmn(fs fsVar) {
        if (fsVar == null) {
            return;
        }
        fsVar.zmn();
    }

    public static void zmn(nqi nqiVar, int i) {
        if (nqiVar == null || nqiVar.ji() == null) {
            return;
        }
        zmn(zmn.get(fs(nqiVar)), i);
    }

    public static void zmn(fs fsVar, int i) {
        if (fsVar == null) {
            return;
        }
        fsVar.zmn(i);
    }

    public static void zmn(nqi nqiVar) {
        if (nqiVar == null || nqiVar.ji() == null) {
            return;
        }
        Integer fs = fs(nqiVar);
        Map<Integer, fs> map = zmn;
        fs fsVar = map.get(fs);
        if (fsVar != null) {
            fsVar.iv();
        }
        fs(fs);
        if (map.size() <= 0) {
            nps.zmn();
        }
    }

    public static fs zmn(Integer num) {
        return zmn.get(num);
    }

    public static void fs(Integer num) {
        zmn.remove(num);
    }

    public static Integer fs(nqi nqiVar) {
        return Integer.valueOf((nqiVar.wbj() + nqiVar.ji()).hashCode());
    }

    public static class zmn {
        public int fs = -1;
        public int zmn;

        public zmn(int i) {
            this.zmn = i;
        }
    }
}
