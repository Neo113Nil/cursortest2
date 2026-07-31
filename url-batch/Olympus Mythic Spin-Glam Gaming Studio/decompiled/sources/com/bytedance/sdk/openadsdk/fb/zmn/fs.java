package com.bytedance.sdk.openadsdk.fb.zmn;

import android.content.Context;
import com.bytedance.sdk.component.hhw.zmn.zmn;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.fb.zmn.zmn.mw;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes13.dex */
public class fs {
    public static final AtomicBoolean zmn = new AtomicBoolean(false);
    public static final AtomicBoolean fs = new AtomicBoolean(false);
    public static AtomicInteger zn = new AtomicInteger(0);

    public static void zmn(Context context) {
        try {
            if (zmn.compareAndSet(false, true)) {
                com.bytedance.sdk.component.hhw.zmn.fs.zmn(new zmn.C0132zmn().zmn(new hhw()).fs(com.bytedance.sdk.openadsdk.fb.zmn.zmn.zg.fs()).zn(com.bytedance.sdk.openadsdk.fb.zmn.zmn.zg.zn()).zmn(com.bytedance.sdk.openadsdk.fb.zmn.zmn.zg.zmn()).zmn(new nps()).zmn(fb.zmn).fs(kgc.fb().mw()).zmn(kgc.fb().rt()).zmn(kgc.fb().skn()).zmn(), context);
                fs();
            }
        } catch (Throwable unused) {
            zmn.set(false);
        }
        if (!fs.compareAndSet(false, true) || com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.zmn() == 1) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.fb.zmn.zmn.nps.zmn(context);
        } catch (Throwable unused2) {
            fs.set(false);
        }
    }

    public static void zmn(com.bytedance.sdk.openadsdk.fb.zmn zmnVar) {
        com.bytedance.sdk.component.hhw.zmn.fb.zmn.zmn zmnVar2 = new com.bytedance.sdk.component.hhw.zmn.fb.zmn.zmn(zmnVar.nps(), zmnVar);
        zmnVar2.zn(zmnVar.zg() ? (byte) 1 : (byte) 2);
        zmnVar2.fs((byte) 0);
        if (com.bytedance.sdk.component.hhw.zmn.fs.fs()) {
            zmn(kgc.zmn());
        }
        int zmn2 = com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.zmn();
        if (zmn2 == 2) {
            com.bytedance.sdk.openadsdk.fb.zmn.zmn.nps.zmn(zmnVar);
        } else if (zmn2 == 3) {
            com.bytedance.sdk.component.hhw.zmn.fs.zmn(zmnVar2);
            com.bytedance.sdk.openadsdk.fb.zmn.zmn.nps.zmn(zmnVar);
        } else {
            com.bytedance.sdk.component.hhw.zmn.fs.zmn(zmnVar2);
        }
    }

    public static com.bytedance.sdk.openadsdk.cyb.fs.zn zmn() {
        return zg.zmn;
    }

    public static void zmn(final List<String> list, final int i, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(new com.bytedance.sdk.component.zg.fs.zn("track") { // from class: com.bytedance.sdk.openadsdk.fb.zmn.fs.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.hhw.zmn.fs.fs()) {
                    fs.zmn(kgc.zmn());
                }
                if (com.bytedance.sdk.openadsdk.fb.zmn.zmn.nps.zmn() && com.bytedance.sdk.openadsdk.fb.zmn.zmn.zn.zmn().zn().fb) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        mw zmn2 = mw.zmn((String) it.next(), true, i, str);
                        if (zmn2 != null) {
                            com.bytedance.sdk.openadsdk.fb.zmn.zmn.nps.zmn(zmn2);
                        }
                    }
                    return;
                }
                com.bytedance.sdk.component.hhw.zmn.fs.zmn(com.bytedance.sdk.openadsdk.core.mw.zmn(kgc.zmn()), list, true, i, str);
            }
        });
    }

    public static void zmn(String str) {
        zmn(str, false);
    }

    public static void zmn(String str, boolean z) {
        if (com.bytedance.sdk.component.hhw.zmn.fs.fs()) {
            zmn(kgc.zmn());
        }
        com.bytedance.sdk.component.hhw.zmn.fs.zmn(str, z);
    }

    public static void fs() {
        com.bytedance.sdk.component.hhw.zmn.fs.zn();
        com.bytedance.zmn.zn.zmn(true);
    }

    public static void zn() {
        try {
            com.bytedance.sdk.component.hhw.zmn.fs.fb();
            com.bytedance.sdk.component.hhw.zmn.fs.btk();
        } catch (Throwable th) {
            iqz.zn("AdLogSwitchUtils", th.getMessage());
        }
        com.bytedance.zmn.zn.zmn(false);
    }
}
